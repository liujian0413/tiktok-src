package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.s */
public interface C20959s extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.s$a */
    public static abstract class C20960a extends Binder implements C20959s {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.s$a$a */
        static class C20961a implements C20959s {

            /* renamed from: a */
            private IBinder f56358a;

            public final IBinder asBinder() {
                return this.f56358a;
            }

            C20961a(IBinder iBinder) {
                this.f56358a = iBinder;
            }

            /* renamed from: a */
            public final void mo56389a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IFaceInfoListener");
                    obtain.writeTypedArray(aSSimpleFaceInfoArr, 0);
                    this.f56358a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20960a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IFaceInfoListener");
        }

        /* renamed from: a */
        public static C20959s m70018a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IFaceInfoListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20959s)) {
                return new C20961a(iBinder);
            }
            return (C20959s) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IFaceInfoListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo56389a((ASSimpleFaceInfo[]) parcel.createTypedArray(ASSimpleFaceInfo.CREATOR));
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
    void mo56389a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) throws RemoteException;
}
