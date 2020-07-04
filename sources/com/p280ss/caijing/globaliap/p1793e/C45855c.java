package com.p280ss.caijing.globaliap.p1793e;

import android.content.Context;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.caijing.globaliap.p1793e.p1794a.C45852a;
import com.p280ss.caijing.globaliap.pay.C45872c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.e.c */
public final class C45855c {

    /* renamed from: c */
    public static C45860f f117271c;

    /* renamed from: a */
    String f117272a;

    /* renamed from: b */
    String f117273b;

    /* renamed from: d */
    private boolean f117274d;

    /* renamed from: com.ss.caijing.globaliap.e.c$a */
    public static class C45856a {

        /* renamed from: a */
        public C45855c f117275a = new C45855c(0);

        /* renamed from: a */
        public final C45856a mo111070a(String str) {
            this.f117275a.f117272a = str;
            return this;
        }

        /* renamed from: a */
        public final C45856a mo111071a(Map<String, String> map) {
            this.f117275a.f117273b = m143904b(map);
            return this;
        }

        /* renamed from: b */
        private static String m143904b(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (String str : map.keySet()) {
                if (z) {
                    sb.append(str);
                    sb.append("=");
                    sb.append((String) map.get(str));
                    z = false;
                } else {
                    sb.append("&");
                    sb.append(str);
                    sb.append("=");
                    sb.append((String) map.get(str));
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.e.c$b */
    public static class C45857b {

        /* renamed from: a */
        public int f117276a;

        /* renamed from: b */
        public String f117277b;

        private C45857b(int i, String str) {
            this.f117276a = i;
            this.f117277b = str;
        }

        /* synthetic */ C45857b(int i, String str, byte b) {
            this(i, str);
        }
    }

    private C45855c() {
        this.f117274d = true;
    }

    /* renamed from: b */
    private static String m143902b() {
        Context b = C45872c.m143951b();
        if (b == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("req_ip", C45852a.m143897b(b));
            jSONObject.put("ua", C45852a.m143896a(b));
            jSONObject.put("lang", "en");
            return URLEncoder.encode(jSONObject.toString(), "UTF-8");
        } catch (JSONException e) {
            C6497a.m20185b(e);
            return "";
        } catch (UnsupportedEncodingException e2) {
            C6497a.m20185b(e2);
            return "";
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|18|22|23|(0)|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b5, code lost:
        r2 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c2, code lost:
        r0.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00b8 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.caijing.globaliap.p1793e.C45855c.C45857b mo111069a() {
        /*
            r6 = this;
            boolean r0 = com.p280ss.base.p1786b.C45780c.m143739a()
            if (r0 != 0) goto L_0x00cc
            r0 = 0
            f117271c = r0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r3 = r6.f117272a     // Catch:{ Exception -> 0x00b8 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b8 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x00b8 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00b8 }
            boolean r3 = r6.f117274d     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r4 = 1
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r2.setDoOutput(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            goto L_0x002a
        L_0x0025:
            java.lang.String r3 = "GET"
            r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
        L_0x002a:
            r2.setDoInput(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r2.setUseCaches(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r3 = 20000(0x4e20, float:2.8026E-41)
            r2.setConnectTimeout(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r2.setReadTimeout(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "Keep-Alive"
            com.p280ss.caijing.globaliap.p1793e.C45858d.m143908a(r2, r3, r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r3 = "Accept-Charset"
            java.lang.String r4 = "UTF-8;"
            com.p280ss.caijing.globaliap.p1793e.C45858d.m143908a(r2, r3, r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            com.p280ss.caijing.globaliap.p1793e.C45858d.m143908a(r2, r3, r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r3 = "Content-Length"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r4.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r5 = r6.f117273b     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            byte[] r5 = r5.getBytes()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            int r5 = r5.length     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r4.append(r5)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            com.p280ss.caijing.globaliap.p1793e.C45858d.m143908a(r2, r3, r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r3 = "devinfo"
            java.lang.String r4 = m143902b()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            com.p280ss.caijing.globaliap.p1793e.C45858d.m143908a(r2, r3, r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r4 = r6.f117273b     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            if (r4 == 0) goto L_0x0087
            r3.write(r0)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            goto L_0x0090
        L_0x0087:
            java.lang.String r0 = r6.f117273b     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r3.write(r0)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
        L_0x0090:
            r3.flush()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r3.close()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.io.InputStream r0 = com.p280ss.caijing.globaliap.p1793e.C45858d.m143907a(r2)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            int r3 = r2.getResponseCode()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            java.lang.String r4 = m143901a(r0)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            com.ss.caijing.globaliap.e.c$b r5 = new com.ss.caijing.globaliap.e.c$b     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r5.<init>(r3, r4, r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            r0.close()     // Catch:{ Exception -> 0x00b2, all -> 0x00b0 }
            if (r2 == 0) goto L_0x00c5
            r2.disconnect()
            goto L_0x00c5
        L_0x00b0:
            r0 = move-exception
            goto L_0x00c6
        L_0x00b2:
            r0 = r2
            goto L_0x00b8
        L_0x00b4:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x00c6
        L_0x00b8:
            com.ss.caijing.globaliap.e.c$b r5 = new com.ss.caijing.globaliap.e.c$b     // Catch:{ all -> 0x00b4 }
            r2 = -1
            java.lang.String r3 = "error"
            r5.<init>(r2, r3, r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00c5
            r0.disconnect()
        L_0x00c5:
            return r5
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            r2.disconnect()
        L_0x00cb:
            throw r0
        L_0x00cc:
            com.ss.caijing.globaliap.e.b r0 = new com.ss.caijing.globaliap.e.b
            java.lang.String r1 = "should not use this method in ui thread"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.caijing.globaliap.p1793e.C45855c.mo111069a():com.ss.caijing.globaliap.e.c$b");
    }

    /* synthetic */ C45855c(byte b) {
        this();
    }

    /* renamed from: a */
    private static String m143901a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }
}
