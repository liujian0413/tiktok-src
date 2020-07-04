package com.facebook.imagepipeline.p724k;

import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.C13324i;
import com.facebook.common.references.C13326a;
import com.facebook.common.util.TriState;
import com.facebook.imageformat.C13508b;
import com.facebook.imageformat.C13509c;
import com.facebook.imageformat.C13511d;
import com.facebook.imagepipeline.nativecode.C13839e;
import com.facebook.imagepipeline.nativecode.C13840f;
import com.facebook.imagepipeline.p720g.C13647e;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.bd */
public final class C13733bd implements C13699am<C13647e> {

    /* renamed from: a */
    public final C13322g f36453a;

    /* renamed from: b */
    private final Executor f36454b;

    /* renamed from: c */
    private final C13699am<C13647e> f36455c;

    /* renamed from: com.facebook.imagepipeline.k.bd$a */
    class C13735a extends C13756n<C13647e, C13647e> {

        /* renamed from: b */
        private final C13700an f36459b;

        /* renamed from: c */
        private TriState f36460c = TriState.UNSET;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            if (this.f36460c == TriState.UNSET && eVar != null) {
                this.f36460c = C13733bd.m40515a(eVar);
            }
            if (this.f36460c == TriState.NO) {
                this.f36516e.mo33354b(eVar, i);
                return;
            }
            if (m40493a(i)) {
                if (this.f36460c != TriState.YES || eVar == null) {
                    this.f36516e.mo33354b(eVar, i);
                } else {
                    C13733bd.this.mo33357a(eVar, this.f36516e, this.f36459b);
                }
            }
        }

        public C13735a(C13748k<C13647e> kVar, C13700an anVar) {
            super(kVar);
            this.f36459b = anVar;
        }
    }

    /* renamed from: a */
    public static TriState m40515a(C13647e eVar) {
        C13307g.m38940a(eVar);
        C13509c a = C13511d.m39757a(eVar.mo33274c());
        if (C13508b.m39752b(a)) {
            C13839e a2 = C13840f.m40863a();
            if (a2 == null) {
                return TriState.NO;
            }
            return TriState.valueOf(!a2.isWebpNativelySupported(a));
        } else if (a == C13509c.f35837a) {
            return TriState.UNSET;
        } else {
            return TriState.NO;
        }
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        this.f36455c.mo33296a(new C13735a(kVar, anVar), anVar);
    }

    /* renamed from: a */
    public static void m40516a(C13647e eVar, C13324i iVar) throws Exception {
        InputStream c = eVar.mo33274c();
        C13509c a = C13511d.m39757a(c);
        if (a == C13508b.f35830f || a == C13508b.f35832h) {
            C13840f.m40863a().transcodeWebpToJpeg(c, iVar, 80);
            eVar.f36258a = C13508b.f35825a;
        } else if (a == C13508b.f35831g || a == C13508b.f35833i) {
            C13840f.m40863a().transcodeWebpToPng(c, iVar);
            eVar.f36258a = C13508b.f35826b;
        } else {
            throw new IllegalArgumentException("Wrong image format");
        }
    }

    public C13733bd(Executor executor, C13322g gVar, C13699am<C13647e> amVar) {
        this.f36454b = (Executor) C13307g.m38940a(executor);
        this.f36453a = (C13322g) C13307g.m38940a(gVar);
        this.f36455c = (C13699am) C13307g.m38940a(amVar);
    }

    /* renamed from: a */
    public final void mo33357a(C13647e eVar, C13748k<C13647e> kVar, C13700an anVar) {
        C13307g.m38940a(eVar);
        final C13647e a = C13647e.m40235a(eVar);
        C137341 r0 = new C13712au<C13647e>(kVar, anVar.mo33336c(), "WebpTranscodeProducer", anVar.mo33335b()) {
            /* renamed from: b */
            public final void mo32535b() {
                C13647e.m40237d(a);
                super.mo32535b();
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public C13647e mo32537c() throws Exception {
                C13326a a;
                C13324i a2 = C13733bd.this.f36453a.mo32592a();
                try {
                    C13733bd.m40516a(a, a2);
                    a = C13326a.m38995a(a2.mo32602a());
                    C13647e eVar = new C13647e(a);
                    eVar.mo33273b(a);
                    C13326a.m39001c(a);
                    a2.close();
                    return eVar;
                } catch (Throwable th) {
                    a2.close();
                    throw th;
                }
            }

            /* renamed from: a */
            private static void m40519a(C13647e eVar) {
                C13647e.m40237d(eVar);
            }

            /* renamed from: b */
            public final /* synthetic */ void mo32536b(Object obj) {
                m40519a((C13647e) obj);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo32534a(C13647e eVar) {
                C13647e.m40237d(a);
                super.mo32534a(eVar);
            }

            /* renamed from: a */
            public final void mo32533a(Exception exc) {
                C13647e.m40237d(a);
                super.mo32533a(exc);
            }
        };
        this.f36454b.execute(r0);
    }
}
