package com.bytedance.ies.bullet.core.model.p542a;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.model.a.b */
public final class C10403b {

    /* renamed from: a */
    private final Map<Class<?>, C10404c<?>> f28133a = new LinkedHashMap();

    /* renamed from: a */
    public final C10403b mo25198a() {
        C10403b bVar = new C10403b();
        bVar.mo25200a(this);
        return bVar;
    }

    /* renamed from: a */
    public final <T> C10404c<T> mo25199a(Class<T> cls) {
        C7573i.m23587b(cls, "clazz");
        C10404c<T> cVar = (C10404c) this.f28133a.get(cls);
        if (cVar == null) {
            return null;
        }
        if (cVar != null) {
            return cVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.model.context.IContextProvider<T>");
    }

    /* renamed from: b */
    public final <T> T mo25202b(Class<T> cls) {
        C7573i.m23587b(cls, "clazz");
        C10404c cVar = (C10404c) this.f28133a.get(cls);
        if (cVar != null) {
            T b = cVar.mo25197b();
            if (b != null) {
                if (!cls.isAssignableFrom(b.getClass())) {
                    b = null;
                }
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo25200a(C10403b bVar) {
        C7573i.m23587b(bVar, "other");
        this.f28133a.putAll(bVar.f28133a);
    }

    /* renamed from: b */
    public final <T> void mo25203b(Class<T> cls, T t) {
        C7573i.m23587b(cls, "clazz");
        m30778a(cls, (C10404c<? extends T>) new C10402a<Object>(t));
    }

    /* renamed from: a */
    private <T> void m30778a(Class<T> cls, C10404c<? extends T> cVar) {
        boolean z;
        C7573i.m23587b(cls, "clazz");
        C7573i.m23587b(cVar, "provider");
        C10404c<? extends T> cVar2 = (C10404c) this.f28133a.get(cls);
        if (cVar2 != null) {
            if (cVar2 == cVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cVar2 = null;
            }
            if (cVar2 != null) {
                cVar2.mo25110a();
            }
        }
        this.f28133a.put(cls, cVar);
    }

    /* renamed from: a */
    public final <T> void mo25201a(Class<T> cls, T t) {
        C7573i.m23587b(cls, "clazz");
        m30778a(cls, (C10404c<? extends T>) new C10405d<Object>(t));
    }
}
