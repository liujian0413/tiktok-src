package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.sandbox.C21026g.C21027a;
import com.p280ss.android.ugc.asve.sandbox.C21029h.C21030a;
import com.p280ss.android.ugc.asve.sandbox.C21032i.C21033a;
import com.p280ss.android.ugc.asve.sandbox.C21035j.C21036a;
import com.p280ss.android.ugc.asve.sandbox.C21038k.C21039a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d.C20915a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20935k;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20935k.C20936a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20938l;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20938l.C20939a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20950p;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20950p.C20951a;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21069d;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21069d.C21070a;

/* renamed from: com.ss.android.ugc.asve.sandbox.l */
public interface C21041l extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.l$a */
    public static abstract class C21042a extends Binder implements C21041l {

        /* renamed from: com.ss.android.ugc.asve.sandbox.l$a$a */
        static class C21043a implements C21041l {

            /* renamed from: a */
            private IBinder f56509a;

            public final IBinder asBinder() {
                return this.f56509a;
            }

            /* renamed from: a */
            public final void mo56697a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56703b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo56710h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo56711i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo56712j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo56713k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo56714l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(16, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo56715m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(17, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final C21032i mo56705c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21033a.m70776a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final C21026g mo56706d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21027a.m70622a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final C21035j mo56707e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21036a.m70908a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final C21029h mo56708f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21030a.m70674a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final C21038k mo56709g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56509a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21039a.m70954a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C21043a(IBinder iBinder) {
                this.f56509a = iBinder;
            }

            /* renamed from: a */
            public final void mo56698a(C20914d dVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56509a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56704b(C20935k kVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (kVar != null) {
                        iBinder = kVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56509a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56699a(C20935k kVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (kVar != null) {
                        iBinder = kVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56509a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56700a(C20938l lVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (lVar != null) {
                        iBinder = lVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56509a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56701a(C20950p pVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (pVar != null) {
                        iBinder = pVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56509a.transact(19, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56702a(C21069d dVar, String str) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f56509a.transact(18, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21042a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
        }

        /* renamed from: a */
        public static C21041l m70983a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21041l)) {
                return new C21043a(iBinder);
            }
            return (C21041l) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService";
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo56700a(C20939a.m69995a(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo56699a(C20936a.m69991a(parcel.readStrongBinder()));
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        mo56704b(C20936a.m69991a(parcel.readStrongBinder()));
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        mo56698a(C20915a.m69968a(parcel.readStrongBinder()));
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        mo56697a();
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        mo56703b();
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        C21032i c = mo56705c();
                        parcel2.writeNoException();
                        if (c != null) {
                            iBinder = c.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface(str);
                        C21026g d = mo56706d();
                        parcel2.writeNoException();
                        if (d != null) {
                            iBinder = d.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface(str);
                        C21035j e = mo56707e();
                        parcel2.writeNoException();
                        if (e != null) {
                            iBinder = e.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 10:
                        parcel.enforceInterface(str);
                        C21029h f = mo56708f();
                        parcel2.writeNoException();
                        if (f != null) {
                            iBinder = f.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 11:
                        parcel.enforceInterface(str);
                        C21038k g = mo56709g();
                        parcel2.writeNoException();
                        if (g != null) {
                            iBinder = g.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 12:
                        parcel.enforceInterface(str);
                        mo56710h();
                        return true;
                    case 13:
                        parcel.enforceInterface(str);
                        mo56711i();
                        return true;
                    case 14:
                        parcel.enforceInterface(str);
                        mo56712j();
                        return true;
                    case 15:
                        parcel.enforceInterface(str);
                        mo56713k();
                        return true;
                    case 16:
                        parcel.enforceInterface(str);
                        mo56714l();
                        return true;
                    case 17:
                        parcel.enforceInterface(str);
                        mo56715m();
                        return true;
                    case 18:
                        parcel.enforceInterface(str);
                        mo56702a(C21070a.m71083a(parcel.readStrongBinder()), parcel.readString());
                        return true;
                    case 19:
                        parcel.enforceInterface(str);
                        mo56701a(C20951a.m70009a(parcel.readStrongBinder()));
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
    void mo56697a() throws RemoteException;

    /* renamed from: a */
    void mo56698a(C20914d dVar) throws RemoteException;

    /* renamed from: a */
    void mo56699a(C20935k kVar) throws RemoteException;

    /* renamed from: a */
    void mo56700a(C20938l lVar) throws RemoteException;

    /* renamed from: a */
    void mo56701a(C20950p pVar) throws RemoteException;

    /* renamed from: a */
    void mo56702a(C21069d dVar, String str) throws RemoteException;

    /* renamed from: b */
    void mo56703b() throws RemoteException;

    /* renamed from: b */
    void mo56704b(C20935k kVar) throws RemoteException;

    /* renamed from: c */
    C21032i mo56705c() throws RemoteException;

    /* renamed from: d */
    C21026g mo56706d() throws RemoteException;

    /* renamed from: e */
    C21035j mo56707e() throws RemoteException;

    /* renamed from: f */
    C21029h mo56708f() throws RemoteException;

    /* renamed from: g */
    C21038k mo56709g() throws RemoteException;

    /* renamed from: h */
    void mo56710h() throws RemoteException;

    /* renamed from: i */
    void mo56711i() throws RemoteException;

    /* renamed from: j */
    void mo56712j() throws RemoteException;

    /* renamed from: k */
    void mo56713k() throws RemoteException;

    /* renamed from: l */
    void mo56714l() throws RemoteException;

    /* renamed from: m */
    void mo56715m() throws RemoteException;
}
