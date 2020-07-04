package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.i */
public interface C20929i extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.i$a */
    public static abstract class C20930a extends Binder implements C20929i {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.i$a$a */
        static class C20931a implements C20929i {

            /* renamed from: a */
            private IBinder f56348a;

            public final IBinder asBinder() {
                return this.f56348a;
            }

            C20931a(IBinder iBinder) {
                this.f56348a = iBinder;
            }

            /* renamed from: a */
            public final void mo56403a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxShotScreenCallback");
                    obtain.writeInt(i);
                    this.f56348a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20930a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxShotScreenCallback");
        }

        /* renamed from: a */
        public static C20929i m69984a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxShotScreenCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20929i)) {
                return new C20931a(iBinder);
            }
            return (C20929i) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxShotScreenCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56403a(parcel.readInt());
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
    void mo56403a(int i) throws RemoteException;
}
