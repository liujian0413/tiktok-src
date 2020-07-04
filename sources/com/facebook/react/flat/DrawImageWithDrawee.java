package com.facebook.react.flat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.image.GlobalImageLoadListener;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.MultiSourceHelper.MultiSourceResult;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.LinkedList;
import java.util.List;

final class DrawImageWithDrawee extends AbstractDrawCommand implements C13401d, DrawImage {
    private int mBorderColor;
    private float mBorderRadius;
    private float mBorderWidth;
    private InvalidateCallback mCallback;
    private PorterDuffColorFilter mColorFilter;
    private int mFadeDuration = C34943c.f91128x;
    private final GlobalImageLoadListener mGlobalImageLoadListener;
    private boolean mProgressiveRenderingEnabled;
    private int mReactTag;
    private DraweeRequestHelper mRequestHelper;
    private C13423b mScaleType = ImageResizeMode.defaultValue();
    private final List<ImageSource> mSources = new LinkedList();

    public final int getBorderColor() {
        return this.mBorderColor;
    }

    public final float getBorderRadius() {
        return this.mBorderRadius;
    }

    public final float getBorderWidth() {
        return this.mBorderWidth;
    }

    public final C13423b getScaleType() {
        return this.mScaleType;
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final void onIntermediateImageSet(String str, Object obj) {
    }

    public final void onRelease(String str) {
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChanged() {
        super.onBoundsChanged();
        computeRequestHelper();
    }

    public final boolean hasImageRequest() {
        if (!this.mSources.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void onDetached() {
        if (this.mRequestHelper != null) {
            this.mRequestHelper.detach();
        }
    }

    private boolean shouldDisplayBorder() {
        if (this.mBorderColor != 0 || this.mBorderRadius >= 0.5f) {
            return true;
        }
        return false;
    }

    private void computeRequestHelper() {
        C13596d dVar;
        MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(Math.round(getRight() - getLeft()), Math.round(getBottom() - getTop()), this.mSources);
        ImageSource bestResult = bestSourceForSize.getBestResult();
        ImageSource bestResultInCache = bestSourceForSize.getBestResultInCache();
        ImageRequest imageRequest = null;
        if (bestResult == null) {
            this.mRequestHelper = null;
            return;
        }
        if (shouldResize(bestResult)) {
            dVar = new C13596d((int) (getRight() - getLeft()), (int) (getBottom() - getTop()));
        } else {
            dVar = null;
        }
        ImageRequest b = ImageRequestBuilder.m40865a(bestResult.getUri()).mo33468a(dVar).mo33477b(this.mProgressiveRenderingEnabled).mo33476b();
        if (this.mGlobalImageLoadListener != null) {
            this.mGlobalImageLoadListener.onLoadAttempt(bestResult.getUri());
        }
        if (bestResultInCache != null) {
            imageRequest = ImageRequestBuilder.m40865a(bestResultInCache.getUri()).mo33468a(dVar).mo33477b(this.mProgressiveRenderingEnabled).mo33476b();
        }
        this.mRequestHelper = new DraweeRequestHelper((ImageRequest) C13854a.m40916b(b), imageRequest, this);
    }

    public final void setBorderColor(int i) {
        this.mBorderColor = i;
    }

    public final void setBorderRadius(float f) {
        this.mBorderRadius = f;
    }

    public final void setBorderWidth(float f) {
        this.mBorderWidth = f;
    }

    public final void setFadeDuration(int i) {
        this.mFadeDuration = i;
    }

    public final void setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
    }

    public final void setReactTag(int i) {
        this.mReactTag = i;
    }

    public final void setScaleType(C13423b bVar) {
        this.mScaleType = bVar;
    }

    /* access modifiers changed from: protected */
    public final void onDebugDrawHighlight(Canvas canvas) {
        if (this.mCallback != null) {
            debugDrawCautionHighlight(canvas, "Invalidate Drawee");
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.mRequestHelper != null) {
            this.mRequestHelper.getDrawable().draw(canvas);
        }
    }

    public final void setTintColor(int i) {
        if (i == 0) {
            this.mColorFilter = null;
        } else {
            this.mColorFilter = new PorterDuffColorFilter(i, Mode.SRC_ATOP);
        }
    }

    public DrawImageWithDrawee(GlobalImageLoadListener globalImageLoadListener) {
        this.mGlobalImageLoadListener = globalImageLoadListener;
    }

    private static boolean shouldResize(ImageSource imageSource) {
        String str;
        Uri uri = imageSource.getUri();
        if (uri == null) {
            str = null;
        } else {
            str = uri.getScheme();
        }
        if ("file".equals(str) || C38347c.f99553h.equals(str)) {
            return true;
        }
        return false;
    }

    public final void onAttached(InvalidateCallback invalidateCallback) {
        this.mCallback = invalidateCallback;
        if (this.mRequestHelper != null) {
            C13438a hierarchy = this.mRequestHelper.getHierarchy();
            RoundingParams roundingParams = hierarchy.f35619a;
            if (shouldDisplayBorder()) {
                if (roundingParams == null) {
                    roundingParams = new RoundingParams();
                }
                roundingParams.mo32882a(this.mBorderColor, this.mBorderWidth);
                roundingParams.mo32879a(this.mBorderRadius);
                hierarchy.mo32897a(roundingParams);
            } else if (roundingParams != null) {
                hierarchy.mo32897a((RoundingParams) null);
            }
            hierarchy.mo32896a(this.mScaleType);
            hierarchy.mo32892a((ColorFilter) this.mColorFilter);
            hierarchy.mo32890a(this.mFadeDuration);
            hierarchy.mo32722a().setBounds(Math.round(getLeft()), Math.round(getTop()), Math.round(getRight()), Math.round(getBottom()));
            this.mRequestHelper.attach(invalidateCallback);
            return;
        }
        StringBuilder sb = new StringBuilder("No DraweeRequestHelper - width: ");
        sb.append(getRight() - getLeft());
        sb.append(" - height: ");
        sb.append(getBottom() - getTop());
        sb.append(" - number of sources: ");
        sb.append(this.mSources.size());
        throw new RuntimeException(sb.toString());
    }

    public final void onFailure(String str, Throwable th) {
        if (this.mCallback != null && this.mReactTag != 0) {
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 1);
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 3);
        }
    }

    public final void onSubmit(String str, Object obj) {
        if (this.mCallback != null && this.mReactTag != 0) {
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 4);
        }
    }

    public final void setSource(Context context, ReadableArray readableArray) {
        this.mSources.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                this.mSources.add(new ImageSource(context, readableArray.getMap(0).getString("uri")));
                return;
            }
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                List<ImageSource> list = this.mSources;
                ImageSource imageSource = new ImageSource(context, map.getString("uri"), map.getDouble("width"), map.getDouble("height"));
                list.add(imageSource);
            }
        }
    }

    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
        if (this.mCallback != null && this.mReactTag != 0) {
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 2);
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 3);
        }
    }
}
