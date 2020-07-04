package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.b */
public interface C21063b extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.b$a */
    public static abstract class C21064a extends Binder implements C21063b {

        /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.b$a$a */
        static class C21065a implements C21063b {

            /* renamed from: a */
            private IBinder f56581a;

            public final IBinder asBinder() {
                return this.f56581a;
            }

            C21065a(IBinder iBinder) {
                this.f56581a = iBinder;
            }

            /* renamed from: a */
            public final void mo56360a(String str, String str2, String str3, String str4, String str5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxApplogPresenter");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    this.f56581a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21064a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxApplogPresenter");
        }

        /* renamed from: a */
        public static C21063b m71067a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxApplogPresenter");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21063b)) {
                return new C21065a(iBinder);
            }
            return (C21063b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxApplogPresenter";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56360a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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
    void mo56360a(String str, String str2, String str3, String str4, String str5) throws RemoteException;
}
