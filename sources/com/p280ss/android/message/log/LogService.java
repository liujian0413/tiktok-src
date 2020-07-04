package com.p280ss.android.message.log;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.message.C19846k;
import com.p280ss.android.pushmanager.app.C20044c;
import com.p280ss.android.pushmanager.app.C20044c.C20045a;

/* renamed from: com.ss.android.message.log.LogService */
public class LogService extends Service implements C6310a {

    /* renamed from: a */
    private Messenger f53816a;

    public void onCreate() {
        super.onCreate();
        try {
            C20045a a = C20044c.m66004a();
            if (a != null) {
                a.mo53663a(this);
            }
        } catch (Throwable unused) {
        }
        this.f53816a = new Messenger(new C6309f(C19846k.m65542a().f53813a, this));
    }

    public IBinder onBind(Intent intent) {
        return this.f53816a.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r9) {
        /*
            r8 = this;
            r0 = 0
            com.ss.android.message.log.a r1 = com.p280ss.android.message.log.C19848a.m65546a(r8)     // Catch:{ Exception -> 0x0006 }
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            int r2 = r9.what     // Catch:{ Throwable -> 0x008d }
            r3 = 0
            r4 = 2
            switch(r2) {
                case 0: goto L_0x0037;
                case 1: goto L_0x0010;
                default: goto L_0x000e;
            }     // Catch:{ Throwable -> 0x008d }
        L_0x000e:
            goto L_0x008c
        L_0x0010:
            android.os.Messenger r2 = r9.replyTo     // Catch:{ Throwable -> 0x008d }
            if (r2 == 0) goto L_0x008c
            android.os.Messenger r2 = r9.replyTo     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r9 = r9.obj     // Catch:{ Throwable -> 0x008d }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ Throwable -> 0x008d }
            java.lang.String r5 = "event_ids"
            long[] r9 = r9.getLongArray(r5)     // Catch:{ Throwable -> 0x008d }
            if (r9 == 0) goto L_0x008c
            if (r1 != 0) goto L_0x002c
            android.os.Message r9 = android.os.Message.obtain(r0, r4)     // Catch:{ Throwable -> 0x008d }
            r2.send(r9)     // Catch:{ Throwable -> 0x008d }
            return
        L_0x002c:
            int r0 = r9.length     // Catch:{ Throwable -> 0x008d }
        L_0x002d:
            if (r3 >= r0) goto L_0x008c
            r4 = r9[r3]     // Catch:{ Throwable -> 0x008d }
            r1.mo53212a(r4)     // Catch:{ Throwable -> 0x008d }
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0037:
            android.os.Messenger r2 = r9.replyTo     // Catch:{ Throwable -> 0x008d }
            if (r2 == 0) goto L_0x008c
            android.os.Messenger r2 = r9.replyTo     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r9 = r9.obj     // Catch:{ Throwable -> 0x008d }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ Throwable -> 0x008d }
            java.lang.String r5 = "start_id"
            r6 = 0
            long r5 = r9.getLong(r5, r6)     // Catch:{ Throwable -> 0x008d }
            if (r1 != 0) goto L_0x0053
            android.os.Message r9 = android.os.Message.obtain(r0, r4)     // Catch:{ Throwable -> 0x008d }
            r2.send(r9)     // Catch:{ Throwable -> 0x008d }
            return
        L_0x0053:
            r9 = 5
            org.json.JSONArray r1 = r1.mo53211a(r5, r9)     // Catch:{ Throwable -> 0x008d }
            if (r1 != 0) goto L_0x0062
            android.os.Message r9 = android.os.Message.obtain(r0, r4)     // Catch:{ Throwable -> 0x008d }
            r2.send(r9)     // Catch:{ Throwable -> 0x008d }
            return
        L_0x0062:
            android.os.Message r0 = android.os.Message.obtain(r0, r3)     // Catch:{ Throwable -> 0x008d }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Throwable -> 0x008d }
            r4.<init>()     // Catch:{ Throwable -> 0x008d }
            java.lang.String r5 = "events"
            java.lang.String r6 = r1.toString()     // Catch:{ Throwable -> 0x008d }
            r4.putString(r5, r6)     // Catch:{ Throwable -> 0x008d }
            int r1 = r1.length()     // Catch:{ Throwable -> 0x008d }
            if (r1 < r9) goto L_0x0081
            java.lang.String r9 = "has_more"
            r1 = 1
            r4.putBoolean(r9, r1)     // Catch:{ Throwable -> 0x008d }
            goto L_0x0086
        L_0x0081:
            java.lang.String r9 = "has_more"
            r4.putBoolean(r9, r3)     // Catch:{ Throwable -> 0x008d }
        L_0x0086:
            r0.obj = r4     // Catch:{ Throwable -> 0x008d }
            r2.send(r0)     // Catch:{ Throwable -> 0x008d }
            goto L_0x008d
        L_0x008c:
            return
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.log.LogService.handleMsg(android.os.Message):void");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
