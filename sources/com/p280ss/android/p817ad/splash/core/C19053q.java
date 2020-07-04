package com.p280ss.android.p817ad.splash.core;

import com.p280ss.android.p817ad.splash.C19119f;
import com.p280ss.android.p817ad.splash.C19149k;
import com.p280ss.android.p817ad.splash.C19151m;
import com.p280ss.android.p817ad.splash.C19152n;
import com.p280ss.android.p817ad.splash.C19153o;
import com.p280ss.android.p817ad.splash.C19154p;
import com.p280ss.android.p817ad.splash.C19157r;
import com.p280ss.android.p817ad.splash.C19158s;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p829d.C19016a;
import com.p280ss.android.p817ad.splash.core.p831f.C19030a;
import com.p280ss.android.p817ad.splash.core.p831f.C19031b;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.p817ad.splash.p825c.C18958a;
import com.p280ss.android.p817ad.splash.p833d.C19111b;
import com.p280ss.android.p817ad.splash.p836g.C19127f;
import com.p280ss.android.p817ad.splash.p836g.C19134l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.q */
public class C19053q implements C19149k, C19151m, C19157r {

    /* renamed from: b */
    private static volatile C19053q f51484b;

    /* renamed from: a */
    public boolean f51485a;

    private C19053q() {
    }

    /* renamed from: a */
    public final void mo50567a() {
        C19025f.m62141b(System.currentTimeMillis());
        C19111b.m62633a().mo50818b();
        C19025f.m62163g();
    }

    /* renamed from: h */
    public final boolean mo50588h() {
        return C19048m.m62245a().f51476d;
    }

    /* renamed from: d */
    public final C19152n mo50577d() {
        m62299k();
        return new C19054r();
    }

    /* renamed from: f */
    public final C18958a mo50582f() {
        return C19022e.m62080a().mo50516b();
    }

    /* renamed from: g */
    public final int mo50585g() {
        return C19062u.m62368a().mo50637r();
    }

    /* renamed from: i */
    public static C19053q m62298i() {
        if (f51484b == null) {
            synchronized (C19053q.class) {
                if (f51484b == null) {
                    f51484b = new C19053q();
                }
            }
        }
        return f51484b;
    }

