package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@C6505uv
public final class adw {

    /* renamed from: a */
    private final String[] f40075a;

    /* renamed from: b */
    private final double[] f40076b;

    /* renamed from: c */
    private final double[] f40077c;

    /* renamed from: d */
    private final int[] f40078d;

    /* renamed from: e */
    private int f40079e;

    private adw(adz adz) {
        int size = adz.f40086b.size();
        this.f40075a = (String[]) adz.f40085a.toArray(new String[size]);
        this.f40076b = m45663a(adz.f40086b);
        this.f40077c = m45663a(adz.f40087c);
        this.f40078d = new int[size];
        this.f40079e = 0;
    }

    /* renamed from: a */
    private static double[] m45663a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final void mo39239a(double d) {
        this.f40079e++;
        int i = 0;
        while (i < this.f40077c.length) {
            if (this.f40077c[i] <= d && d < this.f40076b[i]) {
                int[] iArr = this.f40078d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f40077c[i]) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final List<ady> mo39238a() {
        ArrayList arrayList = new ArrayList(this.f40075a.length);
        for (int i = 0; i < this.f40075a.length; i++) {
            String str = this.f40075a[i];
            double d = this.f40077c[i];
            double d2 = this.f40076b[i];
            double d3 = (double) this.f40078d[i];
            double d4 = (double) this.f40079e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            ady ady = new ady(str, d, d2, d3 / d4, this.f40078d[i]);
            arrayList.add(ady);
        }
        return arrayList;
    }
}
