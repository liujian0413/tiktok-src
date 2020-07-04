package com.google.android.gms.internal.p752a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.a.a */
public class C15375a implements IInterface {

    /* renamed from: a */
    private final IBinder f39666a;

    /* renamed from: b */
    private final String f39667b;

    protected C15375a(IBinder iBinder, String str) {
        this.f39666a = iBinder;
        this.f39667b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I_ */
    public final Parcel mo38730I_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39667b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo38731a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f39666a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f39666a;
    }
}
