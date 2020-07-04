package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.p353b.C47598a;
import p346io.reactivex.internal.subscribers.C47826a;
import p346io.reactivex.internal.subscribers.C47827b;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.d */
public final class C47694d<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7326g<? super T> f122246c;

    /* renamed from: d */
    final C7326g<? super Throwable> f122247d;

    /* renamed from: e */
    final C7323a f122248e;

    /* renamed from: f */
    final C7323a f122249f;

    /* renamed from: io.reactivex.internal.operators.flowable.d$a */
    static final class C47695a<T> extends C47826a<T, T> {

        /* renamed from: a */
        final C7326g<? super T> f122250a;

        /* renamed from: b */
        final C7326g<? super Throwable> f122251b;

        /* renamed from: c */
        final C7323a f122252c;

        /* renamed from: d */
        final C7323a f122253d;

        public final void onComplete() {
            if (!this.f122608h) {
                try {
                    this.f122252c.mo8975a();
                    this.f122608h = true;
                    this.f122605e.onComplete();
                    try {
                        this.f122253d.mo8975a();
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        C7332a.m23029a(th);
                    }
                } catch (Throwable th2) {
                    mo119848a(th2);
                }
            }
        }

        public final T poll() throws Exception {
            try {
                T poll = this.f122607g.poll();
                if (poll != null) {
                    try {
                        this.f122250a.accept(poll);
                        this.f122253d.mo8975a();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f122609i == 1) {
                    this.f122252c.mo8975a();
                    this.f122253d.mo8975a();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        public final int requestFusion(int i) {
            return mo119847a(i);
        }

        /* renamed from: a */
        public final boolean mo119684a(T t) {
            if (this.f122608h) {
                return false;
            }
            try {
                this.f122250a.accept(t);
                return this.f122605e.mo119684a(t);
            } catch (Throwable th) {
                mo119848a(th);
                return false;
            }
        }

        public final void onNext(T t) {
            if (!this.f122608h) {
                if (this.f122609i != 0) {
                    this.f122605e.onNext(null);
                    return;
                }
                try {
                    this.f122250a.accept(t);
                    this.f122605e.onNext(t);
                } catch (Throwable th) {
                    mo119848a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f122608h) {
                C7332a.m23029a(th);
                return;
            }
            boolean z = true;
            this.f122608h = true;
            try {
                this.f122251b.accept(th);
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.f122605e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f122605e.onError(th);
            }
            try {
                this.f122253d.mo8975a();
            } catch (Throwable th3) {
                C7331a.m23009b(th3);
                C7332a.m23029a(th3);
            }
        }

        C47695a(C47598a<? super T> aVar, C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar2, C7323a aVar3) {
            super(aVar);
            this.f122250a = gVar;
            this.f122251b = gVar2;
            this.f122252c = aVar2;
            this.f122253d = aVar3;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.d$b */
    static final class C47696b<T> extends C47827b<T, T> {

        /* renamed from: a */
        final C7326g<? super T> f122254a;

        /* renamed from: b */
        final C7326g<? super Throwable> f122255b;

        /* renamed from: c */
        final C7323a f122256c;

        /* renamed from: d */
        final C7323a f122257d;

        public final void onComplete() {
            if (!this.f122613h) {
                try {
                    this.f122256c.mo8975a();
                    this.f122613h = true;
                    this.f122610e.onComplete();
                    try {
                        this.f122257d.mo8975a();
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        C7332a.m23029a(th);
                    }
                } catch (Throwable th2) {
                    mo119850a(th2);
                }
            }
        }

        public final T poll() throws Exception {
            try {
                T poll = this.f122612g.poll();
                if (poll != null) {
                    try {
                        this.f122254a.accept(poll);
                        this.f122257d.mo8975a();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f122614i == 1) {
                    this.f122256c.mo8975a();
                    this.f122257d.mo8975a();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        public final int requestFusion(int i) {
            return mo119849a(i);
        }

        public final void onNext(T t) {
            if (!this.f122613h) {
                if (this.f122614i != 0) {
                    this.f122610e.onNext(null);
                    return;
                }
                try {
                    this.f122254a.accept(t);
                    this.f122610e.onNext(t);
                } catch (Throwable th) {
                    mo119850a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f122613h) {
                C7332a.m23029a(th);
                return;
            }
            boolean z = true;
            this.f122613h = true;
            try {
                this.f122255b.accept(th);
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.f122610e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f122610e.onError(th);
            }
            try {
                this.f122257d.mo8975a();
            } catch (Throwable th3) {
                C7331a.m23009b(th3);
                C7332a.m23029a(th3);
            }
        }

        C47696b(C48293c<? super T> cVar, C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7323a aVar2) {
            super(cVar);
            this.f122254a = gVar;
            this.f122255b = gVar2;
            this.f122256c = aVar;
            this.f122257d = aVar2;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        if (cVar instanceof C47598a) {
            C7329e eVar = this.f20450a;
            C47695a aVar = new C47695a((C47598a) cVar, this.f122246c, this.f122247d, this.f122248e, this.f122249f);
            eVar.mo19154a((C47597i<? super T>) aVar);
            return;
        }
        C7329e eVar2 = this.f20450a;
        C47696b bVar = new C47696b(cVar, this.f122246c, this.f122247d, this.f122248e, this.f122249f);
        eVar2.mo19154a((C47597i<? super T>) bVar);
    }

    public C47694d(C7329e<T> eVar, C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7323a aVar2) {
        super(eVar);
        this.f122246c = gVar;
        this.f122247d = gVar2;
        this.f122248e = aVar;
        this.f122249f = aVar2;
    }
}
