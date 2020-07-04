package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.ho */
public abstract class C16593ho extends C16507ep implements C16563gr {
    /* renamed from: a */
    public static C16563gr m54197a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C16563gr) {
            return (C16563gr) queryLocalInterface;
        }
        return new C16620io(iBinder);
    }
}
