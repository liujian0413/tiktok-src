package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter.C23435a;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailFragment;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverDetailFragment */
public class DiscoverDetailFragment extends DetailFragment {
    /* renamed from: k */
    private static Class<? extends CommonPageFragment> m88234k() {
        return DiscoverV4DetailPageFragment.class;
    }

    /* renamed from: a */
    public final C23435a mo67708a() {
        C23435a aVar = new C23435a();
        aVar.mo61040a(m88234k(), "page_feed", 0, 1.0f, getArguments()).mo61038a(ProfilePageFragment.m115142d(), "page_profile");
        return aVar;
    }

    /* renamed from: b */
    public static DetailFragment m88233b(FeedParam feedParam) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("feed_param", feedParam);
        DiscoverDetailFragment discoverDetailFragment = new DiscoverDetailFragment();
        discoverDetailFragment.setArguments(bundle);
        return discoverDetailFragment;
    }

    /* renamed from: b */
    public final void mo67716b(Aweme aweme) {
        super.mo67716b(aweme);
        C42961az.m136380a(new C28318an(21, new DiscoverPlaylistUpdateParam(this.f69030j.getIndex(), this.f69030j.getTabName(), this.f69030j.getCellId(), mo67722g())));
    }

    /* renamed from: a */
    public final void mo67715a(boolean z, int i) {
        if (!TextUtils.equals(this.f69030j.getFrom(), "from_discovery_v4")) {
            super.mo67715a(z, i);
        }
    }
}
