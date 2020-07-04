package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.legacy.download.C32331a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitDownloader */
public class InitDownloader implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        ServiceManager.get().bind(OkHttpClient.class, C32402g.f84519a);
        C32331a.m104889a(context);
        C32331a.m104890a(C32403h.f84520a);
    }
}
