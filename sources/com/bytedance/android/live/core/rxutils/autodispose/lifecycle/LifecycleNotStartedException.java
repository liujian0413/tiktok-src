package com.bytedance.android.live.core.rxutils.autodispose.lifecycle;

import com.bytedance.android.live.core.rxutils.autodispose.OutsideScopeException;

public class LifecycleNotStartedException extends OutsideScopeException {
    public LifecycleNotStartedException() {
        this("Lifecycle hasn't started!");
    }

    public LifecycleNotStartedException(String str) {
        super(str);
    }
}
