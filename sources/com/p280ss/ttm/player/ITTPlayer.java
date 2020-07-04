package com.p280ss.ttm.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.ttm.player.ITTPlayer */
public interface ITTPlayer extends IInterface {

    /* renamed from: com.ss.ttm.player.ITTPlayer$Stub */
    public static abstract class Stub extends Binder implements ITTPlayer {

        /* renamed from: com.ss.ttm.player.ITTPlayer$Stub$Proxy */
        static class Proxy implements ITTPlayer {
            private IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.ss.ttm.player.ITTPlayer";
            }

            public void takeScreenshot() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unregisterNotifyer() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    this.mRemote.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public int close(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long create(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int pause(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int prepare(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int prevClose(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerNotifyer(ITTNotifyer iTTNotifyer) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    if (iTTNotifyer != null) {
                        iBinder = iTTNotifyer.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void release(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int reset(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int start(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int stop(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getStringOption(long j, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void seekTo(long j, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setDataSource(long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setLooping(long j, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setNotifyState(long j, long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.mRemote.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int setSurface(long j, Surface surface) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public double getDoubleOption(long j, int i, double d) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeDouble(d);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readDouble();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float getFloatOption(long j, int i, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getIntOption(long j, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long getLongOption(long j, int i, long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeLong(j2);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void rotateCamera(long j, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.mRemote.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setCacheFile(long j, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int setDoubleOption(long j, int i, double d) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeDouble(d);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int setFloatOption(long j, int i, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int setIntOption(long j, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int setLongOption(long j, int i, long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeLong(j2);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int setStringOption(long j, int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setVolume(long j, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void switchStream(long j, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mouseEvent(long j, int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(25, obtain, obtain2, 0);
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
            attachInterface(this, "com.ss.ttm.player.ITTPlayer");
        }

        public static ITTPlayer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.ttm.player.ITTPlayer");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITTPlayer)) {
                return new Proxy(iBinder);
            }
            return (ITTPlayer) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Surface surface;
            String str = "com.ss.ttm.player.ITTPlayer";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        long create = create(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeLong(create);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        int start = start(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(start);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        int stop = stop(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(stop);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        release(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        int prepare = prepare(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(prepare);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        int pause = pause(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(pause);
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        int prevClose = prevClose(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(prevClose);
                        return true;
                    case 8:
                        parcel.enforceInterface(str);
                        int close = close(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(close);
                        return true;
                    case 9:
                        parcel.enforceInterface(str);
                        int reset = reset(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(reset);
                        return true;
                    case 10:
                        parcel.enforceInterface(str);
                        int intOption = getIntOption(parcel.readLong(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(intOption);
                        return true;
                    case 11:
                        parcel.enforceInterface(str);
                        int intOption2 = setIntOption(parcel.readLong(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(intOption2);
                        return true;
                    case 12:
                        parcel.enforceInterface(str);
                        float floatOption = getFloatOption(parcel.readLong(), parcel.readInt(), parcel.readFloat());
                        parcel2.writeNoException();
                        parcel2.writeFloat(floatOption);
                        return true;
                    case 13:
                        parcel.enforceInterface(str);
                        int floatOption2 = setFloatOption(parcel.readLong(), parcel.readInt(), parcel.readFloat());
                        parcel2.writeNoException();
                        parcel2.writeInt(floatOption2);
                        return true;
                    case 14:
                        parcel.enforceInterface(str);
                        double doubleOption = getDoubleOption(parcel.readLong(), parcel.readInt(), parcel.readDouble());
                        parcel2.writeNoException();
                        parcel2.writeDouble(doubleOption);
                        return true;
                    case 15:
                        parcel.enforceInterface(str);
                        int doubleOption2 = setDoubleOption(parcel.readLong(), parcel.readInt(), parcel.readDouble());
                        parcel2.writeNoException();
                        parcel2.writeInt(doubleOption2);
                        return true;
                    case 16:
                        parcel.enforceInterface(str);
                        long longOption = getLongOption(parcel.readLong(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeLong(longOption);
                        return true;
                    case 17:
                        parcel.enforceInterface(str);
                        int longOption2 = setLongOption(parcel.readLong(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(longOption2);
                        return true;
                    case 18:
                        parcel.enforceInterface(str);
                        int stringOption = setStringOption(parcel.readLong(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(stringOption);
                        return true;
                    case 19:
                        parcel.enforceInterface(str);
                        String stringOption2 = getStringOption(parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringOption2);
                        return true;
                    case 20:
                        parcel.enforceInterface(str);
                        long readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel);
                        } else {
                            surface = null;
                        }
                        int surface2 = setSurface(readLong, surface);
                        parcel2.writeNoException();
                        parcel2.writeInt(surface2);
                        return true;
                    case 21:
                        parcel.enforceInterface(str);
                        setDataSource(parcel.readLong(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface(str);
                        setCacheFile(parcel.readLong(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface(str);
                        setLooping(parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface(str);
                        setVolume(parcel.readLong(), parcel.readFloat(), parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface(str);
                        mouseEvent(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        parcel.enforceInterface(str);
                        seekTo(parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        parcel.enforceInterface(str);
                        registerNotifyer(com.p280ss.ttm.player.ITTNotifyer.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        parcel.enforceInterface(str);
                        unregisterNotifyer();
                        parcel2.writeNoException();
                        return true;
                    case 29:
                        parcel.enforceInterface(str);
                        setNotifyState(parcel.readLong(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 30:
                        parcel.enforceInterface(str);
                        rotateCamera(parcel.readLong(), parcel.readFloat(), parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 31:
                        parcel.enforceInterface(str);
                        takeScreenshot();
                        parcel2.writeNoException();
                        return true;
                    case 32:
                        parcel.enforceInterface(str);
                        switchStream(parcel.readLong(), parcel.readInt(), parcel.readInt());
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

    int close(long j) throws RemoteException;

    long create(long j) throws RemoteException;

    double getDoubleOption(long j, int i, double d) throws RemoteException;

    float getFloatOption(long j, int i, float f) throws RemoteException;

    int getIntOption(long j, int i, int i2) throws RemoteException;

    long getLongOption(long j, int i, long j2) throws RemoteException;

    String getStringOption(long j, int i) throws RemoteException;

    void mouseEvent(long j, int i, int i2, int i3) throws RemoteException;

    int pause(long j) throws RemoteException;

    int prepare(long j) throws RemoteException;

    int prevClose(long j) throws RemoteException;

    void registerNotifyer(ITTNotifyer iTTNotifyer) throws RemoteException;

    void release(long j) throws RemoteException;

    int reset(long j) throws RemoteException;

    void rotateCamera(long j, float f, float f2) throws RemoteException;

    void seekTo(long j, int i) throws RemoteException;

    void setCacheFile(long j, String str, int i) throws RemoteException;

    void setDataSource(long j, String str) throws RemoteException;

    int setDoubleOption(long j, int i, double d) throws RemoteException;

    int setFloatOption(long j, int i, float f) throws RemoteException;

    int setIntOption(long j, int i, int i2) throws RemoteException;

    int setLongOption(long j, int i, long j2) throws RemoteException;

    void setLooping(long j, int i) throws RemoteException;

    void setNotifyState(long j, long j2) throws RemoteException;

    int setStringOption(long j, int i, String str) throws RemoteException;

    int setSurface(long j, Surface surface) throws RemoteException;

    void setVolume(long j, float f, float f2) throws RemoteException;

    int start(long j) throws RemoteException;

    int stop(long j) throws RemoteException;

    void switchStream(long j, int i, int i2) throws RemoteException;

    void takeScreenshot() throws RemoteException;

    void unregisterNotifyer() throws RemoteException;
}
