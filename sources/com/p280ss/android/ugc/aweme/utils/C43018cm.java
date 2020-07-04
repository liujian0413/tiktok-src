package com.p280ss.android.ugc.aweme.utils;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.cm */
public final class C43018cm {
    /* renamed from: a */
    private static <K, V> HashMap<K, V> m136526a() {
        return new HashMap<>();
    }

    /* renamed from: b */
    private static <K, V> Map<K, V> m136530b() {
        return m136526a();
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m136527a(K k, V v) {
        Map<K, V> b = m136530b();
        b.put(k, v);
        return b;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m136528a(K k, V v, K k2, V v2) {
        Map<K, V> b = m136530b();
        b.put(k, v);
        b.put(k2, v2);
        return b;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m136529a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> b = m136530b();
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        b.put(k4, v4);
        b.put(k5, v5);
        return b;
    }
}
