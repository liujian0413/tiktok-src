package com.bytedance.frameworks.baselib.network.http.p512a.p513a;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.frameworks.baselib.network.http.C10122c;
import com.bytedance.frameworks.baselib.network.http.C10140d;
import com.bytedance.frameworks.baselib.network.http.C10141e;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.frameworks.baselib.network.http.parser.C10174c;
import com.bytedance.frameworks.baselib.network.http.parser.MimeType;
import com.bytedance.retrofit2.C12490m;
import com.bytedance.retrofit2.C12520r;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12465e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.SSLContext;
import okhttp3.Call;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TlsVersion;
import okhttp3.internal.http.HttpMethod;
import okio.BufferedSink;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a.e */
public class C10114e implements C10140d {

    /* renamed from: a */
    public static volatile boolean f27529a = false;

    /* renamed from: b */
    public static Context f27530b = null;

    /* renamed from: c */
    public static C10108b f27531c = null;

    /* renamed from: d */
    public static C10107a f27532d = null;

    /* renamed from: e */
    private static volatile C10114e f27533e = null;

    /* renamed from: f */
    private static volatile int f27534f = -1;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.a.a.e$a */
    public static class C10115a implements C12465e, C12490m {

        /* renamed from: a */
        OkHttpClient f27535a = C10114e.f27531c.mo24767a();

        /* renamed from: b */
        C10104a f27536b = C10104a.m30002a();

        /* renamed from: c */
        long f27537c = 0;

        /* renamed from: d */
        ResponseBody f27538d = null;

        /* renamed from: e */
        String f27539e = null;

        /* renamed from: f */
        C12462c f27540f;

        /* renamed from: g */
        Request f27541g;

        /* renamed from: h */
        Response f27542h;

        /* renamed from: i */
        Call f27543i;

        /* renamed from: j */
        boolean f27544j = false;

        public final Object getRequestInfo() {
            return this.f27536b;
        }

