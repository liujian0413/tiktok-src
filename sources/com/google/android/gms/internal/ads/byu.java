package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class byu extends bfy implements bys {
    byu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: a */
    public final void mo41419a() throws RemoteException {
        mo40589b(1, mo40591z());
    }

    /* renamed from: a */
    public final void mo41420a(int i) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        mo40589b(2, z);
    }

    /* renamed from: b */
    public final void mo41421b() throws RemoteException {
        mo40589b(3, mo40591z());
    }

    /* renamed from: c */
    public final void mo41422c() throws RemoteException {
        mo40589b(4, mo40591z());
    }

    /* renamed from: d */
    public final void mo41423d() throws RemoteException {
        mo40589b(5, mo40591z());
    }

    /* renamed from: f */
    public final void mo41425f() throws RemoteException {
        mo40589b(6, mo40591z());
    }

    /* renamed from: e */
    public final void mo41424e() throws RemoteException {
        mo40589b(7, mo40591z());
    }
}
