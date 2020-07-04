package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import bolts.C1592h;
import cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.bytedance.crash.C9847a;
import com.bytedance.crash.C9895f;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.CrashType;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10985c;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.analysis.C22503d;
import com.p280ss.android.ugc.aweme.app.p1033e.C22970a;
import com.p280ss.android.ugc.aweme.app.p1033e.C22972b;
import com.p280ss.android.ugc.aweme.app.p1033e.C22973c;
import com.p280ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.i18n.C30490m;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p1506s.C37296a;
import com.p280ss.android.ugc.aweme.p313im.C30565i;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.NpthTask */
public class NpthTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.NpthTask$a */
    class C32378a implements C9895f {
        /* renamed from: b */
        public final String mo24479b() {
            return C6789d.m21080d();
        }

        /* renamed from: d */
        public final String mo24481d() {
            return C10985c.m32187c();
        }

        /* renamed from: c */
        public final long mo24480c() {
            try {
                return Long.parseLong(AppLog.getUserId());
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        /* renamed from: a */
        public final Map<String, Object> mo24478a() {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            NetUtil.putCommonParams(hashMap2, true);
            hashMap.putAll(hashMap2);
            if (!hashMap.containsKey("release_build")) {
                hashMap.put("release_build", C6781d.m20984c());
            }
            return hashMap;
        }

        private C32378a() {
        }
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    private void installCustomActivityOnCrash(Context context) {
        CustomActivityOnCrash.m7911a(C6903bc.m21465F().mo16848a());
        CustomActivityOnCrash.m7909a(context);
    }

    public void run(Context context) {
        C30565i.m99837a();
        try {
            doRun(context);
        } finally {
            C30565i.m99838b();
        }
    }

    private void doRun(Context context) {
        boolean a = C7163a.m22363a();
        if (a) {
            boolean c = C6399b.m19928c();
            if (c) {
                C9912i.m29312a(C32415t.f84533a, CrashType.ANR);
            }
            if (!c) {
                C22503d.m74413a();
            }
            installCustomActivityOnCrash(context);
        }
        C6921a.m21555a("NpthTask");
        C9912i.m29317b().mo24560b("https://api2.musical.ly/monitor/collect/c/native_bin_crash");
        C9912i.m29317b().mo24561c("https://api2.musical.ly/monitor/collect/c/crash");
        C9912i.m29317b().mo24557a("https://api2.musical.ly/monitor/collect/c/exception");
        C9912i.m29308a(context, new C32378a(), true, true, !a);
        if (C6399b.m19944t()) {
            C30490m.m99588a();
        }
        C9912i.m29317b().f27126l = false;
        if (!C6855a.m21309c()) {
            C9912i.m29311a((C9847a) new C22972b(context, new C22973c()), CrashType.ALL);
        }
        if (C6776h.m20947b(context)) {
            C37296a.m119783a();
        }
        new AddInstalledModulesInfoTask().run(context);
        C6726a.m20843a(new Runnable() {
            public final void run() {
                new C22970a().run();
            }
        }, C34943c.f91127w);
        if (C6399b.m19944t()) {
            C1592h.m7855a((Callable<TResult>) new C32416u<TResult>(context), (Executor) C7258h.m22732e());
        }
    }

    static final /* synthetic */ void lambda$doRun$0$NpthTask(CrashType crashType, String str, Thread thread) {
        throw new Error(str);
    }
}
