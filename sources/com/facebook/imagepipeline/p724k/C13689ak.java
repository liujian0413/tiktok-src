package com.facebook.imagepipeline.p724k;

import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.C13843c;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.ak */
public final class C13689ak implements C13699am<C13326a<C13645c>> {

    /* renamed from: a */
    private final C13585p<C13265a, C13645c> f36351a;

    /* renamed from: b */
    private final C13568f f36352b;

    /* renamed from: c */
    private final C13699am<C13326a<C13645c>> f36353c;

    /* renamed from: com.facebook.imagepipeline.k.ak$a */
    public static class C13690a extends C13756n<C13326a<C13645c>, C13326a<C13645c>> {

        /* renamed from: a */
        private final C13265a f36354a;

        /* renamed from: b */
        private final boolean f36355b;

        /* renamed from: c */
        private final C13585p<C13265a, C13645c> f36356c;

        /* renamed from: d */
        private final boolean f36357d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13326a<C13645c> aVar, int i) {
            C13326a<C13645c> aVar2 = null;
            if (aVar == null) {
                if (m40493a(i)) {
                    this.f36516e.mo33354b(aVar2, i);
                }
            } else if (!m40494b(i) || this.f36355b) {
                if (this.f36357d) {
                    aVar2 = this.f36356c.mo33129a(this.f36354a, aVar);
                }
                try {
                    this.f36516e.mo33353b(1.0f);
                    C13748k<O> kVar = this.f36516e;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    kVar.mo33354b(aVar, i);
                } finally {
                    C13326a.m39001c(aVar2);
                }
            }
        }

        public C13690a(C13748k<C13326a<C13645c>> kVar, C13265a aVar, boolean z, C13585p<C13265a, C13645c> pVar, boolean z2) {
            super(kVar);
            this.f36354a = aVar;
            this.f36355b = z;
            this.f36356c = pVar;
            this.f36357d = z2;
        }
    }

    /* renamed from: a */
    private static String m40392a() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13326a<C13645c>> kVar, C13700an anVar) {
        C13702ap c = anVar.mo33336c();
        String b = anVar.mo33335b();
        ImageRequest a = anVar.mo33333a();
        Object d = anVar.mo33337d();
        C13842b bVar = a.mPostprocessor;
        if (bVar == null || bVar.getPostprocessorCacheKey() == null) {
            this.f36353c.mo33296a(kVar, anVar);
            return;
        }
        c.onProducerStart(b, m40392a());
        C13265a b2 = this.f36352b.mo33115b(a, d);
        C13326a a2 = this.f36351a.mo33128a(b2);
        Map map = null;
        if (a2 != null) {
            String a3 = m40392a();
            if (c.requiresExtraMap(b)) {
                map = ImmutableMap.m38917of("cached_value_found", "true");
            }
            c.onProducerFinishWithSuccess(b, a3, map);
            c.onUltimateProducerReached(b, "PostprocessedBitmapMemoryCacheProducer", true);
            kVar.mo33353b(1.0f);
            kVar.mo33354b(a2, 1);
            a2.close();
            return;
        }
        C13748k<C13326a<C13645c>> kVar2 = kVar;
        C13690a aVar = new C13690a(kVar2, b2, bVar instanceof C13843c, this.f36351a, anVar.mo33333a().mIsMemoryCacheEnabled);
        String a4 = m40392a();
        if (c.requiresExtraMap(b)) {
            map = ImmutableMap.m38917of("cached_value_found", "false");
        }
        c.onProducerFinishWithSuccess(b, a4, map);
        this.f36353c.mo33296a(aVar, anVar);
    }

    public C13689ak(C13585p<C13265a, C13645c> pVar, C13568f fVar, C13699am<C13326a<C13645c>> amVar) {
        this.f36351a = pVar;
        this.f36352b = fVar;
        this.f36353c = amVar;
    }
}
