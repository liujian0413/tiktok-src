package com.google.android.gms.maps.p764a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p763e.C16372e;

/* renamed from: com.google.android.gms.maps.a.o */
public abstract class C16736o extends C16372e implements C16735n {
    public C16736o() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    /* renamed from: a */
    public final boolean mo42462a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C16723b bVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            bVar = queryLocalInterface instanceof C16723b ? (C16723b) queryLocalInterface : new C16718aa(readStrongBinder);
        }
        mo43355a(bVar);
        parcel2.writeNoException();
        return true;
    }
}
