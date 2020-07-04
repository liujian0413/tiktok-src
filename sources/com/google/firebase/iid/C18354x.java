package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.p022v4.util.C0904k;
import android.util.Log;
import com.google.android.gms.tasks.C17058g;
import com.google.android.gms.tasks.C17061i;
import com.google.firebase.iid.zzl.C18357a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.iid.x */
final class C18354x {

    /* renamed from: a */
    private static int f49850a;

    /* renamed from: b */
    private static PendingIntent f49851b;

    /* renamed from: c */
    private final C0904k<String, C17058g<Bundle>> f49852c = new C0904k<>();

    /* renamed from: d */
    private final Context f49853d;

    /* renamed from: e */
    private final C18348r f49854e;

    /* renamed from: f */
    private Messenger f49855f;

    /* renamed from: g */
    private Messenger f49856g;

    /* renamed from: h */
    private zzl f49857h;

    public C18354x(Context context, C18348r rVar) {
        this.f49853d = context;
        this.f49854e = rVar;
        this.f49855f = new Messenger(new C18355y(this, Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m60482a(Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new C18357a());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof zzl) {
                    this.f49857h = (zzl) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.f49856g = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            String action = intent2.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "Unexpected response action: ";
                    String valueOf = String.valueOf(action);
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return;
                    }
                    new String(str);
                }
                return;
            }
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str2 = "Received InstanceID error ";
                        String valueOf2 = String.valueOf(stringExtra2);
                        if (valueOf2.length() != 0) {
                            str2.concat(valueOf2);
                        } else {
                            new String(str2);
                        }
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length <= 2 || !"ID".equals(split[1])) {
                            String str3 = "Unexpected structured response ";
                            String valueOf3 = String.valueOf(stringExtra2);
                            if (valueOf3.length() != 0) {
                                str3.concat(valueOf3);
                            } else {
                                new String(str3);
                            }
                        } else {
                            String str4 = split[2];
                            String str5 = split[3];
                            if (str5.startsWith(":")) {
                                str5 = str5.substring(1);
                            }
                            m60484a(str4, intent2.putExtra("error", str5).getExtras());
                        }
                    } else {
                        synchronized (this.f49852c) {
                            for (int i = 0; i < this.f49852c.size(); i++) {
                                m60484a((String) this.f49852c.mo3417b(i), intent2.getExtras());
                            }
                        }
                    }
                }
            } else {
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str6 = "Unexpected response string: ";
                        String valueOf4 = String.valueOf(stringExtra);
                        if (valueOf4.length() != 0) {
                            str6.concat(valueOf4);
                            return;
                        }
                        new String(str6);
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                m60484a(group, extras);
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m60481a(Context context, Intent intent) {
        synchronized (C18354x.class) {
            if (f49851b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f49851b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f49851b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m60484a(java.lang.String r3, android.os.Bundle r4) {
        /*
            r2 = this;
            android.support.v4.util.k<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r0 = r2.f49852c
            monitor-enter(r0)
            android.support.v4.util.k<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r1 = r2.f49852c     // Catch:{ all -> 0x0029 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.tasks.g r1 = (com.google.android.gms.tasks.C17058g) r1     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0029 }
            int r1 = r3.length()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001d
            r4.concat(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0022
        L_0x001d:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0029 }
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0024:
            r1.mo44299a(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18354x.m60484a(java.lang.String, android.os.Bundle):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo47273a(Bundle bundle) throws IOException {
        if (this.f49854e.mo47270d() < 12000000) {
            return m60485b(bundle);
        }
        try {
            return (Bundle) C17061i.m56598a(C18336f.m60445a(this.f49853d).mo47248b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (!(e.getCause() instanceof zzal) || ((zzal) e.getCause()).getErrorCode() != 4) {
                return null;
            }
            return m60485b(bundle);
        }
    }

    /* renamed from: b */
    private final Bundle m60485b(Bundle bundle) throws IOException {
        Bundle c = m60486c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = m60486c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
    }

    /* renamed from: a */
    private static synchronized String m60480a() {
        String num;
        synchronized (C18354x.class) {
            int i = f49850a;
            f49850a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m60486c(android.os.Bundle r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = m60480a()
            com.google.android.gms.tasks.g r1 = new com.google.android.gms.tasks.g
            r1.<init>()
            android.support.v4.util.k<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r2 = r6.f49852c
            monitor-enter(r2)
            android.support.v4.util.k<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r3 = r6.f49852c     // Catch:{ all -> 0x00dc }
            r3.put(r0, r1)     // Catch:{ all -> 0x00dc }
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            com.google.firebase.iid.r r2 = r6.f49854e
            int r2 = r2.mo47267a()
            if (r2 == 0) goto L_0x00d4
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.r r3 = r6.f49854e
            int r3 = r3.mo47267a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r7)
            android.content.Context r7 = r6.f49853d
            m60481a(r7, r2)
            java.lang.String r7 = "kid"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "|ID|"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.putExtra(r7, r3)
            java.lang.String r7 = "google.messenger"
            android.os.Messenger r3 = r6.f49855f
            r2.putExtra(r7, r3)
            android.os.Messenger r7 = r6.f49856g
            if (r7 != 0) goto L_0x0074
            com.google.firebase.iid.zzl r7 = r6.f49857h
            if (r7 == 0) goto L_0x008a
        L_0x0074:
            android.os.Message r7 = android.os.Message.obtain()
            r7.obj = r2
            android.os.Messenger r3 = r6.f49856g     // Catch:{ RemoteException -> 0x008a }
            if (r3 == 0) goto L_0x0084
            android.os.Messenger r3 = r6.f49856g     // Catch:{ RemoteException -> 0x008a }
            r3.send(r7)     // Catch:{ RemoteException -> 0x008a }
            goto L_0x009d
        L_0x0084:
            com.google.firebase.iid.zzl r3 = r6.f49857h     // Catch:{ RemoteException -> 0x008a }
            r3.mo47281a(r7)     // Catch:{ RemoteException -> 0x008a }
            goto L_0x009d
        L_0x008a:
            com.google.firebase.iid.r r7 = r6.f49854e
            int r7 = r7.mo47267a()
            if (r7 != r4) goto L_0x0098
            android.content.Context r7 = r6.f49853d
            r7.sendBroadcast(r2)
            goto L_0x009d
        L_0x0098:
            android.content.Context r7 = r6.f49853d
            r7.startService(r2)
        L_0x009d:
            com.google.android.gms.tasks.y<TResult> r7 = r1.f47728a     // Catch:{ InterruptedException | TimeoutException -> 0x00bf, ExecutionException -> 0x00b8 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00bf, ExecutionException -> 0x00b8 }
            java.lang.Object r7 = com.google.android.gms.tasks.C17061i.m56599a(r7, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00bf, ExecutionException -> 0x00b8 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ InterruptedException | TimeoutException -> 0x00bf, ExecutionException -> 0x00b8 }
            android.support.v4.util.k<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r1 = r6.f49852c
            monitor-enter(r1)
            android.support.v4.util.k<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r2 = r6.f49852c     // Catch:{ all -> 0x00b3 }
            r2.remove(r0)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            return r7
        L_0x00b3:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            throw r7
        L_0x00b6:
            r7 = move-exception
            goto L_0x00c7
        L_0x00b8:
            r7 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00b6 }
            r1.<init>(r7)     // Catch:{ all -> 0x00b6 }
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00bf:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "TIMEOUT"
            r7.<init>(r1)     // Catch:{ all -> 0x00b6 }
            throw r7     // Catch:{ all -> 0x00b6 }
        L_0x00c7:
            android.support.v4.util.k<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r1 = r6.f49852c
            monitor-enter(r1)
            android.support.v4.util.k<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r2 = r6.f49852c     // Catch:{ all -> 0x00d1 }
            r2.remove(r0)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d1 }
            throw r7
        L_0x00d1:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d1 }
            throw r7
        L_0x00d4:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r7.<init>(r0)
            throw r7
        L_0x00dc:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18354x.m60486c(android.os.Bundle):android.os.Bundle");
    }
}
