package com.p280ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.z */
public interface C20260z extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.z$a */
    public static abstract class C20261a extends Binder implements C20260z {

        /* renamed from: com.ss.android.socialbase.downloader.depend.z$a$a */
        static class C20262a implements C20260z {

            /* renamed from: a */
            private IBinder f54707a;

            public final IBinder asBinder() {
                return this.f54707a;
            }

            C20262a(IBinder iBinder) {
                this.f54707a = iBinder;
            }

            /* renamed from: a */
            public final long mo54205a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f54707a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20261a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        }

        /* renamed from: a */
        public static C20260z m66691a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20260z)) {
                return new C20262a(iBinder);
            }
            return (C20260z) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                long a = mo54205a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                return true;
            }
        }
    }

    /* renamed from: a */
    long mo54205a(int i, int i2) throws RemoteException;
}
