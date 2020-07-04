package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.benchmark.C2007k.C2008a;

/* renamed from: com.benchmark.l */
public interface C2010l extends IInterface {

    /* renamed from: com.benchmark.l$a */
    public static abstract class C2011a extends Binder implements C2010l {

        /* renamed from: com.benchmark.l$a$a */
        static class C2012a implements C2010l {

            /* renamed from: a */
            private IBinder f7075a;

            public final IBinder asBinder() {
                return this.f7075a;
            }

            C2012a(IBinder iBinder) {
                this.f7075a = iBinder;
            }

            /* renamed from: a */
            public final void mo7602a(C2007k kVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IProxyManager");
                    if (kVar != null) {
                        iBinder = kVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7075a.transact(1, obtain, obtain2, 0);
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

        public C2011a() {
            attachInterface(this, "com.benchmark.IProxyManager");
        }

        /* renamed from: a */
        public static C2010l m9069a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IProxyManager");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C2010l)) {
                return new C2012a(iBinder);
            }
            return (C2010l) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.benchmark.IProxyManager";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo7602a(C2008a.m9066a(parcel.readStrongBinder()));
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
    void mo7602a(C2007k kVar) throws RemoteException;
}
