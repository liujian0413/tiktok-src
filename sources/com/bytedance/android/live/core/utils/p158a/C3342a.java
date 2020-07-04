package com.bytedance.android.live.core.utils.p158a;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.p698c.C13387b;
import com.facebook.drawee.view.C13445b;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.utils.a.a */
public final class C3342a {

    /* renamed from: A */
    private List<Drawable> f10119A = null;

    /* renamed from: B */
    private Drawable f10120B = null;

    /* renamed from: C */
    private boolean f10121C = false;

    /* renamed from: D */
    private boolean f10122D = false;

    /* renamed from: E */
    private boolean f10123E = false;

    /* renamed from: F */
    private boolean f10124F = false;

    /* renamed from: G */
    private boolean f10125G = false;

    /* renamed from: a */
    public C13445b<C13387b> f10126a = null;

    /* renamed from: b */
    private Context f10127b;

    /* renamed from: c */
    private boolean f10128c;

    /* renamed from: d */
    private C3344a f10129d = null;

    /* renamed from: e */
    private C13842b f10130e = null;

    /* renamed from: f */
    private C13401d f10131f = null;

    /* renamed from: g */
    private Uri f10132g;

    /* renamed from: h */
    private Uri f10133h;

    /* renamed from: i */
    private ImageModel f10134i;

    /* renamed from: j */
    private C13596d f10135j;

    /* renamed from: k */
    private float f10136k = 0.0f;

    /* renamed from: l */
    private boolean f10137l = true;

    /* renamed from: m */
    private int f10138m = C34943c.f91128x;

    /* renamed from: n */
    private Drawable f10139n = null;

    /* renamed from: o */
    private Drawable f10140o = null;

    /* renamed from: p */
    private Drawable f10141p = null;

    /* renamed from: q */
    private Drawable f10142q = null;

    /* renamed from: r */
    private Drawable f10143r = null;

    /* renamed from: s */
    private C13423b f10144s = C13439b.f35625a;

    /* renamed from: t */
    private C13423b f10145t = C13439b.f35625a;

    /* renamed from: u */
    private C13423b f10146u = C13439b.f35625a;

    /* renamed from: v */
    private C13423b f10147v = C13439b.f35625a;

    /* renamed from: w */
    private C13423b f10148w = C13439b.f35626b;

    /* renamed from: x */
    private PointF f10149x = null;

    /* renamed from: y */
    private ColorFilter f10150y = null;

    /* renamed from: z */
    private RoundingParams f10151z = null;

    /* renamed from: com.bytedance.android.live.core.utils.a.a$1 */
    static /* synthetic */ class C33431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10152a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10152a = r0
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.utils.p158a.C3342a.C33431.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.live.core.utils.a.a$a */
    class C3344a implements OnAttachStateChangeListener, OnTouchListener {
        private C3344a() {
        }

        public final void onViewAttachedToWindow(View view) {
            if (C3342a.this.f10126a != null) {
                C3342a.this.f10126a.mo32934b();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C3342a.this.f10126a != null) {
                C3342a.this.f10126a.mo32935c();
            }
        }

