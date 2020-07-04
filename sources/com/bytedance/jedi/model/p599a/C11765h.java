package com.bytedance.jedi.model.p599a;

import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p605g.C11847a;
import com.bytedance.jedi.model.p605g.C11848b;
import com.bytedance.jedi.model.p605g.C11849c;
import com.bytedance.jedi.model.p605g.C11851e;
import com.bytedance.jedi.model.p605g.C11851e.C11852a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;

/* renamed from: com.bytedance.jedi.model.a.h */
public final class C11765h {

    /* renamed from: a */
    public static final Map<C11847a<?>, Map<?, C11848b<?>>> f31557a = new WeakHashMap();

    /* renamed from: a */
    public static final <K, V> Map<K, C11848b<Pair<K, V>>> m34491a(Map<?, ?> map) {
        if (map != null) {
            return C7577n.m23626f(map);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, com.bytedance.jedi.model.traceable.ITraceable<kotlin.Pair<K, V?>>?>");
    }

    /* renamed from: a */
    public static final <K, V> void m34492a(C11750c<K, V> cVar, K k, V v) {
        C11848b bVar;
        C7573i.m23587b(cVar, "$this$fire");
        C11785d a = C11783b.m34514a(cVar);
        if (!(a instanceof C11849c)) {
            a = null;
        }
        C11849c cVar2 = (C11849c) a;
        if (cVar2 != null) {
            if (f31557a.get(cVar) != null) {
                Object obj = f31557a.get(cVar);
                if (obj == null) {
                    C7573i.m23580a();
                }
                if (((Map) obj).get(k) != null) {
                    Object obj2 = f31557a.get(cVar);
                    if (obj2 == null) {
                        C7573i.m23580a();
                    }
                    Object obj3 = ((Map) obj2).get(k);
                    if (obj3 != null) {
                        bVar = (C11848b) obj3;
                        cVar2.mo29346b(bVar);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceable<kotlin.Pair<K, V?>>");
                }
            }
            bVar = C11852a.m34630a(C7579l.m23633a(k, v), new C11851e(C7579l.m23633a(k, v), new LinkedHashSet(), null));
            cVar2.mo29346b(bVar);
        }
    }

    /* renamed from: a */
    public static final <K, V> void m34493a(C11757e<K, V> eVar, K k, List<? extends V> list) {
        C11848b bVar;
        C7573i.m23587b(eVar, "$this$fire");
        C11785d a = C11783b.m34515a(eVar);
        if (!(a instanceof C11849c)) {
            a = null;
        }
        C11849c cVar = (C11849c) a;
        if (cVar != null) {
            if (f31557a.get(eVar) != null) {
                Object obj = f31557a.get(eVar);
                if (obj == null) {
                    C7573i.m23580a();
                }
                if (((Map) obj).get(k) != null) {
                    Object obj2 = f31557a.get(eVar);
                    if (obj2 == null) {
                        C7573i.m23580a();
                    }
                    Object obj3 = ((Map) obj2).get(k);
                    if (obj3 != null) {
                        bVar = ((C11848b) obj3).mo29375a(C7579l.m23633a(k, list));
                        cVar.mo29346b(bVar);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceable<kotlin.Pair<K, kotlin.collections.List<V>?>>");
                }
            }
            bVar = C11852a.m34630a(C7579l.m23633a(k, list), new C11851e(C7579l.m23633a(k, list), new LinkedHashSet(), null));
            cVar.mo29346b(bVar);
        }
    }
}
