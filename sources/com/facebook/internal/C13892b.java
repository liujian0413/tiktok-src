package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C13499h;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.b */
public class C13892b {

    /* renamed from: d */
    private static final String f36798d = C13892b.class.getCanonicalName();

    /* renamed from: g */
    private static C13892b f36799g;

    /* renamed from: a */
    public String f36800a;

    /* renamed from: b */
    public String f36801b;

    /* renamed from: c */
    public boolean f36802c;

    /* renamed from: e */
    private String f36803e;

    /* renamed from: f */
    private long f36804f;

    /* renamed from: com.facebook.internal.b$a */
    static final class C13894a implements IInterface {

        /* renamed from: a */
        private IBinder f36805a;

        public final IBinder asBinder() {
            return this.f36805a;
        }

        /* renamed from: a */
        public final String mo33548a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f36805a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: b */
        public final boolean mo33550b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f36805a.transact(2, obtain, obtain2, 0);
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

        C13894a(IBinder iBinder) {
            this.f36805a = iBinder;
        }
    }

    /* renamed from: com.facebook.internal.b$b */
    static final class C13895b implements ServiceConnection {

        /* renamed from: a */
        private AtomicBoolean f36806a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f36807b;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private C13895b() {
            this.f36806a = new AtomicBoolean(false);
            this.f36807b = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public final IBinder mo33551a() throws InterruptedException {
            if (!this.f36806a.compareAndSet(true, true)) {
                return (IBinder) this.f36807b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f36807b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo33547a() {
        if (!C13499h.m39710a() || !C13499h.m39730p()) {
            return null;
        }
        return this.f36803e;
    }

    /* renamed from: a */
    private static C13892b m41019a(C13892b bVar) {
        bVar.f36804f = System.currentTimeMillis();
        f36799g = bVar;
        return bVar;
    }

    /* renamed from: b */
    private static C13892b m41020b(Context context) {
        C13892b c = m41021c(context);
        if (c != null) {
            return c;
        }
        C13892b e = m41023e(context);
        if (e == null) {
            return new C13892b();
        }
        return e;
    }

    /* renamed from: f */
    private static String m41024f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m41022d(Context context) {
        Method a = C13967z.m41228a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (a == null) {
            return false;
        }
        Object a2 = C13967z.m41215a((Object) null, a, context);
        if (!(a2 instanceof Integer) || ((Integer) a2).intValue() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static C13892b m41023e(Context context) {
        C13895b bVar = new C13895b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                C13894a aVar = new C13894a(bVar.mo33551a());
                C13892b bVar2 = new C13892b();
                bVar2.f36803e = aVar.mo33548a();
                bVar2.f36802c = aVar.mo33550b();
                return bVar2;
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* renamed from: c */
    private static C13892b m41021c(Context context) {
        try {
            if (!m41022d(context)) {
                return null;
            }
            Method a = C13967z.m41228a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
            if (a == null) {
                return null;
            }
            Object a2 = C13967z.m41215a((Object) null, a, context);
            if (a2 == null) {
                return null;
            }
            Method a3 = C13967z.m41227a(a2.getClass(), "getId", (Class<?>[]) new Class[0]);
            Method a4 = C13967z.m41227a(a2.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
            if (a3 != null) {
                if (a4 != null) {
                    C13892b bVar = new C13892b();
                    bVar.f36803e = (String) C13967z.m41215a(a2, a3, new Object[0]);
                    bVar.f36802c = ((Boolean) C13967z.m41215a(a2, a4, new Object[0])).booleanValue();
                    return bVar;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077 A[Catch:{ Exception -> 0x00ed, all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[Catch:{ Exception -> 0x00ed, all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080 A[Catch:{ Exception -> 0x00ed, all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C13892b m41018a(android.content.Context r10) {
        /*
            com.facebook.internal.b r0 = m41020b(r10)
            r1 = 0
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r2 == r3) goto L_0x00e3
            com.facebook.internal.b r2 = f36799g     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r2 == 0) goto L_0x0027
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            com.facebook.internal.b r4 = f36799g     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            long r4 = r4.f36804f     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r6 = 0
            long r2 = r2 - r4
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0027
            com.facebook.internal.b r10 = f36799g     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            return r10
        L_0x0027:
            r2 = 3
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            java.lang.String r2 = "aid"
            r3 = 0
            r5[r3] = r2     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r2 = 1
            java.lang.String r4 = "androidid"
            r5[r2] = r4     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r2 = 2
            java.lang.String r4 = "limit_tracking"
            r5[r2] = r4     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            java.lang.String r4 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r4, r3)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            android.content.pm.PackageManager r4 = r10.getPackageManager()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            java.lang.String r6 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r3 = r4.resolveContentProvider(r6, r3)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = r2.packageName     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            boolean r2 = com.facebook.internal.C13916j.m41080a(r10, r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
        L_0x005d:
            r4 = r2
            goto L_0x0071
        L_0x005f:
            if (r3 == 0) goto L_0x0070
            java.lang.String r2 = r3.packageName     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            boolean r2 = com.facebook.internal.C13916j.m41080a(r10, r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            goto L_0x005d
        L_0x0070:
            r4 = r1
        L_0x0071:
            java.lang.String r2 = m41024f(r10)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r2 == 0) goto L_0x0079
            r0.f36801b = r2     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
        L_0x0079:
            if (r4 != 0) goto L_0x0080
            com.facebook.internal.b r10 = m41019a(r0)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            return r10
        L_0x0080:
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r10 == 0) goto L_0x00d9
            boolean r2 = r10.moveToFirst()     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r2 != 0) goto L_0x0094
            goto L_0x00d9
        L_0x0094:
            java.lang.String r2 = "aid"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.lang.String r3 = "androidid"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.lang.String r4 = "limit_tracking"
            int r4 = r10.getColumnIndex(r4)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.lang.String r2 = r10.getString(r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            r0.f36800a = r2     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r3 <= 0) goto L_0x00c6
            if (r4 <= 0) goto L_0x00c6
            java.lang.String r2 = r0.mo33547a()     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r2 != 0) goto L_0x00c6
            java.lang.String r2 = r10.getString(r3)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            r0.f36803e = r2     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.lang.String r2 = r10.getString(r4)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            r0.f36802c = r2     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
        L_0x00c6:
            if (r10 == 0) goto L_0x00cb
            r10.close()
        L_0x00cb:
            com.facebook.internal.b r10 = m41019a(r0)
            return r10
        L_0x00d0:
            r0 = move-exception
            r1 = r10
            r10 = r0
            goto L_0x0105
        L_0x00d4:
            r0 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L_0x00ef
        L_0x00d9:
            com.facebook.internal.b r0 = m41019a(r0)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r10 == 0) goto L_0x00e2
            r10.close()
        L_0x00e2:
            return r0
        L_0x00e3:
            com.facebook.FacebookException r10 = new com.facebook.FacebookException     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
            r10.<init>(r0)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            throw r10     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
        L_0x00eb:
            r10 = move-exception
            goto L_0x0105
        L_0x00ed:
            r10 = move-exception
            r0 = r1
        L_0x00ef:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.<init>(r3)     // Catch:{ all -> 0x0103 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0103 }
            r2.append(r10)     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x0102
            r0.close()
        L_0x0102:
            return r1
        L_0x0103:
            r10 = move-exception
            r1 = r0
        L_0x0105:
            if (r1 == 0) goto L_0x010a
            r1.close()
        L_0x010a:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C13892b.m41018a(android.content.Context):com.facebook.internal.b");
    }
}
