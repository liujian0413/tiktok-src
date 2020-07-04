package com.facebook.react.uimanager;

import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnDismissListener;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.animation.Animation;
import com.facebook.react.animation.AnimationListener;
import com.facebook.react.animation.AnimationRegistry;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener;
import com.facebook.systrace.Systrace;
import java.lang.ref.WeakReference;

public class NativeViewHierarchyManager {
    private static final String TAG = "NativeViewHierarchyManager";
    public final AnimationRegistry mAnimationRegistry;
    private WeakReference<CatalystInstance> mCatalyInstance;
    private long mFirstScreenPaintedFinishTime;
    private final JSResponderHandler mJSResponderHandler;
    private boolean mLayoutAnimationEnabled;
    private final LayoutAnimationController mLayoutAnimator;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private int mScreenHigh;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final ViewManagerRegistry mViewManagers;

    static class PopupMenuCallbackHandler implements OnDismissListener, OnMenuItemClickListener {
        boolean mConsumed;
        final Callback mSuccess;

        private PopupMenuCallbackHandler(Callback callback) {
            this.mSuccess = callback;
        }

        public void onDismiss(PopupMenu popupMenu) {
            if (!this.mConsumed) {
                this.mSuccess.invoke("dismissed");
                this.mConsumed = true;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.mConsumed) {
                return false;
            }
            this.mSuccess.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.mConsumed = true;
            return true;
        }
    }

    public AnimationRegistry getAnimationRegistry() {
        return this.mAnimationRegistry;
    }

    public void clearJSResponder() {
        this.mJSResponderHandler.clearJSResponder();
    }

    /* access modifiers changed from: 0000 */
    public void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    public void setCatalyInstance(WeakReference<CatalystInstance> weakReference) {
        this.mCatalyInstance = weakReference;
    }

    public void setLayoutAnimationEnabled(boolean z) {
        this.mLayoutAnimationEnabled = z;
    }

    /* access modifiers changed from: 0000 */
    public void configureLayoutAnimation(ReadableMap readableMap) {
        this.mLayoutAnimator.initializeFromConfig(readableMap);
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
        this(viewManagerRegistry, new RootViewManager());
    }

