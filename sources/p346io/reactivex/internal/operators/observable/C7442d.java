package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C47600d;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.util.AtomicThrowable;
import p346io.reactivex.internal.util.ErrorMode;
import p346io.reactivex.observers.C47867c;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.d */
public final class C7442d<T, U> extends C7376a<T, U> {

    /* renamed from: b */
    final C7327h<? super T, ? extends C7496w<? extends U>> f20672b;

    /* renamed from: c */
    final int f20673c;

    /* renamed from: d */
    final ErrorMode f20674d;

    /* renamed from: io.reactivex.internal.operators.observable.d$a */
    static final class C7443a<T, R> extends AtomicInteger implements C7321c, C7498y<T> {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: a */
        final C7498y<? super R> f20675a;

        /* renamed from: b */
        final C7327h<? super T, ? extends C7496w<? extends R>> f20676b;

        /* renamed from: c */
        final int f20677c;

        /* renamed from: d */
        final AtomicThrowable f20678d = new AtomicThrowable();

        /* renamed from: e */
        final C7444a<R> f20679e;

        /* renamed from: f */
        final boolean f20680f;

        /* renamed from: g */
        C47604i<T> f20681g;

        /* renamed from: h */
        C7321c f20682h;

        /* renamed from: i */
        volatile boolean f20683i;

        /* renamed from: j */
        volatile boolean f20684j;

        /* renamed from: k */
        volatile boolean f20685k;

        /* renamed from: l */
        int f20686l;

        /* renamed from: io.reactivex.internal.operators.observable.d$a$a */
        static final class C7444a<R> extends AtomicReference<C7321c> implements C7498y<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: a */
            final C7498y<? super R> f20687a;

            /* renamed from: b */
            final C7443a<?, R> f20688b;

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo19231a() {
                DisposableHelper.dispose(this);
            }

            public final void onComplete() {
                C7443a<?, R> aVar = this.f20688b;
                aVar.f20683i = false;
                aVar.mo19230a();
            }

            public final void onSubscribe(C7321c cVar) {
                DisposableHelper.replace(this, cVar);
            }

            public final void onNext(R r) {
                this.f20687a.onNext(r);
            }

            public final void onError(Throwable th) {
                C7443a<?, R> aVar = this.f20688b;
                if (aVar.f20678d.addThrowable(th)) {
                    if (!aVar.f20680f) {
                        aVar.f20682h.dispose();
                    }
                    aVar.f20683i = false;
                    aVar.mo19230a();
                    return;
                }
                C7332a.m23029a(th);
            }

            C7444a(C7498y<? super R> yVar, C7443a<?, R> aVar) {
                this.f20687a = yVar;
                this.f20688b = aVar;
            }
        }

        public final boolean isDisposed() {
            return this.f20685k;
        }

        public final void onComplete() {
            this.f20684j = true;
            mo19230a();
        }

