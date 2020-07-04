package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.util.C13337d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.controller.C13403f;
import com.facebook.drawee.drawable.C13407b;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.generic.RoundingParams.RoundingMethod;
import com.facebook.drawee.view.GenericDraweeView;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.p723j.C13660a;
import com.facebook.imagepipeline.request.C13841a;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.MultiSourceHelper.MultiSourceResult;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.yoga.C14644a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReactImageView extends GenericDraweeView {
    public static float[] sComputedCornerRadii = new float[4];
    public static final Matrix sInverse = new Matrix();
    public static final Matrix sMatrix = new Matrix();
    private int mBorderColor;
    private float[] mBorderCornerRadii;
    private float mBorderRadius = 1.0E21f;
    private float mBorderWidth;
    private ImageSource mCachedImageSource;
    private final Object mCallerContext;
    private C13401d mControllerForTesting;
    private C13401d mControllerListener;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private int mFadeDurationMs = -1;
    private GlobalImageLoadListener mGlobalImageLoadListener;
    private ReadableMap mHeaders;
    public ImageSource mImageSource;
    private boolean mIsDirty;
    private C13660a mIterativeBoxBlurPostProcessor;
    private Drawable mLoadingImageDrawable;
    private int mOverlayColor;
    private boolean mProgressiveRenderingEnabled;
    private ImageResizeMethod mResizeMethod = ImageResizeMethod.AUTO;
    private final RoundedCornerPostprocessor mRoundedCornerPostprocessor;
    public C13423b mScaleType = ImageResizeMode.defaultValue();
    private final List<ImageSource> mSources;

    class RoundedCornerPostprocessor extends C13841a {
        private RoundedCornerPostprocessor() {
        }

        public void process(Bitmap bitmap, Bitmap bitmap2) {
            ReactImageView.this.cornerRadii(ReactImageView.sComputedCornerRadii);
            bitmap.setHasAlpha(true);
            if (!FloatUtil.floatsEqual(ReactImageView.sComputedCornerRadii[0], 0.0f) || !FloatUtil.floatsEqual(ReactImageView.sComputedCornerRadii[1], 0.0f) || !FloatUtil.floatsEqual(ReactImageView.sComputedCornerRadii[2], 0.0f) || !FloatUtil.floatsEqual(ReactImageView.sComputedCornerRadii[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                getRadii(bitmap2, ReactImageView.sComputedCornerRadii, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.process(bitmap, bitmap2);
        }

        /* access modifiers changed from: 0000 */
        public void getRadii(Bitmap bitmap, float[] fArr, float[] fArr2) {
            ReactImageView.this.mScaleType.mo32864a(ReactImageView.sMatrix, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            ReactImageView.sMatrix.invert(ReactImageView.sInverse);
            fArr2[0] = ReactImageView.sInverse.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = ReactImageView.sInverse.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = ReactImageView.sInverse.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = ReactImageView.sInverse.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    private void warnImageSource(String str) {
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    private boolean hasMultipleSources() {
        if (this.mSources.size() > 1) {
            return true;
        }
        return false;
    }

    private void setSourceImage() {
        this.mImageSource = null;
        if (!this.mSources.isEmpty()) {
            if (hasMultipleSources()) {
                MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.mSources);
                this.mImageSource = bestSourceForSize.getBestResult();
                this.mCachedImageSource = bestSourceForSize.getBestResultInCache();
                return;
            }
            this.mImageSource = (ImageSource) this.mSources.get(0);
        }
    }

    public void maybeUpdateView() {
        boolean z;
        int i;
        C13842b bVar;
        if (this.mIsDirty) {
            if (!hasMultipleSources() || (getWidth() > 0 && getHeight() > 0)) {
                setSourceImage();
                if (this.mImageSource != null) {
                    boolean shouldResize = shouldResize(this.mImageSource);
                    if (!shouldResize || (getWidth() > 0 && getHeight() > 0)) {
                        C13438a aVar = (C13438a) getHierarchy();
                        aVar.mo32896a(this.mScaleType);
                        if (this.mLoadingImageDrawable != null) {
                            aVar.mo32895a(this.mLoadingImageDrawable, C13423b.f35597e);
                        }
                        if (this.mScaleType == C13423b.f35599g || this.mScaleType == C13423b.f35600h) {
                            z = false;
                        } else {
                            z = true;
                        }
                        RoundingParams roundingParams = aVar.f35619a;
                        if (z) {
                            roundingParams.mo32879a(0.0f);
                        } else {
                            cornerRadii(sComputedCornerRadii);
                            roundingParams.mo32880a(sComputedCornerRadii[0], sComputedCornerRadii[1], sComputedCornerRadii[2], sComputedCornerRadii[3]);
                        }
                        roundingParams.mo32882a(this.mBorderColor, this.mBorderWidth);
                        if (this.mOverlayColor != 0) {
                            roundingParams.mo32881a(this.mOverlayColor);
                        } else {
                            roundingParams.mo32883a(RoundingMethod.BITMAP_ONLY);
                        }
                        aVar.mo32897a(roundingParams);
                        if (this.mFadeDurationMs >= 0) {
                            i = this.mFadeDurationMs;
                        } else if (this.mImageSource.isResource()) {
                            i = 0;
                        } else {
                            i = C34943c.f91128x;
                        }
                        aVar.mo32890a(i);
                        C13596d dVar = null;
                        if (z) {
                            bVar = this.mRoundedCornerPostprocessor;
                        } else if (this.mIterativeBoxBlurPostProcessor != null) {
                            bVar = this.mIterativeBoxBlurPostProcessor;
                        } else {
                            bVar = null;
                        }
                        if (shouldResize) {
                            dVar = new C13596d(getWidth(), getHeight());
                        }
                        ReactNetworkImageRequest fromBuilderWithHeaders = ReactNetworkImageRequest.fromBuilderWithHeaders(ImageRequestBuilder.m40865a(this.mImageSource.getUri()).mo33473a(bVar).mo33468a(dVar).mo33474a(true).mo33477b(this.mProgressiveRenderingEnabled), this.mHeaders);
                        if (this.mGlobalImageLoadListener != null) {
                            this.mGlobalImageLoadListener.onLoadAttempt(this.mImageSource.getUri());
                        }
                        this.mDraweeControllerBuilder.mo32747b();
                        this.mDraweeControllerBuilder.mo32751c(true).mo32744a(this.mCallerContext).mo32729b(getController()).mo32748b(fromBuilderWithHeaders);
                        if (this.mCachedImageSource != null) {
                            this.mDraweeControllerBuilder.mo32750c(ImageRequestBuilder.m40865a(this.mCachedImageSource.getUri()).mo33473a(bVar).mo33468a(dVar).mo33474a(true).mo33477b(this.mProgressiveRenderingEnabled).mo33476b());
                        }
                        if (this.mControllerListener != null && this.mControllerForTesting != null) {
                            C13403f fVar = new C13403f();
                            fVar.mo32766a(this.mControllerListener);
                            fVar.mo32766a(this.mControllerForTesting);
                            this.mDraweeControllerBuilder.mo32743a((C13401d<? super INFO>) fVar);
                        } else if (this.mControllerForTesting != null) {
                            this.mDraweeControllerBuilder.mo32743a(this.mControllerForTesting);
                        } else if (this.mControllerListener != null) {
                            this.mDraweeControllerBuilder.mo32743a(this.mControllerListener);
                        }
                        setController(this.mDraweeControllerBuilder.mo32730f());
                        this.mIsDirty = false;
                        this.mDraweeControllerBuilder.mo32747b();
                    }
                }
            }
        }
    }

    public void setFadeDuration(int i) {
        this.mFadeDurationMs = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
        this.mIsDirty = true;
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
        this.mIsDirty = true;
    }

    public void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.mResizeMethod = imageResizeMethod;
        this.mIsDirty = true;
    }

    public void setScaleType(C13423b bVar) {
        this.mScaleType = bVar;
        this.mIsDirty = true;
    }

    public void setBorderRadius(float f) {
        if (!FloatUtil.floatsEqual(this.mBorderRadius, f)) {
            this.mBorderRadius = f;
            this.mIsDirty = true;
        }
    }

    public void setBorderWidth(float f) {
        this.mBorderWidth = PixelUtil.toPixelFromDIP(f);
        this.mIsDirty = true;
    }

    public void setControllerListener(C13401d dVar) {
        this.mControllerForTesting = dVar;
        this.mIsDirty = true;
        maybeUpdateView();
    }

    private static C13438a buildHierarchy(Context context) {
        return new C13439b(context.getResources()).mo32915a(RoundingParams.m39399b(0.0f)).mo32908a();
    }

    public void setBlurRadius(float f) {
        int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(f);
        if (pixelFromDIP == 0) {
            this.mIterativeBoxBlurPostProcessor = null;
        } else {
            this.mIterativeBoxBlurPostProcessor = new C13660a(pixelFromDIP);
        }
        this.mIsDirty = true;
    }

    public void setLoadingIndicatorSource(String str) {
        C13407b bVar;
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            bVar = new C13407b(resourceDrawable, 1000);
        } else {
            bVar = null;
        }
        this.mLoadingImageDrawable = bVar;
        this.mIsDirty = true;
    }

    private boolean shouldResize(ImageSource imageSource) {
        if (this.mResizeMethod == ImageResizeMethod.AUTO) {
            if (C13337d.m39036d(imageSource.getUri()) || C13337d.m39035c(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (this.mResizeMethod == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.mControllerListener = null;
        } else {
            final EventDispatcher eventDispatcher = ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.mControllerListener = new C13400c<C13648f>() {
                public void onSubmit(String str, Object obj) {
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(ReactImageView.this.getId(), 4));
                }

                public void onFailure(String str, Throwable th) {
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(ReactImageView.this.getId(), 1));
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(ReactImageView.this.getId(), 3));
                }

                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    if (fVar != null) {
                        EventDispatcher eventDispatcher = eventDispatcher;
                        ImageLoadEvent imageLoadEvent = new ImageLoadEvent(ReactImageView.this.getId(), 2, ReactImageView.this.mImageSource.getSource(), fVar.getWidth(), fVar.getHeight());
                        eventDispatcher.dispatchEvent(imageLoadEvent);
                        eventDispatcher.dispatchEvent(new ImageLoadEvent(ReactImageView.this.getId(), 3));
                    }
                }
            };
        }
        this.mIsDirty = true;
    }

    public void cornerRadii(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!C14644a.m42350a(this.mBorderRadius)) {
            f = this.mBorderRadius;
        } else {
            f = 0.0f;
        }
        if (this.mBorderCornerRadii == null || C14644a.m42350a(this.mBorderCornerRadii[0])) {
            f2 = f;
        } else {
            f2 = this.mBorderCornerRadii[0];
        }
        fArr[0] = f2;
        if (this.mBorderCornerRadii == null || C14644a.m42350a(this.mBorderCornerRadii[1])) {
            f3 = f;
        } else {
            f3 = this.mBorderCornerRadii[1];
        }
        fArr[1] = f3;
        if (this.mBorderCornerRadii == null || C14644a.m42350a(this.mBorderCornerRadii[2])) {
            f4 = f;
        } else {
            f4 = this.mBorderCornerRadii[2];
        }
        fArr[2] = f4;
        if (this.mBorderCornerRadii != null && !C14644a.m42350a(this.mBorderCornerRadii[3])) {
            f = this.mBorderCornerRadii[3];
        }
        fArr[3] = f;
    }

    public void setSource(ReadableArray readableArray) {
        this.mSources.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                ImageSource imageSource = new ImageSource(getContext(), string);
                this.mSources.add(imageSource);
                if (Uri.EMPTY.equals(imageSource.getUri())) {
                    warnImageSource(string);
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string2 = map.getString("uri");
                    ImageSource imageSource2 = new ImageSource(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    this.mSources.add(imageSource2);
                    if (Uri.EMPTY.equals(imageSource2.getUri())) {
                        warnImageSource(string2);
                    }
                }
            }
        }
        this.mIsDirty = true;
    }

    public void setBorderRadius(float f, int i) {
        if (this.mBorderCornerRadii == null) {
            this.mBorderCornerRadii = new float[4];
            Arrays.fill(this.mBorderCornerRadii, 1.0E21f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f)) {
            this.mBorderCornerRadii[i] = f;
            this.mIsDirty = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (this.mIsDirty || hasMultipleSources()) {
                z = true;
            } else {
                z = false;
            }
            this.mIsDirty = z;
            maybeUpdateView();
        }
    }

    public ReactImageView(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, buildHierarchy(context));
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mRoundedCornerPostprocessor = new RoundedCornerPostprocessor();
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
        this.mSources = new LinkedList();
    }
}
