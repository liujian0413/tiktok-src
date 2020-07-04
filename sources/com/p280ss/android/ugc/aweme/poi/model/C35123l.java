package com.p280ss.android.ugc.aweme.poi.model;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.poi.api.PoiRankApi.PoiRankRetrofitApi;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35111a;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35115e;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35116f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.l */
public final class C35123l extends C26098c<C35116f, C35115e> implements C26112p {

    /* renamed from: b */
    private int f91877b;

    /* renamed from: c */
    private String f91878c = "";

    /* renamed from: d */
    private String f91879d = "";

    public final boolean isHasMore() {
        return false;
    }

    public final void loadMoreList(Object... objArr) {
    }

    public final void refreshList(Object... objArr) {
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return m113334a(getItems());
    }

    public final List<C35116f> getItems() {
        if (this.mData != null) {
            return ((C35115e) this.mData).f91853c;
        }
        return null;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 6) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<Aweme> m113334a(List<C35116f> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        for (C35116f fVar : list) {
            Aweme aweme = fVar.f91860c;
            aweme.setSimplePoiInfoStruct(fVar.f91859b.setIndex(i));
            arrayList.add(aweme);
            i++;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo89414a(C35111a aVar) {
        if (aVar != null) {
            if (this.mData == null) {
                this.mData = new C35115e();
            }
            ((C35115e) this.mData).f91856f = false;
            ((C35115e) this.mData).f91852b = aVar.f91839c;
            ((C35115e) this.mData).f91853c = aVar.f91840d;
        }
    }

    public final boolean sendRequest(Object... objArr) {
        LocationResult a = C32640a.m105721a().mo84021a();
        if (a != null) {
            this.f91879d = String.valueOf(a.getLongitude());
            this.f91878c = String.valueOf(a.getLatitude());
        }
        ((PoiRankRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiRankRetrofitApi.class)).getPoiRankFilter(10, (long) this.f91877b, this.f91879d, this.f91878c, objArr[0], objArr[1], objArr[2], objArr[3].intValue(), objArr[4], (String) objArr[5]).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
        return true;
    }
}
