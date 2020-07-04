package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C15137e;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15325h;
import com.google.android.gms.internal.measurement.C16526fh;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ay */
public class C16825ay implements C16850bw {

    /* renamed from: i */
    private static volatile C16825ay f46997i;

    /* renamed from: A */
    private long f46998A;

    /* renamed from: B */
    private volatile Boolean f46999B;

    /* renamed from: C */
    private Boolean f47000C;

    /* renamed from: D */
    private Boolean f47001D;

    /* renamed from: E */
    private int f47002E;

    /* renamed from: F */
    private AtomicInteger f47003F = new AtomicInteger(0);

    /* renamed from: G */
    private final long f47004G;

    /* renamed from: a */
    public final String f47005a;

    /* renamed from: b */
    public final String f47006b;

    /* renamed from: c */
    public final String f47007c;

    /* renamed from: d */
    public final boolean f47008d;

    /* renamed from: e */
    public final C16930eu f47009e;

    /* renamed from: f */
    public final C16820at f47010f;

    /* renamed from: g */
    public final AppMeasurement f47011g;

    /* renamed from: h */
    public C16812al f47012h;

    /* renamed from: j */
    private final Context f47013j;

    /* renamed from: k */
    private final C16928es f47014k;

    /* renamed from: l */
    private final C16806af f47015l;

    /* renamed from: m */
    private final C16953r f47016m;

    /* renamed from: n */
    private final C16900ds f47017n;

    /* renamed from: o */
    private final C16922em f47018o;

    /* renamed from: p */
    private final C16951p f47019p;

    /* renamed from: q */
    private final C15322e f47020q;

    /* renamed from: r */
    private final C16871cq f47021r;

    /* renamed from: s */
    private final C16858cd f47022s;

    /* renamed from: t */
    private final C16800a f47023t;

    /* renamed from: u */
    private C16949n f47024u;

    /* renamed from: v */
    private C16875cu f47025v;

    /* renamed from: w */
    private C16827b f47026w;

    /* renamed from: x */
    private C16947l f47027x;

    /* renamed from: y */
    private boolean f47028y;

    /* renamed from: z */
    private Boolean f47029z;

