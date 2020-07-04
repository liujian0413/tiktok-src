package com.p280ss.android.ugc.aweme.crossplatform.prefetch;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.HybridPrefetchTask */
public final class HybridPrefetchTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.SPARSE;
    }

    public final void run(Context context) {
        String a = C25985b.f68703a.mo67434a();
        if (a == null) {
            a = "";
        }
        C25985b.m85361a(a);
    }
}
