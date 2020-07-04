package com.bytedance.ies.bullet.kit.p261rn.pkg.fastimage;

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
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.p723j.C13660a;
import com.facebook.imagepipeline.request.C13841a;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.image.GlobalImageLoadListener;
import com.facebook.react.views.image.ImageResizeMethod;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.MultiSourceHelper.MultiSourceResult;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.yoga.C14644a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.fastimage.c */
public final class C10601c extends GenericDraweeView {

    /* renamed from: a */
    public static float[] f28395a = new float[4];

    /* renamed from: b */
    public static final Matrix f28396b = new Matrix();

    /* renamed from: c */
    public static final Matrix f28397c = new Matrix();

    /* renamed from: A */
    private RequestLevel f28398A;

    /* renamed from: d */
    public C13423b f28399d = ImageResizeMode.defaultValue();

    /* renamed from: e */
    private ImageResizeMethod f28400e = ImageResizeMethod.AUTO;

    /* renamed from: f */
    private final List<ImageSource> f28401f;

    /* renamed from: g */
    private ImageSource f28402g;

    /* renamed from: h */
    private ImageSource f28403h;

    /* renamed from: i */
    private Drawable f28404i;

    /* renamed from: j */
    private int f28405j;

    /* renamed from: k */
    private int f28406k;

    /* renamed from: l */
    private float f28407l;

    /* renamed from: m */
    private float f28408m = 1.0E21f;

    /* renamed from: n */
    private float[] f28409n;

    /* renamed from: o */
    private boolean f28410o;

    /* renamed from: p */
    private final AbstractDraweeControllerBuilder f28411p;

    /* renamed from: q */
    private final C10603a f28412q;

    /* renamed from: r */
    private C13660a f28413r;

    /* renamed from: s */
    private C13401d f28414s;

    /* renamed from: t */
    private C13401d f28415t;

    /* renamed from: u */
    private GlobalImageLoadListener f28416u;

    /* renamed from: v */
    private final Object f28417v;

    /* renamed from: w */
    private int f28418w = -1;

    /* renamed from: x */
    private boolean f28419x;

    /* renamed from: y */
    private ReadableMap f28420y;

    /* renamed from: z */
    private Priority f28421z;

    /* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.fastimage.c$a */
    class C10603a extends C13841a {
        private C10603a() {
        }

