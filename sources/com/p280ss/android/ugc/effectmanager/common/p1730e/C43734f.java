package com.p280ss.android.ugc.effectmanager.common.p1730e;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.ugc.effectmanager.common.e.f */
public final class C43734f {

    /* renamed from: a */
    protected static char[] f113232a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m138605a(String str) {
        if (str == null) {
            return null;
        }
        return m138607b(str.getBytes());
    }

    /* renamed from: b */
    private static String m138607b(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(f113232a[(b & 240) >> 4]);
                stringBuffer.append(f113232a[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0046 A[SYNTHETIC, Splitter:B:30:0x0046] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m138604a(java.io.File r6) {
        /*
            boolean r0 = r6.isFile()
            if (r0 != 0) goto L_0x0009
            java.lang.String r6 = ""
            return r6
        L_0x0009:
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r1]
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
        L_0x001e:
            r6 = 0
            int r0 = r4.read(r2, r6, r1)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            r5 = -1
            if (r0 == r5) goto L_0x002a
            r3.update(r2, r6, r0)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            goto L_0x001e
        L_0x002a:
            r4.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            byte[] r6 = r3.digest()
            java.lang.String r6 = m138606a(r6)
            return r6
        L_0x0036:
            r6 = move-exception
            r0 = r4
            goto L_0x003c
        L_0x0039:
            r0 = r4
            goto L_0x0042
        L_0x003b:
            r6 = move-exception
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r6
        L_0x0042:
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f.m138604a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static String m138606a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
