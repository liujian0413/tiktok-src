package com.google.android.gms.common.util;

/* renamed from: com.google.android.gms.common.util.j */
public final class C15327j {

    /* renamed from: a */
    private static final char[] f39600a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f39601b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m44584a(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            cArr[i] = f39601b[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = f39601b[b2 & 15];
        }
        return new String(cArr);
    }
}
