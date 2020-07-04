package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.guava.cache.C11873a;
import com.bytedance.jedi.model.guava.cache.C11874b;
import com.bytedance.jedi.model.p599a.C11747a;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.ext.cache.guava.c */
public class C11816c<K, V> extends C11747a<K, V> {

    /* renamed from: a */
    private final C11814a<K, V> f31610a;

    /* renamed from: b */
    public final List<Pair<K, V>> mo29328b() {
        return this.f31610a.mo29364a();
    }

    /* renamed from: b */
    public final V mo29327b(K k) {
        return this.f31610a.mo29363a(k);
    }

    private C11816c(long j) {
        C11873a aVar;
        if (j > 0) {
            aVar = C11874b.m34670a().mo29406a(j).mo29419n();
        } else {
            aVar = C11874b.m34670a().mo29419n();
        }
        C7573i.m23582a((Object) aVar, "if (maxSize > 0) CacheBu…lder.newBuilder().build()");
        this.f31610a = new C11814a<>(aVar);
    }

    /* renamed from: b */
    public final void mo29329b(K k, V v) {
        this.f31610a.mo29365a(k, v);
    }

    public /* synthetic */ C11816c(long j, int i, C7571f fVar) {
        this(-1);
    }
}
