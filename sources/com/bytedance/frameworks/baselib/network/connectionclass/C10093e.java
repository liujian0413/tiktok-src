package com.bytedance.frameworks.baselib.network.connectionclass;

/* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.e */
final class C10093e {

    /* renamed from: a */
    public double f27453a = -1.0d;

    /* renamed from: b */
    private final double f27454b = 0.05d;

    /* renamed from: c */
    private final int f27455c = ((int) Math.ceil(20.0d));

    /* renamed from: d */
    private int f27456d;

    public C10093e(double d) {
    }

    /* renamed from: a */
    public final void mo24743a(double d) {
        double d2 = 1.0d - this.f27454b;
        if (this.f27456d > this.f27455c) {
            this.f27453a = Math.exp((d2 * Math.log(this.f27453a)) + (this.f27454b * Math.log(d)));
        } else if (this.f27456d > 0) {
            double d3 = (double) this.f27456d;
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = (double) this.f27456d;
            Double.isNaN(d5);
            double d6 = d4 / (d5 + 1.0d);
            this.f27453a = Math.exp((d6 * Math.log(this.f27453a)) + ((1.0d - d6) * Math.log(d)));
        } else {
            this.f27453a = d;
        }
        this.f27456d++;
    }
}
