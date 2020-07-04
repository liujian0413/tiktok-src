package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.observers.BasicIntQueueDisposable;
import p346io.reactivex.internal.p353b.C47600d;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.schedulers.C47821o;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.ai */
public final class C7390ai<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7499z f20491b;

    /* renamed from: c */
    final boolean f20492c;

    /* renamed from: d */
    final int f20493d;

    /* renamed from: io.reactivex.internal.operators.observable.ai$a */
    static final class C7391a<T> extends BasicIntQueueDisposable<T> implements C7498y<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: a */
        final C7498y<? super T> f20494a;

        /* renamed from: b */
        final C7502c f20495b;

        /* renamed from: c */
        final boolean f20496c;

        /* renamed from: d */
        final int f20497d;

        /* renamed from: e */
        C47604i<T> f20498e;

        /* renamed from: f */
        C7321c f20499f;

        /* renamed from: g */
        Throwable f20500g;

        /* renamed from: h */
        volatile boolean f20501h;

        /* renamed from: i */
        volatile boolean f20502i;

        /* renamed from: j */
        int f20503j;

        /* renamed from: k */
        boolean f20504k;

        public final boolean isDisposed() {
            return this.f20502i;
        }

        public final void clear() {
            this.f20498e.clear();
        }

        public final boolean isEmpty() {
            return this.f20498e.isEmpty();
        }

        public final T poll() throws Exception {
            return this.f20498e.poll();
        }

        /* renamed from: a */
        private void m23113a() {
            if (getAndIncrement() == 0) {
                this.f20495b.mo19342a((Runnable) this);
            }
        }

        public final void onComplete() {
            if (!this.f20501h) {
                this.f20501h = true;
                m23113a();
            }
        }

        public final void run() {
            if (this.f20504k) {
                m23116c();
            } else {
                m23115b();
            }
        }

        public final void dispose() {
            if (!this.f20502i) {
                this.f20502i = true;
                this.f20499f.dispose();
                this.f20495b.dispose();
                if (getAndIncrement() == 0) {
                    this.f20498e.clear();
                }
            }
        }

        /* renamed from: b */
        private void m23115b() {
            boolean z;
            C47604i<T> iVar = this.f20498e;
            C7498y<? super T> yVar = this.f20494a;
            int i = 1;
            while (!m23114a(this.f20501h, iVar.isEmpty(), yVar)) {
                while (true) {
                    boolean z2 = this.f20501h;
                    try {
                        Object poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!m23114a(z2, z, yVar)) {
                            if (!z) {
                                yVar.onNext(poll);
                            } else {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        this.f20502i = true;
                        this.f20499f.dispose();
                        iVar.clear();
                        yVar.onError(th);
                        this.f20495b.dispose();
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        private void m23116c() {
            int i = 1;
            while (!this.f20502i) {
                boolean z = this.f20501h;
                Throwable th = this.f20500g;
                if (this.f20496c || !z || th == null) {
                    this.f20494a.onNext(null);
                    if (z) {
                        this.f20502i = true;
                        Throwable th2 = this.f20500g;
                        if (th2 != null) {
                            this.f20494a.onError(th2);
                        } else {
                            this.f20494a.onComplete();
                        }
                        this.f20495b.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f20502i = true;
                    this.f20494a.onError(this.f20500g);
                    this.f20495b.dispose();
                    return;
                }
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f20504k = true;
            return 2;
        }

        public final void onError(Throwable th) {
            if (this.f20501h) {
                C7332a.m23029a(th);
                return;
            }
            this.f20500g = th;
            this.f20501h = true;
            m23113a();
        }

        public final void onNext(T t) {
            if (!this.f20501h) {
                if (this.f20503j != 2) {
                    this.f20498e.offer(t);
                }
                m23113a();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20499f, cVar)) {
                this.f20499f = cVar;
                if (cVar instanceof C47600d) {
                    C47600d dVar = (C47600d) cVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f20503j = requestFusion;
                        this.f20498e = dVar;
                        this.f20501h = true;
                        this.f20494a.onSubscribe(this);
                        m23113a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f20503j = requestFusion;
                        this.f20498e = dVar;
                        this.f20494a.onSubscribe(this);
                        return;
                    }
                }
                this.f20498e = new C47791b(this.f20497d);
                this.f20494a.onSubscribe(this);
            }
        }

        /* renamed from: a */
        private boolean m23114a(boolean z, boolean z2, C7498y<? super T> yVar) {
            if (this.f20502i) {
                this.f20498e.clear();
                return true;
            }
            if (z) {
                Throwable th = this.f20500g;
                if (this.f20496c) {
                    if (z2) {
                        this.f20502i = true;
                        if (th != null) {
                            yVar.onError(th);
                        } else {
                            yVar.onComplete();
                        }
                        this.f20495b.dispose();
                        return true;
                    }
                } else if (th != null) {
                    this.f20502i = true;
                    this.f20498e.clear();
                    yVar.onError(th);
                    this.f20495b.dispose();
                    return true;
                } else if (z2) {
                    this.f20502i = true;
                    yVar.onComplete();
                    this.f20495b.dispose();
                    return true;
                }
            }
            return false;
        }

        C7391a(C7498y<? super T> yVar, C7502c cVar, boolean z, int i) {
            this.f20494a = yVar;
            this.f20495b = cVar;
            this.f20496c = z;
            this.f20497d = i;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        if (this.f20491b instanceof C47821o) {
            this.f20473a.mo19189a(yVar);
            return;
        }
        this.f20473a.mo19189a(new C7391a(yVar, this.f20491b.mo19338a(), this.f20492c, this.f20493d));
    }

    public C7390ai(C7496w<T> wVar, C7499z zVar, boolean z, int i) {
        super(wVar);
        this.f20491b = zVar;
        this.f20492c = z;
        this.f20493d = i;
    }
}
