package com.p280ss.android.ugc.aweme.filter;

import com.google.common.collect.C17749av;
import com.google.common.collect.C17794bt;
import com.google.common.collect.C17863bz;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.bs */
public final class C29263bs<K, V> extends C17749av<K, V> {

    /* renamed from: a */
    private final C17794bt<K, V> f77202a = m95999d();

    /* renamed from: a */
    public final C17794bt<K, V> delegate() {
        return this.f77202a;
    }

    /* renamed from: c */
    public static <K, V> C29263bs<K, V> m95998c() {
        return new C29263bs<>();
    }

    C29263bs() {
    }

    /* renamed from: d */
    public static <K, V> C17794bt<K, V> m95999d() {
        return C17863bz.m59388a().mo46190b().mo46189b();
    }

    public final boolean put(K k, V v) {
        List list = get((Object) k);
        if (!list.contains(v)) {
            return list.add(v);
        }
        return false;
    }
}
