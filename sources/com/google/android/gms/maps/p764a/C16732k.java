package com.google.android.gms.maps.p764a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p763e.C16372e;
import com.google.android.gms.internal.p763e.C16378k;

/* renamed from: com.google.android.gms.maps.a.k */
public abstract class C16732k extends C16372e implements C16731j {
    public C16732k() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    /* renamed from: a */
    public final boolean mo42462a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo43353a(C16378k.m53354a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
