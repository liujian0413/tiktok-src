package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.f */
public interface C20920f extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.f$a */
    public static abstract class C20921a extends Binder implements C20920f {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.f$a$a */
        static class C20922a implements C20920f {

            /* renamed from: a */
            private IBinder f56345a;

            public final IBinder asBinder() {
                return this.f56345a;
            }

            C20922a(IBinder iBinder) {
                this.f56345a = iBinder;
            }

            /* renamed from: a */
            public final void mo56387a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxCamerPreviewSizeListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56345a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20921a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxCamerPreviewSizeListener");
        }

        /* renamed from: a */
        public static C20920f m69975a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxCamerPreviewSizeListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20920f)) {
                return new C20922a(iBinder);
            }
            return (C20920f) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxCamerPreviewSizeListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56387a(parcel.readInt(), parcel.readInt());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo56387a(int i, int i2) throws RemoteException;
}
