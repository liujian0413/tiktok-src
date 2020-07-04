package com.bytedance.jedi.model.guava.cache;

import com.bytedance.jedi.model.guava.base.C11864b;
import com.bytedance.jedi.model.guava.base.C11866d;
import com.bytedance.jedi.model.guava.base.Equivalence;
import com.bytedance.jedi.model.guava.p606a.C11854a;
import com.bytedance.jedi.model.guava.p606a.C11855b;
import com.bytedance.jedi.model.guava.p607b.C11856a;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* renamed from: com.bytedance.jedi.model.guava.cache.c */
class C11878c<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a */
    static final Logger f31689a = Logger.getLogger(C11878c.class.getName());

    /* renamed from: s */
    static final C11922u<Object, Object> f31690s = new C11922u<Object, Object>() {
        /* renamed from: a */
        public final int mo29452a() {
            return 0;
        }

        /* renamed from: a */
        public final C11922u<Object, Object> mo29453a(ReferenceQueue<Object> referenceQueue, Object obj, C11928d<Object, Object> dVar) {
            return this;
        }

        /* renamed from: b */
        public final C11928d<Object, Object> mo29454b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo29455c() {
            return false;
        }

        public final Object get() {
            return null;
        }
    };

    /* renamed from: t */
    static final Queue<?> f31691t = new AbstractQueue<Object>() {
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
            return new HashSet().iterator();
        }
    };

    /* renamed from: b */
    final int f31692b;

    /* renamed from: c */
    final int f31693c;

    /* renamed from: d */
    final C11910l<K, V>[] f31694d;

    /* renamed from: e */
    final int f31695e;

    /* renamed from: f */
    final Equivalence<Object> f31696f;

    /* renamed from: g */
    final Equivalence<Object> f31697g;

    /* renamed from: h */
    final C11912n f31698h;

    /* renamed from: i */
    final C11912n f31699i;

    /* renamed from: j */
    final long f31700j;

    /* renamed from: k */
    final C11930f<K, V> f31701k;

    /* renamed from: l */
    final long f31702l;

    /* renamed from: m */
    final long f31703m;

    /* renamed from: n */
    final long f31704n;

    /* renamed from: o */
    final Queue<RemovalNotification<K, V>> f31705o;

    /* renamed from: p */
    final C11929e<K, V> f31706p;

    /* renamed from: q */
    final C11866d f31707q;

    /* renamed from: r */
    final C11894d f31708r;

    /* renamed from: u */
    Set<K> f31709u;

    /* renamed from: v */
    Collection<V> f31710v;

    /* renamed from: w */
    Set<Entry<K, V>> f31711w;

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$a */
    abstract class C11881a<T> extends AbstractSet<T> {

        /* renamed from: a */
        final ConcurrentMap<?, ?> f31712a;

        public void clear() {
            this.f31712a.clear();
        }

        public boolean isEmpty() {
            return this.f31712a.isEmpty();
        }

        public int size() {
            return this.f31712a.size();
        }

        public Object[] toArray() {
            return C11878c.m34691a((Collection<E>) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return C11878c.m34691a((Collection<E>) this).toArray(eArr);
        }

        C11881a(ConcurrentMap<?, ?> concurrentMap) {
            this.f31712a = concurrentMap;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$aa */
    static final class C11882aa<K, V> extends C11926y<K, V> {

        /* renamed from: a */
        volatile long f31714a = Long.MAX_VALUE;

        /* renamed from: b */
        C11928d<K, V> f31715b = C11878c.m34700j();

        /* renamed from: c */
        C11928d<K, V> f31716c = C11878c.m34700j();

        /* renamed from: h */
        public final long mo29470h() {
            return this.f31714a;
        }

        /* renamed from: i */
        public final C11928d<K, V> mo29471i() {
            return this.f31715b;
        }

        /* renamed from: j */
        public final C11928d<K, V> mo29472j() {
            return this.f31716c;
        }

        /* renamed from: b */
        public final void mo29467b(long j) {
            this.f31714a = j;
        }

        /* renamed from: c */
        public final void mo29468c(C11928d<K, V> dVar) {
            this.f31715b = dVar;
        }

        /* renamed from: d */
        public final void mo29469d(C11928d<K, V> dVar) {
            this.f31716c = dVar;
        }

        C11882aa(ReferenceQueue<K> referenceQueue, K k, int i, C11928d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$ab */
    static final class C11883ab<K, V> extends C11911m<K, V> {

        /* renamed from: b */
        final int f31717b;

        /* renamed from: a */
        public final int mo29452a() {
            return this.f31717b;
        }

        /* renamed from: a */
        public final C11922u<K, V> mo29453a(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar) {
            return new C11883ab(referenceQueue, v, dVar, this.f31717b);
        }

        C11883ab(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar, int i) {
            super(referenceQueue, v, dVar);
            this.f31717b = i;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$ac */
    static final class C11884ac<K, V> extends C11919r<K, V> {

        /* renamed from: b */
        final int f31718b;

        /* renamed from: a */
        public final int mo29452a() {
            return this.f31718b;
        }

        C11884ac(V v, int i) {
            super(v);
            this.f31718b = i;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$ad */
    static final class C11885ad<K, V> extends C11927z<K, V> {

        /* renamed from: b */
        final int f31719b;

        /* renamed from: a */
        public final int mo29452a() {
            return this.f31719b;
        }

        /* renamed from: a */
        public final C11922u<K, V> mo29453a(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar) {
            return new C11885ad(referenceQueue, v, dVar, this.f31719b);
        }

        C11885ad(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar, int i) {
            super(referenceQueue, v, dVar);
            this.f31719b = i;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$ae */
    static final class C11886ae<K, V> extends AbstractQueue<C11928d<K, V>> {

        /* renamed from: a */
        final C11928d<K, V> f31720a = new C11890b<K, V>() {

            /* renamed from: a */
            C11928d<K, V> f31721a = this;

            /* renamed from: b */
            C11928d<K, V> f31722b = this;

            /* renamed from: b */
            public final void mo29467b(long j) {
            }

            /* renamed from: h */
            public final long mo29470h() {
                return Long.MAX_VALUE;
            }

            /* renamed from: i */
            public final C11928d<K, V> mo29471i() {
                return this.f31721a;
            }

            /* renamed from: j */
            public final C11928d<K, V> mo29472j() {
                return this.f31722b;
            }

            /* renamed from: c */
            public final void mo29468c(C11928d<K, V> dVar) {
                this.f31721a = dVar;
            }

            /* renamed from: d */
            public final void mo29469d(C11928d<K, V> dVar) {
                this.f31722b = dVar;
            }
        };

        C11886ae() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C11928d<K, V> peek() {
            C11928d<K, V> i = this.f31720a.mo29471i();
            if (i == this.f31720a) {
                return null;
            }
            return i;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C11928d<K, V> poll() {
            C11928d<K, V> i = this.f31720a.mo29471i();
            if (i == this.f31720a) {
                return null;
            }
            remove(i);
            return i;
        }

        public final boolean isEmpty() {
            if (this.f31720a.mo29471i() == this.f31720a) {
                return true;
            }
            return false;
        }

        public final Iterator<C11928d<K, V>> iterator() {
            return new C11854a<C11928d<K, V>>(peek()) {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C11928d<K, V> mo29380a(C11928d<K, V> dVar) {
                    C11928d<K, V> i = dVar.mo29471i();
                    if (i == C11886ae.this.f31720a) {
                        return null;
                    }
                    return i;
                }
            };
        }

        public final int size() {
            int i = 0;
            for (C11928d<K, V> i2 = this.f31720a.mo29471i(); i2 != this.f31720a; i2 = i2.mo29471i()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C11928d<K, V> i = this.f31720a.mo29471i();
            while (i != this.f31720a) {
                C11928d i2 = i.mo29471i();
                C11878c.m34697c(i);
                i = i2;
            }
            this.f31720a.mo29468c(this.f31720a);
            this.f31720a.mo29469d(this.f31720a);
        }

        public final boolean contains(Object obj) {
            if (((C11928d) obj).mo29471i() != C11909k.INSTANCE) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean offer(C11928d<K, V> dVar) {
            C11878c.m34696b(dVar.mo29472j(), dVar.mo29471i());
            C11878c.m34696b(this.f31720a.mo29472j(), dVar);
            C11878c.m34696b(dVar, this.f31720a);
            return true;
        }

        public final boolean remove(Object obj) {
            C11928d dVar = (C11928d) obj;
            C11928d j = dVar.mo29472j();
            C11928d i = dVar.mo29471i();
            C11878c.m34696b(j, i);
            C11878c.m34697c(dVar);
            if (i != C11909k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$af */
    final class C11889af implements Entry<K, V> {

        /* renamed from: a */
        final K f31725a;

        /* renamed from: b */
        V f31726b;

        public final K getKey() {
            return this.f31725a;
        }

        public final V getValue() {
            return this.f31726b;
        }

        public final int hashCode() {
            return this.f31725a.hashCode() ^ this.f31726b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final V setValue(V v) {
            V put = C11878c.this.put(this.f31725a, v);
            this.f31726b = v;
            return put;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f31725a.equals(entry.getKey()) || !this.f31726b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        C11889af(K k, V v) {
            this.f31725a = k;
            this.f31726b = v;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$b */
    static abstract class C11890b<K, V> implements C11928d<K, V> {
        C11890b() {
        }

        /* renamed from: a */
        public C11922u<K, V> mo29488a() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public C11928d<K, V> mo29492b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public int mo29494c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public K mo29495d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public long mo29496e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C11928d<K, V> mo29497f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C11928d<K, V> mo29498g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo29470h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C11928d<K, V> mo29471i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C11928d<K, V> mo29472j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo29489a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo29467b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo29468c(C11928d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo29469d(C11928d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo29490a(C11922u<K, V> uVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo29493b(C11928d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo29491a(C11928d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$c */
    static final class C11891c<K, V> extends AbstractQueue<C11928d<K, V>> {

        /* renamed from: a */
        final C11928d<K, V> f31728a = new C11890b<K, V>() {

            /* renamed from: a */
            C11928d<K, V> f31729a = this;

            /* renamed from: b */
            C11928d<K, V> f31730b = this;

            /* renamed from: a */
            public final void mo29489a(long j) {
            }

            /* renamed from: e */
            public final long mo29496e() {
                return Long.MAX_VALUE;
            }

            /* renamed from: f */
            public final C11928d<K, V> mo29497f() {
                return this.f31729a;
            }

            /* renamed from: g */
            public final C11928d<K, V> mo29498g() {
                return this.f31730b;
            }

            /* renamed from: b */
            public final void mo29493b(C11928d<K, V> dVar) {
                this.f31730b = dVar;
            }

            /* renamed from: a */
            public final void mo29491a(C11928d<K, V> dVar) {
                this.f31729a = dVar;
            }
        };

        C11891c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C11928d<K, V> peek() {
            C11928d<K, V> f = this.f31728a.mo29497f();
            if (f == this.f31728a) {
                return null;
            }
            return f;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C11928d<K, V> poll() {
            C11928d<K, V> f = this.f31728a.mo29497f();
            if (f == this.f31728a) {
                return null;
            }
            remove(f);
            return f;
        }

        public final boolean isEmpty() {
            if (this.f31728a.mo29497f() == this.f31728a) {
                return true;
            }
            return false;
        }

        public final Iterator<C11928d<K, V>> iterator() {
            return new C11854a<C11928d<K, V>>(peek()) {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C11928d<K, V> mo29380a(C11928d<K, V> dVar) {
                    C11928d<K, V> f = dVar.mo29497f();
                    if (f == C11891c.this.f31728a) {
                        return null;
                    }
                    return f;
                }
            };
        }

        public final int size() {
            int i = 0;
            for (C11928d<K, V> f = this.f31728a.mo29497f(); f != this.f31728a; f = f.mo29497f()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C11928d<K, V> f = this.f31728a.mo29497f();
            while (f != this.f31728a) {
                C11928d f2 = f.mo29497f();
                C11878c.m34695b(f);
                f = f2;
            }
            this.f31728a.mo29491a(this.f31728a);
            this.f31728a.mo29493b(this.f31728a);
        }

        public final boolean contains(Object obj) {
            if (((C11928d) obj).mo29497f() != C11909k.INSTANCE) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean offer(C11928d<K, V> dVar) {
            C11878c.m34692a(dVar.mo29498g(), dVar.mo29497f());
            C11878c.m34692a(this.f31728a.mo29498g(), dVar);
            C11878c.m34692a(dVar, this.f31728a);
            return true;
        }

        public final boolean remove(Object obj) {
            C11928d dVar = (C11928d) obj;
            C11928d g = dVar.mo29498g();
            C11928d f = dVar.mo29497f();
            C11878c.m34692a(g, f);
            C11878c.m34695b(dVar);
            if (f != C11909k.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$d */
    enum C11894d {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar) {
                return new C11918q(k, i, dVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29508a(C11910l<K, V> lVar, C11928d<K, V> dVar, C11928d<K, V> dVar2) {
                C11928d<K, V> a = super.mo29508a(lVar, dVar, dVar2);
                m34778a(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar) {
                return new C11916o(k, i, dVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29508a(C11910l<K, V> lVar, C11928d<K, V> dVar, C11928d<K, V> dVar2) {
                C11928d<K, V> a = super.mo29508a(lVar, dVar, dVar2);
                m34779b(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar) {
                return new C11920s(k, i, dVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29508a(C11910l<K, V> lVar, C11928d<K, V> dVar, C11928d<K, V> dVar2) {
                C11928d<K, V> a = super.mo29508a(lVar, dVar, dVar2);
                m34778a(dVar, a);
                m34779b(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar) {
                return new C11917p(k, i, dVar);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar) {
                return new C11926y(lVar.f31765h, k, i, dVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29508a(C11910l<K, V> lVar, C11928d<K, V> dVar, C11928d<K, V> dVar2) {
                C11928d<K, V> a = super.mo29508a(lVar, dVar, dVar2);
                m34778a(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar) {
                return new C11924w(lVar.f31765h, k, i, dVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29508a(C11910l<K, V> lVar, C11928d<K, V> dVar, C11928d<K, V> dVar2) {
                C11928d<K, V> a = super.mo29508a(lVar, dVar, dVar2);
                m34779b(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar) {
                return new C11882aa(lVar.f31765h, k, i, dVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29508a(C11910l<K, V> lVar, C11928d<K, V> dVar, C11928d<K, V> dVar2) {
                C11928d<K, V> a = super.mo29508a(lVar, dVar, dVar2);
                m34778a(dVar, a);
                m34779b(dVar, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar) {
                return new C11925x(lVar.f31765h, k, i, dVar);
            }
        };
        

        /* renamed from: i */
        static final C11894d[] f31741i = null;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C11928d<K, V> mo29509a(C11910l<K, V> lVar, K k, int i, C11928d<K, V> dVar);

        static {
            f31741i = new C11894d[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        /* renamed from: b */
        static <K, V> void m34779b(C11928d<K, V> dVar, C11928d<K, V> dVar2) {
            dVar2.mo29467b(dVar.mo29470h());
            C11878c.m34696b(dVar.mo29472j(), dVar2);
            C11878c.m34696b(dVar2, dVar.mo29471i());
            C11878c.m34697c(dVar);
        }

        /* renamed from: a */
        static <K, V> void m34778a(C11928d<K, V> dVar, C11928d<K, V> dVar2) {
            dVar2.mo29489a(dVar.mo29496e());
            C11878c.m34692a(dVar.mo29498g(), dVar2);
            C11878c.m34692a(dVar2, dVar.mo29497f());
            C11878c.m34695b(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <K, V> C11928d<K, V> mo29508a(C11910l<K, V> lVar, C11928d<K, V> dVar, C11928d<K, V> dVar2) {
            return mo29509a(lVar, dVar.mo29495d(), dVar.mo29494c(), dVar2);
        }

        /* renamed from: a */
        static C11894d m34777a(C11912n nVar, boolean z, boolean z2) {
            char c;
            char c2 = 0;
            if (nVar == C11912n.WEAK) {
                c = 4;
            } else {
                c = 0;
            }
            boolean z3 = c | z;
            if (z2) {
                c2 = 2;
            }
            return f31741i[z3 | c2];
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$e */
    final class C11903e extends C11905g<Entry<K, V>> {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public Entry<K, V> next() {
            return mo29514a();
        }

        C11903e() {
            super();
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$f */
    final class C11904f extends C11881a<Entry<K, V>> {
        public final Iterator<Entry<K, V>> iterator() {
            return new C11903e();
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null || !C11878c.this.remove(key, entry.getValue())) {
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
            Object obj2 = C11878c.this.get(key);
            if (obj2 == null || !C11878c.this.f31697g.mo29384a(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        C11904f(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$g */
    abstract class C11905g<T> implements Iterator<T> {

        /* renamed from: b */
        int f31745b;

        /* renamed from: c */
        int f31746c = -1;

        /* renamed from: d */
        C11910l<K, V> f31747d;

        /* renamed from: e */
        AtomicReferenceArray<C11928d<K, V>> f31748e;

        /* renamed from: f */
        C11928d<K, V> f31749f;

        /* renamed from: g */
        C11889af f31750g;

        /* renamed from: h */
        C11889af f31751h;

        public boolean hasNext() {
            if (this.f31750g != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m34799c() {
            if (this.f31749f != null) {
                do {
                    this.f31749f = this.f31749f.mo29492b();
                    if (this.f31749f != null) {
                    }
                } while (!m34797a(this.f31749f));
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C11889af mo29514a() {
            if (this.f31750g != null) {
                this.f31751h = this.f31750g;
                m34798b();
                return this.f31751h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.f31751h != null) {
                z = true;
            } else {
                z = false;
            }
            C11864b.m34656a(z);
            C11878c.this.remove(this.f31751h.getKey());
            this.f31751h = null;
        }

        /* renamed from: d */
        private boolean m34800d() {
            while (this.f31746c >= 0) {
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31748e;
                int i = this.f31746c;
                this.f31746c = i - 1;
                C11928d<K, V> dVar = (C11928d) atomicReferenceArray.get(i);
                this.f31749f = dVar;
                if (dVar != null && (m34797a(this.f31749f) || m34799c())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m34798b() {
            this.f31750g = null;
            if (!m34799c() && !m34800d()) {
                while (this.f31745b >= 0) {
                    C11910l<K, V>[] lVarArr = C11878c.this.f31694d;
                    int i = this.f31745b;
                    this.f31745b = i - 1;
                    this.f31747d = lVarArr[i];
                    if (this.f31747d.f31759b != 0) {
                        this.f31748e = this.f31747d.f31763f;
                        this.f31746c = this.f31748e.length() - 1;
                        if (m34800d()) {
                            return;
                        }
                    }
                }
            }
        }

        C11905g() {
            this.f31745b = C11878c.this.f31694d.length - 1;
            m34798b();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private boolean m34797a(C11928d<K, V> dVar) {
            try {
                long a = C11878c.this.f31707q.mo29396a();
                Object d = dVar.mo29495d();
                Object a2 = C11878c.this.mo29421a(dVar, a);
                if (a2 != null) {
                    this.f31750g = new C11889af<>(d, a2);
                    this.f31747d.mo29529b();
                    return true;
                }
                this.f31747d.mo29529b();
                return false;
            } catch (Throwable th) {
                this.f31747d.mo29529b();
                throw th;
            }
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$h */
    final class C11906h extends C11905g<K> {
        public final K next() {
            return mo29514a().getKey();
        }

        C11906h() {
            super();
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$i */
    final class C11907i extends C11881a<K> {
        public final Iterator<K> iterator() {
            return new C11906h();
        }

        public final boolean contains(Object obj) {
            return this.f31712a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (this.f31712a.remove(obj) != null) {
                return true;
            }
            return false;
        }

        C11907i(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$j */
    static class C11908j<K, V> implements C11873a<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final C11878c<K, V> f31755a;

        /* renamed from: b */
        public final ConcurrentMap<K, V> mo29403b() {
            return this.f31755a;
        }

        /* renamed from: a */
        public final void mo29401a() {
            this.f31755a.clear();
        }

        private C11908j(C11878c<K, V> cVar) {
            this.f31755a = cVar;
        }

        /* renamed from: a */
        public final V mo29400a(Object obj) {
            return this.f31755a.mo29422a(obj);
        }

        C11908j(C11874b<? super K, ? super V> bVar) {
            this(new C11878c<>(bVar));
        }

        /* renamed from: b */
        public final void mo29404b(Object obj) {
            C11864b.m34655a(obj);
            this.f31755a.remove(obj);
        }

        /* renamed from: a */
        public final void mo29402a(K k, V v) {
            this.f31755a.put(k, v);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$k */
    enum C11909k implements C11928d<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public final C11922u<Object, Object> mo29488a() {
            return null;
        }

        /* renamed from: a */
        public final void mo29489a(long j) {
        }

        /* renamed from: a */
        public final void mo29490a(C11922u<Object, Object> uVar) {
        }

        /* renamed from: a */
        public final void mo29491a(C11928d<Object, Object> dVar) {
        }

        /* renamed from: b */
        public final C11928d<Object, Object> mo29492b() {
            return null;
        }

        /* renamed from: b */
        public final void mo29467b(long j) {
        }

        /* renamed from: b */
        public final void mo29493b(C11928d<Object, Object> dVar) {
        }

        /* renamed from: c */
        public final int mo29494c() {
            return 0;
        }

        /* renamed from: c */
        public final void mo29468c(C11928d<Object, Object> dVar) {
        }

        /* renamed from: d */
        public final Object mo29495d() {
            return null;
        }

        /* renamed from: d */
        public final void mo29469d(C11928d<Object, Object> dVar) {
        }

        /* renamed from: e */
        public final long mo29496e() {
            return 0;
        }

        /* renamed from: f */
        public final C11928d<Object, Object> mo29497f() {
            return this;
        }

        /* renamed from: g */
        public final C11928d<Object, Object> mo29498g() {
            return this;
        }

        /* renamed from: h */
        public final long mo29470h() {
            return 0;
        }

        /* renamed from: i */
        public final C11928d<Object, Object> mo29471i() {
            return this;
        }

        /* renamed from: j */
        public final C11928d<Object, Object> mo29472j() {
            return this;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$l */
    static class C11910l<K, V> extends ReentrantLock {

        /* renamed from: a */
        final C11878c<K, V> f31758a;

        /* renamed from: b */
        volatile int f31759b;

        /* renamed from: c */
        long f31760c;

        /* renamed from: d */
        int f31761d;

        /* renamed from: e */
        int f31762e;

        /* renamed from: f */
        volatile AtomicReferenceArray<C11928d<K, V>> f31763f;

        /* renamed from: g */
        final long f31764g;

        /* renamed from: h */
        final ReferenceQueue<K> f31765h;

        /* renamed from: i */
        final ReferenceQueue<V> f31766i;

        /* renamed from: j */
        final Queue<C11928d<K, V>> f31767j;

        /* renamed from: k */
        final AtomicInteger f31768k = new AtomicInteger();

        /* renamed from: l */
        final Queue<C11928d<K, V>> f31769l;

        /* renamed from: m */
        final Queue<C11928d<K, V>> f31770m;

        /* renamed from: m */
        private void m34855m() {
            m34857o();
        }

        /* renamed from: a */
        private void m34834a(AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray) {
            this.f31762e = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f31758a.mo29426b() && ((long) this.f31762e) == this.f31764g) {
                this.f31762e++;
            }
            this.f31763f = atomicReferenceArray;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo29522a(Object obj, int i) {
            try {
                if (this.f31759b != 0) {
                    long a = this.f31758a.f31707q.mo29396a();
                    C11928d a2 = m34826a(obj, i, a);
                    if (a2 == null) {
                        return null;
                    }
                    V v = a2.mo29488a().get();
                    if (v != null) {
                        m34840b(a2, a);
                        mo29529b();
                        return v;
                    }
                    m34841c();
                }
                mo29529b();
                return null;
            } finally {
                mo29529b();
            }
        }

        /* renamed from: a */
        private void m34833a(K k, int i, V v, int i2, RemovalCause removalCause) {
            this.f31760c -= (long) i2;
            if (this.f31758a.f31705o != C11878c.f31691t) {
                this.f31758a.f31705o.offer(RemovalNotification.create(k, v, removalCause));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo29521a(C11928d<K, V> dVar, long j) {
            if (dVar.mo29495d() == null) {
                m34841c();
                return null;
            }
            V v = dVar.mo29488a().get();
            if (v == null) {
                m34841c();
                return null;
            } else if (!this.f31758a.mo29427b(dVar, j)) {
                return v;
            } else {
                m34829a(j);
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo29524a(K k, int i, V v, boolean z) {
            int i2;
            K k2 = k;
            int i3 = i;
            lock();
            try {
                long a = this.f31758a.f31707q.mo29396a();
                m34842c(a);
                if (this.f31759b + 1 > this.f31762e) {
                    m34854l();
                    int i4 = this.f31759b;
                }
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
                int length = i3 & (atomicReferenceArray.length() - 1);
                C11928d dVar = (C11928d) atomicReferenceArray.get(length);
                C11928d dVar2 = dVar;
                while (dVar2 != null) {
                    Object d = dVar2.mo29495d();
                    if (dVar2.mo29494c() != i3 || d == null || !this.f31758a.f31696f.mo29384a(k, d)) {
                        dVar2 = dVar2.mo29492b();
                    } else {
                        C11922u a2 = dVar2.mo29488a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            this.f31761d++;
                            if (a2.mo29455c()) {
                                m34833a(k, i, v2, a2.mo29452a(), RemovalCause.COLLECTED);
                                m34832a(dVar2, k, v, a);
                                i2 = this.f31759b;
                            } else {
                                m34832a(dVar2, k, v, a);
                                i2 = this.f31759b + 1;
                            }
                            this.f31759b = i2;
                            m34830a(dVar2);
                            return null;
                        } else if (z) {
                            m34843c(dVar2, a);
                            unlock();
                            m34855m();
                            return v2;
                        } else {
                            this.f31761d++;
                            m34833a(k, i, v2, a2.mo29452a(), RemovalCause.REPLACED);
                            m34832a(dVar2, k, v, a);
                            m34830a(dVar2);
                            unlock();
                            m34855m();
                            return v2;
                        }
                    }
                }
                this.f31761d++;
                C11928d a3 = m34827a(k, i3, dVar);
                m34832a(a3, k, v, a);
                atomicReferenceArray.set(length, a3);
                this.f31759b++;
                m34830a(a3);
                unlock();
                m34855m();
                return null;
            } finally {
                unlock();
                m34855m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo29528a(K k, int i, V v, V v2) {
            int i2 = i;
            lock();
            try {
                long a = this.f31758a.f31707q.mo29396a();
                m34842c(a);
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C11928d dVar = (C11928d) atomicReferenceArray.get(length);
                for (C11928d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo29492b()) {
                    Object d = dVar2.mo29495d();
                    if (dVar2.mo29494c() != i2 || d == null) {
                        K k2 = k;
                    } else if (this.f31758a.f31696f.mo29384a(k, d)) {
                        C11922u a2 = dVar2.mo29488a();
                        Object obj = a2.get();
                        if (obj == null) {
                            if (a2.mo29455c()) {
                                int i3 = this.f31759b;
                                this.f31761d++;
                                C11928d a3 = m34825a(dVar, dVar2, d, i, obj, a2, RemovalCause.COLLECTED);
                                int i4 = this.f31759b - 1;
                                atomicReferenceArray.set(length, a3);
                                this.f31759b = i4;
                            }
                            return false;
                        } else if (this.f31758a.f31697g.mo29384a(v, obj)) {
                            this.f31761d++;
                            m34833a(k, i, obj, a2.mo29452a(), RemovalCause.REPLACED);
                            m34832a(dVar2, k, v2, a);
                            m34830a(dVar2);
                            unlock();
                            m34855m();
                            return true;
                        } else {
                            m34843c(dVar2, a);
                            unlock();
                            m34855m();
                            return false;
                        }
                    }
                    V v3 = v;
                }
                unlock();
                m34855m();
                return false;
            } finally {
                unlock();
                m34855m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo29523a(K k, int i, V v) {
            int i2 = i;
            lock();
            try {
                long a = this.f31758a.f31707q.mo29396a();
                m34842c(a);
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C11928d dVar = (C11928d) atomicReferenceArray.get(length);
                for (C11928d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.mo29492b()) {
                    Object d = dVar2.mo29495d();
                    if (dVar2.mo29494c() != i2 || d == null) {
                        K k2 = k;
                    } else if (this.f31758a.f31696f.mo29384a(k, d)) {
                        C11922u a2 = dVar2.mo29488a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.mo29455c()) {
                                int i3 = this.f31759b;
                                this.f31761d++;
                                C11928d a3 = m34825a(dVar, dVar2, d, i, v2, a2, RemovalCause.COLLECTED);
                                int i4 = this.f31759b - 1;
                                atomicReferenceArray.set(length, a3);
                                this.f31759b = i4;
                            }
                            return null;
                        }
                        this.f31761d++;
                        m34833a(k, i, v2, a2.mo29452a(), RemovalCause.REPLACED);
                        m34832a(dVar2, k, v, a);
                        m34830a(dVar2);
                        unlock();
                        m34855m();
                        return v2;
                    }
                }
                unlock();
                m34855m();
                return null;
            } finally {
                unlock();
                m34855m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo29525a() {
            RemovalCause removalCause;
            if (this.f31759b != 0) {
                lock();
                try {
                    m34842c(this.f31758a.f31707q.mo29396a());
                    AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (C11928d dVar = (C11928d) atomicReferenceArray.get(i); dVar != null; dVar = dVar.mo29492b()) {
                            if (dVar.mo29488a().mo29455c()) {
                                Object d = dVar.mo29495d();
                                Object obj = dVar.mo29488a().get();
                                if (d != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        m34833a(d, dVar.mo29494c(), obj, dVar.mo29488a().mo29452a(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                m34833a(d, dVar.mo29494c(), obj, dVar.mo29488a().mo29452a(), removalCause);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    m34849g();
                    this.f31769l.clear();
                    this.f31770m.clear();
                    this.f31768k.set(0);
                    this.f31761d++;
                    this.f31759b = 0;
                } finally {
                    unlock();
                    m34855m();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo29526a(C11928d<K, V> dVar, int i) {
            lock();
            try {
                int i2 = this.f31759b;
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C11928d<K, V> dVar2 = (C11928d) atomicReferenceArray.get(length);
                for (C11928d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.mo29492b()) {
                    if (dVar3 == dVar) {
                        this.f31761d++;
                        int i3 = this.f31759b - 1;
                        atomicReferenceArray.set(length, m34825a(dVar2, dVar3, dVar3.mo29495d(), i, dVar3.mo29488a().get(), dVar3.mo29488a(), RemovalCause.COLLECTED));
                        this.f31759b = i3;
                        return true;
                    }
                }
                unlock();
                m34855m();
                return false;
            } finally {
                unlock();
                m34855m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo29527a(K k, int i, C11922u<K, V> uVar) {
            lock();
            try {
                int i2 = this.f31759b;
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C11928d dVar = (C11928d) atomicReferenceArray.get(length);
                C11928d dVar2 = dVar;
                while (dVar2 != null) {
                    Object d = dVar2.mo29495d();
                    if (dVar2.mo29494c() != i || d == null || !this.f31758a.f31696f.mo29384a(k, d)) {
                        dVar2 = dVar2.mo29492b();
                    } else if (dVar2.mo29488a() == uVar) {
                        this.f31761d++;
                        int i3 = this.f31759b - 1;
                        atomicReferenceArray.set(length, m34825a(dVar, dVar2, d, i, uVar.get(), uVar, RemovalCause.COLLECTED));
                        this.f31759b = i3;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            m34855m();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    m34855m();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    m34855m();
                }
            }
        }

        /* renamed from: a */
        private boolean m34835a(C11928d<K, V> dVar, int i, RemovalCause removalCause) {
            int i2 = this.f31759b;
            AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
            int length = (atomicReferenceArray.length() - 1) & i;
            C11928d<K, V> dVar2 = (C11928d) atomicReferenceArray.get(length);
            for (C11928d<K, V> dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.mo29492b()) {
                if (dVar3 == dVar) {
                    this.f31761d++;
                    int i3 = this.f31759b - 1;
                    atomicReferenceArray.set(length, m34825a(dVar2, dVar3, dVar3.mo29495d(), i, dVar3.mo29488a().get(), dVar3.mo29488a(), removalCause));
                    this.f31759b = i3;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        private void m34850h() {
            do {
            } while (this.f31765h.poll() != null);
        }

        /* renamed from: i */
        private void m34851i() {
            do {
            } while (this.f31766i.poll() != null);
        }

        /* renamed from: n */
        private void m34856n() {
            m34846d(this.f31758a.f31707q.mo29396a());
            m34857o();
        }

        /* renamed from: o */
        private void m34857o() {
            if (!isHeldByCurrentThread()) {
                this.f31758a.mo29442l();
            }
        }

        /* renamed from: c */
        private void m34841c() {
            if (tryLock()) {
                try {
                    m34845d();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: d */
        private void m34845d() {
            if (this.f31758a.mo29436g()) {
                m34847e();
            }
            if (this.f31758a.mo29439h()) {
                m34848f();
            }
        }

        /* renamed from: e */
        private void m34847e() {
            int i = 0;
            do {
                Reference poll = this.f31765h.poll();
                if (poll != null) {
                    this.f31758a.mo29424a((C11928d) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: f */
        private void m34848f() {
            int i = 0;
            do {
                Reference poll = this.f31766i.poll();
                if (poll != null) {
                    this.f31758a.mo29423a((C11922u) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: g */
        private void m34849g() {
            if (this.f31758a.mo29436g()) {
                m34850h();
            }
            if (this.f31758a.mo29439h()) {
                m34851i();
            }
        }

        /* renamed from: j */
        private void m34852j() {
            while (true) {
                C11928d dVar = (C11928d) this.f31767j.poll();
                if (dVar == null) {
                    return;
                }
                if (this.f31770m.contains(dVar)) {
                    this.f31770m.add(dVar);
                }
            }
        }

        /* renamed from: k */
        private C11928d<K, V> m34853k() {
            for (C11928d<K, V> dVar : this.f31770m) {
                if (dVar.mo29488a().mo29452a() > 0) {
                    return dVar;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: l */
        private void m34854l() {
            AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f31759b;
                AtomicReferenceArray<C11928d<K, V>> a = m34828a(length << 1);
                this.f31762e = (a.length() * 3) / 4;
                int length2 = a.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C11928d dVar = (C11928d) atomicReferenceArray.get(i2);
                    if (dVar != null) {
                        C11928d b = dVar.mo29492b();
                        int c = dVar.mo29494c() & length2;
                        if (b == null) {
                            a.set(c, dVar);
                        } else {
                            C11928d dVar2 = dVar;
                            while (b != null) {
                                int c2 = b.mo29494c() & length2;
                                if (c2 != c) {
                                    dVar2 = b;
                                    c = c2;
                                }
                                b = b.mo29492b();
                            }
                            a.set(c, dVar2);
                            while (dVar != dVar2) {
                                int c3 = dVar.mo29494c() & length2;
                                C11928d a2 = m34824a(dVar, (C11928d) a.get(c3));
                                if (a2 != null) {
                                    a.set(c3, a2);
                                } else {
                                    m34839b(dVar);
                                    i--;
                                }
                                dVar = dVar.mo29492b();
                            }
                        }
                    }
                }
                this.f31763f = a;
                this.f31759b = i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo29529b() {
            if ((this.f31768k.incrementAndGet() & 63) == 0) {
                m34856n();
            }
        }

        /* renamed from: c */
        private void m34842c(long j) {
            m34846d(j);
        }

        /* renamed from: a */
        private static AtomicReferenceArray<C11928d<K, V>> m34828a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: b */
        private C11928d<K, V> m34836b(int i) {
            AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
            return (C11928d) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: b */
        private void m34839b(C11928d<K, V> dVar) {
            m34833a(dVar.mo29495d(), dVar.mo29494c(), dVar.mo29488a().get(), dVar.mo29488a().mo29452a(), RemovalCause.COLLECTED);
            this.f31769l.remove(dVar);
            this.f31770m.remove(dVar);
        }

        /* renamed from: b */
        private void m34838b(long j) {
            C11928d dVar;
            C11928d dVar2;
            m34852j();
            do {
                dVar = (C11928d) this.f31769l.peek();
                if (dVar == null || !this.f31758a.mo29427b(dVar, j)) {
                    do {
                        dVar2 = (C11928d) this.f31770m.peek();
                        if (dVar2 == null || !this.f31758a.mo29427b(dVar2, j)) {
                            return;
                        }
                    } while (m34835a(dVar2, dVar2.mo29494c(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (m34835a(dVar, dVar.mo29494c(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: d */
        private void m34846d(long j) {
            if (tryLock()) {
                try {
                    m34845d();
                    m34838b(j);
                    this.f31768k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        private void m34829a(long j) {
            if (tryLock()) {
                try {
                    m34838b(j);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        private void m34830a(C11928d<K, V> dVar) {
            if (this.f31758a.mo29425a()) {
                m34852j();
                if (((long) dVar.mo29488a().mo29452a()) <= this.f31764g || m34835a(dVar, dVar.mo29494c(), RemovalCause.SIZE)) {
                    while (this.f31760c > this.f31764g) {
                        C11928d k = m34853k();
                        if (!m34835a(k, k.mo29494c(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        private C11928d<K, V> m34837b(C11928d<K, V> dVar, C11928d<K, V> dVar2) {
            int i = this.f31759b;
            C11928d<K, V> b = dVar2.mo29492b();
            while (dVar != dVar2) {
                C11928d<K, V> a = m34824a(dVar, b);
                if (a != null) {
                    b = a;
                } else {
                    m34839b(dVar);
                    i--;
                }
                dVar = dVar.mo29492b();
            }
            this.f31759b = i;
            return b;
        }

        /* renamed from: a */
        private C11928d<K, V> m34824a(C11928d<K, V> dVar, C11928d<K, V> dVar2) {
            if (dVar.mo29495d() == null) {
                return null;
            }
            C11922u a = dVar.mo29488a();
            Object obj = a.get();
            if (obj == null && a.mo29455c()) {
                return null;
            }
            C11928d<K, V> a2 = this.f31758a.f31708r.mo29508a(this, dVar, dVar2);
            a2.mo29490a(a.mo29453a(this.f31766i, obj, a2));
            return a2;
        }

        /* renamed from: c */
        private void m34843c(C11928d<K, V> dVar, long j) {
            if (this.f31758a.mo29435f()) {
                dVar.mo29489a(j);
            }
            this.f31770m.add(dVar);
        }

        /* renamed from: d */
        private C11928d<K, V> m34844d(Object obj, int i) {
            for (C11928d<K, V> b = m34836b(i); b != null; b = b.mo29492b()) {
                if (b.mo29494c() == i) {
                    Object d = b.mo29495d();
                    if (d == null) {
                        m34841c();
                    } else if (this.f31758a.f31696f.mo29384a(obj, d)) {
                        return b;
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        private void m34840b(C11928d<K, V> dVar, long j) {
            if (this.f31758a.mo29435f()) {
                dVar.mo29489a(j);
            }
            this.f31767j.add(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final V mo29532c(Object obj, int i) {
            RemovalCause removalCause;
            lock();
            try {
                m34842c(this.f31758a.f31707q.mo29396a());
                int i2 = this.f31759b;
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C11928d dVar = (C11928d) atomicReferenceArray.get(length);
                C11928d dVar2 = dVar;
                while (dVar2 != null) {
                    Object d = dVar2.mo29495d();
                    if (dVar2.mo29494c() != i || d == null || !this.f31758a.f31696f.mo29384a(obj, d)) {
                        dVar2 = dVar2.mo29492b();
                    } else {
                        C11922u a = dVar2.mo29488a();
                        V v = a.get();
                        if (v != null) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (a.mo29455c()) {
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            unlock();
                            m34855m();
                            return null;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.f31761d++;
                        int i3 = this.f31759b - 1;
                        atomicReferenceArray.set(length, m34825a(dVar, dVar2, d, i, v, a, removalCause2));
                        this.f31759b = i3;
                        return v;
                    }
                }
                unlock();
                m34855m();
                return null;
            } finally {
                unlock();
                m34855m();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo29530b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f31759b != 0) {
                    C11928d a = m34826a(obj, i, this.f31758a.f31707q.mo29396a());
                    if (a == null) {
                        return false;
                    }
                    if (a.mo29488a().get() != null) {
                        z = true;
                    }
                    mo29529b();
                    return z;
                }
                mo29529b();
                return false;
            } finally {
                mo29529b();
            }
        }

        /* renamed from: a */
        private C11928d<K, V> m34827a(K k, int i, C11928d<K, V> dVar) {
            return this.f31758a.f31708r.mo29509a(this, C11864b.m34655a(k), i, dVar);
        }

        C11910l(C11878c<K, V> cVar, int i, long j) {
            ReferenceQueue<K> referenceQueue;
            Queue<C11928d<K, V>> queue;
            Queue<C11928d<K, V>> queue2;
            Queue<C11928d<K, V>> queue3;
            this.f31758a = cVar;
            this.f31764g = j;
            m34834a(m34828a(i));
            ReferenceQueue<V> referenceQueue2 = null;
            if (cVar.mo29436g()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.f31765h = referenceQueue;
            if (cVar.mo29439h()) {
                referenceQueue2 = new ReferenceQueue<>();
            }
            this.f31766i = referenceQueue2;
            if (cVar.mo29428c()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = C11878c.m34701k();
            }
            this.f31767j = queue;
            if (cVar.mo29432d()) {
                queue2 = new C11886ae<>();
            } else {
                queue2 = C11878c.m34701k();
            }
            this.f31769l = queue2;
            if (cVar.mo29428c()) {
                queue3 = new C11891c<>();
            } else {
                queue3 = C11878c.m34701k();
            }
            this.f31770m = queue3;
        }

        /* renamed from: a */
        private C11928d<K, V> m34826a(Object obj, int i, long j) {
            C11928d<K, V> d = m34844d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.f31758a.mo29427b(d, j)) {
                return d;
            }
            m34829a(j);
            return null;
        }

        /* renamed from: a */
        private void m34831a(C11928d<K, V> dVar, int i, long j) {
            m34852j();
            this.f31760c += (long) i;
            if (this.f31758a.mo29435f()) {
                dVar.mo29489a(j);
            }
            if (this.f31758a.mo29433e()) {
                dVar.mo29467b(j);
            }
            this.f31770m.add(dVar);
            this.f31769l.add(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo29531b(Object obj, int i, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                m34842c(this.f31758a.f31707q.mo29396a());
                int i2 = this.f31759b;
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = this.f31763f;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C11928d dVar = (C11928d) atomicReferenceArray.get(length);
                C11928d dVar2 = dVar;
                while (dVar2 != null) {
                    Object d = dVar2.mo29495d();
                    if (dVar2.mo29494c() != i || d == null || !this.f31758a.f31696f.mo29384a(obj, d)) {
                        dVar2 = dVar2.mo29492b();
                    } else {
                        C11922u a = dVar2.mo29488a();
                        Object obj3 = a.get();
                        if (this.f31758a.f31697g.mo29384a(obj2, obj3)) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (obj3 != null || !a.mo29455c()) {
                            unlock();
                            m34855m();
                            return false;
                        } else {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        this.f31761d++;
                        int i3 = this.f31759b - 1;
                        atomicReferenceArray.set(length, m34825a(dVar, dVar2, d, i, obj3, a, removalCause));
                        this.f31759b = i3;
                        if (removalCause != RemovalCause.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                m34855m();
                return false;
            } finally {
                unlock();
                m34855m();
            }
        }

        /* renamed from: a */
        private void m34832a(C11928d<K, V> dVar, K k, V v, long j) {
            dVar.mo29488a();
            C11864b.m34659b(true, "Weights must be non-negative");
            dVar.mo29490a(this.f31758a.f31699i.mo29534a(this, dVar, v, 1));
            m34831a(dVar, 1, j);
        }

        /* renamed from: a */
        private C11928d<K, V> m34825a(C11928d<K, V> dVar, C11928d<K, V> dVar2, K k, int i, V v, C11922u<K, V> uVar, RemovalCause removalCause) {
            m34833a(k, i, v, uVar.mo29452a(), removalCause);
            this.f31769l.remove(dVar2);
            this.f31770m.remove(dVar2);
            return m34837b(dVar, dVar2);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$m */
    static class C11911m<K, V> extends SoftReference<V> implements C11922u<K, V> {

        /* renamed from: a */
        final C11928d<K, V> f31771a;

        /* renamed from: a */
        public int mo29452a() {
            return 1;
        }

        /* renamed from: b */
        public final C11928d<K, V> mo29454b() {
            return this.f31771a;
        }

        /* renamed from: c */
        public final boolean mo29455c() {
            return true;
        }

        C11911m(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar) {
            super(v, referenceQueue);
            this.f31771a = dVar;
        }

        /* renamed from: a */
        public C11922u<K, V> mo29453a(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar) {
            return new C11911m(referenceQueue, v, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$n */
    enum C11912n {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Equivalence<Object> mo29533a() {
                return Equivalence.m34636a();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11922u<K, V> mo29534a(C11910l<K, V> lVar, C11928d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new C11919r(v);
                }
                return new C11884ac(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Equivalence<Object> mo29533a() {
                return Equivalence.m34637b();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11922u<K, V> mo29534a(C11910l<K, V> lVar, C11928d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new C11911m(lVar.f31766i, v, dVar);
                }
                return new C11883ab(lVar.f31766i, v, dVar, i);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Equivalence<Object> mo29533a() {
                return Equivalence.m34637b();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> C11922u<K, V> mo29534a(C11910l<K, V> lVar, C11928d<K, V> dVar, V v, int i) {
                if (i == 1) {
                    return new C11927z(lVar.f31766i, v, dVar);
                }
                return new C11885ad(lVar.f31766i, v, dVar, i);
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Equivalence<Object> mo29533a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K, V> C11922u<K, V> mo29534a(C11910l<K, V> lVar, C11928d<K, V> dVar, V v, int i);
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$o */
    static final class C11916o<K, V> extends C11918q<K, V> {

        /* renamed from: a */
        volatile long f31776a = Long.MAX_VALUE;

        /* renamed from: b */
        C11928d<K, V> f31777b = C11878c.m34700j();

        /* renamed from: c */
        C11928d<K, V> f31778c = C11878c.m34700j();

        /* renamed from: e */
        public final long mo29496e() {
            return this.f31776a;
        }

        /* renamed from: f */
        public final C11928d<K, V> mo29497f() {
            return this.f31777b;
        }

        /* renamed from: g */
        public final C11928d<K, V> mo29498g() {
            return this.f31778c;
        }

        /* renamed from: a */
        public final void mo29489a(long j) {
            this.f31776a = j;
        }

        /* renamed from: b */
        public final void mo29493b(C11928d<K, V> dVar) {
            this.f31778c = dVar;
        }

        /* renamed from: a */
        public final void mo29491a(C11928d<K, V> dVar) {
            this.f31777b = dVar;
        }

        C11916o(K k, int i, C11928d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$p */
    static final class C11917p<K, V> extends C11918q<K, V> {

        /* renamed from: a */
        volatile long f31779a = Long.MAX_VALUE;

        /* renamed from: b */
        C11928d<K, V> f31780b = C11878c.m34700j();

        /* renamed from: c */
        C11928d<K, V> f31781c = C11878c.m34700j();

        /* renamed from: d */
        volatile long f31782d = Long.MAX_VALUE;

        /* renamed from: e */
        C11928d<K, V> f31783e = C11878c.m34700j();

        /* renamed from: f */
        C11928d<K, V> f31784f = C11878c.m34700j();

        /* renamed from: e */
        public final long mo29496e() {
            return this.f31779a;
        }

        /* renamed from: f */
        public final C11928d<K, V> mo29497f() {
            return this.f31780b;
        }

        /* renamed from: g */
        public final C11928d<K, V> mo29498g() {
            return this.f31781c;
        }

        /* renamed from: h */
        public final long mo29470h() {
            return this.f31782d;
        }

        /* renamed from: i */
        public final C11928d<K, V> mo29471i() {
            return this.f31783e;
        }

        /* renamed from: j */
        public final C11928d<K, V> mo29472j() {
            return this.f31784f;
        }

        /* renamed from: a */
        public final void mo29489a(long j) {
            this.f31779a = j;
        }

        /* renamed from: b */
        public final void mo29467b(long j) {
            this.f31782d = j;
        }

        /* renamed from: c */
        public final void mo29468c(C11928d<K, V> dVar) {
            this.f31783e = dVar;
        }

        /* renamed from: d */
        public final void mo29469d(C11928d<K, V> dVar) {
            this.f31784f = dVar;
        }

        /* renamed from: a */
        public final void mo29491a(C11928d<K, V> dVar) {
            this.f31780b = dVar;
        }

        /* renamed from: b */
        public final void mo29493b(C11928d<K, V> dVar) {
            this.f31781c = dVar;
        }

        C11917p(K k, int i, C11928d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$q */
    static class C11918q<K, V> extends C11890b<K, V> {

        /* renamed from: g */
        final K f31785g;

        /* renamed from: h */
        final int f31786h;

        /* renamed from: i */
        final C11928d<K, V> f31787i;

        /* renamed from: j */
        volatile C11922u<K, V> f31788j = C11878c.m34699i();

        /* renamed from: a */
        public final C11922u<K, V> mo29488a() {
            return this.f31788j;
        }

        /* renamed from: b */
        public final C11928d<K, V> mo29492b() {
            return this.f31787i;
        }

        /* renamed from: c */
        public final int mo29494c() {
            return this.f31786h;
        }

        /* renamed from: d */
        public final K mo29495d() {
            return this.f31785g;
        }

        /* renamed from: a */
        public final void mo29490a(C11922u<K, V> uVar) {
            this.f31788j = uVar;
        }

        C11918q(K k, int i, C11928d<K, V> dVar) {
            this.f31785g = k;
            this.f31786h = i;
            this.f31787i = dVar;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$r */
    static class C11919r<K, V> implements C11922u<K, V> {

        /* renamed from: a */
        final V f31789a;

        /* renamed from: a */
        public int mo29452a() {
            return 1;
        }

        /* renamed from: a */
        public final C11922u<K, V> mo29453a(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar) {
            return this;
        }

        /* renamed from: b */
        public final C11928d<K, V> mo29454b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo29455c() {
            return true;
        }

        public V get() {
            return this.f31789a;
        }

        C11919r(V v) {
            this.f31789a = v;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$s */
    static final class C11920s<K, V> extends C11918q<K, V> {

        /* renamed from: a */
        volatile long f31790a = Long.MAX_VALUE;

        /* renamed from: b */
        C11928d<K, V> f31791b = C11878c.m34700j();

        /* renamed from: c */
        C11928d<K, V> f31792c = C11878c.m34700j();

        /* renamed from: h */
        public final long mo29470h() {
            return this.f31790a;
        }

        /* renamed from: i */
        public final C11928d<K, V> mo29471i() {
            return this.f31791b;
        }

        /* renamed from: j */
        public final C11928d<K, V> mo29472j() {
            return this.f31792c;
        }

        /* renamed from: b */
        public final void mo29467b(long j) {
            this.f31790a = j;
        }

        /* renamed from: c */
        public final void mo29468c(C11928d<K, V> dVar) {
            this.f31791b = dVar;
        }

        /* renamed from: d */
        public final void mo29469d(C11928d<K, V> dVar) {
            this.f31792c = dVar;
        }

        C11920s(K k, int i, C11928d<K, V> dVar) {
            super(k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$t */
    final class C11921t extends C11905g<V> {
        public final V next() {
            return mo29514a().getValue();
        }

        C11921t() {
            super();
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$u */
    interface C11922u<K, V> {
        /* renamed from: a */
        int mo29452a();

        /* renamed from: a */
        C11922u<K, V> mo29453a(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar);

        /* renamed from: b */
        C11928d<K, V> mo29454b();

        /* renamed from: c */
        boolean mo29455c();

        V get();
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$v */
    final class C11923v extends AbstractCollection<V> {

        /* renamed from: b */
        private final ConcurrentMap<?, ?> f31795b;

        public final void clear() {
            this.f31795b.clear();
        }

        public final boolean isEmpty() {
            return this.f31795b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C11921t();
        }

        public final int size() {
            return this.f31795b.size();
        }

        public final Object[] toArray() {
            return C11878c.m34691a((Collection<E>) this).toArray();
        }

        public final boolean contains(Object obj) {
            return this.f31795b.containsValue(obj);
        }

        public final <E> E[] toArray(E[] eArr) {
            return C11878c.m34691a((Collection<E>) this).toArray(eArr);
        }

        C11923v(ConcurrentMap<?, ?> concurrentMap) {
            this.f31795b = concurrentMap;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$w */
    static final class C11924w<K, V> extends C11926y<K, V> {

        /* renamed from: a */
        volatile long f31796a = Long.MAX_VALUE;

        /* renamed from: b */
        C11928d<K, V> f31797b = C11878c.m34700j();

        /* renamed from: c */
        C11928d<K, V> f31798c = C11878c.m34700j();

        /* renamed from: e */
        public final long mo29496e() {
            return this.f31796a;
        }

        /* renamed from: f */
        public final C11928d<K, V> mo29497f() {
            return this.f31797b;
        }

        /* renamed from: g */
        public final C11928d<K, V> mo29498g() {
            return this.f31798c;
        }

        /* renamed from: a */
        public final void mo29489a(long j) {
            this.f31796a = j;
        }

        /* renamed from: b */
        public final void mo29493b(C11928d<K, V> dVar) {
            this.f31798c = dVar;
        }

        /* renamed from: a */
        public final void mo29491a(C11928d<K, V> dVar) {
            this.f31797b = dVar;
        }

        C11924w(ReferenceQueue<K> referenceQueue, K k, int i, C11928d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$x */
    static final class C11925x<K, V> extends C11926y<K, V> {

        /* renamed from: a */
        volatile long f31799a = Long.MAX_VALUE;

        /* renamed from: b */
        C11928d<K, V> f31800b = C11878c.m34700j();

        /* renamed from: c */
        C11928d<K, V> f31801c = C11878c.m34700j();

        /* renamed from: d */
        volatile long f31802d = Long.MAX_VALUE;

        /* renamed from: e */
        C11928d<K, V> f31803e = C11878c.m34700j();

        /* renamed from: f */
        C11928d<K, V> f31804f = C11878c.m34700j();

        /* renamed from: e */
        public final long mo29496e() {
            return this.f31799a;
        }

        /* renamed from: f */
        public final C11928d<K, V> mo29497f() {
            return this.f31800b;
        }

        /* renamed from: g */
        public final C11928d<K, V> mo29498g() {
            return this.f31801c;
        }

        /* renamed from: h */
        public final long mo29470h() {
            return this.f31802d;
        }

        /* renamed from: i */
        public final C11928d<K, V> mo29471i() {
            return this.f31803e;
        }

        /* renamed from: j */
        public final C11928d<K, V> mo29472j() {
            return this.f31804f;
        }

        /* renamed from: a */
        public final void mo29489a(long j) {
            this.f31799a = j;
        }

        /* renamed from: b */
        public final void mo29467b(long j) {
            this.f31802d = j;
        }

        /* renamed from: c */
        public final void mo29468c(C11928d<K, V> dVar) {
            this.f31803e = dVar;
        }

        /* renamed from: d */
        public final void mo29469d(C11928d<K, V> dVar) {
            this.f31804f = dVar;
        }

        /* renamed from: a */
        public final void mo29491a(C11928d<K, V> dVar) {
            this.f31800b = dVar;
        }

        /* renamed from: b */
        public final void mo29493b(C11928d<K, V> dVar) {
            this.f31801c = dVar;
        }

        C11925x(ReferenceQueue<K> referenceQueue, K k, int i, C11928d<K, V> dVar) {
            super(referenceQueue, k, i, dVar);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$y */
    static class C11926y<K, V> extends WeakReference<K> implements C11928d<K, V> {

        /* renamed from: g */
        final int f31805g;

        /* renamed from: h */
        final C11928d<K, V> f31806h;

        /* renamed from: i */
        volatile C11922u<K, V> f31807i = C11878c.m34699i();

        /* renamed from: a */
        public final C11922u<K, V> mo29488a() {
            return this.f31807i;
        }

        /* renamed from: b */
        public final C11928d<K, V> mo29492b() {
            return this.f31806h;
        }

        /* renamed from: c */
        public final int mo29494c() {
            return this.f31805g;
        }

        /* renamed from: d */
        public final K mo29495d() {
            return get();
        }

        /* renamed from: e */
        public long mo29496e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C11928d<K, V> mo29497f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C11928d<K, V> mo29498g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo29470h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C11928d<K, V> mo29471i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C11928d<K, V> mo29472j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo29489a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo29467b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo29468c(C11928d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final void mo29490a(C11922u<K, V> uVar) {
            this.f31807i = uVar;
        }

        /* renamed from: b */
        public void mo29493b(C11928d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo29469d(C11928d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo29491a(C11928d<K, V> dVar) {
            throw new UnsupportedOperationException();
        }

        C11926y(ReferenceQueue<K> referenceQueue, K k, int i, C11928d<K, V> dVar) {
            super(k, referenceQueue);
            this.f31805g = i;
            this.f31806h = dVar;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.c$z */
    static class C11927z<K, V> extends WeakReference<V> implements C11922u<K, V> {

        /* renamed from: a */
        final C11928d<K, V> f31808a;

        /* renamed from: a */
        public int mo29452a() {
            return 1;
        }

        /* renamed from: b */
        public final C11928d<K, V> mo29454b() {
            return this.f31808a;
        }

        /* renamed from: c */
        public final boolean mo29455c() {
            return true;
        }

        C11927z(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar) {
            super(v, referenceQueue);
            this.f31808a = dVar;
        }

        /* renamed from: a */
        public C11922u<K, V> mo29453a(ReferenceQueue<V> referenceQueue, V v, C11928d<K, V> dVar) {
            return new C11927z(referenceQueue, v, dVar);
        }
    }

    /* renamed from: a */
    private static int m34689a(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: i */
    static <K, V> C11922u<K, V> m34699i() {
        return f31690s;
    }

    /* renamed from: j */
    static <K, V> C11928d<K, V> m34700j() {
        return C11909k.INSTANCE;
    }

    /* renamed from: k */
    static <E> Queue<E> m34701k() {
        return f31691t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo29432d() {
        return m34702m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo29435f() {
        return m34703n();
    }

    /* renamed from: m */
    private boolean m34702m() {
        if (this.f31703m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m34703n() {
        if (this.f31702l > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m34704o() {
        if (this.f31704n > 0) {
            return true;
        }
        return false;
    }

    public void clear() {
        for (C11910l<K, V> a : this.f31694d) {
            a.mo29525a();
        }
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f31711w;
        if (set != null) {
            return set;
        }
        C11904f fVar = new C11904f(this);
        this.f31711w = fVar;
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo29436g() {
        if (this.f31698h != C11912n.STRONG) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo29439h() {
        if (this.f31699i != C11912n.STRONG) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.f31709u;
        if (set != null) {
            return set;
        }
        C11907i iVar = new C11907i(this);
        this.f31709u = iVar;
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo29442l() {
        do {
        } while (((RemovalNotification) this.f31705o.poll()) != null);
    }

    public int size() {
        return C11856a.m34635a(m34708s());
    }

    public Collection<V> values() {
        Collection<V> collection = this.f31710v;
        if (collection != null) {
            return collection;
        }
        C11923v vVar = new C11923v(this);
        this.f31710v = vVar;
        return vVar;
    }

    /* renamed from: p */
    private boolean m34705p() {
        if (mo29433e() || mo29435f()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m34706q() {
        if (mo29432d() || mo29433e()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m34707r() {
        if (mo29428c() || mo29435f()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private long m34708s() {
        long j = 0;
        for (C11910l<K, V> lVar : this.f31694d) {
            j += (long) Math.max(0, lVar.f31759b);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo29428c() {
        if (m34703n() || mo29425a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo29433e() {
        if (m34702m() || m34704o()) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        C11910l<K, V>[] lVarArr = this.f31694d;
        long j = 0;
        for (int i = 0; i < lVarArr.length; i++) {
            if (lVarArr[i].f31759b != 0) {
                return false;
            }
            j += (long) lVarArr[i].f31761d;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < lVarArr.length; i2++) {
                if (lVarArr[i2].f31759b != 0) {
                    return false;
                }
                j -= (long) lVarArr[i2].f31761d;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo29426b() {
        if (this.f31701k != C11877b.INSTANCE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo29425a() {
        if (this.f31700j >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static C11910l<K, V>[] m34698c(int i) {
        return new C11910l[i];
    }

    /* renamed from: b */
    private int m34693b(Object obj) {
        return m34689a(this.f31696f.mo29383a(obj));
    }

    /* renamed from: c */
    static <K, V> void m34697c(C11928d<K, V> dVar) {
        C11928d j = m34700j();
        dVar.mo29468c(j);
        dVar.mo29469d(j);
    }

    /* renamed from: b */
    private C11910l<K, V> m34694b(int i) {
        return this.f31694d[(i >>> this.f31693c) & this.f31692b];
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int b = m34693b(obj);
        return m34694b(b).mo29530b(obj, b);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int b = m34693b(obj);
        return m34694b(b).mo29522a(obj, b);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int b = m34693b(obj);
        return m34694b(b).mo29532c(obj, b);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m34691a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C11855b.m34634a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: b */
    static <K, V> void m34695b(C11928d<K, V> dVar) {
        C11928d j = m34700j();
        dVar.mo29491a(j);
        dVar.mo29493b(j);
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
        long a = this.f31707q.mo29396a();
        C11910l<K, V>[] lVarArr = this.f31694d;
        long j2 = -1;
        int i = 0;
        while (i < 3) {
            int length = lVarArr.length;
            long j3 = 0;
            int i2 = 0;
            while (i2 < length) {
                C11910l<K, V> lVar = lVarArr[i2];
                int i3 = lVar.f31759b;
                AtomicReferenceArray<C11928d<K, V>> atomicReferenceArray = lVar.f31763f;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    C11928d dVar = (C11928d) atomicReferenceArray.get(i4);
                    while (dVar != null) {
                        C11910l<K, V>[] lVarArr2 = lVarArr;
                        Object a2 = lVar.mo29521a(dVar, a);
                        if (a2 != null) {
                            j = a;
                            if (this.f31697g.mo29384a(obj2, a2)) {
                                return true;
                            }
                        } else {
                            j = a;
                        }
                        dVar = dVar.mo29492b();
                        lVarArr = lVarArr2;
                        a = j;
                    }
                    long j4 = a;
                    C11910l<K, V>[] lVarArr3 = lVarArr;
                }
                C11910l<K, V>[] lVarArr4 = lVarArr;
                j3 += (long) lVar.f31761d;
                i2++;
                a = a;
            }
            long j5 = a;
            C11910l<K, V>[] lVarArr5 = lVarArr;
            if (j3 == j2) {
                break;
            }
            i++;
            j2 = j3;
            lVarArr = lVarArr5;
            a = j5;
        }
        return false;
    }

    /* renamed from: a */
    public final V mo29422a(Object obj) {
        int b = m34693b(C11864b.m34655a(obj));
        return m34694b(b).mo29522a(obj, b);
    }

    C11878c(C11874b<? super K, ? super V> bVar) {
        Queue<RemovalNotification<K, V>> queue;
        this.f31695e = Math.min(bVar.mo29410e(), 65536);
        this.f31698h = bVar.mo29413h();
        this.f31699i = bVar.mo29414i();
        this.f31696f = bVar.mo29407b();
        this.f31697g = bVar.mo29408c();
        this.f31700j = bVar.mo29411f();
        this.f31701k = bVar.mo29412g();
        this.f31702l = bVar.mo29416k();
        this.f31703m = bVar.mo29415j();
        this.f31704n = bVar.mo29417l();
        this.f31706p = bVar.mo29418m();
        if (this.f31706p == C11876a.INSTANCE) {
            queue = m34701k();
        } else {
            queue = new ConcurrentLinkedQueue<>();
        }
        this.f31705o = queue;
        this.f31707q = bVar.mo29405a(m34705p());
        this.f31708r = C11894d.m34777a(this.f31698h, m34707r(), m34706q());
        int min = Math.min(bVar.mo29409d(), 1073741824);
        if (mo29425a() && !mo29426b()) {
            min = (int) Math.min((long) min, this.f31700j);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f31695e && (!mo29425a() || ((long) (i3 * 20)) <= this.f31700j)) {
            i4++;
            i3 <<= 1;
        }
        this.f31693c = 32 - i4;
        this.f31692b = i3 - 1;
        this.f31694d = m34698c(i3);
        int i5 = min / i3;
        if (i5 * i3 < min) {
            i5++;
        }
        while (i2 < i5) {
            i2 <<= 1;
        }
        if (mo29425a()) {
            long j = (long) i3;
            long j2 = (this.f31700j / j) + 1;
            long j3 = this.f31700j % j;
            while (i < this.f31694d.length) {
                if (((long) i) == j3) {
                    j2--;
                }
                this.f31694d[i] = m34690a(i2, j2);
                i++;
            }
            return;
        }
        while (i < this.f31694d.length) {
            this.f31694d[i] = m34690a(i2, -1);
            i++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29423a(C11922u<K, V> uVar) {
        C11928d b = uVar.mo29454b();
        int c = b.mo29494c();
        m34694b(c).mo29527a(b.mo29495d(), c, uVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29424a(C11928d<K, V> dVar) {
        int c = dVar.mo29494c();
        m34694b(c).mo29526a(dVar, c);
    }

    /* renamed from: a */
    private C11910l<K, V> m34690a(int i, long j) {
        return new C11910l<>(this, i, j);
    }

    /* renamed from: b */
    static <K, V> void m34696b(C11928d<K, V> dVar, C11928d<K, V> dVar2) {
        dVar.mo29468c(dVar2);
        dVar2.mo29469d(dVar);
    }

    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    /* renamed from: a */
    static <K, V> void m34692a(C11928d<K, V> dVar, C11928d<K, V> dVar2) {
        dVar.mo29491a(dVar2);
        dVar2.mo29493b(dVar);
    }

    public V put(K k, V v) {
        C11864b.m34655a(k);
        C11864b.m34655a(v);
        int b = m34693b((Object) k);
        return m34694b(b).mo29524a(k, b, v, false);
    }

    public V putIfAbsent(K k, V v) {
        C11864b.m34655a(k);
        C11864b.m34655a(v);
        int b = m34693b((Object) k);
        return m34694b(b).mo29524a(k, b, v, true);
    }

    public V replace(K k, V v) {
        C11864b.m34655a(k);
        C11864b.m34655a(v);
        int b = m34693b((Object) k);
        return m34694b(b).mo29523a(k, b, v);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int b = m34693b(obj);
        return m34694b(b).mo29531b(obj, b, obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final V mo29421a(C11928d<K, V> dVar, long j) {
        if (dVar.mo29495d() == null) {
            return null;
        }
        V v = dVar.mo29488a().get();
        if (v != null && !mo29427b(dVar, j)) {
            return v;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo29427b(C11928d<K, V> dVar, long j) {
        C11864b.m34655a(dVar);
        if (m34703n() && j - dVar.mo29496e() >= this.f31702l) {
            return true;
        }
        if (!m34702m() || j - dVar.mo29470h() < this.f31703m) {
            return false;
        }
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        C11864b.m34655a(k);
        C11864b.m34655a(v2);
        if (v == null) {
            return false;
        }
        int b = m34693b((Object) k);
        return m34694b(b).mo29528a(k, b, v, v2);
    }
}
