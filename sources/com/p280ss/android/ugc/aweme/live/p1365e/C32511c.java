package com.p280ss.android.ugc.aweme.live.p1365e;

/* renamed from: com.ss.android.ugc.aweme.live.e.c */
public final class C32511c {

    /* renamed from: com.ss.android.ugc.aweme.live.e.c$a */
    public static class C32513a {

        /* renamed from: a */
        public boolean f84775a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m105305a(android.app.Activity r10, final com.p280ss.android.ugc.aweme.live.p1365e.C32511c.C32513a r11) {
        /*
            boolean r0 = r10.isTaskRoot()
            r1 = 1
            if (r0 == 0) goto L_0x000a
            r11.f84775a = r1
            return
        L_0x000a:
            r0 = 0
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Class[] r2 = r2.getDeclaredClasses()     // Catch:{ Throwable -> 0x008e }
            int r3 = r2.length     // Catch:{ Throwable -> 0x008e }
            r4 = 0
            r6 = r0
            r5 = 0
        L_0x0015:
            if (r5 >= r3) goto L_0x0029
            r7 = r2[r5]     // Catch:{ Throwable -> 0x008e }
            java.lang.String r8 = r7.getSimpleName()     // Catch:{ Throwable -> 0x008e }
            java.lang.String r9 = "TranslucentConversionListener"
            boolean r8 = r8.contains(r9)     // Catch:{ Throwable -> 0x008e }
            if (r8 == 0) goto L_0x0026
            r6 = r7
        L_0x0026:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x0029:
            if (r6 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.live.e.c$1 r2 = new com.ss.android.ugc.aweme.live.e.c$1     // Catch:{ Throwable -> 0x008e }
            r2.<init>(r11)     // Catch:{ Throwable -> 0x008e }
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch:{ Throwable -> 0x008e }
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x008e }
            r5[r4] = r6     // Catch:{ Throwable -> 0x008e }
            java.lang.Object r2 = java.lang.reflect.Proxy.newProxyInstance(r3, r5, r2)     // Catch:{ Throwable -> 0x008e }
            goto L_0x003e
        L_0x003d:
            r2 = r0
        L_0x003e:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x008f }
            r5 = 21
            if (r3 < r5) goto L_0x0077
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r5 = "getActivityOptions"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0058 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r7)     // Catch:{ Exception -> 0x0058 }
            r3.setAccessible(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r3 = r3.invoke(r10, r5)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0059
        L_0x0058:
            r3 = r0
        L_0x0059:
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            java.lang.String r7 = "convertToTranslucent"
            r8 = 2
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x008f }
            r9[r4] = r6     // Catch:{ Throwable -> 0x008f }
            java.lang.Class<android.app.ActivityOptions> r6 = android.app.ActivityOptions.class
            r9[r1] = r6     // Catch:{ Throwable -> 0x008f }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r9)     // Catch:{ Throwable -> 0x008f }
            r5.setAccessible(r1)     // Catch:{ Throwable -> 0x008f }
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x008f }
            r6[r4] = r2     // Catch:{ Throwable -> 0x008f }
            r6[r1] = r3     // Catch:{ Throwable -> 0x008f }
            r5.invoke(r10, r6)     // Catch:{ Throwable -> 0x008f }
            goto L_0x0091
        L_0x0077:
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r5 = "convertToTranslucent"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x008f }
            r7[r4] = r6     // Catch:{ Throwable -> 0x008f }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r7)     // Catch:{ Throwable -> 0x008f }
            r3.setAccessible(r1)     // Catch:{ Throwable -> 0x008f }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x008f }
            r5[r4] = r2     // Catch:{ Throwable -> 0x008f }
            r3.invoke(r10, r5)     // Catch:{ Throwable -> 0x008f }
            goto L_0x0091
        L_0x008e:
            r2 = r0
        L_0x008f:
            r11.f84775a = r1
        L_0x0091:
            if (r2 != 0) goto L_0x0095
            r11.f84775a = r1
        L_0x0095:
            android.view.Window r10 = r10.getWindow()
            r10.setBackgroundDrawable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.live.p1365e.C32511c.m105305a(android.app.Activity, com.ss.android.ugc.aweme.live.e.c$a):void");
    }
}
