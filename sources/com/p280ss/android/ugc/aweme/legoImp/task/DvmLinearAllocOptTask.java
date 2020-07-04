package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.crash.p497f.C9897b;
import com.bytedance.crash.p504l.C9999s;
import com.bytedance.crash.upload.C10018c;
import com.bytedance.sysoptimizer.ArtOptimizer;
import com.bytedance.sysoptimizer.DvmOptimizer;
import com.bytedance.sysoptimizer.Optimizer;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.DvmLinearAllocOptTask */
public class DvmLinearAllocOptTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    private static void reportEvent(Throwable th) {
        C9897b a = C9897b.m29247a(th.getStackTrace()[th.getStackTrace().length - 1], C9999s.m29645a(th.getStackTrace()), "load_sysoptimizer_failed", "DvmLinearAllocOptTask Thread", false, null, "load_sysoptimizer_failed");
        ArrayList arrayList = new ArrayList();
        arrayList.add(th.toString());
        a.mo24488a("load_so_exception", (List) arrayList);
        a.mo24487a("load_sysoptimizer_failed", "true");
        C10018c.m29777a(a);
    }

    public void run(Context context) {
        try {
            if (C30199h.m98861a().getDisableDvmLinearAllocOpt().booleanValue()) {
                return;
            }
        } catch (Exception unused) {
        }
        C6921a.m21555a("DvmLinearAllocOptTask");
        DvmOptimizer.optDvmLinearAllocBuffer(context);
        ArtOptimizer.optSuspendTimeout(context);
        int size = Optimizer.getLoadLibraryError().size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                reportEvent((Throwable) Optimizer.getLoadLibraryError().get(i));
            }
        }
    }
}
