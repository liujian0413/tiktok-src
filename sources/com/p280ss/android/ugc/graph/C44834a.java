package com.p280ss.android.ugc.graph;

import com.p280ss.android.ugc.graph.C7289f.C7292c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.graph.a */
class C44834a implements C7292c {

    /* renamed from: a */
    public Map<String, C7292c> f115324a = new HashMap();

    /* renamed from: a */
    public <T> T mo19025a(Object obj, Class<T> cls) {
        return null;
    }

    C44834a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107272a(C44834a aVar) {
        this.f115324a.putAll(aVar.f115324a);
    }

    /* renamed from: a */
    static String m141499a(Class cls) {
        String name = cls.getName();
        StringBuilder sb = new StringBuilder("com.ss.android.ugc.graph.ComponentDelegateHolder");
        sb.append(Math.abs(name.trim().hashCode()));
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107273a(Class cls, C7292c cVar) {
        this.f115324a.put(m141499a(cls), cVar);
    }
}
