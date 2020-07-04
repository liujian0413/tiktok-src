package com.bytedance.ies.bullet.kit.p261rn.pkg.animation;

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
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.C13841a;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.image.ImageLoadEvent;
import com.facebook.react.views.image.ImageResizeMethod;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.MultiSourceHelper.MultiSourceResult;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.yoga.C14644a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.animation.a */
public final class C10590a extends GenericDraweeView {

    /* renamed from: a */
    public static float[] f28357a = new float[4];

    /* renamed from: b */
    public static final Matrix f28358b = new Matrix();

    /* renamed from: c */
    public static final Matrix f28359c = new Matrix();

    /* renamed from: d */
    public ImageSource f28360d;

    /* renamed from: e */
    public C13423b f28361e = ImageResizeMode.defaultValue();

    /* renamed from: f */
    public Animatable f28362f;

    /* renamed from: g */
    private ImageResizeMethod f28363g = ImageResizeMethod.AUTO;

    /* renamed from: h */
    private final List<ImageSource> f28364h;

    /* renamed from: i */
    private ImageSource f28365i;

    /* renamed from: j */
    private Drawable f28366j;

    /* renamed from: k */
    private int f28367k;

    /* renamed from: l */
    private int f28368l;

    /* renamed from: m */
    private float f28369m;

    /* renamed from: n */
    private float f28370n = 1.0E21f;

    /* renamed from: o */
    private float[] f28371o;

    /* renamed from: p */
    private boolean f28372p;

    /* renamed from: q */
    private final AbstractDraweeControllerBuilder f28373q;

    /* renamed from: r */
    private final C10592a f28374r;

    /* renamed from: s */
    private C13401d f28375s;

    /* renamed from: t */
    private C13401d f28376t;

    /* renamed from: u */
    private final Object f28377u;

    /* renamed from: v */
    private int f28378v = -1;

    /* renamed from: w */
    private boolean f28379w;

    /* renamed from: x */
    private boolean f28380x;

    /* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.animation.a$a */
    class C10592a extends C13841a {
        private C10592a() {
        }

