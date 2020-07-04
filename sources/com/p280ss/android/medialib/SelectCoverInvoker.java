package com.p280ss.android.medialib;

import android.view.Surface;
import com.p280ss.android.medialib.SelectCoverManager.interface_name;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.SelectCoverInvoker */
public class SelectCoverInvoker {
    protected static SelectCoverInvoker mSingleton;

    static {
        TENativeLibsLoader.m67988e();
    }

    public native int destroyEnv();

    public native int[] getSelectedCover();

    public native int getThumbnail(long[] jArr);

    public native int initEnv(Surface surface, int i, int i2, String str, int i3, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int[] iArr);

    public native int registerInterfaceNameNative(interface_name interface_name);

    public native int selectCover(int i);

    public native int unRegisterInterfaceNameNative();

    public SelectCoverInvoker() {
        mSingleton = this;
    }
}
