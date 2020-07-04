package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p349e.C7330a;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.al */
public final class C7396al<T> extends C7330a<T> {

    /* renamed from: a */
    final C7496w<T> f20517a;

    /* renamed from: b */
    final AtomicReference<C7398b<T>> f20518b;

    /* renamed from: c */
    final C7496w<T> f20519c;

    /* renamed from: io.reactivex.internal.operators.observable.al$a */
    static final class C7397a<T> extends AtomicReference<Object> implements C7321c {
        private static final long serialVersionUID = -1100270633763673112L;

        /* renamed from: a */
        final C7498y<? super T> f20520a;

        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C7398b) andSet).mo19204b(this);
            }
        }

        public final boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }

        C7397a(C7498y<? super T> yVar) {
            this.f20520a = yVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19202a(C7398b<T> bVar) {
            if (!compareAndSet(null, bVar)) {
                bVar.mo19204b(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.al$b */
    static final class C7398b<T> implements C7321c, C7498y<T> {

        /* renamed from: b */
        static final C7397a[] f20521b = new C7397a[0];

        /* renamed from: c */
        static final C7397a[] f20522c = new C7397a[0];

        /* renamed from: a */
        final AtomicReference<C7398b<T>> f20523a;

        /* renamed from: d */
        final AtomicReference<C7397a<T>[]> f20524d = new AtomicReference<>(f20521b);

        /* renamed from: e */
        final AtomicBoolean f20525e;

        /* renamed from: f */
        final AtomicReference<C7321c> f20526f = new AtomicReference<>();

        public final boolean isDisposed() {
            if (this.f20524d.get() == f20522c) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            if (((C7397a[]) this.f20524d.getAndSet(f20522c)) != f20522c) {
                this.f20523a.compareAndSet(this, null);
                DisposableHelper.dispose(this.f20526f);
            }
        }

        public final void onComplete() {
            this.f20523a.compareAndSet(this, null);
            for (C7397a aVar : (C7397a[]) this.f20524d.getAndSet(f20522c)) {
                aVar.f20520a.onComplete();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this.f20526f, cVar);
        }

        C7398b(AtomicReference<C7398b<T>> atomicReference) {
            this.f20523a = atomicReference;
            this.f20525e = new AtomicBoolean();
        }

        public final void onNext(T t) {
            for (C7397a aVar : (C7397a[]) this.f20524d.get()) {
                aVar.f20520a.onNext(t);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo19203a(C7397a<T> aVar) {
            C7397a[] aVarArr;
            C7397a[] aVarArr2;
            do {
                aVarArr = (C7397a[]) this.f20524d.get();
                if (aVarArr == f20522c) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C7397a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f20524d.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo19204b(C7397a<T> aVar) {
            C7397a[] aVarArr;
            C7397a[] aVarArr2;
            do {
                aVarArr = (C7397a[]) this.f20524d.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f20521b;
                        } else {
                            C7397a[] aVarArr3 = new C7397a[(length - 1)];
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
            } while (!this.f20524d.compareAndSet(aVarArr, aVarArr2));
        }

        public final void onError(Throwable th) {
            this.f20523a.compareAndSet(this, null);
            C7397a[] aVarArr = (C7397a[]) this.f20524d.getAndSet(f20522c);
            if (aVarArr.length != 0) {
                for (C7397a aVar : aVarArr) {
                    aVar.f20520a.onError(th);
                }
                return;
            }
            C7332a.m23029a(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.al$c */
    static final class C7399c<T> implements C7496w<T> {

        /* renamed from: a */
        private final AtomicReference<C7398b<T>> f20527a;

        C7399c(AtomicReference<C7398b<T>> atomicReference) {
            this.f20527a = atomicReference;
        }

        /* renamed from: a */
        public final void mo19189a(C7498y<? super T> yVar) {
            C7397a aVar = new C7397a(yVar);
            yVar.onSubscribe(aVar);
            while (true) {
                C7398b bVar = (C7398b) this.f20527a.get();
                if (bVar == null || bVar.isDisposed()) {
                    C7398b bVar2 = new C7398b(this.f20527a);
                    if (this.f20527a.compareAndSet(bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                if (bVar.mo19203a(aVar)) {
                    aVar.mo19202a(bVar);
                    return;
                }
            }
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20519c.mo19189a(yVar);
    }

    /* renamed from: f */
    public static <T> C7330a<T> m23119f(C7496w<T> wVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C7332a.m23014a((C7330a<T>) new C7396al<T>(new C7399c(atomicReference), wVar, atomicReference));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19167g(p346io.reactivex.p348d.C7326g<? super p346io.reactivex.p347b.C7321c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.al$b<T>> r0 = r4.f20518b
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.al$b r0 = (p346io.reactivex.internal.operators.observable.C7396al.C7398b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0020
        L_0x0010:
            io.reactivex.internal.operators.observable.al$b r1 = new io.reactivex.internal.operators.observable.al$b
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.al$b<T>> r2 = r4.f20518b
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.al$b<T>> r2 = r4.f20518b
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f20525e
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f20525e
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r5.accept(r0)     // Catch:{ Throwable -> 0x003f }
            if (r2 == 0) goto L_0x003e
            io.reactivex.w<T> r5 = r4.f20517a
            r5.mo19189a(r0)
        L_0x003e:
            return
        L_0x003f:
            r5 = move-exception
            p346io.reactivex.exceptions.C7331a.m23009b(r5)
            java.lang.RuntimeException r5 = p346io.reactivex.internal.util.C47836e.m148716a(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.operators.observable.C7396al.mo19167g(io.reactivex.d.g):void");
    }

    private C7396al(C7496w<T> wVar, C7496w<T> wVar2, AtomicReference<C7398b<T>> atomicReference) {
        this.f20519c = wVar;
        this.f20517a = wVar2;
        this.f20518b = atomicReference;
    }
}
