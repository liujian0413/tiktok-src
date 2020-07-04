package com.p280ss.android.ugc.aweme.i18n;

import android.os.Looper;
import com.p280ss.android.ugc.aweme.base.C6893q;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.ss.android.ugc.aweme.i18n.m */
public final class C30490m implements UncaughtExceptionHandler {

    /* renamed from: a */
    private UncaughtExceptionHandler f80100a;

    /* renamed from: b */
    private long f80101b = Looper.getMainLooper().getThread().getId();

    /* renamed from: a */
    public static void m99588a() {
        Thread.setDefaultUncaughtExceptionHandler(new C30490m(Thread.getDefaultUncaughtExceptionHandler()));
    }

    private C30490m(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f80100a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (!(th instanceof IllegalStateException) || thread == null || thread.getId() == this.f80101b || th.getMessage() == null || !"Results have already been set".equals(th.getMessage().trim())) {
            if (this.f80100a != null) {
                this.f80100a.uncaughtException(thread, th);
            }
            return;
        }
        C6893q.m21447a("gms_crash_results_have_already_been_set", null);
    }
}
