package com.airbnb.lottie.model;

/* renamed from: com.airbnb.lottie.model.b */
public final class C1802b {

    /* renamed from: a */
    public final String f6454a;

    /* renamed from: b */
    public final String f6455b;

    /* renamed from: c */
    public final double f6456c;

    /* renamed from: d */
    final int f6457d;

    /* renamed from: e */
    public final int f6458e;

    /* renamed from: f */
    final double f6459f;

    /* renamed from: g */
    public final double f6460g;

    /* renamed from: h */
    public final int f6461h;

    /* renamed from: i */
    public final int f6462i;

    /* renamed from: j */
    public final int f6463j;

    /* renamed from: k */
    public final boolean f6464k;

    public final int hashCode() {
        double hashCode = (double) (((this.f6454a.hashCode() * 31) + this.f6455b.hashCode()) * 31);
        double d = this.f6456c;
        Double.isNaN(hashCode);
        int i = (((((int) (hashCode + d)) * 31) + this.f6457d) * 31) + this.f6458e;
        long doubleToLongBits = Double.doubleToLongBits(this.f6459f);
        return (((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f6461h;
    }

    public C1802b(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, int i5, boolean z) {
        this.f6454a = str;
        this.f6455b = str2;
        this.f6456c = d;
        this.f6457d = i;
        this.f6458e = i2;
        this.f6459f = d2;
        this.f6460g = d3;
        this.f6461h = i3;
        this.f6462i = i4;
        this.f6463j = i5;
        this.f6464k = z;
    }
}
