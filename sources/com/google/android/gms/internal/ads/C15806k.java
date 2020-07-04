package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.k */
public final class C15806k extends bfy implements C15779j {
    C15806k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo41666a(C15345b bVar, zzyz zzyz, String str, C15931oq oqVar, int i, int i2) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyz);
        z.writeString(str);
        bga.m48615a(z, (IInterface) oqVar);
        z.writeInt(15302000);
        z.writeInt(i2);
        Parcel a = mo40587a(2, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
