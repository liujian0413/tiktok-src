package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.d */
public interface C20914d extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.d$a */
    public static abstract class C20915a extends Binder implements C20914d {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.d$a$a */
        static class C20916a implements C20914d {

            /* renamed from: a */
            private IBinder f56343a;

            public final IBinder asBinder() {
                return this.f56343a;
            }

            /* renamed from: a */
            public final boolean mo56397a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener");
                    boolean z = false;
                    this.f56343a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20916a(IBinder iBinder) {
                this.f56343a = iBinder;
            }

            /* renamed from: a */
            public final void mo56396a(int i, int i2, int i3, int i4, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeLong(j);
                    this.f56343a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20915a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener");
        }

        /* renamed from: a */
        public static C20914d m69968a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20914d)) {
                return new C20916a(iBinder);
            }
            return (C20914d) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo56396a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        boolean a = mo56397a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo56396a(int i, int i2, int i3, int i4, long j) throws RemoteException;

    /* renamed from: a */
    boolean mo56397a() throws RemoteException;
}
