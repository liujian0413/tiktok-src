package com.google.common.collect;

import com.google.common.collect.ImmutableCollection.C17583b;
import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public abstract class ImmutableMap<K, V> implements Serializable, Map<K, V> {
    static final Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Entry[0];
    private transient ImmutableSet<Entry<K, V>> entrySet;
    private transient ImmutableSet<K> keySet;
    private transient ImmutableSetMultimap<K, V> multimapView;
    private transient ImmutableCollection<V> values;

    /* renamed from: com.google.common.collect.ImmutableMap$a */
    public static class C17591a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f48687a;

        /* renamed from: b */
        Object[] f48688b;

        /* renamed from: c */
        int f48689c;

        /* renamed from: d */
        boolean f48690d;

        public C17591a() {
            this(4);
        }

        /* renamed from: b */
        public ImmutableMap<K, V> mo45379b() {
            mo45456c();
            this.f48690d = true;
            return C17909cq.m59523a(this.f48689c, this.f48688b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo45456c() {
            if (this.f48687a != null) {
                if (this.f48690d) {
                    this.f48688b = Arrays.copyOf(this.f48688b, this.f48689c * 2);
                }
                Entry[] entryArr = new Entry[this.f48689c];
                for (int i = 0; i < this.f48689c; i++) {
                    int i2 = i * 2;
                    entryArr[i] = new SimpleImmutableEntry(this.f48688b[i2], this.f48688b[i2 + 1]);
                }
                Arrays.sort(entryArr, 0, this.f48689c, C17896ch.m59496a(this.f48687a).mo46246a(C17839bx.m59343b()));
                for (int i3 = 0; i3 < this.f48689c; i3++) {
                    int i4 = i3 * 2;
                    this.f48688b[i4] = entryArr[i3].getKey();
                    this.f48688b[i4 + 1] = entryArr[i3].getValue();
                }
            }
        }

        C17591a(int i) {
            this.f48688b = new Object[(i * 2)];
        }

        /* renamed from: a */
        public C17591a<K, V> mo45376a(Entry<? extends K, ? extends V> entry) {
            return mo45375a(entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        private void m58582a(int i) {
            int i2 = i * 2;
            if (i2 > this.f48688b.length) {
                this.f48688b = Arrays.copyOf(this.f48688b, C17583b.m58531a(this.f48688b.length, i2));
                this.f48690d = false;
            }
        }

        /* renamed from: b */
        public C17591a<K, V> mo45378b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m58582a(this.f48689c + ((Collection) iterable).size());
            }
            for (Entry a : iterable) {
                mo45376a(a);
            }
            return this;
        }

        /* renamed from: a */
        public C17591a<K, V> mo45377a(Map<? extends K, ? extends V> map) {
            return mo45378b(map.entrySet());
        }

        /* renamed from: a */
        public C17591a<K, V> mo45375a(K k, V v) {
            m58582a(this.f48689c + 1);
            C18053v.m59702a((Object) k, (Object) v);
            this.f48688b[this.f48689c * 2] = k;
            this.f48688b[(this.f48689c * 2) + 1] = v;
            this.f48689c++;
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$b */
    static abstract class C17592b<K, V> extends ImmutableMap<K, V> {

        /* renamed from: com.google.common.collect.ImmutableMap$b$a */
        class C17593a extends C17765bj<K, V> {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final ImmutableMap<K, V> mo45458a() {
                return C17592b.this;
            }

            public final C17995dt<Entry<K, V>> iterator() {
                return C17592b.this.mo45457b();
            }

            C17593a() {
            }
        }

        C17592b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C17995dt<Entry<K, V>> mo45457b();

        /* access modifiers changed from: 0000 */
        public ImmutableSet<Entry<K, V>> createEntrySet() {
            return new C17593a();
        }

        /* access modifiers changed from: 0000 */
        public ImmutableSet<K> createKeySet() {
            return new C17767bk(this);
        }

        /* access modifiers changed from: 0000 */
        public ImmutableCollection<V> createValues() {
            return new C17769bl(this);
        }

        public /* bridge */ /* synthetic */ Set entrySet() {
            return ImmutableMap.super.entrySet();
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return ImmutableMap.super.keySet();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return ImmutableMap.super.values();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$c */
    final class C17594c extends C17592b<K, ImmutableSet<V>> {
        /* access modifiers changed from: 0000 */
        public final ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        public final int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        /* access modifiers changed from: 0000 */
        public final boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        public final int size() {
            return ImmutableMap.this.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C17995dt<Entry<K, ImmutableSet<V>>> mo45457b() {
            final C17995dt it = ImmutableMap.this.entrySet().iterator();
            return new C17995dt<Entry<K, ImmutableSet<V>>>() {
                public final boolean hasNext() {
                    return it.hasNext();
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Entry<K, ImmutableSet<V>> next() {
                    final Entry entry = (Entry) it.next();
                    return new C18027g<K, ImmutableSet<V>>() {
                        public final K getKey() {
                            return entry.getKey();
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.m58650of(entry.getValue());
                        }
                    };
                }
            };
        }

        private C17594c() {
        }

        public final boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m58650of(obj2);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$d */
    static class C17597d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Object[] f48697a;

        /* renamed from: b */
        private final Object[] f48698b;

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return mo45462a(new C17591a(this.f48697a.length));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Object mo45462a(C17591a<Object, Object> aVar) {
            for (int i = 0; i < this.f48697a.length; i++) {
                aVar.mo45375a(this.f48697a[i], this.f48698b[i]);
            }
            return aVar.mo45379b();
        }

        C17597d(ImmutableMap<?, ?> immutableMap) {
            this.f48697a = new Object[immutableMap.size()];
            this.f48698b = new Object[immutableMap.size()];
            C17995dt it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                this.f48697a[i] = entry.getKey();
                this.f48698b[i] = entry.getValue();
                i++;
            }
        }
    }

    ImmutableMap() {
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m58576of() {
        return C17909cq.f49189a;
    }

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSet<Entry<K, V>> createEntrySet();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSet<K> createKeySet();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableCollection<V> createValues();

    public abstract V get(Object obj);

    /* access modifiers changed from: 0000 */
    public boolean isHashCodeFast() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean isPartialView();

    public static <K, V> C17591a<K, V> builder() {
        return new C17591a<>();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C17839bx.m59332a((Map<?, ?>) this);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17597d(this);
    }

    public ImmutableSet<Entry<K, V>> entrySet() {
        ImmutableSet<Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public int hashCode() {
        return C17933db.m59564a((Set<?>) entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public C17995dt<K> keyIterator() {
        final C17995dt it = entrySet().iterator();
        return new C17995dt<K>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final K next() {
                return ((Entry) it.next()).getKey();
            }
        };
    }

    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.m58668of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new C17594c(), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    public boolean equals(Object obj) {
        return C17839bx.m59355f(this, obj);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C17591a<K, V> builderWithExpectedSize(int i) {
        C18053v.m59700a(i, "expectedSize");
        return new C17591a<>(i);
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        C17591a aVar = new C17591a(i);
        aVar.mo45378b(iterable);
        return aVar.mo45379b();
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf((Iterable<? extends Entry<? extends K, ? extends V>>) map.entrySet());
    }

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    static <K, V> Entry<K, V> entryOf(K k, V v) {
        C18053v.m59702a((Object) k, (Object) v);
        return new SimpleImmutableEntry(k, v);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m58577of(K k, V v) {
        C18053v.m59702a((Object) k, (Object) v);
        return C17909cq.m59523a(1, new Object[]{k, v});
    }

    static void checkNoConflict(boolean z, String str, Entry<?, ?> entry, Entry<?, ?> entry2) {
        if (!z) {
            StringBuilder sb = new StringBuilder("Multiple entries with same ");
            sb.append(str);
            sb.append(": ");
            sb.append(entry);
            sb.append(" and ");
            sb.append(entry2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m58578of(K k, V v, K k2, V v2) {
        C18053v.m59702a((Object) k, (Object) v);
        C18053v.m59702a((Object) k2, (Object) v2);
        return C17909cq.m59523a(2, new Object[]{k, v, k2, v2});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m58579of(K k, V v, K k2, V v2, K k3, V v3) {
        C18053v.m59702a((Object) k, (Object) v);
        C18053v.m59702a((Object) k2, (Object) v2);
        C18053v.m59702a((Object) k3, (Object) v3);
        return C17909cq.m59523a(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m58580of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C18053v.m59702a((Object) k, (Object) v);
        C18053v.m59702a((Object) k2, (Object) v2);
        C18053v.m59702a((Object) k3, (Object) v3);
        C18053v.m59702a((Object) k4, (Object) v4);
        return C17909cq.m59523a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m58581of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C18053v.m59702a((Object) k, (Object) v);
        C18053v.m59702a((Object) k2, (Object) v2);
        C18053v.m59702a((Object) k3, (Object) v3);
        C18053v.m59702a((Object) k4, (Object) v4);
        C18053v.m59702a((Object) k5, (Object) v5);
        return C17909cq.m59523a(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }
}
