package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.benchmark.k */
public interface C2007k extends IInterface {

    /* renamed from: com.benchmark.k$a */
    public static abstract class C2008a extends Binder implements C2007k {

        /* renamed from: com.benchmark.k$a$a */
        static class C2009a implements C2007k {

            /* renamed from: a */
            private IBinder f7074a;

            public final IBinder asBinder() {
                return this.f7074a;
            }

            C2009a(IBinder iBinder) {
                this.f7074a = iBinder;
            }

            /* renamed from: a */
            public final void mo7625a(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IProxyCallback");
                    obtain.writeMap(map);
                    this.f7074a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: a */
        public static C2007k m9066a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IProxyCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C2007k)) {
                return new C2009a(iBinder);
            }
            return (C2007k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.benchmark.IProxyCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo7625a(parcel.readHashMap(getClass().getClassLoader()));
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
    void mo7625a(Map map) throws RemoteException;
}
