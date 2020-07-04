package com.google.android.gms.internal.p752a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.a.e */
public abstract class C15379e extends C15376b implements C15378d {
    /* renamed from: a */
    public static C15378d m44731a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C15378d ? (C15378d) queryLocalInterface : new C15380f(iBinder);
    }
}
