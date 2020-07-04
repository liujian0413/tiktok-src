package com.bytedance.ies.uikit.imageview.imagezoom.p579a;

/* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.a.a */
public final class C11039a implements C11040b {
    /* renamed from: a */
    public final double mo26704a(double d, double d2, double d3, double d4) {
        double d5 = (d / d4) - 1.0d;
        return (d3 * ((d5 * d5 * d5) + 1.0d)) + 0.0d;
    }

    /* renamed from: b */
    public final double mo26705b(double d, double d2, double d3, double d4) {
        double d5 = d / (d4 / 2.0d);
        if (d5 < 1.0d) {
            return ((d3 / 2.0d) * d5 * d5 * d5) + 0.0d;
        }
        double d6 = d5 - 2.0d;
        return ((d3 / 2.0d) * ((d6 * d6 * d6) + 2.0d)) + 0.0d;
    }
}
