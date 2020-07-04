package com.p280ss.android.legoimpl;

import android.app.Application;
import android.content.Context;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.legoimpl.BusinessToolsTask */
public class BusinessToolsTask implements LegoTask {
    private Application mApplication;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public BusinessToolsTask(Application application) {
        this.mApplication = application;
    }

    public void run(Context context) {
        if (this.mApplication != null) {
            C6903bc.m21465F().mo16854c(this.mApplication);
        }
    }
}
