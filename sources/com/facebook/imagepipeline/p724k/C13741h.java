package com.facebook.imagepipeline.p724k;

import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13650h;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.h */
public class C13741h implements C13699am<C13326a<C13645c>> {

    /* renamed from: a */
    public final C13585p<C13265a, C13645c> f36472a;

    /* renamed from: b */
    private final C13568f f36473b;

    /* renamed from: c */
    private final C13699am<C13326a<C13645c>> f36474c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo33363a() {
        return "BitmapMemoryCacheProducer";
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13326a<C13645c>> kVar, C13700an anVar) {
        Map map;
        Map map2;
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("BitmapMemoryCacheProducer#produceResults");
            }
            C13702ap c = anVar.mo33336c();
            String b = anVar.mo33335b();
            c.onProducerStart(b, mo33363a());
            C13265a a = this.f36473b.mo33114a(anVar.mo33333a(), anVar.mo33337d());
            C13326a a2 = this.f36472a.mo33128a(a);
            Map map3 = null;
            if (a2 != null) {
                boolean c2 = ((C13645c) a2.mo32609a()).mo33266e().mo33285c();
                if (c2) {
                    String a3 = mo33363a();
                    if (c.requiresExtraMap(b)) {
                        map2 = ImmutableMap.m38917of("cached_value_found", "true");
                    } else {
                        map2 = null;
                    }
                    c.onProducerFinishWithSuccess(b, a3, map2);
                    c.onUltimateProducerReached(b, mo33363a(), true);
                    kVar.mo33353b(1.0f);
                }
                kVar.mo33354b(a2, C13728b.m40491a(c2));
                a2.close();
                if (c2) {
                    return;
                }
            }
            if (anVar.mo33338e().getValue() >= RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                String a4 = mo33363a();
                if (c.requiresExtraMap(b)) {
                    map = ImmutableMap.m38917of("cached_value_found", "false");
                } else {
                    map = null;
                }
                c.onProducerFinishWithSuccess(b, a4, map);
                c.onUltimateProducerReached(b, mo33363a(), false);
                kVar.mo33354b(null, 1);
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return;
            }
            C13748k a5 = mo33362a(kVar, a, anVar.mo33333a().mIsMemoryCacheEnabled);
            String a6 = mo33363a();
            if (c.requiresExtraMap(b)) {
                map3 = ImmutableMap.m38917of("cached_value_found", "false");
            }
            c.onProducerFinishWithSuccess(b, a6, map3);
            if (C13783b.m40665b()) {
                C13783b.m40664a("mInputProducer.produceResult");
            }
            this.f36474c.mo33296a(a5, anVar);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13748k<C13326a<C13645c>> mo33362a(C13748k<C13326a<C13645c>> kVar, final C13265a aVar, final boolean z) {
        return new C13756n<C13326a<C13645c>, C13326a<C13645c>>(kVar) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo33256a(C13326a<C13645c> aVar, int i) {
                C13326a<C13645c> aVar2;
                C13326a a;
                try {
                    if (C13783b.m40665b()) {
                        C13783b.m40664a("BitmapMemoryCacheProducer#onNewResultImpl");
                    }
                    boolean a2 = m40493a(i);
                    aVar2 = null;
                    if (aVar == null) {
                        if (a2) {
                            this.f36516e.mo33354b(null, i);
                        }
                        if (C13783b.m40665b()) {
                            C13783b.m40663a();
                        }
                        return;
                    }
                    if (!((C13645c) aVar.mo32609a()).mo33260c()) {
                        if (!m40495b(i, 8)) {
                            if (!a2) {
                                a = C13741h.this.f36472a.mo33128a(aVar);
                                if (a != null) {
                                    C13650h e = ((C13645c) aVar.mo32609a()).mo33266e();
                                    C13650h e2 = ((C13645c) a.mo32609a()).mo33266e();
                                    if (e2.mo33285c() || e2.mo33283a() >= e.mo33283a()) {
                                        this.f36516e.mo33354b(a, i);
                                        C13326a.m39001c(a);
                                        if (C13783b.m40665b()) {
                                            C13783b.m40663a();
                                        }
                                        return;
                                    }
                                    C13326a.m39001c(a);
                                }
                            }
                            if (z) {
                                aVar2 = C13741h.this.f36472a.mo33129a(aVar, aVar);
                            }
                            if (a2) {
                                this.f36516e.mo33353b(1.0f);
                            }
                            C13748k<O> kVar = this.f36516e;
                            if (aVar2 != null) {
                                aVar = aVar2;
                            }
                            kVar.mo33354b(aVar, i);
                            C13326a.m39001c(aVar2);
                            if (C13783b.m40665b()) {
                                C13783b.m40663a();
                                return;
                            }
                            return;
                        }
                    }
                    this.f36516e.mo33354b(aVar, i);
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
        };
    }

    public C13741h(C13585p<C13265a, C13645c> pVar, C13568f fVar, C13699am<C13326a<C13645c>> amVar) {
        this.f36472a = pVar;
        this.f36473b = fVar;
        this.f36474c = amVar;
    }
}
