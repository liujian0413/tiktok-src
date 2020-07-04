package com.p280ss.android.ugc.aweme.app.launch;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ttnet.p670a.C12925a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.launch.ResumeTask */
final class ResumeTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        if (C6399b.m19944t()) {
            return WorkType.BOOT_FINISH;
        }
        return WorkType.BACKGROUND;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        C12925a.m37635b(context);
    }
}
