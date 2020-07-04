package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.c */
public interface C21066c extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.c$a */
    public static abstract class C21067a extends Binder implements C21066c {

        /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.c$a$a */
        static class C21068a implements C21066c {

            /* renamed from: a */
            private IBinder f56582a;

            public final IBinder asBinder() {
                return this.f56582a;
            }

            C21068a(IBinder iBinder) {
                this.f56582a = iBinder;
            }

            /* renamed from: a */
            public final void mo56353a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
                    obtain.writeString(str);
                    this.f56582a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56354b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
                    obtain.writeString(str);
                    this.f56582a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56355c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
                    obtain.writeString(str);
                    this.f56582a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56356d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
                    obtain.writeString(str);
                    this.f56582a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21067a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
        }

        /* renamed from: a */
        public static C21066c m71073a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21066c)) {
                return new C21068a(iBinder);
            }
            return (C21066c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo56353a(parcel.readString());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo56354b(parcel.readString());
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        mo56355c(parcel.readString());
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        mo56356d(parcel.readString());
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
    void mo56353a(String str) throws RemoteException;

    /* renamed from: b */
    void mo56354b(String str) throws RemoteException;

    /* renamed from: c */
    void mo56355c(String str) throws RemoteException;

    /* renamed from: d */
    void mo56356d(String str) throws RemoteException;
}
