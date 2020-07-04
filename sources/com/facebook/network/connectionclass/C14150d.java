package com.facebook.network.connectionclass;

/* renamed from: com.facebook.network.connectionclass.d */
final class C14150d {

    /* renamed from: a */
    public double f37388a = -1.0d;

    /* renamed from: b */
    private final double f37389b = 0.05d;

    /* renamed from: c */
    private final int f37390c = ((int) Math.ceil(20.0d));

    /* renamed from: d */
    private int f37391d;

    public C14150d(double d) {
    }

    /* renamed from: a */
    public final void mo33906a(double d) {
        double d2 = 1.0d - this.f37389b;
        if (this.f37391d > this.f37390c) {
            this.f37388a = Math.exp((d2 * Math.log(this.f37388a)) + (this.f37389b * Math.log(d)));
        } else if (this.f37391d > 0) {
            double d3 = (double) this.f37391d;
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = (double) this.f37391d;
            Double.isNaN(d5);
            double d6 = d4 / (d5 + 1.0d);
            this.f37388a = Math.exp((d6 * Math.log(this.f37388a)) + ((1.0d - d6) * Math.log(d)));
        } else {
            this.f37388a = d;
        }
        this.f37391d++;
    }
}
