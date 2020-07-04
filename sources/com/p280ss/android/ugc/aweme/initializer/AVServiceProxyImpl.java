package com.p280ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9351f.C9352a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.app.AppLinkHandler;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22878ar;
import com.p280ss.android.ugc.aweme.app.C22900bj;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.audio.AudioUtils;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.captcha.C23627a;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p280ss.android.ugc.aweme.challenge.data.C23692c;
import com.p280ss.android.ugc.aweme.challenge.data.C23693d;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23676e;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23678f;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23681h;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23684k;
import com.p280ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.p280ss.android.ugc.aweme.challenge.recommend.p1085a.C23700b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C25656c;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26678c;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.draft.C27302a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.experiment.ToolsUseDownloaderExperiment;
import com.p280ss.android.ugc.aweme.experiment.p1209a.C27687b;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.experiment.CaptionEnableSeeMoreExperiment;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.p1285ui.SummonFriendActivity;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.live.C32525g;
import com.p280ss.android.ugc.aweme.live.model.C32531a;
import com.p280ss.android.ugc.aweme.location.C32616a;
import com.p280ss.android.ugc.aweme.location.C32624f;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.location.model.AVLocationBundle;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;
import com.p280ss.android.ugc.aweme.main.p1385g.C33034t;
import com.p280ss.android.ugc.aweme.metrics.C33243ao;
import com.p280ss.android.ugc.aweme.metrics.C33244ap;
import com.p280ss.android.ugc.aweme.metrics.C33266h;
import com.p280ss.android.ugc.aweme.opensdk.share.C34680b;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p962f.C21689a;
import com.p280ss.android.ugc.aweme.p962f.C21701b;
import com.p280ss.android.ugc.aweme.poi.IPOIService.C35001a;
import com.p280ss.android.ugc.aweme.poi.IPOIService.ResultType;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.PoiContext;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.port.internal.C35610c;
import com.p280ss.android.ugc.aweme.port.internal.ServiceConnectionImpl;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab;
import com.p280ss.android.ugc.aweme.port.p1479in.C35533ad;
import com.p280ss.android.ugc.aweme.port.p1479in.C35534ae;
import com.p280ss.android.ugc.aweme.port.p1479in.C35535af;
import com.p280ss.android.ugc.aweme.port.p1479in.C35538ah;
import com.p280ss.android.ugc.aweme.port.p1479in.C35538ah.C35539a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35538ah.C35540b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai;
import com.p280ss.android.ugc.aweme.port.p1479in.C35543aj;
import com.p280ss.android.ugc.aweme.port.p1479in.C35544ak;
import com.p280ss.android.ugc.aweme.port.p1479in.C35544ak.C35545a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al;
import com.p280ss.android.ugc.aweme.port.p1479in.C35548am;
import com.p280ss.android.ugc.aweme.port.p1479in.C35549an;
import com.p280ss.android.ugc.aweme.port.p1479in.C35552ao;
import com.p280ss.android.ugc.aweme.port.p1479in.C35553ap;
import com.p280ss.android.ugc.aweme.port.p1479in.C35554aq;
import com.p280ss.android.ugc.aweme.port.p1479in.C35554aq.C35555a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35554aq.C35556b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35557ar;
import com.p280ss.android.ugc.aweme.port.p1479in.C35558as;
import com.p280ss.android.ugc.aweme.port.p1479in.C35575l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35576m;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o.C35579a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35580p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35581q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35582r;
import com.p280ss.android.ugc.aweme.port.p1479in.C35582r.C35583a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35585a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35586b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35587c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35588d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35589e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35590t;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35594a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35595b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35596c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35597d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35598e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35599w;
import com.p280ss.android.ugc.aweme.port.p1479in.C35600x;
import com.p280ss.android.ugc.aweme.port.p1479in.C35601y;
import com.p280ss.android.ugc.aweme.port.p1479in.C35601y.C35602a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z.C35604a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z.C35605b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z.C35606c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z.C35607d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.HeaderDetailActivity;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.services.NetworkServiceImpl;
import com.p280ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37708a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37713d;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.p280ss.android.ugc.aweme.share.C38246n;
import com.p280ss.android.ugc.aweme.share.C38247o;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.share.libra.MTEndWatermarkExperiment;
import com.p280ss.android.ugc.aweme.shortvideo.AVAweme;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.C38553c;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.p1581l.C40024a;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40248a;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40249b;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40252e;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40253f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.p1607a.C40703a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40968l;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41556j;
import com.p280ss.android.ugc.aweme.splash.SplashActivity;
import com.p280ss.android.ugc.aweme.sticker.prop.api.C41860a;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.utils.ActivityStack;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43014ci;
import com.p280ss.android.ugc.aweme.utils.C43118fb;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p280ss.android.ugc.aweme.video.p1700d.C43211f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl */
public class AVServiceProxyImpl implements IAVServiceProxy {
    private C35575l abTestService;
    private C21164d accountService;
    private C35578o applicationService;
    private C35576m avConverter;
    private C35580p bridgeService;
    private C35581q businessGoodsService;
    private C35582r captchaService;
    private C35584s challengeService;
    private C35590t commerceService;
    private C35593v duoShanService;
    private C35599w hashTagService;
    private C35601y liveService;
    private C35603z locationService;
    private C35527ab musicService;
    private C35534ae networkService;
    private C35535af openSDKShareService;
    private C35538ah poiService;
    private C35541ai publishService;
    private C35543aj settingService;
    private C35544ak sharePrefService;
    private C35546al shortVideoPluginService;
    private C35548am stickerPropService;
    private C35549an stickerShareService;
    private C35553ap summonFriendService;
    private C35554aq syncShareService;
    private C35557ar toolsComponentService;
    private C35558as unlockStickerService;

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$a */
    static class C32076a implements C35575l {
        private C32076a() {
        }

