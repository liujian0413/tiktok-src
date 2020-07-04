package p346io.reactivex.internal.operators.flowable;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C47597i;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p346io.reactivex.internal.subscriptions.EmptySubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.internal.util.EmptyComponent;
import p346io.reactivex.p1868c.C47566a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy */
public final class FlowableGroupBy<T, K, V> extends C7368a<T, C47566a<K, V>> {

    /* renamed from: c */
    final C7327h<? super T, ? extends K> f122156c;

    /* renamed from: d */
    final C7327h<? super T, ? extends V> f122157d;

    /* renamed from: e */
    final int f122158e;

    /* renamed from: f */
    final boolean f122159f;

    /* renamed from: g */
    final C7327h<? super C7326g<Object>, ? extends Map<K, Object>> f122160g;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber */
    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<C47566a<K, V>> implements C47597i<T> {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        boolean done;
        final C48293c<? super C47566a<K, V>> downstream;
        Throwable error;
        final Queue<C47663b<K, V>> evictedGroups;
        volatile boolean finished;
        final AtomicInteger groupCount = new AtomicInteger(1);
        final Map<Object, C47663b<K, V>> groups;
        final C7327h<? super T, ? extends K> keySelector;
        boolean outputFused;
        final C47791b<C47566a<K, V>> queue;
        final AtomicLong requested = new AtomicLong();
        C48294d upstream;
        final C7327h<? super T, ? extends V> valueSelector;

        public final void clear() {
            this.queue.clear();
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public final C47566a<K, V> poll() {
            return (C47566a) this.queue.poll();
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i = 0;
                while (true) {
                    C47663b bVar = (C47663b) this.evictedGroups.poll();
                    if (bVar == null) {
                        break;
                    }
                    bVar.mo119676g();
                    i++;
                }
                if (i != 0) {
                    this.groupCount.addAndGet(-i);
                }
            }
        }

        public final void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void drain() {
            if (getAndIncrement() == 0) {
                if (this.outputFused) {
                    drainFused();
                } else {
                    drainNormal();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void drainFused() {
            C47791b<C47566a<K, V>> bVar = this.queue;
            C48293c<? super C47566a<K, V>> cVar = this.downstream;
            int i = 1;
            while (!this.cancelled.get()) {
                boolean z = this.finished;
                if (z && !this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        bVar.clear();
                        cVar.onError(th);
                        return;
                    }
                }
                cVar.onNext(null);
                if (z) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            bVar.clear();
        }

        public final void onComplete() {
            if (!this.done) {
                for (C47663b g : this.groups.values()) {
                    g.mo119676g();
                }
                this.groups.clear();
                if (this.evictedGroups != null) {
                    this.evictedGroups.clear();
                }
                this.done = true;
                this.finished = true;
                drain();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void drainNormal() {
            boolean z;
            C47791b<C47566a<K, V>> bVar = this.queue;
            C48293c<? super C47566a<K, V>> cVar = this.downstream;
            int i = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.finished;
                    C47566a aVar = (C47566a) bVar.poll();
                    if (aVar == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!checkTerminated(z2, z, cVar, bVar)) {
                        if (z) {
                            break;
                        }
                        cVar.onNext(aVar);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (j2 != j || !checkTerminated(this.finished, bVar.isEmpty(), cVar, bVar)) {
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                        this.upstream.request(j2);
                    }
                    i = addAndGet(-i);
                } else {
                    return;
                }
            } while (i != 0);
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a(this.requested, j);
                drain();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request((long) this.bufferSize);
            }
        }

        public final void cancel(K k) {
            if (k == null) {
                k = NULL_KEY;
            }
            this.groups.remove(k);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                C7332a.m23029a(th);
                return;
            }
            this.done = true;
            for (C47663b b : this.groups.values()) {
                b.mo119730b(th);
            }
            this.groups.clear();
            if (this.evictedGroups != null) {
                this.evictedGroups.clear();
            }
            this.error = th;
            this.finished = true;
            drain();
        }

        public final void onNext(T t) {
            Object obj;
            if (!this.done) {
                C47791b<C47566a<K, V>> bVar = this.queue;
                try {
                    Object apply = this.keySelector.apply(t);
                    boolean z = false;
                    if (apply != null) {
                        obj = apply;
                    } else {
                        obj = NULL_KEY;
                    }
                    C47663b bVar2 = (C47663b) this.groups.get(obj);
                    if (bVar2 == null) {
                        if (!this.cancelled.get()) {
                            bVar2 = C47663b.m148453a(apply, this.bufferSize, this, this.delayError);
                            this.groups.put(obj, bVar2);
                            this.groupCount.getAndIncrement();
                            z = true;
                        } else {
                            return;
                        }
                    }
                    try {
                        bVar2.mo119729b(C7364b.m23081a(this.valueSelector.apply(t), "The valueSelector returned null"));
                        completeEvictions();
                        if (z) {
                            bVar.offer(bVar2);
                            drain();
                        }
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        this.upstream.cancel();
                        onError(th);
                    }
                } catch (Throwable th2) {
                    C7331a.m23009b(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean checkTerminated(boolean z, boolean z2, C48293c<?> cVar, C47791b<?> bVar) {
            if (this.cancelled.get()) {
                bVar.clear();
                return true;
            }
            if (this.delayError) {
                if (z && z2) {
                    Throwable th = this.error;
                    if (th != null) {
                        cVar.onError(th);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            } else if (z) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    bVar.clear();
                    cVar.onError(th2);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        public GroupBySubscriber(C48293c<? super C47566a<K, V>> cVar, C7327h<? super T, ? extends K> hVar, C7327h<? super T, ? extends V> hVar2, int i, boolean z, Map<Object, C47663b<K, V>> map, Queue<C47663b<K, V>> queue2) {
            this.downstream = cVar;
            this.keySelector = hVar;
            this.valueSelector = hVar2;
            this.bufferSize = i;
            this.delayError = z;
            this.groups = map;
            this.evictedGroups = queue2;
            this.queue = new C47791b<>(i);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$a */
    static final class C47662a<K, V> implements C7326g<C47663b<K, V>> {

        /* renamed from: a */
        final Queue<C47663b<K, V>> f122161a;

        C47662a(Queue<C47663b<K, V>> queue) {
            this.f122161a = queue;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C47663b<K, V> bVar) {
            this.f122161a.offer(bVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$b */
    static final class C47663b<K, T> extends C47566a<K, T> {

        /* renamed from: c */
        final C47664c<T, K> f122162c;

        /* renamed from: g */
        public final void mo119676g() {
            this.f122162c.mo119731a();
        }

        /* renamed from: a_ */
        public final void mo10197a_(C48293c<? super T> cVar) {
            this.f122162c.mo19155a(cVar);
        }

        /* renamed from: b */
        public final void mo119729b(T t) {
            this.f122162c.mo119732a(t);
        }

        /* renamed from: b */
        public final void mo119730b(Throwable th) {
            this.f122162c.mo119733a(th);
        }

        private C47663b(K k, C47664c<T, K> cVar) {
            super(k);
            this.f122162c = cVar;
        }

        /* renamed from: a */
        public static <T, K> C47663b<K, T> m148453a(K k, int i, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z) {
            return new C47663b<>(k, new C47664c(i, groupBySubscriber, k, z));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$c */
    static final class C47664c<T, K> extends BasicIntQueueSubscription<T> implements C7704b<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: a */
        final K f122163a;

        /* renamed from: b */
        final C47791b<T> f122164b;

        /* renamed from: c */
        final GroupBySubscriber<?, K, T> f122165c;

        /* renamed from: d */
        final boolean f122166d;

        /* renamed from: e */
        final AtomicLong f122167e = new AtomicLong();

        /* renamed from: f */
        volatile boolean f122168f;

        /* renamed from: g */
        Throwable f122169g;

        /* renamed from: h */
        final AtomicBoolean f122170h = new AtomicBoolean();

        /* renamed from: i */
        final AtomicReference<C48293c<? super T>> f122171i = new AtomicReference<>();

        /* renamed from: j */
        final AtomicBoolean f122172j = new AtomicBoolean();

        /* renamed from: k */
        boolean f122173k;

        /* renamed from: l */
        int f122174l;

        /* renamed from: a */
        public final void mo119731a() {
            this.f122168f = true;
            m148459b();
        }

        public final void clear() {
            this.f122164b.clear();
        }

        public final boolean isEmpty() {
            return this.f122164b.isEmpty();
        }

        /* renamed from: b */
        private void m148459b() {
            if (getAndIncrement() == 0) {
                if (this.f122173k) {
                    m148460c();
                } else {
                    m148461d();
                }
            }
        }

        public final void cancel() {
            if (this.f122170h.compareAndSet(false, true)) {
                this.f122165c.cancel(this.f122163a);
            }
        }

        public final T poll() {
            T poll = this.f122164b.poll();
            if (poll != null) {
                this.f122174l++;
                return poll;
            }
            int i = this.f122174l;
            if (i != 0) {
                this.f122174l = 0;
                this.f122165c.upstream.request((long) i);
            }
            return null;
        }

        /* renamed from: c */
        private void m148460c() {
            C47791b<T> bVar = this.f122164b;
            C48293c cVar = (C48293c) this.f122171i.get();
            int i = 1;
            while (true) {
                if (cVar != null) {
                    if (this.f122170h.get()) {
                        bVar.clear();
                        return;
                    }
                    boolean z = this.f122168f;
                    if (z && !this.f122166d) {
                        Throwable th = this.f122169g;
                        if (th != null) {
                            bVar.clear();
                            cVar.onError(th);
                            return;
                        }
                    }
                    cVar.onNext(null);
                    if (z) {
                        Throwable th2 = this.f122169g;
                        if (th2 != null) {
                            cVar.onError(th2);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i != 0) {
                    if (cVar == null) {
                        cVar = (C48293c) this.f122171i.get();
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: d */
        private void m148461d() {
            boolean z;
            C47791b<T> bVar = this.f122164b;
            boolean z2 = this.f122166d;
            C48293c cVar = (C48293c) this.f122171i.get();
            int i = 1;
            while (true) {
                if (cVar != null) {
                    long j = this.f122167e.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z3 = this.f122168f;
                        Object poll = bVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!m148458a(z3, z, cVar, z2)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && m148458a(this.f122168f, bVar.isEmpty(), cVar, z2)) {
                        return;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.f122167e.addAndGet(-j2);
                        }
                        this.f122165c.upstream.request(j2);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (cVar == null) {
                    cVar = (C48293c) this.f122171i.get();
                }
            }
        }

        /* renamed from: a */
        public final void mo119732a(T t) {
            this.f122164b.offer(t);
            m148459b();
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a(this.f122167e, j);
                m148459b();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f122173k = true;
            return 2;
        }

        /* renamed from: a */
        public final void mo119733a(Throwable th) {
            this.f122169g = th;
            this.f122168f = true;
            m148459b();
        }

        /* renamed from: a */
        public final void mo19155a(C48293c<? super T> cVar) {
            if (this.f122172j.compareAndSet(false, true)) {
                cVar.onSubscribe(this);
                this.f122171i.lazySet(cVar);
                m148459b();
                return;
            }
            EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), cVar);
        }

        C47664c(int i, GroupBySubscriber<?, K, T> groupBySubscriber, K k, boolean z) {
            this.f122164b = new C47791b<>(i);
            this.f122165c = groupBySubscriber;
            this.f122163a = k;
            this.f122166d = z;
        }

        /* renamed from: a */
        private boolean m148458a(boolean z, boolean z2, C48293c<? super T> cVar, boolean z3) {
            if (this.f122170h.get()) {
                this.f122164b.clear();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = this.f122169g;
                    if (th != null) {
                        this.f122164b.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z2) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f122169g;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super C47566a<K, V>> cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map map;
        try {
            if (this.f122160g == null) {
                concurrentLinkedQueue = null;
                map = new ConcurrentHashMap();
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                map = (Map) this.f122160g.apply(new C47662a(concurrentLinkedQueue));
            }
            GroupBySubscriber groupBySubscriber = new GroupBySubscriber(cVar, this.f122156c, this.f122157d, this.f122158e, this.f122159f, map, concurrentLinkedQueue);
            this.f20450a.mo19154a((C47597i<? super T>) groupBySubscriber);
        } catch (Exception e) {
            C7331a.m23009b(e);
            cVar.onSubscribe(EmptyComponent.INSTANCE);
            cVar.onError(e);
        }
    }
}