        /* synthetic */ C3344a(C3342a aVar, C33431 r2) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (C3342a.this.f10126a == null || !C3342a.this.f10126a.mo32933a(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final C3342a mo10259a(String str) {
        return m12470a(Uri.parse(str));
    }

    /* renamed from: a */
    public final C3342a mo10257a(ImageModel imageModel) {
        this.f10134i = imageModel;
        return this;
    }

    /* renamed from: a */
    public final C3342a mo10256a(ScaleType scaleType) {
        this.f10148w = m12471a(scaleType, C13439b.f35626b);
        return this;
    }

    /* renamed from: a */
    public final C3342a mo10255a(int i, int i2) {
        this.f10135j = new C13596d(i, i2);
        return this;
    }

    /* renamed from: a */
    public final C3342a mo10260a(boolean z) {
        this.f10122D = true;
        return this;
    }

    /* renamed from: a */
    public final C3342a mo10258a(C13401d dVar) {
        this.f10131f = dVar;
        return this;
    }

    /* renamed from: a */
    public final void mo10261a(ImageView imageView) {
        if (imageView != null) {
            if (this.f10132g != null || this.f10134i != null) {
                if (this.f10126a == null) {
                    Object a = C3353i.m12501a(imageView);
                    if (a instanceof C13445b) {
                        this.f10126a = (C13445b) a;
                    }
                }
                if (this.f10135j == null && imageView.getMeasuredWidth() > 0 && imageView.getMeasuredHeight() > 0) {
                    mo10255a(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
                }
                if (this.f10126a == null) {
                    this.f10126a = C13445b.m39493a(null, imageView.getContext());
                    if (this.f10129d == null) {
                        this.f10129d = new C3344a(this, null);
                    }
                    this.f10126a.mo32932a(new C13439b(imageView.getResources()).mo32913a(this.f10139n).mo32914a(this.f10144s).mo32921c(this.f10141p).mo32922c(this.f10146u).mo32924d(this.f10142q).mo32925d(this.f10147v).mo32918b(this.f10140o).mo32919b(this.f10145t).mo32910a(this.f10138m).mo32912a(this.f10149x).mo32911a(this.f10150y).mo32927e(this.f10148w).mo32926e(this.f10143r).mo32916a(this.f10119A).mo32929g(this.f10120B).mo32915a(this.f10151z).mo32908a());
                    ImageRequest[] a2 = m12474a(this.f10132g, this.f10134i, this.f10135j, this.f10130e);
                    if (a2 != null && a2.length != 0) {
                        C13382e eVar = (C13382e) ((C13382e) ((C13382e) ((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32751c(this.f10122D)).mo32743a(this.f10131f)).mo32729b(this.f10126a.f35652b)).mo32746a((REQUEST[]) a2)).mo32749b(this.f10123E)).mo32745a(this.f10121C);
                        if (this.f10133h != null) {
                            eVar.mo32750c(ImageRequest.fromUri(this.f10133h));
                        }
                        this.f10126a.mo32931a((C13386a) eVar.mo32730f());
                        if (this.f10128c) {
                            C3345b.m12486a(imageView, this.f10129d);
                        } else {
                            if (m12473a((View) imageView)) {
                                this.f10129d.onViewAttachedToWindow(imageView);
                            }
                            imageView.addOnAttachStateChangeListener(this.f10129d);
                        }
                        imageView.setOnTouchListener(this.f10129d);
                        C3353i.m12503a((View) imageView, (Object) this.f10126a);
                    } else {
                        return;
                    }
                } else {
                    this.f10126a.mo32935c();
                    this.f10126a.mo32932a(new C13439b(imageView.getResources()).mo32913a(this.f10139n).mo32914a(this.f10144s).mo32921c(this.f10141p).mo32922c(this.f10146u).mo32924d(this.f10142q).mo32925d(this.f10147v).mo32918b(this.f10140o).mo32919b(this.f10145t).mo32910a(this.f10138m).mo32912a(this.f10149x).mo32911a(this.f10150y).mo32927e(this.f10148w).mo32926e(this.f10143r).mo32916a(this.f10119A).mo32929g(this.f10120B).mo32915a(this.f10151z).mo32908a());
                    ImageRequest[] a3 = m12474a(this.f10132g, this.f10134i, this.f10135j, this.f10130e);
                    if (a3 != null && a3.length != 0) {
                        C13382e eVar2 = (C13382e) ((C13382e) ((C13382e) ((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32751c(this.f10122D)).mo32743a(this.f10131f)).mo32746a((REQUEST[]) a3)).mo32729b(this.f10126a.f35652b)).mo32749b(this.f10123E)).mo32745a(this.f10121C);
                        if (this.f10133h != null) {
                            eVar2.mo32750c(ImageRequest.fromUri(this.f10133h));
                        }
                        this.f10126a.mo32931a((C13386a) eVar2.mo32730f());
                        this.f10126a.mo32934b();
                    } else {
                        return;
                    }
                }
                if (this.f10136k != 0.0f) {
                    LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams != null) {
                        int i = layoutParams.width;
                        int i2 = layoutParams.height;
                        if (this.f10137l) {
                            if (i > 0 && i2 == 0) {
                                double d = (double) i;
                                Double.isNaN(d);
                                double d2 = d * 1.0d;
                                double d3 = (double) this.f10136k;
                                Double.isNaN(d3);
                                i2 = (int) ((d2 / d3) + 0.5d);
                                if (!(i == -1 || i2 == -1)) {
                                    layoutParams.width = i;
                                    layoutParams.height = i2;
                                    imageView.requestLayout();
                                }
                            }
                        } else if (i2 > 0 && i == 0) {
                            i = (int) ((((float) i2) * this.f10136k) + 0.5f);
                            layoutParams.width = i;
                            layoutParams.height = i2;
                            imageView.requestLayout();
                        }
                        i = -1;
                        i2 = -1;
                        layoutParams.width = i;
                        layoutParams.height = i2;
                        imageView.requestLayout();
                    }
                }
                imageView.setImageDrawable(this.f10126a.mo32938f());
            }
        }
    }

