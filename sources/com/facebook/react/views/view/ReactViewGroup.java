package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.touch.OnInterceptTouchEventListener;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ReactZIndexedViewGroup;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import java.util.ArrayList;

public class ReactViewGroup extends ViewGroup implements ReactHitSlopView, ReactInterceptingViewGroup, ReactClippingViewGroup, ReactPointerEventsView, ReactZIndexedViewGroup {
    private static final LayoutParams sDefaultLayoutParam = new LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private ChildrenLayoutChangeListener mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    public ArrayList<Integer> mDeleteMark;
    private final ViewGroupDrawingOrderHelper mDrawingOrderHelper = new ViewGroupDrawingOrderHelper(this);
    private Rect mHitSlopRect;
    private int mLayoutDirection;
    public int mMarkedChildCount = -1;
    private boolean mNeedsOffscreenAlphaCompositing;
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;
    private String mOverflow;
    private Path mPath;
    private PointerEvents mPointerEvents = PointerEvents.AUTO;
    private ReactViewBackgroundDrawable mReactBackgroundDrawable;
    private boolean mRemoveClippedSubviews;

    static final class ChildrenLayoutChangeListener implements OnLayoutChangeListener {
        private final ReactViewGroup mParent;

        private ChildrenLayoutChangeListener(ReactViewGroup reactViewGroup) {
            this.mParent = reactViewGroup;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.mParent.getRemoveClippedSubviews()) {
                this.mParent.updateSubviewClipStatus(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSetPressed(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void requestLayout() {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((ReactViewBackgroundDrawable) getBackground()).getColor();
        }
        return 0;
    }

    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            C13854a.m40916b(this.mClippingRect);
            C13854a.m40916b(this.mAllChildren);
            ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    public void updateDrawingOrder() {
        this.mDrawingOrderHelper.update();
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder());
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void removeAllViewsWithSubviewClippingEnabled() {
        C13854a.m40914a(this.mRemoveClippedSubviews);
        C13854a.m40916b(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    private ReactViewBackgroundDrawable getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new ReactViewBackgroundDrawable(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mReactBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
            if (VERSION.SDK_INT >= 17) {
                this.mLayoutDirection = I18nUtil.getInstance().isRTL(getContext()) ? 1 : 0;
                this.mReactBackgroundDrawable.setResolvedLayoutDirection(this.mLayoutDirection);
            }
        }
        return this.mReactBackgroundDrawable;
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    /* access modifiers changed from: 0000 */
    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().setBorderStyle(str);
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    private void updateBackgroundDrawable(Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            super.setBackground(drawable);
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    public View getChildAtWithSubviewClippingEnabled(int i) {
        return ((View[]) C13854a.m40916b(this.mAllChildren))[i];
    }

    public void setBackgroundColor(int i) {
        if (i != 0 || this.mReactBackgroundDrawable != null) {
            getOrCreateReactViewBackground().setColor(i);
        }
    }

    public ReactViewGroup(Context context) {
        super(context);
    }

    private int indexOfChildInAllChildren(View view) {
        int i = this.mAllChildrenCount;
        View[] viewArr = (View[]) C13854a.m40916b(this.mAllChildren);
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    private void updateClippingToRect(Rect rect) {
        C13854a.m40916b(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            updateSubviewClipStatus(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            RootView rootView = RootViewUtil.getRootView(this);
            if (rootView != null) {
                rootView.handleException(e);
                return;
            }
            throw e;
        }
    }

    public int getZIndexMappedChildIndex(int i) {
        if (this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder()) {
            return this.mDrawingOrderHelper.getChildDrawingOrder(getChildCount(), i);
        }
        return i;
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17 && this.mReactBackgroundDrawable != null) {
            this.mReactBackgroundDrawable.setResolvedLayoutDirection(this.mLayoutDirection);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mPointerEvents == PointerEvents.NONE || this.mPointerEvents == PointerEvents.BOX_NONE) {
            return false;
        }
        return true;
    }

    public void removeView(View view) {
        this.mDrawingOrderHelper.handleRemoveView(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder());
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        this.mDrawingOrderHelper.handleRemoveView(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder());
        super.removeViewAt(i);
    }

    private void removeFromArray(int i) {
        View[] viewArr = (View[]) C13854a.m40916b(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        if (i == i2 - 1) {
            int i3 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i3;
            viewArr[i3] = null;
        } else if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(viewArr, i + 1, viewArr, i, (i2 - i) - 1);
            int i4 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i4;
            viewArr[i4] = null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((this.mOnInterceptTouchEventListener != null && this.mOnInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent)) || this.mPointerEvents == PointerEvents.NONE || this.mPointerEvents == PointerEvents.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void removeViewWithSubviewClippingEnabled(View view) {
        C13854a.m40914a(this.mRemoveClippedSubviews);
        C13854a.m40916b(this.mClippingRect);
        C13854a.m40916b(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int indexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (this.mAllChildren[indexOfChildInAllChildren].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < indexOfChildInAllChildren; i2++) {
                if (this.mAllChildren[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(indexOfChildInAllChildren - i, 1);
        }
        removeFromArray(indexOfChildInAllChildren);
    }

    public void setBorderRadius(float f) {
        int i;
        ReactViewBackgroundDrawable orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.setRadius(f);
        if (11 < VERSION.SDK_INT && VERSION.SDK_INT < 18) {
            if (orCreateReactViewBackground.hasRoundedBorders()) {
                i = 1;
            } else {
                i = 2;
            }
            if (i != getLayerType()) {
                setLayerType(i, null);
            }
        }
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        updateBackgroundDrawable(null);
        if (this.mReactBackgroundDrawable == null || drawable == null) {
            if (drawable != null) {
                updateBackgroundDrawable(drawable);
            }
            return;
        }
        updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, drawable}));
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z != this.mRemoveClippedSubviews) {
            this.mRemoveClippedSubviews = z;
            if (z) {
                this.mClippingRect = new Rect();
                ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
                this.mAllChildrenCount = getChildCount();
                this.mAllChildren = new View[Math.max(12, this.mAllChildrenCount)];
                this.mChildrenLayoutChangeListener = new ChildrenLayoutChangeListener();
                for (int i = 0; i < this.mAllChildrenCount; i++) {
                    View childAt = getChildAt(i);
                    this.mAllChildren[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
                }
                updateClippingRect();
                return;
            }
            C13854a.m40916b(this.mClippingRect);
            C13854a.m40916b(this.mAllChildren);
            C13854a.m40916b(this.mChildrenLayoutChangeListener);
            for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            getDrawingRect(this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
            this.mAllChildren = null;
            this.mClippingRect = null;
            this.mAllChildrenCount = 0;
            this.mChildrenLayoutChangeListener = null;
        }
    }

    public void updateSubviewClipStatus(View view) {
        boolean z;
        if (this.mRemoveClippedSubviews && getParent() != null) {
            C13854a.m40916b(this.mClippingRect);
            C13854a.m40916b(this.mAllChildren);
            sHelperRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            boolean intersects = this.mClippingRect.intersects(sHelperRect.left, sHelperRect.top, sHelperRect.right, sHelperRect.bottom);
            if (view.getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            if (intersects != z) {
                int i = 0;
                for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                    if (this.mAllChildren[i2] == view) {
                        updateSubviewClipStatus(this.mClippingRect, i2, i);
                        return;
                    }
                    if (this.mAllChildren[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013b, code lost:
        if (com.facebook.yoga.C14644a.m42350a(r10) == false) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dispatchOverflowDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = r0.mOverflow
            if (r2 == 0) goto L_0x01e4
            java.lang.String r2 = r0.mOverflow
            r3 = -1
            int r4 = r2.hashCode()
            r5 = -1217487446(0xffffffffb76e9daa, float:-1.42226145E-5)
            r7 = 1
            if (r4 == r5) goto L_0x0025
            r5 = 466743410(0x1bd1f072, float:3.4731534E-22)
            if (r4 == r5) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            java.lang.String r4 = "visible"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x002e
            r3 = 0
            goto L_0x002e
        L_0x0025:
            java.lang.String r4 = "hidden"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x002e
            r3 = 1
        L_0x002e:
            switch(r3) {
                case 0: goto L_0x01da;
                case 1: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x01e4
        L_0x0033:
            com.facebook.react.views.view.ReactViewBackgroundDrawable r2 = r0.mReactBackgroundDrawable
            if (r2 == 0) goto L_0x01e4
            int r2 = r18.getWidth()
            float r2 = (float) r2
            int r3 = r18.getHeight()
            float r3 = (float) r3
            com.facebook.react.views.view.ReactViewBackgroundDrawable r4 = r0.mReactBackgroundDrawable
            android.graphics.RectF r4 = r4.getDirectionAwareBorderInsets()
            float r5 = r4.top
            r8 = 0
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0064
            float r5 = r4.left
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0064
            float r5 = r4.bottom
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0064
            float r5 = r4.right
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r5 = 0
            r9 = 0
            goto L_0x0070
        L_0x0064:
            float r5 = r4.left
            float r5 = r5 + r8
            float r9 = r4.top
            float r9 = r9 + r8
            float r10 = r4.right
            float r2 = r2 - r10
            float r10 = r4.bottom
            float r3 = r3 - r10
        L_0x0070:
            com.facebook.react.views.view.ReactViewBackgroundDrawable r10 = r0.mReactBackgroundDrawable
            float r10 = r10.getFullBorderRadius()
            com.facebook.react.views.view.ReactViewBackgroundDrawable r11 = r0.mReactBackgroundDrawable
            com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation r12 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_LEFT
            float r11 = r11.getBorderRadiusOrDefaultTo(r10, r12)
            com.facebook.react.views.view.ReactViewBackgroundDrawable r12 = r0.mReactBackgroundDrawable
            com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation r13 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_RIGHT
            float r12 = r12.getBorderRadiusOrDefaultTo(r10, r13)
            com.facebook.react.views.view.ReactViewBackgroundDrawable r13 = r0.mReactBackgroundDrawable
            com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation r14 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_LEFT
            float r13 = r13.getBorderRadiusOrDefaultTo(r10, r14)
            com.facebook.react.views.view.ReactViewBackgroundDrawable r14 = r0.mReactBackgroundDrawable
            com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation r15 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_RIGHT
            float r10 = r14.getBorderRadiusOrDefaultTo(r10, r15)
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 17
            if (r14 < r15) goto L_0x013e
            int r14 = r0.mLayoutDirection
            if (r14 != r7) goto L_0x00a2
            r14 = 1
            goto L_0x00a3
        L_0x00a2:
            r14 = 0
        L_0x00a3:
            com.facebook.react.views.view.ReactViewBackgroundDrawable r15 = r0.mReactBackgroundDrawable
            com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation r7 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_START
            float r7 = r15.getBorderRadius(r7)
            com.facebook.react.views.view.ReactViewBackgroundDrawable r15 = r0.mReactBackgroundDrawable
            com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation r6 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_END
            float r6 = r15.getBorderRadius(r6)
            com.facebook.react.views.view.ReactViewBackgroundDrawable r15 = r0.mReactBackgroundDrawable
            com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation r8 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_START
            float r8 = r15.getBorderRadius(r8)
            com.facebook.react.views.view.ReactViewBackgroundDrawable r15 = r0.mReactBackgroundDrawable
            r16 = r10
            com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation r10 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_END
            float r10 = r15.getBorderRadius(r10)
            com.facebook.react.modules.i18nmanager.I18nUtil r15 = com.facebook.react.modules.i18nmanager.I18nUtil.getInstance()
            r17 = r11
            android.content.Context r11 = r18.getContext()
            boolean r11 = r15.doLeftAndRightSwapInRTL(r11)
            if (r11 == 0) goto L_0x0110
            boolean r11 = com.facebook.yoga.C14644a.m42350a(r7)
            if (r11 == 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r17 = r7
        L_0x00de:
            boolean r7 = com.facebook.yoga.C14644a.m42350a(r6)
            if (r7 == 0) goto L_0x00e5
            r6 = r12
        L_0x00e5:
            boolean r7 = com.facebook.yoga.C14644a.m42350a(r8)
            if (r7 == 0) goto L_0x00ec
            r8 = r13
        L_0x00ec:
            boolean r7 = com.facebook.yoga.C14644a.m42350a(r10)
            if (r7 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r16 = r10
        L_0x00f5:
            if (r14 == 0) goto L_0x00f9
            r11 = r6
            goto L_0x00fb
        L_0x00f9:
            r11 = r17
        L_0x00fb:
            if (r14 == 0) goto L_0x0100
            r12 = r17
            goto L_0x0101
        L_0x0100:
            r12 = r6
        L_0x0101:
            if (r14 == 0) goto L_0x0106
            r13 = r16
            goto L_0x0107
        L_0x0106:
            r13 = r8
        L_0x0107:
            if (r14 == 0) goto L_0x010b
            r10 = r8
            goto L_0x010d
        L_0x010b:
            r10 = r16
        L_0x010d:
            r16 = r10
            goto L_0x0142
        L_0x0110:
            if (r14 == 0) goto L_0x0114
            r11 = r6
            goto L_0x0115
        L_0x0114:
            r11 = r7
        L_0x0115:
            if (r14 == 0) goto L_0x0118
            r6 = r7
        L_0x0118:
            if (r14 == 0) goto L_0x011c
            r7 = r10
            goto L_0x011d
        L_0x011c:
            r7 = r8
        L_0x011d:
            if (r14 == 0) goto L_0x0120
            r10 = r8
        L_0x0120:
            boolean r8 = com.facebook.yoga.C14644a.m42350a(r11)
            if (r8 != 0) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r11 = r17
        L_0x0129:
            boolean r8 = com.facebook.yoga.C14644a.m42350a(r6)
            if (r8 != 0) goto L_0x0130
            r12 = r6
        L_0x0130:
            boolean r6 = com.facebook.yoga.C14644a.m42350a(r7)
            if (r6 != 0) goto L_0x0137
            r13 = r7
        L_0x0137:
            boolean r6 = com.facebook.yoga.C14644a.m42350a(r10)
            if (r6 != 0) goto L_0x0142
            goto L_0x010d
        L_0x013e:
            r16 = r10
            r17 = r11
        L_0x0142:
            r6 = 0
            int r7 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r7 > 0) goto L_0x015e
            int r7 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r7 > 0) goto L_0x015e
            int r7 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r7 > 0) goto L_0x015e
            int r7 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0154
            goto L_0x015e
        L_0x0154:
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r5, r9, r2, r3)
            r1.clipRect(r4)
            goto L_0x01e4
        L_0x015e:
            android.graphics.Path r6 = r0.mPath
            if (r6 != 0) goto L_0x0169
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r0.mPath = r6
        L_0x0169:
            android.graphics.Path r6 = r0.mPath
            r6.rewind()
            android.graphics.Path r6 = r0.mPath
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r5, r9, r2, r3)
            r2 = 8
            float[] r2 = new float[r2]
            float r3 = r4.left
            float r3 = r11 - r3
            r5 = 0
            float r3 = java.lang.Math.max(r3, r5)
            r8 = 0
            r2[r8] = r3
            float r3 = r4.top
            float r11 = r11 - r3
            float r3 = java.lang.Math.max(r11, r5)
            r8 = 1
            r2[r8] = r3
            r3 = 2
            float r8 = r4.right
            float r8 = r12 - r8
            float r8 = java.lang.Math.max(r8, r5)
            r2[r3] = r8
            r3 = 3
            float r8 = r4.top
            float r12 = r12 - r8
            float r8 = java.lang.Math.max(r12, r5)
            r2[r3] = r8
            r3 = 4
            float r8 = r4.right
            float r8 = r16 - r8
            float r8 = java.lang.Math.max(r8, r5)
            r2[r3] = r8
            r3 = 5
            float r8 = r4.bottom
            float r8 = r16 - r8
            float r8 = java.lang.Math.max(r8, r5)
            r2[r3] = r8
            r3 = 6
            float r8 = r4.left
            float r8 = r13 - r8
            float r8 = java.lang.Math.max(r8, r5)
            r2[r3] = r8
            r3 = 7
            float r4 = r4.bottom
            float r13 = r13 - r4
            float r4 = java.lang.Math.max(r13, r5)
            r2[r3] = r4
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r6.addRoundRect(r7, r2, r3)
            android.graphics.Path r2 = r0.mPath
            r1.clipPath(r2)
            return
        L_0x01da:
            android.graphics.Path r1 = r0.mPath
            if (r1 == 0) goto L_0x01e4
            android.graphics.Path r1 = r0.mPath
            r1.rewind()
            return
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewGroup.dispatchOverflowDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: 0000 */
    public void addViewWithSubviewClippingEnabled(View view, int i) {
        addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        return this.mDrawingOrderHelper.getChildDrawingOrder(i, i2);
    }

    public void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().setBorderWidth(i, f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }

    private void addInArray(View view, int i) {
        View[] viewArr = (View[]) C13854a.m40916b(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i == i2) {
            if (length == i2) {
                this.mAllChildren = new View[(length + 12)];
                System.arraycopy(viewArr, 0, this.mAllChildren, 0, length);
                viewArr = this.mAllChildren;
            }
            int i3 = this.mAllChildrenCount;
            this.mAllChildrenCount = i3 + 1;
            viewArr[i3] = view;
        } else if (i < i2) {
            if (length == i2) {
                this.mAllChildren = new View[(length + 12)];
                System.arraycopy(viewArr, 0, this.mAllChildren, 0, i);
                System.arraycopy(viewArr, i, this.mAllChildren, i + 1, i2 - i);
                viewArr = this.mAllChildren;
            } else {
                System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
            }
            viewArr[i] = view;
            this.mAllChildrenCount++;
        } else {
            StringBuilder sb = new StringBuilder("index=");
            sb.append(i);
            sb.append(" count=");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public void setBorderRadius(float f, int i) {
        int i2;
        ReactViewBackgroundDrawable orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.setRadius(f, i);
        if (11 < VERSION.SDK_INT && VERSION.SDK_INT < 18) {
            if (orCreateReactViewBackground.hasRoundedBorders()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if (i2 != getLayerType()) {
                setLayerType(i2, null);
            }
        }
    }

    public void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().setBorderColor(i, f, f2);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        this.mDrawingOrderHelper.handleAddView(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder());
        if (super.getChildCount() < i) {
            super.addView(view, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    /* access modifiers changed from: 0000 */
    public void addViewWithSubviewClippingEnabled(View view, int i, LayoutParams layoutParams) {
        C13854a.m40914a(this.mRemoveClippedSubviews);
        C13854a.m40916b(this.mClippingRect);
        C13854a.m40916b(this.mAllChildren);
        addInArray(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.mAllChildren[i3].getParent() == null) {
                i2++;
            }
        }
        updateSubviewClipStatus(this.mClippingRect, i, i2);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    private void updateSubviewClipStatus(Rect rect, int i, int i2) {
        boolean z;
        View view = ((View[]) C13854a.m40916b(this.mAllChildren))[i];
        sHelperRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean intersects = rect.intersects(sHelperRect.left, sHelperRect.top, sHelperRect.right, sHelperRect.bottom);
        Animation animation = view.getAnimation();
        boolean z2 = true;
        if (animation == null || animation.hasEnded()) {
            z = false;
        } else {
            z = true;
        }
        if (!intersects && view.getParent() != null && !z) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            super.addViewInLayout(view, i - i2, sDefaultLayoutParam, true);
            invalidate();
        } else if (!intersects) {
            z2 = false;
        }
        if (z2 && (view instanceof ReactClippingViewGroup)) {
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) view;
            if (reactClippingViewGroup.getRemoveClippedSubviews()) {
                reactClippingViewGroup.updateClippingRect();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }
}
