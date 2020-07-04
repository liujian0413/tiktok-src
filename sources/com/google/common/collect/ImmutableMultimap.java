package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class ImmutableMultimap<K, V> extends C18028h<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;

    /* renamed from: com.google.common.collect.ImmutableMultimap$a */
    public static class C17600a<K, V> {

        /* renamed from: a */
        Map<K, Collection<V>> f48706a = C17898cj.m59506a();

        /* renamed from: b */
        Comparator<? super K> f48707b;

        /* renamed from: c */
        Comparator<? super V> f48708c;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Collection<V> mo45475c() {
            return new ArrayList();
        }

        /* renamed from: b */
        public ImmutableMultimap<K, V> mo45433b() {
            Collection entrySet = this.f48706a.entrySet();
            if (this.f48707b != null) {
                entrySet = C17896ch.m59496a(this.f48707b).mo46251c().mo46249b(entrySet);
            }
            return ImmutableListMultimap.fromMapEntries(entrySet, this.f48708c);
        }

        /* renamed from: a */
        public C17600a<K, V> mo45430a(Entry<? extends K, ? extends V> entry) {
            return mo45432b(entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        public C17600a<K, V> mo45431b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            for (Entry a : iterable) {
                mo45430a(a);
            }
            return this;
        }

        /* renamed from: b */
        public C17600a<K, V> mo45432b(K k, V v) {
            C18053v.m59702a((Object) k, (Object) v);
            Collection collection = (Collection) this.f48706a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f48706a;
                Collection c = mo45475c();
                map.put(k, c);
                collection = c;
            }
            collection.add(v);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$b */
    static class C17601b<K, V> extends ImmutableCollection<Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final ImmutableMultimap<K, V> f48709a;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return this.f48709a.isPartialView();
        }

        public final C17995dt<Entry<K, V>> iterator() {
            return this.f48709a.entryIterator();
        }

        public final int size() {
            return this.f48709a.size();
        }

        C17601b(ImmutableMultimap<K, V> immutableMultimap) {
            this.f48709a = immutableMultimap;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f48709a.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$c */
    static class C17602c {

        /* renamed from: a */
        static final C17930a<ImmutableMultimap> f48710a = C17928cz.m59552a(ImmutableMultimap.class, "map");

        /* renamed from: b */
        static final C17930a<ImmutableMultimap> f48711b = C17928cz.m59552a(ImmutableMultimap.class, "size");
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$d */
    class C17603d extends ImmutableMultiset<K> {
        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }

        public final int size() {
            return ImmutableMultimap.this.size();
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new C17604e(ImmutableMultimap.this);
        }

        C17603d() {
        }

        public final boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        public final int count(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.map.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        /* access modifiers changed from: 0000 */
        public final C17883a<K> getEntry(int i) {
            Entry entry = (Entry) ImmutableMultimap.this.map.entrySet().asList().get(i);
            return C17884cc.m59424a(entry.getKey(), ((Collection) entry.getValue()).size());
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$e */
    static final class C17604e implements Serializable {

        /* renamed from: a */
        final ImmutableMultimap<?, ?> f48713a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f48713a.keys();
        }

        C17604e(ImmutableMultimap<?, ?> immutableMultimap) {
            this.f48713a = immutableMultimap;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$f */
    static final class C17605f<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final transient ImmutableMultimap<K, V> f48714a;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final C17995dt<V> iterator() {
            return this.f48714a.valueIterator();
        }

        public final int size() {
            return this.f48714a.size();
        }

        C17605f(ImmutableMultimap<K, V> immutableMultimap) {
            this.f48714a = immutableMultimap;
        }

        public final boolean contains(Object obj) {
            return this.f48714a.containsValue(obj);
        }

        /* access modifiers changed from: 0000 */
        public final int copyIntoArray(Object[] objArr, int i) {
            C17995dt it = this.f48714a.map.values().iterator();
            while (it.hasNext()) {
                i = ((ImmutableCollection) it.next()).copyIntoArray(objArr, i);
            }
            return i;
        }
    }

    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    public abstract ImmutableCollection<V> get(K k);

    public abstract ImmutableMultimap<V, K> inverse();

    public int size() {
        return this.size;
    }

    public static <K, V> C17600a<K, V> builder() {
        return new C17600a<>();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m58596of() {
        return ImmutableListMultimap.m58562of();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: 0000 */
    public ImmutableCollection<Entry<K, V>> createEntries() {
        return new C17601b(this);
    }

    /* access modifiers changed from: 0000 */
    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: 0000 */
    public ImmutableMultiset<K> createKeys() {
        return new C17603d();
    }

    /* access modifiers changed from: 0000 */
    public ImmutableCollection<V> createValues() {
        return new C17605f(this);
    }

    public ImmutableCollection<Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    /* access modifiers changed from: 0000 */
    public C17995dt<Entry<K, V>> entryIterator() {
        return new C17995dt<Entry<K, V>>() {

            /* renamed from: a */
            final Iterator<? extends Entry<K, ? extends ImmutableCollection<V>>> f48699a = ImmutableMultimap.this.map.entrySet().iterator();

            /* renamed from: b */
            K f48700b = null;

            /* renamed from: c */
            Iterator<V> f48701c = C17782br.m59108a();

            public final boolean hasNext() {
                if (this.f48701c.hasNext() || this.f48699a.hasNext()) {
                    return true;
                }
                return false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Entry<K, V> next() {
                if (!this.f48701c.hasNext()) {
                    Entry entry = (Entry) this.f48699a.next();
                    this.f48700b = entry.getKey();
                    this.f48701c = ((ImmutableCollection) entry.getValue()).iterator();
                }
                return C17839bx.m59337a(this.f48700b, this.f48701c.next());
            }
        };
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* access modifiers changed from: 0000 */
    public C17995dt<V> valueIterator() {
        return new C17995dt<V>() {

            /* renamed from: a */
            Iterator<? extends ImmutableCollection<V>> f48703a = ImmutableMultimap.this.map.values().iterator();

            /* renamed from: b */
            Iterator<V> f48704b = C17782br.m59108a();

            public final boolean hasNext() {
                if (this.f48704b.hasNext() || this.f48703a.hasNext()) {
                    return true;
                }
                return false;
            }

            public final V next() {
                if (!this.f48704b.hasNext()) {
                    this.f48704b = ((ImmutableCollection) this.f48703a.next()).iterator();
                }
                return this.f48704b.next();
            }
        };
    }

    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf(iterable);
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean putAll(C17862by<? extends K, ? extends V> byVar) {
        throw new UnsupportedOperationException();
    }

    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(Object obj) {
        if (obj == null || !super.containsValue(obj)) {
            return false;
        }
        return true;
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(C17862by<? extends K, ? extends V> byVar) {
        if (byVar instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) byVar;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf(byVar);
    }

    ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m58597of(K k, V v) {
        return ImmutableListMultimap.m58563of(k, v);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m58598of(K k, V v, K k2, V v2) {
        return ImmutableListMultimap.m58564of(k, v, k2, v2);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m58599of(K k, V v, K k2, V v2, K k3, V v3) {
        return ImmutableListMultimap.m58565of(k, v, k2, v2, k3, v3);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m58600of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ImmutableListMultimap.m58566of(k, v, k2, v2, k3, v3, k4, v4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m58601of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ImmutableListMultimap.m58567of(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }
}
