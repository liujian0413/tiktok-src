package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.internal.C15231d.C15234c;
import com.google.android.gms.common.internal.C15267r;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.ab */
final class C15051ab implements C15234c {

    /* renamed from: a */
    private final WeakReference<C15159z> f38936a;

    /* renamed from: b */
    private final C15017a<?> f38937b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f38938c;

    public C15051ab(C15159z zVar, C15017a<?> aVar, boolean z) {
        this.f38936a = new WeakReference<>(zVar);
        this.f38937b = aVar;
        this.f38938c = z;
    }

    /* renamed from: a */
    public final void mo38286a(ConnectionResult connectionResult) {
        C15159z zVar = (C15159z) this.f38936a.get();
        if (zVar != null) {
            C15267r.m44391a(Looper.myLooper() == zVar.f39213a.f38992d.mo38242c(), (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zVar.f39214b.lock();
            try {
                if (zVar.m44106b(0)) {
                    if (!connectionResult.mo38154b()) {
                        zVar.m44105b(connectionResult, this.f38937b, this.f38938c);
                    }
                    if (zVar.m44111d()) {
                        zVar.m44112e();
                    }
                    zVar.f39214b.unlock();
                }
            } finally {
                zVar.f39214b.unlock();
            }
        }
    }
}
