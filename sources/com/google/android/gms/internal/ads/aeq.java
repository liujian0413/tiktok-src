package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
public final class aeq {

    /* renamed from: a */
    private long f40111a;

    /* renamed from: b */
    private long f40112b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f40113c = new Object();

    public aeq(long j) {
        this.f40111a = j;
    }

    /* renamed from: a */
    public final boolean mo39263a() {
        synchronized (this.f40113c) {
            long b = C14793ay.m42901g().mo38685b();
            if (this.f40112b + this.f40111a > b) {
                return false;
            }
            this.f40112b = b;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo39262a(long j) {
        synchronized (this.f40113c) {
            this.f40111a = j;
        }
    }
}
