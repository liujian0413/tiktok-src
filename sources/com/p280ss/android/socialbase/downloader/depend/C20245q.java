package com.p280ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.socialbase.downloader.depend.C20242p.C20243a;

/* renamed from: com.ss.android.socialbase.downloader.depend.q */
public interface C20245q extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.q$a */
    public static abstract class C20246a extends Binder implements C20245q {

        /* renamed from: com.ss.android.socialbase.downloader.depend.q$a$a */
        static class C20247a implements C20245q {

            /* renamed from: a */
            private IBinder f54704a;

            public final IBinder asBinder() {
                return this.f54704a;
            }

            C20247a(IBinder iBinder) {
                this.f54704a = iBinder;
            }

            /* renamed from: a */
            public final boolean mo54188a(C20242p pVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                    if (pVar != null) {
                        iBinder = pVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    this.f54704a.transact(1, obtain, obtain2, 0);
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
        }

        public IBinder asBinder() {
            return this;
        }

        public C20246a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        }

        /* renamed from: a */
        public static C20245q m66667a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20245q)) {
                return new C20247a(iBinder);
            }
            return (C20245q) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                boolean a = mo54188a(C20243a.m66663a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo54188a(C20242p pVar) throws RemoteException;
}
