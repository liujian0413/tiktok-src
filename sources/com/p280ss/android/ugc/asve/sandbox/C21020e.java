package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import java.util.List;

/* renamed from: com.ss.android.ugc.asve.sandbox.e */
public interface C21020e extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.e$a */
    public static abstract class C21021a extends Binder implements C21020e {

        /* renamed from: com.ss.android.ugc.asve.sandbox.e$a$a */
        static class C21022a implements C21020e {

            /* renamed from: a */
            private IBinder f56502a;

            public final IBinder asBinder() {
                return this.f56502a;
            }

            /* renamed from: a */
            public final C21020e mo56375a(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56502a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21021a.m70565a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56376b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    this.f56502a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C21020e mo56369a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    this.f56502a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21021a.m70565a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C21022a(IBinder iBinder) {
                this.f56502a = iBinder;
            }

            /* renamed from: a */
            public final C21020e mo56370a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeInt(i);
                    this.f56502a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21021a.m70565a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C21020e mo56371a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeString(str);
                    this.f56502a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21021a.m70565a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C21020e mo56374a(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeStringList(list);
                    this.f56502a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21021a.m70565a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C21020e mo56372a(String str, String str2, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeFloat(f);
                    this.f56502a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21021a.m70565a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C21020e mo56373a(String str, String str2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f56502a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21021a.m70565a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21021a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
        }

        /* renamed from: a */
        public static C21020e m70565a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21020e)) {
                return new C21022a(iBinder);
            }
            return (C21020e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation";
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        C21020e a = mo56371a(parcel.readString());
                        parcel2.writeNoException();
                        if (a != null) {
                            iBinder = a.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        C21020e a2 = mo56370a(parcel.readInt());
                        parcel2.writeNoException();
                        if (a2 != null) {
                            iBinder = a2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        C21020e a3 = mo56372a(parcel.readString(), parcel.readString(), parcel.readFloat());
                        parcel2.writeNoException();
                        if (a3 != null) {
                            iBinder = a3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        C21020e a4 = mo56373a(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a4 != null) {
                            iBinder = a4.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        C21020e a5 = mo56375a(parcel.createTypedArrayList(ComposerInfo.CREATOR), parcel.readInt());
                        parcel2.writeNoException();
                        if (a5 != null) {
                            iBinder = a5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        C21020e a6 = mo56374a((List<String>) parcel.createStringArrayList());
                        parcel2.writeNoException();
                        if (a6 != null) {
                            iBinder = a6.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        C21020e a7 = mo56369a();
                        parcel2.writeNoException();
                        if (a7 != null) {
                            iBinder = a7.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface(str);
                        mo56376b();
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
    C21020e mo56369a() throws RemoteException;

    /* renamed from: a */
    C21020e mo56370a(int i) throws RemoteException;

    /* renamed from: a */
    C21020e mo56371a(String str) throws RemoteException;

    /* renamed from: a */
    C21020e mo56372a(String str, String str2, float f) throws RemoteException;

    /* renamed from: a */
    C21020e mo56373a(String str, String str2, int i) throws RemoteException;

    /* renamed from: a */
    C21020e mo56374a(List<String> list) throws RemoteException;

    /* renamed from: a */
    C21020e mo56375a(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: b */
    void mo56376b() throws RemoteException;
}