    private ThemedReactContext getReactContextForView(int i) {
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            return (ThemedReactContext) view.getContext();
        }
        StringBuilder sb = new StringBuilder("Could not find view with tag ");
        sb.append(i);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    public synchronized void removeRootView(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(i)) {
            StringBuilder sb = new StringBuilder("View with tag ");
            sb.append(i);
            sb.append(" is not registered as a root view");
            SoftAssertions.assertUnreachable(sb.toString());
        }
        dropView((View) this.mTagsToViews.get(i));
        this.mRootTags.delete(i);
    }

    public final synchronized View resolveView(int i) {
        View view;
        view = (View) this.mTagsToViews.get(i);
        if (view == null) {
            StringBuilder sb = new StringBuilder("Trying to resolve view with tag ");
            sb.append(i);
            sb.append(" which doesn't exist");
            throw new IllegalViewOperationException(sb.toString());
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.mTagsToViewManagers.get(i);
        if (viewManager == null) {
            StringBuilder sb = new StringBuilder("ViewManager for tag ");
            sb.append(i);
            sb.append(" could not be found");
            throw new IllegalViewOperationException(sb.toString());
        }
        return viewManager;
    }

    /* access modifiers changed from: protected */
    public synchronized void dropView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(view.getId())) {
            resolveViewManager(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = (ViewManager) this.mTagsToViewManagers.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (this.mTagsToViews.get(childAt.getId()) != null) {
                    dropView(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.mTagsToViews.remove(view.getId());
        this.mTagsToViewManagers.remove(view.getId());
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, WeakReference<CatalystInstance> weakReference) {
        this(viewManagerRegistry, new RootViewManager(), weakReference);
    }

    private boolean arrayContains(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public synchronized void updateProperties(int i, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        try {
            resolveViewManager(i).updateProperties(resolveView(i), reactStylesDiffMap);
        } catch (IllegalViewOperationException unused) {
        }
    }

    public synchronized void updateViewExtraData(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        try {
            resolveViewManager(i).updateExtraData(resolveView(i), obj);
        } catch (IllegalViewOperationException unused) {
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
        this.mJSResponderHandler = new JSResponderHandler();
        this.mLayoutAnimator = new LayoutAnimationController();
        this.mScreenHigh = 0;
        this.mFirstScreenPaintedFinishTime = 0;
        this.mAnimationRegistry = new AnimationRegistry();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
        this.mFirstScreenPaintedFinishTime = 0;
    }

    public void sendAccessibilityEvent(int i, int i2) {
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            AccessibilityHelper.sendAccessibilityEvent(view, i2);
            return;
        }
        StringBuilder sb = new StringBuilder("Could not find view with tag ");
        sb.append(i);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    public synchronized void measure(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            View view2 = (View) RootViewUtil.getRootView(view);
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                view.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
                iArr[2] = view.getWidth();
                iArr[3] = view.getHeight();
            } else {
                StringBuilder sb = new StringBuilder("Native view ");
                sb.append(i);
                sb.append(" is no longer on screen");
                throw new NoSuchNativeViewException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No native view for ");
            sb2.append(i);
            sb2.append(" currently exists");
            throw new NoSuchNativeViewException(sb2.toString());
        }
    }

    public synchronized void measureInWindow(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Resources resources = view.getContext().getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
            }
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            StringBuilder sb = new StringBuilder("No native view for ");
            sb.append(i);
            sb.append(" currently exists");
            throw new NoSuchNativeViewException(sb.toString());
        }
    }

    public synchronized void setChildren(int i, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i);
        ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
        int i2 = 0;
        while (i2 < readableArray.size()) {
            View view = (View) this.mTagsToViews.get(readableArray.getInt(i2));
            if (view != null) {
                viewGroupManager.addView(viewGroup, view, i2);
                i2++;
            } else {
                StringBuilder sb = new StringBuilder("Trying to add unknown view tag: ");
                sb.append(readableArray.getInt(i2));
                sb.append("\n detail: ");
                sb.append(constructSetChildrenErrorMessage(viewGroup, viewGroupManager, readableArray));
                throw new IllegalViewOperationException(sb.toString());
            }
        }
    }

    public synchronized void addRootView(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, ThemedReactContext themedReactContext) {
        addRootViewGroup(i, sizeMonitoringFrameLayout, themedReactContext);
    }

    private static String constructSetChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            viewAtIndexArr[i] = new ViewAtIndex(readableArray.getInt(i), i);
        }
        return constructManageChildrenErrorMessage(viewGroup, viewGroupManager, null, viewAtIndexArr, null);
    }

    /* access modifiers changed from: protected */
    public final synchronized void addRootViewGroup(int i, ViewGroup viewGroup, ThemedReactContext themedReactContext) {
        if (viewGroup.getId() == -1) {
            this.mTagsToViews.put(i, viewGroup);
            this.mTagsToViewManagers.put(i, this.mRootViewManager);
            this.mRootTags.put(i, true);
            viewGroup.setId(i);
        } else {
            throw new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
    }

    public synchronized void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            resolveViewManager(i).receiveCommand(view, i2, readableArray);
        } else {
            StringBuilder sb = new StringBuilder("Trying to send command to a non-existing view with tag ");
            sb.append(i);
            throw new IllegalViewOperationException(sb.toString());
        }
    }

    public synchronized int findTargetTagForTouch(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = (View) this.mTagsToViews.get(i);
        if (view != null) {
        } else {
            StringBuilder sb = new StringBuilder("Could not find view with tag ");
            sb.append(i);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        return TouchTargetHelper.findTargetTagForTouch(f, f2, (ViewGroup) view);
    }

    /* access modifiers changed from: 0000 */
    public synchronized void startAnimationForNativeView(int i, Animation animation, final Callback callback) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        final int animationID = animation.getAnimationID();
        if (view != null) {
            animation.setAnimationListener(new AnimationListener() {
                public void onCancel() {
                    C13854a.m40913a(NativeViewHierarchyManager.this.mAnimationRegistry.removeAnimation(animationID), "Animation was already removed somehow!");
                    if (callback != null) {
                        callback.invoke(Boolean.valueOf(false));
                    }
                }

                public void onFinished() {
                    C13854a.m40913a(NativeViewHierarchyManager.this.mAnimationRegistry.removeAnimation(animationID), "Animation was already removed somehow!");
                    if (callback != null) {
                        callback.invoke(Boolean.valueOf(true));
                    }
                }
            });
            animation.start(view);
        } else {
            StringBuilder sb = new StringBuilder("View with tag ");
            sb.append(i);
            sb.append(" not found");
            throw new IllegalViewOperationException(sb.toString());
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager, WeakReference<CatalystInstance> weakReference) {
        this.mJSResponderHandler = new JSResponderHandler();
        this.mLayoutAnimator = new LayoutAnimationController();
        this.mScreenHigh = 0;
        this.mFirstScreenPaintedFinishTime = 0;
        this.mCatalyInstance = weakReference;
        this.mAnimationRegistry = new AnimationRegistry();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
        this.mFirstScreenPaintedFinishTime = 0;
    }

    public synchronized void setJSResponder(int i, int i2, boolean z) {
        if (!z) {
            this.mJSResponderHandler.setJSResponder(i2, null);
            return;
        }
        View view = (View) this.mTagsToViews.get(i);
        if (i2 == i || !(view instanceof ViewParent)) {
            if (this.mRootTags.get(i)) {
                StringBuilder sb = new StringBuilder("Cannot block native responder on ");
                sb.append(i);
                sb.append(" that is a root view");
                SoftAssertions.assertUnreachable(sb.toString());
            }
            this.mJSResponderHandler.setJSResponder(i2, view.getParent());
            return;
        }
        this.mJSResponderHandler.setJSResponder(i2, (ViewParent) view);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|3|4|5|(1:7)|9|10|(1:12)|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.facebook.systrace.Systrace.m42323a(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0019 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void createView(com.facebook.react.uimanager.ThemedReactContext r4, int r5, java.lang.String r6, com.facebook.react.uimanager.ReactStylesDiffMap r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch:{ all -> 0x0040 }
            r0 = 0
            int r2 = r3.mScreenHigh     // Catch:{ Throwable -> 0x0019 }
            if (r2 != 0) goto L_0x0019
            android.content.res.Resources r2 = r4.getResources()     // Catch:{ Throwable -> 0x0019 }
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch:{ Throwable -> 0x0019 }
            int r2 = r2.heightPixels     // Catch:{ Throwable -> 0x0019 }
            r3.mScreenHigh = r2     // Catch:{ Throwable -> 0x0019 }
            goto L_0x0019
        L_0x0017:
            r4 = move-exception
            goto L_0x003c
        L_0x0019:
            com.facebook.react.uimanager.ViewManagerRegistry r2 = r3.mViewManagers     // Catch:{ all -> 0x0017 }
            com.facebook.react.uimanager.ViewManager r6 = r2.get(r6)     // Catch:{ all -> 0x0017 }
            com.facebook.react.touch.JSResponderHandler r2 = r3.mJSResponderHandler     // Catch:{ all -> 0x0017 }
            android.view.View r4 = r6.createView(r4, r2)     // Catch:{ all -> 0x0017 }
            android.util.SparseArray<android.view.View> r2 = r3.mTagsToViews     // Catch:{ all -> 0x0017 }
            r2.put(r5, r4)     // Catch:{ all -> 0x0017 }
            android.util.SparseArray<com.facebook.react.uimanager.ViewManager> r2 = r3.mTagsToViewManagers     // Catch:{ all -> 0x0017 }
            r2.put(r5, r6)     // Catch:{ all -> 0x0017 }
            r4.setId(r5)     // Catch:{ all -> 0x0017 }
            if (r7 == 0) goto L_0x0037
            r6.updateProperties(r4, r7)     // Catch:{ all -> 0x0017 }
        L_0x0037:
            com.facebook.systrace.Systrace.m42323a(r0)     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)
            return
        L_0x003c:
            com.facebook.systrace.Systrace.m42323a(r0)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.NativeViewHierarchyManager.createView(com.facebook.react.uimanager.ThemedReactContext, int, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }

    public synchronized void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        if (view == null) {
            StringBuilder sb = new StringBuilder("Can't display popup. Could not find view with tag ");
            sb.append(i);
            callback2.invoke(sb.toString());
            return;
        }
        PopupMenu popupMenu = new PopupMenu(getReactContextForView(i), view);
        Menu menu = popupMenu.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        PopupMenuCallbackHandler popupMenuCallbackHandler = new PopupMenuCallbackHandler(callback);
        popupMenu.setOnMenuItemClickListener(popupMenuCallbackHandler);
        popupMenu.setOnDismissListener(popupMenuCallbackHandler);
        popupMenu.show();
    }

    public synchronized void manageChildren(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        UiThreadUtil.assertOnUiThread();
        final ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i);
        final ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
        if (viewGroup != null) {
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr != null) {
                int length = iArr.length - 1;
                while (length >= 0) {
                    int i2 = iArr[length];
                    if (i2 < 0) {
                        StringBuilder sb = new StringBuilder("Trying to remove a negative view index:");
                        sb.append(i2);
                        sb.append(" view tag: ");
                        sb.append(i);
                        sb.append("\n detail: ");
                        sb.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        throw new IllegalViewOperationException(sb.toString());
                    } else if (i2 >= viewGroupManager.getChildCount(viewGroup)) {
                        StringBuilder sb2 = new StringBuilder("Trying to remove a view index above child count ");
                        sb2.append(i2);
                        sb2.append(" view tag: ");
                        sb2.append(i);
                        sb2.append("\n detail: ");
                        sb2.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        throw new IllegalViewOperationException(sb2.toString());
                    } else if (i2 < childCount) {
                        View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !arrayContains(iArr2, childAt.getId())) {
                            viewGroupManager.removeView(viewGroup, childAt);
                        } else {
                            viewGroupManager.markView(viewGroup, i2);
                        }
                        length--;
                        childCount = i2;
                    } else {
                        StringBuilder sb3 = new StringBuilder("Trying to remove an out of order view index:");
                        sb3.append(i2);
                        sb3.append(" view tag: ");
                        sb3.append(i);
                        sb3.append("\n detail: ");
                        sb3.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        throw new IllegalViewOperationException(sb3.toString());
                    }
                }
            }
            int i3 = 0;
            if (viewAtIndexArr != null) {
                int i4 = 0;
                while (i4 < viewAtIndexArr.length) {
                    ViewAtIndex viewAtIndex = viewAtIndexArr[i4];
                    View view = (View) this.mTagsToViews.get(viewAtIndex.mTag);
                    if (view != null) {
                        viewGroupManager.addView(viewGroup, view, viewAtIndex.mIndex);
                        i4++;
                    } else {
                        StringBuilder sb4 = new StringBuilder("Trying to add unknown view tag: ");
                        sb4.append(viewAtIndex.mTag);
                        sb4.append("\n detail: ");
                        sb4.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        throw new IllegalViewOperationException(sb4.toString());
                    }
                }
            }
            if (iArr2 != null) {
                while (i3 < iArr2.length) {
                    int i5 = iArr2[i3];
                    final View view2 = (View) this.mTagsToViews.get(i5);
                    if (view2 != null) {
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(view2)) {
                            dropView(view2);
                        } else {
                            this.mLayoutAnimator.deleteView(view2, new LayoutAnimationListener() {
                                public void onAnimationEnd() {
                                    viewGroupManager.removeView(viewGroup, view2);
                                    NativeViewHierarchyManager.this.dropView(view2);
                                }
                            });
                        }
                        i3++;
                    } else {
                        StringBuilder sb5 = new StringBuilder("Trying to destroy unknown view tag: ");
                        sb5.append(i5);
                        sb5.append("\n detail: ");
                        sb5.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        throw new IllegalViewOperationException(sb5.toString());
                    }
                }
            }
        } else {
            StringBuilder sb6 = new StringBuilder("Trying to manageChildren view with tag ");
            sb6.append(i);
            sb6.append(" which doesn't exist\n detail: ");
            sb6.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
            throw new IllegalViewOperationException(sb6.toString());
        }
    }

    private void updateLayout(View view, int i, int i2, int i3, int i4) {
        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(view)) {
            int i5 = i4 + i2;
            view.layout(i, i2, i3 + i, i5);
            if (this.mCatalyInstance != null) {
                ((CatalystInstance) this.mCatalyInstance.get()).updateLayout();
            }
            if (i5 >= this.mScreenHigh && this.mFirstScreenPaintedFinishTime == 0) {
                this.mFirstScreenPaintedFinishTime = System.currentTimeMillis();
                if (this.mCatalyInstance != null) {
                    ((CatalystInstance) this.mCatalyInstance.get()).setFirstScreenPaintFinished(this.mFirstScreenPaintedFinishTime);
                }
            }
            return;
        }
        this.mLayoutAnimator.applyLayoutUpdate(view, i, i2, i3, i4);
    }

    private static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            StringBuilder sb2 = new StringBuilder("View tag:");
            sb2.append(viewGroup.getId());
            sb2.append("\n");
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append("): [\n");
            sb.append(sb3.toString());
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 >= viewGroupManager.getChildCount(viewGroup) || i2 >= 16) {
                        sb.append("\n");
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(viewGroupManager.getChildAt(viewGroup, i3).getId());
                        sb4.append(",");
                        sb.append(sb4.toString());
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            StringBuilder sb5 = new StringBuilder("  indicesToRemove(");
            sb5.append(iArr.length);
            sb5.append("): [\n");
            sb.append(sb5.toString());
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= iArr.length || i5 >= 16) {
                        sb.append("\n");
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(iArr[i6]);
                        sb6.append(",");
                        sb.append(sb6.toString());
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (viewAtIndexArr != null) {
            StringBuilder sb7 = new StringBuilder("  viewsToAdd(");
            sb7.append(viewAtIndexArr.length);
            sb7.append("): [\n");
            sb.append(sb7.toString());
            for (int i7 = 0; i7 < viewAtIndexArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= viewAtIndexArr.length || i8 >= 16) {
                        sb.append("\n");
                    } else {
                        StringBuilder sb8 = new StringBuilder("[");
                        sb8.append(viewAtIndexArr[i9].mIndex);
                        sb8.append(",");
                        sb8.append(viewAtIndexArr[i9].mTag);
                        sb8.append("],");
                        sb.append(sb8.toString());
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            StringBuilder sb9 = new StringBuilder("  tagsToDelete(");
            sb9.append(iArr2.length);
            sb9.append("): [\n");
            sb.append(sb9.toString());
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr2.length || i11 >= 16) {
                        sb.append("\n");
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(iArr2[i12]);
                        sb10.append(",");
                        sb.append(sb10.toString());
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    public synchronized void updateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        UiThreadUtil.assertOnUiThread();
        try {
            View resolveView = resolveView(i2);
            resolveView.measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), MeasureSpec.makeMeasureSpec(i6, 1073741824));
            ViewParent parent = resolveView.getParent();
            if (parent instanceof RootView) {
                parent.requestLayout();
            }
            if (!this.mRootTags.get(i)) {
                ViewManager viewManager = (ViewManager) this.mTagsToViewManagers.get(i);
                if (viewManager instanceof ViewGroupManager) {
                    ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                    if (viewGroupManager != null && !viewGroupManager.needsCustomLayoutForChildren()) {
                        updateLayout(resolveView, i3, i4, i5, i6);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Trying to use view with tag ");
                    sb.append(i2);
                    sb.append(" as a parent, but its Manager doesn't extends ViewGroupManager");
                    throw new IllegalViewOperationException(sb.toString());
                }
            } else {
                updateLayout(resolveView, i3, i4, i5, i6);
            }
        } finally {
            Systrace.m42323a(0);
        }
    }
}
