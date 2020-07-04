package com.google.android.gms.common.internal.p750a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.C16352a;
import com.google.android.gms.internal.base.C16354c;

/* renamed from: com.google.android.gms.common.internal.a.n */
public final class C15208n extends C16352a implements C15207m {
    C15208n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: a */
    public final void mo38518a(C15205k kVar) throws RemoteException {
        Parcel a = mo42440a();
        C16354c.m53313a(a, (IInterface) kVar);
        mo42443b(1, a);
    }
}
