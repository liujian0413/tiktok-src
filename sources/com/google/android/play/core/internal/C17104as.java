package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.as */
public class C17104as implements IInterface {

    /* renamed from: a */
    private final IBinder f47812a;

    /* renamed from: b */
    private final String f47813b;

    protected C17104as(IBinder iBinder, String str) {
        this.f47812a = iBinder;
        this.f47813b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo44379a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f47813b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44380a(int i, Parcel parcel) throws RemoteException {
        try {
            this.f47812a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f47812a;
    }
}
