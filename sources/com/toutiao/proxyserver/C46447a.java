package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import com.toutiao.proxyserver.net.C46507a;
import com.toutiao.proxyserver.net.C46508b;
import com.toutiao.proxyserver.net.C46513c;
import com.toutiao.proxyserver.net.C46514d.C46516a;
import com.toutiao.proxyserver.net.C46517e;
import com.toutiao.proxyserver.p1839a.C46453a;
import com.toutiao.proxyserver.p1840b.C46462b;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1841c.C46470c;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.toutiao.proxyserver.a */
abstract class C46447a implements C46570y {

    /* renamed from: a */
    protected volatile C46467c f119656a;

    /* renamed from: b */
    protected final C46463c f119657b;

    /* renamed from: c */
    protected final AtomicInteger f119658c = new AtomicInteger();

    /* renamed from: d */
    protected final AtomicLong f119659d = new AtomicLong();

    /* renamed from: e */
    protected volatile List<C46513c> f119660e;

    /* renamed from: f */
    protected volatile C46507a f119661f;

    /* renamed from: g */
    protected volatile String f119662g;

    /* renamed from: h */
    protected volatile String f119663h;

    /* renamed from: i */
    protected volatile C46564v f119664i;

    /* renamed from: j */
    protected volatile C46571z f119665j;

    /* renamed from: k */
    protected volatile int f119666k;

    /* renamed from: l */
    protected AtomicLong f119667l = new AtomicLong(0);

    /* renamed from: m */
    private AtomicLong f119668m = new AtomicLong(0);

    /* renamed from: n */
    private final AtomicInteger f119669n = new AtomicInteger(0);

    /* renamed from: o */
    private int f119670o = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C46517e mo115554a(String str, int i, int i2, String str2) throws IOException {
        return C46460b.m146062a(this, str, i, i2, str2);
    }

