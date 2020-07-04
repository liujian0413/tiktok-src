package com.p280ss.android.ugc.aweme.discover.p1185ui;

import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel$IHotSearchListListener$$CC;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel.IHotSearchListListener;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.y */
final /* synthetic */ class C27105y implements IHotSearchListListener {

    /* renamed from: a */
    private final HotSearchAndDiscoveryFragment2 f71483a;

    C27105y(HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2) {
        this.f71483a = hotSearchAndDiscoveryFragment2;
    }

    public final void onHotSearchWordsFlipper(List list, LogPbBean logPbBean, List list2) {
        SearchStateViewModel$IHotSearchListListener$$CC.onHotSearchWordsFlipper(this, list, logPbBean, list2);
    }

    public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
        this.f71483a.mo69589b(str, str2, logPbBean);
    }
}
