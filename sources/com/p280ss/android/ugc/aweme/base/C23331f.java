package com.p280ss.android.ugc.aweme.base;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.f */
public final class C23331f {
    /* renamed from: a */
    private static int m76551a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("canceled") || str.contains("Canceled")) {
                return 2;
            }
            if (str.contains("network not available")) {
                return 3;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public static void m76552a(Context context, String str, Throwable th) {
        m76553a(context, str, th, false, "");
    }

    /* renamed from: a */
    public static void m76554a(String str, long j, boolean z) {
        m76555a(str, j, z, false, "");
    }

    /* renamed from: a */
    private static void m76553a(Context context, String str, Throwable th, boolean z, String str2) {
        if (C23342g.m76593a(context)) {
            JSONObject jSONObject = new JSONObject();
            try {
                String th2 = th.toString();
                jSONObject.put("errorDesc", th2);
                jSONObject.put("url", str);
                jSONObject.put("userId", ((ImageUserService) ServiceManager.get().getService(ImageUserService.class)).getCurrentUserId());
                jSONObject.put("networkType", NetworkUtils.getNetworkAccessType(context));
                jSONObject.put("url_convert", false);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("caller_id", str2);
                }
                C6893q.m21452b("aweme_image_load_log", "image_error", jSONObject);
                C6893q.m21444a("aweme_image_load_error_rate", m76551a(th2), jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m76555a(String str, long j, boolean z, boolean z2, String str2) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", str);
                jSONObject.put("fromNetwork", z);
                jSONObject.put("url_convert", false);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("caller_id", str2);
                }
                jSONObject.put("duration", j);
            } catch (Exception unused) {
            }
            C6893q.m21444a("aweme_image_load_error_rate", 0, jSONObject);
            if (j > 0) {
                C6893q.m21446a("aweme_image_load", "load_time", (float) j);
            }
        }
    }
}
