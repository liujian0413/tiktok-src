package com.ttnet.org.chromium.base.process_launcher;

final /* synthetic */ class ChildProcessConnection$$Lambda$4 implements Runnable {
    private final ChildProcessConnection arg$1;
    private final int arg$2;

    ChildProcessConnection$$Lambda$4(ChildProcessConnection childProcessConnection, int i) {
        this.arg$1 = childProcessConnection;
        this.arg$2 = i;
    }

    public final void run() {
        this.arg$1.lambda$onMemoryPressure$3$ChildProcessConnection(this.arg$2);
    }
}
