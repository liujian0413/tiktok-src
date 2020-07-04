package com.google.android.gms.common.api.internal;

import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.ci */
final class C15116ci implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C15114cg f39085a;

    /* renamed from: b */
    private final C15115ch f39086b;

    C15116ci(C15114cg cgVar, C15115ch chVar) {
        this.f39085a = cgVar;
        this.f39086b = chVar;
    }

    public final void run() {
        if (this.f39085a.f39080c) {
            ConnectionResult connectionResult = this.f39086b.f39084b;
            if (connectionResult.mo38153a()) {
                this.f39085a.f38934a.startActivityForResult(GoogleApiActivity.m43546a(this.f39085a.mo38276a(), connectionResult.f38847c, this.f39086b.f39083a, false), 1);
            } else if (this.f39085a.f39082e.isUserResolvableError(connectionResult.f38846b)) {
                this.f39085a.f39082e.zaa(this.f39085a.mo38276a(), this.f39085a.f38934a, connectionResult.f38846b, 2, this.f39085a);
            } else if (connectionResult.f38846b == 18) {
                this.f39085a.f39082e.zaa(this.f39085a.mo38276a().getApplicationContext(), (C15085bh) new C15117cj(this, GoogleApiAvailability.zaa(this.f39085a.mo38276a(), (OnCancelListener) this.f39085a)));
            } else {
                this.f39085a.mo38371a(connectionResult, this.f39086b.f39083a);
            }
        }
    }
}
