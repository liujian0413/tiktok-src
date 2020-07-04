package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.newmedia.C19913a;
import com.p280ss.android.newmedia.p893d.C19930a;
import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.sdk.webview.p900a.C20125a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceForJsb */
public class MainServiceForJsb implements C20125a {
    public static final String JS_SDK_CONFIG_URL = C19913a.m62957a("/client_auth/js_sdk/config/v1/");

    public String getJSSDKConfigUrl() {
        return JS_SDK_CONFIG_URL;
    }

    public String getPlayNameMobile() {
        return "mobile";
    }

    public String getSSLocalScheme() {
        return C22909c.f60637a;
    }

    public long getUserId() {
        return Long.parseLong(C6861a.m21337f().getCurUserId());
    }

    public boolean hasPlatformBinded() {
        return C20098b.m66270a().mo53820b();
    }

    public boolean isLogin() {
        return C6861a.m21337f().isLogin();
    }

    public boolean isApiSuccess(JSONObject jSONObject) throws JSONException {
        return C19930a.isApiSuccess(jSONObject);
    }

    public boolean isBrowserActivity(Context context) {
        return C6903bc.m21464E().mo67081a().isInstance(context);
    }

    public boolean isPlatformBinded(String str) {
        return C20098b.m66270a().mo53819a(str);
    }

    public void startAdsAppActivity(Activity activity, String str) {
        C24671f.m80865o().mo59824a(activity, str, "");
    }
}
