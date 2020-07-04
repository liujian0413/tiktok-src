package com.facebook.datasource;

import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.common.p685b.C13275a;
import java.util.List;

/* renamed from: com.facebook.datasource.f */
public final class C13350f<T> implements C13310j<C13346c<T>> {

    /* renamed from: a */
    public final List<C13310j<C13346c<T>>> f35275a;

    /* renamed from: com.facebook.datasource.f$a */
    class C13352a extends C13341a<T> {

        /* renamed from: b */
        private int f35277b;

        /* renamed from: c */
        private C13346c<T> f35278c;

        /* renamed from: d */
        private C13346c<T> f35279d;

        /* renamed from: com.facebook.datasource.f$a$a */
        class C13353a implements C13349e<T> {
            public final void onCancellation(C13346c<T> cVar) {
            }

            private C13353a() {
            }

            public final void onFailure(C13346c<T> cVar) {
                C13352a.this.mo32651a(cVar);
            }

            public final void onNewResult(C13346c<T> cVar) {
                if (cVar.mo32640c()) {
                    C13352a.this.mo32652b(cVar);
                    return;
                }
                if (cVar.mo32639b()) {
                    C13352a.this.mo32651a(cVar);
                }
            }

            public final void onProgressUpdate(C13346c<T> cVar) {
                C13352a.this.mo32636a(Math.max(C13352a.this.mo32643f(), cVar.mo32643f()));
            }
        }

        /* renamed from: j */
        private synchronized C13346c<T> m39089j() {
            return this.f35279d;
        }

        /* renamed from: g */
        public final boolean mo32644g() {
            synchronized (this) {
                if (!super.mo32644g()) {
                    return false;
                }
                C13346c<T> cVar = this.f35278c;
                this.f35278c = null;
                C13346c<T> cVar2 = this.f35279d;
                this.f35279d = null;
                m39086e(cVar2);
                m39086e(cVar);
                return true;
            }
        }

        /* renamed from: h */
        private boolean m39087h() {
            C13346c cVar;
            C13310j i = m39088i();
            if (i != null) {
                cVar = (C13346c) i.mo29879b();
            } else {
                cVar = null;
            }
            if (!m39084c(cVar) || cVar == null) {
                m39086e(cVar);
                return false;
            }
            cVar.mo32633a(new C13353a(), C13275a.m38815a());
            return true;
        }

        /* renamed from: i */
        private synchronized C13310j<C13346c<T>> m39088i() {
            if (mo32635a() || this.f35277b >= C13350f.this.f35275a.size()) {
                return null;
            }
            List<C13310j<C13346c<T>>> list = C13350f.this.f35275a;
            int i = this.f35277b;
            this.f35277b = i + 1;
            return (C13310j) list.get(i);
        }

        /* renamed from: c */
        public final synchronized boolean mo32640c() {
            boolean z;
            C13346c j = m39089j();
            if (j == null || !j.mo32640c()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        /* renamed from: d */
        public final synchronized T mo32641d() {
            C13346c j = m39089j();
            if (j == null) {
                return null;
            }
            return j.mo32641d();
        }

        /* renamed from: e */
        private static void m39086e(C13346c<T> cVar) {
            if (cVar != null) {
                cVar.mo32644g();
            }
        }

        public C13352a() {
            if (!m39087h()) {
                mo32638a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: c */
        private synchronized boolean m39084c(C13346c<T> cVar) {
            if (mo32635a()) {
                return false;
            }
            this.f35278c = cVar;
            return true;
        }

        /* renamed from: d */
        private synchronized boolean m39085d(C13346c<T> cVar) {
            if (!mo32635a()) {
                if (cVar == this.f35278c) {
                    this.f35278c = null;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo32651a(C13346c<T> cVar) {
            if (m39085d(cVar)) {
                if (cVar != m39089j()) {
                    m39086e(cVar);
                }
                if (!m39087h()) {
                    mo32638a(cVar.mo32642e());
                }
            }
        }

        /* renamed from: b */
        public final void mo32652b(C13346c<T> cVar) {
            m39083a(cVar, cVar.mo32639b());
            if (cVar == m39089j()) {
                mo32637a(null, cVar.mo32639b());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            m39086e(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m39083a(com.facebook.datasource.C13346c<T> r2, boolean r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                com.facebook.datasource.c<T> r0 = r1.f35278c     // Catch:{ all -> 0x001f }
                if (r2 != r0) goto L_0x001d
                com.facebook.datasource.c<T> r0 = r1.f35279d     // Catch:{ all -> 0x001f }
                if (r2 != r0) goto L_0x000a
                goto L_0x001d
            L_0x000a:
                com.facebook.datasource.c<T> r0 = r1.f35279d     // Catch:{ all -> 0x001f }
                if (r0 == 0) goto L_0x0013
                if (r3 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0018
            L_0x0013:
                com.facebook.datasource.c<T> r3 = r1.f35279d     // Catch:{ all -> 0x001f }
                r1.f35279d = r2     // Catch:{ all -> 0x001f }
                r2 = r3
            L_0x0018:
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                m39086e(r2)
                return
            L_0x001d:
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                return
            L_0x001f:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C13350f.C13352a.m39083a(com.facebook.datasource.c, boolean):void");
        }
    }

    public final int hashCode() {
        return this.f35275a.hashCode();
    }

    /* renamed from: a */
    public final C13346c<T> mo29879b() {
        return new C13352a();
    }

    public final String toString() {
        return C13303f.m38930a((Object) this).mo32569a("list", (Object) this.f35275a).toString();
    }

    /* renamed from: a */
    public static <T> C13350f<T> m39080a(List<C13310j<C13346c<T>>> list) {
        return new C13350f<>(list);
    }

    private C13350f(List<C13310j<C13346c<T>>> list) {
        C13307g.m38944a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f35275a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13350f)) {
            return false;
        }
        return C13303f.m38932a(this.f35275a, ((C13350f) obj).f35275a);
    }
}
