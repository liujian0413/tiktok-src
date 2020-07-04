package com.google.android.gms.internal.ads;

public final class bpi implements bqg {

    /* renamed from: a */
    private final bqg[] f43120a;

    public bpi(bqg[] bqgArr) {
        this.f43120a = bqgArr;
    }

    /* renamed from: H_ */
    public final long mo41085H_() {
        long j = Long.MAX_VALUE;
        for (bqg H_ : this.f43120a) {
            long H_2 = H_.mo41085H_();
            if (H_2 != Long.MIN_VALUE) {
                j = Math.min(j, H_2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: a */
    public final boolean mo41086a(long j) {
        bqg[] bqgArr;
        boolean z;
        boolean z2 = false;
        do {
            long H_ = mo41085H_();
            if (H_ == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (bqg bqg : this.f43120a) {
                if (bqg.mo41085H_() == H_) {
                    z |= bqg.mo41086a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
