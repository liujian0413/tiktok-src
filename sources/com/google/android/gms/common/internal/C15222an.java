package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p761c.C16356a;
import com.google.android.gms.internal.p761c.C16358c;

/* renamed from: com.google.android.gms.common.internal.an */
public final class C15222an extends C16356a implements C15260o {
    C15222an(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final void mo38546a(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel c = mo42449c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C16358c.m53322a(c, (Parcelable) bundle);
        mo42448b(1, c);
    }

    /* renamed from: a */
    public final void mo38545a(int i, Bundle bundle) throws RemoteException {
        Parcel c = mo42449c();
        c.writeInt(i);
        C16358c.m53322a(c, (Parcelable) bundle);
        mo42448b(2, c);
    }

    /* renamed from: a */
    public final void mo38547a(int i, IBinder iBinder, zzb zzb) throws RemoteException {
        Parcel c = mo42449c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C16358c.m53322a(c, (Parcelable) zzb);
        mo42448b(3, c);
    }
}
