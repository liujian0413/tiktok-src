package com.facebook.imagepipeline.p724k;

import bolts.C1591g;
import bolts.C1592h;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.p683a.C13261k;
import com.facebook.cache.p683a.C13264m;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.k.aw */
public final class C13715aw extends C13757o {

    /* renamed from: b */
    public final C13561e f36404b;

    /* renamed from: c */
    public final C13561e f36405c;

    /* renamed from: d */
    public final boolean f36406d;

    /* renamed from: e */
    public final int f36407e;

    /* renamed from: f */
    private final C13568f f36408f;

    /* renamed from: g */
    private final C13699am<C13647e> f36409g;

    /* renamed from: com.facebook.imagepipeline.k.aw$a */
    public class C13719a extends C13756n<C13647e, C13647e> {

        /* renamed from: a */
        public C13647e f36423a;

        /* renamed from: c */
        private final C13561e f36425c;

        /* renamed from: d */
        private final C13265a f36426d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            if (eVar != null && m40493a(i) && !(eVar instanceof C13264m)) {
                if (C13715aw.this.f36406d) {
                    int i2 = eVar.mo33281i();
                    if (i2 <= 0 || i2 >= C13715aw.this.f36407e) {
                        C13715aw.this.f36404b.mo33101a(this.f36426d, eVar);
                    } else {
                        C13715aw.this.f36405c.mo33101a(this.f36426d, eVar);
                    }
                } else {
                    this.f36425c.mo33101a(this.f36426d, eVar);
                }
            }
            this.f36516e.mo33354b(eVar, i);
        }

        private C13719a(C13748k<C13647e> kVar, C13561e eVar, C13265a aVar, C13647e eVar2) {
            super(kVar);
            this.f36425c = eVar;
            this.f36426d = aVar;
            this.f36423a = eVar2;
        }
    }

    /* renamed from: b */
    public static boolean m40465b(C1592h<?> hVar) {
        if (hVar.mo6887c() || (hVar.mo6889d() && (hVar.mo6891f() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m40464a(final AtomicBoolean atomicBoolean, C13700an anVar) {
        anVar.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        boolean z;
        C13561e eVar;
        C1592h hVar;
        final C13561e eVar2;
        C13561e eVar3;
        C1592h hVar2;
        ImageRequest a = anVar.mo33333a();
        if (!a.mIsDiskCacheEnabled) {
            mo33344a(kVar, kVar, anVar);
            return;
        }
        anVar.mo33336c().onProducerStart(anVar.mo33335b(), "DiskCacheProducer");
        final C13265a c = this.f36408f.mo33116c(a, anVar.mo33337d());
        if (a.mCacheChoice == CacheChoice.SMALL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar = this.f36405c;
        } else {
            eVar = this.f36404b;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.f36406d) {
            boolean c2 = this.f36405c.mo33103c(c);
            boolean c3 = this.f36404b.mo33103c(c);
            if (c2 || !c3) {
                eVar3 = this.f36405c;
                eVar2 = this.f36404b;
            } else {
                eVar3 = this.f36404b;
                eVar2 = this.f36405c;
            }
            if (eVar3 instanceof C13261k) {
                hVar2 = ((C13261k) eVar3).mo32484a(c, atomicBoolean, false);
            } else {
                hVar2 = eVar3.mo32483a(c, atomicBoolean);
            }
            hVar = hVar2.mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C1591g<C13647e, C1592h<C13647e>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C1592h<C13647e> then(C1592h<C13647e> hVar) throws Exception {
                    if (C13715aw.m40465b(hVar) || (!hVar.mo6889d() && hVar.mo6890e() != null)) {
                        return hVar;
                    }
                    if (eVar2 instanceof C13261k) {
                        return ((C13261k) eVar2).mo32484a(c, atomicBoolean, false);
                    }
                    return eVar2.mo32483a(c, atomicBoolean);
                }
            });
        } else if (eVar instanceof C13261k) {
            hVar = ((C13261k) eVar).mo32484a(c, atomicBoolean, false);
        } else {
            hVar = eVar.mo32483a(c, atomicBoolean);
        }
        hVar.mo6875a(m40463a(kVar, eVar, c, anVar));
        m40464a(atomicBoolean, anVar);
    }

    /* renamed from: a */
    public final void mo33344a(C13748k<C13647e> kVar, C13748k<C13647e> kVar2, C13700an anVar) {
        if (anVar.mo33338e().getValue() >= RequestLevel.DISK_CACHE.getValue()) {
            kVar.mo33354b(null, 1);
        } else {
            this.f36409g.mo33296a(kVar2, anVar);
        }
    }

    /* renamed from: a */
    private C1591g<C13647e, Void> m40463a(C13748k<C13647e> kVar, C13561e eVar, C13265a aVar, C13700an anVar) {
        final String b = anVar.mo33335b();
        final C13702ap c = anVar.mo33336c();
        final C13748k<C13647e> kVar2 = kVar;
        final C13561e eVar2 = eVar;
        final C13265a aVar2 = aVar;
        final C13700an anVar2 = anVar;
        C137172 r0 = new C1591g<C13647e, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<C13647e> hVar) throws Exception {
                if (C13715aw.m40465b(hVar)) {
                    c.onProducerFinishWithCancellation(b, "DiskCacheProducer", null);
                    kVar2.mo33352b();
                } else if (hVar.mo6889d()) {
                    c.onProducerFinishWithFailure(b, "DiskCacheProducer", hVar.mo6891f(), null);
                    C13715aw awVar = C13715aw.this;
                    C13748k kVar = kVar2;
                    C13719a aVar = new C13719a(kVar2, eVar2, aVar2, null);
                    awVar.mo33344a(kVar, aVar, anVar2);
                } else {
                    C13647e eVar = (C13647e) hVar.mo6890e();
                    if (eVar == null || (eVar instanceof C13264m)) {
                        c.onProducerFinishWithSuccess(b, "DiskCacheProducer", C13757o.m40606a(c, b, false, eVar.mo33281i()));
                        C13715aw awVar2 = C13715aw.this;
                        C13748k kVar2 = kVar2;
                        C13719a aVar2 = new C13719a(kVar2, eVar2, aVar2, eVar);
                        awVar2.mo33344a(kVar2, aVar2, anVar2);
                    } else {
                        c.onProducerFinishWithSuccess(b, "DiskCacheProducer", C13757o.m40606a(c, b, true, eVar.mo33281i()));
                        kVar2.mo33353b(1.0f);
                        kVar2.mo33354b(eVar, 1);
                        eVar.close();
                    }
                }
                return null;
            }
        };
        return r0;
    }
}
