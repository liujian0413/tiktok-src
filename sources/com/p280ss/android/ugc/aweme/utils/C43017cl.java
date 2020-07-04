package com.p280ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.cl */
final class C43017cl {
    /* renamed from: a */
    static void m136525a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str) || (!str.contains("check/in") && !str.contains("story") && !str.contains("rec/new") && !str.contains("follow/feed"))) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (i == 8 && iUserService.isLogin()) {
                try {
                    C6861a.m21333b().logout("LoginoutMonitorHelperLancet", "sdk_expired_logout");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorDesc", "api return errorcode==8");
                    jSONObject.put("errorUrl", str);
                    jSONObject.put("errorCookies", CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost()));
                    jSONObject.put("errorResponse", str2);
                    C6893q.m21452b("aweme_user_logout", "", jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }
}
