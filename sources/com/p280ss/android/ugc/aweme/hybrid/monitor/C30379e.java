package com.p280ss.android.ugc.aweme.hybrid.monitor;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.e */
public final class C30379e {

    /* renamed from: a */
    private final Map<Class<?>, C30390j<?>> f79868a = new LinkedHashMap();

    /* renamed from: a */
    public final <T> T mo79983a(Class<T> cls) {
        C7573i.m23587b(cls, "clazz");
        C30390j jVar = (C30390j) this.f79868a.get(cls);
        if (jVar != null) {
            T a = jVar.mo79978a();
            if (a != null) {
                if (!cls.isAssignableFrom(a.getClass())) {
                    a = null;
                }
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo79984a(Class<T> cls, C30390j<? extends T> jVar) {
        C7573i.m23587b(cls, "clazz");
        C7573i.m23587b(jVar, "provider");
        C30390j jVar2 = (C30390j) this.f79868a.get(cls);
        if (jVar2 != null) {
            jVar2.mo79979b();
        }
        this.f79868a.put(cls, jVar);
    }
}
