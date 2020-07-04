package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.n */
public interface C20944n extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.n$a */
    public static abstract class C20945a extends Binder implements C20944n {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.n$a$a */
        static class C20946a implements C20944n {

            /* renamed from: a */
            private IBinder f56353a;

            public final IBinder asBinder() {
                return this.f56353a;
            }

            C20946a(IBinder iBinder) {
                this.f56353a = iBinder;
            }

            /* renamed from: a */
            public final void mo56367a(int i, float f, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener");
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56353a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56368a(int i, boolean z, boolean z2, float f, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeIntArray(iArr);
                    this.f56353a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20945a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener");
        }

        /* renamed from: a */
        public static C20944n m70002a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20944n)) {
                return new C20946a(iBinder);
            }
            return (C20944n) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            String str = "com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener";
            if (i != 1598968902) {
                boolean z3 = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mo56368a(readInt, z, z2, parcel.readFloat(), parcel.createIntArray());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        int readInt2 = parcel.readInt();
                        float readFloat = parcel.readFloat();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        mo56367a(readInt2, readFloat, z3);
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
    void mo56367a(int i, float f, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo56368a(int i, boolean z, boolean z2, float f, int[] iArr) throws RemoteException;
}
