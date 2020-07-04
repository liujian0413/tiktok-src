package com.p280ss.android.ugc.trill.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.apm.C6148a;
import com.bytedance.apm.p253n.C6288d;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p255e.C6326a;
import com.example.p266a.C6489a;
import com.example.p266a.C6490c;
import com.facebook.imageutils.C6492b;
import com.google.android.play.core.splitcompat.C6546a;
import com.p280ss.android.common.applog.GlobalContext;
import com.p280ss.android.common.config.AppConfig;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.p284b.C6729a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6864ab;
import com.p280ss.android.ugc.aweme.app.C6868au;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.application.initialization.C6867a;
import com.p280ss.android.ugc.aweme.app.launch.C6872b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.app.services.C6883f;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.dynamicfeature.DfDummyInitTask;
import com.p280ss.android.ugc.aweme.dynamicfeature.InstalledModulesReportTask;
import com.p280ss.android.ugc.aweme.feed.C6914a;
import com.p280ss.android.ugc.aweme.i18n.C6927n;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.task.ABTask;
import com.p280ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask;
import com.p280ss.android.ugc.aweme.legoImp.task.C7158v;
import com.p280ss.android.ugc.aweme.legoImp.task.DvmLinearAllocOptTask;
import com.p280ss.android.ugc.aweme.legoImp.task.FontTask;
import com.p280ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask;
import com.p280ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.p280ss.android.ugc.aweme.miniapp.utils.MiniAppInitTask;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.net.C7180p;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p340x.C7283a;
import com.p280ss.android.ugc.aweme.setting.TiktokSkinHelper;
import com.p280ss.android.ugc.aweme.thread.C7263j;
import com.p280ss.android.ugc.aweme.utils.C7274ep;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.trill.p1765g.C44997a;
import com.p280ss.android.ugc.trill.p343h.C7300a;
import com.p280ss.android.ugc.webpcompat.IWebpErrorCallback;
import com.p280ss.android.ugc.webpcompat.WebpCompatManager;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.ugc.trill.app.TrillApplication */
public abstract class TrillApplication extends AwemeApplication {

    /* renamed from: e */
    private long f20379e = -1;

    /* renamed from: f */
    private boolean f20380f;

    /* renamed from: g */
    C6867a f20381g;

