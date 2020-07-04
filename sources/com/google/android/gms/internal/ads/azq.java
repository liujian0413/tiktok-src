package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15550e;

final class azq implements ayy {

    /* renamed from: a */
    public final String f41278a;

    /* renamed from: b */
    public final Object[] f41279b;

    /* renamed from: c */
    private final aza f41280c;

    /* renamed from: d */
    private final int f41281d;

    azq(aza aza, String str, Object[] objArr) {
        this.f41280c = aza;
        this.f41278a = str;
        this.f41279b = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f41281d = charAt;
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
                this.f41281d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: c */
    public final aza mo40342c() {
        return this.f41280c;
    }

    /* renamed from: a */
    public final int mo40340a() {
        return (this.f41281d & 1) == 1 ? C15550e.f41206h : C15550e.f41207i;
    }

    /* renamed from: b */
    public final boolean mo40341b() {
        return (this.f41281d & 2) == 2;
    }
}
