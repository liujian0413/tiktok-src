package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.v */
public interface C20968v extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.v$a */
    public static abstract class C20969a extends Binder implements C20968v {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.v$a$a */
        static class C20970a implements C20968v {

            /* renamed from: a */
            private IBinder f56361a;

            public final IBinder asBinder() {
                return this.f56361a;
            }

            C20970a(IBinder iBinder) {
                this.f56361a = iBinder;
            }

            /* renamed from: a */
            public final void mo56391a(int i, int i2, int i3, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IMessageListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    this.f56361a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20969a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IMessageListener");
        }

        /* renamed from: a */
        public static C20968v m70027a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IMessageListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20968v)) {
                return new C20970a(iBinder);
            }
            return (C20968v) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IMessageListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56391a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
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
    void mo56391a(int i, int i2, int i3, String str) throws RemoteException;
}
