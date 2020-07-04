package com.google.common.collect;

import com.google.common.base.C17430i;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.C17441o;
import com.google.common.collect.C17882cb.C17883a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.am */
class C17728am<K, V> extends C18028h<K, V> implements C17739ao<K, V> {

    /* renamed from: a */
    final C17862by<K, V> f48964a;

    /* renamed from: b */
    final C17440n<? super Entry<K, V>> f48965b;

    /* renamed from: com.google.common.collect.am$a */
    class C17729a extends C17861k<K, Collection<V>> {

        /* renamed from: com.google.common.collect.am$a$a */
        class C17730a extends C17852c<K, Collection<V>> {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Map<K, Collection<V>> mo45869a() {
                return C17729a.this;
            }

            public final Iterator<Entry<K, Collection<V>>> iterator() {
                return new C17870c<Entry<K, Collection<V>>>() {

                    /* renamed from: a */
                    final Iterator<Entry<K, Collection<V>>> f48968a = C17728am.this.f48964a.asMap().entrySet().iterator();

                    /* access modifiers changed from: private */
                    /* renamed from: c */
                    public Entry<K, Collection<V>> mo45252a() {
                        while (this.f48968a.hasNext()) {
                            Entry entry = (Entry) this.f48968a.next();
                            Object key = entry.getKey();
                            Collection a = C17728am.m59011a((Collection) entry.getValue(), (C17440n<? super E>) new C17737c<Object>(key));
                            if (!a.isEmpty()) {
                                return C17839bx.m59337a(key, a);
                            }
                        }
                        mo46191b();
                        return null;
                    }
                };
            }

            public final int size() {
                return C17782br.m59118b(iterator());
            }

            C17730a() {
            }

            public final boolean removeAll(Collection<?> collection) {
                return C17728am.this.mo45858a(C17441o.m57993a(collection));
            }

            public final boolean retainAll(Collection<?> collection) {
                return C17728am.this.mo45858a(C17441o.m57989a(C17441o.m57993a(collection)));
            }
        }

        /* renamed from: com.google.common.collect.am$a$b */
        class C17732b extends C17856f<K, Collection<V>> {
            C17732b() {
                super(C17729a.this);
            }

            public final boolean remove(Object obj) {
                if (C17729a.this.remove(obj) != null) {
                    return true;
                }
                return false;
            }

            public final boolean removeAll(Collection<?> collection) {
                return C17728am.this.mo45858a(C17839bx.m59327a(C17441o.m57993a(collection)));
            }

            public final boolean retainAll(Collection<?> collection) {
                return C17728am.this.mo45858a(C17839bx.m59327a(C17441o.m57989a(C17441o.m57993a(collection))));
            }
        }

        /* renamed from: com.google.common.collect.am$a$c */
        class C17733c extends C17860j<K, Collection<V>> {
            C17733c() {
                super(C17729a.this);
            }

            public final boolean removeAll(Collection<?> collection) {
                return C17728am.this.mo45858a(C17839bx.m59344b(C17441o.m57993a(collection)));
            }

            public final boolean retainAll(Collection<?> collection) {
                return C17728am.this.mo45858a(C17839bx.m59344b(C17441o.m57989a(C17441o.m57993a(collection))));
            }

            public final boolean remove(Object obj) {
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    Iterator it = C17728am.this.f48964a.asMap().entrySet().iterator();
                    while (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        Collection a = C17728am.m59011a((Collection) entry.getValue(), (C17440n<? super E>) new C17737c<Object>(entry.getKey()));
                        if (!a.isEmpty() && collection.equals(a)) {
                            if (a.size() == ((Collection) entry.getValue()).size()) {
                                it.remove();
                            } else {
                                a.clear();
                            }
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: Q_ */
        public final Collection<Collection<V>> mo45861Q_() {
            return new C17733c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Set<Entry<K, Collection<V>>> mo45863a() {
            return new C17730a();
        }

        public final void clear() {
            C17728am.this.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final Set<K> mo45866e() {
            return new C17732b();
        }

        C17729a() {
        }

        public final boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C17728am.this.f48964a.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> a = C17728am.m59011a(collection, (C17440n<? super E>) new C17737c<Object>(obj));
            if (a.isEmpty()) {
                return null;
            }
            return a;
        }

        /* renamed from: a */
        public final Collection<V> remove(Object obj) {
            Collection collection = (Collection) C17728am.this.f48964a.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList a = C17795bu.m59142a();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C17728am.this.mo45859a(obj, next)) {
                    it.remove();
                    a.add(next);
                }
            }
            if (a.isEmpty()) {
                return null;
            }
            if (C17728am.this.f48964a instanceof C17932da) {
                return Collections.unmodifiableSet(C17933db.m59567a((Iterable<? extends E>) a));
            }
            return Collections.unmodifiableList(a);
        }
    }

    /* renamed from: com.google.common.collect.am$b */
    class C17734b extends C17879d<K, V> {
        public final Set<C17883a<K>> entrySet() {
            return new C17888c<K>() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final C17882cb<K> mo45256a() {
                    return C17734b.this;
                }

                public final Iterator<C17883a<K>> iterator() {
                    return C17734b.this.entryIterator();
                }

                public final int size() {
                    return C17728am.this.keySet().size();
                }

                /* renamed from: a */
                private boolean m59025a(final C17440n<? super C17883a<K>> nVar) {
                    return C17728am.this.mo45858a(new C17440n<Entry<K, Collection<V>>>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public boolean apply(Entry<K, Collection<V>> entry) {
                            return nVar.apply(C17884cc.m59424a(entry.getKey(), ((Collection) entry.getValue()).size()));
                        }
                    });
                }

                public final boolean removeAll(Collection<?> collection) {
                    return m59025a(C17441o.m57993a(collection));
                }

                public final boolean retainAll(Collection<?> collection) {
                    return m59025a(C17441o.m57989a(C17441o.m57993a(collection)));
                }
            };
        }

