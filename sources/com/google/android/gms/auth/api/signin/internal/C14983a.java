package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public final class C14983a {

    /* renamed from: b */
    private static int f38828b = 31;

    /* renamed from: a */
    public int f38829a = 1;

    /* renamed from: a */
    public final C14983a mo38116a(Object obj) {
        this.f38829a = (f38828b * this.f38829a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C14983a mo38117a(boolean z) {
        this.f38829a = (f38828b * this.f38829a) + (z ? 1 : 0);
        return this;
    }
}
