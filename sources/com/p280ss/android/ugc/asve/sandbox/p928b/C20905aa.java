package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.aa */
public interface C20905aa extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.aa$a */
    public static abstract class C20906a extends Binder implements C20905aa {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.aa$a$a */
        static class C20907a implements C20905aa {

            /* renamed from: a */
            private IBinder f56340a;

            public final IBinder asBinder() {
                return this.f56340a;
            }

            C20907a(IBinder iBinder) {
                this.f56340a = iBinder;
            }

            /* renamed from: a */
            public final void mo56365a(int i, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IVESATZoomListener");
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    this.f56340a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20906a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IVESATZoomListener");
        }

        /* renamed from: a */
        public static C20905aa m69956a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IVESATZoomListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20905aa)) {
                return new C20907a(iBinder);
            }
            return (C20905aa) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IVESATZoomListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56365a(parcel.readInt(), parcel.readFloat());
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
    void mo56365a(int i, float f) throws RemoteException;
}
