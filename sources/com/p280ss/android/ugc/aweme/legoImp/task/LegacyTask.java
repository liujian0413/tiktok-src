package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.reflect.C6322b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.bytedance.polaris.depend.C12428i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.AppLog.LogRequestTraceCallback;
import com.p280ss.android.common.applog.CrashUtil;
import com.p280ss.android.common.config.AppConfig;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.newmedia.C19925b;
import com.p280ss.android.p293di.push.C6804a;
import com.p280ss.android.statistic.C20413c;
import com.p280ss.android.statistic.Configuration;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22999k;
import com.p280ss.android.ugc.aweme.app.C6868au;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.CommandDispatcher;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.p280ss.android.ugc.aweme.app.application.task.TokenSdkTask;
import com.p280ss.android.ugc.aweme.app.launch.C23004d;
import com.p280ss.android.ugc.aweme.app.launch.C23008e;
import com.p280ss.android.ugc.aweme.app.launch.C23012f;
import com.p280ss.android.ugc.aweme.app.launch.p1038a.C23003a;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.sec.C37418h;
import com.p280ss.android.ugc.aweme.sec.C37419i;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.services.MainServiceForPush;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.statistic.C41756a;
import com.p280ss.android.ugc.aweme.utils.C43056dh;
import com.p280ss.android.usergrowth.C7304c;
import com.p280ss.sys.p1806ck.SCCheckCallback;
import com.p280ss.sys.p1806ck.SCCheckUtils;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegacyTask */
public class LegacyTask implements LegoTask {
    private Application application;
    private String deviceId = C10981a.m32174d();
    private boolean mainProcess;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegacyTask$DeviceIdChangeTask */
    class DeviceIdChangeTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private DeviceIdChangeTask() {
        }

