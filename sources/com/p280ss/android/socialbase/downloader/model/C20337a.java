package com.p280ss.android.socialbase.downloader.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.socialbase.downloader.depend.C20214d;
import com.p280ss.android.socialbase.downloader.depend.C20214d.C20215a;
import com.p280ss.android.socialbase.downloader.depend.C20217e;
import com.p280ss.android.socialbase.downloader.depend.C20217e.C20218a;
import com.p280ss.android.socialbase.downloader.depend.C20220f;
import com.p280ss.android.socialbase.downloader.depend.C20220f.C20221a;
import com.p280ss.android.socialbase.downloader.depend.C20223g;
import com.p280ss.android.socialbase.downloader.depend.C20223g.C20224a;
import com.p280ss.android.socialbase.downloader.depend.C20226h;
import com.p280ss.android.socialbase.downloader.depend.C20226h.C20227a;
import com.p280ss.android.socialbase.downloader.depend.C20229i;
import com.p280ss.android.socialbase.downloader.depend.C20229i.C20230a;
import com.p280ss.android.socialbase.downloader.depend.C20236l;
import com.p280ss.android.socialbase.downloader.depend.C20236l.C20237a;
import com.p280ss.android.socialbase.downloader.depend.C20245q;
import com.p280ss.android.socialbase.downloader.depend.C20245q.C20246a;
import com.p280ss.android.socialbase.downloader.depend.C20251u;
import com.p280ss.android.socialbase.downloader.depend.C20251u.C20252a;
import com.p280ss.android.socialbase.downloader.depend.C20256x;
import com.p280ss.android.socialbase.downloader.depend.C20256x.C20257a;
import com.p280ss.android.socialbase.downloader.depend.C20260z;
import com.p280ss.android.socialbase.downloader.depend.C20260z.C20261a;

/* renamed from: com.ss.android.socialbase.downloader.model.a */
public interface C20337a extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.model.a$a */
    public static abstract class C20338a extends Binder implements C20337a {

        /* renamed from: com.ss.android.socialbase.downloader.model.a$a$a */
        static class C20339a implements C20337a {

            /* renamed from: a */
            private IBinder f54982a;

            public final IBinder asBinder() {
                return this.f54982a;
            }

            /* renamed from: b */
            public final C20214d mo54880b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20215a.m66609a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final C20251u mo54882c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20252a.m66676a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final C20256x mo54883d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20257a.m66685a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final C20223g mo54884e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20224a.m66618a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final C20217e mo54885f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20218a.m66612a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final C20245q mo54886g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20246a.m66667a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final C20260z mo54887h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20261a.m66691a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final C20236l mo54888i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20237a.m66656a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final C20229i mo54889j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20230a.m66648a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final C20220f mo54890k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20221a.m66615a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final DownloadInfo mo54879a() throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f54982a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20339a(IBinder iBinder) {
                this.f54982a = iBinder;
            }

            /* renamed from: a */
            public final int mo54877a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    this.f54982a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final C20226h mo54881b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    this.f54982a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20227a.m66632a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C20226h mo54878a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f54982a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20227a.m66632a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20338a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        }

        /* renamed from: a */
        public static C20337a m67468a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20337a)) {
                return new C20339a(iBinder);
            }
            return (C20337a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        DownloadInfo a = mo54879a();
                        parcel2.writeNoException();
                        if (a != null) {
                            parcel2.writeInt(1);
                            a.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20214d b = mo54880b();
                        parcel2.writeNoException();
                        if (b != null) {
                            iBinder = b.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int a2 = mo54877a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a2);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20226h a3 = mo54878a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a3 != null) {
                            iBinder = a3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20226h b2 = mo54881b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b2 != null) {
                            iBinder = b2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20251u c = mo54882c();
                        parcel2.writeNoException();
                        if (c != null) {
                            iBinder = c.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20256x d = mo54883d();
                        parcel2.writeNoException();
                        if (d != null) {
                            iBinder = d.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20223g e = mo54884e();
                        parcel2.writeNoException();
                        if (e != null) {
                            iBinder = e.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20217e f = mo54885f();
                        parcel2.writeNoException();
                        if (f != null) {
                            iBinder = f.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20245q g = mo54886g();
                        parcel2.writeNoException();
                        if (g != null) {
                            iBinder = g.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20260z h = mo54887h();
                        parcel2.writeNoException();
                        if (h != null) {
                            iBinder = h.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20236l i3 = mo54888i();
                        parcel2.writeNoException();
                        if (i3 != null) {
                            iBinder = i3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20229i j = mo54889j();
                        parcel2.writeNoException();
                        if (j != null) {
                            iBinder = j.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C20220f k = mo54890k();
                        parcel2.writeNoException();
                        if (k != null) {
                            iBinder = k.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                return true;
            }
        }
    }

    /* renamed from: a */
    int mo54877a(int i) throws RemoteException;

    /* renamed from: a */
    C20226h mo54878a(int i, int i2) throws RemoteException;

    /* renamed from: a */
    DownloadInfo mo54879a() throws RemoteException;

    /* renamed from: b */
    C20214d mo54880b() throws RemoteException;

    /* renamed from: b */
    C20226h mo54881b(int i) throws RemoteException;

    /* renamed from: c */
    C20251u mo54882c() throws RemoteException;

    /* renamed from: d */
    C20256x mo54883d() throws RemoteException;

    /* renamed from: e */
    C20223g mo54884e() throws RemoteException;

    /* renamed from: f */
    C20217e mo54885f() throws RemoteException;

    /* renamed from: g */
    C20245q mo54886g() throws RemoteException;

    /* renamed from: h */
    C20260z mo54887h() throws RemoteException;

    /* renamed from: i */
    C20236l mo54888i() throws RemoteException;

    /* renamed from: j */
    C20229i mo54889j() throws RemoteException;

    /* renamed from: k */
    C20220f mo54890k() throws RemoteException;
}
