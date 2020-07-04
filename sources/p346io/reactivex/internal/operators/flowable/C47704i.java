package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C47602f;
import p346io.reactivex.internal.p353b.C47603h;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.queue.SpscArrayQueue;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.AtomicThrowable;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.i */
public final class C47704i<T, U> extends C7368a<T, U> {

    /* renamed from: c */
    final C7327h<? super T, ? extends C7704b<? extends U>> f122271c;

    /* renamed from: d */
    final boolean f122272d;

    /* renamed from: e */
    final int f122273e;

    /* renamed from: f */
    final int f122274f;

    /* renamed from: io.reactivex.internal.operators.flowable.i$a */
    static final class C47705a<T, U> extends AtomicReference<C48294d> implements C7321c, C47597i<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a */
        final long f122275a;

        /* renamed from: b */
        final C47706b<T, U> f122276b;

        /* renamed from: c */
        final int f122277c = (this.f122278d >> 2);

        /* renamed from: d */
        final int f122278d;

        /* renamed from: e */
        volatile boolean f122279e;

        /* renamed from: f */
        volatile C47604i<U> f122280f;

        /* renamed from: g */
        long f122281g;

        /* renamed from: h */
        int f122282h;

        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public final boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            this.f122279e = true;
            this.f122276b.mo119752a();
        }

        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.f122276b.mo119753a(this, th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119751a(long j) {
            if (this.f122282h != 1) {
                long j2 = this.f122281g + j;
                if (j2 >= ((long) this.f122277c)) {
                    this.f122281g = 0;
                    ((C48294d) get()).request(j2);
                    return;
                }
                this.f122281g = j2;
            }
        }

        public final void onNext(U u) {
            if (this.f122282h != 2) {
                this.f122276b.mo119754a(u, this);
            } else {
                this.f122276b.mo119752a();
            }
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof C47602f) {
                    C47602f fVar = (C47602f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f122282h = requestFusion;
                        this.f122280f = fVar;
                        this.f122279e = true;
                        this.f122276b.mo119752a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f122282h = requestFusion;
                        this.f122280f = fVar;
                    }
                }
                dVar.request((long) this.f122278d);
            }
        }

        C47705a(C47706b<T, U> bVar, long j) {
            this.f122275a = j;
            this.f122276b = bVar;
            this.f122278d = bVar.f122289e;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$b */
    static final class C47706b<T, U> extends AtomicInteger implements C47597i<T>, C48294d {

        /* renamed from: k */
        static final C47705a<?, ?>[] f122283k = new C47705a[0];

        /* renamed from: l */
        static final C47705a<?, ?>[] f122284l = new C47705a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: a */
        final C48293c<? super U> f122285a;

        /* renamed from: b */
        final C7327h<? super T, ? extends C7704b<? extends U>> f122286b;

        /* renamed from: c */
        final boolean f122287c;

        /* renamed from: d */
        final int f122288d;

        /* renamed from: e */
        final int f122289e;

        /* renamed from: f */
        volatile C47603h<U> f122290f;

        /* renamed from: g */
        volatile boolean f122291g;

        /* renamed from: h */
        final AtomicThrowable f122292h = new AtomicThrowable();

        /* renamed from: i */
        volatile boolean f122293i;

        /* renamed from: j */
        final AtomicReference<C47705a<?, ?>[]> f122294j = new AtomicReference<>();

        /* renamed from: m */
        final AtomicLong f122295m = new AtomicLong();

        /* renamed from: n */
        C48294d f122296n;

        /* renamed from: o */
        long f122297o;

        /* renamed from: p */
        long f122298p;

        /* renamed from: q */
        int f122299q;

        /* renamed from: r */
        int f122300r;

        /* renamed from: s */
        final int f122301s;

        /* renamed from: e */
        private void m148530e() {
            C47603h<U> hVar = this.f122290f;
            if (hVar != null) {
                hVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119752a() {
            if (getAndIncrement() == 0) {
                m148528c();
            }
        }

        public final void onComplete() {
            if (!this.f122291g) {
                this.f122291g = true;
                mo119752a();
            }
        }

        /* renamed from: b */
        private C47604i<U> m148525b() {
            C47603h<U> hVar = this.f122290f;
            if (hVar == null) {
                if (this.f122288d == Integer.MAX_VALUE) {
                    hVar = new C47791b<>(this.f122289e);
                } else {
                    hVar = new SpscArrayQueue<>(this.f122288d);
                }
                this.f122290f = hVar;
            }
            return hVar;
        }

        public final void cancel() {
            if (!this.f122293i) {
                this.f122293i = true;
                this.f122296n.cancel();
                m148531f();
                if (getAndIncrement() == 0) {
                    C47603h<U> hVar = this.f122290f;
                    if (hVar != null) {
                        hVar.clear();
                    }
                }
            }
        }

        /* renamed from: d */
        private boolean m148529d() {
            if (this.f122293i) {
                m148530e();
                return true;
            } else if (this.f122287c || this.f122292h.get() == null) {
                return false;
            } else {
                m148530e();
                Throwable terminate = this.f122292h.terminate();
                if (terminate != C47836e.f122622a) {
                    this.f122285a.onError(terminate);
                }
                return true;
            }
        }

        /* renamed from: f */
        private void m148531f() {
            if (((C47705a[]) this.f122294j.get()) != f122284l) {
                C47705a<?, ?>[] aVarArr = (C47705a[]) this.f122294j.getAndSet(f122284l);
                if (aVarArr != f122284l) {
                    for (C47705a<?, ?> dispose : aVarArr) {
                        dispose.dispose();
                    }
                    Throwable terminate = this.f122292h.terminate();
                    if (terminate != null && terminate != C47836e.f122622a) {
                        C7332a.m23029a(terminate);
                    }
                }
            }
        }

        /* renamed from: c */
        private void m148528c() {
            boolean z;
            long j;
            long j2;
            int i;
            long j3;
            boolean z2;
            C47705a[] aVarArr;
            int i2;
            int i3;
            C48293c<? super U> cVar = this.f122285a;
            int i4 = 1;
            while (!m148529d()) {
                C47603h<U> hVar = this.f122290f;
                long j4 = this.f122295m.get();
                if (j4 == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (hVar != null) {
                    j = 0;
                    while (true) {
                        long j5 = 0;
                        Object obj = null;
                        while (true) {
                            if (j4 == 0) {
                                break;
                            }
                            Object poll = hVar.poll();
                            if (!m148529d()) {
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                cVar.onNext(poll);
                                j++;
                                j5++;
                                j4--;
                                obj = poll;
                            } else {
                                return;
                            }
                        }
                        if (j5 != 0) {
                            if (z) {
                                j4 = Long.MAX_VALUE;
                            } else {
                                j4 = this.f122295m.addAndGet(-j5);
                            }
                        }
                        if (j4 == 0 || obj == null) {
                            break;
                        }
                    }
                } else {
                    j = 0;
                }
                boolean z3 = this.f122291g;
                C47603h<U> hVar2 = this.f122290f;
                C47705a[] aVarArr2 = (C47705a[]) this.f122294j.get();
                int length = aVarArr2.length;
                if (!z3 || ((hVar2 != null && !hVar2.isEmpty()) || length != 0)) {
                    if (length != 0) {
                        i = i4;
                        long j6 = this.f122298p;
                        int i5 = this.f122299q;
                        if (length <= i5 || aVarArr2[i5].f122275a != j6) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && aVarArr2[i6].f122275a != j6; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.f122299q = i6;
                            this.f122298p = aVarArr2[i6].f122275a;
                            i5 = i6;
                        }
                        int i8 = i5;
                        z2 = false;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length) {
                                aVarArr = aVarArr2;
                                break;
                            } else if (!m148529d()) {
                                C47705a aVar = aVarArr2[i8];
                                Object obj2 = null;
                                while (!m148529d()) {
                                    C47604i<U> iVar = aVar.f122280f;
                                    if (iVar != null) {
                                        aVarArr = aVarArr2;
                                        i2 = length;
                                        long j7 = 0;
                                        while (j2 != 0) {
                                            try {
                                                obj2 = iVar.poll();
                                                if (obj2 == null) {
                                                    break;
                                                }
                                                cVar.onNext(obj2);
                                                if (!m148529d()) {
                                                    j2--;
                                                    j7++;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C7331a.m23009b(th2);
                                                aVar.dispose();
                                                this.f122292h.addThrowable(th2);
                                                if (!this.f122287c) {
                                                    this.f122296n.cancel();
                                                }
                                                if (!m148529d()) {
                                                    m148526b(aVar);
                                                    i9++;
                                                    i3 = i2;
                                                    z2 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j7 != 0) {
                                            if (!z) {
                                                j2 = this.f122295m.addAndGet(-j7);
                                            } else {
                                                j2 = Long.MAX_VALUE;
                                            }
                                            aVar.mo119751a(j7);
                                        }
                                        if (!(j2 == 0 || obj2 == null)) {
                                            aVarArr2 = aVarArr;
                                            length = i2;
                                        }
                                    } else {
                                        aVarArr = aVarArr2;
                                        i2 = length;
                                    }
                                    boolean z4 = aVar.f122279e;
                                    C47604i<U> iVar2 = aVar.f122280f;
                                    if (z4 && (iVar2 == null || iVar2.isEmpty())) {
                                        m148526b(aVar);
                                        if (!m148529d()) {
                                            j++;
                                            z2 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j2 == 0) {
                                        break;
                                    }
                                    int i10 = i8 + 1;
                                    i3 = i2;
                                    if (i10 == i3) {
                                        i8 = 0;
                                    } else {
                                        i8 = i10;
                                    }
                                    i9++;
                                    length = i3;
                                    aVarArr2 = aVarArr;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f122299q = i8;
                        this.f122298p = aVarArr[i8].f122275a;
                        j3 = j;
                    } else {
                        i = i4;
                        j3 = j;
                        z2 = false;
                    }
                    if (j3 != 0 && !this.f122293i) {
                        this.f122296n.request(j3);
                    }
                    if (!z2) {
                        i4 = addAndGet(-i);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        i4 = i;
                    }
                } else {
                    Throwable terminate = this.f122292h.terminate();
                    if (terminate != C47836e.f122622a) {
                        if (terminate == null) {
                            cVar.onComplete();
                            return;
                        }
                        cVar.onError(terminate);
                    }
                    return;
                }
            }
        }

        /* renamed from: c */
        private C47604i<U> m148527c(C47705a<T, U> aVar) {
            C47604i<U> iVar = aVar.f122280f;
            if (iVar != null) {
                return iVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.f122289e);
            aVar.f122280f = spscArrayQueue;
            return spscArrayQueue;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a(this.f122295m, j);
                mo119752a();
            }
        }

        public final void onError(Throwable th) {
            if (this.f122291g) {
                C7332a.m23029a(th);
            } else if (this.f122292h.addThrowable(th)) {
                this.f122291g = true;
                mo119752a();
            } else {
                C7332a.m23029a(th);
            }
        }

        /* renamed from: a */
        private boolean m148524a(C47705a<T, U> aVar) {
            C47705a<?, ?>[] aVarArr;
            C47705a[] aVarArr2;
            do {
                aVarArr = (C47705a[]) this.f122294j.get();
                if (aVarArr == f122284l) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C47705a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f122294j.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        private void m148526b(C47705a<T, U> aVar) {
            C47705a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C47705a[]) this.f122294j.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f122283k;
                        } else {
                            C47705a[] aVarArr2 = new C47705a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            obj = aVarArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f122294j.compareAndSet(aVarArr, obj));
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122296n, dVar)) {
                this.f122296n = dVar;
                this.f122285a.onSubscribe(this);
                if (!this.f122293i) {
                    if (this.f122288d == Integer.MAX_VALUE) {
                        dVar.request(Long.MAX_VALUE);
                        return;
                    }
                    dVar.request((long) this.f122288d);
                }
            }
        }

        public final void onNext(T t) {
            if (!this.f122291g) {
                try {
                    C7704b bVar = (C7704b) C7364b.m23081a(this.f122286b.apply(t), "The mapper returned a null Publisher");
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                m148523a((U) call);
                            } else {
                                if (this.f122288d != Integer.MAX_VALUE && !this.f122293i) {
                                    int i = this.f122300r + 1;
                                    this.f122300r = i;
                                    if (i == this.f122301s) {
                                        this.f122300r = 0;
                                        this.f122296n.request((long) this.f122301s);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            C7331a.m23009b(th);
                            this.f122292h.addThrowable(th);
                            mo119752a();
                        }
                    } else {
                        long j = this.f122297o;
                        this.f122297o = 1 + j;
                        C47705a aVar = new C47705a(this, j);
                        if (m148524a(aVar)) {
                            bVar.mo19155a(aVar);
                        }
                    }
                } catch (Throwable th2) {
                    C7331a.m23009b(th2);
                    this.f122296n.cancel();
                    onError(th2);
                }
            }
        }

        /* renamed from: a */
        private void m148523a(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f122295m.get();
                C47604i iVar = this.f122290f;
                if (j == 0 || (iVar != null && !iVar.isEmpty())) {
                    if (iVar == null) {
                        iVar = m148525b();
                    }
                    if (!iVar.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.f122285a.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f122295m.decrementAndGet();
                    }
                    if (this.f122288d != Integer.MAX_VALUE && !this.f122293i) {
                        int i = this.f122300r + 1;
                        this.f122300r = i;
                        if (i == this.f122301s) {
                            this.f122300r = 0;
                            this.f122296n.request((long) this.f122301s);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!m148525b().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m148528c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119753a(C47705a<T, U> aVar, Throwable th) {
            if (this.f122292h.addThrowable(th)) {
                aVar.f122279e = true;
                if (!this.f122287c) {
                    this.f122296n.cancel();
                    for (C47705a dispose : (C47705a[]) this.f122294j.getAndSet(f122284l)) {
                        dispose.dispose();
                    }
                }
                mo119752a();
                return;
            }
            C7332a.m23029a(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119754a(U u, C47705a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C47604i iVar = aVar.f122280f;
                if (iVar == null) {
                    iVar = new SpscArrayQueue(this.f122289e);
                    aVar.f122280f = iVar;
                }
                if (!iVar.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.f122295m.get();
                C47604i<U> iVar2 = aVar.f122280f;
                if (j == 0 || (iVar2 != null && !iVar2.isEmpty())) {
                    if (iVar2 == null) {
                        iVar2 = m148527c(aVar);
                    }
                    if (!iVar2.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.f122285a.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f122295m.decrementAndGet();
                    }
                    aVar.mo119751a(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            m148528c();
        }

        C47706b(C48293c<? super U> cVar, C7327h<? super T, ? extends C7704b<? extends U>> hVar, boolean z, int i, int i2) {
            this.f122285a = cVar;
            this.f122286b = hVar;
            this.f122287c = z;
            this.f122288d = i;
            this.f122289e = i2;
            this.f122301s = Math.max(1, i >> 1);
            this.f122294j.lazySet(f122283k);
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super U> cVar) {
        if (!C47669ab.m148473a(this.f20450a, cVar, this.f122271c)) {
            this.f20450a.mo19154a(m148520a(cVar, this.f122271c, this.f122272d, this.f122273e, this.f122274f));
        }
    }

    public C47704i(C7329e<T> eVar, C7327h<? super T, ? extends C7704b<? extends U>> hVar, boolean z, int i, int i2) {
        super(eVar);
        this.f122271c = hVar;
        this.f122272d = z;
        this.f122273e = i;
        this.f122274f = i2;
    }

    /* renamed from: a */
    public static <T, U> C47597i<T> m148520a(C48293c<? super U> cVar, C7327h<? super T, ? extends C7704b<? extends U>> hVar, boolean z, int i, int i2) {
        C47706b bVar = new C47706b(cVar, hVar, z, i, i2);
        return bVar;
    }
}
