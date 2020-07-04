package com.p280ss.android.message;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.message.C19831c.C19832a;

/* renamed from: com.ss.android.message.b */
public interface C19828b extends IInterface {

    /* renamed from: com.ss.android.message.b$a */
    public static abstract class C19829a extends Binder implements C19828b {

        /* renamed from: com.ss.android.message.b$a$a */
        static class C19830a implements C19828b {

            /* renamed from: a */
            private IBinder f53794a;

            public final IBinder asBinder() {
                return this.f53794a;
            }

            C19830a(IBinder iBinder) {
                this.f53794a = iBinder;
            }

            /* renamed from: a */
            public final void mo53131a(C19831c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.INotifyService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f53794a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo53132b(C19831c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.INotifyService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f53794a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19829a() {
            attachInterface(this, "com.ss.android.message.INotifyService");
        }

        /* renamed from: a */
        public static C19828b m65484a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.message.INotifyService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C19828b)) {
                return new C19830a(iBinder);
            }
            return (C19828b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.message.INotifyService";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo53131a(C19832a.m65494a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo53132b(C19832a.m65494a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
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
    void mo53131a(C19831c cVar) throws RemoteException;

    /* renamed from: b */
    void mo53132b(C19831c cVar) throws RemoteException;
}
