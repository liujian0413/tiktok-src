package com.linecorp.linesdk.p801a.p802a.p803a;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import com.linecorp.linesdk.C18565a;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.p798a.p799a.C18555a;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.linecorp.linesdk.a.a.a.a */
public final class C18568a {

    /* renamed from: a */
    private static final byte[] f50194a = new byte[0];

    /* renamed from: b */
    private final C18573f f50195b;

    /* renamed from: c */
    private final C18572e f50196c;

    /* renamed from: d */
    private int f50197d;

    /* renamed from: e */
    private int f50198e;

    private C18568a(C18573f fVar) {
        this.f50195b = fVar;
        this.f50196c = new C18572e("UTF-8");
        this.f50197d = 90000;
        this.f50198e = 90000;
    }

    /* renamed from: a */
    private static HttpURLConnection m60988a(Uri uri) {
        URLConnection openConnection = new URL(uri.toString()).openConnection();
        if (!(openConnection instanceof HttpsURLConnection)) {
            throw new IllegalArgumentException("The scheme of the server url must be https.".concat(String.valueOf(uri)));
        } else if (VERSION.SDK_INT >= 24) {
            return (HttpURLConnection) openConnection;
        } else {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setSSLSocketFactory(new C18555a(httpsURLConnection.getSSLSocketFactory()));
            return httpsURLConnection;
        }
    }

