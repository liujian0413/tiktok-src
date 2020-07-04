package com.p280ss.android.ugc.aweme.miniapp.utils;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.miniapp.impl.C33377a;
import com.p280ss.android.ugc.aweme.miniapp.impl.C33394d;
import com.p280ss.android.ugc.aweme.miniapp.impl.C33395e;
import com.p280ss.android.ugc.aweme.miniapp.impl.C33406l;
import com.p280ss.android.ugc.aweme.miniapp.impl.C33407m;
import com.p280ss.android.ugc.aweme.miniapp.impl.NetWorkImpl;
import com.p280ss.android.ugc.aweme.miniapp_api.C33420a;
import com.p280ss.android.ugc.aweme.miniapp_api.C33420a.C33422a;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33437a;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33438b;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33439c;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33440d;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33441e;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33442f;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33443g;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33444h;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C33475a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.p1168df.base.C26227d;
import com.p280ss.android.ugc.trill.app.TrillApplication;

/* renamed from: com.ss.android.ugc.aweme.miniapp.utils.MiniAppInitTask */
public class MiniAppInitTask implements LegoTask {
    public static boolean hasBuilderSet;
    private boolean mIsMainProcess;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public static void initMiniAppAfterAppbundleInstalled() {
        injectInitParamsInAdvance();
        C7167b.m22380b().mo18647a().initMiniApp();
    }

    public static void injectInitParamsInAdvance() {
        if (!hasBuilderSet) {
            hasBuilderSet = true;
            C7167b.m22379a(TrillApplication.m21341a(), C33475a.m108225a().mo18642a(String.valueOf(C6399b.m19935k())).mo18646e(C6399b.m19929e()).mo18643b(C6399b.m19941q()).mo18644c(String.valueOf(C6399b.m19932h())).mo18645d(String.valueOf(C6399b.m19932h())).mo18636a((C33439c) new C33394d()).mo18637a((C33440d) new C33395e()).mo18641a((C33444h) new C33406l()).mo18639a((C33442f) new C33407m()).mo18638a((C33441e) new NetWorkImpl()).mo18634a((C33437a) new C33377a()).mo18635a((C33438b) C6903bc.m21465F().mo16867n()).mo18640a((C33443g) C6903bc.m21465F().mo16868o()));
        }
    }

    public void run(Context context) {
        initMiniApp(context);
    }

    public MiniAppInitTask(boolean z) {
        this.mIsMainProcess = z;
        C33420a.m108080a((C33422a) new C33422a() {
            /* renamed from: a */
            public final void mo18614a() {
                MiniAppInitTask.initMiniAppAfterAppbundleInstalled();
            }
        });
    }

    private void initMiniApp(Context context) {
        if (VERSION.SDK_INT >= 21) {
            injectInitParamsInAdvance();
            IMiniAppService a = C7167b.m22380b().mo18647a();
            if (a != null && this.mIsMainProcess) {
                a.initMiniApp();
                C26227d.m86226a("com.ss.android.ugc.aweme.miniapp");
            }
        }
    }
}
