package com.bytedance.ies.bullet.kit.p261rn.pkg.animation;

import android.graphics.PorterDuff.Mode;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.image.ImageLoadEvent;
import com.facebook.react.views.image.ImageResizeMethod;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.yoga.C14644a;
import java.util.Map;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.animation.AnimatedReactImageManager */
public class AnimatedReactImageManager extends SimpleViewManager<C10590a> {
    private final Object mCallerContext;
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;

    AnimatedReactImageManager() {
    }

    private Object getCallerContext() {
        return this.mCallerContext;
    }

    public String getName() {
        return "RCTAnimatedImageView";
    }

    private AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = C13380c.m39166a();
        }
        return this.mDraweeControllerBuilder;
    }

    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m41789of("start", Integer.valueOf(1), "stop", Integer.valueOf(2));
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m41790of(ImageLoadEvent.eventNameForType(4), MapBuilder.m41788of("registrationName", "onLoadStart"), ImageLoadEvent.eventNameForType(2), MapBuilder.m41788of("registrationName", "onLoad"), ImageLoadEvent.eventNameForType(3), MapBuilder.m41788of("registrationName", "onLoadEnd"));
    }

    public C10590a createViewInstance(ThemedReactContext themedReactContext) {
        return new C10590a(themedReactContext, getDraweeControllerBuilder(), getCallerContext());
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C10590a aVar) {
        super.onAfterUpdateTransaction(aVar);
        aVar.mo25385b();
    }

    @ReactProp(name = "borderWidth")
    public void setBorderWidth(C10590a aVar, float f) {
        aVar.setBorderWidth(f);
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(C10590a aVar, int i) {
        aVar.setFadeDuration(i);
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(C10590a aVar, boolean z) {
        aVar.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(C10590a aVar, String str) {
        aVar.setLoadingIndicatorSource(str);
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(C10590a aVar, boolean z) {
        aVar.setProgressiveRenderingEnabled(z);
    }

    @ReactProp(name = "shouldPlay")
    public void setShouldPlay(C10590a aVar, boolean z) {
        aVar.setShouldPlay(z);
    }

    @ReactProp(name = "src")
    public void setSource(C10590a aVar, ReadableArray readableArray) {
        aVar.setSource(readableArray);
    }

    public AnimatedReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(C10590a aVar, String str) {
        aVar.setScaleType(ImageResizeMode.toScaleType(str));
    }

    @ReactProp(customType = "Color", name = "borderColor")
    public void setBorderColor(C10590a aVar, Integer num) {
        if (num == null) {
            aVar.setBorderColor(0);
        } else {
            aVar.setBorderColor(num.intValue());
        }
    }

    @ReactProp(name = "overlayColor")
    public void setOverlayColor(C10590a aVar, Integer num) {
        if (num == null) {
            aVar.setOverlayColor(0);
        } else {
            aVar.setOverlayColor(num.intValue());
        }
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(C10590a aVar, Integer num) {
        if (num == null) {
            aVar.clearColorFilter();
        } else {
            aVar.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    @ReactProp(name = "resizeMethod")
    public void setResizeMethod(C10590a aVar, String str) {
        if (str == null || "auto".equals(str)) {
            aVar.setResizeMethod(ImageResizeMethod.AUTO);
        } else if ("resize".equals(str)) {
            aVar.setResizeMethod(ImageResizeMethod.RESIZE);
        } else if ("scale".equals(str)) {
            aVar.setResizeMethod(ImageResizeMethod.SCALE);
        } else {
            StringBuilder sb = new StringBuilder("Invalid resize method: '");
            sb.append(str);
            sb.append("'");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    public void receiveCommand(C10590a aVar, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                aVar.setShouldPlay(true);
                return;
            case 2:
                aVar.setShouldPlay(false);
                break;
        }
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C10590a aVar, int i, float f) {
        if (!C14644a.m42350a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            aVar.setBorderRadius(f);
        } else {
            aVar.mo25383a(f, i - 1);
        }
    }
}
