package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fu */
public final class C15692fu extends bfy implements C15690fs {
    C15692fu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo41637a(C15678fg fgVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) fgVar);
        mo40589b(1, z);
    }
}
