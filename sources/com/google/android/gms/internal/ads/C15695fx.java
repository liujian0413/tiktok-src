package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fx */
public final class C15695fx extends bfy implements C15693fv {
    C15695fx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: a */
    public final void mo41638a(C15682fk fkVar, String str) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) fkVar);
        z.writeString(str);
        mo40589b(1, z);
    }
}
