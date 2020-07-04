package com.p280ss.android.ugc.aweme.forward.p1271e;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.forward.e.d */
public final class C29903d {

    /* renamed from: a */
    private Map<String, C29902c> f78545a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.forward.e.d$a */
    static class C29904a {

        /* renamed from: a */
        public static final C29903d f78546a = new C29903d();
    }

    /* renamed from: a */
    public static C29903d m97930a() {
        return C29904a.f78546a;
    }

    /* renamed from: b */
    public final void mo75967b() {
        this.f78545a.clear();
    }

    /* renamed from: a */
    public final C29902c mo75965a(String str) {
        if (this.f78545a.isEmpty()) {
            return null;
        }
        return (C29902c) this.f78545a.get(str);
    }

    /* renamed from: a */
    public final void mo75966a(String str, C29902c cVar) {
        this.f78545a.put(str, cVar);
    }
}
