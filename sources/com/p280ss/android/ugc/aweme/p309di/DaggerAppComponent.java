package com.p280ss.android.ugc.aweme.p309di;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.google.common.collect.ImmutableMap;
import com.p280ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.host.C22994a;
import com.p280ss.android.ugc.aweme.app.host.HostApplication;
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
import com.p280ss.android.ugc.aweme.main.MainActivity;
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
import com.p280ss.android.ugc.aweme.p309di.AppComponent.C6910a;
import com.p280ss.android.ugc.aweme.p309di.C26240a.C26241a;
import com.p280ss.android.ugc.aweme.p309di.C26240a.C26241a.C26242a;
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
import com.p280ss.android.ugc.dagger.android.compat.C7288a;
import com.p280ss.android.ugc.pluginapi.C44966a;
import com.p280ss.android.ugc.pluginimpl.p1756a.C44969b;
import dagger.android.C47377c;
import dagger.android.C7313b.C7315b;
import dagger.android.DispatchingAndroidInjector;
import dagger.p1859a.C47372c;
import dagger.p1859a.C47375f;
import java.util.Map;
import javax.p1876a.C47883a;

/* renamed from: com.ss.android.ugc.aweme.di.DaggerAppComponent */
public final class DaggerAppComponent implements AppComponent {

    /* renamed from: A */
    private C47883a<NoticeABService> f69160A;

    /* renamed from: B */
    private C47883a<NoticeChallengePropertyUtil> f69161B;

    /* renamed from: C */
    private C47883a<NoticeLiveWatcherUtil> f69162C;

    /* renamed from: D */
    private C47883a<IRequestIdService> f69163D;

    /* renamed from: E */
    private C47883a<IAwemeService> f69164E;

    /* renamed from: F */
    private C47883a<ICommerceService> f69165F;

    /* renamed from: G */
    private C47883a<C42846a> f69166G;

    /* renamed from: H */
    private C47883a<C29360a> f69167H;

    /* renamed from: I */
    private C47883a<C29361b> f69168I;

    /* renamed from: J */
    private C47883a<C29362c> f69169J;

    /* renamed from: K */
    private C47883a<IPoiService> f69170K;

    /* renamed from: L */
    private C47883a<C24182h> f69171L;

    /* renamed from: M */
    private C47883a<C24219a> f69172M;

    /* renamed from: N */
    private C47883a<CommentService> f69173N;

    /* renamed from: O */
    private C47883a<IBulletService> f69174O;

    /* renamed from: P */
    private C47883a<ShareDependService> f69175P;

    /* renamed from: Q */
    private C47883a<ShareService> f69176Q;

    /* renamed from: R */
    private C47883a<ShareExtService> f69177R;

    /* renamed from: S */
    private C47883a<IBridgeService> f69178S;

    /* renamed from: T */
    private C47883a<IAVService> f69179T;

    /* renamed from: U */
    private C47883a<C33033s> f69180U;

    /* renamed from: V */
    private C47883a<C33038x> f69181V;

    /* renamed from: W */
    private C47883a<C33027m> f69182W;

    /* renamed from: X */
    private C47883a<C33029o> f69183X;

    /* renamed from: Y */
    private C47883a<C33034t> f69184Y;

    /* renamed from: Z */
    private C47883a<C34973c> f69185Z;

    /* renamed from: a */
    private C26252aj f69186a;

    /* renamed from: aa */
    private C47883a<C33035u> f69187aa;

    /* renamed from: ab */
    private C47883a<C41972d> f69188ab;

    /* renamed from: ac */
    private C47883a<C41971c> f69189ac;

    /* renamed from: ad */
    private C47883a<C41973e> f69190ad;

    /* renamed from: ae */
    private C47883a<C33016c> f69191ae;

    /* renamed from: af */
    private C47883a<C33030p> f69192af;

    /* renamed from: ag */
    private C47883a<C33023i> f69193ag;

    /* renamed from: ah */
    private C47883a<C33026l> f69194ah;

    /* renamed from: ai */
    private C47883a<C33025k> f69195ai;

