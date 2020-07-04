package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask */
public class UploadInstallEventTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C6921a.m21555a("UploadInstallEventTask");
        if (C6887b.m21436b().mo16908b(context, "is_first_install")) {
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("install");
            C6887b.m21436b().mo16902a(context, "is_first_install", false);
        }
    }
}
