package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Map;

@ReactModule(name = "StatusBarManager")
public class StatusBarModule extends ReactContextBaseJavaModule {
    public String getName() {
        return "StatusBarManager";
    }

    public Map<String, Object> getConstants() {
        float f;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            f = PixelUtil.toDIPFromPixel((float) reactApplicationContext.getResources().getDimensionPixelSize(identifier));
        } else {
            f = 0.0f;
        }
        return MapBuilder.m41788of("HEIGHT", Float.valueOf(f));
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void setHidden(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C13286a.m38860c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    if (z) {
                        currentActivity.getWindow().addFlags(PreloadTask.BYTE_UNIT_NUMBER);
                        currentActivity.getWindow().clearFlags(2048);
                        return;
                    }
                    currentActivity.getWindow().addFlags(2048);
                    currentActivity.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
                }
            });
        }
    }

    @ReactMethod
    public void setStyle(final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C13286a.m38860c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    int i;
                    View decorView = currentActivity.getWindow().getDecorView();
                    if (str.equals("dark-content")) {
                        i = VideoCacheReadBuffersizeExperiment.DEFAULT;
                    } else {
                        i = 0;
                    }
                    decorView.setSystemUiVisibility(i);
                }
            });
        }
    }

    @ReactMethod
    public void setTranslucent(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C13286a.m38860c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) {
                public void runGuarded() {
                    View decorView = currentActivity.getWindow().getDecorView();
                    if (z) {
                        decorView.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
                            }
                        });
                    } else {
                        decorView.setOnApplyWindowInsetsListener(null);
                    }
                    C0991u.m4243v(decorView);
                }
            });
        }
    }

    @ReactMethod
    public void setColor(int i, boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C13286a.m38860c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            final boolean z2 = z;
            final int i2 = i;
            C143691 r0 = new GuardedRunnable(getReactApplicationContext()) {
                public void runGuarded() {
                    currentActivity.getWindow().addFlags(Integer.MIN_VALUE);
                    if (z2) {
                        int statusBarColor = currentActivity.getWindow().getStatusBarColor();
                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(statusBarColor), Integer.valueOf(i2)});
                        ofObject.addUpdateListener(new AnimatorUpdateListener() {
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                currentActivity.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        });
                        ofObject.setDuration(300).setStartDelay(0);
                        ofObject.start();
                        return;
                    }
                    currentActivity.getWindow().setStatusBarColor(i2);
                }
            };
            UiThreadUtil.runOnUiThread(r0);
        }
    }
}
