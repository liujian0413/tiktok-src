package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public class ApkAssets {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[SYNTHETIC, Splitter:B:22:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A[SYNTHETIC, Splitter:B:28:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long[] open(java.lang.String r7) {
        /*
            r0 = 3
            r1 = 0
            android.content.Context r2 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            android.content.res.AssetFileDescriptor r2 = r2.openNonAssetFd(r7)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            long[] r1 = new long[r0]     // Catch:{ IOException -> 0x0030 }
            r3 = 0
            android.os.ParcelFileDescriptor r4 = r2.getParcelFileDescriptor()     // Catch:{ IOException -> 0x0030 }
            int r4 = r4.detachFd()     // Catch:{ IOException -> 0x0030 }
            long r4 = (long) r4     // Catch:{ IOException -> 0x0030 }
            r1[r3] = r4     // Catch:{ IOException -> 0x0030 }
            r3 = 1
            long r4 = r2.getStartOffset()     // Catch:{ IOException -> 0x0030 }
            r1[r3] = r4     // Catch:{ IOException -> 0x0030 }
            r3 = 2
            long r4 = r2.getLength()     // Catch:{ IOException -> 0x0030 }
            r1[r3] = r4     // Catch:{ IOException -> 0x0030 }
            if (r2 == 0) goto L_0x002f
            r2.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r1
        L_0x0030:
            r1 = move-exception
            goto L_0x0039
        L_0x0032:
            r7 = move-exception
            r2 = r1
            goto L_0x0058
        L_0x0035:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x0039:
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = ""
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x004c
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0057 }
            r1.equals(r7)     // Catch:{ all -> 0x0057 }
        L_0x004c:
            long[] r7 = new long[r0]     // Catch:{ all -> 0x0057 }
            r7 = {-1, -1, -1} // fill-array
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r7
        L_0x0057:
            r7 = move-exception
        L_0x0058:
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ApkAssets.open(java.lang.String):long[]");
    }
}
