package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class bwa extends bfy implements bvz {
    bwa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final zzwo mo41404a(zzwr zzwr) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzwr);
        Parcel a = mo40587a(1, z);
        zzwo zzwo = (zzwo) bga.m48614a(a, zzwo.CREATOR);
        a.recycle();
        return zzwo;
    }
}
