package com.google.android.gms.ads.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bfy;
import com.google.android.gms.internal.ads.bga;

/* renamed from: com.google.android.gms.ads.measurement.e */
public final class C14881e extends bfy implements C14879c {
    C14881e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    public final void registerAppMeasurementProxy(C14876a aVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) aVar);
        mo40589b(1, z);
    }
}
