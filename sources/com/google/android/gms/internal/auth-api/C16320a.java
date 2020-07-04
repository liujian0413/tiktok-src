package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api.a */
public class C16320a implements IInterface {

    /* renamed from: a */
    private final IBinder f45810a;

    /* renamed from: b */
    private final String f45811b;

    protected C16320a(IBinder iBinder, String str) {
        this.f45810a = iBinder;
        this.f45811b = str;
    }

    public IBinder asBinder() {
        return this.f45810a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo42403a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45811b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42404a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45810a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
