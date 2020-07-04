package com.ttnet.org.chromium.base.process_launcher;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface IChildProcessService extends IInterface {

    public static abstract class Stub extends Binder implements IChildProcessService {

        static class Proxy implements IChildProcessService {
            private IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.ttnet.org.chromium.base.process_launcher.IChildProcessService";
            }

            public void dumpProcessStack() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void forceKill() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public boolean bindToCaller() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                    boolean z = false;
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void onMemoryPressure(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                    obtain.writeInt(i);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void setupConnection(Bundle bundle, IParentProcess iParentProcess, List<IBinder> list) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iParentProcess != null) {
                        iBinder = iParentProcess.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeBinderList(list);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
        }

        public static IChildProcessService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IChildProcessService)) {
                return new Proxy(iBinder);
            }
            return (IChildProcessService) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                        boolean bindToCaller = bindToCaller();
                        parcel2.writeNoException();
                        parcel2.writeInt(bindToCaller ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        setupConnection(bundle, com.ttnet.org.chromium.base.process_launcher.IParentProcess.Stub.asInterface(parcel.readStrongBinder()), parcel.createBinderArrayList());
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                        forceKill();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                        onMemoryPressure(parcel.readInt());
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                        dumpProcessStack();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ttnet.org.chromium.base.process_launcher.IChildProcessService");
                return true;
            }
        }
    }

    boolean bindToCaller() throws RemoteException;

    void dumpProcessStack() throws RemoteException;

    void forceKill() throws RemoteException;

    void onMemoryPressure(int i) throws RemoteException;

    void setupConnection(Bundle bundle, IParentProcess iParentProcess, List<IBinder> list) throws RemoteException;
}
