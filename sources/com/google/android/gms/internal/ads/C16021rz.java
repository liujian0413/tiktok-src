package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.rz */
public final class C16021rz extends bfy implements C16019rx {
    C16021rz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: a */
    public final void mo37811a(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(1, z);
    }

    /* renamed from: f */
    public final void mo37820f() throws RemoteException {
        mo40589b(2, mo40591z());
    }

    /* renamed from: g */
    public final void mo37821g() throws RemoteException {
        mo40589b(3, mo40591z());
    }

    /* renamed from: h */
    public final void mo37822h() throws RemoteException {
        mo40589b(4, mo40591z());
    }

    /* renamed from: i */
    public final void mo37823i() throws RemoteException {
        mo40589b(5, mo40591z());
    }

    /* renamed from: b */
    public final void mo37816b(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        Parcel a = mo40587a(6, z);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    /* renamed from: j */
    public final void mo37824j() throws RemoteException {
        mo40589b(7, mo40591z());
    }

    /* renamed from: k */
    public final void mo37825k() throws RemoteException {
        mo40589b(8, mo40591z());
    }

    /* renamed from: l */
    public final void mo37826l() throws RemoteException {
        mo40589b(9, mo40591z());
    }

    /* renamed from: d */
    public final void mo37818d() throws RemoteException {
        mo40589b(10, mo40591z());
    }

    /* renamed from: e */
    public final boolean mo37819e() throws RemoteException {
        Parcel a = mo40587a(11, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo37810a(int i, int i2, Intent intent) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        z.writeInt(i2);
        bga.m48616a(z, (Parcelable) intent);
        mo40589b(12, z);
    }

    /* renamed from: a */
    public final void mo37813a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(13, z);
    }
}
