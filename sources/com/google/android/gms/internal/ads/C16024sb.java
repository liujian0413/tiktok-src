package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.sb */
public final class C16024sb extends bfy implements C16023sa {
    C16024sb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    /* renamed from: a */
    public final IBinder mo41963a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        Parcel a = mo40587a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
