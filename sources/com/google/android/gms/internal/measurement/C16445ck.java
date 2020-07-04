package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.ck */
public final class C16445ck extends C16506eo implements C16443ci {
    C16445ck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: a */
    public final void mo42616a(Bundle bundle) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) bundle);
        mo42699b(1, a);
    }
}
