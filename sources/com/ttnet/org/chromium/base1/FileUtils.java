package com.ttnet.org.chromium.base1;

import java.io.File;
import java.util.List;

public class FileUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void batchDeleteFiles(List<File> list) {
        for (File file : list) {
            if (file.exists()) {
                recursivelyDeleteFile(file);
            }
        }
    }

    public static void recursivelyDeleteFile(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File recursivelyDeleteFile : listFiles) {
                    recursivelyDeleteFile(recursivelyDeleteFile);
                }
            }
        }
        if (!file.delete()) {
            StringBuilder sb = new StringBuilder("Failed to delete: ");
            sb.append(file);
            Log.m22891e("FileUtils", sb.toString(), new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032 A[SYNTHETIC, Splitter:B:20:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC, Splitter:B:24:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean extractAsset(android.content.Context r3, java.lang.String r4, java.io.File r5) {
        /*
            r0 = 0
            r1 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x002f }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x002f }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x002d }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002d }
            r2.<init>(r5)     // Catch:{ IOException -> 0x002d }
            r4.<init>(r2)     // Catch:{ IOException -> 0x002d }
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x002b }
        L_0x0018:
            int r1 = r3.read(r5)     // Catch:{ IOException -> 0x002b }
            r2 = -1
            if (r1 == r2) goto L_0x0023
            r4.write(r5, r0, r1)     // Catch:{ IOException -> 0x002b }
            goto L_0x0018
        L_0x0023:
            r3.close()     // Catch:{ IOException -> 0x002b }
            r4.close()     // Catch:{ IOException -> 0x002b }
            r3 = 1
            return r3
        L_0x002b:
            r1 = r4
            goto L_0x0030
        L_0x002d:
            goto L_0x0030
        L_0x002f:
            r3 = r1
        L_0x0030:
            if (r3 == 0) goto L_0x0037
            r3.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.FileUtils.extractAsset(android.content.Context, java.lang.String, java.io.File):boolean");
    }
}
