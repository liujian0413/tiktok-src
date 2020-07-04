package com.p280ss.android.ugc.aweme.p340x;

import android.content.Context;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.KevaBuilder;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.x.a */
public final class C7283a {

    /* renamed from: a */
    private static String f20361a = UUID.randomUUID().toString();

    /* renamed from: a */
    public static void m22836a(Context context) {
        C7285c.m22840a(context);
        KevaBuilder instance = KevaBuilder.getInstance();
        instance.setContext(context);
        instance.setMonitor(new C7284b());
        instance.setPortedRepoName("aweme_ported_sp_repo");
        instance.setExecutor(C7258h.m22730c());
    }

    /* renamed from: a */
    public static void m22837a(String str) {
        if (C6379c.m19829a("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", f20361a);
                jSONObject.put("kv_perf_report_type", 4);
                jSONObject.put("kv_perf_name", str);
                jSONObject.put("kv_perf_value", C6776h.m20949c(C6399b.m19921a()));
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter, true);
                StringBuilder sb = new StringBuilder("report ");
                sb.append(str);
                C6497a.m20180a((Throwable) new RuntimeException(sb.toString()), printWriter);
                jSONObject.put("kv_perf_msg", stringWriter.getBuffer().toString());
            } catch (Throwable unused) {
            }
            C6379c.m19826a("aweme_keva_monitor_report", jSONObject);
        }
    }

    /* renamed from: a */
    static void m22834a(int i, String str, String str2, Object obj, String str3) {
        if (C6379c.m19829a("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", f20361a);
                jSONObject.put("kv_perf_report_type", 1);
                jSONObject.put("kv_perf_value_type", String.valueOf(i));
                jSONObject.put("kv_perf_name", str);
                jSONObject.put("kv_perf_key", str2);
                jSONObject.put("kv_perf_value", obj);
                jSONObject.put("kv_perf_msg", str3);
            } catch (Throwable unused) {
            }
            C6379c.m19826a("aweme_keva_monitor_report", jSONObject);
        }
    }

    /* renamed from: a */
    static void m22835a(int i, String str, String str2, Object obj, Throwable th) {
        if (C6379c.m19829a("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", f20361a);
                jSONObject.put("kv_perf_report_type", 0);
                jSONObject.put("kv_perf_value_type", String.valueOf(i));
                jSONObject.put("kv_perf_name", str);
                jSONObject.put("kv_perf_key", str2);
                jSONObject.put("kv_perf_value", obj);
                StringWriter stringWriter = new StringWriter();
                C6497a.m20180a(th, new PrintWriter(stringWriter, true));
                jSONObject.put("kv_perf_msg", stringWriter.getBuffer().toString());
            } catch (Throwable unused) {
            }
            C6379c.m19826a("aweme_keva_monitor_report", jSONObject);
        }
    }
}
