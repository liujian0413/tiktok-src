package com.p280ss.android.ugc.aweme.fastimage;

import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.image.GlobalImageLoadListener;
import com.facebook.react.views.image.ImageResizeMode;
import java.util.Map;

@ReactModule(name = "FastImageView")
/* renamed from: com.ss.android.ugc.aweme.fastimage.TTReactImageManager */
public class TTReactImageManager extends SimpleViewManager<C21729c> {
    private final Object mCallerContext;
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private GlobalImageLoadListener mGlobalImageLoadListener;

    public TTReactImageManager() {
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public String getName() {
        return "FastImageView";
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = C13380c.m39166a();
        }
        return this.mDraweeControllerBuilder;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("onFastImageLoadStart", MapBuilder.m41788of("registrationName", "onFastImageLoadStart")).put("onFastImageProgress", MapBuilder.m41788of("registrationName", "onFastImageProgress")).put("onFastImageLoad", MapBuilder.m41788of("registrationName", "onFastImageLoad")).put("onFastImageError", MapBuilder.m41788of("registrationName", "onFastImageError")).put("onFastImageLoadEnd", MapBuilder.m41788of("registrationName", "onFastImageLoadEnd")).build();
    }

    public C21729c createViewInstance(ThemedReactContext themedReactContext) {
        return new C21729c(themedReactContext, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, getCallerContext());
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C21729c cVar) {
        super.onAfterUpdateTransaction(cVar);
        cVar.mo58004a();
    }

    @ReactProp(name = "source")
    public void setSource(C21729c cVar, ReadableMap readableMap) {
        cVar.setSource(readableMap);
    }

    public TTReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, null, obj);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(C21729c cVar, String str) {
        cVar.setScaleType(ImageResizeMode.toScaleType(str));
    }

    public TTReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }
}
