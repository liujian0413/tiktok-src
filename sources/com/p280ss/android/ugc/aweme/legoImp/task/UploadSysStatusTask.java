package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.support.p022v4.app.C0578a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.splash.SplashActivity;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.UploadSysStatusTask */
public class UploadSysStatusTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        if (!C6399b.m19944t()) {
            C6907h.m21524a("sys_status", (Map) C22984d.m75611a().mo59970a("voiceover", C0578a.m2439a(context) ? 1 : 0).mo59973a("activity", SplashActivity.class.getSimpleName()).f60753a);
        }
    }
}
