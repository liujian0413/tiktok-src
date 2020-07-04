package com.google.android.gms.internal.p763e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.e.a */
public class C16368a implements IInterface {

    /* renamed from: a */
    private final IBinder f45851a;

    /* renamed from: b */
    private final String f45852b;

    protected C16368a(IBinder iBinder, String str) {
        this.f45851a = iBinder;
        this.f45852b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo42457a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45852b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo42458a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f45851a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f45851a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42460b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45851a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
