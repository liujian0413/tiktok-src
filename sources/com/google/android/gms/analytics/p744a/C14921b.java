package com.google.android.gms.analytics.p744a;

import com.google.android.gms.analytics.C14931j;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.a.b */
public final class C14921b {

    /* renamed from: a */
    private Map<String, String> f38591a;

    /* renamed from: a */
    public final Map<String, String> mo37978a() {
        return new HashMap(this.f38591a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f38591a.entrySet()) {
            if (((String) entry.getKey()).startsWith("&")) {
                hashMap.put(((String) entry.getKey()).substring(1), (String) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return C14931j.m43372a((Map) hashMap);
    }
}
