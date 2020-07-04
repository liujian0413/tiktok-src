package com.p280ss.ugc.live.gift.resource.p1830d;

import java.security.MessageDigest;

/* renamed from: com.ss.ugc.live.gift.resource.d.a */
public final class C46229a {

    /* renamed from: a */
    static final char[] f118832a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private static String m145163a(byte[] bArr) {
        if (bArr != null) {
            return m145164a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m145161a(java.io.File r5) throws java.lang.Exception {
        /*
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
            r2.<init>(r5)     // Catch:{ all -> 0x0029 }
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r5]     // Catch:{ all -> 0x0027 }
        L_0x0010:
            r3 = 0
            int r4 = r2.read(r1, r3, r5)     // Catch:{ all -> 0x0027 }
            if (r4 <= 0) goto L_0x001b
            r0.update(r1, r3, r4)     // Catch:{ all -> 0x0027 }
            goto L_0x0010
        L_0x001b:
            byte[] r5 = r0.digest()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = m145163a(r5)     // Catch:{ all -> 0x0027 }
            r2.close()
            return r5
        L_0x0027:
            r5 = move-exception
            goto L_0x002b
        L_0x0029:
            r5 = move-exception
            r2 = r1
        L_0x002b:
            if (r2 == 0) goto L_0x0030
            r2.close()
        L_0x0030:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ugc.live.gift.resource.p1830d.C46229a.m145161a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static String m145162a(String str) throws Exception {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("str is null");
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(str.getBytes("UTF-8"));
        return m145163a(instance.digest());
    }

    /* renamed from: a */
    private static String m145164a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f118832a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f118832a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
