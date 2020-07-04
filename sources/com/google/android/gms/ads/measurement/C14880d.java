package com.google.android.gms.ads.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bfz;

/* renamed from: com.google.android.gms.ads.measurement.d */
public abstract class C14880d extends bfz implements C14879c {
    public C14880d() {
        super("com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    public static C14879c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof C14879c) {
            return (C14879c) queryLocalInterface;
        }
        return new C14881e(iBinder);
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C14876a aVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
            if (queryLocalInterface instanceof C14876a) {
                aVar = (C14876a) queryLocalInterface;
            } else {
                aVar = new C14878b(readStrongBinder);
            }
        }
        registerAppMeasurementProxy(aVar);
        parcel2.writeNoException();
        return true;
    }
}
