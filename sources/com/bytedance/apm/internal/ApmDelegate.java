package com.bytedance.apm.internal;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.C6179d;
import com.bytedance.apm.C6179d.C6181a;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventListener;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.core.C6178c;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.apm.impl.SlardarConfigManagerImpl;
import com.bytedance.apm.p236a.C6151a;
import com.bytedance.apm.p236a.C6153c;
import com.bytedance.apm.p236a.C6154d;
import com.bytedance.apm.p236a.p237b.C6152a;
import com.bytedance.apm.p238b.C6171a;
import com.bytedance.apm.p239c.C6175a;
import com.bytedance.apm.p240d.C6183a;
import com.bytedance.apm.p240d.C6183a.C6184a;
import com.bytedance.apm.p240d.C6186b;
import com.bytedance.apm.p240d.C6186b.C6187a;
import com.bytedance.apm.p241f.C6189a;
import com.bytedance.apm.p241f.C6202e;
import com.bytedance.apm.p241f.p242a.C6191a;
import com.bytedance.apm.p241f.p242a.C6192b;
import com.bytedance.apm.p241f.p242a.C6195c;
import com.bytedance.apm.p245h.C6214f;
import com.bytedance.apm.p246i.C6216b;
import com.bytedance.apm.p248k.C6245b;
import com.bytedance.apm.p248k.C6248c;
import com.bytedance.apm.p248k.C6249d;
import com.bytedance.apm.p248k.C6253e;
import com.bytedance.apm.p248k.C6254f;
import com.bytedance.apm.p248k.C6259g;
import com.bytedance.apm.p249l.C6265a;
import com.bytedance.apm.p249l.C6269c;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p253n.C6283a;
import com.bytedance.apm.p253n.C6284b;
import com.bytedance.apm.p253n.C6285c;
import com.bytedance.apm.p253n.C6288d;
import com.bytedance.apm.util.C6290a;
import com.bytedance.apm.util.C6292i;
import com.bytedance.frameworks.core.apm.C6348a;
import com.bytedance.frameworks.core.apm.C6360b;
import com.bytedance.news.common.service.manager.C6445a;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.p066a.p067a.p070b.C2072a;
import com.bytedance.p066a.p067a.p070b.p071a.C2076a;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.services.apm.api.C6479g;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class ApmDelegate implements C6480a {
    private C6183a mApmInitConfig;
    public C6186b mApmStartConfig;
    private C6216b mApmStartListener;
    private volatile boolean mConfigReady;
    private List<String> mDefaultCongfigUrlsCompat;
    private List<String> mDefaultLogReportUrlsCompat;
    private boolean mEnableActiveUploadAlog;
    private List<String> mExceptionLogReportUrlsCompat;
    private volatile ExecutorService mExecutors;
    private volatile boolean mInited;
    private boolean mIsMainProcess;
    public SlardarConfigManagerImpl mSlardarConfigManager;
    private volatile boolean mStarted;
    private C6288d mTraceConfig;
    private C6283a mTraceListener;
    public Set<Object> mWidgetSet;

    /* renamed from: com.bytedance.apm.internal.ApmDelegate$a */
    static class C6235a {

        /* renamed from: a */
        public static final ApmDelegate f18353a = new ApmDelegate();
    }

    public static ApmDelegate getInstance() {
        return C6235a.f18353a;
    }

    private void initMethodTrace(Application application) {
    }

    public boolean isConfigReady() {
        return this.mConfigReady;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    private ApmDelegate() {
        this.mEnableActiveUploadAlog = true;
    }

    public void startInternalSafely() {
        try {
            startInternal();
        } catch (Exception unused) {
        }
    }

    public C6183a getApmInitConfig() {
        if (this.mApmInitConfig == null) {
            return C6183a.m19176a().mo14897a();
        }
        return this.mApmInitConfig;
    }

    public void onReady() {
        this.mConfigReady = true;
        if (this.mApmStartListener != null) {
            this.mApmStartListener.mo14954a();
        }
    }

    public void clearBufferLog() {
        if (this.mInited && this.mStarted) {
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    if (C6174c.m19145c()) {
                        C6202e.m19259a().mo14935c();
                        C6360b.m19768a().mo15272b();
                    }
                }
            });
        }
    }

    public void destroyAllPlugins() {
        if (this.mWidgetSet != null) {
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    Iterator it = ApmDelegate.this.mWidgetSet.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }
    }

    public C6187a newStartConfigBuilder() {
        if (this.mStarted) {
            return C6186b.m19185a(this.mApmStartConfig);
        }
        new String[1][0] = "apm sdk only can get startconfigBuilder after start finished";
        return C6186b.m19184a();
    }

    public void startAllPlugins() {
        if (this.mWidgetSet != null) {
            Iterator it = this.mWidgetSet.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void stopAllPlugins() {
        if (this.mWidgetSet != null) {
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    Iterator it = ApmDelegate.this.mWidgetSet.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }
    }

    private void checkWhetherFirstInstall() {
        String a = C6237b.m19335a().mo15020a("update_version_code");
        String optString = C6174c.m19152j().optString("update_version_code");
        if (!TextUtils.equals(a, optString)) {
            C6174c.m19132a(1);
            C6237b.m19335a().mo15022a("update_version_code", optString);
            return;
        }
        C6174c.m19132a(2);
    }

    private void registerServiceWhenStart() {
        this.mSlardarConfigManager = new SlardarConfigManagerImpl();
        this.mSlardarConfigManager.registerConfigListener(this);
        C6446c.m20129a(IConfigManager.class, this.mSlardarConfigManager);
        C6446c.m20128a(IMonitorLogManager.class, (C6445a<T>) new C6445a<IMonitorLogManager>() {
            /* renamed from: b */
            private static IMonitorLogManager m19326b() {
                return new MonitorLogManagerImpl();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo15015a() {
                return m19326b();
            }
        });
        C6446c.m20128a(IActivityLifeManager.class, (C6445a<T>) new C6445a<IActivityLifeManager>() {
            /* renamed from: b */
            private static IActivityLifeManager m19328b() {
                return ActivityLifeObserver.getInstance();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo15015a() {
                return m19328b();
            }
        });
        C6446c.m20128a(IApmAgent.class, (C6445a<T>) new C6445a<IApmAgent>() {
            /* renamed from: b */
            private static IApmAgent m19330b() {
                return new ApmAgentServiceImpl();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo15015a() {
                return m19330b();
            }
        });
        C6446c.m20128a(ILaunchTrace.class, (C6445a<T>) new C6445a<ILaunchTrace>() {
            /* renamed from: b */
            private static ILaunchTrace m19332b() {
                return new LaunchTraceImpl();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo15015a() {
                return m19332b();
            }
        });
    }

    private void compatV4() {
        if (C6292i.m19525a(this.mApmStartConfig.f18195a) && !C6292i.m19525a(this.mDefaultCongfigUrlsCompat)) {
            this.mApmStartConfig.f18195a = this.mDefaultCongfigUrlsCompat;
        }
        if (C6292i.m19525a(this.mApmStartConfig.f18196b) && !C6292i.m19525a(this.mDefaultLogReportUrlsCompat)) {
            this.mApmStartConfig.f18196b = this.mDefaultLogReportUrlsCompat;
        }
        if (C6292i.m19525a(this.mApmStartConfig.f18197c) && !C6292i.m19525a(this.mExceptionLogReportUrlsCompat)) {
            this.mApmStartConfig.f18197c = this.mExceptionLogReportUrlsCompat;
        }
    }

    private void initPerfMonitor() {
        if (this.mApmStartConfig.f18204j) {
            C6171a.m19119a().mo15024f();
        }
        new C6248c().mo15024f();
        new C6253e().mo15024f();
        if (this.mIsMainProcess) {
            new C6254f().mo15024f();
            if (this.mApmStartConfig.f18199e) {
                new C6259g(this.mApmStartConfig.f18200f).mo15024f();
            }
            if (this.mApmStartConfig.f18198d) {
                new C6249d().mo15024f();
            }
            if (this.mApmStartConfig.f18203i) {
                new C6245b().mo15024f();
            }
            C2072a.m9150b().mo7730a();
        }
        if (this.mApmStartConfig.f18201g) {
            C6175a aVar = new C6175a();
            C6175a.m19156a(this.mApmStartConfig.f18202h);
            aVar.mo14868a();
            if (ActivityLifeObserver.getInstance().isForeground()) {
                aVar.mo14869b();
            }
        }
    }

    private void startInternal() {
        C6174c.m19142b(System.currentTimeMillis());
        compatV4();
        C6179d.m19171a().f18171a = new C6181a() {
            /* renamed from: a */
            public final void mo14891a(String str) {
                C2077a.m9159a(str);
            }

            /* renamed from: a */
            public final void mo14892a(Throwable th, String str) {
                C2077a.m9161a(th, str);
            }
        };
        C6174c.m19138a(this.mApmStartConfig.f18206l);
        C6174c.m19135a(this.mApmStartConfig.f18207m);
        C6174c.m19136a(this.mApmStartConfig.f18208n);
        C6174c.m19143b(this.mApmStartConfig.f18198d);
        this.mWidgetSet = this.mApmStartConfig.f18209o;
        C6202e.m19259a().mo14934b();
        if (this.mIsMainProcess) {
            C6269c.m19445a().mo15057a(this.mApmStartConfig);
        }
        initPerfMonitor();
        C6191a.m19218b().mo14916a(this.mApmStartConfig.f18212r);
        C6195c.m19233b().mo14916a(this.mApmStartConfig.f18212r);
        C6192b.m19221b().mo14916a(this.mApmStartConfig.f18212r);
        C6151a.m19091a(C6174c.m19129a());
        C6273b.m19475a().mo15067a(new Runnable() {
            public final void run() {
                ApmDelegate.this.mSlardarConfigManager.initParams(new C6178c() {
                    /* renamed from: a */
                    public final Map<String, String> mo14888a() {
                        return C6174c.m19151i();
                    }
                }, ApmDelegate.this.mApmStartConfig.f18195a);
                if (!ApmDelegate.this.mApmStartConfig.f18205k || !C6174c.m19145c()) {
                    ApmDelegate.this.mSlardarConfigManager.fetchConfig();
                } else {
                    ApmDelegate.this.mSlardarConfigManager.forceUpdateFromRemote(null, null);
                }
            }
        }, this.mApmStartConfig.f18210p * 1000);
        if (this.mIsMainProcess) {
            checkWhetherFirstInstall();
            saveVersionInfo(C6174c.m19152j());
        }
        initAllPlugins(C6174c.m19129a());
        C6479g gVar = new C6479g();
        gVar.f18799a = this.mApmStartConfig.f18196b;
        notifyPluginsParams(gVar);
        startAllPlugins();
        this.mExecutors = this.mApmStartConfig.f18213s;
        injectReportUrl(this.mApmStartConfig);
        this.mApmStartListener = this.mApmStartConfig.f18211q;
        AutoLaunchTraceHelper.reportStats();
    }

    public void setTraceListener(C6283a aVar) {
        this.mTraceListener = aVar;
    }

    public void setTraceConfig(C6288d dVar) {
        if (dVar != null) {
            this.mTraceConfig = dVar;
        }
    }

    public void clearLegacyLog(final long j) {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                if (C6174c.m19145c()) {
                    C6360b.m19768a().mo15273b(j);
                }
            }
        });
    }

    public void restart(final C6186b bVar) {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                ApmDelegate.this.restartInternal(bVar);
            }
        });
    }

    public void setConfigUrlCompat(List<String> list) {
        if (!this.mStarted && !C6292i.m19525a(list)) {
            this.mDefaultCongfigUrlsCompat = list;
        }
    }

    public void setDefaultLogReportUrlsCompat(List<String> list) {
        if (!this.mStarted && !C6292i.m19525a(list)) {
            this.mDefaultLogReportUrlsCompat = list;
        }
    }

    public void setExceptionLogReportUrlsCompat(List<String> list) {
        if (!this.mStarted && !C6292i.m19525a(list)) {
            this.mExceptionLogReportUrlsCompat = list;
        }
    }

    private void initAllPlugins(Context context) {
        if (this.mWidgetSet != null) {
            Iterator it = this.mWidgetSet.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public boolean getLogTypeSwitch(String str) {
        if (!this.mConfigReady || this.mSlardarConfigManager == null) {
            return false;
        }
        return this.mSlardarConfigManager.getLogTypeSwitch(str);
    }

    public boolean getMetricsTypeSwitch(String str) {
        if (!this.mConfigReady || this.mSlardarConfigManager == null) {
            return false;
        }
        return this.mSlardarConfigManager.getMetricTypeSwitch(str);
    }

    public boolean getServiceNameSwitch(String str) {
        if (!this.mConfigReady || this.mSlardarConfigManager == null) {
            return false;
        }
        return this.mSlardarConfigManager.getServiceSwitch(str);
    }

    public void notifyPluginsParams(C6479g gVar) {
        if (this.mWidgetSet != null) {
            Iterator it = this.mWidgetSet.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void submitTask(Runnable runnable) {
        if (this.mExecutors == null) {
            synchronized (this) {
                if (this.mExecutors == null) {
                    this.mExecutors = C6236a.m19334a(1);
                }
            }
        }
        this.mExecutors.submit(runnable);
    }

    private void injectReportUrl(C6186b bVar) {
        List<String> list = bVar.f18196b;
        if (!C6292i.m19525a(list)) {
            try {
                String host = new URL((String) list.get(0)).getHost();
                C6265a.m19435a(host);
                C6152a.m19097a(host);
            } catch (MalformedURLException unused) {
            }
        }
        List<String> list2 = bVar.f18197c;
        if (!C6292i.m19525a(list)) {
            C2077a.m9165b((String) list2.get(0));
        }
    }

    private void saveVersionInfo(JSONObject jSONObject) {
        if (jSONObject != null) {
            C6214f fVar = new C6214f(jSONObject.optString("version_code"), jSONObject.optString("version_name"), jSONObject.optString("manifest_version_code"), jSONObject.optString("update_version_code"), jSONObject.optString("app_version"));
            C6348a.m19690a().mo15235a(fVar);
        }
    }

    public void init(Context context) {
        C6184a a = C6183a.m19176a();
        a.mo14895a(this.mTraceListener);
        if (this.mTraceConfig != null) {
            a.mo14896a(this.mTraceConfig.f18529b);
            a.mo14894a(this.mTraceConfig.f18528a);
            a.mo14899b(this.mTraceConfig.f18531d);
            a.mo14898b((long) this.mTraceConfig.f18530c);
        }
        init(context, a.mo14897a());
    }

    public void start(C6186b bVar) {
        if (!this.mInited) {
            throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start(). If you have any questions, pls lark wangkai.android");
        } else if (bVar == null) {
            throw new IllegalArgumentException("startConfig must not be allowed");
        } else if (!this.mStarted) {
            this.mStarted = true;
            this.mApmStartConfig = bVar;
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    ApmDelegate.this.startInternalSafely();
                }
            });
        }
    }

    public void restartInternal(C6186b bVar) {
        this.mApmStartConfig = bVar;
        C6174c.m19138a(bVar.f18206l);
        C6174c.m19135a(bVar.f18207m);
        C6174c.m19136a(bVar.f18208n);
        C6174c.m19143b(bVar.f18198d);
        if (this.mIsMainProcess) {
            C6269c.m19445a().mo15061b(bVar);
            this.mSlardarConfigManager.forceUpdateFromRemote(new C6178c() {
                /* renamed from: a */
                public final Map<String, String> mo14888a() {
                    return C6174c.m19151i();
                }
            }, bVar.f18195a);
            saveVersionInfo(C6174c.m19152j());
        }
        C6191a.m19218b().f18234a = bVar.f18212r;
        C6195c.m19233b().f18234a = bVar.f18212r;
        C6192b.m19221b().f18234a = bVar.f18212r;
        injectReportUrl(this.mApmStartConfig);
        this.mExecutors = bVar.f18213s;
    }

    public void onRefresh(JSONObject jSONObject, boolean z) {
        this.mApmInitConfig.mo14893a(jSONObject);
        this.mEnableActiveUploadAlog = jSONObject.optBoolean("enable_active_upload_alog", true);
    }

    public void init(Context context, C6183a aVar) {
        if (!this.mInited) {
            this.mInited = true;
            this.mApmInitConfig = aVar;
            if (this.mTraceListener != null) {
                this.mApmInitConfig.f18177d = this.mTraceListener;
            }
            if (this.mTraceConfig != null) {
                this.mApmInitConfig.f18175b = this.mTraceConfig.f18529b;
                this.mApmInitConfig.f18176c = this.mTraceConfig.f18528a;
                this.mApmInitConfig.f18178e = this.mTraceConfig.f18531d;
                this.mApmInitConfig.f18179f = (long) this.mTraceConfig.f18530c;
            }
            C6189a.m19203a(aVar.f18174a);
            C6284b.m19496a(aVar.f18180g);
            C6284b.m19498a(aVar.f18181h);
            Application a = C6290a.m19516a(context);
            C6174c.m19134a((Context) a);
            ActivityLifeObserver.init(a);
            registerServiceWhenStart();
            C6174c.m19137a(aVar.f18183j);
            this.mIsMainProcess = C6174c.m19145c();
            if (this.mIsMainProcess) {
                if (aVar.f18175b) {
                    new C6285c().mo15078a();
                }
                AutoPageTraceHelper.setMaxValidTimeMs(aVar.f18176c);
                initMethodTrace(a);
                C6174c.m19133a(System.currentTimeMillis());
            }
            OkHttpEventListener.setIgnoreMonitorLabel(this.mApmInitConfig.f18182i);
        }
    }

    public void activeUploadAlog(String str, long j, long j2, String str2, C2076a aVar) {
        if (this.mEnableActiveUploadAlog) {
            final String str3 = str;
            final long j3 = j;
            final long j4 = j2;
            final String str4 = str2;
            final C2076a aVar2 = aVar;
            C62327 r0 = new Runnable() {
                public final void run() {
                    C6151a.m19092a(str3, j3, j4, str4, aVar2);
                }
            };
            submitTask(r0);
        }
    }

    public void activeUploadAlog(String str, long j, long j2, String str2, C6154d dVar, C6153c cVar) {
        if (this.mEnableActiveUploadAlog) {
            final String str3 = str;
            final long j3 = j;
            final long j4 = j2;
            final String str4 = str2;
            final C6154d dVar2 = dVar;
            final C6153c cVar2 = cVar;
            C62316 r0 = new Runnable() {
                public final void run() {
                    C6151a.m19094a(str3, j3, j4, str4, dVar2, cVar2);
                }
            };
            submitTask(r0);
        }
    }
}
