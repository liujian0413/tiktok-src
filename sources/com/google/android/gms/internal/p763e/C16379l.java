package com.google.android.gms.internal.p763e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.e.l */
public final class C16379l extends C16368a implements C16377j {
    C16379l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: J_ */
    public final void mo42466J_() throws RemoteException {
        mo42460b(1, mo42457a());
    }

    /* renamed from: a */
    public final boolean mo42467a(C16377j jVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) jVar);
        Parcel a2 = mo42458a(16, a);
        boolean a3 = C16373f.m53345a(a2);
        a2.recycle();
        return a3;
    }

    /* renamed from: b */
    public final void mo42468b() throws RemoteException {
        mo42460b(11, mo42457a());
    }

    /* renamed from: c */
    public final int mo42469c() throws RemoteException {
        Parcel a = mo42458a(17, mo42457a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
