package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.m */
public interface C21044m extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.m$a */
    public static abstract class C21045a extends Binder implements C21044m {

        /* renamed from: com.ss.android.ugc.asve.sandbox.m$a$a */
        static class C21046a implements C21044m {

            /* renamed from: a */
            private IBinder f56510a;

            public final IBinder asBinder() {
                return this.f56510a;
            }

            C21046a(IBinder iBinder) {
                this.f56510a = iBinder;
            }

            /* renamed from: b */
            public final void mo56352b(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
                    obtain.writeLong(j);
                    this.f56510a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final long mo56350a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
                    obtain.writeLong(j);
                    this.f56510a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final String mo56351a(long j, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56510a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21045a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
        }

        /* renamed from: a */
        public static C21044m m71006a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21044m)) {
                return new C21046a(iBinder);
            }
            return (C21044m) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        long a = mo56350a(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeLong(a);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo56352b(parcel.readLong());
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        String a2 = mo56351a(parcel.readLong(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(a2);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    long mo56350a(long j) throws RemoteException;

    /* renamed from: a */
    String mo56351a(long j, String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo56352b(long j) throws RemoteException;
}
