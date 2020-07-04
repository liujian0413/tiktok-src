package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.dv */
final class C17997dv<K, V> extends C17750aw<K, V> {

    /* renamed from: a */
    private final Map<K, V> f49294a;

    /* renamed from: b */
    private Set<Entry<K, V>> f49295b;

    /* renamed from: com.google.common.collect.dv$a */
    final class C17999a extends C17852c<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Map<K, V> mo45869a() {
            return C17997dv.this;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C17992dq<K, Entry<K, V>>(C17997dv.this.keySet().iterator()) {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Entry<K, V> mo45666a(final K k) {
                    return new C18027g<K, V>() {
                        public final K getKey() {
                            return k;
                        }

                        public final V getValue() {
                            return C17997dv.this.get(k);
                        }

                        public final V setValue(V v) {
                            return C17997dv.this.put(k, v);
                        }
                    };
                }
            };
        }

        private C17999a() {
        }
    }

    /* access modifiers changed from: protected */
    public final Map<K, V> delegate() {
        return this.f49294a;
    }

    public final Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f49295b;
        if (set != null) {
            return set;
        }
        C17999a aVar = new C17999a();
        this.f49295b = aVar;
        return aVar;
    }

    private C17997dv(Map<K, V> map) {
        this.f49294a = map;
    }

    /* renamed from: a */
    static <K, V> C17997dv<K, V> m59638a(Map<K, V> map) {
        return new C17997dv<>(map);
    }
}
