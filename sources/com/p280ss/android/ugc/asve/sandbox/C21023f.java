package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.f */
public interface C21023f extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.f$a */
    public static abstract class C21024a extends Binder implements C21023f {

        /* renamed from: com.ss.android.ugc.asve.sandbox.f$a$a */
        static class C21025a implements C21023f {

            /* renamed from: a */
            private IBinder f56503a;

            public final IBinder asBinder() {
                return this.f56503a;
            }

            C21025a(IBinder iBinder) {
                this.f56503a = iBinder;
            }

            /* renamed from: a */
            public final String mo56361a(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxPathAdaptor");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f56503a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21024a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxPathAdaptor");
        }

        /* renamed from: a */
        public static C21023f m70575a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxPathAdaptor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21023f)) {
                return new C21025a(iBinder);
            }
            return (C21023f) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxPathAdaptor";
            if (i == 1) {
                parcel.enforceInterface(str);
                String a = mo56361a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(a);
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
    String mo56361a(String str, int i) throws RemoteException;
}
