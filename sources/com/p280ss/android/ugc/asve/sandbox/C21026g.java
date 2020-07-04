package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.sandbox.C21050o.C21051a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20905aa;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20905aa.C20906a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c.C20912a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20920f;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20920f.C20921a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20941m;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20941m.C20942a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20944n;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20944n.C20945a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20956r;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20956r.C20957a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20962t;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20962t.C20963a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;

/* renamed from: com.ss.android.ugc.asve.sandbox.g */
public interface C21026g extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.g$a */
    public static abstract class C21027a extends Binder implements C21026g {

        /* renamed from: com.ss.android.ugc.asve.sandbox.g$a$a */
        static class C21028a implements C21026g {

            /* renamed from: a */
            private IBinder f56504a;

            public final IBinder asBinder() {
                return this.f56504a;
            }

            /* renamed from: a */
            public final void mo56507a(C20920f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f56504a.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo56514a(int i, int i2, float f, float[] fArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeFloat(f);
                    obtain.writeFloatArray(fArr);
                    boolean z = false;
                    this.f56504a.transact(17, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final void mo56512a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56504a.transact(19, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56509a(C20944n nVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    this.f56504a.transact(33, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56513a(float[] fArr, double d) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloatArray(fArr);
                    obtain.writeDouble(d);
                    this.f56504a.transact(35, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56510a(C20956r rVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(rVar != null ? rVar.asBinder() : null);
                    this.f56504a.transact(37, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56511a(C20962t tVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    this.f56504a.transact(39, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56508a(C20941m mVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    this.f56504a.transact(42, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56526d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo56532f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo56533g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo56534h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(20, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo56539m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(29, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final void mo56542p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(38, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56500a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int mo56515b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int mo56522c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final C21050o mo56529e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21051a.m71033a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final boolean mo56535i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56504a.transact(21, obtain, obtain2, 0);
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

            /* renamed from: j */
            public final boolean mo56536j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56504a.transact(22, obtain, obtain2, 0);
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

            /* renamed from: k */
            public final float mo56537k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final List mo56538l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final boolean mo56540n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56504a.transact(30, obtain, obtain2, 0);
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

            /* renamed from: o */
            public final boolean mo56541o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56504a.transact(31, obtain, obtain2, 0);
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

            /* renamed from: q */
            public final boolean mo56543q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56504a.transact(43, obtain, obtain2, 0);
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

            /* renamed from: r */
            public final int mo56544r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56504a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C21028a(IBinder iBinder) {
                this.f56504a = iBinder;
            }

            /* renamed from: a */
            public final void mo56501a(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloat(f);
                    this.f56504a.transact(26, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56516b(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloat(f);
                    this.f56504a.transact(27, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56523c(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloat(f);
                    this.f56504a.transact(28, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo56530e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56504a.transact(41, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56527d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56504a.transact(18, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56517b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56504a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56524c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56504a.transact(16, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56528d(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56504a.transact(40, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo56531e(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56504a.transact(45, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56503a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56504a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56525c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56504a.transact(32, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56519b(C20911c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56504a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56505a(C20905aa aaVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    if (aaVar != null) {
                        iBinder = aaVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56504a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56520b(C20944n nVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    if (nVar != null) {
                        iBinder = nVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56504a.transact(34, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56506a(C20911c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56504a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56521b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56504a.transact(23, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56518b(int i, C20911c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56504a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56504a(int i, C20911c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56504a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56502a(float f, float f2, float f3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    this.f56504a.transact(36, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21027a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
        }

        /* renamed from: a */
        public static C21026g m70622a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21026g)) {
                return new C21028a(iBinder);
            }
            return (C21026g) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder;
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService";
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo56505a(C20906a.m69956a(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        int a = mo56500a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        int b = mo56515b();
                        parcel2.writeNoException();
                        parcel2.writeInt(b);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        mo56503a(parcel.readInt());
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        int c = mo56522c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        mo56526d();
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        mo56517b(parcel.readInt());
                        return true;
                    case 8:
                        parcel.enforceInterface(str);
                        C21050o e = mo56529e();
                        parcel2.writeNoException();
                        if (e != null) {
                            iBinder = e.asBinder();
                        } else {
                            iBinder = null;
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface(str);
                        mo56504a(parcel.readInt(), C20912a.m69963a(parcel.readStrongBinder()));
                        return true;
                    case 10:
                        parcel.enforceInterface(str);
                        mo56532f();
                        return true;
                    case 11:
                        parcel.enforceInterface(str);
                        mo56506a(C20912a.m69963a(parcel.readStrongBinder()));
                        return true;
                    case 12:
                        parcel.enforceInterface(str);
                        mo56519b(C20912a.m69963a(parcel.readStrongBinder()));
                        return true;
                    case 13:
                        parcel.enforceInterface(str);
                        mo56533g();
                        return true;
                    case 14:
                        parcel.enforceInterface(str);
                        mo56507a(C20921a.m69975a(parcel.readStrongBinder()));
                        return true;
                    case 15:
                        parcel.enforceInterface(str);
                        mo56518b(parcel.readInt(), C20912a.m69963a(parcel.readStrongBinder()));
                        return true;
                    case 16:
                        parcel.enforceInterface(str);
                        mo56524c(parcel.readInt());
                        return true;
                    case 17:
                        parcel.enforceInterface(str);
                        boolean a2 = mo56514a(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.createFloatArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(a2 ? 1 : 0);
                        return true;
                    case 18:
                        parcel.enforceInterface(str);
                        mo56527d(parcel.readInt());
                        return true;
                    case 19:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo56512a(z);
                        return true;
                    case 20:
                        parcel.enforceInterface(str);
                        mo56534h();
                        return true;
                    case 21:
                        parcel.enforceInterface(str);
                        boolean i3 = mo56535i();
                        parcel2.writeNoException();
                        parcel2.writeInt(i3 ? 1 : 0);
                        return true;
                    case 22:
                        parcel.enforceInterface(str);
                        boolean j = mo56536j();
                        parcel2.writeNoException();
                        parcel2.writeInt(j ? 1 : 0);
                        return true;
                    case 23:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo56521b(z);
                        return true;
                    case 24:
                        parcel.enforceInterface(str);
                        float k = mo56537k();
                        parcel2.writeNoException();
                        parcel2.writeFloat(k);
                        return true;
                    case 25:
                        parcel.enforceInterface(str);
                        List l = mo56538l();
                        parcel2.writeNoException();
                        parcel2.writeList(l);
                        return true;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        parcel.enforceInterface(str);
                        mo56501a(parcel.readFloat());
                        return true;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        parcel.enforceInterface(str);
                        mo56516b(parcel.readFloat());
                        return true;
                    case 28:
                        parcel.enforceInterface(str);
                        mo56523c(parcel.readFloat());
                        return true;
                    case 29:
                        parcel.enforceInterface(str);
                        mo56539m();
                        return true;
                    case 30:
                        parcel.enforceInterface(str);
                        boolean n = mo56540n();
                        parcel2.writeNoException();
                        parcel2.writeInt(n ? 1 : 0);
                        return true;
                    case 31:
                        parcel.enforceInterface(str);
                        boolean o = mo56541o();
                        parcel2.writeNoException();
                        parcel2.writeInt(o ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo56525c(z);
                        return true;
                    case 33:
                        parcel.enforceInterface(str);
                        mo56509a(C20945a.m70002a(parcel.readStrongBinder()));
                        return true;
                    case BaseNotice.CHALLENGE /*34*/:
                        parcel.enforceInterface(str);
                        mo56520b(C20945a.m70002a(parcel.readStrongBinder()));
                        return true;
                    case 35:
                        parcel.enforceInterface(str);
                        mo56513a(parcel.createFloatArray(), parcel.readDouble());
                        return true;
                    case 36:
                        parcel.enforceInterface(str);
                        mo56502a(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                        return true;
                    case 37:
                        parcel.enforceInterface(str);
                        mo56510a(C20957a.m70015a(parcel.readStrongBinder()));
                        return true;
                    case 38:
                        parcel.enforceInterface(str);
                        mo56542p();
                        return true;
                    case 39:
                        parcel.enforceInterface(str);
                        mo56511a(C20963a.m70021a(parcel.readStrongBinder()));
                        return true;
                    case 40:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo56528d(z);
                        return true;
                    case BaseNotice.LIKE /*41*/:
                        parcel.enforceInterface(str);
                        mo56530e(parcel.readInt());
                        return true;
                    case 42:
                        parcel.enforceInterface(str);
                        mo56508a(C20942a.m69998a(parcel.readStrongBinder()));
                        return true;
                    case 43:
                        parcel.enforceInterface(str);
                        boolean q = mo56543q();
                        parcel2.writeNoException();
                        parcel2.writeInt(q ? 1 : 0);
                        return true;
                    case 44:
                        parcel.enforceInterface(str);
                        int r = mo56544r();
                        parcel2.writeNoException();
                        parcel2.writeInt(r);
                        return true;
                    case BaseNotice.f89516AT /*45*/:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo56531e(z);
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
    int mo56500a() throws RemoteException;

    /* renamed from: a */
    void mo56501a(float f) throws RemoteException;

    /* renamed from: a */
    void mo56502a(float f, float f2, float f3) throws RemoteException;

    /* renamed from: a */
    void mo56503a(int i) throws RemoteException;

    /* renamed from: a */
    void mo56504a(int i, C20911c cVar) throws RemoteException;

    /* renamed from: a */
    void mo56505a(C20905aa aaVar) throws RemoteException;

    /* renamed from: a */
    void mo56506a(C20911c cVar) throws RemoteException;

    /* renamed from: a */
    void mo56507a(C20920f fVar) throws RemoteException;

    /* renamed from: a */
    void mo56508a(C20941m mVar) throws RemoteException;

    /* renamed from: a */
    void mo56509a(C20944n nVar) throws RemoteException;

    /* renamed from: a */
    void mo56510a(C20956r rVar) throws RemoteException;

    /* renamed from: a */
    void mo56511a(C20962t tVar) throws RemoteException;

    /* renamed from: a */
    void mo56512a(boolean z) throws RemoteException;

    /* renamed from: a */
    void mo56513a(float[] fArr, double d) throws RemoteException;

    /* renamed from: a */
    boolean mo56514a(int i, int i2, float f, float[] fArr) throws RemoteException;

    /* renamed from: b */
    int mo56515b() throws RemoteException;

    /* renamed from: b */
    void mo56516b(float f) throws RemoteException;

    /* renamed from: b */
    void mo56517b(int i) throws RemoteException;

    /* renamed from: b */
    void mo56518b(int i, C20911c cVar) throws RemoteException;

    /* renamed from: b */
    void mo56519b(C20911c cVar) throws RemoteException;

    /* renamed from: b */
    void mo56520b(C20944n nVar) throws RemoteException;

    /* renamed from: b */
    void mo56521b(boolean z) throws RemoteException;

    /* renamed from: c */
    int mo56522c() throws RemoteException;

    /* renamed from: c */
    void mo56523c(float f) throws RemoteException;

    /* renamed from: c */
    void mo56524c(int i) throws RemoteException;

    /* renamed from: c */
    void mo56525c(boolean z) throws RemoteException;

    /* renamed from: d */
    void mo56526d() throws RemoteException;

    /* renamed from: d */
    void mo56527d(int i) throws RemoteException;

    /* renamed from: d */
    void mo56528d(boolean z) throws RemoteException;

    /* renamed from: e */
    C21050o mo56529e() throws RemoteException;

    /* renamed from: e */
    void mo56530e(int i) throws RemoteException;

    /* renamed from: e */
    void mo56531e(boolean z) throws RemoteException;

    /* renamed from: f */
    void mo56532f() throws RemoteException;

    /* renamed from: g */
    void mo56533g() throws RemoteException;

    /* renamed from: h */
    void mo56534h() throws RemoteException;

    /* renamed from: i */
    boolean mo56535i() throws RemoteException;

    /* renamed from: j */
    boolean mo56536j() throws RemoteException;

    /* renamed from: k */
    float mo56537k() throws RemoteException;

    /* renamed from: l */
    List mo56538l() throws RemoteException;

    /* renamed from: m */
    void mo56539m() throws RemoteException;

    /* renamed from: n */
    boolean mo56540n() throws RemoteException;

    /* renamed from: o */
    boolean mo56541o() throws RemoteException;

    /* renamed from: p */
    void mo56542p() throws RemoteException;

    /* renamed from: q */
    boolean mo56543q() throws RemoteException;

    /* renamed from: r */
    int mo56544r() throws RemoteException;
}
