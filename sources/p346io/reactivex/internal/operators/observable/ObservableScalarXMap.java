package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C47600d;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableScalarXMap */
public final class ObservableScalarXMap {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable */
    public static final class ScalarDisposable<T> extends AtomicInteger implements C47600d<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final C7498y<? super T> observer;
        final T value;

        public final void clear() {
            lazySet(3);
        }

        public final void dispose() {
            set(3);
        }

        public final boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        public final boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        public final T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }

        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public ScalarDisposable(C7498y<? super T> yVar, T t) {
            this.observer = yVar;
            this.value = t;
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableScalarXMap$a */
    static final class C7375a<T, R> extends C7492s<R> {

        /* renamed from: a */
        final T f20471a;

        /* renamed from: b */
        final C7327h<? super T, ? extends C7496w<? extends R>> f20472b;

        /* renamed from: a_ */
        public final void mo10166a_(C7498y<? super R> yVar) {
            try {
                C7496w wVar = (C7496w) C7364b.m23081a(this.f20472b.apply(this.f20471a), "The mapper returned a null ObservableSource");
                if (wVar instanceof Callable) {
                    try {
                        Object call = ((Callable) wVar).call();
                        if (call == null) {
                            EmptyDisposable.complete(yVar);
                            return;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(yVar, call);
                        yVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        EmptyDisposable.error(th, yVar);
                    }
                } else {
                    wVar.mo19189a(yVar);
                }
            } catch (Throwable th2) {
                EmptyDisposable.error(th2, yVar);
            }
        }

        C7375a(T t, C7327h<? super T, ? extends C7496w<? extends R>> hVar) {
            this.f20471a = t;
            this.f20472b = hVar;
        }
    }

    /* renamed from: a */
    public static <T, U> C7492s<U> m23098a(T t, C7327h<? super T, ? extends C7496w<? extends U>> hVar) {
        return C7332a.m23018a((C7492s<T>) new C7375a<T>(t, hVar));
    }

    /* renamed from: a */
    public static <T, R> boolean m23099a(C7496w<T> wVar, C7498y<? super R> yVar, C7327h<? super T, ? extends C7496w<? extends R>> hVar) {
        if (!(wVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) wVar).call();
            if (call == null) {
                EmptyDisposable.complete(yVar);
                return true;
            }
            try {
                C7496w wVar2 = (C7496w) C7364b.m23081a(hVar.apply(call), "The mapper returned a null ObservableSource");
                if (wVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) wVar2).call();
                        if (call2 == null) {
                            EmptyDisposable.complete(yVar);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(yVar, call2);
                        yVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        EmptyDisposable.error(th, yVar);
                        return true;
                    }
                } else {
                    wVar2.mo19189a(yVar);
                }
                return true;
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                EmptyDisposable.error(th2, yVar);
                return true;
            }
        } catch (Throwable th3) {
            C7331a.m23009b(th3);
            EmptyDisposable.error(th3, yVar);
            return true;
        }
    }
}
