package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.systrace.Systrace;

public class ReactRootView extends SizeMonitoringFrameLayout implements RootView, MeasureSpecProvider {
    private final ReactAndroidHWInputDeviceHelper mAndroidHWInputDeviceHelper;
    private Bundle mAppProperties;
    private CustomGlobalLayoutListener mCustomGlobalLayoutListener;
    private long mFirstDrawTime;
    private int mHeightMeasureSpec;
    public boolean mIsAttachedToInstance;
    private boolean mIsFabric;
    private Runnable mJSEntryPoint;
    private String mJSModuleName;
    private final JSTouchDispatcher mJSTouchDispatcher;
    public ReactInstanceManager mReactInstanceManager;
    private ReactRootViewEventListener mRootViewEventListener;
    private int mRootViewTag;
    private boolean mShouldLogContentAppeared;
    private long mStartLoadime;
    private boolean mWasMeasured;
    private int mWidthMeasureSpec;

    class CustomGlobalLayoutListener implements OnGlobalLayoutListener {
        private int mDeviceRotation;
        private int mKeyboardHeight;
        private final int mMinKeyboardHeightDetected;
        private DisplayMetrics mScreenMetrics = new DisplayMetrics();
        private final Rect mVisibleViewArea;
        private DisplayMetrics mWindowMetrics = new DisplayMetrics();

