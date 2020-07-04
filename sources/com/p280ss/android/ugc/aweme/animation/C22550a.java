package com.p280ss.android.ugc.aweme.animation;

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

/* renamed from: com.ss.android.ugc.aweme.animation.a */
public final class C22550a extends GenericDraweeView {

    /* renamed from: a */
    public static float[] f60073a = new float[4];

    /* renamed from: b */
    public static final Matrix f60074b = new Matrix();

    /* renamed from: c */
    public static final Matrix f60075c = new Matrix();

    /* renamed from: d */
    public ImageSource f60076d;

    /* renamed from: e */
    public C13423b f60077e = ImageResizeMode.defaultValue();

    /* renamed from: f */
    public Animatable f60078f;

    /* renamed from: g */
    private ImageResizeMethod f60079g = ImageResizeMethod.AUTO;

    /* renamed from: h */
    private final List<ImageSource> f60080h;

    /* renamed from: i */
    private ImageSource f60081i;

    /* renamed from: j */
    private Drawable f60082j;

    /* renamed from: k */
    private int f60083k;

    /* renamed from: l */
    private int f60084l;

    /* renamed from: m */
    private float f60085m;

    /* renamed from: n */
    private float f60086n = 1.0E21f;

    /* renamed from: o */
    private float[] f60087o;

    /* renamed from: p */
    private boolean f60088p;

    /* renamed from: q */
    private final AbstractDraweeControllerBuilder f60089q;

    /* renamed from: r */
    private final C22552a f60090r;

    /* renamed from: s */
    private C13401d f60091s;

    /* renamed from: t */
    private C13401d f60092t;

    /* renamed from: u */
    private final Object f60093u;

    /* renamed from: v */
    private int f60094v = -1;

    /* renamed from: w */
    private boolean f60095w;

    /* renamed from: x */
    private boolean f60096x;

    /* renamed from: com.ss.android.ugc.aweme.animation.a$a */
    class C22552a extends C13841a {
        private C22552a() {
        }

