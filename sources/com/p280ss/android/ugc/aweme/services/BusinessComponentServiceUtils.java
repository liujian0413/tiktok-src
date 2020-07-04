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
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.feedpage.C32516a;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.p1385g.C33031q;
import com.p280ss.android.ugc.aweme.p1708y.C43579c;
import com.p280ss.android.ugc.aweme.recommend.C37138f;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41692e;
import com.p280ss.android.ugc.aweme.story.live.C41987b;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils */
public class BusinessComponentServiceUtils {
    private static volatile IBusinessComponentService sBusinessComponentService;

    public static C22570g getAppStateReporter() {
        return getBusinessComponentService().getAppStateReporter();
    }

    public static C23550c getBusinessBridgeService() {
        return getBusinessComponentService().getBusinessBridgeService();
    }

    public static C26137an getDetailPageOperatorProvider() {
        return getBusinessComponentService().getDetailPageOperatorProvider();
    }

    public static C37138f getFeedRecommendUserManager() {
        return getBusinessComponentService().getFeedRecommendUserManager();
    }

    public static C43579c getLabService() {
        return getBusinessComponentService().getLabService();
    }

    public static C41987b getLiveAllService() {
        return getBusinessComponentService().getLiveAllService();
    }

    public static C32516a getLiveStateManager() {
        return getBusinessComponentService().getLiveStateManager();
    }

    public static C33031q getMainHelperService() {
        return getBusinessComponentService().getMainHelperService();
    }

    public static C27833a getMediumWebViewRefHolder() {
        return getBusinessComponentService().getMediumWebViewRefHolder();
    }

    public static C26608c getMixSearchRNWebViewRefHolder() {
        return getBusinessComponentService().getMixSearchRNWebViewRefHolder();
    }

    public static Class<? extends CommonPageFragment> getProfilePageClass() {
        return getBusinessComponentService().getProfilePageClass();
    }

    public static C26613d getSearchAllService() {
        return getBusinessComponentService().getSearchAllService();
    }

    private static IBusinessComponentService getBusinessComponentService() {
        if (sBusinessComponentService == null) {
            sBusinessComponentService = (IBusinessComponentService) ServiceManager.get().getService(IBusinessComponentService.class);
        }
        return sBusinessComponentService;
    }

    public static BaseMaskLayerOptionsAdapter getMaskLayerOptionsAdapter(Context context) {
        return getBusinessComponentService().getMaskLayerOptionsAdapter(context);
    }

    public static Dialog newOptionsDialog(Context context, Aweme aweme, String str) {
        return getBusinessComponentService().newOptionsDialog(context, aweme, str);
    }

    public static C33061p newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, SwitchFragmentPagerAdapter switchFragmentPagerAdapter) {
        return getBusinessComponentService().newScrollSwitchHelper(context, scrollableViewPager, switchFragmentPagerAdapter);
    }

    public static C41692e newUploadRecoverPopView(FragmentActivity fragmentActivity, C27311c cVar, boolean z) {
        return getBusinessComponentService().newUploadRecoverPopView(fragmentActivity, cVar, z);
    }
}
