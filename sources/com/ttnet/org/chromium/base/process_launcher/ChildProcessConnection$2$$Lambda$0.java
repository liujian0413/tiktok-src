package com.ttnet.org.chromium.base.process_launcher;

import android.os.IBinder;

final /* synthetic */ class ChildProcessConnection$2$$Lambda$0 implements Runnable {
    private final C466172 arg$1;
    private final IBinder arg$2;

    ChildProcessConnection$2$$Lambda$0(C466172 r1, IBinder iBinder) {
        this.arg$1 = r1;
        this.arg$2 = iBinder;
    }

    public final void run() {
        this.arg$1.lambda$onServiceConnected$0$ChildProcessConnection$2(this.arg$2);
    }
}
