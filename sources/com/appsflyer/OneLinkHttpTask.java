package com.appsflyer;

import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

public abstract class OneLinkHttpTask implements Runnable {

    /* renamed from: ˎ */
    private AppsFlyerLib f6758;

    /* renamed from: ˏ */
    String f6759;

    /* renamed from: ॱ */
    public HttpsUrlConnectionProvider f6760;

    public static class HttpsUrlConnectionProvider {
        /* renamed from: ˋ */
        static HttpsURLConnection m8728(String str) throws IOException {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public abstract void mo7456(String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public abstract void mo7457();

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public abstract String mo7458();

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public abstract void mo7459(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = r10.mo7458()
            java.lang.String r5 = "oneLinkUrl: "
            java.lang.String r6 = java.lang.String.valueOf(r4)
            java.lang.String r5 = r5.concat(r6)
            com.appsflyer.AFLogger.afRDLog(r5)
            javax.net.ssl.HttpsURLConnection r5 = com.appsflyer.OneLinkHttpTask.HttpsUrlConnectionProvider.m8728(r4)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r6 = "content-type"
            java.lang.String r7 = "application/json"
            r5.addRequestProperty(r6, r7)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r6 = "authorization"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0088 }
            r7.<init>()     // Catch:{ Throwable -> 0x0088 }
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r9 = "AppsFlyerKey"
            java.lang.String r8 = r8.getString(r9)     // Catch:{ Throwable -> 0x0088 }
            r7.append(r8)     // Catch:{ Throwable -> 0x0088 }
            r7.append(r0)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r7 = com.appsflyer.C1898r.m8805(r7)     // Catch:{ Throwable -> 0x0088 }
            r5.addRequestProperty(r6, r7)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r6 = "af-timestamp"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x0088 }
            r5.addRequestProperty(r6, r0)     // Catch:{ Throwable -> 0x0088 }
            r0 = 3000(0xbb8, float:4.204E-42)
            r5.setReadTimeout(r0)     // Catch:{ Throwable -> 0x0088 }
            r5.setConnectTimeout(r0)     // Catch:{ Throwable -> 0x0088 }
            r10.mo7459(r5)     // Catch:{ Throwable -> 0x0088 }
            int r0 = r5.getResponseCode()     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r1 = com.appsflyer.AppsFlyerLib.m8674(r5)     // Catch:{ Throwable -> 0x0088 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x0071
            java.lang.String r0 = "Status 200 ok"
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ Throwable -> 0x006f }
            goto L_0x00b1
        L_0x006f:
            r0 = move-exception
            goto L_0x008a
        L_0x0071:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006f }
            java.lang.String r3 = "Response code = "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x006f }
            r2.append(r0)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r0 = " content = "
            r2.append(r0)     // Catch:{ Throwable -> 0x006f }
            r2.append(r1)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r3 = r2.toString()     // Catch:{ Throwable -> 0x006f }
            goto L_0x00b1
        L_0x0088:
            r0 = move-exception
            r1 = r2
        L_0x008a:
            java.lang.String r2 = "Error while calling "
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r2.concat(r3)
            com.appsflyer.AFLogger.afErrorLog(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error while calling "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " stacktrace: "
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r3 = r2.toString()
        L_0x00b1:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = "Connection call succeeded: "
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r2)
            com.appsflyer.AFLogger.afInfoLog(r0)
            r10.mo7456(r1)
            return
        L_0x00c8:
            java.lang.String r0 = "Connection error: "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            com.appsflyer.AFLogger.afWarnLog(r0)
            r10.mo7457()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.OneLinkHttpTask.run():void");
    }

    OneLinkHttpTask(AppsFlyerLib appsFlyerLib) {
        this.f6758 = appsFlyerLib;
    }
}
