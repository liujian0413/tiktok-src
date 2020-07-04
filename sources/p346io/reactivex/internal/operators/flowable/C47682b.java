package p346io.reactivex.internal.operators.flowable;

import com.C1642a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.BackpressureStrategy;
import p346io.reactivex.C47580g;
import p346io.reactivex.C47587h;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.b */
public final class C47682b<T> extends C7329e<T> {

    /* renamed from: a */
    final C47587h<T> f122222a;

    /* renamed from: c */
    final BackpressureStrategy f122223c;

    /* renamed from: io.reactivex.internal.operators.flowable.b$a */
    static abstract class C47684a<T> extends AtomicLong implements C47580g<T>, C48294d {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: a */
        final C48293c<? super T> f122225a;

        /* renamed from: b */
        final SequentialDisposable f122226b = new SequentialDisposable();

        /* renamed from: a */
        public void mo19238a() {
            mo119743b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo119745c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo119748e() {
        }

        /* renamed from: d */
        public final boolean mo119747d() {
            return this.f122226b.isDisposed();
        }

        public final void cancel() {
            this.f122226b.dispose();
            mo119745c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo119743b() {
            if (!mo119747d()) {
                try {
                    this.f122225a.onComplete();
                } finally {
                    this.f122226b.dispose();
                }
            }
        }

        public String toString() {
            return C1642a.m8034a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        /* renamed from: b */
        public boolean mo119744b(Throwable th) {
            return mo119746c(th);
        }

        C47684a(C48293c<? super T> cVar) {
            this.f122225a = cVar;
        }

        /* renamed from: a */
        public final void mo19240a(Throwable th) {
            if (!mo119744b(th)) {
                C7332a.m23029a(th);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a((AtomicLong) this, j);
                mo119748e();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final boolean mo119746c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (mo119747d()) {
                return false;
            }
            try {
                this.f122225a.onError(th);
                this.f122226b.dispose();
                return true;
            } catch (Throwable th2) {
                this.f122226b.dispose();
                throw th2;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$b */
    static final class C47685b<T> extends C47684a<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: c */
        final C47791b<T> f122227c;

        /* renamed from: d */
        Throwable f122228d;

        /* renamed from: e */
        volatile boolean f122229e;

        /* renamed from: f */
        final AtomicInteger f122230f = new AtomicInteger();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo119748e() {
            m148491f();
        }

        /* renamed from: a */
        public final void mo19238a() {
            this.f122229e = true;
            m148491f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo119745c() {
            if (this.f122230f.getAndIncrement() == 0) {
                this.f122227c.clear();
            }
        }

        /* renamed from: f */
        private void m148491f() {
            boolean z;
            if (this.f122230f.getAndIncrement() == 0) {
                C48293c cVar = this.f122225a;
                C47791b<T> bVar = this.f122227c;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (mo119747d()) {
                            bVar.clear();
                            return;
                        }
                        boolean z2 = this.f122229e;
                        Object poll = bVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2 || !z) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            Throwable th = this.f122228d;
                            if (th != null) {
                                mo119746c(th);
                                return;
                            } else {
                                mo119743b();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (mo119747d()) {
                            bVar.clear();
                            return;
                        }
                        boolean z3 = this.f122229e;
                        boolean isEmpty = bVar.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.f122228d;
                            if (th2 != null) {
                                mo119746c(th2);
                                return;
                            } else {
                                mo119743b();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C47833b.m148709c(this, j2);
                    }
                    i = this.f122230f.addAndGet(-i);
                } while (i != 0);
            }
        }

        /* renamed from: b */
        public final boolean mo119744b(Throwable th) {
            if (this.f122229e || mo119747d()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f122228d = th;
            this.f122229e = true;
            m148491f();
            return true;
        }

        /* renamed from: a */
        public final void mo19239a(T t) {
            if (!this.f122229e && !mo119747d()) {
                if (t == null) {
                    mo19240a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f122227c.offer(t);
                m148491f();
            }
        }

        C47685b(C48293c<? super T> cVar, int i) {
            super(cVar);
            this.f122227c = new C47791b<>(i);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$c */
    static final class C47686c<T> extends C47690g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final void mo119750f() {
        }

        C47686c(C48293c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$d */
    static final class C47687d<T> extends C47690g<T> {
        private static final long serialVersionUID = 338953216916120960L;

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final void mo119750f() {
            mo19240a(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }

        C47687d(C48293c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$e */
    static final class C47688e<T> extends C47684a<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: c */
        final AtomicReference<T> f122231c = new AtomicReference<>();

        /* renamed from: d */
        Throwable f122232d;

        /* renamed from: e */
        volatile boolean f122233e;

        /* renamed from: f */
        final AtomicInteger f122234f = new AtomicInteger();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo119748e() {
            m148499f();
        }

        /* renamed from: a */
        public final void mo19238a() {
            this.f122233e = true;
            m148499f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo119745c() {
            if (this.f122234f.getAndIncrement() == 0) {
                this.f122231c.lazySet(null);
            }
        }

        /* renamed from: f */
        private void m148499f() {
            boolean z;
            boolean z2;
            if (this.f122234f.getAndIncrement() == 0) {
                C48293c cVar = this.f122225a;
                AtomicReference<T> atomicReference = this.f122231c;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (mo119747d()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z3 = this.f122233e;
                            Object andSet = atomicReference.getAndSet(null);
                            if (andSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3 || !z2) {
                                if (z2) {
                                    break;
                                }
                                cVar.onNext(andSet);
                                j2++;
                            } else {
                                Throwable th = this.f122232d;
                                if (th != null) {
                                    mo119746c(th);
                                    return;
                                } else {
                                    mo119743b();
                                    return;
                                }
                            }
                        }
                    }
                    if (j2 == j) {
                        if (mo119747d()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.f122233e;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.f122232d;
                            if (th2 != null) {
                                mo119746c(th2);
                                return;
                            } else {
                                mo119743b();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C47833b.m148709c(this, j2);
                    }
                    i = this.f122234f.addAndGet(-i);
                } while (i != 0);
            }
        }

        C47688e(C48293c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public final void mo19239a(T t) {
            if (!this.f122233e && !mo119747d()) {
                if (t == null) {
                    mo19240a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f122231c.set(t);
                m148499f();
            }
        }

        /* renamed from: b */
        public final boolean mo119744b(Throwable th) {
            if (this.f122233e || mo119747d()) {
                return false;
            }
            if (th == null) {
                mo19240a(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f122232d = th;
            this.f122233e = true;
            m148499f();
            return true;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$f */
    static final class C47689f<T> extends C47684a<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        C47689f(C48293c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public final void mo19239a(T t) {
            long j;
            if (!mo119747d()) {
                if (t != null) {
                    this.f122225a.onNext(t);
                    do {
                        j = get();
                        if (j == 0) {
                            break;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                mo19240a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b$g */
    static abstract class C47690g<T> extends C47684a<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public abstract void mo119750f();

        C47690g(C48293c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public final void mo19239a(T t) {
            if (!mo119747d()) {
                if (t == null) {
                    mo19240a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.f122225a.onNext(t);
                    C47833b.m148709c(this, 1);
                } else {
                    mo119750f();
                }
            }
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        C47684a aVar;
        switch (this.f122223c) {
            case MISSING:
                aVar = new C47689f(cVar);
                break;
            case ERROR:
                aVar = new C47687d(cVar);
                break;
            case DROP:
                aVar = new C47686c(cVar);
                break;
            case LATEST:
                aVar = new C47688e(cVar);
                break;
            default:
                aVar = new C47685b(cVar, m22962a());
                break;
        }
        cVar.onSubscribe(aVar);
        try {
            this.f122222a.mo21219a(aVar);
        } catch (Throwable th) {
            C7331a.m23009b(th);
            aVar.mo19240a(th);
        }
    }

    public C47682b(C47587h<T> hVar, BackpressureStrategy backpressureStrategy) {
        this.f122222a = hVar;
        this.f122223c = backpressureStrategy;
    }
}
