package com.p280ss.android.ugc.aweme.app.application;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.application.initialization.C6867a;
import com.p280ss.android.ugc.aweme.app.launch.AppConfigInitTask;
import com.p280ss.android.ugc.aweme.device.DeviceInfoReportTask;
import com.p280ss.android.ugc.aweme.feed.preload.PreloadMediaCodecListTask;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.PreDrawableInflate;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.X2CActivityMain;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.X2CFragmentMain;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.X2CFragmentMainPage;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7132f;
import com.p280ss.android.ugc.aweme.lego.C7149b;
import com.p280ss.android.ugc.aweme.lego.LegoInflate;
import com.p280ss.android.ugc.aweme.lego.LegoService;
import com.p280ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate;
import com.p280ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CFragmentFeed;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.legoImp.service.AOTOptimizeService;
import com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p280ss.android.ugc.aweme.legoImp.task.AVStorageCleanTask;
import com.p280ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.p280ss.android.ugc.aweme.legoImp.task.AlertDialogInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask;
import com.p280ss.android.ugc.aweme.legoImp.task.AnrTask;
import com.p280ss.android.ugc.aweme.legoImp.task.AppFlyerCustomerIdTask;
import com.p280ss.android.ugc.aweme.legoImp.task.AppLinkDataTask;
import com.p280ss.android.ugc.aweme.legoImp.task.AssistantTask;
import com.p280ss.android.ugc.aweme.legoImp.task.C7158v;
import com.p280ss.android.ugc.aweme.legoImp.task.CheckNoticeTask;
import com.p280ss.android.ugc.aweme.legoImp.task.DataUsageTask;
import com.p280ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask;
import com.p280ss.android.ugc.aweme.legoImp.task.EnterMusicGuideColdStartTask;
import com.p280ss.android.ugc.aweme.legoImp.task.FabricInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak;
import com.p280ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.p280ss.android.ugc.aweme.legoImp.task.HackActivityThreadH;
import com.p280ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.p280ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;
import com.p280ss.android.ugc.aweme.legoImp.task.InitDebugBox;
import com.p280ss.android.ugc.aweme.legoImp.task.InitDownloader;
import com.p280ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.p280ss.android.ugc.aweme.legoImp.task.InitI18nConfig;
import com.p280ss.android.ugc.aweme.legoImp.task.InitLinkSelector;
import com.p280ss.android.ugc.aweme.legoImp.task.InitLocalAbTestModel;
import com.p280ss.android.ugc.aweme.legoImp.task.InitMobShare;
import com.p280ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.p280ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask;
import com.p280ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.p280ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.p280ss.android.ugc.aweme.legoImp.task.JacocoTask;
import com.p280ss.android.ugc.aweme.legoImp.task.LeakReporterInjectTask;
import com.p280ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.p280ss.android.ugc.aweme.legoImp.task.LinkSelectorMonitorTask;
import com.p280ss.android.ugc.aweme.legoImp.task.LobbyInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.LoginProxyTask;
import com.p280ss.android.ugc.aweme.legoImp.task.MobMainAppEndTask;
import com.p280ss.android.ugc.aweme.legoImp.task.MobMainAppStartTask;
import com.p280ss.android.ugc.aweme.legoImp.task.NpthTask;
import com.p280ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister;
import com.p280ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask;
import com.p280ss.android.ugc.aweme.legoImp.task.PlayerInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.PlayerKitInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.PreloadDmtSecSoTask;
import com.p280ss.android.ugc.aweme.legoImp.task.PreloadEmojiTask;
import com.p280ss.android.ugc.aweme.legoImp.task.PreloadInstanceOnAttachTask;
import com.p280ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.p280ss.android.ugc.aweme.legoImp.task.RegisterScreenBroadcastReceiverTask;
import com.p280ss.android.ugc.aweme.legoImp.task.RegisterSessionReceiver;
import com.p280ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.p280ss.android.ugc.aweme.legoImp.task.SetupDebugLevel;
import com.p280ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb;
import com.p280ss.android.ugc.aweme.legoImp.task.SetupTestSpHost;
import com.p280ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadTask;
import com.p280ss.android.ugc.aweme.legoImp.task.StoragePreCleanTask;
import com.p280ss.android.ugc.aweme.legoImp.task.StorageTask;
import com.p280ss.android.ugc.aweme.legoImp.task.UpdateLocale;
import com.p280ss.android.ugc.aweme.legoImp.task.UploadTeenStatusTask;
import com.p280ss.android.ugc.aweme.legoImp.task.VideoCachePreloaderInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.WebSocketTask;
import com.p280ss.android.ugc.aweme.legoImp.task.WorkManagerDelayInit;
import com.p280ss.android.ugc.aweme.p1685ug.referral.C42747e;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.app.application.d */
public final class C22865d implements C6867a {
    /* renamed from: a */
    private static void m75325a() {
        C7149b.m22312b().post(new Runnable() {
            public final void run() {
                if (C42747e.m135682a()) {
                    C6399b.m19921a().getSystemService("clipboard");
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo16880a(Application application) {
        C7121a.m22248b().mo18559a(new PreloadInstanceOnAttachTask()).mo18559a(new PreloadDmtSecSoTask()).mo18559a(new PreloadWireFieldNoEnumClassTask()).mo18559a(new SharePreferencePreloadTask()).mo18560a();
    }

    /* renamed from: c */
    private static void m75326c(Application application) {
        C6857a.m21312e().mo16822a("method_fresco_ensure_duration", false);
        C7121a.m22246a(C7158v.m22353c());
        C6857a.m21312e().mo16822a("method_business_tools_ensure_duration", false);
        C7121a.m22246a(C7158v.m22351a(application));
        C6857a.m21312e().mo16827b("method_fresco_ensure_duration", false);
        C6857a.m21312e().mo16822a("method_absdk_ensure_duration", false);
        if (!C6399b.m19947w()) {
            C7121a.m22246a(C7158v.m22354d());
        }
        C6857a.m21312e().mo16827b("method_absdk_ensure_duration", false);
        C7121a.m22246a(C7158v.m22350a());
    }

    /* renamed from: b */
    public final void mo16881b(Application application) {
        C7121a.f20005a.mo18542a(X2CActivityMain.class, (LegoInflate) new X2CActivityMain()).mo18542a(X2CFragmentMainPage.class, (LegoInflate) new X2CFragmentMainPage()).mo18542a(X2CFragmentMain.class, (LegoInflate) new X2CFragmentMain()).mo18542a(X2CFragmentFeed.class, (LegoInflate) new X2CFragmentFeed()).mo18542a(X2CItemFeed.class, (LegoInflate) new X2CItemFeed()).mo18543a(MainLooperOptService.class, (LegoService) new MainLooperOptService()).mo18543a(AOTOptimizeService.class, (LegoService) new AOTOptimizeService()).mo18542a(SplashBgInflate.class, (LegoInflate) new SplashBgInflate()).mo18542a(PreDrawableInflate.class, (LegoInflate) new PreDrawableInflate()).mo18542a(DmtStatusViewInflate.class, (LegoInflate) new DmtStatusViewInflate());
        C7121a.m22250c().mo18556a(AOTOptimizeService.class).mo18556a(MainLooperOptService.class).mo18557a();
        C7121a.m22253d().mo18545a(SplashBgInflate.class).mo18545a(PreDrawableInflate.class).mo18545a(DmtStatusViewInflate.class).mo18546a();
        m75325a();
        C7121a.m22248b().mo18559a(new LegacyTask()).mo18559a(new MobMainAppStartTask()).mo18559a(new PlayerKitInitTask()).mo18559a(new InitI18nConfig()).mo18559a(C6903bc.m21465F().mo16874u()).mo18559a(new UpdateLocale()).mo18559a(new InitLinkSelector()).mo18559a(new InitFramework()).mo18559a(new StoragePreCleanTask()).mo18559a(new AdjustMusicVolume()).mo18559a(new InitAVModule()).mo18559a(new InitReportSignature()).mo18559a(new InitTaskManager()).mo18559a(new LoginProxyTask()).mo18559a(new RegisterSessionReceiver()).mo18559a(new InitDownloader()).mo18559a(new InitMusicManager()).mo18559a(new FixFocusedViewLeak()).mo18559a(new InitAppsFlyer()).mo18559a(C6903bc.m21465F().mo16872s()).mo18559a(new ObserveDeviceRegister()).mo18559a(new InitMobShare()).mo18559a(new MobMainAppEndTask()).mo18559a(new SetupMainServiceForJsb()).mo18559a(new InitDebugBox()).mo18559a(C6903bc.m21465F().mo16873t()).mo18559a(new LobbyInitTask()).mo18559a(new AlertDialogInitTask()).mo18560a();
        if (C7163a.m22363a()) {
            C7121a.m22248b().mo18559a(new InitLocalAbTestModel()).mo18559a(new SetupTestSpHost()).mo18560a();
        }
        C7121a.m22248b().mo18559a(new RegisterScreenBroadcastReceiverTask()).mo18559a(new GetGoogleAIdTask()).mo18559a(new AnrTask()).mo18559a(new NpthTask()).mo18559a(new PlayerInitTask()).mo18559a(C6903bc.m21465F().mo16859f()).mo18559a(new VideoCachePreloaderInitTask()).mo18559a(new AssistantTask()).mo18559a(new PreloadMediaCodecListTask()).mo18559a(new PreloadEmojiTask()).mo18560a();
        C7132f a = C7121a.m22248b().mo18559a(new FabricInitTask()).mo18559a(new AppConfigInitTask()).mo18559a(new HackActivityThreadH()).mo18559a(new SetupDebugLevel()).mo18559a(new SetAppTrackTask()).mo18559a(new AppFlyerCustomerIdTask()).mo18559a(new AVStorageCleanTask()).mo18559a(C6903bc.m21465F().mo16857e()).mo18559a(new WebSocketTask()).mo18559a(new PerformanceHelperTask()).mo18559a(new AppLinkDataTask()).mo18559a(new LinkSelectorMonitorTask()).mo18559a(new DeviceInfoReportTask()).mo18559a(new DataUsageTask()).mo18559a(new StorageTask()).mo18559a(C6903bc.m21465F().mo16869p()).mo18559a(C6903bc.m21465F().mo16876w()).mo18559a(new JacocoTask()).mo18559a(new WorkManagerDelayInit()).mo18559a(C6903bc.m21465F().mo16866m());
        if (TextUtils.equals(C6399b.m19941q(), "local_test") || C6399b.m19928c()) {
            a.mo18559a(new LeakReporterInjectTask());
        } else {
            a.mo18559a(new AnalysisHprofTask());
        }
        a.mo18560a();
        C7121a.m22248b().mo18559a(new CheckNoticeTask()).mo18559a(new DelayedBaceSpeedMethodTestTask()).mo18559a(new EnterMusicGuideColdStartTask()).mo18559a(new UploadTeenStatusTask()).mo18559a(new InitMusicServiceTask()).mo18559a(new FetchTTSettingTask(C19223b.f51890e)).mo18560a();
        m75326c(application);
    }
}
