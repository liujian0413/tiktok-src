package com.bytedance.ies.net.p574b;

import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.p852c.C19279b;
import com.p280ss.android.common.p852c.C19281d;
import com.p280ss.android.common.p852c.p853a.C19274a;
import com.p280ss.android.common.p852c.p853a.C19274a.C19275a;
import com.p280ss.android.common.p852c.p853a.C19274a.C19276b;
import com.p280ss.android.common.p852c.p853a.C19274a.C19277c;
import com.p280ss.android.common.p852c.p853a.C19274a.C19278d;
import com.p280ss.android.common.util.C19288d;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.p296a.C19565e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.bytedance.ies.net.b.c */
public final class C10923c implements C19279b {

    /* renamed from: a */
    private final String f29581a = " okhttp/3.5.0";

    /* renamed from: b */
    private C10921a f29582b;

    /* renamed from: com.bytedance.ies.net.b.c$a */
    public static class C10926a implements C19281d {

        /* renamed from: a */
        Call f29589a;

        /* renamed from: a */
        public final void mo26330a() {
            if (this.f29589a != null) {
                this.f29589a.cancel();
            }
        }

        public C10926a(Call call) {
            this.f29589a = call;
        }
    }

    /* renamed from: a */
    private static String m32032a(String str) {
        return "1.1.1.1";
    }

