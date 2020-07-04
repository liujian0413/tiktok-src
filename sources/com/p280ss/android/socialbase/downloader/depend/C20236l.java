package com.p280ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.socialbase.downloader.depend.C20233k.C20234a;

/* renamed from: com.ss.android.socialbase.downloader.depend.l */
public interface C20236l extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.l$a */
    public static abstract class C20237a extends Binder implements C20236l {

        /* renamed from: com.ss.android.socialbase.downloader.depend.l$a$a */
        static class C20238a implements C20236l {

            /* renamed from: a */
            private IBinder f54702a;

            public final IBinder asBinder() {
                return this.f54702a;
            }

            C20238a(IBinder iBinder) {
                this.f54702a = iBinder;
            }

            /* renamed from: a */
            public final boolean mo54178a(long j, long j2, C20233k kVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (kVar != null) {
                        iBinder = kVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    this.f54702a.transact(1, obtain, obtain2, 0);
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

        public C20237a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        }

        /* renamed from: a */
        public static C20236l m66656a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20236l)) {
                return new C20238a(iBinder);
            }
            return (C20236l) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                boolean a = mo54178a(parcel.readLong(), parcel.readLong(), C20234a.m66653a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo54178a(long j, long j2, C20233k kVar) throws RemoteException;
}
