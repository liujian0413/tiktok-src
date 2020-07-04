package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.q */
public interface C20953q extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.q$a */
    public static abstract class C20954a extends Binder implements C20953q {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.q$a$a */
        static class C20955a implements C20953q {

            /* renamed from: a */
            private IBinder f56356a;

            public final IBinder asBinder() {
                return this.f56356a;
            }

            C20955a(IBinder iBinder) {
                this.f56356a = iBinder;
            }

            /* renamed from: a */
            public final void mo56406a(int[] iArr, long[] jArr, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IEffectAlgorithmCallback");
                    obtain.writeIntArray(iArr);
                    obtain.writeLongArray(jArr);
                    obtain.writeFloat(f);
                    this.f56356a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20954a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IEffectAlgorithmCallback");
        }

        /* renamed from: a */
        public static C20953q m70012a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IEffectAlgorithmCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20953q)) {
                return new C20955a(iBinder);
            }
            return (C20953q) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IEffectAlgorithmCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56406a(parcel.createIntArray(), parcel.createLongArray(), parcel.readFloat());
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
    void mo56406a(int[] iArr, long[] jArr, float f) throws RemoteException;
}