    /* renamed from: h */
    protected final Handler f20382h = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private void m22860j() {
        m22861k();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContextAfterMultiDex() {
        C7299c.attachBaseContextAfterMultiDex(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo16889d();

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo19030f() {
        GlobalContext.setContext(this);
        C7276d.m22804a((Context) this);
    }

    public Resources getResources() {
        Resources resources = super.getResources();
        TiktokSkinHelper.m22465a(resources);
        return resources;
    }

    /* renamed from: k */
    private void m22861k() {
        C6927n.m21572a(new Callable<Boolean>() {
            public final /* synthetic */ Object call() throws Exception {
                return m22869a();
            }

            /* renamed from: a */
            private static Boolean m22869a() {
                return Boolean.valueOf(C44997a.m141971a());
            }
        });
    }

    /* renamed from: n */
    private void m22864n() {
        C6490c.m20173a((C6489a) new C6489a() {
            /* renamed from: a */
            public final boolean mo15806a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                String str;
                C6869c a = C6869c.m21381a();
                String str2 = "exit_type";
                if (renderProcessGoneDetail.didCrash()) {
                    str = "crash";
                } else {
                    str = "system kill";
                }
                a.mo16887a(str2, str);
                a.mo16885a("renderer_priority", Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
                a.mo16887a("WebView", webView.getClass().getCanonicalName());
                boolean didCrash = renderProcessGoneDetail.didCrash();
                C6893q.m21444a("aweme_webview_render_exception", didCrash ? 1 : 0, a.mo16888b());
                return true;
            }
        });
    }

    public TrillApplication() {
        C6870b.m21392a("disabled");
        try {
            m22862l();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private static void mo16890e() {
        C6857a.m21312e().mo16822a("method_init_ttnet_duration", false);
        new C7180p().run();
        C6857a.m21312e().mo16827b("method_init_ttnet_duration", false);
    }

    /* renamed from: g */
    public final boolean mo19031g() {
        if (this.f20379e == -1) {
            this.f20379e = C6868au.m21378a((Context) this);
        }
        if (this.f20379e == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m22859i() {
        C6857a.m21312e().mo16822a("method_mini_app_duration", false);
        MiniAppInitTask.injectInitParamsInAdvance();
        if (!C6776h.m20947b(this)) {
            IMiniAppService a = C7167b.m22380b().mo18647a();
            if (a != null) {
                a.initMiniApp();
            }
        }
        C6857a.m21312e().mo16827b("method_mini_app_duration", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void mo19032h() {
        C6857a.m21312e().mo16822a("method_init_webp_compat", false);
        C6492b.m20176a(C7298b.f20386a);
        WebpCompatManager.getInstance(this).init(new IWebpErrorCallback() {
            public final void onWebpError(int i, String str) {
                C6869c a = C6869c.m21381a();
                a.mo16887a("info", "WebpCompat have some Exception!").mo16887a("product", "musically/tiktok").mo16885a("errorCode", Integer.valueOf(i)).mo16887a("errorDesc", str);
                C6893q.m21444a("type_log_webp_error", i, a.mo16888b());
            }
        });
        C6857a.m21312e().mo16827b("method_init_webp_compat", false);
    }

    /* renamed from: l */
    private static void m22862l() {
        C6399b.m19925a("api2.musical.ly", "ichannel.musical.ly", "api2.musical.ly");
        C6729a.m20876a(C6399b.m19926b().f18690a, C6399b.m19926b().f18691b, C6399b.m19926b().f18692c);
        C6729a.m20875a("musical_ly");
        AppConfig.setDomainConfigUrl("/ies/network/aweme/");
        if (C6399b.m19947w()) {
            AppConfig.setConfigServers(new String[]{"dm16.tiktokv.com", "dm16.byteoversea.com", "dm-maliva16.byteoversea.com"});
            return;
        }
        AppConfig.setConfigServers(new String[]{"dm16.musical.ly", "dm-maliva16.byteoversea.com", "dm16.byteoversea.com"});
    }

    public void onCreate() {
        if (!this.f20380f) {
            if (this.f19515c) {
                C6857a.m21312e().mo16827b("cold_boot_application_attach_to_create", true);
                C6857a.m21312e().mo16822a("cold_boot_application_create_duration", true);
            }
            new ABTask().run(this);
            mo16890e();
            if (this.f19515c) {
                C7121a.m22248b().mo18559a(new InitStorageManagerTask()).mo18559a(C7158v.m22353c()).mo18559a(C7158v.m22351a(m21341a())).mo18559a(C6903bc.m21465F().mo16865l()).mo18559a(new FontTask()).mo18560a();
            }
            C7300a.m22874a(this.f19515c, (Context) this);
            C6903bc.m21465F().mo16856d(this);
            C7121a.m22248b().mo18559a(C6903bc.m21465F().mo16862i()).mo18559a(new DvmLinearAllocOptTask()).mo18560a();
            if (this.f19515c) {
                C7121a.m22248b().mo18559a(new AppFlyerLoadPropertiesTask()).mo18559a(C7158v.m22355e()).mo18559a(C6903bc.m21465F().mo16861h()).mo18559a(C7158v.m22350a()).mo18559a(C6903bc.m21465F().mo16877x()).mo18559a(C6903bc.m21465F().mo16863j()).mo18560a();
            }
            C6857a.m21312e().mo16822a("method_thread_pool_inject_duration", false);
            C7263j.m22756a(C6399b.m19928c());
            C6857a.m21312e().mo16827b("method_thread_pool_inject_duration", false);
            C7274ep.m22778d();
            C6877n.m21446a("aweme_app_performance", "multidex_time", (float) this.f19516d);
            m22860j();
            super.onCreate();
            this.f20381g.mo16881b(this);
            C6288d a = new C6288d().mo15084b(true).mo15082a(50000).mo15083a(false).mo15081a(700);
            C6857a.m21312e().mo16822a("method_init_apm_duration", false);
            C6148a.m19085a().mo14819a(a);
            C6148a.m19086a((Context) this);
            C6857a.m21312e().mo16827b("method_init_apm_duration", false);
            C7121a.m22248b().mo18559a(new InstalledModulesReportTask()).mo18560a();
            if (this.f19515c) {
                C7121a.m22248b().mo18559a(new DfDummyInitTask(true)).mo18560a();
            }
            String c = C6776h.m20949c(getApplicationContext());
            if (this.f19515c || (c != null && c.contains("miniapp"))) {
                C7121a.m22248b().mo18559a(new MiniAppInitTask(this.f19515c)).mo18560a();
                m22859i();
            }
            if (this.f19515c) {
                C6857a.m21312e().mo16827b("cold_boot_application_create_duration", true);
                C6857a.m21312e().mo16822a("cold_boot_application_to_main", true);
                C6857a.m21312e().f19503c = System.currentTimeMillis();
            }
            if (this.f19515c) {
                C6903bc.m21465F().mo16849a((Application) this);
            }
            m22864n();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f20380f) {
            super.onConfigurationChanged(configuration);
            C6903bc.m21465F().mo16875v();
        }
    }

    public void onTrimMemory(int i) {
        if (!this.f20380f) {
            super.onTrimMemory(i);
            if (mo19031g()) {
                C7121a.m22248b().mo18559a(new TrimMemoryTask(i)).mo18560a();
            }
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C6872b.m21398a(this);
        C6857a.m21312e().mo16822a("cold_boot_application_attach_before_base_duration", false);
        C6326a.m19640a(context, "14.7.4", null);
        C7283a.m22836a(context);
        C6914a.m21540b();
        C6857a.m21312e().mo16827b("cold_boot_application_attach_before_base_duration", false);
        this.f19515c = C6776h.m20947b(this);
        if (this.f19515c) {
            long currentTimeMillis = System.currentTimeMillis();
            C6857a.m21312e().mo16822a("feed_boot_to_feed_request", true);
            C6857a.m21312e().mo16822a("cold_boot_application_attach_duration", true);
            C6857a.m21312e().mo16822a("feed_cover_total", false);
            C6857a.m21312e().mo16822a("feed_total", true);
            C6857a.m21312e().mo16822a("app_start_to_main_focus", true);
            C6857a.m21312e().mo16822a("cold_boot_start_to_feed_ui", false);
            C6857a.m21312e().f19502b = currentTimeMillis;
        }
        f19513a = this;
        C6546a.m20342b((Context) this);
        ((ThreadPoolExecutor) AsyncTask.THREAD_POOL_EXECUTOR).setRejectedExecutionHandler(new C6864ab());
        this.f20380f = C6883f.m21416a((Application) this);
        if (!this.f20380f) {
            this.f19516d = System.currentTimeMillis() - C6857a.m21312e().f19502b;
            attachBaseContextAfterMultiDex();
        }
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        String c = C6776h.m20949c(this);
        if (!C6319n.m19593a(c) && !C6319n.m19593a(str) && c.endsWith(":ad") && VERSION.SDK_INT < 19) {
            StringBuilder sb = new StringBuilder("ad_");
            sb.append(str);
            str = sb.toString();
        }
        return super.openOrCreateDatabase(str, i, cursorFactory);
    }
}
