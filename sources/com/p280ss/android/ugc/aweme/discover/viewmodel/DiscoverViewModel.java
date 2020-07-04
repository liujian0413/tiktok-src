package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26777b;
import com.p280ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverListData;
import com.p280ss.android.ugc.aweme.discover.repo.C26848a;
import com.p280ss.android.ugc.aweme.discover.repo.fetcher.DiscoverRequestParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel */
public final class DiscoverViewModel extends C0063u {

    /* renamed from: g */
    public static final C27230a f71729g = new C27230a(null);

    /* renamed from: a */
    public final C0052o<Boolean> f71730a = new C0052o<>();

    /* renamed from: b */
    public final C0052o<Boolean> f71731b = new C0052o<>();

    /* renamed from: c */
    public final C0052o<Boolean> f71732c = new C0052o<>();

    /* renamed from: d */
    public final C0052o<List<DiscoverItemData>> f71733d = new C0052o<>();

    /* renamed from: e */
    public final C0052o<C23073b<String, Object>> f71734e = new C0052o<>();

    /* renamed from: f */
    public int f71735f;

    /* renamed from: h */
    private C26848a f71736h = new C26848a();

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel$a */
    public static final class C27230a {
        private C27230a() {
        }

        public /* synthetic */ C27230a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel$b */
    public static final class C27231b implements C7498y<DiscoverListData> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f71737a;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C27231b(DiscoverViewModel discoverViewModel) {
            this.f71737a = discoverViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(DiscoverListData discoverListData) {
            C7573i.m23587b(discoverListData, "t");
            m89228b(discoverListData);
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f71737a.f71732c.setValue(Boolean.valueOf(false));
        }

