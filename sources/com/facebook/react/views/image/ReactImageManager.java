package com.facebook.react.views.image;

import android.graphics.PorterDuff.Mode;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.C14644a;
import java.util.Map;

@ReactModule(name = "RCTImageView")
public class ReactImageManager extends SimpleViewManager<ReactImageView> {
    private final Object mCallerContext;
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private GlobalImageLoadListener mGlobalImageLoadListener;

    public ReactImageManager() {
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public String getName() {
        return "RCTImageView";
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = C13380c.m39166a();
        }
        return this.mDraweeControllerBuilder;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m41791of(ImageLoadEvent.eventNameForType(4), MapBuilder.m41788of("registrationName", "onLoadStart"), ImageLoadEvent.eventNameForType(2), MapBuilder.m41788of("registrationName", "onLoad"), ImageLoadEvent.eventNameForType(1), MapBuilder.m41788of("registrationName", "onError"), ImageLoadEvent.eventNameForType(3), MapBuilder.m41788of("registrationName", "onLoadEnd"));
    }

    public ReactImageView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactImageView(themedReactContext, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, getCallerContext());
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(ReactImageView reactImageView) {
        super.onAfterUpdateTransaction(reactImageView);
        reactImageView.maybeUpdateView();
    }

    @ReactProp(name = "blurRadius")
    public void setBlurRadius(ReactImageView reactImageView, float f) {
        reactImageView.setBlurRadius(f);
    }

    @ReactProp(name = "borderWidth")
    public void setBorderWidth(ReactImageView reactImageView, float f) {
        reactImageView.setBorderWidth(f);
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(ReactImageView reactImageView, int i) {
        reactImageView.setFadeDuration(i);
    }

    @ReactProp(name = "headers")
    public void setHeaders(ReactImageView reactImageView, ReadableMap readableMap) {
        reactImageView.setHeaders(readableMap);
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(ReactImageView reactImageView, boolean z) {
        reactImageView.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(ReactImageView reactImageView, String str) {
        reactImageView.setLoadingIndicatorSource(str);
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(ReactImageView reactImageView, boolean z) {
        reactImageView.setProgressiveRenderingEnabled(z);
    }

    @ReactProp(name = "src")
    public void setSource(ReactImageView reactImageView, ReadableArray readableArray) {
        reactImageView.setSource(readableArray);
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, null, obj);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(ReactImageView reactImageView, String str) {
        reactImageView.setScaleType(ImageResizeMode.toScaleType(str));
    }

    @ReactProp(customType = "Color", name = "borderColor")
    public void setBorderColor(ReactImageView reactImageView, Integer num) {
        if (num == null) {
            reactImageView.setBorderColor(0);
        } else {
            reactImageView.setBorderColor(num.intValue());
        }
    }

    @ReactProp(name = "overlayColor")
    public void setOverlayColor(ReactImageView reactImageView, Integer num) {
        if (num == null) {
            reactImageView.setOverlayColor(0);
        } else {
            reactImageView.setOverlayColor(num.intValue());
        }
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(ReactImageView reactImageView, Integer num) {
        if (num == null) {
            reactImageView.clearColorFilter();
        } else {
            reactImageView.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    @ReactProp(name = "resizeMethod")
    public void setResizeMethod(ReactImageView reactImageView, String str) {
        if (str == null || "auto".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.AUTO);
        } else if ("resize".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.RESIZE);
        } else if ("scale".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.SCALE);
        } else {
            StringBuilder sb = new StringBuilder("Invalid resize method: '");
            sb.append(str);
            sb.append("'");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactImageView reactImageView, int i, float f) {
        if (!C14644a.m42350a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactImageView.setBorderRadius(f);
        } else {
            reactImageView.setBorderRadius(f, i - 1);
        }
    }
}
