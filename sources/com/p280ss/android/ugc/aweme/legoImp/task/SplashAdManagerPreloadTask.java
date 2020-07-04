package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.splash.SplashAdManagerHolder;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SplashAdManagerPreloadTask */
public class SplashAdManagerPreloadTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C6921a.m21555a("SplashAdManagerPreloadTask");
        SplashAdManagerHolder.m132886a(context);
    }
}
