package com.p280ss.android.ugc.aweme.profile.api;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12466b;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.p296a.C6810f;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.profile.service.C36072h;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.profile.util.C36729b;
import java.util.HashMap;
import java.util.Map;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.AwemeApi */
public final class AwemeApi {

    /* renamed from: a */
    public static final String f93675a;

    /* renamed from: b */
    public static final String f93676b;

    /* renamed from: c */
    public static final String f93677c;

    /* renamed from: d */
    public static final String f93678d;

    /* renamed from: e */
    private static final RealApi f93679e = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.AwemeApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v2/douplus/item/check/")
        C18253l<AwemeAdStatus> checkItemAdStatus(@C7744t(mo20436a = "item_id") String str, @C7744t(mo20436a = "from_source") int i);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/commit/dislike/item/")
        C12466b<BaseResponse> disLikeAweme(@C7744t(mo20436a = "aweme_id") String str, @C7728d Map<String, String> map);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/commit/dislike/item/")
        C12466b<BaseResponse> disLikeReason(@C7728d Map<String, String> map);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19223b.f51890e);
        sb.append("/aweme/v1/aweme/post/");
        f93675a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C19223b.f51890e);
        sb2.append("/aweme/v1/aweme/favorite/");
        f93676b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C19223b.f51890e);
        sb3.append("/aweme/v1/aweme/listcollection/");
        f93677c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C19223b.f51890e);
        sb4.append("/aweme/v1/private/aweme/");
        f93678d = sb4.toString();
    }

    /* renamed from: a */
    private static String m115427a(int i) {
        if (i != 0) {
            if (i == 4) {
                return f93677c;
            }
            if (i != 11) {
                if (i != 14) {
                    return f93676b;
                }
                return f93678d;
            }
        }
        return f93675a;
    }

    /* renamed from: a */
    private static String m115428a(C6810f fVar) {
        C6809a[] aVarArr;
        String str = "X-TT-LOGID";
        if (!TextUtils.isEmpty(str)) {
            aVarArr = fVar.mo16640a(str);
        } else {
            aVarArr = null;
        }
        if (aVarArr != null) {
            for (C6809a aVar : aVarArr) {
                if ("X-TT-LOGID".equalsIgnoreCase(aVar.mo16635a())) {
                    return aVar.mo16636b();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m115429a(Aweme aweme) throws Exception {
        if (aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        String aid = aweme.getAid();
        String str = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        if (aweme.isAd()) {
            str = String.valueOf(aweme.getAwemeRawAd().getAdId());
            str2 = String.valueOf(aweme.getAwemeRawAd().getCreativeId());
            str4 = aweme.getAwemeRawAd().getLogExtra();
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("ad_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("creative_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("ad_category", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("log_extra", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("dislike_source", str5);
        }
        NetUtil.putCommonParams(hashMap, true);
        f93679e.disLikeAweme(aid, hashMap).execute();
        return aid;
    }

    /* renamed from: a */
    public static String m115430a(Aweme aweme, LinkData linkData) throws Exception {
        if (linkData == null) {
            return "";
        }
        if (aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        String str = linkData.creativeId;
        String str2 = linkData.logExtra;
        String aid = aweme.getAid();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("creative_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("log_extra", str2);
        }
        NetUtil.putCommonParams(hashMap, true);
        f93679e.disLikeAweme(aid, hashMap).execute();
        return aid;
    }

    /* renamed from: a */
    public static String m115431a(Aweme aweme, String str) throws Exception {
        String str2;
        if (aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dislike_reason_id", str);
        String str3 = "music_id";
        if (aweme.getMusic() != null) {
            str2 = aweme.getMusic().getMid();
        } else {
            str2 = "";
        }
        hashMap.put(str3, str2);
        hashMap.put("author_id", aweme.getAuthorUid());
        f93679e.disLikeReason(hashMap).execute();
        return str;
    }

    /* renamed from: a */
    public static FeedItemList m115425a(boolean z, String str, String str2, int i, long j, int i2, String str3) throws Exception {
        int i3;
        boolean z2;
        String str4 = str;
        int i4 = i;
        long j2 = j;
        C6810f fVar = new C6810f();
        C19290j jVar = new C19290j(m115427a(i));
        if (i4 == 0) {
            jVar.mo51186a("source", 0);
        } else if (i4 == 11) {
            jVar.mo51186a("source", 1);
        }
        if (i4 == 4) {
            jVar.mo51187a("cursor", j2);
        } else {
            jVar.mo51187a("max_cursor", j2);
            if ((TextUtils.isEmpty(str2) || C30199h.m98861a().getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
                jVar.mo51188a("user_id", str4);
            }
            if (!TextUtils.isEmpty(str2)) {
                jVar.mo51188a("sec_user_id", str2);
            }
        }
        jVar.mo51186a("count", i2);
        C36074j jVar2 = C36074j.f94315a;
        if (z) {
            i3 = 60;
        } else {
            i3 = 0;
        }
        String a = jVar.mo51184a();
        Class<FeedItemList> cls = FeedItemList.class;
        if (j2 <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) jVar2.apiExecuteGetJSONObject(i3, a, cls, null, fVar, z2, str3);
        feedItemList.setRequestId(m115428a(fVar));
        C36729b.m118407a(i4, str4, feedItemList);
        C36072h.f94311a.mo64354a("personal", feedItemList.getItems());
        return feedItemList;
    }

    /* renamed from: a */
    public static FeedItemList m115426a(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4) {
        int i5;
        boolean z2;
        String str4 = str;
        long j2 = j;
        C6810f fVar = new C6810f();
        C19290j jVar = new C19290j(f93676b);
        jVar.mo51186a("invalid_item_count", i3);
        jVar.mo51186a("is_hiding_invalid_item", i4);
        jVar.mo51187a("max_cursor", j2);
        if ((TextUtils.isEmpty(str2) || C30199h.m98861a().getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
            jVar.mo51188a("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            String str5 = str2;
            jVar.mo51188a("sec_user_id", str2);
        }
        jVar.mo51186a("count", i2);
        C36074j jVar2 = C36074j.f94315a;
        if (z) {
            i5 = 60;
        } else {
            i5 = 0;
        }
        String a = jVar.mo51184a();
        Class<FeedItemList> cls = FeedItemList.class;
        if (j2 <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) jVar2.apiExecuteGetJSONObject(i5, a, cls, null, fVar, z2, null);
        feedItemList.setRequestId(m115428a(fVar));
        C36729b.m118407a(i, str, feedItemList);
        C36072h.f94311a.mo64354a("personal", feedItemList.getItems());
        return feedItemList;
    }
}
