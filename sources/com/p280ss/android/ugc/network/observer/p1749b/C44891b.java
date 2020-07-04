package com.p280ss.android.ugc.network.observer.p1749b;

import java.util.concurrent.TimeUnit;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.network.observer.b.b */
public final class C44891b {

    /* renamed from: a */
    public C7321c f115435a;

    /* renamed from: com.ss.android.ugc.network.observer.b.b$a */
    public static final class C44892a implements C7498y<Long> {

        /* renamed from: a */
        final /* synthetic */ C44891b f115436a;

        /* renamed from: b */
        final /* synthetic */ C7562b f115437b;

        public final void onComplete() {
            this.f115436a.mo107346a();
        }

        /* renamed from: a */
        private void m141628a(long j) {
            this.f115437b.invoke(Long.valueOf(j));
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f115436a.mo107346a();
        }

        public final /* synthetic */ void onNext(Object obj) {
            m141628a(((Number) obj).longValue());
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "disposable");
            this.f115436a.f115435a = cVar;
        }

        C44892a(C44891b bVar, C7562b bVar2) {
            this.f115436a = bVar;
            this.f115437b = bVar2;
        }
    }

    /* renamed from: a */
    public final void mo107346a() {
        if (this.f115435a != null) {
            C7321c cVar = this.f115435a;
            if (cVar == null) {
                C7573i.m23580a();
            }
            if (!cVar.isDisposed()) {
                C7321c cVar2 = this.f115435a;
                if (cVar2 == null) {
                    C7573i.m23580a();
                }
                cVar2.dispose();
            }
        }
    }

    /* renamed from: a */
    public final void mo107347a(long j, C7562b<? super Long, C7581n> bVar) {
        C7573i.m23587b(bVar, "rxAction");
        C7492s.m23295b(j, TimeUnit.MILLISECONDS).mo19189a((C7498y<? super T>) new C44892a<Object>(this, bVar));
    }
}
