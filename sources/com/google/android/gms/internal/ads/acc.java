package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class acc extends abz {

    /* renamed from: a */
    private Context f39970a;

    acc(Context context) {
        this.f39970a = context;
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
    }

    /* renamed from: a */
    public final void mo37835a() {
        boolean z;
        try {
            z = C14733a.m42590b(this.f39970a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            acd.m45778b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        afg.m45754a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        acd.m45783e(sb.toString());
    }
}
