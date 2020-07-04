package com.p280ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.ss.android.newmedia.redbadge.k */
public final class C19995k implements ServiceConnection {

    /* renamed from: a */
    private Intent f54116a;

    /* renamed from: b */
    private boolean f54117b = true;

    /* renamed from: c */
    private Context f54118c;

    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f54118c.unbindService(this);
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
            r0 = 101(0x65, float:1.42E-43)
            r5.what = r0     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            android.os.Bundle r0 = r5.getData()     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            java.lang.String r1 = "intent"
            android.content.Intent r2 = r3.f54116a     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            r0.putParcelable(r1, r2)     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            r4.send(r5)     // Catch:{ Exception -> 0x0032, all -> 0x0027 }
            boolean r4 = r3.f54117b     // Catch:{ Throwable -> 0x0026 }
            if (r4 == 0) goto L_0x0025
            android.content.Context r4 = r3.f54118c     // Catch:{ Throwable -> 0x0026 }
            r4.unbindService(r3)     // Catch:{ Throwable -> 0x0026 }
        L_0x0025:
            return
        L_0x0026:
            return
        L_0x0027:
            r4 = move-exception
            boolean r5 = r3.f54117b     // Catch:{ Throwable -> 0x0031 }
            if (r5 == 0) goto L_0x0031
            android.content.Context r5 = r3.f54118c     // Catch:{ Throwable -> 0x0031 }
            r5.unbindService(r3)     // Catch:{ Throwable -> 0x0031 }
        L_0x0031:
            throw r4
        L_0x0032:
            boolean r4 = r3.f54117b     // Catch:{ Throwable -> 0x003c }
            if (r4 == 0) goto L_0x003b
            android.content.Context r4 = r3.f54118c     // Catch:{ Throwable -> 0x003c }
            r4.unbindService(r3)     // Catch:{ Throwable -> 0x003c }
        L_0x003b:
            return
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.redbadge.C19995k.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    C19995k(Intent intent, boolean z, Context context) {
        this.f54116a = intent;
        this.f54118c = context;
    }
}
