package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pl */
public final class C15953pl extends bfy implements C15951pj {
    C15953pl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: a */
    public final String mo41885a() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo41888b() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        ArrayList b = bga.m48619b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo41890c() throws RemoteException {
        Parcel a = mo40587a(4, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final C15658en mo41891d() throws RemoteException {
        Parcel a = mo40587a(5, mo40591z());
        C15658en a2 = C15659eo.m50701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo41892e() throws RemoteException {
        Parcel a = mo40587a(6, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo41893f() throws RemoteException {
        Parcel a = mo40587a(7, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final double mo41894g() throws RemoteException {
        Parcel a = mo40587a(8, mo40591z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: h */
    public final String mo41895h() throws RemoteException {
        Parcel a = mo40587a(9, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final String mo41896i() throws RemoteException {
        Parcel a = mo40587a(10, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final C15488ak mo41897j() throws RemoteException {
        Parcel a = mo40587a(11, mo40591z());
        C15488ak a2 = C15489al.m46249a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final C15654ej mo41898k() throws RemoteException {
        Parcel a = mo40587a(12, mo40591z());
        C15654ej a2 = C15655ek.m50693a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final C15345b mo41899l() throws RemoteException {
        Parcel a = mo40587a(13, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final C15345b mo41900m() throws RemoteException {
        Parcel a = mo40587a(14, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C15345b mo41901n() throws RemoteException {
        Parcel a = mo40587a(15, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final Bundle mo41902o() throws RemoteException {
        Parcel a = mo40587a(16, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: p */
    public final boolean mo41903p() throws RemoteException {
        Parcel a = mo40587a(17, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final boolean mo41904q() throws RemoteException {
        Parcel a = mo40587a(18, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final void mo41905r() throws RemoteException {
        mo40589b(19, mo40591z());
    }

    /* renamed from: a */
    public final void mo41886a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(20, z);
    }

    /* renamed from: a */
    public final void mo41887a(C15345b bVar, C15345b bVar2, C15345b bVar3) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) bVar2);
        bga.m48615a(z, (IInterface) bVar3);
        mo40589b(21, z);
    }

    /* renamed from: b */
    public final void mo41889b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(22, z);
    }
}
