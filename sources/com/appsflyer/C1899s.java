package com.appsflyer;

import android.content.pm.PackageManager;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appsflyer.s */
final class C1899s {

    /* renamed from: ˎ */
    private static C1899s f6855;

    /* renamed from: ʻ */
    private final String f6856 = "advertiserId";

    /* renamed from: ʻॱ */
    private final String f6857 = "preInstall";

    /* renamed from: ʼ */
    private final String f6858 = "android_id";

    /* renamed from: ʼॱ */
    private final String f6859 = "public_api_call";

    /* renamed from: ʽ */
    private final String f6860 = "imei";

    /* renamed from: ʽॱ */
    private final String f6861 = "server_request";

    /* renamed from: ʾ */
    private final String f6862 = "server_response";

    /* renamed from: ʿ */
    private final String f6863 = "r_debugging_on";

    /* renamed from: ˈ */
    private final String f6864 = "exception";

    /* renamed from: ˉ */
    private JSONObject f6865;

    /* renamed from: ˊ */
    private final String f6866 = "model";

    /* renamed from: ˊˊ */
    private final String f6867 = "MM-dd HH:mm:ss.SSS";

    /* renamed from: ˊˋ */
    private final String f6868 = "yyyy-MM-dd HH:mm:ssZ";

    /* renamed from: ˊॱ */
    private final String f6869 = "app_id";

    /* renamed from: ˊᐝ */
    private JSONArray f6870 = new JSONArray();

    /* renamed from: ˋ */
    private final String f6871 = "brand";

    /* renamed from: ˋˊ */
    private int f6872 = 0;

    /* renamed from: ˋॱ */
    private final String f6873 = "originalAppsFlyerId";

    /* renamed from: ˍ */
    private String f6874 = "-1";

    /* renamed from: ˎˎ */
    public boolean f6875 = false;

    /* renamed from: ˏ */
    private boolean f6876 = true;

    /* renamed from: ˏॱ */
    private final String f6877 = "uid";

    /* renamed from: ͺ */
    private final String f6878 = "devkey";

    /* renamed from: ॱ */
    private boolean f6879 = true;

    /* renamed from: ॱˊ */
    private final String f6880 = "sdk_version";

    /* renamed from: ॱˋ */
    private final String f6881 = "r_debugging_off";

    /* renamed from: ॱˎ */
    private final String f6882 = "channel";

    /* renamed from: ॱॱ */
    private final String f6883 = "platform";

    /* renamed from: ॱᐝ */
    private final String f6884 = "app_version";

    /* renamed from: ᐝ */
    private final String f6885 = "platform_version";

    /* renamed from: ᐝॱ */
    private final String f6886 = "data";

