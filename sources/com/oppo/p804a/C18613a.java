package com.oppo.p804a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.oppo.a.a */
public interface C18613a extends IInterface {

    /* renamed from: com.oppo.a.a$a */
    public static abstract class C18614a extends Binder implements C18613a {

        /* renamed from: com.oppo.a.a$a$a */
        static class C18615a implements C18613a {

            /* renamed from: a */
            private IBinder f50298a;

            /* renamed from: b */
            private String f50299b = "omediatestkey";

            public final IBinder asBinder() {
                return this.f50298a;
            }

            /* renamed from: a */
            public final String mo48799a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f50299b);
                    this.f50298a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C18615a(IBinder iBinder) {
                this.f50298a = iBinder;
            }

            /* renamed from: b */
            public final boolean mo48802b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f50299b);
                    obtain.writeString(str);
                    boolean z = false;
                    this.f50298a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final String mo48800a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f50299b);
                    obtain.writeString(str);
                    this.f50298a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final String mo48801a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    if (str2 == null) {
                        obtain.writeString("omediatestkey");
                    } else {
                        obtain.writeString(str2);
                    }
                    obtain.writeString(str);
                    this.f50298a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    if (readString != null) {
                        this.f50299b = str2;
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C18613a m61059a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.oppo.omedia.IOMediaService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C18613a)) {
                return new C18615a(iBinder);
            }
            return (C18613a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* renamed from: a */
    String mo48799a() throws RemoteException;

    /* renamed from: a */
    String mo48800a(String str) throws RemoteException;

    /* renamed from: a */
    String mo48801a(String str, String str2) throws RemoteException;

    /* renamed from: b */
    boolean mo48802b(String str) throws RemoteException;
}
