package com.p280ss.ttm.utils;

import android.content.Context;

/* renamed from: com.ss.ttm.utils.AVFileUtil */
public class AVFileUtil {
    private static String APP_PATH;

    public static final String getAppFilesPath(Context context) {
        if (APP_PATH != null) {
            return APP_PATH;
        }
        if (context == null) {
            return null;
        }
        try {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
            return APP_PATH;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        return copyFile(str, str2, z, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b A[SYNTHETIC, Splitter:B:45:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080 A[Catch:{ IOException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0087 A[SYNTHETIC, Splitter:B:55:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x008c A[Catch:{ IOException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0093 A[SYNTHETIC, Splitter:B:65:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098 A[Catch:{ IOException -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            r1 = 0
            if (r5 != 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r5 = r0.isFile()
            if (r5 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x003f
            java.io.File r6 = new java.io.File
            r6.<init>(r4)
            r6.delete()
            goto L_0x003f
        L_0x002a:
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x003f
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L_0x003f
            return r1
        L_0x003f:
            r4 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0084, all -> 0x0075 }
            r6.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0084, all -> 0x0075 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0085, all -> 0x0072 }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0085, all -> 0x0072 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
        L_0x004e:
            int r5 = r6.read(r4)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            r3 = -1
            if (r5 == r3) goto L_0x0059
            r2.write(r4, r1, r5)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            goto L_0x004e
        L_0x0059:
            r2.close()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            r6.close()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            if (r7 == 0) goto L_0x0064
            r0.delete()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
        L_0x0064:
            r2.close()     // Catch:{ IOException -> 0x006a }
            r6.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            r4 = 1
            return r4
        L_0x006c:
            r4 = move-exception
            goto L_0x0079
        L_0x006e:
            r4 = r2
            goto L_0x0085
        L_0x0070:
            r4 = r2
            goto L_0x0091
        L_0x0072:
            r5 = move-exception
            r2 = r4
            goto L_0x0078
        L_0x0075:
            r5 = move-exception
            r6 = r4
            r2 = r6
        L_0x0078:
            r4 = r5
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ IOException -> 0x0083 }
        L_0x007e:
            if (r6 == 0) goto L_0x0083
            r6.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            throw r4
        L_0x0084:
            r6 = r4
        L_0x0085:
            if (r4 == 0) goto L_0x008a
            r4.close()     // Catch:{ IOException -> 0x008f }
        L_0x008a:
            if (r6 == 0) goto L_0x008f
            r6.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            return r1
        L_0x0090:
            r6 = r4
        L_0x0091:
            if (r4 == 0) goto L_0x0096
            r4.close()     // Catch:{ IOException -> 0x009b }
        L_0x0096:
            if (r6 == 0) goto L_0x009b
            r6.close()     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.utils.AVFileUtil.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
