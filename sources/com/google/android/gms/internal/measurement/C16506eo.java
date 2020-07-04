package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.eo */
public class C16506eo implements IInterface {

    /* renamed from: a */
    private final IBinder f46263a;

    /* renamed from: b */
    private final String f46264b;

    protected C16506eo(IBinder iBinder, String str) {
        this.f46263a = iBinder;
        this.f46264b = str;
    }

    public IBinder asBinder() {
        return this.f46263a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo42696a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46264b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo42697a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f46263a.transact(i, parcel, parcel, 0);
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
    public final void mo42699b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f46263a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
