package com.google.android.gms.internal.p763e;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.e.k */
public abstract class C16378k extends C16372e implements C16377j {
    /* renamed from: a */
    public static C16377j m53354a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof C16377j ? (C16377j) queryLocalInterface : new C16379l(iBinder);
    }
}
