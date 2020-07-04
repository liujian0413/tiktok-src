package com.bytedance.android.p089a.p090a.p098h;

import android.text.TextUtils;
import com.bytedance.android.p089a.p090a.C2219d;
import com.bytedance.android.p089a.p090a.p091a.C2207a;
import com.bytedance.android.p089a.p090a.p095e.C2221a;
import com.bytedance.android.p089a.p090a.p095e.C2222b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.h.b */
public final class C2231b {
    /* renamed from: a */
    public static void m9595a() {
        m9601a("track_setting_invalid", (C2221a) null, (JSONObject) null);
    }

    /* renamed from: b */
    public static void m9604b(C2221a aVar) {
        m9601a("track_tracker_invalid", aVar, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m9596a(C2221a aVar) {
        m9601a("track_call_start", aVar, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m9597a(C2222b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_retry", bVar.f7473k);
        } catch (JSONException unused) {
        }
        m9602a("track_no_network", bVar, jSONObject);
    }

    /* renamed from: b */
    public static void m9605b(C2222b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_retry", bVar.f7473k);
        } catch (JSONException unused) {
        }
        m9602a("track_url_start", bVar, jSONObject);
    }

    /* renamed from: a */
    public static void m9598a(C2222b bVar, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_extra_data", new JSONObject().put("error_code", i)).put("local_time_ms", System.currentTimeMillis()).put("is_retry", bVar.f7473k);
        } catch (JSONException unused) {
        }
        m9602a("track_url_invalid", bVar, jSONObject);
    }

    /* renamed from: a */
    public static void m9600a(C2222b bVar, List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_extra_data", new JSONObject().put("macro", new JSONArray(list))).put("is_retry", bVar.f7473k);
        } catch (JSONException unused) {
        }
        m9602a("track_macro_invalid", bVar, jSONObject);
    }

    /* renamed from: a */
    private static void m9601a(String str, C2221a aVar, JSONObject jSONObject) {
        C2207a aVar2 = C2219d.m9560c().f7462g;
        if (aVar2 != null) {
            String str2 = "";
            long j = -1;
            String str3 = "";
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar != null) {
                str2 = aVar.mo7960a();
                j = aVar.f7465c;
                str3 = aVar.f7469g;
                currentTimeMillis = aVar.f7471i;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                m9603a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                jSONObject.put("tag", "track_ad").put("value", j).put("track_label", str2).put("log_extra", str3).put("category", "umeng").put("is_ad_event", "1").put("ad_event_type", "monitor").put("user_agent", C2219d.m9560c().f7458c.f7478d);
                if (aVar != null) {
                    JSONObject jSONObject2 = null;
                    if (jSONObject.has("ad_extra_data")) {
                        jSONObject2 = jSONObject.optJSONObject("ad_extra_data");
                    }
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    boolean z = false;
                    if (aVar.f7470h != null) {
                        JSONObject jSONObject3 = aVar.f7470h;
                        Iterator keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String str4 = (String) keys.next();
                            if (!TextUtils.isEmpty(str4)) {
                                Object opt = jSONObject3.opt(str4);
                                if (opt != null && m9603a(jSONObject2, str4, opt)) {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (!aVar.f7466d && aVar.f7467e > 0) {
                        jSONObject2.put("non_std_ad_id", aVar.f7467e);
                        z = true;
                    }
                    if (z) {
                        jSONObject.put("ad_extra_data", jSONObject2);
                    }
                }
            } catch (Throwable unused) {
            }
            aVar2.mo7935a(str, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m9602a(String str, C2222b bVar, JSONObject jSONObject) {
        m9603a(jSONObject, "track_url_list", (Object) "");
        m9603a(jSONObject, "track_status", (Object) Integer.valueOf(-1));
        m9603a(jSONObject, "ts", (Object) Long.valueOf(bVar.f7471i));
        m9603a(jSONObject, "local_time_ms", (Object) String.valueOf(System.currentTimeMillis()));
        m9603a(jSONObject, "is_retry", (Object) Integer.valueOf(0));
        m9601a(str, (C2221a) bVar, jSONObject);
    }

    /* renamed from: a */
    private static boolean m9603a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject.has(str)) {
            return false;
        }
        try {
            jSONObject.putOpt(str, obj);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m9599a(C2222b bVar, int i, String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url_list", str).put("track_status", i).put("local_time_ms", j).put("is_retry", bVar.f7473k);
        } catch (JSONException unused) {
        }
        m9602a("track_url", bVar, jSONObject);
    }
}
