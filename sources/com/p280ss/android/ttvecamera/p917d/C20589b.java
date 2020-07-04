package com.p280ss.android.ttvecamera.p917d;

import android.os.Build;
import com.p280ss.android.ttvecamera.C20652m;

/* renamed from: com.ss.android.ttvecamera.d.b */
public final class C20589b {

    /* renamed from: a */
    public static final int[] f55626a = {2, 0, 1, 3};

    /* renamed from: b */
    public static final int[] f55627b = {1, 2, 0, 3};

    /* renamed from: b */
    public static boolean m68172b() {
        if (!Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
            return false;
        }
        C20652m.m68435b("TECameraHardware2", "MTK Platform.");
        return true;
    }

    /* renamed from: a */
    public static boolean m68171a() {
        String lowerCase = Build.HARDWARE.toLowerCase();
        if (!lowerCase.equals("qcom") && !lowerCase.matches("msm[0-9]*")) {
            return false;
        }
        C20652m.m68435b("TECameraHardware2", "QCOM Platform.");
        return true;
    }

    /* renamed from: c */
    public static boolean m68173c() {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!lowerCase.equals("huawei") && !lowerCase.equals("honor")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("HuaWei Platform, Brand: ");
        sb.append(lowerCase);
        C20652m.m68435b("TECameraHardware2", sb.toString());
        return true;
    }
}
