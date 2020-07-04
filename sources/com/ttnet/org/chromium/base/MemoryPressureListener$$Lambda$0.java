package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.memory.MemoryPressureCallback;

final /* synthetic */ class MemoryPressureListener$$Lambda$0 implements MemoryPressureCallback {
    static final MemoryPressureCallback $instance = new MemoryPressureListener$$Lambda$0();

    private MemoryPressureListener$$Lambda$0() {
    }

    public final void onPressure(int i) {
        MemoryPressureListener.nativeOnMemoryPressure(i);
    }
}
