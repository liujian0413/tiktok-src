package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oz */
public final class C15940oz extends bfy implements C15938ox {
    C15940oz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public final void mo41780a() throws RemoteException {
        mo40589b(1, mo40591z());
    }

    /* renamed from: b */
    public final void mo41791b() throws RemoteException {
        mo40589b(2, mo40591z());
    }

    /* renamed from: a */
    public final void mo41781a(int i) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        mo40589b(3, z);
    }

    /* renamed from: c */
    public final void mo41793c() throws RemoteException {
        mo40589b(4, mo40591z());
    }

    /* renamed from: d */
    public final void mo41794d() throws RemoteException {
        mo40589b(5, mo40591z());
    }

    /* renamed from: e */
    public final void mo41795e() throws RemoteException {
        mo40589b(6, mo40591z());
    }

    /* renamed from: a */
    public final void mo41786a(C15942pa paVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) paVar);
        mo40589b(7, z);
    }

    /* renamed from: f */
    public final void mo41796f() throws RemoteException {
        mo40589b(8, mo40591z());
    }

    /* renamed from: a */
    public final void mo41790a(String str, String str2) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        mo40589b(9, z);
    }

    /* renamed from: a */
    public final void mo41783a(C15682fk fkVar, String str) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) fkVar);
        z.writeString(str);
        mo40589b(10, z);
    }

    /* renamed from: g */
    public final void mo41797g() throws RemoteException {
        mo40589b(11, mo40591z());
    }

    /* renamed from: a */
    public final void mo41789a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(12, z);
    }

    /* renamed from: h */
    public final void mo41798h() throws RemoteException {
        mo40589b(13, mo40591z());
    }

    /* renamed from: a */
    public final void mo41788a(zzbaz zzbaz) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzbaz);
        mo40589b(14, z);
    }

    /* renamed from: i */
    public final void mo41799i() throws RemoteException {
        mo40589b(15, mo40591z());
    }

    /* renamed from: a */
    public final void mo41787a(C16225zo zoVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) zoVar);
        mo40589b(16, z);
    }

    /* renamed from: b */
    public final void mo41792b(int i) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        mo40589b(17, z);
    }

    /* renamed from: j */
    public final void mo41800j() throws RemoteException {
        mo40589b(18, mo40591z());
    }

    /* renamed from: a */
    public final void mo41782a(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(19, z);
    }

    /* renamed from: k */
    public final void mo41801k() throws RemoteException {
        mo40589b(20, mo40591z());
    }
}
