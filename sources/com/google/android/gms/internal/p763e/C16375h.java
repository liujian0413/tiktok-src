package com.google.android.gms.internal.p763e;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.e.h */
public abstract class C16375h extends C16372e implements C16374g {
    /* renamed from: a */
    public static C16374g m53348a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof C16374g ? (C16374g) queryLocalInterface : new C16376i(iBinder);
    }
}
