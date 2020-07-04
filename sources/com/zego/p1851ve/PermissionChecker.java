package com.zego.p1851ve;

/* renamed from: com.zego.ve.PermissionChecker */
public class PermissionChecker {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r6.checkCallingPermission(r7) == 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (((java.lang.Integer) java.lang.Class.forName("android.content.Context").getMethod("checkSelfPermission", new java.lang.Class[]{java.lang.String.class}).invoke(r6, new java.lang.Object[]{r7})).intValue() == 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkSelfPermission(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L_0x002e
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x0043 }
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x0043 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ Throwable -> 0x0043 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Throwable -> 0x0043 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0043 }
            r2[r0] = r7     // Catch:{ Throwable -> 0x0043 }
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch:{ Throwable -> 0x0043 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Throwable -> 0x0043 }
            int r6 = r6.intValue()     // Catch:{ Throwable -> 0x0043 }
            if (r6 != 0) goto L_0x0043
            goto L_0x0042
        L_0x002e:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r2 = r6.getPackageName()
            int r1 = r1.checkPermission(r7, r2)
            if (r1 != 0) goto L_0x0043
            int r6 = r6.checkCallingPermission(r7)
            if (r6 != 0) goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.p1851ve.PermissionChecker.checkSelfPermission(android.content.Context, java.lang.String):boolean");
    }
}
