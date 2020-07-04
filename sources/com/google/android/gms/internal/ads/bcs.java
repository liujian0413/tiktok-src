package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class bcs {

    /* renamed from: a */
    public static final bcs f41468a;

    /* renamed from: k */
    private static final bcs f41469k;

    /* renamed from: l */
    private static final bcs f41470l;

    /* renamed from: m */
    private static final bcs f41471m;

    /* renamed from: b */
    private final double f41472b;

    /* renamed from: c */
    private final double f41473c;

    /* renamed from: d */
    private final double f41474d;

    /* renamed from: e */
    private final double f41475e;

    /* renamed from: f */
    private final double f41476f;

    /* renamed from: g */
    private final double f41477g;

    /* renamed from: h */
    private final double f41478h;

    /* renamed from: i */
    private final double f41479i;

    /* renamed from: j */
    private final double f41480j;

    private bcs(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f41472b = d5;
        this.f41473c = d6;
        this.f41474d = d7;
        this.f41475e = d;
        this.f41476f = d2;
        this.f41477g = d3;
        this.f41478h = d4;
        this.f41479i = d8;
        this.f41480j = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bcs bcs = (bcs) obj;
        return Double.compare(bcs.f41475e, this.f41475e) == 0 && Double.compare(bcs.f41476f, this.f41476f) == 0 && Double.compare(bcs.f41477g, this.f41477g) == 0 && Double.compare(bcs.f41478h, this.f41478h) == 0 && Double.compare(bcs.f41479i, this.f41479i) == 0 && Double.compare(bcs.f41480j, this.f41480j) == 0 && Double.compare(bcs.f41472b, this.f41472b) == 0 && Double.compare(bcs.f41473c, this.f41473c) == 0 && Double.compare(bcs.f41474d, this.f41474d) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41472b);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41473c);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41474d);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f41475e);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.f41476f);
        int i5 = (i4 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41477g);
        int i6 = (i5 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41478h);
        int i7 = (i6 * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
        long doubleToLongBits8 = Double.doubleToLongBits(this.f41479i);
        int i8 = (i7 * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)));
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41480j);
        return (i8 * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f41468a)) {
            return "Rotate 0°";
        }
        if (equals(f41469k)) {
            return "Rotate 90°";
        }
        if (equals(f41470l)) {
            return "Rotate 180°";
        }
        if (equals(f41471m)) {
            return "Rotate 270°";
        }
        double d = this.f41472b;
        double d2 = this.f41473c;
        double d3 = this.f41474d;
        double d4 = this.f41475e;
        double d5 = this.f41476f;
        double d6 = this.f41477g;
        double d7 = this.f41478h;
        double d8 = this.f41479i;
        double d9 = this.f41480j;
        double d10 = d7;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d10);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static bcs m48437a(ByteBuffer byteBuffer) {
        double d = C16223zm.m52632d(byteBuffer);
        double d2 = C16223zm.m52632d(byteBuffer);
        double e = C16223zm.m52633e(byteBuffer);
        bcs bcs = new bcs(d, d2, C16223zm.m52632d(byteBuffer), C16223zm.m52632d(byteBuffer), e, C16223zm.m52633e(byteBuffer), C16223zm.m52633e(byteBuffer), C16223zm.m52632d(byteBuffer), C16223zm.m52632d(byteBuffer));
        return bcs;
    }

    static {
        bcs bcs = new bcs(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
        f41468a = bcs;
        bcs bcs2 = new bcs(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
        f41469k = bcs2;
        bcs bcs3 = new bcs(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
        f41470l = bcs3;
        bcs bcs4 = new bcs(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
        f41471m = bcs4;
    }
}
