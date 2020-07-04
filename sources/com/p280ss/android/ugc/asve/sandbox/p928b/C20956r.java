package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.r */
public interface C20956r extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.r$a */
    public static abstract class C20957a extends Binder implements C20956r {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.r$a$a */
        static class C20958a implements C20956r {

            /* renamed from: a */
            private IBinder f56357a;

            public final IBinder asBinder() {
                return this.f56357a;
            }

            C20958a(IBinder iBinder) {
                this.f56357a = iBinder;
            }

            /* renamed from: a */
            public final void mo56470a(float[] fArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IFOVCallback");
                    obtain.writeFloatArray(fArr);
                    this.f56357a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20957a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IFOVCallback");
        }

        /* renamed from: a */
        public static C20956r m70015a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IFOVCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20956r)) {
                return new C20958a(iBinder);
            }
            return (C20956r) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IFOVCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56470a(parcel.createFloatArray());
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
    void mo56470a(float[] fArr) throws RemoteException;
}
