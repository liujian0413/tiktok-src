package com.appsflyer;

import android.content.Context;
import com.android.p059a.p060a.C1845a;
import com.android.p059a.p060a.C1851c;

/* renamed from: com.appsflyer.d */
final class C1871d implements C1851c {

    /* renamed from: ˎ */
    private C1864a f6783;

    /* renamed from: ˏ */
    private C1845a f6784;

    C1871d() {
    }

    public final void onInstallReferrerServiceDisconnected() {
        AFLogger.afDebugLog("Install Referrer service disconnected");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[SYNTHETIC, Splitter:B:21:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInstallReferrerSetupFinished(int r6) {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "code"
            java.lang.String r2 = java.lang.String.valueOf(r6)
            r0.put(r1, r2)
            r1 = 0
            switch(r6) {
                case 0: goto L_0x0024;
                case 1: goto L_0x001e;
                case 2: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.String r6 = "responseCode not found."
            com.appsflyer.AFLogger.afWarnLog(r6)
            goto L_0x006f
        L_0x0018:
            java.lang.String r6 = "InstallReferrer not supported"
            com.appsflyer.AFLogger.afWarnLog(r6)
            goto L_0x006f
        L_0x001e:
            java.lang.String r6 = "InstallReferrer not supported"
            com.appsflyer.AFLogger.afWarnLog(r6)
            goto L_0x006f
        L_0x0024:
            java.lang.String r6 = "InstallReferrer connected"
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ Throwable -> 0x0050 }
            com.android.a.a.a r6 = r5.f6784     // Catch:{ Throwable -> 0x0050 }
            boolean r6 = r6.mo7354a()     // Catch:{ Throwable -> 0x0050 }
            if (r6 == 0) goto L_0x0043
            com.android.a.a.a r6 = r5.f6784     // Catch:{ Throwable -> 0x0050 }
            com.android.a.a.d r6 = r6.mo7356c()     // Catch:{ Throwable -> 0x0050 }
            com.android.a.a.a r1 = r5.f6784     // Catch:{ Throwable -> 0x003e }
            r1.mo7355b()     // Catch:{ Throwable -> 0x003e }
            r1 = r6
            goto L_0x006f
        L_0x003e:
            r1 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
            goto L_0x0051
        L_0x0043:
            java.lang.String r6 = "ReferrerClient: InstallReferrer is not ready"
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r6 = "err"
            java.lang.String r2 = "ReferrerClient: InstallReferrer is not ready"
            r0.put(r6, r2)     // Catch:{ Throwable -> 0x0050 }
            goto L_0x006f
        L_0x0050:
            r6 = move-exception
        L_0x0051:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get install referrer: "
            r2.<init>(r3)
            java.lang.String r3 = r6.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afWarnLog(r2)
            java.lang.String r2 = "err"
            java.lang.String r6 = r6.getMessage()
            r0.put(r2, r6)
        L_0x006f:
            if (r1 == 0) goto L_0x00b4
            java.lang.String r6 = r1.mo7362a()     // Catch:{ Exception -> 0x009b }
            if (r6 == 0) goto L_0x0080
            java.lang.String r6 = "val"
            java.lang.String r2 = r1.mo7362a()     // Catch:{ Exception -> 0x009b }
            r0.put(r6, r2)     // Catch:{ Exception -> 0x009b }
        L_0x0080:
            java.lang.String r6 = "clk"
            long r2 = r1.mo7363b()     // Catch:{ Exception -> 0x009b }
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ Exception -> 0x009b }
            r0.put(r6, r2)     // Catch:{ Exception -> 0x009b }
            java.lang.String r6 = "install"
            long r1 = r1.mo7364c()     // Catch:{ Exception -> 0x009b }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ Exception -> 0x009b }
            r0.put(r6, r1)     // Catch:{ Exception -> 0x009b }
            goto L_0x00b4
        L_0x009b:
            r6 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20185b(r6)
            java.lang.String r6 = "val"
            java.lang.String r1 = "-1"
            r0.put(r6, r1)
            java.lang.String r6 = "clk"
            java.lang.String r1 = "-1"
            r0.put(r6, r1)
            java.lang.String r6 = "install"
            java.lang.String r1 = "-1"
            r0.put(r6, r1)
        L_0x00b4:
            com.appsflyer.a r6 = r5.f6783
            if (r6 == 0) goto L_0x00bd
            com.appsflyer.a r6 = r5.f6783
            r6.onHandleReferrer(r0)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1871d.onInstallReferrerSetupFinished(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˋ */
    public final void mo7468(Context context, C1864a aVar) {
        this.f6783 = aVar;
        try {
            this.f6784 = C1845a.m8609a(context).mo7357a();
            this.f6784.mo7353a((C1851c) this);
        } catch (Throwable th) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th);
        }
    }
}
