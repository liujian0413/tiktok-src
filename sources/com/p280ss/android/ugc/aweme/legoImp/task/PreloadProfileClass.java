package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36533be;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36534bf;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadProfileClass */
public final class PreloadProfileClass implements LegoTask {
    private final void preloadInstance(Object obj) {
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        preloadInstance(UserProfileFragment.class);
        preloadInstance(C36534bf.class);
        preloadInstance(C36533be.class);
    }
}
