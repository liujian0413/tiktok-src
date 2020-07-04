package com.airbnb.android.react.lottie;

import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.view.C0991u;
import android.widget.ImageView.ScaleType;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import org.json.JSONObject;

class LottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> {
    private static final String TAG = "LottieAnimationViewManager";

    LottieAnimationViewManager() {
    }

    public String getName() {
        return "LottieAnimationView";
    }

    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m41789of("play", Integer.valueOf(1), "reset", Integer.valueOf(2));
    }

    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.builder().put("VERSION", Integer.valueOf(1)).build();
    }

    public LottieAnimationView createViewInstance(ThemedReactContext themedReactContext) {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(themedReactContext);
        lottieAnimationView.setScaleType(ScaleType.CENTER_INSIDE);
        return lottieAnimationView;
    }

    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(LottieAnimationView lottieAnimationView, boolean z) {
        lottieAnimationView.mo7077a(z);
    }

    @ReactProp(name = "hardwareAccelerationAndroid")
    public void setHardwareAcceleration(LottieAnimationView lottieAnimationView, boolean z) {
        lottieAnimationView.mo7080b(z);
    }

    @ReactProp(name = "imageAssetsFolder")
    public void setImageAssetsFolder(LottieAnimationView lottieAnimationView, String str) {
        lottieAnimationView.setImageAssetsFolder(str);
    }

    @ReactProp(name = "loop")
    public void setLoop(LottieAnimationView lottieAnimationView, boolean z) {
        lottieAnimationView.mo7082c(z);
    }

    @ReactProp(name = "progress")
    public void setProgress(LottieAnimationView lottieAnimationView, float f) {
        lottieAnimationView.setProgress(f);
    }

    @ReactProp(name = "sourceName")
    public void setSourceName(LottieAnimationView lottieAnimationView, String str) {
        lottieAnimationView.setAnimation(str);
    }

    @ReactProp(name = "speed")
    public void setSpeed(LottieAnimationView lottieAnimationView, double d) {
        lottieAnimationView.setSpeed((float) d);
    }

    @ReactProp(name = "sourceJson")
    public void setSourceJson(LottieAnimationView lottieAnimationView, String str) {
        try {
            lottieAnimationView.setAnimation(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(LottieAnimationView lottieAnimationView, String str) {
        if ("cover".equals(str)) {
            lottieAnimationView.setScaleType(ScaleType.CENTER_CROP);
        } else if ("contain".equals(str)) {
            lottieAnimationView.setScaleType(ScaleType.CENTER_INSIDE);
        } else {
            if ("center".equals(str)) {
                lottieAnimationView.setScaleType(ScaleType.CENTER);
            }
        }
    }

    public void receiveCommand(final LottieAnimationView lottieAnimationView, int i, final ReadableArray readableArray) {
        switch (i) {
            case 1:
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        int i = readableArray.getInt(0);
                        int i2 = readableArray.getInt(1);
                        if (!(i == -1 || i2 == -1)) {
                            lottieAnimationView.mo7075a(readableArray.getInt(0), readableArray.getInt(1));
                        }
                        if (C0991u.m4170G(lottieAnimationView)) {
                            lottieAnimationView.setProgress(0.0f);
                            lottieAnimationView.mo7078b();
                        }
                    }
                });
                return;
            case 2:
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        if (C0991u.m4170G(lottieAnimationView)) {
                            lottieAnimationView.mo7085f();
                            lottieAnimationView.setProgress(0.0f);
                        }
                    }
                });
                break;
        }
    }
}
