package com.p280ss.android.message.p885a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.ss.android.message.a.f */
public final class C19820f implements ServiceConnection {

    /* renamed from: a */
    private Intent f53781a;

    /* renamed from: b */
    private boolean f53782b;

    /* renamed from: c */
    private Context f53783c;

    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f53783c.unbindService(this);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            android.os.Messenger r4 = new android.os.Messenger
            r4.<init>(r5)
            android.os.Message r5 = new android.os.Message
            r5.<init>()
            r0 = 1011(0x3f3, float:1.417E-42)
            r5.what = r0     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            android.os.Bundle r0 = r5.getData()     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            java.lang.String r1 = "intent"
            android.content.Intent r2 = r3.f53781a     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            r0.putParcelable(r1, r2)     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            r4.send(r5)     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            boolean r4 = r3.f53782b     // Catch:{ Throwable -> 0x0026 }
            if (r4 == 0) goto L_0x0025
            android.content.Context r4 = r3.f53783c     // Catch:{ Throwable -> 0x0026 }
            r4.unbindService(r3)     // Catch:{ Throwable -> 0x0026 }
        L_0x0025:
            return
        L_0x0026:
            return
        L_0x0027:
            r4 = move-exception
            boolean r5 = r3.f53782b     // Catch:{ Throwable -> 0x0031 }
            if (r5 == 0) goto L_0x0031
            android.content.Context r5 = r3.f53783c     // Catch:{ Throwable -> 0x0031 }
            r5.unbindService(r3)     // Catch:{ Throwable -> 0x0031 }
        L_0x0031:
            throw r4
        L_0x0032:
            boolean r4 = r3.f53782b     // Catch:{ Throwable -> 0x003c }
            if (r4 == 0) goto L_0x003b
            android.content.Context r4 = r3.f53783c     // Catch:{ Throwable -> 0x003c }
            r4.unbindService(r3)     // Catch:{ Throwable -> 0x003c }
        L_0x003b:
            return
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.p885a.C19820f.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    C19820f(Intent intent, boolean z, Context context) {
        this.f53781a = intent;
        this.f53782b = z;
        this.f53783c = context;
    }
}
