package com.ttnet.org.chromium.base.memory;

import com.ttnet.org.chromium.base.MemoryPressureListener;

final /* synthetic */ class MemoryPressureMonitor$$Lambda$1 implements MemoryPressureCallback {
    static final MemoryPressureCallback $instance = new MemoryPressureMonitor$$Lambda$1();

    private MemoryPressureMonitor$$Lambda$1() {
    }

    public final void onPressure(int i) {
        MemoryPressureListener.notifyMemoryPressure(i);
    }
}
