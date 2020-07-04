package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34337j;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.WebSocketTask */
public class WebSocketTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C6921a.m21555a("WebSocketTask");
        C34337j.f89496g.mo87193a().mo87189a((Application) C6399b.m19921a());
    }
}
