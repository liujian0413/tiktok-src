package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24611a.C24612a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.i */
public final class C25363i {

    /* renamed from: a */
    public static final C25363i f66766a = new C25363i();

    private C25363i() {
    }

    /* renamed from: b */
    private static int m83392b(Aweme aweme) {
        if (!C25352e.m83202D(aweme)) {
            return -1;
        }
        CardStruct w = C25352e.m83240w(aweme);
        C7573i.m23582a((Object) w, "cardInfo");
        return w.getCardType();
    }

    /* renamed from: c */
    private static long m83394c(Aweme aweme) {
        long j = 0;
        if (aweme == null || !aweme.isAd()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            Long creativeId = awemeRawAd.getCreativeId();
            if (creativeId != null) {
                j = creativeId.longValue();
            }
        }
        return j;
    }

    /* renamed from: d */
    private static String m83395d(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        CardStruct w = C25352e.m83240w(aweme);
        if (w != null) {
            return w.getCardUrl();
        }
        return null;
    }

    /* renamed from: a */
    public static final void m83389a(Aweme aweme) {
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", m83392b(aweme));
                jSONObject.put("url", m83395d(aweme));
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", m83394c(aweme));
                }
            } catch (Exception unused) {
            }
            C6893q.m21444a("aweme_ad_card_show_error_rate", 0, jSONObject);
            C6893q.m21444a("aweme_ad_card_show_error_rate_v2", 0, jSONObject);
        }
    }

    /* renamed from: a */
    public static final void m83391a(String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                List a = C24612a.m80690a();
                if (a.size() > 0) {
                    jSONObject.put("url", str);
                    jSONObject.put("error_details", a);
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() > 0) {
                C6893q.m21444a("aweme_ad_card_load_details", 0, jSONObject);
            }
        }
    }

    /* renamed from: b */
    public static final void m83393b(Aweme aweme, String str) {
        C7573i.m23587b(str, "reason");
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", m83392b(aweme));
                jSONObject.put("url", m83395d(aweme));
                jSONObject.put("error_msg", str);
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", m83394c(aweme));
                }
            } catch (Exception unused) {
            }
            C6893q.m21444a("aweme_ad_card_show_error_rate_v2", 2, jSONObject);
            C6893q.m21444a("aweme_ad_card_show_error", 2, jSONObject);
        }
    }

    /* renamed from: a */
    public static final void m83390a(Aweme aweme, String str) {
        C7573i.m23587b(str, "reason");
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", m83392b(aweme));
                jSONObject.put("url", m83395d(aweme));
                jSONObject.put("error_msg", str);
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", m83394c(aweme));
                }
                jSONObject.put("error_details", C24612a.m80690a());
            } catch (Exception unused) {
            }
            C6893q.m21444a("aweme_ad_card_show_error_rate", 1, jSONObject);
            C6893q.m21444a("aweme_ad_card_show_error_rate_v2", 1, jSONObject);
            C6893q.m21444a("aweme_ad_card_show_error", 1, jSONObject);
        }
    }
}
