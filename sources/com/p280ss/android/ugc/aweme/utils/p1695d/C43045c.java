package com.p280ss.android.ugc.aweme.utils.p1695d;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.utils.d.c */
public final class C43045c {

    /* renamed from: a */
    private static int f111635a = 3;

    /* renamed from: b */
    private static int f111636b = 3;

    /* renamed from: c */
    private static int f111637c = 3;

    /* renamed from: d */
    private static int f111638d = 3;

    /* renamed from: e */
    private static int f111639e = 3;

    /* renamed from: f */
    private static int f111640f = 3;

    /* renamed from: g */
    private static int f111641g = 3;

    /* renamed from: h */
    private static int f111642h = 3;

    /* renamed from: i */
    private static int f111643i = 3;

    /* renamed from: e */
    public static boolean m136575e() {
        return "samsung".equalsIgnoreCase(Build.BRAND);
    }

    /* renamed from: a */
    public static boolean m136571a() {
        int i;
        if (f111635a == 3) {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.contains("HUAWEI")) {
                i = 2;
            } else {
                i = 1;
            }
            f111635a = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f111635a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m136572b() {
        int i;
        if (f111636b == 3) {
            if (!TextUtils.isEmpty(C43046d.m136577a("ro.miui.ui.version.name"))) {
                i = 1;
            } else {
                i = 2;
            }
            f111636b = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f111636b == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m136573c() {
        int i;
        if (f111640f == 3) {
            String a = C43046d.m136577a("ro.product.brand");
            if (TextUtils.isEmpty(a) || !a.toLowerCase().contains("oppo")) {
                i = 2;
            } else {
                i = 1;
            }
            f111640f = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f111640f == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m136574d() {
        int i;
        if (f111641g == 3) {
            String a = C43046d.m136577a("ro.vivo.os.name");
            if (TextUtils.isEmpty(a) || !a.toLowerCase().contains("funtouch")) {
                i = 2;
            } else {
                i = 1;
            }
            f111641g = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f111641g == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m136576f() {
        int i;
        if (f111643i == 3) {
            if (!TextUtils.isEmpty(C43046d.m136577a("ro.smartisan.version"))) {
                i = 1;
            } else {
                i = 2;
            }
            f111643i = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (f111643i == 1) {
            return true;
        } else {
            return false;
        }
    }
}
