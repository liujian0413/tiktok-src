package com.ttnet.org.chromium.base;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.VmPolicy;
import java.io.Closeable;

public final class StrictModeContext implements Closeable {
    private final ThreadPolicy mThreadPolicy;
    private final VmPolicy mVmPolicy;

    public static StrictModeContext allowAllVmPolicies() {
        VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(VmPolicy.LAX);
        return new StrictModeContext(vmPolicy);
    }

    public static StrictModeContext allowDiskReads() {
        return new StrictModeContext(StrictMode.allowThreadDiskReads());
    }

    public static StrictModeContext allowDiskWrites() {
        return new StrictModeContext(StrictMode.allowThreadDiskWrites());
    }

    public static StrictModeContext allowSlowCalls() {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitCustomSlowCalls().build());
        return new StrictModeContext(threadPolicy);
    }

    public final void close() {
        if (this.mThreadPolicy != null) {
            StrictMode.setThreadPolicy(this.mThreadPolicy);
        }
        if (this.mVmPolicy != null) {
            StrictMode.setVmPolicy(this.mVmPolicy);
        }
    }

    private StrictModeContext(ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    private StrictModeContext(VmPolicy vmPolicy) {
        this(null, vmPolicy);
    }

    private StrictModeContext(ThreadPolicy threadPolicy, VmPolicy vmPolicy) {
        this.mThreadPolicy = threadPolicy;
        this.mVmPolicy = vmPolicy;
    }
}
