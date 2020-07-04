package com.p280ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.model.p602d.C11800e;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25293bu;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApiNew;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApiNew.C26557a;
import com.p280ss.android.ugc.aweme.discover.api.HotSearchApi;
import com.p280ss.android.ugc.aweme.discover.api.HotSearchApi.C26558a;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.Category;
import com.p280ss.android.ugc.aweme.discover.model.CategoryList;
import com.p280ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverListData;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.p280ss.android.ugc.aweme.discover.model.RankingListCover;
import com.p280ss.android.ugc.aweme.discover.speed.C26874a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30354a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b */
public final class C26855b extends C11800e<DiscoverRequestParam, DiscoverListData> {

    /* renamed from: d */
    public static final C26856a f70864d = new C26856a(null);

    /* renamed from: a */
    public final DiscoverApiNew f70865a = C26557a.m87298a();

    /* renamed from: b */
    public volatile int f70866b;

    /* renamed from: c */
    public volatile boolean f70867c = true;

    /* renamed from: e */
    private final HotSearchApi f70868e = C26558a.m87299a();

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$a */
    public static final class C26856a {
        private C26856a() {
        }

        public /* synthetic */ C26856a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$b */
    static final class C26857b<T, R> implements C7327h<T, C7496w<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C26855b f70869a;

        C26857b(C26855b bVar) {
            this.f70869a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Category> apply(CategoryList categoryList) {
            C7573i.m23587b(categoryList, "it");
            this.f70869a.f70866b = categoryList.cursor;
            this.f70869a.f70867c = categoryList.isHasMore();
            return C7492s.m23300b((Iterable<? extends T>) categoryList.items);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$c */
    static final class C26858c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26858c f70870a = new C26858c();

        C26858c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88164a((Category) obj);
        }

        /* renamed from: a */
        private static CategoryOrAd m88164a(Category category) {
            C7573i.m23587b(category, "it");
            List items = category.getItems();
            if (!C6307b.m19566a((Collection<T>) items)) {
                int size = items.size();
                for (int i = 0; i < size; i++) {
                    items.set(i, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) items.get(i)));
                }
            }
            if (category.isPicAd()) {
                return new CategoryOrAd(category.getAdData());
            }
            return new CategoryOrAd(category);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$d */
    static final class C26859d<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26859d f70871a = new C26859d();

        C26859d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88165a((CategoryOrAd) obj);
        }

