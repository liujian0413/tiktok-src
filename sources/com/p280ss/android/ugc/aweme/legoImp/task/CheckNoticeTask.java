package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.utils.C43033cw;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CheckNoticeTask */
public class CheckNoticeTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        String str;
        C6921a.m21555a("CheckNoticeTask");
        Boolean valueOf = Boolean.valueOf(C43033cw.m136550a(C6399b.m19921a()));
        Context a = C6399b.m19921a();
        String str2 = "notice";
        if (valueOf.booleanValue()) {
            str = "allow_on";
        } else {
            str = "allow_off";
        }
        C19282c.m63182a(a, str2, str);
    }
}
