package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class aos extends bfz implements aor {
    /* renamed from: a */
    public static aor m46824a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        if (queryLocalInterface instanceof aor) {
            return (aor) queryLocalInterface;
        }
        return new aot(iBinder);
    }
}
