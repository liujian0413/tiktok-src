package com.p280ss.android.ugc.aweme;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22594b;
import com.p280ss.android.ugc.aweme.app.C22789aj;
import com.p280ss.android.ugc.aweme.app.C22790ak;
import com.p280ss.android.ugc.aweme.app.C6865al;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23647d;
import com.p280ss.android.ugc.aweme.comment.C24216s;
import com.p280ss.android.ugc.aweme.crossplatform.C25869c;
import com.p280ss.android.ugc.aweme.discover.C26573b;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26677b;
import com.p280ss.android.ugc.aweme.discover.mob.C26801u;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C29028z;
import com.p280ss.android.ugc.aweme.follow.p1260c.C29447a;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29895c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29974c;
import com.p280ss.android.ugc.aweme.main.C33053i;
import com.p280ss.android.ugc.aweme.main.C33058m;
import com.p280ss.android.ugc.aweme.main.guide.C33044c;
import com.p280ss.android.ugc.aweme.mix.C33538d;
import com.p280ss.android.ugc.aweme.nearby.C34034a;
import com.p280ss.android.ugc.aweme.opensdk.C34671a;
import com.p280ss.android.ugc.aweme.p1445o.C34650a;
import com.p280ss.android.ugc.aweme.p1500r.p1501a.C37123a;
import com.p280ss.android.ugc.aweme.p1711z.C43581a;
import com.p280ss.android.ugc.aweme.p313im.C30544a;
import com.p280ss.android.ugc.aweme.p331m.C32817c;
import com.p280ss.android.ugc.aweme.p332ml.C33576f;
import com.p280ss.android.ugc.aweme.poi.C35074c;
import com.p280ss.android.ugc.aweme.poi.C35075d;
import com.p280ss.android.ugc.aweme.profile.C35738c;
import com.p280ss.android.ugc.aweme.profile.C35741d;
import com.p280ss.android.ugc.aweme.requestcombine.C37221c;
import com.p280ss.android.ugc.aweme.search.C37379b;
import com.p280ss.android.ugc.aweme.setting.C7218y;
import com.p280ss.android.ugc.aweme.sticker.C41845b;
import com.p280ss.android.ugc.aweme.story.C41965a;

/* renamed from: com.ss.android.ugc.aweme.bc */
public final class C6903bc {

    /* renamed from: a */
    private static volatile ILegacyService f19577a;

    /* renamed from: A */
    public static C35741d m21460A() {
        return m21480U().getMultiAccountService();
    }

    /* renamed from: B */
    public static C21661au m21461B() {
        return m21480U().getPluginUtilsAllService();
    }

    /* renamed from: C */
    public static C34671a m21462C() {
        return m21480U().getOpenSDKUtilsService();
    }

    /* renamed from: D */
    public static C26801u m21463D() {
        return m21480U().getSearchResultStatistics();
    }

    /* renamed from: E */
    public static C25869c m21464E() {
        return m21480U().getCrossPlatformService();
    }

    /* renamed from: F */
    public static C6865al m21465F() {
        return m21480U().getInitService();
    }

    /* renamed from: G */
    public static C41965a m21466G() {
        return m21480U().getStoryManager();
    }

    /* renamed from: H */
    public static C26573b m21467H() {
        return m21480U().getDiscoverAllService();
    }

    /* renamed from: I */
    public static C33044c m21468I() {
        return m21480U().getFollowTabBubbleGuideHelper();
    }

    /* renamed from: J */
    public static C21653am m21469J() {
        return m21480U().getFreeFlowMemberService();
    }

    /* renamed from: K */
    public static C21648ah m21470K() {
        return m21480U().getCommerceService();
    }

    /* renamed from: L */
    public static C21645ae m21471L() {
        return m21480U().getBugReportService();
    }

    /* renamed from: M */
    public static C22790ak m21472M() {
        return m21480U().getEventTypeHelper();
    }

    /* renamed from: N */
    public static C35738c m21473N() {
        return m21480U().getChangeUsernameService();
    }

