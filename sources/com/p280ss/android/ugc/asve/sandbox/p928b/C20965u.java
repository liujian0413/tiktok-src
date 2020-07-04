package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.u */
public interface C20965u extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.u$a */
    public static abstract class C20966a extends Binder implements C20965u {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.u$a$a */
        static class C20967a implements C20965u {

            /* renamed from: a */
            private IBinder f56360a;

            public final IBinder asBinder() {
                return this.f56360a;
            }

            /* renamed from: a */
            public final void mo56413a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IHostDiedCallback");
                    this.f56360a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            C20967a(IBinder iBinder) {
                this.f56360a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20966a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IHostDiedCallback");
        }

        /* renamed from: a */
        public static C20965u m70024a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IHostDiedCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20965u)) {
                return new C20967a(iBinder);
            }
            return (C20965u) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IHostDiedCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56413a();
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
    void mo56413a() throws RemoteException;
}
