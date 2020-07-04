package com.p280ss.android.ugc.aweme.main.guide;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Calendar;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.guide.a */
public final class C33040a {

    /* renamed from: a */
    public static final String f86001a = f86001a;

    /* renamed from: b */
    public static final String f86002b = f86002b;

    /* renamed from: c */
    public static final int f86003c = f86003c;

    /* renamed from: d */
    public static final String f86004d = f86004d;

    /* renamed from: e */
    public static final String f86005e = f86005e;

    /* renamed from: f */
    public static final String f86006f = f86006f;

    /* renamed from: g */
    public static final C33041a f86007g = new C33041a(null);

    /* renamed from: com.ss.android.ugc.aweme.main.guide.a$a */
    public static final class C33041a {
        private C33041a() {
        }

        /* renamed from: a */
        public static C33040a m106716a() {
            return C33042b.m106717a();
        }

        public /* synthetic */ C33041a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.guide.a$b */
    static final class C33042b {

        /* renamed from: a */
        public static final C33042b f86008a = new C33042b();

        /* renamed from: b */
        private static final C33040a f86009b = new C33040a();

        private C33042b() {
        }

        /* renamed from: a */
        public static C33040a m106717a() {
            return f86009b;
        }
    }

    /* renamed from: d */
    private static SharedPreferences m106711d(Context context) {
        SharedPreferences a = C7285c.m22838a(context, f86001a, 0);
        C7573i.m23582a((Object) a, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return a;
    }

    /* renamed from: a */
    public final void mo84730a(Context context) {
        C7573i.m23587b(context, "context");
        m106711d(context).edit().putBoolean(f86006f, false).apply();
    }

    /* renamed from: c */
    public final boolean mo84733c(Context context) {
        C7573i.m23587b(context, "context");
        String string = m106711d(context).getString(f86002b, "0");
        if (string == null) {
            return false;
        }
        try {
            float parseFloat = Float.parseFloat(string);
            if (parseFloat == 0.0f) {
                return false;
            }
            if (((float) System.currentTimeMillis()) - parseFloat < ((float) f86003c)) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo84732b(Context context) {
        C7573i.m23587b(context, "context");
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "calendar");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        m106711d(context).edit().putString(f86002b, String.valueOf(instance.getTimeInMillis())).apply();
    }

    /* renamed from: a */
    private static boolean m106709a(Context context, int i) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        long j = 0;
        if (packageInfo != null) {
            j = packageInfo.firstInstallTime;
        }
        if (System.currentTimeMillis() - j < ((long) (i * f86003c))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ca, code lost:
        if (r15.getCount() < r0) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84731a(android.content.Context r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r19
            java.lang.String r1 = "context"
            r2 = r17
            kotlin.jvm.internal.C7573i.m23587b(r2, r1)
            boolean r1 = m106709a(r17, r18)
            r2 = 0
            if (r1 != 0) goto L_0x0011
            return r2
        L_0x0011:
            r1 = 0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ all -> 0x00da }
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r4 = com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r3 = r3.getService(r4)     // Catch:{ all -> 0x00da }
            java.lang.String r4 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ all -> 0x00da }
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r3 = (com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r3     // Catch:{ all -> 0x00da }
            android.database.sqlite.SQLiteDatabase r3 = r3.getAppOpenReadDB()     // Catch:{ all -> 0x00da }
            r5 = 1
            java.lang.String r6 = f86004d     // Catch:{ all -> 0x00da }
            r7 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r4.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r8 = f86005e     // Catch:{ all -> 0x00da }
            r4.append(r8)     // Catch:{ all -> 0x00da }
            java.lang.String r8 = " > ?"
            r4.append(r8)     // Catch:{ all -> 0x00da }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00da }
            r14 = 1
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ all -> 0x00da }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00da }
            int r4 = f86003c     // Catch:{ all -> 0x00da }
            int r4 = r4 * r18
            long r12 = (long) r4     // Catch:{ all -> 0x00da }
            long r10 = r10 - r12
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00da }
            r9[r2] = r4     // Catch:{ all -> 0x00da }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r4 = r3
            android.database.Cursor r15 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00da }
            if (r15 != 0) goto L_0x0062
            if (r15 == 0) goto L_0x0061
            r15.close()
        L_0x0061:
            return r2
        L_0x0062:
            java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "calendar"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ all -> 0x00d8 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d8 }
            r4.setTimeInMillis(r5)     // Catch:{ all -> 0x00d8 }
            r5 = 11
            r4.set(r5, r2)     // Catch:{ all -> 0x00d8 }
            r5 = 12
            r4.set(r5, r2)     // Catch:{ all -> 0x00d8 }
            r5 = 13
            r4.set(r5, r2)     // Catch:{ all -> 0x00d8 }
            r5 = 14
            r4.set(r5, r2)     // Catch:{ all -> 0x00d8 }
            r5 = 1
            java.lang.String r6 = f86004d     // Catch:{ all -> 0x00d8 }
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d8 }
            r8.<init>()     // Catch:{ all -> 0x00d8 }
            java.lang.String r9 = f86005e     // Catch:{ all -> 0x00d8 }
            r8.append(r9)     // Catch:{ all -> 0x00d8 }
            java.lang.String r9 = " = ?"
            r8.append(r9)     // Catch:{ all -> 0x00d8 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00d8 }
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ all -> 0x00d8 }
            long r10 = r4.getTimeInMillis()     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00d8 }
            r9[r2] = r4     // Catch:{ all -> 0x00d8 }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r4 = r3
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "todayCursor"
            kotlin.jvm.internal.C7573i.m23582a(r3, r1)     // Catch:{ all -> 0x00d5 }
            int r1 = r3.getCount()     // Catch:{ all -> 0x00d5 }
            if (r1 <= 0) goto L_0x00c6
            int r1 = r15.getCount()     // Catch:{ all -> 0x00d5 }
            if (r1 > r0) goto L_0x00c4
            goto L_0x00cc
        L_0x00c4:
            r14 = 0
            goto L_0x00cc
        L_0x00c6:
            int r1 = r15.getCount()     // Catch:{ all -> 0x00d5 }
            if (r1 >= r0) goto L_0x00c4
        L_0x00cc:
            if (r15 == 0) goto L_0x00d1
            r15.close()
        L_0x00d1:
            r3.close()
            return r14
        L_0x00d5:
            r0 = move-exception
            r1 = r3
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            goto L_0x00dc
        L_0x00da:
            r0 = move-exception
            r15 = r1
        L_0x00dc:
            if (r15 == 0) goto L_0x00e1
            r15.close()
        L_0x00e1:
            if (r1 == 0) goto L_0x00e6
            r1.close()
        L_0x00e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.main.guide.C33040a.mo84731a(android.content.Context, int, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m106710a(android.content.Context r12, int r13, int r14, boolean r15) {
        /*
            java.lang.String r15 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r12, r15)
            r12 = 0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r15 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ all -> 0x00c6 }
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r0 = com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r15 = r15.getService(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r15, r0)     // Catch:{ all -> 0x00c6 }
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r15 = (com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r15     // Catch:{ all -> 0x00c6 }
            android.database.sqlite.SQLiteDatabase r15 = r15.getAppOpenReadDB()     // Catch:{ all -> 0x00c6 }
            r1 = 1
            java.lang.String r2 = f86004d     // Catch:{ all -> 0x00c6 }
            r3 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = f86005e     // Catch:{ all -> 0x00c6 }
            r0.append(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = " > ?"
            r0.append(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x00c6 }
            r10 = 1
            java.lang.String[] r5 = new java.lang.String[r10]     // Catch:{ all -> 0x00c6 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c6 }
            int r0 = f86003c     // Catch:{ all -> 0x00c6 }
            int r13 = r13 * r0
            long r8 = (long) r13     // Catch:{ all -> 0x00c6 }
            long r6 = r6 - r8
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c6 }
            r11 = 0
            r5[r11] = r13     // Catch:{ all -> 0x00c6 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r15
            android.database.Cursor r13 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c6 }
            if (r13 != 0) goto L_0x0052
            return r11
        L_0x0052:
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "calendar"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ all -> 0x00c4 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c4 }
            r0.setTimeInMillis(r1)     // Catch:{ all -> 0x00c4 }
            r1 = 11
            r0.set(r1, r11)     // Catch:{ all -> 0x00c4 }
            r1 = 12
            r0.set(r1, r11)     // Catch:{ all -> 0x00c4 }
            r1 = 13
            r0.set(r1, r11)     // Catch:{ all -> 0x00c4 }
            r1 = 14
            r0.set(r1, r11)     // Catch:{ all -> 0x00c4 }
            r1 = 1
            java.lang.String r2 = f86004d     // Catch:{ all -> 0x00c4 }
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = f86005e     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = " = ?"
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c4 }
            java.lang.String[] r5 = new java.lang.String[r10]     // Catch:{ all -> 0x00c4 }
            long r6 = r0.getTimeInMillis()     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c4 }
            r5[r11] = r0     // Catch:{ all -> 0x00c4 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r15
            android.database.Cursor r15 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c4 }
            java.lang.String r12 = "todayCursor"
            kotlin.jvm.internal.C7573i.m23582a(r15, r12)     // Catch:{ all -> 0x00c0 }
            int r12 = r15.getCount()     // Catch:{ all -> 0x00c0 }
            if (r12 <= 0) goto L_0x00af
            r12 = 0
            goto L_0x00b0
        L_0x00af:
            r12 = 1
        L_0x00b0:
            int r0 = r13.getCount()     // Catch:{ all -> 0x00c0 }
            int r0 = r0 + r12
            if (r0 < r14) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r10 = 0
        L_0x00b9:
            r13.close()
            r15.close()
            return r10
        L_0x00c0:
            r12 = move-exception
            r14 = r12
            r12 = r15
            goto L_0x00c9
        L_0x00c4:
            r14 = move-exception
            goto L_0x00c9
        L_0x00c6:
            r13 = move-exception
            r14 = r13
            r13 = r12
        L_0x00c9:
            if (r13 == 0) goto L_0x00ce
            r13.close()
        L_0x00ce:
            if (r12 == 0) goto L_0x00d3
            r12.close()
        L_0x00d3:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.main.guide.C33040a.m106710a(android.content.Context, int, int, boolean):boolean");
    }
}
