package com.bytedance.ies.ugc.statisticlogger.config;

import com.bytedance.common.utility.C6317k;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.bytedance.ies.ugc.statisticlogger.C10985c;
import com.p280ss.android.common.applog.AliYunUUIDHandler;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.AppLog.ConfigUpdateListener;
import com.p280ss.android.common.applog.AppLog.ILogEncryptConfig;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.deviceregister.C6789d.C6790a;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C47844a;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b */
public final class C10988b {

    /* renamed from: a */
    public static final C10988b f29719a = new C10988b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C47844a<ConfigUpdateEvent> f29720b;

    /* renamed from: c */
    private static final C10991c f29721c = new C10991c();

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$a */
    public static final class C10989a implements ILogEncryptConfig {
        C10989a() {
        }

        public final boolean getEventV3Switch() {
            return true;
        }

        public final boolean getRecoverySwitch() {
            return true;
        }

        public final boolean getEncryptSwitch() {
            if (!C6399b.m19928c()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$b */
    static final class C10990b<T> implements C7326g<ConfigUpdateEvent> {

        /* renamed from: a */
        public static final C10990b f29722a = new C10990b();

        C10990b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$c */
    public static final class C10991c implements ConfigUpdateListener {
        C10991c() {
        }

        public final void onConfigUpdate() {
            C10981a.f29700a.mo26539g();
            C10988b.f29720b.onNext(ConfigUpdateEvent.Local);
        }

        public final void onRemoteConfigUpdate(boolean z) {
            C10981a.f29700a.mo26539g();
            C10988b.f29720b.onNext(ConfigUpdateEvent.Remote);
        }
    }

    private C10988b() {
    }

    /* renamed from: a */
    public static C7492s<ConfigUpdateEvent> m32200a() {
        return f29720b;
    }

    static {
        C47844a<ConfigUpdateEvent> a = C47844a.m148742a();
        C7573i.m23582a((Object) a, "BehaviorSubject.create<ConfigUpdateEvent>()");
        f29720b = a;
    }

    /* renamed from: a */
    public static void m32201a(C10992c cVar) {
        C7573i.m23587b(cVar, "configuration");
        AppLog.setReportCrash(false);
        AppLog.addAppCount();
        AppLog.setIsNotRequestSender(true);
        AppLog.setReleaseBuild(C6399b.m19931g());
        AppLog.setAppContext(C10987a.f29717a);
        AppLog.setUseGoogleAdId(cVar.f29724b);
        C6317k.m19581a(cVar.mo26544a().mo26545a());
        AppLog.setLogEncryptConfig(new C10989a());
        switch (C6399b.m19938n()) {
            case 1:
            case 4:
                AppLog.setHostI("log.tiktokv.com");
                AppLog.setHostLog("log.tiktokv.com");
                AppLog.setHostMon("api.tiktokv.com");
                break;
            case 2:
            case 5:
                AppLog.setHostI("log2.musical.ly");
                AppLog.setHostLog("log2.musical.ly");
                AppLog.setHostMon("api2.musical.ly");
                break;
        }
        AppLog.setConfigUpdateListener((ConfigUpdateListener) f29721c);
        m32200a().mo19325f((C7326g<? super T>) C10990b.f29722a);
        C10981a aVar = C10981a.f29700a;
        aVar.mo26539g();
        C6789d.m21064a((C6790a) C10981a.f29706g);
        C10985c.m32181a();
        AppLog.setAliYunHanlder(AliYunUUIDHandler.inst());
        C7121a.m22248b().mo18559a(new LazyLoadLegoTask(cVar.f29723a)).mo18559a(new SetAppTrackTask()).mo18560a();
    }
}
