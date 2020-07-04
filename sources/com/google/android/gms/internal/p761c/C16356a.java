package com.google.android.gms.internal.p761c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.c.a */
public class C16356a implements IInterface {

    /* renamed from: a */
    private final IBinder f45841a;

    /* renamed from: b */
    private final String f45842b;

    protected C16356a(IBinder iBinder, String str) {
        this.f45841a = iBinder;
        this.f45842b = str;
    }

    public IBinder asBinder() {
        return this.f45841a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo42449c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45842b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo42446a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f45841a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42448b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45841a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
