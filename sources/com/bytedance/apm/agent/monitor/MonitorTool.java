package com.bytedance.apm.agent.monitor;

import com.bytedance.apm.C6159b;
import com.bytedance.apm.p252m.C6273b;
import org.json.JSONObject;

public class MonitorTool {
    public static void monitorUIAction(String str, String str2, JSONObject jSONObject) {
        C6159b.m19107a(str, str2, jSONObject);
    }

    public static void reportTraceTime(final String str, final String str2, final long j) {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str2, j);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", str);
                    C6159b.m19114a(jSONObject, jSONObject2);
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void monitorStart(JSONObject jSONObject, long j, long j2) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("begin_time", j);
            jSONObject2.put("end_time", j2);
            jSONObject2.put("from", "monitor-plugin");
            C6159b.m19118b("start", jSONObject, null, jSONObject2);
        } catch (Exception unused) {
        }
    }

    public static void monitorStart(String str, long j, long j2) {
        if (j2 > j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, j2 - j);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("begin_time", j);
                jSONObject2.put("end_time", j2);
                C6159b.m19118b("start", jSONObject, null, jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    public static void monitorPerformance(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C6159b.m19118b(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void monitorSLA(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C6159b.m19101a(j, j2, str, str2, str3, i, jSONObject);
    }
}
