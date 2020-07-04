package com.bytedance.apm.p236a.p237b;

import com.bytedance.apm.C6159b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.a */
public final class C6152a {

    /* renamed from: a */
    public static String f18106a = "https://mon.snssdk.com/monitor/collect/c/logcollect";

    /* renamed from: a */
    public static void m19097a(String str) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str);
        sb.append("/monitor/collect/c/logcollect");
        f18106a = sb.toString();
    }

    /* renamed from: a */
    public static boolean m19098a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject) {
        try {
            C9549b bVar = new C9549b(f18106a, "UTF-8", false);
            bVar.mo23659a("aid", str);
            bVar.mo23659a("device_id", str2);
            bVar.mo23659a("os", "Android");
            bVar.mo23659a("process_name", str3);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    bVar.mo23658a(file2.getName(), file2, hashMap);
                }
            }
            bVar.mo23660a(jSONObject);
            try {
                JSONObject jSONObject2 = new JSONObject(bVar.mo23657a());
                if (jSONObject2.optInt("errno", -1) == 200) {
                    return true;
                }
                C6159b.m19102a("apm_event_stats_alog_fail", 6, jSONObject2);
                return false;
            } catch (JSONException e) {
                C6159b.m19102a("apm_event_stats_alog_fail", 7, (JSONObject) null);
                C2077a.m9161a((Throwable) e, "apm_alog");
            }
        } catch (IOException e2) {
            C6159b.m19102a("apm_event_stats_alog_fail", 8, (JSONObject) null);
            C2077a.m9161a((Throwable) e2, "apm_alog");
            return false;
        }
    }
}
