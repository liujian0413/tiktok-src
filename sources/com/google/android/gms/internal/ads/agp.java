package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.concurrent.Executor;

final class agp implements Executor {

    /* renamed from: a */
    private final Handler f40193a = new ace(Looper.getMainLooper());

    agp() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                acl.m45530a(C14793ay.m42898d().f39923c, th);
                throw th;
            }
        } else {
            this.f40193a.post(runnable);
        }
    }
}