    /* renamed from: ॱ */
    static C1899s m8812() {
        if (f6855 == null) {
            f6855 = new C1899s();
        }
        return f6855;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final synchronized void mo7510() {
        this.f6865 = null;
        this.f6870 = null;
        f6855 = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˎ */
    public final synchronized void mo7511() {
        this.f6876 = false;
        m8806();
    }

    /* renamed from: ʽ */
    private synchronized void m8806() {
        this.f6870 = null;
        this.f6870 = new JSONArray();
        this.f6872 = 0;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: ॱॱ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String m8814() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            org.json.JSONObject r1 = r4.f6865     // Catch:{ JSONException -> 0x0018, all -> 0x0015 }
            java.lang.String r2 = "data"
            org.json.JSONArray r3 = r4.f6870     // Catch:{ JSONException -> 0x0018, all -> 0x0015 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0018, all -> 0x0015 }
            org.json.JSONObject r1 = r4.f6865     // Catch:{ JSONException -> 0x0018, all -> 0x0015 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0018, all -> 0x0015 }
            r4.m8806()     // Catch:{ JSONException -> 0x0019, all -> 0x0015 }
            goto L_0x0019
        L_0x0015:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0018:
            r1 = r0
        L_0x0019:
            monitor-exit(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1899s.m8814():java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final synchronized void mo7513() {
        m8811("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f6875 = false;
        this.f6876 = false;
    }

    private C1899s() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final synchronized void mo7508() {
        this.f6875 = true;
        m8811("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final synchronized void mo7515(String str) {
        this.f6874 = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final void mo7514(Throwable th) {
        String str;
        StackTraceElement[] stackTraceElementArr;
        String[] strArr;
        Throwable cause = th.getCause();
        String str2 = "exception";
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            str = th.getMessage();
        } else {
            str = cause.getMessage();
        }
        if (cause == null) {
            stackTraceElementArr = th.getStackTrace();
        } else {
            stackTraceElementArr = cause.getStackTrace();
        }
        if (stackTraceElementArr == null) {
            strArr = new String[]{str};
        } else {
            String[] strArr2 = new String[(stackTraceElementArr.length + 1)];
            strArr2[0] = str;
            for (int i = 1; i < stackTraceElementArr.length; i++) {
                strArr2[i] = stackTraceElementArr[i].toString();
            }
            strArr = strArr2;
        }
        m8811(str2, simpleName, strArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˎ */
    public final void mo7512(String str, String... strArr) {
        m8811("public_api_call", str, strArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final void mo7509(String str, String str2) {
        m8811(null, str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo7517(String str, String str2) {
        m8811("server_request", str, str2);
    }

    /* renamed from: ˋ */
    static void m8808(String str, PackageManager packageManager) {
        try {
            if (f6855 == null) {
                f6855 = new C1899s();
            }
            f6855.m8809(str, packageManager);
            if (f6855 == null) {
                f6855 = new C1899s();
            }
            String r5 = f6855.m8814();
            C1884k kVar = new C1884k(null, AppsFlyerLib.getInstance().f6714);
            kVar.f6826 = r5;
            kVar.mo7491();
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl("https://%smonitorsdk.%s/remote-debug?app_id="));
            sb.append(str);
            kVar.execute(new String[]{sb.toString()});
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0070 */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m8809(java.lang.String r11, android.content.pm.PackageManager r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0081 }
            com.appsflyer.AppsFlyerLib r1 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0070 }
            r11.<init>(r2)     // Catch:{ Throwable -> 0x0070 }
            r10.f6865 = r11     // Catch:{ Throwable -> 0x0070 }
            goto L_0x0070
        L_0x0019:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            r10.f6865 = r2     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "advertiserId"
            java.lang.String r7 = r0.getString(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r8 = r1.f6707     // Catch:{ all -> 0x0081 }
            java.lang.String r9 = r1.f6716     // Catch:{ all -> 0x0081 }
            r3 = r10
            r3.m8810(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "4.8.20.170"
            java.lang.String r2 = "AppsFlyerKey"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "KSAppsFlyerId"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "uid"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x0081 }
            r10.m8807(r1, r2, r3, r4)     // Catch:{ all -> 0x0081 }
            r1 = 0
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r11, r1)     // Catch:{ Throwable -> 0x0065 }
            int r12 = r12.versionCode     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r1 = "channel"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r2 = "preInstallName"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x0065 }
            r10.m8813(r11, r12, r1, r2)     // Catch:{ Throwable -> 0x0065 }
        L_0x0065:
            java.lang.String r11 = "remote_debug_static_data"
            org.json.JSONObject r12 = r10.f6865     // Catch:{ all -> 0x0081 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0081 }
            r0.set(r11, r12)     // Catch:{ all -> 0x0081 }
        L_0x0070:
            org.json.JSONObject r11 = r10.f6865     // Catch:{ JSONException -> 0x007b }
            java.lang.String r12 = "launch_counter"
            java.lang.String r0 = r10.f6874     // Catch:{ JSONException -> 0x007b }
            r11.put(r12, r0)     // Catch:{ JSONException -> 0x007b }
            monitor-exit(r10)
            return
        L_0x007b:
            r11 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20185b(r11)     // Catch:{ all -> 0x0081 }
            monitor-exit(r10)
            return
        L_0x0081:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1899s.m8809(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo7516(String str, int i, String str2) {
        m8811("server_response", str, String.valueOf(i), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        return;
     */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m8811(java.lang.String r12, java.lang.String r13, java.lang.String... r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f6879     // Catch:{ all -> 0x00b5 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r11.f6876     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x000f
            boolean r0 = r11.f6875     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x00b3
            int r0 = r11.f6872     // Catch:{ all -> 0x00b5 }
            r3 = 98304(0x18000, float:1.37753E-40)
            if (r0 < r3) goto L_0x001d
            goto L_0x00b3
        L_0x001d:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r0 = ""
            int r5 = r14.length     // Catch:{ Throwable -> 0x00b1 }
            if (r5 <= 0) goto L_0x0045
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b1 }
            r0.<init>()     // Catch:{ Throwable -> 0x00b1 }
            int r5 = r14.length     // Catch:{ Throwable -> 0x00b1 }
            int r5 = r5 - r1
        L_0x002d:
            if (r5 <= 0) goto L_0x003c
            r6 = r14[r5]     // Catch:{ Throwable -> 0x00b1 }
            r0.append(r6)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ Throwable -> 0x00b1 }
            int r5 = r5 + -1
            goto L_0x002d
        L_0x003c:
            r14 = r14[r2]     // Catch:{ Throwable -> 0x00b1 }
            r0.append(r14)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00b1 }
        L_0x0045:
            java.text.SimpleDateFormat r14 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r5 = "MM-dd HH:mm:ss.SSS"
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ Throwable -> 0x00b1 }
            r14.<init>(r5, r6)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r14 = r14.format(r3)     // Catch:{ Throwable -> 0x00b1 }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 5
            if (r12 == 0) goto L_0x0080
            java.lang.String r7 = "%18s %5s _/%s [%s] %s %s"
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x00b1 }
            r8[r2] = r14     // Catch:{ Throwable -> 0x00b1 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ Throwable -> 0x00b1 }
            long r9 = r14.getId()     // Catch:{ Throwable -> 0x00b1 }
            java.lang.Long r14 = java.lang.Long.valueOf(r9)     // Catch:{ Throwable -> 0x00b1 }
            r8[r1] = r14     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r14 = "AppsFlyer_4.8.20"
            r8[r5] = r14     // Catch:{ Throwable -> 0x00b1 }
            r8[r4] = r12     // Catch:{ Throwable -> 0x00b1 }
            r8[r3] = r13     // Catch:{ Throwable -> 0x00b1 }
            r8[r6] = r0     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r12 = com.C1642a.m8034a(r7, r8)     // Catch:{ Throwable -> 0x00b1 }
            goto L_0x00a0
        L_0x0080:
            java.lang.String r12 = "%18s %5s %s/%s %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x00b1 }
            r6[r2] = r14     // Catch:{ Throwable -> 0x00b1 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ Throwable -> 0x00b1 }
            long r7 = r14.getId()     // Catch:{ Throwable -> 0x00b1 }
            java.lang.Long r14 = java.lang.Long.valueOf(r7)     // Catch:{ Throwable -> 0x00b1 }
            r6[r1] = r14     // Catch:{ Throwable -> 0x00b1 }
            r6[r5] = r13     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r13 = "AppsFlyer_4.8.20"
            r6[r4] = r13     // Catch:{ Throwable -> 0x00b1 }
            r6[r3] = r0     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r12 = com.C1642a.m8034a(r12, r6)     // Catch:{ Throwable -> 0x00b1 }
        L_0x00a0:
            org.json.JSONArray r13 = r11.f6870     // Catch:{ Throwable -> 0x00b1 }
            r13.put(r12)     // Catch:{ Throwable -> 0x00b1 }
            int r13 = r11.f6872     // Catch:{ Throwable -> 0x00b1 }
            byte[] r12 = r12.getBytes()     // Catch:{ Throwable -> 0x00b1 }
            int r12 = r12.length     // Catch:{ Throwable -> 0x00b1 }
            int r13 = r13 + r12
            r11.f6872 = r13     // Catch:{ Throwable -> 0x00b1 }
            monitor-exit(r11)
            return
        L_0x00b1:
            monitor-exit(r11)
            return
        L_0x00b3:
            monitor-exit(r11)
            return
        L_0x00b5:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1899s.m8811(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: ˊ */
    private synchronized void m8807(String str, String str2, String str3, String str4) {
        try {
            this.f6865.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.f6865.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f6865.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f6865.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ॱ */
    private synchronized void m8813(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f6865.put("app_id", str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f6865.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f6865.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f6865.put("preInstall", str4);
        }
    }

    /* renamed from: ˏ */
    private synchronized void m8810(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.f6865.put("brand", str);
            this.f6865.put("model", str2);
            this.f6865.put("platform", "Android");
            this.f6865.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.f6865.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f6865.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f6865.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }
}
