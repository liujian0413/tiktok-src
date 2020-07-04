package com.ttnet.org.chromium.base.process_launcher;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IParentProcess extends IInterface {

    public static abstract class Stub extends Binder implements IParentProcess {

        static class Proxy implements IParentProcess {
            private IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.ttnet.org.chromium.base.process_launcher.IParentProcess";
            }

            public void reportCleanExit() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ttnet.org.chromium.base.process_launcher.IParentProcess");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void sendPid(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ttnet.org.chromium.base.process_launcher.IParentProcess");
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.ttnet.org.chromium.base.process_launcher.IParentProcess");
        }

        public static IParentProcess asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ttnet.org.chromium.base.process_launcher.IParentProcess");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IParentProcess)) {
                return new Proxy(iBinder);
            }
            return (IParentProcess) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ttnet.org.chromium.base.process_launcher.IParentProcess");
                        sendPid(parcel.readInt());
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ttnet.org.chromium.base.process_launcher.IParentProcess");
                        reportCleanExit();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ttnet.org.chromium.base.process_launcher.IParentProcess");
                return true;
            }
        }
    }

    void reportCleanExit() throws RemoteException;

    void sendPid(int i) throws RemoteException;
}
