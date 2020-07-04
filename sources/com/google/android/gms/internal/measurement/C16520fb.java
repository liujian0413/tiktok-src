package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.fb */
public final /* synthetic */ class C16520fb {
    /* renamed from: a */
    public static <V> V m53840a(C16521fc<V> fcVar) {
        long clearCallingIdentity;
        try {
            return fcVar.mo42711a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = fcVar.mo42711a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
