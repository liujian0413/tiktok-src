package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.video.preload.C43283g;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.VideoCachePreloaderInitTask */
public class VideoCachePreloaderInitTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    private void initVideoLoader() {
        C43305j.m137386g().mo105023a();
    }

    public void run(Context context) {
        C6921a.m21555a("VideoCachePreloaderInitTask");
        C43283g.m137317b();
        initVideoLoader();
    }
}
