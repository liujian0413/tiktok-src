package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.C12534t;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.retrofit2.rxjava2.adapter.a */
final class C12521a<T> extends C7492s<T> {

    /* renamed from: a */
    private final C7492s<C12534t<T>> f33221a;

    /* renamed from: com.bytedance.retrofit2.rxjava2.adapter.a$a */
    static class C12522a<R> implements C7498y<C12534t<R>> {

        /* renamed from: a */
        private final C7498y<? super R> f33222a;

        /* renamed from: b */
        private boolean f33223b;

        public final void onComplete() {
            if (!this.f33223b) {
                this.f33222a.onComplete();
            }
        }

        C12522a(C7498y<? super R> yVar) {
            this.f33222a = yVar;
        }

        public final void onSubscribe(C7321c cVar) {
            this.f33222a.onSubscribe(cVar);
        }

        public final void onError(Throwable th) {
            if (!this.f33223b) {
                this.f33222a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C7332a.m23029a((Throwable) assertionError);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(C12534t<R> tVar) {
            if (tVar.mo30512c()) {
                this.f33222a.onNext(tVar.f33302b);
                return;
            }
            this.f33223b = true;
            HttpException httpException = new HttpException(tVar);
            try {
                this.f33222a.onError(httpException);
            } catch (Throwable th) {
                C7331a.m23009b(th);
                C7332a.m23029a((Throwable) new CompositeException(httpException, th));
            }
        }
    }

    C12521a(C7492s<C12534t<T>> sVar) {
        this.f33221a = sVar;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f33221a.mo19189a((C7498y<? super T>) new C12522a<Object>(yVar));
    }
}
