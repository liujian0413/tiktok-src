package com.p280ss.android.message;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.message.c */
public interface C19831c extends IInterface {

    /* renamed from: com.ss.android.message.c$a */
    public static abstract class C19832a extends Binder implements C19831c {

        /* renamed from: com.ss.android.message.c$a$a */
        static class C19833a implements C19831c {

            /* renamed from: a */
            private IBinder f53795a;

            public final IBinder asBinder() {
                return this.f53795a;
            }

            /* renamed from: a */
            public final boolean mo53175a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    boolean z = false;
                    this.f53795a.transact(1, obtain, obtain2, 0);
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

            /* renamed from: b */
            public final int mo53176b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53795a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final long mo53177c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53795a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final String mo53178d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53795a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final String mo53179e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53795a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final String mo53180f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53795a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final String mo53181g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53795a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C19833a(IBinder iBinder) {
                this.f53795a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19832a() {
            attachInterface(this, "com.ss.android.message.IPushAppCallback");
        }

        /* renamed from: a */
        public static C19831c m65494a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.message.IPushAppCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C19831c)) {
                return new C19833a(iBinder);
            }
            return (C19831c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.message.IPushAppCallback";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        boolean a = mo53175a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        int b = mo53176b();
                        parcel2.writeNoException();
                        parcel2.writeInt(b);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        long c = mo53177c();
                        parcel2.writeNoException();
                        parcel2.writeLong(c);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        String d = mo53178d();
                        parcel2.writeNoException();
                        parcel2.writeString(d);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        String e = mo53179e();
                        parcel2.writeNoException();
                        parcel2.writeString(e);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        String f = mo53180f();
                        parcel2.writeNoException();
                        parcel2.writeString(f);
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        String g = mo53181g();
                        parcel2.writeNoException();
                        parcel2.writeString(g);
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
    boolean mo53175a() throws RemoteException;

    /* renamed from: b */
    int mo53176b() throws RemoteException;

    /* renamed from: c */
    long mo53177c() throws RemoteException;

    /* renamed from: d */
    String mo53178d() throws RemoteException;

    /* renamed from: e */
    String mo53179e() throws RemoteException;

    /* renamed from: f */
    String mo53180f() throws RemoteException;

    /* renamed from: g */
    String mo53181g() throws RemoteException;
}
