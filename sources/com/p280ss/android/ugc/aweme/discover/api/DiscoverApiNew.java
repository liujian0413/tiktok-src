package com.p280ss.android.ugc.aweme.discover.api;

import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26569b;
import com.p280ss.android.ugc.aweme.discover.model.BannerList;
import com.p280ss.android.ugc.aweme.discover.model.CategoryList;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApiNew */
public interface DiscoverApiNew {

    /* renamed from: a */
    public static final C26557a f70056a = C26557a.f70057a;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApiNew$a */
    public static final class C26557a {

        /* renamed from: a */
        static final /* synthetic */ C26557a f70057a = new C26557a();

        /* renamed from: b */
        private static final DiscoverApiNew f70058b;

        private C26557a() {
        }

        /* renamed from: a */
        public static DiscoverApiNew m87298a() {
            return f70058b;
        }

        static {
            Object create = C26569b.f70091a.create(DiscoverApiNew.class);
            C7573i.m23582a(create, "RetrofitProvider.COMMON_…scoverApiNew::class.java)");
            f70058b = (DiscoverApiNew) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/find/")
    C7492s<BannerList> getBannerList(@C7744t(mo20436a = "banner_tab_type") Integer num, @C7744t(mo20436a = "ad_personality_mode") Integer num2, @C7744t(mo20436a = "mac_address") String str);

    @C7730f(mo20420a = "/aweme/v1/category/list/")
    C7492s<CategoryList> getCategoryList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "ad_personality_mode") Integer num);

    @C7730f(mo20420a = "/aweme/v2/category/list/")
    C7492s<CategoryList> getCategoryV2List(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "is_complete") Integer num, @C7744t(mo20436a = "ad_personality_mode") Integer num2);

    @C7730f(mo20420a = "/aweme/v1/category/fascinating/list/")
    C7492s<CategoryList> getFindFascinatingList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "ad_personality_mode") Integer num, @C7744t(mo20436a = "mac_address") String str);
}