        /* renamed from: b */
        public final boolean mo83117b() {
            return C33003b.m106651a();
        }

        /* renamed from: d */
        public final boolean mo83119d() {
            return MTEndWatermarkExperiment.INSTANCE.enable();
        }

        /* renamed from: e */
        public final boolean mo83120e() {
            return C30553b.m99786b();
        }

        /* renamed from: g */
        public final boolean mo83122g() {
            return C27687b.m90836a();
        }

        /* renamed from: c */
        public final int mo83118c() {
            return C7213d.m22500a().mo18803bo().insShareType;
        }

        /* renamed from: a */
        public final boolean mo83116a() {
            return ((IHomepageExperimentService) ServiceManager.get().getService(IHomepageExperimentService.class)).showNewFollowFeedStyle();
        }

        /* renamed from: f */
        public final boolean mo83121f() {
            return C6384b.m19835a().mo15292a(ToolsUseDownloaderExperiment.class, true, "tools_use_downloader", C6384b.m19835a().mo15295d().tools_use_downloader, false);
        }

        /* renamed from: h */
        public final int mo83123h() {
            return C6384b.m19835a().mo15287a(CaptionEnableSeeMoreExperiment.class, true, "caption_enable_see_more_mt", C6384b.m19835a().mo15295d().caption_enable_see_more_mt, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$b */
    static class C32077b implements C35578o {
        private C32077b() {
        }

        /* renamed from: d */
        public final Class<? extends FragmentActivity> mo83137d() {
            return SplashActivity.class;
        }

        /* renamed from: e */
        public final Class<? extends FragmentActivity> mo83138e() {
            return SplashActivity.class;
        }

        /* renamed from: g */
        public final Class<? extends Activity> mo83140g() {
            return AppLinkHandler.class;
        }

        /* renamed from: k */
        public final void mo83144k() {
            C43118fb.m136745a();
        }

        /* renamed from: a */
        public final boolean mo83134a(long j) {
            return LocalVideoPlayerManager.m137195a().mo104994a(j);
        }

        /* renamed from: b */
        public final int mo83135b() {
            return C6399b.m19935k();
        }

        /* renamed from: c */
        public final Application mo83136c() {
            return AwemeApplication.m21341a();
        }

        /* renamed from: h */
        public final int mo83141h() {
            return (int) C6399b.m19932h();
        }

        /* renamed from: i */
        public final String mo83142i() {
            return C6399b.m19934j();
        }

        /* renamed from: j */
        public final String mo83143j() {
            return C6399b.m19941q();
        }

        /* renamed from: a */
        public final String mo83125a() {
            return TeaAgent.getServerDeviceId();
        }

        /* renamed from: f */
        public final boolean mo83139f() {
            for (Activity activity : ActivityStack.getActivityStack()) {
                if (activity instanceof MainActivity) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final ServiceConnection mo83124a(FragmentActivity fragmentActivity) {
            return new ServiceConnectionImpl(fragmentActivity);
        }

        /* renamed from: a */
        public final void mo83130a(String str) {
            C28580o.m93830a(PAGE.valueOf(str));
        }

        /* renamed from: a */
        public final void mo83133a(boolean z) {
            AwemeAppData.m65765a().f60329i = true;
        }

        /* renamed from: a */
        public final void mo83129a(FragmentActivity fragmentActivity, String str) {
            C26678c.m87646a(fragmentActivity, str);
        }

        /* renamed from: a */
        public final void mo83127a(Context context, final C35579a aVar) {
            C21689a.m72592a(context, new C21701b() {
                /* renamed from: a */
                public final void mo57967a() {
                    aVar.mo88243a();
                }

                /* renamed from: a */
                public final void mo57968a(boolean z) {
                    aVar.mo88244a(z);
                }
            });
        }

        /* renamed from: a */
        public final void mo83128a(Context context, AVChallenge aVChallenge) {
            new C33243ao().mo85115a("upload").mo85118c("video").mo85114a(1).mo85252e();
            Intent intent = new Intent();
            intent.putExtra("av_challenge", aVChallenge);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivity(context, intent);
        }

        /* renamed from: a */
        public final void mo83131a(String str, String str2) {
            new C33244ap().mo85123b(str).mo85122a(str2).mo85252e();
        }

        /* renamed from: a */
        public final void mo83132a(String str, String str2, String str3) {
            new C33266h().mo85260a(str).mo85261b(str2).mo85262c(str3).mo85252e();
        }

        /* renamed from: a */
        public final void mo83126a(Activity activity, View view, float f, String... strArr) {
            HeaderDetailActivity.m116636a(activity, view, f, null, false, null, strArr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$c */
    static class C32079c implements C35580p {
        private C32079c() {
        }

        /* renamed from: c */
        public final C30221c mo83154c() {
            return C29132a.m95572g();
        }

        /* renamed from: b */
        public final boolean mo83153b() {
            return C29132a.m95560a();
        }

        /* renamed from: d */
        public final boolean mo83156d() {
            return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needLiveInRecord();
        }

        /* renamed from: e */
        public final boolean mo83157e() {
            return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needCheckCopyright();
        }

        /* renamed from: a */
        public final boolean mo83149a() {
            return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isFocusOnVideoTime();
        }

        /* renamed from: a */
        public final String mo83146a(Context context) {
            return C43211f.m137011a(context);
        }

        /* renamed from: b */
        public final String mo83151b(Context context) {
            return C38275x.m122267a(context);
        }

        /* renamed from: b */
        public final void mo83152b(Object obj) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onBackToOpenPlatform(obj);
        }

        /* renamed from: c */
        public final boolean mo83155c(Context context) {
            return AudioUtils.m75903e(context);
        }

        /* renamed from: a */
        public final ShareContext mo83145a(Object obj) {
            return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkShareContextWhenPublish(obj);
        }

        /* renamed from: a */
        public final boolean mo83150a(ShareContext shareContext) {
            return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isClientKeyValid(shareContext);
        }

        /* renamed from: a */
        public final void mo83148a(String str, String str2) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent(str, null);
        }

        /* renamed from: a */
        public final void mo83147a(Activity activity, ShareContext shareContext, String str, int i) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onReturnThirdPlatformFailed(activity, shareContext, str, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$d */
    static class C32080d implements C35582r {
        private C32080d() {
        }

        /* renamed from: a */
        public final boolean mo83159a(Exception exc) {
            return C23645b.m77551a(exc);
        }

        /* renamed from: a */
        public final void mo83158a(final ApiServerException apiServerException, final C35583a aVar) {
            C42961az.m136380a(new C23627a<MainFragment>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(MainFragment mainFragment) {
                    C23645b.m77550a(mainFragment.getChildFragmentManager(), apiServerException, new C23637b() {
                        /* renamed from: a */
                        public final void mo57592a() {
                            aVar.mo90394a();
                        }

                        /* renamed from: b */
                        public final void mo57593b() {
                            aVar.mo90395b();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$e */
    static class C32083e implements C35584s {
        private C32083e() {
        }

        /* renamed from: a */
        public final C35585a mo83160a(final C25675c<AVChallenge> cVar) {
            C25674b bVar = new C25674b();
            bVar.mo66536a(new C23676e());
            bVar.mo66537a(new C25675c() {
                /* renamed from: S_ */
                public final void mo59098S_() {
                    cVar.mo59098S_();
                }

                public final void aD_() {
                    cVar.aD_();
                }

                public final void aE_() {
                    cVar.aE_();
                }

                public final void ae_() {
                    cVar.ae_();
                }

                /* renamed from: a_ */
                public final void mo59105a_(Exception exc) {
                    cVar.mo59105a_(exc);
                }

                /* renamed from: b */
                public final void mo59107b(Exception exc) {
                    cVar.mo59107b(exc);
                }

                /* renamed from: c */
                public final void mo59109c(Exception exc) {
                    cVar.mo59109c(exc);
                }

                /* renamed from: a */
                public final void mo59099a(List list, boolean z) {
                    cVar.mo59099a(C40248a.m128594a(list), z);
                }

                /* renamed from: b */
                public final void mo59108b(List list, boolean z) {
                    cVar.mo59108b(C40248a.m128594a(list), z);
                }

                /* renamed from: c */
                public final void mo59110c(List list, boolean z) {
                    cVar.mo59110c(C40248a.m128594a(list), z);
                }
            });
            bVar.getClass();
            return C32127e.m104331a(bVar);
        }

        /* renamed from: a */
        public final C35586b mo83161a(final C35588d dVar) {
            C23681h hVar = new C23681h();
            hVar.mo66536a(new C23678f());
            hVar.mo66537a(new C23684k() {
                /* renamed from: e */
                public final void mo61614e() {
                    dVar.mo90398e();
                }

                /* renamed from: d */
                public final void mo61613d(Exception exc) {
                    dVar.mo90397d(exc);
                }

                /* renamed from: a */
                public final void mo61612a(SearchChallengeList searchChallengeList) {
                    C35588d dVar = dVar;
                    new C40253f();
                    dVar.mo90396a(C40253f.m128607a(searchChallengeList));
                }
            });
            hVar.getClass();
            return C32126d.m104329a(hVar);
        }

        /* renamed from: a */
        public final C35587c mo83162a(Fragment fragment) {
            final RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) C0069x.m157a(fragment).mo147a(RecommendHashTagViewModel.class);
            return new C35587c() {
                /* renamed from: a */
                public final C38553c mo83167a() {
                    return C40252e.m128605a((C23700b) recommendHashTagViewModel.mo61659a().getValue());
                }

                /* renamed from: a */
                public final void mo83168a(C35589e eVar) {
                    recommendHashTagViewModel.mo61660a(eVar);
                }
            };
        }

        /* renamed from: a */
        public final AVChallenge mo83164a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("challenge");
            if (serializableExtra instanceof Challenge) {
                new C40248a();
                return C40248a.m128593a((Challenge) serializableExtra);
            } else if (serializableExtra instanceof AVChallenge) {
                return (AVChallenge) serializableExtra;
            } else {
                return null;
            }
        }

        /* renamed from: a */
        static final /* synthetic */ void m104162a(C23319b bVar, ChallengeDetail challengeDetail) {
            if (challengeDetail != null && challengeDetail.challenge != null) {
                new C40248a();
                bVar.accept(C40248a.m128593a(challengeDetail.challenge));
            }
        }

        /* renamed from: a */
        public final AVChallenge mo83165a(String str, int i, boolean z) throws Exception {
            new C40248a();
            return C40248a.m128593a(ChallengeApi.m77599a(str, 0, false).challenge);
        }

        /* renamed from: a */
        public final AVChallenge mo83163a(int i, int i2, Intent intent, int i3) {
            if (i == 1 && i2 == -1) {
                return mo83164a(intent);
            }
            return null;
        }

        /* renamed from: a */
        public final void mo83166a(String str, String str2, int i, int i2, C23319b<AVChallenge> bVar) {
            new ChallengeModule().mo100182a(str, str2, i, i2, new C32128f(bVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$f */
    static class C32087f implements C35590t {
        private C32087f() {
        }

        /* renamed from: a */
        public final String mo83170a(String str, int i) {
            return str;
        }

        /* renamed from: a */
        public final String mo83169a(C27311c cVar) {
            return C27302a.m89402a(cVar);
        }

        /* renamed from: a */
        public final String mo83171a(String str, String str2) {
            C25006o b = C25006o.m82327b(str);
            b.f65953p = str2;
            return new C6600e().mo15979b((Object) b);
        }

        /* renamed from: b */
        public final String mo83175b(String str, String str2) {
            C25006o b = C25006o.m82327b(str);
            b.f65954q = str2;
            return new C6600e().mo15979b((Object) b);
        }

        /* renamed from: a */
        public final boolean mo83173a(Context context, String str, String str2) {
            return C25371n.m83459a(context, str, str2);
        }

        /* renamed from: a */
        public final boolean mo83174a(Context context, String str, boolean z) {
            return C25371n.m83463a(context, str, false);
        }

        /* renamed from: a */
        public final void mo83172a(String str, String str2, String str3, String str4, Map<String, Object> map) {
            C24976t.m82085a(str, str2, str3, str4, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$g */
    static class C32088g implements C35593v {
        private C32088g() {
        }

        /* renamed from: a */
        public final C35596c mo83176a() {
            final C37716e eVar = new C37716e();
            return new C35596c() {
                /* renamed from: a */
                public final void mo83180a(Object... objArr) {
                    eVar.mo56976a(objArr);
                }

                /* renamed from: a */
                public final void mo83179a(final C35597d dVar) {
                    eVar.mo66537a(new C37709b() {
                        /* renamed from: c_ */
                        public final void mo83182c_(Exception exc) {
                        }

                        /* renamed from: a */
                        public final void mo83181a(final C37723b bVar) {
                            dVar.mo90407a(new C35598e() {
                                /* renamed from: a */
                                public final int mo83183a() {
                                    return bVar.f98285u;
                                }

                                /* renamed from: b */
                                public final int mo83184b() {
                                    return bVar.f98286v;
                                }

                                /* renamed from: c */
                                public final int mo83185c() {
                                    return bVar.f98282r;
                                }

                                /* renamed from: d */
                                public final int mo83186d() {
                                    return bVar.f98283s;
                                }

                                /* renamed from: e */
                                public final int mo83187e() {
                                    return bVar.f98284t;
                                }
                            });
                        }
                    });
                }
            };
        }

        /* renamed from: b */
        public final C35594a mo83177b() {
            final C37713d dVar = new C37713d();
            return new C35594a() {
                /* renamed from: a */
                public final void mo83189a(Object... objArr) {
                    dVar.mo56976a(objArr);
                }

                /* renamed from: a */
                public final void mo83188a(final C35595b bVar) {
                    dVar.mo66537a(new C37708a() {
                        public final void bJ_() {
                        }

                        public final void bI_() {
                            bVar.mo90406a();
                        }
                    });
                }
            };
        }

        /* renamed from: c */
        public final boolean mo83178c() {
            return C25656c.m84376a(C6399b.m19921a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$h */
    static class C32094h implements C35599w {
        private C32094h() {
        }

        /* renamed from: a */
        public final void mo83192a(long j, String str) {
            C23693d.m77663a(new C23692c(Long.valueOf(j), str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$i */
    static class C32095i implements C35600x {
        private C32095i() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$j */
    static class C32096j implements C35601y {

        /* renamed from: a */
        private final Map<Class, Object> f83899a;

        /* renamed from: b */
        private final Map<C35602a, C9352a> f83900b;

        /* renamed from: c */
        public final C35610c mo83200c() {
            return new C32525g();
        }

        /* renamed from: b */
        public final boolean mo83199b() {
            if (!C41990e.m133510c() || C32430a.m105068e() == null) {
                return false;
            }
            return true;
        }

        private C32096j() {
            this.f83899a = new HashMap();
            this.f83900b = new HashMap();
            this.f83899a.put(C35600x.class, new C32095i());
        }

        /* renamed from: a */
        public final boolean mo83196a() {
            return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needLiveInRecord();
        }

        /* renamed from: a */
        public final void mo83195a(boolean z) {
            C41990e.m133507b(z);
        }

        /* renamed from: b */
        public final void mo83198b(boolean z) {
            C41990e.m133505a(z);
        }

        /* renamed from: a */
        public final void mo83193a(C29296g gVar) {
            C42961az.m136380a(new C32531a(gVar));
        }

        /* renamed from: b */
        public final void mo83197b(C35602a aVar) {
            C9352a aVar2 = (C9352a) this.f83900b.get(aVar);
            if (aVar2 != null) {
                this.f83900b.remove(aVar);
                C32430a.m105068e().mo22023i().mo9652b(aVar2);
            }
        }

        /* renamed from: a */
        public final void mo83194a(C35602a aVar) {
            C9352a aVar2 = (C9352a) this.f83900b.get(aVar);
            if (aVar2 == null) {
                aVar.getClass();
                aVar2 = C32129g.m104333a(aVar);
                this.f83900b.put(aVar, aVar2);
            }
            C32430a.m105068e().mo22023i().mo9651a(aVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$k */
    static class C32097k implements C35603z {
        private C32097k() {
        }

        /* renamed from: b */
        public final void mo83207b() {
            C43014ci.m136517a();
        }

        /* renamed from: a */
        public final String mo83202a() {
            return C28290d.m93043d();
        }

        /* renamed from: e */
        public final boolean mo83213e() {
            return C32616a.m105657e();
        }

        /* renamed from: c */
        public final String mo83209c() {
            C33034t tVar = (C33034t) ServiceManager.get().getService(C33034t.class);
            if (tVar != null) {
                return tVar.mo60002b();
            }
            return "";
        }

        /* renamed from: d */
        public final boolean mo83212d() {
            return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).showPoiEntrance();
        }

        /* renamed from: b */
        public final void mo83208b(Context context) {
            C32630h.m105696b(context).mo83998b();
        }

        /* renamed from: c */
        public final void mo83210c(Context context) {
            C32630h.m105696b(context).mo84000d();
        }

        /* renamed from: d */
        public final void mo83211d(Context context) {
            C22900bj.f60619c.mo59869a(context).mo59866b();
        }

        /* renamed from: a */
        public final AVLocationBundle mo83201a(Context context) {
            new C40249b();
            return C40249b.m128596a(C32630h.m105696b(context).mo83993a());
        }

        /* renamed from: b */
        static final /* synthetic */ void m104212b(Context context, C35605b bVar) {
            LocationBundle a = C32630h.m105696b(context.getApplicationContext()).mo83993a();
            if (a == null || !a.isValid()) {
                if (bVar != null) {
                    bVar.mo90410a();
                }
            } else if (bVar != null) {
                bVar.mo90411a(a.latitude, a.longitude);
            }
        }

        /* renamed from: a */
        public final void mo83204a(Context context, final C35604a aVar) {
            C22900bj.f60619c.mo59869a(context).f60620a = new C22878ar() {
                /* renamed from: a */
                public final void mo59846a(float f) {
                    aVar.mo90409a(f);
                }
            };
            C22900bj.f60619c.mo59869a(context).mo59865a();
        }

        /* renamed from: a */
        public final void mo83205a(Context context, C35605b bVar) {
            if (context != null) {
                LocationBundle a = C32630h.m105696b(context.getApplicationContext()).mo83993a();
                if (a == null || !a.isValid()) {
                    C32630h.m105696b(context.getApplicationContext()).mo83994a((C32624f) new C32130h(context, bVar));
                } else {
                    bVar.mo90411a(a.latitude, a.longitude);
                }
            }
        }

        /* renamed from: a */
        public final void mo83206a(Context context, final C35607d dVar) {
            if (!C32616a.m105657e()) {
                C32616a.m105655b((Activity) context, new C43154a() {
                    /* renamed from: a */
                    public final void mo71375a() {
                        if (dVar != null) {
                            dVar.mo90413a();
                        }
                    }

                    /* renamed from: b */
                    public final void mo71376b() {
                        if (dVar != null) {
                            dVar.mo90414b();
                        }
                    }
                });
            } else {
                dVar.mo90413a();
            }
        }

        /* renamed from: a */
        public final void mo83203a(final Context context, int i, final C35606c cVar) {
            C32630h.m105696b(context).mo83995a(3, (C32624f) new C32624f() {
                public final void bv_() {
                    new C40249b();
                    cVar.mo90412a(C40249b.m128596a(C32630h.m105696b(context).mo83993a()));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$l */
    static class C32101l implements C35538ah {
        private C32101l() {
        }

        /* renamed from: a */
        public final String mo83215a(String str) {
            return PoiContext.serializeForDraft(str);
        }

        /* renamed from: a */
        public final void mo83217a(C35540b bVar, FragmentActivity fragmentActivity, boolean z) {
            C40703a.m130147a().mo100881a((C35001a) null);
        }

        /* renamed from: a */
        public final void mo83216a(final C35539a aVar, FragmentActivity fragmentActivity, boolean z) {
            C40703a.m130147a().mo100881a((C35001a) new C35001a() {
                /* renamed from: a */
                public final void mo83218a() {
                    if (aVar != null) {
                        aVar.mo90363a();
                    }
                }

                /* renamed from: b */
                public final void mo83220b() {
                    if (aVar != null) {
                        aVar.mo90365b();
                    }
                }

                /* renamed from: a */
                public final void mo83219a(ResultType resultType, PoiStruct poiStruct, String str) {
                    if (aVar != null) {
                        aVar.mo90364a(poiStruct.toStickerPoiStruct(), str);
                    }
                }
            }).mo100884a(fragmentActivity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$m */
    static class C32103m implements C35543aj {
        private C32103m() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$n */
    static class C32104n implements C35544ak {
        private C32104n() {
        }

        /* renamed from: a */
        public final String mo83222a() {
            return "guide";
        }

        /* renamed from: b */
        public final C35545a<Boolean> mo83224b() {
            return new C35545a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104289b();
                }

                /* renamed from: b */
                private static Boolean m104289b() {
                    return (Boolean) SharePrefCache.inst().getIsAwemePrivate().mo59877d();
                }

                /* renamed from: a */
                private static void m104288a(Boolean bool) {
                    SharePrefCache.inst().getIsAwemePrivate().mo59871a(bool);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104288a((Boolean) obj);
                }
            };
        }

        /* renamed from: c */
        public final C35545a<Boolean> mo83227c() {
            return new C35545a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104257b();
                }

                /* renamed from: b */
                private static Boolean m104257b() {
                    return (Boolean) SharePrefCache.inst().getAutoSaveVideo().mo59877d();
                }

                /* renamed from: a */
                private static void m104256a(Boolean bool) {
                    SharePrefCache.inst().getAutoSaveVideo().mo59871a(bool);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104256a((Boolean) obj);
                }
            };
        }

        /* renamed from: d */
        public final C35545a<Boolean> mo83228d() {
            return new C35545a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104261b();
                }

                /* renamed from: b */
                private static Boolean m104261b() {
                    return (Boolean) C23060u.m75742a().mo60052V().mo59877d();
                }

                /* renamed from: a */
                private static void m104260a(Boolean bool) {
                    C23060u.m75742a().mo60052V().mo59871a(bool);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104260a((Boolean) obj);
                }
            };
        }

        /* renamed from: e */
        public final C35545a<Integer> mo83229e() {
            return new C35545a<Integer>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104265b();
                }

                /* renamed from: b */
                private static Integer m104265b() {
                    return (Integer) SharePrefCache.inst().getStoryInfoStickerMaxCount().mo59877d();
                }

                /* renamed from: a */
                private static void m104264a(Integer num) {
                    SharePrefCache.inst().getStoryInfoStickerMaxCount().mo59871a(num);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104264a((Integer) obj);
                }
            };
        }

        /* renamed from: f */
        public final C35545a<Integer> mo83230f() {
            return new C35545a<Integer>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104253b();
                }

                /* renamed from: b */
                private static Integer m104253b() {
                    return (Integer) SharePrefCache.inst().getStorySettingViewPermission().mo59877d();
                }

                /* renamed from: a */
                private static void m104252a(Integer num) {
                    SharePrefCache.inst().getStorySettingViewPermission().mo59871a(num);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104252a((Integer) obj);
                }
            };
        }

        /* renamed from: g */
        public final C35545a<Integer> mo83231g() {
            return new C35545a<Integer>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104269b();
                }

                /* renamed from: b */
                private static Integer m104269b() {
                    return (Integer) SharePrefCache.inst().getStorySettingReplyPermission().mo59877d();
                }

                /* renamed from: a */
                private static void m104268a(Integer num) {
                    SharePrefCache.inst().getStorySettingReplyPermission().mo59871a(num);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104268a((Integer) obj);
                }
            };
        }

        /* renamed from: h */
        public final C35545a<Boolean> mo83232h() {
            return new C35545a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104273b();
                }

                /* renamed from: b */
                private static Boolean m104273b() {
                    return (Boolean) SharePrefCache.inst().getStorySettingSyncDuoshan().mo59877d();
                }

                /* renamed from: a */
                private static void m104272a(Boolean bool) {
                    SharePrefCache.inst().getStorySettingSyncDuoshan().mo59871a(bool);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104272a((Boolean) obj);
                }
            };
        }

        /* renamed from: i */
        public final C35545a<Boolean> mo83233i() {
            return new C35545a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104277b();
                }

                /* renamed from: b */
                private static Boolean m104277b() {
                    return (Boolean) SharePrefCache.inst().getStorySettingDoudouPhoto().mo59877d();
                }

                /* renamed from: a */
                private static void m104276a(Boolean bool) {
                    SharePrefCache.inst().getStorySettingDoudouPhoto().mo59871a(bool);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104276a((Boolean) obj);
                }
            };
        }

        /* renamed from: j */
        public final C35545a<Integer> mo83234j() {
            return new C35545a<Integer>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104281b();
                }

                /* renamed from: b */
                private static Integer m104281b() {
                    return (Integer) SharePrefCache.inst().getStorySettingSyncToast().mo59877d();
                }

                /* renamed from: a */
                private static void m104280a(Integer num) {
                    SharePrefCache.inst().getStorySettingSyncToast().mo59871a(num);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104280a((Integer) obj);
                }
            };
        }

        /* renamed from: k */
        public final C35545a<Boolean> mo83235k() {
            return new C35545a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104285b();
                }

                /* renamed from: b */
                private static Boolean m104285b() {
                    return (Boolean) SharePrefCache.inst().getStorySettingManualOpenDoudou().mo59877d();
                }

                /* renamed from: a */
                private static void m104284a(Boolean bool) {
                    SharePrefCache.inst().getStorySettingManualOpenDoudou().mo59871a(bool);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104284a((Boolean) obj);
                }
            };
        }

        /* renamed from: l */
        public final C35545a<String> mo83236l() {
            return new C35545a<String>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104293b();
                }

                /* renamed from: b */
                private static String m104293b() {
                    return (String) SharePrefCache.inst().getStoryFontType().mo59877d();
                }

                /* renamed from: a */
                private static void m104292a(String str) {
                    SharePrefCache.inst().getStoryFontType().mo59871a(str);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104292a((String) obj);
                }
            };
        }

        /* renamed from: m */
        public final C35545a<Integer> mo83237m() {
            return new C35545a<Integer>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo83238a() {
                    return m104297b();
                }

                /* renamed from: b */
                private static Integer m104297b() {
                    return (Integer) SharePrefCache.inst().getStoryTextStickerMaxCount().mo59877d();
                }

                /* renamed from: a */
                private static void m104296a(Integer num) {
                    SharePrefCache.inst().getStoryTextStickerMaxCount().mo59871a(num);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo83239a(Object obj) {
                    m104296a((Integer) obj);
                }
            };
        }

        /* renamed from: a */
        public final int mo83221a(String str, int i) {
            return C23338f.m76562a().mo60620a(str, 0);
        }

        /* renamed from: b */
        public final void mo83225b(String str, int i) {
            C23338f.m76562a().mo60629b(str, i);
        }

        /* renamed from: a */
        public final boolean mo83223a(String str, boolean z) {
            return C23338f.m76562a().mo60627a(str, true);
        }

        /* renamed from: b */
        public final void mo83226b(String str, boolean z) {
            C23338f.m76562a().mo60634b(str, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$o */
    static class C32117o implements C35549an {
        private C32117o() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$p */
    static class C32118p implements C35553ap {
        private C32118p() {
        }

        /* renamed from: a */
        public final User mo83240a(Intent intent) {
            if (intent != null) {
                return (User) intent.getSerializableExtra("extra_data");
            }
            return null;
        }

        /* renamed from: a */
        public final void mo83241a(Fragment fragment, int i) {
            SummonFriendActivity.m98544a(fragment, 3, "", 0);
        }

        /* renamed from: a */
        public final void mo83242a(Fragment fragment, int i, String str, int i2) {
            SummonFriendActivity.m98544a(fragment, 3, str, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$q */
    static class C32119q implements C35554aq {
        private C32119q() {
        }

        /* renamed from: a */
        public final C35555a mo83243a(Context context, int i) {
            new C38246n();
            final C38247o a = C38246n.m122183a(context, i);
            return new C35555a() {
                /* renamed from: d */
                public final View mo83253d() {
                    return a;
                }

                /* renamed from: a */
                public final void mo83244a() {
                    a.mo95855a();
                }

                /* renamed from: b */
                public final String mo83251b() {
                    return a.mo95860b();
                }

                /* renamed from: c */
                public final int mo83252c() {
                    return a.getSaveUploadType();
                }

                /* renamed from: a */
                public final void mo83245a(int i) {
                    a.mo95856a(i);
                }

                /* renamed from: a */
                public final void mo83249a(Fragment fragment) {
                    a.f99400a = fragment;
                }

                /* renamed from: a */
                public final void mo83250a(String str) {
                    a.setSyncShareViewTitle(str);
                }

                /* renamed from: a */
                public final void mo83247a(int i, C35556b bVar) {
                    C38247o oVar = a;
                    bVar.getClass();
                    oVar.mo95858a(1, C32131i.m104335a(bVar));
                }

                /* renamed from: a */
                public final void mo83248a(int i, boolean z) {
                    a.mo95859a(1, false);
                }

                /* renamed from: a */
                public final void mo83246a(int i, int i2, Intent intent) {
                    a.mo95857a(i, i2, intent);
                }
            };
        }
    }

    static final /* synthetic */ boolean lambda$superEntrancePrivacyService$1$AVServiceProxyImpl(Context context) {
        return false;
    }

    public C35533ad getNationalTaskService() {
        return null;
    }

    public ISuperEntrancePrivacyService superEntrancePrivacyService() {
        return C32125c.f83929a;
    }

    public C35552ao getStoryPublishService() {
        return new C32141n();
    }

    public C35575l getABService() {
        if (this.abTestService == null) {
            this.abTestService = new C32076a();
        }
        return this.abTestService;
    }

    public C35576m getAVConverter() {
        if (this.avConverter == null) {
            this.avConverter = C32124b.f83928a;
        }
        return this.avConverter;
    }

    public C21164d getAccountService() {
        if (this.accountService == null) {
            this.accountService = new C32121a();
        }
        return this.accountService;
    }

    public C35578o getApplicationService() {
        if (this.applicationService == null) {
            this.applicationService = new C32077b();
        }
        return this.applicationService;
    }

    public C35580p getBridgeService() {
        if (this.bridgeService == null) {
            this.bridgeService = new C32079c();
        }
        return this.bridgeService;
    }

    public C35581q getBusinessGoodsService() {
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new C35581q() {
                /* renamed from: a */
                public final void mo83115a(String str) {
                    C41556j.m132337a(str);
                }
            };
        }
        return this.businessGoodsService;
    }

    public C35582r getCaptureService() {
        if (this.captchaService == null) {
            this.captchaService = new C32080d();
        }
        return this.captchaService;
    }

    public C35584s getChallengeService() {
        if (this.challengeService == null) {
            this.challengeService = new C32083e();
        }
        return this.challengeService;
    }

    public C35590t getCommerceService() {
        if (this.commerceService == null) {
            this.commerceService = new C32087f();
        }
        return this.commerceService;
    }

    public C35593v getDuoShanService() {
        if (this.duoShanService == null) {
            this.duoShanService = new C32088g();
        }
        return this.duoShanService;
    }

    public C35599w getHashTagService() {
        if (this.hashTagService == null) {
            this.hashTagService = new C32094h();
        }
        return this.hashTagService;
    }

    public C35548am getIStickerPropService() {
        if (this.stickerPropService == null) {
            this.stickerPropService = new C41860a();
        }
        return this.stickerPropService;
    }

    public C35601y getLiveService() {
        if (this.liveService == null) {
            this.liveService = new C32096j();
        }
        return this.liveService;
    }

    public C35603z getLocationService() {
        if (this.locationService == null) {
            this.locationService = new C32097k();
        }
        return this.locationService;
    }

    public C35527ab getMusicService() {
        if (this.musicService == null) {
            this.musicService = new C32133k();
        }
        return this.musicService;
    }

    public C35534ae getNetworkService() {
        if (this.networkService == null) {
            this.networkService = new NetworkServiceImpl();
        }
        return this.networkService;
    }

    public C35538ah getPoiService() {
        if (this.poiService == null) {
            this.poiService = new C32101l();
        }
        return this.poiService;
    }

    public C35541ai getPublishService() {
        if (this.publishService == null) {
            this.publishService = new C32138l();
        }
        return this.publishService;
    }

    public C35543aj getSettingService() {
        if (this.settingService == null) {
            this.settingService = new C32103m();
        }
        return this.settingService;
    }

    public C35546al getShortVideoPluginService() {
        if (this.shortVideoPluginService == null) {
            this.shortVideoPluginService = new C40024a();
        }
        return this.shortVideoPluginService;
    }

    public C35544ak getSpServcie() {
        if (this.sharePrefService == null) {
            this.sharePrefService = new C32104n();
        }
        return this.sharePrefService;
    }

    public C35549an getStickerShareService() {
        if (this.stickerShareService == null) {
            this.stickerShareService = new C32117o();
        }
        return this.stickerShareService;
    }

    public C35553ap getSummonFriendService() {
        if (this.summonFriendService == null) {
            this.summonFriendService = new C32118p();
        }
        return this.summonFriendService;
    }

    public C35554aq getSyncShareService() {
        if (this.syncShareService == null) {
            this.syncShareService = new C32119q();
        }
        return this.syncShareService;
    }

    public C35557ar getToolsComponentService() {
        if (this.toolsComponentService == null) {
            this.toolsComponentService = new C32142o();
        }
        return this.toolsComponentService;
    }

    public C35535af openSDKService() {
        if (this.openSDKShareService == null) {
            this.openSDKShareService = new C34680b();
        }
        return this.openSDKShareService;
    }

    public C35558as unlockStickerService() {
        if (this.unlockStickerService == null) {
            this.unlockStickerService = new C40968l();
        }
        return this.unlockStickerService;
    }

    static final /* synthetic */ AVAweme lambda$getAVConverter$0$AVServiceProxyImpl(C38455ap apVar) {
        if (apVar instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) apVar;
            if (createAwemeResponse.aweme != null) {
                AVAweme aVAweme = new AVAweme();
                aVAweme.aid = createAwemeResponse.aweme.getAid();
                return aVAweme;
            }
        }
        return null;
    }
}
