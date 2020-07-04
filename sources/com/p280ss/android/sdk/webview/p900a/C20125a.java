package com.p280ss.android.sdk.webview.p900a;

import android.app.Activity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a.a */
public interface C20125a {
    String getJSSDKConfigUrl();

    String getPlayNameMobile();

    String getSSLocalScheme();

    boolean hasPlatformBinded();

    boolean isApiSuccess(JSONObject jSONObject) throws JSONException;

    boolean isPlatformBinded(String str);

    void startAdsAppActivity(Activity activity, String str);
}
