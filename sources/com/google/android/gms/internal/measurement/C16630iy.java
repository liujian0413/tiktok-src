package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf.C16584e;

/* renamed from: com.google.android.gms.internal.measurement.iy */
final class C16630iy implements C16613ih {

    /* renamed from: a */
    public final String f46486a;

    /* renamed from: b */
    public final Object[] f46487b;

    /* renamed from: c */
    private final C16615ij f46488c;

    /* renamed from: d */
    private final int f46489d;

    C16630iy(C16615ij ijVar, String str, Object[] objArr) {
        this.f46488c = ijVar;
        this.f46486a = str;
        this.f46487b = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f46489d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f46489d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: c */
    public final C16615ij mo42989c() {
        return this.f46488c;
    }

    /* renamed from: a */
    public final int mo42987a() {
        return (this.f46489d & 1) == 1 ? C16584e.f46414h : C16584e.f46415i;
    }

    /* renamed from: b */
    public final boolean mo42988b() {
        return (this.f46489d & 2) == 2;
    }
}
