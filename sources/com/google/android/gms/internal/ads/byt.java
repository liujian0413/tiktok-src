package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class byt extends bfz implements bys {
    public byt() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo41419a();
                break;
            case 2:
                mo41420a(parcel.readInt());
                break;
            case 3:
                mo41421b();
                break;
            case 4:
                mo41422c();
                break;
            case 5:
                mo41423d();
                break;
            case 6:
                mo41425f();
                break;
            case 7:
                mo41424e();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
