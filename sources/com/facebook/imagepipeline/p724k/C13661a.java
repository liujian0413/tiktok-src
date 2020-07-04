package com.facebook.imagepipeline.p724k;

import com.facebook.imagepipeline.p720g.C13647e;

/* renamed from: com.facebook.imagepipeline.k.a */
public final class C13661a implements C13699am<C13647e> {

    /* renamed from: a */
    private final C13699am<C13647e> f36284a;

    /* renamed from: com.facebook.imagepipeline.k.a$a */
    static class C13663a extends C13756n<C13647e, C13647e> {
        private C13663a(C13748k<C13647e> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            if (eVar == null) {
                this.f36516e.mo33354b(null, i);
                return;
            }
            if (!C13647e.m40236c(eVar)) {
                eVar.mo33282j();
            }
            this.f36516e.mo33354b(eVar, i);
        }
    }

    public C13661a(C13699am<C13647e> amVar) {
        this.f36284a = amVar;
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        this.f36284a.mo33296a(new C13663a(kVar), anVar);
    }
}
