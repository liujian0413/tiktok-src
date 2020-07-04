package com.p280ss.android.push.daemon.nativ;

import com.p280ss.android.push.daemon.NativeDaemonBase;

/* renamed from: com.ss.android.push.daemon.nativ.NativeDaemonAPI */
public class NativeDaemonAPI extends NativeDaemonBase {
    public native void doDaemon(String str, String str2, String str3, String str4);

    static {
        try {
            C20021a.m65950a("daemon");
        } catch (Exception unused) {
        }
    }
}
