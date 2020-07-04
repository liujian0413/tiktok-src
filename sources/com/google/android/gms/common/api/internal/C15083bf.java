package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C15133d.C15134a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.bf */
final class C15083bf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f39019a;

    /* renamed from: b */
    private final /* synthetic */ C15136c f39020b;

    C15083bf(C15136c cVar, ConnectionResult connectionResult) {
        this.f39020b = cVar;
        this.f39019a = connectionResult;
    }

    public final void run() {
        if (this.f39019a.mo38154b()) {
            this.f39020b.f39179f = true;
            if (this.f39020b.f39175b.mo38218i()) {
                this.f39020b.m44028a();
                return;
            }
            try {
                this.f39020b.f39175b.mo38213a(null, Collections.emptySet());
            } catch (SecurityException unused) {
                ((C15134a) C15133d.this.f39154m.get(this.f39020b.f39176c)).mo38259a(new ConnectionResult(10));
            }
        } else {
            ((C15134a) C15133d.this.f39154m.get(this.f39020b.f39176c)).mo38259a(this.f39019a);
        }
    }
}