    /* renamed from: a */
    public void mo115555a() {
        if (this.f119669n.compareAndSet(0, 1)) {
            mo115563b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo115563b() {
        C46507a aVar = this.f119661f;
        this.f119661f = null;
        if (aVar != null) {
            aVar.mo115656b();
        }
    }

    /* renamed from: c */
    public final boolean mo115564c() {
        if (this.f119669n.get() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo115565d() {
        this.f119669n.compareAndSet(0, 2);
        this.f119661f = null;
    }

    /* renamed from: e */
    public final boolean mo115566e() {
        if (this.f119669n.get() == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115567f() throws CancelException {
        if (mo115564c()) {
            throw new CancelException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo115570i() {
        this.f119668m.set(SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo115571j() {
        this.f119667l.set(0);
        this.f119668m.set(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo115568g() {
        if (this.f119664i != null) {
            return this.f119664i.f120000c.f120001a;
        }
        if (this.f119656a instanceof C46480f) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo115569h() {
        this.f119667l.getAndAdd(SystemClock.elapsedRealtime() - this.f119668m.get());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115557a(final String str) {
        final C46506n nVar = C46534r.f119898e;
        if (nVar != null) {
            C46476c.m146132b((Runnable) new Runnable() {
                public final void run() {
                    nVar.mo105068a(C46462b.m146064a(C46447a.this.mo115568g()), str, C46447a.this.f119658c.get(), C46447a.this.f119667l.get(), 0);
                }
            });
        }
    }

    public C46447a(C46467c cVar, C46463c cVar2) {
        this.f119656a = cVar;
        this.f119657b = cVar2;
        this.f119666k = 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r4 = r8;
        r5 = r9;
        r0 = new com.toutiao.proxyserver.C46447a.C464481(r7);
        com.toutiao.proxyserver.p1842d.C46476c.m146132b((java.lang.Runnable) r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115556a(int r8, int r9) {
        /*
            r7 = this;
            com.toutiao.proxyserver.n r2 = com.toutiao.proxyserver.C46534r.f119898e
            if (r2 == 0) goto L_0x004c
            if (r8 <= 0) goto L_0x004c
            if (r9 >= 0) goto L_0x0009
            goto L_0x004c
        L_0x0009:
            int r0 = com.toutiao.proxyserver.C46534r.f119913t
            int r3 = r7.mo115568g()
            r1 = 1
            if (r0 == r1) goto L_0x0017
            r4 = 2
            if (r0 != r4) goto L_0x0048
            if (r3 != r1) goto L_0x0048
        L_0x0017:
            float r0 = (float) r9
            float r1 = (float) r8
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 100
            if (r0 <= r1) goto L_0x0025
            r0 = 100
        L_0x0025:
            monitor-enter(r7)
            int r4 = r7.f119670o     // Catch:{ all -> 0x0049 }
            int r5 = com.toutiao.proxyserver.C46534r.f119905l     // Catch:{ all -> 0x0049 }
            int r4 = r4 + r5
            if (r4 <= r1) goto L_0x002f
            r4 = 100
        L_0x002f:
            if (r0 > r4) goto L_0x0033
            if (r0 != r1) goto L_0x0037
        L_0x0033:
            int r4 = r7.f119670o     // Catch:{ all -> 0x0049 }
            if (r4 != r1) goto L_0x0039
        L_0x0037:
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            return
        L_0x0039:
            r7.f119670o = r0     // Catch:{ all -> 0x0049 }
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            com.toutiao.proxyserver.a$1 r6 = new com.toutiao.proxyserver.a$1
            r0 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r2, r3, r4, r5)
            com.toutiao.proxyserver.p1842d.C46476c.m146132b(r6)
        L_0x0048:
            return
        L_0x0049:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            throw r8
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46447a.mo115556a(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115560a(Throwable th, String str, int i) {
        C46507a aVar = this.f119661f;
        if (aVar != null) {
            aVar.mo115655a(th, str, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115558a(String str, String str2, int i, long j) {
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        final long j2 = j;
        C464514 r0 = new Runnable() {
            public final void run() {
                if (C46534r.f119898e != null) {
                    try {
                        C46534r.f119898e.mo105062a(C46476c.m146110a(str3, str4, i2, j2));
                    } catch (Exception unused) {
                    }
                }
            }
        };
        C46476c.m146132b((Runnable) r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115559a(String str, String str2, long j, long j2) {
        final long j3 = j;
        final long j4 = j2;
        final String str3 = str;
        final String str4 = str2;
        C464525 r0 = new Runnable() {
            public final void run() {
                if (C46534r.f119899f != null) {
                    try {
                        C46453a aVar = new C46453a();
                        aVar.f119699c = j3;
                        aVar.f119700d = j4;
                        aVar.f119697a = str3;
                        aVar.f119698b = str4;
                        C46534r.f119899f.mo105061a(aVar);
                    } catch (Exception unused) {
                    }
                }
            }
        };
        C46476c.m146132b((Runnable) r0);
    }

    /* renamed from: b */
    public final C46517e mo115562b(String str, int i, int i2, String str2) throws IOException {
        boolean z;
        int i3;
        String str3;
        String str4;
        C46516a aVar = new C46516a();
        aVar.mo115666b(str2);
        List<C46513c> list = this.f119660e;
        if (list != null && !list.isEmpty()) {
            for (C46513c cVar : list) {
                if (!"Range".equalsIgnoreCase(cVar.f119833a) && !"Connection".equalsIgnoreCase(cVar.f119833a) && !"Proxy-Connection".equalsIgnoreCase(cVar.f119833a) && !"Host".equalsIgnoreCase(cVar.f119833a)) {
                    aVar.mo115663a(cVar.f119833a, cVar.f119834b);
                }
            }
        }
        String a = C46476c.m146112a(i, i2);
        if (a != null) {
            aVar.mo115663a("Range", a);
        }
        aVar.mo115663a("Vpwp-Raw-Key", this.f119662g);
        if (C46534r.f119917x) {
            String str5 = "Vpwp-Type";
            try {
                if (this.f119664i == null) {
                    str3 = "preloader";
                } else {
                    str3 = "proxy";
                }
                aVar.mo115663a(str5, str3);
                aVar.mo115663a("Vpwp-Key", this.f119663h);
                if (this.f119664i == null) {
                    str4 = "";
                } else {
                    str4 = C46476c.m146134c(this.f119664i.f120000c.f120006f);
                }
                if (!TextUtils.isEmpty(str4)) {
                    aVar.mo115663a("Vpwp-Mp-Range", str4);
                }
                aVar.mo115663a("Vpwp-Flag", String.valueOf(mo115568g()));
            } catch (Throwable th) {
                C46470c.m146089d("AbsTask", C46470c.m146081a(th));
            }
        }
        if (!C46534r.f119902i) {
            aVar.mo115663a("local_url_index", String.valueOf(this.f119666k));
            String str6 = "local_url_count";
            if (this.f119665j.f120015a != null) {
                i3 = this.f119665j.f120015a.size();
            } else {
                i3 = -1;
            }
            aVar.mo115663a(str6, String.valueOf(i3));
        }
        aVar.mo115662a(str);
        if (C46534r.f119912s) {
            aVar.mo115663a("Cache-Control", "no-cache");
        }
        if (this.f119664i == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C46522q a2 = C46522q.m146227a();
            aVar.mo115661a(a2.f119867h);
            aVar.mo115665b(a2.f119868i);
            aVar.mo115667c(a2.f119869j);
        } else {
            C46536s a3 = C46536s.m146278a();
            aVar.mo115661a(a3.f119929j);
            aVar.mo115665b(a3.f119930k);
            aVar.mo115667c(a3.f119931l);
        }
        C46507a a4 = C46508b.m146203a(aVar.mo115664a());
        this.f119661f = a4;
        return a4.mo115654a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115561a(boolean z, String str, int i, int i2, String str2, String str3) {
        final C46506n nVar = C46534r.f119898e;
        if (nVar != null) {
            final boolean z2 = z;
            final String str4 = str;
            final int i3 = i;
            final int i4 = i2;
            final String str5 = str2;
            final String str6 = str3;
            C464492 r0 = new Runnable() {
                public final void run() {
                    nVar.mo105067a(z2, str4, i3, i4, str5, str6);
                }
            };
            C46476c.m146132b((Runnable) r0);
        }
    }
}
