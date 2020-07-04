package com.p280ss.android.ugc.aweme.discover.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.discover.base.C26601f;
import com.p280ss.android.ugc.aweme.discover.base.C26602g;
import com.p280ss.android.ugc.aweme.discover.base.C26602g.C26603a;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26734f;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26755e;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
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
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.ExecutionException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew */
public final class SearchApiNew {

    /* renamed from: a */
    public static final SearchApiNew f70066a = new SearchApiNew();

    /* renamed from: b */
    private static final String f70067b = Api.f60502b;

    /* renamed from: c */
    private static final IRetrofit f70068c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f70067b);

    /* renamed from: d */
    private static final int f70069d = 1;

    /* renamed from: e */
    private static final int f70070e = 1;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$RealApi */
    public interface RealApi {
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
        C18253l<SearchMix> searchFeedList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") long j, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "source") String str2, @C7727c(mo20417a = "is_pull_refresh") int i2, @C7727c(mo20417a = "hot_search") int i3, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i4, @C7727c(mo20417a = "is_filter_search") int i5, @C7727c(mo20417a = "sort_type") int i6, @C7727c(mo20417a = "publish_time") int i7);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/general/search/single/")
        C18253l<C26755e> searchMTMixFeedList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") int i, @C7727c(mo20417a = "count") int i2, @C7727c(mo20417a = "is_pull_refresh") int i3, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "hot_search") int i4, @C7727c(mo20417a = "latitude") double d, @C7727c(mo20417a = "longitude") double d2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i5);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/general/search/single/")
        C1592h<C26755e> searchMixFeedList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") int i, @C7727c(mo20417a = "count") int i2, @C7727c(mo20417a = "is_pull_refresh") int i3, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "hot_search") int i4, @C7727c(mo20417a = "latitude") double d, @C7727c(mo20417a = "longitude") double d2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i5, @C7727c(mo20417a = "mac_address") String str4, @C7727c(mo20417a = "is_filter_search") int i6, @C7727c(mo20417a = "sort_type") int i7, @C7727c(mo20417a = "publish_time") int i8, @C7727c(mo20417a = "disable_synthesis") int i9, @C7727c(mo20417a = "multi_mod") int i10, @C7727c(mo20417a = "single_filter_aladdin") int i11);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/general/search/")
        C18253l<SearchMix> searchMixList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") long j, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "is_pull_refresh") int i2, @C7727c(mo20417a = "hot_search") int i3, @C7727c(mo20417a = "latitude") double d, @C7727c(mo20417a = "longitude") double d2, @C7727c(mo20417a = "search_id") String str2, @C7727c(mo20417a = "query_correct_type") int i4);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/music/search/")
        C7492s<SearchMusicList> searchMusicList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "is_pull_refresh") int i2, @C7727c(mo20417a = "hot_search") int i3, @C7727c(mo20417a = "search_id") String str2, @C7727c(mo20417a = "query_correct_type") int i4, @C7727c(mo20417a = "is_author_search") int i5);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/general/poi/search/")
        C18253l<SearchPoiList> searchPoiList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "hot_search") int i2, @C7727c(mo20417a = "latitude") double d, @C7727c(mo20417a = "longitude") double d2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i3);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/discover/search/")
        C18253l<SearchUserList> searchUserList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "type") int i2, @C7727c(mo20417a = "is_pull_refresh") int i3, @C7727c(mo20417a = "hot_search") int i4, @C7727c(mo20417a = "search_source") String str2, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i5);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$a */
    static final class C26560a<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ C26734f f70071a;

        /* renamed from: b */
        final /* synthetic */ int f70072b;

        /* renamed from: c */
        final /* synthetic */ int f70073c;

        C26560a(C26734f fVar, int i, int i2) {
            this.f70071a = fVar;
            this.f70072b = i;
            this.f70073c = i2;
        }

        public final void subscribe(C47870u<C26755e> uVar) {
            C7573i.m23587b(uVar, "it");
            try {
                uVar.mo19239a((Object) (C26755e) SearchApiNew.m87314b().searchMTMixFeedList(this.f70071a.f70447a, this.f70072b, this.f70073c, this.f70071a.f70448b, this.f70071a.f70449c, this.f70071a.f70450d, 0.0d, 0.0d, this.f70071a.f70452f, this.f70071a.f70451e).get());
                if (!uVar.isDisposed()) {
                    uVar.mo19238a();
                }
            } catch (Throwable th) {
                if (!uVar.isDisposed()) {
                    uVar.mo19240a(th);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$b */
    static final class C26561b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26561b f70074a = new C26561b();

        /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$b$a */
        public static final class C26562a implements C26602g {
            C26562a() {
            }

            public final int aF_() {
                return 3;
            }

            /* renamed from: a */
            public final SearchApiResult mo68242a(SearchApiResult searchApiResult) {
                C7573i.m23587b(searchApiResult, "data");
                return C26603a.m87384a(this, searchApiResult);
            }
        }

        C26561b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m87315a((C26755e) obj);
        }

        /* renamed from: a */
        private static C26755e m87315a(C26755e eVar) {
            C7573i.m23587b(eVar, "it");
            SearchApiResult a = new C26562a().mo68242a(eVar);
            if (a != null) {
                return (C26755e) a;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$c */
    static final class C26563c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26563c f70075a = new C26563c();

        C26563c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m87317a((C26755e) obj);
        }

        /* renamed from: a */
        private static C26755e m87317a(C26755e eVar) {
            C7573i.m23587b(eVar, "it");
            C26601f.f70159a.mo68289a(eVar);
            return eVar;
        }
    }

    private SearchApiNew() {
    }

    /* renamed from: a */
    public static int m87311a() {
        return f70070e;
    }

    /* renamed from: b */
    public static final RealApi m87314b() {
        Object create = f70068c.create(RealApi.class);
        C7573i.m23582a(create, "sRetrofit.create(RealApi::class.java)");
        return (RealApi) create;
    }

    /* renamed from: a */
    public static C7492s<C26755e> m87312a(C26734f fVar, int i, int i2) {
        C7573i.m23587b(fVar, "param");
        C26612d.f70187a.mo68301a();
        C7492s<C26755e> b = C7492s.m23282a((C7495v<T>) new C26560a<T>(fVar, i, 10)).mo19317d((C7327h<? super T, ? extends R>) C26561b.f70074a).mo19317d((C7327h<? super T, ? extends R>) C26563c.f70075a).mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Observable.create<Search…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public static C7492s<SearchMusicList> m87313a(String str, long j, int i, int i2, int i3, String str2, int i4, int i5) throws Exception {
        String str3 = str;
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        C7573i.m23587b(str2, "searchId");
        try {
            C26612d.f70187a.mo68301a();
            return m87314b().searchMusicList(j, str, 20, i2, i3, str2, i4, i5);
        } catch (ExecutionException e) {
            RuntimeException a = C22838j.m75277a(e);
            C7573i.m23582a((Object) a, "getCompatibleException(e)");
            throw a;
        }
    }
}
