package com.appsflyer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.appsflyer.h */
final class C1879h {

    /* renamed from: com.appsflyer.h$a */
    static final class C1880a implements IInterface {

        /* renamed from: ˎ */
        private IBinder f6806;

        public final IBinder asBinder() {
            return this.f6806;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: ˋ */
        public final boolean mo7476() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f6806.transact(2, obtain, obtain2, 0);
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

        /* renamed from: ॱ */
        public final String mo7477() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f6806.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        C1880a(IBinder iBinder) {
            this.f6806 = iBinder;
        }
    }

    /* renamed from: com.appsflyer.h$b */
    static final class C1881b implements ServiceConnection {

        /* renamed from: ˎ */
        private final LinkedBlockingQueue<IBinder> f6807;

        /* renamed from: ॱ */
        private boolean f6808;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private C1881b() {
            this.f6807 = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: ˊ */
        public final IBinder mo7480() throws InterruptedException {
            if (!this.f6808) {
                this.f6808 = true;
                return (IBinder) this.f6807.take();
            }
            throw new IllegalStateException();
        }

        /* synthetic */ C1881b(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f6807.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: com.appsflyer.h$e */
    static final class C1882e {

        /* renamed from: ˎ */
        public final boolean f6809;

        /* renamed from: ˏ */
        public final String f6810;

        C1882e(String str, boolean z) {
            this.f6810 = str;
            this.f6809 = z;
        }
    }

    /* renamed from: ˊ */
    static C1882e m8761(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                C1881b bVar = new C1881b(0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, bVar, 1)) {
                        C1880a aVar = new C1880a(bVar.mo7480());
                        C1882e eVar = new C1882e(aVar.mo7477(), aVar.mo7476());
                        if (context != null) {
                            context.unbindService(bVar);
                        }
                        return eVar;
                    }
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                    throw new IOException("Google Play connection failed");
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }
}
