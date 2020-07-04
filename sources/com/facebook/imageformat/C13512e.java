package com.facebook.imageformat;

import com.facebook.common.internal.C13307g;
import java.io.UnsupportedEncodingException;

/* renamed from: com.facebook.imageformat.e */
public final class C13512e {
    /* renamed from: a */
    public static byte[] m39765a(String str) {
        C13307g.m38940a(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: a */
    public static boolean m39764a(byte[] bArr, byte[] bArr2) {
        C13307g.m38940a(bArr);
        C13307g.m38940a(bArr2);
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m39763a(byte[] bArr, int i, byte[] bArr2, int i2) {
        C13307g.m38940a(bArr);
        C13307g.m38940a(bArr2);
        if (i2 > i) {
            return -1;
        }
        int i3 = 0;
        byte b = bArr2[0];
        int i4 = i - i2;
        while (i3 <= i4) {
            int i5 = 1;
            if (bArr[i3] != b) {
                do {
                    i3++;
                    if (i3 > i4) {
                        break;
                    }
                } while (bArr[i3] != b);
            }
            if (i3 <= i4) {
                int i6 = i3 + 1;
                int i7 = (i6 + i2) - 1;
                while (i6 < i7 && bArr[i6] == bArr2[i5]) {
                    i6++;
                    i5++;
                }
                if (i6 == i7) {
                    return i3;
                }
            }
            i3++;
        }
        return -1;
    }
}
