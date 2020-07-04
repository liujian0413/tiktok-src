package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ot */
public final class C15934ot extends bfy implements C15931oq {
    C15934ot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public final C15935ou mo41811a(String str) throws RemoteException {
        C15935ou ouVar;
        Parcel z = mo40591z();
        z.writeString(str);
        Parcel a = mo40587a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ouVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof C15935ou) {
                ouVar = (C15935ou) queryLocalInterface;
            } else {
                ouVar = new C15937ow(readStrongBinder);
            }
        }
        a.recycle();
        return ouVar;
    }

    /* renamed from: b */
    public final boolean mo41812b(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        Parcel a = mo40587a(2, z);
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final C15983qo mo41813c(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        Parcel a = mo40587a(3, z);
        C15983qo a2 = C15984qp.m51983a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
