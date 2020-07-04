package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.guava.cache.C11873a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.ext.cache.guava.a */
public final class C11814a<K, V> {

    /* renamed from: a */
    private final C11873a<K, V> f31608a;

    /* renamed from: a */
    public final List<Pair<K, V>> mo29364a() {
        List<Pair<K, V>> arrayList = new ArrayList<>();
        ConcurrentMap b = this.f31608a.mo29403b();
        C7573i.m23582a((Object) b, "mRealCache.asMap()");
        for (Entry entry : b.entrySet()) {
            arrayList.add(C7579l.m23633a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final V mo29363a(K k) {
        return this.f31608a.mo29400a(k);
    }

    public C11814a(C11873a<K, V> aVar) {
        C7573i.m23587b(aVar, "mRealCache");
        this.f31608a = aVar;
    }

    /* renamed from: a */
    public final void mo29365a(K k, V v) {
        if (v != null) {
            this.f31608a.mo29402a(k, v);
        } else {
            this.f31608a.mo29404b(k);
        }
    }
}
