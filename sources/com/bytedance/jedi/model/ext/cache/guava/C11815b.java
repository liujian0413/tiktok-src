package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.guava.cache.C11873a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.ext.cache.guava.b */
public final class C11815b<K, V> {

    /* renamed from: a */
    private final C11873a<K, List<V>> f31609a;

    /* renamed from: a */
    public final void mo29367a() {
        this.f31609a.mo29401a();
    }

    /* renamed from: b */
    public final List<Pair<K, List<V>>> mo29369b() {
        List<Pair<K, List<V>>> arrayList = new ArrayList<>();
        ConcurrentMap b = this.f31609a.mo29403b();
        C7573i.m23582a((Object) b, "mRealCache.asMap()");
        for (Entry entry : b.entrySet()) {
            arrayList.add(C7579l.m23633a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public C11815b(C11873a<K, List<V>> aVar) {
        C7573i.m23587b(aVar, "mRealCache");
        this.f31609a = aVar;
    }

    /* renamed from: a */
    public final List<V> mo29366a(K k) {
        return (List) this.f31609a.mo29400a(k);
    }

    /* renamed from: a */
    public final void mo29368a(K k, List<? extends V> list) {
        if (list != null) {
            this.f31609a.mo29402a(k, list);
        } else {
            this.f31609a.mo29404b(k);
        }
    }
}
