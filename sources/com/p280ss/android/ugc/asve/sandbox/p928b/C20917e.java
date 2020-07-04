package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.e */
public interface C20917e extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.e$a */
    public static abstract class C20918a extends Binder implements C20917e {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.e$a$a */
        static class C20919a implements C20917e {

            /* renamed from: a */
            private IBinder f56344a;

            public final IBinder asBinder() {
                return this.f56344a;
            }

            C20919a(IBinder iBinder) {
                this.f56344a = iBinder;
            }

            /* renamed from: a */
            public final void mo56405a(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteResultCallback");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f56344a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20918a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASRemoteResultCallback");
        }

        /* renamed from: a */
        public static C20917e m69972a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASRemoteResultCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20917e)) {
                return new C20919a(iBinder);
            }
            return (C20917e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASRemoteResultCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56405a(parcel.readInt(), parcel.readString());
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
    void mo56405a(int i, String str) throws RemoteException;
}
