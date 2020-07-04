package com.p280ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.live.d */
public final class C41989d {
    /* renamed from: a */
    public static void m133475a(Context context, String str, String str2, String str3, long j, String str4) {
        m133468a(context, 1, str3, j, m133466a(str, "video", str2, str4));
    }

    /* renamed from: a */
    public static void m133476a(Context context, boolean z, int i, String str, String str2, long j) {
        m133468a(context, i, str2, j, m133465a(z ? "homepage" : "others_homepage", "head", str));
    }

    /* renamed from: a */
    public static void m133474a(Context context, String str, String str2, String str3, long j) {
        m133468a(context, 1, str3, j, m133465a(str, "head", str2));
    }

    /* renamed from: a */
    public static void m133473a(Context context, String str, String str2, long j, boolean z) {
        JSONObject a = m133465a("homepage_follow", "live", str);
        if (z) {
            try {
                a.put("enter_method", "click_watch_button");
            } catch (JSONException unused) {
            }
        }
        m133468a(context, 1, str2, j, a);
    }

    /* renamed from: a */
    public static void m133487a(String str, String str2, boolean z) {
        C6907h.onEvent(MobClick.obtain().setEventName("live_merge_show").setLabelName(str2).setJsonObject(new C6909j().mo16966a("request_id", str).mo16966a("enter_method", z ? "new_type" : "normal_type").mo16966a("page_name", str2).mo16967a()));
    }

