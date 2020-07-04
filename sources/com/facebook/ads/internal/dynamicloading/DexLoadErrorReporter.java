package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.ads.BuildConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class DexLoadErrorReporter {

    /* renamed from: a */
    private static final AtomicBoolean f34722a = new AtomicBoolean();

    public static void reportDexLoadingIssue(final Context context, final String str, double d) {
        if (!f34722a.get() && Math.random() < d) {
            f34722a.set(true);
            new Thread() {
                /* JADX WARNING: Removed duplicated region for block: B:39:0x0150 A[SYNTHETIC, Splitter:B:39:0x0150] */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x0155 A[SYNTHETIC, Splitter:B:43:0x0155] */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x015a  */
                /* JADX WARNING: Removed duplicated region for block: B:52:0x0162 A[SYNTHETIC, Splitter:B:52:0x0162] */
                /* JADX WARNING: Removed duplicated region for block: B:56:0x0167 A[SYNTHETIC, Splitter:B:56:0x0167] */
                /* JADX WARNING: Removed duplicated region for block: B:60:0x016c  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r12 = this;
                        super.run()
                        r0 = 0
                        java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x015e, all -> 0x014a }
                        java.lang.String r2 = "https://www.facebook.com/adnw_logging/"
                        r1.<init>(r2)     // Catch:{ Throwable -> 0x015e, all -> 0x014a }
                        java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Throwable -> 0x015e, all -> 0x014a }
                        java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x015e, all -> 0x014a }
                        java.lang.String r2 = "POST"
                        r1.setRequestMethod(r2)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r2 = "Content-Type"
                        java.lang.String r3 = "application/x-www-form-urlencoded;charset=UTF-8"
                        com.facebook.ads.internal.dynamicloading.C13112a.m38338a(r1, r2, r3)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r2 = "Accept"
                        java.lang.String r3 = "application/json"
                        com.facebook.ads.internal.dynamicloading.C13112a.m38338a(r1, r2, r3)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r2 = "Accept-Charset"
                        java.lang.String r3 = "UTF-8"
                        com.facebook.ads.internal.dynamicloading.C13112a.m38338a(r1, r2, r3)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r2 = "user-agent"
                        java.lang.String r3 = "[FBAN/AudienceNetworkForAndroid;FBSN/Android]"
                        com.facebook.ads.internal.dynamicloading.C13112a.m38338a(r1, r2, r3)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r2 = 1
                        r1.setDoOutput(r2)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r1.setDoInput(r2)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r1.connect()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r3.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r4 = "attempt"
                        java.lang.String r5 = "0"
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        android.content.Context r4 = r3     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.addEnvFields(r4, r3, r2)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r4.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r5 = "subtype"
                        java.lang.String r6 = "generic"
                        r4.put(r5, r6)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r5 = "subtype_code"
                        java.lang.String r6 = "1320"
                        r4.put(r5, r6)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r5 = "caught_exception"
                        java.lang.String r6 = "1"
                        r4.put(r5, r6)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r5 = "stacktrace"
                        java.lang.String r6 = r4     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r4.put(r5, r6)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r5.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r6 = "id"
                        java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r6 = "type"
                        java.lang.String r7 = "debug"
                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r6 = "session_time"
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r7.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r10 = 1000(0x3e8, double:4.94E-321)
                        long r8 = r8 / r10
                        r7.append(r8)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r6 = "time"
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r7.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        long r8 = r8 / r10
                        r7.append(r8)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r6 = "session_id"
                        r5.put(r6, r2)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r6 = "data"
                        r5.put(r6, r4)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r6 = "attempt"
                        java.lang.String r7 = "0"
                        r5.put(r6, r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        android.content.Context r6 = r3     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.addEnvFields(r6, r4, r2)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r2.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r2.put(r5)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r4.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r5 = "data"
                        r4.put(r5, r3)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r3 = "events"
                        r4.put(r3, r2)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.String r2 = r4.toString()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.io.OutputStream r4 = r1.getOutputStream()     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        r3.<init>(r4)     // Catch:{ Throwable -> 0x0148, all -> 0x0145 }
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        java.lang.String r5 = "payload="
                        r4.<init>(r5)     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        java.lang.String r5 = "UTF-8"
                        java.lang.String r2 = java.net.URLEncoder.encode(r2, r5)     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        r4.append(r2)     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        java.lang.String r2 = r4.toString()     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        r3.writeBytes(r2)     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        r3.flush()     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        r2 = 16384(0x4000, float:2.2959E-41)
                        byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        r4.<init>()     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                        java.io.InputStream r5 = com.facebook.ads.internal.dynamicloading.C13112a.m38337a(r1)     // Catch:{ Throwable -> 0x0142, all -> 0x013e }
                    L_0x011e:
                        int r0 = r5.read(r2)     // Catch:{ Throwable -> 0x0143, all -> 0x013b }
                        r6 = -1
                        if (r0 == r6) goto L_0x012a
                        r6 = 0
                        r4.write(r2, r6, r0)     // Catch:{ Throwable -> 0x0143, all -> 0x013b }
                        goto L_0x011e
                    L_0x012a:
                        r4.flush()     // Catch:{ Throwable -> 0x0143, all -> 0x013b }
                        r3.close()     // Catch:{ Exception -> 0x0130 }
                    L_0x0130:
                        if (r5 == 0) goto L_0x0135
                        r5.close()     // Catch:{ Exception -> 0x0135 }
                    L_0x0135:
                        if (r1 == 0) goto L_0x0170
                        r1.disconnect()
                        return
                    L_0x013b:
                        r0 = move-exception
                        r2 = r0
                        goto L_0x0140
                    L_0x013e:
                        r2 = move-exception
                        r5 = r0
                    L_0x0140:
                        r0 = r3
                        goto L_0x014e
                    L_0x0142:
                        r5 = r0
                    L_0x0143:
                        r0 = r3
                        goto L_0x0160
                    L_0x0145:
                        r2 = move-exception
                        r5 = r0
                        goto L_0x014e
                    L_0x0148:
                        r5 = r0
                        goto L_0x0160
                    L_0x014a:
                        r1 = move-exception
                        r5 = r0
                        r2 = r1
                        r1 = r5
                    L_0x014e:
                        if (r0 == 0) goto L_0x0153
                        r0.close()     // Catch:{ Exception -> 0x0153 }
                    L_0x0153:
                        if (r5 == 0) goto L_0x0158
                        r5.close()     // Catch:{ Exception -> 0x0158 }
                    L_0x0158:
                        if (r1 == 0) goto L_0x015d
                        r1.disconnect()
                    L_0x015d:
                        throw r2
                    L_0x015e:
                        r1 = r0
                        r5 = r1
                    L_0x0160:
                        if (r0 == 0) goto L_0x0165
                        r0.close()     // Catch:{ Exception -> 0x0165 }
                    L_0x0165:
                        if (r5 == 0) goto L_0x016a
                        r5.close()     // Catch:{ Exception -> 0x016a }
                    L_0x016a:
                        if (r1 == 0) goto L_0x0170
                        r1.disconnect()
                        return
                    L_0x0170:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.C131041.run():void");
                }
            }.start();
        }
    }

    public static void addEnvFields(Context context, JSONObject jSONObject, String str) throws JSONException, NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(C13113b.m38339a(context.getPackageManager(), packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfig.VERSION_NAME);
        jSONObject.put("OS", "Android");
    }
}
