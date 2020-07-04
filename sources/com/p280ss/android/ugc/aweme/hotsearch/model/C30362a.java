package com.p280ss.android.ugc.aweme.hotsearch.model;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.api.HotSearchListAPI;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.hotsearch.model.a */
public final class C30362a extends C25673a<Aweme, HotVideoListResponse> {

    /* renamed from: a */
    public int f79794a = 0;

    /* renamed from: b */
    private List<Aweme> f79795b = new ArrayList();

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Aweme> getItems() {
        return this.f79795b;
    }

    public final boolean isHasMore() {
        return false;
    }

    public final void loadMoreList(Object... objArr) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean deleteItem(Aweme aweme) {
        return C28482e.m93607a(getItems(), aweme, this.mNotifyListeners);
    }

    public final void refreshList(final Object... objArr) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public HotVideoListResponse call() throws Exception {
                if (objArr.length > 1) {
                    C30362a.this.f79794a = ((Integer) objArr[1]).intValue();
                }
                if (C30362a.this.f79794a == 1) {
                    return HotSearchListAPI.m87302b();
                }
                return HotSearchListAPI.m87301a();
            }
        }, 0);
    }

    /* renamed from: a */
    public final void mo79934a(List<Aweme> list) {
        if (list != null) {
            this.f79795b.addAll(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(HotVideoListResponse hotVideoListResponse) {
        HotSearchInfo hotSearchInfo;
        this.f79795b.clear();
        if (hotVideoListResponse != null) {
            List<HotVideoItem> list = hotVideoListResponse.mHotVideoItemList;
            if (!C6307b.m19566a((Collection<T>) list)) {
                for (int i = 0; i < list.size(); i++) {
                    HotVideoItem hotVideoItem = (HotVideoItem) list.get(i);
                    if (hotVideoItem != null) {
                        Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(hotVideoItem.getAweme());
                        if (updateAweme != null) {
                            if (this.f79794a == 0) {
                                if (updateAweme.getHotSearchInfo() == null) {
                                    hotSearchInfo = new HotSearchInfo();
                                } else {
                                    hotSearchInfo = updateAweme.getHotSearchInfo();
                                }
                                hotSearchInfo.setVideoRank(i + 1);
                                hotSearchInfo.setVideoRankVV(hotVideoItem.getHotValue());
                                updateAweme.setHotSearchInfo(hotSearchInfo);
                                updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(updateAweme);
                            }
                            this.f79795b.add(updateAweme);
                            hotVideoItem.setAweme(updateAweme);
                            list.set(i, hotVideoItem);
                        }
                    }
                }
                hotVideoListResponse.mHotVideoItemList = list;
            }
        }
        super.handleData(hotVideoListResponse);
    }
}
