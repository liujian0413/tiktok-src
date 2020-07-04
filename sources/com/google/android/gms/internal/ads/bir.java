package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class bir extends biq {

    /* renamed from: N */
    public final long f42214N;

    /* renamed from: O */
    public final List<bis> f42215O = new ArrayList();

    /* renamed from: P */
    public final List<bir> f42216P = new ArrayList();

    public bir(int i, long j) {
        super(i);
        this.f42214N = j;
    }

    /* renamed from: c */
    public final bis mo40771c(int i) {
        int size = this.f42215O.size();
        for (int i2 = 0; i2 < size; i2++) {
            bis bis = (bis) this.f42215O.get(i2);
            if (bis.f42213M == i) {
                return bis;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final bir mo40772d(int i) {
        int size = this.f42216P.size();
        for (int i2 = 0; i2 < size; i2++) {
            bir bir = (bir) this.f42216P.get(i2);
            if (bir.f42213M == i) {
                return bir;
            }
        }
        return null;
    }

    public final String toString() {
        String b = m48960b(this.f42213M);
        String valueOf = String.valueOf(Arrays.toString(this.f42215O.toArray(new bis[0])));
        String valueOf2 = String.valueOf(Arrays.toString(this.f42216P.toArray(new bir[0])));
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 22 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(b);
        sb.append(" leaves: ");
        sb.append(valueOf);
        sb.append(" containers: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
