package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.math.BigInteger;

/* renamed from: com.google.common.primitives.i */
public final class C18151i {

    /* renamed from: com.google.common.primitives.i$a */
    static final class C18152a {

        /* renamed from: a */
        static final long[] f49513a = new long[37];

        /* renamed from: b */
        static final int[] f49514b = new int[37];

        /* renamed from: c */
        static final int[] f49515c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = (long) i;
                f49513a[i] = C18151i.m60003b(-1, j);
                f49514b[i] = (int) C18151i.m60004c(-1, j);
                f49515c[i] = bigInteger.toString(i).length() - 1;
            }
        }

        /* renamed from: a */
        static boolean m60005a(long j, int i, int i2) {
            if (j < 0) {
                return true;
            }
            if (j < f49513a[i2]) {
                return false;
            }
            if (j <= f49513a[i2] && i <= f49514b[i2]) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    private static long m60002b(long j) {
        return j ^ Long.MIN_VALUE;
    }

    /* renamed from: a */
    public static String m60000a(long j) {
        return m60001a(j, 10);
    }

    /* renamed from: a */
    public static int m59998a(long j, long j2) {
        return C18145d.m59976a(m60002b(j), m60002b(j2));
    }

    /* renamed from: b */
    public static long m60003b(long j, long j2) {
        if (j2 < 0) {
            if (m59998a(j, j2) < 0) {
                return 0;
            }
            return 1;
        } else if (j >= 0) {
            return j / j2;
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            if (m59998a(j - (j3 * j2), j2) < 0) {
                i = 0;
            }
            return j3 + ((long) i);
        }
    }

    /* renamed from: c */
    public static long m60004c(long j, long j2) {
        if (j2 < 0) {
            if (m59998a(j, j2) < 0) {
                return j;
            }
            return j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (m59998a(j3, j2) < 0) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }

    /* renamed from: a */
    public static long m59999a(String str, int i) {
        C17439m.m57962a(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        } else if (i < 2 || i > 36) {
            StringBuilder sb = new StringBuilder("illegal radix: ");
            sb.append(i);
            throw new NumberFormatException(sb.toString());
        } else {
            int i2 = C18152a.f49515c[i] - 1;
            long j = 0;
            int i3 = 0;
            while (i3 < str.length()) {
                int digit = Character.digit(str.charAt(i3), i);
                if (digit == -1) {
                    throw new NumberFormatException(str);
                } else if (i3 <= i2 || !C18152a.m60005a(j, digit, i)) {
                    j = (j * ((long) i)) + ((long) digit);
                    i3++;
                } else {
                    StringBuilder sb2 = new StringBuilder("Too large for unsigned long: ");
                    sb2.append(str);
                    throw new NumberFormatException(sb2.toString());
                }
            }
            return j;
        }
    }

    /* renamed from: a */
    public static String m60001a(long j, int i) {
        boolean z;
        int i2;
        long j2;
        if (i < 2 || i > 36) {
            z = false;
        } else {
            z = true;
        }
        C17439m.m57971a(z, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            long j3 = j;
            i2 = 64;
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j3) & i3, i);
                j3 >>>= numberOfTrailingZeros;
            } while (j3 != 0);
        } else {
            if ((i & 1) == 0) {
                j2 = (j >>> 1) / ((long) (i >>> 1));
            } else {
                j2 = m60003b(j, (long) i);
            }
            long j4 = (long) i;
            cArr[63] = Character.forDigit((int) (j - (j2 * j4)), i);
            i2 = 63;
            while (j2 > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (j2 % j4), i);
                j2 /= j4;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }
}
