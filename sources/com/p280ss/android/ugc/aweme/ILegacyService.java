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
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29974c;
import com.p280ss.android.ugc.aweme.login.C32652c;
import com.p280ss.android.ugc.aweme.main.C33053i;
import com.p280ss.android.ugc.aweme.main.C33058m;
import com.p280ss.android.ugc.aweme.main.C33059n;
import com.p280ss.android.ugc.aweme.main.C33060o;
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
import com.p280ss.android.ugc.aweme.splash.C41739d;
import com.p280ss.android.ugc.aweme.sticker.C41845b;
import com.p280ss.android.ugc.aweme.story.C41965a;

/* renamed from: com.ss.android.ugc.aweme.ILegacyService */
public interface ILegacyService {
    C7218y getAbTestManager();

    C21785x getActivityRouterService();

    C21786y getAdDownloadHolderService();

    C22789aj getAwemeApplicationService();

    C21099ac getBenchmarkService();

    C21645ae getBugReportService();

    C21646af getBuildConfigAllService();

    C23647d getCaptchaHelperService();

    C21647ag getChallengeDetailLegacyService();

    C35738c getChangeUsernameService();

    C37221c getColdLaunchRequestCombiner();

    C24216s getCommentEggDataManager();

    C21648ah getCommerceService();

    C21649ai getComplianceService();

    C25869c getCrossPlatformService();

    C32817c getDebugService();

    C26573b getDiscoverAllService();

    C34650a getDownloaderService();

    C22790ak getEventTypeHelper();

    C29447a getFollowStatisticsService();

    C33044c getFollowTabBubbleGuideHelper();

    C29895c getForwardStatisticsService();

    C21653am getFreeFlowMemberService();

    C29974c getFreeFlowStrategy();

    C21654an getGRAllService();

    C30544a getIMAdapterService();

    C6865al getInitService();

    C43581a getLocalService();

    C29028z getLocationPopupManager(Activity activity);

    C32652c getLoginUtilsService();

    C33053i getLongVideoService();

    C33576f getMLService();

    C33058m getMainPageExperimentService();

    C33059n getMainPageMobHelper();

    C33060o getMainPageService();

    C33538d getMixHelperService();

    C35741d getMultiAccountService();

    C34034a getNearbyAllService();

    C34671a getOpenSDKUtilsService();

    C21661au getPluginUtilsAllService();

    C35074c getPoiAllService();

    C35075d getPoiPublishService();

    C21662av getPreloadApiService();

    C26677b getRankHelperService();

    C37379b getSearchMonitor();

    C26801u getSearchResultStatistics();

    C41739d getSplashService();

    C41845b getStickerService();

    C41965a getStoryManager();

    C22594b getTimeLockRulerService();

    C21668ba getUgAllService();

    C37123a getXiGuaUtilsService();
}
