package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class boa extends bnz {

    /* renamed from: aA */
    public final List<bob> f42944aA = new ArrayList();

    /* renamed from: aB */
    public final List<boa> f42945aB = new ArrayList();

    /* renamed from: az */
    public final long f42946az;

    public boa(int i, long j) {
        super(i);
        this.f42946az = j;
    }

    /* renamed from: d */
    public final bob mo41050d(int i) {
        int size = this.f42944aA.size();
        for (int i2 = 0; i2 < size; i2++) {
            bob bob = (bob) this.f42944aA.get(i2);
            if (bob.f42943ay == i) {
                return bob;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final boa mo41051e(int i) {
        int size = this.f42945aB.size();
        for (int i2 = 0; i2 < size; i2++) {
            boa boa = (boa) this.f42945aB.get(i2);
            if (boa.f42943ay == i) {
                return boa;
            }
        }
        return null;
    }

    public final String toString() {
        String c = m49522c(this.f42943ay);
        String arrays = Arrays.toString(this.f42944aA.toArray());
        String arrays2 = Arrays.toString(this.f42945aB.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(c);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
