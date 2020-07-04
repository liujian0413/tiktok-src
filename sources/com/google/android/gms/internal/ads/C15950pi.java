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

/* renamed from: com.google.android.gms.internal.ads.pi */
public final class C15950pi extends bfy implements C15948pg {
    C15950pi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: a */
    public final String mo41866a() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo41869b() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        ArrayList b = bga.m48619b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo41871c() throws RemoteException {
        Parcel a = mo40587a(4, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final C15658en mo41873d() throws RemoteException {
        Parcel a = mo40587a(5, mo40591z());
        C15658en a2 = C15659eo.m50701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo41874e() throws RemoteException {
        Parcel a = mo40587a(6, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo41875f() throws RemoteException {
        Parcel a = mo40587a(7, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final void mo41876g() throws RemoteException {
        mo40589b(8, mo40591z());
    }

    /* renamed from: a */
    public final void mo41867a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(9, z);
    }

    /* renamed from: b */
    public final void mo41870b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(10, z);
    }

    /* renamed from: h */
    public final boolean mo41877h() throws RemoteException {
        Parcel a = mo40587a(11, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final boolean mo41878i() throws RemoteException {
        Parcel a = mo40587a(12, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final Bundle mo41879j() throws RemoteException {
        Parcel a = mo40587a(13, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final void mo41872c(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(14, z);
    }

    /* renamed from: k */
    public final C15345b mo41880k() throws RemoteException {
        Parcel a = mo40587a(15, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final C15488ak mo41881l() throws RemoteException {
        Parcel a = mo40587a(16, mo40591z());
        C15488ak a2 = C15489al.m46249a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final C15654ej mo41882m() throws RemoteException {
        Parcel a = mo40587a(19, mo40591z());
        C15654ej a2 = C15655ek.m50693a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C15345b mo41883n() throws RemoteException {
        Parcel a = mo40587a(20, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final C15345b mo41884o() throws RemoteException {
        Parcel a = mo40587a(21, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41868a(C15345b bVar, C15345b bVar2, C15345b bVar3) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) bVar2);
        bga.m48615a(z, (IInterface) bVar3);
        mo40589b(22, z);
    }
}