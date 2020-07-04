package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p761c.C16357b;

/* renamed from: com.google.android.gms.common.internal.ap */
public abstract class C15224ap extends C16357b implements C15223ao {
    /* renamed from: a */
    public static C15223ao m44245a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C15223ao) {
            return (C15223ao) queryLocalInterface;
        }
        return new C15225aq(iBinder);
    }
}
