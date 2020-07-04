package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;

/* renamed from: com.google.android.gms.measurement.internal.dy */
final class C16906dy {

    /* renamed from: a */
    private final C15322e f47266a;

    /* renamed from: b */
    private long f47267b;

    public C16906dy(C15322e eVar) {
        C15267r.m44384a(eVar);
        this.f47266a = eVar;
    }

    /* renamed from: a */
    public final void mo43834a() {
        this.f47267b = this.f47266a.mo38685b();
    }

    /* renamed from: b */
    public final void mo43836b() {
        this.f47267b = 0;
    }

    /* renamed from: a */
    public final boolean mo43835a(long j) {
        if (this.f47267b != 0 && this.f47266a.mo38685b() - this.f47267b < 3600000) {
            return false;
        }
        return true;
    }
}
