package com.p280ss.android.ugc.graph;

import android.content.Context;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.p280ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p280ss.android.ugc.aweme.comment.list.C24182h;
import com.p280ss.android.ugc.aweme.comment.services.C24219a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p280ss.android.ugc.aweme.conan.IConanService;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29092a;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29360a;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29361b;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29362c;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.main.p1385g.C33014a;
import com.p280ss.android.ugc.aweme.main.p1385g.C33015b;
import com.p280ss.android.ugc.aweme.main.p1385g.C33016c;
import com.p280ss.android.ugc.aweme.main.p1385g.C33017d;
import com.p280ss.android.ugc.aweme.main.p1385g.C33019f;
import com.p280ss.android.ugc.aweme.main.p1385g.C33020g;
import com.p280ss.android.ugc.aweme.main.p1385g.C33022h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33023i;
import com.p280ss.android.ugc.aweme.main.p1385g.C33024j;
import com.p280ss.android.ugc.aweme.main.p1385g.C33025k;
import com.p280ss.android.ugc.aweme.main.p1385g.C33026l;
import com.p280ss.android.ugc.aweme.main.p1385g.C33027m;
import com.p280ss.android.ugc.aweme.main.p1385g.C33028n;
import com.p280ss.android.ugc.aweme.main.p1385g.C33029o;
import com.p280ss.android.ugc.aweme.main.p1385g.C33030p;
import com.p280ss.android.ugc.aweme.main.p1385g.C33032r;
import com.p280ss.android.ugc.aweme.main.p1385g.C33033s;
import com.p280ss.android.ugc.aweme.main.p1385g.C33034t;
import com.p280ss.android.ugc.aweme.main.p1385g.C33035u;
import com.p280ss.android.ugc.aweme.main.p1385g.C33036v;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.p280ss.android.ugc.aweme.main.p1385g.C33039y;
import com.p280ss.android.ugc.aweme.notice.api.C34301b;
import com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.p280ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import com.p280ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.I18nLogHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeDuetWithMovieHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.NoticeABService;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34303b;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34304c;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34305d;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34319b;
import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;
import com.p280ss.android.ugc.aweme.p309di.DaggerAppComponent;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.pay.service.IPayService;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34973c;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareExtService;
import com.p280ss.android.ugc.aweme.share.ShareService;
import com.p280ss.android.ugc.aweme.story.api.C41970b;
import com.p280ss.android.ugc.aweme.story.api.C41971c;
import com.p280ss.android.ugc.aweme.story.api.C41972d;
import com.p280ss.android.ugc.aweme.story.api.C41973e;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import com.p280ss.android.ugc.graph.C7289f.C7292c;
import com.p280ss.android.ugc.pluginapi.C44966a;

/* renamed from: com.ss.android.ugc.graph.c */
final class C44836c extends C44834a {
    C44836c() {
        mo107273a(DaggerAppComponent.class, (C7292c) this);
    }

