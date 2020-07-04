package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33246ar;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.j.f */
public final class C28483f {
    /* renamed from: a */
    static final /* synthetic */ Object m93626a(boolean z, String str, String str2, String str3, String str4, FeedParam feedParam) throws Exception {
        C6907h.onEvent(MobClick.obtain().setEventName(z ? "slide_down" : "slide_up").setLabelName("homepage_hot").setJsonObject(C6869c.m21381a().mo16887a("request_id", str).mo16887a("author_id", str2).mo16887a("from_group_id", str3).mo16887a("to_group_id", str4).mo16888b()));
        C22984d a = C22984d.m75611a().mo59973a("request_id", str).mo59973a("author_id", str2).mo59973a("from_group_id", str3).mo59973a("to_group_id", str4).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str4));
        if (TextUtils.equals("homepage_hot", feedParam.getEventType())) {
            a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(str));
            a.mo59973a("enter_play_method", "manul_play");
            C6907h.m21525a(z ? "homepage_hot_slide_down" : "homepage_hot_slide_up", C33230ac.m107211a(a.f60753a));
        } else {
            C6907h.m21524a(z ? "homepage_hot_slide_down" : "homepage_hot_slide_up", (Map) a.f60753a);
        }
        return null;
    }

    /* renamed from: a */
    public static C6869c m93622a(Aweme aweme, FeedParam feedParam) {
        C6869c a = new C6869c().mo16887a("author_id", C33230ac.m107205a(aweme)).mo16887a("request_id", C33230ac.m107206a(aweme, feedParam.getPageType())).mo16887a("enter_from", feedParam.getEventType()).mo16887a("content_source", feedParam.getContentSource());
        if (!TextUtils.isEmpty(feedParam.getLikeEnterMethod())) {
            a.mo16887a("enter_method", feedParam.getLikeEnterMethod());
        }
        if (!TextUtils.isEmpty(C33230ac.m107223e(aweme))) {
            a.mo16887a("poi_id", C33230ac.m107223e(aweme));
        }
        if (C33230ac.m107220c(feedParam.getEventType())) {
            a.mo16887a("poi_type", C33230ac.m107229h(aweme)).mo16887a("poi_channel", C33230ac.m107214b()).mo16887a("city_info", C33230ac.m107204a()).mo16887a("distance_info", C33230ac.m107231i(aweme));
        }
        if (!TextUtils.isEmpty(feedParam.getCarrierType())) {
            a.mo16887a("carrier_type", feedParam.getCarrierType());
        }
        if (!TextUtils.isEmpty(feedParam.getFromGroupId())) {
            a.mo16887a("from_group_id", feedParam.getFromGroupId());
        }
        if (!TextUtils.isEmpty(feedParam.getReferCommodityId())) {
            a.mo16887a("refer_commodity_id", feedParam.getReferCommodityId());
        }
        if (!TextUtils.isEmpty(feedParam.getDataType())) {
            a.mo16887a("data_type", feedParam.getDataType());
        }
        return a;
    }

    /* renamed from: a */
    public static void m93628a(C28318an anVar, FeedParam feedParam, String str) {
        C1592h.m7855a((Callable<TResult>) new C28484g<TResult>(anVar, str, feedParam), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93624a(C28318an anVar, String str, FeedParam feedParam) throws Exception {
        String str2 = "";
        String str3 = "";
        int i = anVar.f74631a;
        if (i == 19) {
            str2 = "head";
            str3 = "click_head";
        } else if (i == 18) {
            str2 = "name";
            str3 = "click_name";
        }
        C6909j jVar = new C6909j();
        try {
            jVar.mo16966a("group_id", ((Aweme) anVar.f74632b).getAid());
            jVar.mo16966a("request_id", str);
            if (C28482e.m93611d((Aweme) anVar.f74632b)) {
                jVar.mo16966a("is_photo", "1");
            }
            jVar.mo16966a("to_user_id", ((Aweme) anVar.f74632b).getAuthorUid());
            jVar.mo16966a("author_id", ((Aweme) anVar.f74632b).getAuthorUid());
            if (!TextUtils.isEmpty(C33230ac.m107223e((Aweme) anVar.f74632b))) {
                jVar.mo16966a("poi_id", C33230ac.m107223e((Aweme) anVar.f74632b));
            }
            if (C33230ac.m107220c(feedParam.getEventType())) {
                jVar.mo16966a("poi_type", C33230ac.m107229h((Aweme) anVar.f74632b));
                jVar.mo16966a("poi_channel", C33230ac.m107214b());
                jVar.mo16966a("city_info", C33230ac.m107204a());
                jVar.mo16966a("distance_info", C33230ac.m107231i((Aweme) anVar.f74632b));
            }
            C6907h.onEvent(MobClick.obtain().setEventName(str2).setLabelName(feedParam.getEventType()).setValue(((Aweme) anVar.f74632b).getAuthor().getUid()).setJsonObject(jVar.mo16967a()));
            jVar.mo16966a("enter_from", feedParam.getEventType());
            jVar.mo16966a("enter_method", str3);
            C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(((Aweme) anVar.f74632b).getAuthor().getUid()).setJsonObject(jVar.mo16967a()));
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static C6869c m93623a(Aweme aweme, FeedParam feedParam, boolean z, int i) {
        C6869c a = new C6869c().mo16887a("author_id", C33230ac.m107205a(aweme)).mo16887a("request_id", C33230ac.m107206a(aweme, feedParam.getPageType())).mo16885a(C22704b.f60415d, Integer.valueOf(z ? 1 : 0)).mo16885a(POIService.KEY_ORDER, Integer.valueOf(i)).mo16887a("is_photo", C33230ac.m107239n(aweme)).mo16887a("enter_method", feedParam.getEnterMethodValue()).mo16887a("enter_from", feedParam.getEventType());
        if (!TextUtils.isEmpty(C33230ac.m107223e(aweme))) {
            a.mo16887a("poi_id", C33230ac.m107223e(aweme));
        }
        if (C33230ac.m107220c(feedParam.getEventType())) {
            a.mo16887a("poi_type", C33230ac.m107229h(aweme)).mo16887a("poi_channel", C33230ac.m107214b()).mo16887a("city_info", C33230ac.m107204a()).mo16887a("distance_info", C33230ac.m107231i(aweme));
        }
        if (!TextUtils.isEmpty(feedParam.getShareUserId())) {
            a.mo16887a("share_mode", "token").mo16887a("uid", feedParam.getShareUserId());
        }
        return a;
    }

    /* renamed from: a */
    public static void m93627a(Context context, Aweme aweme, JSONObject jSONObject, FeedParam feedParam, String str) {
        String str2;
        int pageType = feedParam.getPageType();
        if (pageType == 7) {
            str2 = "homepage_fresh";
        } else if (pageType != 11) {
            switch (pageType) {
                case 0:
                    str2 = "homepage_hot";
                    break;
                case 1:
                    str2 = "homepage_follow";
                    break;
                default:
                    return;
            }
        } else {
            str2 = "categorized_city_poi";
        }
        C28485h hVar = new C28485h(jSONObject, aweme, str2, str, context, aweme.getAid(), feedParam);
        C1592h.m7855a((Callable<TResult>) hVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m93629a(Aweme aweme, Aweme aweme2, FeedParam feedParam, boolean z, boolean z2, String str) {
        if (z2) {
            C28486i iVar = new C28486i(z, str, aweme.getAuthorUid(), aweme.getAid(), aweme2.getAid(), feedParam);
            C1592h.m7855a((Callable<TResult>) iVar, (Executor) C6907h.m21516a());
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93625a(JSONObject jSONObject, Aweme aweme, String str, String str2, Context context, String str3, FeedParam feedParam) throws Exception {
        try {
            jSONObject.put("display", "full");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("to_user_id", aweme.getAuthorUid());
            jSONObject.put("author_id", aweme.getAuthorUid());
            if (!TextUtils.isEmpty(C33230ac.m107223e(aweme))) {
                jSONObject.put("poi_id", C33230ac.m107223e(aweme));
            }
            if (C33230ac.m107220c(str)) {
                jSONObject.put("poi_type", C33230ac.m107229h(aweme));
                jSONObject.put("city_info", C33230ac.m107204a());
                jSONObject.put("distance_info", C33230ac.m107231i(aweme));
            }
            if (C33230ac.m107224e(str2)) {
                jSONObject.put("enter_fullscreen", "1");
                jSONObject.put("content_type", C33230ac.m107240o(aweme));
                if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                    jSONObject.put("is_reposted", "1");
                    jSONObject.put("repost_from_group_id", aweme.getRepostFromGroupId());
                    jSONObject.put("repost_from_user_id", aweme.getRepostFromUserId());
                }
            }
        } catch (JSONException unused) {
        }
        C6907h.m21519a(context, "show", str, str3, 0, jSONObject);
        if (C33230ac.m107224e(str2)) {
            jSONObject.put("enter_from", str);
            C6907h.m21528b("show", jSONObject);
        }
        if (C6399b.m19944t()) {
            C6907h.m21524a("video_show", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", str3).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107232i(str3))).mo59970a("_staging_flag", 0).mo59971a("feed_count", aweme.getFeedCount()).mo59973a(POIService.KEY_ORDER, C33230ac.m107216b(aweme, feedParam.getPageType())).f60753a);
            new C33246ar().mo85126a(str2).mo85128c(aweme, feedParam.getPageType()).mo85252e();
        }
        return null;
    }
}
