package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gi */
public final class C15707gi extends bfy implements C15706gh {
    C15707gi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: a */
    public final void mo41643a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(1, z);
    }

    /* renamed from: a */
    public final void mo41642a() throws RemoteException {
        mo40589b(2, mo40591z());
    }
}
