package com.p280ss.ttm.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.ttm.player.ITTNotifyer */
public interface ITTNotifyer extends IInterface {

    /* renamed from: com.ss.ttm.player.ITTNotifyer$Stub */
    public static abstract class Stub extends Binder implements ITTNotifyer {

        /* renamed from: com.ss.ttm.player.ITTNotifyer$Stub$Proxy */
        static class Proxy implements ITTNotifyer {
            private IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.ss.ttm.player.ITTNotifyer";
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void handleErrorNotify(long j, int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTNotifyer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void handlePlayerNotify(long j, int i, int i2, int i3, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTNotifyer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
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

        public Stub() {
            attachInterface(this, "com.ss.ttm.player.ITTNotifyer");
        }

        public static ITTNotifyer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.ttm.player.ITTNotifyer");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITTNotifyer)) {
                return new Proxy(iBinder);
            }
            return (ITTNotifyer) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = i;
            Parcel parcel3 = parcel;
            String str = "com.ss.ttm.player.ITTNotifyer";
            if (i3 != 1598968902) {
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface(str);
                        handlePlayerNotify(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel3.enforceInterface(str);
                        handleErrorNotify(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
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

    void handleErrorNotify(long j, int i, int i2, String str) throws RemoteException;

    void handlePlayerNotify(long j, int i, int i2, int i3, String str) throws RemoteException;
}
