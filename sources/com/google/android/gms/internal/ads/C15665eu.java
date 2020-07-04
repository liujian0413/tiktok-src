package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.eu */
public final class C15665eu extends bfy implements C15663es {
    C15665eu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public final void mo40520a(String str, C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(1, z);
    }

    /* renamed from: a */
    public final C15345b mo40516a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        Parcel a = mo40587a(2, z);
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo40518a(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(3, z);
    }

    /* renamed from: a */
    public final void mo40517a() throws RemoteException {
        mo40589b(4, mo40591z());
    }

    /* renamed from: a */
    public final void mo40519a(C15345b bVar, int i) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeInt(i);
        mo40589b(5, z);
    }

    /* renamed from: b */
    public final void mo40521b(C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(6, z);
    }
}