    /* renamed from: aj */
    private C47883a<C33019f> f69196aj;

    /* renamed from: ak */
    private C47883a<C33014a> f69197ak;

    /* renamed from: al */
    private C47883a<C33024j> f69198al;

    /* renamed from: am */
    private C47883a<C33036v> f69199am;

    /* renamed from: an */
    private C47883a<C41970b> f69200an;

    /* renamed from: ao */
    private C47883a<C33028n> f69201ao;

    /* renamed from: ap */
    private C47883a<C33032r> f69202ap;

    /* renamed from: aq */
    private C47883a<C33017d> f69203aq;

    /* renamed from: ar */
    private C47883a<C33015b> f69204ar;

    /* renamed from: as */
    private C47883a<C33039y> f69205as;

    /* renamed from: at */
    private C47883a<IUserService> f69206at;

    /* renamed from: au */
    private C47883a<IAnyWhereDoor> f69207au;

    /* renamed from: av */
    private C47883a<C29092a> f69208av;

    /* renamed from: aw */
    private C47883a<C33022h> f69209aw;

    /* renamed from: ax */
    private C47883a<C33020g> f69210ax;

    /* renamed from: ay */
    private C47883a<C26242a> f69211ay;

    /* renamed from: az */
    private C26256an f69212az;

    /* renamed from: b */
    private C47883a<C44966a> f69213b;

    /* renamed from: c */
    private C47883a<IWalletMainProxy> f69214c;

    /* renamed from: d */
    private C47883a<IIapWalletProxy> f69215d;

    /* renamed from: e */
    private C47883a<IWalletService> f69216e;

    /* renamed from: f */
    private C47883a<IPayService> f69217f;

    /* renamed from: g */
    private C26254al f69218g;

    /* renamed from: h */
    private C47883a<IIMService> f69219h;

    /* renamed from: i */
    private C47883a<IDebugBoxService> f69220i;

    /* renamed from: j */
    private C47883a<IConanService> f69221j;

    /* renamed from: k */
    private C47883a<WSHelper> f69222k;

    /* renamed from: l */
    private C47883a<LogHelper> f69223l;

    /* renamed from: m */
    private C47883a<NoticeCaptchaHelper> f69224m;

    /* renamed from: n */
    private C47883a<NotificationClickHelper> f69225n;

    /* renamed from: o */
    private C47883a<NoticeDuetWithMovieHelper> f69226o;

    /* renamed from: p */
    private C47883a<SchemaPageHelper> f69227p;

    /* renamed from: q */
    private C47883a<FollowFeedLogHelper> f69228q;

    /* renamed from: r */
    private C47883a<NoticeCommentHelperService> f69229r;

    /* renamed from: s */
    private C47883a<DeepLinkReturnHelperService> f69230s;

    /* renamed from: t */
    private C47883a<I18nLogHelper> f69231t;

    /* renamed from: u */
    private C47883a<C34303b> f69232u;

    /* renamed from: v */
    private C47883a<C34305d> f69233v;

    /* renamed from: w */
    private C47883a<C34304c> f69234w;

    /* renamed from: x */
    private C47883a<C34319b> f69235x;

    /* renamed from: y */
    private C47883a<NoticeLiveServiceAdapter> f69236y;

    /* renamed from: z */
    private C47883a<C34301b> f69237z;

    /* renamed from: com.ss.android.ugc.aweme.di.DaggerAppComponent$a */
    static final class C26237a implements C6910a {

        /* renamed from: a */
        public C26252aj f69239a;

        /* renamed from: b */
        private Application f69240b;

        private C26237a() {
        }

