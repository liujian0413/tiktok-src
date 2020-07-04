package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;

/* renamed from: com.google.android.gms.internal.measurement.bx */
final class C16431bx {

    /* renamed from: a */
    private final C15322e f45995a;

    /* renamed from: b */
    private long f45996b;

    public C16431bx(C15322e eVar) {
        C15267r.m44384a(eVar);
        this.f45995a = eVar;
    }

    public C16431bx(C15322e eVar, long j) {
        C15267r.m44384a(eVar);
        this.f45995a = eVar;
        this.f45996b = j;
    }

    /* renamed from: a */
    public final void mo42566a() {
        this.f45996b = this.f45995a.mo38685b();
    }

    /* renamed from: b */
    public final void mo42568b() {
        this.f45996b = 0;
    }

    /* renamed from: a */
    public final boolean mo42567a(long j) {
        if (this.f45996b != 0 && this.f45995a.mo38685b() - this.f45996b <= j) {
            return false;
        }
        return true;
    }
}