        /* renamed from: b */
        public final void mo10451b() {
            if (this.f27543i != null) {
                this.f27543i.cancel();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x008c A[Catch:{ Exception -> 0x013a, all -> 0x0138 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[Catch:{ Exception -> 0x013a, all -> 0x0138 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ec A[Catch:{ Exception -> 0x013a, all -> 0x0138 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0148 A[Catch:{ all -> 0x0198 }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0153 A[Catch:{ all -> 0x0198 }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0164 A[Catch:{ all -> 0x0198 }] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0187 A[Catch:{ all -> 0x0198 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x018a A[Catch:{ all -> 0x0198 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.retrofit2.p637a.C12464d mo10450a() throws java.io.IOException {
            /*
                r13 = this;
                com.bytedance.retrofit2.a.c r0 = r13.f27540f
                java.lang.String r0 = r0.f33098b
                boolean r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.f27529a
                if (r1 != 0) goto L_0x01b8
                okhttp3.Call r1 = r13.f27543i
                if (r1 == 0) goto L_0x001d
                okhttp3.Call r1 = r13.f27543i
                boolean r1 = r1.isCanceled()
                if (r1 != 0) goto L_0x0015
                goto L_0x001d
            L_0x0015:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "request canceled"
                r0.<init>(r1)
                throw r0
            L_0x001d:
                boolean r1 = r13.f27544j
                if (r1 != 0) goto L_0x0036
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.f27530b
                if (r1 == 0) goto L_0x0036
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.f27530b
                boolean r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10118f.m30041a(r1)
                if (r1 == 0) goto L_0x002e
                goto L_0x0036
            L_0x002e:
                com.bytedance.frameworks.baselib.network.http.exception.NetworkNotAvailabeException r0 = new com.bytedance.frameworks.baselib.network.http.exception.NetworkNotAvailabeException
                java.lang.String r1 = "network not available"
                r0.<init>(r1)
                throw r0
            L_0x0036:
                r10 = 1
                r8 = 0
                com.bytedance.retrofit2.a.c r1 = r13.f27540f     // Catch:{ Exception -> 0x0141, all -> 0x013e }
                boolean r1 = r1.f33102f     // Catch:{ Exception -> 0x0141, all -> 0x013e }
                if (r1 != 0) goto L_0x0053
                com.bytedance.frameworks.baselib.network.http.f$g r1 = com.bytedance.frameworks.baselib.network.http.C10142f.m30119c()     // Catch:{ Exception -> 0x0141, all -> 0x013e }
                if (r1 == 0) goto L_0x0053
                boolean r1 = r1.mo24812c(r0)     // Catch:{ Exception -> 0x0141, all -> 0x013e }
                if (r1 == 0) goto L_0x0053
                com.bytedance.frameworks.baselib.network.connectionclass.d r1 = com.bytedance.frameworks.baselib.network.connectionclass.C10090d.m29964b()     // Catch:{ Exception -> 0x0141, all -> 0x013e }
                r1.mo24737c()     // Catch:{ Exception -> 0x0141, all -> 0x013e }
                r9 = 1
                goto L_0x0054
            L_0x0053:
                r9 = 0
            L_0x0054:
                okhttp3.OkHttpClient r1 = r13.f27535a     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Call r2 = r13.f27543i     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Response r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30023a(r1, r2)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r13.f27542h = r1     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.frameworks.baselib.network.http.a r1 = r13.f27536b     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r1.f27503f = r2     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Call r1 = r13.f27543i     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                if (r1 == 0) goto L_0x007e
                okhttp3.Call r1 = r13.f27543i     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.internal.connection.StreamAllocation r1 = r1.streamAllocation()     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                if (r1 == 0) goto L_0x007e
                com.bytedance.frameworks.baselib.network.http.a r1 = r13.f27536b     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Call r2 = r13.f27543i     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.internal.connection.StreamAllocation r2 = r2.streamAllocation()     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                int r2 = r2.recycleCount     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r1.f27506i = r2     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            L_0x007e:
                okhttp3.Response r1 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f27536b     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30020a(r1, r2)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r13.f27539e = r1     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.frameworks.baselib.network.http.a.a.a r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.f27532d     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                if (r1 == 0) goto L_0x0095
                com.bytedance.frameworks.baselib.network.http.a.a.a r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.f27532d     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Request r2 = r13.f27541g     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Response r3 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r1.mo24766a(r2, r3)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            L_0x0095:
                okhttp3.Response r1 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                int r11 = r1.code     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Response r1 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                java.lang.String r2 = "Content-Type"
                java.lang.String r12 = r1.header(r2)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.retrofit2.a.c r1 = r13.f27540f     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                boolean r1 = r1.f33102f     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                if (r1 == 0) goto L_0x00ec
                okhttp3.Response r1 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                java.lang.String r2 = "Content-Encoding"
                java.lang.String r1 = r1.header(r2)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                if (r1 == 0) goto L_0x00bb
                java.lang.String r2 = "gzip"
                boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                if (r1 == 0) goto L_0x00bb
                r1 = 1
                goto L_0x00bc
            L_0x00bb:
                r1 = 0
            L_0x00bc:
                r2 = 200(0xc8, float:2.8E-43)
                if (r11 < r2) goto L_0x00ce
                r2 = 300(0x12c, float:4.2E-43)
                if (r11 >= r2) goto L_0x00ce
                okhttp3.Response r2 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.ResponseBody r2 = r2.body     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.retrofit2.mime.TypedInput r1 = r13.m30034a(r2, r1)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r6 = r1
                goto L_0x0105
            L_0x00ce:
                okhttp3.Response r2 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                java.lang.String r2 = r2.message     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.retrofit2.a.c r3 = r13.f27540f     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                int r3 = r3.f33103g     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Response r4 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.ResponseBody r4 = r4.body     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                if (r4 == 0) goto L_0x00e6
                java.io.InputStream r5 = r4.byteStream()     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30030a(r1, r3, r5, r12, r0)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r4)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            L_0x00e6:
                com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r1 = new com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r1.<init>(r11, r2)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                throw r1     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            L_0x00ec:
                com.bytedance.retrofit2.a.c r1 = r13.f27540f     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                int r2 = r1.f33103g     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Response r3 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                long r4 = r13.f27537c     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.frameworks.baselib.network.http.a r6 = r13.f27536b     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                java.lang.String r7 = r13.f27539e     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r1 = r0
                byte[] r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30031a(r1, r2, r3, r4, r6, r7)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r2.<init>(r12, r1, r3)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r6 = r2
            L_0x0105:
                com.bytedance.retrofit2.a.d r7 = new com.bytedance.retrofit2.a.d     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Response r1 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                java.lang.String r4 = r1.message     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Response r1 = r13.f27542h     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                okhttp3.Headers r1 = r1.headers     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                java.util.List r5 = m30035a(r1)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r1 = r7
                r2 = r0
                r3 = r11
                r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.frameworks.baselib.network.http.a r1 = r13.f27536b     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                r7.f33123f = r1     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
                com.bytedance.retrofit2.a.c r0 = r13.f27540f
                boolean r0 = r0.f33102f
                if (r0 != 0) goto L_0x0128
                okhttp3.ResponseBody r0 = r13.f27538d
                com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30029a(r0)
            L_0x0128:
                com.bytedance.retrofit2.a.c r0 = r13.f27540f
                boolean r0 = r0.f33102f
                if (r0 != 0) goto L_0x0137
                if (r9 == 0) goto L_0x0137
                com.bytedance.frameworks.baselib.network.connectionclass.d r0 = com.bytedance.frameworks.baselib.network.connectionclass.C10090d.m29964b()
                r0.mo24738d()
            L_0x0137:
                return r7
            L_0x0138:
                r0 = move-exception
                goto L_0x019b
            L_0x013a:
                r1 = move-exception
                r11 = r1
                r12 = r9
                goto L_0x0144
            L_0x013e:
                r0 = move-exception
                r9 = 0
                goto L_0x019b
            L_0x0141:
                r1 = move-exception
                r11 = r1
                r12 = 0
            L_0x0144:
                com.bytedance.frameworks.baselib.network.http.a.a.a r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.f27532d     // Catch:{ all -> 0x0198 }
                if (r1 == 0) goto L_0x014f
                com.bytedance.frameworks.baselib.network.http.a.a.a r1 = com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.f27532d     // Catch:{ all -> 0x0198 }
                okhttp3.Request r2 = r13.f27541g     // Catch:{ all -> 0x0198 }
                r1.mo24765a(r2, r11)     // Catch:{ all -> 0x0198 }
            L_0x014f:
                boolean r1 = r11 instanceof com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException     // Catch:{ all -> 0x0198 }
                if (r1 == 0) goto L_0x0160
                r1 = r11
                com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r1 = (com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException) r1     // Catch:{ all -> 0x0198 }
                int r2 = r1.getStatusCode()     // Catch:{ all -> 0x0198 }
                r3 = 304(0x130, float:4.26E-43)
                if (r2 == r3) goto L_0x015f
                goto L_0x0160
            L_0x015f:
                throw r1     // Catch:{ all -> 0x0198 }
            L_0x0160:
                boolean r1 = r11 instanceof java.io.IOException     // Catch:{ all -> 0x0198 }
                if (r1 == 0) goto L_0x0172
                java.lang.String r1 = "Canceled"
                java.lang.String r2 = r11.getMessage()     // Catch:{ all -> 0x0198 }
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0198 }
                if (r1 != 0) goto L_0x0171
                goto L_0x0172
            L_0x0171:
                throw r11     // Catch:{ all -> 0x0198 }
            L_0x0172:
                okhttp3.Request r1 = r13.f27541g     // Catch:{ all -> 0x0198 }
                long r3 = r13.f27537c     // Catch:{ all -> 0x0198 }
                com.bytedance.frameworks.baselib.network.http.a r5 = r13.f27536b     // Catch:{ all -> 0x0198 }
                java.lang.String r6 = r13.f27539e     // Catch:{ all -> 0x0198 }
                okhttp3.Call r8 = r13.f27543i     // Catch:{ all -> 0x0198 }
                okhttp3.Response r9 = r13.f27542h     // Catch:{ all -> 0x0198 }
                r2 = r0
                r7 = r11
                com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30028a(r1, r2, r3, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0198 }
                boolean r0 = r11 instanceof java.io.IOException     // Catch:{ all -> 0x0198 }
                if (r0 == 0) goto L_0x018a
                java.io.IOException r11 = (java.io.IOException) r11     // Catch:{ all -> 0x0198 }
                throw r11     // Catch:{ all -> 0x0198 }
            L_0x018a:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0198 }
                java.lang.String r1 = r11.getMessage()     // Catch:{ all -> 0x0198 }
                java.lang.Throwable r2 = r11.getCause()     // Catch:{ all -> 0x0198 }
                r0.<init>(r1, r2)     // Catch:{ all -> 0x0198 }
                throw r0     // Catch:{ all -> 0x0198 }
            L_0x0198:
                r0 = move-exception
                r9 = r12
                r8 = 1
            L_0x019b:
                com.bytedance.retrofit2.a.c r1 = r13.f27540f
                boolean r1 = r1.f33102f
                if (r1 == 0) goto L_0x01a3
                if (r8 == 0) goto L_0x01a8
            L_0x01a3:
                okhttp3.ResponseBody r1 = r13.f27538d
                com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30029a(r1)
            L_0x01a8:
                com.bytedance.retrofit2.a.c r1 = r13.f27540f
                boolean r1 = r1.f33102f
                if (r1 != 0) goto L_0x01b7
                if (r9 == 0) goto L_0x01b7
                com.bytedance.frameworks.baselib.network.connectionclass.d r1 = com.bytedance.frameworks.baselib.network.connectionclass.C10090d.m29964b()
                r1.mo24738d()
            L_0x01b7:
                throw r0
            L_0x01b8:
                com.bytedance.frameworks.baselib.network.http.exception.NotAllowUseNetworkException r0 = new com.bytedance.frameworks.baselib.network.http.exception.NotAllowUseNetworkException
                java.lang.String r1 = "request is not allowed using network"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.C10115a.mo10450a():com.bytedance.retrofit2.a.d");
        }

        /* renamed from: a */
        private static List<C12461b> m30035a(Headers headers) {
            int size = headers.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new C12461b(headers.name(i), headers.value(i)));
            }
            return arrayList;
        }

        /* renamed from: a */
        private static Builder m30036a(Builder builder) {
            if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT < 22) {
                try {
                    SSLContext instance = SSLContext.getInstance("TLSv1.2");
                    instance.init(null, null, null);
                    builder.sslSocketFactory(new C10120h(instance.getSocketFactory()));
                    ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(build);
                    arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                    arrayList.add(ConnectionSpec.CLEARTEXT);
                    builder.connectionSpecs(arrayList);
                } catch (Exception unused) {
                }
            }
            return builder;
        }

        /* renamed from: a */
        private static RequestBody m30037a(final TypedOutput typedOutput) {
            if (typedOutput == null) {
                return RequestBody.create((MediaType) null, "body=null");
            }
            final MediaType parse = MediaType.parse(typedOutput.mimeType());
            return new RequestBody() {
                public final MediaType contentType() {
                    return parse;
                }

                public final long contentLength() {
                    return typedOutput.length();
                }

                public final void writeTo(BufferedSink bufferedSink) throws IOException {
                    typedOutput.writeTo(bufferedSink.outputStream());
                }
            };
        }

        public C10115a(C12462c cVar) throws IOException {
            Request.Builder builder;
            this.f27540f = cVar;
            String str = this.f27540f.f33098b;
            C12520r rVar = cVar.f33107k;
            if (rVar != null) {
                this.f27536b.f27500c = rVar.f33205a;
                this.f27536b.f27501d = rVar.f33206b;
            }
            this.f27537c = System.currentTimeMillis();
            this.f27536b.f27502e = this.f27537c;
            this.f27536b.f27519v = 1;
            if (this.f27540f.f33102f) {
                this.f27536b.f27523z = true;
            } else {
                this.f27536b.f27523z = false;
            }
            try {
                Builder a = m30036a(this.f27535a.newBuilder());
                if (this.f27540f.f33102f) {
                    a.followRedirects(true);
                } else if ("GET".equals(this.f27540f.f33097a.toUpperCase())) {
                    a.followRedirects(true);
                } else if ("POST".equals(this.f27540f.f33097a.toUpperCase())) {
                    a.followRedirects(false);
                } else {
                    a.followRedirects(true);
                }
                a.connectTimeout((long) C10142f.m30122e(), TimeUnit.MILLISECONDS);
                a.readTimeout((long) C10142f.m30123f(), TimeUnit.MILLISECONDS);
                a.writeTimeout((long) C10142f.m30123f(), TimeUnit.MILLISECONDS);
                if (cVar.f33105i instanceof C10122c) {
                    this.f27536b.f27499b = (C10122c) cVar.f33105i;
                    T t = this.f27536b.f27499b;
                    if (t.f27554c > 0 || t.f27555d > 0 || t.f27556e > 0) {
                        if (t.f27554c > 0) {
                            a.connectTimeout(t.f27554c, TimeUnit.MILLISECONDS);
                        }
                        if (t.f27556e > 0) {
                            a.writeTimeout(t.f27556e, TimeUnit.MILLISECONDS);
                        }
                        if (t.f27555d > 0) {
                            a.readTimeout(t.f27555d, TimeUnit.MILLISECONDS);
                        }
                    }
                    this.f27544j = t.f27561j;
                }
                this.f27535a = a.build();
                Request.Builder url = new Request.Builder().url(str);
                if (!HttpMethod.permitsRequestBody(this.f27540f.f33097a)) {
                    builder = url.method(this.f27540f.f33097a, null);
                } else {
                    builder = url.method(this.f27540f.f33097a, m30037a(this.f27540f.f33100d));
                }
                List<C12461b> list = this.f27540f.f33099c;
                if (this.f27540f.f33100d != null) {
                    String md5Stub = this.f27540f.f33100d.md5Stub();
                    if (md5Stub != null) {
                        builder.addHeader("X-SS-STUB", md5Stub);
                    }
                }
                this.f27541g = C10114e.m30022a(builder, list);
                this.f27543i = this.f27535a.newCall(this.f27541g);
                this.f27536b.f27522y = C10114e.m30024a(this.f27541g);
            } catch (Exception e) {
                C10114e.m30028a(this.f27541g, str, this.f27537c, this.f27536b, this.f27539e, e, this.f27543i, this.f27542h);
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new IOException(e.getMessage(), e.getCause());
            }
        }

        /* renamed from: a */
        private TypedInput m30034a(final ResponseBody responseBody, final boolean z) throws IOException {
            if (responseBody.contentLength() == 0) {
                return null;
            }
            return new TypedInput() {
                public final long length() throws IOException {
                    return responseBody.contentLength();
                }

                public final String mimeType() {
                    MediaType contentType = responseBody.contentType();
                    if (contentType == null) {
                        return null;
                    }
                    return contentType.toString();
                }

                /* renamed from: in */
                public final InputStream mo10444in() throws IOException {
                    try {
                        InputStream byteStream = responseBody.byteStream();
                        if (z) {
                            byteStream = new GZIPInputStream(byteStream);
                        }
                        return new C10141e(byteStream, C10115a.this);
                    } catch (Throwable th) {
                        if (C10115a.this.f27542h != null) {
                            String str = C10115a.this.f27542h.message;
                            StringBuilder sb = new StringBuilder("reason = ");
                            if (str == null) {
                                str = "";
                            }
                            sb.append(str);
                            sb.append("  exception = ");
                            sb.append(th.getMessage());
                            throw new HttpResponseException(C10115a.this.f27542h.code, sb.toString());
                        }
                        throw new IOException(th);
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public static String m30020a(Response response, C10104a aVar) {
        return C10119g.m30042a(response, aVar);
    }

    /* renamed from: a */
    private static void m30027a(String str, C10104a aVar) {
        if (!C6319n.m19593a(str) && aVar != null) {
            try {
                aVar.f27498a = str;
                if (aVar.f27499b != null) {
                    aVar.f27499b.f27552a = str;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static byte[] m30031a(String str, int i, Response response, long j, C10104a aVar, String str2) throws IOException {
        String str3 = str;
        int i2 = i;
        Response response2 = response;
        C10104a aVar2 = aVar;
        if (response2 == null) {
            return new byte[0];
        }
        int i3 = response2.code;
        ResponseBody responseBody = response2.body;
        boolean equals = "gzip".equals(response2.header("Content-Encoding"));
        String header = response2.header("Content-Type");
        if (i3 != 200) {
            if (i3 == 304) {
                aVar2.f27504g = System.currentTimeMillis();
                long currentTimeMillis = System.currentTimeMillis() - j;
                aVar2.f27505h = System.currentTimeMillis();
                aVar2.f27520w = f27534f;
                C10142f.m30113a(str, currentTimeMillis, aVar2);
                C10142f.m30101a(currentTimeMillis, j, str, str2, aVar);
            }
            String str4 = response2.message;
            if (responseBody != null) {
                m30030a(equals, i, responseBody.byteStream(), header, str);
                C10174c.m30220a((Closeable) responseBody);
            }
            throw new HttpResponseException(i3, str4);
        } else if (responseBody == null) {
            return new byte[0];
        } else {
            aVar2.f27504g = System.currentTimeMillis();
            InputStream byteStream = responseBody.byteStream();
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a = C10174c.m30225a(equals, i, byteStream, iArr);
                C10174c.m30220a((Closeable) byteStream);
                byte[] bArr = new byte[iArr[0]];
                if (a != null && iArr[0] > 0) {
                    System.arraycopy(a, 0, bArr, 0, iArr[0]);
                }
                if (C10174c.m30224a(header)) {
                    C10174c.m30222a(bArr, bArr.length);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                aVar2.f27505h = System.currentTimeMillis();
                aVar2.f27520w = f27534f;
                C10142f.m30113a(str, currentTimeMillis2, aVar2);
                C10142f.m30101a(currentTimeMillis2, j, str, str2, aVar);
                return bArr;
            } catch (Throwable th) {
                C10174c.m30220a((Closeable) byteStream);
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m30030a(boolean z, int i, InputStream inputStream, String str, String str2) throws IOException {
        if (inputStream != null) {
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a = C10174c.m30225a(z, i, inputStream, iArr);
                C10174c.m30220a((Closeable) inputStream);
                byte[] bArr = new byte[iArr[0]];
                if (a != null && iArr[0] > 0) {
                    System.arraycopy(a, 0, bArr, 0, iArr[0]);
                }
                if (bArr.length > 0 && !C6319n.m19593a(str) && C6312h.m19578b()) {
                    try {
                        MimeType mimeType = new MimeType(str);
                        if ("text".equalsIgnoreCase(mimeType.getPrimaryType()) || "application/json".equalsIgnoreCase(mimeType.getBaseType())) {
                            C6319n.m19593a(mimeType.getParameter("charset"));
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                C10174c.m30220a((Closeable) inputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:(3:4|5|(1:7))|8|(1:10)|11|12|(2:16|(1:18))|(1:23)|24|(1:26)|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[Catch:{ Throwable -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m30028a(okhttp3.Request r9, java.lang.String r10, long r11, com.bytedance.frameworks.baselib.network.http.C10104a r13, java.lang.String r14, java.lang.Exception r15, okhttp3.Call r16, okhttp3.Response r17) {
        /*
            r4 = r10
            r6 = r13
            r0 = r17
            if (r4 != 0) goto L_0x0007
            return
        L_0x0007:
            if (r6 == 0) goto L_0x0013
            org.json.JSONObject r1 = r6.f27522y     // Catch:{ Throwable -> 0x002f }
            if (r1 != 0) goto L_0x0013
            org.json.JSONObject r1 = m30024a(r9)     // Catch:{ Throwable -> 0x002f }
            r6.f27522y = r1     // Catch:{ Throwable -> 0x002f }
        L_0x0013:
            org.json.JSONObject r1 = r6.f27522y     // Catch:{ Throwable -> 0x002f }
            java.lang.String r2 = "ex"
            java.lang.String r3 = r15.getMessage()     // Catch:{ Throwable -> 0x002f }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x002f }
            java.lang.String r1 = m30019a(r17)     // Catch:{ Throwable -> 0x002f }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x002f }
            if (r2 != 0) goto L_0x002f
            org.json.JSONObject r2 = r6.f27522y     // Catch:{ Throwable -> 0x002f }
            java.lang.String r3 = "response-headers"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x002f }
        L_0x002f:
            int r1 = r0.code     // Catch:{ Throwable -> 0x004c }
            java.lang.String r2 = "tko"
            java.lang.String r0 = r0.header(r2)     // Catch:{ Throwable -> 0x004c }
            r2 = 498(0x1f2, float:6.98E-43)
            if (r1 != r2) goto L_0x004c
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)     // Catch:{ Throwable -> 0x004c }
            if (r0 == 0) goto L_0x004c
            com.bytedance.frameworks.baselib.network.http.f$i r0 = com.bytedance.frameworks.baselib.network.http.C10142f.m30094a()     // Catch:{ Throwable -> 0x004c }
            if (r0 == 0) goto L_0x004c
            r0.mo24820b()     // Catch:{ Throwable -> 0x004c }
        L_0x004c:
            if (r6 == 0) goto L_0x005d
            java.lang.String r0 = r6.f27498a
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = m30018a(r15)
            m30027a(r0, r13)
        L_0x005d:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            long r7 = java.lang.System.currentTimeMillis()
            r6.f27505h = r7
            int r5 = f27534f
            r6.f27520w = r5
            r7 = r15
            com.bytedance.frameworks.baselib.network.http.C10142f.m30114a(r10, r15, r0, r13)
            r2 = r11
            r4 = r10
            r5 = r14
            r6 = r13
            com.bytedance.frameworks.baselib.network.http.C10142f.m30102a(r0, r2, r4, r5, r6, r7)
            if (r16 == 0) goto L_0x007c
            r16.cancel()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30028a(okhttp3.Request, java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, okhttp3.Call, okhttp3.Response):void");
    }

    /* renamed from: a */
    public static void m30029a(ResponseBody responseBody) {
        if (responseBody != null) {
            C10174c.m30220a((Closeable) responseBody);
        }
    }

    /* renamed from: a */
    public final C12465e mo10452a(C12462c cVar) throws IOException {
        return new C10115a(cVar);
    }

    /* renamed from: a */
    public static OkHttpClient m30021a() throws IllegalArgumentException {
        if (f27531c != null) {
            return f27531c.mo24767a();
        }
        throw new IllegalArgumentException("SsOkHttp3Client is not init !!!");
    }

    /* renamed from: a */
    public static void m30025a(int i) {
        f27534f = i;
    }

    private C10114e(Context context) {
        f27530b = context.getApplicationContext();
        f27531c = new C10108b();
    }

    /* renamed from: a */
    public static C10114e m30017a(Context context) {
        if (f27533e == null) {
            synchronized (C10114e.class) {
                if (f27533e == null) {
                    f27533e = new C10114e(context);
                }
            }
        }
        return f27533e;
    }

    /* renamed from: a */
    private static String m30018a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    private static String m30019a(Response response) {
        if (response == null) {
            return "";
        }
        try {
            Headers headers = response.headers;
            if (headers == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            for (String str : headers.names()) {
                if (!C6319n.m19593a(str)) {
                    List<String> values = headers.values(str);
                    if (values != null && !values.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        int i = 0;
                        for (String str2 : values) {
                            if (!C6319n.m19593a(str2)) {
                                if (i == 0) {
                                    sb.append(str2);
                                } else {
                                    sb.append("; ");
                                    sb.append(str2);
                                }
                                i++;
                            }
                        }
                        jSONObject.put(str, sb.toString());
                    }
                }
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = com.bytedance.frameworks.baselib.network.http.util.C10189i.m30264b(r7.url.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0055 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m30024a(okhttp3.Request r7) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.String r1 = "hc"
            java.lang.String r2 = "SsOkHttp3Client"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = "hcv"
            java.lang.String r2 = "tt-ok/3.10.0.2"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = "ua"
            java.lang.String r2 = "User-Agent"
            java.lang.String r2 = r7.header(r2)     // Catch:{ Exception -> 0x00ba }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00ba }
            java.net.CookieHandler r1 = java.net.CookieHandler.getDefault()     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x00ba
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x00ba }
            r2.<init>()     // Catch:{ Exception -> 0x00ba }
            okhttp3.Headers r3 = r7.headers     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x004e
            java.util.Set r4 = r3.names()     // Catch:{ Exception -> 0x00ba }
            if (r4 == 0) goto L_0x004e
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x00ba }
        L_0x003a:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x00ba }
            if (r5 == 0) goto L_0x004e
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00ba }
            java.util.List r6 = r3.values(r5)     // Catch:{ Exception -> 0x00ba }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x00ba }
            goto L_0x003a
        L_0x004e:
            okhttp3.HttpUrl r3 = r7.url     // Catch:{ Exception -> 0x0055 }
            java.net.URI r3 = r3.uri()     // Catch:{ Exception -> 0x0055 }
            goto L_0x005f
        L_0x0055:
            okhttp3.HttpUrl r7 = r7.url     // Catch:{ Exception -> 0x00ba }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00ba }
            java.net.URI r3 = com.bytedance.frameworks.baselib.network.http.util.C10189i.m30264b(r7)     // Catch:{ Exception -> 0x00ba }
        L_0x005f:
            java.util.Map r7 = r1.get(r3, r2)     // Catch:{ Exception -> 0x00ba }
            if (r7 == 0) goto L_0x00ba
            boolean r1 = r7.isEmpty()     // Catch:{ Exception -> 0x00ba }
            if (r1 != 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r1.<init>()     // Catch:{ Exception -> 0x00ba }
            java.util.Set r2 = r7.keySet()     // Catch:{ Exception -> 0x00ba }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00ba }
        L_0x0078:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00ba }
            int r4 = r1.length()     // Catch:{ Exception -> 0x00ba }
            if (r4 <= 0) goto L_0x008f
            java.lang.String r4 = ","
            r1.append(r4)     // Catch:{ Exception -> 0x00ba }
        L_0x008f:
            java.lang.Object r4 = r7.get(r3)     // Catch:{ Exception -> 0x00ba }
            java.util.List r4 = (java.util.List) r4     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            java.lang.String r3 = "null"
        L_0x009a:
            r1.append(r3)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch:{ Exception -> 0x00ba }
            if (r4 == 0) goto L_0x00ab
            java.lang.String r3 = ", "
            java.lang.String r3 = android.text.TextUtils.join(r3, r4)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r3 = "null"
        L_0x00ad:
            r1.append(r3)     // Catch:{ Exception -> 0x00ba }
            goto L_0x0078
        L_0x00b1:
            java.lang.String r7 = "cookie"
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ba }
            r0.put(r7, r1)     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e.m30024a(okhttp3.Request):org.json.JSONObject");
    }

    /* renamed from: a */
    public static void m30026a(C10107a aVar) {
        f27532d = aVar;
    }

    /* renamed from: a */
    public static Response m30023a(OkHttpClient okHttpClient, Call call) throws IOException {
        if (okHttpClient == null || call == null) {
            return null;
        }
        return call.execute();
    }

    /* renamed from: b */
    public static String m30032b(Response response, C10104a aVar) {
        if (response == null) {
            return null;
        }
        m30027a(response.header("x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f27499b == null)) {
            aVar.f27499b.f27553b = response.code;
        }
        return response.header("X-TT-LOGID");
    }

    /* renamed from: a */
    public static Request m30022a(Request.Builder builder, List<C12461b> list) throws IOException {
        if (builder == null) {
            return null;
        }
        builder.addHeader("Accept-Encoding", "gzip");
        boolean z = false;
        if (list != null) {
            for (C12461b bVar : list) {
                if (!C6319n.m19593a(bVar.f33095a) && !C6319n.m19593a(bVar.f33096b)) {
                    if ("User-Agent".equals(bVar.f33095a)) {
                        z = true;
                    }
                    builder.header(bVar.f33095a, bVar.f33096b);
                }
            }
        }
        if (!z) {
            String g = C10142f.m30124g();
            if (!C6319n.m19593a(g)) {
                StringBuilder sb = new StringBuilder();
                sb.append(g);
                sb.append(" tt-ok/3.10.0.2");
                builder.header("User-Agent", sb.toString());
            }
        }
        return builder.build();
    }
}
