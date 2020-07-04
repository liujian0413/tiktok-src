package com.google.android.gms.internal.p760b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.b.e */
public final class C16344e extends C16340a implements C16343d {
    C16344e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: a */
    public final void mo42436a(C16345f fVar) throws RemoteException {
        Parcel a = mo42430a();
        C16342c.m53293a(a, (IInterface) fVar);
        mo42431a(1, a);
    }
}
