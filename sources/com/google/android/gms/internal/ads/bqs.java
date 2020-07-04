package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

public abstract class bqs extends bqy {

    /* renamed from: b */
    private final SparseArray<Map<bql, bqu>> f43287b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f43288c = new SparseBooleanArray();

    /* renamed from: d */
    private int f43289d = 0;

    /* renamed from: e */
    private bqt f43290e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bqv[] mo41170a(blk[] blkArr, bql[] bqlArr, int[][][] iArr) throws zzkt;

    /* renamed from: a */
    public final void mo41174a(int i, boolean z) {
        if (this.f43288c.get(i) != z) {
            this.f43288c.put(i, z);
            mo41180a();
        }
    }

    /* renamed from: a */
    public final bra mo41173a(blk[] blkArr, bql bql) throws zzkt {
        int[] iArr;
        blk[] blkArr2 = blkArr;
        bql bql2 = bql;
        int[] iArr2 = new int[(blkArr2.length + 1)];
        bqj[][] bqjArr = new bqj[(blkArr2.length + 1)][];
        int[][][] iArr3 = new int[(blkArr2.length + 1)][][];
        for (int i = 0; i < bqjArr.length; i++) {
            bqjArr[i] = new bqj[bql2.f43267b];
            iArr3[i] = new int[bql2.f43267b][];
        }
        int[] iArr4 = new int[blkArr2.length];
        for (int i2 = 0; i2 < iArr4.length; i2++) {
            iArr4[i2] = blkArr2[i2].mo40843l();
        }
        for (int i3 = 0; i3 < bql2.f43267b; i3++) {
            bqj a = bql2.mo41160a(i3);
            int length = blkArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= blkArr2.length) {
                    i4 = length;
                    break;
                }
                blk blk = blkArr2[i4];
                int i6 = length;
                for (int i7 = 0; i7 < a.f43248a; i7++) {
                    int a2 = blk.mo40899a(a.mo41141a(i7)) & 3;
                    if (a2 > i5) {
                        if (a2 == 3) {
                            break;
                        }
                        i6 = i4;
                        i5 = a2;
                    }
                }
                i4++;
                length = i6;
            }
            if (i4 == blkArr2.length) {
                iArr = new int[a.f43248a];
            } else {
                blk blk2 = blkArr2[i4];
                int[] iArr5 = new int[a.f43248a];
                for (int i8 = 0; i8 < a.f43248a; i8++) {
                    iArr5[i8] = blk2.mo40899a(a.mo41141a(i8));
                }
                iArr = iArr5;
            }
            int i9 = iArr2[i4];
            bqjArr[i4][i9] = a;
            iArr3[i4][i9] = iArr;
            iArr2[i4] = iArr2[i4] + 1;
        }
        bql[] bqlArr = new bql[blkArr2.length];
        int[] iArr6 = new int[blkArr2.length];
        for (int i10 = 0; i10 < blkArr2.length; i10++) {
            int i11 = iArr2[i10];
            bqlArr[i10] = new bql((bqj[]) Arrays.copyOf(bqjArr[i10], i11));
            iArr3[i10] = (int[][]) Arrays.copyOf(iArr3[i10], i11);
            iArr6[i10] = blkArr2[i10].mo40822a();
        }
        bql bql3 = new bql((bqj[]) Arrays.copyOf(bqjArr[blkArr2.length], iArr2[blkArr2.length]));
        bqv[] a3 = mo41170a(blkArr2, bqlArr, iArr3);
        int i12 = 0;
        while (true) {
            bqu bqu = null;
            if (i12 < blkArr2.length) {
                if (this.f43288c.get(i12)) {
                    a3[i12] = null;
                } else {
                    bql bql4 = bqlArr[i12];
                    Map map = (Map) this.f43287b.get(i12);
                    if (map != null) {
                        bqu = (bqu) map.get(bql4);
                    }
                    if (bqu != null) {
                        throw new NoSuchMethodError();
                    }
                }
                i12++;
            } else {
                bqt bqt = new bqt(iArr6, bqlArr, iArr4, iArr3, bql3);
                bll[] bllArr = new bll[blkArr2.length];
                for (int i13 = 0; i13 < blkArr2.length; i13++) {
                    bllArr[i13] = a3[i13] != null ? bll.f42504a : null;
                }
                return new bra(bql2, new bqx(a3), bqt, bllArr);
            }
        }
    }

    /* renamed from: a */
    public final void mo41175a(Object obj) {
        this.f43290e = (bqt) obj;
    }
}
