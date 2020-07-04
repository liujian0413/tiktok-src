package android.support.p022v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.INotificationSideChannel */
public interface INotificationSideChannel extends IInterface {

    /* renamed from: android.support.v4.app.INotificationSideChannel$Stub */
    public static abstract class Stub extends Binder implements INotificationSideChannel {

        /* renamed from: android.support.v4.app.INotificationSideChannel$Stub$a */
        static class C0559a implements INotificationSideChannel {

            /* renamed from: a */
            private IBinder f2194a;

            public final IBinder asBinder() {
                return this.f2194a;
            }

            C0559a(IBinder iBinder) {
                this.f2194a = iBinder;
            }

            /* renamed from: a */
            public final void mo2450a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f2194a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo2451a(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f2194a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo2452a(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2194a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        /* renamed from: a */
        public static INotificationSideChannel m2307a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                return new C0559a(iBinder);
            }
            return (INotificationSideChannel) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Notification notification;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                        String readString = parcel.readString();
                        int readInt = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                        } else {
                            notification = null;
                        }
                        mo2452a(readString, readInt, readString2, notification);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                        mo2451a(parcel.readString(), parcel.readInt(), parcel.readString());
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                        mo2450a(parcel.readString());
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo2450a(String str) throws RemoteException;

    /* renamed from: a */
    void mo2451a(String str, int i, String str2) throws RemoteException;

    /* renamed from: a */
    void mo2452a(String str, int i, String str2, Notification notification) throws RemoteException;
}
