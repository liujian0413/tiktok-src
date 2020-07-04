package com.ttnet.org.chromium.base.memory;

import com.ttnet.org.chromium.base.Supplier;

final /* synthetic */ class MemoryPressureMonitor$$Lambda$0 implements Supplier {
    static final Supplier $instance = new MemoryPressureMonitor$$Lambda$0();

    private MemoryPressureMonitor$$Lambda$0() {
    }

    public final Object get() {
        return MemoryPressureMonitor.getCurrentMemoryPressure();
    }
}
