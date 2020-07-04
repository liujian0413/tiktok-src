package com.bytedance.jedi.model.p601c;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p599a.C11751d;
import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p599a.C11758f;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p602d.C11791c;
import com.bytedance.jedi.model.p605g.C11847a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.c.b */
public final class C11783b {
    /* renamed from: a */
    private static String m34517a(C11847a<?> aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.getClass());
        sb.append('_');
        sb.append(aVar.hashCode());
        return sb.toString();
    }

    /* renamed from: a */
    public static final <K, V> C11785d<K, V> m34514a(C11750c<K, V> cVar) {
        C7573i.m23587b(cVar, "$this$asDataSource");
        C11847a aVar = cVar;
        C11785d<K, V> a = C11784c.f31578a.mo29354a(m34517a(aVar));
        if (a == null) {
            a = C11751d.m34457a(cVar);
            C11784c.f31578a.mo29355a(m34517a(aVar), a);
        }
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.datasource.IDataSource<K, V>");
    }

    /* renamed from: a */
    public static final <K, V> C11785d<K, List<V>> m34515a(C11757e<K, V> eVar) {
        C7573i.m23587b(eVar, "$this$asDataSource");
        C11847a aVar = eVar;
        C11785d<K, List<V>> a = C11784c.f31578a.mo29354a(m34517a(aVar));
        if (a == null) {
            a = C11758f.m34474a(eVar);
            C11784c.f31578a.mo29355a(m34517a(aVar), a);
        }
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.datasource.IDataSource<K, V>");
    }

    /* renamed from: a */
    public static final <K, V, REQ, RESP> C11785d<K, V> m34516a(C11790b<K, V, REQ, RESP> bVar) {
        C7573i.m23587b(bVar, "$this$asDataSource");
        C11847a aVar = bVar;
        C11785d<K, V> a = C11784c.f31578a.mo29354a(m34517a(aVar));
        if (a == null) {
            a = C11791c.m34535a(bVar);
            C11784c.f31578a.mo29355a(m34517a(aVar), a);
        }
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.datasource.IDataSource<K, V>");
    }
}
