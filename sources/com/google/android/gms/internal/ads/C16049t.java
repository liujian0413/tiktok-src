package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.t */
public final class C16049t extends bfy implements C15995r {
    C16049t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* renamed from: a */
    public final C15698g mo37568a(C15345b bVar, zzyz zzyz, String str, C15931oq oqVar, int i) throws RemoteException {
        C15698g gVar;
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyz);
        z.writeString(str);
        bga.m48615a(z, (IInterface) oqVar);
        z.writeInt(i);
        Parcel a = mo40587a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof C15698g) {
                gVar = (C15698g) queryLocalInterface;
            } else {
                gVar = new C15752i(readStrongBinder);
            }
        }
        a.recycle();
        return gVar;
    }

    /* renamed from: b */
    public final C15698g mo37572b(C15345b bVar, zzyz zzyz, String str, C15931oq oqVar, int i) throws RemoteException {
        C15698g gVar;
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyz);
        z.writeString(str);
        bga.m48615a(z, (IInterface) oqVar);
        z.writeInt(i);
        Parcel a = mo40587a(2, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof C15698g) {
                gVar = (C15698g) queryLocalInterface;
            } else {
                gVar = new C15752i(readStrongBinder);
            }
        }
        a.recycle();
        return gVar;
    }

    /* renamed from: a */
    public final C15553b mo37564a(C15345b bVar, String str, C15931oq oqVar, int i) throws RemoteException {
        C15553b bVar2;
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeString(str);
        bga.m48615a(z, (IInterface) oqVar);
        z.writeInt(i);
        Parcel a = mo40587a(3, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bVar2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof C15553b) {
                bVar2 = (C15553b) queryLocalInterface;
            } else {
                bVar2 = new C15616d(readStrongBinder);
            }
        }
        a.recycle();
        return bVar2;
    }

    /* renamed from: a */
    public final C16156x mo37569a(C15345b bVar) throws RemoteException {
        C16156x xVar;
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        Parcel a = mo40587a(4, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof C16156x) {
                xVar = (C16156x) queryLocalInterface;
            } else {
                xVar = new C16210z(readStrongBinder);
            }
        }
        a.recycle();
        return xVar;
    }

    /* renamed from: a */
    public final C15663es mo37565a(C15345b bVar, C15345b bVar2) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) bVar2);
        Parcel a = mo40587a(5, z);
        C15663es a2 = C15664et.m50718a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final C16189yf mo37571a(C15345b bVar, C15931oq oqVar, int i) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) oqVar);
        z.writeInt(i);
        Parcel a = mo40587a(6, z);
        C16189yf a2 = C16190yg.m52475a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C16030sh mo37573b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        Parcel a = mo40587a(7, z);
        C16030sh a2 = C16031si.m52114a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final C16019rx mo37575c(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        Parcel a = mo40587a(8, z);
        C16019rx a2 = C16020ry.m52095a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final C16156x mo37570a(C15345b bVar, int i) throws RemoteException {
        C16156x xVar;
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeInt(i);
        Parcel a = mo40587a(9, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof C16156x) {
                xVar = (C16156x) queryLocalInterface;
            } else {
                xVar = new C16210z(readStrongBinder);
            }
        }
        a.recycle();
        return xVar;
    }

    /* renamed from: a */
    public final C15698g mo37567a(C15345b bVar, zzyz zzyz, String str, int i) throws RemoteException {
        C15698g gVar;
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48616a(z, (Parcelable) zzyz);
        z.writeString(str);
        z.writeInt(i);
        Parcel a = mo40587a(10, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof C15698g) {
                gVar = (C15698g) queryLocalInterface;
            } else {
                gVar = new C15752i(readStrongBinder);
            }
        }
        a.recycle();
        return gVar;
    }

    /* renamed from: a */
    public final C15668ex mo37566a(C15345b bVar, C15345b bVar2, C15345b bVar3) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) bVar2);
        bga.m48615a(z, (IInterface) bVar3);
        Parcel a = mo40587a(11, z);
        C15668ex a2 = C15669ey.m50730a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C16228zr mo37574b(C15345b bVar, String str, C15931oq oqVar, int i) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeString(str);
        bga.m48615a(z, (IInterface) oqVar);
        z.writeInt(i);
        Parcel a = mo40587a(12, z);
        C16228zr a2 = C16229zs.m52640a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
