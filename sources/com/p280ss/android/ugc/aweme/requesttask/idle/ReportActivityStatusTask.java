package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask */
public final class ReportActivityStatusTask implements LegoTask {
    private final Bundle savedInstanceState;
    private final String tag;

    public final Bundle getSavedInstanceState() {
        return this.savedInstanceState;
    }

    public final String getTag() {
        return this.tag;
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.SPARSE;
    }

    public final void run(Context context) {
        boolean z;
        String str = this.tag;
        if (this.savedInstanceState != null) {
            z = true;
        } else {
            z = false;
        }
        new C37252k(str, z).mo93872a();
    }

    public ReportActivityStatusTask(String str, Bundle bundle) {
        C7573i.m23587b(str, "tag");
        this.tag = str;
        this.savedInstanceState = bundle;
    }
}
