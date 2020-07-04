package com.bytedance.p532i;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.C1642a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.i.d */
public final class C10285d {

    /* renamed from: a */
    public static String f27940a = "TTVideoSetting";

    /* renamed from: b */
    public static String f27941b = "https://is.snssdk.com";

    /* renamed from: c */
    private static SharedPreferences f27942c;

    /* renamed from: a */
    public static String m30455a() {
        return "VideoCloud";
    }

    /* renamed from: c */
    public static String m30464c() {
        return VERSION.RELEASE;
    }

    /* renamed from: d */
    public static String m30465d() {
        return Build.BRAND;
    }

    /* renamed from: e */
    public static String m30466e() {
        return Build.MODEL;
    }

    /* renamed from: b */
    public static String m30463b() {
        return C1642a.m8034a("%s/service/settings/v2/", new Object[]{f27941b});
    }

    /* renamed from: a */
    private static SharedPreferences m30454a(Context context) {
        if (f27942c == null) {
            f27942c = C7285c.m22838a(context, "com.video.ttvideosetting", 0);
        }
        return f27942c;
    }

    /* renamed from: a */
    private static String m30457a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m30458a(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0061
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x000a
            goto L_0x0061
        L_0x000a:
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x005a, all -> 0x0050 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x005a, all -> 0x0050 }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ Exception -> 0x005a, all -> 0x0050 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x005a, all -> 0x0050 }
            java.lang.String r1 = "GET"
            r6.setRequestMethod(r1)     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            r1 = 5000(0x1388, float:7.006E-42)
            r6.setReadTimeout(r1)     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            r1 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r1)     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            int r1 = r6.getResponseCode()     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x003a
            java.io.InputStream r1 = com.bytedance.p532i.C10286e.m30467a(r6)     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            java.lang.String r1 = m30457a(r1)     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            if (r6 == 0) goto L_0x0039
            r6.disconnect()
        L_0x0039:
            return r1
        L_0x003a:
            android.accounts.NetworkErrorException r2 = new android.accounts.NetworkErrorException     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            java.lang.String r4 = "response status is "
            r3.<init>(r4)     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            r3.append(r1)     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x005b, all -> 0x004e }
            throw r2     // Catch:{ Exception -> 0x005b, all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            goto L_0x0054
        L_0x0050:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
        L_0x0054:
            if (r6 == 0) goto L_0x0059
            r6.disconnect()
        L_0x0059:
            throw r0
        L_0x005a:
            r6 = r0
        L_0x005b:
            if (r6 == 0) goto L_0x0060
            r6.disconnect()
        L_0x0060:
            return r0
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p532i.C10285d.m30458a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m30456a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return m30454a(context).getString(str, "");
    }

    /* renamed from: a */
    public static void m30461a(String str, String str2) {
        if (!(str == null || str.length() == 0 || str2 == null || str2.length() == 0 || ((long) str2.length()) <= 3072)) {
            while (str2.length() > 3072) {
                str2 = str2.replace(str2.substring(0, 3072), "");
            }
        }
    }

    /* renamed from: b */
    public static long m30462b(Context context, String str, long j) {
        return m30454a(context).getLong(str, 0);
    }

    /* renamed from: a */
    public static void m30459a(Context context, String str, long j) {
        if (str != null && !str.isEmpty()) {
            Editor edit = m30454a(context).edit();
            edit.putLong(str, j);
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m30460a(Context context, String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            Editor edit = m30454a(context).edit();
            edit.putString(str, str2);
            edit.commit();
        }
    }
}
