package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.util.p751a.C15316b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.firebase.iid.al */
public final class C18314al implements ServiceConnection {

    /* renamed from: a */
    private final Context f49779a;

    /* renamed from: b */
    private final Intent f49780b;

    /* renamed from: c */
    private final ScheduledExecutorService f49781c;

    /* renamed from: d */
    private final Queue<C18310ah> f49782d;

    /* renamed from: e */
    private C18312aj f49783e;

    /* renamed from: f */
    private boolean f49784f;

    public C18314al(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C15316b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private C18314al(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f49782d = new ArrayDeque();
        this.f49784f = false;
        this.f49779a = context.getApplicationContext();
        this.f49780b = new Intent(str).setPackage(this.f49779a.getPackageName());
        this.f49781c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final synchronized void mo47224a(Intent intent, PendingResult pendingResult) {
        this.f49782d.add(new C18310ah(intent, pendingResult, this.f49781c));
        m60387a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m60387a() {
        /*
            r4 = this;
            monitor-enter(r4)
        L_0x0001:
            java.util.Queue<com.google.firebase.iid.ah> r0 = r4.f49782d     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x005f
            com.google.firebase.iid.aj r0 = r4.f49783e     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0023
            com.google.firebase.iid.aj r0 = r4.f49783e     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0023
            java.util.Queue<com.google.firebase.iid.ah> r0 = r4.f49782d     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0061 }
            com.google.firebase.iid.ah r0 = (com.google.firebase.iid.C18310ah) r0     // Catch:{ all -> 0x0061 }
            com.google.firebase.iid.aj r1 = r4.f49783e     // Catch:{ all -> 0x0061 }
            r1.mo47222a(r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0001
        L_0x0023:
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0061 }
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r0 = r4.f49784f     // Catch:{ all -> 0x0061 }
            r0 = r0 ^ r1
            r2 = 39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r3.<init>(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "binder is dead. start connection? "
            r3.append(r2)     // Catch:{ all -> 0x0061 }
            r3.append(r0)     // Catch:{ all -> 0x0061 }
        L_0x003f:
            boolean r0 = r4.f49784f     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x005d
            r4.f49784f = r1     // Catch:{ all -> 0x0061 }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C15307a.m44540a()     // Catch:{ SecurityException -> 0x0057 }
            android.content.Context r1 = r4.f49779a     // Catch:{ SecurityException -> 0x0057 }
            android.content.Intent r2 = r4.f49780b     // Catch:{ SecurityException -> 0x0057 }
            r3 = 65
            boolean r0 = r0.mo38676a(r1, r2, r4, r3)     // Catch:{ SecurityException -> 0x0057 }
            if (r0 == 0) goto L_0x0057
            monitor-exit(r4)
            return
        L_0x0057:
            r0 = 0
            r4.f49784f = r0     // Catch:{ all -> 0x0061 }
            r4.m60388b()     // Catch:{ all -> 0x0061 }
        L_0x005d:
            monitor-exit(r4)
            return
        L_0x005f:
            monitor-exit(r4)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18314al.m60387a():void");
    }

    /* renamed from: b */
    private final void m60388b() {
        while (!this.f49782d.isEmpty()) {
            ((C18310ah) this.f49782d.poll()).mo47220a();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f49784f = false;
            this.f49783e = (C18312aj) iBinder;
            if (iBinder == null) {
                m60388b();
            } else {
                m60387a();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        m60387a();
    }
}