    /* renamed from: a */
    public static void m133486a(String str, String str2, String str3, String str4, String str5, String str6) {
        C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("personal_homepage").setValue(str).setExtValueString(str2).setJsonObject(new C6909j().mo16966a("enter_from", "live_aud").mo16966a("request_id", str3).mo16966a("user_id", str4).mo16966a("user_type", str5).mo16966a("position", str6).mo16967a()));
    }

    /* renamed from: a */
    public static void m133485a(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", str3);
        hashMap.put("room_id", str4);
        hashMap.put("user_type", bool.booleanValue() ? "host" : "aud");
        hashMap.put("enter_from", str);
        hashMap.put("previous_page", str2);
        hashMap.put("to_user_id", str5);
        hashMap.put("request_id", str6);
        C6907h.m21524a("follow", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m133477a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("scene_id", "1003");
        C6907h.m21524a("enter_wallet_page", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m133488a(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        if (z) {
            hashMap.put("ui_type", "new_type");
        } else {
            hashMap.put("ui_type", "normal_type");
        }
        C6907h.m21524a("live_merge_show", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m133484a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("ui_type", str2);
        C6907h.m21524a("enter_live_merge", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m133480a(String str, long j, String str2, String str3, int i, int i2, boolean z, String str4, String str5, String str6) {
        m133481a(str, j, str2, str3, -1, -1, z, str4, str5, "click", str6);
    }

    /* renamed from: a */
    public static void m133483a(String str, long j, String str2, String str3, String str4, int i, boolean z, String str5) {
        m133482a(str, j, str2, str3, str4, i, -1, z, str5);
    }

    /* renamed from: a */
    private static void m133482a(String str, long j, String str2, String str3, String str4, int i, int i2, boolean z, String str5) {
        m133479a(str, j, str2, str4, i, -1, z, str5, str3);
    }

    /* renamed from: a */
    public static void m133479a(String str, long j, String str2, String str3, int i, int i2, boolean z, String str4, String str5) {
        m133481a(str, j, str2, str3, i, i2, z, str4, str5, "click", null);
    }

    /* renamed from: a */
    public static void m133481a(String str, long j, String str2, String str3, int i, int i2, boolean z, String str4, String str5, String str6, String str7) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", str);
        hashMap.put("room_id", String.valueOf(j));
        hashMap.put("enter_from_merge", str2);
        hashMap.put("scene_id", "1003");
        hashMap.put("action_type", str6);
        hashMap.put("video_id", str4);
        hashMap.put("sdk_version", "1380");
        hashMap.put("previous_page", str7);
        hashMap.put("request_id", str3);
        if ("live_merge".equals(str2) || "homepage_fresh".equals(str2) || "homepage_channel".equals(str2)) {
            hashMap.put(POIService.KEY_ORDER, String.valueOf(i));
        }
        if (i2 > 0) {
            String str8 = "room_type";
            int i3 = 5;
            if (i2 != 5) {
                i3 = i2 == 6 ? 1 : 4;
            }
            hashMap.put(str8, String.valueOf(i3));
        }
        if (str5 != null) {
            hashMap.put("enter_method", str5);
        }
        hashMap.put("_param_live_platform", "live");
        hashMap.put("sdk_version", "1380");
        C6907h.m21524a("livesdk_live_show", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m133478a(String str, long j, String str2) {
        String str3 = "livesdk_push_click_lookup_anchor";
        C22984d a = C22984d.m75611a().mo59973a("anchor_id", str).mo59973a("anchor_status", str2);
        String str4 = "room_id";
        if (j <= 0) {
            j = 0;
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, String.valueOf(j)).f60753a);
    }

    /* renamed from: a */
    public static void m133467a() {
        C6907h.m21524a("livesdk_pm_live_takepage_show", (Map) C22984d.m75611a().mo59973a("event_type", "show").mo59973a("event_page", "live_take_page").mo59973a("event_belong", "live_take").f60753a);
    }

    /* renamed from: b */
    public static void m133491b(String str) {
        m133492b(str, "");
    }

    /* renamed from: c */
    public static void m133495c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("_param_live_platform", "live");
        C6907h.m21524a("livesdk_live_merge_show", (Map) hashMap);
    }

    /* renamed from: b */
    public static void m133492b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("_param_live_platform", "live");
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gd_label", str2);
        }
        C6907h.m21524a("livesdk_enter_live_merge", (Map) hashMap);
    }

    /* renamed from: c */
    public static void m133496c(String str, String str2) {
        C6907h.m21524a("livesdk_push_click", (Map) C22984d.m75611a().mo59973a("anchor_id", str2).mo59973a("room_id", str).f60753a);
    }

    /* renamed from: a */
    private static JSONObject m133465a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("position", str);
            if (TextUtils.equals(C6399b.m19929e(), "musical_ly")) {
                if (TextUtils.equals(str, "push")) {
                    str2 = "click_push";
                } else if (!TextUtils.equals(str, "homepage_follow") || !TextUtils.equals(str2, "head")) {
                    if (!TextUtils.equals(str, "others_homepage")) {
                        if (!TextUtils.equals(str2, "video")) {
                            if (TextUtils.equals(str, "message")) {
                                str2 = "click_watch_button";
                            }
                        }
                    }
                    str2 = "click_head";
                } else {
                    str2 = "click_watch_button";
                }
                jSONObject.put("enter_method", str2);
            } else {
                jSONObject.put("style", str2);
            }
            jSONObject.put("request_id", str3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m133466a(String str, String str2, String str3, String str4) {
        JSONObject a = m133465a(str, str2, str3);
        try {
            a.put("video_value", str4);
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: a */
    public static void m133472a(Context context, String str, String str2, long j) {
        m133468a(context, 1, str2, j, m133465a("message", "head", str));
    }

    /* renamed from: b */
    public static void m133489b(Context context, int i, String str, String str2, long j) {
        m133468a(context, 0, str2, j, m133465a("homepage_follow", "video", str));
    }

    /* renamed from: c */
    public static void m133493c(Context context, int i, String str, String str2, long j) {
        m133468a(context, 0, str2, j, m133465a("homepage_hot", "video", str));
    }

    /* renamed from: a */
    private static void m133468a(Context context, int i, String str, long j, JSONObject jSONObject) {
        if (i == 0) {
            C6907h.m21519a(context, "impression", "live", str, j, jSONObject);
        } else if (i == 1 && jSONObject != null) {
            C6907h.m21519a(context, "enter_detail", "live_aud", str, j, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m133469a(Context context, int i, String str, String str2, long j) {
        m133468a(context, 1, str2, j, m133465a("push", "push", str));
    }

    /* renamed from: b */
    public static void m133490b(Context context, int i, String str, String str2, long j, String str3) {
        JSONObject a = m133465a("homepage_follow", "video", str);
        try {
            a.put("page_name", str3);
        } catch (JSONException unused) {
        }
        m133468a(context, 0, str2, j, a);
    }

    /* renamed from: c */
    public static void m133494c(Context context, int i, String str, String str2, long j, String str3) {
        JSONObject a = m133465a("homepage_follow", "video", str);
        try {
            a.put("video_value", str3);
        } catch (JSONException unused) {
        }
        m133468a(context, 1, str2, j, a);
    }

    /* renamed from: d */
    public static void m133497d(Context context, int i, String str, String str2, long j, String str3) {
        JSONObject a = m133465a("homepage_hot", "video", str);
        try {
            a.put("video_value", str3);
        } catch (JSONException unused) {
        }
        m133468a(context, 1, str2, j, a);
    }

    /* renamed from: a */
    public static void m133470a(Context context, int i, String str, String str2, long j, String str3) {
        JSONObject a = m133465a("toplist", "head", str);
        try {
            a.put("page_name", str3);
        } catch (JSONException unused) {
        }
        m133468a(context, i, str2, j, a);
    }

    /* renamed from: a */
    public static final void m133471a(Context context, int i, String str, String str2, String str3, long j) {
        m133468a(context, i, str3, j, m133465a(str, "head", str2));
    }
}
