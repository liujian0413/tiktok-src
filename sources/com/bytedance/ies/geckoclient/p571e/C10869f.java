package com.bytedance.ies.geckoclient.p571e;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.geckoclient.e.f */
public final class C10869f {

    /* renamed from: b */
    private static C10869f f29402b = new C10869f();

    /* renamed from: a */
    public boolean f29403a;

    /* renamed from: c */
    private Map<String, C10870a> f29404c = new ConcurrentHashMap();

    /* renamed from: com.bytedance.ies.geckoclient.e.f$a */
    public interface C10870a {
        /* renamed from: a */
        void mo26204a(String str);

        /* renamed from: b */
        void mo26205b(String str);
    }

    /* renamed from: a */
    public static C10869f m31887a() {
        return f29402b;
    }

    /* renamed from: b */
    public final void mo26201b() {
        this.f29403a = true;
    }

    /* renamed from: c */
    public final void mo26203c() {
        this.f29403a = false;
    }

    private C10869f() {
    }

    /* renamed from: a */
    public final void mo26199a(String str) {
        if (str != null) {
            C10870a aVar = (C10870a) this.f29404c.get(str);
            if (aVar != null) {
                aVar.mo26204a(str);
            }
        }
    }

    /* renamed from: b */
    public final void mo26202b(String str) {
        if (str != null) {
            C10870a aVar = (C10870a) this.f29404c.get(str);
            if (aVar != null) {
                aVar.mo26205b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo26200a(String str, C10870a aVar) {
        if (str != null) {
            this.f29404c.put(str, aVar);
        }
    }
}
