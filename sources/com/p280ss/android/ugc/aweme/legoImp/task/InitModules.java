package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitModules */
public class InitModules implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    private void initAccount() {
        if (C6861a.m21337f().isLogin()) {
            AppLog.setUserId(Long.parseLong(C6861a.m21337f().getCurUserId()));
            AppLog.setSessionKey(C6861a.m21337f().getSessionKey());
        }
    }

    public void run(Context context) {
        C6903bc.m21465F().mo16858e((Application) context);
        initAccount();
    }
}
