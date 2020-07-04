package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.trill.abtest.C44974b;
import com.p280ss.android.ugc.trill.abtest.impl.C44976a;
import com.p280ss.android.ugc.trill.abtest.impl.C44979b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitAbTest */
public class InitAbTest implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        C44974b.m141917a().mo107494a("attract_user_without_login_back", new C44976a());
        C44974b.m141917a().mo107494a("attract_user_without_login_home", new C44979b());
    }
}
