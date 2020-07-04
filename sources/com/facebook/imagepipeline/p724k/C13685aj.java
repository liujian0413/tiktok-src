package com.facebook.imagepipeline.p724k;

import android.net.Uri;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.C13316a;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.C13324i;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.common.C13593a;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.k.aj */
public final class C13685aj implements C13699am<C13647e> {

    /* renamed from: a */
    private final C13561e f36333a;

    /* renamed from: b */
    private final C13568f f36334b;

    /* renamed from: c */
    private final C13322g f36335c;

    /* renamed from: d */
    private final C13316a f36336d;

    /* renamed from: e */
    private final C13699am<C13647e> f36337e;

    /* renamed from: com.facebook.imagepipeline.k.aj$a */
    static class C13688a extends C13756n<C13647e, C13647e> {

        /* renamed from: a */
        private final C13561e f36346a;

        /* renamed from: b */
        private final C13265a f36347b;

        /* renamed from: c */
        private final C13322g f36348c;

        /* renamed from: d */
        private final C13316a f36349d;

        /* renamed from: f */
        private final C13647e f36350f;

        /* renamed from: a */
        private void m40388a(C13324i iVar) {
            C13647e eVar;
            Throwable th;
            C13326a a = C13326a.m38995a(iVar.mo32602a());
            try {
                eVar = new C13647e(a);
                try {
                    eVar.mo33282j();
                    this.f36516e.mo33354b(eVar, 1);
                    C13647e.m40237d(eVar);
                    C13326a.m39001c(a);
                } catch (Throwable th2) {
                    th = th2;
                    C13647e.m40237d(eVar);
                    C13326a.m39001c(a);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                eVar = null;
                th = th4;
                C13647e.m40237d(eVar);
                C13326a.m39001c(a);
                throw th;
            }
        }

        /* renamed from: a */
        private C13324i m40387a(C13647e eVar, C13647e eVar2) throws IOException {
            C13324i a = this.f36348c.mo32593a(eVar2.mo33281i() + eVar2.f36265h.f35999a);
            m40390a(eVar.mo33274c(), a, eVar2.f36265h.f35999a);
            m40390a(eVar2.mo33274c(), a, eVar2.mo33281i());
            return a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            if (!m40494b(i)) {
                if (this.f36350f == null || eVar.f36265h == null) {
                    if (m40495b(i, 8) && m40493a(i) && eVar.mo33276d() != C13509c.f35837a) {
                        this.f36346a.mo33101a(this.f36347b, eVar);
                    }
                    this.f36516e.mo33354b(eVar, i);
                    return;
                }
                try {
                    m40388a(m40387a(this.f36350f, eVar));
                } catch (IOException e) {
                    C13286a.m38861c("PartialDiskCacheProducer", "Error while merging image data", (Throwable) e);
                    this.f36516e.mo33355b((Throwable) e);
                } catch (Throwable th) {
                    eVar.close();
                    this.f36350f.close();
                    throw th;
                }
                eVar.close();
                this.f36350f.close();
                this.f36346a.mo33107g(this.f36347b);
            }
        }

        /* renamed from: a */
        private void m40390a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = (byte[]) this.f36349d.mo32581a(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f36349d.mo32582a(bArr);
                    throw th;
                }
            }
            this.f36349d.mo32582a(bArr);
            if (i2 > 0) {
                throw new IOException(C1642a.m8035a(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
        }

        private C13688a(C13748k<C13647e> kVar, C13561e eVar, C13265a aVar, C13322g gVar, C13316a aVar2, C13647e eVar2) {
            super(kVar);
            this.f36346a = eVar;
            this.f36347b = aVar;
            this.f36348c = gVar;
            this.f36349d = aVar2;
            this.f36350f = eVar2;
        }
    }

    /* renamed from: a */
    private static Uri m40378a(ImageRequest imageRequest) {
        return imageRequest.mSourceUri.buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    /* renamed from: a */
    public static boolean m40382a(C1592h<?> hVar) {
        if (hVar.mo6887c() || (hVar.mo6889d() && (hVar.mo6891f() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m40381a(final AtomicBoolean atomicBoolean, C13700an anVar) {
        anVar.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        ImageRequest a = anVar.mo33333a();
        if (!a.mIsDiskCacheEnabled) {
            this.f36337e.mo33296a(kVar, anVar);
            return;
        }
        anVar.mo33336c().onProducerStart(anVar.mo33335b(), "PartialDiskCacheProducer");
        C13265a a2 = this.f36334b.mo33113a(a, m40378a(a), anVar.mo33337d());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f36333a.mo32483a(a2, atomicBoolean).mo6875a(m40379a(kVar, anVar, a2));
        m40381a(atomicBoolean, anVar);
    }

    /* renamed from: a */
    private C1591g<C13647e, Void> m40379a(C13748k<C13647e> kVar, C13700an anVar, C13265a aVar) {
        final String b = anVar.mo33335b();
        final C13702ap c = anVar.mo33336c();
        final C13748k<C13647e> kVar2 = kVar;
        final C13700an anVar2 = anVar;
        final C13265a aVar2 = aVar;
        C136861 r0 = new C1591g<C13647e, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<C13647e> hVar) throws Exception {
                if (C13685aj.m40382a(hVar)) {
                    c.onProducerFinishWithCancellation(b, "PartialDiskCacheProducer", null);
                    kVar2.mo33352b();
                } else if (hVar.mo6889d()) {
                    c.onProducerFinishWithFailure(b, "PartialDiskCacheProducer", hVar.mo6891f(), null);
                    C13685aj.this.mo33327a(kVar2, anVar2, aVar2, (C13647e) null);
                } else {
                    C13647e eVar = (C13647e) hVar.mo6890e();
                    if (eVar != null) {
                        c.onProducerFinishWithSuccess(b, "PartialDiskCacheProducer", C13685aj.m40380a(c, b, true, eVar.mo33281i()));
                        C13593a b = C13593a.m39999b(eVar.mo33281i() - 1);
                        eVar.f36265h = b;
                        int i = eVar.mo33281i();
                        ImageRequest a = anVar2.mo33333a();
                        if (b.mo33144a(a.mBytesRange)) {
                            c.onUltimateProducerReached(b, "PartialDiskCacheProducer", true);
                            kVar2.mo33354b(eVar, 9);
                        } else {
                            kVar2.mo33354b(eVar, 8);
                            C13685aj.this.mo33327a(kVar2, (C13700an) new C13711at(ImageRequestBuilder.m40866a(a).mo33466a(C13593a.m39997a(i - 1)).mo33476b(), anVar2), aVar2, eVar);
                        }
                    } else {
                        c.onProducerFinishWithSuccess(b, "PartialDiskCacheProducer", C13685aj.m40380a(c, b, false, 0));
                        C13685aj.this.mo33327a(kVar2, anVar2, aVar2, eVar);
                    }
                }
                return null;
            }
        };
        return r0;
    }

    /* renamed from: a */
    static Map<String, String> m40380a(C13702ap apVar, String str, boolean z, int i) {
        if (!apVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return ImmutableMap.m38918of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return ImmutableMap.m38917of("cached_value_found", String.valueOf(z));
    }

    /* renamed from: a */
    public final void mo33327a(C13748k<C13647e> kVar, C13700an anVar, C13265a aVar, C13647e eVar) {
        C13688a aVar2 = new C13688a(kVar, this.f36333a, aVar, this.f36335c, this.f36336d, eVar);
        this.f36337e.mo33296a(aVar2, anVar);
    }

    public C13685aj(C13561e eVar, C13568f fVar, C13322g gVar, C13316a aVar, C13699am<C13647e> amVar) {
        this.f36333a = eVar;
        this.f36334b = fVar;
        this.f36335c = gVar;
        this.f36336d = aVar;
        this.f36337e = amVar;
    }
}
