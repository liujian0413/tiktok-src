package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.cj */
public abstract class C16444cj extends C16507ep implements C16443ci {
    public C16444cj() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo42615a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo42616a((Bundle) C16517ez.m53832a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
