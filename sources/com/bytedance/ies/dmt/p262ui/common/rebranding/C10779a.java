package com.bytedance.ies.dmt.p262ui.common.rebranding;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.a */
public final class C10779a {

    /* renamed from: a */
    private static final HashMap<Class, C10780a> f28897a = new HashMap<>();

    /* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.a$a */
    public static class C10780a {

        /* renamed from: a */
        public boolean f28898a = true;

        /* renamed from: b */
        public int f28899b = -1;

        public C10780a(int i) {
            this.f28899b = i;
        }
    }

    /* renamed from: a */
    public static void m31457a() {
        synchronized (f28897a) {
            for (Entry value : f28897a.entrySet()) {
                C10780a aVar = (C10780a) value.getValue();
                if (aVar != null) {
                    aVar.f28898a = false;
                    aVar.f28899b = -1;
                }
            }
        }
    }

    /* renamed from: a */
    public static C10780a m31456a(Class cls) {
        C10780a aVar;
        synchronized (f28897a) {
            aVar = (C10780a) f28897a.get(cls);
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m31458a(Class cls, C10780a aVar) {
        synchronized (f28897a) {
            f28897a.put(cls, aVar);
        }
    }
}
