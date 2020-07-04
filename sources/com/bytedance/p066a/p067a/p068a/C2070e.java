package com.bytedance.p066a.p067a.p068a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.a.a.a.e */
final class C2070e {

    /* renamed from: a */
    private final Map<String, C2068c> f7134a = new HashMap();

    /* renamed from: a */
    public final Collection<C2068c> mo7726a() {
        return this.f7134a.values();
    }

    C2070e() {
    }

    /* renamed from: b */
    public final boolean mo7728b(String str) {
        return this.f7134a.containsKey(str);
    }

    /* renamed from: a */
    public final C2068c mo7725a(String str) {
        return (C2068c) this.f7134a.get(str);
    }

    /* renamed from: a */
    public final void mo7727a(String str, C2068c cVar) {
        this.f7134a.put(str, cVar);
    }
}
