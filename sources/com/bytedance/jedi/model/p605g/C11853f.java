package com.bytedance.jedi.model.p605g;

import com.bytedance.jedi.model.p608h.C11968l;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p354j.C7486b;
import p346io.reactivex.p354j.C7489f;

/* renamed from: com.bytedance.jedi.model.g.f */
public final class C11853f<K, V> implements C11849c<Pair<? extends K, ? extends V>> {

    /* renamed from: a */
    private final C7489f<C11848b<Pair<K, V>>> f31655a;

    /* renamed from: b */
    private final C11847a<Pair<K, V>> f31656b;

    /* renamed from: b */
    public final C7492s<C11848b<Pair<K, V>>> mo29345b() {
        C7492s<C11848b<Pair<K, V>>> i = this.f31655a.mo19330i();
        C7573i.m23582a((Object) i, "subject.share()");
        return i;
    }

    public C11853f(C11847a<Pair<K, V>> aVar) {
        C7573i.m23587b(aVar, "tracePoint");
        this.f31656b = aVar;
        C7489f<C11848b<Pair<K, V>>> n = C7486b.m23223a().mo19260n();
        C7573i.m23582a((Object) n, "PublishSubject.create<IT…K, V?>>>().toSerialized()");
        this.f31655a = n;
    }

    /* renamed from: b */
    public final void mo29346b(C11848b<Pair<K, V>> bVar) {
        C7573i.m23587b(bVar, "traceable");
        C7489f<C11848b<Pair<K, V>>> fVar = this.f31655a;
        C11968l.m35056a(bVar, this.f31656b);
        bVar.mo29379b(this.f31656b);
        fVar.onNext(bVar);
    }
}
