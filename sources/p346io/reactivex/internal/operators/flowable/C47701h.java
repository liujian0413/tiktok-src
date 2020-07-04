package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.p353b.C47598a;
import p346io.reactivex.internal.p353b.C47602f;
import p346io.reactivex.internal.subscribers.C47826a;
import p346io.reactivex.internal.subscribers.C47827b;
import p346io.reactivex.p348d.C7328l;

/* renamed from: io.reactivex.internal.operators.flowable.h */
public final class C47701h<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7328l<? super T> f122268c;

    /* renamed from: io.reactivex.internal.operators.flowable.h$a */
    static final class C47702a<T> extends C47826a<T, T> {

        /* renamed from: a */
        final C7328l<? super T> f122269a;

        public final T poll() throws Exception {
            C47602f fVar = this.f122607g;
            C7328l<? super T> lVar = this.f122269a;
            while (true) {
                T poll = fVar.poll();
                if (poll == null) {
                    return null;
                }
                if (lVar.mo9283a(poll)) {
                    return poll;
                }
                if (this.f122609i == 2) {
                    fVar.request(1);
                }
            }
        }

        public final int requestFusion(int i) {
            return mo119847a(i);
        }

        public final void onNext(T t) {
            if (!mo119684a(t)) {
                this.f122606f.request(1);
            }
        }

        /* renamed from: a */
        public final boolean mo119684a(T t) {
            if (this.f122608h) {
                return false;
            }
            if (this.f122609i != 0) {
                return this.f122605e.mo119684a(null);
            }
            try {
                if (!this.f122269a.mo9283a(t) || !this.f122605e.mo119684a(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                mo119848a(th);
                return true;
            }
        }

        C47702a(C47598a<? super T> aVar, C7328l<? super T> lVar) {
            super(aVar);
            this.f122269a = lVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.h$b */
    static final class C47703b<T> extends C47827b<T, T> implements C47598a<T> {

        /* renamed from: a */
        final C7328l<? super T> f122270a;

        public final T poll() throws Exception {
            C47602f fVar = this.f122612g;
            C7328l<? super T> lVar = this.f122270a;
            while (true) {
                T poll = fVar.poll();
                if (poll == null) {
                    return null;
                }
                if (lVar.mo9283a(poll)) {
                    return poll;
                }
                if (this.f122614i == 2) {
                    fVar.request(1);
                }
            }
        }

        public final int requestFusion(int i) {
            return mo119849a(i);
        }

        public final void onNext(T t) {
            if (!mo119684a(t)) {
                this.f122611f.request(1);
            }
        }

        /* renamed from: a */
        public final boolean mo119684a(T t) {
            if (this.f122613h) {
                return false;
            }
            if (this.f122614i != 0) {
                this.f122610e.onNext(null);
                return true;
            }
            try {
                boolean a = this.f122270a.mo9283a(t);
                if (a) {
                    this.f122610e.onNext(t);
                }
                return a;
            } catch (Throwable th) {
                mo119850a(th);
                return true;
            }
        }

        C47703b(C48293c<? super T> cVar, C7328l<? super T> lVar) {
            super(cVar);
            this.f122270a = lVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        if (cVar instanceof C47598a) {
            this.f20450a.mo19154a((C47597i<? super T>) new C47702a<Object>((C47598a) cVar, this.f122268c));
        } else {
            this.f20450a.mo19154a((C47597i<? super T>) new C47703b<Object>(cVar, this.f122268c));
        }
    }

    public C47701h(C7329e<T> eVar, C7328l<? super T> lVar) {
        super(eVar);
        this.f122268c = lVar;
    }
}
