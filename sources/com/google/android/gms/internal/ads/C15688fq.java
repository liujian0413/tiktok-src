package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fq */
public final class C15688fq extends bfy implements C15686fo {
    C15688fq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo41635a(C15674fc fcVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) fcVar);
        mo40589b(1, z);
    }
}
