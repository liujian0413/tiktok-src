package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

public final class bgd extends bfy implements bgb {
    bgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: a */
    public final void mo40598a(C15345b bVar, String str) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeString(str);
        mo40589b(2, z);
    }

    /* renamed from: a */
    public final void mo40596a() throws RemoteException {
        mo40589b(3, mo40591z());
    }

    /* renamed from: a */
    public final void mo40601a(int[] iArr) throws RemoteException {
        Parcel z = mo40591z();
        z.writeIntArray(null);
        mo40589b(4, z);
    }

    /* renamed from: a */
    public final void mo40600a(byte[] bArr) throws RemoteException {
        Parcel z = mo40591z();
        z.writeByteArray(bArr);
        mo40589b(5, z);
    }

    /* renamed from: a */
    public final void mo40597a(int i) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        mo40589b(6, z);
    }

    /* renamed from: b */
    public final void mo40602b(int i) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        mo40589b(7, z);
    }

    /* renamed from: a */
    public final void mo40599a(C15345b bVar, String str, String str2) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeString(str);
        z.writeString(null);
        mo40589b(8, z);
    }
}
