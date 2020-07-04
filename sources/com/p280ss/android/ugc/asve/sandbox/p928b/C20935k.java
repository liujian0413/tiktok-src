package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.k */
public interface C20935k extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.k$a */
    public static abstract class C20936a extends Binder implements C20935k {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.k$a$a */
        static class C20937a implements C20935k {

            /* renamed from: a */
            private IBinder f56350a;

            public final IBinder asBinder() {
                return this.f56350a;
            }

            C20937a(IBinder iBinder) {
                this.f56350a = iBinder;
            }

            /* renamed from: a */
            public final void mo56392a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener");
                    obtain.writeInt(i);
                    this.f56350a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56393a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56350a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20936a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener");
        }

        /* renamed from: a */
        public static C20935k m69991a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20935k)) {
                return new C20937a(iBinder);
            }
            return (C20935k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo56392a(parcel.readInt());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo56393a(parcel.readInt(), parcel.readInt());
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
    void mo56392a(int i) throws RemoteException;

    /* renamed from: a */
    void mo56393a(int i, int i2) throws RemoteException;
}
