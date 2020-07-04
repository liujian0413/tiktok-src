package com.bytedance.crash.p504l;

import android.text.TextUtils;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.event.C9887a;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9898c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.l.p */
public final class C9996p {
    /* renamed from: a */
    public static void m29626a(C9896a aVar, C9898c cVar, CrashType crashType) {
        if (aVar != null) {
            m29627a(aVar.f26984a, cVar, crashType);
        }
    }

    /* renamed from: a */
    public static void m29627a(JSONObject jSONObject, C9898c cVar, CrashType crashType) {
        if (jSONObject != null && crashType != null) {
            long optLong = jSONObject.optLong("crash_time");
            int c = C9887a.m29180c(C9887a.m29178b("aid"));
            String a = C9918j.m29338c().mo24593a();
            if (optLong > 0 && c > 0 && !TextUtils.isEmpty(a) && !"0".equals(a) && !TextUtils.isEmpty(crashType.getName())) {
                try {
                    StringBuilder sb = new StringBuilder("android_");
                    sb.append(c);
                    sb.append("_");
                    sb.append(a);
                    sb.append("_");
                    sb.append(optLong);
                    sb.append("_");
                    sb.append(crashType);
                    String sb2 = sb.toString();
                    if (cVar != null) {
                        JSONObject jSONObject2 = cVar.f26992a;
                        if (jSONObject2 != null) {
                            jSONObject2.put("unique_key", sb2);
                        }
                    } else {
                        jSONObject.put("unique_key", sb2);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}
