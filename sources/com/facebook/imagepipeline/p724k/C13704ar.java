package com.facebook.imagepipeline.p724k;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13647e;

/* renamed from: com.facebook.imagepipeline.k.ar */
public final class C13704ar implements C13699am<C13326a<PooledByteBuffer>> {

    /* renamed from: a */
    private final C13699am<C13647e> f36380a;

    /* renamed from: com.facebook.imagepipeline.k.ar$a */
    class C13706a extends C13756n<C13647e, C13326a<PooledByteBuffer>> {
        private C13706a(C13748k<C13326a<PooledByteBuffer>> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            C13326a aVar = null;
            try {
                if (C13647e.m40238e(eVar)) {
                    aVar = eVar.mo33271b();
                }
                this.f36516e.mo33354b(aVar, i);
            } finally {
                C13326a.m39001c(aVar);
            }
        }
    }

    public C13704ar(C13699am<C13647e> amVar) {
        this.f36380a = amVar;
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13326a<PooledByteBuffer>> kVar, C13700an anVar) {
        this.f36380a.mo33296a(new C13706a(kVar), anVar);
    }
}
