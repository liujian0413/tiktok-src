package com.p280ss.android.ugc.aweme.discover.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26755e;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallengeList;
import com.p280ss.android.ugc.aweme.discover.model.SearchCommodityList;
import com.p280ss.android.ugc.aweme.discover.model.SearchMix;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoiList;
import com.p280ss.android.ugc.aweme.discover.model.SearchUserList;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApi */
public final class SearchApi {

    /* renamed from: a */
    public static final String f70064a = Api.f60502b;

    /* renamed from: b */
    static final IRetrofit f70065b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f70064a);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApi$RealApi */
    interface RealApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/music/rank/")
        C18253l<SearchMusicList> rankMusicList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "count") int i);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/recommend/challenge/")
        C18253l<SearchChallengeList> recommendChallengeList(@C7727c(mo20417a = "max_cursor") long j, @C7727c(mo20417a = "count") int i);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/challenge/search/")
        C18253l<SearchChallengeList> searchChallengeList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "hot_search") int i2, @C7727c(mo20417a = "is_pull_refresh") int i3, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i4);

        @C7729e
        @C7739o(mo20429a = "/aweme/v2/shop/search/vertical/")
        C1592h<SearchCommodityList> searchCommodityList(@C7727c(mo20417a = "query") String str, @C7727c(mo20417a = "type") int i, @C7727c(mo20417a = "sort") int i2, @C7727c(mo20417a = "cursor") int i3, @C7727c(mo20417a = "count") int i4, @C7727c(mo20417a = "is_pull_refresh") int i5, @C7727c(mo20417a = "hot_search") int i6, @C7727c(mo20417a = "search_id") String str2, @C7727c(mo20417a = "query_correct_type") int i7);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/search/item/")
        C18253l<SearchMix> searchFeedList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") long j, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "source") String str2, @C7727c(mo20417a = "is_pull_refresh") int i2, @C7727c(mo20417a = "hot_search") int i3, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i4);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/general/search/single/")
        C7492s<C26755e> searchMTMixFeedList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") int i, @C7727c(mo20417a = "count") int i2, @C7727c(mo20417a = "is_pull_refresh") int i3, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "hot_search") int i4, @C7727c(mo20417a = "latitude") double d, @C7727c(mo20417a = "longitude") double d2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i5);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/general/search/single/")
        C1592h<C26755e> searchMixFeedList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") int i, @C7727c(mo20417a = "count") int i2, @C7727c(mo20417a = "is_pull_refresh") int i3, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "hot_search") int i4, @C7727c(mo20417a = "latitude") double d, @C7727c(mo20417a = "longitude") double d2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i5, @C7727c(mo20417a = "mac_address") String str4);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/general/search/")
        C18253l<SearchMix> searchMixList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") long j, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "is_pull_refresh") int i2, @C7727c(mo20417a = "hot_search") int i3, @C7727c(mo20417a = "latitude") double d, @C7727c(mo20417a = "longitude") double d2, @C7727c(mo20417a = "search_id") String str2, @C7727c(mo20417a = "query_correct_type") int i4);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/music/search/")
        C18253l<SearchMusicList> searchMusicList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "is_pull_refresh") int i2, @C7727c(mo20417a = "hot_search") int i3, @C7727c(mo20417a = "search_id") String str2, @C7727c(mo20417a = "query_correct_type") int i4);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/general/poi/search/")
        C18253l<SearchPoiList> searchPoiList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "hot_search") int i2, @C7727c(mo20417a = "latitude") double d, @C7727c(mo20417a = "longitude") double d2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i3);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/discover/search/")
        C18253l<SearchUserList> searchUserList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "type") int i2, @C7727c(mo20417a = "is_pull_refresh") int i3, @C7727c(mo20417a = "hot_search") int i4, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i5);
    }

    /* renamed from: a */
    public static SearchChallengeList m87303a(long j, int i) throws Exception {
        try {
            C26612d.f70187a.mo68301a();
            return (SearchChallengeList) ((RealApi) f70065b.create(RealApi.class)).recommendChallengeList(j, i).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: b */
    public static SearchMusicList m87309b(long j, int i) throws Exception {
        try {
            return (SearchMusicList) ((RealApi) f70065b.create(RealApi.class)).rankMusicList(j, i).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static SearchChallengeList m87304a(String str, long j, int i, int i2, int i3, String str2, int i4) throws Exception {
        try {
            C26612d.f70187a.mo68301a();
            return (SearchChallengeList) ((RealApi) f70065b.create(RealApi.class)).searchChallengeList(j, str, i, i3, i2, "challenge", str2, i4).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: b */
    public static SearchMusicList m87310b(String str, long j, int i, int i2, int i3, String str2, int i4) throws Exception {
        try {
            C26612d.f70187a.mo68301a();
            return (SearchMusicList) ((RealApi) f70065b.create(RealApi.class)).searchMusicList(j, str, i, i2, i3, str2, i4).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static SearchMix m87306a(String str, long j, int i, String str2, int i2, int i3, String str3, int i4) throws Exception {
        try {
            C26612d.f70187a.mo68301a();
            return (SearchMix) ((RealApi) f70065b.create(RealApi.class)).searchFeedList(str, j, i, str2, i2, i3, str3, i4).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static SearchPoiList m87307a(String str, long j, int i, int i2, double d, double d2, String str2, int i3) throws Exception {
        try {
            C26612d.f70187a.mo68301a();
            return (SearchPoiList) ((RealApi) f70065b.create(RealApi.class)).searchPoiList(j, str, i, "poi", i2, d, d2, str2, i3).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static SearchUserList m87308a(String str, long j, int i, int i2, int i3, String str2, String str3, int i4) throws Exception {
        try {
            C26612d.f70187a.mo68301a();
            return (SearchUserList) ((RealApi) f70065b.create(RealApi.class)).searchUserList(j, str, i, 1, i2, i3, str2, str3, i4).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static SearchMix m87305a(String str, long j, int i, int i2, int i3, double d, double d2, String str2, int i4) throws Exception {
        try {
            return (SearchMix) ((RealApi) f70065b.create(RealApi.class)).searchMixList(str, j, i, i2, i3, d, d2, str2, i4).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }
}
