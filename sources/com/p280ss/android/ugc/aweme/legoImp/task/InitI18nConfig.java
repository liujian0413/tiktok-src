package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.common.C10775d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitI18nConfig */
public class InitI18nConfig implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        C10775d.m31450a().mo25765a(C6399b.m19944t(), C6399b.m19946v());
    }
}
