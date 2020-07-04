package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume */
public class AdjustMusicVolume implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        if (!((Boolean) C23060u.m75742a().mo60035E().mo59877d()).booleanValue()) {
            C1592h.m7848a(500).mo6875a(C32396a.f84515a);
            C23060u.m75742a().mo60035E().mo59871a(Boolean.valueOf(true));
        }
    }
}
