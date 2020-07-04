package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.C17441o;
import com.google.common.collect.ImmutableMap.C17591a;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.bx */
public final class C17839bx {

    /* renamed from: com.google.common.collect.bx$a */
    static abstract class C17847a<K, V> extends C17750aw<K, V> implements NavigableMap<K, V> {

        /* renamed from: a */
        private transient Comparator<? super K> f49113a;

        /* renamed from: b */
        private transient Set<Entry<K, V>> f49114b;

        /* renamed from: c */
        private transient NavigableSet<K> f49115c;

        /* renamed from: com.google.common.collect.bx$a$a */
        class C17848a extends C17852c<K, V> {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Map<K, V> mo45869a() {
                return C17847a.this;
            }

            public final Iterator<Entry<K, V>> iterator() {
                return C17847a.this.mo46118b();
            }

            C17848a() {
            }
        }

        C17847a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract NavigableMap<K, V> mo46117a();

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Iterator<Entry<K, V>> mo46118b();

        /* renamed from: c */
        private Set<Entry<K, V>> m59366c() {
            return new C17848a();
        }

        public NavigableMap<K, V> descendingMap() {
            return mo46117a();
        }

        public Set<K> keySet() {
            return navigableKeySet();
        }

        public String toString() {
            return standardToString();
        }

        public Collection<V> values() {
            return new C17860j(this);
        }

        /* access modifiers changed from: protected */
        public final Map<K, V> delegate() {
            return mo46117a();
        }

        public NavigableSet<K> descendingKeySet() {
            return mo46117a().navigableKeySet();
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.f49114b;
            if (set != null) {
                return set;
            }
            Set<Entry<K, V>> c = m59366c();
            this.f49114b = c;
            return c;
        }

        public Entry<K, V> firstEntry() {
            return mo46117a().lastEntry();
        }

        public K firstKey() {
            return mo46117a().lastKey();
        }

        public Entry<K, V> lastEntry() {
            return mo46117a().firstEntry();
        }

        public K lastKey() {
            return mo46117a().firstKey();
        }

        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f49115c;
            if (navigableSet != null) {
                return navigableSet;
            }
            C17857g gVar = new C17857g(this);
            this.f49115c = gVar;
            return gVar;
        }

        public Entry<K, V> pollFirstEntry() {
            return mo46117a().pollLastEntry();
        }

