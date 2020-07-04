package com.google.android.gms.internal.ads;

import android.os.SystemClock;

final class bgp {

    /* renamed from: a */
    private boolean f41927a;

    /* renamed from: b */
    private long f41928b;

    /* renamed from: c */
    private long f41929c;

    bgp() {
    }

    /* renamed from: a */
    public final void mo40644a() {
        if (!this.f41927a) {
            this.f41927a = true;
            this.f41929c = m48704b(this.f41928b);
        }
    }

    /* renamed from: b */
    public final void mo40646b() {
        if (this.f41927a) {
            this.f41928b = m48704b(this.f41929c);
            this.f41927a = false;
        }
    }

    /* renamed from: a */
    public final void mo40645a(long j) {
        this.f41928b = j;
        this.f41929c = m48704b(j);
    }

    /* renamed from: c */
    public final long mo40647c() {
        return this.f41927a ? m48704b(this.f41929c) : this.f41928b;
    }

    /* renamed from: b */
    private static long m48704b(long j) {
        return (SystemClock.elapsedRealtime() * 1000) - j;
    }
}
