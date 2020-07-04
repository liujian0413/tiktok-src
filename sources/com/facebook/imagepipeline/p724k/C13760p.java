package com.facebook.imagepipeline.p724k;

import com.facebook.cache.common.C13265a;
import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;

/* renamed from: com.facebook.imagepipeline.k.p */
public final class C13760p implements C13699am<C13647e> {

    /* renamed from: a */
    private final C13561e f36528a;

    /* renamed from: b */
    private final C13561e f36529b;

    /* renamed from: c */
    private final C13568f f36530c;

    /* renamed from: d */
    private final C13699am<C13647e> f36531d;

    /* renamed from: com.facebook.imagepipeline.k.p$a */
    static class C13762a extends C13756n<C13647e, C13647e> {

        /* renamed from: a */
        private final C13700an f36532a;

        /* renamed from: b */
        private final C13561e f36533b;

        /* renamed from: c */
        private final C13561e f36534c;

        /* renamed from: d */
        private final C13568f f36535d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            if (m40494b(i) || eVar == null || m40496c(i, 10) || eVar.mo33276d() == C13509c.f35837a) {
                this.f36516e.mo33354b(eVar, i);
                return;
            }
            ImageRequest a = this.f36532a.mo33333a();
            C13265a c = this.f36535d.mo33116c(a, this.f36532a.mo33337d());
            if (a.mCacheChoice == CacheChoice.SMALL) {
                this.f36534c.mo33101a(c, eVar);
            } else {
                this.f36533b.mo33101a(c, eVar);
            }
            this.f36516e.mo33354b(eVar, i);
        }

        private C13762a(C13748k<C13647e> kVar, C13700an anVar, C13561e eVar, C13561e eVar2, C13568f fVar) {
            super(kVar);
            this.f36532a = anVar;
            this.f36533b = eVar;
            this.f36534c = eVar2;
            this.f36535d = fVar;
        }
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        m40614b(kVar, anVar);
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.facebook.imagepipeline.k.k] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m40614b(com.facebook.imagepipeline.p724k.C13748k<com.facebook.imagepipeline.p720g.C13647e> r9, com.facebook.imagepipeline.p724k.C13700an r10) {
        /*
            r8 = this;
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r0 = r10.mo33338e()
            int r0 = r0.getValue()
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r1 = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.DISK_CACHE
            int r1 = r1.getValue()
            if (r0 < r1) goto L_0x0016
            r10 = 0
            r0 = 1
            r9.mo33354b(r10, r0)
            return
        L_0x0016:
            com.facebook.imagepipeline.request.ImageRequest r0 = r10.mo33333a()
            boolean r0 = r0.mIsDiskCacheEnabled
            if (r0 == 0) goto L_0x002e
            com.facebook.imagepipeline.k.p$a r0 = new com.facebook.imagepipeline.k.p$a
            com.facebook.imagepipeline.c.e r4 = r8.f36528a
            com.facebook.imagepipeline.c.e r5 = r8.f36529b
            com.facebook.imagepipeline.c.f r6 = r8.f36530c
            r7 = 0
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = r0
        L_0x002e:
            com.facebook.imagepipeline.k.am<com.facebook.imagepipeline.g.e> r0 = r8.f36531d
            r0.mo33296a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13760p.m40614b(com.facebook.imagepipeline.k.k, com.facebook.imagepipeline.k.an):void");
    }

    public C13760p(C13561e eVar, C13561e eVar2, C13568f fVar, C13699am<C13647e> amVar) {
        this.f36528a = eVar;
        this.f36529b = eVar2;
        this.f36530c = fVar;
        this.f36531d = amVar;
    }
}
