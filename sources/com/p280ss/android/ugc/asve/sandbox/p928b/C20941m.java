package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.m */
public interface C20941m extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.m$a */
    public static abstract class C20942a extends Binder implements C20941m {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.m$a$a */
        static class C20943a implements C20941m {

            /* renamed from: a */
            private IBinder f56352a;

            public final IBinder asBinder() {
                return this.f56352a;
            }

            /* renamed from: a */
            public final void mo56384a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ICameraPreviewListener");
                    this.f56352a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20943a(IBinder iBinder) {
                this.f56352a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20942a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.ICameraPreviewListener");
        }

        /* renamed from: a */
        public static C20941m m69998a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.ICameraPreviewListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20941m)) {
                return new C20943a(iBinder);
            }
            return (C20941m) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.ICameraPreviewListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56384a();
                parcel2.writeNoException();
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
    void mo56384a() throws RemoteException;
}
