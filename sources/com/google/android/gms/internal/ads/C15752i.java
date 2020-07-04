package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.i */
public final class C15752i extends bfy implements C15698g {
    C15752i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: h */
    public final C15345b mo37618h() throws RemoteException {
        Parcel a = mo40587a(1, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: g */
    public final void mo37617g() throws RemoteException {
        mo40589b(2, mo40591z());
    }

    /* renamed from: j */
    public final boolean mo37620j() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final boolean mo37614b(zzyv zzyv) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzyv);
        Parcel a = mo40587a(4, z);
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final void mo37622l() throws RemoteException {
        mo40589b(5, mo40591z());
    }

    /* renamed from: m */
    public final void mo37623m() throws RemoteException {
        mo40589b(6, mo40591z());
    }

    /* renamed from: a */
    public final void mo37589a(bys bys) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bys);
        mo40589b(7, z);
    }

    /* renamed from: a */
    public final void mo37593a(C15914o oVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) oVar);
        mo40589b(8, z);
    }

    /* renamed from: E */
    public final void mo37640E() throws RemoteException {
        mo40589b(9, mo40591z());
    }

    /* renamed from: o */
    public final void mo37625o() throws RemoteException {
        mo40589b(10, mo40591z());
    }

    /* renamed from: k */
    public final void mo37621k() throws RemoteException {
        mo40589b(11, mo40591z());
    }

    /* renamed from: i */
    public final zzyz mo37619i() throws RemoteException {
        Parcel a = mo40587a(12, mo40591z());
        zzyz zzyz = (zzyz) bga.m48614a(a, zzyz.CREATOR);
        a.recycle();
        return zzyz;
    }

    /* renamed from: a */
    public final void mo37602a(zzyz zzyz) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzyz);
        mo40589b(13, z);
    }

    /* renamed from: a */
    public final void mo37594a(C16027se seVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) seVar);
        mo40589b(14, z);
    }

    /* renamed from: a */
    public final void mo37595a(C16033sk skVar, String str) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) skVar);
        z.writeString(str);
        mo40589b(15, z);
    }

    /* renamed from: a */
    public final String mo37684a() throws RemoteException {
        Parcel a = mo40587a(18, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo37591a(C15606cq cqVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) cqVar);
        mo40589b(19, z);
    }

    /* renamed from: a */
    public final void mo37588a(byp byp) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) byp);
        mo40589b(20, z);
    }

    /* renamed from: a */
    public final void mo37596a(C16076u uVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) uVar);
        mo40589b(21, z);
    }

    /* renamed from: a */
    public final void mo37607a(boolean z) throws RemoteException {
        Parcel z2 = mo40591z();
        bga.m48617a(z2, z);
        mo40589b(22, z2);
    }

    /* renamed from: p */
    public final boolean mo37626p() throws RemoteException {
        Parcel a = mo40587a(23, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo37598a(C16194yk ykVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) ykVar);
        mo40589b(24, z);
    }

    /* renamed from: a */
    public final void mo37603a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(25, z);
    }

    /* renamed from: q */
    public final C15488ak mo37627q() throws RemoteException {
        C15488ak akVar;
        Parcel a = mo40587a(26, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            akVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof C15488ak) {
                akVar = (C15488ak) queryLocalInterface;
            } else {
                akVar = new C15490am(readStrongBinder);
            }
        }
        a.recycle();
        return akVar;
    }

    /* renamed from: a */
    public final void mo37600a(zzacq zzacq) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzacq);
        mo40589b(29, z);
    }

    /* renamed from: a */
    public final void mo37599a(zzabp zzabp) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzabp);
        mo40589b(30, z);
    }

    /* renamed from: A */
    public final String mo37576A() throws RemoteException {
        Parcel a = mo40587a(31, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: B */
    public final C15914o mo37577B() throws RemoteException {
        C15914o oVar;
        Parcel a = mo40587a(32, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof C15914o) {
                oVar = (C15914o) queryLocalInterface;
            } else {
                oVar = new C15968q(readStrongBinder);
            }
        }
        a.recycle();
        return oVar;
    }

    /* renamed from: C */
    public final bys mo37578C() throws RemoteException {
        bys bys;
        Parcel a = mo40587a(33, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bys = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof bys) {
                bys = (bys) queryLocalInterface;
            } else {
                bys = new byu(readStrongBinder);
            }
        }
        a.recycle();
        return bys;
    }

    /* renamed from: b */
    public final void mo37613b(boolean z) throws RemoteException {
        Parcel z2 = mo40591z();
        bga.m48617a(z2, z);
        mo40589b(34, z2);
    }

    /* renamed from: y_ */
    public final String mo37689y_() throws RemoteException {
        Parcel a = mo40587a(35, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo37592a(C15833l lVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) lVar);
        mo40589b(36, z);
    }

    /* renamed from: n */
    public final Bundle mo37624n() throws RemoteException {
        Parcel a = mo40587a(37, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: b */
    public final void mo37612b(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(38, z);
    }
}
