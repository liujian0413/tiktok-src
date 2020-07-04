package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.z */
public interface C20980z extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.z$a */
    public static abstract class C20981a extends Binder implements C20980z {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.z$a$a */
        static class C20982a implements C20980z {

            /* renamed from: a */
            private IBinder f56365a;

            public final IBinder asBinder() {
                return this.f56365a;
            }

            C20982a(IBinder iBinder) {
                this.f56365a = iBinder;
            }

            /* renamed from: a */
            public final void mo56364a(boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IVELandMarkDetectListener");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f56365a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20981a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IVELandMarkDetectListener");
        }

        /* renamed from: a */
        public static C20980z m70039a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IVELandMarkDetectListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20980z)) {
                return new C20982a(iBinder);
            }
            return (C20980z) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = "com.ss.android.ugc.asve.sandbox.listener.IVELandMarkDetectListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                mo56364a(z, z2);
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
    void mo56364a(boolean z, boolean z2) throws RemoteException;
}
