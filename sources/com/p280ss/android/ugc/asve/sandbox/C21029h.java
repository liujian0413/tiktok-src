package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20908b;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20908b.C20909a;

/* renamed from: com.ss.android.ugc.asve.sandbox.h */
public interface C21029h extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.h$a */
    public static abstract class C21030a extends Binder implements C21029h {

        /* renamed from: com.ss.android.ugc.asve.sandbox.h$a$a */
        static class C21031a implements C21029h {

            /* renamed from: a */
            private IBinder f56505a;

            public final IBinder asBinder() {
                return this.f56505a;
            }

            /* renamed from: a */
            public final boolean mo56552a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    boolean z = false;
                    this.f56505a.transact(5, obtain, obtain2, 0);
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

            C21031a(IBinder iBinder) {
                this.f56505a = iBinder;
            }

            /* renamed from: a */
            public final void mo56551a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56505a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56553b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56505a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56554c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56505a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56549a(C20908b bVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    if (bVar != null) {
                        iBinder = bVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56505a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56550a(String str, String str2, float f, float f2, float f3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56505a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21030a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
        }

        /* renamed from: a */
        public static C21029h m70674a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21029h)) {
                return new C21031a(iBinder);
            }
            return (C21029h) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService";
            if (i != 1598968902) {
                boolean z2 = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        float readFloat = parcel.readFloat();
                        float readFloat2 = parcel.readFloat();
                        float readFloat3 = parcel.readFloat();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mo56550a(readString, readString2, readFloat, readFloat2, readFloat3, z);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo56549a(C20909a.m69959a(parcel.readStrongBinder()));
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        mo56551a(z2);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        mo56553b(z2);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        boolean a = mo56552a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        mo56554c(z2);
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
    void mo56549a(C20908b bVar) throws RemoteException;

    /* renamed from: a */
    void mo56550a(String str, String str2, float f, float f2, float f3, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo56551a(boolean z) throws RemoteException;

    /* renamed from: a */
    boolean mo56552a() throws RemoteException;

    /* renamed from: b */
    void mo56553b(boolean z) throws RemoteException;

    /* renamed from: c */
    void mo56554c(boolean z) throws RemoteException;
}
