package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ym */
public final class C16196ym extends bfy implements C16194yk {
    C16196ym(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo41682a() throws RemoteException {
        mo40589b(1, mo40591z());
    }

    /* renamed from: b */
    public final void mo41685b() throws RemoteException {
        mo40589b(2, mo40591z());
    }

    /* renamed from: c */
    public final void mo41686c() throws RemoteException {
        mo40589b(3, mo40591z());
    }

    /* renamed from: d */
    public final void mo41687d() throws RemoteException {
        mo40589b(4, mo40591z());
    }

    /* renamed from: a */
    public final void mo41684a(C16184ya yaVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) yaVar);
        mo40589b(5, z);
    }

    /* renamed from: e */
    public final void mo41688e() throws RemoteException {
        mo40589b(6, mo40591z());
    }

    /* renamed from: a */
    public final void mo41683a(int i) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        mo40589b(7, z);
    }

    /* renamed from: f */
    public final void mo41689f() throws RemoteException {
        mo40589b(8, mo40591z());
    }
}
