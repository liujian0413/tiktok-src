package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.iid.C18356z;
import com.google.firebase.iid.zzb;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class FirebaseMessagingService extends zzb {
    private static final Queue<String> zzdr = new ArrayDeque(10);

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    public final Intent zzb(Intent intent) {
        return C18356z.m60489a().mo47276b();
    }

    public final boolean zzc(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException unused) {
            }
        }
        if (C18360b.m60506e(intent)) {
            C18360b.m60503b(intent);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (r0.equals("send_event") == false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0015
            goto L_0x0053
        L_0x0015:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0027
            boolean r0 = com.google.firebase.messaging.C18360b.m60506e(r10)
            if (r0 == 0) goto L_0x0052
            com.google.firebase.messaging.C18360b.m60504c(r10)
            return
        L_0x0027:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "token"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.onNewToken(r10)
            return
        L_0x0039:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.String r10 = r10.getAction()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r1 = r10.length()
            if (r1 == 0) goto L_0x004d
            r0.concat(r10)
            return
        L_0x004d:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0)
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 2
            if (r1 == 0) goto L_0x0066
            r1 = 0
            com.google.android.gms.tasks.f r1 = com.google.android.gms.tasks.C17061i.m56597a(r1)
            goto L_0x0078
        L_0x0066:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "google.message_id"
            r1.putString(r3, r0)
            com.google.firebase.iid.f r3 = com.google.firebase.iid.C18336f.m60445a(r9)
            com.google.android.gms.tasks.f r1 = r3.mo47247a(r2, r1)
        L_0x0078:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            r5 = 3
            r6 = 0
            if (r3 == 0) goto L_0x0083
        L_0x0081:
            r0 = 0
            goto L_0x00bf
        L_0x0083:
            java.util.Queue<java.lang.String> r3 = zzdr
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x00aa
            java.lang.String r3 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x00a8
            java.lang.String r3 = "Received duplicate message: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r7 = r0.length()
            if (r7 == 0) goto L_0x00a3
            r3.concat(r0)
            goto L_0x00a8
        L_0x00a3:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x00a8:
            r0 = 1
            goto L_0x00bf
        L_0x00aa:
            java.util.Queue<java.lang.String> r3 = zzdr
            int r3 = r3.size()
            r7 = 10
            if (r3 < r7) goto L_0x00b9
            java.util.Queue<java.lang.String> r3 = zzdr
            r3.remove()
        L_0x00b9:
            java.util.Queue<java.lang.String> r3 = zzdr
            r3.add(r0)
            goto L_0x0081
        L_0x00bf:
            if (r0 != 0) goto L_0x018c
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "gcm"
        L_0x00cb:
            r3 = -1
            int r7 = r0.hashCode()
            r8 = -2062414158(0xffffffff85120eb2, float:-6.867586E-36)
            if (r7 == r8) goto L_0x0102
            r4 = 102161(0x18f11, float:1.43158E-40)
            if (r7 == r4) goto L_0x00f8
            r4 = 814694033(0x308f3e91, float:1.0422402E-9)
            if (r7 == r4) goto L_0x00ee
            r4 = 814800675(0x3090df23, float:1.0540798E-9)
            if (r7 == r4) goto L_0x00e5
            goto L_0x010c
        L_0x00e5:
            java.lang.String r4 = "send_event"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x010c
            goto L_0x010d
        L_0x00ee:
            java.lang.String r2 = "send_error"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 3
            goto L_0x010d
        L_0x00f8:
            java.lang.String r2 = "gcm"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 0
            goto L_0x010d
        L_0x0102:
            java.lang.String r2 = "deleted_messages"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 1
            goto L_0x010d
        L_0x010c:
            r2 = -1
        L_0x010d:
            switch(r2) {
                case 0: goto L_0x014b;
                case 1: goto L_0x0147;
                case 2: goto L_0x013d;
                case 3: goto L_0x0120;
                default: goto L_0x0110;
            }
        L_0x0110:
            java.lang.String r10 = "Received message with unknown type: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0187
            r10.concat(r0)
            goto L_0x018c
        L_0x0120:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
        L_0x012e:
            com.google.firebase.messaging.SendException r2 = new com.google.firebase.messaging.SendException
            java.lang.String r3 = "error"
            java.lang.String r10 = r10.getStringExtra(r3)
            r2.<init>(r10)
            r9.onSendError(r0, r2)
            goto L_0x018c
        L_0x013d:
            java.lang.String r0 = "google.message_id"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.onMessageSent(r10)
            goto L_0x018c
        L_0x0147:
            r9.onDeletedMessages()
            goto L_0x018c
        L_0x014b:
            boolean r0 = com.google.firebase.messaging.C18360b.m60506e(r10)
            if (r0 == 0) goto L_0x0154
            com.google.firebase.messaging.C18360b.m60501a(r10)
        L_0x0154:
            android.os.Bundle r0 = r10.getExtras()
            if (r0 != 0) goto L_0x015f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x015f:
            java.lang.String r2 = "android.support.content.wakelockid"
            r0.remove(r2)
            boolean r2 = com.google.firebase.messaging.C18361c.m60512a(r0)
            if (r2 == 0) goto L_0x017e
            com.google.firebase.messaging.c r2 = new com.google.firebase.messaging.c
            r2.<init>(r9)
            boolean r2 = r2.mo47294b(r0)
            if (r2 != 0) goto L_0x018c
            boolean r2 = com.google.firebase.messaging.C18360b.m60506e(r10)
            if (r2 == 0) goto L_0x017e
            com.google.firebase.messaging.C18360b.m60505d(r10)
        L_0x017e:
            com.google.firebase.messaging.RemoteMessage r10 = new com.google.firebase.messaging.RemoteMessage
            r10.<init>(r0)
            r9.onMessageReceived(r10)
            goto L_0x018c
        L_0x0187:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x018c:
            r2 = 1
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0194 }
            com.google.android.gms.tasks.C17061i.m56599a(r1, r2, r10)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0194 }
            return
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.zzd(android.content.Intent):void");
    }

    static void zzj(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }
}
