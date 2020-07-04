package com.ttnet.org.chromium.base.process_launcher;

import com.ttnet.org.chromium.base.MemoryPressureListener;
import com.ttnet.org.chromium.base.memory.MemoryPressureCallback;

final /* synthetic */ class ChildProcessConnection$$Lambda$3 implements Runnable {
    private final MemoryPressureCallback arg$1;

    ChildProcessConnection$$Lambda$3(MemoryPressureCallback memoryPressureCallback) {
        this.arg$1 = memoryPressureCallback;
    }

    public final void run() {
        MemoryPressureListener.removeCallback(this.arg$1);
    }
}
