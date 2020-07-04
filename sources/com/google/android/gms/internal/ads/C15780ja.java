package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ja */
public final class C15780ja extends bfz implements C15778iz {
    /* renamed from: a */
    public static C15778iz m51100a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        if (queryLocalInterface instanceof C15778iz) {
            return (C15778iz) queryLocalInterface;
        }
        return new C15781jb(iBinder);
    }
}
