package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.b */
public interface C20908b extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.b$a */
    public static abstract class C20909a extends Binder implements C20908b {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.b$a$a */
        static class C20910a implements C20908b {

            /* renamed from: a */
            private IBinder f56341a;

            public final IBinder asBinder() {
                return this.f56341a;
            }

            /* renamed from: a */
            public final void mo56421a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASCommonRunableCallback");
                    this.f56341a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            C20910a(IBinder iBinder) {
                this.f56341a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20909a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASCommonRunableCallback");
        }

        /* renamed from: a */
        public static C20908b m69959a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASCommonRunableCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20908b)) {
                return new C20910a(iBinder);
            }
            return (C20908b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASCommonRunableCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56421a();
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
    void mo56421a() throws RemoteException;
}
