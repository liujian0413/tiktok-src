package com.google.common.primitives;

import com.google.common.base.C17439m;

/* renamed from: com.google.common.primitives.h */
public final class C18150h {
    /* renamed from: a */
    public static long m59993a(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: b */
    private static int m59994b(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static int m59991a(int i, int i2) {
        return C18143c.m59966a(m59994b(i), m59994b(i2));
    }

    /* renamed from: b */
    public static int m59995b(int i, int i2) {
        return (int) (m59993a(i) / m59993a(i2));
    }

    /* renamed from: c */
    public static int m59996c(int i, int i2) {
        return (int) (m59993a(i) % m59993a(i2));
    }

    /* renamed from: d */
    public static String m59997d(int i, int i2) {
        return Long.toString(((long) i) & 4294967295L, i2);
    }

    /* renamed from: a */
    public static int m59992a(String str, int i) {
        C17439m.m57962a(str);
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        StringBuilder sb = new StringBuilder("Input ");
        sb.append(str);
        sb.append(" in base ");
        sb.append(i);
        sb.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb.toString());
    }
}
