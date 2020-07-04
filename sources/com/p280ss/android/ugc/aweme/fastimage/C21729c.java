package com.p280ss.android.ugc.aweme.fastimage;

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
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.fastimage.c */
public final class C21729c extends GenericDraweeView {

    /* renamed from: a */
    public static float[] f58178a = new float[4];

    /* renamed from: b */
    public static final Matrix f58179b = new Matrix();

    /* renamed from: c */
    public static final Matrix f58180c = new Matrix();

    /* renamed from: A */
    private RequestLevel f58181A;

    /* renamed from: d */
    public C13423b f58182d = ImageResizeMode.defaultValue();

    /* renamed from: e */
    private ImageResizeMethod f58183e = ImageResizeMethod.AUTO;

    /* renamed from: f */
    private final List<ImageSource> f58184f;

    /* renamed from: g */
    private ImageSource f58185g;

    /* renamed from: h */
    private ImageSource f58186h;

    /* renamed from: i */
    private Drawable f58187i;

    /* renamed from: j */
    private int f58188j;

    /* renamed from: k */
    private int f58189k;

    /* renamed from: l */
    private float f58190l;

    /* renamed from: m */
    private float f58191m = 1.0E21f;

    /* renamed from: n */
    private float[] f58192n;

    /* renamed from: o */
    private boolean f58193o;

    /* renamed from: p */
    private final AbstractDraweeControllerBuilder f58194p;

    /* renamed from: q */
    private final C21731a f58195q;

    /* renamed from: r */
    private C13660a f58196r;

    /* renamed from: s */
    private C13401d f58197s;

    /* renamed from: t */
    private C13401d f58198t;

    /* renamed from: u */
    private GlobalImageLoadListener f58199u;

    /* renamed from: v */
    private final Object f58200v;

    /* renamed from: w */
    private int f58201w = -1;

    /* renamed from: x */
    private boolean f58202x;

    /* renamed from: y */
    private ReadableMap f58203y;

    /* renamed from: z */
    private Priority f58204z;

    /* renamed from: com.ss.android.ugc.aweme.fastimage.c$a */
    class C21731a extends C13841a {
        private C21731a() {
        }

