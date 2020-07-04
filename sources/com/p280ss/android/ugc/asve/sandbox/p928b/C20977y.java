package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.y */
public interface C20977y extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.y$a */
    public static abstract class C20978a extends Binder implements C20977y {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.y$a$a */
        static class C20979a implements C20977y {

            /* renamed from: a */
            private IBinder f56364a;

            public final IBinder asBinder() {
                return this.f56364a;
            }

            C20979a(IBinder iBinder) {
                this.f56364a = iBinder;
            }

            /* renamed from: a */
            public final void mo56404a(long j, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IStickerRequestCallback");
                    obtain.writeLong(j);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56364a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20978a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IStickerRequestCallback");
        }

        /* renamed from: a */
        public static C20977y m70036a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IStickerRequestCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20977y)) {
                return new C20979a(iBinder);
            }
            return (C20977y) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = "com.ss.android.ugc.asve.sandbox.listener.IStickerRequestCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                mo56404a(readLong, z);
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
    void mo56404a(long j, boolean z) throws RemoteException;
}
