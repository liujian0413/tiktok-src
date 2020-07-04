package com.google.common.base;

/* renamed from: com.google.common.base.r */
public final class C17456r {
    /* renamed from: a */
    public static boolean m58013a(String str) {
        return C17436l.m57958a(str);
    }

    /* renamed from: a */
    public static String m58012a(String str, int i) {
        C17439m.m57962a(str);
        boolean z = true;
        if (i <= 1) {
            if (i < 0) {
                z = false;
            }
            C17439m.m57971a(z, "invalid count: %s", i);
            if (i == 0) {
                str = "";
            }
            return str;
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (((long) i2) == j) {
            char[] cArr = new char[i2];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i3 = i2 - length;
                if (length < i3) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i3);
                    return new String(cArr);
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("Required array size too large: ");
            sb.append(j);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }
}
