package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo.C20791a;

/* renamed from: com.ss.android.ugc.asve.sandbox.k */
public interface C21038k extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.k$a */
    public static abstract class C21039a extends Binder implements C21038k {

        /* renamed from: com.ss.android.ugc.asve.sandbox.k$a$a */
        static class C21040a implements C21038k {

            /* renamed from: a */
            private IBinder f56508a;

            public final IBinder asBinder() {
                return this.f56508a;
            }

            /* renamed from: d */
            public final void mo56694d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    this.f56508a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo56696f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    this.f56508a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final float mo56688a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    this.f56508a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int[] mo56693c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    this.f56508a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final ReactionWindowInfo mo56695e() throws RemoteException {
                ReactionWindowInfo reactionWindowInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    this.f56508a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        reactionWindowInfo = C20791a.m69414a(obtain2);
                    } else {
                        reactionWindowInfo = null;
                    }
                    return reactionWindowInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int[] mo56692b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    this.f56508a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C21040a(IBinder iBinder) {
                this.f56508a = iBinder;
            }

            /* renamed from: a */
            public final void mo56689a(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    obtain.writeFloat(f);
                    this.f56508a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo56691b(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    boolean z = false;
                    this.f56508a.transact(6, obtain, obtain2, 0);
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
            public final void mo56690a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56508a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21039a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
        }

        /* renamed from: a */
        public static C21038k m70954a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21038k)) {
                return new C21040a(iBinder);
            }
            return (C21038k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        float a = mo56688a();
                        parcel2.writeNoException();
                        parcel2.writeFloat(a);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        int[] b = mo56692b();
                        parcel2.writeNoException();
                        parcel2.writeIntArray(b);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        int[] c = mo56693c();
                        parcel2.writeNoException();
                        parcel2.writeIntArray(c);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        mo56694d();
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        mo56690a(parcel.readInt(), parcel.readInt());
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        boolean b2 = mo56691b(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(b2 ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        ReactionWindowInfo e = mo56695e();
                        parcel2.writeNoException();
                        if (e != null) {
                            parcel2.writeInt(1);
                            e.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface(str);
                        mo56696f();
                        return true;
                    case 9:
                        parcel.enforceInterface(str);
                        mo56689a(parcel.readFloat());
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
    float mo56688a() throws RemoteException;

    /* renamed from: a */
    void mo56689a(float f) throws RemoteException;

    /* renamed from: a */
    void mo56690a(int i, int i2) throws RemoteException;

    /* renamed from: b */
    boolean mo56691b(int i, int i2) throws RemoteException;

    /* renamed from: b */
    int[] mo56692b() throws RemoteException;

    /* renamed from: c */
    int[] mo56693c() throws RemoteException;

    /* renamed from: d */
    void mo56694d() throws RemoteException;

    /* renamed from: e */
    ReactionWindowInfo mo56695e() throws RemoteException;

    /* renamed from: f */
    void mo56696f() throws RemoteException;
}