    /* renamed from: a */
    public final <T> T mo19025a(Object obj, Class<T> cls) {
        if (cls == Context.class) {
            return ((DaggerAppComponent) obj).context();
        }
        if (cls == C44966a.class) {
            return ((DaggerAppComponent) obj).providePlugin();
        }
        if (cls == IWalletMainProxy.class) {
            return ((DaggerAppComponent) obj).provideIWalletMainProxy();
        }
        if (cls == IIapWalletProxy.class) {
            return ((DaggerAppComponent) obj).provideIIapWalletProxy();
        }
        if (cls == IWalletService.class) {
            return ((DaggerAppComponent) obj).provideIWalletService();
        }
        if (cls == IPayService.class) {
            return ((DaggerAppComponent) obj).provideIPayService();
        }
        if (cls == IIMService.class) {
            return ((DaggerAppComponent) obj).provideIIMService();
        }
        if (cls == IDebugBoxService.class) {
            return ((DaggerAppComponent) obj).provideIDebugBoxService();
        }
        if (cls == IConanService.class) {
            return ((DaggerAppComponent) obj).provideIConanService();
        }
        if (cls == WSHelper.class) {
            return ((DaggerAppComponent) obj).provideWSHelper();
        }
        if (cls == LogHelper.class) {
            return ((DaggerAppComponent) obj).provideLogHelper();
        }
        if (cls == NoticeCaptchaHelper.class) {
            return ((DaggerAppComponent) obj).provideNoticeCaptchaHelper();
        }
        if (cls == NotificationClickHelper.class) {
            return ((DaggerAppComponent) obj).provideNotificationClickHelper();
        }
        if (cls == NoticeDuetWithMovieHelper.class) {
            return ((DaggerAppComponent) obj).provideNoticeDuetWithMovieHelper();
        }
        if (cls == SchemaPageHelper.class) {
            return ((DaggerAppComponent) obj).provideSchemaPageHelper();
        }
        if (cls == FollowFeedLogHelper.class) {
            return ((DaggerAppComponent) obj).provideFollowFeedLogHelper();
        }
        if (cls == NoticeCommentHelperService.class) {
            return ((DaggerAppComponent) obj).provideNoticeCommentHelperService();
        }
        if (cls == DeepLinkReturnHelperService.class) {
            return ((DaggerAppComponent) obj).provideDeepLinkReturnHelperService();
        }
        if (cls == I18nLogHelper.class) {
            return ((DaggerAppComponent) obj).provideI18nLogHelper();
        }
        if (cls == C34303b.class) {
            return ((DaggerAppComponent) obj).provideNoticeCountService();
        }
        if (cls == C34305d.class) {
            return ((DaggerAppComponent) obj).provideRedPointService();
        }
        if (cls == C34304c.class) {
            return ((DaggerAppComponent) obj).provideOldRedPointService();
        }
        if (cls == C34319b.class) {
            return ((DaggerAppComponent) obj).provideNoticeListService();
        }
        if (cls == NoticeLiveServiceAdapter.class) {
            return ((DaggerAppComponent) obj).provideNoticeLiveServiceAdapter();
        }
        if (cls == C34301b.class) {
            return ((DaggerAppComponent) obj).provideLivePushService();
        }
        if (cls == NoticeABService.class) {
            return ((DaggerAppComponent) obj).provideNoticeABService();
        }
        if (cls == NoticeChallengePropertyUtil.class) {
            return ((DaggerAppComponent) obj).provideNoticeChallengePropertyUtil();
        }
        if (cls == NoticeLiveWatcherUtil.class) {
            return ((DaggerAppComponent) obj).provideNoticeLiveWatcherUtil();
        }
        if (cls == IRequestIdService.class) {
            return ((DaggerAppComponent) obj).provideIRequestIdService();
        }
        if (cls == IAwemeService.class) {
            return ((DaggerAppComponent) obj).provideIAwemeService();
        }
        if (cls == ICommerceService.class) {
            return ((DaggerAppComponent) obj).provideICommerceService();
        }
        if (cls == C42846a.class) {
            return ((DaggerAppComponent) obj).provideIUserService();
        }
        if (cls == C29360a.class) {
            return ((DaggerAppComponent) obj).provideFlowFeedCommentService();
        }
        if (cls == C29361b.class) {
            return ((DaggerAppComponent) obj).provideFlowFeedCommonService();
        }
        if (cls == C29362c.class) {
            return ((DaggerAppComponent) obj).provideFlowFeedItemInteractService();
        }
        if (cls == IPoiService.class) {
            return ((DaggerAppComponent) obj).provideIPoiService();
        }
        if (cls == C24182h.class) {
            return ((DaggerAppComponent) obj).provideICommentPostingManager();
        }
        if (cls == C24219a.class) {
            return ((DaggerAppComponent) obj).provideCommentDependService();
        }
        if (cls == CommentService.class) {
            return ((DaggerAppComponent) obj).provideCommentService();
        }
        if (cls == IBulletService.class) {
            return ((DaggerAppComponent) obj).provideIBulletService();
        }
        if (cls == ShareDependService.class) {
            return ((DaggerAppComponent) obj).provideShareDependService();
        }
        if (cls == ShareService.class) {
            return ((DaggerAppComponent) obj).provideShareService();
        }
        if (cls == ShareExtService.class) {
            return ((DaggerAppComponent) obj).provideShareExtService();
        }
        if (cls == IBridgeService.class) {
            return ((DaggerAppComponent) obj).getBridgeService();
        }
        if (cls == IAVService.class) {
            return ((DaggerAppComponent) obj).getAVServiceImpl();
        }
        if (cls == C33033s.class) {
            return ((DaggerAppComponent) obj).getPushLaunchPageAssistantService();
        }
        if (cls == C33038x.class) {
            return ((DaggerAppComponent) obj).getWebviewService();
        }
        if (cls == C33027m.class) {
            return ((DaggerAppComponent) obj).getI18nService();
        }
        if (cls == C33029o.class) {
            return ((DaggerAppComponent) obj).getLanguageService();
        }
        if (cls == C33034t.class) {
            return ((DaggerAppComponent) obj).getRegionService();
        }
        if (cls == C34973c.class) {
            return ((DaggerAppComponent) obj).getPlayerService();
        }
        if (cls == C33035u.class) {
            return ((DaggerAppComponent) obj).getShotService();
        }
        if (cls == C41972d.class) {
            return ((DaggerAppComponent) obj).getSettingService();
        }
        if (cls == C41971c.class) {
            return ((DaggerAppComponent) obj).getReportService();
        }
        if (cls == C41973e.class) {
            return ((DaggerAppComponent) obj).getStoryDownloadService();
        }
        if (cls == C33016c.class) {
            return ((DaggerAppComponent) obj).getAntiSpamService();
        }
        if (cls == C33030p.class) {
            return ((DaggerAppComponent) obj).getLiveProxyService();
        }
        if (cls == C33023i.class) {
            return ((DaggerAppComponent) obj).getCurrentContextService();
        }
        if (cls == C33026l.class) {
            return ((DaggerAppComponent) obj).getFeed0VVManagerService();
        }
        if (cls == C33025k.class) {
            return ((DaggerAppComponent) obj).getDownloadService();
        }
        if (cls == C33019f.class) {
            return ((DaggerAppComponent) obj).getCaptchaService();
        }
        if (cls == C33014a.class) {
            return ((DaggerAppComponent) obj).getAccountHelperService();
        }
        if (cls == C33024j.class) {
            return ((DaggerAppComponent) obj).getDeleteAccountService();
        }
        if (cls == C33036v.class) {
            return ((DaggerAppComponent) obj).getInviteUseListService();
        }
        if (cls == C41970b.class) {
            return ((DaggerAppComponent) obj).getDuoshanService();
        }
        if (cls == C33028n.class) {
            return ((DaggerAppComponent) obj).getInteractStickerService();
        }
        if (cls == C33032r.class) {
            return ((DaggerAppComponent) obj).getPoiMainService();
        }
        if (cls == C33017d.class) {
            return ((DaggerAppComponent) obj).getApiNetworkServiceForAccount();
        }
        if (cls == C33015b.class) {
            return ((DaggerAppComponent) obj).getUserInfoUpadteAdapterService();
        }
        if (cls == C33039y.class) {
            return ((DaggerAppComponent) obj).getWebViewTweakerService();
        }
        if (cls == IUserService.class) {
            return ((DaggerAppComponent) obj).getBaseUserService();
        }
        if (cls == IAnyWhereDoor.class) {
            return ((DaggerAppComponent) obj).getAnyWhereDoorService();
        }
        if (cls == C29092a.class) {
            return ((DaggerAppComponent) obj).getRuntimeBehaviorService();
        }
        if (cls == C33022h.class) {
            return ((DaggerAppComponent) obj).getCommerceService();
        }
        if (cls == C33020g.class) {
            return ((DaggerAppComponent) obj).getChallengeService();
        }
        return null;
    }
}
