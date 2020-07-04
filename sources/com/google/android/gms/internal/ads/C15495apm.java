package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.apm */
public final class C15495apm extends bfy implements apl {
    C15495apm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final zzbqq mo39923a(zzbqo zzbqo) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzbqo);
        Parcel a = mo40587a(1, z);
        zzbqq zzbqq = (zzbqq) bga.m48614a(a, zzbqq.CREATOR);
        a.recycle();
        return zzbqq;
    }

    /* renamed from: a */
    public final void mo39924a(zzbql zzbql) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzbql);
        mo40589b(2, z);
    }
}
