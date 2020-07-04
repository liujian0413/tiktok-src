package com.bytedance.android.livesdk.log.p404a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a.a */
public abstract class C8410a<T> implements C8416g<T> {

    /* renamed from: a */
    private final Map<String, String> f23038a = new HashMap();

    /* renamed from: a */
    public final Map<String, String> mo21568a() {
        return this.f23038a;
    }

    /* renamed from: a */
    public final void mo21569a(String str) {
        this.f23038a.remove(str);
    }

    /* renamed from: a */
    public void mo21571a(Map<String, String> map) {
        map.putAll(this.f23038a);
    }

    /* renamed from: a */
    public final void mo21570a(String str, String str2) {
        this.f23038a.put(str, str2);
    }

    /* renamed from: a */
    public void mo21572a(Map<String, String> map, T t) {
        map.putAll(this.f23038a);
    }
}
