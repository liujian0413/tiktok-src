package com.p280ss.android.ttve.monitor;

import com.p280ss.android.vesdk.C45372t;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.a */
public final class C20469a {

    /* renamed from: a */
    private static C20470a f55309a;

    /* renamed from: com.ss.android.ttve.monitor.a$a */
    public interface C20470a {
        /* renamed from: a */
        void mo55138a(String str, JSONObject jSONObject, String str2, String str3, String str4);
    }

    /* renamed from: a */
    public static void m67903a() {
        ApplogUtilsInvoker.nativeInit();
    }

    /* renamed from: a */
    public static synchronized void m67904a(C20470a aVar) {
        synchronized (C20469a.class) {
            f55309a = aVar;
        }
    }

    /* renamed from: a */
    public static void m67905a(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        m67906a(str, jSONObject, str3);
    }

    /* renamed from: a */
    public static void m67906a(String str, JSONObject jSONObject, String str2) {
        if (f55309a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("6.0.0.96");
            sb.append("-mt");
            String sb2 = sb.toString();
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            try {
                jSONObject2.put("sdkVersion", sb2);
            } catch (JSONException unused) {
            }
            if ("mt".endsWith("mt")) {
                try {
                    jSONObject2.put("second_appid", "2780");
                    jSONObject2.put("second_appname", "vesdk_abroad");
                } catch (JSONException unused2) {
                }
            }
            StringBuilder sb3 = new StringBuilder("onInternalEventV3 ");
            sb3.append(str);
            sb3.append(": ");
            sb3.append(jSONObject2);
            C45372t.m143405b("ApplogUtils", sb3.toString());
            f55309a.mo55138a(str, jSONObject2, "1357", "VESDK", str2);
        }
    }
}
