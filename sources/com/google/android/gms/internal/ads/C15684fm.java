package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fm */
public final class C15684fm extends bfy implements C15682fk {
    C15684fm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public final String mo41531a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        Parcel a = mo40587a(1, z);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final C15658en mo41534b(String str) throws RemoteException {
        C15658en enVar;
        Parcel z = mo40591z();
        z.writeString(str);
        Parcel a = mo40587a(2, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            enVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof C15658en) {
                enVar = (C15658en) queryLocalInterface;
            } else {
                enVar = new C15660ep(readStrongBinder);
            }
        }
        a.recycle();
        return enVar;
    }

    /* renamed from: a */
    public final List<String> mo41532a() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        ArrayList createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    /* renamed from: c */
    public final String mo41482c() throws RemoteException {
        Parcel a = mo40587a(4, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo41535c(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(5, z);
    }

    /* renamed from: h */
    public final void mo41538h() throws RemoteException {
        mo40589b(6, mo40591z());
    }

    /* renamed from: g */
    public final C15488ak mo41537g() throws RemoteException {
        Parcel a = mo40587a(7, mo40591z());
        C15488ak a2 = C15489al.m46249a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final void mo41540j() throws RemoteException {
        mo40589b(8, mo40591z());
    }

    /* renamed from: i */
    public final C15345b mo41539i() throws RemoteException {
        Parcel a = mo40587a(9, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final boolean mo41533a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        Parcel a = mo40587a(10, z);
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final C15345b mo41536f() throws RemoteException {
        Parcel a = mo40587a(11, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
