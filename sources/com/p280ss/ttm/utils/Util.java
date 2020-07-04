package com.p280ss.ttm.utils;

import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: com.ss.ttm.utils.Util */
public final class Util {
    public static final String BARND = Build.BRAND;
    public static final String DEVICE = Build.DEVICE;
    public static final String DEVICE_DEBUG_INFO;
    public static final String HARDWARE = Build.HARDWARE;
    public static final String MANUFACTURER = Build.MANUFACTURER;
    public static final String MODEL = Build.MODEL;
    public static final int SDK_INT = VERSION.SDK_INT;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(DEVICE);
        sb.append(", ");
        sb.append(MODEL);
        sb.append(", ");
        sb.append(MANUFACTURER);
        sb.append(", ");
        sb.append(SDK_INT);
        DEVICE_DEBUG_INFO = sb.toString();
    }
}
