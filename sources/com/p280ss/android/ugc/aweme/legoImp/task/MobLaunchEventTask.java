package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MobLaunchEventTask */
public class MobLaunchEventTask implements LegoTask {
    private long duration;
    private boolean isFirstStart;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        String str;
        String str2;
        C6921a.m21555a("MobLaunchEventTask");
        String str3 = "aweme_app_performance";
        if (this.isFirstStart) {
            str = "first_launch_time";
        } else {
            str = "launch_time";
        }
        C6877n.m21446a(str3, str, (float) this.duration);
        MobClick obtain = MobClick.obtain();
        if (this.isFirstStart) {
            str2 = "first_launch_time";
        } else {
            str2 = "launch_time";
        }
        C6907h.onEvent(obtain.setEventName(str2).setLabelName("perf_monitor").setExtValueLong(this.duration));
    }

    public MobLaunchEventTask(boolean z, long j) {
        this.isFirstStart = z;
        this.duration = j;
    }
}
