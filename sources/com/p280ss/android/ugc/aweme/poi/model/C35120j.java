package com.p280ss.android.ugc.aweme.poi.model;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.feed.event.C28307ac;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.api.PoiNewsApi;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.j */
public final class C35120j extends C26098c<Aweme, PoiNewsFeedResponse> {

    /* renamed from: b */
    public static final C35121a f91872b = new C35121a(null);

    /* renamed from: com.ss.android.ugc.aweme.poi.model.j$a */
    public static final class C35121a {
        private C35121a() {
        }

        public /* synthetic */ C35121a(C7571f fVar) {
            this();
        }
    }

    public final List<Aweme> getItems() {
        if (this.mData != null) {
            return ((PoiNewsFeedResponse) this.mData).poiAwemeList;
        }
        return null;
    }

    public final boolean isHasMore() {
        if (((PoiNewsFeedResponse) this.mData).hasMore == 1) {
            return true;
        }
        return false;
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length >= 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(PoiNewsFeedResponse poiNewsFeedResponse) {
        List<Aweme> list;
        if (poiNewsFeedResponse != null) {
            C42961az.m136380a(new C28307ac(poiNewsFeedResponse.avatarList, poiNewsFeedResponse.pageViewCount));
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = poiNewsFeedResponse;
            } else if (i != 4) {
                this.mData = poiNewsFeedResponse;
            } else {
                PoiNewsFeedResponse poiNewsFeedResponse2 = (PoiNewsFeedResponse) this.mData;
                if (poiNewsFeedResponse2 != null) {
                    list = poiNewsFeedResponse2.poiAwemeList;
                } else {
                    list = null;
                }
                List<Aweme> list2 = list;
                if (list2 != null) {
                    m113329a(list2, poiNewsFeedResponse.poiAwemeList);
                    this.mData = PoiNewsFeedResponse.copy$default(poiNewsFeedResponse, 0, 0, 0, null, null, null, list2, 63, null);
                }
            }
        }
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        C7573i.m23587b(objArr, "params");
        if (this.mData == null) {
            i = 0;
        } else {
            i = ((PoiNewsFeedResponse) this.mData).cursor;
        }
        LocationBundle a = C32630h.m105696b(C6399b.m19921a()).mo83993a();
        if (a != null) {
            String str = objArr[1];
            if (str != null) {
                PoiNewsApi.m113168a(str, i, 20, String.valueOf(a.longitude), String.valueOf(a.latitude)).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        }
        String str2 = objArr[1];
        if (str2 != null) {
            PoiNewsApi.m113168a(str2, i, 20, "", "").mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public final void refreshList(Object... objArr) {
        int i;
        C7573i.m23587b(objArr, "params");
        if (this.mData == null) {
            i = 0;
        } else {
            i = ((PoiNewsFeedResponse) this.mData).cursor;
        }
        LocationBundle a = C32630h.m105696b(C6399b.m19921a()).mo83993a();
        if (a != null) {
            String str = objArr[1];
            if (str != null) {
                PoiNewsApi.m113168a(str, i, 20, String.valueOf(a.longitude), String.valueOf(a.latitude)).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        String str2 = objArr[1];
        if (str2 != null) {
            PoiNewsApi.m113168a(str2, i, 20, "", "").mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    /* renamed from: a */
    private static void m113329a(List<Aweme> list, List<? extends Aweme> list2) {
        Set linkedHashSet = new LinkedHashSet();
        for (Aweme aweme : list) {
            if (aweme.getAid() != null && !linkedHashSet.contains(aweme.getAid())) {
                String aid = aweme.getAid();
                C7573i.m23582a((Object) aid, "aweme.aid");
                linkedHashSet.add(aid);
            }
        }
        if (list2 != null) {
            for (Aweme aweme2 : list2) {
                if (aweme2.getAid() != null && !linkedHashSet.contains(aweme2.getAid())) {
                    String aid2 = aweme2.getAid();
                    C7573i.m23582a((Object) aid2, "aweme.aid");
                    linkedHashSet.add(aid2);
                    list.add(aweme2);
                }
            }
        }
    }
}
