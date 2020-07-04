package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.e */
public interface C21072e extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.e$a */
    public static abstract class C21073a extends Binder implements C21072e {

        /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.e$a$a */
        static class C21074a implements C21072e {

            /* renamed from: a */
            private IBinder f56584a;

            public final IBinder asBinder() {
                return this.f56584a;
            }

            C21074a(IBinder iBinder) {
                this.f56584a = iBinder;
            }

            /* renamed from: a */
            public final void mo56357a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56584a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56359a(String str, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f56584a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56358a(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f56584a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21073a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
        }

        /* renamed from: a */
        public static C21072e m71092a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21072e)) {
                return new C21074a(iBinder);
            }
            return (C21072e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo56357a(parcel.readString(), parcel.readString());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo56358a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        mo56359a(parcel.readString(), (Map) parcel.readHashMap(getClass().getClassLoader()));
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo56357a(String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo56358a(String str, String str2, String str3, String str4) throws RemoteException;

    /* renamed from: a */
    void mo56359a(String str, Map map) throws RemoteException;
}
