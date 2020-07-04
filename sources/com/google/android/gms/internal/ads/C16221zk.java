package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.zk */
public final class C16221zk extends bfy implements C16219zi {
    C16221zk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo42129a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(1, z);
    }

    /* renamed from: a */
    public final void mo42130a(C15345b bVar, int i) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeInt(i);
        mo40589b(2, z);
    }

    /* renamed from: b */
    public final void mo42132b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(3, z);
    }

    /* renamed from: c */
    public final void mo42134c(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(4, z);
    }

    /* renamed from: d */
    public final void mo42135d(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(5, z);
    }

    /* renamed from: e */
    public final void mo42136e(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(6, z);
    }

    /* renamed from: a */
    public final void mo42131a(C15345b bVar, zzbaz zzbaz) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzbaz);
        mo40589b(7, z);
    }

    /* renamed from: f */
    public final void mo42137f(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(8, z);
    }

    /* renamed from: b */
    public final void mo42133b(C15345b bVar, int i) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeInt(i);
        mo40589b(9, z);
    }

    /* renamed from: g */
    public final void mo42138g(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(10, z);
    }

    /* renamed from: h */
    public final void mo42139h(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(11, z);
    }

    /* renamed from: a */
    public final void mo42128a(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(12, z);
    }
}
