package com.bytedance.android.livesdk.p406m;

import com.bytedance.android.live.api.exceptions.ApiException;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.m.a */
public final class C8450a {
    /* renamed from: a */
    private static String m25690a(String str) {
        return C3171d.m11992a(str);
    }

    /* renamed from: b */
    private static String m25693b(String str) {
        return C3171d.m11993b(str);
    }

    /* renamed from: a */
    public static void m25691a(int i, long j, long j2, long j3) {
        String str;
        if (i == 1) {
            str = "ttlive_follow";
        } else {
            str = "ttlive_unfollow";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("proponent_id", Long.valueOf(j));
        hashMap.put("adopter_id", Long.valueOf(j2));
        hashMap.put("room_id", Long.valueOf(j3));
        C3172e.m12001a(m25690a(str), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m25692a(int i, long j, long j2, long j3, Throwable th) {
        String str;
        if (i == 1) {
            str = "ttlive_follow";
        } else {
            str = "ttlive_unfollow";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("proponent_id", Long.valueOf(j));
        hashMap.put("adopter_id", Long.valueOf(j2));
        hashMap.put("room_id", Long.valueOf(j3));
        String str2 = "";
        if (th != null) {
            str2 = th.getMessage();
            if (th instanceof ApiException) {
                hashMap.put("error_code", Integer.valueOf(((ApiException) th).getErrorCode()));
            }
        }
        hashMap.put("error_msg", str2);
        C3172e.m12001a(m25690a(str), 1, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25693b(str), 1, (Map<String, Object>) hashMap);
    }
}
