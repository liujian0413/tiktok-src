package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ir */
public final class C15770ir extends bfy implements C15769iq {
    C15770ir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final void mo41662a(zzaju zzaju, C15766in inVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzaju);
        bga.m48615a(z, (IInterface) inVar);
        mo40590c(2, z);
    }
}
