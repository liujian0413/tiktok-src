package com.p280ss.android.ugc.aweme.commercialize;

import com.p280ss.android.ugc.aweme.app.C22788ai;
import com.p280ss.android.ugc.aweme.commerce.C24428c;
import com.p280ss.android.ugc.aweme.commercialize.api.C24543b;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24669k;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24642a;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24712af;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24713ag;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24714ah;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24715ai;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24718al;
import com.p280ss.android.ugc.aweme.commercialize.feed.IFeedTypeService;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24735a;
import com.p280ss.android.ugc.aweme.commercialize.link.C24766a;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25064i;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25065j;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25066k;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25068a;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25147a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25254ay;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25255az;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25262ba;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25264bc;
import com.p280ss.android.ugc.aweme.splash.C41737b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService */
public interface ILegacyCommercializeService {
    Boolean enableCommentEggRefactor();

    C24712af getAdComponentMonitorLog();

    C25254ay getAdDataUtilsService();

    C24428c getAdOmSdkManagerService();

    C24713ag getAdOpenUtilsService();

    C24714ah getAdShowFilterManager();

    C25255az getAdShowUtilsService();

    C22788ai getAdsUriJumperService();

    C25262ba getAwemeAdRankService();

    C25064i getAwesomeSplashPreloadManager();

    C25065j getAwesomeSplashShowUtilsService();

    C24715ai getCommerceDataService();

    C24669k getEggMonitorLog();

    C24718al getFeedRawAdLogService();

    IFeedTypeService getFeedTypeService();

    C24642a getH5EggController(CommerceEggLayout commerceEggLayout);

    C24543b getLinkDataApiService();

    C24766a getLinkTypeTagsPriorityManager();

    C25068a getLiveAwesomeSplashManager();

    C24735a getPreloadAdWebHelper();

    C41737b getSplashAdActivityService();

    C25066k getSplashOptimizeLogHelper();

    C25147a getSymphonyAdManager();

    C25264bc getVastUtilsService();
}
