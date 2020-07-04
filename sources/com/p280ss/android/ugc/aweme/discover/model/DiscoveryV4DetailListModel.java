package com.p280ss.android.ugc.aweme.discover.model;

import bolts.C1591g;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi.DiscoverService;
import com.p280ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.net.C34089j;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel */
public final class DiscoveryV4DetailListModel extends C25673a<Aweme, DiscoveryV4CellDetailResponse> {
    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    public final List<Aweme> getItems() {
        DiscoveryV4CellDetailResponse discoveryV4CellDetailResponse = (DiscoveryV4CellDetailResponse) this.mData;
        if (discoveryV4CellDetailResponse != null) {
            return discoveryV4CellDetailResponse.awemeList;
        }
        return null;
    }

    public final boolean isHasMore() {
        DiscoveryV4CellDetailResponse discoveryV4CellDetailResponse = (DiscoveryV4CellDetailResponse) this.mData;
        if (discoveryV4CellDetailResponse != null) {
            return discoveryV4CellDetailResponse.hasMore;
        }
        return true;
    }

    public final void setData(DiscoveryV4CellDetailResponse discoveryV4CellDetailResponse) {
        C7573i.m23587b(discoveryV4CellDetailResponse, "data");
        this.mIsLoading = false;
        this.mData = discoveryV4CellDetailResponse;
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        String str = objArr[2];
        if (!(str instanceof String)) {
            str = null;
        }
        String str2 = str;
        String str3 = objArr[3];
        if (!(str3 instanceof String)) {
            str3 = null;
        }
        String str4 = str3;
        Integer num = objArr[4];
        if (!(num instanceof Integer)) {
            num = null;
        }
        loadList(str2, str4, num);
    }

    public final void setItems(List<Aweme> list) {
        String str;
        if (this.mData == null) {
            LogPbBean logPbBean = new LogPbBean();
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str = aweme.getRequestId();
                    logPbBean.setImprId(str);
                    this.mData = new DiscoveryV4CellDetailResponse(list, true, logPbBean);
                }
            }
            str = null;
            logPbBean.setImprId(str);
            this.mData = new DiscoveryV4CellDetailResponse(list, true, logPbBean);
        }
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        Integer num = objArr[1];
        if (num == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        } else if (num.intValue() == 2) {
            DiscoverV4PlayListDataCenter.Companion.getINSTANCE().needLoadData(DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST());
        } else {
            String str = objArr[2];
            if (!(str instanceof String)) {
                str = null;
            }
            String str2 = str;
            String str3 = objArr[3];
            if (!(str3 instanceof String)) {
                str3 = null;
            }
            String str4 = str3;
            Integer num2 = objArr[4];
            if (!(num2 instanceof Integer)) {
                num2 = null;
            }
            loadList(str2, str4, num2);
        }
    }

    private final void loadList(String str, String str2, Integer num) {
        int i;
        DiscoverService a = DiscoverApi.m87295a();
        int a2 = C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 8;
        }
        a.cellDetailV4(a2, str, str2, i).mo6875a((C1591g<TResult, TContinuationResult>) DiscoveryV4DetailListModel$loadList$1.INSTANCE).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
