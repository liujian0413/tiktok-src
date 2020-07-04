package com.ttnet.org.chromium.base.process_launcher;

import com.ttnet.org.chromium.base.MemoryPressureListener;
import com.ttnet.org.chromium.base.memory.MemoryPressureCallback;

final /* synthetic */ class ChildProcessConnection$$Lambda$2 implements Runnable {
    private final MemoryPressureCallback arg$1;

    ChildProcessConnection$$Lambda$2(MemoryPressureCallback memoryPressureCallback) {
        this.arg$1 = memoryPressureCallback;
    }

    public final void run() {
        MemoryPressureListener.addCallback(this.arg$1);
    }
}
