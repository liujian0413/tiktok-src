package com.facebook.imagepipeline.p724k;

import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.facebook.imagepipeline.k.j */
public final class C13745j implements C13699am<C13647e> {

    /* renamed from: a */
    public final C13699am<C13647e> f36484a;

    /* renamed from: b */
    private final C13699am<C13647e> f36485b;

    /* renamed from: com.facebook.imagepipeline.k.j$a */
    class C13747a extends C13756n<C13647e, C13647e> {

        /* renamed from: b */
        private C13700an f36487b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33257a(Throwable th) {
            C13745j.this.f36484a.mo33296a(this.f36516e, this.f36487b);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            ImageRequest a = this.f36487b.mo33333a();
            boolean a2 = m40493a(i);
            boolean a3 = C13732bc.m40514a(eVar, a.mResizeOptions);
            if (eVar != null && (a3 || a.mLocalThumbnailPreviewsEnabled)) {
                if (!a2 || !a3) {
                    this.f36516e.mo33354b(eVar, m40490a(i, 1));
                } else {
                    this.f36516e.mo33354b(eVar, i);
                }
            }
            if (a2 && !a3) {
                C13647e.m40237d(eVar);
                C13745j.this.f36484a.mo33296a(this.f36516e, this.f36487b);
            }
        }

        private C13747a(C13748k<C13647e> kVar, C13700an anVar) {
            super(kVar);
            this.f36487b = anVar;
        }
    }

    public C13745j(C13699am<C13647e> amVar, C13699am<C13647e> amVar2) {
        this.f36485b = amVar;
        this.f36484a = amVar2;
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        this.f36485b.mo33296a(new C13747a(kVar, anVar), anVar);
    }
}
