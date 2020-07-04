package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class bsi {

    /* renamed from: a */
    public final List<byte[]> f43409a;

    /* renamed from: b */
    public final int f43410b;

    /* renamed from: c */
    public final float f43411c;

    /* renamed from: d */
    private final int f43412d;

    /* renamed from: e */
    private final int f43413e;

    /* renamed from: a */
    public static bsi m49949a(bsa bsa) throws zzll {
        float f;
        int i;
        int i2;
        try {
            bsa.mo41225d(4);
            int d = (bsa.mo41224d() & 3) + 1;
            if (d != 3) {
                ArrayList arrayList = new ArrayList();
                int d2 = bsa.mo41224d() & 31;
                for (int i3 = 0; i3 < d2; i3++) {
                    arrayList.add(m49950b(bsa));
                }
                int d3 = bsa.mo41224d();
                for (int i4 = 0; i4 < d3; i4++) {
                    arrayList.add(m49950b(bsa));
                }
                if (d2 > 0) {
                    bry a = brx.m49890a((byte[]) arrayList.get(0), d, ((byte[]) arrayList.get(0)).length);
                    int i5 = a.f43374a;
                    int i6 = a.f43375b;
                    f = a.f43376c;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                bsi bsi = new bsi(arrayList, d, i2, i, f);
                return bsi;
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzll("Error parsing AVC config", e);
        }
    }

    private bsi(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f43409a = list;
        this.f43410b = i;
        this.f43412d = i2;
        this.f43413e = i3;
        this.f43411c = f;
    }

    /* renamed from: b */
    private static byte[] m49950b(bsa bsa) {
        int e = bsa.mo41226e();
        int i = bsa.f43389b;
        bsa.mo41225d(e);
        return brs.m49877a(bsa.f43388a, i, e);
    }
}
