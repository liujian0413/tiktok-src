package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.v */
public abstract class C16102v extends bfz implements C16076u {
    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        long a = mo41443a();
        parcel2.writeNoException();
        parcel2.writeLong(a);
        return true;
    }
}
