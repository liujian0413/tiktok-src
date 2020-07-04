package com.google.android.gms.internal.p760b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.b.a */
public class C16340a implements IInterface {

    /* renamed from: a */
    private final IBinder f45833a;

    /* renamed from: b */
    private final String f45834b;

    protected C16340a(IBinder iBinder, String str) {
        this.f45833a = iBinder;
        this.f45834b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo42430a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45834b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42431a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45833a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f45833a;
    }
}
