package com.ttnet.org.chromium.base1;

import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public class ApkAssets {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[SYNTHETIC, Splitter:B:22:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056 A[SYNTHETIC, Splitter:B:28:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long[] open(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 3
            r1 = 0
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            android.content.res.AssetFileDescriptor r6 = r6.openNonAssetFd(r7)     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            long[] r1 = new long[r0]     // Catch:{ IOException -> 0x002c }
            r2 = 0
            android.os.ParcelFileDescriptor r3 = r6.getParcelFileDescriptor()     // Catch:{ IOException -> 0x002c }
            int r3 = r3.detachFd()     // Catch:{ IOException -> 0x002c }
            long r3 = (long) r3     // Catch:{ IOException -> 0x002c }
            r1[r2] = r3     // Catch:{ IOException -> 0x002c }
            r2 = 1
            long r3 = r6.getStartOffset()     // Catch:{ IOException -> 0x002c }
            r1[r2] = r3     // Catch:{ IOException -> 0x002c }
            r2 = 2
            long r3 = r6.getLength()     // Catch:{ IOException -> 0x002c }
            r1[r2] = r3     // Catch:{ IOException -> 0x002c }
            if (r6 == 0) goto L_0x002b
            r6.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            return r1
        L_0x002c:
            r1 = move-exception
            goto L_0x0035
        L_0x002e:
            r7 = move-exception
            r6 = r1
            goto L_0x0054
        L_0x0031:
            r6 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
        L_0x0035:
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x0048
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0053 }
            r1.equals(r7)     // Catch:{ all -> 0x0053 }
        L_0x0048:
            long[] r7 = new long[r0]     // Catch:{ all -> 0x0053 }
            r7 = {-1, -1, -1} // fill-array
            if (r6 == 0) goto L_0x0052
            r6.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r7
        L_0x0053:
            r7 = move-exception
        L_0x0054:
            if (r6 == 0) goto L_0x0059
            r6.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.ApkAssets.open(android.content.Context, java.lang.String):long[]");
    }
}
