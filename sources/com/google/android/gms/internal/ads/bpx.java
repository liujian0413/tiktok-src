package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

final class bpx implements bpt, bpu {

    /* renamed from: a */
    public final bpt[] f43187a;

    /* renamed from: b */
    private final IdentityHashMap<bqf, Integer> f43188b = new IdentityHashMap<>();

    /* renamed from: c */
    private bpu f43189c;

    /* renamed from: d */
    private int f43190d;

    /* renamed from: e */
    private bql f43191e;

    /* renamed from: f */
    private bpt[] f43192f;

    /* renamed from: g */
    private bqg f43193g;

    public bpx(bpt... bptArr) {
        this.f43187a = bptArr;
    }

    /* renamed from: a */
    public final void mo41091a(bpu bpu, long j) {
        this.f43189c = bpu;
        this.f43190d = this.f43187a.length;
        for (bpt a : this.f43187a) {
            a.mo41091a(this, j);
        }
    }

    /* renamed from: c */
    public final bql mo41098c() {
        return this.f43191e;
    }

    /* renamed from: a */
    public final long mo41089a(bqv[] bqvArr, boolean[] zArr, bqf[] bqfArr, boolean[] zArr2, long j) {
        int i;
        bqv[] bqvArr2 = bqvArr;
        bqf[] bqfArr2 = bqfArr;
        int[] iArr = new int[bqvArr2.length];
        int[] iArr2 = new int[bqvArr2.length];
        for (int i2 = 0; i2 < bqvArr2.length; i2++) {
            if (bqfArr2[i2] == null) {
                i = -1;
            } else {
                i = ((Integer) this.f43188b.get(bqfArr2[i2])).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (bqvArr2[i2] != null) {
                bqj a = bqvArr2[i2].mo41163a();
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f43187a.length) {
                        break;
                    } else if (this.f43187a[i3].mo41098c().mo41159a(a) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f43188b.clear();
        bqf[] bqfArr3 = new bqf[bqvArr2.length];
        bqf[] bqfArr4 = new bqf[bqvArr2.length];
        bqv[] bqvArr3 = new bqv[bqvArr2.length];
        ArrayList arrayList = new ArrayList(this.f43187a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f43187a.length) {
            int i5 = 0;
            while (i5 < bqvArr2.length) {
                bqv bqv = null;
                bqfArr4[i5] = iArr[i5] == i4 ? bqfArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    bqv = bqvArr2[i5];
                }
                bqvArr3[i5] = bqv;
                i5++;
            }
            ArrayList arrayList2 = arrayList;
            bqv[] bqvArr4 = bqvArr3;
            int i6 = i4;
            long a2 = this.f43187a[i4].mo41089a(bqvArr3, zArr, bqfArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = a2;
            } else if (a2 != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < bqvArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    brr.m49873b(bqfArr4[i7] != null);
                    bqfArr3[i7] = bqfArr4[i7];
                    this.f43188b.put(bqfArr4[i7], Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (bqfArr4[i7] != null) {
                        z2 = false;
                    }
                    brr.m49873b(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f43187a[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            bqvArr3 = bqvArr4;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(bqfArr3, 0, bqfArr2, 0, bqfArr3.length);
        this.f43192f = new bpt[arrayList3.size()];
        arrayList3.toArray(this.f43192f);
        this.f43193g = new bpi(this.f43192f);
        return j2;
    }

    /* renamed from: a */
    public final boolean mo41086a(long j) {
        return this.f43193g.mo41086a(j);
    }

    /* renamed from: H_ */
    public final long mo41085H_() {
        return this.f43193g.mo41085H_();
    }

    /* renamed from: d */
    public final long mo41099d() {
        long d = this.f43187a[0].mo41099d();
        int i = 1;
        while (i < this.f43187a.length) {
            if (this.f43187a[i].mo41099d() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
        if (d != -9223372036854775807L) {
            bpt[] bptArr = this.f43192f;
            int length = bptArr.length;
            int i2 = 0;
            while (i2 < length) {
                bpt bpt = bptArr[i2];
                if (bpt == this.f43187a[0] || bpt.mo41096b(d) == d) {
                    i2++;
                } else {
                    throw new IllegalStateException("Children seeked to different positions");
                }
            }
        }
        return d;
    }

    /* renamed from: e */
    public final long mo41100e() {
        long j = Long.MAX_VALUE;
        for (bpt e : this.f43192f) {
            long e2 = e.mo41100e();
            if (e2 != Long.MIN_VALUE) {
                j = Math.min(j, e2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: b */
    public final long mo41096b(long j) {
        long b = this.f43192f[0].mo41096b(j);
        int i = 1;
        while (i < this.f43192f.length) {
            if (this.f43192f[i].mo41096b(b) == b) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo40875a(bpt bpt) {
        int i = this.f43190d - 1;
        this.f43190d = i;
        if (i <= 0) {
            int i2 = 0;
            for (bpt c : this.f43187a) {
                i2 += c.mo41098c().f43267b;
            }
            bqj[] bqjArr = new bqj[i2];
            bpt[] bptArr = this.f43187a;
            int length = bptArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                bql c2 = bptArr[i3].mo41098c();
                int i5 = c2.f43267b;
                int i6 = i4;
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = i6 + 1;
                    bqjArr[i6] = c2.mo41160a(i7);
                    i7++;
                    i6 = i8;
                }
                i3++;
                i4 = i6;
            }
            this.f43191e = new bql(bqjArr);
            this.f43189c.mo40875a(this);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo40877a(bqg bqg) {
        if (this.f43191e != null) {
            this.f43189c.mo40877a(this);
        }
    }
}
