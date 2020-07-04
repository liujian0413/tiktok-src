package com.ttnet.org.chromium.base.process_launcher;

import com.ttnet.org.chromium.base.memory.MemoryPressureCallback;

final /* synthetic */ class ChildProcessConnection$$Lambda$1 implements MemoryPressureCallback {
    private final ChildProcessConnection arg$1;

    ChildProcessConnection$$Lambda$1(ChildProcessConnection childProcessConnection) {
        this.arg$1 = childProcessConnection;
    }

    public final void onPressure(int i) {
        this.arg$1.bridge$lambda$0$ChildProcessConnection(i);
    }
}
