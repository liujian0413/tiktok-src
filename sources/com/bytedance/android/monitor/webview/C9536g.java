package com.bytedance.android.monitor.webview;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.g */
public final class C9536g {

    /* renamed from: a */
    private JSONObject f26077a;

    /* renamed from: b */
    private JSONObject f26078b;

    /* renamed from: c */
    private JSONObject f26079c;

    /* renamed from: d */
    private JSONObject f26080d;

    /* renamed from: e */
    private JSONObject f26081e;

    /* renamed from: b */
    public static String m28171b() {
        return "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
    }

    /* renamed from: a */
    public final String mo23634a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C9544k.m28285a(jSONObject, "monitors", (Object) jSONObject2);
        C9544k.m28285a(jSONObject, "sendCommonParams", (Object) this.f26081e);
        m28170a(jSONObject2, this.f26077a);
        m28170a(jSONObject2, this.f26078b);
        m28170a(jSONObject2, this.f26079c);
        m28170a(jSONObject2, this.f26080d);
        String jSONObject3 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("SlardarHybrid('config', ");
        sb.append(jSONObject3);
        sb.append(")");
        return sb.toString();
    }

    public C9536g(String str) {
        JSONObject b = C9544k.m28290b(str);
        this.f26077a = C9544k.m28292d(b, "apmReportConfig");
        this.f26078b = C9544k.m28292d(b, "performanceReportConfig");
        this.f26079c = C9544k.m28292d(b, "errorMsgReportConfig");
        this.f26080d = C9544k.m28292d(b, "resourceTimingReportConfig");
        this.f26081e = C9544k.m28292d(b, "commonReportConfig");
    }

    /* renamed from: a */
    private static void m28170a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                C9544k.m28285a(jSONObject, str, C9544k.m28294f(jSONObject2, str));
            }
        }
    }
}
