package com.bytedance.polaris.p634b;

import android.os.Build;
import android.text.TextUtils;
import android.view.Window;
import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.polaris.b.e */
public final class C12348e {

    /* renamed from: a */
    private static boolean f32777a = false;

    /* renamed from: b */
    private static boolean f32778b = false;

    /* renamed from: c */
    private static String f32779c = null;

    /* renamed from: d */
    private static int f32780d = -1;

    /* renamed from: e */
    private static String f32781e;

    /* renamed from: f */
    private static String f32782f;

    /* renamed from: i */
    public static boolean m35859i() {
        return m35849a("EMUI");
    }

    /* renamed from: j */
    public static boolean m35860j() {
        return m35849a("OPPO");
    }

    /* renamed from: l */
    public static boolean m35862l() {
        return m35849a("SMARTISAN");
    }

    /* renamed from: b */
    public static boolean m35851b() {
        m35864n();
        return "V6".equals(f32779c);
    }

    /* renamed from: c */
    public static boolean m35853c() {
        m35864n();
        return "V7".equals(f32779c);
    }

    /* renamed from: d */
    public static boolean m35854d() {
        m35864n();
        return "V8".equals(f32779c);
    }

    /* renamed from: e */
    public static boolean m35855e() {
        m35864n();
        return "V9".equals(f32779c);
    }

    /* renamed from: g */
    public static boolean m35857g() {
        return Build.DISPLAY.startsWith("Flyme");
    }

    /* renamed from: p */
    private static String m35866p() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER.trim();
    }

    /* renamed from: a */
    public static boolean m35848a() {
        if (!f32778b) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f32777a = true;
                }
            } catch (Exception unused) {
            }
            f32778b = true;
        }
        return f32777a;
    }

    /* renamed from: f */
    public static boolean m35856f() {
        m35864n();
        if ("V10".equals(f32779c) || "v10".equals(f32779c)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m35861k() {
        if (m35849a("QIKU") || m35849a("360")) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static double m35863m() {
        try {
            String c = m35852c("ro.build.version.emui");
            return Double.parseDouble(c.substring(c.indexOf("_") + 1));
        } catch (Exception unused) {
            return 4.0d;
        }
    }

    /* renamed from: n */
    private static void m35864n() {
        String str;
        if (f32779c == null) {
            try {
                String o = m35865o();
                f32779c = o;
                if (TextUtils.isEmpty(o)) {
                    f32779c = C12341b.m35840a().mo30185a("ro.miui.ui.version.name");
                } else {
                    f32779c = f32779c.trim();
                }
            } catch (IOException unused) {
            }
            if (f32779c == null) {
                str = "";
            } else {
                str = f32779c;
            }
            f32779c = str;
        }
    }

    /* renamed from: h */
    public static boolean m35858h() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("vivo")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().contains("vivo")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str3) || !str3.toLowerCase().contains("vivo")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[SYNTHETIC, Splitter:B:13:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[SYNTHETIC, Splitter:B:21:0x0041] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m35865o() {
        /*
            java.lang.String r0 = "ro.miui.ui.version.name"
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            r3.append(r0)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.String r0 = r3.toString()     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.Process r0 = r2.exec(r0)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r0)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Throwable -> 0x003f, all -> 0x0034 }
            r2.close()     // Catch:{ Throwable -> 0x003f, all -> 0x0034 }
            r2.close()     // Catch:{ Throwable -> 0x0033 }
        L_0x0033:
            return r0
        L_0x0034:
            r0 = move-exception
            r1 = r2
            goto L_0x0038
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ Throwable -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
            r2 = r1
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r2.close()     // Catch:{ Throwable -> 0x0044 }
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p634b.C12348e.m35865o():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC, Splitter:B:13:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m35850b(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r3 = "getprop "
            r2.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.append(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r4
        L_0x0032:
            r4 = move-exception
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r4
        L_0x003c:
            r1 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p634b.C12348e.m35850b(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC, Splitter:B:13:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m35852c(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r3 = "getprop "
            r2.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.append(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r4
        L_0x0032:
            r4 = move-exception
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r4
        L_0x003c:
            r1 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p634b.C12348e.m35852c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m35849a(String str) {
        if (f32781e != null) {
            return f32781e.equals(str);
        }
        String b = m35850b("ro.miui.ui.version.name");
        f32782f = b;
        if (!TextUtils.isEmpty(b)) {
            f32781e = "MIUI";
        } else {
            String b2 = m35850b("ro.build.version.emui");
            f32782f = b2;
            if (!TextUtils.isEmpty(b2)) {
                f32781e = "EMUI";
            } else {
                String b3 = m35850b("ro.build.version.opporom");
                f32782f = b3;
                if (!TextUtils.isEmpty(b3)) {
                    f32781e = "OPPO";
                } else {
                    String b4 = m35850b("ro.vivo.os.version");
                    f32782f = b4;
                    if (!TextUtils.isEmpty(b4)) {
                        f32781e = "VIVO";
                    } else {
                        String b5 = m35850b("ro.smartisan.version");
                        f32782f = b5;
                        if (!TextUtils.isEmpty(b5)) {
                            f32781e = "SMARTISAN";
                        } else {
                            String b6 = m35850b("ro.gn.sv.version");
                            f32782f = b6;
                            if (!TextUtils.isEmpty(b6)) {
                                f32781e = "QIONEE";
                            } else {
                                String b7 = m35850b("ro.lenovo.lvp.version");
                                f32782f = b7;
                                if (!TextUtils.isEmpty(b7)) {
                                    f32781e = "LENOVO";
                                } else if (m35866p().toLowerCase().contains("samsung")) {
                                    f32781e = "samsung";
                                } else if (m35866p().toLowerCase().contains("zte")) {
                                    f32781e = "zte";
                                } else {
                                    String str2 = Build.DISPLAY;
                                    f32782f = str2;
                                    if (str2.toUpperCase().contains("FLYME")) {
                                        f32781e = "FLYME";
                                    } else {
                                        f32782f = "unknown";
                                        f32781e = Build.MANUFACTURER.toUpperCase();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return f32781e.equals(str);
    }

    /* renamed from: a */
    public static void m35847a(boolean z, Window window) {
        int i;
        try {
            Class cls = window.getClass();
            Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable unused) {
        }
    }
}
