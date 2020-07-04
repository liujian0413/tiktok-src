package com.p280ss.sys.p1799a;

import android.content.Context;
import com.p280ss.sys.p1799a.p1800a.C45924a;

/* renamed from: com.ss.sys.a.b */
public final class C45925b implements Runnable {

    /* renamed from: a */
    private C45924a f117397a;

    /* renamed from: b */
    private Context f117398b;

    C45925b(Context context, C45924a aVar) {
        this.f117397a = aVar;
        this.f117398b = context;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        com.p280ss.sys.p1799a.C45923a.m144033a().f117392b = com.p280ss.android.vesdk.filterparam.VETransitionFilterParam.TransitionDuration_DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0107, code lost:
        r0 = com.p280ss.sys.ces.C45939c.m144077a();
        r1 = new java.lang.StringBuilder("SS-");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0130, code lost:
        r1 = com.p280ss.sys.ces.C45939c.m144077a();
        r3 = new java.lang.StringBuilder("SS-");
        r3.append(com.p280ss.sys.p1799a.C45923a.m144033a().f117392b);
        r1.reportNow(r3.toString(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x014b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00ff */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b6 A[Catch:{ Throwable -> 0x00ff }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111210a() {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = com.p280ss.p811a.p812a.C18875a.m61607a()
            r2 = 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ff }
            r3.<init>()     // Catch:{ Throwable -> 0x00ff }
            r3.append(r1)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r1 = "/v1/getInfo"
            r3.append(r1)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r1 = r3.toString()     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.ces.c r3 = com.p280ss.sys.ces.C45939c.m144077a()     // Catch:{ Throwable -> 0x00ff }
            boolean r3 = r3.f117424a     // Catch:{ Throwable -> 0x00ff }
            if (r3 == 0) goto L_0x002d
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x00ff }
            r3.getTimeInMillis()     // Catch:{ Throwable -> 0x00ff }
        L_0x002d:
            r3 = 301(0x12d, float:4.22E-43)
            android.content.Context r4 = r9.f117398b     // Catch:{ Throwable -> 0x00ff }
            r5 = 0
            java.lang.Object r3 = com.p280ss.sys.ces.C45928a.meta(r3, r4, r5)     // Catch:{ Throwable -> 0x00ff }
            byte[] r3 = (byte[]) r3     // Catch:{ Throwable -> 0x00ff }
            byte[] r3 = (byte[]) r3     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.ces.c r4 = com.p280ss.sys.ces.C45939c.m144077a()     // Catch:{ Throwable -> 0x00ff }
            boolean r4 = r4.f117424a     // Catch:{ Throwable -> 0x00ff }
            if (r4 == 0) goto L_0x0049
            java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x00ff }
            r4.getTimeInMillis()     // Catch:{ Throwable -> 0x00ff }
        L_0x0049:
            if (r3 == 0) goto L_0x00f5
            int r4 = r3.length     // Catch:{ Throwable -> 0x00ff }
            if (r4 <= 0) goto L_0x00f5
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Throwable -> 0x00ff }
            r4.<init>()     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "os"
            java.lang.String r6 = "android"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "app_id"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ff }
            r6.<init>()     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.a.a r7 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            long r7 = r7.f117394d     // Catch:{ Throwable -> 0x00ff }
            r6.append(r7)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x00ff }
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "version"
            java.lang.String r6 = "1.0.3"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "version_code"
            java.lang.String r6 = "4"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "time"
            r4.put(r5, r0)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r0 = "did"
            java.lang.String r5 = com.p280ss.sys.ces.C45939c.m144085d()     // Catch:{ Throwable -> 0x00ff }
            r4.put(r0, r5)     // Catch:{ Throwable -> 0x00ff }
            r0 = 0
            r5 = 0
        L_0x008f:
            r6 = 3
            if (r0 >= r6) goto L_0x00e3
            java.lang.String r5 = com.p280ss.sys.p1799a.p1801b.C45926a.m144038a(r1, r4, r3)     // Catch:{ Throwable -> 0x00ff }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00ff }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "code"
            int r5 = r6.getInt(r5)     // Catch:{ Throwable -> 0x00ff }
            r7 = 202(0xca, float:2.83E-43)
            r8 = 200(0xc8, float:2.8E-43)
            if (r5 == r8) goto L_0x00b4
            if (r5 == r7) goto L_0x00b4
            int r0 = r0 + 1
            int r6 = r0 * 3
            int r6 = r6 * 1000
            long r6 = (long) r6     // Catch:{ Throwable -> 0x00ff }
            com.p280ss.p811a.p813b.C18889h.m61656a(r6)     // Catch:{ Throwable -> 0x00ff }
            goto L_0x008f
        L_0x00b4:
            if (r5 != r8) goto L_0x00c8
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            r0.f117393c = r2     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r1 = "token_id"
            java.lang.String r1 = r6.getString(r1)     // Catch:{ Throwable -> 0x00ff }
            r0.f117396f = r1     // Catch:{ Throwable -> 0x00ff }
        L_0x00c8:
            if (r5 != r7) goto L_0x00e3
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            r0.f117393c = r2     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r0 = "token_id"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.a.a r1 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            r1.f117396f = r0     // Catch:{ Throwable -> 0x00ff }
            r1 = 302(0x12e, float:4.23E-43)
            android.content.Context r3 = r9.f117398b     // Catch:{ Throwable -> 0x00ff }
            com.p280ss.sys.ces.C45928a.meta(r1, r3, r0)     // Catch:{ Throwable -> 0x00ff }
        L_0x00e3:
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            r0.f117392b = r5     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.ces.c r0 = com.p280ss.sys.ces.C45939c.m144077a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SS-"
            r1.<init>(r3)
            goto L_0x0112
        L_0x00f5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r1 = "NullPointerException"
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00ff }
            throw r0     // Catch:{ Throwable -> 0x00ff }
        L_0x00fd:
            r0 = move-exception
            goto L_0x0130
        L_0x00ff:
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ all -> 0x00fd }
            r1 = 500(0x1f4, float:7.0E-43)
            r0.f117392b = r1     // Catch:{ all -> 0x00fd }
            com.ss.sys.ces.c r0 = com.p280ss.sys.ces.C45939c.m144077a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SS-"
            r1.<init>(r3)
        L_0x0112:
            com.ss.sys.a.a r3 = com.p280ss.sys.p1799a.C45923a.m144033a()
            int r3 = r3.f117392b
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.reportNow(r1, r2)
            com.ss.sys.a.a.a r0 = r9.f117397a
            if (r0 == 0) goto L_0x012f
            com.ss.sys.a.a.a r0 = r9.f117397a
            java.lang.String r1 = com.p280ss.sys.p1799a.C45923a.m144034b()
            r0.mo111209a(r1)
        L_0x012f:
            return
        L_0x0130:
            com.ss.sys.ces.c r1 = com.p280ss.sys.ces.C45939c.m144077a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SS-"
            r3.<init>(r4)
            com.ss.sys.a.a r4 = com.p280ss.sys.p1799a.C45923a.m144033a()
            int r4 = r4.f117392b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.reportNow(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.p1799a.C45925b.mo111210a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        com.p280ss.sys.p1799a.C45923a.m144033a().f117392b = com.p280ss.android.vesdk.filterparam.VETransitionFilterParam.TransitionDuration_DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0107, code lost:
        r0 = com.p280ss.sys.ces.C45939c.m144077a();
        r1 = new java.lang.StringBuilder("SS-");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0130, code lost:
        r1 = com.p280ss.sys.ces.C45939c.m144077a();
        r3 = new java.lang.StringBuilder("SS-");
        r3.append(com.p280ss.sys.p1799a.C45923a.m144033a().f117392b);
        r1.reportNow(r3.toString(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x014b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00ff */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b6 A[Catch:{ Throwable -> 0x00ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = com.p280ss.p811a.p812a.C18875a.m61607a()
            r2 = 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ff }
            r3.<init>()     // Catch:{ Throwable -> 0x00ff }
            r3.append(r1)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r1 = "/v1/getInfo"
            r3.append(r1)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r1 = r3.toString()     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.ces.c r3 = com.p280ss.sys.ces.C45939c.m144077a()     // Catch:{ Throwable -> 0x00ff }
            boolean r3 = r3.f117424a     // Catch:{ Throwable -> 0x00ff }
            if (r3 == 0) goto L_0x002d
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x00ff }
            r3.getTimeInMillis()     // Catch:{ Throwable -> 0x00ff }
        L_0x002d:
            r3 = 301(0x12d, float:4.22E-43)
            android.content.Context r4 = r9.f117398b     // Catch:{ Throwable -> 0x00ff }
            r5 = 0
            java.lang.Object r3 = com.p280ss.sys.ces.C45928a.meta(r3, r4, r5)     // Catch:{ Throwable -> 0x00ff }
            byte[] r3 = (byte[]) r3     // Catch:{ Throwable -> 0x00ff }
            byte[] r3 = (byte[]) r3     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.ces.c r4 = com.p280ss.sys.ces.C45939c.m144077a()     // Catch:{ Throwable -> 0x00ff }
            boolean r4 = r4.f117424a     // Catch:{ Throwable -> 0x00ff }
            if (r4 == 0) goto L_0x0049
            java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x00ff }
            r4.getTimeInMillis()     // Catch:{ Throwable -> 0x00ff }
        L_0x0049:
            if (r3 == 0) goto L_0x00f5
            int r4 = r3.length     // Catch:{ Throwable -> 0x00ff }
            if (r4 <= 0) goto L_0x00f5
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Throwable -> 0x00ff }
            r4.<init>()     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "os"
            java.lang.String r6 = "android"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "app_id"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ff }
            r6.<init>()     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.a.a r7 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            long r7 = r7.f117394d     // Catch:{ Throwable -> 0x00ff }
            r6.append(r7)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x00ff }
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "version"
            java.lang.String r6 = "1.0.3"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "version_code"
            java.lang.String r6 = "4"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "time"
            r4.put(r5, r0)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r0 = "did"
            java.lang.String r5 = com.p280ss.sys.ces.C45939c.m144085d()     // Catch:{ Throwable -> 0x00ff }
            r4.put(r0, r5)     // Catch:{ Throwable -> 0x00ff }
            r0 = 0
            r5 = 0
        L_0x008f:
            r6 = 3
            if (r0 >= r6) goto L_0x00e3
            java.lang.String r5 = com.p280ss.sys.p1799a.p1801b.C45926a.m144038a(r1, r4, r3)     // Catch:{ Throwable -> 0x00ff }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00ff }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r5 = "code"
            int r5 = r6.getInt(r5)     // Catch:{ Throwable -> 0x00ff }
            r7 = 202(0xca, float:2.83E-43)
            r8 = 200(0xc8, float:2.8E-43)
            if (r5 == r8) goto L_0x00b4
            if (r5 == r7) goto L_0x00b4
            int r0 = r0 + 1
            int r6 = r0 * 3
            int r6 = r6 * 1000
            long r6 = (long) r6     // Catch:{ Throwable -> 0x00ff }
            com.p280ss.p811a.p813b.C18889h.m61656a(r6)     // Catch:{ Throwable -> 0x00ff }
            goto L_0x008f
        L_0x00b4:
            if (r5 != r8) goto L_0x00c8
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            r0.f117393c = r2     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r1 = "token_id"
            java.lang.String r1 = r6.getString(r1)     // Catch:{ Throwable -> 0x00ff }
            r0.f117396f = r1     // Catch:{ Throwable -> 0x00ff }
        L_0x00c8:
            if (r5 != r7) goto L_0x00e3
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            r0.f117393c = r2     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r0 = "token_id"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.a.a r1 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            r1.f117396f = r0     // Catch:{ Throwable -> 0x00ff }
            r1 = 302(0x12e, float:4.23E-43)
            android.content.Context r3 = r9.f117398b     // Catch:{ Throwable -> 0x00ff }
            com.p280ss.sys.ces.C45928a.meta(r1, r3, r0)     // Catch:{ Throwable -> 0x00ff }
        L_0x00e3:
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ Throwable -> 0x00ff }
            r0.f117392b = r5     // Catch:{ Throwable -> 0x00ff }
            com.ss.sys.ces.c r0 = com.p280ss.sys.ces.C45939c.m144077a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SS-"
            r1.<init>(r3)
            goto L_0x0112
        L_0x00f5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x00ff }
            java.lang.String r1 = "NullPointerException"
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00ff }
            throw r0     // Catch:{ Throwable -> 0x00ff }
        L_0x00fd:
            r0 = move-exception
            goto L_0x0130
        L_0x00ff:
            com.ss.sys.a.a r0 = com.p280ss.sys.p1799a.C45923a.m144033a()     // Catch:{ all -> 0x00fd }
            r1 = 500(0x1f4, float:7.0E-43)
            r0.f117392b = r1     // Catch:{ all -> 0x00fd }
            com.ss.sys.ces.c r0 = com.p280ss.sys.ces.C45939c.m144077a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SS-"
            r1.<init>(r3)
        L_0x0112:
            com.ss.sys.a.a r3 = com.p280ss.sys.p1799a.C45923a.m144033a()
            int r3 = r3.f117392b
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.reportNow(r1, r2)
            com.ss.sys.a.a.a r0 = r9.f117397a
            if (r0 == 0) goto L_0x012f
            com.ss.sys.a.a.a r0 = r9.f117397a
            java.lang.String r1 = com.p280ss.sys.p1799a.C45923a.m144034b()
            r0.mo111209a(r1)
        L_0x012f:
            return
        L_0x0130:
            com.ss.sys.ces.c r1 = com.p280ss.sys.ces.C45939c.m144077a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SS-"
            r3.<init>(r4)
            com.ss.sys.a.a r4 = com.p280ss.sys.p1799a.C45923a.m144033a()
            int r4 = r4.f117392b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.reportNow(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.p1799a.C45925b.run():void");
    }
}
