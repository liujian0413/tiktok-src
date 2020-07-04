package com.tencent.wcdb;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.tencent.wcdb.k */
public interface C46437k extends IInterface {

    /* renamed from: com.tencent.wcdb.k$a */
    public static abstract class C46438a extends Binder implements C46437k {

        /* renamed from: com.tencent.wcdb.k$a$a */
        static class C46439a implements C46437k {

            /* renamed from: a */
            private IBinder f119634a;

            public final IBinder asBinder() {
                return this.f119634a;
            }

            C46439a(IBinder iBinder) {
                this.f119634a = iBinder;
            }

            /* renamed from: a */
            public final void mo115531a(boolean z, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.wcdb.IContentObserver");
                    obtain.writeInt(z ? 1 : 0);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f119634a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C46437k m145995a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.wcdb.IContentObserver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C46437k)) {
                return new C46439a(iBinder);
            }
            return (C46437k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            Uri uri;
            String str = "com.tencent.wcdb.IContentObserver";
            if (i == 1) {
                parcel.enforceInterface(str);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                } else {
                    uri = null;
                }
                mo115531a(z, uri);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo115531a(boolean z, Uri uri) throws RemoteException;
}
