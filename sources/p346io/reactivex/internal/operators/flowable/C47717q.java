package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C47598a;
import p346io.reactivex.internal.subscribers.C47826a;
import p346io.reactivex.internal.subscribers.C47827b;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.flowable.q */
public final class C47717q<T, U> extends C7368a<T, U> {

    /* renamed from: c */
    final C7327h<? super T, ? extends U> f122323c;

    /* renamed from: io.reactivex.internal.operators.flowable.q$a */
    static final class C47718a<T, U> extends C47826a<T, U> {

        /* renamed from: a */
        final C7327h<? super T, ? extends U> f122324a;

        public final U poll() throws Exception {
            Object poll = this.f122607g.poll();
            if (poll != null) {
                return C7364b.m23081a(this.f122324a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
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
                return this.f122605e.mo119684a(C7364b.m23081a(this.f122324a.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                mo119848a(th);
                return true;
            }
        }

        public final void onNext(T t) {
            if (!this.f122608h) {
                if (this.f122609i != 0) {
                    this.f122605e.onNext(null);
                    return;
                }
                try {
                    this.f122605e.onNext(C7364b.m23081a(this.f122324a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo119848a(th);
                }
            }
        }

        C47718a(C47598a<? super U> aVar, C7327h<? super T, ? extends U> hVar) {
            super(aVar);
            this.f122324a = hVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.q$b */
    static final class C47719b<T, U> extends C47827b<T, U> {

        /* renamed from: a */
        final C7327h<? super T, ? extends U> f122325a;

        public final U poll() throws Exception {
            Object poll = this.f122612g.poll();
            if (poll != null) {
                return C7364b.m23081a(this.f122325a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
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
                    this.f122610e.onNext(C7364b.m23081a(this.f122325a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo119850a(th);
                }
            }
        }

        C47719b(C48293c<? super U> cVar, C7327h<? super T, ? extends U> hVar) {
            super(cVar);
            this.f122325a = hVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super U> cVar) {
        if (cVar instanceof C47598a) {
            this.f20450a.mo19154a((C47597i<? super T>) new C47718a<Object>((C47598a) cVar, this.f122323c));
        } else {
            this.f20450a.mo19154a((C47597i<? super T>) new C47719b<Object>(cVar, this.f122323c));
        }
    }

    public C47717q(C7329e<T> eVar, C7327h<? super T, ? extends U> hVar) {
        super(eVar);
        this.f122323c = hVar;
    }
}
