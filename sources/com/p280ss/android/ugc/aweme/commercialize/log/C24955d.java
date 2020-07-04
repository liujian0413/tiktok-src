package com.p280ss.android.ugc.aweme.commercialize.log;

import com.p280ss.android.ugc.aweme.commercialize.log.C24956e.C24957a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.d */
public final class C24955d {
    /* renamed from: a */
    public static void m81895a(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                return;
            }
        }
        JSONObject jSONObject2 = jSONObject;
        new C24957a().mo65248c("realtime_ad").mo65247b("realtime_click").mo65242a(Long.parseLong(str3)).mo65249d(str4).mo65246b(j).mo65244a(jSONObject2).mo65245a().mo65241a();
        jSONObject2.put("has_v3", "1");
        C6907h.m21523a(str, str2, "click", str3, j, jSONObject2);
    }
}
