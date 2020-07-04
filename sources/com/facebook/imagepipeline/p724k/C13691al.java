package com.facebook.imagepipeline.p724k;

import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.C13843c;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.al */
public final class C13691al implements C13699am<C13326a<C13645c>> {

    /* renamed from: a */
    public final C13551f f36358a;

    /* renamed from: b */
    public final Executor f36359b;

    /* renamed from: c */
    private final C13699am<C13326a<C13645c>> f36360c;

    /* renamed from: com.facebook.imagepipeline.k.al$a */
    class C13693a extends C13756n<C13326a<C13645c>, C13326a<C13645c>> {

        /* renamed from: a */
        public C13326a<C13645c> f36361a;

        /* renamed from: b */
        public int f36362b;

        /* renamed from: c */
        public boolean f36363c;

        /* renamed from: f */
        private final C13702ap f36365f;

        /* renamed from: g */
        private final String f36366g;

        /* renamed from: h */
        private final C13842b f36367h;

        /* renamed from: i */
        private boolean f36368i;

        /* renamed from: j */
        private boolean f36369j;

        /* renamed from: g */
        private synchronized boolean m40406g() {
            return this.f36368i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33254a() {
            mo33330d();
        }

        /* renamed from: e */
        private void m40404e() {
            C13691al.this.f36359b.execute(new Runnable() {
                public final void run() {
                    C13326a<C13645c> aVar;
                    int i;
                    synchronized (C13693a.this) {
                        aVar = C13693a.this.f36361a;
                        i = C13693a.this.f36362b;
                        C13693a.this.f36361a = null;
                        C13693a.this.f36363c = false;
                    }
                    if (C13326a.m38999a(aVar)) {
                        try {
                            C13693a.this.mo33328a(aVar, i);
                        } finally {
                            C13326a.m39001c(aVar);
                        }
                    }
                    C13693a.this.mo33329c();
                }
            });
        }

        /* renamed from: d */
        public final void mo33330d() {
            if (m40407h()) {
                this.f36516e.mo33352b();
            }
        }

        /* renamed from: f */
        private synchronized boolean m40405f() {
            if (this.f36368i || !this.f36363c || this.f36369j || !C13326a.m38999a(this.f36361a)) {
                return false;
            }
            this.f36369j = true;
            return true;
        }

        /* renamed from: h */
        private boolean m40407h() {
            synchronized (this) {
                if (this.f36368i) {
                    return false;
                }
                C13326a<C13645c> aVar = this.f36361a;
                this.f36361a = null;
                this.f36368i = true;
                C13326a.m39001c(aVar);
                return true;
            }
        }

        /* renamed from: c */
        public final void mo33329c() {
            boolean f;
            synchronized (this) {
                this.f36369j = false;
                f = m40405f();
            }
            if (f) {
                m40404e();
            }
        }

        /* renamed from: a */
        private static boolean m40398a(C13645c cVar) {
            return cVar instanceof C13646d;
        }

        /* renamed from: c */
        private void m40402c(Throwable th) {
            if (m40407h()) {
                this.f36516e.mo33355b(th);
            }
        }

        /* renamed from: b */
        private C13326a<C13645c> m40399b(C13645c cVar) {
            C13646d dVar = (C13646d) cVar;
            C13326a process = this.f36367h.process(dVar.mo33265d(), C13691al.this.f36358a);
            try {
                return C13326a.m38995a(new C13646d(process, cVar.mo33266e(), dVar.f36253a, dVar.f36254b));
            } finally {
                C13326a.m39001c(process);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33257a(Throwable th) {
            m40402c(th);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void mo33256a(C13326a<C13645c> aVar, int i) {
            if (!C13326a.m38999a(aVar)) {
                if (m40493a(i)) {
                    m40403d(null, i);
                }
                return;
            }
            m40401c(aVar, i);
        }

        /* renamed from: d */
        private void m40403d(C13326a<C13645c> aVar, int i) {
            boolean a = m40493a(i);
            if ((!a && !m40406g()) || (a && m40407h())) {
                this.f36516e.mo33354b(aVar, i);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
            m40404e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            com.facebook.common.references.C13326a.m39001c(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r2 == false) goto L_0x0021;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m40401c(com.facebook.common.references.C13326a<com.facebook.imagepipeline.p720g.C13645c> r2, int r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f36368i     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                com.facebook.common.references.a<com.facebook.imagepipeline.g.c> r0 = r1.f36361a     // Catch:{ all -> 0x0022 }
                com.facebook.common.references.a r2 = com.facebook.common.references.C13326a.m39000b(r2)     // Catch:{ all -> 0x0022 }
                r1.f36361a = r2     // Catch:{ all -> 0x0022 }
                r1.f36362b = r3     // Catch:{ all -> 0x0022 }
                r2 = 1
                r1.f36363c = r2     // Catch:{ all -> 0x0022 }
                boolean r2 = r1.m40405f()     // Catch:{ all -> 0x0022 }
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                com.facebook.common.references.C13326a.m39001c(r0)
                if (r2 == 0) goto L_0x0021
                r1.m40404e()
            L_0x0021:
                return
            L_0x0022:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13691al.C13693a.m40401c(com.facebook.common.references.a, int):void");
        }

        /* renamed from: a */
        public final void mo33328a(C13326a<C13645c> aVar, int i) {
            C13307g.m38943a(C13326a.m38999a(aVar));
            if (!m40398a((C13645c) aVar.mo32609a())) {
                m40403d(aVar, i);
                return;
            }
            this.f36365f.onProducerStart(this.f36366g, "PostprocessorProducer");
            C13326a aVar2 = null;
            try {
                C13326a b = m40399b((C13645c) aVar.mo32609a());
                try {
                    this.f36365f.onProducerFinishWithSuccess(this.f36366g, "PostprocessorProducer", m40397a(this.f36365f, this.f36366g, this.f36367h));
                    m40403d(b, i);
                    C13326a.m39001c(b);
                } catch (Throwable th) {
                    th = th;
                    aVar2 = b;
                    C13326a.m39001c(aVar2);
                    throw th;
                }
            } catch (Exception e) {
                this.f36365f.onProducerFinishWithFailure(this.f36366g, "PostprocessorProducer", e, m40397a(this.f36365f, this.f36366g, this.f36367h));
                m40402c(e);
                C13326a.m39001c(null);
            } catch (Throwable th2) {
                th = th2;
                C13326a.m39001c(aVar2);
                throw th;
            }
        }

        /* renamed from: a */
        private static Map<String, String> m40397a(C13702ap apVar, String str, C13842b bVar) {
            if (!apVar.requiresExtraMap(str)) {
                return null;
            }
            return ImmutableMap.m38917of("Postprocessor", bVar.getName());
        }

        public C13693a(C13748k<C13326a<C13645c>> kVar, C13702ap apVar, String str, C13842b bVar, C13700an anVar) {
            super(kVar);
            this.f36365f = apVar;
            this.f36366g = str;
            this.f36367h = bVar;
            anVar.mo33334a(new C13738e(C13691al.this) {
                /* renamed from: a */
                public final void mo29896a() {
                    C13693a.this.mo33330d();
                }
            });
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.al$b */
    class C13696b extends C13756n<C13326a<C13645c>, C13326a<C13645c>> {

        /* renamed from: b */
        private boolean f36374b;

        /* renamed from: c */
        private C13326a<C13645c> f36375c;

        /* renamed from: d */
        private void m40417d() {
            synchronized (this) {
                if (!this.f36374b) {
                    C13326a b = C13326a.m39000b(this.f36375c);
                    try {
                        this.f36516e.mo33354b(b, 0);
                    } finally {
                        C13326a.m39001c(b);
                    }
                }
            }
        }

        /* renamed from: c */
        public final boolean mo33332c() {
            synchronized (this) {
                if (this.f36374b) {
                    return false;
                }
                C13326a<C13645c> aVar = this.f36375c;
                this.f36375c = null;
                this.f36374b = true;
                C13326a.m39001c(aVar);
                return true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33254a() {
            if (mo33332c()) {
                this.f36516e.mo33352b();
            }
        }

        /* renamed from: a */
        private void m40415a(C13326a<C13645c> aVar) {
            synchronized (this) {
                if (!this.f36374b) {
                    C13326a<C13645c> aVar2 = this.f36375c;
                    this.f36375c = C13326a.m39000b(aVar);
                    C13326a.m39001c(aVar2);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33257a(Throwable th) {
            if (mo33332c()) {
                this.f36516e.mo33355b(th);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13326a<C13645c> aVar, int i) {
            if (!m40494b(i)) {
                m40415a(aVar);
                m40417d();
            }
        }

        private C13696b(C13693a aVar, C13843c cVar, C13700an anVar) {
            super(aVar);
            anVar.mo33334a(new C13738e(C13691al.this) {
                /* renamed from: a */
                public final void mo29896a() {
                    if (C13696b.this.mo33332c()) {
                        C13696b.this.f36516e.mo33352b();
                    }
                }
            });
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.al$c */
    class C13698c extends C13756n<C13326a<C13645c>, C13326a<C13645c>> {
        private C13698c(C13693a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13326a<C13645c> aVar, int i) {
            if (!m40494b(i)) {
                this.f36516e.mo33354b(aVar, i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.facebook.imagepipeline.k.k] */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.facebook.imagepipeline.k.al$c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33296a(com.facebook.imagepipeline.p724k.C13748k<com.facebook.common.references.C13326a<com.facebook.imagepipeline.p720g.C13645c>> r10, com.facebook.imagepipeline.p724k.C13700an r11) {
        /*
            r9 = this;
            com.facebook.imagepipeline.k.ap r3 = r11.mo33336c()
            com.facebook.imagepipeline.request.ImageRequest r0 = r11.mo33333a()
            com.facebook.imagepipeline.request.b r7 = r0.mPostprocessor
            com.facebook.imagepipeline.k.al$a r8 = new com.facebook.imagepipeline.k.al$a
            java.lang.String r4 = r11.mo33335b()
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r7
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof com.facebook.imagepipeline.request.C13843c
            if (r0 == 0) goto L_0x002a
            com.facebook.imagepipeline.k.al$b r6 = new com.facebook.imagepipeline.k.al$b
            r3 = r7
            com.facebook.imagepipeline.request.c r3 = (com.facebook.imagepipeline.request.C13843c) r3
            r5 = 0
            r0 = r6
            r1 = r9
            r2 = r8
            r4 = r11
            r0.<init>(r2, r3, r4)
            goto L_0x0030
        L_0x002a:
            com.facebook.imagepipeline.k.al$c r6 = new com.facebook.imagepipeline.k.al$c
            r0 = 0
            r6.<init>(r8)
        L_0x0030:
            com.facebook.imagepipeline.k.am<com.facebook.common.references.a<com.facebook.imagepipeline.g.c>> r0 = r9.f36360c
            r0.mo33296a(r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13691al.mo33296a(com.facebook.imagepipeline.k.k, com.facebook.imagepipeline.k.an):void");
    }

    public C13691al(C13699am<C13326a<C13645c>> amVar, C13551f fVar, Executor executor) {
        this.f36360c = (C13699am) C13307g.m38940a(amVar);
        this.f36358a = fVar;
        this.f36359b = (Executor) C13307g.m38940a(executor);
    }
}
