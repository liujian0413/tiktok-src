package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.guava.cache.C11873a;
import com.bytedance.jedi.model.guava.cache.C11874b;
import com.bytedance.jedi.model.p599a.C11748b;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.model.ext.cache.guava.d */
public class C11817d<K, V> extends C11748b<K, V> {

    /* renamed from: a */
    private C7562b<? super V, ? extends Comparable<?>> f31611a;

    /* renamed from: b */
    private final C11815b<K, V> f31612b;

    /* renamed from: c */
    public final List<Pair<K, List<V>>> mo29336c() {
        return this.f31612b.mo29369b();
    }

    /* renamed from: d */
    public final void mo29337d() {
        this.f31612b.mo29367a();
    }

    /* renamed from: e */
    public final C7562b<V, Comparable<?>> mo29338e() {
        C7562b<? super V, ? extends Comparable<?>> bVar = this.f31611a;
        if (bVar == null) {
            return super.mo29338e();
        }
        return bVar;
    }

    /* renamed from: b */
    public final List<V> mo29333b(K k) {
        return this.f31612b.mo29366a(k);
    }

    private C11817d(long j) {
        C11873a aVar;
        if (j > 0) {
            aVar = C11874b.m34670a().mo29406a(j).mo29419n();
        } else {
            aVar = C11874b.m34670a().mo29419n();
        }
        C7573i.m23582a((Object) aVar, "if (maxSize > 0) CacheBu…lder.newBuilder().build()");
        this.f31612b = new C11815b<>(aVar);
    }

    /* renamed from: b */
    public final void mo29335b(K k, List<? extends V> list) {
        this.f31612b.mo29368a(k, list);
    }

    public /* synthetic */ C11817d(long j, int i, C7571f fVar) {
        this(-1);
    }
}
