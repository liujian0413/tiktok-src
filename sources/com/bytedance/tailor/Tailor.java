package com.bytedance.tailor;

import android.os.Build.VERSION;
import android.os.Debug;
import com.bytedance.p255e.C6326a;
import java.io.IOException;

public class Tailor {
    private Tailor() {
    }

    private static native void closeTailor();

    private static native void openTailor(String str, boolean z);

    public static native void tailorHprof(String str, String str2);

    static {
        C6326a.m19641a("tailor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028 A[SYNTHETIC, Splitter:B:18:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002e A[SYNTHETIC, Splitter:B:24:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isHprofValid(java.lang.String r7) {
        /*
            r0 = 0
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x002c, all -> 0x0025 }
            java.lang.String r3 = "r"
            r2.<init>(r7, r3)     // Catch:{ Throwable -> 0x002c, all -> 0x0025 }
            long r3 = r2.length()     // Catch:{ Throwable -> 0x0023, all -> 0x0020 }
            r5 = 9
            long r3 = r3 - r5
            r2.seek(r3)     // Catch:{ Throwable -> 0x0023, all -> 0x0020 }
            byte r7 = r2.readByte()     // Catch:{ Throwable -> 0x0023, all -> 0x0020 }
            r1 = 44
            if (r7 != r1) goto L_0x001c
            r0 = 1
        L_0x001c:
            r2.close()     // Catch:{ Throwable -> 0x001f }
        L_0x001f:
            return r0
        L_0x0020:
            r7 = move-exception
            r1 = r2
            goto L_0x0026
        L_0x0023:
            r1 = r2
            goto L_0x002c
        L_0x0025:
            r7 = move-exception
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ Throwable -> 0x002b }
        L_0x002b:
            throw r7
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ Throwable -> 0x0031 }
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tailor.Tailor.isHprofValid(java.lang.String):boolean");
    }

    public static void dumpHprofData(String str, boolean z) throws IOException {
        if (VERSION.SDK_INT > 19) {
            openTailor(str, z);
            Debug.dumpHprofData(str);
            closeTailor();
            return;
        }
        Debug.dumpHprofData(str);
    }
}
