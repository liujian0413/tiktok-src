package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jo */
public final class C15794jo extends bfy implements C15791jl {
    C15794jo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    /* renamed from: a */
    public final void mo41674a(C15787jh jhVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) jhVar);
        mo40589b(1, z);
    }

    /* renamed from: a */
    public final void mo41673a(int i) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        mo40589b(2, z);
    }
}
