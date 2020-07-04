package com.google.android.gms.common.util.p751a;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.a.d */
final class C15318d implements Runnable {

    /* renamed from: a */
    private final Runnable f39591a;

    /* renamed from: b */
    private final int f39592b = 0;

    public C15318d(Runnable runnable, int i) {
        this.f39591a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.f39592b);
        this.f39591a.run();
    }
}
