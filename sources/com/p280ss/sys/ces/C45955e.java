package com.p280ss.sys.ces;

import com.p280ss.sys.ces.p1804c.C45943a;
import com.p280ss.sys.ces.p1804c.C45947e;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.e */
public final class C45955e {
    /* renamed from: a */
    private static JSONObject m144120a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", C45939c.m144082b());
            jSONObject.put("did", C45939c.m144085d());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m144121a(int i, String str, Object obj) {
        boolean z;
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", 2);
            jSONObject.put("event", str);
            StringBuilder sb = new StringBuilder();
            sb.append(Calendar.getInstance().getTimeInMillis());
            jSONObject.put("ts", sb.toString());
            jSONObject.put("commonInfo", m144120a());
            jSONObject.put("customInfo", obj);
            z = false;
        } catch (Throwable unused) {
            z = true;
        }
        if (!z) {
            StringBuilder sb2 = new StringBuilder("CZL-MMR-");
            sb2.append(2);
            new Thread(sb2.toString()) {
                public final void run() {
                    if (C45939c.f117415b) {
                        try {
                            new C45947e(C45939c.m144077a().f117425d, C45939c.m144087f(), 0).mo111269a(jSONObject.toString().getBytes());
                        } catch (Throwable unused) {
                        }
                    } else {
                        new C45943a(C45939c.m144077a().f117425d, C45939c.m144087f(), 0).mo50246a(1, 1, jSONObject.toString().getBytes());
                    }
                }
            }.start();
        }
    }
}
