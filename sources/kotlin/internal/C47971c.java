package kotlin.internal;

/* renamed from: kotlin.internal.c */
public final class C47971c {
    /* renamed from: a */
    private static final int m148912a(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        return i3 + i2;
    }

    /* renamed from: b */
    private static final int m148914b(int i, int i2, int i3) {
        return m148912a(m148912a(i, i3) - m148912a(i2, i3), i3);
    }

    /* renamed from: a */
    public static final int m148913a(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m148914b(i2, i, i3);
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            return i2 + m148914b(i, i2, -i3);
        }
    }
}
