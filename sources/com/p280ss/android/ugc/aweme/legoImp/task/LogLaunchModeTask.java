package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.metrics.C33282x;
import com.p280ss.android.ugc.aweme.p307au.C6887b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LogLaunchModeTask */
public class LogLaunchModeTask implements LegoTask {
    private String from;
    private String method;
    private Uri uri;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        String str = "";
        if (this.uri != null) {
            str = this.uri.getQueryParameter("enter_to");
        }
        long c = C6887b.m21436b().mo16910c(C29960a.m98230a().getApplicationContext(), "red_point_count");
        C33282x e = new C33282x().mo85366a(this.method).mo85370e(Integer.toString(1));
        if (str == null) {
            str = "";
        }
        e.mo85368c(str).mo85369d(Long.toString(c)).mo85371f(this.from).mo85252e();
    }

    public LogLaunchModeTask(Uri uri2, String str) {
        this.uri = uri2;
        this.from = str;
        this.method = "enter_launch";
    }

    public LogLaunchModeTask(Uri uri2, String str, String str2) {
        this.uri = uri2;
        this.from = str;
        this.method = str2;
    }
}
