package com.p280ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25293bu;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApiNew.C26557a;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.discover.model.BannerList;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.a */
public final class C26852a {

    /* renamed from: a */
    public static final C26852a f70861a = new C26852a();

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.a$a */
    static final class C26853a<T, R> implements C7327h<T, C7496w<? extends R>> {

        /* renamed from: a */
        public static final C26853a f70862a = new C26853a();

        C26853a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88152a((BannerList) obj);
        }

        /* renamed from: a */
        private static C7492s<List<Banner>> m88152a(BannerList bannerList) {
            C7573i.m23587b(bannerList, "it");
            LogPbBean logPbBean = bannerList.logPb;
            C7573i.m23582a((Object) logPbBean, "it.logPb");
            String imprId = logPbBean.getImprId();
            for (Banner banner : bannerList.items) {
                C7573i.m23582a((Object) banner, "banner");
                banner.setRequestId(imprId);
            }
            return C7492s.m23301b(bannerList.items);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.a$b */
    static final class C26854b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26854b f70863a = new C26854b();

        C26854b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88153a((List) obj);
        }

        /* renamed from: a */
        private static DiscoverItemData m88153a(List<Banner> list) {
            C7573i.m23587b(list, "it");
            DiscoverItemData discoverItemData = new DiscoverItemData(4);
            discoverItemData.setBannerList(list);
            return discoverItemData;
        }
    }

    private C26852a() {
    }

    /* renamed from: a */
    public static C7492s<DiscoverItemData> m88151a() {
        int i;
        Integer num;
        if (C26654b.m87574b()) {
            i = 3;
        } else {
            i = 1;
        }
        if (C6399b.m19946v()) {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl personalizationMode = inst.getPersonalizationMode();
            C7573i.m23582a((Object) personalizationMode, "SharePrefCache.inst().personalizationMode");
            num = (Integer) personalizationMode.mo59877d();
        } else {
            num = null;
        }
        C7492s<DiscoverItemData> d = C26557a.m87298a().getBannerList(Integer.valueOf(i), num, C25293bu.m83101a()).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) C26853a.f70862a).mo19317d((C7327h<? super T, ? extends R>) C26854b.f70863a);
        C7573i.m23582a((Object) d, "DiscoverApiNew.INSTANCE.…turn@map banner\n        }");
        return d;
    }
}
