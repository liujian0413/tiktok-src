package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.play.core.splitinstall.o */
public final class C17142o {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f47864a = new HashMap();

    /* renamed from: a */
    public final C6565m mo44413a() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f47864a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new C6565m(Collections.unmodifiableMap(hashMap), 0);
    }

    /* renamed from: a */
    public final C17142o mo44414a(String str, String str2, String str3) {
        if (!this.f47864a.containsKey(str2)) {
            this.f47864a.put(str2, new HashMap());
        }
        ((Map) this.f47864a.get(str2)).put(str, str3);
        return this;
    }
}
