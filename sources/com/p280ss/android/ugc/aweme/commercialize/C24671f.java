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
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24735a;
import com.p280ss.android.ugc.aweme.commercialize.link.C24766a;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25064i;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25065j;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25066k;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25068a;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25147a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25255az;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25262ba;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25264bc;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.splash.C41737b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.f */
public final class C24671f {
    /* renamed from: b */
    public static C24715ai m80852b() {
        return m80872v().getCommerceDataService();
    }

    /* renamed from: c */
    public static C24713ag m80853c() {
        return m80872v().getAdOpenUtilsService();
    }

    /* renamed from: d */
    public static C25065j m80854d() {
        return m80872v().getAwesomeSplashShowUtilsService();
    }

    /* renamed from: e */
    public static C25255az m80855e() {
        return m80872v().getAdShowUtilsService();
    }

    /* renamed from: f */
    public static C24428c m80856f() {
        return m80872v().getAdOmSdkManagerService();
    }

    /* renamed from: g */
    public static C25064i m80857g() {
        return m80872v().getAwesomeSplashPreloadManager();
    }

    /* renamed from: h */
    public static C25068a m80858h() {
        return m80872v().getLiveAwesomeSplashManager();
    }

    /* renamed from: i */
    public static C25147a m80859i() {
        return m80872v().getSymphonyAdManager();
    }

    /* renamed from: j */
    public static C24766a m80860j() {
        return m80872v().getLinkTypeTagsPriorityManager();
    }

    /* renamed from: k */
    public static C25066k m80861k() {
        return m80872v().getSplashOptimizeLogHelper();
    }

    /* renamed from: l */
    public static C25264bc m80862l() {
        return m80872v().getVastUtilsService();
    }

    /* renamed from: m */
    public static C24543b m80863m() {
        return m80872v().getLinkDataApiService();
    }

    /* renamed from: n */
    public static C24735a m80864n() {
        return m80872v().getPreloadAdWebHelper();
    }

    /* renamed from: o */
    public static C22788ai m80865o() {
        return m80872v().getAdsUriJumperService();
    }

    /* renamed from: p */
    public static C41737b m80866p() {
        return m80872v().getSplashAdActivityService();
    }

    /* renamed from: q */
    public static C24714ah m80867q() {
        return m80872v().getAdShowFilterManager();
    }

    /* renamed from: r */
    public static C24712af m80868r() {
        return m80872v().getAdComponentMonitorLog();
    }

    /* renamed from: s */
    public static Boolean m80869s() {
        return m80872v().enableCommentEggRefactor();
    }

    /* renamed from: t */
    public static C25262ba m80870t() {
        return m80872v().getAwemeAdRankService();
    }

    /* renamed from: u */
    public static C24669k m80871u() {
        return m80872v().getEggMonitorLog();
    }

    /* renamed from: v */
    private static ILegacyCommercializeService m80872v() {
        return (ILegacyCommercializeService) ServiceManager.get().getService(ILegacyCommercializeService.class);
    }

    /* renamed from: a */
    public static C24718al m80851a() {
        return m80872v().getFeedRawAdLogService();
    }

    /* renamed from: a */
    public static C24642a m80850a(CommerceEggLayout commerceEggLayout) {
        return m80872v().getH5EggController(commerceEggLayout);
    }
}
