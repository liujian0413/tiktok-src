package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.internal.measurement.z */
public final class C16703z implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C16701x f46668a;

    /* renamed from: b */
    private volatile C16413bf f46669b;

    /* renamed from: c */
    private volatile boolean f46670c;

    protected C16703z(C16701x xVar) {
        this.f46668a = xVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(1:15)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x005c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C16413bf mo43232a() {
        /*
            r6 = this;
            com.google.android.gms.analytics.C14933l.m43382c()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.analytics.service.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r3 = "com.google.android.gms.analytics.service.AnalyticsService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            com.google.android.gms.internal.measurement.x r1 = r6.f46668a
            android.content.Context r1 = r1.mo43204h()
            java.lang.String r2 = "app_package_name"
            java.lang.String r3 = r1.getPackageName()
            r0.putExtra(r2, r3)
            com.google.android.gms.common.stats.a r2 = com.google.android.gms.common.stats.C15307a.m44540a()
            monitor-enter(r6)
            r3 = 0
            r6.f46669b = r3     // Catch:{ all -> 0x0074 }
            r4 = 1
            r6.f46670c = r4     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.measurement.x r4 = r6.f46668a     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.measurement.z r4 = r4.f46663b     // Catch:{ all -> 0x0074 }
            r5 = 129(0x81, float:1.81E-43)
            boolean r0 = r2.mo38676a(r1, r0, r4, r5)     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.measurement.x r1 = r6.f46668a     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "Bind to service requested"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0074 }
            r1.mo43187a(r2, r4)     // Catch:{ all -> 0x0074 }
            r1 = 0
            if (r0 != 0) goto L_0x004e
            r6.f46670c = r1     // Catch:{ all -> 0x0074 }
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            return r3
        L_0x004e:
            com.google.android.gms.internal.measurement.ba<java.lang.Long> r0 = com.google.android.gms.internal.measurement.C16406az.f45901B     // Catch:{ InterruptedException -> 0x005c }
            V r0 = r0.f45945a     // Catch:{ InterruptedException -> 0x005c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ InterruptedException -> 0x005c }
            long r4 = r0.longValue()     // Catch:{ InterruptedException -> 0x005c }
            r6.wait(r4)     // Catch:{ InterruptedException -> 0x005c }
            goto L_0x0063
        L_0x005c:
            com.google.android.gms.internal.measurement.x r0 = r6.f46668a     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "Wait for service connect was interrupted"
            r0.mo43200e(r2)     // Catch:{ all -> 0x0074 }
        L_0x0063:
            r6.f46670c = r1     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.measurement.bf r0 = r6.f46669b     // Catch:{ all -> 0x0074 }
            r6.f46669b = r3     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0072
            com.google.android.gms.internal.measurement.x r1 = r6.f46668a     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "Successfully bound to service but never got onServiceConnected callback"
            r1.mo43202f(r2)     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            return r0
        L_0x0074:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16703z.mo43232a():com.google.android.gms.internal.measurement.bf");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|(2:(1:15)(3:16|(1:18)(1:20)|19)|21)(1:22)|(2:26|27)(3:28|29|(1:31)(1:32))|33|34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.f46668a.mo43202f("Service connect failed to get IAnalyticsService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            java.lang.String r3 = "AnalyticsServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C15267r.m44393b(r3)
            monitor-enter(r2)
            if (r4 != 0) goto L_0x0017
            com.google.android.gms.internal.measurement.x r3 = r2.f46668a     // Catch:{ all -> 0x0014 }
            java.lang.String r4 = "Service connected with null binder"
            r3.mo43202f(r4)     // Catch:{ all -> 0x0014 }
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            return
        L_0x0014:
            r3 = move-exception
            goto L_0x0088
        L_0x0017:
            r3 = 0
            java.lang.String r0 = r4.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x004b }
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch:{ RemoteException -> 0x004b }
            if (r1 == 0) goto L_0x0043
            if (r4 != 0) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x004b }
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16413bf     // Catch:{ RemoteException -> 0x004b }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.internal.measurement.bf r0 = (com.google.android.gms.internal.measurement.C16413bf) r0     // Catch:{ RemoteException -> 0x004b }
        L_0x0033:
            r3 = r0
            goto L_0x003b
        L_0x0035:
            com.google.android.gms.internal.measurement.bg r0 = new com.google.android.gms.internal.measurement.bg     // Catch:{ RemoteException -> 0x004b }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x004b }
            goto L_0x0033
        L_0x003b:
            com.google.android.gms.internal.measurement.x r4 = r2.f46668a     // Catch:{ RemoteException -> 0x004b }
            java.lang.String r0 = "Bound to IAnalyticsService interface"
            r4.mo43190b(r0)     // Catch:{ RemoteException -> 0x004b }
            goto L_0x0052
        L_0x0043:
            com.google.android.gms.internal.measurement.x r4 = r2.f46668a     // Catch:{ RemoteException -> 0x004b }
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r4.mo43201e(r1, r0)     // Catch:{ RemoteException -> 0x004b }
            goto L_0x0052
        L_0x004b:
            com.google.android.gms.internal.measurement.x r4 = r2.f46668a     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = "Service connect failed to get IAnalyticsService"
            r4.mo43202f(r0)     // Catch:{ all -> 0x0014 }
        L_0x0052:
            if (r3 != 0) goto L_0x0067
            com.google.android.gms.common.stats.C15307a.m44540a()     // Catch:{ IllegalArgumentException -> 0x0083 }
            com.google.android.gms.internal.measurement.x r3 = r2.f46668a     // Catch:{ IllegalArgumentException -> 0x0083 }
            android.content.Context r3 = r3.mo43204h()     // Catch:{ IllegalArgumentException -> 0x0083 }
            com.google.android.gms.internal.measurement.x r4 = r2.f46668a     // Catch:{ IllegalArgumentException -> 0x0083 }
            com.google.android.gms.internal.measurement.z r4 = r4.f46663b     // Catch:{ IllegalArgumentException -> 0x0083 }
            com.google.android.gms.common.stats.C15307a.m44541a(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0083 }
            goto L_0x0083
        L_0x0067:
            boolean r4 = r2.f46670c     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x0081
            com.google.android.gms.internal.measurement.x r4 = r2.f46668a     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = "onServiceConnected received after the timeout limit"
            r4.mo43200e(r0)     // Catch:{ all -> 0x0014 }
            com.google.android.gms.internal.measurement.x r4 = r2.f46668a     // Catch:{ all -> 0x0014 }
            com.google.android.gms.analytics.l r4 = r4.mo43207k()     // Catch:{ all -> 0x0014 }
            com.google.android.gms.internal.measurement.aa r0 = new com.google.android.gms.internal.measurement.aa     // Catch:{ all -> 0x0014 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0014 }
            r4.mo38003a(r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0083
        L_0x0081:
            r2.f46669b = r3     // Catch:{ all -> 0x0014 }
        L_0x0083:
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            return
        L_0x0088:
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            throw r3     // Catch:{ all -> 0x008c }
        L_0x008c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16703z.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C15267r.m44393b("AnalyticsServiceConnection.onServiceDisconnected");
        this.f46668a.mo43207k().mo38003a((Runnable) new C16382ab(this, componentName));
    }
}
