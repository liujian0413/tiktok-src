package com.bytedance.crash.p504l;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.upload.CrashUploader;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.crash.l.d */
public final class C9978d {

    /* renamed from: a */
    private static boolean f27215a = false;

    /* renamed from: b */
    private static int f27216b = -1;

    /* renamed from: c */
    private static final Pattern f27217c = Pattern.compile("^0-([\\d]+)$");

    /* renamed from: a */
    public static String m29522a() {
        return C9980e.m29531a("ro.build.version.emui");
    }

    /* renamed from: b */
    public static boolean m29525b() {
        if (!f27215a) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    CrashUploader.f27277a = true;
                    f27215a = true;
                    return CrashUploader.f27277a;
                }
            } catch (Exception unused) {
            }
            f27215a = true;
        }
        return CrashUploader.f27277a;
    }

    /* renamed from: c */
    public static boolean m29527c() {
        if (Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m29528d() {
        if (f27216b > 0) {
            return f27216b;
        }
        int b = m29524b("/sys/devices/system/cpu/possible");
        if (b <= 0) {
            b = m29524b("/sys/devices/system/cpu/present");
        }
        if (b <= 0) {
            b = m29529d("/sys/devices/system/cpu/");
        }
        if (b <= 0) {
            b = Runtime.getRuntime().availableProcessors();
        }
        if (b <= 0) {
            b = 1;
        }
        f27216b = b;
        return b;
    }

    /* renamed from: e */
    private static boolean m29530e() {
        try {
            if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("huawei")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("huawei"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static int m29526c(String str) {
        Matcher matcher = f27217c.matcher(str);
        if (matcher.matches()) {
            try {
                return Integer.parseInt(matcher.group(1)) + 1;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* renamed from: d */
    private static int m29529d(String str) {
        try {
            File[] listFiles = new File(str).listFiles(new FilenameFilter() {

                /* renamed from: a */
                private final Pattern f27218a = Pattern.compile("^cpu[\\d]+$");

                public final boolean accept(File file, String str) {
                    return this.f27218a.matcher(str).matches();
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                return listFiles.length;
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m29523a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m29522a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return m29530e();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002f, code lost:
        if (r4 != null) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[SYNTHETIC, Splitter:B:17:0x002a] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m29524b(java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x002e, all -> 0x0027 }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x002e, all -> 0x0027 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x002e, all -> 0x0027 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x002e, all -> 0x0027 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x002e, all -> 0x0027 }
            r4.<init>(r2)     // Catch:{ Throwable -> 0x002e, all -> 0x0027 }
            java.lang.String r0 = r4.readLine()     // Catch:{ Throwable -> 0x002f, all -> 0x0022 }
            if (r0 == 0) goto L_0x001e
            int r0 = m29526c(r0)     // Catch:{ Throwable -> 0x002f, all -> 0x0022 }
            r4.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r0
        L_0x001e:
            r4.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0032
        L_0x0022:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0028
        L_0x0027:
            r4 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r4
        L_0x002e:
            r4 = r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            goto L_0x001e
        L_0x0032:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p504l.C9978d.m29524b(java.lang.String):int");
    }
}
