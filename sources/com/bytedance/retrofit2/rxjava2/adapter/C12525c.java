package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12534t;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.retrofit2.rxjava2.adapter.c */
final class C12525c<T> extends C7492s<C12534t<T>> {

    /* renamed from: a */
    private final C12466b<T> f33228a;

    /* renamed from: com.bytedance.retrofit2.rxjava2.adapter.c$a */
    static final class C12526a implements C7321c {

        /* renamed from: a */
        private final C12466b<?> f33229a;

        public final void dispose() {
            this.f33229a.cancel();
        }

        public final boolean isDisposed() {
            return this.f33229a.isCanceled();
        }

        C12526a(C12466b<?> bVar) {
            this.f33229a = bVar;
        }
    }

    C12525c(C12466b<T> bVar) {
        this.f33228a = bVar;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super C12534t<T>> yVar) {
        boolean z;
        C12466b clone = this.f33228a.clone();
        yVar.onSubscribe(new C12526a(clone));
        try {
            C12534t execute = clone.execute();
            if (!clone.isCanceled()) {
                yVar.onNext(execute);
            }
            if (!clone.isCanceled()) {
                try {
                    yVar.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            C7331a.m23009b(th);
            if (z) {
                C7332a.m23029a(th);
                return;
            }
            if (!clone.isCanceled()) {
                try {
                    yVar.onError(th);
                } catch (Throwable th3) {
                    C7331a.m23009b(th3);
                    C7332a.m23029a((Throwable) new CompositeException(th, th3));
                }
            }
        }
    }
}
