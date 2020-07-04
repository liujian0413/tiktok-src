package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.os */
public abstract class C15933os extends bfz implements C15931oq {
    public C15933os() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static C15931oq m51515a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof C15931oq) {
            return (C15931oq) queryLocalInterface;
        }
        return new C15934ot(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C15935ou a = mo41811a(parcel.readString());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a);
                break;
            case 2:
                boolean b = mo41812b(parcel.readString());
                parcel2.writeNoException();
                bga.m48617a(parcel2, b);
                break;
            case 3:
                C15983qo c = mo41813c(parcel.readString());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) c);
                break;
            default:
                return false;
        }
        return true;
    }
}
