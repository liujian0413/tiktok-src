package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask */
public class AppFlyerLoadPropertiesTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        AppsFlyerProperties.getInstance().loadProperties(context);
    }
}
