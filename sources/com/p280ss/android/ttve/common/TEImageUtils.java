package com.p280ss.android.ttve.common;

import com.p280ss.android.ttve.model.VEFrame;
import com.p280ss.android.ttve.model.VEFrame.Operation;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.ttve.common.TEImageUtils */
public class TEImageUtils {

    /* renamed from: a */
    private static final String f55202a = TEImageUtils.class.getSimpleName();

    private static native int nativeConvertFrame(VEFrame vEFrame, VEFrame vEFrame2, int i);

    static {
        TENativeLibsLoader.m67986c();
    }

    /* renamed from: a */
    public static int m67829a(VEFrame vEFrame, VEFrame vEFrame2, Operation operation) {
        return nativeConvertFrame(vEFrame, vEFrame2, operation.ordinal());
    }
}
