package com.p280ss.android.ttve.nativePort;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ttve.nativePort.TEEffectUtils */
public class TEEffectUtils {

    /* renamed from: com.ss.android.ttve.nativePort.TEEffectUtils$ImageListener */
    public interface ImageListener {
        void onData(int[] iArr, int i, int i2, int i3);
    }

    static {
        TENativeLibsLoader.m67986c();
    }

    public static native String getEffectVersion();

    private static native int nativeGetQREncodedData(String str, int[] iArr, ImageListener imageListener);

    public static int getQREncodedData(String str, Map<Integer, Integer> map, ImageListener imageListener) {
        int[] iArr;
        if (map != null) {
            iArr = new int[(map.size() * 2)];
            int i = 0;
            for (Entry entry : map.entrySet()) {
                iArr[i] = ((Integer) entry.getKey()).intValue();
                iArr[i + 1] = ((Integer) entry.getValue()).intValue();
                i += 2;
            }
        } else {
            iArr = null;
        }
        return nativeGetQREncodedData(str, iArr, imageListener);
    }
}