    /* renamed from: O */
    public static C32817c m21474O() {
        return m21480U().getDebugService();
    }

    /* renamed from: P */
    public static C43581a m21475P() {
        return m21480U().getLocalService();
    }

    /* renamed from: Q */
    public static C37379b m21476Q() {
        return m21480U().getSearchMonitor();
    }

    /* renamed from: R */
    public static C21099ac m21477R() {
        return m21480U().getBenchmarkService();
    }

    /* renamed from: S */
    public static C21649ai m21478S() {
        return m21480U().getComplianceService();
    }

    /* renamed from: T */
    public static C21647ag m21479T() {
        return m21480U().getChallengeDetailLegacyService();
    }

    /* renamed from: b */
    public static C23647d m21483b() {
        return m21480U().getCaptchaHelperService();
    }

    /* renamed from: c */
    public static C22594b m21484c() {
        return m21480U().getTimeLockRulerService();
    }

    /* renamed from: d */
    public static C29895c m21485d() {
        return m21480U().getForwardStatisticsService();
    }

    /* renamed from: e */
    public static C29447a m21486e() {
        return m21480U().getFollowStatisticsService();
    }

    /* renamed from: f */
    public static C33053i m21487f() {
        return m21480U().getLongVideoService();
    }

    /* renamed from: g */
    public static C30544a m21488g() {
        return m21480U().getIMAdapterService();
    }

    /* renamed from: h */
    public static C33538d m21489h() {
        return m21480U().getMixHelperService();
    }

    /* renamed from: i */
    public static C33576f m21490i() {
        return m21480U().getMLService();
    }

    /* renamed from: j */
    public static C34650a m21491j() {
        return m21480U().getDownloaderService();
    }

    /* renamed from: k */
    public static C22789aj m21492k() {
        return m21480U().getAwemeApplicationService();
    }

    /* renamed from: l */
    public static C21662av m21493l() {
        return m21480U().getPreloadApiService();
    }

    /* renamed from: m */
    public static C7218y m21494m() {
        return m21480U().getAbTestManager();
    }

    /* renamed from: n */
    public static C24216s m21495n() {
        return m21480U().getCommentEggDataManager();
    }

    /* renamed from: o */
    public static C35074c m21496o() {
        return m21480U().getPoiAllService();
    }

    /* renamed from: p */
    public static C34034a m21497p() {
        return m21480U().getNearbyAllService();
    }

    /* renamed from: q */
    public static C37123a m21498q() {
        return m21480U().getXiGuaUtilsService();
    }

    /* renamed from: r */
    public static C35075d m21499r() {
        return m21480U().getPoiPublishService();
    }

    /* renamed from: s */
    public static C41845b m21500s() {
        return m21480U().getStickerService();
    }

    /* renamed from: t */
    public static C26677b m21501t() {
        return m21480U().getRankHelperService();
    }

    /* renamed from: u */
    public static C37221c m21502u() {
        return m21480U().getColdLaunchRequestCombiner();
    }

    /* renamed from: v */
    public static C21785x m21503v() {
        return m21480U().getActivityRouterService();
    }

    /* renamed from: w */
    public static C29974c m21504w() {
        return m21480U().getFreeFlowStrategy();
    }

    /* renamed from: x */
    public static C21668ba m21505x() {
        return m21480U().getUgAllService();
    }

    /* renamed from: y */
    public static C21654an m21506y() {
        return m21480U().getGRAllService();
    }

    /* renamed from: z */
    public static C21646af m21507z() {
        return m21480U().getBuildConfigAllService();
    }

    /* renamed from: U */
    private static ILegacyService m21480U() {
        if (f19577a == null) {
            f19577a = (ILegacyService) ServiceManager.get().getService(ILegacyService.class);
        }
        return f19577a;
    }

    /* renamed from: a */
    public static C33058m m21482a() {
        return m21480U().getMainPageExperimentService();
    }

    /* renamed from: a */
    public static C29028z m21481a(Activity activity) {
        return m21480U().getLocationPopupManager(activity);
    }
}