        public final void dispose() {
            this.f20685k = true;
            this.f20682h.dispose();
            this.f20679e.mo19231a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19230a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C7498y<? super R> yVar = this.f20675a;
                C47604i<T> iVar = this.f20681g;
                AtomicThrowable atomicThrowable = this.f20678d;
                while (true) {
                    if (!this.f20683i) {
                        if (this.f20685k) {
                            iVar.clear();
                            return;
                        } else if (this.f20680f || ((Throwable) atomicThrowable.get()) == null) {
                            boolean z2 = this.f20684j;
                            try {
                                Object poll = iVar.poll();
                                if (poll == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z2 && z) {
                                    this.f20685k = true;
                                    Throwable terminate = atomicThrowable.terminate();
                                    if (terminate != null) {
                                        yVar.onError(terminate);
                                        return;
                                    } else {
                                        yVar.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        C7496w wVar = (C7496w) C7364b.m23081a(this.f20676b.apply(poll), "The mapper returned a null ObservableSource");
                                        if (wVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) wVar).call();
                                                if (call != null && !this.f20685k) {
                                                    yVar.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                C7331a.m23009b(th);
                                                atomicThrowable.addThrowable(th);
                                            }
                                        } else {
                                            this.f20683i = true;
                                            wVar.mo19189a(this.f20679e);
                                        }
                                    } catch (Throwable th2) {
                                        C7331a.m23009b(th2);
                                        this.f20685k = true;
                                        this.f20682h.dispose();
                                        iVar.clear();
                                        atomicThrowable.addThrowable(th2);
                                        yVar.onError(atomicThrowable.terminate());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C7331a.m23009b(th3);
                                this.f20685k = true;
                                this.f20682h.dispose();
                                atomicThrowable.addThrowable(th3);
                                yVar.onError(atomicThrowable.terminate());
                                return;
                            }
                        } else {
                            iVar.clear();
                            this.f20685k = true;
                            yVar.onError(atomicThrowable.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public final void onNext(T t) {
            if (this.f20686l == 0) {
                this.f20681g.offer(t);
            }
            mo19230a();
        }

        public final void onError(Throwable th) {
            if (this.f20678d.addThrowable(th)) {
                this.f20684j = true;
                mo19230a();
                return;
            }
            C7332a.m23029a(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20682h, cVar)) {
                this.f20682h = cVar;
                if (cVar instanceof C47600d) {
                    C47600d dVar = (C47600d) cVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f20686l = requestFusion;
                        this.f20681g = dVar;
                        this.f20684j = true;
                        this.f20675a.onSubscribe(this);
                        mo19230a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f20686l = requestFusion;
                        this.f20681g = dVar;
                        this.f20675a.onSubscribe(this);
                        return;
                    }
                }
                this.f20681g = new C47791b(this.f20677c);
                this.f20675a.onSubscribe(this);
            }
        }

        C7443a(C7498y<? super R> yVar, C7327h<? super T, ? extends C7496w<? extends R>> hVar, int i, boolean z) {
            this.f20675a = yVar;
            this.f20676b = hVar;
            this.f20677c = i;
            this.f20680f = z;
            this.f20679e = new C7444a<>(yVar, this);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.d$b */
    static final class C7445b<T, U> extends AtomicInteger implements C7321c, C7498y<T> {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: a */
        final C7498y<? super U> f20689a;

        /* renamed from: b */
        final C7327h<? super T, ? extends C7496w<? extends U>> f20690b;

        /* renamed from: c */
        final C7446a<U> f20691c;

        /* renamed from: d */
        final int f20692d;

        /* renamed from: e */
        C47604i<T> f20693e;

        /* renamed from: f */
        C7321c f20694f;

        /* renamed from: g */
        volatile boolean f20695g;

        /* renamed from: h */
        volatile boolean f20696h;

        /* renamed from: i */
        volatile boolean f20697i;

        /* renamed from: j */
        int f20698j;

        /* renamed from: io.reactivex.internal.operators.observable.d$b$a */
        static final class C7446a<U> extends AtomicReference<C7321c> implements C7498y<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: a */
            final C7498y<? super U> f20699a;

            /* renamed from: b */
            final C7445b<?, ?> f20700b;

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo19233a() {
                DisposableHelper.dispose(this);
            }

            public final void onComplete() {
                this.f20700b.mo19232a();
            }

            public final void onSubscribe(C7321c cVar) {
                DisposableHelper.replace(this, cVar);
            }

            public final void onNext(U u) {
                this.f20699a.onNext(u);
            }

            public final void onError(Throwable th) {
                this.f20700b.dispose();
                this.f20699a.onError(th);
            }

            C7446a(C7498y<? super U> yVar, C7445b<?, ?> bVar) {
                this.f20699a = yVar;
                this.f20700b = bVar;
            }
        }

        public final boolean isDisposed() {
            return this.f20696h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19232a() {
            this.f20695g = false;
            m23177b();
        }

        public final void onComplete() {
            if (!this.f20697i) {
                this.f20697i = true;
                m23177b();
            }
        }

        public final void dispose() {
            this.f20696h = true;
            this.f20691c.mo19233a();
            this.f20694f.dispose();
            if (getAndIncrement() == 0) {
                this.f20693e.clear();
            }
        }

        /* renamed from: b */
        private void m23177b() {
            boolean z;
            if (getAndIncrement() == 0) {
                while (!this.f20696h) {
                    if (!this.f20695g) {
                        boolean z2 = this.f20697i;
                        try {
                            Object poll = this.f20693e.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.f20696h = true;
                                this.f20689a.onComplete();
                                return;
                            } else if (!z) {
                                try {
                                    C7496w wVar = (C7496w) C7364b.m23081a(this.f20690b.apply(poll), "The mapper returned a null ObservableSource");
                                    this.f20695g = true;
                                    wVar.mo19189a(this.f20691c);
                                } catch (Throwable th) {
                                    C7331a.m23009b(th);
                                    dispose();
                                    this.f20693e.clear();
                                    this.f20689a.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C7331a.m23009b(th2);
                            dispose();
                            this.f20693e.clear();
                            this.f20689a.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f20693e.clear();
            }
        }

        public final void onError(Throwable th) {
            if (this.f20697i) {
                C7332a.m23029a(th);
                return;
            }
            this.f20697i = true;
            dispose();
            this.f20689a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f20697i) {
                if (this.f20698j == 0) {
                    this.f20693e.offer(t);
                }
                m23177b();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20694f, cVar)) {
                this.f20694f = cVar;
                if (cVar instanceof C47600d) {
                    C47600d dVar = (C47600d) cVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f20698j = requestFusion;
                        this.f20693e = dVar;
                        this.f20697i = true;
                        this.f20689a.onSubscribe(this);
                        m23177b();
                        return;
                    } else if (requestFusion == 2) {
                        this.f20698j = requestFusion;
                        this.f20693e = dVar;
                        this.f20689a.onSubscribe(this);
                        return;
                    }
                }
                this.f20693e = new C47791b(this.f20692d);
                this.f20689a.onSubscribe(this);
            }
        }

        C7445b(C7498y<? super U> yVar, C7327h<? super T, ? extends C7496w<? extends U>> hVar, int i) {
            this.f20689a = yVar;
            this.f20690b = hVar;
            this.f20692d = i;
            this.f20691c = new C7446a<>(yVar, this);
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super U> yVar) {
        boolean z;
        if (!ObservableScalarXMap.m23099a(this.f20473a, yVar, this.f20672b)) {
            if (this.f20674d == ErrorMode.IMMEDIATE) {
                this.f20473a.mo19189a(new C7445b(new C47867c(yVar), this.f20672b, this.f20673c));
                return;
            }
            C7496w wVar = this.f20473a;
            C7327h<? super T, ? extends C7496w<? extends U>> hVar = this.f20672b;
            int i = this.f20673c;
            if (this.f20674d == ErrorMode.END) {
                z = true;
            } else {
                z = false;
            }
            wVar.mo19189a(new C7443a(yVar, hVar, i, z));
        }
    }

    public C7442d(C7496w<T> wVar, C7327h<? super T, ? extends C7496w<? extends U>> hVar, int i, ErrorMode errorMode) {
        super(wVar);
        this.f20672b = hVar;
        this.f20674d = errorMode;
        this.f20673c = Math.max(8, i);
    }
}
