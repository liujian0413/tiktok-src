package com.p280ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.e */
public interface C20217e extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.e$a */
    public static abstract class C20218a extends Binder implements C20217e {

        /* renamed from: com.ss.android.socialbase.downloader.depend.e$a$a */
        static class C20219a implements C20217e {

            /* renamed from: a */
            private IBinder f54696a;

            public final IBinder asBinder() {
                return this.f54696a;
            }

            C20219a(IBinder iBinder) {
                this.f54696a = iBinder;
            }

            /* renamed from: a */
            public final void mo54141a(DownloadInfo downloadInfo, BaseException baseException, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f54696a.transact(1, obtain, obtain2, 0);
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

        public C20218a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
        }

        /* renamed from: a */
        public static C20217e m66612a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20217e)) {
                return new C20219a(iBinder);
            }
            return (C20217e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            DownloadInfo downloadInfo;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                BaseException baseException = null;
                if (parcel.readInt() != 0) {
                    downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(parcel);
                } else {
                    downloadInfo = null;
                }
                if (parcel.readInt() != 0) {
                    baseException = (BaseException) BaseException.CREATOR.createFromParcel(parcel);
                }
                mo54141a(downloadInfo, baseException, parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo54141a(DownloadInfo downloadInfo, BaseException baseException, int i) throws RemoteException;
}
