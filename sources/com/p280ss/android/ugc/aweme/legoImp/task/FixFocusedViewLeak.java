package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43042a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak */
public class FixFocusedViewLeak implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        C43042a.m136569a((Application) context);
    }
}
