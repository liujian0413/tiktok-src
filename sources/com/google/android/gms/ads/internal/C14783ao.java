package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.zzyv;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.ao */
final class C14783ao implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f38193a;

    /* renamed from: b */
    private final /* synthetic */ C14782an f38194b;

    C14783ao(C14782an anVar, WeakReference weakReference) {
        this.f38194b = anVar;
        this.f38193a = weakReference;
    }

    public final void run() {
        this.f38194b.f38188b = false;
        C14768a aVar = (C14768a) this.f38193a.get();
        if (aVar != null) {
            zzyv a = this.f38194b.f38187a;
            if (aVar.mo37616c(a)) {
                aVar.mo37614b(a);
            } else {
                acd.m45781d("Ad is not visible. Not refreshing ad.");
                aVar.f38139d.mo37674a(a);
            }
        }
    }
}
