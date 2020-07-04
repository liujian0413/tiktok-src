package com.google.common.math;

import com.google.common.base.C17439m;

/* renamed from: com.google.common.math.b */
final class C18118b {
    /* renamed from: b */
    static boolean m59884b(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static double m59885c(double d) {
        C17439m.m57968a(!Double.isNaN(d));
        if (d > 0.0d) {
            return d;
        }
        return 0.0d;
    }

    /* renamed from: a */
    static long m59883a(double d) {
        C17439m.m57969a(m59884b(d), (Object) "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }
}
