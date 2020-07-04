package com.toutiao.proxyserver.speed;

/* renamed from: com.toutiao.proxyserver.speed.d */
final class C46551d {

    /* renamed from: a */
    public double f119967a = -1.0d;

    /* renamed from: b */
    private final double f119968b = 0.05d;

    /* renamed from: c */
    private final int f119969c = ((int) Math.ceil(20.0d));

    /* renamed from: d */
    private int f119970d;

    public C46551d(double d) {
    }

    /* renamed from: a */
    public final void mo115730a(double d) {
        double d2 = 1.0d - this.f119968b;
        if (this.f119970d > this.f119969c) {
            this.f119967a = Math.exp((d2 * Math.log(this.f119967a)) + (this.f119968b * Math.log(d)));
        } else if (this.f119970d > 0) {
            double d3 = (double) this.f119970d;
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = (double) this.f119970d;
            Double.isNaN(d5);
            double d6 = d4 / (d5 + 1.0d);
            this.f119967a = Math.exp((d6 * Math.log(this.f119967a)) + ((1.0d - d6) * Math.log(d)));
        } else {
            this.f119967a = d;
        }
        this.f119970d++;
    }
}
