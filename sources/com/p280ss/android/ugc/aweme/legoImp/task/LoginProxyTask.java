package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.login.component.MLoginActivityComponent;
import com.p280ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LoginProxyTask */
public class LoginProxyTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        if (C6399b.m19946v()) {
            C32656f.m105750a(new MLoginActivityComponent());
            return;
        }
        if (C6399b.m19947w()) {
            C32656f.m105750a(new I18nLoginActivityComponent());
        }
    }
}
