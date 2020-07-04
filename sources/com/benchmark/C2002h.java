package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.benchmark.C1999g.C2000a;
import java.util.List;

/* renamed from: com.benchmark.h */
public interface C2002h extends IInterface {

    /* renamed from: com.benchmark.h$a */
    public static abstract class C2003a extends Binder implements C2002h {

        /* renamed from: com.benchmark.h$a$a */
        static class C2004a implements C2002h {

            /* renamed from: a */
            private IBinder f7073a;

            public final IBinder asBinder() {
                return this.f7073a;
            }

            C2004a(IBinder iBinder) {
                this.f7073a = iBinder;
            }

            /* renamed from: a */
            public final void mo7603a(List list, C1999g gVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMManager");
                    obtain.writeList(list);
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7073a.transact(1, obtain, obtain2, 0);
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

        public C2003a() {
            attachInterface(this, "com.benchmark.IBMManager");
        }

        /* renamed from: a */
        public static C2002h m9057a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IBMManager");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C2002h)) {
                return new C2004a(iBinder);
            }
            return (C2002h) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.benchmark.IBMManager";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo7603a(parcel.readArrayList(getClass().getClassLoader()), C2000a.m9052a(parcel.readStrongBinder()));
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
    void mo7603a(List list, C1999g gVar) throws RemoteException;
}
