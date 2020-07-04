package com.facebook.imagepipeline.p724k;

import com.facebook.common.internal.C13307g;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13647e;

/* renamed from: com.facebook.imagepipeline.k.ba */
public final class C13729ba implements C13699am<C13647e> {

    /* renamed from: a */
    private final C13731bb<C13647e>[] f36448a;

    /* renamed from: com.facebook.imagepipeline.k.ba$a */
    class C13730a extends C13756n<C13647e, C13647e> {

        /* renamed from: b */
        private final C13700an f36450b;

        /* renamed from: c */
        private final int f36451c;

        /* renamed from: d */
        private final C13596d f36452d = this.f36450b.mo33333a().mResizeOptions;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33257a(Throwable th) {
            if (!C13729ba.this.mo33356a(this.f36451c + 1, this.f36516e, this.f36450b)) {
                this.f36516e.mo33355b(th);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            if (eVar == null || (!m40494b(i) && !C13732bc.m40514a(eVar, this.f36452d))) {
                if (m40493a(i)) {
                    C13647e.m40237d(eVar);
                    if (!C13729ba.this.mo33356a(this.f36451c + 1, this.f36516e, this.f36450b)) {
                        this.f36516e.mo33354b(null, 1);
                    }
                }
                return;
            }
            this.f36516e.mo33354b(eVar, i);
        }

        public C13730a(C13748k<C13647e> kVar, C13700an anVar, int i) {
            super(kVar);
            this.f36450b = anVar;
            this.f36451c = i;
        }
    }

    public C13729ba(C13731bb<C13647e>... bbVarArr) {
        this.f36448a = (C13731bb[]) C13307g.m38940a(bbVarArr);
        C13307g.m38938a(0, this.f36448a.length);
    }

    /* renamed from: a */
    private int m40505a(int i, C13596d dVar) {
        while (i < this.f36448a.length) {
            if (this.f36448a[i].mo33299a(dVar)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        if (anVar.mo33333a().mResizeOptions == null) {
            kVar.mo33354b(null, 1);
            return;
        }
        if (!mo33356a(0, kVar, anVar)) {
            kVar.mo33354b(null, 1);
        }
    }

    /* renamed from: a */
    public final boolean mo33356a(int i, C13748k<C13647e> kVar, C13700an anVar) {
        int a = m40505a(i, anVar.mo33333a().mResizeOptions);
        if (a == -1) {
            return false;
        }
        this.f36448a[a].mo33296a(new C13730a(kVar, anVar, a), anVar);
        return true;
    }
}
