package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.base.a */
public class C16352a implements IInterface {

    /* renamed from: a */
    private final IBinder f45838a;

    /* renamed from: b */
    private final String f45839b;

    protected C16352a(IBinder iBinder, String str) {
        this.f45838a = iBinder;
        this.f45839b = str;
    }

    public IBinder asBinder() {
        return this.f45838a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo42440a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45839b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42441a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45838a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42443b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f45838a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
