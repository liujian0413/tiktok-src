package com.p280ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.antiaddic.C22565d;
import com.p280ss.android.ugc.aweme.antiaddic.C22570g;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.bridgeservice.C23546a;
import com.p280ss.android.ugc.aweme.bridgeservice.C23550c;
import com.p280ss.android.ugc.aweme.detail.operators.C26137an;
import com.p280ss.android.ugc.aweme.detail.operators.C26169t;
import com.p280ss.android.ugc.aweme.discover.C26608c;
import com.p280ss.android.ugc.aweme.discover.C26613d;
import com.p280ss.android.ugc.aweme.discover.C26636e;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27063a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.favorites.viewholder.C27833a;
import com.p280ss.android.ugc.aweme.favorites.viewholder.C27834b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.BaseMaskLayerOptionsAdapter;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.MaskLayerOptionsAdapter;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28970i;
import com.p280ss.android.ugc.aweme.live.feedpage.C32516a;
import com.p280ss.android.ugc.aweme.live.feedpage.C32518c;
import com.p280ss.android.ugc.aweme.main.C32898bc;
import com.p280ss.android.ugc.aweme.main.C32988dj;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.p1385g.C33031q;
import com.p280ss.android.ugc.aweme.p1708y.C43579c;
import com.p280ss.android.ugc.aweme.p1708y.C43580d;
import com.p280ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.p280ss.android.ugc.aweme.recommend.C37132d;
import com.p280ss.android.ugc.aweme.recommend.C37138f;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41692e;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41700j;
import com.p280ss.android.ugc.aweme.story.live.C41987b;
import com.p280ss.android.ugc.aweme.story.live.C41988c;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessComponentServiceImpl */
public class BusinessComponentServiceImpl implements IBusinessComponentService {
    private C23550c businessBridgeService;
    private C26137an detailPageOperatorProvider;
    private C43579c labService;
    private C41987b liveAllService;
    private C26613d searchAllService;

    public C37138f getFeedRecommendUserManager() {
        return C37132d.f97167a;
    }

    public C27833a getMediumWebViewRefHolder() {
        return C27834b.f73392a;
    }

    public C26608c getMixSearchRNWebViewRefHolder() {
        return C27063a.f71397a;
    }

    public C22570g getAppStateReporter() {
        return C22565d.m74591d();
    }

    public C32516a getLiveStateManager() {
        return C32518c.m105318a();
    }

    public C33031q getMainHelperService() {
        return new C32898bc();
    }

    public Class<? extends CommonPageFragment> getProfilePageClass() {
        return ProfilePageFragment.m115142d();
    }

    public C23550c getBusinessBridgeService() {
        if (this.businessBridgeService == null) {
            this.businessBridgeService = new C23546a();
        }
        return this.businessBridgeService;
    }

    public C26137an getDetailPageOperatorProvider() {
        if (this.detailPageOperatorProvider == null) {
            this.detailPageOperatorProvider = new C26169t();
        }
        return this.detailPageOperatorProvider;
    }

    public C43579c getLabService() {
        if (this.labService == null) {
            this.labService = new C43580d();
        }
        return this.labService;
    }

    public C41987b getLiveAllService() {
        if (this.liveAllService == null) {
            this.liveAllService = new C41988c();
        }
        return this.liveAllService;
    }

    public C26613d getSearchAllService() {
        if (this.searchAllService == null) {
            this.searchAllService = new C26636e();
        }
        return this.searchAllService;
    }

    public BaseMaskLayerOptionsAdapter getMaskLayerOptionsAdapter(Context context) {
        return new MaskLayerOptionsAdapter(context);
    }

    public Dialog newOptionsDialog(Context context, Aweme aweme, String str) {
        return new C28970i(context, aweme, str);
    }

    public C33061p newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, SwitchFragmentPagerAdapter switchFragmentPagerAdapter) {
        return new C32988dj(context, scrollableViewPager, switchFragmentPagerAdapter);
    }

    public C41692e newUploadRecoverPopView(FragmentActivity fragmentActivity, C27311c cVar, boolean z) {
        return new C41700j(fragmentActivity, cVar, z);
    }
}
