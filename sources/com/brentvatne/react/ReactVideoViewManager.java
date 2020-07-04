package com.brentvatne.react;

import com.brentvatne.react.ReactVideoView.Events;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.MapBuilder.Builder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.yqritc.scalablevideoview.ScalableType;
import java.util.Map;

public class ReactVideoViewManager extends SimpleViewManager<ReactVideoView> {
    public String getName() {
        return "RCTVideo";
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Events[] values;
        Builder builder = MapBuilder.builder();
        for (Events events : Events.values()) {
            builder.put(events.toString(), MapBuilder.m41788of("registrationName", events.toString()));
        }
        return builder.build();
    }

    public Map getExportedViewConstants() {
        return MapBuilder.m41791of("ScaleNone", Integer.toString(ScalableType.LEFT_TOP.ordinal()), "ScaleToFill", Integer.toString(ScalableType.FIT_XY.ordinal()), "ScaleAspectFit", Integer.toString(ScalableType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.toString(ScalableType.CENTER_CROP.ordinal()));
    }

    /* access modifiers changed from: protected */
    public ReactVideoView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactVideoView(themedReactContext);
    }

    public void onDropViewInstance(ReactVideoView reactVideoView) {
        super.onDropViewInstance(reactVideoView);
        reactVideoView.mo7660a();
    }

    @ReactProp(defaultBoolean = false, name = "controls")
    public void setControls(ReactVideoView reactVideoView, boolean z) {
        reactVideoView.setControls(z);
    }

    @ReactProp(defaultBoolean = false, name = "fullscreen")
    public void setFullscreen(ReactVideoView reactVideoView, boolean z) {
        reactVideoView.setFullscreen(z);
    }

    @ReactProp(defaultBoolean = false, name = "muted")
    public void setMuted(ReactVideoView reactVideoView, boolean z) {
        reactVideoView.setMutedModifier(z);
    }

    @ReactProp(defaultBoolean = false, name = "paused")
    public void setPaused(ReactVideoView reactVideoView, boolean z) {
        reactVideoView.setPausedModifier(z);
    }

    @ReactProp(defaultBoolean = false, name = "playInBackground")
    public void setPlayInBackground(ReactVideoView reactVideoView, boolean z) {
        reactVideoView.setPlayInBackground(z);
    }

    @ReactProp(defaultFloat = 250.0f, name = "progressUpdateInterval")
    public void setProgressUpdateInterval(ReactVideoView reactVideoView, float f) {
        reactVideoView.setProgressUpdateInterval(f);
    }

    @ReactProp(name = "rate")
    public void setRate(ReactVideoView reactVideoView, float f) {
        reactVideoView.setRateModifier(f);
    }

    @ReactProp(defaultBoolean = false, name = "repeat")
    public void setRepeat(ReactVideoView reactVideoView, boolean z) {
        reactVideoView.setRepeatModifier(z);
    }

    @ReactProp(name = "stereoPan")
    public void setStereoPan(ReactVideoView reactVideoView, float f) {
        reactVideoView.setStereoPan(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "volume")
    public void setVolume(ReactVideoView reactVideoView, float f) {
        reactVideoView.setVolumeModifier(f);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(ReactVideoView reactVideoView, String str) {
        reactVideoView.setResizeModeModifier(ScalableType.values()[Integer.parseInt(str)]);
    }

    @ReactProp(name = "seek")
    public void setSeek(ReactVideoView reactVideoView, float f) {
        reactVideoView.seekTo(Math.round(f * 1000.0f));
    }

    @ReactProp(name = "src")
    public void setSrc(ReactVideoView reactVideoView, ReadableMap readableMap) {
        int i;
        int i2;
        int i3 = readableMap.getInt("mainVer");
        int i4 = readableMap.getInt("patchVer");
        if (i3 < 0) {
            i = 0;
        } else {
            i = i3;
        }
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i > 0) {
            reactVideoView.mo7662a(readableMap.getString("uri"), readableMap.getString("type"), readableMap.getBoolean("isNetwork"), readableMap.getBoolean("isAsset"), readableMap.getMap("requestHeaders"), i, i2);
            return;
        }
        reactVideoView.mo7661a(readableMap.getString("uri"), readableMap.getString("type"), readableMap.getBoolean("isNetwork"), readableMap.getBoolean("isAsset"), readableMap.getMap("requestHeaders"));
    }
}
