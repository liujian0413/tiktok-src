package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Process;

public final class bkl extends HandlerThread {

    /* renamed from: a */
    private final int f42385a = -16;

    public bkl(String str, int i) {
        super(str);
    }

    public final void run() {
        Process.setThreadPriority(this.f42385a);
        super.run();
    }
}
