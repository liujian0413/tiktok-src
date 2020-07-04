package com.p280ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.k */
public interface C20233k extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.k$a */
    public static abstract class C20234a extends Binder implements C20233k {

        /* renamed from: com.ss.android.socialbase.downloader.depend.k$a$a */
        static class C20235a implements C20233k {

            /* renamed from: a */
            private IBinder f54701a;

            public final IBinder asBinder() {
                return this.f54701a;
            }

            /* renamed from: a */
            public final void mo54174a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    this.f54701a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20235a(IBinder iBinder) {
                this.f54701a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20234a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
        }

        /* renamed from: a */
        public static C20233k m66653a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20233k)) {
                return new C20235a(iBinder);
            }
            return (C20233k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                mo54174a();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo54174a() throws RemoteException;
}
