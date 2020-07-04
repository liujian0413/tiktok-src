package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.p361a.C48293c;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C47598a;
import p346io.reactivex.internal.subscriptions.BasicQueueSubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;

/* renamed from: io.reactivex.internal.operators.flowable.k */
public final class C47708k<T> extends C7329e<T> {

    /* renamed from: a */
    final T[] f122307a;

    /* renamed from: io.reactivex.internal.operators.flowable.k$a */
    static final class C47709a<T> extends C47711c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: a */
        final C47598a<? super T> f122308a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119755a() {
            Object[] objArr = this.f122310b;
            int length = objArr.length;
            C47598a<? super T> aVar = this.f122308a;
            int i = this.f122311c;
            while (i != length) {
                if (!this.f122312d) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        aVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        aVar.mo119684a(obj);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.f122312d) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119756a(long j) {
            Object[] objArr = this.f122310b;
            int length = objArr.length;
            int i = this.f122311c;
            C47598a<? super T> aVar = this.f122308a;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i == length) {
                        if (i == length) {
                            if (!this.f122312d) {
                                aVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f122311c = i;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f122312d) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            aVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        if (aVar.mo119684a(obj)) {
                            j3++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }

        C47709a(C47598a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f122308a = aVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.k$b */
    static final class C47710b<T> extends C47711c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: a */
        final C48293c<? super T> f122309a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119755a() {
            Object[] objArr = this.f122310b;
            int length = objArr.length;
            C48293c<? super T> cVar = this.f122309a;
            int i = this.f122311c;
            while (i != length) {
                if (!this.f122312d) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        cVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        cVar.onNext(obj);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.f122312d) {
                cVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119756a(long j) {
            Object[] objArr = this.f122310b;
            int length = objArr.length;
            int i = this.f122311c;
            C48293c<? super T> cVar = this.f122309a;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i == length) {
                        if (i == length) {
                            if (!this.f122312d) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f122311c = i;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f122312d) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            cVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        cVar.onNext(obj);
                        j3++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }

        C47710b(C48293c<? super T> cVar, T[] tArr) {
            super(tArr);
            this.f122309a = cVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.k$c */
    static abstract class C47711c<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b */
        final T[] f122310b;

        /* renamed from: c */
        int f122311c;

        /* renamed from: d */
        volatile boolean f122312d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo119755a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo119756a(long j);

        public final void cancel() {
            this.f122312d = true;
        }

        public final int requestFusion(int i) {
            return i & 1;
        }

        public final void clear() {
            this.f122311c = this.f122310b.length;
        }

        public final boolean isEmpty() {
            if (this.f122311c == this.f122310b.length) {
                return true;
            }
            return false;
        }

        public final T poll() {
            int i = this.f122311c;
            T[] tArr = this.f122310b;
            if (i == tArr.length) {
                return null;
            }
            this.f122311c = i + 1;
            return C7364b.m23081a(tArr[i], "array element is null");
        }

        C47711c(T[] tArr) {
            this.f122310b = tArr;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && C47833b.m148707a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo119755a();
                    return;
                }
                mo119756a(j);
            }
        }
    }

    public C47708k(T[] tArr) {
        this.f122307a = tArr;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        if (cVar instanceof C47598a) {
            cVar.onSubscribe(new C47709a((C47598a) cVar, this.f122307a));
        } else {
            cVar.onSubscribe(new C47710b(cVar, this.f122307a));
        }
    }
}
