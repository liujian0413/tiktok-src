package p1874it.sephiroth.android.library.easing;

/* renamed from: it.sephiroth.android.library.easing.a */
public final class C47871a implements C47872b {
    /* renamed from: a */
    public final double mo119932a(double d, double d2, double d3, double d4) {
        double d5 = (d / d4) - 1.0d;
        return (d3 * ((d5 * d5 * d5) + 1.0d)) + 0.0d;
    }

    /* renamed from: b */
    public final double mo119933b(double d, double d2, double d3, double d4) {
        double d5 = d / (d4 / 2.0d);
        if (d5 < 1.0d) {
            return ((d3 / 2.0d) * d5 * d5 * d5) + 0.0d;
        }
        double d6 = d5 - 2.0d;
        return ((d3 / 2.0d) * ((d6 * d6 * d6) + 2.0d)) + 0.0d;
    }
}
