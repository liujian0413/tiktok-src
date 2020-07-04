package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.gd */
public final class C15702gd extends bfy implements C15700gb {
    C15702gd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: a */
    public final void mo41640a(C15698g gVar, C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) gVar);
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(1, z);
    }
}
