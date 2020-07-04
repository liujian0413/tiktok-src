package com.google.common.math;

/* renamed from: com.google.common.math.f */
final class C18129f {
    /* renamed from: a */
    static void m59899a(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    /* renamed from: b */
    static void m59901b(boolean z) {
        if (!z) {
            throw new ArithmeticException("not in range");
        }
    }

    /* renamed from: a */
    static int m59898a(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static void m59900a(boolean z, String str, int i, int i2) {
        if (!z) {
            StringBuilder sb = new StringBuilder("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }
}
