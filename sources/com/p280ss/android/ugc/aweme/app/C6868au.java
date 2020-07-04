package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.os.Process;
import com.p280ss.android.common.util.C6776h;

/* renamed from: com.ss.android.ugc.aweme.app.au */
public final class C6868au {
    /* renamed from: a */
    public static long m21378a(Context context) {
        if (C6776h.m20947b(context)) {
            return Thread.currentThread().getId();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC, Splitter:B:15:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC, Splitter:B:23:0x003d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21379a(int r5) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            java.lang.String r4 = "/proc/"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            r3.append(r5)     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            java.lang.String r5 = "/cmdline"
            r3.append(r5)     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            r2.<init>(r5)     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x003a, all -> 0x0033 }
            java.lang.String r5 = r1.readLine()     // Catch:{ Throwable -> 0x003b, all -> 0x0030 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x003b, all -> 0x0030 }
            if (r2 != 0) goto L_0x002c
            java.lang.String r5 = r5.trim()     // Catch:{ Throwable -> 0x003b, all -> 0x0030 }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r5
        L_0x0030:
            r5 = move-exception
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            throw r5
        L_0x003a:
            r1 = r0
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C6868au.m21379a(int):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m21380a(Context context, String str) {
        String a = m21379a(Process.myPid());
        if (a == null || !a.endsWith(str)) {
            return false;
        }
        return true;
    }
}
