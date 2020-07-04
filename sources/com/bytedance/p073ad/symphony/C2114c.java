package com.bytedance.p073ad.symphony;

import android.content.Context;
import com.bytedance.p073ad.symphony.C2078a.C2080a;
import com.bytedance.p073ad.symphony.p076b.p077a.C2105c;
import com.bytedance.p073ad.symphony.p076b.p077a.C2106d;
import com.bytedance.p073ad.symphony.p076b.p077a.C2107e;
import com.bytedance.p073ad.symphony.p076b.p077a.C2108f;
import com.bytedance.p073ad.symphony.p076b.p077a.C2109g;
import com.bytedance.p073ad.symphony.p076b.p077a.C2110h;
import com.bytedance.p073ad.symphony.p078c.C2129h;
import com.bytedance.p073ad.symphony.p079d.C2138d;
import com.bytedance.p073ad.symphony.p081e.p082a.C2147f;
import com.bytedance.p073ad.symphony.p083f.C2153b;
import com.bytedance.p073ad.symphony.p083f.C2154c;
import com.bytedance.p073ad.symphony.util.C2199b;
import com.bytedance.p073ad.symphony.util.C2204g;

/* renamed from: com.bytedance.ad.symphony.c */
public class C2114c {

    /* renamed from: f */
    private static volatile C2114c f7218f = null;

    /* renamed from: g */
    private static boolean f7219g = false;

    /* renamed from: h */
    private static boolean f7220h = true;

    /* renamed from: i */
    private static C2138d f7221i;

    /* renamed from: a */
    public Context f7222a;

    /* renamed from: b */
    public C2154c f7223b;

    /* renamed from: c */
    public C2109g f7224c;

    /* renamed from: d */
    public C2107e f7225d;

    /* renamed from: e */
    public C2105c f7226e;

    /* renamed from: b */
    public static boolean m9317b() {
        return f7219g;
    }

    /* renamed from: c */
    public static boolean m9318c() {
        return f7220h;
    }

    /* renamed from: d */
    private void m9319d() {
        C2199b.m9504a((Runnable) new Runnable() {
            public final void run() {
                C2114c.this.mo7808a(C2078a.m9173a(C2114c.this.f7222a).mo7744a());
                C2078a.m9173a(C2114c.this.f7222a).mo7745a(C2114c.this.f7223b);
            }
        });
    }

    /* renamed from: a */
    public static C2114c m9313a() {
        if (f7218f == null) {
            if (!m9317b()) {
                m9320e();
            } else {
                throw new IllegalStateException("instance is null");
            }
        }
        return f7218f;
    }

    /* renamed from: e */
    private static void m9320e() {
        if (f7218f == null) {
            synchronized (C2114c.class) {
                if (f7218f == null) {
                    if (SymphonyContentProvider.f7152a != null) {
                        f7218f = new C2114c(new C2131d(SymphonyContentProvider.f7152a, new C2153b()));
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
                m9315a((Exception) new IllegalStateException("create fake symphony instance"));
            }
        }
    }

    /* renamed from: a */
    public static void m9316a(boolean z) {
        f7220h = false;
    }

    /* renamed from: a */
    private static void m9315a(Exception exc) {
        if (f7221i != null) {
            f7221i.mo7822a(exc);
        }
        exc.getMessage();
    }

    /* renamed from: a */
    public static void m9314a(C2131d dVar) {
        if (dVar != null) {
            synchronized (C2114c.class) {
                if (f7218f == null) {
                    f7218f = new C2114c(dVar);
                } else if (m9317b()) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
            }
        } else {
            throw new IllegalArgumentException("AdSymphonyOptions must not be null");
        }
    }

    private C2114c(C2131d dVar) {
        this.f7222a = dVar.f7258b.getApplicationContext();
        f7221i = dVar.f7267k;
        C2140e.m9357a(dVar.f7267k);
        if (dVar.f7257a != null) {
            C2199b.m9505a(dVar.f7257a);
        }
        boolean z = dVar.f7260d;
        f7219g = z;
        if (z) {
            C2204g.m9516a(3);
        }
        this.f7223b = dVar.f7259c;
        if (dVar.f7261e != null) {
            C2129h.m9339a(dVar.f7261e);
        }
        if (dVar.f7262f != null) {
            C2129h.m9338a(dVar.f7262f);
        }
        C2110h hVar = dVar.f7263g;
        if (hVar == null) {
            hVar = new C2110h(dVar.f7258b);
        }
        this.f7224c = new C2109g(hVar);
        C2108f fVar = dVar.f7264h;
        if (fVar == null) {
            fVar = new C2108f(dVar.f7258b);
        }
        this.f7225d = new C2107e(fVar);
        C2106d dVar2 = dVar.f7265i;
        if (dVar2 == null) {
            dVar2 = new C2106d(dVar.f7258b);
        }
        this.f7226e = new C2105c(dVar2);
        C2140e.m9359a(dVar.f7266j);
        m9319d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7808a(C2080a aVar) {
        if (aVar != null) {
            if (this.f7224c != null) {
                this.f7224c.mo7807b(aVar.f7161a);
                this.f7224c.f7194i = aVar.f7164d;
                this.f7224c.mo7784a(aVar.f7165e);
            }
            if (this.f7225d != null) {
                this.f7225d.mo7804b(aVar.f7162b);
                this.f7225d.mo7784a(aVar.f7165e);
            }
            if (this.f7226e != null) {
                this.f7226e.mo7803b(aVar.f7163c);
                this.f7226e.mo7784a(aVar.f7165e);
            }
            C2147f a = C2147f.m9372a();
            if (aVar.f7166f != null) {
                a = aVar.f7166f;
            }
            C2140e.m9358a(a);
        }
    }
}
