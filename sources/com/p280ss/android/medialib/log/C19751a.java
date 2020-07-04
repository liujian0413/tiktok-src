package com.p280ss.android.medialib.log;

import android.text.TextUtils;
import com.p280ss.android.medialib.common.C19706c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.medialib.log.a */
public class C19751a {

    /* renamed from: a */
    public static IMonitor f53600a = null;

    /* renamed from: b */
    private static final String f53601b = "a";

    /* renamed from: a */
    public static void m65121a() {
        f53600a = null;
    }

    /* renamed from: a */
    public static void m65122a(IMonitor iMonitor) {
        f53600a = iMonitor;
    }

    /* renamed from: a */
    public static boolean m65124a(String str, String str2, Map map) {
        return m65123a(f53600a, str, str2, map);
    }

    /* renamed from: a */
    private static boolean m65123a(IMonitor iMonitor, String str, String str2, Map map) {
        if (iMonitor == null) {
            C19706c.m64970b(f53601b, "No monitor callback, return");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, map.get(str3));
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str2);
                }
            }
            if (iMonitor != null) {
                iMonitor.monitorLog(str, jSONObject);
            }
            return true;
        } catch (JSONException unused) {
            C19706c.m64970b(f53601b, "No monitor callback, skip");
            return false;
        }
    }
}
