package com.p280ss.android.p817ad.splash.p836g;

import java.security.MessageDigest;

/* renamed from: com.ss.android.ad.splash.g.a */
public final class C19122a {

    /* renamed from: a */
    static final char[] f51705a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private static String m62655a(byte[] bArr) {
        if (bArr != null) {
            return m62656a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: a */
    public static String m62654a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m62655a(instance.digest());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m62656a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f51705a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f51705a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
