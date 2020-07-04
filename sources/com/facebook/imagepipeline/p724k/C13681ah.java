package com.facebook.imagepipeline.p724k;

import android.os.SystemClock;
import com.facebook.common.memory.C13316a;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.C13324i;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.common.C13593a;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13683ai.C13684a;
import com.facebook.imagepipeline.p725l.C13783b;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.ah */
public final class C13681ah implements C13699am<C13647e> {

    /* renamed from: a */
    private final C13322g f36328a;

    /* renamed from: b */
    private final C13316a f36329b;

    /* renamed from: c */
    private final C13683ai f36330c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33322a(C13767t tVar, InputStream inputStream, int i) throws IOException {
        C13324i iVar;
        if (i > 0) {
            iVar = this.f36328a.mo32593a(i);
        } else {
            iVar = this.f36328a.mo32592a();
        }
        byte[] bArr = (byte[]) this.f36329b.mo32581a(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f36330c.onFetchCompletion(tVar, iVar.mo32603b());
                    m40368b(iVar, tVar);
                    return;
                } else if (read > 0) {
                    iVar.write(bArr, 0, read);
                    m40363a(iVar, tVar);
                    tVar.f36543d.mo33353b(m40360a(iVar.mo32603b(), i));
                }
            } finally {
                this.f36329b.mo32582a(bArr);
                iVar.close();
            }
        }
    }

    /* renamed from: b */
    private boolean m40369b(C13767t tVar) {
        if (!tVar.f36544e.mo33341h()) {
            return false;
        }
        return this.f36330c.shouldPropagate(tVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40366a(C13767t tVar) {
        tVar.mo33370b().onProducerFinishWithCancellation(tVar.mo33369a(), "NetworkFetchProducer", m40361a(tVar, -1));
        tVar.f36543d.mo33352b();
    }

    /* renamed from: a */
    private static float m40360a(int i, int i2) {
        if (i2 > 0) {
            return ((float) i) / ((float) i2);
        }
        double d = (double) (-i);
        Double.isNaN(d);
        return 1.0f - ((float) Math.exp(d / 50000.0d));
    }

    /* renamed from: a */
    private Map<String, String> m40361a(C13767t tVar, int i) {
        if (!tVar.mo33370b().requiresExtraMap(tVar.mo33369a())) {
            return null;
        }
        return this.f36330c.getExtraMap(tVar, i);
    }

    /* renamed from: b */
    private void m40368b(C13324i iVar, C13767t tVar) {
        Map a = m40361a(tVar, iVar.mo32603b());
        C13702ap b = tVar.mo33370b();
        b.onProducerFinishWithSuccess(tVar.mo33369a(), "NetworkFetchProducer", a);
        b.onUltimateProducerReached(tVar.mo33369a(), "NetworkFetchProducer", true);
        m40362a(iVar, tVar.f36546g | 1, tVar.f36547h, tVar.f36543d);
    }

    /* renamed from: a */
    private void m40363a(C13324i iVar, C13767t tVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (m40369b(tVar) && uptimeMillis - tVar.f36545f >= 100) {
            tVar.f36545f = uptimeMillis;
            tVar.mo33370b().onProducerEvent(tVar.mo33369a(), "NetworkFetchProducer", "intermediate_result");
            m40362a(iVar, tVar.f36546g, tVar.f36547h, tVar.f36543d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40367a(C13767t tVar, Throwable th) {
        String str;
        Map a = m40361a(tVar, -1);
        if (a == null) {
            a = new HashMap(1);
        }
        String str2 = "NetworkFetcher";
        if (this.f36330c == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f36330c.getClass().getName());
            sb.append(", ");
            sb.append(this.f36330c.toString());
            str = sb.toString();
        }
        a.put(str2, str);
        tVar.mo33370b().onProducerFinishWithFailure(tVar.mo33369a(), "NetworkFetchProducer", th, a);
        tVar.mo33370b().onUltimateProducerReached(tVar.mo33369a(), "NetworkFetchProducer", false);
        tVar.f36543d.mo33355b(th);
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        anVar.mo33336c().onProducerStart(anVar.mo33335b(), "NetworkFetchProducer");
        final C13767t createFetchState = this.f36330c.createFetchState(kVar, anVar);
        this.f36330c.fetch(createFetchState, new C13684a() {
            /* renamed from: a */
            public final void mo33323a() {
                C13681ah.this.m40366a(createFetchState);
            }

            /* renamed from: a */
            public final void mo33325a(Throwable th) {
                C13681ah.this.m40367a(createFetchState, th);
            }

            /* renamed from: a */
            public final void mo33324a(InputStream inputStream, int i) throws IOException {
                if (C13783b.m40665b()) {
                    C13783b.m40664a("NetworkFetcher->onResponse");
                }
                C13681ah.this.mo33322a(createFetchState, inputStream, i);
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            }
        });
    }

    public C13681ah(C13322g gVar, C13316a aVar, C13683ai aiVar) {
        this.f36328a = gVar;
        this.f36329b = aVar;
        this.f36330c = aiVar;
    }

    /* renamed from: a */
    private static void m40362a(C13324i iVar, int i, C13593a aVar, C13748k<C13647e> kVar) {
        C13647e eVar;
        C13326a a = C13326a.m38995a(iVar.mo32602a());
        try {
            eVar = new C13647e(a);
            try {
                eVar.f36265h = aVar;
                eVar.mo33282j();
                kVar.mo33354b(eVar, i);
                C13647e.m40237d(eVar);
                C13326a.m39001c(a);
            } catch (Throwable th) {
                th = th;
                C13647e.m40237d(eVar);
                C13326a.m39001c(a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            C13647e.m40237d(eVar);
            C13326a.m39001c(a);
            throw th;
        }
    }
}