    /* renamed from: c */
    public final void mo50575c() {
        C19055s.m62339a().mo50593b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo50589j() {
        boolean z = false;
        if (!C19025f.m62136ae()) {
            return false;
        }
        if (!C19025f.m62172i()) {
            C18949a.m61865a().mo50362a("service_load_local_status_monitor", 1, (JSONObject) null);
        } else {
            z = true;
        }
        m62299k();
        return z;
    }

    /* renamed from: b */
    public final void mo50571b() {
        C19025f.m62114a(System.currentTimeMillis());
        for (WeakReference weakReference : C19015d.m62074a()) {
            C19041g gVar = (C19041g) weakReference.get();
            if (gVar != null) {
                gVar.mo50410c();
            }
        }
        C19063v.m62414a().mo50643a(-1);
        C19025f.m62166g(false);
        C19025f.m62129a((Future) null);
        C19025f.m62170i(-1);
    }

    /* renamed from: e */
    public final boolean mo50581e() {
        if (!mo50589j()) {
            return false;
        }
        boolean z = true;
        C19001b a = C19048m.m62245a().mo50544a(true);
        C19063v.m62414a().mo50650f();
        if (a == null || !a.mo50476a()) {
            z = false;
        }
        if (z) {
            C19022e.m62080a().mo50515a(a);
        } else {
            C19046l.m62236a().mo50541b();
            C19016a.m62076a();
        }
        C19025f.m62166g(false);
        return z;
    }

    /* renamed from: k */
    private static void m62299k() {
        int i = 0;
        try {
            if (C19025f.m62192w() == null) {
                i = 1;
                if (C19025f.m62158e()) {
                    C19134l.m62742a("SplashNetWork为空！ 请在SplashAdManager中设置！");
                }
            }
            if (C19025f.m62195z() == null) {
                i = 2;
                if (C19025f.m62158e()) {
                    C19134l.m62742a("EventListener为空！ 请在SplashAdManager中设置！");
                }
            }
            if (C19025f.m62194y() == null) {
                i = 3;
                if (C19025f.m62158e()) {
                    C19134l.m62742a("SplashAdResourceLoader为空！ 请在SplashAdManager中设置！");
                }
            }
            if (C19025f.m62193x() == null && C19025f.m62158e()) {
                C19134l.m62742a("SplashAdPlatformSupportCallback为空！ 请在SplashAdManager中设置！");
            }
            if (i > 0) {
                C18949a.m61865a().mo50362a("service_sdk_engine_invalidate", i, (JSONObject) null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C19151m mo50559a(C19119f fVar) {
        C19025f.m62121a(fVar);
        return this;
    }

    /* renamed from: b */
    public final C19151m mo50568b(long j) {
        C19025f.m62161f(j);
        return this;
    }

    /* renamed from: c */
    public final C19151m mo50572c(long j) {
        C19025f.m62165g(j);
        return this;
    }

    /* renamed from: e */
    public final C19151m mo50579e(boolean z) {
        C19025f.m62174j(z);
        return this;
    }

    /* renamed from: g */
    public final C19157r mo50586g(int i) {
        C19025f.m62164g(i);
        return this;
    }

    /* renamed from: h */
    public final C19157r mo50587h(int i) {
        C19025f.m62168h(i);
        return this;
    }

    /* renamed from: a */
    public final C19151m mo50557a(int i) {
        C19127f.m62683a(2);
        return this;
    }

    /* renamed from: b */
    public final C19151m mo50569b(boolean z) {
        C19025f.m62154d(false);
        return this;
    }

    /* renamed from: c */
    public final C19151m mo50573c(boolean z) {
        C19025f.m62162f(z);
        return this;
    }

    /* renamed from: d */
    public final C19151m mo50576d(boolean z) {
        C19025f.m62171i(true);
        return this;
    }

    /* renamed from: e */
    public final C19157r mo50580e(int i) {
        C19025f.m62151d((int) R.drawable.bju);
        return this;
    }

    /* renamed from: f */
    public final C19151m mo50583f(boolean z) {
        C19025f.m62176k(true);
        return this;
    }

    /* renamed from: a */
    public final C19151m mo50558a(long j) {
        if (j <= 86400000) {
            j = 86400000;
        }
        C19025f.m62156e(j);
        return this;
    }

    /* renamed from: b */
    public final C19157r mo50570b(int i) {
        C19025f.m62160f((int) R.style.m_);
        return this;
    }

    /* renamed from: c */
    public final C19157r mo50574c(int i) {
        C19025f.m62155e((int) R.drawable.bjt);
        return this;
    }

    /* renamed from: a */
    public final C19151m mo50560a(C19153o oVar) {
        if (oVar != null) {
            C19025f.m62122a(oVar);
        }
        return this;
    }

    /* renamed from: d */
    public final C19157r mo50578d(int i) {
        C19025f.m62145c((int) R.string.dwl);
        return this;
    }

    /* renamed from: f */
    public final C19157r mo50584f(int i) {
        C19025f.m62113a((int) R.string.dwk);
        return this;
    }

    /* renamed from: a */
    public final C19151m mo50561a(C19154p pVar) {
        C19025f.m62123a(pVar);
        return this;
    }

    /* renamed from: a */
    public final C19151m mo50562a(C19158s sVar) {
        C19025f.m62124a(sVar);
        C19030a G = C19025f.m62093G();
        if (G instanceof C19031b) {
            ((C19031b) G).mo50527a();
        }
        return this;
    }

    /* renamed from: a */
    public final C19151m mo50565a(boolean z) {
        C19025f.m62143b(z);
        return this;
    }

    /* renamed from: a */
    public final C19151m mo50563a(String str, boolean z) {
        C19025f.m62125a(str);
        C19025f.m62130a(true);
        return this;
    }

    /* renamed from: a */
    public final C19157r mo50566a(boolean z, int i) {
        C19025f.m62147c(z);
        C19025f.m62140b(0);
        return this;
    }

    /* renamed from: a */
    public final C19151m mo50564a(JSONArray jSONArray, boolean z, int i) {
        C19048m.m62252a(jSONArray, false, i);
        return this;
    }
}
