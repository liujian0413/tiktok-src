package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15256m;
import com.google.android.gms.internal.base.C16352a;
import com.google.android.gms.internal.base.C16354c;

/* renamed from: com.google.android.gms.signin.internal.g */
public final class C16974g extends C16352a implements C16973f {
    C16974g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo44188a(int i) throws RemoteException {
        Parcel a = mo42440a();
        a.writeInt(i);
        mo42441a(7, a);
    }

    /* renamed from: a */
    public final void mo44189a(C15256m mVar, int i, boolean z) throws RemoteException {
        Parcel a = mo42440a();
        C16354c.m53313a(a, (IInterface) mVar);
        a.writeInt(i);
        C16354c.m53315a(a, z);
        mo42441a(9, a);
    }

    /* renamed from: a */
    public final void mo44190a(zah zah, C16971d dVar) throws RemoteException {
        Parcel a = mo42440a();
        C16354c.m53314a(a, (Parcelable) zah);
        C16354c.m53313a(a, (IInterface) dVar);
        mo42441a(12, a);
    }
}
