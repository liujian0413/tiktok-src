package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.cp */
public final class C15605cp extends bfy implements C15603cn {
    C15605cp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* renamed from: a */
    public final String mo41463a() throws RemoteException {
        Parcel a = mo40587a(1, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final String mo41465b() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo41464a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(3, z);
    }

    /* renamed from: c */
    public final void mo41466c() throws RemoteException {
        mo40589b(4, mo40591z());
    }

    /* renamed from: d */
    public final void mo41467d() throws RemoteException {
        mo40589b(5, mo40591z());
    }
}