    /* renamed from: a */
    private static byte[] m60990a(Map<String, String> map) {
        if (map.isEmpty()) {
            return f50194a;
        }
        Builder builder = new Builder();
        for (Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            return builder.build().getEncodedQuery().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public C18568a(Context context, String str) {
        this(new C18573f(context, str));
    }

    /* renamed from: a */
    private static void m60989a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            C18569b.m60994a(httpURLConnection, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: a */
    private static <T> C18565a<T> m60987a(HttpURLConnection httpURLConnection, C18571d<T> dVar, C18571d<String> dVar2) {
        InputStream inputStream;
        if (httpURLConnection.getResponseCode() < 400) {
            inputStream = C18569b.m60993a(httpURLConnection);
        } else {
            inputStream = httpURLConnection.getErrorStream();
        }
        List list = (List) httpURLConnection.getHeaderFields().get("Content-Encoding");
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (((String) list.get(i)).equalsIgnoreCase("gzip")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z) {
            inputStream = new GZIPInputStream(inputStream);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return C18565a.m60979a(dVar.mo48729a(inputStream));
        }
        try {
            return C18565a.m60978a(LineApiResponseCode.SERVER_ERROR, new LineApiError(responseCode, (String) dVar2.mo48729a(inputStream)));
        } catch (IOException e) {
            return C18565a.m60978a(LineApiResponseCode.INTERNAL_ERROR, new LineApiError(responseCode, (Exception) e));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.linecorp.linesdk.C18565a<T> mo48732b(android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4, java.util.Map<java.lang.String, java.lang.String> r5, com.linecorp.linesdk.p801a.p802a.p803a.C18571d<T> r6) {
        /*
            r2 = this;
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x000c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.appendQueryParameter(r1, r0)
            goto L_0x000c
        L_0x0028:
            r5 = 0
            android.net.Uri r3 = r3.build()     // Catch:{ IOException -> 0x0070 }
            java.net.HttpURLConnection r3 = m60988a(r3)     // Catch:{ IOException -> 0x0070 }
            r0 = 1
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0070 }
            java.lang.String r0 = "User-Agent"
            com.linecorp.linesdk.a.a.a.f r1 = r2.f50195b     // Catch:{ IOException -> 0x0070 }
            java.lang.String r1 = r1.mo48735a()     // Catch:{ IOException -> 0x0070 }
            com.linecorp.linesdk.p801a.p802a.p803a.C18569b.m60994a(r3, r0, r1)     // Catch:{ IOException -> 0x0070 }
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r1 = "gzip"
            com.linecorp.linesdk.p801a.p802a.p803a.C18569b.m60994a(r3, r0, r1)     // Catch:{ IOException -> 0x0070 }
            int r0 = r2.f50197d     // Catch:{ IOException -> 0x0070 }
            r3.setConnectTimeout(r0)     // Catch:{ IOException -> 0x0070 }
            int r0 = r2.f50198e     // Catch:{ IOException -> 0x0070 }
            r3.setReadTimeout(r0)     // Catch:{ IOException -> 0x0070 }
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)     // Catch:{ IOException -> 0x0070 }
            m60989a(r3, r4)     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            r3.connect()     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            com.linecorp.linesdk.a.a.a.e r4 = r2.f50196c     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            com.linecorp.linesdk.a r4 = m60987a(r3, r6, r4)     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            if (r3 == 0) goto L_0x0067
            r3.disconnect()
        L_0x0067:
            return r4
        L_0x0068:
            r4 = move-exception
            r5 = r3
            goto L_0x0082
        L_0x006b:
            r4 = move-exception
            r5 = r3
            goto L_0x0071
        L_0x006e:
            r4 = move-exception
            goto L_0x0082
        L_0x0070:
            r4 = move-exception
        L_0x0071:
            com.linecorp.linesdk.LineApiResponseCode r3 = com.linecorp.linesdk.LineApiResponseCode.NETWORK_ERROR     // Catch:{ all -> 0x006e }
            com.linecorp.linesdk.LineApiError r6 = new com.linecorp.linesdk.LineApiError     // Catch:{ all -> 0x006e }
            r6.<init>(r4)     // Catch:{ all -> 0x006e }
            com.linecorp.linesdk.a r3 = com.linecorp.linesdk.C18565a.m60978a(r3, r6)     // Catch:{ all -> 0x006e }
            if (r5 == 0) goto L_0x0081
            r5.disconnect()
        L_0x0081:
            return r3
        L_0x0082:
            if (r5 == 0) goto L_0x0087
            r5.disconnect()
        L_0x0087:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.p801a.p802a.p803a.C18568a.mo48732b(android.net.Uri, java.util.Map, java.util.Map, com.linecorp.linesdk.a.a.a.d):com.linecorp.linesdk.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.linecorp.linesdk.C18565a<T> mo48731a(android.net.Uri r6, java.util.Map<java.lang.String, java.lang.String> r7, java.util.Map<java.lang.String, java.lang.String> r8, com.linecorp.linesdk.p801a.p802a.p803a.C18571d<T> r9) {
        /*
            r5 = this;
            byte[] r8 = m60990a(r8)
            r0 = 0
            int r1 = r8.length     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r6 = m60988a(r6)     // Catch:{ IOException -> 0x0066 }
            r2 = 1
            r6.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "User-Agent"
            com.linecorp.linesdk.a.a.a.f r4 = r5.f50195b     // Catch:{ IOException -> 0x0066 }
            java.lang.String r4 = r4.mo48735a()     // Catch:{ IOException -> 0x0066 }
            com.linecorp.linesdk.p801a.p802a.p803a.C18569b.m60994a(r6, r3, r4)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "gzip"
            com.linecorp.linesdk.p801a.p802a.p803a.C18569b.m60994a(r6, r3, r4)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            com.linecorp.linesdk.p801a.p802a.p803a.C18569b.m60994a(r6, r3, r4)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "Content-Length"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0066 }
            com.linecorp.linesdk.p801a.p802a.p803a.C18569b.m60994a(r6, r3, r1)     // Catch:{ IOException -> 0x0066 }
            int r1 = r5.f50197d     // Catch:{ IOException -> 0x0066 }
            r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0066 }
            int r1 = r5.f50198e     // Catch:{ IOException -> 0x0066 }
            r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x0066 }
            java.lang.String r1 = "POST"
            r6.setRequestMethod(r1)     // Catch:{ IOException -> 0x0066 }
            r6.setDoOutput(r2)     // Catch:{ IOException -> 0x0066 }
            m60989a(r6, r7)     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            r6.connect()     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            java.io.OutputStream r7 = r6.getOutputStream()     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            r7.write(r8)     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            r7.flush()     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            com.linecorp.linesdk.a.a.a.e r7 = r5.f50196c     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            com.linecorp.linesdk.a r7 = m60987a(r6, r9, r7)     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            if (r6 == 0) goto L_0x005d
            r6.disconnect()
        L_0x005d:
            return r7
        L_0x005e:
            r7 = move-exception
            r0 = r6
            goto L_0x0078
        L_0x0061:
            r7 = move-exception
            r0 = r6
            goto L_0x0067
        L_0x0064:
            r7 = move-exception
            goto L_0x0078
        L_0x0066:
            r7 = move-exception
        L_0x0067:
            com.linecorp.linesdk.LineApiResponseCode r6 = com.linecorp.linesdk.LineApiResponseCode.NETWORK_ERROR     // Catch:{ all -> 0x0064 }
            com.linecorp.linesdk.LineApiError r8 = new com.linecorp.linesdk.LineApiError     // Catch:{ all -> 0x0064 }
            r8.<init>(r7)     // Catch:{ all -> 0x0064 }
            com.linecorp.linesdk.a r6 = com.linecorp.linesdk.C18565a.m60978a(r6, r8)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0077
            r0.disconnect()
        L_0x0077:
            return r6
        L_0x0078:
            if (r0 == 0) goto L_0x007d
            r0.disconnect()
        L_0x007d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.p801a.p802a.p803a.C18568a.mo48731a(android.net.Uri, java.util.Map, java.util.Map, com.linecorp.linesdk.a.a.a.d):com.linecorp.linesdk.a");
    }
}
