package com.p280ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.antiaddic.C22570g;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.bridgeservice.C23550c;
import com.p280ss.android.ugc.aweme.detail.operators.C26137an;
import com.p280ss.android.ugc.aweme.discover.C26608c;
import com.p280ss.android.ugc.aweme.discover.C26613d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.favorites.viewholder.C27833a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.BaseMaskLayerOptionsAdapter;
import com.p280ss.android.ugc.aweme.live.feedpage.C32516a;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.p1385g.C33031q;
import com.p280ss.android.ugc.aweme.p1708y.C43579c;
import com.p280ss.android.ugc.aweme.recommend.C37138f;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41692e;
import com.p280ss.android.ugc.aweme.story.live.C41987b;

/* renamed from: com.ss.android.ugc.aweme.services.IBusinessComponentService */
public interface IBusinessComponentService {
    C22570g getAppStateReporter();

    C23550c getBusinessBridgeService();

    C26137an getDetailPageOperatorProvider();

    C37138f getFeedRecommendUserManager();

    C43579c getLabService();

    C41987b getLiveAllService();

    C32516a getLiveStateManager();

    C33031q getMainHelperService();

    BaseMaskLayerOptionsAdapter getMaskLayerOptionsAdapter(Context context);

    C27833a getMediumWebViewRefHolder();

    C26608c getMixSearchRNWebViewRefHolder();

    Class<? extends CommonPageFragment> getProfilePageClass();

    C26613d getSearchAllService();

    Dialog newOptionsDialog(Context context, Aweme aweme, String str);

    C33061p newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, SwitchFragmentPagerAdapter switchFragmentPagerAdapter);

    C41692e newUploadRecoverPopView(FragmentActivity fragmentActivity, C27311c cVar, boolean z);
}
