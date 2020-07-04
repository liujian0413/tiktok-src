package com.facebook.imagepipeline.p724k;

import bolts.C1591g;
import bolts.C1592h;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.k.o */
public class C13757o implements C13699am<C13647e> {

    /* renamed from: a */
    public final C13699am<C13647e> f36517a;

    /* renamed from: b */
    private final C13561e f36518b;

    /* renamed from: c */
    private final C13561e f36519c;

    /* renamed from: d */
    private final C13568f f36520d;

    /* renamed from: a */
    public static boolean m40608a(C1592h<?> hVar) {
        if (hVar.mo6887c() || (hVar.mo6889d() && (hVar.mo6891f() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m40607a(final AtomicBoolean atomicBoolean, C13700an anVar) {
        anVar.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* renamed from: b */
    private C1591g<C13647e, Void> m40609b(C13748k<C13647e> kVar, C13700an anVar) {
        final String b = anVar.mo33335b();
        final C13702ap c = anVar.mo33336c();
        final C13748k<C13647e> kVar2 = kVar;
        final C13700an anVar2 = anVar;
        C137581 r0 = new C1591g<C13647e, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<C13647e> hVar) throws Exception {
                if (C13757o.m40608a(hVar)) {
                    c.onProducerFinishWithCancellation(b, "DiskCacheProducer", null);
                    kVar2.mo33352b();
                } else if (hVar.mo6889d()) {
                    c.onProducerFinishWithFailure(b, "DiskCacheProducer", hVar.mo6891f(), null);
                    C13757o.this.f36517a.mo33296a(kVar2, anVar2);
                } else {
                    C13647e eVar = (C13647e) hVar.mo6890e();
                    if (eVar != null) {
                        c.onProducerFinishWithSuccess(b, "DiskCacheProducer", C13757o.m40606a(c, b, true, eVar.mo33281i()));
                        c.onUltimateProducerReached(b, "DiskCacheProducer", true);
                        kVar2.mo33353b(1.0f);
                        kVar2.mo33354b(eVar, 1);
                        eVar.close();
                    } else {
                        c.onProducerFinishWithSuccess(b, "DiskCacheProducer", C13757o.m40606a(c, b, false, 0));
                        C13757o.this.f36517a.mo33296a(kVar2, anVar2);
                    }
                }
                return null;
            }
        };
        return r0;
    }

    /* renamed from: c */
    private void m40610c(C13748k<C13647e> kVar, C13700an anVar) {
        if (anVar.mo33338e().getValue() >= RequestLevel.DISK_CACHE.getValue()) {
            kVar.mo33354b(null, 1);
        } else {
            this.f36517a.mo33296a(kVar, anVar);
        }
    }

    /* renamed from: a */
    public void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        boolean z;
        C13561e eVar;
        ImageRequest a = anVar.mo33333a();
        if (!a.mIsDiskCacheEnabled) {
            m40610c(kVar, anVar);
            return;
        }
        anVar.mo33336c().onProducerStart(anVar.mo33335b(), "DiskCacheProducer");
        C13265a c = this.f36520d.mo33116c(a, anVar.mo33337d());
        if (a.mCacheChoice == CacheChoice.SMALL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar = this.f36519c;
        } else {
            eVar = this.f36518b;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.mo32483a(c, atomicBoolean).mo6875a(m40609b(kVar, anVar));
        m40607a(atomicBoolean, anVar);
    }

    public C13757o(C13561e eVar, C13561e eVar2, C13568f fVar, C13699am<C13647e> amVar) {
        this.f36518b = eVar;
        this.f36519c = eVar2;
        this.f36520d = fVar;
        this.f36517a = amVar;
    }

    /* renamed from: a */
    static Map<String, String> m40606a(C13702ap apVar, String str, boolean z, int i) {
        if (!apVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return ImmutableMap.m38918of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return ImmutableMap.m38917of("cached_value_found", String.valueOf(z));
    }
}
