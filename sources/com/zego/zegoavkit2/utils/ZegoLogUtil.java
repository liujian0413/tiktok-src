package com.zego.zegoavkit2.utils;

public final class ZegoLogUtil {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getLogPath(android.content.Context r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r2 = "mounted"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0026
            java.io.File r1 = r3.getExternalFilesDir(r0)
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = r1.getAbsolutePath()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0026
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            if (r2 != 0) goto L_0x003e
            java.io.File r3 = r3.getFilesDir()
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = r3.getAbsolutePath()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x003e
            java.io.File r2 = new java.io.File
            r2.<init>(r3)
        L_0x003e:
            if (r2 != 0) goto L_0x0041
            return r0
        L_0x0041:
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x0051
            r2.mkdirs()
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x0051
            return r0
        L_0x0051:
            java.lang.String r3 = r2.getAbsolutePath()
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.zegoavkit2.utils.ZegoLogUtil.getLogPath(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getTemporaryFolder(android.content.Context r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r2 = "mounted"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0026
            java.io.File r1 = r3.getExternalCacheDir()
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = r1.getAbsolutePath()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0026
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            if (r2 != 0) goto L_0x003e
            java.io.File r3 = r3.getCacheDir()
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = r3.getAbsolutePath()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x003e
            java.io.File r2 = new java.io.File
            r2.<init>(r3)
        L_0x003e:
            if (r2 != 0) goto L_0x0041
            return r0
        L_0x0041:
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x0051
            r2.mkdirs()
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x0051
            return r0
        L_0x0051:
            java.lang.String r3 = r2.getAbsolutePath()
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.zegoavkit2.utils.ZegoLogUtil.getTemporaryFolder(android.content.Context):java.lang.String");
    }
}