        public Entry<K, V> pollLastEntry() {
            return mo46117a().pollFirstEntry();
        }

        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f49113a;
            if (comparator != null) {
                return comparator;
            }
            Comparator comparator2 = mo46117a().comparator();
            if (comparator2 == null) {
                comparator2 = C17896ch.m59497b();
            }
            C17896ch a = m59365a(comparator2);
            this.f49113a = a;
            return a;
        }

        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        /* renamed from: a */
        private static <T> C17896ch<T> m59365a(Comparator<T> comparator) {
            return C17896ch.m59496a(comparator).mo46226a();
        }

        public Entry<K, V> ceilingEntry(K k) {
            return mo46117a().floorEntry(k);
        }

        public K ceilingKey(K k) {
            return mo46117a().floorKey(k);
        }

        public Entry<K, V> floorEntry(K k) {
            return mo46117a().ceilingEntry(k);
        }

        public K floorKey(K k) {
            return mo46117a().ceilingKey(k);
        }

        public Entry<K, V> higherEntry(K k) {
            return mo46117a().lowerEntry(k);
        }

        public K higherKey(K k) {
            return mo46117a().lowerKey(k);
        }

        public Entry<K, V> lowerEntry(K k) {
            return mo46117a().higherEntry(k);
        }

        public K lowerKey(K k) {
            return mo46117a().higherKey(k);
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public NavigableMap<K, V> headMap(K k, boolean z) {
            return mo46117a().tailMap(k, z).descendingMap();
        }

        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return mo46117a().headMap(k, z).descendingMap();
        }

        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return mo46117a().subMap(k2, z2, k, z).descendingMap();
        }
    }

    /* renamed from: com.google.common.collect.bx$b */
    enum C17849b implements C17427g<Entry<?, ?>, Object> {
        KEY {
            /* renamed from: a */
            private static Object m59370a(Entry<?, ?> entry) {
                return entry.getKey();
            }

            /* renamed from: b */
            public final /* synthetic */ Object mo44914b(Object obj) {
                return m59370a((Entry) obj);
            }
        },
        VALUE {
            /* renamed from: a */
            private static Object m59372a(Entry<?, ?> entry) {
                return entry.getValue();
            }

            /* renamed from: b */
            public final /* synthetic */ Object mo44914b(Object obj) {
                return m59372a((Entry) obj);
            }
        }
    }

    /* renamed from: com.google.common.collect.bx$c */
    static abstract class C17852c<K, V> extends C17936c<Entry<K, V>> {
        C17852c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Map<K, V> mo45869a();

        public void clear() {
            mo45869a().clear();
        }

        public boolean isEmpty() {
            return mo45869a().isEmpty();
        }

        public int size() {
            return mo45869a().size();
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            return mo45869a().keySet().remove(((Entry) obj).getKey());
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C17439m.m57962a(collection));
            } catch (UnsupportedOperationException unused) {
                return C17933db.m59573a((Set<?>) this, collection.iterator());
            }
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object a = C17839bx.m59331a(mo45869a(), key);
            if (!C17434j.m57955a(a, entry.getValue()) || (a == null && !mo45869a().containsKey(key))) {
                return false;
            }
            return true;
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C17439m.m57962a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C17933db.m59566a(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        a.add(((Entry) next).getKey());
                    }
                }
                return mo45869a().keySet().retainAll(a);
            }
        }
    }

    /* renamed from: com.google.common.collect.bx$d */
    public interface C17853d<K, V1, V2> {
        /* renamed from: a */
        V2 mo46116a(K k, V1 v1);
    }

    /* renamed from: com.google.common.collect.bx$e */
    static abstract class C17854e<K, V> extends AbstractMap<K, V> {
        C17854e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Iterator<Entry<K, V>> mo45214b();

        public void clear() {
            C17782br.m59133h(mo45214b());
        }

        public Set<Entry<K, V>> entrySet() {
            return new C17852c<K, V>() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final Map<K, V> mo45869a() {
                    return C17854e.this;
                }

                public final Iterator<Entry<K, V>> iterator() {
                    return C17854e.this.mo45214b();
                }
            };
        }
    }

    /* renamed from: com.google.common.collect.bx$f */
    static class C17856f<K, V> extends C17936c<K> {

        /* renamed from: d */
        final Map<K, V> f49121d;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Map<K, V> mo46150b() {
            return this.f49121d;
        }

        public void clear() {
            mo46150b().clear();
        }

        public boolean isEmpty() {
            return mo46150b().isEmpty();
        }

        public int size() {
            return mo46150b().size();
        }

        public Iterator<K> iterator() {
            return C17839bx.m59334a(mo46150b().entrySet().iterator());
        }

        C17856f(Map<K, V> map) {
            this.f49121d = (Map) C17439m.m57962a(map);
        }

        public boolean contains(Object obj) {
            return mo46150b().containsKey(obj);
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo46150b().remove(obj);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.bx$g */
    static class C17857g<K, V> extends C17858h<K, V> implements NavigableSet<K> {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public NavigableMap<K, V> mo46150b() {
            return (NavigableMap) this.f49121d;
        }

        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<K> descendingSet() {
            return mo46150b().descendingKeySet();
        }

        public final K pollFirst() {
            return C17839bx.m59330a(mo46150b().pollFirstEntry());
        }

        public final K pollLast() {
            return C17839bx.m59330a(mo46150b().pollLastEntry());
        }

        C17857g(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        public final SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public final SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public final K ceiling(K k) {
            return mo46150b().ceilingKey(k);
        }

        public final K floor(K k) {
            return mo46150b().floorKey(k);
        }

        public final K higher(K k) {
            return mo46150b().higherKey(k);
        }

        public final K lower(K k) {
            return mo46150b().lowerKey(k);
        }

        public final SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return mo46150b().headMap(k, z).navigableKeySet();
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return mo46150b().tailMap(k, z).navigableKeySet();
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return mo46150b().subMap(k, z, k2, z2).navigableKeySet();
        }
    }

    /* renamed from: com.google.common.collect.bx$h */
    static class C17858h<K, V> extends C17856f<K, V> implements SortedSet<K> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public SortedMap<K, V> mo46150b() {
            return (SortedMap) super.mo46150b();
        }

        public Comparator<? super K> comparator() {
            return mo46150b().comparator();
        }

        public K first() {
            return mo46150b().firstKey();
        }

        public K last() {
            return mo46150b().lastKey();
        }

        C17858h(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> headSet(K k) {
            return new C17858h(mo46150b().headMap(k));
        }

        public SortedSet<K> tailSet(K k) {
            return new C17858h(mo46150b().tailMap(k));
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C17858h(mo46150b().subMap(k, k2));
        }
    }

    /* renamed from: com.google.common.collect.bx$i */
    static class C17859i<K, V1, V2> extends C17854e<K, V2> {

        /* renamed from: a */
        final Map<K, V1> f49122a;

        /* renamed from: b */
        final C17853d<? super K, ? super V1, V2> f49123b;

        public final void clear() {
            this.f49122a.clear();
        }

        public final Set<K> keySet() {
            return this.f49122a.keySet();
        }

        public final int size() {
            return this.f49122a.size();
        }

        public final Collection<V2> values() {
            return new C17860j(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<Entry<K, V2>> mo45214b() {
            return C17782br.m59112a(this.f49122a.entrySet().iterator(), C17839bx.m59326a(this.f49123b));
        }

        public final boolean containsKey(Object obj) {
            return this.f49122a.containsKey(obj);
        }

        public final V2 get(Object obj) {
            Object obj2 = this.f49122a.get(obj);
            if (obj2 != null || this.f49122a.containsKey(obj)) {
                return this.f49123b.mo46116a(obj, obj2);
            }
            return null;
        }

        public final V2 remove(Object obj) {
            if (this.f49122a.containsKey(obj)) {
                return this.f49123b.mo46116a(obj, this.f49122a.remove(obj));
            }
            return null;
        }

        C17859i(Map<K, V1> map, C17853d<? super K, ? super V1, V2> dVar) {
            this.f49122a = (Map) C17439m.m57962a(map);
            this.f49123b = (C17853d) C17439m.m57962a(dVar);
        }
    }

    /* renamed from: com.google.common.collect.bx$j */
    static class C17860j<K, V> extends AbstractCollection<V> {

        /* renamed from: b */
        public final Map<K, V> f49124b;

        public void clear() {
            this.f49124b.clear();
        }

        public boolean isEmpty() {
            return this.f49124b.isEmpty();
        }

        public int size() {
            return this.f49124b.size();
        }

        public Iterator<V> iterator() {
            return C17839bx.m59346b(this.f49124b.entrySet().iterator());
        }

        public boolean contains(Object obj) {
            return this.f49124b.containsValue(obj);
        }

        C17860j(Map<K, V> map) {
            this.f49124b = (Map) C17439m.m57962a(map);
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Entry entry : this.f49124b.entrySet()) {
                    if (C17434j.m57955a(obj, entry.getValue())) {
                        this.f49124b.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C17439m.m57962a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C17933db.m59565a();
                for (Entry entry : this.f49124b.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a.add(entry.getKey());
                    }
                }
                return this.f49124b.keySet().removeAll(a);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C17439m.m57962a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C17933db.m59565a();
                for (Entry entry : this.f49124b.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a.add(entry.getKey());
                    }
                }
                return this.f49124b.keySet().retainAll(a);
            }
        }
    }

    /* renamed from: com.google.common.collect.bx$k */
    static abstract class C17861k<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        private transient Set<Entry<K, V>> f49125a;

        /* renamed from: b */
        private transient Set<K> f49126b;

        /* renamed from: c */
        private transient Collection<V> f49127c;

        C17861k() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Set<Entry<K, V>> mo45863a();

        /* access modifiers changed from: 0000 */
        /* renamed from: Q_ */
        public Collection<V> mo45861Q_() {
            return new C17860j(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Set<K> mo45866e() {
            return new C17856f(this);
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.f49125a;
            if (set != null) {
                return set;
            }
            Set<Entry<K, V>> a = mo45863a();
            this.f49125a = a;
            return a;
        }

        public Set<K> keySet() {
            Set<K> set = this.f49126b;
            if (set != null) {
                return set;
            }
            Set<K> e = mo45866e();
            this.f49126b = e;
            return e;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f49127c;
            if (collection != null) {
                return collection;
            }
            Collection<V> Q_ = mo45861Q_();
            this.f49127c = Q_;
            return Q_;
        }
    }

    /* renamed from: a */
    static <K> C17427g<Entry<K, ?>, K> m59325a() {
        return C17849b.KEY;
    }

    /* renamed from: b */
    static <V> C17427g<Entry<?, V>, V> m59343b() {
        return C17849b.VALUE;
    }

    /* renamed from: a */
    static <K, V> Iterator<Entry<K, V>> m59335a(Set<K> set, final C17427g<? super K, V> gVar) {
        return new C17992dq<K, Entry<K, V>>(set.iterator()) {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Entry<K, V> mo45666a(K k) {
                return C17839bx.m59337a(k, gVar.mo44914b(k));
            }
        };
    }

    /* renamed from: a */
    public static <K, V> Entry<K, V> m59337a(K k, V v) {
        return new C17764bi(k, v);
    }

    /* renamed from: a */
    public static <K, V1, V2> Map<K, V2> m59338a(Map<K, V1> map, C17427g<? super V1, V2> gVar) {
        return m59339a(map, m59329a(gVar));
    }

    /* renamed from: a */
    private static <K, V1, V2> Map<K, V2> m59339a(Map<K, V1> map, C17853d<? super K, ? super V1, V2> dVar) {
        return new C17859i(map, dVar);
    }

    /* renamed from: a */
    static <V2, K, V1> Entry<K, V2> m59336a(final C17853d<? super K, ? super V1, V2> dVar, final Entry<K, V1> entry) {
        C17439m.m57962a(dVar);
        C17439m.m57962a(entry);
        return new C18027g<K, V2>() {
            public final K getKey() {
                return entry.getKey();
            }

            public final V2 getValue() {
                return dVar.mo46116a(entry.getKey(), entry.getValue());
            }
        };
    }

    /* renamed from: a */
    static <K, V> boolean m59341a(Collection<Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        return collection.contains(m59351c((Entry) obj));
    }

    /* renamed from: a */
    static <K, V> void m59340a(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    public static <K, V> HashMap<K, V> m59349c() {
        return new HashMap<>();
    }

    /* renamed from: d */
    public static <K, V> LinkedHashMap<K, V> m59352d() {
        return new LinkedHashMap<>();
    }

    /* renamed from: a */
    static <K, V> Iterator<K> m59334a(Iterator<Entry<K, V>> it) {
        return new C17992dq<Entry<K, V>, K>(it) {
            /* renamed from: a */
            private static K m59356a(Entry<K, V> entry) {
                return entry.getKey();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo45666a(Object obj) {
                return m59356a((Entry) obj);
            }
        };
    }

    /* renamed from: b */
    static <K, V> Iterator<V> m59346b(Iterator<Entry<K, V>> it) {
        return new C17992dq<Entry<K, V>, V>(it) {
            /* renamed from: a */
            private static V m59360a(Entry<K, V> entry) {
                return entry.getValue();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo45666a(Object obj) {
                return m59360a((Entry) obj);
            }
        };
    }

    /* renamed from: a */
    static <K, V1, V2> C17427g<Entry<K, V1>, Entry<K, V2>> m59326a(final C17853d<? super K, ? super V1, V2> dVar) {
        C17439m.m57962a(dVar);
        return new C17427g<Entry<K, V1>, Entry<K, V2>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Entry<K, V2> mo44914b(Entry<K, V1> entry) {
                return C17839bx.m59336a(dVar, entry);
            }
        };
    }

    /* renamed from: b */
    static <V> C17440n<Entry<?, V>> m59344b(C17440n<? super V> nVar) {
        return C17441o.m57990a(nVar, m59343b());
    }

    /* renamed from: a */
    static <K> C17440n<Entry<K, ?>> m59327a(C17440n<? super K> nVar) {
        return C17441o.m57990a(nVar, m59325a());
    }

    /* renamed from: b */
    static int m59342b(int i) {
        if (i < 3) {
            C18053v.m59700a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: c */
    public static <K, V> LinkedHashMap<K, V> m59350c(int i) {
        return new LinkedHashMap<>(m59342b(i));
    }

    /* renamed from: a */
    static <E> ImmutableMap<E, Integer> m59328a(Collection<E> collection) {
        C17591a aVar = new C17591a(collection.size());
        int i = 0;
        for (E a : collection) {
            int i2 = i + 1;
            aVar.mo45375a(a, Integer.valueOf(i));
            i = i2;
        }
        return aVar.mo45379b();
    }

    /* renamed from: b */
    static <V> V m59345b(Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* renamed from: c */
    private static <K, V> Entry<K, V> m59351c(final Entry<? extends K, ? extends V> entry) {
        C17439m.m57962a(entry);
        return new C18027g<K, V>() {
            public final K getKey() {
                return entry.getKey();
            }

            public final V getValue() {
                return entry.getValue();
            }
        };
    }

    /* renamed from: a */
    private static <K, V1, V2> C17853d<K, V1, V2> m59329a(final C17427g<? super V1, V2> gVar) {
        C17439m.m57962a(gVar);
        return new C17853d<K, V1, V2>() {
            /* renamed from: a */
            public final V2 mo46116a(K k, V1 v1) {
                return gVar.mo44914b(v1);
            }
        };
    }

    /* renamed from: a */
    static <K> K m59330a(Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: a */
    static String m59332a(Map<?, ?> map) {
        StringBuilder a = C18054w.m59706a(map.size());
        a.append('{');
        boolean z = true;
        for (Entry entry : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            a.append(entry.getKey());
            a.append('=');
            a.append(entry.getValue());
        }
        a.append('}');
        return a.toString();
    }

    /* renamed from: a */
    public static <K, V> HashMap<K, V> m59333a(int i) {
        return new HashMap<>(m59342b(i));
    }

    /* renamed from: c */
    static <V> V m59348c(Map<?, V> map, Object obj) {
        C17439m.m57962a(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: d */
    static boolean m59353d(Map<?, ?> map, Object obj) {
        return C17782br.m59115a(m59334a(map.entrySet().iterator()), obj);
    }

    /* renamed from: e */
    static boolean m59354e(Map<?, ?> map, Object obj) {
        return C17782br.m59115a(m59346b(map.entrySet().iterator()), obj);
    }

    /* renamed from: f */
    static boolean m59355f(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    /* renamed from: b */
    static boolean m59347b(Map<?, ?> map, Object obj) {
        C17439m.m57962a(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static <V> V m59331a(Map<?, V> map, Object obj) {
        C17439m.m57962a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
