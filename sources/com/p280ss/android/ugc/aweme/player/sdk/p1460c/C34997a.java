package com.p280ss.android.ugc.aweme.player.sdk.p1460c;

import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.a */
public final class C34997a {

    /* renamed from: a */
    private static int f91353a = -1;

    /* renamed from: b */
    private static int f91354b = -1;

    /* renamed from: c */
    private static final FileFilter f91355c = new FileFilter() {
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* renamed from: d */
    private static final Pattern f91356d = Pattern.compile("^0-([\\d]+)$");

    /* renamed from: c */
    private static int m112961c() {
        return new File("/sys/devices/system/cpu/").listFiles(f91355c).length;
    }

    /* renamed from: a */
    public static int m112955a() {
        if (VERSION.SDK_INT <= 10) {
            return 1;
        }
        if (f91353a > 0) {
            return f91353a;
        }
        int i = -1;
        try {
            int a = m112956a("/sys/devices/system/cpu/possible");
            if (a == -1) {
                a = m112956a("/sys/devices/system/cpu/present");
            }
            if (a == -1) {
                a = m112961c();
            }
            i = a;
        } catch (NullPointerException | SecurityException unused) {
        }
        f91353a = i;
        return i;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0061 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m112959b() {
        /*
            int r0 = f91354b
            if (r0 <= 0) goto L_0x0007
            int r0 = f91354b
            return r0
        L_0x0007:
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x000b:
            int r4 = m112955a()     // Catch:{ IOException -> 0x008e }
            if (r2 >= r4) goto L_0x006d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008e }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x008e }
            r4.append(r2)     // Catch:{ IOException -> 0x008e }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x008e }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x008e }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x008e }
            r5.<init>(r4)     // Catch:{ IOException -> 0x008e }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x008e }
            if (r4 == 0) goto L_0x006a
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x008e }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008e }
            r7.<init>(r5)     // Catch:{ IOException -> 0x008e }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            r5 = 0
        L_0x003c:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            if (r8 == 0) goto L_0x0049
            if (r5 >= r4) goto L_0x0049
            int r5 = r5 + 1
            goto L_0x003c
        L_0x0049:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            r4.<init>(r6, r0, r5)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            if (r5 <= r3) goto L_0x0061
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            r3 = r4
        L_0x0061:
            r7.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x008e }
            throw r0     // Catch:{ IOException -> 0x008e }
        L_0x006a:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x006d:
            if (r3 != r1) goto L_0x008c
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008e }
            java.lang.String r2 = "/proc/cpuinfo"
            r0.<init>(r2)     // Catch:{ IOException -> 0x008e }
            java.lang.String r2 = "cpu MHz"
            int r2 = m112957a(r2, r0)     // Catch:{ all -> 0x0087 }
            int r2 = r2 * 1000
            if (r2 <= r3) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r2 = r3
        L_0x0082:
            r0.close()     // Catch:{ IOException -> 0x008e }
            r1 = r2
            goto L_0x008f
        L_0x0087:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x008e }
            throw r2     // Catch:{ IOException -> 0x008e }
        L_0x008c:
            r1 = r3
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            if (r1 <= 0) goto L_0x0093
            int r1 = r1 * 1000
        L_0x0093:
            f91354b = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.player.sdk.p1460c.C34997a.m112959b():int");
    }

    /* renamed from: b */
    private static int m112960b(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024 A[SYNTHETIC, Splitter:B:15:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC, Splitter:B:21:0x002a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m112956a(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0028, all -> 0x0020 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0028, all -> 0x0020 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            java.lang.String r2 = r2.readLine()     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            int r2 = m112960b(r2)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            r1.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return r2
        L_0x001c:
            r2 = move-exception
            goto L_0x0022
        L_0x001e:
            r0 = r1
            goto L_0x0028
        L_0x0020:
            r2 = move-exception
            r1 = r0
        L_0x0022:
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r2
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.player.sdk.p1460c.C34997a.m112956a(java.lang.String):int");
    }

    /* renamed from: a */
    private static int m112957a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            return m112958a(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }

    /* renamed from: a */
    private static int m112958a(byte[] bArr, int i) {
        while (i < 1024 && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < 1024 && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }
}
