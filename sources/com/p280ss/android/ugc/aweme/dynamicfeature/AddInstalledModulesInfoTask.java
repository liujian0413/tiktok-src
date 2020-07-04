package com.p280ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.CrashType;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask */
public final class AddInstalledModulesInfoTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask$a */
    static final class C27321a implements Runnable {

        /* renamed from: a */
        public static final C27321a f72084a = new C27321a();

        C27321a() {
        }

        public final void run() {
            C9912i.m29319b(C273221.f72085a, CrashType.ALL);
        }
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        if (VERSION.SDK_INT >= 21) {
            C6304f.submitRunnable(C27321a.f72084a);
        }
    }
}
