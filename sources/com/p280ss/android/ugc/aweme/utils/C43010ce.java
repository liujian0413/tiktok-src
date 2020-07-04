package com.p280ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.framwork.core.monitor.C6379c;
import com.google.gson.JsonSyntaxException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.JSONParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.ce */
public final class C43010ce {
    /* renamed from: a */
    private static void m136510a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C6379c.m19826a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m136511a(Throwable th, String str, String str2) {
        if (th != null && !TextUtils.isEmpty(str)) {
            if ((th instanceof JSONParseException) || (th instanceof JsonSyntaxException)) {
                m136510a("aweme_parse_error_log", "", C42967ba.m136396a().mo104680a("errorUrl", str).mo104680a("errorDesc", Log.getStackTraceString(th)).mo104680a("errorResponse", str2).mo104681b());
            }
        }
    }
}
