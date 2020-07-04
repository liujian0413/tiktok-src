package com.p280ss.android.ugc.aweme.p759ac;

import android.net.Uri;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.framwork.core.monitor.C6379c;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ac.c */
public final class C15460c {

    /* renamed from: a */
    public static final C15460c f39787a = new C15460c();

    private C15460c() {
    }

    /* renamed from: a */
    public static void m45270a(String str, C10104a<?> aVar, C15459b bVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(aVar, "info");
        C7573i.m23587b(bVar, "apiRetrofitMetrics");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wait_duration", aVar.f27501d - aVar.f27500c);
            jSONObject.put("interceptors_pre_duration", aVar.f27502e - aVar.f27501d);
            jSONObject.put("request_duration", aVar.f27503f - aVar.f27502e);
            jSONObject.put("read_response_duration", aVar.f27505h - aVar.f27503f);
            jSONObject.put("parse_response_duration", bVar.f39783w);
            jSONObject.put("interceptors_after_duration", bVar.f39785y);
            jSONObject.put("api_duration", bVar.f39784x - bVar.f33205a);
            if (aVar.f27519v == 0) {
                if (aVar.f27507j > 0) {
                    jSONObject.put("timing_dns", aVar.f27507j);
                }
                if (aVar.f27508k > 0) {
                    jSONObject.put("timing_connect", aVar.f27508k);
                }
                if (aVar.f27509l > 0) {
                    jSONObject.put("timing_ssl", aVar.f27509l);
                }
                if (aVar.f27510m > 0) {
                    jSONObject.put("timing_send", aVar.f27510m);
                }
                if (aVar.f27514q > 0) {
                    jSONObject.put("timing_waiting", aVar.f27514q);
                }
                if (aVar.f27512o > 0) {
                    jSONObject.put("timing_receive", aVar.f27512o);
                }
                if (aVar.f27515r > 0) {
                    jSONObject.put("timing_total", aVar.f27515r);
                }
            }
            Uri parse = Uri.parse(str);
            JSONObject jSONObject2 = new JSONObject();
            C7573i.m23582a((Object) parse, "uri");
            jSONObject2.put("path", parse.getPath());
            jSONObject2.put("host", parse.getHost());
            if (bVar.f39777q != null) {
                for (Entry entry : bVar.f39777q.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) entry.getKey());
                    sb.append("_duration");
                    String sb2 = sb.toString();
                    Object value = entry.getValue();
                    C7573i.m23582a(value, "entry.value");
                    jSONObject.put(sb2, ((Number) value).longValue());
                }
            }
            C6379c.m19828a("api_time_log", (JSONObject) null, jSONObject, jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
