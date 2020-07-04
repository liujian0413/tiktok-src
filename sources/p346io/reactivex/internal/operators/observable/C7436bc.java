package p346io.reactivex.internal.operators.observable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.observable.bc */
public final class C7436bc<T, R> extends C7492s<R> {

    /* renamed from: a */
    final C7496w<? extends T>[] f20638a;

    /* renamed from: b */
    final Iterable<? extends C7496w<? extends T>> f20639b;

    /* renamed from: c */
    final C7327h<? super Object[], ? extends R> f20640c;

    /* renamed from: d */
    final int f20641d;

    /* renamed from: e */
    final boolean f20642e;

    /* renamed from: io.reactivex.internal.operators.observable.bc$a */
    static final class C7437a<T, R> extends AtomicInteger implements C7321c {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: a */
        final C7498y<? super R> f20643a;

        /* renamed from: b */
        final C7327h<? super Object[], ? extends R> f20644b;

        /* renamed from: c */
        final C7438b<T, R>[] f20645c;

        /* renamed from: d */
        final T[] f20646d;

        /* renamed from: e */
        final boolean f20647e;

        /* renamed from: f */
        volatile boolean f20648f;

        public final boolean isDisposed() {
            return this.f20648f;
        }

        /* renamed from: b */
        private void m23159b() {
            m23161d();
            m23160c();
        }

        /* renamed from: c */
        private void m23160c() {
            for (C7438b<T, R> a : this.f20645c) {
                a.mo19224a();
            }
        }

        /* renamed from: d */
        private void m23161d() {
            for (C7438b<T, R> bVar : this.f20645c) {
                bVar.f20650b.clear();
            }
        }

        public final void dispose() {
            if (!this.f20648f) {
                this.f20648f = true;
                m23160c();
                if (getAndIncrement() == 0) {
                    m23161d();
                }
            }
        }

        /* renamed from: a */
        public final void mo19222a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C7438b<T, R>[] bVarArr = this.f20645c;
                C7498y<? super R> yVar = this.f20643a;
                T[] tArr = this.f20646d;
                boolean z2 = this.f20647e;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C7438b<T, R> bVar : bVarArr) {
                        if (tArr[i2] == null) {
                            boolean z3 = bVar.f20651c;
                            T poll = bVar.f20650b.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!m23158a(z3, z, yVar, z2, bVar)) {
                                if (!z) {
                                    tArr[i2] = poll;
                                } else {
                                    i3++;
                                }
                            } else {
                                return;
                            }
                        } else if (bVar.f20651c && !z2) {
                            Throwable th = bVar.f20652d;
                            if (th != null) {
                                m23159b();
                                yVar.onError(th);
                                return;
                            }
                        }
                        i2++;
                    }
                    if (i3 == 0) {
                        try {
                            yVar.onNext(C7364b.m23081a(this.f20644b.apply(tArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(tArr, null);
                        } catch (Throwable th2) {
                            C7331a.m23009b(th2);
                            m23159b();
                            yVar.onError(th2);
                            return;
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo19223a(C7496w<? extends T>[] wVarArr, int i) {
            C7438b<T, R>[] bVarArr = this.f20645c;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new C7438b<>(this, i);
            }
            lazySet(0);
            this.f20643a.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f20648f; i3++) {
                wVarArr[i3].mo19189a(bVarArr[i3]);
            }
        }

        C7437a(C7498y<? super R> yVar, C7327h<? super Object[], ? extends R> hVar, int i, boolean z) {
            this.f20643a = yVar;
            this.f20644b = hVar;
            this.f20645c = new C7438b[i];
            this.f20646d = (Object[]) new Object[i];
            this.f20647e = z;
        }

        /* renamed from: a */
        private boolean m23158a(boolean z, boolean z2, C7498y<? super R> yVar, boolean z3, C7438b<?, ?> bVar) {
            if (this.f20648f) {
                m23159b();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = bVar.f20652d;
                    if (th != null) {
                        m23159b();
                        yVar.onError(th);
                        return true;
                    } else if (z2) {
                        m23159b();
                        yVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = bVar.f20652d;
                    m23159b();
                    if (th2 != null) {
                        yVar.onError(th2);
                    } else {
                        yVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.bc$b */
    static final class C7438b<T, R> implements C7498y<T> {

        /* renamed from: a */
        final C7437a<T, R> f20649a;

        /* renamed from: b */
        final C47791b<T> f20650b;

        /* renamed from: c */
        volatile boolean f20651c;

        /* renamed from: d */
        Throwable f20652d;

        /* renamed from: e */
        final AtomicReference<C7321c> f20653e = new AtomicReference<>();

        /* renamed from: a */
        public final void mo19224a() {
            DisposableHelper.dispose(this.f20653e);
        }

        public final void onComplete() {
            this.f20651c = true;
            this.f20649a.mo19222a();
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this.f20653e, cVar);
        }

        public final void onError(Throwable th) {
            this.f20652d = th;
            this.f20651c = true;
            this.f20649a.mo19222a();
        }

        public final void onNext(T t) {
            this.f20650b.offer(t);
            this.f20649a.mo19222a();
        }

        C7438b(C7437a<T, R> aVar, int i) {
            this.f20649a = aVar;
            this.f20650b = new C47791b<>(i);
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super R> yVar) {
        C7496w<? extends T>[] wVarArr;
        int i;
        C7496w<? extends T>[] wVarArr2 = this.f20638a;
        if (wVarArr2 == null) {
            C7492s[] sVarArr = new C7492s[8];
            wVarArr = sVarArr;
            i = 0;
            for (C7496w<? extends T> wVar : this.f20639b) {
                if (i == wVarArr.length) {
                    C7496w<? extends T>[] wVarArr3 = new C7496w[((i >> 2) + i)];
                    System.arraycopy(wVarArr, 0, wVarArr3, 0, i);
                    wVarArr = wVarArr3;
                }
                int i2 = i + 1;
                wVarArr[i] = wVar;
                i = i2;
            }
        } else {
            wVarArr = wVarArr2;
            i = wVarArr2.length;
        }
        if (i == 0) {
            EmptyDisposable.complete(yVar);
        } else {
            new C7437a(yVar, this.f20640c, i, this.f20642e).mo19223a(wVarArr, this.f20641d);
        }
    }

    public C7436bc(C7496w<? extends T>[] wVarArr, Iterable<? extends C7496w<? extends T>> iterable, C7327h<? super Object[], ? extends R> hVar, int i, boolean z) {
        this.f20638a = wVarArr;
        this.f20639b = iterable;
        this.f20640c = hVar;
        this.f20641d = i;
        this.f20642e = z;
    }
}
