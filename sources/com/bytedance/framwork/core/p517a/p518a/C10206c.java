package com.bytedance.framwork.core.p517a.p518a;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.a.a.c */
public final class C10206c {

    /* renamed from: a */
    private static C10205b f27752a = new C10204a();

    /* renamed from: b */
    private static ConcurrentHashMap<String, C10205b> f27753b;

    static {
        ConcurrentHashMap<String, C10205b> concurrentHashMap = new ConcurrentHashMap<>();
        f27753b = concurrentHashMap;
        concurrentHashMap.put("default", f27752a);
    }

    /* renamed from: a */
    public static int m30284a(String str) {
        if (TextUtils.isEmpty(str) || f27753b.get(str) == null) {
            return f27752a.reportInterval();
        }
        return ((C10205b) f27753b.get(str)).reportInterval();
    }

    /* renamed from: b */
    public static int m30287b(String str) {
        if (TextUtils.isEmpty(str) || f27753b.get(str) == null) {
            return f27752a.reportCount();
        }
        return ((C10205b) f27753b.get(str)).reportCount();
    }

    /* renamed from: c */
    public static JSONObject m30288c(String str) {
        if (TextUtils.isEmpty(str) || f27753b.get(str) == null) {
            return f27752a.reportJsonHeaderInfo();
        }
        return ((C10205b) f27753b.get(str)).reportJsonHeaderInfo();
    }

    /* renamed from: d */
    public static int m30289d(String str) {
        if (TextUtils.isEmpty(str) || f27753b.get(str) == null) {
            return f27752a.reportFailRepeatCount();
        }
        return ((C10205b) f27753b.get(str)).reportFailRepeatCount();
    }

    /* renamed from: e */
    public static int m30290e(String str) {
        if (TextUtils.isEmpty(str) || f27753b.get(str) == null) {
            return f27752a.reportFailRepeatBaseTime() * 1000;
        }
        return ((C10205b) f27753b.get(str)).reportFailRepeatBaseTime() * 1000;
    }

    /* renamed from: f */
    public static long m30291f(String str) {
        if (TextUtils.isEmpty(str) || f27753b.get(str) == null) {
            return f27752a.stopMoreChannelInterval();
        }
        return ((C10205b) f27753b.get(str)).stopMoreChannelInterval();
    }

    /* renamed from: g */
    public static boolean m30292g(String str) {
        if (TextUtils.isEmpty(str) || f27753b.get(str) == null) {
            return f27752a.getRemoveSwitch();
        }
        return ((C10205b) f27753b.get(str)).getRemoveSwitch();
    }

    /* renamed from: a */
    public static void m30286a(String str, C10205b bVar) {
        f27753b.put(str, bVar);
    }

    /* renamed from: a */
    public static List<String> m30285a(String str, String str2) {
        if (TextUtils.isEmpty(str) || f27753b.get(str) == null) {
            return f27752a.reportUrl(str2);
        }
        return ((C10205b) f27753b.get(str)).reportUrl(str2);
    }
}
