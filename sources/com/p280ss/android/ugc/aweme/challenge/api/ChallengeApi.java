package com.p280ss.android.ugc.aweme.challenge.api;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25293bu;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;
import retrofit2.p363b.C7745u;
import retrofit2.p363b.C7748x;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.ChallengeApi */
public final class ChallengeApi {

    /* renamed from: a */
    public static final String f62402a = Api.f60502b;

    /* renamed from: b */
    private static final String f62403b;

    /* renamed from: c */
    private static final String f62404c;

    /* renamed from: d */
    private static final String f62405d;

    /* renamed from: e */
    private static final String f62406e;

    /* renamed from: f */
    private static final String f62407f;

    /* renamed from: g */
    private static final String f62408g;

    /* renamed from: h */
    private static final String f62409h;

    /* renamed from: i */
    private static final String f62410i;

    /* renamed from: j */
    private static final String f62411j;

    /* renamed from: k */
    private static final RealApi f62412k = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f62402a).create(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.challenge.api.ChallengeApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/challenge/detail/")
        C1592h<ChallengeDetail> fetchChallengeDetail(@C7744t(mo20436a = "ch_id") String str, @C7744t(mo20436a = "hashtag_name") String str2, @C7744t(mo20436a = "query_type") int i, @C7744t(mo20436a = "click_reason") int i2);

        @C7730f(mo20420a = "/aweme/v1/commerce/challenge/detail/")
        C1592h<ChallengeDetail> fetchCommerceChallengeDetail(@C7744t(mo20436a = "ch_id") String str, @C7744t(mo20436a = "hashtag_name") String str2, @C7744t(mo20436a = "query_type") int i, @C7744t(mo20436a = "click_reason") int i2);

        @C7730f
        C18253l<ChallengeAwemeList> getChallengeAwemeList(@C7748x String str, @C7745u Map<String, String> map);

        @C7730f
        C18253l<ChallengeDetail> getChallengeDetail(@C7748x String str, @C7745u Map<String, String> map);

        @C7730f(mo20420a = "/aweme/v1/recommend/challenge/")
        C18253l<ChallengeList> getChallengeList(@C7745u Map<String, String> map);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/challenge/search/")
        C18253l<SearchChallengeList> searchChallenge(@C7728d Map<String, String> map);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/commit/challenge/");
        f62403b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Api.f60502b);
        sb2.append("/aweme/v1/challenge/detail/");
        f62404c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Api.f60502b);
        sb3.append("/aweme/v1/challenge/aweme/");
        f62405d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(Api.f60502b);
        sb4.append("/aweme/v1/challenge/fresh/aweme/");
        f62406e = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(Api.f60502b);
        sb5.append("/aweme/v1/commerce/challenge/detail/");
        f62407f = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Api.f60502b);
        sb6.append("/aweme/v1/commerce/challenge/aweme/");
        f62408g = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(Api.f60502b);
        sb7.append("/aweme/v1/commerce/challenge/fresh/aweme/");
        f62409h = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(Api.f60502b);
        sb8.append("/aweme/v1/challenge/aweme/single/");
        f62410i = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(Api.f60502b);
        sb9.append("/aweme/v1/challenge/fresh/aweme/single/");
        f62411j = sb9.toString();
    }

    /* renamed from: a */
    private static <T> T m77601a(String str, Type type) {
        try {
            return C10944e.m32113a().mo15975a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static ChallengeDetail m77599a(String str, int i, boolean z) throws Exception {
        String str2;
        if (C25242ao.m82977b(str)) {
            str2 = f62407f;
        } else {
            str2 = f62404c;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str);
            hashMap.put("query_type", "0");
        }
        hashMap.put("click_reason", String.valueOf(i));
        ChallengeDetail challengeDetail = (ChallengeDetail) f62412k.getChallengeDetail(str2, hashMap).get();
        if (!(challengeDetail == null || challengeDetail.challenge == null || challengeDetail.challenge.getCommerceChallengeTask() == null)) {
            C24671f.m80863m().mo64354a("challenge", (List) m77601a(challengeDetail.challenge.getCommerceChallengeTask().getExampleAwemes(), new C6597a<List<Aweme>>() {
            }.type));
        }
        return challengeDetail;
    }

    /* renamed from: a */
    public static SearchChallengeList m77600a(String str, int i, String str2) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(POIService.KEY_KEYWORD, str);
        hashMap.put("count", "20");
        hashMap.put("search_source", str2);
        hashMap.put("is_hash_tag", "1");
        if (C6399b.m19945u() && (TextUtils.equals(str2, "video_challenge") || TextUtils.equals(str2, "photo_publish"))) {
            hashMap.put("search_channel", "aweme_challenge_create");
        }
        NetUtil.putCommonParams(hashMap, true);
        SearchChallengeList searchChallengeList = (SearchChallengeList) f62412k.searchChallenge(hashMap).get();
        searchChallengeList.keyword = str;
        return searchChallengeList;
    }

    /* renamed from: b */
    public static C1592h<ChallengeDetail> m77602b(String str, String str2, int i, int i2) {
        return f62412k.fetchCommerceChallengeDetail(str, str2, 0, 0);
    }

    /* renamed from: a */
    public static C1592h<ChallengeDetail> m77597a(String str, String str2, int i, int i2) {
        return f62412k.fetchChallengeDetail(str, null, 0, 0);
    }

    /* renamed from: a */
    public static ChallengeAwemeList m77598a(String str, long j, int i, int i2, boolean z, String str2) throws Exception {
        String str3;
        boolean b = C25242ao.m82977b(str);
        if (i2 == 2) {
            if (b) {
                str3 = f62408g;
            } else {
                str3 = f62405d;
            }
        } else if (b) {
            str3 = f62409h;
        } else {
            str3 = f62406e;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str);
            hashMap.put("query_type", "0");
        }
        hashMap.put("cursor", String.valueOf(j));
        hashMap.put("count", String.valueOf(i));
        hashMap.put("type", "5");
        hashMap.put("source", String.valueOf(str2));
        hashMap.put("mac_address", C25293bu.m83101a());
        ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) f62412k.getChallengeAwemeList(str3, hashMap).get();
        C24671f.m80863m().mo64354a("challenge", challengeAwemeList.items);
        return challengeAwemeList;
    }
}
