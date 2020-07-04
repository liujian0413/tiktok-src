package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.C12534t;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.retrofit2.rxjava2.adapter.e */
final class C12528e<T> extends C7492s<C12527d<T>> {

    /* renamed from: a */
    private final C7492s<C12534t<T>> f33232a;

    /* renamed from: com.bytedance.retrofit2.rxjava2.adapter.e$a */
    static class C12529a<R> implements C7498y<C12534t<R>> {

        /* renamed from: a */
        private final C7498y<? super C12527d<R>> f33233a;

        public final void onComplete() {
            this.f33233a.onComplete();
        }

        C12529a(C7498y<? super C12527d<R>> yVar) {
            this.f33233a = yVar;
        }

        public final void onSubscribe(C7321c cVar) {
            this.f33233a.onSubscribe(cVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(C12534t<R> tVar) {
            this.f33233a.onNext(C12527d.m36389a(tVar));
        }

        public final void onError(Throwable th) {
            try {
                this.f33233a.onNext(C12527d.m36390a(th));
                this.f33233a.onComplete();
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                C7332a.m23029a((Throwable) new CompositeException(th, th2));
            }
        }
    }

    C12528e(C7492s<C12534t<T>> sVar) {
        this.f33232a = sVar;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super C12527d<T>> yVar) {
        this.f33232a.mo19189a((C7498y<? super T>) new C12529a<Object>(yVar));
    }
}
