package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class byx extends bfy implements byv {
    byx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* renamed from: a */
    public final void mo37781a(zzyv zzyv) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzyv);
        mo40589b(1, z);
    }

    /* renamed from: a */
    public final String mo37780a() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final boolean mo37784c() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final String mo37783b() throws RemoteException {
        Parcel a = mo40587a(4, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo37782a(zzyv zzyv, int i) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeInt(i);
        mo40589b(5, z);
    }
}
