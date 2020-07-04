package com.p280ss.android.downloadlib.p868c;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.downloadlib.c.f */
public final class C19521f {

    /* renamed from: a */
    public static String f52811a;

    /* renamed from: b */
    private static String f52812b;

    /* renamed from: c */
    private static String f52813c;

    /* renamed from: a */
    public static boolean m64295a() {
        return m64296a("EMUI");
    }

    /* renamed from: b */
    public static boolean m64297b() {
        return m64296a("VIVO");
    }

    /* renamed from: c */
    public static boolean m64298c() {
        return m64296a("OPPO");
    }

    /* renamed from: d */
    public static boolean m64299d() {
        return m64296a("SAMSUNG");
    }

    /* renamed from: e */
    public static String m64300e() {
        if (f52811a == null) {
            m64296a("");
        }
        return f52811a;
    }

    /* renamed from: f */
    private static String m64301f() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER.trim();
    }

    /* renamed from: a */
    private static boolean m64296a(String str) {
        if (f52812b != null) {
            return f52812b.equals(str);
        }
        String a = C19522g.m64302a("ro.miui.ui.version.name");
        f52813c = a;
        if (!TextUtils.isEmpty(a)) {
            f52812b = "MIUI";
            f52811a = "com.xiaomi.market";
        } else {
            String a2 = C19522g.m64302a("ro.build.version.emui");
            f52813c = a2;
            if (!TextUtils.isEmpty(a2)) {
                f52812b = "EMUI";
                f52811a = "com.huawei.appmarket";
            } else {
                String a3 = C19522g.m64302a("ro.build.version.opporom");
                f52813c = a3;
                if (!TextUtils.isEmpty(a3)) {
                    f52812b = "OPPO";
                    f52811a = "com.oppo.market";
                } else {
                    String a4 = C19522g.m64302a("ro.vivo.os.version");
                    f52813c = a4;
                    if (!TextUtils.isEmpty(a4)) {
                        f52812b = "VIVO";
                        f52811a = "com.bbk.appstore";
                    } else {
                        String a5 = C19522g.m64302a("ro.smartisan.version");
                        f52813c = a5;
                        if (!TextUtils.isEmpty(a5)) {
                            f52812b = "SMARTISAN";
                            f52811a = "com.smartisanos.appstore";
                        } else {
                            String a6 = C19522g.m64302a("ro.gn.sv.version");
                            f52813c = a6;
                            if (!TextUtils.isEmpty(a6)) {
                                f52812b = "QIONEE";
                                f52811a = "com.gionee.aora.market";
                            } else {
                                String a7 = C19522g.m64302a("ro.lenovo.lvp.version");
                                f52813c = a7;
                                if (!TextUtils.isEmpty(a7)) {
                                    f52812b = "LENOVO";
                                    f52811a = "com.lenovo.leos.appstore";
                                } else if (m64301f().toUpperCase().contains("SAMSUNG")) {
                                    f52812b = "SAMSUNG";
                                    f52811a = "com.sec.android.app.samsungapps";
                                } else if (m64301f().toUpperCase().contains("ZTE")) {
                                    f52812b = "ZTE";
                                    f52811a = "zte.com.market";
                                } else if (m64301f().toLowerCase().contains("NUBIA")) {
                                    f52812b = "NUBIA";
                                    f52811a = "cn.nubia.neostore";
                                } else {
                                    String str2 = Build.DISPLAY;
                                    f52813c = str2;
                                    if (str2.toUpperCase().contains("FLYME")) {
                                        f52812b = "FLYME";
                                        f52811a = "com.meizu.mstore";
                                    } else {
                                        f52813c = "unknown";
                                        f52812b = Build.MANUFACTURER.toUpperCase();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return f52812b.equals(str);
    }
}
