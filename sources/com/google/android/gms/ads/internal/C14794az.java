package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.p022v4.util.C0904k;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15606cq;
import com.google.android.gms.internal.ads.C15686fo;
import com.google.android.gms.internal.ads.C15690fs;
import com.google.android.gms.internal.ads.C15693fv;
import com.google.android.gms.internal.ads.C15696fy;
import com.google.android.gms.internal.ads.C15700gb;
import com.google.android.gms.internal.ads.C15703ge;
import com.google.android.gms.internal.ads.C15791jl;
import com.google.android.gms.internal.ads.C15833l;
import com.google.android.gms.internal.ads.C15914o;
import com.google.android.gms.internal.ads.C16076u;
import com.google.android.gms.internal.ads.C16187yd;
import com.google.android.gms.internal.ads.C16194yk;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.abl;
import com.google.android.gms.internal.ads.abx;
import com.google.android.gms.internal.ads.abz;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.adi;
import com.google.android.gms.internal.ads.aeq;
import com.google.android.gms.internal.ads.afb;
import com.google.android.gms.internal.ads.bdp;
import com.google.android.gms.internal.ads.bdt;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.byp;
import com.google.android.gms.internal.ads.bys;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzafl;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyz;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.az */
public final class C14794az implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: A */
    zzabp f38246A;

    /* renamed from: B */
    C15700gb f38247B;

    /* renamed from: C */
    List<Integer> f38248C;

    /* renamed from: D */
    C15606cq f38249D;

    /* renamed from: E */
    C16194yk f38250E;

    /* renamed from: F */
    C16187yd f38251F;

    /* renamed from: G */
    public String f38252G;

    /* renamed from: H */
    public String f38253H;

    /* renamed from: I */
    List<String> f38254I;

    /* renamed from: J */
    public abx f38255J;

    /* renamed from: K */
    View f38256K;

    /* renamed from: L */
    public int f38257L;

    /* renamed from: M */
    boolean f38258M;

    /* renamed from: N */
    public HashSet<abl> f38259N;

    /* renamed from: O */
    private int f38260O;

    /* renamed from: P */
    private int f38261P;

    /* renamed from: Q */
    private aeq f38262Q;

    /* renamed from: R */
    private boolean f38263R;

    /* renamed from: S */
    private boolean f38264S;

    /* renamed from: T */
    private boolean f38265T;

    /* renamed from: a */
    final String f38266a;

    /* renamed from: b */
    public String f38267b;

    /* renamed from: c */
    public final Context f38268c;

    /* renamed from: d */
    final bdt f38269d;

    /* renamed from: e */
    public final zzbgz f38270e;

    /* renamed from: f */
    C14796ba f38271f;

    /* renamed from: g */
    public abz f38272g;

    /* renamed from: h */
    public adi f38273h;

    /* renamed from: i */
    public zzyz f38274i;

    /* renamed from: j */
    public abj f38275j;

    /* renamed from: k */
    public abk f38276k;

    /* renamed from: l */
    public abl f38277l;

    /* renamed from: m */
    byp f38278m;

    /* renamed from: n */
    bys f38279n;

    /* renamed from: o */
    C15914o f38280o;

    /* renamed from: p */
    C15833l f38281p;

    /* renamed from: q */
    C16076u f38282q;

    /* renamed from: r */
    C15686fo f38283r;

    /* renamed from: s */
    C15690fs f38284s;

    /* renamed from: t */
    C15703ge f38285t;

    /* renamed from: u */
    C15791jl f38286u;

    /* renamed from: v */
    C0904k<String, C15693fv> f38287v;

    /* renamed from: w */
    C0904k<String, C15696fy> f38288w;

    /* renamed from: x */
    zzafl f38289x;

    /* renamed from: y */
    zzacq f38290y;

    /* renamed from: z */
    zzaks f38291z;

    public C14794az(Context context, zzyz zzyz, String str, zzbgz zzbgz) {
        this(context, zzyz, str, zzbgz, null);
    }

    private C14794az(Context context, zzyz zzyz, String str, zzbgz zzbgz, bdt bdt) {
        this.f38260O = -1;
        this.f38261P = -1;
        this.f38263R = true;
        this.f38264S = true;
        C15585bw.m50188a(context);
        if (C14793ay.m42898d().mo39086a() != null) {
            List b = C15585bw.m50190b();
            if (zzbgz.f45678b != 0) {
                b.add(Integer.toString(zzbgz.f45678b));
            }
            C14793ay.m42898d().mo39086a().mo41448a(b);
        }
        this.f38266a = UUID.randomUUID().toString();
        if (zzyz.f45801d || zzyz.f45805h) {
            this.f38271f = null;
        } else {
            C14796ba baVar = new C14796ba(context, str, zzbgz.f45677a, this, this);
            this.f38271f = baVar;
            this.f38271f.setMinimumWidth(zzyz.f45803f);
            this.f38271f.setMinimumHeight(zzyz.f45800c);
            this.f38271f.setVisibility(4);
        }
        this.f38274i = zzyz;
        this.f38267b = str;
        this.f38268c = context;
        this.f38270e = zzbgz;
        this.f38269d = new bdt(new C14827i(this));
        this.f38262Q = new aeq(200);
        this.f38288w = new C0904k<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo37699a(View view) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43854bv)).booleanValue()) {
            bdp bdp = this.f38269d.f41732a;
            if (bdp != null) {
                bdp.mo37778a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo37698a() {
        if (this.f38275j != null && this.f38275j.f39862b != null) {
            this.f38275j.f39862b.destroy();
        }
    }

    /* renamed from: b */
    public final void mo37701b() {
        if (!(this.f38275j == null || this.f38275j.f39876p == null)) {
            try {
                this.f38275j.f39876p.mo41831c();
            } catch (RemoteException unused) {
                acd.m45783e("Could not destroy mediation adapter.");
            }
        }
    }

    /* renamed from: c */
    public final boolean mo37702c() {
        return this.f38257L == 0;
    }

    /* renamed from: d */
    public final boolean mo37703d() {
        return this.f38257L == 1;
    }

    public final void onGlobalLayout() {
        m42914b(false);
    }

    public final void onScrollChanged() {
        m42914b(true);
        this.f38265T = true;
    }

    /* renamed from: b */
    private final void m42914b(boolean z) {
        if (this.f38271f != null && this.f38275j != null && this.f38275j.f39862b != null && this.f38275j.f39862b.mo39761w() != null) {
            if (!z || this.f38262Q.mo39263a()) {
                if (this.f38275j.f39862b.mo39761w().mo39782b()) {
                    int[] iArr = new int[2];
                    this.f38271f.getLocationOnScreen(iArr);
                    int b = afb.m45731b(this.f38268c, iArr[0]);
                    int b2 = afb.m45731b(this.f38268c, iArr[1]);
                    if (!(b == this.f38260O && b2 == this.f38261P)) {
                        this.f38260O = b;
                        this.f38261P = b2;
                        this.f38275j.f39862b.mo39761w().mo39768a(this.f38260O, this.f38261P, !z);
                    }
                }
                if (this.f38271f != null) {
                    View findViewById = this.f38271f.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        this.f38271f.getGlobalVisibleRect(rect);
                        findViewById.getGlobalVisibleRect(rect2);
                        if (rect.top != rect2.top) {
                            this.f38263R = false;
                        }
                        if (rect.bottom != rect2.bottom) {
                            this.f38264S = false;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final String mo37704e() {
        if (this.f38263R && this.f38264S) {
            return "";
        }
        if (this.f38263R) {
            return this.f38265T ? "top-scrollable" : "top-locked";
        }
        if (this.f38264S) {
            return this.f38265T ? "bottom-scrollable" : "bottom-locked";
        }
        return "";
    }

    /* renamed from: a */
    public final void mo37700a(boolean z) {
        if (!(this.f38257L != 0 || this.f38275j == null || this.f38275j.f39862b == null)) {
            this.f38275j.f39862b.stopLoading();
        }
        if (this.f38272g != null) {
            this.f38272g.mo39127b();
        }
        if (this.f38273h != null) {
            this.f38273h.mo39127b();
        }
        if (z) {
            this.f38275j = null;
        }
    }
}