        public final void process(Bitmap bitmap, Bitmap bitmap2) {
            C10590a.this.mo25384a(C10590a.f28357a);
            bitmap.setHasAlpha(true);
            if (!FloatUtil.floatsEqual(C10590a.f28357a[0], 0.0f) || !FloatUtil.floatsEqual(C10590a.f28357a[1], 0.0f) || !FloatUtil.floatsEqual(C10590a.f28357a[2], 0.0f) || !FloatUtil.floatsEqual(C10590a.f28357a[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                m31006a(bitmap2, C10590a.f28357a, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.process(bitmap, bitmap2);
        }

        /* renamed from: a */
        private void m31006a(Bitmap bitmap, float[] fArr, float[] fArr2) {
            C10590a.this.f28361e.mo32864a(C10590a.f28358b, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            C10590a.f28358b.invert(C10590a.f28359c);
            fArr2[0] = C10590a.f28359c.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = C10590a.f28359c.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = C10590a.f28359c.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = C10590a.f28359c.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: c */
    private boolean m30999c() {
        if (this.f28364h.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m31000d() {
        this.f28360d = null;
        if (!this.f28364h.isEmpty()) {
            if (m30999c()) {
                MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.f28364h);
                this.f28360d = bestSourceForSize.getBestResult();
                this.f28365i = bestSourceForSize.getBestResultInCache();
                return;
            }
            this.f28360d = (ImageSource) this.f28364h.get(0);
        }
    }

    /* renamed from: a */
    public final void mo25382a() {
        if (this.f28362f != null) {
            if (this.f28380x && !this.f28362f.isRunning()) {
                this.f28362f.start();
            } else if (!this.f28380x) {
                this.f28362f.stop();
            }
        }
    }

    /* renamed from: b */
    public final void mo25385b() {
        boolean z;
        int i;
        C13842b bVar;
        if (this.f28372p) {
            if (!m30999c() || (getWidth() > 0 && getHeight() > 0)) {
                m31000d();
                if (this.f28360d != null) {
                    boolean a = m30998a(this.f28360d);
                    if (!a || (getWidth() > 0 && getHeight() > 0)) {
                        C13438a aVar = (C13438a) getHierarchy();
                        aVar.mo32896a(this.f28361e);
                        if (this.f28366j != null) {
                            aVar.mo32895a(this.f28366j, C13423b.f35597e);
                        }
                        if (this.f28361e == C13423b.f35599g || this.f28361e == C13423b.f35600h) {
                            z = false;
                        } else {
                            z = true;
                        }
                        RoundingParams roundingParams = aVar.f35619a;
                        if (roundingParams != null) {
                            if (z) {
                                roundingParams.mo32879a(0.0f);
                            } else {
                                mo25384a(f28357a);
                                roundingParams.mo32880a(f28357a[0], f28357a[1], f28357a[2], f28357a[3]);
                            }
                            roundingParams.mo32882a(this.f28367k, this.f28369m);
                            if (this.f28368l != 0) {
                                roundingParams.mo32881a(this.f28368l);
                            } else {
                                roundingParams.mo32883a(RoundingMethod.BITMAP_ONLY);
                            }
                        }
                        aVar.mo32897a(roundingParams);
                        if (this.f28378v >= 0) {
                            i = this.f28378v;
                        } else if (this.f28360d.isResource()) {
                            i = 0;
                        } else {
                            i = C34943c.f91128x;
                        }
                        aVar.mo32890a(i);
                        C13596d dVar = null;
                        if (z) {
                            bVar = this.f28374r;
                        } else {
                            bVar = null;
                        }
                        if (a) {
                            dVar = new C13596d(getWidth(), getHeight());
                        }
                        ImageRequest b = ImageRequestBuilder.m40865a(this.f28360d.getUri()).mo33473a(bVar).mo33468a(dVar).mo33469a(C13597e.m40009a()).mo33477b(this.f28379w).mo33476b();
                        this.f28373q.mo32747b();
                        this.f28373q.mo32751c(true).mo32744a(this.f28377u).mo32729b(getController()).mo32748b(b);
                        if (this.f28365i != null) {
                            this.f28373q.mo32750c(ImageRequestBuilder.m40865a(this.f28365i.getUri()).mo33473a(bVar).mo33468a(dVar).mo33469a(C13597e.m40009a()).mo33477b(this.f28379w).mo33476b());
                        }
                        if (this.f28375s != null && this.f28376t != null) {
                            C13403f fVar = new C13403f();
                            fVar.mo32766a(this.f28375s);
                            fVar.mo32766a(this.f28376t);
                            this.f28373q.mo32743a((C13401d<? super INFO>) fVar);
                        } else if (this.f28376t != null) {
                            this.f28373q.mo32743a(this.f28376t);
                        } else if (this.f28375s != null) {
                            this.f28373q.mo32743a(this.f28375s);
                        }
                        setController(this.f28373q.mo32730f());
                        this.f28372p = false;
                    }
                }
            }
        }
    }

    public final void setFadeDuration(int i) {
        this.f28378v = i;
    }

    public final void setProgressiveRenderingEnabled(boolean z) {
        this.f28379w = z;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        mo25382a();
        super.onDraw(canvas);
    }

    public final void setBorderColor(int i) {
        this.f28367k = i;
        this.f28372p = true;
    }

    public final void setOverlayColor(int i) {
        this.f28368l = i;
        this.f28372p = true;
    }

    public final void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.f28363g = imageResizeMethod;
        this.f28372p = true;
    }

    public final void setScaleType(C13423b bVar) {
        this.f28361e = bVar;
        this.f28372p = true;
    }

    public final void setBorderRadius(float f) {
        if (!FloatUtil.floatsEqual(this.f28370n, f)) {
            this.f28370n = f;
            this.f28372p = true;
        }
    }

    public final void setBorderWidth(float f) {
        this.f28369m = PixelUtil.toPixelFromDIP(f);
        this.f28372p = true;
    }

    public final void setControllerListener(C13401d dVar) {
        this.f28376t = dVar;
        this.f28372p = true;
        mo25385b();
    }

    public final void setShouldPlay(boolean z) {
        if (this.f28380x != z) {
            this.f28380x = z;
            mo25382a();
            this.f28372p = true;
        }
    }

    /* renamed from: a */
    private static C13438a m30997a(Context context) {
        return new C13439b(context.getResources()).mo32915a(RoundingParams.m39399b(0.0f)).mo32908a();
    }

    public final void setLoadingIndicatorSource(String str) {
        C13407b bVar;
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            bVar = new C13407b(resourceDrawable, 1000);
        } else {
            bVar = null;
        }
        this.f28366j = bVar;
        this.f28372p = true;
    }

    /* renamed from: a */
    private boolean m30998a(ImageSource imageSource) {
        if (this.f28363g == ImageResizeMethod.AUTO) {
            if (C13337d.m39036d(imageSource.getUri()) || C13337d.m39035c(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (this.f28363g == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.f28375s = null;
        } else {
            final EventDispatcher eventDispatcher = ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.f28375s = new C13400c<C13648f>() {
                public final void onSubmit(String str, Object obj) {
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(C10590a.this.getId(), 4));
                }

                public final void onFailure(String str, Throwable th) {
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(C10590a.this.getId(), 1));
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(C10590a.this.getId(), 3));
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    C10590a.this.f28362f = animatable;
                    C10590a.this.mo25382a();
                    if (fVar != null && C10590a.this.f28360d != null) {
                        EventDispatcher eventDispatcher = eventDispatcher;
                        ImageLoadEvent imageLoadEvent = new ImageLoadEvent(C10590a.this.getId(), 2, C10590a.this.f28360d.getSource(), fVar.getWidth(), fVar.getHeight());
                        eventDispatcher.dispatchEvent(imageLoadEvent);
                        eventDispatcher.dispatchEvent(new ImageLoadEvent(C10590a.this.getId(), 3));
                    }
                }
            };
        }
        this.f28372p = true;
    }

    public final void setSource(ReadableArray readableArray) {
        this.f28364h.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                this.f28364h.add(new ImageSource(getContext(), readableArray.getMap(0).getString("uri")));
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    List<ImageSource> list = this.f28364h;
                    ImageSource imageSource = new ImageSource(getContext(), map.getString("uri"), map.getDouble("width"), map.getDouble("height"));
                    list.add(imageSource);
                }
            }
        }
        this.f28372p = true;
    }

    /* renamed from: a */
    public final void mo25384a(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!C14644a.m42350a(this.f28370n)) {
            f = this.f28370n;
        } else {
            f = 0.0f;
        }
        if (this.f28371o == null || C14644a.m42350a(this.f28371o[0])) {
            f2 = f;
        } else {
            f2 = this.f28371o[0];
        }
        fArr[0] = f2;
        if (this.f28371o == null || C14644a.m42350a(this.f28371o[1])) {
            f3 = f;
        } else {
            f3 = this.f28371o[1];
        }
        fArr[1] = f3;
        if (this.f28371o == null || C14644a.m42350a(this.f28371o[2])) {
            f4 = f;
        } else {
            f4 = this.f28371o[2];
        }
        fArr[2] = f4;
        if (this.f28371o != null && !C14644a.m42350a(this.f28371o[3])) {
            f = this.f28371o[3];
        }
        fArr[3] = f;
    }

    /* renamed from: a */
    public final void mo25383a(float f, int i) {
        if (this.f28371o == null) {
            this.f28371o = new float[4];
            Arrays.fill(this.f28371o, 1.0E21f);
        }
        if (!FloatUtil.floatsEqual(this.f28371o[i], f)) {
            this.f28371o[i] = f;
            this.f28372p = true;
        }
    }

    public C10590a(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        super(context, m30997a(context));
        this.f28373q = abstractDraweeControllerBuilder;
        this.f28374r = new C10592a();
        this.f28377u = obj;
        this.f28364h = new LinkedList();
        this.f28380x = true;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (this.f28372p || m30999c()) {
                z = true;
            } else {
                z = false;
            }
            this.f28372p = z;
            mo25385b();
        }
    }
}