    /* renamed from: a */
    public final C3342a mo10252a() {
        if (this.f10151z == null) {
            this.f10151z = new RoundingParams();
        }
        this.f10151z.mo32884a(true);
        return this;
    }

    /* renamed from: a */
    private C3342a m12469a(Drawable drawable) {
        this.f10139n = drawable;
        return this;
    }

    /* renamed from: a */
    private C3342a m12470a(Uri uri) {
        this.f10132g = uri;
        return this;
    }

    /* renamed from: a */
    public static C3342a m12468a(Context context) {
        if (context != null) {
            return new C3342a(context);
        }
        throw new IllegalArgumentException("appContext == null");
    }

    /* renamed from: b */
    public final C3342a mo10262b(int i) {
        return m12469a(this.f10127b.getResources().getDrawable(i));
    }

    private C3342a(Context context) {
        this.f10127b = context.getApplicationContext();
    }

    /* renamed from: a */
    private static boolean m12473a(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        if (view.getWindowToken() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C3342a mo10253a(int i) {
        return m12470a(new Builder().scheme("res").path(String.valueOf(i)).build());
    }

    /* renamed from: a */
    private static ImageRequest m12472a(Uri uri, C13596d dVar) {
        if (uri == null) {
            return null;
        }
        ImageRequestBuilder a = ImageRequestBuilder.m40865a(uri);
        if (dVar != null) {
            a.mo33468a(dVar);
        }
        return a.mo33476b();
    }

    /* renamed from: a */
    private static C13423b m12471a(ScaleType scaleType, C13423b bVar) {
        switch (C33431.f10152a[scaleType.ordinal()]) {
            case 1:
                return C13423b.f35597e;
            case 2:
                return C13423b.f35599g;
            case 3:
                return C13423b.f35598f;
            case 4:
                return C13423b.f35595c;
            case 5:
                return C13423b.f35594b;
            case 6:
                return C13423b.f35596d;
            case 7:
                return C13423b.f35593a;
            case 8:
                return C13423b.f35600h;
            default:
                return bVar;
        }
    }

    /* renamed from: a */
    public final C3342a mo10254a(int i, float f) {
        if (this.f10151z == null) {
            this.f10151z = new RoundingParams();
        }
        this.f10151z.mo32882a(i, f);
        return this;
    }

    /* renamed from: a */
    private static ImageRequest[] m12474a(Uri uri, ImageModel imageModel, C13596d dVar, C13842b bVar) {
        if (uri == null && (imageModel == null || C6311g.m19573a(imageModel.getUrls()))) {
            return new ImageRequest[0];
        }
        ArrayList arrayList = new ArrayList();
        ImageRequest a = m12472a(uri, dVar);
        if (a != null) {
            arrayList.add(a);
        }
        if (imageModel != null && !C6311g.m19573a(imageModel.getUrls())) {
            C3347c cVar = new C3347c();
            for (String str : imageModel.getUrls()) {
                if (!C6319n.m19593a(str)) {
                    ImageRequestBuilder a2 = ImageRequestBuilder.m40865a(Uri.parse(str));
                    if (bVar != null) {
                        a2.mo33473a(bVar);
                    }
                    if (dVar != null) {
                        a2.mo33468a(dVar);
                    }
                    cVar.mo10269a(a2);
                    arrayList.add(a2.mo33476b());
                }
            }
        }
        if (arrayList.size() == 0) {
            return new ImageRequest[0];
        }
        return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
    }
}
