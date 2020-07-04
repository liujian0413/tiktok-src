package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.d */
public interface C21069d extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.d$a */
    public static abstract class C21070a extends Binder implements C21069d {

        /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.d$a$a */
        static class C21071a implements C21069d {

            /* renamed from: a */
            private IBinder f56583a;

            public final IBinder asBinder() {
                return this.f56583a;
            }

            /* renamed from: a */
            public final String mo56329a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    this.f56583a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final String mo56331b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    this.f56583a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final String mo56333c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    this.f56583a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C21071a(IBinder iBinder) {
                this.f56583a = iBinder;
            }

            /* renamed from: a */
            public final String mo56330a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    obtain.writeInt(i);
                    this.f56583a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final String mo56332b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    obtain.writeInt(i);
                    this.f56583a.transact(3, obtain, obtain2, 0);
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

        public C21070a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
        }

        /* renamed from: a */
        public static C21069d m71083a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21069d)) {
                return new C21071a(iBinder);
            }
            return (C21069d) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        String a = mo56329a();
                        parcel2.writeNoException();
                        parcel2.writeString(a);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        String a2 = mo56330a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(a2);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        String b = mo56332b(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(b);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        String b2 = mo56331b();
                        parcel2.writeNoException();
                        parcel2.writeString(b2);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        String c = mo56333c();
                        parcel2.writeNoException();
                        parcel2.writeString(c);
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
    String mo56329a() throws RemoteException;

    /* renamed from: a */
    String mo56330a(int i) throws RemoteException;

    /* renamed from: b */
    String mo56331b() throws RemoteException;

    /* renamed from: b */
    String mo56332b(int i) throws RemoteException;

    /* renamed from: c */
    String mo56333c() throws RemoteException;
}
