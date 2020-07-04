package com.p280ss.android.ugc.aweme.p339sp;

import com.p280ss.android.ugc.aweme.base.C6893q;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sp.f */
public final class C7239f {
    /* renamed from: a */
    public static void m22676a(String str, long j, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sp_init_cost_time", j);
            jSONObject.put("sp_file_name", str);
            jSONObject.put("sp_file_size", j2);
            C6893q.m21452b("sp_init_cost", "sp_init_cost", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m22677a(String str, long j, List<String> list) {
        if (list != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sp_apply_cost_time", j);
                jSONObject.put("sp_file_name", str);
                C6893q.m21452b("sp_apply_cost", "sp_apply_cost", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m22678a(String str, String str2, String str3) {
        if (str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sp_value_size", str3.length());
                jSONObject.put("sp_file_name", str);
                jSONObject.put("sp_key", str2);
                C6893q.m21452b("sp_put_big_size_value", "sp_put_big_size_value", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
