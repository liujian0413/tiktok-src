package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.wd */
public abstract class C16133wd extends bfz implements C16132wc {
    public C16133wd() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo42036a((zzaxi) bga.m48614a(parcel, zzaxi.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
