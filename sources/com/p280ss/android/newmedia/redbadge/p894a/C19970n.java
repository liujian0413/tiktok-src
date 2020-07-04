package com.p280ss.android.newmedia.redbadge.p894a;

import com.p280ss.android.newmedia.redbadge.C19953a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.n */
public class C19970n implements C19953a {
    /* renamed from: a */
    public final List<String> mo53458a() {
        return Arrays.asList(new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher"});
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.set(r0, java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53459a(android.content.Context r6, android.content.ComponentName r7, int r8) throws com.p280ss.android.newmedia.redbadge.RedBadgerException {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x00a1
            if (r7 != 0) goto L_0x0006
            goto L_0x00a1
        L_0x0006:
            if (r8 >= 0) goto L_0x0009
            r8 = 0
        L_0x0009:
            java.lang.String r0 = "android.app.MiuiNotification"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x003a }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Throwable -> 0x003a }
            java.lang.Class r1 = r0.getClass()     // Catch:{ Throwable -> 0x003a }
            java.lang.String r2 = "messageCount"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Throwable -> 0x003a }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ Throwable -> 0x003a }
            if (r8 != 0) goto L_0x0026
            java.lang.String r2 = ""
            goto L_0x002a
        L_0x0026:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0032 }
        L_0x002a:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x0032 }
            r1.set(r0, r2)     // Catch:{ Throwable -> 0x0032 }
            return
        L_0x0032:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x003a }
            r1.set(r0, r2)     // Catch:{ Throwable -> 0x003a }
            return
        L_0x003a:
            r0 = move-exception
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.APPLICATION_MESSAGE_UPDATE"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.extra.update_application_component_name"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.getPackageName()
            r3.append(r4)
            java.lang.String r4 = "/"
            r3.append(r4)
            java.lang.String r7 = r7.getClassName()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r1.putExtra(r2, r7)
            java.lang.String r7 = "android.intent.extra.update_application_message_text"
            if (r8 != 0) goto L_0x006a
            java.lang.String r8 = ""
            goto L_0x006e
        L_0x006a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
        L_0x006e:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r1.putExtra(r7, r8)
            boolean r7 = com.p280ss.android.newmedia.redbadge.p896c.C19981a.m65883a(r6, r1)
            if (r7 == 0) goto L_0x0089
            r6.sendBroadcast(r1)     // Catch:{ Throwable -> 0x007f }
            return
        L_0x007f:
            com.ss.android.newmedia.redbadge.RedBadgerException r6 = new com.ss.android.newmedia.redbadge.RedBadgerException
            java.lang.String r7 = r0.getMessage()
            r6.<init>(r7)
            throw r6
        L_0x0089:
            com.ss.android.newmedia.redbadge.RedBadgerException r6 = new com.ss.android.newmedia.redbadge.RedBadgerException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "unable to resolve intent: "
            r7.<init>(r8)
            java.lang.String r8 = r1.toString()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.redbadge.p894a.C19970n.mo53459a(android.content.Context, android.content.ComponentName, int):void");
    }
}
