package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;

public final class aot extends bfy implements aor {
    aot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: a */
    public final boolean mo39910a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        Parcel a = mo40587a(2, z);
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final void mo39911b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(4, z);
    }

    /* renamed from: a */
    public final void mo39909a(C15345b bVar, C15345b bVar2) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        bga.m48615a(z, (IInterface) bVar2);
        mo40589b(5, z);
    }

    /* renamed from: a */
    public final String mo39908a() throws RemoteException {
        Parcel a = mo40587a(6, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo39912c(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(7, z);
    }

    /* renamed from: a */
    public final C15345b mo39907a(String str, C15345b bVar, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        bga.m48615a(z, (IInterface) bVar);
        z.writeString(str2);
        z.writeString(str3);
        z.writeString(str4);
        z.writeString(str5);
        Parcel a = mo40587a(9, z);
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
