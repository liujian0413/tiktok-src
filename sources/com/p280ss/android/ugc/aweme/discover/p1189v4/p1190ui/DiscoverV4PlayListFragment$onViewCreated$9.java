package com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui;

import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4PlayListFragment$onViewCreated$9 */
public final class DiscoverV4PlayListFragment$onViewCreated$9 extends C1241a {

    /* renamed from: c */
    final /* synthetic */ DiscoverV4PlayListFragment f71653c;

    DiscoverV4PlayListFragment$onViewCreated$9(DiscoverV4PlayListFragment discoverV4PlayListFragment) {
        this.f71653c = discoverV4PlayListFragment;
    }

    /* renamed from: a */
    public final int mo5386a(int i) {
        if (TextUtils.equals(DiscoverV4PlayListFragment.m89086b(this.f71653c), DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST()) && i == 0) {
            return 2;
        }
        DiscoverV4PlayListResponse data = DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getData(DiscoverV4PlayListFragment.m89086b(this.f71653c));
        if (data != null) {
            List<DiscoverPlayListStructV4> list = data.cells;
            if (list != null && i == list.size()) {
                return 2;
            }
        }
        return 1;
    }
}
