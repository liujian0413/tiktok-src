package com.bytedance.android.livesdk.p394i;

import com.bytedance.android.live.core.p148d.C3172e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.i.b */
public final class C8307b {
    /* renamed from: a */
    public static void m25371a(long j, List<String> list, boolean z, Map<String, Long> map, String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            jSONObject.put("task_exe_thread", "WorkThread");
            String str4 = "";
            for (String str5 : list) {
                if (str5 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    if (str4.length() == 0) {
                        str3 = "";
                    } else {
                        str3 = ", ";
                    }
                    sb.append(str3);
                    sb.append(str5);
                    str4 = sb.toString();
                }
            }
            jSONObject.put("exe_tasks", str4);
            Set<String> keySet = map.keySet();
            JSONObject jSONObject2 = new JSONObject();
            for (String str6 : keySet) {
                jSONObject2.put(str6, map.get(str6));
            }
            jSONObject.put("task_duration", jSONObject2);
            jSONObject.put("exception_task", str);
            jSONObject.put("exception_msg", str2);
            jSONObject.put("duration", j);
        } catch (Exception unused) {
        }
        C3172e.m12004a("ttlive_sdk_launch", j, jSONObject);
    }
}
