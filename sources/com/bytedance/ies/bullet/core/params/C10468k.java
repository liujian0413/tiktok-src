package com.bytedance.ies.bullet.core.params;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.params.k */
public final class C10468k<T> implements C10465h<T> {

    /* renamed from: a */
    private final Map<Class<?>, C7563m<?, String, ?>> f28184a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<Class<?>, C48006q<?, String, ?, ?>> f28185b = new LinkedHashMap();

    /* renamed from: c */
    private final Class<T> f28186c;

    /* renamed from: a */
    private Class<T> m30835a() {
        return this.f28186c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParamType: ");
        sb.append(m30835a().getCanonicalName());
        return sb.toString();
    }

    public C10468k(Class<T> cls) {
        C7573i.m23587b(cls, "type");
        this.f28186c = cls;
    }

    /* renamed from: a */
    public final <R> C7563m<R, String, T> mo25255a(Class<R> cls) {
        C7573i.m23587b(cls, "inputType");
        C7563m mVar = (C7563m) this.f28184a.get(cls);
        if (mVar == null) {
            return null;
        }
        if (mVar != null) {
            return (C7563m) C7577n.m23617a((Object) mVar, 2);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.params.Parser<R, T> /* = (R, kotlin.String) -> T? */");
    }

    /* renamed from: b */
    public final <R> C48006q<R, String, T, R> mo25258b(Class<R> cls) {
        C7573i.m23587b(cls, "inputType");
        C48006q qVar = (C48006q) this.f28185b.get(cls);
        if (qVar == null) {
            return null;
        }
        if (qVar != null) {
            return (C48006q) C7577n.m23617a((Object) qVar, 3);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.params.Builder<R, T> /* = (R, kotlin.String, T) -> R */");
    }

    /* renamed from: a */
    public final <R> void mo25256a(Class<R> cls, C7563m<? super R, ? super String, ? extends T> mVar) {
        C7573i.m23587b(cls, "inputType");
        C7573i.m23587b(mVar, "parser");
        this.f28184a.put(cls, mVar);
    }

    /* renamed from: a */
    public final <R> void mo25257a(Class<R> cls, C48006q<? super R, ? super String, ? super T, ? extends R> qVar) {
        C7573i.m23587b(cls, "inputType");
        C7573i.m23587b(qVar, "builder");
        this.f28185b.put(cls, qVar);
    }
}
