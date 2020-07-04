package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class bfy implements IInterface {

    /* renamed from: a */
    private final IBinder f41867a;

    /* renamed from: b */
    private final String f41868b;

    protected bfy(IBinder iBinder, String str) {
        this.f41867a = iBinder;
        this.f41868b = str;
    }

    public IBinder asBinder() {
        return this.f41867a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo40591z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f41868b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo40587a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f41867a.transact(i, parcel, parcel, 0);
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
    public final void mo40589b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f41867a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo40590c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f41867a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
