package com.p280ss.android.ugc.aweme.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.statistic.C20403a;
import com.p280ss.android.statistic.C20413c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.g */
public final class C6906g {

    /* renamed from: a */
    private static String f19578a;

    /* renamed from: a */
    public static void m21515a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(f19578a)) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("launch_from", f19578a);
            }
            C20413c.m67737a().mo54961a(str, map, C20403a.f55121i);
        }
    }

    /* renamed from: a */
    public static void m21511a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && context != null) {
            if (!TextUtils.isEmpty(f19578a)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("launch_from", f19578a);
                } catch (JSONException unused) {
                    C20413c.m67737a().mo54960a("umeng", str, str2, null, null, jSONObject, C20403a.f55120h | C20403a.f55117e);
                }
            } else {
                C20413c.m67737a().mo54959a("umeng", str, str2, C20403a.f55120h | C20403a.f55117e);
            }
        }
    }

    /* renamed from: a */
    public static void m21512a(Context context, String str, String str2, long j, long j2) {
        m21514a(context, "umeng", str, str2, j, j2, null);
    }

    /* renamed from: a */
    public static void m21513a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        m21514a(context, "umeng", str, str2, j, j2, jSONObject);
    }

    /* renamed from: a */
    public static void m21514a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str4 = "umeng";
            } else {
                str4 = str;
            }
            if (!C6319n.m19593a(f19578a)) {
                if (jSONObject == null) {
                    jSONObject3 = new JSONObject();
                } else {
                    jSONObject3 = jSONObject;
                }
                try {
                    jSONObject3.put("launch_from", f19578a);
                } catch (JSONException unused) {
                }
                jSONObject2 = jSONObject3;
            } else {
                jSONObject2 = jSONObject;
            }
            if (context != null) {
                C20413c.m67737a().mo54960a(str4, str2, str3, Long.valueOf(j), Long.valueOf(j2), jSONObject2, C20403a.f55120h | C20403a.f55117e);
            }
        }
    }
}
