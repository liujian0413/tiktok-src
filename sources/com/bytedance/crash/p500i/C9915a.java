package com.bytedance.crash.p500i;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.bytedance.crash.i.a */
public class C9915a {

    /* renamed from: a */
    private static volatile UUID f27040a = null;

    /* renamed from: b */
    private static String f27041b = "";

    /* renamed from: a */
    private static UUID m29326a() {
        return f27040a;
    }

    /* renamed from: a */
    public static synchronized String m29325a(Context context) {
        String str;
        synchronized (C9915a.class) {
            if (TextUtils.isEmpty(f27041b)) {
                new C9915a(context);
                UUID a = m29326a();
                if (a != null) {
                    f27041b = a.toString();
                }
            }
            str = f27041b;
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:10|11)|(3:15|16|17)(1:18)|19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|(1:9)(5:10|11|(3:15|16|17)(1:18)|19|20))|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9915a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.util.UUID r0 = f27040a
            if (r0 != 0) goto L_0x0053
            java.lang.Class<com.bytedance.crash.i.a> r0 = com.bytedance.crash.p500i.C9915a.class
            monitor-enter(r0)
            java.util.UUID r1 = f27040a     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x004e
            com.bytedance.crash.j.i r1 = com.bytedance.crash.p501j.C9957i.m29466a()     // Catch:{ all -> 0x0050 }
            r2 = 0
            java.lang.String r1 = r1.mo24582a(r2)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0020
            java.util.UUID r4 = java.util.UUID.fromString(r1)     // Catch:{ all -> 0x0050 }
            f27040a = r4     // Catch:{ all -> 0x0050 }
            goto L_0x004e
        L_0x0020:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Throwable -> 0x002b }
            java.lang.String r1 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r1)     // Catch:{ Throwable -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r4 = r2
        L_0x002c:
            if (r4 == 0) goto L_0x003b
            java.lang.String r1 = "utf8"
            byte[] r4 = r4.getBytes(r1)     // Catch:{ Throwable -> 0x0041 }
            java.util.UUID r4 = java.util.UUID.nameUUIDFromBytes(r4)     // Catch:{ Throwable -> 0x0041 }
            f27040a = r4     // Catch:{ Throwable -> 0x0041 }
            goto L_0x0041
        L_0x003b:
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch:{ Throwable -> 0x0041 }
            f27040a = r4     // Catch:{ Throwable -> 0x0041 }
        L_0x0041:
            com.bytedance.crash.j.i r4 = com.bytedance.crash.p501j.C9957i.m29466a()     // Catch:{ Throwable -> 0x004e }
            java.util.UUID r1 = f27040a     // Catch:{ Throwable -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x004e }
            r4.mo24587c(r1)     // Catch:{ Throwable -> 0x004e }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r4
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p500i.C9915a.<init>(android.content.Context):void");
    }
}
