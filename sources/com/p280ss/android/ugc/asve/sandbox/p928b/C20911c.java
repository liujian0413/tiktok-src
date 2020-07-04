package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.c */
public interface C20911c extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.c$a */
    public static abstract class C20912a extends Binder implements C20911c {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.c$a$a */
        static class C20913a implements C20911c {

            /* renamed from: a */
            private IBinder f56342a;

            public final IBinder asBinder() {
                return this.f56342a;
            }

            C20913a(IBinder iBinder) {
                this.f56342a = iBinder;
            }

            /* renamed from: a */
            public final void mo56385a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener");
                    obtain.writeInt(i);
                    this.f56342a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56386a(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f56342a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20912a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener");
        }

        /* renamed from: a */
        public static C20911c m69963a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20911c)) {
                return new C20913a(iBinder);
            }
            return (C20911c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo56385a(parcel.readInt());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo56386a(parcel.readInt(), parcel.readInt(), parcel.readString());
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
    void mo56385a(int i) throws RemoteException;

    /* renamed from: a */
    void mo56386a(int i, int i2, String str) throws RemoteException;
}
