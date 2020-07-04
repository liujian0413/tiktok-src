package com.bytedance.jedi.model.repository;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a;
import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.bytedance.jedi.model.p604f.C11821c;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.model.repository.c */
public abstract class C11995c {
    /* renamed from: a */
    public abstract <K, V, K1, V1> C11821c mo29602a(C11785d<K, V> dVar, C11785d<K1, V1> dVar2, C11801a<K, V, K1, V1> aVar);

    /* renamed from: a */
    public final <K, V, K1, V1> C11821c mo29603a(C11750c<K, V> cVar, C11757e<K1, V1> eVar, C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n> bVar) {
        C7573i.m23587b(cVar, "$this$predicatedSyncTo");
        C7573i.m23587b(eVar, "to");
        C7573i.m23587b(bVar, "block");
        C11785d a = C11783b.m34514a(cVar);
        C11785d a2 = C11783b.m34515a(eVar);
        C11811d dVar = new C11811d(null, null, 3, null);
        bVar.invoke(dVar);
        return mo29602a(a, a2, (C11801a<K, V, K1, V1>) dVar);
    }

    /* renamed from: b */
    public final <K, V, K1, V1> C11821c mo29606b(C11790b<K, V, ?, ?> bVar, C11757e<K1, V1> eVar, C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n> bVar2) {
        C7573i.m23587b(bVar, "$this$predicatedSyncTo");
        C7573i.m23587b(eVar, "to");
        C7573i.m23587b(bVar2, "block");
        C11785d a = C11783b.m34516a(bVar);
        C11785d a2 = C11783b.m34515a(eVar);
        C11811d dVar = new C11811d(null, null, 3, null);
        bVar2.invoke(dVar);
        return mo29602a(a, a2, (C11801a<K, V, K1, V1>) dVar);
    }

    /* renamed from: a */
    public final <K, V, K1, V1> C11821c mo29604a(C11757e<K, V> eVar, C11750c<K1, V1> cVar, C7562b<? super C11802a<K, List<V>, K1, V1>, C7581n> bVar) {
        C7573i.m23587b(eVar, "$this$batchSyncTo");
        C7573i.m23587b(cVar, "to");
        C7573i.m23587b(bVar, "block");
        C11785d a = C11783b.m34515a(eVar);
        C11785d a2 = C11783b.m34514a(cVar);
        C11802a aVar = new C11802a(null, null, 3, null);
        bVar.invoke(aVar);
        return mo29602a(a, a2, (C11801a<K, V, K1, V1>) aVar);
    }

    /* renamed from: a */
    public final <K, V, K1, V1> C11821c mo29605a(C11790b<K, V, ?, ?> bVar, C11757e<K1, V1> eVar, C7562b<? super C11808c<K, V, K1, List<V1>>, C7581n> bVar2) {
        C7573i.m23587b(bVar, "$this$keySyncTo");
        C7573i.m23587b(eVar, "to");
        C7573i.m23587b(bVar2, "block");
        C11785d a = C11783b.m34516a(bVar);
        C11785d a2 = C11783b.m34515a(eVar);
        C11808c cVar = new C11808c(null, null, 3, null);
        bVar2.invoke(cVar);
        return mo29602a(a, a2, (C11801a<K, V, K1, V1>) cVar);
    }
}
