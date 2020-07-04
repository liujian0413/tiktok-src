package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cy */
final class C15614cy implements C15742hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C15613cx f44260a;

    C15614cy(C15613cx cxVar) {
        this.f44260a = cxVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        try {
            this.f44260a.f44256c = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            acd.m45779c("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f44260a.f44255b = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (this.f44260a.f44254a == null) {
            acd.m45777b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            this.f44260a.f44254a.mo41643a(str);
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }
}
