package com.ttnet.org.chromium.base.process_launcher;

import com.ttnet.org.chromium.base.process_launcher.ChildProcessConnection.ServiceCallback;

final /* synthetic */ class ChildProcessLauncher$$Lambda$0 implements Runnable {
    private final ChildProcessLauncher arg$1;
    private final ServiceCallback arg$2;
    private final boolean arg$3;
    private final boolean arg$4;

    ChildProcessLauncher$$Lambda$0(ChildProcessLauncher childProcessLauncher, ServiceCallback serviceCallback, boolean z, boolean z2) {
        this.arg$1 = childProcessLauncher;
        this.arg$2 = serviceCallback;
        this.arg$3 = z;
        this.arg$4 = z2;
    }

    public final void run() {
        this.arg$1.lambda$allocateAndSetupConnection$0$ChildProcessLauncher(this.arg$2, this.arg$3, this.arg$4);
    }
}
