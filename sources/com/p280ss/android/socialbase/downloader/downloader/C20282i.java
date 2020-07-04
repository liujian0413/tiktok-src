package com.p280ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.socialbase.downloader.depend.C20208ab;
import com.p280ss.android.socialbase.downloader.depend.C20220f;
import com.p280ss.android.socialbase.downloader.depend.C20220f.C20221a;
import com.p280ss.android.socialbase.downloader.depend.C20226h;
import com.p280ss.android.socialbase.downloader.depend.C20251u;
import com.p280ss.android.socialbase.downloader.depend.C20251u.C20252a;
import com.p280ss.android.socialbase.downloader.depend.C20256x;
import com.p280ss.android.socialbase.downloader.depend.C20256x.C20257a;
import com.p280ss.android.socialbase.downloader.model.C20337a;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.i */
public interface C20282i extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.downloader.i$a */
    public static abstract class C20283a extends Binder implements C20282i {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.i$a$a */
        static class C20284a implements C20282i {

            /* renamed from: a */
            private IBinder f54834a;

            public final IBinder asBinder() {
                return this.f54834a;
            }

            /* renamed from: a */
            public final void mo54364a(C20337a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f54834a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54365a(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    this.f54834a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54357a(int i, int i2, C20226h hVar, int i3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f54834a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo54367a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54834a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54358a(int i, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54834a.transact(24, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54361a(int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f54834a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54363a(DownloadChunk downloadChunk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54834a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo54374b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54834a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54356a(int i, int i2, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    this.f54834a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54355a(int i, int i2, int i3, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    this.f54834a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54360a(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    this.f54834a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54362a(C20208ab abVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(abVar != null ? abVar.asBinder() : null);
                    this.f54834a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54359a(int i, C20251u uVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(uVar != null ? uVar.asBinder() : null);
                    this.f54834a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final boolean mo54376c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    this.f54834a.transact(30, obtain, obtain2, 0);
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

            /* renamed from: d */
            public final void mo54379d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    this.f54834a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final boolean mo54382e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    this.f54834a.transact(50, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final void mo54351a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    this.f54834a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo54373b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    this.f54834a.transact(26, obtain, obtain2, 0);
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

            C20284a(IBinder iBinder) {
                this.f54834a = iBinder;
            }

            /* renamed from: a */
            public final void mo54366a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f54834a.transact(25, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final List<DownloadInfo> mo54375c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54834a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final List<DownloadInfo> mo54378d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54834a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo54381e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final long mo54383f(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final int mo54384g(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final boolean mo54385h(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54834a.transact(10, obtain, obtain2, 0);
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

            /* renamed from: i */
            public final DownloadInfo mo54386i(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final List<DownloadChunk> mo54387j(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadChunk.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo54388k(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo54389l(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final boolean mo54390m(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54834a.transact(28, obtain, obtain2, 0);
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

            /* renamed from: n */
            public final void mo54391n(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public final int mo54392o(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final boolean mo54393p(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54834a.transact(35, obtain, obtain2, 0);
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

            /* renamed from: q */
            public final void mo54394q(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public final boolean mo54395r(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54834a.transact(40, obtain, obtain2, 0);
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

            /* renamed from: s */
            public final C20251u mo54396s(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20252a.m66676a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public final C20256x mo54397t(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20257a.m66685a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public final C20220f mo54398u(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20221a.m66615a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final List<DownloadInfo> mo54350a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54834a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final List<DownloadInfo> mo54369b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54834a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo54370b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final boolean mo54377c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54834a.transact(4, obtain, obtain2, 0);
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

            /* renamed from: d */
            public final void mo54380d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54352a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54834a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo54349a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f54834a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final DownloadInfo mo54368b(String str, String str2) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f54834a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54353a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f54834a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo54372b(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    this.f54834a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo54354a(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.f54834a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo54371b(int i, int i2, C20226h hVar, int i3, boolean z) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (hVar != null) {
                        iBinder = hVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f54834a.transact(22, obtain, obtain2, 0);
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

        public C20283a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        }

        /* renamed from: a */
        public static C20282i m66909a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20282i)) {
                return new C20284a(iBinder);
            }
            return (C20282i) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v3, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r2v5, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.app.Notification] */
        /* JADX WARNING: type inference failed for: r2v8, types: [android.app.Notification] */
        /* JADX WARNING: type inference failed for: r2v9, types: [com.ss.android.socialbase.downloader.model.DownloadChunk] */
        /* JADX WARNING: type inference failed for: r2v11, types: [com.ss.android.socialbase.downloader.model.DownloadChunk] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r2v17, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v18, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v19, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v20, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v21, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v22, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v23 */
        /* JADX WARNING: type inference failed for: r2v24 */
        /* JADX WARNING: type inference failed for: r2v25 */
        /* JADX WARNING: type inference failed for: r2v26 */
        /* JADX WARNING: type inference failed for: r2v27 */
        /* JADX WARNING: type inference failed for: r2v28 */
        /* JADX WARNING: type inference failed for: r2v29 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.app.Notification, com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.model.DownloadChunk, android.os.IBinder]
          uses: [com.ss.android.socialbase.downloader.model.DownloadInfo, android.app.Notification, com.ss.android.socialbase.downloader.model.DownloadChunk, android.os.IBinder]
          mth insns count: 409
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 8 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
            /*
                r8 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r9 == r0) goto L_0x0451
                r0 = 0
                r2 = 0
                switch(r9) {
                    case 1: goto L_0x043d;
                    case 2: goto L_0x042d;
                    case 3: goto L_0x041d;
                    case 4: goto L_0x0409;
                    case 5: goto L_0x03f9;
                    case 6: goto L_0x03e9;
                    case 7: goto L_0x03dd;
                    case 8: goto L_0x03c9;
                    case 9: goto L_0x03b5;
                    case 10: goto L_0x03a1;
                    case 11: goto L_0x0384;
                    case 12: goto L_0x0370;
                    case 13: goto L_0x0358;
                    case 14: goto L_0x0337;
                    case 15: goto L_0x0323;
                    case 16: goto L_0x030f;
                    case 17: goto L_0x02fb;
                    case 18: goto L_0x02eb;
                    case 19: goto L_0x02db;
                    case 20: goto L_0x02cb;
                    case 21: goto L_0x02a1;
                    case 22: goto L_0x0277;
                    case 23: goto L_0x0258;
                    case 24: goto L_0x023c;
                    case 25: goto L_0x022c;
                    case 26: goto L_0x021c;
                    case 27: goto L_0x0208;
                    case 28: goto L_0x01f4;
                    case 29: goto L_0x01e4;
                    case 30: goto L_0x01d4;
                    case 31: goto L_0x01bd;
                    case 32: goto L_0x01a9;
                    case 33: goto L_0x018e;
                    case 34: goto L_0x016f;
                    case 35: goto L_0x015b;
                    case 36: goto L_0x014b;
                    case 37: goto L_0x0133;
                    case 38: goto L_0x0116;
                    case 39: goto L_0x00fa;
                    case 40: goto L_0x00e6;
                    case 41: goto L_0x00da;
                    case 42: goto L_0x00c4;
                    case 43: goto L_0x00ae;
                    case 44: goto L_0x009a;
                    case 45: goto L_0x0086;
                    case 46: goto L_0x006c;
                    case 47: goto L_0x0052;
                    case 48: goto L_0x003a;
                    case 49: goto L_0x0020;
                    case 50: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r9 = super.onTransact(r9, r10, r11, r12)
                return r9
            L_0x0010:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                boolean r9 = r8.mo54382e()
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0020:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.f r9 = r8.mo54398u(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0036
                android.os.IBinder r2 = r9.asBinder()
            L_0x0036:
                r11.writeStrongBinder(r2)
                return r1
            L_0x003a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.u r10 = com.p280ss.android.socialbase.downloader.depend.C20251u.C20252a.m66676a(r10)
                r8.mo54359a(r9, r10)
                r11.writeNoException()
                return r1
            L_0x0052:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.x r9 = r8.mo54397t(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0068
                android.os.IBinder r2 = r9.asBinder()
            L_0x0068:
                r11.writeStrongBinder(r2)
                return r1
            L_0x006c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.u r9 = r8.mo54396s(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0082
                android.os.IBinder r2 = r9.asBinder()
            L_0x0082:
                r11.writeStrongBinder(r2)
                return r1
            L_0x0086:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r10 = r10.readInt()
                r8.mo54353a(r9, r10)
                r11.writeNoException()
                return r1
            L_0x009a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                android.os.IBinder r9 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.ab r9 = com.p280ss.android.socialbase.downloader.depend.C20208ab.C20209a.m66604a(r9)
                r8.mo54362a(r9)
                r11.writeNoException()
                return r1
            L_0x00ae:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r12 = com.p280ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.util.ArrayList r10 = r10.createTypedArrayList(r12)
                r8.mo54372b(r9, r10)
                r11.writeNoException()
                return r1
            L_0x00c4:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r12 = com.p280ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.util.ArrayList r10 = r10.createTypedArrayList(r12)
                r8.mo54360a(r9, r10)
                r11.writeNoException()
                return r1
            L_0x00da:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                r8.mo54379d()
                r11.writeNoException()
                return r1
            L_0x00e6:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo54395r(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x00fa:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r12 = r10.readInt()
                int r0 = r10.readInt()
                int r10 = r10.readInt()
                r8.mo54354a(r9, r12, r0, r10)
                r11.writeNoException()
                return r1
            L_0x0116:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                long r6 = r10.readLong()
                r2 = r8
                r2.mo54355a(r3, r4, r5, r6)
                r11.writeNoException()
                return r1
            L_0x0133:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r12 = r10.readInt()
                long r2 = r10.readLong()
                r8.mo54356a(r9, r12, r2)
                r11.writeNoException()
                return r1
            L_0x014b:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo54394q(r9)
                r11.writeNoException()
                return r1
            L_0x015b:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo54393p(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x016f:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x0183
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r9 = com.p280ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p280ss.android.socialbase.downloader.model.DownloadInfo) r2
            L_0x0183:
                boolean r9 = r8.mo54374b(r2)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x018e:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x01a2
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r9 = com.p280ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.DownloadChunk r2 = (com.p280ss.android.socialbase.downloader.model.DownloadChunk) r2
            L_0x01a2:
                r8.mo54363a(r2)
                r11.writeNoException()
                return r1
            L_0x01a9:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r9 = r8.mo54392o(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01bd:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r10 = r10.readInt()
                if (r10 == 0) goto L_0x01cd
                r0 = 1
            L_0x01cd:
                r8.mo54361a(r9, r0)
                r11.writeNoException()
                return r1
            L_0x01d4:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                boolean r9 = r8.mo54376c()
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01e4:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo54391n(r9)
                r11.writeNoException()
                return r1
            L_0x01f4:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo54390m(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0208:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo54378d(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x021c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                boolean r9 = r8.mo54373b()
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x022c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x0238
                r0 = 1
            L_0x0238:
                r8.mo54366a(r0)
                return r1
            L_0x023c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r11 = r10.readInt()
                if (r11 == 0) goto L_0x0254
                android.os.Parcelable$Creator r11 = android.app.Notification.CREATOR
                java.lang.Object r10 = r11.createFromParcel(r10)
                r2 = r10
                android.app.Notification r2 = (android.app.Notification) r2
            L_0x0254:
                r8.mo54358a(r9, r2)
                return r1
            L_0x0258:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x026c
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r9 = com.p280ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p280ss.android.socialbase.downloader.model.DownloadInfo) r2
            L_0x026c:
                boolean r9 = r8.mo54367a(r2)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0277:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                android.os.IBinder r9 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.h r5 = com.p280ss.android.socialbase.downloader.depend.C20226h.C20227a.m66632a(r9)
                int r6 = r10.readInt()
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x0298
                r7 = 1
                goto L_0x0299
            L_0x0298:
                r7 = 0
            L_0x0299:
                r2 = r8
                r2.mo54371b(r3, r4, r5, r6, r7)
                r11.writeNoException()
                return r1
            L_0x02a1:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                android.os.IBinder r9 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.h r5 = com.p280ss.android.socialbase.downloader.depend.C20226h.C20227a.m66632a(r9)
                int r6 = r10.readInt()
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x02c2
                r7 = 1
                goto L_0x02c3
            L_0x02c2:
                r7 = 0
            L_0x02c3:
                r2 = r8
                r2.mo54357a(r3, r4, r5, r6, r7)
                r11.writeNoException()
                return r1
            L_0x02cb:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo54389l(r9)
                r11.writeNoException()
                return r1
            L_0x02db:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo54388k(r9)
                r11.writeNoException()
                return r1
            L_0x02eb:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.util.ArrayList r9 = r10.createStringArrayList()
                r8.mo54365a(r9)
                r11.writeNoException()
                return r1
            L_0x02fb:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo54375c(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x030f:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo54369b(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x0323:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo54350a(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x0337:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.lang.String r10 = r10.readString()
                com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r8.mo54368b(r9, r10)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0354
                r11.writeInt(r1)
                r9.writeToParcel(r11, r1)
                goto L_0x0357
            L_0x0354:
                r11.writeInt(r0)
            L_0x0357:
                return r1
            L_0x0358:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.lang.String r10 = r10.readString()
                int r9 = r8.mo54349a(r9, r10)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0370:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                java.util.List r9 = r8.mo54387j(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x0384:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r8.mo54386i(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x039d
                r11.writeInt(r1)
                r9.writeToParcel(r11, r1)
                goto L_0x03a0
            L_0x039d:
                r11.writeInt(r0)
            L_0x03a0:
                return r1
            L_0x03a1:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo54385h(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x03b5:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r9 = r8.mo54384g(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x03c9:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                long r9 = r8.mo54383f(r9)
                r11.writeNoException()
                r11.writeLong(r9)
                return r1
            L_0x03dd:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                r8.mo54351a()
                r11.writeNoException()
                return r1
            L_0x03e9:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo54381e(r9)
                r11.writeNoException()
                return r1
            L_0x03f9:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo54380d(r9)
                r11.writeNoException()
                return r1
            L_0x0409:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo54377c(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x041d:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo54370b(r9)
                r11.writeNoException()
                return r1
            L_0x042d:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo54352a(r9)
                r11.writeNoException()
                return r1
            L_0x043d:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                android.os.IBinder r9 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.model.a r9 = com.p280ss.android.socialbase.downloader.model.C20337a.C20338a.m67468a(r9)
                r8.mo54364a(r9)
                r11.writeNoException()
                return r1
            L_0x0451:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r11.writeString(r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20282i.C20283a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    int mo54349a(String str, String str2) throws RemoteException;

    /* renamed from: a */
    List<DownloadInfo> mo54350a(String str) throws RemoteException;

    /* renamed from: a */
    void mo54351a() throws RemoteException;

    /* renamed from: a */
    void mo54352a(int i) throws RemoteException;

    /* renamed from: a */
    void mo54353a(int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo54354a(int i, int i2, int i3, int i4) throws RemoteException;

    /* renamed from: a */
    void mo54355a(int i, int i2, int i3, long j) throws RemoteException;

    /* renamed from: a */
    void mo54356a(int i, int i2, long j) throws RemoteException;

    /* renamed from: a */
    void mo54357a(int i, int i2, C20226h hVar, int i3, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo54358a(int i, Notification notification) throws RemoteException;

    /* renamed from: a */
    void mo54359a(int i, C20251u uVar) throws RemoteException;

    /* renamed from: a */
    void mo54360a(int i, List<DownloadChunk> list) throws RemoteException;

    /* renamed from: a */
    void mo54361a(int i, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo54362a(C20208ab abVar) throws RemoteException;

    /* renamed from: a */
    void mo54363a(DownloadChunk downloadChunk) throws RemoteException;

    /* renamed from: a */
    void mo54364a(C20337a aVar) throws RemoteException;

    /* renamed from: a */
    void mo54365a(List<String> list) throws RemoteException;

    /* renamed from: a */
    void mo54366a(boolean z) throws RemoteException;

    /* renamed from: a */
    boolean mo54367a(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: b */
    DownloadInfo mo54368b(String str, String str2) throws RemoteException;

    /* renamed from: b */
    List<DownloadInfo> mo54369b(String str) throws RemoteException;

    /* renamed from: b */
    void mo54370b(int i) throws RemoteException;

    /* renamed from: b */
    void mo54371b(int i, int i2, C20226h hVar, int i3, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo54372b(int i, List<DownloadChunk> list) throws RemoteException;

    /* renamed from: b */
    boolean mo54373b() throws RemoteException;

    /* renamed from: b */
    boolean mo54374b(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: c */
    List<DownloadInfo> mo54375c(String str) throws RemoteException;

    /* renamed from: c */
    boolean mo54376c() throws RemoteException;

    /* renamed from: c */
    boolean mo54377c(int i) throws RemoteException;

    /* renamed from: d */
    List<DownloadInfo> mo54378d(String str) throws RemoteException;

    /* renamed from: d */
    void mo54379d() throws RemoteException;

    /* renamed from: d */
    void mo54380d(int i) throws RemoteException;

    /* renamed from: e */
    void mo54381e(int i) throws RemoteException;

    /* renamed from: e */
    boolean mo54382e() throws RemoteException;

    /* renamed from: f */
    long mo54383f(int i) throws RemoteException;

    /* renamed from: g */
    int mo54384g(int i) throws RemoteException;

    /* renamed from: h */
    boolean mo54385h(int i) throws RemoteException;

    /* renamed from: i */
    DownloadInfo mo54386i(int i) throws RemoteException;

    /* renamed from: j */
    List<DownloadChunk> mo54387j(int i) throws RemoteException;

    /* renamed from: k */
    void mo54388k(int i) throws RemoteException;

    /* renamed from: l */
    void mo54389l(int i) throws RemoteException;

    /* renamed from: m */
    boolean mo54390m(int i) throws RemoteException;

    /* renamed from: n */
    void mo54391n(int i) throws RemoteException;

    /* renamed from: o */
    int mo54392o(int i) throws RemoteException;

    /* renamed from: p */
    boolean mo54393p(int i) throws RemoteException;

    /* renamed from: q */
    void mo54394q(int i) throws RemoteException;

    /* renamed from: r */
    boolean mo54395r(int i) throws RemoteException;

    /* renamed from: s */
    C20251u mo54396s(int i) throws RemoteException;

    /* renamed from: t */
    C20256x mo54397t(int i) throws RemoteException;

    /* renamed from: u */
    C20220f mo54398u(int i) throws RemoteException;
}
