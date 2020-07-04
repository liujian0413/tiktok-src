package com.google.android.gms.tagmanager;

import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.tagmanager.q */
final class C17042q implements C17051z {

    /* renamed from: a */
    private final /* synthetic */ C17030e f47723a;

    C17042q(C17030e eVar) {
        this.f47723a = eVar;
    }

    /* renamed from: a */
    public final C14734a mo44273a() {
        try {
            return C14733a.m42585a(this.f47723a.f47702g);
        } catch (GooglePlayServicesRepairableException | IOException | Exception | IllegalStateException unused) {
            return null;
        } catch (GooglePlayServicesNotAvailableException unused2) {
            this.f47723a.mo44261a();
            return null;
        }
    }
}
