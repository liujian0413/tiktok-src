package com.google.common.cache;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import com.google.common.base.C17454q;
import com.google.common.base.C17463v;
import com.google.common.base.Equivalence;
import com.google.common.cache.C17470a.C17472b;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import com.google.common.collect.C17782br;
import com.google.common.collect.C18039l;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.C18143c;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.google.common.util.concurrent.C18259o;
import com.google.common.util.concurrent.C18260p;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.cache.f */
class C17482f<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a */
    static final Logger f48465a = Logger.getLogger(C17482f.class.getName());

    /* renamed from: u */
    static final C17533w<Object, Object> f48466u = new C17533w<Object, Object>() {
        /* renamed from: a */
        public final int mo45035a() {
            return 0;
        }

        /* renamed from: a */
        public final C17533w<Object, Object> mo45036a(ReferenceQueue<Object> referenceQueue, Object obj, C17543j<Object, Object> jVar) {
            return this;
        }

        /* renamed from: a */
        public final void mo45037a(Object obj) {
        }

        /* renamed from: b */
        public final C17543j<Object, Object> mo45038b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo45039c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo45040d() {
            return false;
        }

        /* renamed from: e */
        public final Object mo45041e() {
            return null;
        }

        public final Object get() {
            return null;
        }
    };

    /* renamed from: v */
    static final Queue<?> f48467v = new AbstractQueue<Object>() {
        public final boolean offer(Object obj) {
            return true;
        }

        public final Object peek() {
            return null;
        }

        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }

        public final Iterator<Object> iterator() {
            return ImmutableSet.m58649of().iterator();
        }
    };

    /* renamed from: b */
    final int f48468b;

    /* renamed from: c */
    final int f48469c;

    /* renamed from: d */
    final C17520n<K, V>[] f48470d;

    /* renamed from: e */
    final int f48471e;

    /* renamed from: f */
    final Equivalence<Object> f48472f;

    /* renamed from: g */
    final Equivalence<Object> f48473g;

    /* renamed from: h */
    final C17523p f48474h;

    /* renamed from: i */
    final C17523p f48475i;

    /* renamed from: j */
    final long f48476j;

    /* renamed from: k */
    final C17548m<K, V> f48477k;

    /* renamed from: l */
    final long f48478l;

    /* renamed from: m */
    final long f48479m;

    /* renamed from: n */
    final long f48480n;

    /* renamed from: o */
    final Queue<RemovalNotification<K, V>> f48481o;

    /* renamed from: p */
    final C17544k<K, V> f48482p;

    /* renamed from: q */
    final C17463v f48483q;

    /* renamed from: r */
    final C17500d f48484r;

    /* renamed from: s */
    final C17472b f48485s;

    /* renamed from: t */
    final CacheLoader<? super K, V> f48486t;

    /* renamed from: w */
    Set<K> f48487w;

    /* renamed from: x */
    Collection<V> f48488x;

    /* renamed from: y */
    Set<Entry<K, V>> f48489y;

    /* renamed from: com.google.common.cache.f$a */
    abstract class C17485a<T> extends AbstractSet<T> {

        /* renamed from: a */
        final ConcurrentMap<?, ?> f48490a;

        public void clear() {
            this.f48490a.clear();
        }

        public boolean isEmpty() {
            return this.f48490a.isEmpty();
        }

        public int size() {
            return this.f48490a.size();
        }

        public Object[] toArray() {
            return C17482f.m58097a((Collection<E>) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return C17482f.m58097a((Collection<E>) this).toArray(eArr);
        }

        C17485a(ConcurrentMap<?, ?> concurrentMap) {
            this.f48490a = concurrentMap;
        }
    }

    /* renamed from: com.google.common.cache.f$aa */
    static class C17486aa<K, V> extends WeakReference<K> implements C17543j<K, V> {

        /* renamed from: g */
        final int f48492g;

        /* renamed from: h */
        final C17543j<K, V> f48493h;

        /* renamed from: i */
        volatile C17533w<K, V> f48494i = C17482f.m58105j();

        /* renamed from: a */
        public final C17533w<K, V> mo45053a() {
            return this.f48494i;
        }

        /* renamed from: b */
        public final C17543j<K, V> mo45057b() {
            return this.f48493h;
        }

        /* renamed from: c */
        public final int mo45060c() {
            return this.f48492g;
        }

        /* renamed from: d */
        public final K mo45062d() {
            return get();
        }

        /* renamed from: e */
        public long mo45064e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C17543j<K, V> mo45065f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C17543j<K, V> mo45066g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo45067h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C17543j<K, V> mo45068i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C17543j<K, V> mo45069j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo45054a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo45058b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo45061c(C17543j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final void mo45055a(C17533w<K, V> wVar) {
            this.f48494i = wVar;
        }

        /* renamed from: b */
        public void mo45059b(C17543j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo45063d(C17543j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo45056a(C17543j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        C17486aa(ReferenceQueue<K> referenceQueue, K k, int i, C17543j<K, V> jVar) {
            super(k, referenceQueue);
            this.f48492g = i;
            this.f48493h = jVar;
        }
    }

    /* renamed from: com.google.common.cache.f$ab */
    static class C17487ab<K, V> extends WeakReference<V> implements C17533w<K, V> {

        /* renamed from: a */
        final C17543j<K, V> f48495a;

        /* renamed from: a */
        public int mo45035a() {
            return 1;
        }

        /* renamed from: a */
        public final void mo45037a(V v) {
        }

        /* renamed from: b */
        public final C17543j<K, V> mo45038b() {
            return this.f48495a;
        }

        /* renamed from: c */
        public final boolean mo45039c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo45040d() {
            return true;
        }

        /* renamed from: e */
        public final V mo45041e() {
            return get();
        }

        C17487ab(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar) {
            super(v, referenceQueue);
            this.f48495a = jVar;
        }

        /* renamed from: a */
        public C17533w<K, V> mo45036a(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar) {
            return new C17487ab(referenceQueue, v, jVar);
        }
    }

    /* renamed from: com.google.common.cache.f$ac */
    static final class C17488ac<K, V> extends C17486aa<K, V> {

        /* renamed from: a */
        volatile long f48496a = Long.MAX_VALUE;

        /* renamed from: b */
        C17543j<K, V> f48497b = C17482f.m58106k();

        /* renamed from: c */
        C17543j<K, V> f48498c = C17482f.m58106k();

        /* renamed from: h */
        public final long mo45067h() {
            return this.f48496a;
        }

        /* renamed from: i */
        public final C17543j<K, V> mo45068i() {
            return this.f48497b;
        }

        /* renamed from: j */
        public final C17543j<K, V> mo45069j() {
            return this.f48498c;
        }

        /* renamed from: b */
        public final void mo45058b(long j) {
            this.f48496a = j;
        }

        /* renamed from: c */
        public final void mo45061c(C17543j<K, V> jVar) {
            this.f48497b = jVar;
        }

        /* renamed from: d */
        public final void mo45063d(C17543j<K, V> jVar) {
            this.f48498c = jVar;
        }

        C17488ac(ReferenceQueue<K> referenceQueue, K k, int i, C17543j<K, V> jVar) {
            super(referenceQueue, k, i, jVar);
        }
    }

    /* renamed from: com.google.common.cache.f$ad */
    static final class C17489ad<K, V> extends C17522o<K, V> {

        /* renamed from: b */
        final int f48499b;

        /* renamed from: a */
        public final int mo45035a() {
            return this.f48499b;
        }

        /* renamed from: a */
        public final C17533w<K, V> mo45036a(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar) {
            return new C17489ad(referenceQueue, v, jVar, this.f48499b);
        }

        C17489ad(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar, int i) {
            super(referenceQueue, v, jVar);
            this.f48499b = i;
        }
    }

    /* renamed from: com.google.common.cache.f$ae */
    static final class C17490ae<K, V> extends C17530t<K, V> {

        /* renamed from: b */
        final int f48500b;

        /* renamed from: a */
        public final int mo45035a() {
            return this.f48500b;
        }

        C17490ae(V v, int i) {
            super(v);
            this.f48500b = i;
        }
    }

    /* renamed from: com.google.common.cache.f$af */
    static final class C17491af<K, V> extends C17487ab<K, V> {

        /* renamed from: b */
        final int f48501b;

        /* renamed from: a */
        public final int mo45035a() {
            return this.f48501b;
        }

        /* renamed from: a */
        public final C17533w<K, V> mo45036a(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar) {
            return new C17491af(referenceQueue, v, jVar, this.f48501b);
        }

        C17491af(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar, int i) {
            super(referenceQueue, v, jVar);
            this.f48501b = i;
        }
    }

    /* renamed from: com.google.common.cache.f$ag */
    static final class C17492ag<K, V> extends AbstractQueue<C17543j<K, V>> {

        /* renamed from: a */
        final C17543j<K, V> f48502a = new C17496b<K, V>() {

            /* renamed from: a */
            C17543j<K, V> f48503a = this;

            /* renamed from: b */
            C17543j<K, V> f48504b = this;

            /* renamed from: b */
            public final void mo45058b(long j) {
            }

            /* renamed from: h */
            public final long mo45067h() {
                return Long.MAX_VALUE;
            }

            /* renamed from: i */
            public final C17543j<K, V> mo45068i() {
                return this.f48503a;
            }

            /* renamed from: j */
            public final C17543j<K, V> mo45069j() {
                return this.f48504b;
            }

            /* renamed from: c */
            public final void mo45061c(C17543j<K, V> jVar) {
                this.f48503a = jVar;
            }

            /* renamed from: d */
            public final void mo45063d(C17543j<K, V> jVar) {
                this.f48504b = jVar;
            }
        };

        C17492ag() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17543j<K, V> peek() {
            C17543j<K, V> i = this.f48502a.mo45068i();
            if (i == this.f48502a) {
                return null;
            }
            return i;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17543j<K, V> poll() {
            C17543j<K, V> i = this.f48502a.mo45068i();
            if (i == this.f48502a) {
                return null;
            }
            remove(i);
            return i;
        }

        public final boolean isEmpty() {
            if (this.f48502a.mo45068i() == this.f48502a) {
                return true;
            }
            return false;
        }

        public final Iterator<C17543j<K, V>> iterator() {
            return new C18039l<C17543j<K, V>>(peek()) {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C17543j<K, V> mo45079a(C17543j<K, V> jVar) {
                    C17543j<K, V> i = jVar.mo45068i();
                    if (i == C17492ag.this.f48502a) {
                        return null;
                    }
                    return i;
                }
            };
        }

        public final int size() {
            int i = 0;
            for (C17543j<K, V> i2 = this.f48502a.mo45068i(); i2 != this.f48502a; i2 = i2.mo45068i()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C17543j<K, V> i = this.f48502a.mo45068i();
            while (i != this.f48502a) {
                C17543j i2 = i.mo45068i();
                C17482f.m58103c(i);
                i = i2;
            }
            this.f48502a.mo45061c(this.f48502a);
            this.f48502a.mo45063d(this.f48502a);
        }

        public final boolean contains(Object obj) {
            if (((C17543j) obj).mo45068i() != C17519m.INSTANCE) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean offer(C17543j<K, V> jVar) {
            C17482f.m58102b(jVar.mo45069j(), jVar.mo45068i());
            C17482f.m58102b(this.f48502a.mo45069j(), jVar);
            C17482f.m58102b(jVar, this.f48502a);
            return true;
        }

        public final boolean remove(Object obj) {
            C17543j jVar = (C17543j) obj;
            C17543j j = jVar.mo45069j();
            C17543j i = jVar.mo45068i();
            C17482f.m58102b(j, i);
            C17482f.m58103c(jVar);
            if (i != C17519m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.cache.f$ah */
    final class C17495ah implements Entry<K, V> {

        /* renamed from: a */
        final K f48507a;

        /* renamed from: b */
        V f48508b;

        public final K getKey() {
            return this.f48507a;
        }

        public final V getValue() {
            return this.f48508b;
        }

        public final int hashCode() {
            return this.f48507a.hashCode() ^ this.f48508b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final V setValue(V v) {
            V put = C17482f.this.put(this.f48507a, v);
            this.f48508b = v;
            return put;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f48507a.equals(entry.getKey()) || !this.f48508b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        C17495ah(K k, V v) {
            this.f48507a = k;
            this.f48508b = v;
        }
    }

    /* renamed from: com.google.common.cache.f$b */
    static abstract class C17496b<K, V> implements C17543j<K, V> {
        C17496b() {
        }

        /* renamed from: a */
        public C17533w<K, V> mo45053a() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public C17543j<K, V> mo45057b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public int mo45060c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public K mo45062d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public long mo45064e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C17543j<K, V> mo45065f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C17543j<K, V> mo45066g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo45067h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C17543j<K, V> mo45068i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C17543j<K, V> mo45069j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo45054a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo45058b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo45061c(C17543j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo45063d(C17543j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo45055a(C17533w<K, V> wVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo45059b(C17543j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo45056a(C17543j<K, V> jVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.cache.f$c */
    static final class C17497c<K, V> extends AbstractQueue<C17543j<K, V>> {

        /* renamed from: a */
        final C17543j<K, V> f48510a = new C17496b<K, V>() {

            /* renamed from: a */
            C17543j<K, V> f48511a = this;

            /* renamed from: b */
            C17543j<K, V> f48512b = this;

            /* renamed from: a */
            public final void mo45054a(long j) {
            }

            /* renamed from: e */
            public final long mo45064e() {
                return Long.MAX_VALUE;
            }

            /* renamed from: f */
            public final C17543j<K, V> mo45065f() {
                return this.f48511a;
            }

            /* renamed from: g */
            public final C17543j<K, V> mo45066g() {
                return this.f48512b;
            }

            /* renamed from: b */
            public final void mo45059b(C17543j<K, V> jVar) {
                this.f48512b = jVar;
            }

            /* renamed from: a */
            public final void mo45056a(C17543j<K, V> jVar) {
                this.f48511a = jVar;
            }
        };

        C17497c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17543j<K, V> peek() {
            C17543j<K, V> f = this.f48510a.mo45065f();
            if (f == this.f48510a) {
                return null;
            }
            return f;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17543j<K, V> poll() {
            C17543j<K, V> f = this.f48510a.mo45065f();
            if (f == this.f48510a) {
                return null;
            }
            remove(f);
            return f;
        }

        public final boolean isEmpty() {
            if (this.f48510a.mo45065f() == this.f48510a) {
                return true;
            }
            return false;
        }

        public final Iterator<C17543j<K, V>> iterator() {
            return new C18039l<C17543j<K, V>>(peek()) {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C17543j<K, V> mo45079a(C17543j<K, V> jVar) {
                    C17543j<K, V> f = jVar.mo45065f();
                    if (f == C17497c.this.f48510a) {
                        return null;
                    }
                    return f;
                }
            };
        }

        public final int size() {
            int i = 0;
            for (C17543j<K, V> f = this.f48510a.mo45065f(); f != this.f48510a; f = f.mo45065f()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C17543j<K, V> f = this.f48510a.mo45065f();
            while (f != this.f48510a) {
                C17543j f2 = f.mo45065f();
                C17482f.m58101b(f);
                f = f2;
            }
            this.f48510a.mo45056a(this.f48510a);
            this.f48510a.mo45059b(this.f48510a);
        }

        public final boolean contains(Object obj) {
            if (((C17543j) obj).mo45065f() != C17519m.INSTANCE) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean offer(C17543j<K, V> jVar) {
            C17482f.m58098a(jVar.mo45066g(), jVar.mo45065f());
            C17482f.m58098a(this.f48510a.mo45066g(), jVar);
            C17482f.m58098a(jVar, this.f48510a);
            return true;
        }

        public final boolean remove(Object obj) {
            C17543j jVar = (C17543j) obj;
            C17543j g = jVar.mo45066g();
            C17543j f = jVar.mo45065f();
            C17482f.m58098a(g, f);
            C17482f.m58101b(jVar);
            if (f != C17519m.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.cache.f$d */
    enum C17500d {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar) {
                return new C17529s(k, i, jVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45095a(C17520n<K, V> nVar, C17543j<K, V> jVar, C17543j<K, V> jVar2) {
                C17543j<K, V> a = super.mo45095a(nVar, jVar, jVar2);
                m58212a(jVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar) {
                return new C17527q(k, i, jVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45095a(C17520n<K, V> nVar, C17543j<K, V> jVar, C17543j<K, V> jVar2) {
                C17543j<K, V> a = super.mo45095a(nVar, jVar, jVar2);
                m58213b(jVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar) {
                return new C17531u(k, i, jVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45095a(C17520n<K, V> nVar, C17543j<K, V> jVar, C17543j<K, V> jVar2) {
                C17543j<K, V> a = super.mo45095a(nVar, jVar, jVar2);
                m58212a(jVar, a);
                m58213b(jVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar) {
                return new C17528r(k, i, jVar);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar) {
                return new C17486aa(nVar.f48566h, k, i, jVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45095a(C17520n<K, V> nVar, C17543j<K, V> jVar, C17543j<K, V> jVar2) {
                C17543j<K, V> a = super.mo45095a(nVar, jVar, jVar2);
                m58212a(jVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar) {
                return new C17535y(nVar.f48566h, k, i, jVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45095a(C17520n<K, V> nVar, C17543j<K, V> jVar, C17543j<K, V> jVar2) {
                C17543j<K, V> a = super.mo45095a(nVar, jVar, jVar2);
                m58213b(jVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar) {
                return new C17488ac(nVar.f48566h, k, i, jVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45095a(C17520n<K, V> nVar, C17543j<K, V> jVar, C17543j<K, V> jVar2) {
                C17543j<K, V> a = super.mo45095a(nVar, jVar, jVar2);
                m58212a(jVar, a);
                m58213b(jVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar) {
                return new C17536z(nVar.f48566h, k, i, jVar);
            }
        };
        

        /* renamed from: i */
        static final C17500d[] f48523i = null;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C17543j<K, V> mo45096a(C17520n<K, V> nVar, K k, int i, C17543j<K, V> jVar);

        static {
            f48523i = new C17500d[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        /* renamed from: b */
        static <K, V> void m58213b(C17543j<K, V> jVar, C17543j<K, V> jVar2) {
            jVar2.mo45058b(jVar.mo45067h());
            C17482f.m58102b(jVar.mo45069j(), jVar2);
            C17482f.m58102b(jVar2, jVar.mo45068i());
            C17482f.m58103c(jVar);
        }

        /* renamed from: a */
        static <K, V> void m58212a(C17543j<K, V> jVar, C17543j<K, V> jVar2) {
            jVar2.mo45054a(jVar.mo45064e());
            C17482f.m58098a(jVar.mo45066g(), jVar2);
            C17482f.m58098a(jVar2, jVar.mo45065f());
            C17482f.m58101b(jVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <K, V> C17543j<K, V> mo45095a(C17520n<K, V> nVar, C17543j<K, V> jVar, C17543j<K, V> jVar2) {
            return mo45096a(nVar, jVar.mo45062d(), jVar.mo45060c(), jVar2);
        }

        /* renamed from: a */
        static C17500d m58211a(C17523p pVar, boolean z, boolean z2) {
            char c;
            char c2 = 0;
            if (pVar == C17523p.WEAK) {
                c = 4;
            } else {
                c = 0;
            }
            boolean z3 = c | z;
            if (z2) {
                c2 = 2;
            }
            return f48523i[z3 | c2];
        }
    }

    /* renamed from: com.google.common.cache.f$e */
    final class C17509e extends C17511g<Entry<K, V>> {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public Entry<K, V> next() {
            return mo45101a();
        }

        C17509e() {
            super();
        }
    }

    /* renamed from: com.google.common.cache.f$f */
    final class C17510f extends C17485a<Entry<K, V>> {
        public final Iterator<Entry<K, V>> iterator() {
            return new C17509e();
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null || !C17482f.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            Object obj2 = C17482f.this.get(key);
            if (obj2 == null || !C17482f.this.f48473g.mo44882a(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        C17510f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.google.common.cache.f$g */
    abstract class C17511g<T> implements Iterator<T> {

        /* renamed from: b */
        int f48527b;

        /* renamed from: c */
        int f48528c = -1;

        /* renamed from: d */
        C17520n<K, V> f48529d;

        /* renamed from: e */
        AtomicReferenceArray<C17543j<K, V>> f48530e;

        /* renamed from: f */
        C17543j<K, V> f48531f;

        /* renamed from: g */
        C17495ah f48532g;

        /* renamed from: h */
        C17495ah f48533h;

        public boolean hasNext() {
            if (this.f48532g != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m58233c() {
            if (this.f48531f != null) {
                do {
                    this.f48531f = this.f48531f.mo45057b();
                    if (this.f48531f != null) {
                    }
                } while (!m58231a(this.f48531f));
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17495ah mo45101a() {
            if (this.f48532g != null) {
                this.f48533h = this.f48532g;
                m58232b();
                return this.f48533h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.f48533h != null) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57981b(z);
            C17482f.this.remove(this.f48533h.getKey());
            this.f48533h = null;
        }

        /* renamed from: d */
        private boolean m58234d() {
            while (this.f48528c >= 0) {
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48530e;
                int i = this.f48528c;
                this.f48528c = i - 1;
                C17543j<K, V> jVar = (C17543j) atomicReferenceArray.get(i);
                this.f48531f = jVar;
                if (jVar != null && (m58231a(this.f48531f) || m58233c())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m58232b() {
            this.f48532g = null;
            if (!m58233c() && !m58234d()) {
                while (this.f48527b >= 0) {
                    C17520n<K, V>[] nVarArr = C17482f.this.f48470d;
                    int i = this.f48527b;
                    this.f48527b = i - 1;
                    this.f48529d = nVarArr[i];
                    if (this.f48529d.f48560b != 0) {
                        this.f48530e = this.f48529d.f48564f;
                        this.f48528c = this.f48530e.length() - 1;
                        if (m58234d()) {
                            return;
                        }
                    }
                }
            }
        }

        C17511g() {
            this.f48527b = C17482f.this.f48470d.length - 1;
            m58232b();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private boolean m58231a(C17543j<K, V> jVar) {
            try {
                long a = C17482f.this.f48483q.mo44952a();
                Object d = jVar.mo45062d();
                Object a2 = C17482f.this.mo45002a(jVar, a);
                if (a2 != null) {
                    this.f48532g = new C17495ah<>(d, a2);
                    this.f48529d.mo45123b();
                    return true;
                }
                this.f48529d.mo45123b();
                return false;
            } catch (Throwable th) {
                this.f48529d.mo45123b();
                throw th;
            }
        }
    }

    /* renamed from: com.google.common.cache.f$h */
    final class C17512h extends C17511g<K> {
        public final K next() {
            return mo45101a().getKey();
        }

        C17512h() {
            super();
        }
    }

    /* renamed from: com.google.common.cache.f$i */
    final class C17513i extends C17485a<K> {
        public final Iterator<K> iterator() {
            return new C17512h();
        }

        public final boolean contains(Object obj) {
            return this.f48490a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f48490a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        C17513i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.google.common.cache.f$j */
    static class C17514j<K, V> implements C17533w<K, V> {

        /* renamed from: a */
        public volatile C17533w<K, V> f48537a;

        /* renamed from: b */
        final C18259o<V> f48538b;

        /* renamed from: c */
        final C17454q f48539c;

        /* renamed from: a */
        public final C17533w<K, V> mo45036a(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar) {
            return this;
        }

        /* renamed from: b */
        public final C17543j<K, V> mo45038b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo45039c() {
            return true;
        }

        public C17514j() {
            this(C17482f.m58105j());
        }

        /* renamed from: a */
        public final int mo45035a() {
            return this.f48537a.mo45035a();
        }

        /* renamed from: d */
        public final boolean mo45040d() {
            return this.f48537a.mo45040d();
        }

        /* renamed from: e */
        public final V mo45041e() throws ExecutionException {
            return C18260p.m60224a(this.f48538b);
        }

        public final V get() {
            return this.f48537a.get();
        }

        /* renamed from: f */
        public final long mo45111f() {
            return this.f48539c.mo44941a(TimeUnit.NANOSECONDS);
        }

        /* renamed from: b */
        private static C18253l<V> m58236b(Throwable th) {
            return C18246h.m60211a(th);
        }

        /* renamed from: a */
        public final void mo45037a(V v) {
            if (v != null) {
                mo45110b(v);
            } else {
                this.f48537a = C17482f.m58105j();
            }
        }

        /* renamed from: b */
        public final boolean mo45110b(V v) {
            return this.f48538b.mo47088b(v);
        }

        public C17514j(C17533w<K, V> wVar) {
            this.f48538b = C18259o.m60220d();
            this.f48539c = C17454q.m58001a();
            this.f48537a = wVar;
        }

        /* renamed from: a */
        public final boolean mo45109a(Throwable th) {
            return this.f48538b.mo47087a(th);
        }

        /* renamed from: a */
        public final C18253l<V> mo45108a(K k, CacheLoader<? super K, V> cacheLoader) {
            C18253l<V> lVar;
            try {
                this.f48539c.mo44942c();
                Object obj = this.f48537a.get();
                if (obj == null) {
                    Object a = cacheLoader.mo44954a(k);
                    if (mo45110b((V) a)) {
                        return this.f48538b;
                    }
                    return C18246h.m60210a(a);
                }
                C18253l a2 = cacheLoader.mo44953a(k, obj);
                if (a2 == null) {
                    return C18246h.m60210a(null);
                }
                return C18246h.m60208a(a2, (C17427g<? super I, ? extends O>) new C17427g<V, V>() {
                    /* renamed from: b */
                    public final V mo44914b(V v) {
                        C17514j.this.mo45110b(v);
                        return v;
                    }
                }, C18254m.m60217a());
            } catch (Throwable th) {
                if (mo45109a(th)) {
                    lVar = this.f48538b;
                } else {
                    lVar = m58236b(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return lVar;
            }
        }
    }

    /* renamed from: com.google.common.cache.f$k */
    static class C17516k<K, V> implements C17473b<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final C17482f<K, V> f48541a;

        /* renamed from: a */
        public final ConcurrentMap<K, V> mo44965a() {
            return this.f48541a;
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new C17518l(this.f48541a);
        }

        private C17516k(C17482f<K, V> fVar) {
            this.f48541a = fVar;
        }

        /* renamed from: a */
        public final V mo44963a(Object obj) {
            return this.f48541a.mo45003a(obj);
        }

        C17516k(C17474c<? super K, ? super V> cVar) {
            this(new C17482f<>(cVar, null));
        }

        /* renamed from: b */
        public final void mo44967b(Object obj) {
            C17439m.m57962a(obj);
            this.f48541a.remove(obj);
        }

        /* renamed from: a */
        public final V mo44964a(K k, final Callable<? extends V> callable) throws ExecutionException {
            C17439m.m57962a(callable);
            return this.f48541a.mo45004a(k, (CacheLoader<? super K, V>) new CacheLoader<Object, V>() {
                /* renamed from: a */
                public final V mo44954a(Object obj) throws Exception {
                    return callable.call();
                }
            });
        }

        /* renamed from: a */
        public final void mo44966a(K k, V v) {
            this.f48541a.put(k, v);
        }
    }

    /* renamed from: com.google.common.cache.f$l */
    static class C17518l<K, V> extends C17481e<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final C17523p f48544a;

        /* renamed from: b */
        final C17523p f48545b;

        /* renamed from: c */
        final Equivalence<Object> f48546c;

        /* renamed from: d */
        final Equivalence<Object> f48547d;

        /* renamed from: e */
        final long f48548e;

        /* renamed from: f */
        final long f48549f;

        /* renamed from: g */
        final long f48550g;

        /* renamed from: h */
        final C17548m<K, V> f48551h;

        /* renamed from: i */
        final int f48552i;

        /* renamed from: j */
        final C17544k<? super K, ? super V> f48553j;

        /* renamed from: k */
        final C17463v f48554k;

        /* renamed from: l */
        final CacheLoader<? super K, V> f48555l;

        /* renamed from: m */
        transient C17473b<K, V> f48556m;

        private Object readResolve() {
            return this.f48556m;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C17473b<K, V> delegate() {
            return this.f48556m;
        }

        /* renamed from: c */
        private C17474c<K, V> m58255c() {
            C17474c<K, V> a = C17474c.m58050a().mo44974a(this.f48544a).mo44981b(this.f48545b).mo44972a(this.f48546c).mo44980b(this.f48547d).mo44969a(this.f48552i).mo44975a(this.f48553j);
            a.f48439e = false;
            if (this.f48548e > 0) {
                a.mo44971a(this.f48548e, TimeUnit.NANOSECONDS);
            }
            if (this.f48549f > 0) {
                a.mo44979b(this.f48549f, TimeUnit.NANOSECONDS);
            }
            if (this.f48551h != C17479b.INSTANCE) {
                a.mo44976a(this.f48551h);
                if (this.f48550g != -1) {
                    a.mo44978b(this.f48550g);
                }
            } else if (this.f48550g != -1) {
                a.mo44970a(this.f48550g);
            }
            if (this.f48554k != null) {
                a.mo44973a(this.f48554k);
            }
            return a;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f48556m = m58255c().mo44994o();
        }

        C17518l(C17482f<K, V> fVar) {
            C17482f<K, V> fVar2 = fVar;
            C17523p pVar = fVar2.f48474h;
            C17523p pVar2 = fVar2.f48475i;
            Equivalence<Object> equivalence = fVar2.f48472f;
            Equivalence<Object> equivalence2 = fVar2.f48473g;
            long j = fVar2.f48479m;
            long j2 = fVar2.f48478l;
            long j3 = fVar2.f48476j;
            C17548m<K, V> mVar = fVar2.f48477k;
            int i = fVar2.f48471e;
            C17544k<K, V> kVar = fVar2.f48482p;
            C17463v vVar = fVar2.f48483q;
            CacheLoader<? super K, V> cacheLoader = fVar2.f48486t;
            this(pVar, pVar2, equivalence, equivalence2, j, j2, j3, mVar, i, kVar, vVar, cacheLoader);
        }

        private C17518l(C17523p pVar, C17523p pVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, C17548m<K, V> mVar, int i, C17544k<? super K, ? super V> kVar, C17463v vVar, CacheLoader<? super K, V> cacheLoader) {
            this.f48544a = pVar;
            this.f48545b = pVar2;
            this.f48546c = equivalence;
            this.f48547d = equivalence2;
            this.f48548e = j;
            this.f48549f = j2;
            this.f48550g = j3;
            this.f48551h = mVar;
            this.f48552i = i;
            this.f48553j = kVar;
            if (vVar == C17463v.m58030b() || vVar == C17474c.f48437d) {
                vVar = null;
            }
            this.f48554k = vVar;
            this.f48555l = cacheLoader;
        }
    }

    /* renamed from: com.google.common.cache.f$m */
    enum C17519m implements C17543j<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public final C17533w<Object, Object> mo45053a() {
            return null;
        }

        /* renamed from: a */
        public final void mo45054a(long j) {
        }

        /* renamed from: a */
        public final void mo45055a(C17533w<Object, Object> wVar) {
        }

        /* renamed from: a */
        public final void mo45056a(C17543j<Object, Object> jVar) {
        }

        /* renamed from: b */
        public final C17543j<Object, Object> mo45057b() {
            return null;
        }

        /* renamed from: b */
        public final void mo45058b(long j) {
        }

        /* renamed from: b */
        public final void mo45059b(C17543j<Object, Object> jVar) {
        }

        /* renamed from: c */
        public final int mo45060c() {
            return 0;
        }

        /* renamed from: c */
        public final void mo45061c(C17543j<Object, Object> jVar) {
        }

        /* renamed from: d */
        public final Object mo45062d() {
            return null;
        }

        /* renamed from: d */
        public final void mo45063d(C17543j<Object, Object> jVar) {
        }

        /* renamed from: e */
        public final long mo45064e() {
            return 0;
        }

        /* renamed from: f */
        public final C17543j<Object, Object> mo45065f() {
            return this;
        }

        /* renamed from: g */
        public final C17543j<Object, Object> mo45066g() {
            return this;
        }

        /* renamed from: h */
        public final long mo45067h() {
            return 0;
        }

        /* renamed from: i */
        public final C17543j<Object, Object> mo45068i() {
            return this;
        }

        /* renamed from: j */
        public final C17543j<Object, Object> mo45069j() {
            return this;
        }
    }

    /* renamed from: com.google.common.cache.f$n */
    static class C17520n<K, V> extends ReentrantLock {

        /* renamed from: a */
        final C17482f<K, V> f48559a;

        /* renamed from: b */
        volatile int f48560b;

        /* renamed from: c */
        long f48561c;

        /* renamed from: d */
        int f48562d;

        /* renamed from: e */
        int f48563e;

        /* renamed from: f */
        volatile AtomicReferenceArray<C17543j<K, V>> f48564f;

        /* renamed from: g */
        final long f48565g;

        /* renamed from: h */
        final ReferenceQueue<K> f48566h;

        /* renamed from: i */
        final ReferenceQueue<V> f48567i;

        /* renamed from: j */
        final Queue<C17543j<K, V>> f48568j;

        /* renamed from: k */
        final AtomicInteger f48569k = new AtomicInteger();

        /* renamed from: l */
        final Queue<C17543j<K, V>> f48570l;

        /* renamed from: m */
        final Queue<C17543j<K, V>> f48571m;

        /* renamed from: n */
        final C17472b f48572n;

        /* renamed from: m */
        private void m58314m() {
            m58316o();
        }

        /* renamed from: a */
        private void m58289a(AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray) {
            this.f48563e = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f48559a.mo45008b() && ((long) this.f48563e) == this.f48565g) {
                this.f48563e++;
            }
            this.f48564f = atomicReferenceArray;
        }

        /* renamed from: a */
        private void m58287a(C17543j<K, V> jVar, K k, V v, long j) {
            C17533w a = jVar.mo45053a();
            C17439m.m57982b(true, (Object) "Weights must be non-negative");
            jVar.mo45055a(this.f48559a.f48475i.mo45129a(this, jVar, v, 1));
            m58286a(jVar, 1, j);
            a.mo45037a(v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45115a(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            C17439m.m57962a(k);
            C17439m.m57962a(cacheLoader);
            try {
                if (this.f48560b != 0) {
                    C17543j d = m58303d(k, i);
                    if (d != null) {
                        long a = this.f48559a.f48483q.mo44952a();
                        Object a2 = mo45113a(d, a);
                        if (a2 != null) {
                            m58299b(d, a);
                            this.f48572n.mo44959a(1);
                            V a3 = m58279a(d, k, i, a2, a, cacheLoader);
                            mo45123b();
                            return a3;
                        }
                        C17533w a4 = d.mo45053a();
                        if (a4.mo45039c()) {
                            V a5 = m58280a(d, k, a4);
                            mo45123b();
                            return a5;
                        }
                    }
                }
                V b = m58296b(k, i, cacheLoader);
                mo45123b();
                return b;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new ExecutionError((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new UncheckedExecutionException(cause);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                mo45123b();
                throw th;
            }
        }

        /* renamed from: a */
        private V m58282a(K k, int i, C17514j<K, V> jVar, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return mo45116a(k, i, jVar, jVar.mo45108a(k, cacheLoader));
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V mo45116a(K r4, int r5, com.google.common.cache.C17482f.C17514j<K, V> r6, com.google.common.util.concurrent.C18253l<V> r7) throws java.util.concurrent.ExecutionException {
            /*
                r3 = this;
                java.lang.Object r7 = com.google.common.util.concurrent.C18260p.m60224a(r7)     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0021
                com.google.common.cache.a$b r0 = r3.f48572n     // Catch:{ all -> 0x003a }
                long r1 = r6.mo45111f()     // Catch:{ all -> 0x003a }
                r0.mo44960a(r1)     // Catch:{ all -> 0x003a }
                r3.m58292a((K) r4, r5, r6, (V) r7)     // Catch:{ all -> 0x003a }
                if (r7 != 0) goto L_0x0020
                com.google.common.cache.a$b r0 = r3.f48572n
                long r1 = r6.mo45111f()
                r0.mo44962b(r1)
                r3.m58291a((K) r4, r5, r6)
            L_0x0020:
                return r7
            L_0x0021:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ all -> 0x003a }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "CacheLoader returned null for key "
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                r1.append(r4)     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "."
                r1.append(r2)     // Catch:{ all -> 0x003a }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003a }
                r0.<init>(r1)     // Catch:{ all -> 0x003a }
                throw r0     // Catch:{ all -> 0x003a }
            L_0x003a:
                r0 = move-exception
                goto L_0x003e
            L_0x003c:
                r0 = move-exception
                r7 = 0
            L_0x003e:
                if (r7 != 0) goto L_0x004c
                com.google.common.cache.a$b r7 = r3.f48572n
                long r1 = r6.mo45111f()
                r7.mo44962b(r1)
                r3.m58291a((K) r4, r5, r6)
            L_0x004c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C17482f.C17520n.mo45116a(java.lang.Object, int, com.google.common.cache.f$j, com.google.common.util.concurrent.l):java.lang.Object");
        }

        /* renamed from: a */
        private void m58286a(C17543j<K, V> jVar, int i, long j) {
            m58311j();
            this.f48561c += (long) i;
            if (this.f48559a.mo45018g()) {
                jVar.mo45054a(j);
            }
            if (this.f48559a.mo45017f()) {
                jVar.mo45058b(j);
            }
            this.f48571m.add(jVar);
            this.f48570l.add(jVar);
        }

        /* renamed from: a */
        private void m58284a(long j) {
            if (tryLock()) {
                try {
                    m58297b(j);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        private void m58288a(K k, int i, V v, int i2, RemovalCause removalCause) {
            this.f48561c -= (long) i2;
            if (removalCause.wasEvicted()) {
                this.f48572n.mo44958a();
            }
            if (this.f48559a.f48481o != C17482f.f48467v) {
                this.f48559a.f48481o.offer(RemovalNotification.create(k, v, removalCause));
            }
        }

        /* renamed from: a */
        private void m58285a(C17543j<K, V> jVar) {
            if (this.f48559a.mo45007a()) {
                m58311j();
                if (((long) jVar.mo45053a().mo45035a()) <= this.f48565g || m58290a(jVar, jVar.mo45060c(), RemovalCause.SIZE)) {
                    while (this.f48561c > this.f48565g) {
                        C17543j k = m58312k();
                        if (!m58290a(k, k.mo45060c(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45113a(C17543j<K, V> jVar, long j) {
            if (jVar.mo45062d() == null) {
                m58300c();
                return null;
            }
            V v = jVar.mo45053a().get();
            if (v == null) {
                m58300c();
                return null;
            } else if (!this.f48559a.mo45009b(jVar, j)) {
                return v;
            } else {
                m58284a(j);
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45114a(Object obj, int i) {
            try {
                if (this.f48560b != 0) {
                    long a = this.f48559a.f48483q.mo44952a();
                    C17543j a2 = m58277a(obj, i, a);
                    if (a2 == null) {
                        return null;
                    }
                    Object obj2 = a2.mo45053a().get();
                    if (obj2 != null) {
                        m58299b(a2, a);
                        V a3 = m58279a(a2, a2.mo45062d(), i, obj2, a, this.f48559a.f48486t);
                        mo45123b();
                        return a3;
                    }
                    m58300c();
                }
                mo45123b();
                return null;
            } finally {
                mo45123b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo45124b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f48560b != 0) {
                    C17543j a = m58277a(obj, i, this.f48559a.f48483q.mo44952a());
                    if (a == null) {
                        return false;
                    }
                    if (a.mo45053a().get() != null) {
                        z = true;
                    }
                    mo45123b();
                    return z;
                }
                mo45123b();
                return false;
            } finally {
                mo45123b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45118a(K k, int i, V v, boolean z) {
            int i2;
            K k2 = k;
            int i3 = i;
            lock();
            try {
                long a = this.f48559a.f48483q.mo44952a();
                m58301c(a);
                if (this.f48560b + 1 > this.f48563e) {
                    m58313l();
                    int i4 = this.f48560b;
                }
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = i3 & (atomicReferenceArray.length() - 1);
                C17543j jVar = (C17543j) atomicReferenceArray.get(length);
                C17543j jVar2 = jVar;
                while (jVar2 != null) {
                    Object d = jVar2.mo45062d();
                    if (jVar2.mo45060c() != i3 || d == null || !this.f48559a.f48472f.mo44882a(k, d)) {
                        jVar2 = jVar2.mo45057b();
                    } else {
                        C17533w a2 = jVar2.mo45053a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            this.f48562d++;
                            if (a2.mo45040d()) {
                                m58288a(k, i, v2, a2.mo45035a(), RemovalCause.COLLECTED);
                                m58287a(jVar2, k, v, a);
                                i2 = this.f48560b;
                            } else {
                                m58287a(jVar2, k, v, a);
                                i2 = this.f48560b + 1;
                            }
                            this.f48560b = i2;
                            m58285a(jVar2);
                            return null;
                        } else if (z) {
                            m58302c(jVar2, a);
                            unlock();
                            m58314m();
                            return v2;
                        } else {
                            this.f48562d++;
                            m58288a(k, i, v2, a2.mo45035a(), RemovalCause.REPLACED);
                            m58287a(jVar2, k, v, a);
                            m58285a(jVar2);
                            unlock();
                            m58314m();
                            return v2;
                        }
                    }
                }
                this.f48562d++;
                C17543j a3 = m58278a(k, i3, jVar);
                m58287a(a3, k, v, a);
                atomicReferenceArray.set(length, a3);
                this.f48560b++;
                m58285a(a3);
                unlock();
                m58314m();
                return null;
            } finally {
                unlock();
                m58314m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45122a(K k, int i, V v, V v2) {
            int i2 = i;
            lock();
            try {
                long a = this.f48559a.f48483q.mo44952a();
                m58301c(a);
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C17543j jVar = (C17543j) atomicReferenceArray.get(length);
                for (C17543j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.mo45057b()) {
                    Object d = jVar2.mo45062d();
                    if (jVar2.mo45060c() != i2 || d == null) {
                        K k2 = k;
                    } else if (this.f48559a.f48472f.mo44882a(k, d)) {
                        C17533w a2 = jVar2.mo45053a();
                        Object obj = a2.get();
                        if (obj == null) {
                            if (a2.mo45040d()) {
                                int i3 = this.f48560b;
                                this.f48562d++;
                                C17543j a3 = m58276a(jVar, jVar2, d, i, obj, a2, RemovalCause.COLLECTED);
                                int i4 = this.f48560b - 1;
                                atomicReferenceArray.set(length, a3);
                                this.f48560b = i4;
                            }
                            return false;
                        } else if (this.f48559a.f48473g.mo44882a(v, obj)) {
                            this.f48562d++;
                            m58288a(k, i, obj, a2.mo45035a(), RemovalCause.REPLACED);
                            m58287a(jVar2, k, v2, a);
                            m58285a(jVar2);
                            unlock();
                            m58314m();
                            return true;
                        } else {
                            m58302c(jVar2, a);
                            unlock();
                            m58314m();
                            return false;
                        }
                    }
                    V v3 = v;
                }
                unlock();
                m58314m();
                return false;
            } finally {
                unlock();
                m58314m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45117a(K k, int i, V v) {
            int i2 = i;
            lock();
            try {
                long a = this.f48559a.f48483q.mo44952a();
                m58301c(a);
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C17543j jVar = (C17543j) atomicReferenceArray.get(length);
                for (C17543j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.mo45057b()) {
                    Object d = jVar2.mo45062d();
                    if (jVar2.mo45060c() != i2 || d == null) {
                        K k2 = k;
                    } else if (this.f48559a.f48472f.mo44882a(k, d)) {
                        C17533w a2 = jVar2.mo45053a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.mo45040d()) {
                                int i3 = this.f48560b;
                                this.f48562d++;
                                C17543j a3 = m58276a(jVar, jVar2, d, i, v2, a2, RemovalCause.COLLECTED);
                                int i4 = this.f48560b - 1;
                                atomicReferenceArray.set(length, a3);
                                this.f48560b = i4;
                            }
                            return null;
                        }
                        this.f48562d++;
                        m58288a(k, i, v2, a2.mo45035a(), RemovalCause.REPLACED);
                        m58287a(jVar2, k, v, a);
                        m58285a(jVar2);
                        unlock();
                        m58314m();
                        return v2;
                    }
                }
                unlock();
                m58314m();
                return null;
            } finally {
                unlock();
                m58314m();
            }
        }

        /* renamed from: a */
        private boolean m58292a(K k, int i, C17514j<K, V> jVar, V v) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a = this.f48559a.f48483q.mo44952a();
                m58301c(a);
                int i3 = this.f48560b + 1;
                if (i3 > this.f48563e) {
                    m58313l();
                    i3 = this.f48560b + 1;
                }
                int i4 = i3;
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C17543j jVar2 = (C17543j) atomicReferenceArray.get(length);
                C17543j jVar3 = jVar2;
                while (jVar3 != null) {
                    Object d = jVar3.mo45062d();
                    if (jVar3.mo45060c() != i2 || d == null || !this.f48559a.f48472f.mo44882a(k2, d)) {
                        C17514j<K, V> jVar4 = jVar;
                        jVar3 = jVar3.mo45057b();
                    } else {
                        C17533w<Object, Object> a2 = jVar3.mo45053a();
                        Object obj = a2.get();
                        if (jVar != a2) {
                            if (obj != null || a2 == C17482f.f48466u) {
                                m58288a(k, i, v, 0, RemovalCause.REPLACED);
                                unlock();
                                m58314m();
                                return false;
                            }
                        }
                        this.f48562d++;
                        if (jVar.mo45040d()) {
                            m58288a(k, i, obj, jVar.mo45035a(), obj == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i4--;
                        }
                        m58287a(jVar3, k, v, a);
                        this.f48560b = i4;
                        m58285a(jVar3);
                        return true;
                    }
                }
                this.f48562d++;
                C17543j a3 = m58278a(k2, i2, jVar2);
                m58287a(a3, k, v, a);
                atomicReferenceArray.set(length, a3);
                this.f48560b = i4;
                m58285a(a3);
                unlock();
                m58314m();
                return true;
            } finally {
                unlock();
                m58314m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo45125b(Object obj, int i, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                m58301c(this.f48559a.f48483q.mo44952a());
                int i2 = this.f48560b;
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17543j jVar = (C17543j) atomicReferenceArray.get(length);
                C17543j jVar2 = jVar;
                while (jVar2 != null) {
                    Object d = jVar2.mo45062d();
                    if (jVar2.mo45060c() != i || d == null || !this.f48559a.f48472f.mo44882a(obj, d)) {
                        jVar2 = jVar2.mo45057b();
                    } else {
                        C17533w a = jVar2.mo45053a();
                        Object obj3 = a.get();
                        if (this.f48559a.f48473g.mo44882a(obj2, obj3)) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (obj3 != null || !a.mo45040d()) {
                            unlock();
                            m58314m();
                            return false;
                        } else {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        this.f48562d++;
                        int i3 = this.f48560b - 1;
                        atomicReferenceArray.set(length, m58276a(jVar, jVar2, d, i, obj3, a, removalCause));
                        this.f48560b = i3;
                        if (removalCause != RemovalCause.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                m58314m();
                return false;
            } finally {
                unlock();
                m58314m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo45119a() {
            RemovalCause removalCause;
            if (this.f48560b != 0) {
                lock();
                try {
                    m58301c(this.f48559a.f48483q.mo44952a());
                    AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (C17543j jVar = (C17543j) atomicReferenceArray.get(i); jVar != null; jVar = jVar.mo45057b()) {
                            if (jVar.mo45053a().mo45040d()) {
                                Object d = jVar.mo45062d();
                                Object obj = jVar.mo45053a().get();
                                if (d != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        m58288a(d, jVar.mo45060c(), obj, jVar.mo45053a().mo45035a(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                m58288a(d, jVar.mo45060c(), obj, jVar.mo45053a().mo45035a(), removalCause);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    m58308g();
                    this.f48570l.clear();
                    this.f48571m.clear();
                    this.f48569k.set(0);
                    this.f48562d++;
                    this.f48560b = 0;
                } finally {
                    unlock();
                    m58314m();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45120a(C17543j<K, V> jVar, int i) {
            lock();
            try {
                int i2 = this.f48560b;
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17543j<K, V> jVar2 = (C17543j) atomicReferenceArray.get(length);
                for (C17543j<K, V> jVar3 = jVar2; jVar3 != null; jVar3 = jVar3.mo45057b()) {
                    if (jVar3 == jVar) {
                        this.f48562d++;
                        int i3 = this.f48560b - 1;
                        atomicReferenceArray.set(length, m58276a(jVar2, jVar3, jVar3.mo45062d(), i, jVar3.mo45053a().get(), jVar3.mo45053a(), RemovalCause.COLLECTED));
                        this.f48560b = i3;
                        return true;
                    }
                }
                unlock();
                m58314m();
                return false;
            } finally {
                unlock();
                m58314m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45121a(K k, int i, C17533w<K, V> wVar) {
            lock();
            try {
                int i2 = this.f48560b;
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17543j jVar = (C17543j) atomicReferenceArray.get(length);
                C17543j jVar2 = jVar;
                while (jVar2 != null) {
                    Object d = jVar2.mo45062d();
                    if (jVar2.mo45060c() != i || d == null || !this.f48559a.f48472f.mo44882a(k, d)) {
                        jVar2 = jVar2.mo45057b();
                    } else if (jVar2.mo45053a() == wVar) {
                        this.f48562d++;
                        int i3 = this.f48560b - 1;
                        atomicReferenceArray.set(length, m58276a(jVar, jVar2, d, i, wVar.get(), wVar, RemovalCause.COLLECTED));
                        this.f48560b = i3;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            m58314m();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    m58314m();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    m58314m();
                }
            }
        }

        /* renamed from: a */
        private boolean m58291a(K k, int i, C17514j<K, V> jVar) {
            lock();
            try {
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17543j jVar2 = (C17543j) atomicReferenceArray.get(length);
                C17543j jVar3 = jVar2;
                while (jVar3 != null) {
                    Object d = jVar3.mo45062d();
                    if (jVar3.mo45060c() != i || d == null || !this.f48559a.f48472f.mo44882a(k, d)) {
                        jVar3 = jVar3.mo45057b();
                    } else if (jVar3.mo45053a() == jVar) {
                        if (jVar.mo45040d()) {
                            jVar3.mo45055a(jVar.f48537a);
                        } else {
                            atomicReferenceArray.set(length, m58294b(jVar2, jVar3));
                        }
                        return true;
                    } else {
                        unlock();
                        m58314m();
                        return false;
                    }
                }
                unlock();
                m58314m();
                return false;
            } finally {
                unlock();
                m58314m();
            }
        }

        /* renamed from: a */
        private boolean m58290a(C17543j<K, V> jVar, int i, RemovalCause removalCause) {
            int i2 = this.f48560b;
            AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
            int length = (atomicReferenceArray.length() - 1) & i;
            C17543j<K, V> jVar2 = (C17543j) atomicReferenceArray.get(length);
            for (C17543j<K, V> jVar3 = jVar2; jVar3 != null; jVar3 = jVar3.mo45057b()) {
                if (jVar3 == jVar) {
                    this.f48562d++;
                    int i3 = this.f48560b - 1;
                    atomicReferenceArray.set(length, m58276a(jVar2, jVar3, jVar3.mo45062d(), i, jVar3.mo45053a().get(), jVar3.mo45053a(), removalCause));
                    this.f48560b = i3;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        private void m58309h() {
            do {
            } while (this.f48566h.poll() != null);
        }

        /* renamed from: i */
        private void m58310i() {
            do {
            } while (this.f48567i.poll() != null);
        }

        /* renamed from: n */
        private void m58315n() {
            m58305d(this.f48559a.f48483q.mo44952a());
            m58316o();
        }

        /* renamed from: o */
        private void m58316o() {
            if (!isHeldByCurrentThread()) {
                this.f48559a.mo45025m();
            }
        }

        /* renamed from: c */
        private void m58300c() {
            if (tryLock()) {
                try {
                    m58304d();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: d */
        private void m58304d() {
            if (this.f48559a.mo45021h()) {
                m58306e();
            }
            if (this.f48559a.mo45022i()) {
                m58307f();
            }
        }

        /* renamed from: e */
        private void m58306e() {
            int i = 0;
            do {
                Reference poll = this.f48566h.poll();
                if (poll != null) {
                    this.f48559a.mo45006a((C17543j) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: f */
        private void m58307f() {
            int i = 0;
            do {
                Reference poll = this.f48567i.poll();
                if (poll != null) {
                    this.f48559a.mo45005a((C17533w) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: g */
        private void m58308g() {
            if (this.f48559a.mo45021h()) {
                m58309h();
            }
            if (this.f48559a.mo45022i()) {
                m58310i();
            }
        }

        /* renamed from: j */
        private void m58311j() {
            while (true) {
                C17543j jVar = (C17543j) this.f48568j.poll();
                if (jVar == null) {
                    return;
                }
                if (this.f48571m.contains(jVar)) {
                    this.f48571m.add(jVar);
                }
            }
        }

        /* renamed from: k */
        private C17543j<K, V> m58312k() {
            for (C17543j<K, V> jVar : this.f48571m) {
                if (jVar.mo45053a().mo45035a() > 0) {
                    return jVar;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: l */
        private void m58313l() {
            AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f48560b;
                AtomicReferenceArray<C17543j<K, V>> a = m58283a(length << 1);
                this.f48563e = (a.length() * 3) / 4;
                int length2 = a.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C17543j jVar = (C17543j) atomicReferenceArray.get(i2);
                    if (jVar != null) {
                        C17543j b = jVar.mo45057b();
                        int c = jVar.mo45060c() & length2;
                        if (b == null) {
                            a.set(c, jVar);
                        } else {
                            C17543j jVar2 = jVar;
                            while (b != null) {
                                int c2 = b.mo45060c() & length2;
                                if (c2 != c) {
                                    jVar2 = b;
                                    c = c2;
                                }
                                b = b.mo45057b();
                            }
                            a.set(c, jVar2);
                            while (jVar != jVar2) {
                                int c3 = jVar.mo45060c() & length2;
                                C17543j a2 = m58275a(jVar, (C17543j) a.get(c3));
                                if (a2 != null) {
                                    a.set(c3, a2);
                                } else {
                                    m58298b(jVar);
                                    i--;
                                }
                                jVar = jVar.mo45057b();
                            }
                        }
                    }
                }
                this.f48564f = a;
                this.f48560b = i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo45123b() {
            if ((this.f48569k.incrementAndGet() & 63) == 0) {
                m58315n();
            }
        }

        /* renamed from: c */
        private void m58301c(long j) {
            m58305d(j);
        }

        /* renamed from: a */
        private static AtomicReferenceArray<C17543j<K, V>> m58283a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: b */
        private C17543j<K, V> m58293b(int i) {
            AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
            return (C17543j) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: b */
        private void m58297b(long j) {
            C17543j jVar;
            C17543j jVar2;
            m58311j();
            do {
                jVar = (C17543j) this.f48570l.peek();
                if (jVar == null || !this.f48559a.mo45009b(jVar, j)) {
                    do {
                        jVar2 = (C17543j) this.f48571m.peek();
                        if (jVar2 == null || !this.f48559a.mo45009b(jVar2, j)) {
                            return;
                        }
                    } while (m58290a(jVar2, jVar2.mo45060c(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (m58290a(jVar, jVar.mo45060c(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: d */
        private void m58305d(long j) {
            if (tryLock()) {
                try {
                    m58304d();
                    m58297b(j);
                    this.f48569k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        private void m58298b(C17543j<K, V> jVar) {
            m58288a(jVar.mo45062d(), jVar.mo45060c(), jVar.mo45053a().get(), jVar.mo45053a().mo45035a(), RemovalCause.COLLECTED);
            this.f48570l.remove(jVar);
            this.f48571m.remove(jVar);
        }

        /* renamed from: b */
        private C17543j<K, V> m58294b(C17543j<K, V> jVar, C17543j<K, V> jVar2) {
            int i = this.f48560b;
            C17543j<K, V> b = jVar2.mo45057b();
            while (jVar != jVar2) {
                C17543j<K, V> a = m58275a(jVar, b);
                if (a != null) {
                    b = a;
                } else {
                    m58298b(jVar);
                    i--;
                }
                jVar = jVar.mo45057b();
            }
            this.f48560b = i;
            return b;
        }

        /* renamed from: a */
        private C17543j<K, V> m58275a(C17543j<K, V> jVar, C17543j<K, V> jVar2) {
            if (jVar.mo45062d() == null) {
                return null;
            }
            C17533w a = jVar.mo45053a();
            Object obj = a.get();
            if (obj == null && a.mo45040d()) {
                return null;
            }
            C17543j<K, V> a2 = this.f48559a.f48484r.mo45095a(this, jVar, jVar2);
            a2.mo45055a(a.mo45036a(this.f48567i, obj, a2));
            return a2;
        }

        /* renamed from: c */
        private void m58302c(C17543j<K, V> jVar, long j) {
            if (this.f48559a.mo45018g()) {
                jVar.mo45054a(j);
            }
            this.f48571m.add(jVar);
        }

        /* renamed from: d */
        private C17543j<K, V> m58303d(Object obj, int i) {
            for (C17543j<K, V> b = m58293b(i); b != null; b = b.mo45057b()) {
                if (b.mo45060c() == i) {
                    Object d = b.mo45062d();
                    if (d == null) {
                        m58300c();
                    } else if (this.f48559a.f48472f.mo44882a(obj, d)) {
                        return b;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final V mo45126c(Object obj, int i) {
            RemovalCause removalCause;
            lock();
            try {
                m58301c(this.f48559a.f48483q.mo44952a());
                int i2 = this.f48560b;
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17543j jVar = (C17543j) atomicReferenceArray.get(length);
                C17543j jVar2 = jVar;
                while (jVar2 != null) {
                    Object d = jVar2.mo45062d();
                    if (jVar2.mo45060c() != i || d == null || !this.f48559a.f48472f.mo44882a(obj, d)) {
                        jVar2 = jVar2.mo45057b();
                    } else {
                        C17533w a = jVar2.mo45053a();
                        V v = a.get();
                        if (v != null) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (a.mo45040d()) {
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            unlock();
                            m58314m();
                            return null;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.f48562d++;
                        int i3 = this.f48560b - 1;
                        atomicReferenceArray.set(length, m58276a(jVar, jVar2, d, i, v, a, removalCause2));
                        this.f48560b = i3;
                        return v;
                    }
                }
                unlock();
                m58314m();
                return null;
            } finally {
                unlock();
                m58314m();
            }
        }

        /* renamed from: b */
        private void m58299b(C17543j<K, V> jVar, long j) {
            if (this.f48559a.mo45018g()) {
                jVar.mo45054a(j);
            }
            this.f48568j.add(jVar);
        }

        /* renamed from: a */
        private C17543j<K, V> m58278a(K k, int i, C17543j<K, V> jVar) {
            return this.f48559a.f48484r.mo45096a(this, C17439m.m57962a(k), i, jVar);
        }

        /* renamed from: a */
        private C17543j<K, V> m58277a(Object obj, int i, long j) {
            C17543j<K, V> d = m58303d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.f48559a.mo45009b(d, j)) {
                return d;
            }
            m58284a(j);
            return null;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private C17514j<K, V> m58274a(K k, int i, boolean z) {
            lock();
            try {
                long a = this.f48559a.f48483q.mo44952a();
                m58301c(a);
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17543j jVar = (C17543j) atomicReferenceArray.get(length);
                C17543j jVar2 = jVar;
                while (jVar2 != null) {
                    Object d = jVar2.mo45062d();
                    if (jVar2.mo45060c() != i || d == null || !this.f48559a.f48472f.mo44882a(k, d)) {
                        jVar2 = jVar2.mo45057b();
                    } else {
                        C17533w a2 = jVar2.mo45053a();
                        if (!a2.mo45039c()) {
                            if (!z || a - jVar2.mo45067h() >= this.f48559a.f48480n) {
                                this.f48562d++;
                                C17514j<K, V> jVar3 = new C17514j<>(a2);
                                jVar2.mo45055a((C17533w<K, V>) jVar3);
                                unlock();
                                m58314m();
                                return jVar3;
                            }
                        }
                        unlock();
                        m58314m();
                        return null;
                    }
                }
                this.f48562d++;
                C17514j<K, V> jVar4 = new C17514j<>();
                C17543j a3 = m58278a(k, i, jVar);
                a3.mo45055a((C17533w<K, V>) jVar4);
                atomicReferenceArray.set(length, a3);
                unlock();
                m58314m();
                return jVar4;
            } catch (Throwable th) {
                unlock();
                m58314m();
                throw th;
            }
        }

        /* renamed from: b */
        private V m58296b(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            C17514j jVar;
            C17533w wVar;
            boolean z;
            V a;
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a2 = this.f48559a.f48483q.mo44952a();
                m58301c(a2);
                int i3 = this.f48560b - 1;
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = this.f48564f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C17543j jVar2 = (C17543j) atomicReferenceArray.get(length);
                C17543j jVar3 = jVar2;
                while (true) {
                    jVar = null;
                    if (jVar3 == null) {
                        wVar = null;
                        break;
                    }
                    Object d = jVar3.mo45062d();
                    if (jVar3.mo45060c() != i2 || d == null || !this.f48559a.f48472f.mo44882a(k2, d)) {
                        jVar3 = jVar3.mo45057b();
                    } else {
                        C17533w a3 = jVar3.mo45053a();
                        if (a3.mo45039c()) {
                            z = false;
                            wVar = a3;
                        } else {
                            V v = a3.get();
                            if (v == null) {
                                m58288a(d, i, v, a3.mo45035a(), RemovalCause.COLLECTED);
                            } else if (this.f48559a.mo45009b(jVar3, a2)) {
                                m58288a(d, i, v, a3.mo45035a(), RemovalCause.EXPIRED);
                            } else {
                                m58302c(jVar3, a2);
                                this.f48572n.mo44959a(1);
                                unlock();
                                m58314m();
                                return v;
                            }
                            this.f48570l.remove(jVar3);
                            this.f48571m.remove(jVar3);
                            this.f48560b = i3;
                            wVar = a3;
                        }
                    }
                }
                z = true;
                if (z) {
                    jVar = new C17514j();
                    if (jVar3 == null) {
                        jVar3 = m58278a(k2, i2, jVar2);
                        jVar3.mo45055a((C17533w<K, V>) jVar);
                        atomicReferenceArray.set(length, jVar3);
                    } else {
                        jVar3.mo45055a((C17533w<K, V>) jVar);
                    }
                }
                if (!z) {
                    return m58280a(jVar3, k2, wVar);
                }
                try {
                    synchronized (jVar3) {
                        a = m58282a(k2, i2, jVar, cacheLoader);
                    }
                    this.f48572n.mo44961b(1);
                    return a;
                } catch (Throwable th) {
                    this.f48572n.mo44961b(1);
                    throw th;
                }
            } finally {
                unlock();
                m58314m();
            }
        }

        /* renamed from: a */
        private V m58280a(C17543j<K, V> jVar, K k, C17533w<K, V> wVar) throws ExecutionException {
            if (wVar.mo45039c()) {
                C17439m.m57985b(!Thread.holdsLock(jVar), "Recursive load of: %s", (Object) k);
                try {
                    V e = wVar.mo45041e();
                    if (e != null) {
                        m58299b(jVar, this.f48559a.f48483q.mo44952a());
                        return e;
                    }
                    StringBuilder sb = new StringBuilder("CacheLoader returned null for key ");
                    sb.append(k);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    throw new InvalidCacheLoadException(sb.toString());
                } finally {
                    this.f48572n.mo44961b(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        private C18253l<V> m58295b(K k, int i, C17514j<K, V> jVar, CacheLoader<? super K, V> cacheLoader) {
            C18253l<V> a = jVar.mo45108a(k, cacheLoader);
            final K k2 = k;
            final int i2 = i;
            final C17514j<K, V> jVar2 = jVar;
            final C18253l<V> lVar = a;
            C175211 r0 = new Runnable() {
                public final void run() {
                    try {
                        C17520n.this.mo45116a(k2, i2, jVar2, lVar);
                    } catch (Throwable th) {
                        C17482f.f48465a.log(Level.WARNING, "Exception thrown during refresh", th);
                        jVar2.mo45109a(th);
                    }
                }
            };
            a.mo6818a(r0, C18254m.m60217a());
            return a;
        }

        C17520n(C17482f<K, V> fVar, int i, long j, C17472b bVar) {
            ReferenceQueue<K> referenceQueue;
            Queue<C17543j<K, V>> queue;
            Queue<C17543j<K, V>> queue2;
            Queue<C17543j<K, V>> queue3;
            this.f48559a = fVar;
            this.f48565g = j;
            this.f48572n = (C17472b) C17439m.m57962a(bVar);
            m58289a(m58283a(i));
            ReferenceQueue<V> referenceQueue2 = null;
            if (fVar.mo45021h()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.f48566h = referenceQueue;
            if (fVar.mo45022i()) {
                referenceQueue2 = new ReferenceQueue<>();
            }
            this.f48567i = referenceQueue2;
            if (fVar.mo45014d()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = C17482f.m58107l();
            }
            this.f48568j = queue;
            if (fVar.mo45015e()) {
                queue2 = new C17492ag<>();
            } else {
                queue2 = C17482f.m58107l();
            }
            this.f48570l = queue2;
            if (fVar.mo45014d()) {
                queue3 = new C17497c<>();
            } else {
                queue3 = C17482f.m58107l();
            }
            this.f48571m = queue3;
        }

        /* renamed from: a */
        private V m58281a(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            C17514j a = m58274a(k, i, true);
            if (a == null) {
                return null;
            }
            C18253l b = m58295b(k, i, a, cacheLoader);
            if (b.isDone()) {
                try {
                    return C18260p.m60224a(b);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* renamed from: a */
        private V m58279a(C17543j<K, V> jVar, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            if (this.f48559a.mo45010c() && j - jVar.mo45067h() > this.f48559a.f48480n && !jVar.mo45053a().mo45039c()) {
                V a = m58281a(k, i, cacheLoader, true);
                if (a != null) {
                    return a;
                }
            }
            return v;
        }

        /* renamed from: a */
        private C17543j<K, V> m58276a(C17543j<K, V> jVar, C17543j<K, V> jVar2, K k, int i, V v, C17533w<K, V> wVar, RemovalCause removalCause) {
            m58288a(k, i, v, wVar.mo45035a(), removalCause);
            this.f48570l.remove(jVar2);
            this.f48571m.remove(jVar2);
            if (!wVar.mo45039c()) {
                return m58294b(jVar, jVar2);
            }
            wVar.mo45037a(null);
            return jVar;
        }
    }

    /* renamed from: com.google.common.cache.f$o */
    static class C17522o<K, V> extends SoftReference<V> implements C17533w<K, V> {

        /* renamed from: a */
        final C17543j<K, V> f48578a;

        /* renamed from: a */
        public int mo45035a() {
            return 1;
        }

        /* renamed from: a */
        public final void mo45037a(V v) {
        }

        /* renamed from: b */
        public final C17543j<K, V> mo45038b() {
            return this.f48578a;
        }

        /* renamed from: c */
        public final boolean mo45039c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo45040d() {
            return true;
        }

        /* renamed from: e */
        public final V mo45041e() {
            return get();
        }

        C17522o(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar) {
            super(v, referenceQueue);
            this.f48578a = jVar;
        }

        /* renamed from: a */
        public C17533w<K, V> mo45036a(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar) {
            return new C17522o(referenceQueue, v, jVar);
        }
    }

    /* renamed from: com.google.common.cache.f$p */
    enum C17523p {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Equivalence<Object> mo45128a() {
                return Equivalence.m57863a();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17533w<K, V> mo45129a(C17520n<K, V> nVar, C17543j<K, V> jVar, V v, int i) {
                if (i == 1) {
                    return new C17530t(v);
                }
                return new C17490ae(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Equivalence<Object> mo45128a() {
                return Equivalence.m57864b();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17533w<K, V> mo45129a(C17520n<K, V> nVar, C17543j<K, V> jVar, V v, int i) {
                if (i == 1) {
                    return new C17522o(nVar.f48567i, v, jVar);
                }
                return new C17489ad(nVar.f48567i, v, jVar, i);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Equivalence<Object> mo45128a() {
                return Equivalence.m57864b();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C17533w<K, V> mo45129a(C17520n<K, V> nVar, C17543j<K, V> jVar, V v, int i) {
                if (i == 1) {
                    return new C17487ab(nVar.f48567i, v, jVar);
                }
                return new C17491af(nVar.f48567i, v, jVar, i);
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Equivalence<Object> mo45128a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C17533w<K, V> mo45129a(C17520n<K, V> nVar, C17543j<K, V> jVar, V v, int i);
    }

    /* renamed from: com.google.common.cache.f$q */
    static final class C17527q<K, V> extends C17529s<K, V> {

        /* renamed from: a */
        volatile long f48583a = Long.MAX_VALUE;

        /* renamed from: b */
        C17543j<K, V> f48584b = C17482f.m58106k();

        /* renamed from: c */
        C17543j<K, V> f48585c = C17482f.m58106k();

        /* renamed from: e */
        public final long mo45064e() {
            return this.f48583a;
        }

        /* renamed from: f */
        public final C17543j<K, V> mo45065f() {
            return this.f48584b;
        }

        /* renamed from: g */
        public final C17543j<K, V> mo45066g() {
            return this.f48585c;
        }

        /* renamed from: a */
        public final void mo45054a(long j) {
            this.f48583a = j;
        }

        /* renamed from: b */
        public final void mo45059b(C17543j<K, V> jVar) {
            this.f48585c = jVar;
        }

        /* renamed from: a */
        public final void mo45056a(C17543j<K, V> jVar) {
            this.f48584b = jVar;
        }

        C17527q(K k, int i, C17543j<K, V> jVar) {
            super(k, i, jVar);
        }
    }

    /* renamed from: com.google.common.cache.f$r */
    static final class C17528r<K, V> extends C17529s<K, V> {

        /* renamed from: a */
        volatile long f48586a = Long.MAX_VALUE;

        /* renamed from: b */
        C17543j<K, V> f48587b = C17482f.m58106k();

        /* renamed from: c */
        C17543j<K, V> f48588c = C17482f.m58106k();

        /* renamed from: d */
        volatile long f48589d = Long.MAX_VALUE;

        /* renamed from: e */
        C17543j<K, V> f48590e = C17482f.m58106k();

        /* renamed from: f */
        C17543j<K, V> f48591f = C17482f.m58106k();

        /* renamed from: e */
        public final long mo45064e() {
            return this.f48586a;
        }

        /* renamed from: f */
        public final C17543j<K, V> mo45065f() {
            return this.f48587b;
        }

        /* renamed from: g */
        public final C17543j<K, V> mo45066g() {
            return this.f48588c;
        }

        /* renamed from: h */
        public final long mo45067h() {
            return this.f48589d;
        }

        /* renamed from: i */
        public final C17543j<K, V> mo45068i() {
            return this.f48590e;
        }

        /* renamed from: j */
        public final C17543j<K, V> mo45069j() {
            return this.f48591f;
        }

        /* renamed from: a */
        public final void mo45054a(long j) {
            this.f48586a = j;
        }

        /* renamed from: b */
        public final void mo45058b(long j) {
            this.f48589d = j;
        }

        /* renamed from: c */
        public final void mo45061c(C17543j<K, V> jVar) {
            this.f48590e = jVar;
        }

        /* renamed from: d */
        public final void mo45063d(C17543j<K, V> jVar) {
            this.f48591f = jVar;
        }

        /* renamed from: a */
        public final void mo45056a(C17543j<K, V> jVar) {
            this.f48587b = jVar;
        }

        /* renamed from: b */
        public final void mo45059b(C17543j<K, V> jVar) {
            this.f48588c = jVar;
        }

        C17528r(K k, int i, C17543j<K, V> jVar) {
            super(k, i, jVar);
        }
    }

    /* renamed from: com.google.common.cache.f$s */
    static class C17529s<K, V> extends C17496b<K, V> {

        /* renamed from: g */
        final K f48592g;

        /* renamed from: h */
        final int f48593h;

        /* renamed from: i */
        final C17543j<K, V> f48594i;

        /* renamed from: j */
        volatile C17533w<K, V> f48595j = C17482f.m58105j();

        /* renamed from: a */
        public final C17533w<K, V> mo45053a() {
            return this.f48595j;
        }

        /* renamed from: b */
        public final C17543j<K, V> mo45057b() {
            return this.f48594i;
        }

        /* renamed from: c */
        public final int mo45060c() {
            return this.f48593h;
        }

        /* renamed from: d */
        public final K mo45062d() {
            return this.f48592g;
        }

        /* renamed from: a */
        public final void mo45055a(C17533w<K, V> wVar) {
            this.f48595j = wVar;
        }

        C17529s(K k, int i, C17543j<K, V> jVar) {
            this.f48592g = k;
            this.f48593h = i;
            this.f48594i = jVar;
        }
    }

    /* renamed from: com.google.common.cache.f$t */
    static class C17530t<K, V> implements C17533w<K, V> {

        /* renamed from: a */
        final V f48596a;

        /* renamed from: a */
        public int mo45035a() {
            return 1;
        }

        /* renamed from: a */
        public final C17533w<K, V> mo45036a(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar) {
            return this;
        }

        /* renamed from: a */
        public final void mo45037a(V v) {
        }

        /* renamed from: b */
        public final C17543j<K, V> mo45038b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo45039c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo45040d() {
            return true;
        }

        public V get() {
            return this.f48596a;
        }

        /* renamed from: e */
        public final V mo45041e() {
            return get();
        }

        C17530t(V v) {
            this.f48596a = v;
        }
    }

    /* renamed from: com.google.common.cache.f$u */
    static final class C17531u<K, V> extends C17529s<K, V> {

        /* renamed from: a */
        volatile long f48597a = Long.MAX_VALUE;

        /* renamed from: b */
        C17543j<K, V> f48598b = C17482f.m58106k();

        /* renamed from: c */
        C17543j<K, V> f48599c = C17482f.m58106k();

        /* renamed from: h */
        public final long mo45067h() {
            return this.f48597a;
        }

        /* renamed from: i */
        public final C17543j<K, V> mo45068i() {
            return this.f48598b;
        }

        /* renamed from: j */
        public final C17543j<K, V> mo45069j() {
            return this.f48599c;
        }

        /* renamed from: b */
        public final void mo45058b(long j) {
            this.f48597a = j;
        }

        /* renamed from: c */
        public final void mo45061c(C17543j<K, V> jVar) {
            this.f48598b = jVar;
        }

        /* renamed from: d */
        public final void mo45063d(C17543j<K, V> jVar) {
            this.f48599c = jVar;
        }

        C17531u(K k, int i, C17543j<K, V> jVar) {
            super(k, i, jVar);
        }
    }

    /* renamed from: com.google.common.cache.f$v */
    final class C17532v extends C17511g<V> {
        public final V next() {
            return mo45101a().getValue();
        }

        C17532v() {
            super();
        }
    }

    /* renamed from: com.google.common.cache.f$w */
    interface C17533w<K, V> {
        /* renamed from: a */
        int mo45035a();

        /* renamed from: a */
        C17533w<K, V> mo45036a(ReferenceQueue<V> referenceQueue, V v, C17543j<K, V> jVar);

        /* renamed from: a */
        void mo45037a(V v);

        /* renamed from: b */
        C17543j<K, V> mo45038b();

        /* renamed from: c */
        boolean mo45039c();

        /* renamed from: d */
        boolean mo45040d();

        /* renamed from: e */
        V mo45041e() throws ExecutionException;

        V get();
    }

    /* renamed from: com.google.common.cache.f$x */
    final class C17534x extends AbstractCollection<V> {

        /* renamed from: b */
        private final ConcurrentMap<?, ?> f48602b;

        public final void clear() {
            this.f48602b.clear();
        }

        public final boolean isEmpty() {
            return this.f48602b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C17532v();
        }

        public final int size() {
            return this.f48602b.size();
        }

        public final Object[] toArray() {
            return C17482f.m58097a((Collection<E>) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f48602b.containsValue(obj);
        }

        public final <E> E[] toArray(E[] eArr) {
            return C17482f.m58097a((Collection<E>) this).toArray(eArr);
        }

        C17534x(ConcurrentMap<?, ?> concurrentMap) {
            this.f48602b = concurrentMap;
        }
    }

    /* renamed from: com.google.common.cache.f$y */
    static final class C17535y<K, V> extends C17486aa<K, V> {

        /* renamed from: a */
        volatile long f48603a = Long.MAX_VALUE;

        /* renamed from: b */
        C17543j<K, V> f48604b = C17482f.m58106k();

        /* renamed from: c */
        C17543j<K, V> f48605c = C17482f.m58106k();

        /* renamed from: e */
        public final long mo45064e() {
            return this.f48603a;
        }

        /* renamed from: f */
        public final C17543j<K, V> mo45065f() {
            return this.f48604b;
        }

        /* renamed from: g */
        public final C17543j<K, V> mo45066g() {
            return this.f48605c;
        }

        /* renamed from: a */
        public final void mo45054a(long j) {
            this.f48603a = j;
        }

        /* renamed from: b */
        public final void mo45059b(C17543j<K, V> jVar) {
            this.f48605c = jVar;
        }

        /* renamed from: a */
        public final void mo45056a(C17543j<K, V> jVar) {
            this.f48604b = jVar;
        }

        C17535y(ReferenceQueue<K> referenceQueue, K k, int i, C17543j<K, V> jVar) {
            super(referenceQueue, k, i, jVar);
        }
    }

    /* renamed from: com.google.common.cache.f$z */
    static final class C17536z<K, V> extends C17486aa<K, V> {

        /* renamed from: a */
        volatile long f48606a = Long.MAX_VALUE;

        /* renamed from: b */
        C17543j<K, V> f48607b = C17482f.m58106k();

        /* renamed from: c */
        C17543j<K, V> f48608c = C17482f.m58106k();

        /* renamed from: d */
        volatile long f48609d = Long.MAX_VALUE;

        /* renamed from: e */
        C17543j<K, V> f48610e = C17482f.m58106k();

        /* renamed from: f */
        C17543j<K, V> f48611f = C17482f.m58106k();

        /* renamed from: e */
        public final long mo45064e() {
            return this.f48606a;
        }

        /* renamed from: f */
        public final C17543j<K, V> mo45065f() {
            return this.f48607b;
        }

        /* renamed from: g */
        public final C17543j<K, V> mo45066g() {
            return this.f48608c;
        }

        /* renamed from: h */
        public final long mo45067h() {
            return this.f48609d;
        }

        /* renamed from: i */
        public final C17543j<K, V> mo45068i() {
            return this.f48610e;
        }

        /* renamed from: j */
        public final C17543j<K, V> mo45069j() {
            return this.f48611f;
        }

        /* renamed from: a */
        public final void mo45054a(long j) {
            this.f48606a = j;
        }

        /* renamed from: b */
        public final void mo45058b(long j) {
            this.f48609d = j;
        }

        /* renamed from: c */
        public final void mo45061c(C17543j<K, V> jVar) {
            this.f48610e = jVar;
        }

        /* renamed from: d */
        public final void mo45063d(C17543j<K, V> jVar) {
            this.f48611f = jVar;
        }

        /* renamed from: a */
        public final void mo45056a(C17543j<K, V> jVar) {
            this.f48607b = jVar;
        }

        /* renamed from: b */
        public final void mo45059b(C17543j<K, V> jVar) {
            this.f48608c = jVar;
        }

        C17536z(ReferenceQueue<K> referenceQueue, K k, int i, C17543j<K, V> jVar) {
            super(referenceQueue, k, i, jVar);
        }
    }

    /* renamed from: a */
    private static int m58095a(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: j */
    static <K, V> C17533w<K, V> m58105j() {
        return f48466u;
    }

    /* renamed from: k */
    static <K, V> C17543j<K, V> m58106k() {
        return C17519m.INSTANCE;
    }

    /* renamed from: l */
    static <E> Queue<E> m58107l() {
        return f48467v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo45007a() {
        return this.f48476j >= 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo45015e() {
        return m58108n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo45018g() {
        return m58109o();
    }

    /* renamed from: n */
    private boolean m58108n() {
        if (this.f48479m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m58109o() {
        if (this.f48478l > 0) {
            return true;
        }
        return false;
    }

    public void clear() {
        for (C17520n<K, V> a : this.f48470d) {
            a.mo45119a();
        }
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f48489y;
        if (set != null) {
            return set;
        }
        C17510f fVar = new C17510f(this);
        this.f48489y = fVar;
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo45021h() {
        if (this.f48474h != C17523p.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo45022i() {
        if (this.f48475i != C17523p.STRONG) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.f48487w;
        if (set != null) {
            return set;
        }
        C17513i iVar = new C17513i(this);
        this.f48487w = iVar;
        return iVar;
    }

    public int size() {
        return C18143c.m59970b(m58113s());
    }

    public Collection<V> values() {
        Collection<V> collection = this.f48488x;
        if (collection != null) {
            return collection;
        }
        C17534x xVar = new C17534x(this);
        this.f48488x = xVar;
        return xVar;
    }

    /* renamed from: p */
    private boolean m58110p() {
        if (mo45017f() || mo45018g()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m58111q() {
        if (mo45015e() || mo45017f()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m58112r() {
        if (mo45014d() || mo45018g()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private long m58113s() {
        long j = 0;
        for (C17520n<K, V> nVar : this.f48470d) {
            j += (long) Math.max(0, nVar.f48560b);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo45010c() {
        if (this.f48480n > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo45014d() {
        if (m58109o() || mo45007a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo45017f() {
        if (m58108n() || mo45010c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo45025m() {
        while (true) {
            RemovalNotification removalNotification = (RemovalNotification) this.f48481o.poll();
            if (removalNotification != null) {
                try {
                    this.f48482p.mo44996a(removalNotification);
                } catch (Throwable th) {
                    f48465a.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    public boolean isEmpty() {
        C17520n<K, V>[] nVarArr = this.f48470d;
        long j = 0;
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].f48560b != 0) {
                return false;
            }
            j += (long) nVarArr[i].f48562d;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < nVarArr.length; i2++) {
                if (nVarArr[i2].f48560b != 0) {
                    return false;
                }
                j -= (long) nVarArr[i2].f48562d;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo45008b() {
        if (this.f48477k != C17479b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static C17520n<K, V>[] m58104c(int i) {
        return new C17520n[i];
    }

    /* renamed from: b */
    private int m58099b(Object obj) {
        return m58095a(this.f48472f.mo44881a(obj));
    }

    /* renamed from: c */
    static <K, V> void m58103c(C17543j<K, V> jVar) {
        C17543j k = m58106k();
        jVar.mo45061c(k);
        jVar.mo45063d(k);
    }

    /* renamed from: b */
    private C17520n<K, V> m58100b(int i) {
        return this.f48470d[(i >>> this.f48469c) & this.f48468b];
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int b = m58099b(obj);
        return m58100b(b).mo45124b(obj, b);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int b = m58099b(obj);
        return m58100b(b).mo45114a(obj, b);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int b = m58099b(obj);
        return m58100b(b).mo45126c(obj, b);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m58097a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C17782br.m59113a((Collection<T>) arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: b */
    static <K, V> void m58101b(C17543j<K, V> jVar) {
        C17543j k = m58106k();
        jVar.mo45056a(k);
        jVar.mo45059b(k);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean containsValue(Object obj) {
        long j;
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a = this.f48483q.mo44952a();
        C17520n<K, V>[] nVarArr = this.f48470d;
        long j2 = -1;
        int i = 0;
        while (i < 3) {
            int length = nVarArr.length;
            long j3 = 0;
            int i2 = 0;
            while (i2 < length) {
                C17520n<K, V> nVar = nVarArr[i2];
                int i3 = nVar.f48560b;
                AtomicReferenceArray<C17543j<K, V>> atomicReferenceArray = nVar.f48564f;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    C17543j jVar = (C17543j) atomicReferenceArray.get(i4);
                    while (jVar != null) {
                        C17520n<K, V>[] nVarArr2 = nVarArr;
                        Object a2 = nVar.mo45113a(jVar, a);
                        if (a2 != null) {
                            j = a;
                            if (this.f48473g.mo44882a(obj2, a2)) {
                                return true;
                            }
                        } else {
                            j = a;
                        }
                        jVar = jVar.mo45057b();
                        nVarArr = nVarArr2;
                        a = j;
                    }
                    long j4 = a;
                    C17520n<K, V>[] nVarArr3 = nVarArr;
                }
                C17520n<K, V>[] nVarArr4 = nVarArr;
                j3 += (long) nVar.f48562d;
                i2++;
                a = a;
            }
            long j5 = a;
            C17520n<K, V>[] nVarArr5 = nVarArr;
            if (j3 == j2) {
                break;
            }
            i++;
            j2 = j3;
            nVarArr = nVarArr5;
            a = j5;
        }
        return false;
    }

    /* renamed from: a */
    public final V mo45003a(Object obj) {
        int b = m58099b(C17439m.m57962a(obj));
        V a = m58100b(b).mo45114a(obj, b);
        if (a == null) {
            this.f48485s.mo44961b(1);
        } else {
            this.f48485s.mo44959a(1);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo45005a(C17533w<K, V> wVar) {
        C17543j b = wVar.mo45038b();
        int c = b.mo45060c();
        m58100b(c).mo45121a(b.mo45062d(), c, wVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo45006a(C17543j<K, V> jVar) {
        int c = jVar.mo45060c();
        m58100b(c).mo45120a(jVar, c);
    }

    /* renamed from: a */
    static <K, V> void m58098a(C17543j<K, V> jVar, C17543j<K, V> jVar2) {
        jVar.mo45056a(jVar2);
        jVar2.mo45059b(jVar);
    }

    /* renamed from: b */
    static <K, V> void m58102b(C17543j<K, V> jVar, C17543j<K, V> jVar2) {
        jVar.mo45061c(jVar2);
        jVar2.mo45063d(jVar);
    }

    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    public V put(K k, V v) {
        C17439m.m57962a(k);
        C17439m.m57962a(v);
        int b = m58099b((Object) k);
        return m58100b(b).mo45118a(k, b, v, false);
    }

    public V putIfAbsent(K k, V v) {
        C17439m.m57962a(k);
        C17439m.m57962a(v);
        int b = m58099b((Object) k);
        return m58100b(b).mo45118a(k, b, v, true);
    }

    public V replace(K k, V v) {
        C17439m.m57962a(k);
        C17439m.m57962a(v);
        int b = m58099b((Object) k);
        return m58100b(b).mo45117a(k, b, v);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int b = m58099b(obj);
        return m58100b(b).mo45125b(obj, b, obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final V mo45002a(C17543j<K, V> jVar, long j) {
        if (jVar.mo45062d() == null) {
            return null;
        }
        V v = jVar.mo45053a().get();
        if (v != null && !mo45009b(jVar, j)) {
            return v;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo45009b(C17543j<K, V> jVar, long j) {
        C17439m.m57962a(jVar);
        if (m58109o() && j - jVar.mo45064e() >= this.f48478l) {
            return true;
        }
        if (!m58108n() || j - jVar.mo45067h() < this.f48479m) {
            return false;
        }
        return true;
    }

    C17482f(C17474c<? super K, ? super V> cVar, CacheLoader<? super K, V> cacheLoader) {
        Queue<RemovalNotification<K, V>> queue;
        this.f48471e = Math.min(cVar.mo44984e(), 65536);
        this.f48474h = cVar.mo44987h();
        this.f48475i = cVar.mo44989j();
        this.f48472f = cVar.mo44977b();
        this.f48473g = cVar.mo44982c();
        this.f48476j = cVar.mo44985f();
        this.f48477k = cVar.mo44986g();
        this.f48478l = cVar.mo44991l();
        this.f48479m = cVar.mo44990k();
        this.f48480n = cVar.mo44992m();
        this.f48482p = cVar.mo44993n();
        if (this.f48482p == C17478a.INSTANCE) {
            queue = m58107l();
        } else {
            queue = new ConcurrentLinkedQueue<>();
        }
        this.f48481o = queue;
        this.f48483q = cVar.mo44968a(m58110p());
        this.f48484r = C17500d.m58211a(this.f48474h, m58112r(), m58111q());
        this.f48485s = (C17472b) cVar.f48454t.mo44946a();
        this.f48486t = null;
        int min = Math.min(cVar.mo44983d(), 1073741824);
        if (mo45007a() && !mo45008b()) {
            min = Math.min(min, (int) this.f48476j);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f48471e && (!mo45007a() || ((long) (i3 * 20)) <= this.f48476j)) {
            i4++;
            i3 <<= 1;
        }
        this.f48469c = 32 - i4;
        this.f48468b = i3 - 1;
        this.f48470d = m58104c(i3);
        int i5 = min / i3;
        if (i5 * i3 < min) {
            i5++;
        }
        while (i2 < i5) {
            i2 <<= 1;
        }
        if (mo45007a()) {
            long j = (long) i3;
            long j2 = (this.f48476j / j) + 1;
            long j3 = this.f48476j % j;
            while (i < this.f48470d.length) {
                if (((long) i) == j3) {
                    j2--;
                }
                this.f48470d[i] = m58096a(i2, j2, (C17472b) cVar.f48454t.mo44946a());
                i++;
            }
            return;
        }
        while (i < this.f48470d.length) {
            this.f48470d[i] = m58096a(i2, -1, (C17472b) cVar.f48454t.mo44946a());
            i++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final V mo45004a(K k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int b = m58099b(C17439m.m57962a(k));
        return m58100b(b).mo45115a(k, b, cacheLoader);
    }

    /* renamed from: a */
    private C17520n<K, V> m58096a(int i, long j, C17472b bVar) {
        C17520n nVar = new C17520n(this, i, j, bVar);
        return nVar;
    }

    public boolean replace(K k, V v, V v2) {
        C17439m.m57962a(k);
        C17439m.m57962a(v2);
        if (v == null) {
            return false;
        }
        int b = m58099b((Object) k);
        return m58100b(b).mo45122a(k, b, v, v2);
    }
}
