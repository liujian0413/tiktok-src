package com.p280ss.android.ttve.common;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.ttve.common.TESpdLogInvoker */
public class TESpdLogInvoker {
    static {
        TENativeLibsLoader.m67986c();
    }

    public native void close();

    public native int error(String str);

    public native String getLogFiles(String str);

    public native int info(int i, String str);

    public native int initSpdLog(String str, int i, int i2);

    public native void setLevel(int i);

    public native int warn(String str);
}