        public final void process(Bitmap bitmap, Bitmap bitmap2) {
            C10601c.this.mo25418a(C10601c.f28395a);
            bitmap.setHasAlpha(true);
            if (!FloatUtil.floatsEqual(C10601c.f28395a[0], 0.0f) || !FloatUtil.floatsEqual(C10601c.f28395a[1], 0.0f) || !FloatUtil.floatsEqual(C10601c.f28395a[2], 0.0f) || !FloatUtil.floatsEqual(C10601c.f28395a[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                m31021a(bitmap2, C10601c.f28395a, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.process(bitmap, bitmap2);
        }

        /* renamed from: a */
        private void m31021a(Bitmap bitmap, float[] fArr, float[] fArr2) {
            C10601c.this.f28399d.mo32864a(C10601c.f28396b, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            C10601c.f28396b.invert(C10601c.f28397c);
            fArr2[0] = C10601c.f28397c.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = C10601c.f28397c.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = C10601c.f28397c.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = C10601c.f28397c.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: b */
    private boolean m31016b() {
        if (this.f28401f.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m31017c() {
        this.f28402g = null;
        if (!this.f28401f.isEmpty()) {
            if (m31016b()) {
                MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.f28401f);
                this.f28402g = bestSourceForSize.getBestResult();
                this.f28403h = bestSourceForSize.getBestResultInCache();
                return;
            }
            this.f28402g = (ImageSource) this.f28401f.get(0);
        }
    }

    /* renamed from: a */
    public final void mo25417a() {
        boolean z;
        int i;
        C13842b bVar;
        if (this.f28410o) {
            if (!m31016b() || (getWidth() > 0 && getHeight() > 0)) {
                m31017c();
                if (this.f28402g != null) {
                    boolean a = m31014a(this.f28402g);
                    if (!a || (getWidth() > 0 && getHeight() > 0)) {
                        C13438a aVar = (C13438a) getHierarchy();
                        aVar.mo32896a(this.f28399d);
                        if (this.f28404i != null) {
                            aVar.mo32895a(this.f28404i, C13423b.f35597e);
                        }
                        if (this.f28399d == C13423b.f35599g || this.f28399d == C13423b.f35600h) {
                            z = false;
                        } else {
                            z = true;
                        }
                        RoundingParams roundingParams = aVar.f35619a;
                        if (z) {
                            roundingParams.mo32879a(0.0f);
                        } else {
                            mo25418a(f28395a);
                            roundingParams.mo32880a(f28395a[0], f28395a[1], f28395a[2], f28395a[3]);
                        }
                        roundingParams.mo32882a(this.f28405j, this.f28407l);
                        if (this.f28406k != 0) {
                            roundingParams.mo32881a(this.f28406k);
                        } else {
                            roundingParams.mo32883a(RoundingMethod.BITMAP_ONLY);
                        }
                        aVar.mo32897a(roundingParams);
                        if (this.f28418w >= 0) {
                            i = this.f28418w;
                        } else if (this.f28402g.isResource()) {
                            i = 0;
                        } else {
                            i = C34943c.f91128x;
                        }
                        aVar.mo32890a(i);
                        C13596d dVar = null;
                        if (z) {
                            bVar = this.f28412q;
                        } else if (this.f28413r != null) {
                            bVar = this.f28413r;
                        } else {
                            bVar = null;
                        }
                        if (a) {
                            dVar = new C13596d(getWidth(), getHeight());
                        }
                        ImageRequestBuilder b = ImageRequestBuilder.m40865a(this.f28402g.getUri()).mo33473a(bVar).mo33468a(dVar).mo33474a(true).mo33477b(this.f28419x);
                        if (this.f28421z != null) {
                            b.mo33465a(this.f28421z);
                        }
                        if (this.f28398A != null) {
                            b.mo33472a(this.f28398A);
                        }
                        new C10600b().mo25410a(b);
                        ReactNetworkImageRequest fromBuilderWithHeaders = ReactNetworkImageRequest.fromBuilderWithHeaders(b, this.f28420y);
                        if (this.f28416u != null) {
                            this.f28416u.onLoadAttempt(this.f28402g.getUri());
                        }
                        this.f28411p.mo32747b();
                        this.f28411p.mo32751c(true).mo32744a(this.f28417v).mo32729b(getController()).mo32748b(fromBuilderWithHeaders);
                        if (this.f28403h != null) {
                            this.f28411p.mo32750c(ImageRequestBuilder.m40865a(this.f28403h.getUri()).mo33473a(bVar).mo33468a(dVar).mo33474a(true).mo33477b(this.f28419x).mo33476b());
                        }
                        if (this.f28414s != null && this.f28415t != null) {
                            C13403f fVar = new C13403f();
                            fVar.mo32766a(this.f28414s);
                            fVar.mo32766a(this.f28415t);
                            this.f28411p.mo32743a((C13401d<? super INFO>) fVar);
                        } else if (this.f28415t != null) {
                            this.f28411p.mo32743a(this.f28415t);
                        } else if (this.f28414s != null) {
                            this.f28411p.mo32743a(this.f28414s);
                        }
                        setController(this.f28411p.mo32730f());
                        this.f28410o = false;
                        this.f28411p.mo32747b();
                    }
                }
            }
        }
    }

    public final void setFadeDuration(int i) {
        this.f28418w = i;
    }

    public final void setHeaders(ReadableMap readableMap) {
        this.f28420y = readableMap;
    }

    public final void setProgressiveRenderingEnabled(boolean z) {
        this.f28419x = z;
    }

    public final void setBorderColor(int i) {
        this.f28405j = i;
        this.f28410o = true;
    }

    public final void setOverlayColor(int i) {
        this.f28406k = i;
        this.f28410o = true;
    }

    public final void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.f28400e = imageResizeMethod;
        this.f28410o = true;
    }

    public final void setScaleType(C13423b bVar) {
        this.f28399d = bVar;
        this.f28410o = true;
    }

    public final void setBorderRadius(float f) {
        if (!FloatUtil.floatsEqual(this.f28408m, f)) {
            this.f28408m = f;
            this.f28410o = true;
        }
    }

    public final void setBorderWidth(float f) {
        this.f28407l = PixelUtil.toPixelFromDIP(f);
        this.f28410o = true;
    }

    public final void setControllerListener(C13401d dVar) {
        this.f28415t = dVar;
        this.f28410o = true;
        mo25417a();
    }

    /* renamed from: a */
    private static C13438a m31012a(Context context) {
        return new C13439b(context.getResources()).mo32915a(RoundingParams.m39399b(0.0f)).mo32908a();
    }

    public final void setBlurRadius(float f) {
        int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(f);
        if (pixelFromDIP == 0) {
            this.f28413r = null;
        } else {
            this.f28413r = new C13660a(pixelFromDIP);
        }
        this.f28410o = true;
    }

    public final void setLoadingIndicatorSource(String str) {
        C13407b bVar;
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            bVar = new C13407b(resourceDrawable, 1000);
        } else {
            bVar = null;
        }
        this.f28404i = bVar;
        this.f28410o = true;
    }

    public final void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.f28414s = null;
        } else {
            final RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class);
            this.f28414s = new C13400c<C13648f>() {
                public final void onSubmit(String str, Object obj) {
                    rCTEventEmitter.receiveEvent(C10601c.this.getId(), "onFastImageLoadStart", new WritableNativeMap());
                }

                public final void onFailure(String str, Throwable th) {
                    rCTEventEmitter.receiveEvent(C10601c.this.getId(), "onFastImageError", new WritableNativeMap());
                    rCTEventEmitter.receiveEvent(C10601c.this.getId(), "onFastImageLoadEnd", new WritableNativeMap());
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    if (fVar != null) {
                        rCTEventEmitter.receiveEvent(C10601c.this.getId(), "onFastImageLoad", C10601c.m31013a(fVar));
                        rCTEventEmitter.receiveEvent(C10601c.this.getId(), "onFastImageLoadEnd", new WritableNativeMap());
                    }
                }
            };
        }
        this.f28410o = true;
    }

    /* renamed from: a */
    public static WritableMap m31013a(C13648f fVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", fVar.getWidth());
        writableNativeMap.putInt("height", fVar.getHeight());
        return writableNativeMap;
    }

    /* renamed from: a */
    private boolean m31014a(ImageSource imageSource) {
        if (this.f28400e == ImageResizeMethod.AUTO) {
            if (C13337d.m39036d(imageSource.getUri()) || C13337d.m39035c(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (this.f28400e == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public final void setSource(ReadableMap readableMap) {
        this.f28401f.clear();
        if (readableMap != null && readableMap.hasKey("uri") && !m31015a(readableMap.getString("uri"))) {
            ImageSource imageSource = new ImageSource(getContext(), readableMap.getString("uri"));
            this.f28401f.add(imageSource);
            Uri.EMPTY.equals(imageSource.getUri());
            if (readableMap.hasKey("headers")) {
                ReadableMap map = readableMap.getMap("headers");
                if (map != null) {
                    setHeaders(map);
                }
            }
            this.f28421z = FastImageViewConverter.m31007a(readableMap);
            this.f28398A = FastImageViewConverter.m31010b(readableMap);
            setShouldNotifyLoadEvents(true);
        }
        this.f28410o = true;
    }

    /* renamed from: a */
    private static boolean m31015a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo25418a(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!C14644a.m42350a(this.f28408m)) {
            f = this.f28408m;
        } else {
            f = 0.0f;
        }
        if (this.f28409n == null || C14644a.m42350a(this.f28409n[0])) {
            f2 = f;
        } else {
            f2 = this.f28409n[0];
        }
        fArr[0] = f2;
        if (this.f28409n == null || C14644a.m42350a(this.f28409n[1])) {
            f3 = f;
        } else {
            f3 = this.f28409n[1];
        }
        fArr[1] = f3;
        if (this.f28409n == null || C14644a.m42350a(this.f28409n[2])) {
            f4 = f;
        } else {
            f4 = this.f28409n[2];
        }
        fArr[2] = f4;
        if (this.f28409n != null && !C14644a.m42350a(this.f28409n[3])) {
            f = this.f28409n[3];
        }
        fArr[3] = f;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (this.f28410o || m31016b()) {
                z = true;
            } else {
                z = false;
            }
            this.f28410o = z;
            mo25417a();
        }
    }

    public C10601c(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, m31012a(context));
        this.f28411p = abstractDraweeControllerBuilder;
        this.f28412q = new C10603a();
        this.f28416u = globalImageLoadListener;
        this.f28417v = obj;
        this.f28401f = new LinkedList();
    }
}
