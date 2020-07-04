package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.IntentFilter;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.login.SessionExpireReceiver;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RegisterSessionReceiver */
public class RegisterSessionReceiver implements LegoTask {
    private SessionExpireReceiver mSessionExpireReceiver = new SessionExpireReceiver();

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        context.registerReceiver(this.mSessionExpireReceiver, new IntentFilter("session_expire"));
    }
}
