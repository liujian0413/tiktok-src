package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.util.C0904k;
import android.util.Log;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.iid.z */
public final class C18356z {

    /* renamed from: b */
    private static C18356z f49859b;

    /* renamed from: a */
    final Queue<Intent> f49860a = new ArrayDeque();

    /* renamed from: c */
    private final C0904k<String, String> f49861c = new C0904k<>();

    /* renamed from: d */
    private Boolean f49862d = null;

    /* renamed from: e */
    private final Queue<Intent> f49863e = new ArrayDeque();

    /* renamed from: a */
    public static synchronized C18356z m60489a() {
        C18356z zVar;
        synchronized (C18356z.class) {
            if (f49859b == null) {
                f49859b = new C18356z();
            }
            zVar = f49859b;
        }
        return zVar;
    }

    private C18356z() {
    }

    /* renamed from: a */
    public static PendingIntent m60488a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, m60491b(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    /* renamed from: a */
    public static void m60490a(Context context, Intent intent) {
        context.sendBroadcast(m60491b(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    /* renamed from: b */
    public static void m60492b(Context context, Intent intent) {
        context.sendBroadcast(m60491b(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    /* renamed from: b */
    private static Intent m60491b(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    /* renamed from: b */
    public final Intent mo47276b() {
        return (Intent) this.f49863e.poll();
    }

    /* renamed from: a */
    public final int mo47275a(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "Starting service: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                c = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            c = 0;
        }
        switch (c) {
            case 0:
                this.f49860a.offer(intent);
                break;
            case 1:
                this.f49863e.offer(intent);
                break;
            default:
                String str3 = "Unknown service action: ";
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str3.concat(valueOf2);
                } else {
                    new String(str3);
                }
                return VETransitionFilterParam.TransitionDuration_DEFAULT;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return m60493c(context, intent2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096 A[Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad A[Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2 A[Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m60493c(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            android.support.v4.util.k<java.lang.String, java.lang.String> r0 = r5.f49861c
            monitor-enter(r0)
            android.support.v4.util.k<java.lang.String, java.lang.String> r1 = r5.f49861c     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = r7.getAction()     // Catch:{ all -> 0x00c3 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            r0 = 0
            if (r1 != 0) goto L_0x006d
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            android.content.pm.ResolveInfo r1 = r1.resolveService(r7, r0)
            if (r1 == 0) goto L_0x0092
            android.content.pm.ServiceInfo r2 = r1.serviceInfo
            if (r2 != 0) goto L_0x0023
            goto L_0x0092
        L_0x0023:
            android.content.pm.ServiceInfo r1 = r1.serviceInfo
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r3 = r1.packageName
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = r1.name
            if (r2 != 0) goto L_0x0036
            goto L_0x0092
        L_0x0036:
            java.lang.String r1 = r1.name
            java.lang.String r2 = "."
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0057
            java.lang.String r1 = r2.concat(r1)
            goto L_0x005c
        L_0x0057:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x005c:
            android.support.v4.util.k<java.lang.String, java.lang.String> r2 = r5.f49861c
            monitor-enter(r2)
            android.support.v4.util.k<java.lang.String, java.lang.String> r3 = r5.f49861c     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r7.getAction()     // Catch:{ all -> 0x006a }
            r3.put(r4, r1)     // Catch:{ all -> 0x006a }
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            goto L_0x006d
        L_0x006a:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r6
        L_0x006d:
            java.lang.String r2 = "FirebaseInstanceId"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x008b
            java.lang.String r2 = "Restricting intent to a specific service: "
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0086
            r2.concat(r3)
            goto L_0x008b
        L_0x0086:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
        L_0x008b:
            java.lang.String r2 = r6.getPackageName()
            r7.setClassName(r2, r1)
        L_0x0092:
            java.lang.Boolean r1 = r5.f49862d     // Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = "android.permission.WAKE_LOCK"
            int r1 = r6.checkCallingOrSelfPermission(r1)     // Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }
            if (r1 != 0) goto L_0x009f
            r0 = 1
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }
            r5.f49862d = r0     // Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }
        L_0x00a5:
            java.lang.Boolean r0 = r5.f49862d     // Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }
            boolean r0 = r0.booleanValue()     // Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }
            if (r0 == 0) goto L_0x00b2
            android.content.ComponentName r6 = android.support.p022v4.content.WakefulBroadcastReceiver.m2901a_(r6, r7)     // Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }
            goto L_0x00b6
        L_0x00b2:
            android.content.ComponentName r6 = r6.startService(r7)     // Catch:{ SecurityException -> 0x00c0, IllegalStateException -> 0x00bd }
        L_0x00b6:
            if (r6 != 0) goto L_0x00bb
            r6 = 404(0x194, float:5.66E-43)
            return r6
        L_0x00bb:
            r6 = -1
            return r6
        L_0x00bd:
            r6 = 402(0x192, float:5.63E-43)
            return r6
        L_0x00c0:
            r6 = 401(0x191, float:5.62E-43)
            return r6
        L_0x00c3:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18356z.m60493c(android.content.Context, android.content.Intent):int");
    }
}
