package com.bytedance.framwork.core.monitor;

import com.bytedance.apm.internal.ApmDelegate;

/* renamed from: com.bytedance.framwork.core.monitor.a */
public final class C6377a {

    /* renamed from: a */
    private static final C6377a f18673a = new C6377a();

    /* renamed from: a */
    public static C6377a m19819a() {
        if (ApmDelegate.getInstance().isConfigReady()) {
            return f18673a;
        }
        return null;
    }
}
