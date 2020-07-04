package com.bytedance.apm.p249l;

import com.bytedance.apm.p236a.p237b.C9549b;
import com.bytedance.frameworks.core.thread.C6370a;
import com.bytedance.frameworks.core.thread.C6371c;
import com.bytedance.services.apm.api.C12915d;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.a */
public final class C6265a {

    /* renamed from: a */
    public static String f18457a = "https://mon.snssdk.com/monitor/collect/c/logcollect";

    /* renamed from: a */
    public static void m19436a(boolean z) {
        if (z) {
            f18457a = "https://i.isnssdk.com/monitor/collect/c/logcollect";
        }
    }

    /* renamed from: a */
    public static void m19435a(String str) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str);
        sb.append("/monitor/collect/c/logcollect");
        f18457a = sb.toString();
    }

    /* renamed from: a */
    public final void mo15049a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject, C12915d dVar) {
        C6370a.m19801a();
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final List<String> list2 = list;
        final String str8 = str4;
        final JSONObject jSONObject2 = jSONObject;
        final C12915d dVar2 = dVar;
        C62661 r0 = new C6371c() {
            public final void run() {
                C6265a.m19437b(str5, str6, str7, list2, str8, jSONObject2, dVar2);
            }
        };
        C6370a.m19802a(r0);
    }

    /* renamed from: b */
    public static void m19437b(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject, C12915d dVar) {
        try {
            C9549b bVar = new C9549b(f18457a, "UTF-8", false);
            bVar.mo23659a("aid", str);
            bVar.mo23659a("device_id", str2);
            bVar.mo23659a("os", "Android");
            bVar.mo23659a("process_name", "main");
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", str3);
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    bVar.mo23658a(file2.getName(), file2, hashMap);
                }
            }
            bVar.mo23660a(jSONObject);
            String a = bVar.mo23657a();
            int i = -1;
            try {
                i = new JSONObject(a).optInt("errno", -1);
            } catch (JSONException unused) {
            }
            if (dVar != null) {
                if (i == 200) {
                    dVar.mo31397a();
                    return;
                }
                dVar.mo31398a(a);
            }
        } catch (IOException e) {
            if (dVar != null) {
                dVar.mo31398a(e.getMessage());
            }
        }
    }
}
