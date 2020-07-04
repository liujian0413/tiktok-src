package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bqj {

    /* renamed from: a */
    public final int f43248a = 1;

    /* renamed from: b */
    private final zzlg[] f43249b;

    /* renamed from: c */
    private int f43250c;

    public bqj(zzlg... zzlgArr) {
        brr.m49873b(true);
        this.f43249b = zzlgArr;
    }

    /* renamed from: a */
    public final zzlg mo41141a(int i) {
        return this.f43249b[i];
    }

    /* renamed from: a */
    public final int mo41140a(zzlg zzlg) {
        for (int i = 0; i < this.f43249b.length; i++) {
            if (zzlg == this.f43249b[i]) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f43250c == 0) {
            this.f43250c = Arrays.hashCode(this.f43249b) + 527;
        }
        return this.f43250c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bqj bqj = (bqj) obj;
        return this.f43248a == bqj.f43248a && Arrays.equals(this.f43249b, bqj.f43249b);
    }
}
