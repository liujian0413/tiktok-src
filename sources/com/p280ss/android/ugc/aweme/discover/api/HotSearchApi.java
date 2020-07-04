package com.p280ss.android.ugc.aweme.discover.api;

import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26569b;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.p280ss.android.ugc.aweme.discover.model.RankingListCover;
import com.p280ss.android.ugc.aweme.discover.model.SearchMix;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchApi */
public interface HotSearchApi {

    /* renamed from: a */
    public static final C26558a f70059a = C26558a.f70060a;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchApi$a */
    public static final class C26558a {

        /* renamed from: a */
        static final /* synthetic */ C26558a f70060a = new C26558a();

        /* renamed from: b */
        private static final HotSearchApi f70061b;

        private C26558a() {
        }

        /* renamed from: a */
        public static HotSearchApi m87299a() {
            return f70061b;
        }

        static {
            Object create = C26569b.f70091a.create(HotSearchApi.class);
            C7573i.m23582a(create, "RetrofitProvider.COMMON_…HotSearchApi::class.java)");
            f70061b = (HotSearchApi) create;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchApi$b */
    public static final class C26559b {
    }

    @C7730f(mo20420a = "/aweme/v1/hot/search/video/list/")
    C7492s<Object> getAwemesByHotWord(@C7744t(mo20436a = "hotword") String str, @C7744t(mo20436a = "offset") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "source") String str2, @C7744t(mo20436a = "is_ad") int i3, @C7744t(mo20436a = "gid") String str3, @C7744t(mo20436a = "item_id_list") String str4, @C7744t(mo20436a = "is_trending") int i4);

    @C7730f(mo20420a = "/aweme/v1/hot/search/list/")
    C7492s<HotSearchListResponse> getHotSearchList(@C7744t(mo20436a = "detail_list") Integer num, @C7744t(mo20436a = "mac_address") String str, @C7744t(mo20436a = "source") Integer num2, @C7744t(mo20436a = "current_word") String str2, @C7744t(mo20436a = "words_in_panel") String str3, @C7744t(mo20436a = "trend_entry_word") String str4);

    @C7730f(mo20420a = "/aweme/v1/hotsearch/aweme/billboard/")
    C7492s<HotVideoListResponse> getHotVideoList();

    @C7730f(mo20420a = "/aweme/v1/branch/billboard/entrance/")
    C7492s<RankingListCover> getRankingListCover();

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/search/item/")
    C7492s<SearchMix> searchFeedList(@C7727c(mo20417a = "keyword") String str, @C7727c(mo20417a = "offset") long j, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "source") String str2, @C7727c(mo20417a = "is_pull_refresh") int i2, @C7727c(mo20417a = "hot_search") int i3, @C7727c(mo20417a = "search_id") String str3, @C7727c(mo20417a = "query_correct_type") int i4);
}
