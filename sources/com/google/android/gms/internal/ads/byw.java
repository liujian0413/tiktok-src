package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class byw extends bfz implements byv {
    public byw() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo37781a((zzyv) bga.m48614a(parcel, zzyv.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                String a = mo37780a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                boolean c = mo37784c();
                parcel2.writeNoException();
                bga.m48617a(parcel2, c);
                break;
            case 4:
                String b = mo37783b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                break;
            case 5:
                mo37782a((zzyv) bga.m48614a(parcel, zzyv.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
