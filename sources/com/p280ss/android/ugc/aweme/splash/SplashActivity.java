package com.p280ss.android.ugc.aweme.splash;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.newmedia.ConfirmWelcomeType;
import com.p280ss.android.p817ad.splash.C19115e;
import com.p280ss.android.p817ad.splash.C19142i;
import com.p280ss.android.p817ad.splash.C19151m;
import com.p280ss.android.p817ad.splash.C19152n;
import com.p280ss.android.p817ad.splash.p825c.C18958a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C22995i;
import com.p280ss.android.ugc.aweme.app.C22999k;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.base.utils.C23479f;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25083o;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25074d;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25266be;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.WatchState;
import com.p280ss.android.ugc.aweme.legoImp.task.AntispamApiUploadTask;
import com.p280ss.android.ugc.aweme.legoImp.task.LogLaunchModeTask;
import com.p280ss.android.ugc.aweme.legoImp.task.MobLaunchEventTask;
import com.p280ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask;
import com.p280ss.android.ugc.aweme.legoImp.task.UploadSysStatusTask;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p995ag.C22473a;
import com.p280ss.android.ugc.aweme.preinstall.PreinstallUtils;
import com.p280ss.android.ugc.aweme.requesttask.p1505b.C37231a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.setting.C7208as;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.share.systemshare.SysActionSendShareContext;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C43056dh;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.p280ss.android.ugc.aweme.utils.C43103en;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashActivity */
public class SplashActivity extends FragmentActivity implements C6310a, C41738c {
    private static final long COLD_START_DELAY = 30000;
    static final boolean DEBUG_MEMORY = false;
    public static final String FROM_WIDGET_PROVIDER = "from_widget_provider";
    private static final String LAUNCH_METHOD = "click_open_share";
    protected static final int MSG_WHAT_GO_MAIN = 100;
    public static final String SPLASH_OPEN_URL_EXTRA = "splash_open_url_extra";
    public static final String SPLASH_TO_SHOW_SUPER_ENTRANCE = "splash_to_show_super_entrance";
    public static final String TAG = "SplashActivity";
    public static ConfirmWelcomeType sConfirmWelcomeType = ConfirmWelcomeType.FULL_SCREEN_WELCOME;
    public static boolean sShowWelcomeCheckBox;
    public boolean isFirstShow;
    protected volatile boolean mAlive = true;
    protected boolean mAllowAd = true;
    private Dialog mDialog = null;
    public boolean mDirectlyGoMain;
    protected boolean mFirstResume = true;
    protected boolean mFirstResumed;
    protected final Handler mHandler = new C6309f(this);
    protected boolean mInited;
    protected boolean mJumped;
    protected boolean mTrackSession;
    private boolean preloadSubmitted = false;
    private C19152n splashAdNative;

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashActivity$a */
    static class C41727a implements C19115e {

        /* renamed from: a */
        private final WeakReference<SplashActivity> f108614a;

        C41727a(SplashActivity splashActivity) {
            this.f108614a = new WeakReference<>(splashActivity);
        }

        /* renamed from: a */
        public final void mo50822a(View view) {
            SplashActivity splashActivity = (SplashActivity) this.f108614a.get();
            if (splashActivity != null) {
                if (!C7213d.m22500a().mo18739aB() || !C25054b.m82490a().f66140g) {
                    splashActivity.goMainActivity();
                    return;
                }
                Intent intent = new Intent(splashActivity, TransitActivity.class);
                intent.putExtra("main", splashActivity.getMainIntent());
                splashActivity.startActivity(intent);
                if (!splashActivity.isFinishing()) {
                    splashActivity.finish();
                    splashActivity.overridePendingTransition(0, 0);
                }
            }
        }

        /* renamed from: a */
        public final void mo50821a(long j, String str) {
            if (((SplashActivity) this.f108614a.get()) != null) {
                C24976t.m82037a((Context) this.f108614a.get(), j, str, System.currentTimeMillis() - C25083o.f66206b.mo65592a());
            }
        }

