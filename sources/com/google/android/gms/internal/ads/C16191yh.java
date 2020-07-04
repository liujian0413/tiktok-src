package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.yh */
public final class C16191yh extends bfy implements C16189yf {
    C16191yh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public final void mo42091a(zzbad zzbad) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzbad);
        mo40589b(1, z);
    }

    /* renamed from: a */
    public final void mo42086a() throws RemoteException {
        mo40589b(2, mo40591z());
    }

    /* renamed from: a */
    public final void mo42090a(C16194yk ykVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) ykVar);
        mo40589b(3, z);
    }

    /* renamed from: c */
    public final boolean mo42099c() throws RemoteException {
        Parcel a = mo40587a(5, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final void mo42100d() throws RemoteException {
        mo40589b(6, mo40591z());
    }

    /* renamed from: e */
    public final void mo42102e() throws RemoteException {
        mo40589b(7, mo40591z());
    }

    /* renamed from: f */
    public final void mo42103f() throws RemoteException {
        mo40589b(8, mo40591z());
    }

    /* renamed from: b */
    public final void mo42095b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(9, z);
    }

    /* renamed from: c */
    public final void mo42097c(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(10, z);
    }

    /* renamed from: d */
    public final void mo42101d(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(11, z);
    }

    /* renamed from: g */
    public final String mo42104g() throws RemoteException {
        Parcel a = mo40587a(12, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo42096b(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(13, z);
    }

    /* renamed from: a */
    public final void mo42088a(C15833l lVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) lVar);
        mo40589b(14, z);
    }

    /* renamed from: b */
    public final Bundle mo42094b() throws RemoteException {
        Parcel a = mo40587a(15, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo42089a(C16187yd ydVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) ydVar);
        mo40589b(16, z);
    }

    /* renamed from: a */
    public final void mo42092a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(17, z);
    }

    /* renamed from: a */
    public final void mo42087a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(18, z);
    }

    /* renamed from: c */
    public final void mo42098c(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(19, z);
    }

    /* renamed from: a */
    public final void mo42093a(boolean z) throws RemoteException {
        Parcel z2 = mo40591z();
        bga.m48617a(z2, z);
        mo40589b(34, z2);
    }
}
