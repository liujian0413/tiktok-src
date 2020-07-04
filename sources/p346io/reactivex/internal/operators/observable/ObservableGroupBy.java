package p346io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p349e.C47574b;

/* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy */
public final class ObservableGroupBy<T, K, V> extends C7376a<T, C47574b<K, V>> {

    /* renamed from: b */
    final C7327h<? super T, ? extends K> f20457b;

    /* renamed from: c */
    final C7327h<? super T, ? extends V> f20458c;

    /* renamed from: d */
    final int f20459d;

    /* renamed from: e */
    final boolean f20460e;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver */
    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements C7321c, C7498y<T> {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        final C7498y<? super C47574b<K, V>> downstream;
        final Map<Object, C7373a<K, V>> groups;
        final C7327h<? super T, ? extends K> keySelector;
        C7321c upstream;
        final C7327h<? super T, ? extends V> valueSelector;

        public final boolean isDisposed() {
            return this.cancelled.get();
        }

        public final void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        public final void onComplete() {
            ArrayList<C7373a> arrayList = new ArrayList<>(this.groups.values());
            this.groups.clear();
            for (C7373a a : arrayList) {
                a.mo10165a();
            }
            this.downstream.onComplete();
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void cancel(K k) {
            if (k == null) {
                k = NULL_KEY;
            }
            this.groups.remove(k);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        public final void onError(Throwable th) {
            ArrayList<C7373a> arrayList = new ArrayList<>(this.groups.values());
            this.groups.clear();
            for (C7373a b : arrayList) {
                b.mo19187b(th);
            }
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            Object obj;
            try {
                Object apply = this.keySelector.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = NULL_KEY;
                }
                C7373a aVar = (C7373a) this.groups.get(obj);
                if (aVar == null) {
                    if (!this.cancelled.get()) {
                        aVar = C7373a.m23087a(apply, this.bufferSize, this, this.delayError);
                        this.groups.put(obj, aVar);
                        getAndIncrement();
                        this.downstream.onNext(aVar);
                    } else {
                        return;
                    }
                }
                try {
                    aVar.mo19186a(C7364b.m23081a(this.valueSelector.apply(t), "The value supplied is null"));
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    this.upstream.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        public GroupByObserver(C7498y<? super C47574b<K, V>> yVar, C7327h<? super T, ? extends K> hVar, C7327h<? super T, ? extends V> hVar2, int i, boolean z) {
            this.downstream = yVar;
            this.keySelector = hVar;
            this.valueSelector = hVar2;
            this.bufferSize = i;
            this.delayError = z;
            this.groups = new ConcurrentHashMap();
            lazySet(1);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$a */
    static final class C7373a<K, T> extends C47574b<K, T> {

        /* renamed from: a */
        final C7374b<T, K> f20461a;

        /* renamed from: a */
        public final void mo10165a() {
            this.f20461a.mo19188a();
        }

        /* renamed from: a_ */
        public final void mo10166a_(C7498y<? super T> yVar) {
            this.f20461a.mo19189a(yVar);
        }

        /* renamed from: b */
        public final void mo19187b(Throwable th) {
            this.f20461a.mo19191a(th);
        }

        /* renamed from: a */
        public final void mo19186a(T t) {
            this.f20461a.mo19190a(t);
        }

        private C7373a(K k, C7374b<T, K> bVar) {
            super(k);
            this.f20461a = bVar;
        }

        /* renamed from: a */
        public static <T, K> C7373a<K, T> m23087a(K k, int i, GroupByObserver<?, K, T> groupByObserver, boolean z) {
            return new C7373a<>(k, new C7374b(i, groupByObserver, k, z));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$b */
    static final class C7374b<T, K> extends AtomicInteger implements C7321c, C7496w<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: a */
        final K f20462a;

        /* renamed from: b */
        final C47791b<T> f20463b;

        /* renamed from: c */
        final GroupByObserver<?, K, T> f20464c;

        /* renamed from: d */
        final boolean f20465d;

        /* renamed from: e */
        volatile boolean f20466e;

        /* renamed from: f */
        Throwable f20467f;

        /* renamed from: g */
        final AtomicBoolean f20468g = new AtomicBoolean();

        /* renamed from: h */
        final AtomicBoolean f20469h = new AtomicBoolean();

        /* renamed from: i */
        final AtomicReference<C7498y<? super T>> f20470i = new AtomicReference<>();

        /* renamed from: a */
        public final void mo19188a() {
            this.f20466e = true;
            m23093b();
        }

        public final boolean isDisposed() {
            return this.f20468g.get();
        }

        public final void dispose() {
            if (this.f20468g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f20470i.lazySet(null);
                this.f20464c.cancel(this.f20462a);
            }
        }

        /* renamed from: b */
        private void m23093b() {
            boolean z;
            if (getAndIncrement() == 0) {
                C47791b<T> bVar = this.f20463b;
                boolean z2 = this.f20465d;
                C7498y yVar = (C7498y) this.f20470i.get();
                int i = 1;
                while (true) {
                    if (yVar != null) {
                        while (true) {
                            boolean z3 = this.f20466e;
                            Object poll = bVar.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!m23092a(z3, z, yVar, z2)) {
                                if (z) {
                                    break;
                                }
                                yVar.onNext(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                    if (yVar == null) {
                        yVar = (C7498y) this.f20470i.get();
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo19190a(T t) {
            this.f20463b.offer(t);
            m23093b();
        }

        /* renamed from: a */
        public final void mo19191a(Throwable th) {
            this.f20467f = th;
            this.f20466e = true;
            m23093b();
        }

        /* renamed from: a */
        public final void mo19189a(C7498y<? super T> yVar) {
            if (this.f20469h.compareAndSet(false, true)) {
                yVar.onSubscribe(this);
                this.f20470i.lazySet(yVar);
                if (this.f20468g.get()) {
                    this.f20470i.lazySet(null);
                } else {
                    m23093b();
                }
            } else {
                EmptyDisposable.error((Throwable) new IllegalStateException("Only one Observer allowed!"), yVar);
            }
        }

        C7374b(int i, GroupByObserver<?, K, T> groupByObserver, K k, boolean z) {
            this.f20463b = new C47791b<>(i);
            this.f20464c = groupByObserver;
            this.f20462a = k;
            this.f20465d = z;
        }

        /* renamed from: a */
        private boolean m23092a(boolean z, boolean z2, C7498y<? super T> yVar, boolean z3) {
            if (this.f20468g.get()) {
                this.f20463b.clear();
                this.f20464c.cancel(this.f20462a);
                this.f20470i.lazySet(null);
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = this.f20467f;
                    if (th != null) {
                        this.f20463b.clear();
                        this.f20470i.lazySet(null);
                        yVar.onError(th);
                        return true;
                    } else if (z2) {
                        this.f20470i.lazySet(null);
                        yVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f20467f;
                    this.f20470i.lazySet(null);
                    if (th2 != null) {
                        yVar.onError(th2);
                    } else {
                        yVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super C47574b<K, V>> yVar) {
        C7496w wVar = this.f20473a;
        GroupByObserver groupByObserver = new GroupByObserver(yVar, this.f20457b, this.f20458c, this.f20459d, this.f20460e);
        wVar.mo19189a(groupByObserver);
    }

    public ObservableGroupBy(C7496w<T> wVar, C7327h<? super T, ? extends K> hVar, C7327h<? super T, ? extends V> hVar2, int i, boolean z) {
        super(wVar);
        this.f20457b = hVar;
        this.f20458c = hVar2;
        this.f20459d = i;
        this.f20460e = z;
    }
}
