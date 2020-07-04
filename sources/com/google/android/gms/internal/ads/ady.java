package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15265q;

public final class ady {

    /* renamed from: a */
    public final String f40080a;

    /* renamed from: b */
    public final double f40081b;

    /* renamed from: c */
    public final int f40082c;

    /* renamed from: d */
    private final double f40083d;

    /* renamed from: e */
    private final double f40084e;

    public ady(String str, double d, double d2, double d3, int i) {
        this.f40080a = str;
        this.f40084e = d;
        this.f40083d = d2;
        this.f40081b = d3;
        this.f40082c = i;
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("name", this.f40080a).mo38611a("minBound", Double.valueOf(this.f40084e)).mo38611a("maxBound", Double.valueOf(this.f40083d)).mo38611a("percent", Double.valueOf(this.f40081b)).mo38611a("count", Integer.valueOf(this.f40082c)).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ady)) {
            return false;
        }
        ady ady = (ady) obj;
        if (C15265q.m44381a(this.f40080a, ady.f40080a) && this.f40083d == ady.f40083d && this.f40084e == ady.f40084e && this.f40082c == ady.f40082c && Double.compare(this.f40081b, ady.f40081b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C15265q.m44379a(this.f40080a, Double.valueOf(this.f40083d), Double.valueOf(this.f40084e), Double.valueOf(this.f40081b), Integer.valueOf(this.f40082c));
    }
}
