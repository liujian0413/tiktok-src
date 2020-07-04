package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.we */
public final class C16134we extends bfy implements C16132wc {
    C16134we(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* renamed from: a */
    public final void mo42036a(zzaxi zzaxi) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzaxi);
        mo40589b(1, z);
    }
}
