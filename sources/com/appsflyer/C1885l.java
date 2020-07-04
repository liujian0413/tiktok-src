package com.appsflyer;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings.Secure;

/* renamed from: com.appsflyer.l */
final class C1885l {

    /* renamed from: com.appsflyer.l$a */
    static class C1886a extends IllegalStateException {
        C1886a(String str) {
            super(str);
        }
    }

    /* renamed from: ॱ */
    static C1891o m8778(ContentResolver contentResolver) {
        String str;
        C1891o oVar = null;
        if (contentResolver == null) {
            return null;
        }
        if (AppsFlyerProperties.getInstance().getString("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i = Secure.getInt(contentResolver, "limit_ad_tracking", 2);
            if (i == 0) {
                oVar = new C1891o(C1892a.AMAZON, Secure.getString(contentResolver, "advertising_id"), false);
            } else if (i != 2) {
                String str2 = "";
                try {
                    str = Secure.getString(contentResolver, "advertising_id");
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                    str = str2;
                }
                oVar = new C1891o(C1892a.AMAZON, str, true);
            }
        }
        return oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[SYNTHETIC, Splitter:B:30:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m8777(android.content.Context r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
        /*
            java.lang.String r0 = "Trying to fetch GAID.."
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch:{ Throwable -> 0x0013 }
            int r1 = r1.isGooglePlayServicesAvailable(r9)     // Catch:{ Throwable -> 0x0013 }
            goto L_0x001c
        L_0x0013:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r2, r1)
            r1 = -1
        L_0x001c:
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "com.google.android.gms.ads.b.a"
            java.lang.Class.forName(r5)     // Catch:{ Throwable -> 0x0059 }
            com.google.android.gms.ads.b.a$a r5 = com.google.android.gms.ads.p742b.C14733a.m42585a(r9)     // Catch:{ Throwable -> 0x0059 }
            if (r5 == 0) goto L_0x004c
            java.lang.String r6 = r5.f38079a     // Catch:{ Throwable -> 0x0059 }
            boolean r5 = r5.f38080b     // Catch:{ Throwable -> 0x004a }
            r5 = r5 ^ r3
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch:{ Throwable -> 0x004a }
            if (r6 == 0) goto L_0x0042
            int r2 = r6.length()     // Catch:{ Throwable -> 0x003c }
            if (r2 != 0) goto L_0x0047
            goto L_0x0042
        L_0x003c:
            r2 = move-exception
            r4 = 1
            r8 = r5
            r5 = r2
            r2 = r8
            goto L_0x005b
        L_0x0042:
            java.lang.String r2 = "emptyOrNull |"
            r0.append(r2)     // Catch:{ Throwable -> 0x003c }
        L_0x0047:
            r4 = 1
            goto L_0x00e1
        L_0x004a:
            r5 = move-exception
            goto L_0x005b
        L_0x004c:
            java.lang.String r5 = "gpsAdInfo-null |"
            r0.append(r5)     // Catch:{ Throwable -> 0x0059 }
            com.appsflyer.l$a r5 = new com.appsflyer.l$a     // Catch:{ Throwable -> 0x0059 }
            java.lang.String r6 = "GpsAdIndo is null"
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0059 }
            throw r5     // Catch:{ Throwable -> 0x0059 }
        L_0x0059:
            r5 = move-exception
            r6 = r2
        L_0x005b:
            java.lang.String r7 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r7, r5)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r0.append(r5)
            java.lang.String r5 = " |"
            r0.append(r5)
            java.lang.String r5 = "WARNING: Google Play Services is missing."
            com.appsflyer.AFLogger.afInfoLog(r5)
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r7 = "enableGpsFallback"
            boolean r5 = r5.getBoolean(r7, r3)
            if (r5 == 0) goto L_0x00e0
            com.appsflyer.h$e r2 = com.appsflyer.C1879h.m8761(r9)     // Catch:{ Throwable -> 0x009e }
            java.lang.String r6 = r2.f6810     // Catch:{ Throwable -> 0x009e }
            boolean r2 = r2.f6809     // Catch:{ Throwable -> 0x009e }
            r2 = r2 ^ r3
            java.lang.String r5 = java.lang.Boolean.toString(r2)     // Catch:{ Throwable -> 0x009e }
            if (r6 == 0) goto L_0x0098
            int r2 = r6.length()     // Catch:{ Throwable -> 0x009e }
            if (r2 != 0) goto L_0x00e1
        L_0x0098:
            java.lang.String r2 = "emptyOrNull (bypass) |"
            r0.append(r2)     // Catch:{ Throwable -> 0x009e }
            goto L_0x00e1
        L_0x009e:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r3, r2)
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r0.append(r3)
            java.lang.String r3 = " |"
            r0.append(r3)
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = "advertiserId"
            java.lang.String r6 = r3.getString(r5)
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = "advertiserIdEnabled"
            java.lang.String r5 = r3.getString(r5)
            java.lang.String r3 = r2.getLocalizedMessage()
            if (r3 == 0) goto L_0x00d8
            java.lang.String r2 = r2.getLocalizedMessage()
            com.appsflyer.AFLogger.afInfoLog(r2)
            goto L_0x00e1
        L_0x00d8:
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afInfoLog(r2)
            goto L_0x00e1
        L_0x00e0:
            r5 = r2
        L_0x00e1:
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r2 = "android.app.ReceiverRestrictedContext"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010a
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "advertiserId"
            java.lang.String r6 = r9.getString(r2)
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "advertiserIdEnabled"
            java.lang.String r5 = r9.getString(r2)
            java.lang.String r9 = "context = android.app.ReceiverRestrictedContext |"
            r0.append(r9)
        L_0x010a:
            int r9 = r0.length()
            if (r9 <= 0) goto L_0x0129
            java.lang.String r9 = "gaidError"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r10.put(r9, r0)
        L_0x0129:
            if (r6 == 0) goto L_0x0152
            if (r5 == 0) goto L_0x0152
            java.lang.String r9 = "advertiserId"
            r10.put(r9, r6)
            java.lang.String r9 = "advertiserIdEnabled"
            r10.put(r9, r5)
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "advertiserId"
            r9.set(r0, r6)
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "advertiserIdEnabled"
            r9.set(r0, r5)
            java.lang.String r9 = "isGaidWithGps"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r10.put(r9, r0)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1885l.m8777(android.content.Context, java.util.Map):void");
    }
}
