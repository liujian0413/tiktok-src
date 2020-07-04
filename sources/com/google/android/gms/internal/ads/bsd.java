package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class bsd implements brv {

    /* renamed from: a */
    private boolean f43395a;

    /* renamed from: b */
    private long f43396b;

    /* renamed from: c */
    private long f43397c;

    /* renamed from: d */
    private bli f43398d = bli.f42500a;

    /* renamed from: a */
    public final void mo41242a() {
        if (!this.f43395a) {
            this.f43397c = SystemClock.elapsedRealtime();
            this.f43395a = true;
        }
    }

    /* renamed from: b */
    public final void mo41245b() {
        if (this.f43395a) {
            mo41243a(mo40974s());
            this.f43395a = false;
        }
    }

    /* renamed from: a */
    public final void mo41243a(long j) {
        this.f43396b = j;
        if (this.f43395a) {
            this.f43397c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final void mo41244a(brv brv) {
        mo41243a(brv.mo40974s());
        this.f43398d = brv.mo40975t();
    }

    /* renamed from: s */
    public final long mo40974s() {
        long j = this.f43396b;
        if (!this.f43395a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f43397c;
        if (this.f43398d.f42501b == 1.0f) {
            return j + bkr.m49119b(elapsedRealtime);
        }
        return j + this.f43398d.mo40893a(elapsedRealtime);
    }

    /* renamed from: a */
    public final bli mo40967a(bli bli) {
        if (this.f43395a) {
            mo41243a(mo40974s());
        }
        this.f43398d = bli;
        return bli;
    }

    /* renamed from: t */
    public final bli mo40975t() {
        return this.f43398d;
    }
}
