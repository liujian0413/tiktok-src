package com.bytedance.android.live.core.rxutils.autodispose.lifecycle;

import com.bytedance.android.live.core.rxutils.autodispose.OutsideScopeException;

public class LifecycleEndedException extends OutsideScopeException {
    public LifecycleEndedException() {
        this("Lifecycle has ended!");
    }

    public LifecycleEndedException(String str) {
        super(str);
    }
}