        public final void process(Bitmap bitmap, Bitmap bitmap2) {
            C21729c.this.mo58005a(C21729c.f58178a);
            bitmap.setHasAlpha(true);
            if (!FloatUtil.floatsEqual(C21729c.f58178a[0], 0.0f) || !FloatUtil.floatsEqual(C21729c.f58178a[1], 0.0f) || !FloatUtil.floatsEqual(C21729c.f58178a[2], 0.0f) || !FloatUtil.floatsEqual(C21729c.f58178a[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                m72660a(bitmap2, C21729c.f58178a, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.process(bitmap, bitmap2);
        }

        /* renamed from: a */
        private void m72660a(Bitmap bitmap, float[] fArr, float[] fArr2) {
            C21729c.this.f58182d.mo32864a(C21729c.f58179b, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            C21729c.f58179b.invert(C21729c.f58180c);
            fArr2[0] = C21729c.f58180c.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = C21729c.f58180c.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = C21729c.f58180c.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = C21729c.f58180c.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: b */
    private boolean m72655b() {
        if (this.f58184f.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m72656c() {
        this.f58185g = null;
        if (!this.f58184f.isEmpty()) {
            if (m72655b()) {
                MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.f58184f);
                this.f58185g = bestSourceForSize.getBestResult();
                this.f58186h = bestSourceForSize.getBestResultInCache();
                return;
            }
            this.f58185g = (ImageSource) this.f58184f.get(0);
        }
    }

    /* renamed from: a */
    public final void mo58004a() {
        boolean z;
        int i;
        C13842b bVar;
        if (this.f58193o) {
            if (!m72655b() || (getWidth() > 0 && getHeight() > 0)) {
                m72656c();
                if (this.f58185g != null) {
                    boolean a = m72653a(this.f58185g);
                    if (!a || (getWidth() > 0 && getHeight() > 0)) {
                        C13438a aVar = (C13438a) getHierarchy();
                        aVar.mo32896a(this.f58182d);
                        if (this.f58187i != null) {
                            aVar.mo32895a(this.f58187i, C13423b.f35597e);
                        }
                        if (this.f58182d == C13423b.f35599g || this.f58182d == C13423b.f35600h) {
                            z = false;
                        } else {
                            z = true;
                        }
                        RoundingParams roundingParams = aVar.f35619a;
                        if (z) {
                            roundingParams.mo32879a(0.0f);
                        } else {
                            mo58005a(f58178a);
                            roundingParams.mo32880a(f58178a[0], f58178a[1], f58178a[2], f58178a[3]);
                        }
                        roundingParams.mo32882a(this.f58188j, this.f58190l);
                        if (this.f58189k != 0) {
                            roundingParams.mo32881a(this.f58189k);
                        } else {
                            roundingParams.mo32883a(RoundingMethod.BITMAP_ONLY);
                        }
                        aVar.mo32897a(roundingParams);
                        if (this.f58201w >= 0) {
                            i = this.f58201w;
                        } else if (this.f58185g.isResource()) {
                            i = 0;
                        } else {
                            i = C34943c.f91128x;
                        }
                        aVar.mo32890a(i);
                        C13596d dVar = null;
                        if (z) {
                            bVar = this.f58195q;
                        } else if (this.f58196r != null) {
                            bVar = this.f58196r;
                        } else {
                            bVar = null;
                        }
                        if (a) {
                            dVar = new C13596d(getWidth(), getHeight());
                        }
                        ImageRequestBuilder b = ImageRequestBuilder.m40865a(this.f58185g.getUri()).mo33473a(bVar).mo33468a(dVar).mo33474a(true).mo33477b(this.f58202x);
                        if (!(ReactInstance.getConfig() == null || ReactInstance.getConfig().mo67296e() == null)) {
                            b.mo33467a(ReactInstance.getConfig().mo67296e());
                        }
                        if (this.f58204z != null) {
                            b.mo33465a(this.f58204z);
                        }
                        if (this.f58181A != null) {
                            b.mo33472a(this.f58181A);
                        }
                        new C21728b().mo58003a(b);
                        ReactNetworkImageRequest fromBuilderWithHeaders = ReactNetworkImageRequest.fromBuilderWithHeaders(b, this.f58203y);
                        if (this.f58199u != null) {
                            this.f58199u.onLoadAttempt(this.f58185g.getUri());
                        }
                        this.f58194p.mo32747b();
                        this.f58194p.mo32751c(true).mo32744a(this.f58200v).mo32729b(getController()).mo32748b(fromBuilderWithHeaders);
                        if (this.f58186h != null) {
                            this.f58194p.mo32750c(ImageRequestBuilder.m40865a(this.f58186h.getUri()).mo33473a(bVar).mo33468a(dVar).mo33474a(true).mo33477b(this.f58202x).mo33476b());
                        }
                        if (this.f58197s != null && this.f58198t != null) {
                            C13403f fVar = new C13403f();
                            fVar.mo32766a(this.f58197s);
                            fVar.mo32766a(this.f58198t);
                            this.f58194p.mo32743a((C13401d<? super INFO>) fVar);
                        } else if (this.f58198t != null) {
                            this.f58194p.mo32743a(this.f58198t);
                        } else if (this.f58197s != null) {
                            this.f58194p.mo32743a(this.f58197s);
                        }
                        setController(this.f58194p.mo32730f());
                        this.f58193o = false;
                        this.f58194p.mo32747b();
                    }
                }
            }
        }
    }

    public final void setFadeDuration(int i) {
        this.f58201w = i;
    }

    public final void setHeaders(ReadableMap readableMap) {
        this.f58203y = readableMap;
    }

    public final void setProgressiveRenderingEnabled(boolean z) {
        this.f58202x = z;
    }

    public final void setBorderColor(int i) {
        this.f58188j = i;
        this.f58193o = true;
    }

    public final void setOverlayColor(int i) {
        this.f58189k = i;
        this.f58193o = true;
    }

    public final void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.f58183e = imageResizeMethod;
        this.f58193o = true;
    }

    public final void setScaleType(C13423b bVar) {
        this.f58182d = bVar;
        this.f58193o = true;
    }

    public final void setBorderRadius(float f) {
        if (!FloatUtil.floatsEqual(this.f58191m, f)) {
            this.f58191m = f;
            this.f58193o = true;
        }
    }

    public final void setBorderWidth(float f) {
        this.f58190l = PixelUtil.toPixelFromDIP(f);
        this.f58193o = true;
    }

    public final void setControllerListener(C13401d dVar) {
        this.f58198t = dVar;
        this.f58193o = true;
        mo58004a();
    }

    /* renamed from: a */
    private static C13438a m72651a(Context context) {
        return new C13439b(context.getResources()).mo32915a(RoundingParams.m39399b(0.0f)).mo32908a();
    }

    public final void setBlurRadius(float f) {
        int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(f);
        if (pixelFromDIP == 0) {
            this.f58196r = null;
        } else {
            this.f58196r = new C13660a(pixelFromDIP);
        }
        this.f58193o = true;
    }

    public final void setLoadingIndicatorSource(String str) {
        C13407b bVar;
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            bVar = new C13407b(resourceDrawable, 1000);
        } else {
            bVar = null;
        }
        this.f58187i = bVar;
        this.f58193o = true;
    }

    public final void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.f58197s = null;
        } else {
            final RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class);
            this.f58197s = new C13400c<C13648f>() {
                public final void onSubmit(String str, Object obj) {
                    rCTEventEmitter.receiveEvent(C21729c.this.getId(), "onFastImageLoadStart", new WritableNativeMap());
                }

                public final void onFailure(String str, Throwable th) {
                    rCTEventEmitter.receiveEvent(C21729c.this.getId(), "onFastImageError", new WritableNativeMap());
                    rCTEventEmitter.receiveEvent(C21729c.this.getId(), "onFastImageLoadEnd", new WritableNativeMap());
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    if (fVar != null) {
                        rCTEventEmitter.receiveEvent(C21729c.this.getId(), "onFastImageLoad", C21729c.m72652a(fVar));
                        rCTEventEmitter.receiveEvent(C21729c.this.getId(), "onFastImageLoadEnd", new WritableNativeMap());
                    }
                }
            };
        }
        this.f58193o = true;
    }

    /* renamed from: a */
    public static WritableMap m72652a(C13648f fVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", fVar.getWidth());
        writableNativeMap.putInt("height", fVar.getHeight());
        return writableNativeMap;
    }

    /* renamed from: a */
    private boolean m72653a(ImageSource imageSource) {
        if (this.f58183e == ImageResizeMethod.AUTO) {
            if (C13337d.m39036d(imageSource.getUri()) || C13337d.m39035c(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (this.f58183e == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public final void setSource(ReadableMap readableMap) {
        this.f58184f.clear();
        if (readableMap != null && readableMap.hasKey("uri") && !m72654a(readableMap.getString("uri"))) {
            ImageSource imageSource = new ImageSource(getContext(), readableMap.getString("uri"));
            this.f58184f.add(imageSource);
            Uri.EMPTY.equals(imageSource.getUri());
            if (readableMap.hasKey("headers")) {
                ReadableMap map = readableMap.getMap("headers");
                if (map != null) {
                    setHeaders(map);
                }
            }
            this.f58204z = FastImageViewConverter.m72646a(readableMap);
            this.f58181A = FastImageViewConverter.m72649b(readableMap);
            setShouldNotifyLoadEvents(true);
        }
        this.f58193o = true;
    }

    /* renamed from: a */
    private static boolean m72654a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo58005a(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!C14644a.m42350a(this.f58191m)) {
            f = this.f58191m;
        } else {
            f = 0.0f;
        }
        if (this.f58192n == null || C14644a.m42350a(this.f58192n[0])) {
            f2 = f;
        } else {
            f2 = this.f58192n[0];
        }
        fArr[0] = f2;
        if (this.f58192n == null || C14644a.m42350a(this.f58192n[1])) {
            f3 = f;
        } else {
            f3 = this.f58192n[1];
        }
        fArr[1] = f3;
        if (this.f58192n == null || C14644a.m42350a(this.f58192n[2])) {
            f4 = f;
        } else {
            f4 = this.f58192n[2];
        }
        fArr[2] = f4;
        if (this.f58192n != null && !C14644a.m42350a(this.f58192n[3])) {
            f = this.f58192n[3];
        }
        fArr[3] = f;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (this.f58193o || m72655b()) {
                z = true;
            } else {
                z = false;
            }
            this.f58193o = z;
            mo58004a();
        }
    }

    public C21729c(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, m72651a(context));
        this.f58194p = abstractDraweeControllerBuilder;
        this.f58195q = new C21731a();
        this.f58199u = globalImageLoadListener;
        this.f58200v = obj;
        this.f58184f = new LinkedList();
    }
}
