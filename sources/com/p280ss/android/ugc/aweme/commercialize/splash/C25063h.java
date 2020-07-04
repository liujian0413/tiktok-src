package com.p280ss.android.ugc.aweme.commercialize.splash;

import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.h */
public final class C25063h {

    /* renamed from: a */
    public static final C25063h f66166a = new C25063h();

    private C25063h() {
    }

    /* renamed from: a */
    public static final void m82541a(boolean z, Aweme aweme, String str) {
        String str2;
        if (aweme != null && aweme.isAd()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("failCode", str);
            String str3 = "creativeId";
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getCreativeIdStr();
            } else {
                str2 = null;
            }
            jSONObject.put(str3, str2);
            jSONObject.put("groupId", aweme.getAid());
            C6893q.m21444a("aweme_ad_awesome_splash_show", z ^ true ? 1 : 0, jSONObject);
        }
    }

    /* renamed from: a */
    public static final void m82543a(boolean z, Long l, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("failReason", str2);
        jSONObject.put("creativeId", l);
        jSONObject.put("logExtra", str);
        C6893q.m21444a("aweme_ad_normal_splash_download", z ^ true ? 1 : 0, jSONObject);
    }

    /* renamed from: b */
    public static final void m82544b(boolean z, Long l, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("failReason", str2);
        jSONObject.put("creativeId", l);
        jSONObject.put("logExtra", str);
        C6893q.m21444a("aweme_ad_normal_splash_download_new", z ^ true ? 1 : 0, jSONObject);
    }

    /* renamed from: a */
    public static final void m82542a(boolean z, Aweme aweme, String str, Integer num) {
        String str2;
        if (aweme != null && aweme.isAd()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            jSONObject.put("errorCode", num);
            String str3 = "creativeId";
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getCreativeIdStr();
            } else {
                str2 = null;
            }
            jSONObject.put(str3, str2);
            jSONObject.put("groupId", aweme.getAid());
            C6893q.m21444a("aweme_ad_awesome_splash_download", z ^ true ? 1 : 0, jSONObject);
        }
    }
}
