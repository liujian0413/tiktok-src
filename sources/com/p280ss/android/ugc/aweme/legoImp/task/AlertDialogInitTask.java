package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11031b;
import com.p280ss.android.ugc.aweme.app.C6868au;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AlertDialogInitTask */
public class AlertDialogInitTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        if (isMainThread(context)) {
            C11029b.m32309a((C11031b) new C11031b() {
            });
        }
    }

    public boolean isMainThread(Context context) {
        if (C6868au.m21378a(context) == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }
}
