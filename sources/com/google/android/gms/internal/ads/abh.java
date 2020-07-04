package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class abh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f39838a;

    /* renamed from: b */
    private final /* synthetic */ agu f39839b;

    abh(abg abg, Context context, agu agu) {
        this.f39838a = context;
        this.f39839b = agu;
    }

    public final void run() {
        try {
            this.f39839b.mo39333b(C14733a.m42585a(this.f39838a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.f39839b.mo39332a(e);
            afm.m45778b("Exception while getting advertising Id info", e);
        }
    }
}
