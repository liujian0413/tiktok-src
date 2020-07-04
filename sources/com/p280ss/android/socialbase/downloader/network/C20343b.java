package com.p280ss.android.socialbase.downloader.network;

/* renamed from: com.ss.android.socialbase.downloader.network.b */
final class C20343b {

    /* renamed from: a */
    public double f54994a = -1.0d;

    /* renamed from: b */
    private final double f54995b = 0.05d;

    /* renamed from: c */
    private final int f54996c = ((int) Math.ceil(20.0d));

    /* renamed from: d */
    private int f54997d;

    public C20343b(double d) {
    }

    /* renamed from: a */
    public final void mo54905a(double d) {
        double d2 = 1.0d - this.f54995b;
        if (this.f54997d > this.f54996c) {
            this.f54994a = Math.exp((d2 * Math.log(this.f54994a)) + (this.f54995b * Math.log(d)));
        } else if (this.f54997d > 0) {
            double d3 = (double) this.f54997d;
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = (double) this.f54997d;
            Double.isNaN(d5);
            double d6 = d4 / (d5 + 1.0d);
            this.f54994a = Math.exp((d6 * Math.log(this.f54994a)) + ((1.0d - d6) * Math.log(d)));
        } else {
            this.f54994a = d;
        }
        this.f54997d++;
    }
}
