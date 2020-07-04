package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p353b.C47598a;
import p346io.reactivex.internal.p353b.C47602f;
import p346io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.c */
public final class C47691c<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7323a f122235c;

    /* renamed from: io.reactivex.internal.operators.flowable.c$a */
    static final class C47692a<T> extends BasicIntQueueSubscription<T> implements C47598a<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final C47598a<? super T> f122236a;

        /* renamed from: b */
        final C7323a f122237b;

        /* renamed from: c */
        C48294d f122238c;

        /* renamed from: d */
        C47602f<T> f122239d;

        /* renamed from: e */
        boolean f122240e;

        public final void clear() {
            this.f122239d.clear();
        }

        public final boolean isEmpty() {
            return this.f122239d.isEmpty();
        }

        public final void cancel() {
            this.f122238c.cancel();
            m148509a();
        }

        public final void onComplete() {
            this.f122236a.onComplete();
            m148509a();
        }

        public final T poll() throws Exception {
            T poll = this.f122239d.poll();
            if (poll == null && this.f122240e) {
                m148509a();
            }
            return poll;
        }

        /* renamed from: a */
        private void m148509a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f122237b.mo8975a();
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    C7332a.m23029a(th);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo119684a(T t) {
            return this.f122236a.mo119684a(t);
        }

        public final void onNext(T t) {
            this.f122236a.onNext(t);
        }

        public final void request(long j) {
            this.f122238c.request(j);
        }

        public final void onError(Throwable th) {
            this.f122236a.onError(th);
            m148509a();
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122238c, dVar)) {
                this.f122238c = dVar;
                if (dVar instanceof C47602f) {
                    this.f122239d = (C47602f) dVar;
                }
                this.f122236a.onSubscribe(this);
            }
        }

        public final int requestFusion(int i) {
            C47602f<T> fVar = this.f122239d;
            if (fVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = fVar.requestFusion(i);
            if (requestFusion != 0) {
                boolean z = true;
                if (requestFusion != 1) {
                    z = false;
                }
                this.f122240e = z;
            }
            return requestFusion;
        }

        C47692a(C47598a<? super T> aVar, C7323a aVar2) {
            this.f122236a = aVar;
            this.f122237b = aVar2;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.c$b */
    static final class C47693b<T> extends BasicIntQueueSubscription<T> implements C47597i<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final C48293c<? super T> f122241a;

        /* renamed from: b */
        final C7323a f122242b;

        /* renamed from: c */
        C48294d f122243c;

        /* renamed from: d */
        C47602f<T> f122244d;

        /* renamed from: e */
        boolean f122245e;

        public final void clear() {
            this.f122244d.clear();
        }

        public final boolean isEmpty() {
            return this.f122244d.isEmpty();
        }

        public final void cancel() {
            this.f122243c.cancel();
            m148511a();
        }

        public final void onComplete() {
            this.f122241a.onComplete();
            m148511a();
        }

        public final T poll() throws Exception {
            T poll = this.f122244d.poll();
            if (poll == null && this.f122245e) {
                m148511a();
            }
            return poll;
        }

        /* renamed from: a */
        private void m148511a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f122242b.mo8975a();
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    C7332a.m23029a(th);
                }
            }
        }

        public final void onNext(T t) {
            this.f122241a.onNext(t);
        }

        public final void request(long j) {
            this.f122243c.request(j);
        }

        public final void onError(Throwable th) {
            this.f122241a.onError(th);
            m148511a();
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122243c, dVar)) {
                this.f122243c = dVar;
                if (dVar instanceof C47602f) {
                    this.f122244d = (C47602f) dVar;
                }
                this.f122241a.onSubscribe(this);
            }
        }

        public final int requestFusion(int i) {
            C47602f<T> fVar = this.f122244d;
            if (fVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = fVar.requestFusion(i);
            if (requestFusion != 0) {
                boolean z = true;
                if (requestFusion != 1) {
                    z = false;
                }
                this.f122245e = z;
            }
            return requestFusion;
        }

        C47693b(C48293c<? super T> cVar, C7323a aVar) {
            this.f122241a = cVar;
            this.f122242b = aVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        if (cVar instanceof C47598a) {
            this.f20450a.mo19154a((C47597i<? super T>) new C47692a<Object>((C47598a) cVar, this.f122235c));
        } else {
            this.f20450a.mo19154a((C47597i<? super T>) new C47693b<Object>(cVar, this.f122235c));
        }
    }

    public C47691c(C7329e<T> eVar, C7323a aVar) {
        super(eVar);
        this.f122235c = aVar;
    }
}
