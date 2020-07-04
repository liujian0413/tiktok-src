package com.p280ss.android.socialbase.downloader.utils;

/* renamed from: com.ss.android.socialbase.downloader.utils.a */
public final class C20355a {

    /* renamed from: a */
    static final char[] f55028a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private static String m67533a(byte[] bArr) {
        if (bArr != null) {
            return m67534a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030 A[SYNTHETIC, Splitter:B:21:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0037 A[SYNTHETIC, Splitter:B:29:0x0037] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m67532a(java.io.File r6) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r6]     // Catch:{ Exception -> 0x0035, all -> 0x002a }
        L_0x0013:
            r4 = 0
            int r5 = r2.read(r3, r4, r6)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            if (r5 <= 0) goto L_0x001e
            r1.update(r3, r4, r5)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            goto L_0x0013
        L_0x001e:
            byte[] r6 = r1.digest()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            java.lang.String r6 = m67533a(r6)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r2.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r6
        L_0x002a:
            r6 = move-exception
            goto L_0x002e
        L_0x002c:
            r6 = move-exception
            r2 = r0
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r6
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.utils.C20355a.m67532a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    private static String m67534a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f55028a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f55028a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
