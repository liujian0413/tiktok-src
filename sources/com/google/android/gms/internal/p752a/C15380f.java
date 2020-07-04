package com.google.android.gms.internal.p752a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.a.f */
public final class C15380f extends C15375a implements C15378d {
    C15380f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo38735a() throws RemoteException {
        Parcel a = mo38731a(1, mo38730I_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final boolean mo38736a(boolean z) throws RemoteException {
        Parcel I_ = mo38730I_();
        C15377c.m44726a(I_, true);
        Parcel a = mo38731a(2, I_);
        boolean a2 = C15377c.m44727a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final boolean mo38737b() throws RemoteException {
        Parcel a = mo38731a(6, mo38730I_());
        boolean a2 = C15377c.m44727a(a);
        a.recycle();
        return a2;
    }
}
