package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.p280ss.android.ugc.aweme.setting.p337ui.C7216i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitLocalAbTestModel */
public class InitLocalAbTestModel implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        LocalAbTestModel localAbTestModel = new LocalAbTestModel();
        C7216i.m22633b().mo16900a(C6399b.m19921a(), "local_ab_test_model", (Object) localAbTestModel);
        C6903bc.m21494m().mo18734a(localAbTestModel);
    }
}
