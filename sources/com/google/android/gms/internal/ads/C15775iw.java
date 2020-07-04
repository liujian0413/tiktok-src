package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C15231d.C15232a;

/* renamed from: com.google.android.gms.internal.ads.iw */
final class C15775iw implements C15232a {

    /* renamed from: a */
    private final /* synthetic */ agu f44524a;

    /* renamed from: b */
    private final /* synthetic */ C15771is f44525b;

    C15775iw(C15771is isVar, agu agu) {
        this.f44525b = isVar;
        this.f44524a = agu;
    }

    /* renamed from: a */
    public final void mo38571a(Bundle bundle) {
        try {
            this.f44524a.mo39333b(this.f44525b.f44519a.mo39918q());
        } catch (DeadObjectException e) {
            this.f44524a.mo39332a(e);
        }
    }

    /* renamed from: a */
    public final void mo38570a(int i) {
        agu agu = this.f44524a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        agu.mo39332a(new RuntimeException(sb.toString()));
    }
}
