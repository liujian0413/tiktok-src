package p346io.reactivex.p354j;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.j.b */
public final class C7486b<T> extends C7489f<T> {

    /* renamed from: a */
    static final C7487a[] f20838a = new C7487a[0];

    /* renamed from: b */
    static final C7487a[] f20839b = new C7487a[0];

    /* renamed from: c */
    final AtomicReference<C7487a<T>[]> f20840c = new AtomicReference<>(f20839b);

    /* renamed from: d */
    Throwable f20841d;

    /* renamed from: io.reactivex.j.b$a */
    static final class C7487a<T> extends AtomicBoolean implements C7321c {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final C7498y<? super T> f20842a;

        /* renamed from: b */
        final C7486b<T> f20843b;

        public final boolean isDisposed() {
            return get();
        }

        /* renamed from: a */
        public final void mo19257a() {
            if (!get()) {
                this.f20842a.onComplete();
            }
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f20843b.mo19256a(this);
            }
        }

        /* renamed from: a */
        public final void mo19258a(T t) {
            if (!get()) {
                this.f20842a.onNext(t);
            }
        }

        /* renamed from: a */
        public final void mo19259a(Throwable th) {
            if (get()) {
                C7332a.m23029a(th);
            } else {
                this.f20842a.onError(th);
            }
        }

        C7487a(C7498y<? super T> yVar, C7486b<T> bVar) {
            this.f20842a = yVar;
            this.f20843b = bVar;
        }
    }

    /* renamed from: a */
    public static <T> C7486b<T> m23223a() {
        return new C7486b<>();
    }

    C7486b() {
    }

    public final void onComplete() {
        if (this.f20840c.get() != f20838a) {
            for (C7487a a : (C7487a[]) this.f20840c.getAndSet(f20838a)) {
                a.mo19257a();
            }
        }
    }

    public final void onSubscribe(C7321c cVar) {
        if (this.f20840c.get() == f20838a) {
            cVar.dispose();
        }
    }

    public final void onNext(T t) {
        C7364b.m23081a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C7487a a : (C7487a[]) this.f20840c.get()) {
            a.mo19258a(t);
        }
    }

    /* renamed from: b */
    private boolean m23224b(C7487a<T> aVar) {
        C7487a[] aVarArr;
        C7487a[] aVarArr2;
        do {
            aVarArr = (C7487a[]) this.f20840c.get();
            if (aVarArr == f20838a) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C7487a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f20840c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7487a aVar = new C7487a(yVar, this);
        yVar.onSubscribe(aVar);
        if (!m23224b(aVar)) {
            Throwable th = this.f20841d;
            if (th != null) {
                yVar.onError(th);
                return;
            }
            yVar.onComplete();
        } else if (aVar.isDisposed()) {
            mo19256a(aVar);
        }
    }

    public final void onError(Throwable th) {
        C7364b.m23081a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f20840c.get() == f20838a) {
            C7332a.m23029a(th);
            return;
        }
        this.f20841d = th;
        for (C7487a a : (C7487a[]) this.f20840c.getAndSet(f20838a)) {
            a.mo19259a(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19256a(C7487a<T> aVar) {
        C7487a<T>[] aVarArr;
        C7487a[] aVarArr2;
        do {
            aVarArr = (C7487a[]) this.f20840c.get();
            if (aVarArr != f20838a && aVarArr != f20839b) {
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f20839b;
                    } else {
                        C7487a[] aVarArr3 = new C7487a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f20840c.compareAndSet(aVarArr, aVarArr2));
    }
}
