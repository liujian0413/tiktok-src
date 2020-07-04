package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.performance.C7188c;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask */
public class PerformanceHelperTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C7188c.m22425a(context, 1);
    }
}
