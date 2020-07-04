package p346io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.observers.C47612e;
import p346io.reactivex.internal.observers.InnerQueuedObserver;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C47600d;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.util.AtomicThrowable;
import p346io.reactivex.internal.util.ErrorMode;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.e */
public final class C7447e<T, R> extends C7376a<T, R> {

    /* renamed from: b */
    final C7327h<? super T, ? extends C7496w<? extends R>> f20701b;

    /* renamed from: c */
    final ErrorMode f20702c;

    /* renamed from: d */
    final int f20703d;

    /* renamed from: e */
    final int f20704e;

    /* renamed from: io.reactivex.internal.operators.observable.e$a */
    static final class C7448a<T, R> extends AtomicInteger implements C7321c, C47612e<R>, C7498y<T> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* renamed from: a */
        final C7498y<? super R> f20705a;

        /* renamed from: b */
        final C7327h<? super T, ? extends C7496w<? extends R>> f20706b;

        /* renamed from: c */
        final int f20707c;

        /* renamed from: d */
        final int f20708d;

        /* renamed from: e */
        final ErrorMode f20709e;

        /* renamed from: f */
        final AtomicThrowable f20710f = new AtomicThrowable();

        /* renamed from: g */
        final ArrayDeque<InnerQueuedObserver<R>> f20711g = new ArrayDeque<>();

        /* renamed from: h */
        C47604i<T> f20712h;

        /* renamed from: i */
        C7321c f20713i;

        /* renamed from: j */
        volatile boolean f20714j;

        /* renamed from: k */
        int f20715k;

        /* renamed from: l */
        volatile boolean f20716l;

        /* renamed from: m */
        InnerQueuedObserver<R> f20717m;

        /* renamed from: n */
        int f20718n;

        public final boolean isDisposed() {
            return this.f20716l;
        }

        public final void onComplete() {
            this.f20714j = true;
            mo19234a();
        }

