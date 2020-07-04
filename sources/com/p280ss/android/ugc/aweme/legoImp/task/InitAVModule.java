package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.services.IAVInitializer;
import com.p280ss.android.ugc.aweme.tools.extension.C42309c;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.SupportedBusiness;
import com.p280ss.android.ugc.aweme.tools.extension.p1670a.C42307b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitAVModule */
public class InitAVModule implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        C6857a.m21312e().mo16822a("method_av_module_init_duration", false);
        ((IAVInitializer) ServiceManager.get().getService(IAVInitializer.class)).initialize(AwemeApplication.m21341a());
        C42311e.m134572a(C6399b.m19928c());
        C42311e.m134570a(SupportedBusiness.MAIN_BUSINESS, (C42309c) new C42307b());
        C6857a.m21312e().mo16827b("method_av_module_init_duration", false);
    }
}
