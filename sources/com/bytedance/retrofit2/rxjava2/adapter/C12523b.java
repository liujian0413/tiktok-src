package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.retrofit2.rxjava2.adapter.b */
final class C12523b<T> extends C7492s<C12534t<T>> {

    /* renamed from: a */
    private final C12466b<T> f33224a;

    /* renamed from: com.bytedance.retrofit2.rxjava2.adapter.b$a */
    static final class C12524a<T> implements C12474e<T>, C7321c {

        /* renamed from: a */
        boolean f33225a;

        /* renamed from: b */
        private final C12466b<?> f33226b;

        /* renamed from: c */
        private final C7498y<? super C12534t<T>> f33227c;

        public final void dispose() {
            this.f33226b.cancel();
        }

        public final boolean isDisposed() {
            return this.f33226b.isCanceled();
        }

        C12524a(C12466b<?> bVar, C7498y<? super C12534t<T>> yVar) {
            this.f33226b = bVar;
            this.f33227c = yVar;
        }

        /* renamed from: a */
        public final void mo26464a(C12466b<T> bVar, Throwable th) {
            if (!bVar.isCanceled()) {
                try {
                    this.f33227c.onError(th);
                } catch (Throwable th2) {
                    C7331a.m23009b(th2);
                    C7332a.m23029a((Throwable) new CompositeException(th, th2));
                }
            }
        }

        /* renamed from: a */
        public final void mo26463a(C12466b<T> bVar, C12534t<T> tVar) {
            if (!bVar.isCanceled()) {
                try {
                    this.f33227c.onNext(tVar);
                    if (!bVar.isCanceled()) {
                        this.f33225a = true;
                        this.f33227c.onComplete();
                    }
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    C7332a.m23029a((Throwable) new CompositeException(th, th));
                }
            }
        }
    }

    C12523b(C12466b<T> bVar) {
        this.f33224a = bVar;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super C12534t<T>> yVar) {
        C12466b clone = this.f33224a.clone();
        C12524a aVar = new C12524a(clone, yVar);
        yVar.onSubscribe(aVar);
        clone.enqueue(aVar);
    }
}
