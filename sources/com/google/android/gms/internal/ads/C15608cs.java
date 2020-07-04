package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.cs */
public final class C15608cs extends bfy implements C15606cq {
    C15608cs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo41468a(C15603cn cnVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) cnVar);
        mo40589b(1, z);
    }
}