        /* renamed from: b */
        private void m23181b() {
            InnerQueuedObserver<R> innerQueuedObserver = this.f20717m;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                InnerQueuedObserver innerQueuedObserver2 = (InnerQueuedObserver) this.f20711g.poll();
                if (innerQueuedObserver2 != null) {
                    innerQueuedObserver2.dispose();
                } else {
                    return;
                }
            }
        }

        public final void dispose() {
            this.f20716l = true;
            if (getAndIncrement() == 0) {
                this.f20712h.clear();
                m23181b();
            }
        }

        /* renamed from: a */
        public final void mo19234a() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                C47604i<T> iVar = this.f20712h;
                ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.f20711g;
                C7498y<? super R> yVar = this.f20705a;
                ErrorMode errorMode = this.f20709e;
                int i = 1;
                while (true) {
                    int i2 = this.f20718n;
                    while (true) {
                        if (i2 == this.f20707c) {
                            break;
                        } else if (this.f20716l) {
                            iVar.clear();
                            m23181b();
                            return;
                        } else if (errorMode != ErrorMode.IMMEDIATE || ((Throwable) this.f20710f.get()) == null) {
                            try {
                                Object poll = iVar.poll();
                                if (poll == null) {
                                    break;
                                }
                                C7496w wVar = (C7496w) C7364b.m23081a(this.f20706b.apply(poll), "The mapper returned a null ObservableSource");
                                InnerQueuedObserver innerQueuedObserver = new InnerQueuedObserver(this, this.f20708d);
                                arrayDeque.offer(innerQueuedObserver);
                                wVar.mo19189a(innerQueuedObserver);
                                i2++;
                            } catch (Throwable th) {
                                C7331a.m23009b(th);
                                this.f20713i.dispose();
                                iVar.clear();
                                m23181b();
                                this.f20710f.addThrowable(th);
                                yVar.onError(this.f20710f.terminate());
                                return;
                            }
                        } else {
                            iVar.clear();
                            m23181b();
                            yVar.onError(this.f20710f.terminate());
                            return;
                        }
                    }
                    this.f20718n = i2;
                    if (this.f20716l) {
                        iVar.clear();
                        m23181b();
                        return;
                    } else if (errorMode != ErrorMode.IMMEDIATE || ((Throwable) this.f20710f.get()) == null) {
                        InnerQueuedObserver<R> innerQueuedObserver2 = this.f20717m;
                        if (innerQueuedObserver2 == null) {
                            if (errorMode != ErrorMode.BOUNDARY || ((Throwable) this.f20710f.get()) == null) {
                                boolean z3 = this.f20714j;
                                InnerQueuedObserver<R> innerQueuedObserver3 = (InnerQueuedObserver) arrayDeque.poll();
                                if (innerQueuedObserver3 == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z3 || !z2) {
                                    if (!z2) {
                                        this.f20717m = innerQueuedObserver3;
                                    }
                                    innerQueuedObserver2 = innerQueuedObserver3;
                                } else if (((Throwable) this.f20710f.get()) != null) {
                                    iVar.clear();
                                    m23181b();
                                    yVar.onError(this.f20710f.terminate());
                                    return;
                                } else {
                                    yVar.onComplete();
                                    return;
                                }
                            } else {
                                iVar.clear();
                                m23181b();
                                yVar.onError(this.f20710f.terminate());
                                return;
                            }
                        }
                        if (innerQueuedObserver2 != null) {
                            C47604i queue = innerQueuedObserver2.queue();
                            while (!this.f20716l) {
                                boolean isDone = innerQueuedObserver2.isDone();
                                if (errorMode != ErrorMode.IMMEDIATE || ((Throwable) this.f20710f.get()) == null) {
                                    try {
                                        Object poll2 = queue.poll();
                                        if (poll2 == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (isDone && z) {
                                            this.f20717m = null;
                                            this.f20718n--;
                                        } else if (!z) {
                                            yVar.onNext(poll2);
                                        }
                                    } catch (Throwable th2) {
                                        C7331a.m23009b(th2);
                                        this.f20710f.addThrowable(th2);
                                        this.f20717m = null;
                                        this.f20718n--;
                                    }
                                } else {
                                    iVar.clear();
                                    m23181b();
                                    yVar.onError(this.f20710f.terminate());
                                    return;
                                }
                            }
                            iVar.clear();
                            m23181b();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        iVar.clear();
                        m23181b();
                        yVar.onError(this.f20710f.terminate());
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo19235a(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.setDone();
            mo19234a();
        }

        public final void onNext(T t) {
            if (this.f20715k == 0) {
                this.f20712h.offer(t);
            }
            mo19234a();
        }

        public final void onError(Throwable th) {
            if (this.f20710f.addThrowable(th)) {
                this.f20714j = true;
                mo19234a();
                return;
            }
            C7332a.m23029a(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20713i, cVar)) {
                this.f20713i = cVar;
                if (cVar instanceof C47600d) {
                    C47600d dVar = (C47600d) cVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f20715k = requestFusion;
                        this.f20712h = dVar;
                        this.f20714j = true;
                        this.f20705a.onSubscribe(this);
                        mo19234a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f20715k = requestFusion;
                        this.f20712h = dVar;
                        this.f20705a.onSubscribe(this);
                        return;
                    }
                }
                this.f20712h = new C47791b(this.f20708d);
                this.f20705a.onSubscribe(this);
            }
        }

        /* renamed from: a */
        public final void mo19236a(InnerQueuedObserver<R> innerQueuedObserver, R r) {
            innerQueuedObserver.queue().offer(r);
            mo19234a();
        }

        /* renamed from: a */
        public final void mo19237a(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
            if (this.f20710f.addThrowable(th)) {
                if (this.f20709e == ErrorMode.IMMEDIATE) {
                    this.f20713i.dispose();
                }
                innerQueuedObserver.setDone();
                mo19234a();
                return;
            }
            C7332a.m23029a(th);
        }

        C7448a(C7498y<? super R> yVar, C7327h<? super T, ? extends C7496w<? extends R>> hVar, int i, int i2, ErrorMode errorMode) {
            this.f20705a = yVar;
            this.f20706b = hVar;
            this.f20707c = i;
            this.f20708d = i2;
            this.f20709e = errorMode;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super R> yVar) {
        C7496w wVar = this.f20473a;
        C7448a aVar = new C7448a(yVar, this.f20701b, this.f20703d, this.f20704e, this.f20702c);
        wVar.mo19189a(aVar);
    }

    public C7447e(C7496w<T> wVar, C7327h<? super T, ? extends C7496w<? extends R>> hVar, ErrorMode errorMode, int i, int i2) {
        super(wVar);
        this.f20701b = hVar;
        this.f20702c = errorMode;
        this.f20703d = i;
        this.f20704e = i2;
    }
}
