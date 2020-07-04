package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MobMainAppEndTask */
public class MobMainAppEndTask implements LegoTask {
    private long value = (System.currentTimeMillis() - C6857a.m21312e().f19502b);

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C6907h.onEvent(MobClick.obtain().setEventName("load_application_end").setLabelName("perf_monitor").setExtValueLong(this.value));
    }
}
