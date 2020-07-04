package kotlin.p1878b;

/* renamed from: kotlin.b.c */
public class C47893c extends C47892b {
    /* renamed from: b */
    public static final long m148823b(float f) {
        return C47891a.m148822a((double) f);
    }

    /* renamed from: a */
    public static final int m148821a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: a */
    public static final long m148822a(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
