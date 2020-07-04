package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.qq */
public final class C15985qq extends bfy implements C15983qo {
    C15985qq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public final void mo41914a(C15345b bVar, String str, Bundle bundle, Bundle bundle2, zzyz zzyz, C15986qr qrVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeString(str);
        bga.m48616a(z, (Parcelable) bundle);
        bga.m48616a(z, (Parcelable) bundle2);
        bga.m48616a(z, (Parcelable) zzyz);
        bga.m48615a(z, (IInterface) qrVar);
        mo40589b(1, z);
    }

    /* renamed from: a */
    public final zzaso mo41912a() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        zzaso zzaso = (zzaso) bga.m48614a(a, zzaso.CREATOR);
        a.recycle();
        return zzaso;
    }

    /* renamed from: b */
    public final zzaso mo41920b() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        zzaso zzaso = (zzaso) bga.m48614a(a, zzaso.CREATOR);
        a.recycle();
        return zzaso;
    }

    /* renamed from: c */
    public final C15488ak mo41922c() throws RemoteException {
        Parcel a = mo40587a(5, mo40591z());
        C15488ak a2 = C15489al.m46249a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41913a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(10, z);
    }

    /* renamed from: a */
    public final void mo41919a(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel z = mo40591z();
        z.writeStringArray(strArr);
        z.writeTypedArray(bundleArr, 0);
        mo40589b(11, z);
    }

    /* renamed from: a */
    public final void mo41915a(String str, String str2, zzyv zzyv, C15345b bVar, C15973qe qeVar, C15938ox oxVar, zzyz zzyz) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        bga.m48616a(z, (Parcelable) zzyv);
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) qeVar);
        bga.m48615a(z, (IInterface) oxVar);
        bga.m48616a(z, (Parcelable) zzyz);
        mo40589b(13, z);
    }

    /* renamed from: a */
    public final void mo41916a(String str, String str2, zzyv zzyv, C15345b bVar, C15975qg qgVar, C15938ox oxVar) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        bga.m48616a(z, (Parcelable) zzyv);
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) qgVar);
        bga.m48615a(z, (IInterface) oxVar);
        mo40589b(14, z);
    }

    /* renamed from: b */
    public final boolean mo41921b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        Parcel a = mo40587a(15, z);
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41918a(String str, String str2, zzyv zzyv, C15345b bVar, C15981qm qmVar, C15938ox oxVar) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        bga.m48616a(z, (Parcelable) zzyv);
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) qmVar);
        bga.m48615a(z, (IInterface) oxVar);
        mo40589b(16, z);
    }

    /* renamed from: c */
    public final boolean mo41923c(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        Parcel a = mo40587a(17, z);
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41917a(String str, String str2, zzyv zzyv, C15345b bVar, C15977qi qiVar, C15938ox oxVar) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        bga.m48616a(z, (Parcelable) zzyv);
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) qiVar);
        bga.m48615a(z, (IInterface) oxVar);
        mo40589b(18, z);
    }
}
