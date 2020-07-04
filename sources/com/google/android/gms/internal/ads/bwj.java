package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15231d.C15233b;

final class bwj implements C15233b {

    /* renamed from: a */
    private final /* synthetic */ agu f44056a;

    /* renamed from: b */
    private final /* synthetic */ bwc f44057b;

    bwj(bwc bwc, agu agu) {
        this.f44057b = bwc;
        this.f44056a = agu;
    }

    /* renamed from: a */
    public final void mo38572a(ConnectionResult connectionResult) {
        synchronized (this.f44057b.f44040d) {
            this.f44056a.mo39332a(new RuntimeException("Connection failed."));
        }
    }
}
