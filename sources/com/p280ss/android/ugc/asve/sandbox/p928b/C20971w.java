package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.w */
public interface C20971w extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.w$a */
    public static abstract class C20972a extends Binder implements C20971w {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.w$a$a */
        static class C20973a implements C20971w {

            /* renamed from: a */
            private IBinder f56362a;

            public final IBinder asBinder() {
                return this.f56362a;
            }

            C20973a(IBinder iBinder) {
                this.f56362a = iBinder;
            }

            /* renamed from: a */
            public final void mo56395a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IOnARTextCountCallback");
                    obtain.writeInt(i);
                    this.f56362a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20972a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IOnARTextCountCallback");
        }

        /* renamed from: a */
        public static C20971w m70030a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IOnARTextCountCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20971w)) {
                return new C20973a(iBinder);
            }
            return (C20971w) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IOnARTextCountCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56395a(parcel.readInt());
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
    void mo56395a(int i) throws RemoteException;
}
