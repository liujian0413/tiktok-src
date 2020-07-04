package com.p280ss.android.ugc.aweme.commercialize;

import com.p280ss.android.ugc.aweme.app.C22788ai;
import com.p280ss.android.ugc.aweme.app.C22969e;
import com.p280ss.android.ugc.aweme.commerce.C24428c;
import com.p280ss.android.ugc.aweme.commerce.p1104a.C24411a;
import com.p280ss.android.ugc.aweme.commercialize.api.C24543b;
import com.p280ss.android.ugc.aweme.commercialize.api.C24545d;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24655d;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24665j;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24669k;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24642a;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24702a;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24710ad;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24712af;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24713ag;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24714ah;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24715ai;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24718al;
import com.p280ss.android.ugc.aweme.commercialize.feed.FeedTypeServiceImpl;
import com.p280ss.android.ugc.aweme.commercialize.feed.IFeedTypeService;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24735a;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24736b;
import com.p280ss.android.ugc.aweme.commercialize.link.C24766a;
import com.p280ss.android.ugc.aweme.commercialize.link.C24793j;
import com.p280ss.android.ugc.aweme.commercialize.log.C24952c;
import com.p280ss.android.ugc.aweme.commercialize.log.C24972q;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25062g;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25064i;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25065j;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25066k;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25083o;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25068a;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25074d;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25147a;
import com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25227ah;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25254ay;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25255az;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25262ba;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25264bc;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25328bz;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25353f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25378t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25385y;
import com.p280ss.android.ugc.aweme.services.CommerceDataServiceImpl;
import com.p280ss.android.ugc.aweme.splash.C41737b;
import com.p280ss.android.ugc.aweme.splash.C41745j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl */
public class LegacyCommercializeServiceImpl implements ILegacyCommercializeService {
    private C25254ay adDataUtilsService;
    private C24713ag adOpenUtilsService;
    private C25255az adShowUtilsService;
    private C22788ai adsUriJumperService;
    private C25065j awesomeSplashShowUtilsService;
    private C24715ai commerceDataService;
    private C24718al feedRawAdLogService;
    private IFeedTypeService feedTypeService;
    private C24543b linkDataApiService;
    private C24766a linkTypeTagsPriorityManager;
    private C41737b splashAdActivityService;
    private C25264bc vastUtilsService;

    public C24712af getAdComponentMonitorLog() {
        return C24952c.f65801b;
    }

    public C25262ba getAwemeAdRankService() {
        return C25227ah.f66553a;
    }

    public C24669k getEggMonitorLog() {
        return C24972q.f65846a;
    }

    public C24735a getPreloadAdWebHelper() {
        return C24736b.f65176b;
    }

    public C25066k getSplashOptimizeLogHelper() {
        return C25083o.f66206b;
    }

    public Boolean enableCommentEggRefactor() {
        return Boolean.valueOf(C24655d.f65017e);
    }

    public C24428c getAdOmSdkManagerService() {
        return C24411a.m80259a();
    }

    public C24714ah getAdShowFilterManager() {
        return C24702a.m81035a();
    }

    public C25064i getAwesomeSplashPreloadManager() {
        return C25054b.m82490a();
    }

    public C25068a getLiveAwesomeSplashManager() {
        return C25074d.m82584a();
    }

    public C25147a getSymphonyAdManager() {
        return SymphonyAdManager.m82664a();
    }

    public C25254ay getAdDataUtilsService() {
        if (this.adDataUtilsService == null) {
            this.adDataUtilsService = new C25353f();
        }
        return this.adDataUtilsService;
    }

    public C24713ag getAdOpenUtilsService() {
        if (this.adOpenUtilsService == null) {
            this.adOpenUtilsService = new C25378t();
        }
        return this.adOpenUtilsService;
    }

    public C25255az getAdShowUtilsService() {
        if (this.adShowUtilsService == null) {
            this.adShowUtilsService = new C25385y();
        }
        return this.adShowUtilsService;
    }

    public C22788ai getAdsUriJumperService() {
        if (this.adsUriJumperService == null) {
            this.adsUriJumperService = new C22969e();
        }
        return this.adsUriJumperService;
    }

    public C25065j getAwesomeSplashShowUtilsService() {
        if (this.awesomeSplashShowUtilsService == null) {
            this.awesomeSplashShowUtilsService = new C25062g();
        }
        return this.awesomeSplashShowUtilsService;
    }

    public C24715ai getCommerceDataService() {
        if (this.commerceDataService == null) {
            this.commerceDataService = new CommerceDataServiceImpl();
        }
        return this.commerceDataService;
    }

    public C24718al getFeedRawAdLogService() {
        if (this.feedRawAdLogService == null) {
            this.feedRawAdLogService = new C24710ad();
        }
        return this.feedRawAdLogService;
    }

    public IFeedTypeService getFeedTypeService() {
        if (this.feedTypeService == null) {
            this.feedTypeService = new FeedTypeServiceImpl();
        }
        return this.feedTypeService;
    }

    public C24543b getLinkDataApiService() {
        if (this.linkDataApiService == null) {
            this.linkDataApiService = new C24545d();
        }
        return this.linkDataApiService;
    }

    public C24766a getLinkTypeTagsPriorityManager() {
        if (this.linkTypeTagsPriorityManager == null) {
            this.linkTypeTagsPriorityManager = new C24793j();
        }
        return this.linkTypeTagsPriorityManager;
    }

    public C41737b getSplashAdActivityService() {
        if (this.splashAdActivityService == null) {
            this.splashAdActivityService = new C41745j();
        }
        return this.splashAdActivityService;
    }

    public C25264bc getVastUtilsService() {
        if (this.vastUtilsService == null) {
            this.vastUtilsService = new C25328bz();
        }
        return this.vastUtilsService;
    }

    public C24642a getH5EggController(CommerceEggLayout commerceEggLayout) {
        return new C24665j(commerceEggLayout);
    }
}