        /* renamed from: a */
        public final void mo50823a(View view, C19142i iVar) {
            SplashActivity splashActivity = (SplashActivity) this.f108614a.get();
            if (splashActivity != null) {
                if (!splashActivity.tryOpenByScheme(iVar, new C41741f(splashActivity))) {
                    splashActivity.mHandler.sendEmptyMessage(100);
                }
                splashActivity.mDirectlyGoMain = true;
            }
        }

        /* renamed from: a */
        static final /* synthetic */ void m132871a(SplashActivity splashActivity, Context context, String str) {
            Message message = new Message();
            message.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(SplashActivity.SPLASH_OPEN_URL_EXTRA, str);
            message.setData(bundle);
            splashActivity.mHandler.sendMessage(message);
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C41742g.m132935a(this, context);
    }

    /* access modifiers changed from: protected */
    public void doInit() {
    }

    public boolean isSplashShowing() {
        return true;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onDialogShowOrDismiss(DialogInterface dialogInterface, boolean z) {
    }

    public void onStop() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public boolean quickLaunch() {
        return false;
    }

    public void goMainActivity() {
        goMainActivity(null);
    }

    private static boolean enableSplashLaunchFix() {
        try {
            return C30199h.m98861a().getEnableSplashLaunchFix().booleanValue();
        } catch (NullValueException unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void tryInit() {
        if (!this.mInited) {
            doInit();
            this.mInited = true;
        }
    }

    private void hotStartIntercept() {
        if (isHotStart() && C6399b.m19944t()) {
            C7208as.m22479a().mo18705b();
        }
    }

    private boolean isColdStartFirstView() {
        if (!SplashAdManagerHolder.f108626a) {
            return false;
        }
        C19151m a = SplashAdManagerHolder.m132886a(getApplicationContext());
        if (a == null || !a.mo50588h()) {
            return false;
        }
        return true;
    }

    public void onDestroy() {
        if (this.mDialog != null) {
            C41742g.m132934a(this.mDialog);
        }
        this.mHandler.removeMessages(100);
        this.mAlive = false;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void tryShowShortCutDlg() {
        C6857a.m21312e().mo16822a("method_splash_try_show_ad_duration", false);
        tryShowAdAndGoNext();
        C6857a.m21312e().mo16827b("method_splash_try_show_ad_duration", false);
    }

    private boolean isHotStart() {
        Intent intent = getIntent();
        if (!isTaskRoot() || intent == null || !intent.hasCategory("android.intent.category.LAUNCHER") || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return false;
        }
        return true;
    }

    private void reportLaunchTime() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - C6857a.m21312e().f19502b;
        int a = C22999k.m75642a();
        int c = AwemeAppData.m65765a().mo53437c();
        if (a != c) {
            z = true;
        } else {
            z = false;
        }
        if (C22995i.m75637a().f60773a) {
            C7121a.m22248b().mo18559a(new MobLaunchEventTask(z, currentTimeMillis)).mo18560a();
        }
        if (a == 0) {
            C22999k.m75643a(c);
        }
    }

    private boolean showSuperEntrance() {
        if (!SplashAdManagerHolder.m132892a((Context) this, true)) {
            return false;
        }
        Keva.getRepo("splash_keva_repo").storeBoolean("key_super_entrance_has_show", true);
        if (this.splashAdNative != null) {
            this.splashAdNative.mo50590a((Context) this);
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getSuperEntranceService().startSuperEntranceActivity(this);
        finish();
        return true;
    }

    private void submitPreload() {
        if (!C6399b.m19944t() && !this.preloadSubmitted) {
            this.preloadSubmitted = true;
            C7121a.m22254e().mo18551a(new C37231a()).mo18552a();
            if (C6857a.m21312e().f19501a) {
                C6857a.m21312e().mo16822a("feed_lego_add_to_request", false);
            }
            ((MainLooperOptService) C7121a.m22243a(MainLooperOptService.class)).updateState(WatchState.WATCH_ACTIVITY);
        }
    }

    public Resources getResources() {
        if (!this.mFirstResumed) {
            C43073dv.m136653b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    public Intent getMainIntent() {
        Intent intent = getIntent();
        SysActionSendShareContext sysActionSendShareContext = new SysActionSendShareContext();
        sysActionSendShareContext.mo95870a(intent);
        Intent intent2 = new Intent(this, ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().mo83137d());
        intent2.setFlags(335544320);
        C25266be.m83035a(intent, intent2);
        C25266be.m83037b(intent, intent2);
        if (!(intent == null || intent.getExtras() == null)) {
            intent2.putExtras(intent.getExtras());
        }
        if (sysActionSendShareContext.f99411a) {
            intent2.putExtra("sys_send_action", sysActionSendShareContext);
            C23479f.m77085a("system_share");
        }
        return intent2;
    }

    public void onResume() {
        this.mFirstResumed = true;
        C6857a.m21312e().mo16818a();
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            return;
        }
        super.onResume();
        if (this.mDirectlyGoMain) {
            goMainActivity();
            return;
        }
        Intent intent = getIntent();
        if (this.mFirstResume && !this.mJumped) {
            this.mFirstResume = false;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null && extras.getBoolean("from_notification")) {
                    C19282c.m63182a(this, "more_tab", "notify_click");
                    C19282c.m63182a(this, "apn", "recall");
                }
            }
            if (quickLaunch()) {
                goMainActivity();
            }
            C43103en.m136721a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void tryShowAdAndGoNext() {
        if (!C43056dh.m136600a()) {
            goMainActivity();
            return;
        }
        boolean e = SplashAdManagerHolder.m132886a(getApplicationContext()).mo50581e();
        SplashAdManagerHolder.f108626a = e;
        if (!e || !showSuperEntrance()) {
            C25074d.m82584a().mo65585b();
            if (!isColdStartFirstView() && C25074d.m82584a().mo65586c()) {
                goMainActivity();
                C18958a f = SplashAdManagerHolder.m132886a(getApplicationContext()).mo50582f();
                C25074d.m82584a();
                C25074d.m82588a(f);
            } else if (!SplashAdManagerHolder.f108626a || !showSplashAd()) {
                goMainActivity();
            } else {
                submitPreload();
            }
        }
    }

    private void mobLaunchMob() {
        String str = "";
        try {
            Intent intent = getIntent();
            Uri uri = null;
            String str2 = "";
            if (intent != null) {
                uri = intent.getData();
                str2 = intent.getStringExtra("_aweme_open_sdk_params_client_key");
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (uri != null) {
                    str = uri.getQueryParameter("gd_label");
                }
                if (booleanExtra || str != null) {
                    if (!TextUtils.isEmpty(str2)) {
                        C7121a.m22248b().mo18559a(new LogLaunchModeTask(uri, str2, LAUNCH_METHOD)).mo18560a();
                    } else {
                        C7121a.m22248b().mo18559a(new LogLaunchModeTask(uri, str2)).mo18560a();
                    }
                    C22995i.m75637a().f60774b = false;
                    return;
                }
            }
            C6907h.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            if (!TextUtils.isEmpty(str2)) {
                C7121a.m22248b().mo18559a(new LogLaunchModeTask(uri, str2, LAUNCH_METHOD)).mo18560a();
            } else {
                C7121a.m22248b().mo18559a(new LogLaunchModeTask(uri, str2)).mo18560a();
            }
            C22995i.m75637a().f60774b = false;
        } catch (Exception unused) {
        }
    }

    private boolean showSplashAd() {
        if (!this.mAllowAd || this.splashAdNative == null) {
            return false;
        }
        C25054b.m82490a().mo65554b();
        C25054b.m82490a().f66144k = true;
        final ViewGroup a = this.splashAdNative.mo50590a((Context) this);
        C25054b.m82490a().f66144k = false;
        if (a == null) {
            return false;
        }
        C6857a.m21312e().mo16818a();
        if (C6870b.m21394b() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        C23487o.m77149b((Activity) this);
        a.setBackgroundResource(R.drawable.bjs);
        int bh = C7213d.m22500a().mo18796bh();
        if (bh > 0) {
            try {
                Thread.sleep((long) bh);
            } catch (InterruptedException unused) {
            }
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        try {
            setContentView(relativeLayout);
            relativeLayout.addView(a);
            a.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    if (!SplashActivity.this.isFirstShow) {
                        SplashActivity.this.isFirstShow = true;
                        a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }
            });
            return true;
        } catch (RuntimeException e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", e.toString());
            C6877n.m21447a("splash_set_content_view", jSONObject);
        } catch (Throwable unused2) {
        }
        return false;
    }

    public void attachBaseContext$___twin___(Context context) {
        if (!PreinstallUtils.m115082a(this)) {
            C28275c.m93003g();
        }
        super.attachBaseContext(context);
    }

    public void handleMsg(Message message) {
        if (this.mAlive && message.what == 100) {
            goMainActivity(message.getData());
        }
    }

    public void goMainActivity(Bundle bundle) {
        submitPreload();
        this.mHandler.removeMessages(100);
        if (!this.mJumped) {
            this.mJumped = true;
            if (this.mAlive) {
                Intent mainIntent = getMainIntent();
                if (bundle != null) {
                    mainIntent.putExtra("extra_splash_data", bundle);
                }
                startActivity(mainIntent);
                if (!isFinishing()) {
                    finish();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PreinstallUtils.m115082a(this)) {
            super.onCreate(bundle);
            PreinstallUtils.m115083b(this);
            finish();
            Process.killProcess(Process.myPid());
            return;
        }
        C6857a.m21312e().mo16827b("cold_boot_application_to_splash", true);
        C6857a.m21312e().mo16822a("cold_boot_splash_duration", true);
        C22473a.m74358a(this);
        C6857a.m21312e().mo16822a("method_splash_super_duration", false);
        setTheme(R.style.ma);
        super.onCreate(bundle);
        C6857a.m21312e().mo16827b("method_splash_super_duration", false);
        C25054b.m82490a().f66141h = true;
        C25054b.m82490a().mo65551a(getIntent());
        C25074d.m82584a().f66188e = true;
        C25074d.m82584a().mo65584a(getIntent());
        if (getIntent() != null && TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") && getIntent().getCategories() != null && getIntent().getCategories().size() > 0 && getIntent().getCategories().contains("android.intent.category.LAUNCHER") && !isTaskRoot() && C23018p.m75672a().mo59990c() && enableSplashLaunchFix()) {
            C6921a.m21552a(4, TAG, "finish SplashActivity directly");
            finish();
        } else if (!isTaskRoot()) {
            goMainActivity();
        } else {
            this.mAlive = true;
            this.mFirstResume = true;
            this.mJumped = false;
            reportLaunchTime();
            mobLaunchMob();
            C22995i.m75637a().f60773a = false;
            C7121a.m22248b().mo18559a(new UploadInstallEventTask()).mo18560a();
            if (sConfirmWelcomeType == ConfirmWelcomeType.NO_WELCOME) {
                this.mTrackSession = true;
                tryInit();
            }
            hotStartIntercept();
            if (!this.mJumped) {
                tryInit();
                if (!quickLaunch()) {
                    if (!C7213d.m22500a().mo18795bg()) {
                        SplashAdManagerHolder.m132886a(getApplicationContext()).mo50581e();
                    }
                    this.splashAdNative = SplashAdManagerHolder.m132886a(getApplicationContext()).mo50577d();
                    this.splashAdNative.mo50591a((C19115e) new C41727a(this));
                    tryShowShortCutDlg();
                }
            }
            C7121a.m22248b().mo18559a(new AntispamApiUploadTask()).mo18560a();
            C7121a.m22248b().mo18559a(new UploadSysStatusTask()).mo18560a();
            C6857a.m21312e().mo16827b("cold_boot_splash_duration", true);
            C6857a.m21312e().mo16822a("cold_boot_splash_to_main", true);
        }
    }

    public boolean tryOpenByScheme(C19142i iVar, C41746k kVar) {
        C42880h.m136156a("openSplashScheme: from = SplashActivity");
        return C41752n.m132949a(this, iVar, kVar);
    }
}