        private void emitUpdateDimensionsEvent() {
            ((DeviceInfoModule) ReactRootView.this.mReactInstanceManager.getCurrentReactContext().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        private void checkForDeviceDimensionsChanges() {
            DisplayMetricsHolder.initDisplayMetrics(ReactRootView.this.getContext());
            if (!areMetricsEqual(this.mWindowMetrics, DisplayMetricsHolder.getWindowDisplayMetrics()) || !areMetricsEqual(this.mScreenMetrics, DisplayMetricsHolder.getScreenDisplayMetrics())) {
                this.mWindowMetrics.setTo(DisplayMetricsHolder.getWindowDisplayMetrics());
                this.mScreenMetrics.setTo(DisplayMetricsHolder.getScreenDisplayMetrics());
                emitUpdateDimensionsEvent();
            }
        }

        private void checkForDeviceOrientationChanges() {
            int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.mDeviceRotation != rotation) {
                this.mDeviceRotation = rotation;
                emitOrientationChanged(rotation);
            }
        }

        public void onGlobalLayout() {
            if (ReactRootView.this.mReactInstanceManager != null && ReactRootView.this.mIsAttachedToInstance && ReactRootView.this.mReactInstanceManager.getCurrentReactContext() != null) {
                checkForKeyboardEvents();
                checkForDeviceOrientationChanges();
                checkForDeviceDimensionsChanges();
            }
        }

        private void checkForKeyboardEvents() {
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.mVisibleViewArea);
            int i = DisplayMetricsHolder.getWindowDisplayMetrics().heightPixels - this.mVisibleViewArea.bottom;
            if (this.mKeyboardHeight == i || i <= this.mMinKeyboardHeightDetected) {
                if (this.mKeyboardHeight != 0 && i <= this.mMinKeyboardHeightDetected) {
                    this.mKeyboardHeight = 0;
                    ReactRootView.this.sendEvent("keyboardDidHide", null);
                }
                return;
            }
            this.mKeyboardHeight = i;
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("screenY", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.bottom));
            createMap2.putDouble("screenX", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.left));
            createMap2.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.width()));
            createMap2.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mKeyboardHeight));
            createMap.putMap("endCoordinates", createMap2);
            ReactRootView.this.sendEvent("keyboardDidShow", createMap);
        }

        CustomGlobalLayoutListener() {
            DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(ReactRootView.this.getContext().getApplicationContext());
            this.mVisibleViewArea = new Rect();
            this.mMinKeyboardHeightDetected = (int) PixelUtil.toPixelFromDIP(60.0f);
        }

        private void emitOrientationChanged(int i) {
            String str;
            double d;
            double d2;
            boolean z = true;
            switch (i) {
                case 0:
                    str = "portrait-primary";
                    d2 = 0.0d;
                    break;
                case 1:
                    str = "landscape-primary";
                    d = -90.0d;
                    break;
                case 2:
                    str = "portrait-secondary";
                    d2 = 180.0d;
                    break;
                case 3:
                    str = "landscape-secondary";
                    d = 90.0d;
                    break;
                default:
                    return;
            }
            d = d2;
            z = false;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("name", str);
            createMap.putDouble("rotationDegrees", d);
            createMap.putBoolean("isLandscape", z);
            ReactRootView.this.sendEvent("namedOrientationDidChange", createMap);
        }

        private boolean areMetricsEqual(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            if (VERSION.SDK_INT >= 17) {
                return displayMetrics.equals(displayMetrics2);
            }
            if (displayMetrics.widthPixels == displayMetrics2.widthPixels && displayMetrics.heightPixels == displayMetrics2.heightPixels && displayMetrics.density == displayMetrics2.density && displayMetrics.densityDpi == displayMetrics2.densityDpi && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.xdpi == displayMetrics2.xdpi && displayMetrics.ydpi == displayMetrics2.ydpi) {
                return true;
            }
            return false;
        }
    }

    public interface ReactRootViewEventListener {
        void onAttachedToReactInstance(ReactRootView reactRootView);
    }

    public Bundle getAppProperties() {
        return this.mAppProperties;
    }

    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactInstanceManager;
    }

    public int getRootViewTag() {
        return this.mRootViewTag;
    }

    public boolean isFabric() {
        return this.mIsFabric;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: 0000 */
    public void simulateAttachForTesting() {
        this.mIsAttachedToInstance = true;
    }

    private CustomGlobalLayoutListener getCustomGlobalLayoutListener() {
        if (this.mCustomGlobalLayoutListener == null) {
            this.mCustomGlobalLayoutListener = new CustomGlobalLayoutListener();
        }
        return this.mCustomGlobalLayoutListener;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        C13854a.m40915a(!this.mIsAttachedToInstance, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    /* access modifiers changed from: 0000 */
    public String getJSModuleName() {
        return (String) C13854a.m40916b(this.mJSModuleName);
    }

    /* access modifiers changed from: 0000 */
    public void invokeJSEntryPoint() {
        if (this.mJSEntryPoint == null) {
            defaultJSEntryPoint();
        } else {
            this.mJSEntryPoint.run();
        }
    }

    public void onAttachedToReactInstance() {
        if (this.mRootViewEventListener != null) {
            this.mRootViewEventListener.onAttachedToReactInstance(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mIsAttachedToInstance) {
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    public void unmountReactApplication() {
        if (this.mReactInstanceManager != null && this.mIsAttachedToInstance) {
            this.mReactInstanceManager.detachRootView(this);
            this.mReactInstanceManager = null;
            this.mIsAttachedToInstance = false;
        }
        this.mShouldLogContentAppeared = false;
    }

    private void attachToReactInstanceManager() {
        Systrace.m42324a(0, "attachToReactInstanceManager");
        try {
            if (!this.mIsAttachedToInstance) {
                this.mIsAttachedToInstance = true;
                ((ReactInstanceManager) C13854a.m40916b(this.mReactInstanceManager)).attachRootView(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                Systrace.m42323a(0);
            }
        } finally {
            Systrace.m42323a(0);
        }
    }

    private void enableLayoutCalculation() {
        if (this.mReactInstanceManager == null) {
            C13286a.m38860c("ReactNative", "Unable to enable layout calculation for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            ((UIManagerModule) currentReactContext.getCatalystInstance().getNativeModule(UIManagerModule.class)).getUIImplementation().enableLayoutCalculationForRootNode(getRootViewTag());
        }
    }

    public int getHeightMeasureSpec() {
        if (this.mWasMeasured || getLayoutParams() == null || getLayoutParams().height <= 0) {
            return this.mHeightMeasureSpec;
        }
        return MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824);
    }

    public int getWidthMeasureSpec() {
        if (this.mWasMeasured || getLayoutParams() == null || getLayoutParams().width <= 0) {
            return this.mWidthMeasureSpec;
        }
        return MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mIsAttachedToInstance) {
            if (VERSION.SDK_INT >= 16) {
                getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                return;
            }
            getViewTreeObserver().removeGlobalOnLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    public void setFirstDrawTime() {
        try {
            if (!(this.mReactInstanceManager == null || this.mReactInstanceManager.getCurrentReactContext() == null)) {
                CatalystInstance catalystInstance = this.mReactInstanceManager.getCurrentReactContext().getCatalystInstance();
                if (catalystInstance != null && catalystInstance.isFirstDrawn()) {
                    this.mFirstDrawTime = System.currentTimeMillis();
                    catalystInstance.startFirstDraw();
                    catalystInstance.setFirstDraw(this.mFirstDrawTime);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void setStartLoadime() {
        try {
            if (this.mStartLoadime == 0) {
                this.mStartLoadime = System.currentTimeMillis();
            }
            if (!(this.mReactInstanceManager == null || this.mReactInstanceManager.getCurrentReactContext() == null || this.mReactInstanceManager.getCurrentReactContext().getCatalystInstance() == null)) {
                this.mReactInstanceManager.getCurrentReactContext().getCatalystInstance().setStartLoad(this.mStartLoadime);
            }
        } catch (Exception unused) {
        }
    }

    private void defaultJSEntryPoint() {
        Systrace.m42324a(0, "ReactRootView.runApplication");
        try {
            if (this.mReactInstanceManager != null) {
                if (this.mIsAttachedToInstance) {
                    ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
                    if (currentReactContext == null) {
                        Systrace.m42323a(0);
                        return;
                    }
                    CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", (double) getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    this.mShouldLogContentAppeared = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(getJSModuleName(), writableNativeMap);
                    Systrace.m42323a(0);
                }
            }
        } finally {
            Systrace.m42323a(0);
        }
    }

    public void setEventListener(ReactRootViewEventListener reactRootViewEventListener) {
        this.mRootViewEventListener = reactRootViewEventListener;
    }

    public void setIsFabric(boolean z) {
        this.mIsFabric = z;
    }

    public void setJSEntryPoint(Runnable runnable) {
        this.mJSEntryPoint = runnable;
    }

    public void setRootViewTag(int i) {
        this.mRootViewTag = i;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            handleException(e);
        }
    }

    public void invokeDefaultJSEntryPoint(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        if (bundle != null) {
            this.mAppProperties = bundle;
        }
        defaultJSEntryPoint();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.mAppProperties = bundle;
        if (getRootViewTag() != 0) {
            invokeJSEntryPoint();
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.mShouldLogContentAppeared) {
            this.mShouldLogContentAppeared = false;
            if (this.mJSModuleName != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, this.mJSModuleName, this.mRootViewTag);
            }
        }
        setStartLoadime();
        setFirstDrawTime();
    }

    public ReactRootView(Context context) {
        super(context);
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.mIsFabric = false;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
    }

    private void dispatchJSTouchEvent(MotionEvent motionEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            C13286a.m38860c("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        this.mJSTouchDispatcher.handleTouchEvent(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            C13286a.m38860c("ReactNative", "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        this.mAndroidHWInputDeviceHelper.handleKeyEvent(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    public void handleException(Throwable th) {
        Exception exc;
        if (this.mReactInstanceManager == null || this.mReactInstanceManager.getCurrentReactContext() == null) {
            throw new RuntimeException(th);
        }
        if (th instanceof StackOverflowError) {
            exc = new IllegalViewOperationException("StackOverflowException", this, th);
        } else if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = new RuntimeException(th);
        }
        this.mReactInstanceManager.getCurrentReactContext().handleException(exc);
    }

    public void onChildStartedNativeGesture(MotionEvent motionEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            C13286a.m38860c("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str) {
        startReactApplication(reactInstanceManager, str, null);
    }

    /* access modifiers changed from: 0000 */
    public void sendEvent(String str, WritableMap writableMap) {
        if (this.mReactInstanceManager != null) {
            ((RCTDeviceEventEmitter) this.mReactInstanceManager.getCurrentReactContext().getJSModule(RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    private void updateRootLayoutSpecs(int i, int i2) {
        if (this.mReactInstanceManager == null) {
            C13286a.m38860c("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            final ReactContext reactContext = currentReactContext;
            final int i3 = i;
            final int i4 = i2;
            C141881 r1 = new GuardedRunnable(currentReactContext) {
                public void runGuarded() {
                    ((UIManagerModule) reactContext.getCatalystInstance().getNativeModule(UIManagerModule.class)).updateRootLayoutSpecs(ReactRootView.this.getRootViewTag(), i3, i4);
                }
            };
            currentReactContext.runOnLayoutThread(r1);
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            C13286a.m38860c("ReactNative", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
            return;
        }
        this.mAndroidHWInputDeviceHelper.onFocusChanged(view2);
        super.requestChildFocus(view, view2);
    }

    public ReactRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.mIsFabric = false;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049 A[Catch:{ all -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0096 }, LOOP:1: B:18:0x0052->B:20:0x0058, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[Catch:{ all -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "ReactRootView.onMeasure"
            r1 = 0
            com.facebook.systrace.Systrace.m42324a(r1, r0)
            r8.mWidthMeasureSpec = r9     // Catch:{ all -> 0x0096 }
            r8.mHeightMeasureSpec = r10     // Catch:{ all -> 0x0096 }
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x0096 }
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r0 == r3) goto L_0x001c
            if (r0 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x0096 }
            goto L_0x0043
        L_0x001c:
            r9 = 0
            r0 = 0
        L_0x001e:
            int r5 = r8.getChildCount()     // Catch:{ all -> 0x0096 }
            if (r9 >= r5) goto L_0x0042
            android.view.View r5 = r8.getChildAt(r9)     // Catch:{ all -> 0x0096 }
            int r6 = r5.getLeft()     // Catch:{ all -> 0x0096 }
            int r7 = r5.getMeasuredWidth()     // Catch:{ all -> 0x0096 }
            int r6 = r6 + r7
            int r7 = r5.getPaddingLeft()     // Catch:{ all -> 0x0096 }
            int r6 = r6 + r7
            int r5 = r5.getPaddingRight()     // Catch:{ all -> 0x0096 }
            int r6 = r6 + r5
            int r0 = java.lang.Math.max(r0, r6)     // Catch:{ all -> 0x0096 }
            int r9 = r9 + 1
            goto L_0x001e
        L_0x0042:
            r9 = r0
        L_0x0043:
            int r0 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x0096 }
            if (r0 == r3) goto L_0x0051
            if (r0 != 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x0096 }
            goto L_0x0076
        L_0x0051:
            r10 = 0
        L_0x0052:
            int r0 = r8.getChildCount()     // Catch:{ all -> 0x0096 }
            if (r4 >= r0) goto L_0x0076
            android.view.View r0 = r8.getChildAt(r4)     // Catch:{ all -> 0x0096 }
            int r3 = r0.getTop()     // Catch:{ all -> 0x0096 }
            int r5 = r0.getMeasuredHeight()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r5
            int r5 = r0.getPaddingTop()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r5
            int r0 = r0.getPaddingBottom()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r0
            int r10 = java.lang.Math.max(r10, r3)     // Catch:{ all -> 0x0096 }
            int r4 = r4 + 1
            goto L_0x0052
        L_0x0076:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x0096 }
            r9 = 1
            r8.mWasMeasured = r9     // Catch:{ all -> 0x0096 }
            com.facebook.react.ReactInstanceManager r9 = r8.mReactInstanceManager     // Catch:{ all -> 0x0096 }
            if (r9 == 0) goto L_0x0088
            boolean r9 = r8.mIsAttachedToInstance     // Catch:{ all -> 0x0096 }
            if (r9 != 0) goto L_0x0088
            r8.attachToReactInstanceManager()     // Catch:{ all -> 0x0096 }
            goto L_0x008f
        L_0x0088:
            int r9 = r8.mWidthMeasureSpec     // Catch:{ all -> 0x0096 }
            int r10 = r8.mHeightMeasureSpec     // Catch:{ all -> 0x0096 }
            r8.updateRootLayoutSpecs(r9, r10)     // Catch:{ all -> 0x0096 }
        L_0x008f:
            r8.enableLayoutCalculation()     // Catch:{ all -> 0x0096 }
            com.facebook.systrace.Systrace.m42323a(r1)
            return
        L_0x0096:
            r9 = move-exception
            com.facebook.systrace.Systrace.m42323a(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactRootView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            C13286a.m38860c("ReactNative", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
            return;
        }
        this.mAndroidHWInputDeviceHelper.clearFocus();
        super.onFocusChanged(z, i, rect);
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, Bundle bundle) {
        boolean z;
        Systrace.m42324a(0, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            if (this.mReactInstanceManager == null) {
                z = true;
            } else {
                z = false;
            }
            C13854a.m40915a(z, "This root view has already been attached to a catalyst instance manager");
            this.mReactInstanceManager = reactInstanceManager;
            this.mJSModuleName = str;
            this.mAppProperties = bundle;
            if (!this.mReactInstanceManager.hasStartedCreatingInitialContext()) {
                this.mReactInstanceManager.createReactContextInBackground();
            }
            attachToReactInstanceManager();
            setStartLoadime();
        } finally {
            Systrace.m42323a(0);
        }
    }

    public ReactRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.mIsFabric = false;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
    }
}
