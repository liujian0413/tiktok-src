package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gg */
public final class C15705gg extends bfy implements C15703ge {
    C15705gg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo41641a(C15708gj gjVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) gjVar);
        mo40589b(1, z);
    }
}
