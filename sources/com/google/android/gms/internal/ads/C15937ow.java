package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ow */
public final class C15937ow extends bfy implements C15935ou {
    C15937ow(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: a */
    public final void mo41823a(C15345b bVar, zzyz zzyz, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyz);
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        bga.m48615a(z, (IInterface) oxVar);
        mo40589b(1, z);
    }

    /* renamed from: a */
    public final C15345b mo41815a() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41819a(C15345b bVar, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        bga.m48615a(z, (IInterface) oxVar);
        mo40589b(3, z);
    }

    /* renamed from: b */
    public final void mo41828b() throws RemoteException {
        mo40589b(4, mo40591z());
    }

    /* renamed from: c */
    public final void mo41831c() throws RemoteException {
        mo40589b(5, mo40591z());
    }

    /* renamed from: a */
    public final void mo41824a(C15345b bVar, zzyz zzyz, zzyv zzyv, String str, String str2, C15938ox oxVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyz);
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        z.writeString(str2);
        bga.m48615a(z, (IInterface) oxVar);
        mo40589b(6, z);
    }

    /* renamed from: a */
    public final void mo41821a(C15345b bVar, zzyv zzyv, String str, String str2, C15938ox oxVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        z.writeString(str2);
        bga.m48615a(z, (IInterface) oxVar);
        mo40589b(7, z);
    }

    /* renamed from: d */
    public final void mo41832d() throws RemoteException {
        mo40589b(8, mo40591z());
    }

    /* renamed from: e */
    public final void mo41833e() throws RemoteException {
        mo40589b(9, mo40591z());
    }

    /* renamed from: a */
    public final void mo41820a(C15345b bVar, zzyv zzyv, String str, C16219zi ziVar, String str2) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        bga.m48615a(z, (IInterface) ziVar);
        z.writeString(str2);
        mo40589b(10, z);
    }

    /* renamed from: a */
    public final void mo41825a(zzyv zzyv, String str) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        mo40589b(11, z);
    }

    /* renamed from: f */
    public final void mo41834f() throws RemoteException {
        mo40589b(12, mo40591z());
    }

    /* renamed from: g */
    public final boolean mo41835g() throws RemoteException {
        Parcel a = mo40587a(13, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41822a(C15345b bVar, zzyv zzyv, String str, String str2, C15938ox oxVar, zzafl zzafl, List<String> list) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        z.writeString(str2);
        bga.m48615a(z, (IInterface) oxVar);
        bga.m48616a(z, (Parcelable) zzafl);
        z.writeStringList(list);
        mo40589b(14, z);
    }

    /* renamed from: h */
    public final C15945pd mo41836h() throws RemoteException {
        C15945pd pdVar;
        Parcel a = mo40587a(15, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            pdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof C15945pd) {
                pdVar = (C15945pd) queryLocalInterface;
            } else {
                pdVar = new C15947pf(readStrongBinder);
            }
        }
        a.recycle();
        return pdVar;
    }

    /* renamed from: i */
    public final C15948pg mo41837i() throws RemoteException {
        C15948pg pgVar;
        Parcel a = mo40587a(16, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            pgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof C15948pg) {
                pgVar = (C15948pg) queryLocalInterface;
            } else {
                pgVar = new C15950pi(readStrongBinder);
            }
        }
        a.recycle();
        return pgVar;
    }

    /* renamed from: j */
    public final Bundle mo41838j() throws RemoteException {
        Parcel a = mo40587a(17, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final Bundle mo41839k() throws RemoteException {
        Parcel a = mo40587a(18, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: l */
    public final Bundle mo41840l() throws RemoteException {
        Parcel a = mo40587a(19, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo41826a(zzyv zzyv, String str, String str2) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        z.writeString(str2);
        mo40589b(20, z);
    }

    /* renamed from: a */
    public final void mo41816a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(21, z);
    }

    /* renamed from: m */
    public final boolean mo41841m() throws RemoteException {
        Parcel a = mo40587a(22, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41818a(C15345b bVar, C16219zi ziVar, List<String> list) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) ziVar);
        z.writeStringList(list);
        mo40589b(23, z);
    }

    /* renamed from: n */
    public final C15682fk mo41842n() throws RemoteException {
        Parcel a = mo40587a(24, mo40591z());
        C15682fk a2 = C15683fl.m50834a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41827a(boolean z) throws RemoteException {
        Parcel z2 = mo40591z();
        bga.m48617a(z2, z);
        mo40589b(25, z2);
    }

    /* renamed from: o */
    public final C15488ak mo41843o() throws RemoteException {
        Parcel a = mo40587a(26, mo40591z());
        C15488ak a2 = C15489al.m46249a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final C15951pj mo41844p() throws RemoteException {
        C15951pj pjVar;
        Parcel a = mo40587a(27, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            pjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof C15951pj) {
                pjVar = (C15951pj) queryLocalInterface;
            } else {
                pjVar = new C15953pl(readStrongBinder);
            }
        }
        a.recycle();
        return pjVar;
    }

    /* renamed from: b */
    public final void mo41830b(C15345b bVar, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyv);
        z.writeString(str);
        bga.m48615a(z, (IInterface) oxVar);
        mo40589b(28, z);
    }

    /* renamed from: b */
    public final void mo41829b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(30, z);
    }

    /* renamed from: a */
    public final void mo41817a(C15345b bVar, C15778iz izVar, List<zzakq> list) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) izVar);
        z.writeTypedList(list);
        mo40589b(31, z);
    }
}
