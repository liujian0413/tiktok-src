package com.facebook.imagepipeline.p724k;

import android.util.Pair;
import com.facebook.common.internal.C13307g;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.az */
public final class C13724az<T> implements C13699am<T> {

    /* renamed from: a */
    public int f36439a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<Pair<C13748k<T>, C13700an>> f36440b;

    /* renamed from: c */
    public final Executor f36441c;

    /* renamed from: d */
    private final C13699am<T> f36442d;

    /* renamed from: e */
    private final int f36443e = 5;

    /* renamed from: com.facebook.imagepipeline.k.az$a */
    class C13726a extends C13756n<T, T> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33254a() {
            this.f36516e.mo33352b();
            m40486c();
        }

        /* renamed from: c */
        private void m40486c() {
            final Pair pair;
            synchronized (C13724az.this) {
                pair = (Pair) C13724az.this.f36440b.poll();
                if (pair == null) {
                    C13724az.this.f36439a--;
                }
            }
            if (pair != null) {
                C13724az.this.f36441c.execute(new Runnable() {
                    public final void run() {
                        C13724az.this.mo33350b((C13748k) pair.first, (C13700an) pair.second);
                    }
                });
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33257a(Throwable th) {
            this.f36516e.mo33355b(th);
            m40486c();
        }

        private C13726a(C13748k<T> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33256a(T t, int i) {
            this.f36516e.mo33354b(t, i);
            if (m40493a(i)) {
                m40486c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33350b(C13748k<T> kVar, C13700an anVar) {
        anVar.mo33336c().onProducerFinishWithSuccess(anVar.mo33335b(), "ThrottlingProducer", null);
        this.f36442d.mo33296a(new C13726a(kVar), anVar);
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<T> kVar, C13700an anVar) {
        boolean z;
        anVar.mo33336c().onProducerStart(anVar.mo33335b(), "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.f36439a >= this.f36443e) {
                this.f36440b.add(Pair.create(kVar, anVar));
            } else {
                this.f36439a++;
                z = false;
            }
        }
        if (!z) {
            mo33350b(kVar, anVar);
        }
    }

    public C13724az(int i, Executor executor, C13699am<T> amVar) {
        this.f36441c = (Executor) C13307g.m38940a(executor);
        this.f36442d = (C13699am) C13307g.m38940a(amVar);
        this.f36440b = new ConcurrentLinkedQueue<>();
        this.f36439a = 0;
    }
}
