package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.awemelobby.C9657a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LobbyInitTask */
public final class LobbyInitTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.MAIN;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        C9657a.m28556a(context);
    }
}
