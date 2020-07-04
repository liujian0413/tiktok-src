package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.ImmutableCollection.C17583b;
import com.google.common.collect.ImmutableMap.C17591a;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedMap;

public final class ImmutableSortedMap<K, V> extends C17774bn<K, V> implements NavigableMap<K, V> {
    private static final ImmutableSortedMap<Comparable, Object> NATURAL_EMPTY_MAP = new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(C17896ch.m59497b()), ImmutableList.m58536of());
    private static final Comparator<Comparable> NATURAL_ORDER = C17896ch.m59497b();
    private static final long serialVersionUID = 0;
    private transient ImmutableSortedMap<K, V> descendingMap;
    public final transient C17920cu<K> keySet;
    public final transient ImmutableList<V> valueList;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$a */
    class C17630a extends C17765bj<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ImmutableMap<K, V> mo45458a() {
            return ImmutableSortedMap.this;
        }

        /* access modifiers changed from: 0000 */
        public final ImmutableList<Entry<K, V>> createAsList() {
            return new ImmutableList<Entry<K, V>>() {
                /* access modifiers changed from: 0000 */
                public final boolean isPartialView() {
                    return true;
                }

                public final int size() {
                    return ImmutableSortedMap.this.size();
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Entry<K, V> get(int i) {
                    return new SimpleImmutableEntry(ImmutableSortedMap.this.keySet.asList().get(i), ImmutableSortedMap.this.valueList.get(i));
                }
            };
        }

        public final C17995dt<Entry<K, V>> iterator() {
            return asList().iterator();
        }

        C17630a() {
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMap$b */
    public static class C17632b<K, V> extends C17591a<K, V> {

        /* renamed from: e */
        private transient Object[] f48763e;

        /* renamed from: f */
        private transient Object[] f48764f;

        /* renamed from: g */
        private final Comparator<? super K> f48765g;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImmutableSortedMap<K, V> mo45379b() {
            switch (this.f48689c) {
                case 0:
                    return ImmutableSortedMap.emptyMap(this.f48765g);
                case 1:
                    return ImmutableSortedMap.m58689of(this.f48765g, this.f48763e[0], this.f48764f[0]);
                default:
                    Object[] copyOf = Arrays.copyOf(this.f48763e, this.f48689c);
                    Object[] objArr = copyOf;
                    Arrays.sort(objArr, this.f48765g);
                    Object[] objArr2 = new Object[this.f48689c];
                    for (int i = 0; i < this.f48689c; i++) {
                        if (i > 0) {
                            int i2 = i - 1;
                            if (this.f48765g.compare(copyOf[i2], copyOf[i]) == 0) {
                                StringBuilder sb = new StringBuilder("keys required to be distinct but compared as equal: ");
                                sb.append(copyOf[i2]);
                                sb.append(" and ");
                                sb.append(copyOf[i]);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                        objArr2[Arrays.binarySearch(objArr, this.f48763e[i], this.f48765g)] = this.f48764f[i];
                    }
                    return new ImmutableSortedMap<>(new C17920cu(ImmutableList.asImmutableList(copyOf), this.f48765g), ImmutableList.asImmutableList(objArr2));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17632b<K, V> mo45378b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            super.mo45378b(iterable);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17632b<K, V> mo45376a(Entry<? extends K, ? extends V> entry) {
            super.mo45376a(entry);
            return this;
        }

        public C17632b(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17632b<K, V> mo45377a(Map<? extends K, ? extends V> map) {
            super.mo45377a(map);
            return this;
        }

        /* renamed from: a */
        private void m58695a(int i) {
            if (i > this.f48763e.length) {
                int a = C17583b.m58531a(this.f48763e.length, i);
                this.f48763e = Arrays.copyOf(this.f48763e, a);
                this.f48764f = Arrays.copyOf(this.f48764f, a);
            }
        }

        private C17632b(Comparator<? super K> comparator, int i) {
            this.f48765g = (Comparator) C17439m.m57962a(comparator);
            this.f48763e = new Object[4];
            this.f48764f = new Object[4];
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17632b<K, V> mo45375a(K k, V v) {
            m58695a(this.f48689c + 1);
            C18053v.m59702a((Object) k, (Object) v);
            this.f48763e[this.f48689c] = k;
            this.f48764f[this.f48689c] = v;
            this.f48689c++;
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMap$c */
    static class C17633c extends C17597d {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Comparator<Object> f48766a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return mo45462a(new C17632b(this.f48766a));
        }

        C17633c(ImmutableSortedMap<?, ?> immutableSortedMap) {
            super(immutableSortedMap);
            this.f48766a = immutableSortedMap.comparator();
        }
    }

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m58683of() {
        return NATURAL_EMPTY_MAP;
    }

    public final ImmutableSortedSet<K> keySet() {
        return this.keySet;
    }

    public final ImmutableSortedSet<K> navigableKeySet() {
        return this.keySet;
    }

    public final ImmutableCollection<V> values() {
        return this.valueList;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableCollection<V> createValues() {
        throw new AssertionError("should never be called");
    }

    public final ImmutableSortedSet<K> descendingKeySet() {
        return this.keySet.descendingSet();
    }

    public final ImmutableSet<Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    public final Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.valueList.size();
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17633c(this);
    }

    public static <K extends Comparable<?>, V> C17632b<K, V> naturalOrder() {
        return new C17632b<>(C17896ch.m59497b());
    }

    public static <K extends Comparable<?>, V> C17632b<K, V> reverseOrder() {
        return new C17632b<>(C17896ch.m59497b().mo46226a());
    }

    public final Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    public final K firstKey() {
        return keySet().first();
    }

    public final K lastKey() {
        return keySet().last();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<Entry<K, V>> createEntrySet() {
        if (isEmpty()) {
            return ImmutableSet.m58649of();
        }
        return new C17630a();
    }

    public final Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Entry) entrySet().asList().get(0);
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        if (this.keySet.isPartialView() || this.valueList.isPartialView()) {
            return true;
        }
        return false;
    }

    public final Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Entry) entrySet().asList().get(size() - 1);
    }

    public final ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (isEmpty()) {
            return emptyMap(C17896ch.m59496a(comparator()).mo46226a());
        }
        return new ImmutableSortedMap<>((C17920cu) this.keySet.descendingSet(), this.valueList.reverse(), this);
    }

    public static <K, V> C17632b<K, V> orderedBy(Comparator<K> comparator) {
        return new C17632b<>(comparator);
    }

    public final ImmutableSortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    public final ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (Comparator<? super K>) (C17896ch) NATURAL_ORDER);
    }

    private static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> ofEntries(Entry<K, V>... entryArr) {
        return fromEntries(C17896ch.m59497b(), false, entryArr, entryArr.length);
    }

    public final Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public final K ceilingKey(K k) {
        return C17839bx.m59330a(ceilingEntry(k));
    }

    public final Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public final K floorKey(K k) {
        return C17839bx.m59330a(floorEntry(k));
    }

    public final Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public final K higherKey(K k) {
        return C17839bx.m59330a(higherEntry(k));
    }

    public final Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public final K lowerKey(K k) {
        return C17839bx.m59330a(lowerEntry(k));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator<Comparable> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        if (sortedMap instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) sortedMap;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, true, sortedMap.entrySet());
    }

    static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
        if (C17896ch.m59497b().equals(comparator)) {
            return m58683of();
        }
        return new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(comparator), ImmutableList.m58536of());
    }

    public final V get(Object obj) {
        int indexOf = this.keySet.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.valueList.get(indexOf);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (C17896ch) NATURAL_ORDER);
    }

    ImmutableSortedMap(C17920cu<K> cuVar, ImmutableList<V> immutableList) {
        this(cuVar, immutableList, null);
    }

    public final ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m58684of(K k, V v) {
        return m58689of(C17896ch.m59497b(), k, v);
    }

    public final ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return getSubMap(0, this.keySet.mo46271a(C17439m.m57962a(k), z));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return fromEntries((Comparator) C17439m.m57962a(comparator), false, iterable);
    }

    public final ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return getSubMap(this.keySet.mo46273b(C17439m.m57962a(k), z), size());
    }

    private static <K, V> ImmutableSortedMap<K, V> copyOfInternal(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean z = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                z = comparator.equals(comparator2);
            } else if (comparator == NATURAL_ORDER) {
                z = true;
            }
        }
        if (z && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, z, map.entrySet());
    }

    private ImmutableSortedMap<K, V> getSubMap(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return emptyMap(comparator());
        }
        return new ImmutableSortedMap<>(this.keySet.mo46272a(i, i2), this.valueList.subList(i, i2));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return copyOfInternal(map, (Comparator) C17439m.m57962a(comparator));
    }

    ImmutableSortedMap(C17920cu<K> cuVar, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.keySet = cuVar;
        this.valueList = immutableList;
        this.descendingMap = immutableSortedMap;
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean z, Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        Entry[] entryArr = (Entry[]) C17777bq.m59097a(iterable, (T[]) EMPTY_ENTRY_ARRAY);
        return fromEntries(comparator, z, entryArr, entryArr.length);
    }

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m58689of(Comparator<? super K> comparator, K k, V v) {
        return new ImmutableSortedMap<>(new C17920cu(ImmutableList.m58537of(k), (Comparator) C17439m.m57962a(comparator)), ImmutableList.m58537of(v));
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m58685of(K k, V v, K k2, V v2) {
        return ofEntries(entryOf(k, v), entryOf(k2, v2));
    }

    public final ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        boolean z3;
        C17439m.m57962a(k);
        C17439m.m57962a(k2);
        if (comparator().compare(k, k2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C17439m.m57977a(z3, "expected fromKey <= toKey but %s > %s", (Object) k, (Object) k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(final Comparator<? super K> comparator, boolean z, Entry<K, V>[] entryArr, int i) {
        boolean z2;
        switch (i) {
            case 0:
                return emptyMap(comparator);
            case 1:
                return m58689of(comparator, entryArr[0].getKey(), entryArr[0].getValue());
            default:
                Object[] objArr = new Object[i];
                Object[] objArr2 = new Object[i];
                if (z) {
                    for (int i2 = 0; i2 < i; i2++) {
                        Object key = entryArr[i2].getKey();
                        Object value = entryArr[i2].getValue();
                        C18053v.m59702a(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                    }
                } else {
                    Arrays.sort(entryArr, 0, i, new Comparator<Entry<K, V>>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public int compare(Entry<K, V> entry, Entry<K, V> entry2) {
                            return comparator.compare(entry.getKey(), entry2.getKey());
                        }
                    });
                    Object key2 = entryArr[0].getKey();
                    objArr[0] = key2;
                    objArr2[0] = entryArr[0].getValue();
                    C18053v.m59702a(objArr[0], objArr2[0]);
                    Object obj = key2;
                    int i3 = 1;
                    while (i3 < i) {
                        Object key3 = entryArr[i3].getKey();
                        Object value2 = entryArr[i3].getValue();
                        C18053v.m59702a(key3, value2);
                        objArr[i3] = key3;
                        objArr2[i3] = value2;
                        if (comparator.compare(obj, key3) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        checkNoConflict(z2, "key", entryArr[i3 - 1], entryArr[i3]);
                        i3++;
                        obj = key3;
                    }
                }
                return new ImmutableSortedMap<>(new C17920cu(ImmutableList.asImmutableList(objArr), comparator), ImmutableList.asImmutableList(objArr2));
        }
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m58686of(K k, V v, K k2, V v2, K k3, V v3) {
        return ofEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3));
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m58687of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ofEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m58688of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ofEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5));
    }
}
