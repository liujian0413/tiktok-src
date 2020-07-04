package com.bytedance.jedi.model.repository;

import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p603e.C11801a;
import com.bytedance.jedi.model.p604f.C11819a;
import com.bytedance.jedi.model.p604f.C11821c;
import com.bytedance.jedi.model.repository.C11991a.C11992a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.repository.b */
public abstract class C11994b extends C11995c implements C11821c, C11991a {

    /* renamed from: a */
    private final C11819a f31892a = new C11819a();

    /* renamed from: a */
    public final void mo29370a() {
        this.f31892a.mo29370a();
    }

    /* renamed from: a */
    public final <K, V, K1, V1> C11821c mo29602a(C11785d<K, V> dVar, C11785d<K1, V1> dVar2, C11801a<K, V, K1, V1> aVar) {
        C7573i.m23587b(dVar, "from");
        C7573i.m23587b(dVar2, "to");
        C7573i.m23587b(aVar, "mergeStrategy");
        C11821c a = C11992a.m35060a(this, dVar, dVar2, aVar);
        this.f31892a.mo29371a(a);
        return a;
    }
}