    /* renamed from: a */
    public final byte[] mo26329a(int i, String str) throws Exception {
        ResponseBody responseBody;
        ResponseBody responseBody2 = null;
        try {
            Response execute = this.f29582b.mo26320b().newCall(new Builder().url(str).build()).execute();
            if (execute.code == 200) {
                responseBody = execute.body;
                if (responseBody != null) {
                    try {
                        InputStream byteStream = responseBody.byteStream();
                        String header = execute.header("Content-Length");
                        long j = -1;
                        if (header != null) {
                            j = Long.parseLong(header);
                        }
                        byte[] stream2ByteArray = NetworkUtils.stream2ByteArray(i, byteStream, j);
                        NetworkUtils.safeClose(responseBody);
                        return stream2ByteArray;
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        th = th;
                        responseBody2 = responseBody;
                        NetworkUtils.safeClose(responseBody2);
                        throw th;
                    }
                }
                NetworkUtils.safeClose(responseBody);
                return null;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            NetworkUtils.safeClose(responseBody2);
            throw th;
        }
        responseBody = null;
        NetworkUtils.safeClose(responseBody);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fd A[SYNTHETIC, Splitter:B:64:0x00fd] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26327a(int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.p280ss.android.common.util.C6773c<java.lang.String> r22, java.lang.String r23, com.p280ss.android.common.util.C6775g r24, java.util.List<com.p280ss.android.http.legacy.p296a.C19565e> r25, java.lang.String[] r26, int[] r27) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r24
            r13 = r26
            r2 = r27
            com.bytedance.ies.net.b.a r3 = r1.f29582b
            okhttp3.OkHttpClient r3 = r3.mo26320b()
            r4 = 0
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder     // Catch:{ all -> 0x00f6 }
            r5.<init>()     // Catch:{ all -> 0x00f6 }
            r6 = r18
            okhttp3.Request$Builder r5 = r5.url(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = com.p280ss.android.common.util.NetworkUtils.getUserAgent()     // Catch:{ all -> 0x00f6 }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ all -> 0x00f6 }
            if (r7 != 0) goto L_0x003a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r7.<init>()     // Catch:{ all -> 0x00f6 }
            r7.append(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = " okhttp/3.5.0"
            r7.append(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "User-Agent"
            r5.header(r7, r6)     // Catch:{ all -> 0x00f6 }
        L_0x003a:
            if (r25 == 0) goto L_0x0058
            java.util.Iterator r6 = r25.iterator()     // Catch:{ all -> 0x00f6 }
        L_0x0040:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x0058
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00f6 }
            com.ss.android.http.legacy.a.e r7 = (com.p280ss.android.http.legacy.p296a.C19565e) r7     // Catch:{ all -> 0x00f6 }
            java.lang.String r8 = r7.mo51722a()     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = r7.mo51723b()     // Catch:{ all -> 0x00f6 }
            r5.addHeader(r8, r7)     // Catch:{ all -> 0x00f6 }
            goto L_0x0040
        L_0x0058:
            okhttp3.Request r5 = r5.build()     // Catch:{ all -> 0x00f6 }
            okhttp3.Call r3 = r3.newCall(r5)     // Catch:{ all -> 0x00f6 }
            okhttp3.Response r6 = r3.execute()     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "x-snssdk.remoteaddr"
            java.lang.String r14 = r6.header(r7)     // Catch:{ all -> 0x00f6 }
            r7 = 0
            if (r0 == 0) goto L_0x007a
            boolean r8 = r0.f19289a     // Catch:{ all -> 0x0075 }
            if (r8 == 0) goto L_0x007a
            m32034a(r13, r14)
            return r7
        L_0x0075:
            r0 = move-exception
            r15 = r4
        L_0x0077:
            r4 = r14
            goto L_0x00f8
        L_0x007a:
            int r8 = r6.code     // Catch:{ all -> 0x0075 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x00ea
            okhttp3.ResponseBody r15 = r6.body     // Catch:{ all -> 0x0075 }
            if (r15 == 0) goto L_0x00e1
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r6.header(r4)     // Catch:{ all -> 0x00df }
            r8 = -1
            if (r4 == 0) goto L_0x0092
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x00df }
        L_0x0092:
            if (r2 == 0) goto L_0x00a3
            int r4 = r2.length     // Catch:{ all -> 0x00df }
            if (r4 <= 0) goto L_0x00a3
            r2[r7] = r7     // Catch:{ all -> 0x00df }
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x00a3
            int r4 = (int) r8     // Catch:{ all -> 0x00df }
            r2[r7] = r4     // Catch:{ all -> 0x00df }
        L_0x00a3:
            java.io.InputStream r2 = r15.byteStream()     // Catch:{ all -> 0x00df }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r6.header(r4)     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00bd
            java.lang.String r6 = "gzip"
            boolean r4 = r6.equalsIgnoreCase(r4)     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00bd
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00df }
            r4.<init>(r2)     // Catch:{ all -> 0x00df }
            r2 = r4
        L_0x00bd:
            com.bytedance.ies.net.b.c$1 r6 = new com.bytedance.ies.net.b.c$1     // Catch:{ all -> 0x00df }
            r6.<init>(r5, r3)     // Catch:{ all -> 0x00df }
            r3 = r8
            r5 = r6
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            boolean r0 = com.p280ss.android.common.util.NetworkUtils.stream2File(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00df }
            m32034a(r13, r14)
            if (r15 == 0) goto L_0x00de
            com.p280ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00de }
        L_0x00de:
            return r0
        L_0x00df:
            r0 = move-exception
            goto L_0x0077
        L_0x00e1:
            m32034a(r13, r14)
            if (r15 == 0) goto L_0x00e9
            com.p280ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00e9 }
        L_0x00e9:
            return r7
        L_0x00ea:
            java.lang.String r0 = "Reason-Phrase"
            java.lang.String r0 = r6.header(r0)     // Catch:{ all -> 0x0075 }
            com.ss.android.http.legacy.client.HttpResponseException r2 = new com.ss.android.http.legacy.client.HttpResponseException     // Catch:{ all -> 0x0075 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0075 }
            throw r2     // Catch:{ all -> 0x0075 }
        L_0x00f6:
            r0 = move-exception
            r15 = r4
        L_0x00f8:
            m32034a(r13, r4)
            if (r15 == 0) goto L_0x0100
            com.p280ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x0100 }
        L_0x0100:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.net.p574b.C10923c.mo26327a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.g, java.util.List, java.lang.String[], int[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0104 A[SYNTHETIC, Splitter:B:63:0x0104] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26328a(int r17, java.lang.String r18, java.lang.StringBuffer r19, java.lang.StringBuffer r20, java.lang.StringBuffer r21, com.p280ss.android.common.util.C6773c<java.lang.String> r22, java.lang.String r23, com.p280ss.android.common.util.C6775g r24, java.util.List<com.p280ss.android.http.legacy.p296a.C19565e> r25, java.lang.String[] r26, int[] r27, org.apache.http.client.RedirectHandler r28) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r24
            r13 = r26
            r2 = r27
            com.bytedance.ies.net.b.a r3 = r1.f29582b
            okhttp3.OkHttpClient r3 = r3.mo26320b()
            r4 = 0
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder     // Catch:{ all -> 0x00fd }
            r5.<init>()     // Catch:{ all -> 0x00fd }
            r6 = r18
            okhttp3.Request$Builder r5 = r5.url(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = com.p280ss.android.common.util.NetworkUtils.getUserAgent()     // Catch:{ all -> 0x00fd }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ all -> 0x00fd }
            if (r7 != 0) goto L_0x003a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r7.<init>()     // Catch:{ all -> 0x00fd }
            r7.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = " okhttp/3.5.0"
            r7.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = "User-Agent"
            r5.header(r7, r6)     // Catch:{ all -> 0x00fd }
        L_0x003a:
            if (r25 == 0) goto L_0x0058
            java.util.Iterator r6 = r25.iterator()     // Catch:{ all -> 0x00fd }
        L_0x0040:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00fd }
            if (r7 == 0) goto L_0x0058
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00fd }
            com.ss.android.http.legacy.a.e r7 = (com.p280ss.android.http.legacy.p296a.C19565e) r7     // Catch:{ all -> 0x00fd }
            java.lang.String r8 = r7.mo51722a()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = r7.mo51723b()     // Catch:{ all -> 0x00fd }
            r5.addHeader(r8, r7)     // Catch:{ all -> 0x00fd }
            goto L_0x0040
        L_0x0058:
            okhttp3.Request r5 = r5.build()     // Catch:{ all -> 0x00fd }
            okhttp3.Call r3 = r3.newCall(r5)     // Catch:{ all -> 0x00fd }
            okhttp3.Response r6 = r3.execute()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = "x-snssdk.remoteaddr"
            java.lang.String r14 = r6.header(r7)     // Catch:{ all -> 0x00fd }
            r7 = 0
            if (r0 == 0) goto L_0x0078
            boolean r8 = r0.f19289a     // Catch:{ all -> 0x0075 }
            if (r8 == 0) goto L_0x0078
            m32034a(r13, r14)
            return r7
        L_0x0075:
            r0 = move-exception
            goto L_0x00ff
        L_0x0078:
            int r8 = r6.code     // Catch:{ all -> 0x0075 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x00f1
            okhttp3.ResponseBody r15 = r6.body     // Catch:{ all -> 0x0075 }
            if (r15 == 0) goto L_0x00e8
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r6.header(r4)     // Catch:{ all -> 0x00e5 }
            r8 = -1
            if (r4 == 0) goto L_0x0090
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x00e5 }
        L_0x0090:
            if (r2 == 0) goto L_0x00a1
            int r4 = r2.length     // Catch:{ all -> 0x00e5 }
            if (r4 <= 0) goto L_0x00a1
            r2[r7] = r7     // Catch:{ all -> 0x00e5 }
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x00a1
            int r4 = (int) r8     // Catch:{ all -> 0x00e5 }
            r2[r7] = r4     // Catch:{ all -> 0x00e5 }
        L_0x00a1:
            java.io.InputStream r2 = r15.byteStream()     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r6.header(r4)     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00bb
            java.lang.String r6 = "gzip"
            boolean r4 = r6.equalsIgnoreCase(r4)     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00bb
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00e5 }
            r4.<init>(r2)     // Catch:{ all -> 0x00e5 }
            r2 = r4
        L_0x00bb:
            com.bytedance.ies.net.b.c$2 r6 = new com.bytedance.ies.net.b.c$2     // Catch:{ all -> 0x00e5 }
            r6.<init>(r5, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = r19.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r10 = r20.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = r21.toString()     // Catch:{ all -> 0x00e5 }
            r3 = r8
            r5 = r6
            r6 = r17
            r8 = r10
            r9 = r11
            r10 = r22
            r11 = r23
            r12 = r24
            boolean r0 = com.p280ss.android.common.util.NetworkUtils.stream2File(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e5 }
            m32034a(r13, r14)
            if (r15 == 0) goto L_0x00e4
            com.p280ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00e4 }
        L_0x00e4:
            return r0
        L_0x00e5:
            r0 = move-exception
            r4 = r15
            goto L_0x00ff
        L_0x00e8:
            m32034a(r13, r14)
            if (r15 == 0) goto L_0x00f0
            com.p280ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00f0 }
        L_0x00f0:
            return r7
        L_0x00f1:
            java.lang.String r0 = "Reason-Phrase"
            java.lang.String r0 = r6.header(r0)     // Catch:{ all -> 0x0075 }
            com.ss.android.http.legacy.client.HttpResponseException r2 = new com.ss.android.http.legacy.client.HttpResponseException     // Catch:{ all -> 0x0075 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0075 }
            throw r2     // Catch:{ all -> 0x0075 }
        L_0x00fd:
            r0 = move-exception
            r14 = r4
        L_0x00ff:
            m32034a(r13, r14)
            if (r4 == 0) goto L_0x0107
            com.p280ss.android.common.util.NetworkUtils.safeClose(r4)     // Catch:{ Throwable -> 0x0107 }
        L_0x0107:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.net.p574b.C10923c.mo26328a(int, java.lang.String, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.g, java.util.List, java.lang.String[], int[], org.apache.http.client.RedirectHandler):boolean");
    }

    /* renamed from: a */
    public final String mo26326a(int i, String str, C19274a aVar, C19288d<Long> dVar, long j, C19281d[] dVarArr) throws Exception {
        Builder url = new Builder().url(str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (C19277c cVar : aVar.f52170a) {
            if (cVar instanceof C19278d) {
                type.addFormDataPart(cVar.mo51163a(), (String) cVar.mo51164b());
            } else if (cVar instanceof C19275a) {
                C19275a aVar2 = (C19275a) cVar;
                type.addFormDataPart(aVar2.mo51163a(), aVar2.f52173c, RequestBody.create((MediaType) null, (byte[]) aVar2.mo51164b()));
            } else if (cVar instanceof C19276b) {
                File file = (File) cVar.mo51164b();
                type.addFormDataPart(cVar.mo51163a(), file.getName(), RequestBody.create((MediaType) null, file));
            }
        }
        return m32030a(0, i, str, url, (RequestBody) type.build(), dVarArr);
    }

    /* renamed from: a */
    public final String mo26325a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C6809a> list) throws Exception {
        RequestBody create;
        Builder url = new Builder().url(str);
        if (str2 != null) {
            url.header("Content-Encoding", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            url.header("Content-Type", str3);
        }
        url.addHeader("Accept-Encoding", "gzip");
        if (list != null) {
            for (C6809a aVar : list) {
                url.addHeader(aVar.mo16635a(), aVar.mo16636b());
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            create = RequestBody.create(MediaType.parse(str3), bArr);
        } else {
            create = RequestBody.create((MediaType) null, bArr);
        }
        return m32030a(i, i2, str, url, create, (C19281d[]) null);
    }

    public C10923c(C10921a aVar) {
        this.f29582b = aVar;
    }

    /* renamed from: a */
    private static void m32034a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !C6319n.m19593a(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Request m32033a(int i, Request request) throws Exception {
        if (i < 0) {
            return request;
        }
        return request.newBuilder().cacheControl(new CacheControl.Builder().maxStale(i, TimeUnit.SECONDS).build()).removeHeader("Pragma").build();
    }

    /* renamed from: a */
    private static String m32031a(int i, ResponseBody responseBody, Response response) throws IOException {
        String str;
        if (responseBody == null || response == null) {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
        InputStream byteStream = responseBody.byteStream();
        boolean z = false;
        String header = response.header("Content-Encoding");
        if (header != null && "gzip".equalsIgnoreCase(header)) {
            z = true;
        }
        try {
            MediaType contentType = responseBody.contentType();
            if (contentType != null) {
                str = contentType.toString();
            } else {
                str = response.header("Content-Type");
            }
            if (str == null) {
                str = "";
            }
            boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
            long contentLength = responseBody.contentLength();
            String str2 = null;
            if (contentLength > 2147483647L) {
                return null;
            }
            if (contentType != null) {
                if (contentType.charset() != null) {
                    str2 = contentType.charset().name();
                }
            }
            if (str2 == null) {
                str2 = "UTF-8";
            }
            String response2String = NetworkUtils.response2String(z, testIsSSBinary, i, byteStream, str2);
            NetworkUtils.safeClose(byteStream);
            return response2String;
        } finally {
            NetworkUtils.safeClose(byteStream);
        }
    }

    /* renamed from: a */
    public final String mo26324a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        return mo26325a(i, i2, str, bArr, str2, str3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r6 = r1;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.p280ss.android.common.util.NetworkUtils.safeClose(r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fa A[SYNTHETIC, Splitter:B:62:0x00fa] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m32030a(int r20, int r21, java.lang.String r22, okhttp3.Request.Builder r23, okhttp3.RequestBody r24, com.p280ss.android.common.p852c.C19281d[] r25) throws java.lang.Exception {
        /*
            r19 = this;
            r5 = r22
            r9 = r19
            r0 = r25
            com.bytedance.ies.net.b.a r1 = r9.f29582b
            okhttp3.OkHttpClient r1 = r1.mo26319a()
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.common.util.NetworkUtils$e r7 = new com.ss.android.common.util.NetworkUtils$e
            r7.<init>()
            java.lang.String r4 = m32032a(r22)
            r7.f19266a = r4
            r4 = 0
            r23.post(r24)     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            okhttp3.Request r6 = r23.build()     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            r8 = r20
            okhttp3.Request r6 = m32033a(r8, r6)     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            okhttp3.Call r1 = r1.newCall(r6)     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            if (r0 == 0) goto L_0x003a
            int r8 = r0.length     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            if (r8 <= 0) goto L_0x003a
            r8 = 0
            com.bytedance.ies.net.b.c$a r10 = new com.bytedance.ies.net.b.c$a     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            r10.<init>(r1)     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            r0[r8] = r10     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
        L_0x003a:
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00de, all -> 0x00dc }
            okhttp3.Response r0 = r1.execute()     // Catch:{ Exception -> 0x00da, all -> 0x00dc }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00da, all -> 0x00dc }
            r3 = 0
            long r10 = r1 - r17
            java.lang.String r1 = "X-TT-LOGID"
            java.lang.String r1 = r0.header(r1)     // Catch:{ Exception -> 0x00da, all -> 0x00dc }
            com.ss.android.common.util.NetworkUtils$d r2 = com.p280ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r2 == 0) goto L_0x008f
            com.ss.android.common.util.NetworkUtils$d r2 = com.p280ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            java.lang.String r2 = r2.mo16556a()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r3 != 0) goto L_0x008f
            java.util.List r2 = r0.headers(r2)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r2 == 0) goto L_0x008f
            int r3 = r2.size()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r3 <= 0) goto L_0x008f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r3.<init>()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
        L_0x0078:
            boolean r8 = r2.hasNext()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r8 == 0) goto L_0x0088
            java.lang.Object r8 = r2.next()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r3.add(r8)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            goto L_0x0078
        L_0x0088:
            com.ss.android.common.util.NetworkUtils$d r2 = com.p280ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r2.mo16557a(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
        L_0x008f:
            int r2 = r0.code     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x00ca
            okhttp3.ResponseBody r2 = r0.body     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            if (r2 == 0) goto L_0x00c4
            r3 = r21
            java.lang.String r0 = m32031a(r3, r2, r0)     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            com.p280ss.android.common.util.NetworkUtils.handleTimeStampFromResponse(r0)     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            com.p280ss.android.common.util.NetworkUtils.handleApiOk(r5, r10, r4)     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            okhttp3.HttpUrl r3 = r6.url     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            java.net.URL r3 = r3.url()     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            java.lang.String r14 = r3.toString()     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            r12 = r17
            r15 = r1
            r16 = r7
            com.p280ss.android.common.util.NetworkUtils.monitorApiSample(r10, r12, r14, r15, r16)     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            if (r2 == 0) goto L_0x00bc
            com.p280ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x00bc }
        L_0x00bc:
            return r0
        L_0x00bd:
            r0 = move-exception
            r4 = r2
            goto L_0x00f8
        L_0x00c0:
            r0 = move-exception
            r6 = r1
            r10 = r2
            goto L_0x00e3
        L_0x00c4:
            if (r2 == 0) goto L_0x00c9
            com.p280ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x00c9 }
        L_0x00c9:
            return r4
        L_0x00ca:
            java.lang.String r3 = "Reason-Phrase"
            java.lang.String r0 = r0.header(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            com.ss.android.http.legacy.client.HttpResponseException r3 = new com.ss.android.http.legacy.client.HttpResponseException     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
            throw r3     // Catch:{ Exception -> 0x00d6, all -> 0x00dc }
        L_0x00d6:
            r0 = move-exception
            r6 = r1
            r10 = r4
            goto L_0x00e3
        L_0x00da:
            r0 = move-exception
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            goto L_0x00f8
        L_0x00de:
            r0 = move-exception
            r17 = r2
        L_0x00e1:
            r6 = r4
            r10 = r6
        L_0x00e3:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f6 }
            r3 = 0
            long r1 = r1 - r17
            com.p280ss.android.common.util.NetworkUtils.handleApiError(r5, r0, r1, r4)     // Catch:{ all -> 0x00f6 }
            r3 = r17
            r5 = r22
            r8 = r0
            com.p280ss.android.common.util.NetworkUtils.monitorApiError(r1, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x00f6 }
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            r4 = r10
        L_0x00f8:
            if (r4 == 0) goto L_0x00fd
            com.p280ss.android.common.util.NetworkUtils.safeClose(r4)     // Catch:{ Throwable -> 0x00fd }
        L_0x00fd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.net.p574b.C10923c.m32030a(int, int, java.lang.String, okhttp3.Request$Builder, okhttp3.RequestBody, com.ss.android.common.c.d[]):java.lang.String");
    }

    /* renamed from: a */
    public final String mo26321a(int i, int i2, String str, List<C19565e> list, C19274a aVar, C19281d[] dVarArr) throws Exception {
        Builder url = new Builder().url(str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (C19565e eVar : list) {
            type.addFormDataPart(eVar.mo51722a(), eVar.mo51723b());
        }
        for (C19277c cVar : aVar.f52170a) {
            if (cVar instanceof C19278d) {
                type.addFormDataPart(cVar.mo51163a(), (String) cVar.mo51164b());
            } else if (cVar instanceof C19275a) {
                C19275a aVar2 = (C19275a) cVar;
                type.addFormDataPart(aVar2.mo51163a(), aVar2.f52173c, RequestBody.create((MediaType) null, (byte[]) aVar2.mo51164b()));
            } else if (cVar instanceof C19276b) {
                File file = (File) cVar.mo51164b();
                type.addFormDataPart(cVar.mo51163a(), file.getName(), RequestBody.create((MediaType) null, file));
            }
        }
        url.addHeader("Accept-Encoding", "gzip");
        return m32030a(i, i2, str, url, (RequestBody) new C10927d(type.build()), dVarArr);
    }

    /* renamed from: a */
    public final String mo26323a(int i, int i2, String str, List<C19565e> list, boolean z, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        Builder url = new Builder().url(str);
        FormBody.Builder builder = new FormBody.Builder();
        for (C19565e eVar : list) {
            builder.add(eVar.mo51722a(), eVar.mo51723b());
        }
        url.addHeader("Accept-Encoding", "gzip");
        if (list2 != null) {
            for (C6809a aVar : list2) {
                url.addHeader(aVar.mo16635a(), aVar.mo16636b());
            }
        }
        return m32030a(i, i2, str, url, (RequestBody) builder.build(), dVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0149, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014a, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014e, code lost:
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0149 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0167 A[SYNTHETIC, Splitter:B:83:0x0167] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo26322a(int r19, int r20, java.lang.String r21, java.util.List<com.p280ss.android.http.legacy.C6809a> r22, boolean r23, boolean r24, com.p280ss.android.http.legacy.p296a.C6810f r25, boolean r26) throws java.lang.Exception {
        /*
            r18 = this;
            r5 = r21
            r0 = r25
            long r3 = java.lang.System.currentTimeMillis()
            r13 = r18
            com.bytedance.ies.net.b.a r1 = r13.f29582b
            okhttp3.OkHttpClient r1 = r1.mo26319a()
            com.ss.android.common.util.NetworkUtils$e r14 = new com.ss.android.common.util.NetworkUtils$e
            r14.<init>()
            java.lang.String r2 = m32032a(r21)
            r14.f19266a = r2
            okhttp3.Request$Builder r6 = new okhttp3.Request$Builder     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            r6.<init>()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            okhttp3.Request$Builder r6 = r6.url(r5)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            java.lang.String r7 = "Accept-Encoding"
            java.lang.String r8 = "gzip"
            r6.addHeader(r7, r8)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            if (r22 == 0) goto L_0x0051
            java.util.Iterator r7 = r22.iterator()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
        L_0x0031:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            if (r8 == 0) goto L_0x0051
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            com.ss.android.http.legacy.a r8 = (com.p280ss.android.http.legacy.C6809a) r8     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            java.lang.String r9 = r8.mo16635a()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            java.lang.String r8 = r8.mo16636b()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            if (r9 == 0) goto L_0x0031
            int r10 = r9.length()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            if (r10 <= 0) goto L_0x0031
            r6.addHeader(r9, r8)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            goto L_0x0031
        L_0x0051:
            okhttp3.Request r6 = r6.build()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            r7 = r19
            okhttp3.Request r6 = m32033a(r7, r6)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            okhttp3.Call r1 = r1.newCall(r6)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            okhttp3.Response r1 = r1.execute()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            r9 = 0
            long r7 = r7 - r3
            java.lang.String r9 = "X-TT-LOGID"
            java.lang.String r15 = r1.header(r9)     // Catch:{ Exception -> 0x014d, all -> 0x0149 }
            com.ss.android.common.util.NetworkUtils$d r9 = com.p280ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r9 == 0) goto L_0x00af
            com.ss.android.common.util.NetworkUtils$d r9 = com.p280ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            java.lang.String r9 = r9.mo16556a()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            boolean r10 = com.bytedance.common.utility.C6319n.m19593a(r9)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r10 != 0) goto L_0x00af
            java.util.List r9 = r1.headers(r9)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r9 == 0) goto L_0x00af
            int r10 = r9.size()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r10 <= 0) goto L_0x00af
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r10.<init>()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x0098:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r11 == 0) goto L_0x00a8
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r10.add(r11)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            goto L_0x0098
        L_0x00a8:
            com.ss.android.common.util.NetworkUtils$d r9 = com.p280ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r9.mo16557a(r10)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x00af:
            if (r0 == 0) goto L_0x00fd
            okhttp3.Headers r9 = r1.headers     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r10 = 0
            int r11 = r9.size()     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x00b8:
            if (r10 >= r11) goto L_0x00fd
            java.lang.String r12 = r9.name(r10)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            java.lang.String r2 = "ETag"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "Last-Modified"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "Cache-Control"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "X-SS-SIGN"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 != 0) goto L_0x00ea
            java.lang.String r2 = "X-TT-LOGID"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 == 0) goto L_0x00e7
            goto L_0x00ea
        L_0x00e7:
            r17 = r9
            goto L_0x00f8
        L_0x00ea:
            java.lang.String r2 = r9.value(r10)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r17 = r9
            com.ss.android.http.legacy.a.a r9 = new com.ss.android.http.legacy.a.a     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r9.<init>(r12, r2)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r0.mo16638a(r9)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x00f8:
            int r10 = r10 + 1
            r9 = r17
            goto L_0x00b8
        L_0x00fd:
            int r0 = r1.code     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x013a
            okhttp3.ResponseBody r2 = r1.body     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            if (r2 == 0) goto L_0x0133
            r0 = r20
            java.lang.String r0 = m32031a(r0, r2, r1)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            com.p280ss.android.common.util.NetworkUtils.handleTimeStampFromResponse(r0)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            r1 = 0
            com.p280ss.android.common.util.NetworkUtils.handleApiOk(r5, r7, r1)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            okhttp3.HttpUrl r1 = r6.url     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            java.net.URL r1 = r1.url()     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            r6 = r7
            r8 = r3
            r11 = r15
            r12 = r14
            com.p280ss.android.common.util.NetworkUtils.monitorApiSample(r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
            if (r2 == 0) goto L_0x012a
            com.p280ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x012a }
        L_0x012a:
            return r0
        L_0x012b:
            r0 = move-exception
            r16 = r2
            goto L_0x0165
        L_0x012f:
            r0 = move-exception
            r9 = r2
            r6 = r15
            goto L_0x0150
        L_0x0133:
            if (r2 == 0) goto L_0x0138
            com.p280ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x0138 }
        L_0x0138:
            r1 = 0
            return r1
        L_0x013a:
            java.lang.String r2 = "Reason-Phrase"
            java.lang.String r1 = r1.header(r2)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            com.ss.android.http.legacy.client.HttpResponseException r2 = new com.ss.android.http.legacy.client.HttpResponseException     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
            throw r2     // Catch:{ Exception -> 0x0146, all -> 0x0149 }
        L_0x0146:
            r0 = move-exception
            r6 = r15
            goto L_0x014f
        L_0x0149:
            r0 = move-exception
            r16 = 0
            goto L_0x0165
        L_0x014d:
            r0 = move-exception
            r6 = 0
        L_0x014f:
            r9 = 0
        L_0x0150:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0162 }
            r7 = 0
            long r1 = r1 - r3
            r7 = 0
            com.p280ss.android.common.util.NetworkUtils.handleApiError(r5, r0, r1, r7)     // Catch:{ all -> 0x0162 }
            r5 = r21
            r7 = r14
            r8 = r0
            com.p280ss.android.common.util.NetworkUtils.monitorApiError(r1, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r16 = r9
        L_0x0165:
            if (r16 == 0) goto L_0x016a
            com.p280ss.android.common.util.NetworkUtils.safeClose(r16)     // Catch:{ Throwable -> 0x016a }
        L_0x016a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.net.p574b.C10923c.mo26322a(int, int, java.lang.String, java.util.List, boolean, boolean, com.ss.android.http.legacy.a.f, boolean):java.lang.String");
    }
}
