package com.p280ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.d */
public interface C20214d extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.d$a */
    public static abstract class C20215a extends Binder implements C20214d {

        /* renamed from: com.ss.android.socialbase.downloader.depend.d$a$a */
        static class C20216a implements C20214d {

            /* renamed from: a */
            private IBinder f54695a;

            public final IBinder asBinder() {
                return this.f54695a;
            }

            C20216a(IBinder iBinder) {
                this.f54695a = iBinder;
            }

            /* renamed from: a */
            public final int mo54137a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                    obtain.writeLong(j);
                    this.f54695a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20215a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
        }

        /* renamed from: a */
        public static C20214d m66609a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20214d)) {
                return new C20216a(iBinder);
            }
            return (C20214d) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                int a = mo54137a(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                return true;
            }
        }
    }

    /* renamed from: a */
    int mo54137a(long j) throws RemoteException;
}
