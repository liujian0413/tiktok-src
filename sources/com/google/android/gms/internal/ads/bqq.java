package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class bqq {

    /* renamed from: a */
    public final boolean f43278a;

    /* renamed from: b */
    public final int f43279b;

    /* renamed from: c */
    public final int f43280c;

    /* renamed from: d */
    public final int f43281d;

    /* renamed from: e */
    public final boolean f43282e;

    /* renamed from: f */
    public final boolean f43283f;

    /* renamed from: g */
    public final int f43284g;

    /* renamed from: h */
    public final int f43285h;

    /* renamed from: i */
    public final boolean f43286i;

    public bqq() {
        this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    private bqq(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.f43278a = true;
        this.f43279b = Integer.MAX_VALUE;
        this.f43280c = Integer.MAX_VALUE;
        this.f43281d = Integer.MAX_VALUE;
        this.f43282e = true;
        this.f43283f = true;
        this.f43284g = Integer.MAX_VALUE;
        this.f43285h = Integer.MAX_VALUE;
        this.f43286i = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bqq bqq = (bqq) obj;
        return this.f43278a == bqq.f43278a && this.f43279b == bqq.f43279b && this.f43280c == bqq.f43280c && this.f43282e == bqq.f43282e && this.f43283f == bqq.f43283f && this.f43286i == bqq.f43286i && this.f43284g == bqq.f43284g && this.f43285h == bqq.f43285h && this.f43281d == bqq.f43281d && TextUtils.equals(null, null) && TextUtils.equals(null, null);
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.f43278a ? 1 : 0)) * 31) + this.f43279b) * 31) + this.f43280c) * 31) + this.f43281d) * 31) + (this.f43282e ? 1 : 0)) * 31) + (this.f43283f ? 1 : 0)) * 31) + (this.f43286i ? 1 : 0)) * 31) + this.f43284g) * 31) + this.f43285h;
    }
}
