package com.p280ss.android.ugc.aweme.p313im;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.g */
public final class C30560g {
    /* renamed from: d */
    public static void m99824d() {
        C6907h.m21524a("create_chat_click", (Map) new HashMap());
    }

    /* renamed from: e */
    public static void m99827e() {
        C6907h.m21524a("im_share_head_show", (Map) new HashMap());
    }

    /* renamed from: a */
    public static void m99814a() {
        C6907h.onEvent(MobClick.obtain().setEventName("create_chat").setLabelName("message"));
    }

    /* renamed from: b */
    public static void m99820b() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "message");
        hashMap.put("enter_method", "click_contact_button");
        C6907h.m21524a("enter_contact_list", (Map) hashMap);
    }

    /* renamed from: c */
    public static void m99822c() {
        C6907h.onEvent(MobClick.obtain().setEventName("privacy").setLabelName("settings"));
    }

    /* renamed from: b */
    public static void m99821b(String str) {
        m99818a("chat", str, "");
    }

    /* renamed from: a */
    public static void m99816a(String str) {
        C6907h.m21518a(C6399b.m19921a(), "chat", "others_homepage", str, 0);
    }

    /* renamed from: c */
    public static void m99823c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        C6907h.m21524a("inner_push_setting", (Map) hashMap);
    }

    /* renamed from: d */
    public static void m99825d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        C6907h.m21524a("live_inner_push_setting", (Map) hashMap);
    }

    /* renamed from: e */
    private static String m99826e(String str) {
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        return new C6600e().mo15979b((Object) logPbBean);
    }

    /* renamed from: a */
    public static void m99815a(Context context) {
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "others_homepage");
        if (context != null) {
            z = C6776h.m20948b(context, "my.maya.android");
        } else {
            z = false;
        }
        if (z) {
            str = "open";
        } else {
            str = "install";
        }
        hashMap.put("action_type", str);
        C6907h.m21524a("duoshan_banner_show", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m99817a(String str, String str2) {
        C6907h.onEvent(MobClick.obtain().setEventName("unblock").setLabelName(str).setValue(str2));
    }

    /* renamed from: a */
    public static void m99818a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject = null;
        }
        C6907h.onEvent(MobClick.obtain().setEventName("block").setLabelName(str).setValue(str2).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m99819a(String str, String str2, String str3, String str4, String str5) {
        C22984d a = C22984d.m75611a().mo59973a("author_id", str).mo59973a("enter_from", "others_homepage").mo59973a("enter_type", "normal_way").mo59973a("group_id", str2).mo59973a("previous_page", str3).mo59973a("log_pb", m99826e(str4)).mo59973a("to_user_id", str).mo59973a("enter_method", str5);
        if (!C6399b.m19944t()) {
            a.mo59973a("conversation_id", C30553b.m99810g().getConversationId(str));
        }
        C6907h.m21524a("enter_chat", (Map) a.f60753a);
    }
}
