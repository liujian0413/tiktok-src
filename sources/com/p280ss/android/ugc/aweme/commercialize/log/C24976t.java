package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C18373n;
import com.google.gson.C6600e;
import com.google.gson.C6711m;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.link.p1129a.C24767a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24937ai.C24938a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24956e.C24957a;
import com.p280ss.android.ugc.aweme.commercialize.model.C25005n;
import com.p280ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.model.OpenAppBackLogParams;
import com.p280ss.android.ugc.aweme.commercialize.model.OpenAppBackLogParams.C24986a;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25083o;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25294bv;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25301by;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.discover.model.Category;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.t */
public final class C24976t {

    /* renamed from: a */
    private static C24937ai f65851a;

    /* renamed from: a */
    public static C24937ai m82022a() {
        return f65851a;
    }

    /* renamed from: a */
    public static String m82024a(int i) {
        switch (i) {
            case 2:
                return "draw_ad";
            case 3:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
                return "background_ad";
            case 6:
                return "comment_end_ad";
            case 8:
                return "homepage_ad";
            default:
                return null;
        }
    }

    /* renamed from: o */
    private static boolean m82264o(Context context, AwemeRawAd awemeRawAd) {
        return (context == null || awemeRawAd == null) ? false : true;
    }

    /* renamed from: a */
    private static JSONObject m82033a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C6711m m = new C18373n().mo47346a(jSONObject.getString("log_extra")).mo16136m();
            JSONObject jSONObject2 = new JSONObject();
            if (m.mo16149b("rit") != null) {
                jSONObject2.put("ctr_rit", m.mo16149b("rit").mo15998c());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m82086a(Callable callable) {
        C1592h.m7855a(callable, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m82044a(Context context, Aweme aweme) {
        if (C7213d.m22500a().mo18800bl()) {
            m82086a((Callable) new C24977u(context, aweme));
        } else {
            m82170ba(context, aweme);
        }
    }

    /* renamed from: a */
    public static void m82057a(Context context, Aweme aweme, JSONObject jSONObject) {
        m82159b(context, "show_failed", aweme, m82174c(context, aweme, jSONObject));
    }

    /* renamed from: a */
    public static void m82045a(Context context, Aweme aweme, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("filter_reason", Integer.valueOf(i));
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
        m82159b(context, "item_repeat", aweme, m82028a(context, aweme, "raw ad item repeat", false, (Map<String, String>) hashMap));
    }

    /* renamed from: a */
    private static void m82064a(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m82172bc(context, aweme)) {
            m82071a(context, "landing_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static void m82048a(Context context, Aweme aweme, long j, int i) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            HashMap hashMap = new HashMap();
            if (C6399b.m19944t()) {
                hashMap.put("play_order", Integer.valueOf(i));
            }
            if (C25294bv.m83113e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(C25294bv.m83112d(aweme) ? 1 : 0));
            }
            int i2 = 0;
            JSONObject a = m82028a(context, aweme, "raw ad over duration", false, m82025a((Map<String, Object>) hashMap));
            try {
                a.put("duration", j);
                if (aweme.getVideo() != null) {
                    i2 = aweme.getVideo().getVideoLength();
                }
                a.put("video_length", i2);
            } catch (JSONException unused) {
            }
            C25294bv.m83109b(aweme);
            m82159b(context, "over", aweme, a);
            C24943am.f65779a.mo65221e(aweme);
        }
    }

    /* renamed from: a */
    public static void m82050a(Context context, Aweme aweme, long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("start_cid", Long.valueOf(j));
        hashMap.put("start_duration", Long.valueOf(j2));
        hashMap.put("complete_duration", Long.valueOf(j3));
        m82159b(context, "complete", aweme, m82028a(context, aweme, "raw ad complete", false, m82025a((Map<String, Object>) hashMap)));
    }

    /* renamed from: b */
    public static void m82149b(Context context, Aweme aweme, long j, int i) {
        m82150b(context, aweme, j, i, "break", (Integer) null);
    }

    /* renamed from: a */
    public static void m82049a(Context context, Aweme aweme, long j, int i, int i2) {
        m82150b(context, aweme, j, 1, "break", Integer.valueOf(2));
    }

    /* renamed from: b */
    private static void m82150b(Context context, Aweme aweme, long j, int i, String str, Integer num) {
        if (C7213d.m22500a().mo18800bl()) {
            C24979w wVar = new C24979w(context, aweme, j, i, str, num);
            m82086a((Callable) wVar);
            return;
        }
        m82180c(context, aweme, j, i, str, num);
    }

    /* renamed from: a */
    public static void m82052a(Context context, Aweme aweme, String str) {
        if (C25294bv.m83113e(aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("trueview_play_type", str);
            m82159b(context, "trueview_play", aweme, m82028a(context, aweme, "trueview_play", false, m82025a((Map<String, Object>) hashMap)));
        } else {
            m82159b(context, "trueview_play", aweme, m82274s(context, aweme, "trueview_play"));
        }
        C24943am.f65779a.mo65220d(aweme);
    }

    /* renamed from: a */
    public static void m82040a(Context context, C25256b bVar) {
        if (context != null && bVar != null) {
            String str = bVar.f66594b;
            Aweme aweme = bVar.f66593a;
            JSONObject f = m82211f(context, aweme, str, bVar.f66595c);
            m82087a(f, "fail_reason", bVar.f66596d, "card_type", bVar.f66597e, "status", bVar.f66598f);
            m82159b(context, str, aweme, f);
        }
    }

    /* renamed from: a */
    private static void m82087a(JSONObject jSONObject, String... strArr) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            int i = 0;
            while (i < 6) {
                try {
                    if (strArr[i] != null) {
                        int i2 = i + 1;
                        if (!TextUtils.isEmpty(strArr[i2])) {
                            optJSONObject.put(strArr[i], strArr[i2]);
                        }
                    }
                    i += 2;
                } catch (JSONException unused) {
                    return;
                }
            }
            if (optJSONObject.length() > 0) {
                jSONObject.put("ad_extra_data", optJSONObject);
            }
        }
    }

    /* renamed from: a */
    public static void m82053a(Context context, Aweme aweme, String str, String str2) {
        m82159b(context, str, aweme, m82211f(context, aweme, str, str2));
    }

    /* renamed from: b */
    public static void m82153b(Context context, Aweme aweme, String str, String str2) {
        JSONObject a = m82028a(context, aweme, "raw ad product click", false, (Map<String, String>) m82141b(aweme));
        try {
            a.put("refer", str2);
        } catch (JSONException unused) {
        }
        m82067a(context, str, "click_product", aweme, a);
    }

    /* renamed from: c */
    public static void m82182c(Context context, Aweme aweme, String str) {
        if (C25352e.m83224g(aweme)) {
            m82067a(context, str, "click_cart", aweme, m82028a(context, aweme, "raw ad click cart", false, (Map<String, String>) m82141b(aweme)));
        }
    }

    /* renamed from: a */
    public static void m82060a(Context context, AwemeRawAd awemeRawAd, String str) {
        JSONObject a = m82029a(context, awemeRawAd, "raw ad click", true);
        if (str != null) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m82065a(context, "click", awemeRawAd, a);
        C24943am.f65779a.mo65217a(awemeRawAd);
    }

    /* renamed from: a */
    public static void m82055a(Context context, Aweme aweme, String str, Map<String, String> map) {
        m82159b(context, "click", aweme, m82028a(context, aweme, "raw ad click", true, map));
        C24943am.f65779a.mo65218b(aweme);
    }

    /* renamed from: c */
    public static void m82183c(Context context, Aweme aweme, String str, String str2) {
        JSONObject a = m82028a(context, aweme, "raw ad click", true, (Map<String, String>) m82141b(aweme));
        try {
            a.put("refer", str2);
        } catch (JSONException unused) {
        }
        m82067a(context, str, "click", aweme, a);
        C24943am.f65779a.mo65218b(aweme);
    }

    /* renamed from: b */
    public static void m82154b(Context context, Aweme aweme, String str, Map<String, Object> map) {
        JSONObject a = m82028a(context, aweme, "raw ad click source", false, map == null ? null : m82025a(map));
        if (str != null) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m82159b(context, "click_source", aweme, a);
    }

    /* renamed from: b */
    public static void m82158b(Context context, AwemeRawAd awemeRawAd, String str) {
        m82061a(context, awemeRawAd, "open_url_app", m82228h(context, awemeRawAd, "raw ad open_url_app"), str);
    }

    /* renamed from: c */
    public static void m82186c(Context context, AwemeRawAd awemeRawAd, String str) {
        m82061a(context, awemeRawAd, "open_url_h5", m82228h(context, awemeRawAd, "raw ad open_url_h5"), str);
    }

    /* renamed from: a */
    public static void m82056a(Context context, Aweme aweme, Map<String, String> map) {
        HashMap hashMap;
        if (map.size() != 0) {
            hashMap = new HashMap();
            hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) map));
        } else {
            hashMap = null;
        }
        m82187c(context, "othershow", aweme, m82028a(context, aweme, "raw ad background show", false, (Map<String, String>) hashMap));
    }

    /* renamed from: b */
    public static void m82155b(Context context, Aweme aweme, Map<String, String> map) {
        m82187c(context, "click", aweme, m82028a(context, aweme, "raw ad background click", true, map));
        C24943am.f65779a.mo65218b(aweme);
    }

    /* renamed from: a */
    public static void m82051a(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject jSONObject;
        if (C25352e.m83225h(aweme)) {
            HashMap hashMap = new HashMap();
            int i = 1;
            hashMap.put("is_cheated_follow", Integer.valueOf((followStatus == null || !followStatus.isCheating()) ? 0 : 1));
            String str = "follow_status";
            if (followStatus != null) {
                i = followStatus.followStatus;
            }
            hashMap.put(str, Integer.valueOf(i));
            jSONObject = m82028a(context, aweme, "raw ad follow", false, m82025a((Map<String, Object>) hashMap));
        } else {
            jSONObject = m82274s(context, aweme, "raw ad follow");
        }
        m82159b(context, "follow", aweme, jSONObject);
    }

    /* renamed from: b */
    public static void m82151b(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject jSONObject;
        if (C25352e.m83225h(aweme)) {
            HashMap hashMap = new HashMap();
            int i = 1;
            hashMap.put("is_cheated_follow", Integer.valueOf((followStatus == null || !followStatus.isCheating()) ? 0 : 1));
            String str = "follow_status";
            if (followStatus != null) {
                i = followStatus.followStatus;
            }
            hashMap.put(str, Integer.valueOf(i));
            jSONObject = m82028a(context, aweme, "raw ad follow", false, m82025a((Map<String, Object>) hashMap));
        } else {
            jSONObject = m82274s(context, aweme, "raw ad follow");
        }
        m82199d(context, "follow", aweme, jSONObject);
    }

    /* renamed from: c */
    private static void m82181c(Context context, Aweme aweme, FollowStatus followStatus) {
        m82199d(context, "follow_cancel", aweme, m82274s(context, aweme, "raw ad homepage follow cancel"));
    }

    /* renamed from: a */
    public static void m82059a(Context context, AwemeRawAd awemeRawAd) {
        m82160b(context, "comment_first_show", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment first show"));
    }

    /* renamed from: b */
    public static void m82157b(Context context, AwemeRawAd awemeRawAd) {
        m82198d(context, awemeRawAd, (String) null);
    }

    /* renamed from: a */
    private static void m82066a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject, String str2) {
        if (jSONObject == null) {
            jSONObject = m82228h(context, awemeRawAd, "extJson miss");
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("refer", str2);
            } catch (JSONException unused) {
            }
        }
        m82160b(context, str, awemeRawAd, jSONObject);
    }

    /* renamed from: c */
    public static void m82185c(Context context, AwemeRawAd awemeRawAd) {
        m82160b(context, "click_source", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment click source"));
    }

    /* renamed from: b */
    private static void m82161b(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject, String str2) {
        if (jSONObject == null) {
            jSONObject = m82228h(context, awemeRawAd, "extJson miss");
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("refer", str2);
            } catch (JSONException unused) {
            }
        }
        m82188c(context, str, awemeRawAd, jSONObject);
    }

    /* renamed from: b */
    public static void m82156b(Context context, Aweme aweme, JSONObject jSONObject) {
        m82159b(context, "show_failed", aweme, m82174c(context, aweme, jSONObject));
    }

    /* renamed from: a */
    public static void m82058a(Context context, Aweme aweme, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("splash_id", C25352e.m83339ak(aweme));
            jSONObject2.put("splash_ready", z);
            jSONObject2.put("show_immediately", z2);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException unused) {
        }
        m82159b(context, "splash_pick", aweme, m82174c(context, aweme, jSONObject));
    }

    /* renamed from: c */
    public static void m82184c(Context context, Aweme aweme, Map<String, String> map) {
        m82159b(context, "skip", aweme, m82028a(context, aweme, "raw ad skip", false, map));
    }

    /* renamed from: a */
    public static void m82046a(Context context, Aweme aweme, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("failed_code", String.valueOf(i));
        hashMap.put("failed_msg", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap));
        m82159b(context, "download_video_failed", aweme, m82028a(context, aweme, "raw ad download_video_failed", false, (Map<String, String>) hashMap2));
    }

    /* renamed from: a */
    public static void m82047a(Context context, Aweme aweme, long j) {
        if (C25352e.m83231n(aweme)) {
            m82178c(context, aweme, j);
        } else {
            m82035a(context, j);
        }
    }

    /* renamed from: a */
    public static void m82037a(Context context, long j, String str, long j2) {
        JSONObject jSONObject;
        if (m82169b()) {
            try {
                JSONObject a = m82032a(context, (JSONObject) null, str);
                try {
                    jSONObject = m82034a(a, j2);
                } catch (JSONException unused) {
                    jSONObject = a;
                }
            } catch (JSONException unused2) {
                jSONObject = new JSONObject();
            }
            Context context2 = context;
            C6907h.m21519a(context2, "splash_ad", "first_view", String.valueOf(j), 0, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m82035a(Context context, long j) {
        if (m82169b()) {
            Context context2 = context;
            C6907h.m21519a(context2, "splash_ad", "first_view", "-1", 0, m82034a((JSONObject) null, j));
        }
    }

    /* renamed from: b */
    public static void m82148b(Context context, Aweme aweme, long j) {
        if (C25352e.m83231n(aweme) && C25083o.m82612c() != 0) {
            int i = 1;
            if (!C25083o.m82614e()) {
                i = 2;
            }
            C25083o.m82610b(0);
            HashMap hashMap = new HashMap();
            hashMap.put("splashduration", String.valueOf(j));
            hashMap.put("awemelaunch", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap));
            m82159b(context, "splash_show", aweme, m82028a(context, aweme, "awesome splash feed show", false, (Map<String, String>) hashMap2));
        }
    }

    /* renamed from: b */
    private static boolean m82169b() {
        if (C25083o.m82613d()) {
            return false;
        }
        C25083o.m82611b(true);
        return true;
    }

    /* renamed from: a */
    private static JSONObject m82034a(JSONObject jSONObject, long j) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("launchduration", Long.valueOf(j));
            jSONObject.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap));
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m82063a(Context context, String str, Aweme aweme) {
        if (m82172bc(context, aweme)) {
            HashMap hashMap = new HashMap();
            if (aweme.getAuthor() != null) {
                hashMap.put("anchor_id", aweme.getAuthor().getUid());
                hashMap.put("room_id", String.valueOf(aweme.getAuthor().roomId));
            }
            m82071a(context, str, "live_click_source", m82028a(context, aweme, "ad live click", false, m82025a((Map<String, Object>) hashMap)), aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    private static JSONObject m82031a(Context context, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            m82032a(context, jSONObject, awemeRawAd.getLogExtra());
        } catch (JSONException e) {
            C6921a.m21554a((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m82032a(Context context, JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("log_extra", str);
        }
        jSONObject.put("is_ad_event", "1");
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        if (!C6319n.m19593a(networkAccessType)) {
            jSONObject.put("nt", networkAccessType);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m82068a(Context context, String str, String str2, String str3) {
        m82070a(context, "show", str, str2, str3);
    }

    /* renamed from: b */
    public static void m82162b(Context context, String str, String str2, String str3) {
        m82070a(context, "click", str, str2, str3);
    }

    /* renamed from: a */
    private static void m82070a(Context context, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", str3);
            jSONObject.put("log_extra", str4);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        m82072a(context, "result_ad", str, jSONObject, str2, 0);
    }

    /* renamed from: b */
    private static void m82163b(Context context, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", str3);
            jSONObject.put("log_extra", str4);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        m82072a(context, "draw_ad", str, jSONObject, str2, 0);
    }

    /* renamed from: b */
    private static void m82159b(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m82172bc(context, aweme)) {
            m82071a(context, "draw_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    private static void m82067a(Context context, String str, String str2, Aweme aweme, JSONObject jSONObject) {
        if (m82172bc(context, aweme)) {
            m82071a(context, str, str2, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    private static void m82065a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m82264o(context, awemeRawAd)) {
            m82071a(context, "draw_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: c */
    private static void m82187c(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m82172bc(context, aweme)) {
            m82071a(context, "background_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: d */
    private static void m82199d(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m82172bc(context, aweme)) {
            m82071a(context, "homepage_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: b */
    private static void m82160b(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m82264o(context, awemeRawAd)) {
            m82071a(context, "comment_first_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: c */
    private static void m82188c(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m82264o(context, awemeRawAd)) {
            m82071a(context, "comment_end_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: a */
    private static void m82061a(Context context, AwemeRawAd awemeRawAd, String str, JSONObject jSONObject, String str2) {
        if (m82264o(context, awemeRawAd) && !TextUtils.isEmpty(str)) {
            m82071a(context, "poi_ad", str, C24932ae.m81783a(jSONObject, str2), awemeRawAd);
        }
    }

    /* renamed from: a */
    public static void m82071a(Context context, String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            str = TextUtils.equals(str, "background_ad") ? "background_ads" : "topic_ads";
        }
        String str3 = str;
        if (C6399b.m19944t() && TextUtils.equals("click", str2)) {
            C25301by.m83143a(awemeRawAd);
        }
        m82072a(context, str3, str2, jSONObject, m82140b(awemeRawAd), m82021a(awemeRawAd));
    }

    /* renamed from: a */
    public static void m82072a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        if (f65851a != null) {
            C24937ai aiVar = f65851a;
            C24938a aVar = new C24938a(context, str, str2, str3, j, jSONObject);
            if (aiVar.mo65214c(aVar)) {
                return;
            }
        }
        m82164b(context, str, str2, jSONObject, str3, j);
    }

    /* renamed from: b */
    private static void m82164b(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        if (TextUtils.equals("click", str2)) {
            C25294bv.m83108a(str3);
            m82084a(str, str3, j, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException unused) {
            }
        }
        C6907h.m21519a(context, str, str2, str3, j, jSONObject);
        C7163a.m22363a();
    }

    /* renamed from: a */
    public static void m82069a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m82072a(context, str, str2, jSONObject, str3, j);
    }

    /* renamed from: a */
    public static void m82084a(String str, String str2, long j, JSONObject jSONObject) {
        long j2;
        try {
            j2 = Long.parseLong(str2);
        } catch (Exception unused) {
            j2 = 0;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                if (!TextUtils.equals("has_v3", str3)) {
                    try {
                        jSONObject2.put(str3, jSONObject.opt(str3));
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        new C24957a().mo65248c(str).mo65247b("realtime_click").mo65242a(j2).mo65246b(j).mo65244a(jSONObject2).mo65245a().mo65241a();
        C6877n.m21407a("ctr_monitor", "ctr_click", m82033a(jSONObject));
    }

    /* renamed from: a */
    public static void m82077a(Aweme aweme, int i, C24939aj ajVar) {
        if (aweme != null) {
            C24962g.m81954a(ajVar, (Collection<String>) aweme.getRawAdPlayNodeTrackUrlList(i), false);
        }
    }

    /* renamed from: a */
    public static void m82039a(Context context, LinkData linkData, Aweme aweme, boolean z) {
        m82082a("link_click", context, linkData, aweme, z, null, false);
    }

    /* renamed from: a */
    public static void m82042a(Context context, Category category) {
        C24958f.m81905a().mo65276b("video_slide").mo65286h(category.getLogExtra()).mo65266a("discovery_ad").mo65283e("video").mo65264a(Long.valueOf(category.getCreativeId())).mo65270a(context);
        C24958f.m81905a().mo65276b("click").mo65286h(category.getLogExtra()).mo65266a("discovery_ad").mo65283e("video").mo65264a(Long.valueOf(category.getCreativeId())).mo65270a(context);
        C24962g.m81952a((C24939aj) new C24981y(category), category.getClickTrackUrlList(), true);
    }

    /* renamed from: d */
    static final /* synthetic */ void m82201d(Category category, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(category.getCreativeId())).mo65286h(category.getLogExtra()).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65259a(category).mo65278b();
        }
    }

    /* renamed from: a */
    public static void m82076a(Aweme aweme) {
        m82078a(aweme, "draw_ad", (String) null);
    }

    /* renamed from: a */
    public static void m82078a(Aweme aweme, String str, String str2) {
        JSONObject s = m82274s(C6399b.m19921a(), aweme, "uniplay");
        if (!TextUtils.isEmpty(str2)) {
            try {
                s.put("refer", str2);
            } catch (JSONException unused) {
            }
        }
        m82067a(C6399b.m19921a(), str, "uniplay", aweme, s);
    }

    /* renamed from: a */
    public static void m82043a(Context context, Category category, String str) {
        C24958f.m81905a().mo65276b("auto_full_screen").mo65266a("discovery_ad").mo65283e("video").mo65264a(Long.valueOf(category.getCreativeId())).mo65286h(category.getLogExtra()).mo65284f(str).mo65270a(context);
        C24962g.m81952a((C24939aj) new C24982z(category), category.getClickTrackUrlList(), true);
    }

    /* renamed from: c */
    static final /* synthetic */ void m82190c(Category category, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(category.getCreativeId())).mo65286h(category.getLogExtra()).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65259a(category).mo65278b();
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m82166b(Category category, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("show").mo65264a(Long.valueOf(category.getCreativeId())).mo65286h(category.getLogExtra()).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65259a(category).mo65278b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m82075a(Category category, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(category.getCreativeId())).mo65286h(category.getLogExtra()).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65259a(category).mo65278b();
        }
    }

    /* renamed from: a */
    public static void m82041a(Context context, Banner banner, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i));
        C24958f.m81905a().mo65276b("click").mo65286h(banner.getLogExtra()).mo65266a("discovery_ad").mo65283e("banner").mo65264a(Long.valueOf(banner.getCreativeId())).mo65265a((Object) hashMap).mo65270a(context);
        C24962g.m81954a((C24939aj) new C24930ac(banner, hashMap), (Collection<String>) banner.getClickTrackUrlList(), true);
    }

    /* renamed from: b */
    static final /* synthetic */ void m82165b(Banner banner, Map map, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(banner.getCreativeId())).mo65286h(banner.getLogExtra()).mo65265a((Object) map).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65258a(banner).mo65278b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m82074a(Banner banner, Map map, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("show").mo65264a(Long.valueOf(banner.getCreativeId())).mo65286h(banner.getLogExtra()).mo65265a((Object) map).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65258a(banner).mo65278b();
        }
    }

    /* renamed from: a */
    public static void m82062a(Context context, String str, DouPlusLinkData douPlusLinkData, Aweme aweme) {
        if (context != null && douPlusLinkData != null && aweme != null && aweme.getAwemeRawAd() != null) {
            m82072a(context, "draw_ad", str, m82211f(context, aweme, "douplus link", "link"), m82140b(aweme.getAwemeRawAd()), m82173c(aweme));
            C24943am.f65779a.mo65217a(aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    private static void m82081a(String str, Context context, LinkData linkData, Aweme aweme, boolean z, String str2) {
        m82082a(str, context, linkData, aweme, z, null, true);
    }

    /* renamed from: a */
    public static void m82080a(String str, Context context, LinkData linkData, Aweme aweme, boolean z) {
        m82081a(str, context, linkData, aweme, z, (String) null);
    }

    /* renamed from: b */
    public static void m82168b(String str, Context context, LinkData linkData, Aweme aweme, boolean z) {
        m82081a(str, context, linkData, aweme, true, (String) null);
    }

    /* renamed from: a */
    private static void m82082a(String str, Context context, LinkData linkData, Aweme aweme, boolean z, String str2, boolean z2) {
        JSONObject f;
        String b;
        if (context == null || linkData == null) {
            if (C7163a.m22363a()) {
                throw new NullPointerException("context or linkAd is null");
            }
        } else if (z2 || (aweme != null && aweme.isAd())) {
            String str3 = "link";
            if (!z) {
                switch (linkData.feedShowType) {
                    case 1:
                        str3 = "link_logo";
                        break;
                    case 2:
                        str3 = "link_bar";
                        break;
                }
            }
            if (z2) {
                f = m82026a(context, linkData, str3, aweme.getAid());
                b = linkData.creativeId;
            } else {
                f = m82211f(context, aweme, "logAdLink", str3);
                b = m82140b(aweme.getAwemeRawAd());
            }
            m82072a(context, z ? "comment_ad" : "draw_ad", str, f, b, m82173c(aweme));
        } else if (C7163a.m22363a()) {
            throw new RuntimeException("aweme is not ad while use ad data");
        }
    }

    /* renamed from: a */
    public static void m82038a(Context context, C24767a aVar) {
        JSONObject f;
        String b;
        if (context == null || aVar == null || aVar.f65239b == null) {
            if (C7163a.m22363a()) {
                throw new NullPointerException("context or linkAd is null");
            }
        } else if (aVar.f65242e || (aVar.f65240c != null && aVar.f65240c.isAd())) {
            LinkData linkData = aVar.f65239b;
            Aweme aweme = aVar.f65240c;
            String str = "link";
            if (!aVar.f65241d) {
                switch (linkData.feedShowType) {
                    case 1:
                        str = "link_logo";
                        break;
                    case 2:
                        str = "link_bar";
                        break;
                }
            }
            if (linkData.feedShowType == 3) {
                str = aVar.f65245h;
            }
            if (aVar.f65242e) {
                f = m82026a(context, linkData, str, aweme.getAid());
                b = linkData.creativeId;
            } else {
                f = m82211f(context, aweme, "logAdLink", str);
                b = m82140b(aweme.getAwemeRawAd());
            }
            String str2 = b;
            JSONObject jSONObject = f;
            aVar.mo64775b(jSONObject);
            aVar.mo64774a(jSONObject);
            m82072a(context, aVar.f65241d ? "comment_ad" : "draw_ad", aVar.f65238a, jSONObject, str2, m82173c(aweme));
            C24943am.f65779a.mo65215a(aVar);
        } else if (C7163a.m22363a()) {
            throw new InvalidParameterException("aweme is invalid");
        }
    }

    /* renamed from: a */
    public static void m82054a(Context context, Aweme aweme, String str, String str2, String str3) {
        if (m82172bc(context, aweme)) {
            JSONObject s = m82274s(context, aweme, "comment location");
            try {
                s.put("refer", str3);
            } catch (JSONException unused) {
            }
            m82072a(context, str2, "location_click", C24932ae.m81783a(s, str), aweme.getAwemeRawAdIdStr(), m82173c(aweme));
        }
    }

    /* renamed from: a */
    public static void m82036a(Context context, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            m82032a(context, jSONObject, str);
        } catch (JSONException unused) {
        }
        m82072a(context, "splash_ad", "open_url_h5", jSONObject, String.valueOf(j), 0);
    }

    /* renamed from: b */
    public static void m82167b(Aweme aweme, int i, C24939aj ajVar) {
        if (aweme != null && aweme.isAd()) {
            for (C25005n nVar : aweme.getAwemeRawAd().getPlaybackSecondsTrackList()) {
                if (nVar.f65936a == i) {
                    C24962g.m81954a(ajVar, (Collection<String>) nVar.f65937b, false);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m82085a(String str, String str2, String str3, String str4, Map<String, Object> map) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str4)) {
            try {
                AwemeRawAd awemeRawAd = (AwemeRawAd) new C6600e().mo15974a(str4, AwemeRawAd.class);
                if (awemeRawAd != null) {
                    if (map == null) {
                        jSONObject = m82029a(C6399b.m19921a(), awemeRawAd, "", false);
                    } else {
                        jSONObject = m82030a(C6399b.m19921a(), awemeRawAd, "", false, m82025a(map));
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            jSONObject.put("refer", str3);
                        } catch (JSONException unused) {
                        }
                    }
                    m82071a(C6399b.m19921a(), str, str2, jSONObject, awemeRawAd);
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m82083a(String str, String str2) {
        C6907h.m21524a("show_flash_store", (Map) C22984d.m75611a().mo59973a("author_id", str2).mo59973a("carrier_type", str).f60753a);
    }

    /* renamed from: a */
    private static void m82073a(OpenAppBackLogParams openAppBackLogParams) {
        if (openAppBackLogParams != null && !C6399b.m19944t()) {
            if (!C23018p.m75672a().mo59989b() && System.currentTimeMillis() - C23018p.m75672a().mo59992e() < DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
                C24940ak.m81826a(openAppBackLogParams);
            } else {
                C24940ak.m81827a(openAppBackLogParams.toJson());
            }
        }
    }

    /* renamed from: a */
    public static void m82079a(String str) {
        if (C6399b.m19944t() && !TextUtils.isEmpty(str) && TextUtils.equals(Uri.parse(str).getHost(), "stickers")) {
            int lastIndexOf = str.lastIndexOf("/") + 1;
            if (lastIndexOf < str.length()) {
                C6907h.m21524a("enter_prop_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "draw_ad").mo59973a("prop_id", str.substring(lastIndexOf)).f60753a);
            }
        }
    }

    /* renamed from: a */
    public static long m82021a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    /* renamed from: b */
    public static String m82140b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    /* renamed from: a */
    private static Map<String, String> m82025a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) map));
        return hashMap;
    }

    /* renamed from: c */
    private static long m82173c(Aweme aweme) {
        if (!aweme.isAd()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return 0;
        }
        return m82021a(awemeRawAd);
    }

    /* renamed from: b */
    private static HashMap<String, String> m82141b(Aweme aweme) {
        if (aweme.getPromotion() == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("commodity_id", aweme.getPromotion().getPromotionId());
        hashMap2.put("commodity_type", Integer.valueOf(aweme.getPromotion().getPromotionSource()));
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
        return hashMap;
    }

    /* renamed from: b */
    private static Map<String, String> m82142b(int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("play_order", Integer.valueOf(i));
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
        return hashMap;
    }

    /* renamed from: H */
    public static void m82002H(Context context, Aweme aweme) {
        m82051a(context, aweme, (FollowStatus) null);
    }

    /* renamed from: I */
    public static void m82003I(Context context, Aweme aweme) {
        m82151b(context, aweme, (FollowStatus) null);
    }

    /* renamed from: J */
    public static void m82004J(Context context, Aweme aweme) {
        m82181c(context, aweme, (FollowStatus) null);
    }

    /* renamed from: f */
    public static void m82216f(Context context, AwemeRawAd awemeRawAd) {
        m82208e(context, awemeRawAd, (String) null);
    }

    /* renamed from: j */
    public static void m82240j(Context context, Aweme aweme) {
        m82204e(context, aweme, (String) null);
    }

    /* renamed from: A */
    public static void m81995A(Context context, Aweme aweme) {
        m82187c(context, "click_coupon", aweme, m82274s(context, aweme, "raw ad background coupon click"));
    }

    /* renamed from: B */
    public static void m81996B(Context context, Aweme aweme) {
        m82187c(context, "click_call", aweme, m82274s(context, aweme, "raw ad background phone click"));
    }

    /* renamed from: D */
    public static void m81998D(Context context, Aweme aweme) {
        m82159b(context, "click_button", aweme, m82274s(context, aweme, "raw ad button click"));
    }

    /* renamed from: E */
    public static void m81999E(Context context, Aweme aweme) {
        m82159b(context, "click_coupon", aweme, m82274s(context, aweme, "raw ad coupon click"));
    }

    /* renamed from: F */
    public static void m82000F(Context context, Aweme aweme) {
        m82159b(context, "click_call", aweme, m82274s(context, aweme, "raw ad phone click"));
    }

    /* renamed from: G */
    public static void m82001G(Context context, Aweme aweme) {
        m82159b(context, "click_form", aweme, m82274s(context, aweme, "raw ad form click"));
    }

    /* renamed from: K */
    public static void m82005K(Context context, Aweme aweme) {
        m82199d(context, "homepagelink_click", aweme, m82274s(context, aweme, "raw ad homepage follow"));
    }

    /* renamed from: L */
    public static void m82006L(Context context, Aweme aweme) {
        m82199d(context, "message_click", aweme, m82274s(context, aweme, "raw ad homepage follow"));
    }

    /* renamed from: M */
    public static void m82007M(Context context, Aweme aweme) {
        m82159b(context, "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: N */
    public static void m82008N(Context context, Aweme aweme) {
        m82067a(context, "background_ad", "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: O */
    public static void m82009O(Context context, Aweme aweme) {
        m82067a(context, "comment_end_ad", "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: P */
    public static void m82010P(Context context, Aweme aweme) {
        m82067a(context, "comment_end_ad", "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: Q */
    public static void m82011Q(Context context, Aweme aweme) {
        m82067a(context, "comment_end_ad", "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: R */
    public static void m82012R(Context context, Aweme aweme) {
        m82067a(context, "comment_first_ad", "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: S */
    public static void m82013S(Context context, Aweme aweme) {
        m82067a(context, "comment_first_ad", "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: T */
    public static void m82014T(Context context, Aweme aweme) {
        m82067a(context, "draw_ad", "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: U */
    public static void m82015U(Context context, Aweme aweme) {
        m82067a(context, "homepage_ad", "click_message", aweme, m82027a(context, aweme, "raw ad click", false));
    }

    /* renamed from: V */
    public static void m82016V(Context context, Aweme aweme) {
        m82159b(context, "challenge_click", aweme, m82274s(context, aweme, "raw ad challenge click"));
    }

    /* renamed from: W */
    public static void m82017W(Context context, Aweme aweme) {
        m82159b(context, "share", aweme, m82274s(context, aweme, "raw ad share"));
    }

    /* renamed from: X */
    public static void m82018X(Context context, Aweme aweme) {
        m82159b(context, "music_click", aweme, m82274s(context, aweme, "raw ad music click"));
    }

    /* renamed from: Y */
    public static void m82019Y(Context context, Aweme aweme) {
        m82159b(context, "click_redpacket", aweme, m82274s(context, aweme, "raw ad click red packet"));
    }

    /* renamed from: Z */
    public static void m82020Z(Context context, Aweme aweme) {
        m82199d(context, "button_show", aweme, m82274s(context, aweme, "raw homepage ad button show"));
    }

    /* renamed from: aG */
    public static void m82094aG(Context context, Aweme aweme) {
        m82159b(context, "play_6s", aweme, m82274s(context, aweme, "play_6s"));
    }

    /* renamed from: aH */
    public static void m82095aH(Context context, Aweme aweme) {
        m82159b(context, "play_15s", aweme, m82274s(context, aweme, "play_15s"));
    }

    /* renamed from: aI */
    public static void m82096aI(Context context, Aweme aweme) {
        m82159b(context, "othershow", aweme, m82211f(context, aweme, "raw ad othershow", "sticker"));
    }

    /* renamed from: aJ */
    public static void m82097aJ(Context context, Aweme aweme) {
        m82159b(context, "otherclick", aweme, m82211f(context, aweme, "raw ad prop otherclick", "sticker"));
    }

    /* renamed from: aW */
    public static void m82110aW(Context context, Aweme aweme) {
        m82159b(context, "othershow_fail", aweme, m81994A(context, aweme, ""));
    }

    /* renamed from: aa */
    public static void m82114aa(Context context, Aweme aweme) {
        m82199d(context, "click_button", aweme, m82274s(context, aweme, "raw homepage ad button click"));
    }

    /* renamed from: ab */
    public static void m82115ab(Context context, Aweme aweme) {
        m82199d(context, "click_coupon", aweme, m82274s(context, aweme, "raw homepage ad coupon click"));
    }

    /* renamed from: ad */
    public static void m82117ad(Context context, Aweme aweme) {
        m82199d(context, "ad_click", aweme, m82274s(context, aweme, "raw homepage ad ad click"));
    }

    /* renamed from: ae */
    public static void m82118ae(Context context, Aweme aweme) {
        m82199d(context, "click_start", aweme, m82274s(context, aweme, "raw homepage ad click start"));
    }

    /* renamed from: af */
    public static void m82119af(Context context, Aweme aweme) {
        m82199d(context, "click_call", aweme, m82274s(context, aweme, "raw homepage ad click call"));
    }

    /* renamed from: ag */
    public static void m82120ag(Context context, Aweme aweme) {
        m82199d(context, "click_form", aweme, m82274s(context, aweme, "raw homepage ad click form"));
    }

    /* renamed from: ah */
    public static void m82121ah(Context context, Aweme aweme) {
        m82199d(context, "click_cancel", aweme, m82274s(context, aweme, "raw homepage form click cancel"));
    }

    /* renamed from: ai */
    public static void m82122ai(Context context, Aweme aweme) {
        m82199d(context, "load_fail", aweme, m82274s(context, aweme, "raw homepage load fail"));
    }

    /* renamed from: aj */
    public static void m82123aj(Context context, Aweme aweme) {
        m82199d(context, "click_redpacket", aweme, m82274s(context, aweme, "raw homepage click red packet"));
    }

    /* renamed from: ak */
    public static void m82124ak(Context context, Aweme aweme) {
        m82187c(context, "form_show", aweme, m82274s(context, aweme, "raw ad background form show"));
    }

    /* renamed from: al */
    public static void m82125al(Context context, Aweme aweme) {
        m82187c(context, "click_redpacket", aweme, m82274s(context, aweme, "raw ad background click red packet"));
    }

    /* renamed from: am */
    public static void m82126am(Context context, Aweme aweme) {
        m82209e(context, "click_cancel", aweme, m82274s(context, aweme, "raw feed form click cancel"));
    }

    /* renamed from: an */
    public static void m82127an(Context context, Aweme aweme) {
        m82209e(context, "load_fail", aweme, m82274s(context, aweme, "raw feed form load fail"));
    }

    /* renamed from: ao */
    public static void m82128ao(Context context, Aweme aweme) {
        m82159b(context, "open_card_show", aweme, m82274s(context, aweme, "open app hint show"));
    }

    /* renamed from: ap */
    public static void m82129ap(Context context, Aweme aweme) {
        m82159b(context, "open_card_close", aweme, m82274s(context, aweme, "open app hint close"));
    }

    /* renamed from: aq */
    public static void m82130aq(Context context, Aweme aweme) {
        m82159b(context, "open_card_jump", aweme, m82274s(context, aweme, "open app hint jump"));
    }

    /* renamed from: ar */
    public static void m82131ar(Context context, Aweme aweme) {
        m82159b(context, "download_video_count", aweme, m82274s(context, aweme, "raw ad download_video_count"));
    }

    /* renamed from: as */
    public static void m82132as(Context context, Aweme aweme) {
        m82159b(context, "download_video_count_splash_sdk", aweme, m82274s(context, aweme, "raw ad download_video_count_splash_sdk"));
    }

    /* renamed from: at */
    public static void m82133at(Context context, Aweme aweme) {
        m82159b(context, "download_video_succeed", aweme, m82274s(context, aweme, "raw ad download_video_succeed"));
    }

    /* renamed from: au */
    public static void m82134au(Context context, Aweme aweme) {
        m82159b(context, "download_video_start_sdk", aweme, m82274s(context, aweme, "raw ad download video start sdk"));
    }

    /* renamed from: av */
    public static void m82135av(Context context, Aweme aweme) {
        m82159b(context, "download_video_prepare", aweme, m82274s(context, aweme, "raw ad download video prepare"));
    }

    /* renamed from: aw */
    public static void m82136aw(Context context, Aweme aweme) {
        m82159b(context, "download_video_start_first_sdk", aweme, m82274s(context, aweme, "raw ad download video first start sdk"));
    }

    /* renamed from: ax */
    public static void m82137ax(Context context, Aweme aweme) {
        m82159b(context, "download_video_cancel", aweme, m82274s(context, aweme, "raw ad download cancel"));
    }

    /* renamed from: ay */
    public static void m82138ay(Context context, Aweme aweme) {
        m82159b(context, "data_invalid", aweme, m82274s(context, aweme, "raw ad data_invalid"));
    }

    /* renamed from: bc */
    private static boolean m82172bc(Context context, Aweme aweme) {
        if (context == null || aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* renamed from: d */
    public static void m82191d(Context context, Aweme aweme) {
        m82159b(context, "play_failed", aweme, m82027a(context, aweme, "raw ad play failed", false));
    }

    /* renamed from: e */
    public static void m82202e(Context context, Aweme aweme) {
        m82064a(context, "landing_open_url_app", aweme, m82274s(context, aweme, "landing ad open url"));
    }

    /* renamed from: g */
    public static void m82220g(Context context, Aweme aweme) {
        m82064a(context, "landing_deeplink_failed", aweme, m82274s(context, aweme, "landing ad deeplink failed"));
    }

    /* renamed from: h */
    public static void m82229h(Context context, Aweme aweme) {
        m82159b(context, "ad_click", aweme, m82274s(context, aweme, "raw ad ad click"));
    }

    /* renamed from: i */
    public static void m82234i(Context context, Aweme aweme) {
        m82226g(context, "receive", aweme, m82274s(context, aweme, "receive_ad"));
    }

    /* renamed from: l */
    public static void m82249l(Context context, Aweme aweme) {
        m82159b(context, "logo_show", aweme, m82274s(context, aweme, "raw ad logo show"));
    }

    /* renamed from: m */
    public static void m82253m(Context context, Aweme aweme) {
        m82159b(context, "open_url_app", aweme, m82274s(context, aweme, "raw ad open_url_app"));
    }

    /* renamed from: n */
    public static void m82260n(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "click_redpacket", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment end click red packet"));
    }

    /* renamed from: o */
    public static void m82261o(Context context, Aweme aweme) {
        m82159b(context, "deeplink_failed", aweme, m82274s(context, aweme, "raw ad deeplink failed"));
    }

    /* renamed from: p */
    public static void m82265p(Context context, Aweme aweme) {
        m82159b(context, "open_url_h5", aweme, m82274s(context, aweme, "raw ad open_url_h5"));
    }

    /* renamed from: q */
    public static void m82269q(Context context, Aweme aweme) {
        m82251l(context, aweme, "");
    }

    /* renamed from: r */
    public static void m82271r(Context context, Aweme aweme) {
        m82159b(context, "like", aweme, m82274s(context, aweme, "raw like"));
    }

    /* renamed from: s */
    public static void m82275s(Context context, Aweme aweme) {
        m82159b(context, "like_cancel", aweme, m82274s(context, aweme, "raw cancel like"));
    }

    /* renamed from: t */
    public static void m82277t(Context context, Aweme aweme) {
        m82159b(context, "open_url_window_show", aweme, m82274s(context, aweme, "raw open url window show"));
    }

    /* renamed from: u */
    public static void m82281u(Context context, Aweme aweme) {
        m82159b(context, "click_open_url_window_cancel", aweme, m82274s(context, aweme, "raw click_open_url_window_cancel"));
    }

    /* renamed from: v */
    public static void m82284v(Context context, Aweme aweme) {
        m82159b(context, "click_open_url_window_confirm", aweme, m82274s(context, aweme, "raw click_open_url_window_confirm"));
    }

    /* renamed from: w */
    public static void m82287w(Context context, Aweme aweme) {
        m82187c(context, "button_show", aweme, m82274s(context, aweme, "raw ad background button show"));
    }

    /* renamed from: y */
    public static void m82291y(Context context, Aweme aweme) {
        m82187c(context, "click_start", aweme, m82274s(context, aweme, "raw ad background click"));
    }

    /* renamed from: z */
    public static void m82293z(Context context, Aweme aweme) {
        m82187c(context, "click_button", aweme, m82274s(context, aweme, "raw ad background button click"));
    }

    /* renamed from: C */
    public static void m81997C(Context context, Aweme aweme) {
        if (C7213d.m22500a().mo18800bl()) {
            m82086a((Callable) new C24980x(context, aweme));
        } else {
            m82171bb(context, aweme);
        }
    }

    /* renamed from: aA */
    public static void m82088aA(Context context, Aweme aweme) {
        if (m82172bc(context, aweme)) {
            m82067a(context, "draw_ad", "live_show", aweme, m82274s(context, aweme, "live_show"));
        }
    }

    /* renamed from: aB */
    public static void m82089aB(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            C24958f.m81905a().mo65266a("homepage_ad").mo65276b("click_shopwindow").mo65273b(aweme).mo65270a(context);
        }
    }

    /* renamed from: aC */
    public static void m82090aC(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            C24958f.m81905a().mo65266a("homepage_ad").mo65276b("click_download").mo65273b(aweme).mo65270a(context);
        }
    }

    /* renamed from: aD */
    public static void m82091aD(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            C24958f.m81905a().mo65266a("homepage_ad").mo65276b("click_call_dy").mo65273b(aweme).mo65270a(context);
        }
    }

    /* renamed from: aE */
    public static void m82092aE(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            C24958f.m81905a().mo65266a("homepage_ad").mo65276b("click_website").mo65273b(aweme).mo65270a(context);
        }
    }

    /* renamed from: aK */
    public static void m82098aK(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "play_complete", aweme, m82274s(context, aweme, "long video raw ad play"));
        }
    }

    /* renamed from: aL */
    public static void m82099aL(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "break_complete", aweme, m82274s(context, aweme, "long video raw ad break"));
        }
    }

    /* renamed from: aM */
    public static void m82100aM(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "over_complete", aweme, m82274s(context, aweme, "long video raw ad over"));
        }
    }

    /* renamed from: aN */
    public static void m82101aN(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "like_complete", aweme, m82274s(context, aweme, "long video raw ad like"));
        }
    }

    /* renamed from: aO */
    public static void m82102aO(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "like_cancel_complete", aweme, m82274s(context, aweme, "long video raw ad cancel like"));
        }
    }

    /* renamed from: aP */
    public static void m82103aP(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "comment_complete", aweme, m82274s(context, aweme, "long video raw ad comment"));
        }
    }

    /* renamed from: aQ */
    public static void m82104aQ(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "share_complete", aweme, m82274s(context, aweme, "long video raw ad share"));
        }
    }

    /* renamed from: aR */
    public static void m82105aR(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "show_complete", aweme, m82274s(context, aweme, "long video raw ad label show"));
        }
    }

    /* renamed from: aS */
    public static void m82106aS(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "click_complete", aweme, m82274s(context, aweme, "long video raw ad label click"));
        }
    }

    /* renamed from: aT */
    public static void m82107aT(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "progress_complete", aweme, m82274s(context, aweme, "long video raw ad seek complete"));
        }
    }

    /* renamed from: aU */
    public static void m82108aU(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            m82159b(context, "replay_complete", aweme, m82274s(context, aweme, "long video raw ad replay"));
        }
    }

    /* renamed from: ac */
    public static void m82116ac(Context context, Aweme aweme) {
        m82199d(context, "click", aweme, m82027a(context, aweme, "raw homepage ad click", true));
        C24943am.f65779a.mo65218b(aweme);
    }

    /* access modifiers changed from: private */
    /* renamed from: bb */
    public static void m82171bb(Context context, Aweme aweme) {
        m82159b(context, "button_show", aweme, m82274s(context, aweme, "raw ad button show"));
        m82159b(context, "othershow", aweme, m82211f(context, aweme, "raw ad button show refer", "button"));
    }

    /* renamed from: j */
    public static void m82243j(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "click_title", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment end click title"));
    }

    /* renamed from: k */
    public static void m82245k(Context context, Aweme aweme) {
        m82159b(context, "logo_click", aweme, m82274s(context, aweme, "raw ad logo click"));
        C24943am.f65779a.mo65218b(aweme);
    }

    /* renamed from: x */
    public static void m82289x(Context context, Aweme aweme) {
        m82187c(context, "replay", aweme, m82211f(context, aweme, "raw ad background replay", "button"));
        C24943am.f65779a.mo65219c(aweme);
    }

    /* renamed from: aF */
    public static void m82093aF(Context context, Aweme aweme) {
        if (!C6399b.m19944t()) {
            C24958f.m81905a().mo65266a("draw_ad").mo65276b("otherclick").mo65273b(aweme).mo65283e("comment_sign").mo65270a(context);
        }
    }

    /* renamed from: aX */
    public static void m82111aX(Context context, Aweme aweme) {
        if (m82172bc(context, aweme)) {
            JSONObject a = m82027a(context, aweme, "homepage ad click", true);
            try {
                a.put("refer", "photo");
            } catch (JSONException unused) {
            }
            m82071a(context, "homepage_ad", "click", a, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: c */
    public static void m82175c(Context context, Category category) {
        C24958f.m81905a().mo65276b("otherclick").mo65286h(category.getLogExtra()).mo65266a("discovery_ad").mo65283e("title").mo65264a(Long.valueOf(category.getCreativeId())).mo65270a(context);
        C24962g.m81952a((C24939aj) new C24929ab(category), category.getClickTrackUrlList(), true);
    }

    /* renamed from: f */
    public static void m82212f(Context context, Aweme aweme) {
        if (m82172bc(context, aweme)) {
            m82064a(context, "landing_deeplink_success", aweme, m82274s(context, aweme, "landing ad deeplink success"));
            m82073a(new C24986a().mo65408a("landing_ad").mo65406a(System.currentTimeMillis() - DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo65407a(aweme.getAwemeRawAd()).mo65409a());
        }
    }

    /* renamed from: n */
    public static void m82257n(Context context, Aweme aweme) {
        if (m82172bc(context, aweme)) {
            m82159b(context, "deeplink_success", aweme, m82274s(context, aweme, "raw ad deeplink success"));
            m82073a(new C24986a().mo65408a("draw_ad").mo65406a(System.currentTimeMillis() - DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo65407a(aweme.getAwemeRawAd()).mo65409a());
        }
    }

    /* renamed from: az */
    public static void m82139az(Context context, Aweme aweme) {
        if (C25352e.m83231n(aweme) && C25083o.m82609b() != 0) {
            int i = 1;
            if (!C25083o.m82614e()) {
                i = 2;
            }
            long currentTimeMillis = System.currentTimeMillis() - C25083o.m82609b();
            C25083o.m82608a(0);
            HashMap hashMap = new HashMap();
            hashMap.put("feedduration", String.valueOf(currentTimeMillis));
            hashMap.put("awemelaunch", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap));
            m82159b(context, "feed_show", aweme, m82028a(context, aweme, "awesome splash feed show", false, (Map<String, String>) hashMap2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ba */
    public static void m82170ba(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        if (C25352e.m83231n(aweme)) {
            HashMap hashMap2 = new HashMap();
            int i = 1;
            if (!C25083o.m82614e()) {
                i = 2;
            }
            hashMap2.put("awemelaunch", String.valueOf(i));
            hashMap2.put("ad_sequence", Integer.valueOf(SplashAdManagerHolder.m132886a((Context) AwemeApplication.m21341a()).mo50585g()));
            hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
        }
        m82159b(context, "show", aweme, m82028a(context, aweme, "raw ad show", false, (Map<String, String>) hashMap));
        C24943am.f65779a.mo65216a(aweme);
        if (C6399b.m19944t()) {
            C25301by.m83154c(aweme);
        }
        C6877n.m21407a("ctr_monitor", "ctr_show", m82033a(m82274s(context, aweme, "raw ad show")));
    }

    /* renamed from: c */
    public static void m82176c(Context context, Aweme aweme) {
        m82159b(context, "auto_full_screen", aweme, m82274s(context, aweme, "raw ad auto full screen"));
    }

    /* renamed from: h */
    public static void m82232h(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "click_coupon", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment coupon click"));
    }

    /* renamed from: i */
    public static void m82237i(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "click_source", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment end click source"));
    }

    /* renamed from: k */
    public static void m82248k(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "click_call", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment end click call"));
    }

    /* renamed from: l */
    public static void m82252l(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "click_start", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment end click start"));
    }

    /* renamed from: m */
    public static void m82256m(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "close", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment end click close"));
    }

    /* renamed from: aV */
    public static void m82109aV(Context context, Aweme aweme) {
        if (m82172bc(context, aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && !C6319n.m19593a(awemeRawAd.getOpenUrl())) {
                Uri parse = Uri.parse(awemeRawAd.getOpenUrl());
                if ("webcast_room".equals(parse.getHost()) && "ad_link".equals(parse.getQueryParameter("enter_from_merge"))) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from_merge", "ad_link");
                    hashMap.put("action_type", "click");
                    String queryParameter = parse.getQueryParameter("enter_method");
                    if (!C6319n.m19593a(queryParameter)) {
                        hashMap.put("enter_method", queryParameter);
                    }
                    String queryParameter2 = parse.getQueryParameter("user_id");
                    if (!C6319n.m19593a(queryParameter2)) {
                        hashMap.put("anchor_id", queryParameter2);
                    }
                    String queryParameter3 = parse.getQueryParameter("room_id");
                    if (!C6319n.m19593a(queryParameter3)) {
                        hashMap.put("room_id", queryParameter3);
                    }
                    String queryParameter4 = parse.getQueryParameter("video_id");
                    if (!C6319n.m19593a(queryParameter4)) {
                        hashMap.put("video_id", queryParameter4);
                    }
                    String queryParameter5 = parse.getQueryParameter("log_pb");
                    if (!C6319n.m19593a(queryParameter5)) {
                        hashMap.put("log_pb", queryParameter5);
                    }
                    String queryParameter6 = parse.getQueryParameter("request_id");
                    if (!C6319n.m19593a(queryParameter6)) {
                        hashMap.put("request_id", queryParameter6);
                    }
                    C6907h.m21524a("livesdk_live_show", (Map) hashMap);
                }
            }
        }
    }

    /* renamed from: g */
    public static void m82224g(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "ad_click", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment end ad click"));
    }

    /* renamed from: b */
    public static void m82145b(Context context, Category category) {
        C24958f.m81905a().mo65276b("show").mo65286h(category.getLogExtra()).mo65266a("discovery_ad").mo65283e("hashtag").mo65264a(Long.valueOf(category.getCreativeId())).mo65270a(context);
        C24962g.m81952a((C24939aj) new C24928aa(category), category.getTrackUrlList(), false);
    }

    /* renamed from: e */
    public static void m82207e(Context context, AwemeRawAd awemeRawAd) {
        m82188c(context, "comment_end_show", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment end show"));
    }

    /* renamed from: b */
    public static void m82146b(Context context, Aweme aweme) {
        m82159b(context, "delete", aweme, m82274s(context, aweme, "delete"));
    }

    /* renamed from: d */
    public static void m82197d(Context context, AwemeRawAd awemeRawAd) {
        m82160b(context, "click_title", awemeRawAd, m82228h(context, awemeRawAd, "raw feed comment click title"));
    }

    /* renamed from: b */
    public static void m82152b(Context context, Aweme aweme, String str) {
        m82159b(context, str, aweme, m82274s(context, aweme, str));
    }

    /* renamed from: h */
    public static JSONObject m82228h(Context context, AwemeRawAd awemeRawAd, String str) {
        return m82029a(context, awemeRawAd, str, false);
    }

    /* renamed from: s */
    public static JSONObject m82274s(Context context, Aweme aweme, String str) {
        return m82027a(context, aweme, str, false);
    }

    /* renamed from: t */
    public static void m82279t(Context context, Aweme aweme, String str) {
        m82223g(context, aweme, str, (String) null);
    }

    /* renamed from: c */
    private static JSONObject m82174c(Context context, Aweme aweme, JSONObject jSONObject) {
        if (!m82172bc(context, aweme)) {
            return jSONObject;
        }
        return m82031a(context, aweme.getAwemeRawAd(), jSONObject);
    }

    /* renamed from: f */
    public static void m82217f(Context context, AwemeRawAd awemeRawAd, String str) {
        m82061a(context, awemeRawAd, "show", m82228h(context, awemeRawAd, "poi ad show"), str);
    }

    /* renamed from: j */
    public static void m82241j(Context context, Aweme aweme, int i) {
        m82159b(context, "mute", aweme, m82283v(context, aweme, i));
    }

    /* renamed from: k */
    public static void m82246k(Context context, Aweme aweme, int i) {
        m82159b(context, "unmute", aweme, m82286w(context, aweme, i));
    }

    /* renamed from: b */
    public static void m82143b(Context context, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            m82032a(context, jSONObject, str);
        } catch (JSONException unused) {
        }
        m82072a(context, "splash_ad", "open_url_app", jSONObject, String.valueOf(j), 0);
    }

    /* renamed from: d */
    public static void m82192d(Context context, Aweme aweme, int i) {
        m82159b(context, "test_midpoint", aweme, m82028a(context, aweme, "raw feed midpoint", false, m82142b(i)));
    }

    /* renamed from: e */
    public static void m82203e(Context context, Aweme aweme, int i) {
        m82159b(context, "test_third_quartile", aweme, m82028a(context, aweme, "raw feed third_quartile", false, m82142b(i)));
    }

    /* renamed from: g */
    public static void m82221g(Context context, Aweme aweme, int i) {
        m82159b(context, "midpoint", aweme, m82028a(context, aweme, "raw feed midpoint", false, m82142b(i)));
    }

    /* renamed from: h */
    public static void m82230h(Context context, Aweme aweme, int i) {
        m82159b(context, "third_quartile", aweme, m82028a(context, aweme, "raw feed third_quartile", false, m82142b(i)));
    }

    /* renamed from: i */
    public static void m82235i(Context context, Aweme aweme, int i) {
        m82159b(context, "viewable", aweme, m82028a(context, aweme, "raw feed viewable", false, m82142b(i)));
    }

    /* renamed from: l */
    public static void m82250l(Context context, Aweme aweme, int i) {
        m82159b(context, "resume", aweme, m82028a(context, aweme, "raw feed resume", false, m82142b(i)));
    }

    /* renamed from: m */
    public static void m82254m(Context context, Aweme aweme, int i) {
        m82159b(context, "pause", aweme, m82028a(context, aweme, "raw feed pause", false, m82142b(i)));
    }

    /* renamed from: n */
    public static void m82258n(Context context, Aweme aweme, int i) {
        m82159b(context, "buffer_start", aweme, m82028a(context, aweme, "raw feed buffer_start", false, m82142b(i)));
    }

    /* renamed from: o */
    public static void m82262o(Context context, Aweme aweme, int i) {
        m82159b(context, "buffer_end", aweme, m82028a(context, aweme, "raw feed buffer_end", false, m82142b(i)));
    }

    /* renamed from: p */
    public static void m82267p(Context context, Aweme aweme, String str) {
        JSONObject a = m82027a(context, aweme, "raw homepage ad click with refer", true);
        try {
            if (!TextUtils.isEmpty(str)) {
                a.put("refer", str);
            }
        } catch (JSONException unused) {
        }
        m82199d(context, "click", aweme, a);
        C24943am.f65779a.mo65218b(aweme);
    }

    /* renamed from: q */
    public static void m82270q(Context context, Aweme aweme, String str) {
        m82199d(context, "othershow", aweme, m82211f(context, aweme, "raw homepage ad othershow", str));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m82272r(Context context, Aweme aweme, int i) {
        if (C6399b.m19944t()) {
            m82278t(context, aweme, i);
        } else {
            m82276s(context, aweme, i);
        }
        C25294bv.m83105a(aweme);
    }

    /* renamed from: s */
    private static void m82276s(Context context, Aweme aweme, int i) {
        m82159b(context, "play", aweme, m82028a(context, aweme, "raw ad play", false, m82142b(i)));
        C24943am.f65779a.mo65219c(aweme);
    }

    /* renamed from: t */
    private static void m82278t(Context context, Aweme aweme, int i) {
        m82159b(context, "play", aweme, m82280u(context, aweme, i));
        C24943am.f65779a.mo65219c(aweme);
    }

    /* renamed from: y */
    public static void m82292y(Context context, Aweme aweme, String str) {
        m82159b(context, "click", aweme, m81994A(context, aweme, str));
    }

    /* renamed from: z */
    public static void m82294z(Context context, Aweme aweme, String str) {
        m82159b(context, "othershow", aweme, m81994A(context, aweme, str));
    }

    /* renamed from: A */
    private static JSONObject m81994A(Context context, Aweme aweme, String str) {
        JSONObject a = m82027a(context, aweme, "play fun", false);
        try {
            a.put("refer", "fancy");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_fancy", 1);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("type", str);
            }
            a.put("ad_extra_data", jSONObject);
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: d */
    public static void m82194d(Context context, Aweme aweme, String str) {
        if (C25352e.m83224g(aweme)) {
            m82067a(context, str, "shopping_click", aweme, m82028a(context, aweme, "raw ad click shopping", false, (Map<String, String>) m82141b(aweme)));
        }
    }

    /* renamed from: e */
    public static void m82204e(Context context, Aweme aweme, String str) {
        JSONObject a = m82027a(context, aweme, "raw ad click", true);
        if (str != null) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m82159b(context, "click", aweme, a);
        C24943am.f65779a.mo65218b(aweme);
    }

    /* renamed from: g */
    public static void m82222g(Context context, Aweme aweme, String str) {
        JSONObject a = m82027a(context, aweme, "raw ad other click", false);
        if (!TextUtils.isEmpty(str)) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m82218f(context, "otherclick", aweme, a);
    }

    /* renamed from: h */
    public static void m82231h(Context context, Aweme aweme, String str) {
        m82154b(context, aweme, str, null);
    }

    /* renamed from: i */
    public static void m82236i(Context context, Aweme aweme, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
        m82159b(context, "open_url_app", aweme, m82028a(context, aweme, "raw ad open_url_app", false, (Map<String, String>) hashMap));
    }

    /* renamed from: k */
    public static void m82247k(Context context, Aweme aweme, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("fail_reason", "app_uninstalled");
        hashMap2.put("url", str);
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
        m82159b(context, "deeplink_failed", aweme, m82028a(context, aweme, "raw ad deeplink failed", false, (Map<String, String>) hashMap));
    }

    /* renamed from: l */
    public static void m82251l(Context context, Aweme aweme, String str) {
        JSONObject s = m82274s(context, aweme, "raw ad slide");
        if (!TextUtils.isEmpty(str)) {
            try {
                s.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m82159b(context, "slide", aweme, s);
        if (C25352e.m83225h(aweme)) {
            m82159b(context, "click", aweme, m82274s(context, aweme, "raw ad slide+click"));
        }
    }

    /* renamed from: m */
    public static void m82255m(Context context, Aweme aweme, String str) {
        if (!C6399b.m19944t()) {
            JSONObject f = m82211f(context, aweme, "raw homepage change profile tab", "change_profile_tab");
            try {
                f.put("tab_name", str);
            } catch (JSONException unused) {
            }
            m82199d(context, "otherclick", aweme, f);
        }
    }

    /* renamed from: o */
    public static void m82263o(Context context, Aweme aweme, String str) {
        m82159b(context, "location_click", aweme, C24932ae.m81783a(m82274s(context, aweme, "raw ad click location"), str));
    }

    /* renamed from: p */
    public static void m82266p(Context context, Aweme aweme, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("download_status", String.valueOf(i));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap));
        m82159b(context, "download_video_start", aweme, m82028a(context, aweme, "raw ad download video start", false, (Map<String, String>) hashMap2));
    }

    /* renamed from: r */
    public static void m82273r(Context context, Aweme aweme, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap));
        m82159b(context, "download_video_no_download", aweme, m82028a(context, aweme, "raw ad download video no download", false, (Map<String, String>) hashMap2));
    }

    /* renamed from: u */
    public static void m82282u(Context context, Aweme aweme, String str) {
        if (m82172bc(context, aweme)) {
            m82072a(context, "poi_ad", "coupon_click", C24932ae.m81783a(m82274s(context, aweme, "poi coupon click"), str), aweme.getAwemeRawAdIdStr(), m82173c(aweme));
        }
    }

    /* renamed from: v */
    private static JSONObject m82283v(Context context, Aweme aweme, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("playervol", Float.valueOf(0.0f));
        hashMap.put("play_order", Integer.valueOf(i));
        return m82028a(context, aweme, "raw ad play", false, m82025a((Map<String, Object>) hashMap));
    }

    /* renamed from: w */
    public static void m82288w(Context context, Aweme aweme, String str) {
        if (m82172bc(context, aweme)) {
            m82072a(context, "poi_ad", "collect", C24932ae.m81783a(m82274s(context, aweme, "poi collect click"), str), aweme.getAwemeRawAdIdStr(), m82173c(aweme));
        }
    }

    /* renamed from: x */
    public static void m82290x(Context context, Aweme aweme, String str) {
        if (m82172bc(context, aweme)) {
            m82072a(context, "poi_ad", "collect_cancel", C24932ae.m81783a(m82274s(context, aweme, "poi collect cancel click"), str), aweme.getAwemeRawAdIdStr(), m82173c(aweme));
        }
    }

    /* renamed from: f */
    public static void m82213f(Context context, Aweme aweme, int i) {
        m82159b(context, "first_quartile", aweme, m82028a(context, aweme, "raw feed first quartile", false, m82142b(i)));
    }

    /* renamed from: j */
    public static void m82242j(Context context, Aweme aweme, String str) {
        if (m82172bc(context, aweme)) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("url", str);
            hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
            m82159b(context, "deeplink_success", aweme, m82028a(context, aweme, "raw ad deeplink success", false, (Map<String, String>) hashMap));
            m82073a(new C24986a().mo65408a("draw_ad").mo65406a(System.currentTimeMillis() - DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo65407a(aweme.getAwemeRawAd()).mo65409a());
        }
    }

    /* renamed from: n */
    public static void m82259n(Context context, Aweme aweme, String str) {
        JSONObject s = m82274s(context, aweme, "raw ad comment");
        if (!TextUtils.isEmpty(str)) {
            try {
                s.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m82159b(context, "comment", aweme, s);
    }

    /* renamed from: u */
    private static JSONObject m82280u(Context context, Aweme aweme, int i) {
        int i2;
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        HashMap hashMap = new HashMap();
        hashMap.put("play_order", Integer.valueOf(i));
        if (audioManager != null) {
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i2 = -1;
        }
        float f = 0.0f;
        if (i2 > 0) {
            f = ((float) i2) / 100.0f;
        }
        hashMap.put("playervol", Float.valueOf(((float) ((int) (f * 1000.0f))) * 0.001f));
        return m82028a(context, aweme, "raw ad play", false, m82025a((Map<String, Object>) hashMap));
    }

    /* renamed from: v */
    public static void m82285v(Context context, Aweme aweme, String str) {
        if (m82172bc(context, aweme)) {
            m82072a(context, "poi_ad", "phone_click", C24932ae.m81783a(m82274s(context, aweme, "poi phone click"), str), aweme.getAwemeRawAdIdStr(), m82173c(aweme));
        }
    }

    /* renamed from: w */
    private static JSONObject m82286w(Context context, Aweme aweme, int i) {
        int i2;
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        HashMap hashMap = new HashMap();
        if (audioManager != null) {
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i2 = -1;
        }
        float f = 0.0f;
        if (i2 > 0) {
            f = ((float) i2) / 100.0f;
        }
        hashMap.put("playervol", Float.valueOf(((float) ((int) (f * 1000.0f))) * 0.001f));
        hashMap.put("play_order", Integer.valueOf(i));
        return m82028a(context, aweme, "raw ad play", false, m82025a((Map<String, Object>) hashMap));
    }

    /* renamed from: b */
    public static void m82144b(Context context, Banner banner, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i));
        C24958f.m81905a().mo65276b("show").mo65286h(banner.getLogExtra()).mo65266a("discovery_ad").mo65283e("banner").mo65264a(Long.valueOf(banner.getCreativeId())).mo65265a((Object) hashMap).mo65270a(context);
        C24962g.m81954a((C24939aj) new C24931ad(banner, hashMap), (Collection<String>) banner.getTrackUrlList(), false);
    }

    /* renamed from: c */
    public static void m82177c(Context context, Aweme aweme, int i) {
        m82159b(context, "test_first_quartile", aweme, m82028a(context, aweme, "raw feed first quartile", false, m82142b(i)));
    }

    /* renamed from: e */
    public static void m82206e(Context context, Aweme aweme, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) map));
        m82159b(context, "feed_firstshow", aweme, m82028a(context, aweme, "", false, (Map<String, String>) hashMap));
    }

    /* renamed from: f */
    public static void m82214f(Context context, Aweme aweme, String str) {
        JSONObject a = m82027a(context, aweme, "raw ad other click", false);
        if (!TextUtils.isEmpty(str)) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m82159b(context, "otherclick", aweme, a);
    }

    /* renamed from: i */
    public static void m82238i(Context context, AwemeRawAd awemeRawAd, String str) {
        if (m82264o(context, awemeRawAd) && !TextUtils.isEmpty(str)) {
            m82071a(context, str, "hide_app", m82228h(context, awemeRawAd, "ad hide app event"), awemeRawAd);
        }
    }

    /* renamed from: c */
    private static void m82178c(Context context, Aweme aweme, long j) {
        if (m82169b() && m82172bc(context, aweme)) {
            m82159b(context, "first_view", aweme, m82174c(context, aweme, m82034a((JSONObject) null, j)));
        }
    }

    /* renamed from: d */
    public static void m82196d(Context context, Aweme aweme, Map<String, String> map) {
        m82159b(context, "splash_click", aweme, m82028a(context, aweme, "raw ad splash_click", false, map));
    }

    /* renamed from: f */
    public static void m82215f(Context context, Aweme aweme, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) map));
        m82159b(context, "feed_lastshow", aweme, m82028a(context, aweme, "", false, (Map<String, String>) hashMap));
    }

    /* renamed from: g */
    public static void m82225g(Context context, AwemeRawAd awemeRawAd, String str) {
        m82061a(context, awemeRawAd, "click", m82029a(context, awemeRawAd, "poi ad click", true), str);
    }

    /* renamed from: e */
    public static void m82208e(Context context, AwemeRawAd awemeRawAd, String str) {
        m82161b(context, "click", awemeRawAd, m82029a(context, awemeRawAd, "raw feed comment end click", true), str);
        C24943am.f65779a.mo65217a(awemeRawAd);
    }

    /* renamed from: b */
    public static void m82147b(Context context, Aweme aweme, int i) {
        if (C7213d.m22500a().mo18800bl()) {
            m82086a((Callable) new C24978v(context, aweme, i));
        } else {
            m82272r(context, aweme, i);
        }
    }

    /* renamed from: d */
    public static void m82198d(Context context, AwemeRawAd awemeRawAd, String str) {
        m82066a(context, "click", awemeRawAd, m82029a(context, awemeRawAd, "raw feed comment click", true), str);
        C24943am.f65779a.mo65217a(awemeRawAd);
    }

    /* renamed from: c */
    public static void m82189c(Context context, String str, String str2, String str3) {
        m82070a(context, "otherclick", str, str2, str3);
    }

    /* renamed from: d */
    public static void m82200d(Context context, String str, String str2, String str3) {
        m82070a(context, "othershow", str, str2, str3);
    }

    /* renamed from: e */
    public static void m82210e(Context context, String str, String str2, String str3) {
        m82070a(context, "button_show", str, str2, str3);
    }

    /* renamed from: g */
    public static void m82227g(Context context, String str, String str2, String str3) {
        m82070a(context, "click", str, str2, str3);
    }

    /* renamed from: i */
    public static void m82239i(Context context, String str, String str2, String str3) {
        m82163b(context, "replay", str, str2, str3);
    }

    /* renamed from: f */
    private static JSONObject m82211f(Context context, Aweme aweme, String str, String str2) {
        JSONObject a = m82027a(context, aweme, str, false);
        try {
            if (!TextUtils.isEmpty(str2)) {
                a.put("refer", str2);
            }
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: j */
    public static void m82244j(Context context, String str, String str2, String str3) {
        m82163b(context, "click", str, str2, str3);
    }

    /* renamed from: a */
    private static JSONObject m82026a(Context context, LinkData linkData, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            m82032a(context, jSONObject, linkData.logExtra);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
                jSONObject.put("item_id", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: d */
    public static void m82193d(Context context, Aweme aweme, long j, int i) {
        if (!C6399b.m19944t() && aweme != null && aweme.isAd()) {
            HashMap hashMap = new HashMap();
            if (C25294bv.m83113e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(C25294bv.m83112d(aweme) ? 1 : 0));
            }
            JSONObject a = m82028a(context, aweme, "raw ad over duration", false, m82025a((Map<String, Object>) hashMap));
            try {
                a.put("duration", j);
                a.put("video_length", i);
            } catch (JSONException unused) {
            }
            C25294bv.m83109b(aweme);
            m82159b(context, "over", aweme, a);
            C24943am.f65779a.mo65221e(aweme);
        }
    }

    /* renamed from: e */
    public static void m82205e(Context context, Aweme aweme, String str, String str2) {
        if (m82172bc(context, aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("refer", str);
            m82072a(context, "poi_ad", "otherclick", C24932ae.m81783a(m82028a(context, aweme, "poi other click", false, (Map<String, String>) hashMap), str2), aweme.getAwemeRawAdIdStr(), m82173c(aweme));
        }
    }

    /* renamed from: g */
    private static void m82223g(Context context, Aweme aweme, String str, String str2) {
        JSONObject s = m82274s(context, aweme, "applet_click");
        try {
            s.put("refer", null);
        } catch (JSONException unused) {
        }
        m82067a(context, str, "applet_click", aweme, s);
    }

    /* renamed from: a */
    private static JSONObject m82027a(Context context, Aweme aweme, String str, boolean z) {
        return m82028a(context, aweme, str, z, null);
    }

    /* renamed from: d */
    public static void m82195d(Context context, Aweme aweme, String str, String str2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap2.put("fail_reason", str2);
        }
        hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
        m82159b(context, "deeplink_failed", aweme, m82028a(context, aweme, "raw ad deeplink failed", false, (Map<String, String>) hashMap));
    }

    /* renamed from: h */
    public static void m82233h(Context context, String str, String str2, String str3) {
        m82163b(context, "button_show", str, str2, str3);
    }

    /* renamed from: a */
    private static JSONObject m82029a(Context context, AwemeRawAd awemeRawAd, String str, boolean z) {
        return m82030a(context, awemeRawAd, str, z, null);
    }

    /* renamed from: c */
    public static void m82179c(Context context, Aweme aweme, long j, int i) {
        if (!C6399b.m19944t() && aweme != null && aweme.isAd()) {
            HashMap hashMap = new HashMap();
            if (C25294bv.m83113e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(C25294bv.m83112d(aweme) ? 1 : 0));
            }
            JSONObject a = m82028a(context, aweme, "raw ad over duration", false, m82025a((Map<String, Object>) hashMap));
            try {
                a.put("duration", j);
                a.put("video_length", i);
            } catch (JSONException unused) {
            }
            C25294bv.m83106a(aweme, j);
            m82159b(context, "break", aweme, a);
        }
    }

    /* renamed from: f */
    private static void m82218f(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m82172bc(context, aweme)) {
            m82071a(context, "comment_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: g */
    private static void m82226g(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m82172bc(context, aweme)) {
            m82071a(context, "receive_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: e */
    private static void m82209e(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m82172bc(context, aweme)) {
            m82071a(context, "feed_form", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: f */
    public static void m82219f(Context context, String str, String str2, String str3) {
        m82070a(context, "replay", str, str2, str3);
    }

    /* renamed from: a */
    private static JSONObject m82028a(Context context, Aweme aweme, String str, boolean z, Map<String, String> map) {
        if (!m82172bc(context, aweme)) {
            return new JSONObject();
        }
        return m82030a(context, aweme.getAwemeRawAd(), str, z, map);
    }

    /* renamed from: a */
    private static JSONObject m82030a(Context context, AwemeRawAd awemeRawAd, String str, boolean z, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            m82032a(context, jSONObject, awemeRawAd.getLogExtra());
            if (z) {
                jSONObject.put("has_v3", "1");
            }
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            C6921a.m21554a((Exception) e);
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m82180c(Context context, Aweme aweme, long j, int i, String str, Integer num) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            HashMap hashMap = new HashMap();
            if (C6399b.m19944t()) {
                hashMap.put("play_order", Integer.valueOf(i));
            }
            if (C25294bv.m83113e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(C25294bv.m83112d(aweme) ? 1 : 0));
            }
            int i2 = 0;
            JSONObject a = m82028a(context, aweme, "raw ad over duration", false, m82025a((Map<String, Object>) hashMap));
            try {
                a.put("duration", j);
                if (aweme.getVideo() != null) {
                    i2 = aweme.getVideo().getVideoLength();
                }
                a.put("video_length", i2);
                if (TextUtils.equals(str, "play_break")) {
                    a.put("user_id", C21115b.m71197a().getCurUserId());
                }
                if (num != null) {
                    a.put("break_reason", num);
                }
            } catch (JSONException unused) {
            }
            C25294bv.m83106a(aweme, j);
            m82159b(context, str, aweme, a);
            if (C6399b.m19944t()) {
                C25301by.m83145a("pause", aweme, "play_break");
            }
        }
    }
}
