package com.p280ss.android.ttve.common;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.ttve.common.TECloudCtrlInvoker */
public class TECloudCtrlInvoker {
    static {
        TENativeLibsLoader.m67986c();
    }

    private native int nativeVerifyJson(byte[] bArr, byte[] bArr2);

    /* renamed from: a */
    public final boolean mo55028a(String str, String str2) {
        if (str.isEmpty() || str2.isEmpty() || nativeVerifyJson(str.getBytes(), str2.getBytes()) != 0) {
            return false;
        }
        return true;
    }
}
