package com.facebook.imagepipeline.p724k;

import com.facebook.common.internal.C13300b;
import com.facebook.common.memory.C13322g;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.ac */
public abstract class C13668ac implements C13699am<C13647e> {

    /* renamed from: a */
    private final Executor f36298a;

    /* renamed from: b */
    private final C13322g f36299b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13647e mo33297a(ImageRequest imageRequest) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo33298a();

    protected C13668ac(Executor executor, C13322g gVar) {
        this.f36298a = executor;
        this.f36299b = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C13647e mo33304b(InputStream inputStream, int i) throws IOException {
        return mo33303a(inputStream, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13647e mo33303a(InputStream inputStream, int i) throws IOException {
        C13326a a;
        if (i <= 0) {
            try {
                a = C13326a.m38995a(this.f36299b.mo32589a(inputStream));
            } catch (Throwable th) {
                C13300b.m38927a(inputStream);
                C13326a.m39001c(null);
                throw th;
            }
        } else {
            a = C13326a.m38995a(this.f36299b.mo32590a(inputStream, i));
        }
        C13326a aVar = a;
        C13647e eVar = new C13647e(aVar);
        C13300b.m38927a(inputStream);
        C13326a.m39001c(aVar);
        return eVar;
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        final C13702ap c = anVar.mo33336c();
        final String b = anVar.mo33335b();
        final ImageRequest a = anVar.mo33333a();
        final C136691 r0 = new C13712au<C13647e>(kVar, c, mo33298a(), b) {
            /* access modifiers changed from: private */
            /* renamed from: d */
            public C13647e mo32537c() throws Exception {
                C13647e a = C13668ac.this.mo33297a(a);
                if (a == null) {
                    c.onUltimateProducerReached(b, C13668ac.this.mo33298a(), false);
                    return null;
                }
                a.mo33282j();
                c.onUltimateProducerReached(b, C13668ac.this.mo33298a(), true);
                return a;
            }

            /* renamed from: a */
            private static void m40307a(C13647e eVar) {
                C13647e.m40237d(eVar);
            }

            /* renamed from: b */
            public final /* synthetic */ void mo32536b(Object obj) {
                m40307a((C13647e) obj);
            }
        };
        anVar.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                r0.mo32532a();
            }
        });
        this.f36298a.execute(r0);
    }
}
