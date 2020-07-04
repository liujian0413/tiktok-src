package com.bytedance.android.live.core.p148d;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.d.c */
public final class C3170c {
    /* renamed from: a */
    private static String m11988a(String str) {
        return C3171d.m11992a(str);
    }

    /* renamed from: b */
    private static String m11991b(String str) {
        return C3171d.m11993b(str);
    }

    /* renamed from: a */
    public static void m11989a(String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        C3172e.m11999a(m11988a("ttlive_image_load_status"), 0, j, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m11990a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("error_msg", str2);
        C3172e.m11999a(m11988a("ttlive_image_load_status"), 1, 0, (Map<String, Object>) hashMap);
        C3172e.m11999a(m11991b("ttlive_image_load_status"), 1, 0, (Map<String, Object>) hashMap);
    }
}
