package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FetchSettingTask */
public class FetchSettingTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C7213d.m22500a();
        C7213d.m22508c();
        C37562ao.m120324a().mo94849a(1);
    }
}
