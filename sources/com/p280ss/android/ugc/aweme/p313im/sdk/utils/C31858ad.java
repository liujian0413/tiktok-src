package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.SessionInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CheckMessage;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCouponContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareRankingListContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.C6990a;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31472b;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31476g;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31477h;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.XPlanAwemeBannerConfig;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7105b;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ad */
public final class C31858ad {

    /* renamed from: a */
    private static SessionInfo f83322a;

    /* renamed from: b */
    private static final HashSet<String> f83323b;

    /* renamed from: b */
    public static SessionInfo m103442b() {
        return f83322a;
    }

    /* renamed from: a */
    public static void m103424a(String str, String str2) {
        C6907h.m21518a(C6399b.m19921a(), "follow", "chat", str2, C6425b.m20074a(str));
    }

    /* renamed from: a */
    public static void m103420a(String str) {
        long a = C6425b.m20074a(str);
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        hashMap.put("to_user_id", sb.toString());
        hashMap.put("previous_page", "message");
        hashMap.put("previous_page_position", "other_places");
        hashMap.put("enter_from", "chat");
        hashMap.put("enter_method", "follow_button");
        C6907h.m21524a("follow", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103429a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", str2);
            jSONObject.put("search_keyword", str3);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("chat").setLabelName("message").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m103432a(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("to_user_id", str2);
        hashMap.put("chat_type", str3);
        hashMap.put("enter_from", str5);
        hashMap.put("enter_method", str4);
        C6907h.m21524a("enter_chat", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103431a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", "chat");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("group_id", str2);
            }
            jSONObject.put("enter_method", str4);
            jSONObject.put("user_type", str3);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m103422a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i2;
        int i18 = i4;
        int i19 = i6;
        int i20 = i8;
        int i21 = i10;
        int i22 = i12;
        int i23 = i14;
        int i24 = i16;
        StringBuilder sb = new StringBuilder("[");
        sb.append(i + i17);
        sb.append(",");
        sb.append(i2);
        sb.append("]");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(i3 + i18);
        sb3.append(",");
        sb3.append(i18);
        sb3.append("]");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder("[");
        sb5.append(i5 + i19);
        sb5.append(",");
        sb5.append(i19);
        sb5.append("]");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder("[");
        sb7.append(i7 + i20);
        sb7.append(",");
        sb7.append(i20);
        sb7.append("]");
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder("[");
        sb9.append(i9 + i21);
        sb9.append(",");
        sb9.append(i21);
        sb9.append("]");
        String sb10 = sb9.toString();
        StringBuilder sb11 = new StringBuilder("[");
        sb11.append(i11 + i22);
        sb11.append(",");
        sb11.append(i22);
        sb11.append("]");
        String sb12 = sb11.toString();
        StringBuilder sb13 = new StringBuilder("[");
        sb13.append(i13 + i23);
        sb13.append(",");
        sb13.append(i23);
        sb13.append("]");
        String sb14 = sb13.toString();
        StringBuilder sb15 = new StringBuilder("[");
        sb15.append(i15 + i24);
        sb15.append(",");
        sb15.append(i24);
        sb15.append("]");
        String sb16 = sb15.toString();
        long a = C6425b.m20074a(str);
        HashMap hashMap = new HashMap();
        hashMap.put("send_message", sb2);
        hashMap.put("send_emoji", sb4);
        hashMap.put("send_favorite_emoji", sb6);
        hashMap.put("send_giphy", sb8);
        hashMap.put("send_pic", sb10);
        hashMap.put("send_text", sb12);
        hashMap.put("send_audio", sb14);
        hashMap.put("send_video", sb16);
        hashMap.put("to_user_id", String.valueOf(a));
        C6907h.m21524a("chat_stats", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo82715a(Message message) {
        m103412a(message, "click");
    }

    /* renamed from: a */
    public static void m103426a(String str, String str2, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "chat_stats");
        hashMap.put("label", "message");
        hashMap.put("success_cnt", String.valueOf(i));
        hashMap.put("fail_cnt", String.valueOf(i2));
        hashMap.put("session_id", String.valueOf(C6425b.m20074a(str)));
        hashMap.put("source_type", str2);
        C6956a.m21632a().mo18009f().monitorMsgSendStatus(hashMap);
    }

    /* renamed from: a */
    public final void mo82716a(SharePackage sharePackage, IMContact iMContact, boolean z) {
        if (sharePackage != null) {
            String str = sharePackage.f20181g;
            if ("aweme".equals(str)) {
                m103446b(sharePackage, iMContact, z);
            } else if ("poi".equals(str)) {
                m103454c(sharePackage, iMContact, z);
            } else if ("music".equals(str)) {
                m103460d(sharePackage, iMContact, z);
            } else if ("challenge".equals(str)) {
                m103466e(sharePackage, iMContact, z);
            } else if ("ranking".equals(str)) {
                m103471f(sharePackage, iMContact, z);
            } else if ("user".equals(str)) {
                m103476g(sharePackage, iMContact, z);
            } else if ("web".equals(str)) {
                m103481h(sharePackage, iMContact, z);
            } else if ("live".equals(str)) {
                m103485i(sharePackage, iMContact, z);
            } else if ("good".equals(str) || "good_window".equals(str)) {
                m103489j(sharePackage, iMContact, z);
            } else if ("coupon".equals(str)) {
                m103492k(sharePackage, iMContact, z);
            } else if ("mix".equals(str)) {
                m103419a(sharePackage, iMContact);
            } else {
                if ("sticker".equals(str)) {
                    m103445b(sharePackage, iMContact);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m103440a(Map<String, String> map, IMContact iMContact) {
        if (iMContact == null) {
            map.put("to_user_id", TEVideoRecorder.FACE_BEAUTY_NULL);
            map.put("conversation_id", TEVideoRecorder.FACE_BEAUTY_NULL);
        } else if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            map.put("to_user_id", iMUser.getUid());
            map.put("conversation_id", C6425b.m20076a(Long.valueOf(Long.parseLong(iMUser.getUid())).longValue()));
        } else {
            if (iMContact instanceof IMConversation) {
                map.put("conversation_id", ((IMConversation) iMContact).getConversationId());
                map.put("to_user_id", TEVideoRecorder.FACE_BEAUTY_NULL);
            }
        }
    }

    /* renamed from: a */
    private void m103419a(SharePackage sharePackage, IMContact iMContact) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "compilation_detail");
        hashMap.put("previous_page", sharePackage.f20186l.getString("previous_page"));
        hashMap.put("compilation_id", sharePackage.f20186l.getString("compilation_id"));
        hashMap.put("author_id", sharePackage.f20186l.getString("user_id"));
        hashMap.put("platform", "chat");
        String str = "";
        if (iMContact instanceof IMUser) {
            str = "private";
        } else if (iMContact instanceof IMConversation) {
            str = "group";
        }
        hashMap.put("chat_type", str);
        m103440a((Map<String, String>) hashMap, iMContact);
        C6907h.m21524a("share_compilation", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103414a(ShareRankingListContent shareRankingListContent, String str, String str2, boolean z) {
        if (shareRankingListContent != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("to_user_id", str);
            hashMap.put("conversation_id", str2);
            hashMap.put("enter_from", "chat");
            hashMap.put("action_type", z ? "click" : "show");
            C6907h.m21524a("hot_search_icon", (Map) hashMap);
        }
    }

    /* renamed from: a */
    public static void m103441a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        C6907h.m21524a("flipchat_message_entrance", (Map) hashMap);
        HashMap hashMap2 = new HashMap();
        if (z) {
            hashMap2.put("need_login", "no");
        } else {
            hashMap2.put("need_login", "yes");
        }
        C6907h.m21524a("flipchat_sdk_entrance_click", (Map) hashMap2);
    }

    /* renamed from: a */
    public static void m103434a(String str, String str2, LinkedHashMap<String, Integer> linkedHashMap) {
        if (!linkedHashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (Entry entry : linkedHashMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(',');
                sb2.append(entry.getValue());
                sb2.append(',');
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", str);
            hashMap.put("md5", str2);
            hashMap.put("emoji_name", sb.toString());
            hashMap.put("cnt", sb2.toString());
            hashMap.put("enter_from", "chat");
            C6907h.m21524a("send_emoji", (Map) hashMap);
        }
    }

    /* renamed from: b */
    public static void m103450b(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str2);
        hashMap.put("conversation_id", str3);
        hashMap.put("enter_from", "chat");
        hashMap.put("music_id", str);
        if (!C31915n.m103672b()) {
            hashMap.put("_staging_flag", "1");
        } else {
            hashMap.put("_staging_flag", "0");
        }
        C6907h.m21524a("enter_music_detail", (Map) hashMap);
    }

    /* renamed from: b */
    public static void m103451b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str2);
        hashMap.put("conversation_id", str3);
        hashMap.put("enter_from", "chat");
        hashMap.put("tag_id", str);
        if (!C31915n.m103672b()) {
            hashMap.put("_staging_flag", "1");
        } else {
            hashMap.put("_staging_flag", "0");
        }
        if (C31915n.m103671a()) {
            hashMap.put("process_id", str4);
        }
        C6907h.m21524a("enter_tag_detail", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103415a(IMAdLog iMAdLog) {
        if (iMAdLog != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("value", iMAdLog.getCreativeId());
                jSONObject.put("log_extra", iMAdLog.getLogExtra());
                jSONObject.put("value", iMAdLog.getCreativeId());
                C6907h.onEvent(MobClick.obtain().setEventName("message_ad").setLabelName("message_action").setJsonObject(jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m103438a(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("action_type", z ? "clear" : "post");
        C6907h.m21524a("group_notice_edit", (Map) hashMap);
    }

    /* renamed from: b */
    public static void m103452b(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "1" : "0");
        C6907h.m21524a("upload_emoji", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103416a(C7105b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", bVar.f19963e);
        hashMap.put("group_id", bVar.f19961c);
        hashMap.put("comment_id", bVar.f19960b);
        hashMap.put("to_user_id", bVar.f19966h.getUid());
        hashMap.put("author_id", bVar.f19962d);
        C6907h.m21524a("share_comment", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103423a(String str, int i, int i2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("account_type", str);
        hashMap.put("client_order", String.valueOf(i));
        if (i2 > 0) {
            if (z) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(i2));
            } else {
                hashMap.put("notice_type", "yellow_dot");
            }
        }
        C6907h.m21524a("show_official_message", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103427a(String str, String str2, int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("account_type", str);
        hashMap.put("client_order", str2);
        if (i > 0) {
            hashMap.put("notice_type", "yellow_dot");
        }
        C6907h.m21524a("enter_official_message", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103436a(String str, String str2, List<Emoji> list, boolean z) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((Emoji) list.get(i)).getId());
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        hashMap.put("conversation_id", str2);
        hashMap.put("to_user_id", str);
        hashMap.put("emoji_id", sb.toString());
        if (z) {
            C6907h.m21524a("greeting_emoji_alert_close", (Map) hashMap);
        } else {
            C6907h.m21524a("greeting_emoji_alert_show", (Map) hashMap);
        }
    }

    /* renamed from: a */
    public static void m103418a(SharePackage sharePackage, BaseContent baseContent, int i) {
        String a = C31863ai.m103528a(sharePackage.f20181g);
        if (!TextUtils.isEmpty(a)) {
            String str = baseContent == null ? "share" : "forward";
            HashMap hashMap = new HashMap();
            hashMap.put("message_category", a);
            hashMap.put("contact_number", String.valueOf(i));
            hashMap.put("action_type", str);
            C6907h.m21524a("multi_send_message", (Map) hashMap);
        }
    }

    /* renamed from: a */
    public static void m103430a(String str, String str2, String str3, BaseContent baseContent) {
        HashMap hashMap = new HashMap();
        hashMap.put("message_category", str);
        hashMap.put("to_user_id", str3);
        hashMap.put("conversation_id", str2);
        hashMap.put("from_user_id", C7074e.m22069b().toString());
        if ("poi_coupon".equals(str) && (baseContent instanceof ShareCouponContent)) {
            ShareCouponContent shareCouponContent = (ShareCouponContent) baseContent;
            hashMap.put("coupon_id", shareCouponContent.getCouponId());
            hashMap.put("activity_id", shareCouponContent.getActivityId());
        }
        C6907h.m21524a("message_forward", (Map) hashMap);
    }

    /* renamed from: a */
    private static void m103439a(Map<String, String> map) {
        C31476g p = C7076p.m22077a().mo18332p();
        if (p != null) {
            C31477h a = p.mo82166a();
            XPlanAwemeBannerConfig q = C7076p.m22077a().mo18333q();
            if (a == null && q != null) {
                map.put("banner_content", q.getBodyText());
                return;
            }
            if (a != null && a.f82428a == C31472b.f82407a) {
                map.put("banner_content", a.f82429b.f82411a);
                map.put("content_type", a.f82429b.f82421k);
            }
        }
    }

    /* renamed from: a */
    public static void m103435a(String str, String str2, List<IMUser> list, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_method", str);
        hashMap.put("type", str2);
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(((IMUser) list.get(i)).getUid());
                if (i != list.size() - 1) {
                    sb.append(",");
                }
            }
            hashMap.put("to_user_list", sb.toString());
        } else {
            hashMap.put("to_user_list", TEVideoRecorder.FACE_BEAUTY_NULL);
        }
        String str4 = "action";
        if (TextUtils.isEmpty(str3)) {
            str3 = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        hashMap.put(str4, str3);
        C6907h.m21524a("group_chat_member_notice", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103425a(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("from_user_id", str2);
        hashMap.put("member", String.valueOf(i));
        C6907h.m21524a("group_chat_confirm_join", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103428a(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("chat_type", str2);
        hashMap.put("duration", String.valueOf(j));
        C6907h.m21524a("leave_chat", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103433a(String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("to_user_id", str2);
        hashMap.put("from_user_id", str3);
        hashMap.put("search_query", str4);
        hashMap.put("emoji_show", str5);
        hashMap.put("emoji_click", str6);
        C6907h.m21524a("auto_emoji_click", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103417a(SharePackage sharePackage) {
        if (sharePackage != null) {
            C6907h.m21524a("emoji_shortcut_click", (Map) C22984d.m75611a().mo59972a("group_id", sharePackage.f20186l.get("aid")).mo59972a("author_id", sharePackage.f20186l.get("author_id")).mo59972a("enter_from", sharePackage.f20186l.get("enter_from")).mo59973a("enter_method", "share_to_chat").f60753a);
        }
    }

    /* renamed from: a */
    public static C31858ad m103406a() {
        return new C31858ad();
    }

    /* renamed from: h */
    public static void m103480h() {
        C6907h.m21524a("add_to_emoji", (Map) new HashMap());
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f83323b = hashSet;
        hashSet.add("duoshan_banner_show");
        f83323b.add("duoshan_banner_click");
        f83323b.add("duoshan_download_notice");
    }

    /* renamed from: c */
    public static void m103453c() {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        C6907h.m21524a("flipchat_message_entrance", (Map) hashMap);
    }

    /* renamed from: d */
    public static void m103459d() {
        C6907h.onEvent(MobClick.obtain().setEventName("click_emoji").setLabelName("chat"));
    }

    /* renamed from: e */
    public static void m103465e() {
        C6907h.onEvent(MobClick.obtain().setEventName("click_album").setLabelName("chat"));
    }

    /* renamed from: f */
    public static void m103470f() {
        C6907h.onEvent(MobClick.obtain().setEventName("save_pic_success").setLabelName("chat"));
    }

    /* renamed from: g */
    public static void m103475g() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "contact_list");
        hashMap.put("enter_method", "click_multi_choose_button");
        C6907h.m21524a("enter_multi_choose_contact", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103413a(SessionInfo sessionInfo) {
        f83322a = sessionInfo;
    }

    /* renamed from: y */
    private static boolean m103511y(String str) {
        return "homepage_familiar".equals(str);
    }

    /* renamed from: j */
    public final void mo82717j(String str) {
        m103500n(str, null);
    }

    /* renamed from: l */
    public static void m103495l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str);
        C6907h.m21524a("auto_emoji_show", (Map) hashMap);
    }

    /* renamed from: m */
    public static void m103497m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        C6907h.m21524a("invite_fans_to_group_entry", (Map) hashMap);
    }

    /* renamed from: n */
    public static void m103499n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        C6907h.m21524a("group_notice_button", (Map) hashMap);
    }

    /* renamed from: o */
    public static void m103501o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        C6907h.m21524a("share_comment_toast", (Map) hashMap);
    }

    /* renamed from: p */
    public static void m103502p(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("show_type", str);
        C6907h.m21524a("show_commerce_message", (Map) hashMap);
    }

    /* renamed from: q */
    public static void m103503q(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", str);
        C6907h.m21524a("search_contact", (Map) hashMap);
    }

    /* renamed from: s */
    public static void m103505s(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_method", str);
        C6907h.m21524a("create_group_click", (Map) hashMap);
    }

    /* renamed from: t */
    public static void m103506t(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        C6907h.m21524a("create_group_share_entry_click", (Map) hashMap);
    }

    /* renamed from: u */
    public static void m103507u(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        C6907h.m21524a("auto_emoji_show", (Map) hashMap);
    }

    /* renamed from: v */
    public static void m103508v(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str);
        C6907h.m21524a("inner_push_alert_show", (Map) hashMap);
    }

    /* renamed from: w */
    public static void m103509w(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", str);
        C6907h.m21524a("im_official_alert", (Map) hashMap);
    }

    /* renamed from: b */
    public static void m103443b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("shoot_way", "story");
        hashMap.put("is_success", String.valueOf(i));
        C6907h.m21524a("im_shoot", (Map) hashMap);
    }

    /* renamed from: h */
    public static void m103482h(String str) {
        C6907h.onEvent(MobClick.obtain().setEventName("delete").setLabelName("message").setValue(String.valueOf(C6425b.m20074a(str))));
    }

    /* renamed from: i */
    public static void m103486i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("prop_id", str);
        C6907h.m21524a("enter_prop_detail", (Map) hashMap);
    }

    /* renamed from: k */
    public static void m103493k(String str) {
        C6907h.onEvent(MobClick.obtain().setEventName("unblock").setLabelName("chat").setValue(str));
    }

    /* renamed from: r */
    public static void m103504r(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("to_user_id", str);
        C6907h.m21524a("recall_message", (Map) hashMap);
    }

    /* renamed from: z */
    private static int m103512z(String str) {
        if (C6956a.m21632a().mo18009f().showNewStyle()) {
            return C6990a.m21758a().mo18069a(str);
        }
        return 0;
    }

    /* renamed from: a */
    public static void m103407a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contact_num", i);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("share_chat").setLabelName("confirm").setJsonObject(jSONObject));
    }

    /* renamed from: b */
    public static void m103447b(String str) {
        C6907h.onEvent(MobClick.obtain().setEventName("click_link").setLabelName("chat").setValue(str));
    }

    /* renamed from: c */
    public static void m103455c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message_type", str);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("im_to_myself").setLabelName("chat").setJsonObject(jSONObject));
    }

    /* renamed from: f */
    public static void m103472f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("previous_page", "message");
        hashMap.put("from_user_id", str);
        hashMap.put("previous_page_position", "other_places");
        hashMap.put("enter_method", "follow_button");
        if (!C31915n.m103672b()) {
            hashMap.put("_staging_flag", "1");
        }
        C6907h.m21524a("follow", (Map) hashMap);
    }

    /* renamed from: x */
    private static boolean m103510x(String str) {
        if ("homepage_hot".equals(str) || "homepage_follow".equals(str) || "homepage_fresh".equals(str) || "hot_search_video_board".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m103461d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("previous_page", "token");
        hashMap.put("from_user_id", str);
        hashMap.put("previous_page_position", "other_places");
        hashMap.put("enter_method", "follow_button");
        if (!C31915n.m103672b()) {
            hashMap.put("_staging_flag", "1");
        }
        C6907h.m21524a("follow", (Map) hashMap);
    }

    /* renamed from: e */
    public static void m103467e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", "token");
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("chat").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: g */
    public static void m103477g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", "message");
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("chat").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: b */
    public static void m103444b(Message message) {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        String h = C31863ai.m103541h(message);
        if (!TextUtils.isEmpty(h)) {
            int i = 0;
            try {
                i = ((CheckMessage) C31913m.m103667a((String) message.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class)).status_code;
            } catch (Exception unused) {
            }
            if (i == 0) {
                String str3 = (String) message.getLocalExt().get("s:err_code");
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        i = Integer.parseInt(str3);
                    } catch (Exception unused2) {
                    }
                }
            }
            long a = C6425b.m20074a(message.getConversationId());
            if (message.getConversationType() == C11203a.f30381b) {
                str = "group";
            } else {
                str = "private";
            }
            if (C31863ai.m103542i(message)) {
                str2 = "success";
            } else {
                str2 = "failure";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", message.getConversationId());
            if (a > 0) {
                hashMap.put("to_user_id", String.valueOf(a));
            }
            hashMap.put("chat_type", str);
            hashMap.put("message_type", h);
            hashMap.put("send_status", str2);
            hashMap.put("status_code", String.valueOf(i));
            if (message.getMsgStatus() == 2 && message.getLocalExt().get("send_sdk_time") != null) {
                try {
                    long parseLong = currentTimeMillis - Long.parseLong((String) message.getLocalExt().get("send_sdk_time"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(parseLong);
                    hashMap.put("delay_duration", sb.toString());
                } catch (NumberFormatException unused3) {
                }
            }
            C6907h.m21524a("send_message_response", (Map) hashMap);
        }
    }

    /* renamed from: a */
    public static void m103437a(String str, Map<String, String> map) {
        C6907h.m21524a(str, (Map) map);
    }

    /* renamed from: a */
    public static void m103421a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("fans_cnt", String.valueOf(i));
        C6907h.m21524a("invite_fans_to_group", (Map) hashMap);
    }

    /* renamed from: j */
    public static void m103490j(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("kicked_user", str2);
        hashMap.put("conversation_id", str);
        C6907h.m21524a("kick_group", (Map) hashMap);
    }

    /* renamed from: l */
    public static void m103496l(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("show_type", str);
        hashMap.put("scene_id", str2);
        C6907h.m21524a("show_commerce_message", (Map) hashMap);
    }

    /* renamed from: m */
    public static void m103498m(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("chat_type", str2);
        C6907h.m21524a("exit_chat", (Map) hashMap);
    }

    /* renamed from: n */
    private static void m103500n(String str, String str2) {
        C6907h.onEvent(MobClick.obtain().setEventName("message_click").setLabelName(str).setValue(null));
    }

    /* renamed from: h */
    public static void m103483h(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("add_cnt", str2);
        hashMap.put("conversation_id", str);
        C6907h.m21524a("group_add_complete_click", (Map) hashMap);
    }

    /* renamed from: i */
    public static void m103487i(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str2);
        hashMap.put("conversation_id", str);
        C6907h.m21524a("chat_report_click", (Map) hashMap);
    }

    /* renamed from: k */
    public static void m103494k(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("update_cnt", m103512z(str));
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("chat_cell_show").setLabelName(str2).setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: b */
    private void m103445b(SharePackage sharePackage, IMContact iMContact) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "prop_page");
        hashMap.put("group_id", sharePackage.f20186l.getString("group_id"));
        hashMap.put("author_id", sharePackage.f20186l.getString("user_id"));
        hashMap.put("prop_id", sharePackage.f20186l.getString("sticker_id"));
        hashMap.put("log_pb", sharePackage.f20186l.getString("log_pb"));
        hashMap.put("platform", "chat");
        String str = "";
        if (iMContact instanceof IMUser) {
            str = "private";
        } else if (iMContact instanceof IMConversation) {
            str = "group";
        }
        hashMap.put("chat_type", str);
        m103440a((Map<String, String>) hashMap, iMContact);
        C6907h.m21524a("share_prop", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103408a(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", str);
            switch (i) {
                case 1:
                    hashMap.put("enter_from", "message");
                    m103439a((Map<String, String>) hashMap);
                    break;
                case 2:
                    hashMap.put("enter_from", "others_homepage");
                    break;
                case 3:
                    hashMap.put("enter_from", "others_homepage");
                    break;
                case 4:
                    hashMap.put("enter_from", "contact");
                    break;
                case 5:
                    hashMap.put("enter_from", "chat");
                    break;
                case 6:
                    hashMap.put("enter_from", "message");
                    break;
                case 7:
                    hashMap.put("enter_from", "chat");
                    break;
                case 8:
                    hashMap.put("enter_from", "share_board");
                    break;
                case 10:
                    hashMap.put("enter_from", "homepage_story");
                    break;
                case 12:
                    hashMap.put("enter_from", "chat");
                    break;
                default:
                    return;
            }
            C6907h.m21524a("duoshan_download_notice", (Map) hashMap);
        }
    }

    /* renamed from: c */
    public static void m103456c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", str2);
        hashMap.put("anchor_id", str);
        hashMap.put("action_type", "click");
        hashMap.put("enter_from_merge", "chat");
        hashMap.put("enter_method", "live_cover");
        hashMap.put("_params_live_platform", "live");
        C6907h.m21524a("livesdk_live_show", (Map) hashMap);
    }

    /* renamed from: d */
    public static void m103462d(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("enter_method", "chat_click");
        hashMap.put("compilation_id", str);
        hashMap.put("author_id", str2);
        C6907h.m21524a("enter_compilation_detail", (Map) hashMap);
    }

    /* renamed from: e */
    public static void m103468e(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str);
        hashMap.put("emoji_id", str2);
        C6907h.m21524a("auto_emoji_click", (Map) hashMap);
    }

    /* renamed from: f */
    public static void m103473f(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", str2);
            jSONObject.put("update_cnt", m103512z(str));
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: g */
    public static void m103478g(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", str);
            C6907h.m21524a(str2, (Map) hashMap);
        }
    }

    /* renamed from: b */
    public static void m103448b(String str, int i) {
        if (i > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_cnt", String.valueOf(i));
            C6907h.m21524a(str, (Map) hashMap);
        }
    }

    /* renamed from: a */
    public static void m103412a(Message message, String str) {
        String str2;
        String str3;
        if (message.getConversationType() == C11203a.f30381b) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        String h = C31863ai.m103541h(message);
        long a = C6425b.m20074a(message.getConversationId());
        boolean z = false;
        if (message.getLocalExt() != null && message.getLocalExt().containsKey("key_resend")) {
            z = true;
        }
        HashMap hashMap = new HashMap();
        if (a > 0) {
            hashMap.put("to_user_id", String.valueOf(a));
        }
        if (!TextUtils.isEmpty(h)) {
            hashMap.put("message_type", h);
        }
        hashMap.put("conversation_id", message.getConversationId());
        hashMap.put("chat_type", str2);
        String str4 = "is_resend";
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        hashMap.put(str4, str3);
        hashMap.put("enter_from", "message");
        hashMap.put("enter_method", str);
        C6907h.m21524a("send_message", (Map) hashMap);
    }

    /* renamed from: b */
    public static void m103449b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_type", str2);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName("enter_chat").setLabelName("message").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: d */
    private void m103460d(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m103440a((Map<String, String>) hashMap, iMContact);
        hashMap.put("music_id", sharePackage.f20186l.getString("music_id", ""));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C6907h.m21524a("share_music", (Map) hashMap);
    }

    /* renamed from: e */
    private void m103466e(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m103440a((Map<String, String>) hashMap, iMContact);
        hashMap.put("tag_id", sharePackage.f20186l.getString("challenge_id", ""));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        hashMap.put("process_id", sharePackage.f20186l.getString("process_id", ""));
        C6907h.m21524a("share_tag", (Map) hashMap);
    }

    /* renamed from: g */
    private void m103476g(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m103440a((Map<String, String>) hashMap, iMContact);
        hashMap.put("user_id", sharePackage.f20182h);
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C6907h.m21524a("share_profile", (Map) hashMap);
    }

    /* renamed from: j */
    public static void m103491j(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str);
        hashMap.put("action_type", str2);
        hashMap.put("alert_method", str3);
        C6907h.m21524a("inner_push_button", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103410a(long j, long j2, int i) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "inner_push");
        hashMap.put("enter_method", "inner_push");
        hashMap.put("anchor_id", String.valueOf(j));
        hashMap.put("room_id", String.valueOf(j2));
        String str2 = "anchor_type";
        if (i == 0) {
            str = "old";
        } else {
            str = "new";
        }
        hashMap.put(str2, str);
        C6907h.m21524a("livesdk_live_abandon", (Map) hashMap);
    }

    /* renamed from: c */
    private void m103454c(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m103440a((Map<String, String>) hashMap, iMContact);
        hashMap.put("poi_id", sharePackage.f20186l.getString("poi_id", ""));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        if (!TextUtils.isEmpty(sharePackage.f20186l.getString("enter_from"))) {
            hashMap.put("enter_from", sharePackage.f20186l.getString("enter_from", ""));
        }
        C6907h.m21524a("share_poi", (Map) hashMap);
    }

    /* renamed from: f */
    private void m103471f(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m103440a((Map<String, String>) hashMap, iMContact);
        int i = sharePackage.f20186l.getInt("aweme_type");
        if (i == 1801) {
            hashMap.put("hot_search_type", "general");
        } else if (i == 1802) {
            hashMap.put("hot_search_type", "video");
        } else if (i == 1803) {
            hashMap.put("hot_search_type", "music");
        }
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C6907h.m21524a("share_tag", (Map) hashMap);
    }

    /* renamed from: h */
    private void m103481h(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", C22912d.f60641a);
        hashMap.put("url", sharePackage.f20185k);
        hashMap.put("group_id", sharePackage.f20186l.getString("group_id"));
        hashMap.put("webview_type", sharePackage.f20186l.getString("webview_type"));
        hashMap.put("previous_page", sharePackage.f20186l.getString("previous_type"));
        m103440a((Map<String, String>) hashMap, iMContact);
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C6907h.m21524a("share_webview", (Map) hashMap);
    }

    /* renamed from: i */
    private void m103485i(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m103440a((Map<String, String>) hashMap, iMContact);
        hashMap.put("anchor_id", sharePackage.f20186l.getString("live_id"));
        hashMap.put("room_id", sharePackage.f20182h);
        hashMap.put("request_id", sharePackage.f20186l.getString("request_id"));
        hashMap.put("user_type", sharePackage.f20186l.getString("user_type"));
        hashMap.put("previous_page", sharePackage.f20186l.getString("previous_type"));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C6907h.m21524a("share_live", (Map) hashMap);
    }

    /* renamed from: j */
    private void m103489j(SharePackage sharePackage, IMContact iMContact, boolean z) {
        if ("good".equals(sharePackage.f20181g)) {
            HashMap hashMap = new HashMap();
            m103440a((Map<String, String>) hashMap, iMContact);
            hashMap.put("author_id", sharePackage.f20186l.getString("user_id"));
            hashMap.put("commodity_id", sharePackage.f20186l.getString("commodity_id"));
            hashMap.put("commodity_type", sharePackage.f20186l.getString("commodity_type"));
            C6907h.m21524a("share_product", (Map) hashMap);
            return;
        }
        if ("good_window".equals(sharePackage.f20181g)) {
            HashMap hashMap2 = new HashMap();
            m103440a((Map<String, String>) hashMap2, iMContact);
            hashMap2.put("author_id", sharePackage.f20186l.getString("user_id"));
            C6907h.m21524a("share_store", (Map) hashMap2);
        }
    }

    /* renamed from: k */
    private void m103492k(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "poi_page");
        hashMap.put("poi_id", sharePackage.f20186l.getString("poi_id"));
        hashMap.put("from_user_id", C7074e.m22069b().toString());
        m103440a((Map<String, String>) hashMap, iMContact);
        hashMap.put("coupon_id", sharePackage.f20186l.getString("coupon_id"));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C6907h.m21524a("share_coupon", (Map) hashMap);
    }

    /* renamed from: h */
    public static void m103484h(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("chat_type", "group");
        hashMap.put("master_id", C7074e.m22069b().toString());
        hashMap.put("status", str2);
        hashMap.put("enter_method", str3);
        C6907h.m21524a("create_group", (Map) hashMap);
    }

    /* renamed from: i */
    public static void m103488i(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str);
        hashMap.put("action_type", str2);
        hashMap.put("enter_from", str3);
        C6907h.m21524a("inner_push", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103409a(int i, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", str);
            if (i == 10) {
                hashMap.put("enter_from", "homepage_story");
                hashMap.put("message_style", "duoshan_story");
            } else if (i != 12) {
                switch (i) {
                    case 1:
                        hashMap.put("enter_from", "message");
                        m103439a((Map<String, String>) hashMap);
                        break;
                    case 2:
                        hashMap.put("enter_from", "others_homepage");
                        hashMap.put("message_style", "click_message");
                        break;
                    case 3:
                        hashMap.put("enter_from", "others_homepage");
                        hashMap.put("message_style", "click_stranger_chat_button");
                        break;
                    case 4:
                        hashMap.put("enter_from", "contact");
                        hashMap.put("message_style", "click_contact");
                        break;
                    case 5:
                        hashMap.put("enter_from", "chat");
                        hashMap.put("message_style", "duoshan_sync");
                        break;
                    case 6:
                        hashMap.put("enter_from", "message");
                        hashMap.put("message_style", "group_chat");
                        break;
                    case 7:
                        hashMap.put("enter_from", "chat");
                        hashMap.put("message_style", "duoshan_unable");
                        break;
                    default:
                        return;
                }
            } else {
                hashMap.put("enter_from", "chat");
                hashMap.put("message_style", "duoshan_red_envelope");
            }
            if (f83323b.contains(str2)) {
                hashMap.remove("message_style");
                hashMap.remove("enter_method");
            }
            C6907h.m21524a(str2, (Map) hashMap);
        }
    }

    /* renamed from: c */
    public static void m103457c(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", str);
        hashMap.put("to_user_id", str2);
        hashMap.put("conversation_id", str3);
        C6907h.m21524a("enter_poi_detail", (Map) hashMap);
    }

    /* renamed from: d */
    public static void m103463d(String str, String str2, String str3) {
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

    /* renamed from: e */
    public static void m103469e(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str);
        hashMap.put("enter_from", str2);
        hashMap.put("enter_method", str3);
        if (!C31915n.m103672b()) {
            hashMap.put("_staging_flag", "1");
        } else {
            hashMap.put("_staging_flag", "0");
        }
        C6907h.m21524a("enter_personal_detail", (Map) hashMap);
    }

    /* renamed from: f */
    public static void m103474f(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("to_user_id", str2);
        hashMap.put("emoji_id", str3);
        C6907h.m21524a("greeting_emoji", (Map) hashMap);
    }

    /* renamed from: g */
    public static void m103479g(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("author_id", str);
        hashMap.put("message_id", str2);
        hashMap.put("message_type", str3);
        C6907h.m21524a("click_in_message", (Map) hashMap);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b8 A[Catch:{ JSONException -> 0x02c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0129 A[Catch:{ JSONException -> 0x02c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0144 A[Catch:{ JSONException -> 0x02c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0170 A[Catch:{ JSONException -> 0x02c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0178 A[Catch:{ JSONException -> 0x02c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0199 A[Catch:{ JSONException -> 0x02c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f7 A[Catch:{ JSONException -> 0x02c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x026e A[Catch:{ JSONException -> 0x02c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02aa A[Catch:{ JSONException -> 0x02c3 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m103446b(com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage r4, com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r5, boolean r6) {
        /*
            if (r4 == 0) goto L_0x02c8
            boolean r0 = com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b.m21960a(r4)
            if (r0 == 0) goto L_0x02c8
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "platform"
            if (r6 == 0) goto L_0x0014
            java.lang.String r6 = "chat_merge"
            goto L_0x0016
        L_0x0014:
            java.lang.String r6 = "chat"
        L_0x0016:
            r0.put(r1, r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r6 = "group_id"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r2 = "item_id_string"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x0083 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n.m103672b()     // Catch:{ JSONException -> 0x0083 }
            if (r6 != 0) goto L_0x0033
            java.lang.String r6 = "_staging_flag"
            java.lang.String r1 = "1"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x0083 }
        L_0x0033:
            if (r5 != 0) goto L_0x0044
            java.lang.String r5 = "to_user_id"
            java.lang.String r6 = "null"
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r5 = "conversation_id"
            java.lang.String r6 = "null"
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x0083 }
            goto L_0x0083
        L_0x0044:
            boolean r6 = r5 instanceof com.p280ss.android.ugc.aweme.p313im.service.model.IMUser     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMUser) r5     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r6 = r5.getUid()     // Catch:{ JSONException -> 0x0083 }
            long r1 = java.lang.Long.parseLong(r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r1 = "to_user_id"
            java.lang.String r5 = r5.getUid()     // Catch:{ JSONException -> 0x0083 }
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r5 = "conversation_id"
            long r1 = r6.longValue()     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r6 = com.bytedance.p263im.core.model.C6425b.m20076a(r1)     // Catch:{ JSONException -> 0x0083 }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x0083 }
            goto L_0x0083
        L_0x006d:
            boolean r6 = r5 instanceof com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x0083
            com.ss.android.ugc.aweme.im.service.model.IMConversation r5 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation) r5     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r6 = "conversation_id"
            java.lang.String r5 = r5.getConversationId()     // Catch:{ JSONException -> 0x0083 }
            r0.put(r6, r5)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r5 = "to_user_id"
            java.lang.String r6 = "null"
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x0083 }
        L_0x0083:
            android.os.Bundle r5 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "enter_from"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "enter_from"
            r0.put(r6, r5)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "previous_page"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "previous_page"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "author_id"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "author_id"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "poi_id"
            java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x02c3 }
            if (r6 != 0) goto L_0x00d2
            java.lang.String r6 = "poi_id"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "poi_id"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "poi_type"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "poi_type"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
        L_0x00d2:
            java.lang.String r6 = "city_info"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "city_info"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "distance_info"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "distance_info"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "content_type"
            java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "content_type"
            r0.put(r1, r6)     // Catch:{ JSONException -> 0x02c3 }
            boolean r6 = m103510x(r5)     // Catch:{ JSONException -> 0x02c3 }
            if (r6 == 0) goto L_0x011f
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "log_pb"
            java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x02c3 }
            if (r6 != 0) goto L_0x011f
            java.lang.String r6 = "log_pb"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r2 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r3 = "log_pb"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ JSONException -> 0x02c3 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
        L_0x011f:
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "play_mode"
            java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            if (r6 == 0) goto L_0x012e
            java.lang.String r1 = "play_mode"
            r0.put(r1, r6)     // Catch:{ JSONException -> 0x02c3 }
        L_0x012e:
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "enter_method"
            java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "play_list_type"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x02c3 }
            if (r2 != 0) goto L_0x0149
            java.lang.String r2 = "playlist_type"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x02c3 }
        L_0x0149:
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "play_list_id_key"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r2 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r3 = "play_list_id_value"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ JSONException -> 0x02c3 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x02c3 }
            if (r3 != 0) goto L_0x0168
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x02c3 }
            if (r3 != 0) goto L_0x0168
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x02c3 }
        L_0x0168:
            java.lang.String r1 = "more"
            boolean r1 = android.text.TextUtils.equals(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            if (r1 == 0) goto L_0x0178
            java.lang.String r6 = "enter_method"
            java.lang.String r1 = "more"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            goto L_0x018f
        L_0x0178:
            java.lang.String r1 = "head"
            boolean r6 = android.text.TextUtils.equals(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            if (r6 == 0) goto L_0x0188
            java.lang.String r6 = "enter_method"
            java.lang.String r1 = "head"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            goto L_0x018f
        L_0x0188:
            java.lang.String r6 = "enter_method"
            java.lang.String r1 = "icon"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
        L_0x018f:
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "is_long_item"
            int r6 = r6.getInt(r1)     // Catch:{ JSONException -> 0x02c3 }
            if (r6 == 0) goto L_0x019e
            java.lang.String r1 = "is_long_item"
            r0.put(r1, r6)     // Catch:{ JSONException -> 0x02c3 }
        L_0x019e:
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "from_group_id"
            java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "from_user_id"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x02c3 }
            if (r2 != 0) goto L_0x01c4
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x02c3 }
            if (r2 != 0) goto L_0x01c4
            java.lang.String r2 = "from_group_id"
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "from_user_id"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
        L_0x01c4:
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "repost_from_group_id"
            java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "repost_from_user_id"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x02c3 }
            if (r2 != 0) goto L_0x01f1
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x02c3 }
            if (r2 != 0) goto L_0x01f1
            java.lang.String r2 = "is_reposted"
            java.lang.String r3 = "1"
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "repost_from_group_id"
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "repost_from_user_id"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
        L_0x01f1:
            boolean r6 = m103511y(r5)     // Catch:{ JSONException -> 0x02c3 }
            if (r6 == 0) goto L_0x0233
            java.lang.String r6 = "relation_type"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "relation_type"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "video_type"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "video_type"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "rec_uid"
            android.os.Bundle r1 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r2 = "rec_uid"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "log_pb"
            com.ss.android.ugc.aweme.feed.ae r1 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r2 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r3 = "request_id"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = r1.mo71791a(r2)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
        L_0x0233:
            java.lang.String r6 = "homepage_channel"
            boolean r6 = android.text.TextUtils.equals(r5, r6)     // Catch:{ JSONException -> 0x02c3 }
            if (r6 != 0) goto L_0x0243
            java.lang.String r6 = "homepage_fresh"
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch:{ JSONException -> 0x02c3 }
            if (r5 == 0) goto L_0x0268
        L_0x0243:
            java.lang.Class<com.ss.android.ugc.aweme.im.service.IIMService> r5 = com.p280ss.android.ugc.aweme.p313im.service.IIMService.class
            java.lang.Object r5 = com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a.m21773a(r5)     // Catch:{ JSONException -> 0x02c3 }
            com.ss.android.ugc.aweme.im.service.IIMService r5 = (com.p280ss.android.ugc.aweme.p313im.service.IIMService) r5     // Catch:{ JSONException -> 0x02c3 }
            com.ss.android.ugc.aweme.im.service.b r5 = r5.getAbInterface()     // Catch:{ JSONException -> 0x02c3 }
            boolean r5 = r5.mo18363k()     // Catch:{ JSONException -> 0x02c3 }
            if (r5 == 0) goto L_0x0268
            com.ss.android.ugc.aweme.au.b r5 = com.p280ss.android.ugc.aweme.p307au.C6887b.m21436b()     // Catch:{ JSONException -> 0x02c3 }
            android.content.Context r6 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "tab_channels_save_data_last_i18n_name"
            java.lang.String r5 = r5.mo16896a(r6, r1)     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "tab_name"
            r0.put(r6, r5)     // Catch:{ JSONException -> 0x02c3 }
        L_0x0268:
            boolean r5 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n.m103671a()     // Catch:{ JSONException -> 0x02c3 }
            if (r5 != 0) goto L_0x027b
            java.lang.String r5 = "compilation_id"
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "compilation_id"
            java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x02c3 }
        L_0x027b:
            android.os.Bundle r5 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "is_fullscreen"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ JSONException -> 0x02c3 }
            boolean r6 = r5 instanceof java.lang.Boolean     // Catch:{ JSONException -> 0x02c3 }
            if (r6 == 0) goto L_0x02c3
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ JSONException -> 0x02c3 }
            boolean r5 = r5.booleanValue()     // Catch:{ JSONException -> 0x02c3 }
            if (r5 == 0) goto L_0x02c3
            java.lang.String r5 = "request_id"
            android.os.Bundle r6 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "request_id"
            java.lang.Object r6 = r6.get(r1)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r5 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r6 = "log_pb"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ JSONException -> 0x02c3 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x02c3 }
            if (r5 != 0) goto L_0x02bc
            java.lang.String r5 = "log_pb"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02c3 }
            android.os.Bundle r4 = r4.f20186l     // Catch:{ JSONException -> 0x02c3 }
            java.lang.String r1 = "log_pb"
            java.lang.String r4 = r4.getString(r1)     // Catch:{ JSONException -> 0x02c3 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x02c3 }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x02c3 }
        L_0x02bc:
            java.lang.String r4 = "is_fullscreen"
            java.lang.String r5 = "1"
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x02c3 }
        L_0x02c3:
            java.lang.String r4 = "share_video"
            com.p280ss.android.ugc.aweme.common.C6907h.m21525a(r4, r0)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103446b(com.ss.android.ugc.aweme.sharer.ui.SharePackage, com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):void");
    }

    /* renamed from: c */
    public static void m103458c(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("chat_type", str2);
        hashMap.put("to_status", str3);
        C6907h.m21524a(str4, (Map) hashMap);
    }

    /* renamed from: d */
    public static void m103464d(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("from_user_id", str2);
        hashMap.put("to_user_id", str3);
        hashMap.put("status", str4);
        C6907h.m21524a("group_chat_show_invite", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m103411a(long j, long j2, String str, int i, String str2, String str3) {
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "inner_push");
        hashMap.put("enter_method", "inner_push");
        hashMap.put("anchor_id", String.valueOf(j));
        hashMap.put("room_id", String.valueOf(j2));
        hashMap.put("request_page", str);
        String str5 = "anchor_type";
        if (i == 0) {
            str4 = "old";
        } else {
            str4 = "new";
        }
        hashMap.put(str5, str4);
        hashMap.put("action_type", "click");
        hashMap.put("request_id", str2);
        hashMap.put("log_pb", str3);
        C6907h.m21524a("livesdk_live_show", (Map) hashMap);
    }
}
