package p346io.reactivex.p1869g;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.g.b */
public final class C47582b<T> extends C47581a<T> {

    /* renamed from: a */
    static final C47583a[] f122018a = new C47583a[0];

    /* renamed from: c */
    static final C47583a[] f122019c = new C47583a[0];

    /* renamed from: d */
    final AtomicReference<C47583a<T>[]> f122020d = new AtomicReference<>(f122019c);

    /* renamed from: e */
    Throwable f122021e;

    /* renamed from: io.reactivex.g.b$a */
    static final class C47583a<T> extends AtomicLong implements C48294d {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final C48293c<? super T> f122022a;

        /* renamed from: b */
        final C47582b<T> f122023b;

        /* renamed from: a */
        public final void mo119678a() {
            if (get() != Long.MIN_VALUE) {
                this.f122022a.onComplete();
            }
        }

        /* renamed from: b */
        public final boolean mo119681b() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f122023b.mo119677a(this);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148708b(this, j);
            }
        }

        /* renamed from: a */
        public final void mo119680a(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f122022a.onError(th);
            } else {
                C7332a.m23029a(th);
            }
        }

        /* renamed from: a */
        public final void mo119679a(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.f122022a.onNext(t);
                    C47833b.m148710d(this, 1);
                    return;
                }
                cancel();
                this.f122022a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        C47583a(C48293c<? super T> cVar, C47582b<T> bVar) {
            this.f122022a = cVar;
            this.f122023b = bVar;
        }
    }

    /* renamed from: h */
    public static <T> C47582b<T> m148367h() {
        return new C47582b<>();
    }

    C47582b() {
    }

    public final void onComplete() {
        if (this.f122020d.get() != f122018a) {
            for (C47583a a : (C47583a[]) this.f122020d.getAndSet(f122018a)) {
                a.mo119678a();
            }
        }
    }

    public final void onNext(T t) {
        C7364b.m23081a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C47583a a : (C47583a[]) this.f122020d.get()) {
            a.mo119679a(t);
        }
    }

    public final void onSubscribe(C48294d dVar) {
        if (this.f122020d.get() == f122018a) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: b */
    private boolean m148366b(C47583a<T> aVar) {
        C47583a[] aVarArr;
        C47583a[] aVarArr2;
        do {
            aVarArr = (C47583a[]) this.f122020d.get();
            if (aVarArr == f122018a) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C47583a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f122020d.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        C47583a aVar = new C47583a(cVar, this);
        cVar.onSubscribe(aVar);
        if (!m148366b(aVar)) {
            Throwable th = this.f122021e;
            if (th != null) {
                cVar.onError(th);
                return;
            }
            cVar.onComplete();
        } else if (aVar.mo119681b()) {
            mo119677a(aVar);
        }
    }

    public final void onError(Throwable th) {
        C7364b.m23081a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122020d.get() == f122018a) {
            C7332a.m23029a(th);
            return;
        }
        this.f122021e = th;
        for (C47583a a : (C47583a[]) this.f122020d.getAndSet(f122018a)) {
            a.mo119680a(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo119677a(C47583a<T> aVar) {
        C47583a<T>[] aVarArr;
        C47583a[] aVarArr2;
        do {
            aVarArr = (C47583a[]) this.f122020d.get();
            if (aVarArr != f122018a && aVarArr != f122019c) {
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
                        aVarArr2 = f122019c;
                    } else {
                        C47583a[] aVarArr3 = new C47583a[(length - 1)];
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
        } while (!this.f122020d.compareAndSet(aVarArr, aVarArr2));
    }
}
