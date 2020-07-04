package com.p280ss.android.ugc.aweme.commercialize.log;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.a */
public final class C24927a {
    /* renamed from: a */
    public static void m81775a(Aweme aweme, int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aweme_id", aweme.getAid());
            jSONObject.put("error_type", String.valueOf(i));
            jSONObject.put("ad_id", aweme.getAwemeRawAd().getAdId());
            jSONObject.put("status", String.valueOf(i2));
        } catch (Exception unused) {
        }
        C24974r.m21444a("aweme_adx_video_error_log", i2, jSONObject);
    }
}
