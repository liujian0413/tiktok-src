package com.p280ss.android.ttve.editorInfo;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ttve.editorInfo.a */
public class C20455a {

    /* renamed from: a */
    private static final String f55248a = "a";

    /* renamed from: b */
    private static ConcurrentHashMap<String, Object> f55249b;

    /* renamed from: a */
    public static void m67869a() {
        TEEditorInfoInvoker.nativeInit();
        f55249b = new ConcurrentHashMap<>();
    }

    /* renamed from: b */
    public static Map<String, Object> m67874b() {
        if (f55249b == null) {
            return null;
        }
        f55249b.put("te_os", Integer.valueOf(1));
        f55249b.put("te_system", Integer.valueOf(VERSION.SDK_INT));
        f55249b.put("te_user_device", Build.MODEL);
        f55249b.put("te_ve_version", "6.0.0.96");
        f55249b.put("te_effect_version", "6.0.0_rel_15_douyin_MT_202001141700_1611d1aa7c");
        return f55249b;
    }

    /* renamed from: a */
    public static void m67870a(String str, float f) {
        if (f55249b != null) {
            f55249b.put(str, Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public static void m67871a(String str, long j) {
        if (f55249b != null) {
            f55249b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static void m67872a(String str, String str2) {
        if (f55249b != null) {
            f55249b.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m67873a(String str, HashMap hashMap) {
        if (f55249b != null) {
            f55249b.put(str, hashMap);
        }
    }
}
