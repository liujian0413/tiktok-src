package com.p280ss.android.ugc.asve.sandbox.p928b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult.C20660a;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.g */
public interface C20923g extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.g$a */
    public static abstract class C20924a extends Binder implements C20923g {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.g$a$a */
        static class C20925a implements C20923g {

            /* renamed from: a */
            private IBinder f56346a;

            public final IBinder asBinder() {
                return this.f56346a;
            }

            C20925a(IBinder iBinder) {
                this.f56346a = iBinder;
            }

            /* renamed from: a */
            public final void mo56400a(RecorderConcatResult recorderConcatResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxConcactCallback");
                    if (recorderConcatResult != null) {
                        obtain.writeInt(1);
                        recorderConcatResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56346a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20924a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxConcactCallback");
        }

        /* renamed from: a */
        public static C20923g m69978a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxConcactCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20923g)) {
                return new C20925a(iBinder);
            }
            return (C20923g) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            RecorderConcatResult recorderConcatResult;
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxConcactCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                if (parcel.readInt() != 0) {
                    recorderConcatResult = C20660a.m68464a(parcel);
                } else {
                    recorderConcatResult = null;
                }
                mo56400a(recorderConcatResult);
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
    void mo56400a(RecorderConcatResult recorderConcatResult) throws RemoteException;
}
