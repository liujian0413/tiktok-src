package com.p280ss.android.ugc.aweme.poi.model;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.poi.C35086h;
import com.p280ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1475b.C35322a;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.k */
public final class C35122k extends C26098c<Aweme, C35106c> implements C26112p {

    /* renamed from: b */
    public String f91873b;

    /* renamed from: c */
    public String f91874c;

    /* renamed from: d */
    public String f91875d;

    /* renamed from: e */
    public String f91876e;

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "p0");
        return true;
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return getItems();
    }

    public final List<Aweme> getItems() {
        C35106c cVar = (C35106c) this.mData;
        if (cVar != null) {
            return cVar.f91790a;
        }
        return null;
    }

    public final boolean isHasMore() {
        C35106c cVar = (C35106c) this.mData;
        if (cVar == null || 1 != cVar.f91791b) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        C35086h hVar = objArr[1];
        if (hVar != null) {
            C35086h hVar2 = hVar;
            m113332b(hVar2.f91750a, hVar2.f91759j, hVar2.f91752c);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        C35086h hVar = objArr[1];
        if (hVar != null) {
            C35086h hVar2 = hVar;
            m113331a(hVar2.f91750a, hVar2.f91759j, hVar2.f91752c);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }

    public final void setItems(List<? extends Aweme> list) {
        if (this.mData == null) {
            this.mData = new C35106c();
        }
        ((C35106c) this.mData).f91790a = list;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147 A[LOOP:2: B:55:0x0145->B:56:0x0147, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.p280ss.android.ugc.aweme.poi.model.C35106c r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            r8.mIsNewDataEmpty = r2
            boolean r2 = r8.mIsNewDataEmpty
            r3 = 2
            if (r2 != 0) goto L_0x0159
            int r2 = r8.mListQueryType
            if (r2 != r3) goto L_0x0021
            boolean r2 = r8.isDataEmpty()
            if (r2 != 0) goto L_0x0021
            java.lang.Object r2 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r2 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.f91790a
            r2.clear()
        L_0x0021:
            if (r9 == 0) goto L_0x002c
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r9.f91790a
            if (r2 == 0) goto L_0x002c
            int r2 = r2.size()
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            r3 = 0
        L_0x002e:
            if (r3 >= r2) goto L_0x009c
            if (r9 != 0) goto L_0x0035
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0035:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = r9.f91790a
            java.lang.Object r4 = r4.get(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r4
            java.lang.String r5 = "page_poi_id"
            java.lang.String r6 = r8.f91873b
            r4.appendMobParam(r5, r6)
            java.lang.String r5 = "page_poi_city"
            java.lang.String r6 = r8.f91874c
            r4.appendMobParam(r5, r6)
            java.lang.String r5 = "page_poi_device_samecity"
            java.lang.String r6 = r8.f91875d
            r4.appendMobParam(r5, r6)
            java.lang.String r5 = "page_poi_backend_type"
            java.lang.String r6 = r8.f91876e
            r4.appendMobParam(r5, r6)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r6 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r5 = r5.getService(r6)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r5 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.updateAweme(r4)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService> r6 = com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService.class
            java.lang.Object r5 = r5.getService(r6)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r5 = (com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r4 != 0) goto L_0x007f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007f:
            java.lang.String r7 = r4.getAid()
            r6.append(r7)
            r7 = 10
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r9.f91793d
            r5.setRequestIdAndIndex(r6, r7, r3)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r9.f91790a
            r5.set(r3, r4)
            int r3 = r3 + 1
            goto L_0x002e
        L_0x009c:
            int r2 = r8.mListQueryType
            if (r2 == r1) goto L_0x00cd
            if (r9 != 0) goto L_0x00a5
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a5:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r9.f91790a
            java.util.Iterator r1 = r1.iterator()
        L_0x00ab:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00cd
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r2
            boolean r3 = r8.isDataEmpty()
            if (r3 != 0) goto L_0x00ab
            java.lang.Object r3 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r3 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r3
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r3.f91790a
            int r2 = r3.indexOf(r2)
            if (r2 < 0) goto L_0x00ab
            r1.remove()
            goto L_0x00ab
        L_0x00cd:
            int r1 = r8.mListQueryType
            switch(r1) {
                case 1: goto L_0x0115;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00d2;
                case 4: goto L_0x00d3;
                case 5: goto L_0x00d3;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            goto L_0x0117
        L_0x00d3:
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r1 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r1.f91790a
            if (r9 != 0) goto L_0x00de
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00de:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r9.f91790a
            java.lang.String r3 = "data!!.awemeList"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r1 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r1
            java.lang.Object r2 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r2 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r2
            int r2 = r2.f91791b
            int r3 = r9.f91791b
            r2 = r2 & r3
            r1.f91791b = r2
            goto L_0x0117
        L_0x00fa:
            java.util.List r1 = r8.getItems()
            if (r1 == 0) goto L_0x0117
            if (r9 != 0) goto L_0x0105
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0105:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r9.f91790a
            java.util.Collection r1 = (java.util.Collection) r1
            r2.addAll(r1)
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r1 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r9.f91790a
            r1.f91790a = r2
            goto L_0x0117
        L_0x0115:
            r8.mData = r9
        L_0x0117:
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r1 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r1
            int r1 = r1.f91792c
            long r1 = (long) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x013b
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r1 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r1
            java.lang.Object r2 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r2 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r2
            int r2 = r2.f91792c
            if (r9 != 0) goto L_0x0133
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0133:
            int r9 = r9.f91792c
            int r9 = java.lang.Math.max(r2, r9)
            r1.f91792c = r9
        L_0x013b:
            java.lang.Object r9 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r9 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r9
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r9 = r9.f91790a
            int r9 = r9.size()
        L_0x0145:
            if (r0 >= r9) goto L_0x016e
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r1 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r1.f91790a
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r1
            r1.setAwemePosition(r0)
            int r0 = r0 + 1
            goto L_0x0145
        L_0x0159:
            int r9 = r8.mListQueryType
            if (r9 != r1) goto L_0x0160
            r9 = 0
            r8.mData = r9
        L_0x0160:
            java.lang.Object r9 = r8.mData
            if (r9 == 0) goto L_0x016e
            int r9 = r8.mListQueryType
            if (r9 == r3) goto L_0x016e
            java.lang.Object r9 = r8.mData
            com.ss.android.ugc.aweme.poi.model.c r9 = (com.p280ss.android.ugc.aweme.poi.model.C35106c) r9
            r9.f91791b = r0
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.C35122k.handleData(com.ss.android.ugc.aweme.poi.model.c):void");
    }

    /* renamed from: a */
    private final void m113331a(String str, int i, String str2) {
        C1592h awemeList = C35118h.f91861h.getAwemeList(str, i, 20, 0, str2);
        C6309f fVar = this.mHandler;
        C7573i.m23582a((Object) fVar, "mHandler");
        awemeList.mo6876a((C1591g<TResult, TContinuationResult>) new C35322a<TResult,TContinuationResult>(fVar, TextExtraStruct.TYPE_CUSTOM), C1592h.f5958b);
    }

    /* renamed from: b */
    private final void m113332b(String str, int i, String str2) {
        long j;
        PoiFeedApi poiFeedApi = C35118h.f91861h;
        if (C6307b.m19566a((Collection<T>) getItems())) {
            j = 0;
        } else {
            j = (long) ((C35106c) this.mData).f91792c;
        }
        C1592h awemeList = poiFeedApi.getAwemeList(str, i, 20, j, str2);
        C6309f fVar = this.mHandler;
        C7573i.m23582a((Object) fVar, "mHandler");
        awemeList.mo6876a((C1591g<TResult, TContinuationResult>) new C35322a<TResult,TContinuationResult>(fVar, TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN), C1592h.f5958b);
    }
}
