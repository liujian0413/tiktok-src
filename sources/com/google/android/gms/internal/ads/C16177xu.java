package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15265q;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xu */
public final class C16177xu extends C16185yb {

    /* renamed from: a */
    private final String f45416a;

    /* renamed from: b */
    private final int f45417b;

    public C16177xu(String str, int i) {
        this.f45416a = str;
        this.f45417b = i;
    }

    /* renamed from: a */
    public final String mo42078a() {
        return this.f45416a;
    }

    /* renamed from: b */
    public final int mo42079b() {
        return this.f45417b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C16177xu)) {
            return false;
        }
        C16177xu xuVar = (C16177xu) obj;
        if (!C15265q.m44381a(this.f45416a, xuVar.f45416a) || !C15265q.m44381a(Integer.valueOf(this.f45417b), Integer.valueOf(xuVar.f45417b))) {
            return false;
        }
        return true;
    }
}
