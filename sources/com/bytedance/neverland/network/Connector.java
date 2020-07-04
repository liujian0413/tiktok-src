package com.bytedance.neverland.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.neverland.internal.NeverlandImpl;
import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public class Connector {
    static int sTimeMinutesInterval;

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_getInputStream */
        static InputStream m20125xff4d584d(HttpURLConnection httpURLConnection) throws IOException {
            URLConnection uRLConnection = httpURLConnection;
            if (C7118e.m22232a(uRLConnection)) {
                C7116a.m22226a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            } else if (C7163a.m22363a()) {
                C7116a.m22230b(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            }
            return httpURLConnection.getInputStream();
        }
    }

    private static boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) NeverlandImpl.getInstance().getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean connect(java.lang.String r11) {
        /*
            boolean r0 = isNetworkAvailable()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.bytedance.neverland.internal.NeverlandImpl r0 = com.bytedance.neverland.internal.NeverlandImpl.getInstance()
            android.content.SharedPreferences r2 = r0.getSp()
            java.lang.String r3 = "time_can_report"
            r4 = 0
            long r3 = r2.getLong(r3, r4)
            long r5 = java.lang.System.currentTimeMillis()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0033
            boolean r0 = r0.isFirstLaunch()
            if (r0 == 0) goto L_0x0032
            android.content.SharedPreferences$Editor r0 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.commit()
            goto L_0x0033
        L_0x0032:
            return r1
        L_0x0033:
            r0 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Throwable -> 0x00db, all -> 0x00cb }
            com.bytedance.neverland.internal.NeverlandImpl r4 = com.bytedance.neverland.internal.NeverlandImpl.getInstance()     // Catch:{ Throwable -> 0x00db, all -> 0x00cb }
            java.lang.String r4 = r4.getUrl()     // Catch:{ Throwable -> 0x00db, all -> 0x00cb }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00db, all -> 0x00cb }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Throwable -> 0x00db, all -> 0x00cb }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Throwable -> 0x00db, all -> 0x00cb }
            java.lang.String r4 = "POST"
            r3.setRequestMethod(r4)     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            r4 = 10000(0x2710, float:1.4013E-41)
            r3.setReadTimeout(r4)     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            r3.setConnectTimeout(r4)     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            r4 = 1
            r3.setDoOutput(r4)     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            java.lang.String r8 = "UTF-8"
            r7.<init>(r5, r8)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            r6.write(r11)     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            r6.flush()     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            r3.connect()     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            r3.getResponseCode()     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            java.io.InputStream r11 = r3.getErrorStream()     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            r3.getResponseMessage()     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            com.bytedance.neverland.internal.Utility.obtainStringFromInputStream(r11)     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            java.io.InputStream r11 = com.bytedance.neverland.network.Connector._lancet.m20125xff4d584d(r3)     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            java.lang.String r11 = com.bytedance.neverland.internal.Utility.obtainStringFromInputStream(r11)     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            r0.<init>(r11)     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            java.lang.String r11 = "interval"
            int r11 = r0.getInt(r11)     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            if (r11 == 0) goto L_0x00b1
            int r0 = sTimeMinutesInterval     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            if (r11 == r0) goto L_0x00b1
            sTimeMinutesInterval = r11     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            r0 = 60000(0xea60, float:8.4078E-41)
            int r11 = r11 * r0
            long r9 = (long) r11     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            long r7 = r7 + r9
            android.content.SharedPreferences$Editor r11 = r2.edit()     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            java.lang.String r0 = "time_can_report"
            android.content.SharedPreferences$Editor r11 = r11.putLong(r0, r7)     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
            r11.commit()     // Catch:{ Throwable -> 0x00bf, all -> 0x00bd }
        L_0x00b1:
            com.bytedance.neverland.internal.Utility.closeQuietly(r6)
            com.bytedance.neverland.internal.Utility.closeQuietly(r5)
            if (r3 == 0) goto L_0x00bc
            r3.disconnect()
        L_0x00bc:
            return r4
        L_0x00bd:
            r11 = move-exception
            goto L_0x00cf
        L_0x00bf:
            r0 = r6
            goto L_0x00dd
        L_0x00c1:
            r11 = move-exception
            r6 = r0
            goto L_0x00cf
        L_0x00c4:
            goto L_0x00dd
        L_0x00c6:
            r11 = move-exception
            r5 = r0
            goto L_0x00ce
        L_0x00c9:
            r5 = r0
            goto L_0x00dd
        L_0x00cb:
            r11 = move-exception
            r3 = r0
            r5 = r3
        L_0x00ce:
            r6 = r5
        L_0x00cf:
            com.bytedance.neverland.internal.Utility.closeQuietly(r6)
            com.bytedance.neverland.internal.Utility.closeQuietly(r5)
            if (r3 == 0) goto L_0x00da
            r3.disconnect()
        L_0x00da:
            throw r11
        L_0x00db:
            r3 = r0
            r5 = r3
        L_0x00dd:
            com.bytedance.neverland.internal.Utility.closeQuietly(r0)
            com.bytedance.neverland.internal.Utility.closeQuietly(r5)
            if (r3 == 0) goto L_0x00e8
            r3.disconnect()
        L_0x00e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.neverland.network.Connector.connect(java.lang.String):boolean");
    }
}
