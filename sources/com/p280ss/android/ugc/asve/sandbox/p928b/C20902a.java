package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.a */
public interface C20902a extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.a$a */
    public static abstract class C20903a extends Binder implements C20902a {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.a$a$a */
        static class C20904a implements C20902a {

            /* renamed from: a */
            private IBinder f56339a;

            public final IBinder asBinder() {
                return this.f56339a;
            }

            C20904a(IBinder iBinder) {
                this.f56339a = iBinder;
            }

            /* renamed from: a */
            public final void mo56394a(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IARTextContentCallback");
                    obtain.writeStringArray(strArr);
                    this.f56339a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20903a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IARTextContentCallback");
        }

        /* renamed from: a */
        public static C20902a m69953a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IARTextContentCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20902a)) {
                return new C20904a(iBinder);
            }
            return (C20902a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IARTextContentCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56394a(parcel.createStringArray());
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
    void mo56394a(String[] strArr) throws RemoteException;
}
