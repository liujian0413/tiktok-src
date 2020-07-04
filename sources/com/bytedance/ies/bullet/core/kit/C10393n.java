package com.bytedance.ies.bullet.core.kit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.n */
public final class C10393n implements C10387l {

    /* renamed from: a */
    private final Map<Class<? extends C10378c<?, ?, ?, ?>>, C10382g> f28121a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo25110a() {
        Map<Class<? extends C10378c<?, ?, ?, ?>>, C10382g> map = this.f28121a;
        for (Entry value : map.entrySet()) {
            ((C10382g) value.getValue()).mo25164f();
        }
        map.clear();
    }

    /* renamed from: a */
    public final <T extends C10378c<?, ?, ?, ?>> C10382g mo25067a(Class<? extends T> cls) {
        C7573i.m23587b(cls, "clazz");
        return (C10382g) this.f28121a.get(cls);
    }

    /* renamed from: a */
    public final C10382g mo25068a(String str) {
        C7573i.m23587b(str, "sessionId");
        for (Entry entry : this.f28121a.entrySet()) {
            if (C7573i.m23585a((Object) ((C10382g) entry.getValue()).mo25158a().f28131a, (Object) str)) {
                return (C10382g) entry.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <T extends C10378c<?, ?, ?, ?>> void mo25166a(Class<? extends T> cls, C10382g gVar) {
        C7573i.m23587b(cls, "clazz");
        C7573i.m23587b(gVar, "instance");
        this.f28121a.put(cls, gVar);
    }
}
