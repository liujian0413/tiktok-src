package com.appsflyer;

import android.content.Context;

/* renamed from: com.appsflyer.e */
final class C1872e {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r7 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (60000 >= (r2.getTime() - r7.getTime())) goto L_0x0059;
     */
    /* renamed from: ॱ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.location.Location m8750(android.content.Context r7) {
        /*
            r0 = 0
            java.lang.String r1 = "location"
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch:{ Throwable -> 0x005c }
            android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch:{ Throwable -> 0x005c }
            java.lang.String r2 = "network"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x005c }
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            r5 = 0
            r3[r5] = r4     // Catch:{ Throwable -> 0x005c }
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            r6 = 1
            r3[r6] = r4     // Catch:{ Throwable -> 0x005c }
            boolean r3 = m8749(r7, r3)     // Catch:{ Throwable -> 0x005c }
            if (r3 == 0) goto L_0x0023
            android.location.Location r2 = r1.getLastKnownLocation(r2)     // Catch:{ Throwable -> 0x005c }
            goto L_0x0024
        L_0x0023:
            r2 = r0
        L_0x0024:
            java.lang.String r3 = "gps"
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x005c }
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            r4[r5] = r6     // Catch:{ Throwable -> 0x005c }
            boolean r7 = m8749(r7, r4)     // Catch:{ Throwable -> 0x005c }
            if (r7 == 0) goto L_0x0037
            android.location.Location r7 = r1.getLastKnownLocation(r3)     // Catch:{ Throwable -> 0x005c }
            goto L_0x0038
        L_0x0037:
            r7 = r0
        L_0x0038:
            if (r7 != 0) goto L_0x003e
            if (r2 != 0) goto L_0x003e
            r7 = r0
            goto L_0x0059
        L_0x003e:
            if (r7 != 0) goto L_0x0043
            if (r2 == 0) goto L_0x0043
            goto L_0x0058
        L_0x0043:
            if (r2 != 0) goto L_0x0047
            if (r7 != 0) goto L_0x0059
        L_0x0047:
            long r3 = r2.getTime()     // Catch:{ Throwable -> 0x005c }
            long r5 = r7.getTime()     // Catch:{ Throwable -> 0x005c }
            r1 = 0
            long r3 = r3 - r5
            r5 = 60000(0xea60, double:2.9644E-319)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0059
        L_0x0058:
            r7 = r2
        L_0x0059:
            if (r7 == 0) goto L_0x005c
            r0 = r7
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1872e.m8750(android.content.Context):android.location.Location");
    }

    /* renamed from: ˊ */
    private static boolean m8749(Context context, String[] strArr) {
        for (String r3 : strArr) {
            if (C18741.m8756(context, r3)) {
                return true;
            }
        }
        return false;
    }
}
