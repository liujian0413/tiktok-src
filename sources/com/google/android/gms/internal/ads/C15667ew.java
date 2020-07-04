package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.ew */
public final class C15667ew extends bfy implements C15666ev {
    C15667ew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    /* renamed from: a */
    public final IBinder mo41634a(C15345b bVar, C15345b bVar2, C15345b bVar3, int i) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) bVar2);
        bga.m48615a(z, (IInterface) bVar3);
        z.writeInt(15302000);
        Parcel a = mo40587a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