        public final void process(Bitmap bitmap, Bitmap bitmap2) {
            C22550a.this.mo59175a(C22550a.f60073a);
            bitmap.setHasAlpha(true);
            if (!FloatUtil.floatsEqual(C22550a.f60073a[0], 0.0f) || !FloatUtil.floatsEqual(C22550a.f60073a[1], 0.0f) || !FloatUtil.floatsEqual(C22550a.f60073a[2], 0.0f) || !FloatUtil.floatsEqual(C22550a.f60073a[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                m74555a(bitmap2, C22550a.f60073a, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.process(bitmap, bitmap2);
        }

        /* renamed from: a */
        private void m74555a(Bitmap bitmap, float[] fArr, float[] fArr2) {
            C22550a.this.f60077e.mo32864a(C22550a.f60074b, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            C22550a.f60074b.invert(C22550a.f60075c);
            fArr2[0] = C22550a.f60075c.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = C22550a.f60075c.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = C22550a.f60075c.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = C22550a.f60075c.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: c */
    private boolean m74548c() {
        if (this.f60080h.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m74549d() {
        this.f60076d = null;
        if (!this.f60080h.isEmpty()) {
            if (m74548c()) {
                MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.f60080h);
                this.f60076d = bestSourceForSize.getBestResult();
                this.f60081i = bestSourceForSize.getBestResultInCache();
                return;
            }
            this.f60076d = (ImageSource) this.f60080h.get(0);
        }
    }

    /* renamed from: a */
    public final void mo59173a() {
        if (this.f60078f != null) {
            if (this.f60096x && !this.f60078f.isRunning()) {
                this.f60078f.start();
            } else if (!this.f60096x) {
                this.f60078f.stop();
            }
        }
    }

    /* renamed from: b */
    public final void mo59176b() {
        boolean z;
        int i;
        C13842b bVar;
        if (this.f60088p) {
            if (!m74548c() || (getWidth() > 0 && getHeight() > 0)) {
                m74549d();
                if (this.f60076d != null) {
                    boolean a = m74547a(this.f60076d);
                    if (!a || (getWidth() > 0 && getHeight() > 0)) {
                        C13438a aVar = (C13438a) getHierarchy();
                        aVar.mo32896a(this.f60077e);
                        if (this.f60082j != null) {
                            aVar.mo32895a(this.f60082j, C13423b.f35597e);
                        }
                        if (this.f60077e == C13423b.f35599g || this.f60077e == C13423b.f35600h) {
                            z = false;
                        } else {
                            z = true;
                        }
                        RoundingParams roundingParams = aVar.f35619a;
                        if (roundingParams != null) {
                            if (z) {
                                roundingParams.mo32879a(0.0f);
                            } else {
                                mo59175a(f60073a);
                                roundingParams.mo32880a(f60073a[0], f60073a[1], f60073a[2], f60073a[3]);
                            }
                            roundingParams.mo32882a(this.f60083k, this.f60085m);
                            if (this.f60084l != 0) {
                                roundingParams.mo32881a(this.f60084l);
                            } else {
                                roundingParams.mo32883a(RoundingMethod.BITMAP_ONLY);
                            }
                        }
                        aVar.mo32897a(roundingParams);
                        if (this.f60094v >= 0) {
                            i = this.f60094v;
                        } else if (this.f60076d.isResource()) {
                            i = 0;
                        } else {
                            i = C34943c.f91128x;
                        }
                        aVar.mo32890a(i);
                        C13596d dVar = null;
                        if (z) {
                            bVar = this.f60090r;
                        } else {
                            bVar = null;
                        }
                        if (a) {
                            dVar = new C13596d(getWidth(), getHeight());
                        }
                        ImageRequest b = ImageRequestBuilder.m40865a(this.f60076d.getUri()).mo33473a(bVar).mo33468a(dVar).mo33469a(C13597e.m40009a()).mo33477b(this.f60095w).mo33476b();
                        this.f60089q.mo32747b();
                        this.f60089q.mo32751c(true).mo32744a(this.f60093u).mo32729b(getController()).mo32748b(b);
                        if (this.f60081i != null) {
                            this.f60089q.mo32750c(ImageRequestBuilder.m40865a(this.f60081i.getUri()).mo33473a(bVar).mo33468a(dVar).mo33469a(C13597e.m40009a()).mo33477b(this.f60095w).mo33476b());
                        }
                        if (this.f60091s != null && this.f60092t != null) {
                            C13403f fVar = new C13403f();
                            fVar.mo32766a(this.f60091s);
                            fVar.mo32766a(this.f60092t);
                            this.f60089q.mo32743a((C13401d<? super INFO>) fVar);
                        } else if (this.f60092t != null) {
                            this.f60089q.mo32743a(this.f60092t);
                        } else if (this.f60091s != null) {
                            this.f60089q.mo32743a(this.f60091s);
                        }
                        setController(this.f60089q.mo32730f());
                        this.f60088p = false;
                    }
                }
            }
        }
    }

    public final void setFadeDuration(int i) {
        this.f60094v = i;
    }

    public final void setProgressiveRenderingEnabled(boolean z) {
        this.f60095w = z;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        mo59173a();
        super.onDraw(canvas);
    }

    public final void setBorderColor(int i) {
        this.f60083k = i;
        this.f60088p = true;
    }

    public final void setOverlayColor(int i) {
        this.f60084l = i;
        this.f60088p = true;
    }

    public final void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.f60079g = imageResizeMethod;
        this.f60088p = true;
    }

    public final void setScaleType(C13423b bVar) {
        this.f60077e = bVar;
        this.f60088p = true;
    }

    public final void setBorderRadius(float f) {
        if (!FloatUtil.floatsEqual(this.f60086n, f)) {
            this.f60086n = f;
            this.f60088p = true;
        }
    }

    public final void setBorderWidth(float f) {
        this.f60085m = PixelUtil.toPixelFromDIP(f);
        this.f60088p = true;
    }

    public final void setControllerListener(C13401d dVar) {
        this.f60092t = dVar;
        this.f60088p = true;
        mo59176b();
    }

    public final void setShouldPlay(boolean z) {
        if (this.f60096x != z) {
            this.f60096x = z;
            mo59173a();
            this.f60088p = true;
        }
    }

    /* renamed from: a */
    private static C13438a m74546a(Context context) {
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
        this.f60082j = bVar;
        this.f60088p = true;
    }

    /* renamed from: a */
    private boolean m74547a(ImageSource imageSource) {
        if (this.f60079g == ImageResizeMethod.AUTO) {
            if (C13337d.m39036d(imageSource.getUri()) || C13337d.m39035c(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (this.f60079g == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.f60091s = null;
        } else {
            final EventDispatcher eventDispatcher = ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.f60091s = new C13400c<C13648f>() {
                public final void onSubmit(String str, Object obj) {
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(C22550a.this.getId(), 4));
                }

                public final void onFailure(String str, Throwable th) {
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(C22550a.this.getId(), 1));
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(C22550a.this.getId(), 3));
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    C22550a.this.f60078f = animatable;
                    C22550a.this.mo59173a();
                    if (fVar != null && C22550a.this.f60076d != null) {
                        EventDispatcher eventDispatcher = eventDispatcher;
                        ImageLoadEvent imageLoadEvent = new ImageLoadEvent(C22550a.this.getId(), 2, C22550a.this.f60076d.getSource(), fVar.getWidth(), fVar.getHeight());
                        eventDispatcher.dispatchEvent(imageLoadEvent);
                        eventDispatcher.dispatchEvent(new ImageLoadEvent(C22550a.this.getId(), 3));
                    }
                }
            };
        }
        this.f60088p = true;
    }

    public final void setSource(ReadableArray readableArray) {
        this.f60080h.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                this.f60080h.add(new ImageSource(getContext(), readableArray.getMap(0).getString("uri")));
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    List<ImageSource> list = this.f60080h;
                    ImageSource imageSource = new ImageSource(getContext(), map.getString("uri"), map.getDouble("width"), map.getDouble("height"));
                    list.add(imageSource);
                }
            }
        }
        this.f60088p = true;
    }

    /* renamed from: a */
    public final void mo59175a(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!C14644a.m42350a(this.f60086n)) {
            f = this.f60086n;
        } else {
            f = 0.0f;
        }
        if (this.f60087o == null || C14644a.m42350a(this.f60087o[0])) {
            f2 = f;
        } else {
            f2 = this.f60087o[0];
        }
        fArr[0] = f2;
        if (this.f60087o == null || C14644a.m42350a(this.f60087o[1])) {
            f3 = f;
        } else {
            f3 = this.f60087o[1];
        }
        fArr[1] = f3;
        if (this.f60087o == null || C14644a.m42350a(this.f60087o[2])) {
            f4 = f;
        } else {
            f4 = this.f60087o[2];
        }
        fArr[2] = f4;
        if (this.f60087o != null && !C14644a.m42350a(this.f60087o[3])) {
            f = this.f60087o[3];
        }
        fArr[3] = f;
    }

    /* renamed from: a */
    public final void mo59174a(float f, int i) {
        if (this.f60087o == null) {
            this.f60087o = new float[4];
            Arrays.fill(this.f60087o, 1.0E21f);
        }
        if (!FloatUtil.floatsEqual(this.f60087o[i], f)) {
            this.f60087o[i] = f;
            this.f60088p = true;
        }
    }

    public C22550a(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        super(context, m74546a(context));
        this.f60089q = abstractDraweeControllerBuilder;
        this.f60090r = new C22552a();
        this.f60093u = obj;
        this.f60080h = new LinkedList();
        this.f60096x = true;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (this.f60088p || m74548c()) {
                z = true;
            } else {
                z = false;
            }
            this.f60088p = z;
            mo59176b();
        }
    }
}
