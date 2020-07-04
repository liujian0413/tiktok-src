package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ga */
public final class C15699ga extends bfy implements C15696fy {
    C15699ga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo41639a(C15682fk fkVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) fkVar);
        mo40589b(1, z);
    }
}
