package com.p280ss.android.sdk.activity;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.base.C6893q;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.activity.b */
public final class C20106b {
    /* renamed from: a */
    public static void m66297a(JSONObject jSONObject, boolean z) {
        C6893q.m21444a("aweme_webview_open_error_rate", z ^ true ? 1 : 0, jSONObject);
    }

    /* renamed from: a */
    public static void m66294a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        JSONObject jSONObject = new JSONObject();
        m66296a(jSONObject, "host", webResourceRequest.getUrl().getHost());
        m66296a(jSONObject, "path", webResourceRequest.getUrl().getPath());
        m66296a(jSONObject, "statusCode", null);
        m66296a(jSONObject, "errorCode", Integer.valueOf(webResourceError.getErrorCode()));
        C6893q.m21444a("aweme_webview_assets_error", 0, jSONObject);
    }

    /* renamed from: a */
    public static void m66295a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        JSONObject jSONObject = new JSONObject();
        m66296a(jSONObject, "host", webResourceRequest.getUrl().getHost());
        m66296a(jSONObject, "path", webResourceRequest.getUrl().getPath());
        m66296a(jSONObject, "statusCode", Integer.valueOf(webResourceResponse.getStatusCode()));
        m66296a(jSONObject, "errorCode", Integer.valueOf(1001));
        C6893q.m21444a("aweme_webview_assets_error", 0, jSONObject);
    }

    /* renamed from: a */
    private static void m66296a(JSONObject jSONObject, String str, Object obj) {
        if (!C6319n.m19593a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }
}
