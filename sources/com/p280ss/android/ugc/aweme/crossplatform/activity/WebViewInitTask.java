package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.WebViewInitTask */
public class WebViewInitTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        if (VERSION.SDK_INT >= 23) {
            SystemClock.uptimeMillis();
            C25828m.m84934a().mo67148b();
            SystemClock.uptimeMillis();
        }
    }
}
