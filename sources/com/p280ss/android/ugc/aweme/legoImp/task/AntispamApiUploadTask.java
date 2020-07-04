package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AntispamApiUploadTask */
public class AntispamApiUploadTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C6921a.m21555a("AntispamApiUploadTask");
        if (C6399b.m19944t() && C6887b.m21436b().mo16909b(context, "is_first_install", true)) {
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("install");
            C6887b.m21436b().mo16902a(context, "is_first_install", false);
        }
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("cold_start");
    }
}