        /* renamed from: a */
        public final AppComponent mo16971a() {
            if (this.f69239a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C26252aj.class.getCanonicalName());
                sb.append(" must be set");
                throw new IllegalStateException(sb.toString());
            } else if (this.f69240b != null) {
                return new DaggerAppComponent(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Application.class.getCanonicalName());
                sb2.append(" must be set");
                throw new IllegalStateException(sb2.toString());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C26237a mo16969a(Application application) {
            this.f69240b = (Application) C47375f.m147939a(application);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C26237a mo16970a(C26252aj ajVar) {
            this.f69239a = (C26252aj) C47375f.m147939a(ajVar);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.di.DaggerAppComponent$b */
    final class C26238b extends C26242a {

        /* renamed from: b */
        private MainActivity f69242b;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C26241a mo19117a() {
            if (this.f69242b != null) {
                return new C26239c(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(MainActivity.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        private C26238b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo19119b(MainActivity mainActivity) {
            this.f69242b = (MainActivity) C47375f.m147939a(mainActivity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.di.DaggerAppComponent$c */
    final class C26239c implements C26241a {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo19116a(Object obj) {
        }

        private C26239c(C26238b bVar) {
        }
    }

    public static C6910a builder() {
        return new C26237a();
    }

    public final Context context() {
        return C26255am.m86300a(this.f69186a);
    }

    /* renamed from: b */
    private Map<String, C47883a<C7315b<? extends Activity>>> m86243b() {
        return ImmutableMap.m58577of("dummy", this.f69212az);
    }

    /* renamed from: d */
    private C7288a m86245d() {
        return new C7288a(m86243b());
    }

    public final IAVService getAVServiceImpl() {
        return (IAVService) this.f69179T.get();
    }

    public final C33014a getAccountHelperService() {
        return (C33014a) this.f69197ak.get();
    }

    public final C33016c getAntiSpamService() {
        return (C33016c) this.f69191ae.get();
    }

    public final IAnyWhereDoor getAnyWhereDoorService() {
        return (IAnyWhereDoor) this.f69207au.get();
    }

    public final C33017d getApiNetworkServiceForAccount() {
        return (C33017d) this.f69203aq.get();
    }

    public final IUserService getBaseUserService() {
        return (IUserService) this.f69206at.get();
    }

    public final IBridgeService getBridgeService() {
        return (IBridgeService) this.f69178S.get();
    }

    public final C33019f getCaptchaService() {
        return (C33019f) this.f69196aj.get();
    }

    public final C33020g getChallengeService() {
        return (C33020g) this.f69210ax.get();
    }

    public final C33022h getCommerceService() {
        return (C33022h) this.f69209aw.get();
    }

    public final C33023i getCurrentContextService() {
        return (C33023i) this.f69193ag.get();
    }

    public final C33024j getDeleteAccountService() {
        return (C33024j) this.f69198al.get();
    }

    public final C33025k getDownloadService() {
        return (C33025k) this.f69195ai.get();
    }

    public final C41970b getDuoshanService() {
        return (C41970b) this.f69200an.get();
    }

    public final C33026l getFeed0VVManagerService() {
        return (C33026l) this.f69194ah.get();
    }

    public final C33027m getI18nService() {
        return (C33027m) this.f69182W.get();
    }

    public final C33028n getInteractStickerService() {
        return (C33028n) this.f69201ao.get();
    }

    public final C33036v getInviteUseListService() {
        return (C33036v) this.f69199am.get();
    }

    public final C33029o getLanguageService() {
        return (C33029o) this.f69183X.get();
    }

    public final C33030p getLiveProxyService() {
        return (C33030p) this.f69192af.get();
    }

    public final C34973c getPlayerService() {
        return (C34973c) this.f69185Z.get();
    }

    public final C33032r getPoiMainService() {
        return (C33032r) this.f69202ap.get();
    }

    public final C33033s getPushLaunchPageAssistantService() {
        return (C33033s) this.f69180U.get();
    }

    public final C33034t getRegionService() {
        return (C33034t) this.f69184Y.get();
    }

    public final C41971c getReportService() {
        return (C41971c) this.f69189ac.get();
    }

    public final C29092a getRuntimeBehaviorService() {
        return (C29092a) this.f69208av.get();
    }

    public final C41972d getSettingService() {
        return (C41972d) this.f69188ab.get();
    }

    public final C33035u getShotService() {
        return (C33035u) this.f69187aa.get();
    }

    public final C41973e getStoryDownloadService() {
        return (C41973e) this.f69190ad.get();
    }

    public final C33015b getUserInfoUpadteAdapterService() {
        return (C33015b) this.f69204ar.get();
    }

    public final C33039y getWebViewTweakerService() {
        return (C33039y) this.f69205as.get();
    }

    public final C33038x getWebviewService() {
        return (C33038x) this.f69181V.get();
    }

    public final C24219a provideCommentDependService() {
        return (C24219a) this.f69172M.get();
    }

    public final CommentService provideCommentService() {
        return (CommentService) this.f69173N.get();
    }

    public final DeepLinkReturnHelperService provideDeepLinkReturnHelperService() {
        return (DeepLinkReturnHelperService) this.f69230s.get();
    }

    public final C29360a provideFlowFeedCommentService() {
        return (C29360a) this.f69167H.get();
    }

    public final C29361b provideFlowFeedCommonService() {
        return (C29361b) this.f69168I.get();
    }

    public final C29362c provideFlowFeedItemInteractService() {
        return (C29362c) this.f69169J.get();
    }

    public final FollowFeedLogHelper provideFollowFeedLogHelper() {
        return (FollowFeedLogHelper) this.f69228q.get();
    }

    public final I18nLogHelper provideI18nLogHelper() {
        return (I18nLogHelper) this.f69231t.get();
    }

    public final IAwemeService provideIAwemeService() {
        return (IAwemeService) this.f69164E.get();
    }

    public final IBulletService provideIBulletService() {
        return (IBulletService) this.f69174O.get();
    }

    public final C24182h provideICommentPostingManager() {
        return (C24182h) this.f69171L.get();
    }

    public final ICommerceService provideICommerceService() {
        return (ICommerceService) this.f69165F.get();
    }

    public final IConanService provideIConanService() {
        return (IConanService) this.f69221j.get();
    }

    public final IDebugBoxService provideIDebugBoxService() {
        return (IDebugBoxService) this.f69220i.get();
    }

    public final IIMService provideIIMService() {
        return (IIMService) this.f69219h.get();
    }

    public final IIapWalletProxy provideIIapWalletProxy() {
        return (IIapWalletProxy) this.f69215d.get();
    }

    public final IPayService provideIPayService() {
        return (IPayService) this.f69217f.get();
    }

    public final IPoiService provideIPoiService() {
        return (IPoiService) this.f69170K.get();
    }

    public final IRequestIdService provideIRequestIdService() {
        return (IRequestIdService) this.f69163D.get();
    }

    public final C42846a provideIUserService() {
        return (C42846a) this.f69166G.get();
    }

    public final IWalletMainProxy provideIWalletMainProxy() {
        return (IWalletMainProxy) this.f69214c.get();
    }

    public final IWalletService provideIWalletService() {
        return (IWalletService) this.f69216e.get();
    }

    public final C34301b provideLivePushService() {
        return (C34301b) this.f69237z.get();
    }

    public final LogHelper provideLogHelper() {
        return (LogHelper) this.f69223l.get();
    }

    public final NoticeABService provideNoticeABService() {
        return (NoticeABService) this.f69160A.get();
    }

    public final NoticeCaptchaHelper provideNoticeCaptchaHelper() {
        return (NoticeCaptchaHelper) this.f69224m.get();
    }

    public final NoticeChallengePropertyUtil provideNoticeChallengePropertyUtil() {
        return (NoticeChallengePropertyUtil) this.f69161B.get();
    }

    public final NoticeCommentHelperService provideNoticeCommentHelperService() {
        return (NoticeCommentHelperService) this.f69229r.get();
    }

    public final C34303b provideNoticeCountService() {
        return (C34303b) this.f69232u.get();
    }

    public final NoticeDuetWithMovieHelper provideNoticeDuetWithMovieHelper() {
        return (NoticeDuetWithMovieHelper) this.f69226o.get();
    }

    public final C34319b provideNoticeListService() {
        return (C34319b) this.f69235x.get();
    }

    public final NoticeLiveServiceAdapter provideNoticeLiveServiceAdapter() {
        return (NoticeLiveServiceAdapter) this.f69236y.get();
    }

    public final NoticeLiveWatcherUtil provideNoticeLiveWatcherUtil() {
        return (NoticeLiveWatcherUtil) this.f69162C.get();
    }

    public final NotificationClickHelper provideNotificationClickHelper() {
        return (NotificationClickHelper) this.f69225n.get();
    }

    public final C34304c provideOldRedPointService() {
        return (C34304c) this.f69234w.get();
    }

    public final C44966a providePlugin() {
        return (C44966a) this.f69213b.get();
    }

    public final C34305d provideRedPointService() {
        return (C34305d) this.f69233v.get();
    }

    public final SchemaPageHelper provideSchemaPageHelper() {
        return (SchemaPageHelper) this.f69227p.get();
    }

    public final ShareDependService provideShareDependService() {
        return (ShareDependService) this.f69175P.get();
    }

    public final ShareExtService provideShareExtService() {
        return (ShareExtService) this.f69177R.get();
    }

    public final ShareService provideShareService() {
        return (ShareService) this.f69176Q.get();
    }

    public final WSHelper provideWSHelper() {
        return (WSHelper) this.f69222k.get();
    }

    /* renamed from: a */
    private Map<Class<?>, C47883a<C7315b<?>>> m86241a() {
        return ImmutableMap.m58577of(MainActivity.class, this.f69211ay);
    }

    /* renamed from: c */
    private DispatchingAndroidInjector<Activity> m86244c() {
        return C47377c.m147944a(m86241a(), (Map<String, C47883a<C7315b<?>>>) ImmutableMap.m58576of(), (Map<Class<? extends T>, C47883a<C7315b<? extends T>>>) ImmutableMap.m58576of(), m86243b());
    }

    public final void inject(HostApplication hostApplication) {
        m86240a(hostApplication);
    }

    private DaggerAppComponent(C26237a aVar) {
        m86242a(aVar);
    }

    /* renamed from: a */
    private HostApplication m86240a(HostApplication hostApplication) {
        C22994a.m75636a(hostApplication, m86244c());
        C22994a.m75635a(hostApplication, m86245d());
        return hostApplication;
    }

    /* renamed from: a */
    private void m86242a(C26237a aVar) {
        this.f69186a = aVar.f69239a;
        this.f69213b = C47372c.m147937a(C44969b.m141904a());
        this.f69214c = C47372c.m147937a(C26311cp.m86536a());
        this.f69215d = C47372c.m147937a(C26310co.m86532a());
        this.f69216e = C47372c.m147937a(C26312cq.m86540a());
        this.f69217f = C47372c.m147937a(C26298cc.m86495a());
        this.f69218g = C26254al.m86296a(aVar.f69239a);
        this.f69219h = C47372c.m147937a(C26276bh.m86368a((C47883a<AwemeApplication>) this.f69218g));
        this.f69220i = C47372c.m147937a(C26268az.m86342a());
        this.f69221j = C47372c.m147937a(C26267ay.m86338a());
        this.f69222k = C47372c.m147937a(C26296ca.m86490a());
        this.f69223l = C47372c.m147937a(C26281bm.m86402a());
        this.f69224m = C47372c.m147937a(C26283bo.m86410a());
        this.f69225n = C47372c.m147937a(C26291bw.m86442a());
        this.f69226o = C47372c.m147937a(C26287bs.m86426a());
        this.f69227p = C47372c.m147937a(C26294bz.m86454a());
        this.f69228q = C47372c.m147937a(C26279bk.m86394a());
        this.f69229r = C47372c.m147937a(C26285bq.m86418a());
        this.f69230s = C47372c.m147937a(C26278bj.m86390a());
        this.f69231t = C47372c.m147937a(C26274bf.m86362a());
        this.f69232u = C47372c.m147937a(C26286br.m86422a());
        this.f69233v = C47372c.m147937a(C26293by.m86450a());
        this.f69234w = C47372c.m147937a(C26292bx.m86446a());
        this.f69235x = C47372c.m147937a(C26288bt.m86430a());
        this.f69236y = C47372c.m147937a(C26289bu.m86434a());
        this.f69237z = C47372c.m147937a(C26280bl.m86398a());
        this.f69160A = C47372c.m147937a(C26282bn.m86406a());
        this.f69161B = C47372c.m147937a(C26284bp.m86414a());
        this.f69162C = C47372c.m147937a(C26290bv.m86438a());
        this.f69163D = C47372c.m147937a(C26259aq.m86312a());
        this.f69164E = C47372c.m147937a(C26258ap.m86308a());
        this.f69165F = C47372c.m147937a(C26306ck.m86520a());
        this.f69166G = C47372c.m147937a(C26308cm.m86525a());
        this.f69167H = C47372c.m147937a(C26270bb.m86349a());
        this.f69168I = C47372c.m147937a(C26271bc.m86353a());
        this.f69169J = C47372c.m147937a(C26272bd.m86357a());
        this.f69170K = C47372c.m147937a(C26300ce.m86500a());
        this.f69171L = C47372c.m147937a(C26264av.m86328a());
        this.f69172M = C47372c.m147937a(C26263au.m86324a());
        this.f69173N = C47372c.m147937a(C26265aw.m86332a());
        this.f69174O = C47372c.m147937a(C26261as.m86317a());
        this.f69175P = C47372c.m147937a(C26302cg.m86507a());
        this.f69176Q = C47372c.m147937a(C26304ci.m86515a());
        this.f69177R = C47372c.m147937a(C26303ch.m86511a());
        this.f69178S = C47372c.m147937a(C26319j.m86568a());
        this.f69179T = C47372c.m147937a(C26313d.m86544a());
        this.f69180U = C47372c.m147937a(C26335z.m86632a());
        this.f69181V = C47372c.m147937a(C26251ai.m86289a());
        this.f69182W = C47372c.m147937a(C26328s.m86604a());
        this.f69183X = C47372c.m147937a(C26331v.m86616a());
        this.f69184Y = C47372c.m147937a(C26243aa.m86257a());
        this.f69185Z = C47372c.m147937a(C26333x.m86624a());
        this.f69187aa = C47372c.m147937a(C26247ae.m86273a());
        this.f69188ab = C47372c.m147937a(C26246ad.m86269a());
        this.f69189ac = C47372c.m147937a(C26244ab.m86261a());
        this.f69190ad = C47372c.m147937a(C26248af.m86277a());
        this.f69191ae = C47372c.m147937a(C26315f.m86552a());
        this.f69192af = C47372c.m147937a(C26332w.m86620a());
        this.f69193ag = C47372c.m147937a(C26323n.m86584a());
        this.f69194ah = C47372c.m147937a(C26327r.m86600a());
        this.f69195ai = C47372c.m147937a(C26325p.m86592a());
        this.f69196aj = C47372c.m147937a(C26320k.m86572a());
        this.f69197ak = C47372c.m147937a(C26314e.m86548a());
        this.f69198al = C47372c.m147937a(C26324o.m86588a());
        this.f69199am = C47372c.m147937a(C26330u.m86612a());
        this.f69200an = C47372c.m147937a(C26326q.m86596a());
        this.f69201ao = C47372c.m147937a(C26329t.m86608a());
        this.f69202ap = C47372c.m147937a(C26334y.m86628a());
        this.f69203aq = C47372c.m147937a(C26317h.m86560a());
        this.f69204ar = C47372c.m147937a(C26249ag.m86281a());
        this.f69205as = C47372c.m147937a(C26250ah.m86285a());
        this.f69206at = C47372c.m147937a(C26318i.m86564a());
        this.f69207au = C47372c.m147937a(C26316g.m86556a());
        this.f69208av = C47372c.m147937a(C26245ac.m86265a());
        this.f69209aw = C47372c.m147937a(C26322m.m86580a());
        this.f69210ax = C47372c.m147937a(C26321l.m86576a());
        this.f69211ay = new C47883a<C26242a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C26242a get() {
                return new C26238b();
            }
        };
        this.f69212az = C26256an.m86302a(aVar.f69239a);
    }
}
