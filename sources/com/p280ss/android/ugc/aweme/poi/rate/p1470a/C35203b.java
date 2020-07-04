package com.p280ss.android.ugc.aweme.poi.rate.p1470a;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.rate.api.C35208a;
import com.p280ss.android.ugc.aweme.poi.rate.api.C35211c;
import com.p280ss.android.ugc.aweme.poi.rate.api.PoiSpuRateAwemeApi.C35207a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.a.b */
public final class C35203b extends C25673a<Aweme, C35208a> {

    /* renamed from: a */
    public long f92176a;

    /* renamed from: b */
    public int f92177b = 1;

    /* renamed from: c */
    public final String f92178c;

    /* renamed from: d */
    public final int f92179d;

    /* renamed from: e */
    public final String f92180e;

    /* renamed from: f */
    private final List<C35211c> f92181f = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.poi.rate.a.b$a */
    static final class C35204a<T> implements C7326g<C35208a> {

        /* renamed from: a */
        final /* synthetic */ C35203b f92182a;

        C35204a(C35203b bVar) {
            this.f92182a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(final C35208a aVar) {
            this.f92182a.f92176a = aVar.f92190c;
            this.f92182a.f92177b = aVar.f92193f;
            this.f92182a.mHandler.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C35204a f92183a;

                {
                    this.f92183a = r1;
                }

                public final void run() {
                    this.f92183a.f92182a.mIsLoading = false;
                    this.f92183a.f92182a.handleData(aVar);
                    List<C25678f> list = this.f92183a.f92182a.mNotifyListeners;
                    if (list != null) {
                        for (C25678f fVar : list) {
                            if (fVar != null) {
                                fVar.mo56977b();
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.rate.a.b$b */
    static final class C35206b<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C35203b f92185a;

        C35206b(C35203b bVar) {
            this.f92185a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            Throwable th2;
            this.f92185a.mIsLoading = false;
            List<C25678f> list = this.f92185a.mNotifyListeners;
            if (list != null) {
                for (C25678f fVar : list) {
                    if (fVar != null) {
                        if (!(th instanceof Exception)) {
                            th2 = null;
                        } else {
                            th2 = th;
                        }
                        fVar.mo57296a((Exception) th2);
                    }
                }
            }
        }
    }

    public final boolean isHasMore() {
        if (this.mData == null || ((C35208a) this.mData).f92191d != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m113588a() {
        C35207a.m113592a().requestPoiSpuRateAweme(this.f92178c, this.f92176a, this.f92179d, this.f92180e, this.f92177b).mo19280a((C7326g<? super T>) new C35204a<Object>(this), (C7326g<? super Throwable>) new C35206b<Object>(this));
    }

    public final List<Aweme> getItems() {
        List<Aweme> arrayList = new ArrayList<>();
        for (C35211c cVar : this.f92181f) {
            Aweme aweme = cVar.f92202e;
            if (aweme != null) {
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme.clone());
                aweme.setRateScore(cVar.f92199b);
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m113588a();
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        this.f92176a = 0;
        m113588a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.p280ss.android.ugc.aweme.poi.rate.api.C35208a r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0011
            java.util.List<com.ss.android.ugc.aweme.poi.rate.api.c> r2 = r4.f92188a
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            r3.mIsNewDataEmpty = r2
            boolean r2 = r3.mIsNewDataEmpty
            if (r2 != 0) goto L_0x0036
            int r0 = r3.mListQueryType
            if (r0 != r1) goto L_0x0021
            java.util.List<com.ss.android.ugc.aweme.poi.rate.api.c> r0 = r3.f92181f
            r0.clear()
        L_0x0021:
            java.util.List<com.ss.android.ugc.aweme.poi.rate.api.c> r0 = r3.f92181f
            if (r4 == 0) goto L_0x002a
            java.util.List<com.ss.android.ugc.aweme.poi.rate.api.c> r1 = r4.f92188a
            if (r1 == 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            java.util.List r1 = kotlin.collections.C7525m.m23461a()
        L_0x002e:
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r3.mData = r4
            return
        L_0x0036:
            java.lang.Object r4 = r3.mData
            if (r4 == 0) goto L_0x0040
            java.lang.Object r4 = r3.mData
            com.ss.android.ugc.aweme.poi.rate.api.a r4 = (com.p280ss.android.ugc.aweme.poi.rate.api.C35208a) r4
            r4.f92191d = r0
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.rate.p1470a.C35203b.handleData(com.ss.android.ugc.aweme.poi.rate.api.a):void");
    }

    public C35203b(String str, int i, String str2) {
        C7573i.m23587b(str, "spuId");
        C7573i.m23587b(str2, "poiId");
        this.f92178c = str;
        this.f92179d = i;
        this.f92180e = str2;
        C35208a aVar = new C35208a(null, null, 0, 1, 0, 0, 55, null);
        this.mData = aVar;
    }
}
