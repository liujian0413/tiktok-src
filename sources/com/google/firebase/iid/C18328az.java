package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.az */
public final class C18328az implements C18327ay {

    /* renamed from: a */
    private final IBinder f49812a;

    C18328az(IBinder iBinder) {
        this.f49812a = iBinder;
    }

    /* renamed from: a */
    public final void mo47240a(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f49812a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f49812a;
    }
}
