package com.bytedance.apm.impl;

import com.bytedance.apm.p253n.C6284b;
import com.bytedance.services.apm.api.ILaunchTrace;

public class LaunchTraceImpl implements ILaunchTrace {
    public void cancelTrace() {
        C6284b.m19500b();
    }

    public void startTrace() {
        C6284b.m19495a();
    }

    public void endSpan(String str, String str2) {
        C6284b.m19501b(str, str2);
    }

    public void startSpan(String str, String str2) {
        C6284b.m19499a(str, str2);
    }

    public void endTrace(int i, String str, long j) {
        C6284b.m19497a(i, str, j);
    }
}
