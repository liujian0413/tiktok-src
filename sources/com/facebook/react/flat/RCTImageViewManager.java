package com.facebook.react.flat;

import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.views.image.GlobalImageLoadListener;

public final class RCTImageViewManager extends FlatViewManager {
    private final Object mCallerContext;
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private GlobalImageLoadListener mGlobalImageLoadListener;

    public final Object getCallerContext() {
        return this.mCallerContext;
    }

    public final String getName() {
        return "RCTImageView";
    }

    public final Class<RCTImageView> getShadowNodeClass() {
        return RCTImageView.class;
    }

    public RCTImageViewManager() {
        this(null, null);
    }

    public final RCTImageView createShadowNodeInstance() {
        return new RCTImageView(new DrawImageWithDrawee(this.mGlobalImageLoadListener));
    }

    public final AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = C13380c.m39166a();
        }
        return this.mDraweeControllerBuilder;
    }

    public final /* bridge */ /* synthetic */ void removeAllViews(FlatViewGroup flatViewGroup) {
        super.removeAllViews(flatViewGroup);
    }

    public final /* bridge */ /* synthetic */ void setBackgroundColor(FlatViewGroup flatViewGroup, int i) {
        super.setBackgroundColor(flatViewGroup, i);
    }

    public RCTImageViewManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, null, obj);
    }

    public RCTImageViewManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }
}
