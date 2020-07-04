package com.facebook.imagepipeline.p724k;

import android.graphics.Bitmap;
import com.facebook.common.internal.C13307g;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;

/* renamed from: com.facebook.imagepipeline.k.i */
public final class C13743i implements C13699am<C13326a<C13645c>> {

    /* renamed from: a */
    private final C13699am<C13326a<C13645c>> f36478a;

    /* renamed from: b */
    private final int f36479b;

    /* renamed from: c */
    private final int f36480c;

    /* renamed from: d */
    private final boolean f36481d;

    /* renamed from: com.facebook.imagepipeline.k.i$a */
    static class C13744a extends C13756n<C13326a<C13645c>, C13326a<C13645c>> {

        /* renamed from: a */
        private final int f36482a;

        /* renamed from: b */
        private final int f36483b;

        /* renamed from: a */
        private void m40563a(C13326a<C13645c> aVar) {
            if (aVar != null && aVar.mo32614d()) {
                C13645c cVar = (C13645c) aVar.mo32609a();
                if (cVar != null && !cVar.mo33258a() && (cVar instanceof C13646d)) {
                    Bitmap d = ((C13646d) cVar).mo33265d();
                    if (d != null) {
                        int rowBytes = d.getRowBytes() * d.getHeight();
                        if (rowBytes >= this.f36482a && rowBytes <= this.f36483b) {
                            d.prepareToDraw();
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13326a<C13645c> aVar, int i) {
            m40563a(aVar);
            this.f36516e.mo33354b(aVar, i);
        }

        C13744a(C13748k<C13326a<C13645c>> kVar, int i, int i2) {
            super(kVar);
            this.f36482a = i;
            this.f36483b = i2;
        }
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13326a<C13645c>> kVar, C13700an anVar) {
        if (!anVar.mo33339f() || this.f36481d) {
            this.f36478a.mo33296a(new C13744a(kVar, this.f36479b, this.f36480c), anVar);
        } else {
            this.f36478a.mo33296a(kVar, anVar);
        }
    }

    public C13743i(C13699am<C13326a<C13645c>> amVar, int i, int i2, boolean z) {
        boolean z2;
        if (i <= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13307g.m38943a(z2);
        this.f36478a = (C13699am) C13307g.m38940a(amVar);
        this.f36479b = i;
        this.f36480c = i2;
        this.f36481d = z;
    }
}
