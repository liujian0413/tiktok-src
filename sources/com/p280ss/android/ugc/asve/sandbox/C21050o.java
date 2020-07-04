package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c.C20912a;

/* renamed from: com.ss.android.ugc.asve.sandbox.o */
public interface C21050o extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.o$a */
    public static abstract class C21051a extends Binder implements C21050o {

        /* renamed from: com.ss.android.ugc.asve.sandbox.o$a$a */
        static class C21052a implements C21050o {

            /* renamed from: a */
            private IBinder f56512a;

            public final IBinder asBinder() {
                return this.f56512a;
            }

            /* renamed from: c */
            public final boolean mo56729c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    boolean z = false;
                    this.f56512a.transact(4, obtain, obtain2, 0);
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

            /* renamed from: d */
            public final int mo56731d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    this.f56512a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final int mo56732e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    this.f56512a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final boolean mo56733f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    boolean z = false;
                    this.f56512a.transact(12, obtain, obtain2, 0);
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

            /* renamed from: g */
            public final boolean mo56734g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    boolean z = false;
                    this.f56512a.transact(14, obtain, obtain2, 0);
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

            /* renamed from: b */
            public final int mo56727b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    this.f56512a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo56724a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    boolean z = false;
                    this.f56512a.transact(2, obtain, obtain2, 0);
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

            C21052a(IBinder iBinder) {
                this.f56512a = iBinder;
            }

            /* renamed from: b */
            public final void mo56728b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56512a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56722a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeInt(i);
                    this.f56512a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final boolean mo56730c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56512a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56723a(C20911c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56512a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo56725a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56512a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final float mo56721a(float f, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    this.f56512a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final float mo56726b(float f, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    this.f56512a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21051a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
        }

        /* renamed from: a */
        public static C21050o m71033a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21050o)) {
                return new C21052a(iBinder);
            }
            return (C21050o) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.IWideCameraComponent";
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean a = mo56725a(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        boolean a2 = mo56724a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a2 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        int b = mo56727b();
                        parcel2.writeNoException();
                        parcel2.writeInt(b);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        boolean c = mo56729c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo56728b(z);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        mo56722a(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        float a3 = mo56721a(parcel.readFloat(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeFloat(a3);
                        return true;
                    case 8:
                        parcel.enforceInterface(str);
                        float b2 = mo56726b(parcel.readFloat(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeFloat(b2);
                        return true;
                    case 9:
                        parcel.enforceInterface(str);
                        mo56723a(C20912a.m69963a(parcel.readStrongBinder()));
                        return true;
                    case 10:
                        parcel.enforceInterface(str);
                        int d = mo56731d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d);
                        return true;
                    case 11:
                        parcel.enforceInterface(str);
                        int e = mo56732e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e);
                        return true;
                    case 12:
                        parcel.enforceInterface(str);
                        boolean f = mo56733f();
                        parcel2.writeNoException();
                        parcel2.writeInt(f ? 1 : 0);
                        return true;
                    case 13:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean c2 = mo56730c(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(c2 ? 1 : 0);
                        return true;
                    case 14:
                        parcel.enforceInterface(str);
                        boolean g = mo56734g();
                        parcel2.writeNoException();
                        parcel2.writeInt(g ? 1 : 0);
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
    float mo56721a(float f, int i) throws RemoteException;

    /* renamed from: a */
    void mo56722a(int i) throws RemoteException;

    /* renamed from: a */
    void mo56723a(C20911c cVar) throws RemoteException;

    /* renamed from: a */
    boolean mo56724a() throws RemoteException;

    /* renamed from: a */
    boolean mo56725a(boolean z) throws RemoteException;

    /* renamed from: b */
    float mo56726b(float f, int i) throws RemoteException;

    /* renamed from: b */
    int mo56727b() throws RemoteException;

    /* renamed from: b */
    void mo56728b(boolean z) throws RemoteException;

    /* renamed from: c */
    boolean mo56729c() throws RemoteException;

    /* renamed from: c */
    boolean mo56730c(boolean z) throws RemoteException;

    /* renamed from: d */
    int mo56731d() throws RemoteException;

    /* renamed from: e */
    int mo56732e() throws RemoteException;

    /* renamed from: f */
    boolean mo56733f() throws RemoteException;

    /* renamed from: g */
    boolean mo56734g() throws RemoteException;
}
