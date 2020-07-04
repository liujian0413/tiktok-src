package com.p280ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.ab */
public interface C20208ab extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.ab$a */
    public static abstract class C20209a extends Binder implements C20208ab {

        /* renamed from: com.ss.android.socialbase.downloader.depend.ab$a$a */
        static class C20210a implements C20208ab {

            /* renamed from: a */
            private IBinder f54694a;

            public final IBinder asBinder() {
                return this.f54694a;
            }

            C20210a(IBinder iBinder) {
                this.f54694a = iBinder;
            }

            /* renamed from: a */
            public final void mo54131a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f54694a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20209a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        }

        /* renamed from: a */
        public static C20208ab m66604a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20208ab)) {
                return new C20210a(iBinder);
            }
            return (C20208ab) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                mo54131a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo54131a(int i, int i2) throws RemoteException;
}
