package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.discover.model.SearchMix;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.C27083a.C27084a;
import com.p280ss.android.ugc.aweme.discover.presenter.C26826h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b */
public final class C27085b extends C26826h<Aweme, SearchMix> {

    /* renamed from: b */
    public boolean f71460b;

    /* renamed from: c */
    public final ArrayList<Aweme> f71461c;

    /* renamed from: h */
    public final C27083a f71462h;

    /* renamed from: i */
    private int f71463i;

    /* renamed from: j */
    private C27083a f71464j;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b$a */
    public static final class C27086a implements C27084a {

        /* renamed from: a */
        final /* synthetic */ C27085b f71465a;

        /* renamed from: a */
        public final void mo69874a() {
            this.f71465a.mIsLoading = false;
            if (this.f71465a.mNotifyListeners != null) {
                for (C25678f a : this.f71465a.mNotifyListeners) {
                    a.mo57296a(new Exception());
                }
            }
        }

        C27086a(C27085b bVar) {
            this.f71465a = bVar;
        }

        /* renamed from: a */
        public final void mo69875a(List<? extends Aweme> list, boolean z) {
            C7573i.m23587b(list, "data");
            this.f71465a.f71460b = z;
            List<Aweme> f = C7525m.m23512f((Iterable<? extends T>) list);
            this.f71465a.mo69876a(list);
            for (Aweme aweme : f) {
                if (!this.f71465a.f71461c.contains(aweme)) {
                    this.f71465a.f71461c.add(0, aweme);
                }
            }
            if (this.f71465a.mNotifyListeners != null) {
                for (C25678f b : this.f71465a.mNotifyListeners) {
                    b.mo56977b();
                }
            }
            this.f71465a.mIsLoading = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b$b */
    public static final class C27087b implements C27084a {

        /* renamed from: a */
        final /* synthetic */ C27085b f71466a;

        /* renamed from: a */
        public final void mo69874a() {
            this.f71466a.mIsLoading = false;
            if (this.f71466a.mNotifyListeners != null) {
                for (C25678f a : this.f71466a.mNotifyListeners) {
                    a.mo57296a(new Exception());
                }
            }
        }

        C27087b(C27085b bVar) {
            this.f71466a = bVar;
        }

        /* renamed from: a */
        public final void mo69875a(List<? extends Aweme> list, boolean z) {
            C7573i.m23587b(list, "data");
            this.f71466a.f71460b = z;
            this.f71466a.mo69876a(list);
            for (Aweme aweme : list) {
                if (!this.f71466a.f71461c.contains(aweme)) {
                    this.f71466a.f71461c.add(aweme);
                }
            }
            if (this.f71466a.mNotifyListeners != null) {
                for (C25678f b : this.f71466a.mNotifyListeners) {
                    b.mo56977b();
                }
            }
            this.f71466a.mIsLoading = false;
        }
    }

    public final int aF_() {
        return 3;
    }

    public final boolean isHasMore() {
        return this.f71460b;
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
    }

    /* renamed from: b */
    public final void mo69487b() {
        this.f71461c.clear();
    }

    public final List<Aweme> getItems() {
        return this.f71461c;
    }

    public C27085b(C27083a aVar) {
        C7573i.m23587b(aVar, "dataFetcher");
        this.f71462h = aVar;
        this.mIsLoading = false;
        this.f71463i = 0;
        this.f71464j = this.f71462h;
        this.f71461c = new ArrayList<>();
    }

    public final void loadLatestList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        this.f71464j.mo69873b(new C27086a(this));
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        this.f71464j.mo69872a(new C27087b(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r6 == null) goto L_0x0045;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69876a(java.util.List<? extends com.p280ss.android.ugc.aweme.feed.model.Aweme> r9) {
        /*
            r8 = this;
            int r0 = r9.size()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x00bf
            java.lang.Object r3 = r9.get(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r3
            java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = r8.f71461c
            if (r4 != 0) goto L_0x0014
            r4 = 0
            goto L_0x001a
        L_0x0014:
            java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = r8.f71461c
            int r4 = r4.size()
        L_0x001a:
            boolean r5 = r3 instanceof com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme
            if (r5 == 0) goto L_0x00bb
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme r5 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme) r5     // Catch:{ Exception -> 0x00bb }
            java.lang.String r5 = r5.getRequestIdFromRN()     // Catch:{ Exception -> 0x00bb }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x00bb }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00bb }
            if (r5 == 0) goto L_0x004a
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme r5 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme) r5     // Catch:{ Exception -> 0x00bb }
            java.lang.Object r6 = r8.getData()     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.discover.model.SearchMix r6 = (com.p280ss.android.ugc.aweme.discover.model.SearchMix) r6     // Catch:{ Exception -> 0x00bb }
            java.lang.String r7 = "data"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.feed.model.LogPbBean r6 = r6.logPb     // Catch:{ Exception -> 0x00bb }
            if (r6 == 0) goto L_0x0045
            java.lang.String r6 = r6.getImprId()     // Catch:{ Exception -> 0x00bb }
            if (r6 != 0) goto L_0x0047
        L_0x0045:
            java.lang.String r6 = ""
        L_0x0047:
            r5.setRequestIdFromRN(r6)     // Catch:{ Exception -> 0x00bb }
        L_0x004a:
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme r5 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme) r5     // Catch:{ Exception -> 0x00bb }
            java.lang.String r5 = r5.getRequestIdFromRN()     // Catch:{ Exception -> 0x00bb }
            r3.setRequestId(r5)     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Exception -> 0x00bb }
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r6 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r5 = r5.getService(r6)     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r5 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r5     // Catch:{ Exception -> 0x00bb }
            r5.updateAweme(r3)     // Catch:{ Exception -> 0x00bb }
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme r5 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme) r5     // Catch:{ Exception -> 0x00bb }
            java.lang.String r5 = r5.getRequestIdFromRN()     // Catch:{ Exception -> 0x00bb }
            r8.f70790f = r5     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Exception -> 0x00bb }
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService> r6 = com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService.class
            java.lang.Object r5 = r5.getService(r6)     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r5 = (com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r5     // Catch:{ Exception -> 0x00bb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb }
            r6.<init>()     // Catch:{ Exception -> 0x00bb }
            r7 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme r7 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme) r7     // Catch:{ Exception -> 0x00bb }
            java.lang.String r7 = r7.getAid()     // Catch:{ Exception -> 0x00bb }
            r6.append(r7)     // Catch:{ Exception -> 0x00bb }
            r7 = 9
            r6.append(r7)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00bb }
            r7 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme r7 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme) r7     // Catch:{ Exception -> 0x00bb }
            java.lang.String r7 = r7.getRequestIdFromRN()     // Catch:{ Exception -> 0x00bb }
            int r4 = r4 + r2
            r5.setRequestIdAndIndex(r6, r7, r4)     // Catch:{ Exception -> 0x00bb }
            int r4 = r8.aF_()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r5 = r8.f70790f     // Catch:{ Exception -> 0x00bb }
            if (r5 != 0) goto L_0x00a6
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x00bb }
        L_0x00a6:
            com.p280ss.android.ugc.aweme.discover.mob.SearchContext.m87923a(r4, r5)     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.feed.ae r4 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()     // Catch:{ Exception -> 0x00bb }
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme r5 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme) r5     // Catch:{ Exception -> 0x00bb }
            java.lang.String r5 = r5.getRequestIdFromRN()     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme r3 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.RNAweme) r3     // Catch:{ Exception -> 0x00bb }
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r3.logPbBean     // Catch:{ Exception -> 0x00bb }
            r4.mo71792a(r5, r3)     // Catch:{ Exception -> 0x00bb }
        L_0x00bb:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.C27085b.mo69876a(java.util.List):void");
    }

    /* renamed from: a */
    public final void mo69877a(List<? extends Aweme> list, boolean z) {
        C7573i.m23587b(list, "awemes");
        this.mIsLoading = false;
        this.f71461c.clear();
        mo69876a(list);
        this.f71461c.addAll(list);
        this.f71460b = z;
    }
}
