package com.p280ss.android.ugc.aweme.discover.api;

import bolts.C1592h;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.bytedance.retrofit2.p264b.C6475z;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.discover.model.BannerList;
import com.p280ss.android.ugc.aweme.discover.model.CategoryList;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCellSectionListResponse;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverTrendingReponseV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse;
import com.p280ss.android.ugc.aweme.discover.model.WideSearchResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.recommend.C37129b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Map;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApi */
public final class DiscoverApi {

    /* renamed from: a */
    private static final String f70050a;

    /* renamed from: b */
    private static final String f70051b;

    /* renamed from: c */
    private static final String f70052c;

    /* renamed from: d */
    private static DiscoverService f70053d;

    /* renamed from: e */
    private static final DiscoverService f70054e = ((DiscoverService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(DiscoverService.class));

    /* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApi$DiscoverService */
    public interface DiscoverService {
        @C6457h(mo15740a = "/aweme/v2/discovery/v4/category/list/")
        C7492s<DiscoverV4CategoryResponse> categoryListV4(@C6474y(mo15757a = "category_list_type") int i);

        @C6457h(mo15740a = "/aweme/v1/discover/cell/detail/")
        C1592h<DiscoverCellDetailResponse> cellDetail(@C6474y(mo15757a = "type") int i, @C6474y(mo15757a = "is_recommend") boolean z, @C6474y(mo15757a = "cell_id") String str);

        @C6457h(mo15740a = "/aweme/v2/discovery/v4/cell/detail/")
        C1592h<DiscoveryV4CellDetailResponse> cellDetailV4(@C6474y(mo15757a = "ab_type") int i, @C6474y(mo15757a = "cell_id") String str, @C6474y(mo15757a = "tab_name") String str2, @C6474y(mo15757a = "count") int i2);

        @C6457h(mo15740a = "/aweme/v2/discovery/cell/list/")
        C7492s<DiscoveryV3CellListResponse> cellListV3(@C6474y(mo15757a = "cursor") int i, @C6474y(mo15757a = "count") int i2, @C6474y(mo15757a = "ab_type") int i3);

        @C6457h(mo15740a = "/aweme/v2/discovery/v4/cell/list/")
        C7492s<DiscoverV4PlayListResponse> cellListV4(@C6474y(mo15757a = "cursor") int i, @C6474y(mo15757a = "count") int i2, @C6474y(mo15757a = "tab_name") String str, @C6474y(mo15757a = "ab_type") int i3);

        @C6457h(mo15740a = "/aweme/v1/discover/cell/list/")
        C1592h<DiscoverCellSectionListResponse> cellSectionList();

        @C6457h(mo15740a = "/aweme/v1/recommend/user/dislike/")
        C12466b<String> disLikeRecommend(@C6474y(mo15757a = "user_id") String str);

        @C6457h(mo15740a = "/aweme/v1/find/")
        C12466b<BannerList> fetchBanners(@C6475z Map<String, String> map);

        @C6457h
        C12466b<CategoryList> fetchCategoryList(@C6450ac String str, @C6475z Map<String, String> map);

        @C6457h(mo15740a = "/aweme/v1/hot/search/")
        C12466b<WideSearchResponse> fetchHotSearch();

        @C6457h(mo15740a = "/aweme/v2/discovery/v4/trending/")
        C7492s<DiscoverTrendingReponseV4> trendingListV4(@C6474y(mo15757a = "trending_type") int i, @C6474y(mo15757a = "cursor") int i2, @C6474y(mo15757a = "count") int i3);
    }

    /* renamed from: a */
    public static DiscoverService m87295a() {
        if (f70053d == null) {
            f70053d = (DiscoverService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(DiscoverService.class);
        }
        return f70053d;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/category/list/");
        f70050a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Api.f60502b);
        sb2.append("/aweme/v2/category/list/");
        f70051b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Api.f60502b);
        sb3.append("/aweme/v1/category/fascinating/list/");
        f70052c = sb3.toString();
    }

    /* renamed from: a */
    public static void m87296a(final String str) throws Exception {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                try {
                    DiscoverApi.m87297b(str);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: b */
    public static void m87297b(String str) throws Exception {
        C42961az.m136380a(new C37129b(str));
        f70054e.disLikeRecommend(str).execute();
    }
}
