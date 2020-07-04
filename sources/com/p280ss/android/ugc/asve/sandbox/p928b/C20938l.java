package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.l */
public interface C20938l extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.l$a */
    public static abstract class C20939a extends Binder implements C20938l {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.l$a$a */
        static class C20940a implements C20938l {

            /* renamed from: a */
            private IBinder f56351a;

            public final IBinder asBinder() {
                return this.f56351a;
            }

            C20940a(IBinder iBinder) {
                this.f56351a = iBinder;
            }

            /* renamed from: a */
            public final void mo56399a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandboxRunningErrorCallback");
                    obtain.writeInt(i);
                    this.f56351a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20939a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandboxRunningErrorCallback");
        }

        /* renamed from: a */
        public static C20938l m69995a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandboxRunningErrorCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20938l)) {
                return new C20940a(iBinder);
            }
            return (C20938l) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandboxRunningErrorCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56399a(parcel.readInt());
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
    void mo56399a(int i) throws RemoteException;
}
