package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.aweme.storage.C1921e;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.experiment.DeepCleanExperiment;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.legoImp.task.StorageTask.C32393a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.StoragePreCleanTask */
public final class StoragePreCleanTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BACKGROUND;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        if (!C32393a.m104960a()) {
            int a = C6384b.m19835a().mo15287a(DeepCleanExperiment.class, true, "is_deep_clean_enabled", C6384b.m19835a().mo15295d().is_deep_clean_enabled, 0);
            new StringBuilder("deepSize = ").append(a);
            C1921e.m8889a(a);
            if (a > 0 && C1921e.m8890a(context)) {
                StorageTask.Companion.mo83619a(context, a);
            }
        }
    }
}
