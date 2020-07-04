package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.j */
public interface C20932j extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.j$a */
    public static abstract class C20933a extends Binder implements C20932j {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.j$a$a */
        static class C20934a implements C20932j {

            /* renamed from: a */
            private IBinder f56349a;

            public final IBinder asBinder() {
                return this.f56349a;
            }

            C20934a(IBinder iBinder) {
                this.f56349a = iBinder;
            }

            /* renamed from: a */
            public final void mo56402a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxStartRecorderCallback");
                    obtain.writeInt(i);
                    this.f56349a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20933a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxStartRecorderCallback");
        }

        /* renamed from: a */
        public static C20932j m69987a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxStartRecorderCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20932j)) {
                return new C20934a(iBinder);
            }
            return (C20932j) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxStartRecorderCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56402a(parcel.readInt());
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
    void mo56402a(int i) throws RemoteException;
}