        /* renamed from: a */
        private static DiscoverItemData m88165a(CategoryOrAd categoryOrAd) {
            C7573i.m23587b(categoryOrAd, "it");
            DiscoverItemData discoverItemData = new DiscoverItemData(5);
            discoverItemData.setCategoryOrAd(categoryOrAd);
            return discoverItemData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$e */
    static final class C26860e<T, R> implements C7327h<Throwable, C7496w<? extends CategoryList>> {

        /* renamed from: a */
        final /* synthetic */ C26855b f70872a;

        /* renamed from: b */
        final /* synthetic */ int f70873b;

        /* renamed from: c */
        final /* synthetic */ int f70874c;

        /* renamed from: d */
        final /* synthetic */ ObjectRef f70875d;

        C26860e(C26855b bVar, int i, int i2, ObjectRef objectRef) {
            this.f70872a = bVar;
            this.f70873b = i;
            this.f70874c = i2;
            this.f70875d = objectRef;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7496w<? extends CategoryList> apply(Throwable th) {
            C7573i.m23587b(th, "t");
            if (C26874a.m88185b()) {
                return C7492s.m23289a(th);
            }
            C26874a.m88183a(true);
            return this.f70872a.f70865a.getCategoryV2List(this.f70873b, this.f70874c, Integer.valueOf(0), (Integer) this.f70875d.element);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$f */
    static final class C26861f<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26861f f70876a = new C26861f();

        C26861f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88167a((HotSearchListResponse) obj);
        }

        /* renamed from: a */
        private static HotSearchListResponse m88167a(HotSearchListResponse hotSearchListResponse) {
            C7573i.m23587b(hotSearchListResponse, "it");
            HotSearchEntity data = hotSearchListResponse.getData();
            C7573i.m23582a((Object) data, "it.data");
            List<HotSearchItem> list = data.getList();
            LogPbBean logPb = hotSearchListResponse.getLogPb();
            for (HotSearchItem logPb2 : list) {
                logPb2.setLogPb(logPb);
            }
            return hotSearchListResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$g */
    static final class C26862g<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26862g f70877a = new C26862g();

        C26862g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88168a((HotSearchListResponse) obj);
        }

        /* renamed from: a */
        private static DiscoverItemData m88168a(HotSearchListResponse hotSearchListResponse) {
            C7573i.m23587b(hotSearchListResponse, "it");
            DiscoverItemData discoverItemData = new DiscoverItemData(1);
            discoverItemData.setHotSearchResponse(hotSearchListResponse);
            return discoverItemData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$h */
    static final class C26863h<T, R> implements C7327h<T, C7496w<? extends R>> {

        /* renamed from: a */
        public static final C26863h f70878a = new C26863h();

        C26863h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88169a((HotVideoListResponse) obj);
        }

        /* renamed from: a */
        private static C7492s<List<HotVideoItem>> m88169a(HotVideoListResponse hotVideoListResponse) {
            HotSearchInfo hotSearchInfo;
            C7573i.m23587b(hotVideoListResponse, "it");
            List<HotVideoItem> list = hotVideoListResponse.mHotVideoItemList;
            Collection collection = list;
            if (!C6307b.m19566a(collection)) {
                C7573i.m23582a((Object) list, "videoItems");
                int size = collection.size();
                for (int i = 0; i < size; i++) {
                    HotVideoItem hotVideoItem = (HotVideoItem) list.get(i);
                    C7573i.m23582a((Object) hotVideoItem, "item");
                    Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(hotVideoItem.getAweme());
                    if (updateAweme != null) {
                        long hotValue = hotVideoItem.getHotValue();
                        if (updateAweme.getHotSearchInfo() == null) {
                            hotSearchInfo = new HotSearchInfo();
                        } else {
                            hotSearchInfo = updateAweme.getHotSearchInfo();
                        }
                        hotSearchInfo.setVideoRank(i + 1);
                        hotSearchInfo.setVideoRankVV(hotValue);
                        updateAweme.setHotSearchInfo(hotSearchInfo);
                        updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(updateAweme);
                    }
                    hotVideoItem.setAweme(updateAweme);
                }
            }
            return C7492s.m23301b(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$i */
    static final class C26864i<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26864i f70879a = new C26864i();

        C26864i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88170a((List) obj);
        }

        /* renamed from: a */
        private static DiscoverItemData m88170a(List<HotVideoItem> list) {
            C7573i.m23587b(list, "it");
            DiscoverItemData discoverItemData = new DiscoverItemData(3);
            discoverItemData.setHotSearchVideos(list);
            return discoverItemData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$j */
    static final class C26865j<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26865j f70880a = new C26865j();

        C26865j() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88171a((RankingListCover) obj);
        }

        /* renamed from: a */
        private static DiscoverItemData m88171a(RankingListCover rankingListCover) {
            C7573i.m23587b(rankingListCover, "it");
            DiscoverItemData discoverItemData = new DiscoverItemData(2);
            discoverItemData.setRankingListCover(rankingListCover);
            return discoverItemData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$k */
    static final class C26866k<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C26866k f70881a = new C26866k();

        C26866k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m88172a((HotSearchListResponse) obj);
        }

        /* renamed from: a */
        private static List<HotSearchItem> m88172a(HotSearchListResponse hotSearchListResponse) {
            C7573i.m23587b(hotSearchListResponse, "it");
            HotSearchEntity data = hotSearchListResponse.getData();
            C7573i.m23582a((Object) data, "it.data");
            return data.getList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$l */
    public static final class C26867l implements C47557ad<List<? extends HotSearchItem>> {
        C26867l() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            m88173a((List) obj);
        }

        /* renamed from: a */
        private static void m88173a(List<HotSearchItem> list) {
            C7573i.m23587b(list, "t");
            C30354a.m99182a(list);
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            C30354a.m99182a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$m */
    static final class C26868m<T> implements C7328l<DiscoverItemData> {

        /* renamed from: a */
        public static final C26868m f70882a = new C26868m();

        C26868m() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
            return m88174a((DiscoverItemData) obj);
        }

        /* renamed from: a */
        private static boolean m88174a(DiscoverItemData discoverItemData) {
            C7573i.m23587b(discoverItemData, "it");
            if (discoverItemData.getType() != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$n */
    static final class C26869n<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C26855b f70883a;

        /* renamed from: b */
        final /* synthetic */ boolean f70884b;

        C26869n(C26855b bVar, boolean z) {
            this.f70883a = bVar;
            this.f70884b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DiscoverListData apply(List<DiscoverItemData> list) {
            C7573i.m23587b(list, "it");
            if (!this.f70884b || !list.isEmpty()) {
                DiscoverListData discoverListData = new DiscoverListData(list, this.f70883a.f70866b, this.f70883a.f70867c, false, 8, null);
                return discoverListData;
            }
            throw new Exception("api all went wrong");
        }
    }

    /* renamed from: c */
    private final C7492s<DiscoverItemData> m88160c() {
        C7492s<DiscoverItemData> d = this.f70868e.getRankingListCover().mo19317d((C7327h<? super T, ? extends R>) C26865j.f70880a);
        C7573i.m23582a((Object) d, "hotSearchApi.getRankingL…return@map item\n        }");
        return d;
    }

    /* renamed from: d */
    private final C7492s<DiscoverItemData> m88161d() {
        C7492s<DiscoverItemData> d = this.f70868e.getHotVideoList().mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) C26863h.f70878a).mo19317d((C7327h<? super T, ? extends R>) C26864i.f70879a);
        C7573i.m23582a((Object) d, "hotSearchApi.getHotVideo…return@map item\n        }");
        return d;
    }

    /* renamed from: a */
    private final C7492s<DiscoverItemData> m88155a() {
        C7492s<DiscoverItemData> d = this.f70868e.getHotSearchList(Integer.valueOf(0), C25293bu.m83101a(), Integer.valueOf(0), "", " ", "").mo19317d((C7327h<? super T, ? extends R>) C26861f.f70876a).mo19317d((C7327h<? super T, ? extends R>) C26862g.f70877a);
        C7573i.m23582a((Object) d, "hotSearchApi.getHotSearc…ap item\n                }");
        return d;
    }

    /* renamed from: b */
    private final void m88159b() {
        C7319aa.m22929a((C7496w<? extends T>) this.f70868e.getHotSearchList(Integer.valueOf(1), C25293bu.m83101a(), Integer.valueOf(0), "", " ", "").mo19317d((C7327h<? super T, ? extends R>) C26866k.f70881a).mo19304b(C7333a.m23044b())).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C26867l<Object>());
    }

    /* renamed from: a */
    private static int m88154a(Boolean bool) {
        if (C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<DiscoverListData> mo29350a(DiscoverRequestParam discoverRequestParam) {
        boolean z;
        C7492s sVar;
        C7573i.m23587b(discoverRequestParam, "param");
        List<C7492s> arrayList = new ArrayList<>();
        List arrayList2 = new ArrayList();
        if (discoverRequestParam.getCursor() == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f70866b = 0;
            this.f70867c = true;
            if (C6399b.m19944t()) {
                arrayList.add(C26852a.m88151a());
                arrayList.add(m88158b(0, 10));
            } else {
                arrayList.add(m88155a());
                arrayList.add(m88160c());
                arrayList.add(m88161d());
                arrayList.add(C26852a.m88151a());
                arrayList.add(m88158b(0, 10));
                m88159b();
            }
        } else {
            arrayList.add(m88158b(discoverRequestParam.getCursor(), 10));
        }
        for (C7492s sVar2 : arrayList) {
            if (z) {
                sVar = sVar2.mo19311c(new DiscoverItemData(0)).mo19304b(C7333a.m23044b());
                C7573i.m23582a((Object) sVar, "item.onErrorReturnItem(D…scribeOn(Schedulers.io())");
            } else {
                sVar = sVar2.mo19304b(C7333a.m23044b());
                C7573i.m23582a((Object) sVar, "item.subscribeOn(Schedulers.io())");
            }
            arrayList2.add(sVar);
        }
        C7492s<DiscoverListData> b = C7492s.m23286a((Iterable<? extends C7496w<? extends T>>) arrayList2).mo19291a((C7328l<? super T>) C26868m.f70882a).mo19334m().mo19134b((C7327h<? super T, ? extends R>) new C26869n<Object,Object>(this, z)).mo19136b().mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Observable.concatEager(r…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: b */
    private final C7492s<DiscoverItemData> m88158b(int i, int i2) {
        C7492s<DiscoverItemData> d = m88156a(i, 10).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C26857b<Object,Object>(this)).mo19317d((C7327h<? super T, ? extends R>) C26858c.f70870a).mo19317d((C7327h<? super T, ? extends R>) C26859d.f70871a);
        C7573i.m23582a((Object) d, "getCommonCategoryList(cu…ap item\n                }");
        return d;
    }

    /* renamed from: a */
    private final C7492s<CategoryList> m88156a(int i, int i2) {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = null;
        if (C6399b.m19946v()) {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl personalizationMode = inst.getPersonalizationMode();
            C7573i.m23582a((Object) personalizationMode, "SharePrefCache.inst().personalizationMode");
            objectRef.element = (Integer) personalizationMode.mo59877d();
        }
        if (C6399b.m19944t()) {
            C7492s<CategoryList> categoryV2List = this.f70865a.getCategoryV2List(i, i2, Integer.valueOf(m88154a(Boolean.valueOf(C26874a.m88186c()))), (Integer) objectRef.element);
            if (!C26874a.m88184a() || i != 0) {
                return categoryV2List;
            }
            C7492s<CategoryList> e = categoryV2List.mo19322e((C7327h<? super Throwable, ? extends C7496w<? extends T>>) new C26860e<Object,Object>(this, i, i2, objectRef));
            C7573i.m23582a((Object) e, "this.onErrorResumeNext {…                        }");
            return e;
        } else if (C26654b.m87574b()) {
            return this.f70865a.getFindFascinatingList(i, i2, (Integer) objectRef.element, C25293bu.m83101a());
        } else {
            return this.f70865a.getCategoryList(i, i2, (Integer) objectRef.element);
        }
    }
}
