package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class bsn {

    /* renamed from: a */
    public final List<byte[]> f43420a;

    /* renamed from: b */
    public final int f43421b;

    /* renamed from: a */
    public static bsn m49955a(bsa bsa) throws zzll {
        List list;
        try {
            bsa.mo41225d(21);
            int d = bsa.mo41224d() & 3;
            int d2 = bsa.mo41224d();
            int i = bsa.f43389b;
            int i2 = 0;
            int i3 = 0;
            while (i2 < d2) {
                bsa.mo41225d(1);
                int e = bsa.mo41226e();
                int i4 = i3;
                for (int i5 = 0; i5 < e; i5++) {
                    int e2 = bsa.mo41226e();
                    i4 += e2 + 4;
                    bsa.mo41225d(e2);
                }
                i2++;
                i3 = i4;
            }
            bsa.mo41223c(i);
            byte[] bArr = new byte[i3];
            int i6 = 0;
            int i7 = 0;
            while (i6 < d2) {
                bsa.mo41225d(1);
                int e3 = bsa.mo41226e();
                int i8 = i7;
                for (int i9 = 0; i9 < e3; i9++) {
                    int e4 = bsa.mo41226e();
                    System.arraycopy(brx.f43370a, 0, bArr, i8, brx.f43370a.length);
                    int length = i8 + brx.f43370a.length;
                    System.arraycopy(bsa.f43388a, bsa.f43389b, bArr, length, e4);
                    i8 = length + e4;
                    bsa.mo41225d(e4);
                }
                i6++;
                i7 = i8;
            }
            if (i3 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new bsn(list, d + 1);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new zzll("Error parsing HEVC config", e5);
        }
    }

    private bsn(List<byte[]> list, int i) {
        this.f43420a = list;
        this.f43421b = i;
    }
}
