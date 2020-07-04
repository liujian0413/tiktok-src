package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.p */
public interface C20950p extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.p$a */
    public static abstract class C20951a extends Binder implements C20950p {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.p$a$a */
        static class C20952a implements C20950p {

            /* renamed from: a */
            private IBinder f56355a;

            public final IBinder asBinder() {
                return this.f56355a;
            }

            C20952a(IBinder iBinder) {
                this.f56355a = iBinder;
            }

            /* renamed from: a */
            public final void mo56390a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ICommonLongUnitCallback");
                    obtain.writeLong(j);
                    this.f56355a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20951a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.ICommonLongUnitCallback");
        }

        /* renamed from: a */
        public static C20950p m70009a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.ICommonLongUnitCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20950p)) {
                return new C20952a(iBinder);
            }
            return (C20950p) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.ICommonLongUnitCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56390a(parcel.readLong());
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
    void mo56390a(long j) throws RemoteException;
}
