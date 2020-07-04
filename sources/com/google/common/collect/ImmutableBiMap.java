package com.google.common.collect;

import com.google.common.collect.ImmutableMap.C17591a;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements C18050s<K, V> {

    /* renamed from: com.google.common.collect.ImmutableBiMap$a */
    public static final class C17578a<K, V> extends C17591a<K, V> {
        public C17578a() {
        }

        /* renamed from: a */
        public final ImmutableBiMap<K, V> mo45379b() {
            if (this.f48689c == 0) {
                return ImmutableBiMap.m58505of();
            }
            mo45456c();
            this.f48690d = true;
            return new C17907co(this.f48688b, this.f48689c);
        }

        /* renamed from: a */
        public final C17578a<K, V> mo45378b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            super.mo45378b(iterable);
            return this;
        }

        C17578a(int i) {
            super(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17578a<K, V> mo45376a(Entry<? extends K, ? extends V> entry) {
            super.mo45376a(entry);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17578a<K, V> mo45377a(Map<? extends K, ? extends V> map) {
            super.mo45377a(map);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17578a<K, V> mo45375a(K k, V v) {
            super.mo45375a(k, v);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableBiMap$b */
    static class C17579b extends C17597d {
        private static final long serialVersionUID = 0;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return mo45462a(new C17578a());
        }

        C17579b(ImmutableBiMap<?, ?> immutableBiMap) {
            super(immutableBiMap);
        }
    }

    ImmutableBiMap() {
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m58505of() {
        return C17907co.f49180a;
    }

    public abstract ImmutableBiMap<V, K> inverse();

    public static <K, V> C17578a<K, V> builder() {
        return new C17578a<>();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17579b(this);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public static <K, V> C17578a<K, V> builderWithExpectedSize(int i) {
        C18053v.m59700a(i, "expectedSize");
        return new C17578a<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        return new C17578a(i).mo45378b(iterable).mo45379b();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable<? extends Entry<? extends K, ? extends V>>) map.entrySet());
    }

    public V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m58506of(K k, V v) {
        C18053v.m59702a((Object) k, (Object) v);
        return new C17907co(new Object[]{k, v}, 1);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m58507of(K k, V v, K k2, V v2) {
        C18053v.m59702a((Object) k, (Object) v);
        C18053v.m59702a((Object) k2, (Object) v2);
        return new C17907co(new Object[]{k, v, k2, v2}, 2);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m58508of(K k, V v, K k2, V v2, K k3, V v3) {
        C18053v.m59702a((Object) k, (Object) v);
        C18053v.m59702a((Object) k2, (Object) v2);
        C18053v.m59702a((Object) k3, (Object) v3);
        return new C17907co(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m58509of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C18053v.m59702a((Object) k, (Object) v);
        C18053v.m59702a((Object) k2, (Object) v2);
        C18053v.m59702a((Object) k3, (Object) v3);
        C18053v.m59702a((Object) k4, (Object) v4);
        return new C17907co(new Object[]{k, v, k2, v2, k3, v3, k4, v4}, 4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m58510of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C18053v.m59702a((Object) k, (Object) v);
        C18053v.m59702a((Object) k2, (Object) v2);
        C18053v.m59702a((Object) k3, (Object) v3);
        C18053v.m59702a((Object) k4, (Object) v4);
        C18053v.m59702a((Object) k5, (Object) v5);
        return new C17907co(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }
}