        public void run(Context context) {
            C7121a.m22248b().mo18559a(C6903bc.m21465F().mo16853c()).mo18559a(C6903bc.m21465F().mo16855d()).mo18560a();
            C23003a.m75651a(false);
            C6903bc.m21465F().mo16870q();
            if (C6903bc.m21465F().mo16871r()) {
                C12428i.m36165o();
            }
        }
    }

    private void setColorMode() {
        C7212bb.m22497b();
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    private void checkAppReplacingState() {
        if (this.application.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
    }

    private void misSetupInAllProcess() {
        C37418h.m120054a(new C37419i());
        C29960a.m98231a(this.application);
    }

    private void registerSecInitCallBack() {
        SCCheckUtils.resgisterSCCheckUtilsCallBack(new SCCheckCallback() {
            public final HashMap<String, String> getRequestParams() {
                HashMap<String, String> hashMap = new HashMap<>();
                if (!((Boolean) SharePrefCache.inst().getTTRegion().mo59877d()).booleanValue()) {
                    hashMap.put("pass-region", "1");
                }
                return hashMap;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void registerBroadcastReceivers() {
        C6903bc.m21465F().mo16850a((Context) this.application);
    }

    private void installCustomActivityOnCrash() {
        CustomActivityOnCrash.m7911a(C6903bc.m21465F().mo16848a());
        CustomActivityOnCrash.m7909a((Context) this.application);
    }

    private void miscSetupInMainProcess() {
        NetworkUtils.setCommandListener(CommandDispatcher.m74907b());
        StringBuilder sb = new StringBuilder(C22909c.f60638b);
        sb.append(C6399b.m19935k());
        C7304c.m22879a(sb.toString());
    }

    private void antispamReportInstall() {
        boolean z;
        if (C22999k.m75642a() != ((int) C6399b.m19933i())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("install");
        }
    }

    public void initAppData() {
        C6903bc.m21465F().mo16860g();
        C23004d.m75652a(this.application);
        C23012f.m75664a();
        C10981a.m32176f().mo19325f((C7326g<? super T>) new C32411p<Object>(this));
        C23008e.m75658a(this.application);
        C6903bc.m21465F().mo16851b();
    }

    private void initApplog() {
        try {
            AppLog.setUseGoogleAdId(true);
        } catch (IllegalStateException e) {
            StringBuilder sb = new StringBuilder("initApplog startLaunch:");
            sb.append(System.currentTimeMillis() - C6857a.m21312e().f19502b);
            C6921a.m21555a(sb.toString());
            C6921a.m21555a(CrashUtil.getCrashInfo(this.application, Thread.currentThread(), e).toString());
            C6877n.m21447a("app_crash", CrashUtil.getCrashInfo(this.application, Thread.currentThread(), e));
            C6921a.m21554a((Exception) e);
        }
        AppLog.registerLogRequestCallback(new LogRequestTraceCallback() {
            public final void onEventDiscard(int i) {
            }

            public final void onEventExpired(List<Long> list) {
            }

            public final void onEventInsertResult(boolean z, long j) {
            }

            public final void onLogRequestResult(boolean z, List<Long> list) {
            }

            public final void onLogDataStateChange(String str, String str2, String str3, boolean z, String str4) {
                if ("terminate".equals(str)) {
                    C6877n.m21447a("type_app_log_state_change", C6869c.m21381a().mo16887a("data_source", str).mo16887a("session_id", str2).mo16885a("is_success", Integer.valueOf(z ^ true ? 1 : 0)).mo16887a("eventIndex", str3).mo16887a("error_message", str4).mo16888b());
                }
            }
        });
        AppConfig.getInstance(this.application).setFirstActivityCreate();
        C28580o.m93829a((Context) this.application);
        C7121a.m22248b().mo18559a(new CommonParamsInitTask()).mo18560a();
        C41756a.m132956a(this.application);
    }

    private void antispamUpdateDeviceId(String str) {
        String installId = AppLog.getInstallId();
        if (installId == null) {
            installId = "";
        }
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).updateDeviceIdAndInstallId(str, installId);
    }

    private void initPushProcess(String str) {
        if (C6868au.m21380a(this.application, ":push")) {
            AppConfig.getInstance(this.application).tryRefreshConfig();
        }
    }

    private void updateFirebaseId(String str) {
        if (this.mainProcess) {
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(this.application);
            if (!TextUtils.isEmpty(str)) {
                instance.mo47130a(str);
            }
        }
    }

    private void initAdProcess(String str) {
        if (!C6319n.m19593a(str) && str.endsWith(":ad") && VERSION.SDK_INT >= 19) {
            try {
                C6322b.m19610a((Object) this).mo15157a("mBase", (Object) new C19925b(this.application.getBaseContext()));
            } catch (Throwable unused) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    public void onDeviceIDChange(String str) {
        if (!TextUtils.equals(this.deviceId, str)) {
            this.deviceId = str;
            if (!TextUtils.isEmpty(this.deviceId)) {
                updateFirebaseId(AppLog.getServerDeviceId());
                Configuration configuration = C20413c.m67737a().f55142a;
                if (configuration != null) {
                    configuration.f55097e = this.deviceId;
                    C20413c.m67737a().mo54957a(configuration);
                }
                antispamUpdateDeviceId(this.deviceId);
                antispamReportInstall();
                C7121a.m22248b().mo18559a(new DeviceIdChangeTask()).mo18560a();
            }
        }
    }

    public void run(Context context) {
        this.application = (Application) context;
        this.mainProcess = C6776h.m20947b(context);
        misSetupInAllProcess();
        registerSecInitCallBack();
        C7121a.m22248b().mo18559a(new TokenSdkTask()).mo18560a();
        if (this.mainProcess) {
            miscSetupInMainProcess();
            initAppData();
        } else {
            String c = C6776h.m20949c(this.application);
            initAdProcess(c);
            initPushProcess(c);
        }
        initApplog();
        checkAppReplacingState();
        registerBroadcastReceivers();
        setColorMode();
        C6857a.m21312e().mo16822a("method_init_push_duration", false);
        if (C43056dh.m136600a()) {
            C6804a.m21138a().init(context, new MainServiceForPush());
        }
        C6857a.m21312e().mo16827b("method_init_push_duration", false);
    }
}
