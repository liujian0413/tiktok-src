package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.t */
public interface C20962t extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.t$a */
    public static abstract class C20963a extends Binder implements C20962t {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.t$a$a */
        static class C20964a implements C20962t {

            /* renamed from: a */
            private IBinder f56359a;

            public final IBinder asBinder() {
                return this.f56359a;
            }

            /* renamed from: a */
            public final void mo56398a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IFrameRefreshListener");
                    this.f56359a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            C20964a(IBinder iBinder) {
                this.f56359a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20963a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IFrameRefreshListener");
        }

        /* renamed from: a */
        public static C20962t m70021a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IFrameRefreshListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20962t)) {
                return new C20964a(iBinder);
            }
            return (C20962t) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IFrameRefreshListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56398a();
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
    void mo56398a() throws RemoteException;
}
