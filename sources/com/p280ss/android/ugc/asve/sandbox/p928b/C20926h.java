package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.h */
public interface C20926h extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.h$a */
    public static abstract class C20927a extends Binder implements C20926h {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.h$a$a */
        static class C20928a implements C20926h {

            /* renamed from: a */
            private IBinder f56347a;

            public final IBinder asBinder() {
                return this.f56347a;
            }

            C20928a(IBinder iBinder) {
                this.f56347a = iBinder;
            }

            /* renamed from: a */
            public final void mo56401a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxIntResultCallback");
                    obtain.writeInt(i);
                    this.f56347a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20927a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxIntResultCallback");
        }

        /* renamed from: a */
        public static C20926h m69981a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxIntResultCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20926h)) {
                return new C20928a(iBinder);
            }
            return (C20926h) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxIntResultCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56401a(parcel.readInt());
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
    void mo56401a(int i) throws RemoteException;
}
