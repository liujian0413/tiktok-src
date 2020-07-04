package com.p280ss.android.ttve.log;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.ttve.log.TELog2ClientInvoker */
public class TELog2ClientInvoker {
    static {
        TENativeLibsLoader.m67987d();
    }

    public static native void nativeInit();

    public static native void nativeSetLog2ClientSwitch(boolean z);

    public static void onNativeCallback_logToLocal(int i, String str) {
        C20456a.m67876a(i, str);
    }
}
