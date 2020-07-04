package com.bytedance.polaris.browser.p635a.p636a;

import android.app.Activity;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.polaris.browser.a.a.e */
final class C12399e extends Thread {

    /* renamed from: a */
    private final String f32926a;

    /* renamed from: b */
    private final String f32927b;

    /* renamed from: c */
    private final String f32928c;

    /* renamed from: d */
    private final String f32929d;

    /* renamed from: e */
    private final String f32930e;

    /* renamed from: f */
    private final Handler f32931f;

    /* renamed from: g */
    private final WeakReference<Activity> f32932g;

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8 A[Catch:{ Exception -> 0x010b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r0 = 14
            r1 = 0
            r2 = 18
            java.lang.String r3 = r12.f32927b     // Catch:{ Exception -> 0x010b }
            java.lang.String r4 = r12.f32926a     // Catch:{ Exception -> 0x010b }
            java.lang.String r5 = r12.f32928c     // Catch:{ Exception -> 0x010b }
            boolean r6 = com.bytedance.polaris.p634b.C12370u.m35938d(r4)     // Catch:{ Exception -> 0x010b }
            r7 = 1
            if (r6 == 0) goto L_0x00e1
            android.net.Uri r6 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x010b }
            boolean r8 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ Exception -> 0x010b }
            if (r8 != 0) goto L_0x0026
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x010b }
            r8.<init>(r5)     // Catch:{ Exception -> 0x010b }
            java.util.Map r8 = com.bytedance.polaris.p634b.C12354h.m35890a(r8)     // Catch:{ Exception -> 0x010b }
            goto L_0x002b
        L_0x0026:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x010b }
            r8.<init>()     // Catch:{ Exception -> 0x010b }
        L_0x002b:
            com.bytedance.polaris.p634b.C12370u.m35934a(r8, r7)     // Catch:{ Exception -> 0x010b }
            java.lang.String r9 = r3.toLowerCase()     // Catch:{ Exception -> 0x010b }
            java.lang.String r10 = "get"
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x010b }
            r10 = 20480(0x5000, float:2.8699E-41)
            if (r9 == 0) goto L_0x007d
            android.net.Uri$Builder r3 = r6.buildUpon()     // Catch:{ Exception -> 0x010b }
            if (r8 == 0) goto L_0x006c
            boolean r4 = r8.isEmpty()     // Catch:{ Exception -> 0x010b }
            if (r4 != 0) goto L_0x006c
            java.util.Set r4 = r8.keySet()     // Catch:{ Exception -> 0x010b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x010b }
        L_0x0050:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x010b }
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x010b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x010b }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x010b }
            if (r6 != 0) goto L_0x0050
            java.lang.Object r6 = r8.get(r5)     // Catch:{ Exception -> 0x010b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x010b }
            r3.appendQueryParameter(r5, r6)     // Catch:{ Exception -> 0x010b }
            goto L_0x0050
        L_0x006c:
            com.bytedance.polaris.depend.e r4 = com.bytedance.polaris.depend.C12428i.m36159i()     // Catch:{ Throwable -> 0x00e1 }
            android.net.Uri r3 = r3.build()     // Catch:{ Throwable -> 0x00e1 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x00e1 }
            java.lang.String r3 = r4.mo30313a(r10, r3)     // Catch:{ Throwable -> 0x00e1 }
            goto L_0x00e2
        L_0x007d:
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Exception -> 0x010b }
            java.lang.String r6 = "post"
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x00e1
            java.lang.String r3 = r12.f32930e     // Catch:{ Exception -> 0x010b }
            java.lang.String r6 = "json"
            boolean r3 = r6.equals(r3)     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x00a4
            java.lang.String r3 = "UTF-8"
            byte[] r3 = r5.getBytes(r3)     // Catch:{ Exception -> 0x010b }
            com.bytedance.polaris.depend.e r5 = com.bytedance.polaris.depend.C12428i.m36159i()     // Catch:{ Exception -> 0x010b }
            java.lang.String r6 = "application/json; charset=utf-8"
            java.lang.String r3 = r5.mo30315a(r10, r4, r3, r6)     // Catch:{ Exception -> 0x010b }
            goto L_0x00e2
        L_0x00a4:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x010b }
            r3.<init>()     // Catch:{ Exception -> 0x010b }
            if (r8 == 0) goto L_0x00d8
            boolean r5 = r8.isEmpty()     // Catch:{ Exception -> 0x010b }
            if (r5 != 0) goto L_0x00d8
            java.util.Set r5 = r8.keySet()     // Catch:{ Exception -> 0x010b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x010b }
        L_0x00b9:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x010b }
            if (r6 == 0) goto L_0x00d8
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x010b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x010b }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x010b }
            if (r9 != 0) goto L_0x00b9
            android.util.Pair r9 = new android.util.Pair     // Catch:{ Exception -> 0x010b }
            java.lang.Object r11 = r8.get(r6)     // Catch:{ Exception -> 0x010b }
            r9.<init>(r6, r11)     // Catch:{ Exception -> 0x010b }
            r3.add(r9)     // Catch:{ Exception -> 0x010b }
            goto L_0x00b9
        L_0x00d8:
            com.bytedance.polaris.depend.e r5 = com.bytedance.polaris.depend.C12428i.m36159i()     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = r5.mo30314a(r10, r4, r3)     // Catch:{ Exception -> 0x010b }
            goto L_0x00e2
        L_0x00e1:
            r3 = r1
        L_0x00e2:
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Exception -> 0x010b }
            if (r4 == 0) goto L_0x00ea
            r2 = 17
        L_0x00ea:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x010b }
            r4.<init>(r3)     // Catch:{ Exception -> 0x010b }
            android.os.Message r3 = android.os.Message.obtain()     // Catch:{ Exception -> 0x010b }
            r3.what = r0     // Catch:{ Exception -> 0x010b }
            r3.arg1 = r7     // Catch:{ Exception -> 0x010b }
            java.lang.String r5 = r12.f32929d     // Catch:{ Exception -> 0x010b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x010b }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x010b }
            r3.arg2 = r5     // Catch:{ Exception -> 0x010b }
            r3.obj = r4     // Catch:{ Exception -> 0x010b }
            android.os.Handler r4 = r12.f32931f     // Catch:{ Exception -> 0x010b }
            r4.sendMessage(r3)     // Catch:{ Exception -> 0x010b }
            return
        L_0x010b:
            r3 = move-exception
            java.lang.ref.WeakReference<android.app.Activity> r4 = r12.f32932g
            if (r4 == 0) goto L_0x0118
            java.lang.ref.WeakReference<android.app.Activity> r1 = r12.f32932g
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x0118:
            if (r1 == 0) goto L_0x0122
            com.bytedance.polaris.depend.c r2 = com.bytedance.polaris.depend.C12428i.m36155e()
            int r2 = r2.mo30305a(r1, r3)
        L_0x0122:
            java.lang.String r1 = r3.getMessage()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "errorCode"
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r2 = "errorMessage"
            r3.put(r2, r1)     // Catch:{ JSONException -> 0x0135 }
        L_0x0135:
            android.os.Message r1 = android.os.Message.obtain()
            r1.what = r0
            r0 = 0
            r1.arg1 = r0
            java.lang.String r0 = r12.f32929d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            r1.arg2 = r0
            r1.obj = r3
            android.os.Handler r0 = r12.f32931f
            r0.sendMessage(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.p635a.p636a.C12399e.run():void");
    }

    C12399e(Handler handler, WeakReference<Activity> weakReference, String str, String str2, String str3, String str4, String str5) {
        this.f32931f = handler;
        this.f32932g = weakReference;
        this.f32926a = str;
        this.f32927b = str2;
        this.f32928c = str3;
        this.f32930e = str4;
        this.f32929d = str5;
    }
}