        C17734b() {
            super(C17728am.this);
        }

        public final int remove(Object obj, int i) {
            C18053v.m59700a(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) C17728am.this.f48964a.asMap().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (C17728am.this.mo45859a(obj, it.next())) {
                    i2++;
                    if (i2 <= i) {
                        it.remove();
                    }
                }
            }
            return i2;
        }
    }

    /* renamed from: com.google.common.collect.am$c */
    final class C17737c implements C17440n<V> {

        /* renamed from: b */
        private final K f48977b;

        public final boolean apply(V v) {
            return C17728am.this.mo45859a(this.f48977b, v);
        }

        C17737c(K k) {
            this.f48977b = k;
        }
    }

    /* renamed from: a */
    public C17862by<K, V> mo45857a() {
        return this.f48964a;
    }

    /* renamed from: b */
    public final C17440n<? super Entry<K, V>> mo45860b() {
        return this.f48965b;
    }

    public void clear() {
        entries().clear();
    }

    /* access modifiers changed from: 0000 */
    public Map<K, Collection<V>> createAsMap() {
        return new C17729a();
    }

    /* access modifiers changed from: 0000 */
    public C17882cb<K> createKeys() {
        return new C17734b();
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> createValues() {
        return new C17740ap(this);
    }

    /* access modifiers changed from: 0000 */
    public Iterator<Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: c */
    private Collection<V> mo45880c() {
        if (this.f48964a instanceof C17932da) {
            return Collections.emptySet();
        }
        return Collections.emptyList();
    }

    /* access modifiers changed from: 0000 */
    public Collection<Entry<K, V>> createEntries() {
        return m59011a(this.f48964a.entries(), this.f48965b);
    }

    /* access modifiers changed from: 0000 */
    public Set<K> createKeySet() {
        return asMap().keySet();
    }

    public int size() {
        return entries().size();
    }

    public boolean containsKey(Object obj) {
        if (asMap().get(obj) != null) {
            return true;
        }
        return false;
    }

    public Collection<V> get(K k) {
        return m59011a(this.f48964a.get(k), (C17440n<? super E>) new C17737c<Object>(k));
    }

    public Collection<V> removeAll(Object obj) {
        return (Collection) C17430i.m57945a(asMap().remove(obj), mo45880c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo45858a(C17440n<? super Entry<K, Collection<V>>> nVar) {
        Iterator it = this.f48964a.asMap().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Object key = entry.getKey();
            Collection a = m59011a((Collection) entry.getValue(), (C17440n<? super E>) new C17737c<Object>(key));
            if (!a.isEmpty() && nVar.apply(C17839bx.m59337a(key, a))) {
                if (a.size() == ((Collection) entry.getValue()).size()) {
                    it.remove();
                } else {
                    a.clear();
                }
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    static <E> Collection<E> m59011a(Collection<E> collection, C17440n<? super E> nVar) {
        if (collection instanceof Set) {
            return C17933db.m59569a((Set) collection, nVar);
        }
        return C18054w.m59709a(collection, nVar);
    }

    C17728am(C17862by<K, V> byVar, C17440n<? super Entry<K, V>> nVar) {
        this.f48964a = (C17862by) C17439m.m57962a(byVar);
        this.f48965b = (C17440n) C17439m.m57962a(nVar);
    }

    /* renamed from: a */
    public final boolean mo45859a(K k, V v) {
        return this.f48965b.apply(C17839bx.m59337a(k, v));
    }
}
