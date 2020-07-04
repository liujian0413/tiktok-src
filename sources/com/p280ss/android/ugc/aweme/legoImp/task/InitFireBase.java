package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.C18272b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitFireBase */
public class InitFireBase implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C18272b.m60242a(context);
        initFirebase(context);
    }

    public static void initFirebase(Context context) {
        if (C6776h.m20947b(context)) {
            String serverDeviceId = AppLog.getServerDeviceId();
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
            if (!TextUtils.isEmpty(serverDeviceId)) {
                instance.mo47130a(serverDeviceId);
            }
        }
    }
}
