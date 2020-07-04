package com.p280ss.android.medialib.util;

import android.content.Context;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.medialib.util.b */
public final class C19791b {
    /* renamed from: a */
    public static String m65374a(Context context) {
        return C7285c.m22838a(context, "ShortVideo", 0).getString("DeviceId", null);
    }

    /* renamed from: b */
    public static Map<String, Integer> m65376b(Context context) {
        HashMap hashMap = new HashMap();
        for (Entry entry : C7285c.m22838a(context, "ShortVideo", 0).getAll().entrySet()) {
            if (((String) entry.getKey()).startsWith("PerfConfig_")) {
                hashMap.put(((String) entry.getKey()).substring(11), (Integer) entry.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m65375a(Context context, String str) {
        C7285c.m22838a(context, "ShortVideo", 0).edit().putString("DeviceId", str).apply();
    }
}
