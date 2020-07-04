package com.appsflyer;

import com.C1642a;
import org.json.JSONException;
import org.json.JSONObject;

public class ServerConfigHandler {
    public static String getUrl(String str) {
        return C1642a.m8034a(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLib.getInstance().getHostName()});
    }

    /* renamed from: ˎ */
    static JSONObject m8729(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            try {
                if (jSONObject.optBoolean("monitor", false)) {
                    C1899s.m8812().mo7508();
                } else {
                    C1899s.m8812().mo7511();
                    C1899s.m8812().mo7513();
                }
            } catch (JSONException unused) {
                C1899s.m8812().mo7511();
                C1899s.m8812().mo7513();
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                AFLogger.afErrorLog(th.getMessage(), th);
                C1899s.m8812().mo7511();
                C1899s.m8812().mo7513();
                return jSONObject;
            }
        } catch (JSONException unused2) {
            jSONObject = null;
            C1899s.m8812().mo7511();
            C1899s.m8812().mo7513();
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject = null;
            AFLogger.afErrorLog(th.getMessage(), th);
            C1899s.m8812().mo7511();
            C1899s.m8812().mo7513();
            return jSONObject;
        }
        return jSONObject;
    }
}
