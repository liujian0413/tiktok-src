package com.p280ss.android.ugc.asve.sandbox;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.asve.sandbox.C21020e.C21021a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20902a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20947o;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20953q;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20959s;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20968v;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20971w;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20974x;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20977y;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20980z;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.asve.sandbox.i */
public interface C21032i extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.i$a */
    public static abstract class C21033a extends Binder implements C21032i {

        /* renamed from: com.ss.android.ugc.asve.sandbox.i$a$a */
        static class C21034a implements C21032i {

            /* renamed from: a */
            private IBinder f56506a;

            public final IBinder asBinder() {
                return this.f56506a;
            }

            /* renamed from: a */
            public final void mo56583a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56506a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56573a(int i, String str, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56572a(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f56506a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56567a(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56566a(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56506a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo56596a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56506a.transact(16, obtain, obtain2, 0);
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
            public final void mo56610b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(17, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56591a(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeMap(map);
                    this.f56506a.transact(22, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56588a(String str, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f56506a.transact(23, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56569a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56506a.transact(25, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56607b(String str, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    this.f56506a.transact(28, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56585a(String str, String str2, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeFloat(f);
                    this.f56506a.transact(30, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56586a(String str, String str2, float f, float f2, float f3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    this.f56506a.transact(31, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56618c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(32, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56562a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56506a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56580a(C20974x xVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    this.f56506a.transact(35, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56605b(C20974x xVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    this.f56506a.transact(36, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56592a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(z3 ? 1 : 0);
                    obtain.writeInt(z4 ? 1 : 0);
                    obtain.writeInt(z5 ? 1 : 0);
                    obtain.writeString(str);
                    this.f56506a.transact(37, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56593a(boolean z, boolean z2, boolean z3, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(z3 ? 1 : 0);
                    obtain.writeInt(z4 ? 1 : 0);
                    this.f56506a.transact(38, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56565a(double d, double d2, double d3, double d4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeDouble(d3);
                    obtain.writeDouble(d4);
                    this.f56506a.transact(39, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56594a(double[] dArr, double d) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDoubleArray(dArr);
                    obtain.writeDouble(d);
                    this.f56506a.transact(42, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56570a(int i, float f, float f2, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeInt(i2);
                    this.f56506a.transact(45, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56568a(float f, float f2, float f3, float f4, float f5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    obtain.writeFloat(f4);
                    obtain.writeFloat(f5);
                    this.f56506a.transact(46, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56584a(String str, int i, int i2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    this.f56506a.transact(50, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56579a(C20971w wVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.f56506a.transact(53, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56574a(C20902a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f56506a.transact(54, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56604b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56506a.transact(59, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56581a(C20977y yVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(yVar != null ? yVar.asBinder() : null);
                    this.f56506a.transact(64, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56576a(C20953q qVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(qVar != null ? qVar.asBinder() : null);
                    this.f56506a.transact(68, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56575a(C20947o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f56506a.transact(70, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56595a(String[] strArr, double[] dArr, boolean[] zArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStringArray(strArr);
                    obtain.writeDoubleArray(dArr);
                    obtain.writeBooleanArray(zArr);
                    this.f56506a.transact(71, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56577a(C20959s sVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
                    this.f56506a.transact(72, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56571a(int i, long j, long j2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeString(str);
                    this.f56506a.transact(78, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56578a(C20968v vVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(vVar != null ? vVar.asBinder() : null);
                    this.f56506a.transact(79, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56608b(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56506a.transact(80, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56582a(C20980z zVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(zVar != null ? zVar.asBinder() : null);
                    this.f56506a.transact(82, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56606b(C20980z zVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeStrongBinder(zVar != null ? zVar.asBinder() : null);
                    this.f56506a.transact(83, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56589a(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56506a.transact(86, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56609b(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56506a.transact(87, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56587a(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f56506a.transact(92, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56564a(double d) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDouble(d);
                    this.f56506a.transact(93, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56590a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeTypedList(list2);
                    obtain.writeInt(i);
                    this.f56506a.transact(94, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int[] mo56619c(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56506a.transact(95, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56563a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56506a.transact(18, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56600b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56506a.transact(63, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56613c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56506a.transact(69, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56622d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56506a.transact(73, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo56629e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56506a.transact(84, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo56634f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56506a.transact(89, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final C21020e mo56640g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    this.f56506a.transact(91, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21021a.m70565a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C21034a(IBinder iBinder) {
                this.f56506a = iBinder;
            }

            /* renamed from: g */
            public final void mo56641g(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56506a.transact(52, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo56643h(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56506a.transact(67, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo56645i(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(58, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo56646j(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(62, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo56647k(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(74, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo56648l(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(75, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo56649m(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(76, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final void mo56650n(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(85, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int mo56597b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56506a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int mo56611c(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56506a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final int mo56620d(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56506a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final float mo56627e(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56506a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final int mo56633f(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56506a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final int mo56639g(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56506a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo56644h(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(57, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int mo56612c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56506a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final int mo56621d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56506a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final int mo56628e(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56506a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56558a(Bitmap bitmap) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56506a.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo56636f(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56506a.transact(77, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo56642g(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(56, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56624d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56506a.transact(65, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo56631e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56506a.transact(66, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo56637f(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    this.f56506a.transact(29, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56602b(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    this.f56506a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56616c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    this.f56506a.transact(61, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo56632e(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(51, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo56638f(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(55, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56626d(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(33, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56556a(int i, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    this.f56506a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56557a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56506a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo56635f(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(49, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56623d(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(47, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo56630e(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(48, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56559a(String str, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    this.f56506a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56615c(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(44, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo56625d(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56506a.transact(90, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56603b(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(43, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56617c(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56506a.transact(88, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int mo56598b(String str, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56560a(String str, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f56506a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int mo56599b(String str, int i, int i2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    this.f56506a.transact(81, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo56614c(double d, double d2, double d3, double d4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeDouble(d3);
                    obtain.writeDouble(d4);
                    this.f56506a.transact(41, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo56601b(double d, double d2, double d3, double d4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeDouble(d3);
                    obtain.writeDouble(d4);
                    this.f56506a.transact(40, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo56561a(String str, int i, int i2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56506a.transact(26, obtain, obtain2, 0);
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

        public C21033a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
        }

        /* renamed from: a */
        public static C21032i m70776a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21032i)) {
                return new C21034a(iBinder);
            }
            return (C21032i) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r4v1 */
        /* JADX WARNING: type inference failed for: r4v14, types: [android.graphics.Bitmap] */
        /* JADX WARNING: type inference failed for: r4v16, types: [android.graphics.Bitmap] */
        /* JADX WARNING: type inference failed for: r4v19, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r4v20, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r4v21 */
        /* JADX WARNING: type inference failed for: r4v22 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.os.IBinder, android.graphics.Bitmap]
          uses: [android.graphics.Bitmap, android.os.IBinder]
          mth insns count: 630
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r14, android.os.Parcel r15, android.os.Parcel r16, int r17) throws android.os.RemoteException {
            /*
                r13 = this;
                r9 = r13
                r0 = r14
                r1 = r15
                r2 = r16
                java.lang.String r3 = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService"
                r4 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r10 = 1
                if (r0 == r4) goto L_0x06ac
                r4 = 0
                r5 = 0
                switch(r0) {
                    case 1: goto L_0x06a1;
                    case 2: goto L_0x068a;
                    case 3: goto L_0x067b;
                    case 4: goto L_0x066c;
                    case 5: goto L_0x0661;
                    case 6: goto L_0x0656;
                    case 7: goto L_0x0640;
                    case 8: goto L_0x0626;
                    case 9: goto L_0x060c;
                    case 10: goto L_0x05fa;
                    case 11: goto L_0x05e8;
                    case 12: goto L_0x05d6;
                    case 13: goto L_0x05c4;
                    case 14: goto L_0x05b2;
                    case 15: goto L_0x059c;
                    case 16: goto L_0x0587;
                    case 17: goto L_0x0579;
                    case 18: goto L_0x0572;
                    case 19: goto L_0x0560;
                    case 20: goto L_0x054e;
                    case 21: goto L_0x053c;
                    case 22: goto L_0x0529;
                    case 23: goto L_0x0512;
                    case 24: goto L_0x04fc;
                    case 25: goto L_0x04f1;
                    case 26: goto L_0x04d0;
                    case 27: goto L_0x04be;
                    case 28: goto L_0x04af;
                    case 29: goto L_0x04a4;
                    case 30: goto L_0x0491;
                    case 31: goto L_0x0470;
                    case 32: goto L_0x0462;
                    case 33: goto L_0x0454;
                    case 34: goto L_0x043e;
                    case 35: goto L_0x042f;
                    case 36: goto L_0x0420;
                    case 37: goto L_0x03dc;
                    case 38: goto L_0x03b3;
                    case 39: goto L_0x0397;
                    case 40: goto L_0x037b;
                    case 41: goto L_0x035f;
                    case 42: goto L_0x0350;
                    case 43: goto L_0x0341;
                    case 44: goto L_0x0332;
                    case 45: goto L_0x031b;
                    case 46: goto L_0x02fa;
                    case 47: goto L_0x02eb;
                    case 48: goto L_0x02dc;
                    case 49: goto L_0x02cd;
                    case 50: goto L_0x02b6;
                    case 51: goto L_0x02a8;
                    case 52: goto L_0x029d;
                    case 53: goto L_0x028e;
                    case 54: goto L_0x027f;
                    case 55: goto L_0x0271;
                    case 56: goto L_0x0263;
                    case 57: goto L_0x0255;
                    case 58: goto L_0x0247;
                    case 59: goto L_0x023c;
                    case 60: goto L_0x021f;
                    case 61: goto L_0x0214;
                    case 62: goto L_0x0206;
                    case 63: goto L_0x01ff;
                    case 64: goto L_0x01f0;
                    case 65: goto L_0x01e5;
                    case 66: goto L_0x01da;
                    case 67: goto L_0x01cf;
                    case 68: goto L_0x01c0;
                    case 69: goto L_0x01b9;
                    case 70: goto L_0x01aa;
                    case 71: goto L_0x0197;
                    case 72: goto L_0x0188;
                    case 73: goto L_0x0181;
                    case 74: goto L_0x0173;
                    case 75: goto L_0x0165;
                    case 76: goto L_0x0157;
                    case 77: goto L_0x014c;
                    case 78: goto L_0x0130;
                    case 79: goto L_0x0121;
                    case 80: goto L_0x0112;
                    case 81: goto L_0x00f4;
                    case 82: goto L_0x00e5;
                    case 83: goto L_0x00d6;
                    case 84: goto L_0x00cf;
                    case 85: goto L_0x00c1;
                    case 86: goto L_0x00b0;
                    case 87: goto L_0x009f;
                    case 88: goto L_0x008e;
                    case 89: goto L_0x0087;
                    case 90: goto L_0x0076;
                    case 91: goto L_0x0062;
                    case 92: goto L_0x004f;
                    case 93: goto L_0x0044;
                    case 94: goto L_0x002d;
                    case 95: goto L_0x0017;
                    default: goto L_0x0012;
                }
            L_0x0012:
                boolean r0 = super.onTransact(r14, r15, r16, r17)
                return r0
            L_0x0017:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                java.lang.String r1 = r15.readString()
                int[] r0 = r13.mo56619c(r0, r1)
                r16.writeNoException()
                r2.writeIntArray(r0)
                return r10
            L_0x002d:
                r15.enforceInterface(r3)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r2 = com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r2 = r15.createTypedArrayList(r2)
                int r1 = r15.readInt()
                r13.mo56590a(r0, r2, r1)
                return r10
            L_0x0044:
                r15.enforceInterface(r3)
                double r0 = r15.readDouble()
                r13.mo56564a(r0)
                return r10
            L_0x004f:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                java.lang.String r2 = r15.readString()
                java.lang.String r1 = r15.readString()
                r13.mo56587a(r0, r2, r1)
                return r10
            L_0x0062:
                r15.enforceInterface(r3)
                com.ss.android.ugc.asve.sandbox.e r0 = r13.mo56640g()
                r16.writeNoException()
                if (r0 == 0) goto L_0x0072
                android.os.IBinder r4 = r0.asBinder()
            L_0x0072:
                r2.writeStrongBinder(r4)
                return r10
            L_0x0076:
                r15.enforceInterface(r3)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                int r1 = r15.readInt()
                r13.mo56625d(r0, r1)
                return r10
            L_0x0087:
                r15.enforceInterface(r3)
                r13.mo56634f()
                return r10
            L_0x008e:
                r15.enforceInterface(r3)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                int r1 = r15.readInt()
                r13.mo56617c(r0, r1)
                return r10
            L_0x009f:
                r15.enforceInterface(r3)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                int r1 = r15.readInt()
                r13.mo56609b(r0, r1)
                return r10
            L_0x00b0:
                r15.enforceInterface(r3)
                com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a r0 = com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.CREATOR
                java.util.ArrayList r0 = r15.createTypedArrayList(r0)
                int r1 = r15.readInt()
                r13.mo56589a(r0, r1)
                return r10
            L_0x00c1:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x00cb
                r5 = 1
            L_0x00cb:
                r13.mo56650n(r5)
                return r10
            L_0x00cf:
                r15.enforceInterface(r3)
                r13.mo56629e()
                return r10
            L_0x00d6:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.z r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20980z.C20981a.m70039a(r0)
                r13.mo56606b(r0)
                return r10
            L_0x00e5:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.z r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20980z.C20981a.m70039a(r0)
                r13.mo56582a(r0)
                return r10
            L_0x00f4:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                int r3 = r15.readInt()
                int r4 = r15.readInt()
                java.lang.String r1 = r15.readString()
                int r0 = r13.mo56599b(r0, r3, r4, r1)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x0112:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                java.lang.String r1 = r15.readString()
                r13.mo56608b(r0, r1)
                return r10
            L_0x0121:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.v r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20968v.C20969a.m70027a(r0)
                r13.mo56578a(r0)
                return r10
            L_0x0130:
                r15.enforceInterface(r3)
                int r2 = r15.readInt()
                long r3 = r15.readLong()
                long r5 = r15.readLong()
                java.lang.String r7 = r15.readString()
                r0 = r13
                r1 = r2
                r2 = r3
                r4 = r5
                r6 = r7
                r0.mo56571a(r1, r2, r4, r6)
                return r10
            L_0x014c:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                r13.mo56636f(r0)
                return r10
            L_0x0157:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0161
                r5 = 1
            L_0x0161:
                r13.mo56649m(r5)
                return r10
            L_0x0165:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x016f
                r5 = 1
            L_0x016f:
                r13.mo56648l(r5)
                return r10
            L_0x0173:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x017d
                r5 = 1
            L_0x017d:
                r13.mo56647k(r5)
                return r10
            L_0x0181:
                r15.enforceInterface(r3)
                r13.mo56622d()
                return r10
            L_0x0188:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.s r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20959s.C20960a.m70018a(r0)
                r13.mo56577a(r0)
                return r10
            L_0x0197:
                r15.enforceInterface(r3)
                java.lang.String[] r0 = r15.createStringArray()
                double[] r2 = r15.createDoubleArray()
                boolean[] r1 = r15.createBooleanArray()
                r13.mo56595a(r0, r2, r1)
                return r10
            L_0x01aa:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.o r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20947o.C20948a.m70006a(r0)
                r13.mo56575a(r0)
                return r10
            L_0x01b9:
                r15.enforceInterface(r3)
                r13.mo56613c()
                return r10
            L_0x01c0:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.q r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20953q.C20954a.m70012a(r0)
                r13.mo56576a(r0)
                return r10
            L_0x01cf:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                r13.mo56643h(r0)
                return r10
            L_0x01da:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                r13.mo56631e(r0)
                return r10
            L_0x01e5:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                r13.mo56624d(r0)
                return r10
            L_0x01f0:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.y r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20977y.C20978a.m70036a(r0)
                r13.mo56581a(r0)
                return r10
            L_0x01ff:
                r15.enforceInterface(r3)
                r13.mo56600b()
                return r10
            L_0x0206:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0210
                r5 = 1
            L_0x0210:
                r13.mo56646j(r5)
                return r10
            L_0x0214:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                r13.mo56616c(r0)
                return r10
            L_0x021f:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0231
                android.os.Parcelable$Creator r0 = android.graphics.Bitmap.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r15)
                r4 = r0
                android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            L_0x0231:
                int r0 = r13.mo56558a(r4)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x023c:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                r13.mo56604b(r0)
                return r10
            L_0x0247:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0251
                r5 = 1
            L_0x0251:
                r13.mo56645i(r5)
                return r10
            L_0x0255:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x025f
                r5 = 1
            L_0x025f:
                r13.mo56644h(r5)
                return r10
            L_0x0263:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x026d
                r5 = 1
            L_0x026d:
                r13.mo56642g(r5)
                return r10
            L_0x0271:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x027b
                r5 = 1
            L_0x027b:
                r13.mo56638f(r5)
                return r10
            L_0x027f:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.a r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20902a.C20903a.m69953a(r0)
                r13.mo56574a(r0)
                return r10
            L_0x028e:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.w r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20971w.C20972a.m70030a(r0)
                r13.mo56579a(r0)
                return r10
            L_0x029d:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                r13.mo56641g(r0)
                return r10
            L_0x02a8:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x02b2
                r5 = 1
            L_0x02b2:
                r13.mo56632e(r5)
                return r10
            L_0x02b6:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                int r2 = r15.readInt()
                int r3 = r15.readInt()
                java.lang.String r1 = r15.readString()
                r13.mo56584a(r0, r2, r3, r1)
                return r10
            L_0x02cd:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo56635f(r0, r1)
                return r10
            L_0x02dc:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo56630e(r0, r1)
                return r10
            L_0x02eb:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo56623d(r0, r1)
                return r10
            L_0x02fa:
                r15.enforceInterface(r3)
                float r2 = r15.readFloat()
                float r3 = r15.readFloat()
                float r4 = r15.readFloat()
                float r5 = r15.readFloat()
                float r6 = r15.readFloat()
                r0 = r13
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r0.mo56568a(r1, r2, r3, r4, r5)
                return r10
            L_0x031b:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                float r2 = r15.readFloat()
                float r3 = r15.readFloat()
                int r1 = r15.readInt()
                r13.mo56570a(r0, r2, r3, r1)
                return r10
            L_0x0332:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo56615c(r0, r1)
                return r10
            L_0x0341:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo56603b(r0, r1)
                return r10
            L_0x0350:
                r15.enforceInterface(r3)
                double[] r0 = r15.createDoubleArray()
                double r1 = r15.readDouble()
                r13.mo56594a(r0, r1)
                return r10
            L_0x035f:
                r15.enforceInterface(r3)
                double r2 = r15.readDouble()
                double r4 = r15.readDouble()
                double r6 = r15.readDouble()
                double r11 = r15.readDouble()
                r0 = r13
                r1 = r2
                r3 = r4
                r5 = r6
                r7 = r11
                r0.mo56614c(r1, r3, r5, r7)
                return r10
            L_0x037b:
                r15.enforceInterface(r3)
                double r2 = r15.readDouble()
                double r4 = r15.readDouble()
                double r6 = r15.readDouble()
                double r11 = r15.readDouble()
                r0 = r13
                r1 = r2
                r3 = r4
                r5 = r6
                r7 = r11
                r0.mo56601b(r1, r3, r5, r7)
                return r10
            L_0x0397:
                r15.enforceInterface(r3)
                double r2 = r15.readDouble()
                double r4 = r15.readDouble()
                double r6 = r15.readDouble()
                double r11 = r15.readDouble()
                r0 = r13
                r1 = r2
                r3 = r4
                r5 = r6
                r7 = r11
                r0.mo56565a(r1, r3, r5, r7)
                return r10
            L_0x03b3:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x03be
                r0 = 1
                goto L_0x03bf
            L_0x03be:
                r0 = 0
            L_0x03bf:
                int r2 = r15.readInt()
                if (r2 == 0) goto L_0x03c7
                r2 = 1
                goto L_0x03c8
            L_0x03c7:
                r2 = 0
            L_0x03c8:
                int r3 = r15.readInt()
                if (r3 == 0) goto L_0x03d0
                r3 = 1
                goto L_0x03d1
            L_0x03d0:
                r3 = 0
            L_0x03d1:
                int r1 = r15.readInt()
                if (r1 == 0) goto L_0x03d8
                r5 = 1
            L_0x03d8:
                r13.mo56593a(r0, r2, r3, r5)
                return r10
            L_0x03dc:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x03e7
                r2 = 1
                goto L_0x03e8
            L_0x03e7:
                r2 = 0
            L_0x03e8:
                int r3 = r15.readInt()
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x03f4
                r4 = 1
                goto L_0x03f5
            L_0x03f4:
                r4 = 0
            L_0x03f5:
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x03fd
                r6 = 1
                goto L_0x03fe
            L_0x03fd:
                r6 = 0
            L_0x03fe:
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0406
                r7 = 1
                goto L_0x0407
            L_0x0406:
                r7 = 0
            L_0x0407:
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x040f
                r8 = 1
                goto L_0x0410
            L_0x040f:
                r8 = 0
            L_0x0410:
                java.lang.String r11 = r15.readString()
                r0 = r13
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r6
                r5 = r7
                r6 = r8
                r7 = r11
                r0.mo56592a(r1, r2, r3, r4, r5, r6, r7)
                return r10
            L_0x0420:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.x r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20974x.C20975a.m70033a(r0)
                r13.mo56605b(r0)
                return r10
            L_0x042f:
                r15.enforceInterface(r3)
                android.os.IBinder r0 = r15.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.x r0 = com.p280ss.android.ugc.asve.sandbox.p928b.C20974x.C20975a.m70033a(r0)
                r13.mo56580a(r0)
                return r10
            L_0x043e:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                java.lang.String r1 = r15.readString()
                int r0 = r13.mo56562a(r0, r1)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x0454:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x045e
                r5 = 1
            L_0x045e:
                r13.mo56626d(r5)
                return r10
            L_0x0462:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x046c
                r5 = 1
            L_0x046c:
                r13.mo56618c(r5)
                return r10
            L_0x0470:
                r15.enforceInterface(r3)
                java.lang.String r2 = r15.readString()
                java.lang.String r3 = r15.readString()
                float r4 = r15.readFloat()
                float r5 = r15.readFloat()
                float r6 = r15.readFloat()
                r0 = r13
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r0.mo56586a(r1, r2, r3, r4, r5)
                return r10
            L_0x0491:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                java.lang.String r2 = r15.readString()
                float r1 = r15.readFloat()
                r13.mo56585a(r0, r2, r1)
                return r10
            L_0x04a4:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                r13.mo56637f(r0)
                return r10
            L_0x04af:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                float r1 = r15.readFloat()
                r13.mo56607b(r0, r1)
                return r10
            L_0x04be:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                float r0 = r13.mo56627e(r0)
                r16.writeNoException()
                r2.writeFloat(r0)
                return r10
            L_0x04d0:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                int r3 = r15.readInt()
                int r4 = r15.readInt()
                int r1 = r15.readInt()
                if (r1 == 0) goto L_0x04e6
                r5 = 1
            L_0x04e6:
                int r0 = r13.mo56561a(r0, r3, r4, r5)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x04f1:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                r13.mo56569a(r0)
                return r10
            L_0x04fc:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                int r1 = r15.readInt()
                int r0 = r13.mo56557a(r0, r1)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x0512:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                java.lang.Class r2 = r13.getClass()
                java.lang.ClassLoader r2 = r2.getClassLoader()
                java.util.HashMap r1 = r15.readHashMap(r2)
                r13.mo56588a(r0, r1)
                return r10
            L_0x0529:
                r15.enforceInterface(r3)
                java.lang.Class r0 = r13.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.util.HashMap r0 = r15.readHashMap(r0)
                r13.mo56591a(r0)
                return r10
            L_0x053c:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                int r0 = r13.mo56621d(r0)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x054e:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                int r0 = r13.mo56639g(r0)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x0560:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                int r0 = r13.mo56612c(r0)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x0572:
                r15.enforceInterface(r3)
                r13.mo56563a()
                return r10
            L_0x0579:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0583
                r5 = 1
            L_0x0583:
                r13.mo56610b(r5)
                return r10
            L_0x0587:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                if (r0 == 0) goto L_0x0591
                r5 = 1
            L_0x0591:
                boolean r0 = r13.mo56596a(r5)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x059c:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                float r1 = r15.readFloat()
                int r0 = r13.mo56556a(r0, r1)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x05b2:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                int r0 = r13.mo56633f(r0)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x05c4:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                int r0 = r13.mo56628e(r0)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x05d6:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                int r0 = r13.mo56620d(r0)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x05e8:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                int r0 = r13.mo56611c(r0)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x05fa:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                int r0 = r13.mo56597b(r0)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x060c:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                float r3 = r15.readFloat()
                float r1 = r15.readFloat()
                int r0 = r13.mo56598b(r0, r3, r1)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x0626:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                float r3 = r15.readFloat()
                float r1 = r15.readFloat()
                int r0 = r13.mo56560a(r0, r3, r1)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x0640:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                float r1 = r15.readFloat()
                int r0 = r13.mo56559a(r0, r1)
                r16.writeNoException()
                r2.writeInt(r0)
                return r10
            L_0x0656:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                r13.mo56602b(r0)
                return r10
            L_0x0661:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                r13.mo56566a(r0)
                return r10
            L_0x066c:
                r15.enforceInterface(r3)
                float r0 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo56567a(r0, r1)
                return r10
            L_0x067b:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                java.lang.String r1 = r15.readString()
                r13.mo56572a(r0, r1)
                return r10
            L_0x068a:
                r15.enforceInterface(r3)
                int r0 = r15.readInt()
                java.lang.String r2 = r15.readString()
                float r3 = r15.readFloat()
                float r1 = r15.readFloat()
                r13.mo56573a(r0, r2, r3, r1)
                return r10
            L_0x06a1:
                r15.enforceInterface(r3)
                java.lang.String r0 = r15.readString()
                r13.mo56583a(r0)
                return r10
            L_0x06ac:
                r2.writeString(r3)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.sandbox.C21032i.C21033a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    int mo56556a(int i, float f) throws RemoteException;

    /* renamed from: a */
    int mo56557a(int i, int i2) throws RemoteException;

    /* renamed from: a */
    int mo56558a(Bitmap bitmap) throws RemoteException;

    /* renamed from: a */
    int mo56559a(String str, float f) throws RemoteException;

    /* renamed from: a */
    int mo56560a(String str, float f, float f2) throws RemoteException;

    /* renamed from: a */
    int mo56561a(String str, int i, int i2, boolean z) throws RemoteException;

    /* renamed from: a */
    int mo56562a(String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo56563a() throws RemoteException;

    /* renamed from: a */
    void mo56564a(double d) throws RemoteException;

    /* renamed from: a */
    void mo56565a(double d, double d2, double d3, double d4) throws RemoteException;

    /* renamed from: a */
    void mo56566a(float f) throws RemoteException;

    /* renamed from: a */
    void mo56567a(float f, float f2) throws RemoteException;

    /* renamed from: a */
    void mo56568a(float f, float f2, float f3, float f4, float f5) throws RemoteException;

    /* renamed from: a */
    void mo56569a(int i) throws RemoteException;

    /* renamed from: a */
    void mo56570a(int i, float f, float f2, int i2) throws RemoteException;

    /* renamed from: a */
    void mo56571a(int i, long j, long j2, String str) throws RemoteException;

    /* renamed from: a */
    void mo56572a(int i, String str) throws RemoteException;

    /* renamed from: a */
    void mo56573a(int i, String str, float f, float f2) throws RemoteException;

    /* renamed from: a */
    void mo56574a(C20902a aVar) throws RemoteException;

    /* renamed from: a */
    void mo56575a(C20947o oVar) throws RemoteException;

    /* renamed from: a */
    void mo56576a(C20953q qVar) throws RemoteException;

    /* renamed from: a */
    void mo56577a(C20959s sVar) throws RemoteException;

    /* renamed from: a */
    void mo56578a(C20968v vVar) throws RemoteException;

    /* renamed from: a */
    void mo56579a(C20971w wVar) throws RemoteException;

    /* renamed from: a */
    void mo56580a(C20974x xVar) throws RemoteException;

    /* renamed from: a */
    void mo56581a(C20977y yVar) throws RemoteException;

    /* renamed from: a */
    void mo56582a(C20980z zVar) throws RemoteException;

    /* renamed from: a */
    void mo56583a(String str) throws RemoteException;

    /* renamed from: a */
    void mo56584a(String str, int i, int i2, String str2) throws RemoteException;

    /* renamed from: a */
    void mo56585a(String str, String str2, float f) throws RemoteException;

    /* renamed from: a */
    void mo56586a(String str, String str2, float f, float f2, float f3) throws RemoteException;

    /* renamed from: a */
    void mo56587a(String str, String str2, String str3) throws RemoteException;

    /* renamed from: a */
    void mo56588a(String str, Map map) throws RemoteException;

    /* renamed from: a */
    void mo56589a(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: a */
    void mo56590a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) throws RemoteException;

    /* renamed from: a */
    void mo56591a(Map map) throws RemoteException;

    /* renamed from: a */
    void mo56592a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) throws RemoteException;

    /* renamed from: a */
    void mo56593a(boolean z, boolean z2, boolean z3, boolean z4) throws RemoteException;

    /* renamed from: a */
    void mo56594a(double[] dArr, double d) throws RemoteException;

    /* renamed from: a */
    void mo56595a(String[] strArr, double[] dArr, boolean[] zArr) throws RemoteException;

    /* renamed from: a */
    boolean mo56596a(boolean z) throws RemoteException;

    /* renamed from: b */
    int mo56597b(String str) throws RemoteException;

    /* renamed from: b */
    int mo56598b(String str, float f, float f2) throws RemoteException;

    /* renamed from: b */
    int mo56599b(String str, int i, int i2, String str2) throws RemoteException;

    /* renamed from: b */
    void mo56600b() throws RemoteException;

    /* renamed from: b */
    void mo56601b(double d, double d2, double d3, double d4) throws RemoteException;

    /* renamed from: b */
    void mo56602b(float f) throws RemoteException;

    /* renamed from: b */
    void mo56603b(float f, float f2) throws RemoteException;

    /* renamed from: b */
    void mo56604b(int i) throws RemoteException;

    /* renamed from: b */
    void mo56605b(C20974x xVar) throws RemoteException;

    /* renamed from: b */
    void mo56606b(C20980z zVar) throws RemoteException;

    /* renamed from: b */
    void mo56607b(String str, float f) throws RemoteException;

    /* renamed from: b */
    void mo56608b(String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo56609b(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: b */
    void mo56610b(boolean z) throws RemoteException;

    /* renamed from: c */
    int mo56611c(float f) throws RemoteException;

    /* renamed from: c */
    int mo56612c(String str) throws RemoteException;

    /* renamed from: c */
    void mo56613c() throws RemoteException;

    /* renamed from: c */
    void mo56614c(double d, double d2, double d3, double d4) throws RemoteException;

    /* renamed from: c */
    void mo56615c(float f, float f2) throws RemoteException;

    /* renamed from: c */
    void mo56616c(int i) throws RemoteException;

    /* renamed from: c */
    void mo56617c(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: c */
    void mo56618c(boolean z) throws RemoteException;

    /* renamed from: c */
    int[] mo56619c(String str, String str2) throws RemoteException;

    /* renamed from: d */
    int mo56620d(float f) throws RemoteException;

    /* renamed from: d */
    int mo56621d(String str) throws RemoteException;

    /* renamed from: d */
    void mo56622d() throws RemoteException;

    /* renamed from: d */
    void mo56623d(float f, float f2) throws RemoteException;

    /* renamed from: d */
    void mo56624d(int i) throws RemoteException;

    /* renamed from: d */
    void mo56625d(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: d */
    void mo56626d(boolean z) throws RemoteException;

    /* renamed from: e */
    float mo56627e(String str) throws RemoteException;

    /* renamed from: e */
    int mo56628e(float f) throws RemoteException;

    /* renamed from: e */
    void mo56629e() throws RemoteException;

    /* renamed from: e */
    void mo56630e(float f, float f2) throws RemoteException;

    /* renamed from: e */
    void mo56631e(int i) throws RemoteException;

    /* renamed from: e */
    void mo56632e(boolean z) throws RemoteException;

    /* renamed from: f */
    int mo56633f(float f) throws RemoteException;

    /* renamed from: f */
    void mo56634f() throws RemoteException;

    /* renamed from: f */
    void mo56635f(float f, float f2) throws RemoteException;

    /* renamed from: f */
    void mo56636f(int i) throws RemoteException;

    /* renamed from: f */
    void mo56637f(String str) throws RemoteException;

    /* renamed from: f */
    void mo56638f(boolean z) throws RemoteException;

    /* renamed from: g */
    int mo56639g(float f) throws RemoteException;

    /* renamed from: g */
    C21020e mo56640g() throws RemoteException;

    /* renamed from: g */
    void mo56641g(String str) throws RemoteException;

    /* renamed from: g */
    void mo56642g(boolean z) throws RemoteException;

    /* renamed from: h */
    void mo56643h(String str) throws RemoteException;

    /* renamed from: h */
    void mo56644h(boolean z) throws RemoteException;

    /* renamed from: i */
    void mo56645i(boolean z) throws RemoteException;

    /* renamed from: j */
    void mo56646j(boolean z) throws RemoteException;

    /* renamed from: k */
    void mo56647k(boolean z) throws RemoteException;

    /* renamed from: l */
    void mo56648l(boolean z) throws RemoteException;

    /* renamed from: m */
    void mo56649m(boolean z) throws RemoteException;

    /* renamed from: n */
    void mo56650n(boolean z) throws RemoteException;
}