    private C16825ay(C16856cb cbVar) {
        C15267r.m44384a(cbVar);
        this.f47014k = new C16928es(cbVar.f47109a);
        C16942h.m56210a(this.f47014k);
        this.f47013j = cbVar.f47109a;
        this.f47005a = cbVar.f47110b;
        this.f47006b = cbVar.f47111c;
        this.f47007c = cbVar.f47112d;
        this.f47008d = cbVar.f47113e;
        this.f46999B = cbVar.f47114f;
        C16948m mVar = cbVar.f47115g;
        if (!(mVar == null || mVar.f47480g == null)) {
            Object obj = mVar.f47480g.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f47000C = (Boolean) obj;
            }
            Object obj2 = mVar.f47480g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f47001D = (Boolean) obj2;
            }
        }
        C16526fh.m53855a(this.f47013j);
        this.f47020q = C15325h.m44574d();
        this.f47004G = this.f47020q.mo38684a();
        this.f47009e = new C16930eu(this);
        C16806af afVar = new C16806af(this);
        afVar.mo43719y();
        this.f47015l = afVar;
        C16953r rVar = new C16953r(this);
        rVar.mo43719y();
        this.f47016m = rVar;
        C16922em emVar = new C16922em(this);
        emVar.mo43719y();
        this.f47018o = emVar;
        C16951p pVar = new C16951p(this);
        pVar.mo43719y();
        this.f47019p = pVar;
        this.f47023t = new C16800a(this);
        C16871cq cqVar = new C16871cq(this);
        cqVar.mo43822C();
        this.f47021r = cqVar;
        C16858cd cdVar = new C16858cd(this);
        cdVar.mo43822C();
        this.f47022s = cdVar;
        this.f47011g = new AppMeasurement(this);
        C16900ds dsVar = new C16900ds(this);
        dsVar.mo43822C();
        this.f47017n = dsVar;
        C16820at atVar = new C16820at(this);
        atVar.mo43719y();
        this.f47010f = atVar;
        if (this.f47013j.getApplicationContext() instanceof Application) {
            C16858cd e = mo43661e();
            if (e.mo43581m().getApplicationContext() instanceof Application) {
                Application application = (Application) e.mo43581m().getApplicationContext();
                if (e.f47118a == null) {
                    e.f47118a = new C16867cm(e, null);
                }
                application.unregisterActivityLifecycleCallbacks(e.f47118a);
                application.registerActivityLifecycleCallbacks(e.f47118a);
                e.mo43585q().f47495i.mo44160a("Registered activity lifecycle callback");
            }
        } else {
            mo43585q().f47490d.mo44160a("Application context is not an Application");
        }
        this.f47010f.mo43645a((Runnable) new C16826az(this, cbVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m55500a(C16856cb cbVar) {
        String str;
        C16955t tVar;
        mo43584p().mo43571c();
        C16930eu.m56087d();
        C16827b bVar = new C16827b(this);
        bVar.mo43719y();
        this.f47026w = bVar;
        C16947l lVar = new C16947l(this);
        lVar.mo43822C();
        this.f47027x = lVar;
        C16949n nVar = new C16949n(this);
        nVar.mo43822C();
        this.f47024u = nVar;
        C16875cu cuVar = new C16875cu(this);
        cuVar.mo43822C();
        this.f47025v = cuVar;
        this.f47018o.mo43720z();
        this.f47015l.mo43720z();
        this.f47012h = new C16812al(this);
        this.f47027x.mo43823D();
        mo43585q().f47493g.mo44161a("App measurement is starting up, version", Long.valueOf(14710));
        mo43585q().f47493g.mo44160a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String v = lVar.mo44135v();
        if (TextUtils.isEmpty(this.f47005a)) {
            if (mo43662f().mo43913f(v)) {
                tVar = mo43585q().f47493g;
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                tVar = mo43585q().f47493g;
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(v);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            tVar.mo44160a(str);
        }
        mo43585q().f47494h.mo44160a("Debug-level message logging enabled");
        if (this.f47002E != this.f47003F.get()) {
            mo43585q().f47487a.mo44162a("Not all components initialized", Integer.valueOf(this.f47002E), Integer.valueOf(this.f47003F.get()));
        }
        this.f47028y = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43654a() {
        mo43584p().mo43571c();
        if (mo43658b().f46917c.mo43614a() == 0) {
            mo43658b().f46917c.mo43615a(this.f47020q.mo38684a());
        }
        if (Long.valueOf(mo43658b().f46922h.mo43614a()).longValue() == 0) {
            mo43585q().f47495i.mo44161a("Persisting first open", Long.valueOf(this.f47004G));
            mo43658b().f46922h.mo43615a(this.f47004G);
        }
        if (mo43676x()) {
            if (!TextUtils.isEmpty(mo43669o().mo44136w()) || !TextUtils.isEmpty(mo43669o().mo44137x())) {
                mo43662f();
                if (C16922em.m55965a(mo43669o().mo44136w(), mo43658b().mo43604f(), mo43669o().mo44137x(), mo43658b().mo43605g())) {
                    mo43585q().f47493g.mo44160a("Rechecking which service to use due to a GMP App Id change");
                    mo43658b().mo43607i();
                    mo43664h().mo44144v();
                    this.f47025v.mo43786z();
                    this.f47025v.mo43785y();
                    mo43658b().f46922h.mo43615a(this.f47004G);
                    mo43658b().f46924j.mo43619a(null);
                }
                mo43658b().mo43599c(mo43669o().mo44136w());
                mo43658b().mo43601d(mo43669o().mo44137x());
                if (this.f47009e.mo44072r(mo43669o().mo44135v())) {
                    this.f47017n.mo43827a(this.f47004G);
                }
            }
            mo43661e().mo43729a(mo43658b().f46924j.mo43618a());
            if (!TextUtils.isEmpty(mo43669o().mo44136w()) || !TextUtils.isEmpty(mo43669o().mo44137x())) {
                boolean t = mo43672t();
                if (!mo43658b().mo43611v() && !this.f47009e.mo44057f()) {
                    mo43658b().mo43600c(!t);
                }
                if (!this.f47009e.mo44064j(mo43669o().mo44135v()) || t) {
                    mo43661e().mo43742w();
                }
                mo43667k().mo43779a(new AtomicReference<>());
            }
        } else if (mo43672t()) {
            if (!mo43662f().mo43911d("android.permission.INTERNET")) {
                mo43585q().f47487a.mo44160a("App is missing INTERNET permission");
            }
            if (!mo43662f().mo43911d("android.permission.ACCESS_NETWORK_STATE")) {
                mo43585q().f47487a.mo44160a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C15176d.m44159a(this.f47013j).mo38464a() && !this.f47009e.mo44075u()) {
                if (!C16815ao.m55432a(this.f47013j)) {
                    mo43585q().f47487a.mo44160a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C16922em.m55960a(this.f47013j, false)) {
                    mo43585q().f47487a.mo44160a("AppMeasurementService not registered/enabled");
                }
            }
            mo43585q().f47487a.mo44160a("Uploading is not possible. App measurement disabled");
        }
    }

    /* renamed from: b */
    public final C16806af mo43658b() {
        m55499a((C16848bu) this.f47015l);
        return this.f47015l;
    }

    /* renamed from: q */
    public final C16953r mo43585q() {
        m55501b((C16849bv) this.f47016m);
        return this.f47016m;
    }

    /* renamed from: c */
    public final C16953r mo43659c() {
        if (this.f47016m == null || !this.f47016m.mo43717w()) {
            return null;
        }
        return this.f47016m;
    }

    /* renamed from: p */
    public final C16820at mo43584p() {
        m55501b((C16849bv) this.f47010f);
        return this.f47010f;
    }

    /* renamed from: d */
    public final C16900ds mo43660d() {
        m55502b((C16896do) this.f47017n);
        return this.f47017n;
    }

    /* renamed from: e */
    public final C16858cd mo43661e() {
        m55502b((C16896do) this.f47022s);
        return this.f47022s;
    }

    /* renamed from: f */
    public final C16922em mo43662f() {
        m55499a((C16848bu) this.f47018o);
        return this.f47018o;
    }

    /* renamed from: g */
    public final C16951p mo43663g() {
        m55499a((C16848bu) this.f47019p);
        return this.f47019p;
    }

    /* renamed from: h */
    public final C16949n mo43664h() {
        m55502b((C16896do) this.f47024u);
        return this.f47024u;
    }

    /* renamed from: m */
    public final Context mo43581m() {
        return this.f47013j;
    }

    /* renamed from: i */
    public final boolean mo43665i() {
        return TextUtils.isEmpty(this.f47005a);
    }

    /* renamed from: l */
    public final C15322e mo43580l() {
        return this.f47020q;
    }

    /* renamed from: j */
    public final C16871cq mo43666j() {
        m55502b((C16896do) this.f47021r);
        return this.f47021r;
    }

    /* renamed from: k */
    public final C16875cu mo43667k() {
        m55502b((C16896do) this.f47025v);
        return this.f47025v;
    }

    /* renamed from: n */
    public final C16827b mo43668n() {
        m55501b((C16849bv) this.f47026w);
        return this.f47026w;
    }

    /* renamed from: o */
    public final C16947l mo43669o() {
        m55502b((C16896do) this.f47027x);
        return this.f47027x;
    }

    /* renamed from: r */
    public final C16800a mo43670r() {
        if (this.f47023t != null) {
            return this.f47023t;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: a */
    public static C16825ay m55497a(Context context, C16948m mVar) {
        if (mVar != null && (mVar.f47478e == null || mVar.f47479f == null)) {
            C16948m mVar2 = new C16948m(mVar.f47474a, mVar.f47475b, mVar.f47476c, mVar.f47477d, null, null, mVar.f47480g);
            mVar = mVar2;
        }
        C15267r.m44384a(context);
        C15267r.m44384a(context.getApplicationContext());
        if (f46997i == null) {
            synchronized (C16825ay.class) {
                if (f46997i == null) {
                    f46997i = new C16825ay(new C16856cb(context, mVar));
                }
            }
        } else if (!(mVar == null || mVar.f47480g == null || !mVar.f47480g.containsKey("dataCollectionDefaultEnabled"))) {
            f46997i.mo43657a(mVar.f47480g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f46997i;
    }

    /* renamed from: y */
    private final void m55503y() {
        if (!this.f47028y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: b */
    private static void m55501b(C16849bv bvVar) {
        if (bvVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!bvVar.mo43717w()) {
            String valueOf = String.valueOf(bvVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m55502b(C16896do doVar) {
        if (doVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!doVar.mo43820A()) {
            String valueOf = String.valueOf(doVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m55499a(C16848bu buVar) {
        if (buVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43657a(boolean z) {
        this.f46999B = Boolean.valueOf(z);
    }

    /* renamed from: s */
    public final boolean mo43671s() {
        return this.f46999B != null && this.f46999B.booleanValue();
    }

    /* renamed from: t */
    public final boolean mo43672t() {
        boolean z;
        mo43584p().mo43571c();
        m55503y();
        if (this.f47009e.mo44048a(C16942h.f47424aq)) {
            if (this.f47009e.mo44057f()) {
                return false;
            }
            if (this.f47001D != null && this.f47001D.booleanValue()) {
                return false;
            }
            Boolean j = mo43658b().mo43608j();
            if (j != null) {
                return j.booleanValue();
            }
            Boolean g = this.f47009e.mo44059g();
            if (g != null) {
                return g.booleanValue();
            }
            if (this.f47000C != null) {
                return this.f47000C.booleanValue();
            }
            if (C15137e.m44038b()) {
                return false;
            }
            if (!this.f47009e.mo44048a(C16942h.f47420am) || this.f46999B == null) {
                return true;
            }
            return this.f46999B.booleanValue();
        } else if (this.f47009e.mo44057f()) {
            return false;
        } else {
            Boolean g2 = this.f47009e.mo44059g();
            if (g2 != null) {
                z = g2.booleanValue();
            } else {
                z = !C15137e.m44038b();
                if (z && this.f46999B != null && ((Boolean) C16942h.f47420am.mo44132a()).booleanValue()) {
                    z = this.f46999B.booleanValue();
                }
            }
            return mo43658b().mo43598b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final long mo43673u() {
        Long valueOf = Long.valueOf(mo43658b().f46922h.mo43614a());
        if (valueOf.longValue() == 0) {
            return this.f47004G;
        }
        return Math.min(this.f47004G, valueOf.longValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final void mo43674v() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43655a(C16849bv bvVar) {
        this.f47002E++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43656a(C16896do doVar) {
        this.f47002E++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo43675w() {
        this.f47003F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo43676x() {
        m55503y();
        mo43584p().mo43571c();
        if (this.f47029z == null || this.f46998A == 0 || (this.f47029z != null && !this.f47029z.booleanValue() && Math.abs(this.f47020q.mo38685b() - this.f46998A) > 1000)) {
            this.f46998A = this.f47020q.mo38685b();
            boolean z = true;
            this.f47029z = Boolean.valueOf(mo43662f().mo43911d("android.permission.INTERNET") && mo43662f().mo43911d("android.permission.ACCESS_NETWORK_STATE") && (C15176d.m44159a(this.f47013j).mo38464a() || this.f47009e.mo44075u() || (C16815ao.m55432a(this.f47013j) && C16922em.m55960a(this.f47013j, false))));
            if (this.f47029z.booleanValue()) {
                if (!mo43662f().mo43909b(mo43669o().mo44136w(), mo43669o().mo44137x()) && TextUtils.isEmpty(mo43669o().mo44137x())) {
                    z = false;
                }
                this.f47029z = Boolean.valueOf(z);
            }
        }
        return this.f47029z.booleanValue();
    }
}
