package com.facebook.imagepipeline.p724k;

import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.C13326a;
import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.s */
public final class C13765s implements C13699am<C13647e> {

    /* renamed from: a */
    private final C13585p<C13265a, PooledByteBuffer> f36537a;

    /* renamed from: b */
    private final C13568f f36538b;

    /* renamed from: c */
    private final C13699am<C13647e> f36539c;

    /* renamed from: com.facebook.imagepipeline.k.s$a */
    static class C13766a extends C13756n<C13647e, C13647e> {

        /* renamed from: a */
        private final C13585p<C13265a, PooledByteBuffer> f36540a;

        /* renamed from: b */
        private final C13265a f36541b;

        /* renamed from: c */
        private final boolean f36542c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            C13326a b;
            C13326a aVar;
            C13647e eVar2;
            try {
                if (C13783b.m40665b()) {
                    C13783b.m40664a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!m40494b(i) && eVar != null && !m40496c(i, 10)) {
                    if (eVar.mo33276d() != C13509c.f35837a) {
                        b = eVar.mo33271b();
                        if (b != null) {
                            aVar = null;
                            if (this.f36542c) {
                                aVar = this.f36540a.mo33129a(this.f36541b, b);
                            }
                            C13326a.m39001c(b);
                            if (aVar != null) {
                                eVar2 = new C13647e(aVar);
                                eVar2.mo33273b(eVar);
                                C13326a.m39001c(aVar);
                                this.f36516e.mo33353b(1.0f);
                                this.f36516e.mo33354b(eVar2, i);
                                C13647e.m40237d(eVar2);
                                if (C13783b.m40665b()) {
                                    C13783b.m40663a();
                                }
                                return;
                            }
                        }
                        this.f36516e.mo33354b(eVar, i);
                        if (C13783b.m40665b()) {
                            C13783b.m40663a();
                            return;
                        }
                        return;
                    }
                }
                this.f36516e.mo33354b(eVar, i);
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            } catch (Throwable th) {
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                throw th;
            }
        }

        public C13766a(C13748k<C13647e> kVar, C13585p<C13265a, PooledByteBuffer> pVar, C13265a aVar, boolean z) {
            super(kVar);
            this.f36540a = pVar;
            this.f36541b = aVar;
            this.f36542c = z;
        }
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        Map map;
        C13647e eVar;
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("EncodedMemoryCacheProducer#produceResults");
            }
            String b = anVar.mo33335b();
            C13702ap c = anVar.mo33336c();
            c.onProducerStart(b, "EncodedMemoryCacheProducer");
            C13265a c2 = this.f36538b.mo33116c(anVar.mo33333a(), anVar.mo33337d());
            C13326a a = this.f36537a.mo33128a(c2);
            Map map2 = null;
            if (a != null) {
                try {
                    eVar = new C13647e(a);
                    String str = "EncodedMemoryCacheProducer";
                    if (c.requiresExtraMap(b)) {
                        map2 = ImmutableMap.m38917of("cached_value_found", "true");
                    }
                    c.onProducerFinishWithSuccess(b, str, map2);
                    c.onUltimateProducerReached(b, "EncodedMemoryCacheProducer", true);
                    kVar.mo33353b(1.0f);
                    kVar.mo33354b(eVar, 1);
                    C13647e.m40237d(eVar);
                    C13326a.m39001c(a);
                } catch (Throwable th) {
                    C13326a.m39001c(a);
                    throw th;
                }
            } else if (anVar.mo33338e().getValue() >= RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                String str2 = "EncodedMemoryCacheProducer";
                if (c.requiresExtraMap(b)) {
                    map = ImmutableMap.m38917of("cached_value_found", "false");
                } else {
                    map = null;
                }
                c.onProducerFinishWithSuccess(b, str2, map);
                c.onUltimateProducerReached(b, "EncodedMemoryCacheProducer", false);
                kVar.mo33354b(null, 1);
                C13326a.m39001c(a);
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            } else {
                C13766a aVar = new C13766a(kVar, this.f36537a, c2, anVar.mo33333a().mIsMemoryCacheEnabled);
                String str3 = "EncodedMemoryCacheProducer";
                if (c.requiresExtraMap(b)) {
                    map2 = ImmutableMap.m38917of("cached_value_found", "false");
                }
                c.onProducerFinishWithSuccess(b, str3, map2);
                this.f36539c.mo33296a(aVar, anVar);
                C13326a.m39001c(a);
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            }
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    public C13765s(C13585p<C13265a, PooledByteBuffer> pVar, C13568f fVar, C13699am<C13647e> amVar) {
        this.f36537a = pVar;
        this.f36538b = fVar;
        this.f36539c = amVar;
    }
}
