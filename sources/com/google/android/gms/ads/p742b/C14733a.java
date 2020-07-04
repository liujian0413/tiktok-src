package com.google.android.gms.ads.p742b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.SystemClock;
import com.google.android.gms.common.C15009a;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.stats.C15307a;
import com.google.android.gms.internal.p752a.C15378d;
import com.google.android.gms.internal.p752a.C15379e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.b.a */
public class C14733a {

    /* renamed from: a */
    private C15009a f38071a;

    /* renamed from: b */
    private C15378d f38072b;

    /* renamed from: c */
    private boolean f38073c;

    /* renamed from: d */
    private final Object f38074d;

    /* renamed from: e */
    private C14735b f38075e;

    /* renamed from: f */
    private final Context f38076f;

    /* renamed from: g */
    private final boolean f38077g;

    /* renamed from: h */
    private final long f38078h;

    /* renamed from: com.google.android.gms.ads.b.a$a */
    public static final class C14734a {

        /* renamed from: a */
        public final String f38079a;

        /* renamed from: b */
        public final boolean f38080b;

        public C14734a(String str, boolean z) {
            this.f38079a = str;
            this.f38080b = z;
        }

        public final String toString() {
            String str = this.f38079a;
            boolean z = this.f38080b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.b.a$b */
    static class C14735b extends Thread {

        /* renamed from: a */
        CountDownLatch f38081a = new CountDownLatch(1);

        /* renamed from: b */
        boolean f38082b = false;

        /* renamed from: c */
        private WeakReference<C14733a> f38083c;

        /* renamed from: d */
        private long f38084d;

        public C14735b(C14733a aVar, long j) {
            this.f38083c = new WeakReference<>(aVar);
            this.f38084d = j;
            start();
        }

        /* renamed from: a */
        private final void m42596a() {
            C14733a aVar = (C14733a) this.f38083c.get();
            if (aVar != null) {
                aVar.mo37415c();
                this.f38082b = true;
            }
        }

        public final void run() {
            try {
                if (!this.f38081a.await(this.f38084d, TimeUnit.MILLISECONDS)) {
                    m42596a();
                }
            } catch (InterruptedException unused) {
                m42596a();
            }
        }
    }

    public C14733a(Context context) {
        this(context, 30000, false, false);
    }

    private C14733a(Context context, long j, boolean z, boolean z2) {
        this.f38074d = new Object();
        C15267r.m44384a(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.f38076f = context;
        this.f38073c = false;
        this.f38078h = j;
        this.f38077g = z2;
    }

    /* renamed from: a */
    public static C14734a m42585a(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C14737c cVar = new C14737c(context);
        boolean a = cVar.mo37422a("gads:ad_id_app_context:enabled", false);
        float a2 = cVar.mo37420a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a3 = cVar.mo37421a("gads:ad_id_use_shared_preference:experiment_id", "");
        C14733a aVar = new C14733a(context, -1, a, cVar.mo37422a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.m42588a(false);
            C14734a b = aVar.mo37414b();
            aVar.m42589a(b, a, a2, SystemClock.elapsedRealtime() - elapsedRealtime, a3, null);
            aVar.mo37415c();
            return b;
        } catch (Throwable th) {
            aVar.mo37415c();
            throw th;
        }
    }

    /* renamed from: a */
    private static C15009a m42586a(Context context, boolean z) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int isGooglePlayServicesAvailable = C15167c.getInstance().isGooglePlayServicesAvailable(context, C15181e.f39276b);
            if (isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C15009a aVar = new C15009a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C15307a.m44540a().mo38676a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    /* renamed from: a */
    private static C15378d m42587a(Context context, C15009a aVar) throws IOException {
        try {
            return C15379e.m44731a(aVar.mo38181a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: a */
    private final void m42588a(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C15267r.m44397c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f38073c) {
                mo37415c();
            }
            this.f38071a = m42586a(this.f38076f, this.f38077g);
            this.f38072b = m42587a(this.f38076f, this.f38071a);
            this.f38073c = true;
            if (z) {
                m42591d();
            }
        }
    }

    /* renamed from: a */
    private final boolean m42589a(C14734a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", aVar.f38080b ? "1" : "0");
        }
        if (!(aVar == null || aVar.f38079a == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.f38079a.length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C14736b(this, hashMap).start();
        return true;
    }

    /* renamed from: b */
    public static boolean m42590b(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C14737c cVar = new C14737c(context);
        C14733a aVar = new C14733a(context, -1, cVar.mo37422a("gads:ad_id_app_context:enabled", false), cVar.mo37422a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.m42588a(false);
            return aVar.m42592e();
        } finally {
            aVar.mo37415c();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m42591d() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f38074d
            monitor-enter(r0)
            com.google.android.gms.ads.b.a$b r1 = r6.f38075e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.b.a$b r1 = r6.f38075e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f38081a     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.b.a$b r1 = r6.f38075e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.f38078h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.b.a$b r1 = new com.google.android.gms.ads.b.a$b     // Catch:{ all -> 0x0026 }
            long r2 = r6.f38078h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.f38075e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p742b.C14733a.m42591d():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0052 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m42592e() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C15267r.m44397c(r0)
            monitor-enter(r3)
            boolean r0 = r3.f38073c     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r3.f38074d     // Catch:{ all -> 0x005a }
            monitor-enter(r0)     // Catch:{ all -> 0x005a }
            com.google.android.gms.ads.b.a$b r1 = r3.f38075e     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.ads.b.a$b r1 = r3.f38075e     // Catch:{ all -> 0x003a }
            boolean r1 = r1.f38082b     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r3.m42588a(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r3.f38073c     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x005a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x003d:
            com.google.android.gms.common.a r0 = r3.f38071a     // Catch:{ all -> 0x005a }
            com.google.android.gms.common.internal.C15267r.m44384a(r0)     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.a.d r0 = r3.f38072b     // Catch:{ all -> 0x005a }
            com.google.android.gms.common.internal.C15267r.m44384a(r0)     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.a.d r0 = r3.f38072b     // Catch:{ RemoteException -> 0x0052 }
            boolean r0 = r0.mo38737b()     // Catch:{ RemoteException -> 0x0052 }
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            r3.m42591d()
            return r0
        L_0x0052:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p742b.C14733a.m42592e():boolean");
    }

    /* renamed from: a */
    public final void mo37413a() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        m42588a(true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.p742b.C14733a.C14734a mo37414b() throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C15267r.m44397c(r0)
            monitor-enter(r4)
            boolean r0 = r4.f38073c     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r4.f38074d     // Catch:{ all -> 0x0066 }
            monitor-enter(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.ads.b.a$b r1 = r4.f38075e     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.ads.b.a$b r1 = r4.f38075e     // Catch:{ all -> 0x003a }
            boolean r1 = r1.f38082b     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r4.m42588a(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r4.f38073c     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0066 }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x003d:
            com.google.android.gms.common.a r0 = r4.f38071a     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.C15267r.m44384a(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.internal.a.d r0 = r4.f38072b     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.C15267r.m44384a(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.ads.b.a$a r0 = new com.google.android.gms.ads.b.a$a     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.internal.a.d r1 = r4.f38072b     // Catch:{ RemoteException -> 0x005e }
            java.lang.String r1 = r1.mo38735a()     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.internal.a.d r2 = r4.f38072b     // Catch:{ RemoteException -> 0x005e }
            r3 = 1
            boolean r2 = r2.mo38736a(r3)     // Catch:{ RemoteException -> 0x005e }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005e }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            r4.m42591d()
            return r0
        L_0x005e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p742b.C14733a.mo37414b():com.google.android.gms.ads.b.a$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37415c() {
        /*
            r2 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C15267r.m44397c(r0)
            monitor-enter(r2)
            android.content.Context r0 = r2.f38076f     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.a r0 = r2.f38071a     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0027
        L_0x000f:
            boolean r0 = r2.f38073c     // Catch:{ Throwable -> 0x001d }
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.common.stats.C15307a.m44540a()     // Catch:{ Throwable -> 0x001d }
            android.content.Context r0 = r2.f38076f     // Catch:{ Throwable -> 0x001d }
            com.google.android.gms.common.a r1 = r2.f38071a     // Catch:{ Throwable -> 0x001d }
            com.google.android.gms.common.stats.C15307a.m44541a(r0, r1)     // Catch:{ Throwable -> 0x001d }
        L_0x001d:
            r0 = 0
            r2.f38073c = r0     // Catch:{ all -> 0x0029 }
            r0 = 0
            r2.f38072b = r0     // Catch:{ all -> 0x0029 }
            r2.f38071a = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p742b.C14733a.mo37415c():void");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        mo37415c();
        super.finalize();
    }
}
