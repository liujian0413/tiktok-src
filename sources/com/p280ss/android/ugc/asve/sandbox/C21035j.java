package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import com.p280ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult.C20660a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d.C20915a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20917e;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20917e.C20918a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20923g;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20923g.C20924a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20926h;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20926h.C20927a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20929i;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20929i.C20930a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20932j;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20932j.C20933a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.asve.sandbox.j */
public interface C21035j extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.j$a */
    public static abstract class C21036a extends Binder implements C21035j {

        /* renamed from: com.ss.android.ugc.asve.sandbox.j$a$a */
        static class C21037a implements C21035j {

            /* renamed from: a */
            private IBinder f56507a;

            public final IBinder asBinder() {
                return this.f56507a;
            }

            /* renamed from: a */
            public final void mo56662a(C20914d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f56507a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56665a(String str, int i, int i2, boolean z, int i3, C20929i iVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i3);
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.f56507a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56659a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(i);
                    this.f56507a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56663a(C20926h hVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f56507a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56661a(Surface surface, String str, C20926h hVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f56507a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56669a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i, C20917e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeTypedArray(aSMediaSegmentArr, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.f56507a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56660a(Surface surface) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56507a.transact(20, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56667a(String str, String str2, boolean z, String str3, String str4, C20923g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f56507a.transact(23, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56658a(float f, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56507a.transact(25, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56668a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56507a.transact(27, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56664a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    this.f56507a.transact(33, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56666a(String str, long j, long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f56507a.transact(34, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56656a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56670b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56678d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo56680e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo56681f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo56684i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(26, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo56685j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(29, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo56686k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(30, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final long mo56676c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final long mo56682g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56507a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final boolean mo56683h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    boolean z = false;
                    this.f56507a.transact(21, obtain, obtain2, 0);
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

            C21037a(IBinder iBinder) {
                this.f56507a = iBinder;
            }

            /* renamed from: c */
            public final void mo56677c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56507a.transact(35, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56671b(Surface surface) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56507a.transact(32, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56679d(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56507a.transact(36, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56674b(C20926h hVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (hVar != null) {
                        iBinder = hVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56507a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo56675b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56507a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56672b(Surface surface, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f56507a.transact(31, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56653a(Surface surface, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f56507a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56673b(Surface surface, String str, C20926h hVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (hVar != null) {
                        iBinder = hVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56507a.transact(16, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56654a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeTypedArray(aSMediaSegmentArr, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f56507a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final RecorderConcatResult mo56655a(String str, String str2, String str3, String str4) throws RemoteException {
                RecorderConcatResult recorderConcatResult;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f56507a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        recorderConcatResult = C20660a.m68464a(obtain2);
                    } else {
                        recorderConcatResult = null;
                    }
                    return recorderConcatResult;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56651a(double d, boolean z, float f, int i, int i2, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeDouble(d);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f56507a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56657a(double d, boolean z, float f, int i, int i2, boolean z2, C20932j jVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeDouble(d);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z2 ? 1 : 0);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56507a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56652a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeString(str2);
                    obtain.writeInt(i5);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56507a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21036a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
        }

        /* renamed from: a */
        public static C21035j m70908a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21035j)) {
                return new C21037a(iBinder);
            }
            return (C21035j) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService";
            if (i3 != 1598968902) {
                Surface surface = null;
                boolean z6 = false;
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface(str);
                        mo56656a();
                        return true;
                    case 2:
                        parcel3.enforceInterface(str);
                        mo56670b();
                        return true;
                    case 3:
                        parcel3.enforceInterface(str);
                        long c = mo56676c();
                        parcel2.writeNoException();
                        parcel4.writeLong(c);
                        return true;
                    case 4:
                        parcel3.enforceInterface(str);
                        mo56662a(C20915a.m69968a(parcel.readStrongBinder()));
                        return true;
                    case 5:
                        parcel3.enforceInterface(str);
                        String readString = parcel.readString();
                        int readInt = parcel.readInt();
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo56665a(readString, readInt, readInt2, z6, parcel.readInt(), C20930a.m69984a(parcel.readStrongBinder()));
                        return true;
                    case 6:
                        parcel3.enforceInterface(str);
                        mo56659a(parcel.readInt());
                        return true;
                    case 7:
                        parcel3.enforceInterface(str);
                        double readDouble = parcel.readDouble();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float readFloat = parcel.readFloat();
                        int readInt3 = parcel.readInt();
                        int readInt4 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mo56657a(readDouble, z, readFloat, readInt3, readInt4, z2, C20933a.m69987a(parcel.readStrongBinder()));
                        return true;
                    case 8:
                        parcel3.enforceInterface(str);
                        double readDouble2 = parcel.readDouble();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        float readFloat2 = parcel.readFloat();
                        int readInt5 = parcel.readInt();
                        int readInt6 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int a = mo56651a(readDouble2, z3, readFloat2, readInt5, readInt6, z4);
                        parcel2.writeNoException();
                        parcel4.writeInt(a);
                        return true;
                    case 9:
                        parcel3.enforceInterface(str);
                        mo56678d();
                        return true;
                    case 10:
                        parcel3.enforceInterface(str);
                        mo56680e();
                        return true;
                    case 11:
                        parcel3.enforceInterface(str);
                        mo56663a(C20927a.m69981a(parcel.readStrongBinder()));
                        return true;
                    case 12:
                        parcel3.enforceInterface(str);
                        mo56681f();
                        return true;
                    case 13:
                        parcel3.enforceInterface(str);
                        mo56674b(C20927a.m69981a(parcel.readStrongBinder()));
                        return true;
                    case 14:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        int a2 = mo56653a(surface, parcel.readString());
                        parcel2.writeNoException();
                        parcel4.writeInt(a2);
                        return true;
                    case 15:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo56661a(surface, parcel.readString(), C20927a.m69981a(parcel.readStrongBinder()));
                        return true;
                    case 16:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo56673b(surface, parcel.readString(), C20927a.m69981a(parcel.readStrongBinder()));
                        return true;
                    case 17:
                        parcel3.enforceInterface(str);
                        long g = mo56682g();
                        parcel2.writeNoException();
                        parcel4.writeLong(g);
                        return true;
                    case 18:
                        parcel3.enforceInterface(str);
                        int a3 = mo56654a((ASMediaSegment[]) parcel3.createTypedArray(ASMediaSegment.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeInt(a3);
                        return true;
                    case 19:
                        parcel3.enforceInterface(str);
                        mo56669a((ASMediaSegment[]) parcel3.createTypedArray(ASMediaSegment.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt(), C20918a.m69972a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo56660a(surface);
                        return true;
                    case 21:
                        parcel3.enforceInterface(str);
                        boolean h = mo56683h();
                        parcel2.writeNoException();
                        parcel4.writeInt(h ? 1 : 0);
                        return true;
                    case 22:
                        parcel3.enforceInterface(str);
                        RecorderConcatResult a4 = mo56655a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (a4 != null) {
                            parcel4.writeInt(1);
                            a4.writeToParcel(parcel4, 1);
                        } else {
                            parcel4.writeInt(0);
                        }
                        return true;
                    case 23:
                        parcel3.enforceInterface(str);
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo56667a(readString2, readString3, z6, parcel.readString(), parcel.readString(), C20924a.m69978a(parcel.readStrongBinder()));
                        return true;
                    case 24:
                        parcel3.enforceInterface(str);
                        int readInt7 = parcel.readInt();
                        int readInt8 = parcel.readInt();
                        String readString4 = parcel.readString();
                        int readInt9 = parcel.readInt();
                        int readInt10 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt11 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int a5 = mo56652a(readInt7, readInt8, readString4, readInt9, readInt10, readString5, readInt11, z5);
                        parcel2.writeNoException();
                        parcel4.writeInt(a5);
                        return true;
                    case 25:
                        parcel3.enforceInterface(str);
                        mo56658a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                        return true;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        parcel3.enforceInterface(str);
                        mo56684i();
                        return true;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo56668a(z6);
                        return true;
                    case 28:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        boolean b = mo56675b(z6);
                        parcel2.writeNoException();
                        parcel4.writeInt(b ? 1 : 0);
                        return true;
                    case 29:
                        parcel3.enforceInterface(str);
                        mo56685j();
                        return true;
                    case 30:
                        parcel3.enforceInterface(str);
                        mo56686k();
                        return true;
                    case 31:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo56672b(surface, parcel.readString());
                        return true;
                    case 32:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo56671b(surface);
                        return true;
                    case 33:
                        parcel3.enforceInterface(str);
                        mo56664a(parcel.readString());
                        return true;
                    case BaseNotice.CHALLENGE /*34*/:
                        parcel3.enforceInterface(str);
                        mo56666a(parcel.readString(), parcel.readLong(), parcel.readLong());
                        return true;
                    case 35:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo56677c(z6);
                        return true;
                    case 36:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo56679d(z6);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel4.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    int mo56651a(double d, boolean z, float f, int i, int i2, boolean z2) throws RemoteException;

    /* renamed from: a */
    int mo56652a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) throws RemoteException;

    /* renamed from: a */
    int mo56653a(Surface surface, String str) throws RemoteException;

    /* renamed from: a */
    int mo56654a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i) throws RemoteException;

    /* renamed from: a */
    RecorderConcatResult mo56655a(String str, String str2, String str3, String str4) throws RemoteException;

    /* renamed from: a */
    void mo56656a() throws RemoteException;

    /* renamed from: a */
    void mo56657a(double d, boolean z, float f, int i, int i2, boolean z2, C20932j jVar) throws RemoteException;

    /* renamed from: a */
    void mo56658a(float f, int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo56659a(int i) throws RemoteException;

    /* renamed from: a */
    void mo56660a(Surface surface) throws RemoteException;

    /* renamed from: a */
    void mo56661a(Surface surface, String str, C20926h hVar) throws RemoteException;

    /* renamed from: a */
    void mo56662a(C20914d dVar) throws RemoteException;

    /* renamed from: a */
    void mo56663a(C20926h hVar) throws RemoteException;

    /* renamed from: a */
    void mo56664a(String str) throws RemoteException;

    /* renamed from: a */
    void mo56665a(String str, int i, int i2, boolean z, int i3, C20929i iVar) throws RemoteException;

    /* renamed from: a */
    void mo56666a(String str, long j, long j2) throws RemoteException;

    /* renamed from: a */
    void mo56667a(String str, String str2, boolean z, String str3, String str4, C20923g gVar) throws RemoteException;

    /* renamed from: a */
    void mo56668a(boolean z) throws RemoteException;

    /* renamed from: a */
    void mo56669a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i, C20917e eVar) throws RemoteException;

    /* renamed from: b */
    void mo56670b() throws RemoteException;

    /* renamed from: b */
    void mo56671b(Surface surface) throws RemoteException;

    /* renamed from: b */
    void mo56672b(Surface surface, String str) throws RemoteException;

    /* renamed from: b */
    void mo56673b(Surface surface, String str, C20926h hVar) throws RemoteException;

    /* renamed from: b */
    void mo56674b(C20926h hVar) throws RemoteException;

    /* renamed from: b */
    boolean mo56675b(boolean z) throws RemoteException;

    /* renamed from: c */
    long mo56676c() throws RemoteException;

    /* renamed from: c */
    void mo56677c(boolean z) throws RemoteException;

    /* renamed from: d */
    void mo56678d() throws RemoteException;

    /* renamed from: d */
    void mo56679d(boolean z) throws RemoteException;

    /* renamed from: e */
    void mo56680e() throws RemoteException;

    /* renamed from: f */
    void mo56681f() throws RemoteException;

    /* renamed from: g */
    long mo56682g() throws RemoteException;

    /* renamed from: h */
    boolean mo56683h() throws RemoteException;

    /* renamed from: i */
    void mo56684i() throws RemoteException;

    /* renamed from: j */
    void mo56685j() throws RemoteException;

    /* renamed from: k */
    void mo56686k() throws RemoteException;
}