        /* renamed from: b */
        private void m89228b(DiscoverListData discoverListData) {
            C7573i.m23587b(discoverListData, "t");
            List arrayList = new ArrayList();
            List list = (List) this.f71737a.f71733d.getValue();
            if (list != null) {
                C7573i.m23582a((Object) list, "it");
                arrayList.addAll(list);
            }
            arrayList.addAll(discoverListData.getItemList());
            DiscoverViewModel.m89223a(Integer.valueOf(discoverListData.getItemList().size()));
            this.f71737a.f71733d.setValue(arrayList);
            this.f71737a.f71732c.setValue(Boolean.valueOf(true));
            this.f71737a.f71730a.setValue(Boolean.valueOf(discoverListData.getHasMore()));
            this.f71737a.f71735f = discoverListData.getCursor();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel$c */
    static final class C27232c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f71738a;

        C27232c(DiscoverViewModel discoverViewModel) {
            this.f71738a = discoverViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DiscoverListData apply(DiscoverListData discoverListData) {
            C7573i.m23587b(discoverListData, "it");
            if (!discoverListData.isCache()) {
                ArrayList arrayList = new ArrayList();
                for (DiscoverItemData discoverItemData : discoverListData.getItemList()) {
                    if (discoverItemData.getType() == 5) {
                        CategoryOrAd categoryOrAd = discoverItemData.getCategoryOrAd();
                        if (categoryOrAd != null && categoryOrAd.isCategory()) {
                            arrayList.add(discoverItemData);
                        }
                    }
                }
                DiscoverViewModel.m89223a(Integer.valueOf(arrayList.size()));
            }
            return discoverListData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel$d */
    public static final class C27233d implements C7498y<DiscoverListData> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f71739a;

        /* renamed from: b */
        final /* synthetic */ long f71740b;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(DiscoverListData discoverListData) {
            C7573i.m23587b(discoverListData, "t");
            m89231b(discoverListData);
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f71739a.f71731b.setValue(Boolean.valueOf(false));
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m89231b(com.p280ss.android.ugc.aweme.discover.model.DiscoverListData r6) {
            /*
                r5 = this;
                java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r5.f71739a
                android.arch.lifecycle.o<java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverItemData>> r0 = r0.f71733d
                java.util.List r1 = r6.getItemList()
                r0.setValue(r1)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r5.f71739a
                android.arch.lifecycle.o<java.lang.Boolean> r0 = r0.f71731b
                r1 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                r0.setValue(r2)
                java.util.List r0 = r6.getItemList()
                java.util.Iterator r0 = r0.iterator()
            L_0x0022:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x007d
                java.lang.Object r2 = r0.next()
                com.ss.android.ugc.aweme.discover.model.DiscoverItemData r2 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData) r2
                int r3 = r2.getType()
                if (r3 != r1) goto L_0x0022
                com.ss.android.ugc.aweme.arch.b r0 = new com.ss.android.ugc.aweme.arch.b
                r0.<init>()
                com.ss.android.ugc.aweme.discover.model.HotSearchListResponse r1 = r2.getHotSearchResponse()
                java.lang.String r2 = "key_hot_search_list"
                r3 = 0
                if (r1 == 0) goto L_0x004d
                com.ss.android.ugc.aweme.discover.model.HotSearchEntity r4 = r1.getData()
                if (r4 == 0) goto L_0x004d
                java.util.List r4 = r4.getList()
                goto L_0x004e
            L_0x004d:
                r4 = r3
            L_0x004e:
                r0.mo60118a(r2, r4)
                java.lang.String r2 = "key_operated_search_list"
                if (r1 == 0) goto L_0x005a
                java.lang.String r4 = r1.getDefaultSearchKeyword()
                goto L_0x005b
            L_0x005a:
                r4 = r3
            L_0x005b:
                r0.mo60118a(r2, r4)
                java.lang.String r2 = "key_operated_real_search_word"
                if (r1 == 0) goto L_0x0067
                java.lang.String r4 = r1.getRealDefaultSearchKeyword()
                goto L_0x0068
            L_0x0067:
                r4 = r3
            L_0x0068:
                r0.mo60118a(r2, r4)
                java.lang.String r2 = "ad_search_list"
                if (r1 == 0) goto L_0x0073
                java.util.List r3 = r1.getAdSearchList()
            L_0x0073:
                r0.mo60118a(r2, r3)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r1 = r5.f71739a
                android.arch.lifecycle.o<com.ss.android.ugc.aweme.arch.b<java.lang.String, java.lang.Object>> r1 = r1.f71734e
                r1.setValue(r0)
            L_0x007d:
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r5.f71739a
                android.arch.lifecycle.o<java.lang.Boolean> r0 = r0.f71730a
                boolean r1 = r6.getHasMore()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.setValue(r1)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r5.f71739a
                int r6 = r6.getCursor()
                r0.f71735f = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel.C27233d.m89231b(com.ss.android.ugc.aweme.discover.model.DiscoverListData):void");
        }

        C27233d(DiscoverViewModel discoverViewModel, long j) {
            this.f71739a = discoverViewModel;
            this.f71740b = j;
        }
    }

    /* renamed from: a */
    private final void m89222a() {
        this.f71736h.mo69508a(new DiscoverRequestParam(this.f71735f), false).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C27231b<Object>(this));
    }

    /* renamed from: a */
    public final void mo69981a(boolean z) {
        mo69982a(z, false);
    }

    /* renamed from: a */
    public static void m89223a(Integer num) {
        if (C26654b.m87574b()) {
            new C26777b().mo68552a("discovery").mo68551a(num).mo85252e();
        }
    }

    /* renamed from: b */
    private final void m89224b(boolean z) {
        this.f71735f = -1;
        this.f71736h.mo69508a(new DiscoverRequestParam(this.f71735f), z).mo19317d((C7327h<? super T, ? extends R>) new C27232c<Object,Object>(this)).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C27233d<Object>(this, System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final void mo69982a(boolean z, boolean z2) {
        if (z) {
            m89224b(z2);
        } else {
            m89222a();
        }
    }
}
