package com.bytedance.ies.geckoclient;

/* renamed from: com.bytedance.ies.geckoclient.c */
public final class C10849c {

    /* renamed from: a */
    static final char[] f29369a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private static String m31816a(byte[] bArr) {
        if (bArr != null) {
            return m31817a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[SYNTHETIC, Splitter:B:21:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003a A[SYNTHETIC, Splitter:B:29:0x003a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m31815a(java.io.File r6) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ Exception -> 0x0037, all -> 0x002f }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0037, all -> 0x002f }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0037, all -> 0x002f }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r6]     // Catch:{ Exception -> 0x0038, all -> 0x002d }
        L_0x0013:
            r4 = 0
            int r5 = r2.read(r3, r4, r6)     // Catch:{ Exception -> 0x0038, all -> 0x002d }
            if (r5 <= 0) goto L_0x001e
            r1.update(r3, r4, r5)     // Catch:{ Exception -> 0x0038, all -> 0x002d }
            goto L_0x0013
        L_0x001e:
            r2.close()     // Catch:{ Exception -> 0x0038, all -> 0x002d }
            byte[] r6 = r1.digest()     // Catch:{ Exception -> 0x0038, all -> 0x002d }
            java.lang.String r6 = m31816a(r6)     // Catch:{ Exception -> 0x0038, all -> 0x002d }
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            return r6
        L_0x002d:
            r6 = move-exception
            goto L_0x0031
        L_0x002f:
            r6 = move-exception
            r2 = r0
        L_0x0031:
            if (r2 == 0) goto L_0x0036
            r2.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            throw r6
        L_0x0037:
            r2 = r0
        L_0x0038:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10849c.m31815a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    private static String m31817a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f29369a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f29369a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
