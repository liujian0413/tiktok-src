package com.bytedance.jedi.model.p599a;

import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p601c.C11788f;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.jedi.model.a.a */
public abstract class C11747a<K, V> implements C11750c<K, V> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract V mo29327b(K k);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<Pair<K, V>> mo29328b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo29329b(K k, V v);

    /* renamed from: a */
    public final C7492s<List<Pair<K, V>>> mo29324a() {
        C7492s<List<Pair<K, V>>> b = C7492s.m23301b(mo29328b());
        C7573i.m23582a((Object) b, "Observable.just(getAllActual())");
        return b;
    }

    /* renamed from: a */
    public final C7492s<C11786e<V>> mo29325a(K k) {
        C7492s<C11786e<V>> b = C7492s.m23301b(C11788f.m34527a(mo29327b(k)));
        C7573i.m23582a((Object) b, "Observable.just(getActual(k).optional())");
        return b;
    }

    /* renamed from: a */
    public final void mo29326a(K k, V v) {
        C11747a aVar = this;
        aVar.mo29329b(k, v);
        C11765h.m34492a((C11750c<K, V>) aVar, k, v);
    }
}
