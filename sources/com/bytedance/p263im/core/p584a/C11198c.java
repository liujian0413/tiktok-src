package com.bytedance.p263im.core.p584a;

import android.app.Application;
import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p587a.p588a.C11283p;
import com.bytedance.p263im.core.internal.p589b.C11314a;
import com.bytedance.p263im.core.internal.p590db.fts.C11359a;
import com.bytedance.p263im.core.internal.queue.C11379a;
import com.bytedance.p263im.core.internal.queue.p597a.C11380a;
import com.bytedance.p263im.core.internal.queue.p597a.C11381b;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.internal.utils.C11430h;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C11439h;
import com.bytedance.p263im.core.model.C11469m;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11206a;
import com.bytedance.p263im.core.p586b.C11208c;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.a.c */
public final class C11198c {

    /* renamed from: e */
    private static C11198c f30370e;

    /* renamed from: a */
    public Application f30371a;

    /* renamed from: b */
    public C11193a f30372b;

    /* renamed from: c */
    public C11206a f30373c;

    /* renamed from: d */
    public volatile boolean f30374d;

    /* renamed from: f */
    private C11205e f30375f;

    /* renamed from: com.bytedance.im.core.a.c$a */
    static class C11201a implements C11193a {
        private C11201a() {
        }

        /* renamed from: a */
        public final long mo27230a() {
            return -1;
        }

        /* renamed from: a */
        public final void mo27231a(int i) {
        }

        /* renamed from: a */
        public final void mo27232a(int i, long j, String str, byte[] bArr) {
        }

        /* renamed from: a */
        public final void mo27233a(C11381b bVar, C11380a aVar) {
        }

        /* renamed from: a */
        public final void mo27234a(List<Message> list) {
        }

        /* renamed from: b */
        public final String mo27235b() {
            return "";
        }

        /* renamed from: c */
        public final String mo27236c() {
            return "";
        }

        /* renamed from: d */
        public final boolean mo27237d() {
            return false;
        }

        /* renamed from: e */
        public final C11197b mo27238e() {
            return null;
        }

        /* renamed from: f */
        public final Map<String, String> mo27239f() {
            return null;
        }

        /* renamed from: g */
        public final void mo27240g() {
        }

        /* renamed from: h */
        public final String mo27241h() {
            return "";
        }
    }

    private C11198c() {
    }

    /* renamed from: e */
    public final synchronized void mo27252e() {
        mo27249b(6);
    }

    /* renamed from: a */
    public static C11198c m32777a() {
        if (f30370e == null) {
            synchronized (C11198c.class) {
                if (f30370e == null) {
                    f30370e = new C11198c();
                }
            }
        }
        return f30370e;
    }

    /* renamed from: b */
    public final C11205e mo27248b() {
        if (this.f30375f != null) {
            return this.f30375f;
        }
        return C11205e.m32807b();
    }

    /* renamed from: c */
    public final synchronized void mo27250c() {
        this.f30374d = true;
        m32782g();
        C6417a.m20015a().mo15555g();
        C11283p.m33057a();
        C11283p.m33078b();
    }

    /* renamed from: d */
    public final synchronized void mo27251d() {
        this.f30374d = false;
        C11283p.m33057a();
        C11283p.m33086c();
        m32782g();
    }

    /* renamed from: g */
    private synchronized void m32782g() {
        C11314a.m33184d();
        C11211a.m32833a();
        C6417a.m20015a().mo15558i();
        C11359a.m33339a().mo27387c();
        C11469m.m33840a().mo27690d();
        C11379a.m33470a().mo27404b();
    }

    /* renamed from: f */
    public final void mo27253f() {
        C11208c.m32815a().mo27256a("core").mo27258b("db_crash").mo27257a("last_reset_time", Long.valueOf(C11430h.m33685a().mo27474b())).mo27257a("reset_count", Integer.valueOf(C11430h.m33685a().mo27477c())).mo27260b();
        C11283p.m33057a().mo27310a((Runnable) new Runnable() {
            public final void run() {
                C11198c.this.mo27251d();
                C11430h.m33685a().mo27481d();
                C11198c.this.mo27250c();
            }
        });
    }

    /* renamed from: a */
    public static void m32778a(C11439h hVar) {
        C11407f.m33601a().f30891a = hVar;
    }

    /* renamed from: a */
    public static boolean m32780a(int i) {
        return C11430h.m33685a().mo27479c(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo27249b(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f30374d     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            com.bytedance.im.core.a.c r0 = m32777a()     // Catch:{ all -> 0x0037 }
            com.bytedance.im.core.a.e r0 = r0.mo27248b()     // Catch:{ all -> 0x0037 }
            int[] r0 = r0.f30416p     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x001b
            com.bytedance.im.core.a.c r0 = m32777a()     // Catch:{ all -> 0x0037 }
            com.bytedance.im.core.a.e r0 = r0.mo27248b()     // Catch:{ all -> 0x0037 }
            int[] r0 = r0.f30415o     // Catch:{ all -> 0x0037 }
        L_0x001b:
            if (r0 != 0) goto L_0x001f
            monitor-exit(r2)
            return
        L_0x001f:
            com.bytedance.im.core.a.c r1 = m32777a()     // Catch:{ all -> 0x0037 }
            com.bytedance.im.core.a.e r1 = r1.mo27248b()     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.mo27255a()     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0032
            m32779a(r0, r3)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0032:
            r2.m32781b(r0, r3)     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.p584a.C11198c.mo27249b(int):void");
    }

    /* renamed from: a */
    public final void mo27246a(C11193a aVar) {
        if (aVar == null) {
            aVar = new C11201a();
        }
        this.f30372b = aVar;
    }

    /* renamed from: b */
    private void m32781b(final int[] iArr, final int i) {
        C11283p.m33057a();
        C11283p.m33077a(iArr, (C11195b<int[]>) new C11195b<int[]>() {
            /* renamed from: a */
            public final void mo18088a(C11438g gVar) {
                C11198c.m32779a(iArr, i);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo18089a(int[] iArr) {
                if (iArr == null || iArr.length == 0) {
                    iArr = iArr;
                }
                C11198c.m32779a(iArr, i);
            }
        });
    }

    /* renamed from: a */
    public static void m32779a(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    C11283p.m33057a();
                    C11283p.m33060a(i2, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo27245a(Application application, C11205e eVar) {
        this.f30371a = application;
        this.f30375f = eVar;
        C11404d.m33581a(mo27248b().f30401a);
    }

    /* renamed from: a */
    public final void mo27247a(String str, byte[] bArr) {
        if (this.f30374d) {
            C11379a.m33470a().mo27402a(str, bArr);
        }
    }
}
