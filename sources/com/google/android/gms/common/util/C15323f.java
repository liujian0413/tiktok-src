package com.google.android.gms.common.util;

import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0888a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.util.f */
public final class C15323f {
    /* renamed from: a */
    public static <T> List<T> m44565a(T t) {
        return Collections.singletonList(t);
    }

    /* renamed from: a */
    public static <T> List<T> m44566a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList(tArr));
    }

    /* renamed from: a */
    private static <T> Set<T> m44569a(int i, boolean z) {
        if (i <= 256) {
            return new C0888a(i);
        }
        return new HashSet(i, 1.0f);
    }

    /* renamed from: b */
    public static <T> Set<T> m44571b(T... tArr) {
        Set a = m44569a(7, false);
        Collections.addAll(a, tArr);
        return Collections.unmodifiableSet(a);
    }

    /* renamed from: b */
    private static <K, V> Map<K, V> m44570b(int i, boolean z) {
        if (i <= 256) {
            return new ArrayMap(i);
        }
        return new HashMap(i, 1.0f);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m44567a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b = m44570b(3, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return Collections.unmodifiableMap(b);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m44568a(K[] kArr, V[] vArr) {
        Map b = m44570b(7, false);
        for (int i = 0; i < 7; i++) {
            b.put(kArr[i], vArr[i]);
        }
        return Collections.unmodifiableMap(b);
    }
}
