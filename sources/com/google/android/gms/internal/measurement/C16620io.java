package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.io */
public final class C16620io extends C16506eo implements C16563gr {
    C16620io(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo42888a(Bundle bundle) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) bundle);
        Parcel a2 = mo42697a(1, a);
        Bundle bundle2 = (Bundle) C16517ez.m53832a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
