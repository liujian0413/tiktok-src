package com.p280ss.android.ugc.aweme.profile.util;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21718a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.util.x */
public final class C36767x {
    /* renamed from: a */
    public static void m118508a(String str) {
        C6907h.m21524a("spread_follow_card", (Map) C22984d.m75611a().mo59973a("from_user_id", str).f60753a);
    }

    /* renamed from: a */
    public static void m118511a(String str, String str2, String str3) {
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_method", "click_card").mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", str2).mo59973a("req_id", str).mo59973a("from_user_id", str3).f60753a);
    }

    /* renamed from: a */
    public static void m118509a(String str, int i, String str2, String str3) {
        C6907h.m21524a("follow_card", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("event_type", "impression").mo59973a("req_id", str).mo59970a("impr_order", i).mo59973a("rec_uid", str2).mo59973a("from_user_id", str3).f60753a);
    }

    /* renamed from: b */
    public static void m118514b(String str, int i, String str2, String str3) {
        C6907h.m21524a("follow_card", (Map) C22984d.m75611a().mo59973a("rec_uid", str).mo59973a("enter_from", "others_homepage").mo59973a("event_type", "delete").mo59970a("impr_order", i).mo59973a("req_id", str2).mo59973a("from_user_id", str3).f60753a);
    }

    /* renamed from: b */
    public static void m118515b(String str, String str2, String str3, String str4) {
        C6907h.m21524a("follow_card", (Map) C22984d.m75611a().mo59973a("enter_method", "follow_card_button").mo59973a("enter_from", "others_homepage").mo59973a("previous_page", str3).mo59973a("event_type", "follow_cancel").mo59973a("req_id", str).mo59973a("to_user_id", str2).mo59973a("from_user_id", str4).f60753a);
    }

    /* renamed from: a */
    public static void m118512a(String str, String str2, String str3, String str4) {
        C6907h.m21524a("follow_card", (Map) C22984d.m75611a().mo59973a("enter_method", "follow_card_button").mo59973a("enter_from", "others_homepage").mo59973a("previous_page", str3).mo59973a("event_type", "follow").mo59973a("req_id", str).mo59973a("to_user_id", str2).mo59973a("from_user_id", str4).f60753a);
    }

    /* renamed from: b */
    public static void m118516b(String str, String str2, String str3, String str4, String str5) {
        C6907h.m21524a("follow_cancel", (Map) C22984d.m75611a().mo59973a("enter_method", "follow_card_button").mo59973a("enter_from", "others_homepage").mo59973a("previous_page", str4).mo59973a("event_type", "card").mo59973a("impr_id", str).mo59973a("req_id", str2).mo59973a("to_user_id", str3).mo59973a("from_user_id", str5).f60753a);
    }

    /* renamed from: a */
    public static void m118513a(String str, String str2, String str3, String str4, String str5) {
        C6907h.m21524a("follow", (Map) C22984d.m75611a().mo59973a("enter_method", "follow_card_button").mo59973a("enter_from", "others_homepage").mo59973a("previous_page", str4).mo59973a("event_type", "card").mo59973a("impr_id", str).mo59973a("req_id", str2).mo59973a("to_user_id", str3).mo59973a("from_user_id", str5).f60753a);
    }

    /* renamed from: a */
    public static void m118510a(String str, String str2, int i, String str3, String str4, User user) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rec_uid", str);
            jSONObject.put("enter_from", "others_homepage");
            jSONObject.put("event_type", str2);
            jSONObject.put("impr_order", i);
            jSONObject.put("req_id", str3);
            jSONObject.put("is_direct", 1);
            jSONObject.put("page_status", str4);
            jSONObject.put("rec_user_type", C21718a.m72637a(user));
        } catch (JSONException unused) {
        }
        C6907h.m21525a("follow_card", jSONObject);
    }
}
