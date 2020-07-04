package com.bytedance.android.livesdk.message;

import android.text.TextUtils;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.log.C8444d;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.d */
public final class C8469d {

    /* renamed from: a */
    private static final Map<String, Object> f23173a = new HashMap();

    /* renamed from: a */
    private static void m25733a(String str, Map<String, Object> map) {
        map.put("event_name", str.toUpperCase());
        C8444d.m25673b().mo10003c("ttlive_msg", map);
    }

    /* renamed from: a */
    public static void m25731a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", "0");
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("stack_trace", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("error_msg", str);
        }
        C3172e.m12001a(C3171d.m11993b("ttlive_fetch_message"), 1, (Map<String, Object>) hashMap);
        m25733a(C3171d.m11993b("ttlive_fetch_message"), (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m25734a(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter));
        hashMap.put("error_code", "1");
        hashMap.put("method_name", str);
        hashMap.put("error_msg", th.getMessage());
        hashMap.put("stack_trace", stringWriter.toString());
        C3172e.m12001a(C3171d.m11993b("ttlive_fetch_message"), 1, (Map<String, Object>) hashMap);
        m25733a(C3171d.m11993b("ttlive_fetch_message"), (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m25732a(String str, String str2, long j) {
        f23173a.put("event_name", str);
        f23173a.put("method", str2);
        f23173a.put("msg_id", Long.valueOf(j));
        C8444d.m25673b().mo10001b("ttlive_msg", f23173a);
    }
}
