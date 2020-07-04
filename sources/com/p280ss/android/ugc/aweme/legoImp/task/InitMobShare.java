package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.utility.reflect.C6322b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.share.C38249q;
import com.p280ss.android.ugc.aweme.share.C38250r;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitMobShare */
public class InitMobShare implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        try {
            C38249q qVar = new C38249q("YYWjeT5eJGnfiErKfxYxYAXHq", "w981H5bEdxghiDenDVAu2dTutdsQsh71LU0w4sLmVO8UMdbe6Q", "be57ee08-231d-4622-9cad-4e0792363934", C6399b.m19930f(), TeaAgent.getInstallId());
            C6322b.m19609a(C38250r.class).mo15157a("sMobKey", (Object) qVar);
        } catch (Exception unused) {
        }
    }
}
