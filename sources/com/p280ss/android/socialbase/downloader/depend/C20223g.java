package com.p280ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.g */
public interface C20223g extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.g$a */
    public static abstract class C20224a extends Binder implements C20223g {

        /* renamed from: com.ss.android.socialbase.downloader.depend.g$a$a */
        static class C20225a implements C20223g {

            /* renamed from: a */
            private IBinder f54698a;

            public final IBinder asBinder() {
                return this.f54698a;
            }

            /* renamed from: a */
            public final boolean mo54149a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                    boolean z = false;
                    this.f54698a.transact(1, obtain, obtain2, 0);
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

            C20225a(IBinder iBinder) {
                this.f54698a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20224a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
        }

        /* renamed from: a */
        public static C20223g m66618a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20223g)) {
                return new C20225a(iBinder);
            }
            return (C20223g) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                boolean a = mo54149a();
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo54149a() throws RemoteException;
}
