package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.NotificationManager;
import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CancelNotificationForUpdateTask */
public class CancelNotificationForUpdateTask implements LegoTask {
    private NotificationManager notificationManager;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public CancelNotificationForUpdateTask(NotificationManager notificationManager2) {
        this.notificationManager = notificationManager2;
    }

    public void run(Context context) {
        C6921a.m21555a("CancelNotificationForUpdateTask");
        try {
            this.notificationManager.cancel(R.id.d_4);
        } catch (Exception unused) {
        }
    }
}
