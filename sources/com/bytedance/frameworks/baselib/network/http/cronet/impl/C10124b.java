package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.reflect.C6322b;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.frameworks.baselib.network.http.C10140d;
import com.bytedance.frameworks.baselib.network.http.C10141e;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10151i;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10152j;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureChecker;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.frameworks.baselib.network.http.parser.C10174c;
import com.bytedance.frameworks.baselib.network.http.parser.MimeType;
import com.bytedance.frameworks.baselib.network.http.retrofit.C10180c;
import com.bytedance.frameworks.baselib.network.http.util.C10189i;
import com.bytedance.retrofit2.C12489l;
import com.bytedance.retrofit2.C12490m;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12465e;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UnknownFormatConversionException;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.b */
public class C10124b implements ICronetBootFailureChecker, C10140d, C10152j {

    /* renamed from: a */
    public static Context f27567a = null;

    /* renamed from: b */
    public static ICronetClient f27568b = null;

    /* renamed from: c */
    public static volatile boolean f27569c = false;

    /* renamed from: d */
    private static String f27570d = "";

    /* renamed from: e */
    private static volatile C10124b f27571e;

    /* renamed from: f */
    private static C10127b f27572f;

    /* renamed from: g */
    private static C10128c f27573g;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.b$a */
    public static class C10125a implements C12465e, C12489l, C12490m {

        /* renamed from: a */
        HttpURLConnection f27574a;

        /* renamed from: b */
        C10104a f27575b = C10104a.m30002a();

        /* renamed from: c */
        long f27576c = 0;

        /* renamed from: d */
        String f27577d = null;

        /* renamed from: e */
        C12462c f27578e;

        /* renamed from: f */
        boolean f27579f = false;

        /* renamed from: g */
        boolean f27580g = false;

        public final Object getRequestInfo() {
            return this.f27575b;
        }

        public final void doCollect() {
            C10124b.m30059a(this.f27574a, this.f27575b);
        }

        /* renamed from: b */
        public final void mo10451b() {
            if (this.f27574a != null) {
                this.f27574a.disconnect();
                this.f27579f = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r4 = r14.f27574a.getErrorStream();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x013a, code lost:
            r0 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b5 */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[Catch:{ Exception -> 0x013c, all -> 0x013a }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00ed A[Catch:{ Exception -> 0x013c, all -> 0x013a }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0125  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x013a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:23:0x0043] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0149 A[Catch:{ all -> 0x017e }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.retrofit2.p637a.C12464d mo10450a() throws java.io.IOException {
            /*
                r14 = this;
                com.bytedance.retrofit2.a.c r0 = r14.f27578e
                java.lang.String r0 = r0.f33098b
                boolean r1 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.f27569c
                if (r1 != 0) goto L_0x01a6
                boolean r1 = r14.f27579f
                if (r1 != 0) goto L_0x019e
                boolean r1 = r14.f27580g
                if (r1 != 0) goto L_0x0025
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.f27567a
                if (r1 == 0) goto L_0x0025
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.f27567a
                boolean r1 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10130d.m30084a(r1)
                if (r1 == 0) goto L_0x001d
                goto L_0x0025
            L_0x001d:
                com.bytedance.frameworks.baselib.network.http.exception.NetworkNotAvailabeException r0 = new com.bytedance.frameworks.baselib.network.http.exception.NetworkNotAvailabeException
                java.lang.String r1 = "network not available"
                r0.<init>(r1)
                throw r0
            L_0x0025:
                r9 = 1
                r10 = 0
                com.bytedance.retrofit2.a.c r1 = r14.f27578e     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
                boolean r1 = r1.f33102f     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
                if (r1 != 0) goto L_0x0042
                com.bytedance.frameworks.baselib.network.http.f$g r1 = com.bytedance.frameworks.baselib.network.http.C10142f.m30119c()     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
                if (r1 == 0) goto L_0x0042
                boolean r1 = r1.mo24812c(r0)     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
                if (r1 == 0) goto L_0x0042
                com.bytedance.frameworks.baselib.network.connectionclass.d r1 = com.bytedance.frameworks.baselib.network.connectionclass.C10090d.m29964b()     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
                r1.mo24737c()     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
                r11 = 1
                goto L_0x0043
            L_0x0042:
                r11 = 0
            L_0x0043:
                com.bytedance.retrofit2.a.c r1 = r14.f27578e     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.net.HttpURLConnection r2 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                int r12 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30045a(r1, r2)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f27575b     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r1.f27503f = r2     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f27575b     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r2 = -1
                r1.f27506i = r2     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.net.HttpURLConnection r1 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.frameworks.baselib.network.http.a r2 = r14.f27575b     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30050a(r1, r2, r12)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r14.f27577d = r1     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.net.HttpURLConnection r1 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r2 = "Content-Type"
                java.lang.String r13 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30051a(r1, r2)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.retrofit2.a.c r1 = r14.f27578e     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                boolean r1 = r1.f33102f     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                if (r1 == 0) goto L_0x00ed
                java.net.HttpURLConnection r1 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r2 = "Content-Encoding"
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30051a(r1, r2)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                if (r1 == 0) goto L_0x0084
                java.lang.String r2 = "gzip"
                boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                if (r1 == 0) goto L_0x0084
                r1 = 1
                goto L_0x0085
            L_0x0084:
                r1 = 0
            L_0x0085:
                com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r2 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.f27568b     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                if (r2 == 0) goto L_0x0094
                com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r2 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.f27568b     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.net.HttpURLConnection r3 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                boolean r2 = r2.isCronetHttpURLConnection(r3)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                if (r2 == 0) goto L_0x0094
                r1 = 0
            L_0x0094:
                r2 = 200(0xc8, float:2.8E-43)
                if (r12 < r2) goto L_0x00a4
                r2 = 300(0x12c, float:4.2E-43)
                if (r12 >= r2) goto L_0x00a4
                java.net.HttpURLConnection r2 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.retrofit2.mime.TypedInput r1 = r14.m30075a(r2, r1)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r6 = r1
                goto L_0x0107
            L_0x00a4:
                java.net.HttpURLConnection r2 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r2 = r2.getResponseMessage()     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.retrofit2.a.c r3 = r14.f27578e     // Catch:{ Throwable -> 0x00bf }
                int r3 = r3.f33103g     // Catch:{ Throwable -> 0x00bf }
                java.net.HttpURLConnection r4 = r14.f27574a     // Catch:{ Exception -> 0x00b5, all -> 0x013a }
                java.io.InputStream r4 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10130d.m30083a(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x013a }
                goto L_0x00bb
            L_0x00b5:
                java.net.HttpURLConnection r4 = r14.f27574a     // Catch:{ Throwable -> 0x00bf }
                java.io.InputStream r4 = r4.getErrorStream()     // Catch:{ Throwable -> 0x00bf }
            L_0x00bb:
                com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30062a(r1, r3, r4, r13, r0)     // Catch:{ Throwable -> 0x00bf }
                goto L_0x00de
            L_0x00bf:
                r1 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r4 = "reason = "
                r3.<init>(r4)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                if (r2 != 0) goto L_0x00cb
                java.lang.String r2 = ""
            L_0x00cb:
                r3.append(r2)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r2 = "  exception = "
                r3.append(r2)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r3.append(r1)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x013c, all -> 0x013a }
            L_0x00de:
                java.net.HttpURLConnection r1 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                if (r1 == 0) goto L_0x00e7
                java.net.HttpURLConnection r1 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r1.disconnect()     // Catch:{ Exception -> 0x013c, all -> 0x013a }
            L_0x00e7:
                com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r1 = new com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r1.<init>(r12, r2)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                throw r1     // Catch:{ Exception -> 0x013c, all -> 0x013a }
            L_0x00ed:
                com.bytedance.retrofit2.a.c r1 = r14.f27578e     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                int r2 = r1.f33103g     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.net.HttpURLConnection r3 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                long r4 = r14.f27576c     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.frameworks.baselib.network.http.a r6 = r14.f27575b     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r7 = r14.f27577d     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r1 = r0
                r8 = r12
                byte[] r1 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30064a(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r2.<init>(r13, r1, r3)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r6 = r2
            L_0x0107:
                com.bytedance.retrofit2.a.d r7 = new com.bytedance.retrofit2.a.d     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.net.HttpURLConnection r1 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.lang.String r4 = r1.getResponseMessage()     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.net.HttpURLConnection r1 = r14.f27574a     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                java.util.List r5 = m30076a(r1)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r1 = r7
                r2 = r0
                r3 = r12
                r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f27575b     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                r7.f33123f = r1     // Catch:{ Exception -> 0x013c, all -> 0x013a }
                com.bytedance.retrofit2.a.c r0 = r14.f27578e
                boolean r0 = r0.f33102f
                if (r0 != 0) goto L_0x012a
                java.net.HttpURLConnection r0 = r14.f27574a
                com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30058a(r0)
            L_0x012a:
                com.bytedance.retrofit2.a.c r0 = r14.f27578e
                boolean r0 = r0.f33102f
                if (r0 != 0) goto L_0x0139
                if (r11 == 0) goto L_0x0139
                com.bytedance.frameworks.baselib.network.connectionclass.d r0 = com.bytedance.frameworks.baselib.network.connectionclass.C10090d.m29964b()
                r0.mo24738d()
            L_0x0139:
                return r7
            L_0x013a:
                r0 = move-exception
                goto L_0x0181
            L_0x013c:
                r1 = move-exception
                r8 = r1
                r10 = r11
                goto L_0x0145
            L_0x0140:
                r0 = move-exception
                r11 = 0
                goto L_0x0181
            L_0x0143:
                r1 = move-exception
                r8 = r1
            L_0x0145:
                boolean r1 = r8 instanceof com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException     // Catch:{ all -> 0x017e }
                if (r1 == 0) goto L_0x0156
                r1 = r8
                com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r1 = (com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException) r1     // Catch:{ all -> 0x017e }
                int r2 = r1.getStatusCode()     // Catch:{ all -> 0x017e }
                r3 = 304(0x130, float:4.26E-43)
                if (r2 == r3) goto L_0x0155
                goto L_0x0156
            L_0x0155:
                throw r1     // Catch:{ all -> 0x017e }
            L_0x0156:
                boolean r1 = r8 instanceof java.io.IOException     // Catch:{ all -> 0x017e }
                if (r1 == 0) goto L_0x0167
                java.lang.String r1 = "request canceled"
                java.lang.String r2 = r8.getMessage()     // Catch:{ all -> 0x017e }
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x017e }
                if (r1 == 0) goto L_0x0167
                throw r8     // Catch:{ all -> 0x017e }
            L_0x0167:
                long r2 = r14.f27576c     // Catch:{ all -> 0x017e }
                com.bytedance.frameworks.baselib.network.http.a r4 = r14.f27575b     // Catch:{ all -> 0x017e }
                java.lang.String r5 = r14.f27577d     // Catch:{ all -> 0x017e }
                java.net.HttpURLConnection r7 = r14.f27574a     // Catch:{ all -> 0x017e }
                r1 = r0
                r6 = r8
                com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30055a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x017e }
                com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException r0 = new com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException     // Catch:{ all -> 0x017e }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f27575b     // Catch:{ all -> 0x017e }
                java.lang.String r2 = r14.f27577d     // Catch:{ all -> 0x017e }
                r0.<init>(r8, r1, r2)     // Catch:{ all -> 0x017e }
                throw r0     // Catch:{ all -> 0x017e }
            L_0x017e:
                r0 = move-exception
                r11 = r10
                r10 = 1
            L_0x0181:
                com.bytedance.retrofit2.a.c r1 = r14.f27578e
                boolean r1 = r1.f33102f
                if (r1 == 0) goto L_0x0189
                if (r10 == 0) goto L_0x018e
            L_0x0189:
                java.net.HttpURLConnection r1 = r14.f27574a
                com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30058a(r1)
            L_0x018e:
                com.bytedance.retrofit2.a.c r1 = r14.f27578e
                boolean r1 = r1.f33102f
                if (r1 != 0) goto L_0x019d
                if (r11 == 0) goto L_0x019d
                com.bytedance.frameworks.baselib.network.connectionclass.d r1 = com.bytedance.frameworks.baselib.network.connectionclass.C10090d.m29964b()
                r1.mo24738d()
            L_0x019d:
                throw r0
            L_0x019e:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "request canceled"
                r0.<init>(r1)
                throw r0
            L_0x01a6:
                com.bytedance.frameworks.baselib.network.http.exception.NotAllowUseNetworkException r0 = new com.bytedance.frameworks.baselib.network.http.exception.NotAllowUseNetworkException
                java.lang.String r1 = "request is not allowed using network"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.C10125a.mo10450a():com.bytedance.retrofit2.a.d");
        }

        /* renamed from: a */
        private static List<C12461b> m30076a(HttpURLConnection httpURLConnection) {
            if (httpURLConnection == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                String str = (String) entry.getKey();
                for (String bVar : (List) entry.getValue()) {
                    arrayList.add(new C12461b(str, bVar));
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0113 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0132 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0155 */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0117 A[SYNTHETIC, Splitter:B:30:0x0117] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x013a A[SYNTHETIC, Splitter:B:35:0x013a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C10125a(com.bytedance.retrofit2.p637a.C12462c r13) throws java.io.IOException {
            /*
                r12 = this;
                r12.<init>()
                com.bytedance.frameworks.baselib.network.http.a r0 = com.bytedance.frameworks.baselib.network.http.C10104a.m30002a()
                r12.f27575b = r0
                r0 = 0
                r12.f27576c = r0
                r2 = 0
                r12.f27577d = r2
                r3 = 0
                r12.f27579f = r3
                r12.f27580g = r3
                r12.f27578e = r13
                com.bytedance.retrofit2.a.c r4 = r12.f27578e
                java.lang.String r5 = r4.f33098b
                r12.f27574a = r2
                com.bytedance.retrofit2.r r2 = r13.f33107k
                if (r2 == 0) goto L_0x002d
                com.bytedance.frameworks.baselib.network.http.a r4 = r12.f27575b
                long r6 = r2.f33205a
                r4.f27500c = r6
                com.bytedance.frameworks.baselib.network.http.a r4 = r12.f27575b
                long r6 = r2.f33206b
                r4.f27501d = r6
            L_0x002d:
                long r6 = java.lang.System.currentTimeMillis()
                r12.f27576c = r6
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f27575b
                long r6 = r12.f27576c
                r2.f27502e = r6
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f27575b
                r2.f27519v = r3
                com.bytedance.retrofit2.a.c r2 = r12.f27578e
                boolean r2 = r2.f33102f
                r4 = 1
                if (r2 == 0) goto L_0x0049
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f27575b
                r2.f27523z = r4
                goto L_0x004d
            L_0x0049:
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f27575b
                r2.f27523z = r3
            L_0x004d:
                java.net.HttpURLConnection r2 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30071c(r5)     // Catch:{ Exception -> 0x0196 }
                r12.f27574a = r2     // Catch:{ Exception -> 0x0196 }
                java.lang.Object r2 = r13.f33105i     // Catch:{ Exception -> 0x0196 }
                boolean r2 = r2 instanceof com.bytedance.frameworks.baselib.network.http.C10122c     // Catch:{ Exception -> 0x0196 }
                if (r2 == 0) goto L_0x0155
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f27575b     // Catch:{ Exception -> 0x0196 }
                java.lang.Object r6 = r13.f33105i     // Catch:{ Exception -> 0x0196 }
                com.bytedance.frameworks.baselib.network.http.c r6 = (com.bytedance.frameworks.baselib.network.http.C10122c) r6     // Catch:{ Exception -> 0x0196 }
                r2.f27499b = r6     // Catch:{ Exception -> 0x0196 }
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f27575b     // Catch:{ Exception -> 0x0196 }
                T r2 = r2.f27499b     // Catch:{ Exception -> 0x0196 }
                long r6 = r2.f27554c     // Catch:{ Exception -> 0x0196 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0073
                java.net.HttpURLConnection r6 = r12.f27574a     // Catch:{ Exception -> 0x0196 }
                long r7 = r2.f27554c     // Catch:{ Exception -> 0x0196 }
                int r7 = (int) r7     // Catch:{ Exception -> 0x0196 }
                r6.setConnectTimeout(r7)     // Catch:{ Exception -> 0x0196 }
            L_0x0073:
                long r6 = r2.f27555d     // Catch:{ Exception -> 0x0196 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0081
                java.net.HttpURLConnection r6 = r12.f27574a     // Catch:{ Exception -> 0x0196 }
                long r7 = r2.f27555d     // Catch:{ Exception -> 0x0196 }
                int r7 = (int) r7     // Catch:{ Exception -> 0x0196 }
                r6.setReadTimeout(r7)     // Catch:{ Exception -> 0x0196 }
            L_0x0081:
                long r6 = r2.f27560i     // Catch:{ Exception -> 0x0196 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0113
                java.net.HttpURLConnection r6 = r12.f27574a     // Catch:{ Throwable -> 0x0113 }
                com.bytedance.common.utility.reflect.b r6 = com.bytedance.common.utility.reflect.C6322b.m19610a(r6)     // Catch:{ Throwable -> 0x0113 }
                java.lang.String r7 = "setRequestTimeout"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0113 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0113 }
                r8[r3] = r9     // Catch:{ Throwable -> 0x0113 }
                java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0113 }
                long r10 = r2.f27560i     // Catch:{ Throwable -> 0x0113 }
                int r10 = (int) r10     // Catch:{ Throwable -> 0x0113 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0113 }
                r9[r3] = r10     // Catch:{ Throwable -> 0x0113 }
                r6.mo15158a(r7, (java.lang.Class<?>[]) r8, r9)     // Catch:{ Throwable -> 0x0113 }
                java.net.HttpURLConnection r6 = r12.f27574a     // Catch:{ Throwable -> 0x0113 }
                r6.setConnectTimeout(r3)     // Catch:{ Throwable -> 0x0113 }
                java.net.HttpURLConnection r6 = r12.f27574a     // Catch:{ Throwable -> 0x0113 }
                r6.setReadTimeout(r3)     // Catch:{ Throwable -> 0x0113 }
                long r6 = r2.f27557f     // Catch:{ Throwable -> 0x0113 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 > 0) goto L_0x00bf
                long r6 = r2.f27559h     // Catch:{ Throwable -> 0x0113 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 > 0) goto L_0x00bf
                long r6 = r2.f27558g     // Catch:{ Throwable -> 0x0113 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0113
            L_0x00bf:
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Throwable -> 0x0113 }
                com.bytedance.common.utility.reflect.b r0 = com.bytedance.common.utility.reflect.C6322b.m19610a(r0)     // Catch:{ Throwable -> 0x0113 }
                java.lang.String r1 = "setSocketConnectTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0113 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0113 }
                r6[r3] = r7     // Catch:{ Throwable -> 0x0113 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0113 }
                long r8 = r2.f27557f     // Catch:{ Throwable -> 0x0113 }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x0113 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0113 }
                r7[r3] = r8     // Catch:{ Throwable -> 0x0113 }
                r0.mo15158a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x0113 }
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Throwable -> 0x0113 }
                com.bytedance.common.utility.reflect.b r0 = com.bytedance.common.utility.reflect.C6322b.m19610a(r0)     // Catch:{ Throwable -> 0x0113 }
                java.lang.String r1 = "setSocketReadTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0113 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0113 }
                r6[r3] = r7     // Catch:{ Throwable -> 0x0113 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0113 }
                long r8 = r2.f27559h     // Catch:{ Throwable -> 0x0113 }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x0113 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0113 }
                r7[r3] = r8     // Catch:{ Throwable -> 0x0113 }
                r0.mo15158a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x0113 }
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Throwable -> 0x0113 }
                com.bytedance.common.utility.reflect.b r0 = com.bytedance.common.utility.reflect.C6322b.m19610a(r0)     // Catch:{ Throwable -> 0x0113 }
                java.lang.String r1 = "setSocketWriteTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0113 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0113 }
                r6[r3] = r7     // Catch:{ Throwable -> 0x0113 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0113 }
                long r8 = r2.f27558g     // Catch:{ Throwable -> 0x0113 }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x0113 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0113 }
                r7[r3] = r8     // Catch:{ Throwable -> 0x0113 }
                r0.mo15158a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x0113 }
            L_0x0113:
                int r0 = r2.f27562k     // Catch:{ Exception -> 0x0196 }
                if (r0 <= 0) goto L_0x0132
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Throwable -> 0x0132 }
                com.bytedance.common.utility.reflect.b r0 = com.bytedance.common.utility.reflect.C6322b.m19610a(r0)     // Catch:{ Throwable -> 0x0132 }
                java.lang.String r1 = "setInputStreamBufferSize"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0132 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0132 }
                r6[r3] = r7     // Catch:{ Throwable -> 0x0132 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0132 }
                int r8 = r2.f27562k     // Catch:{ Throwable -> 0x0132 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0132 }
                r7[r3] = r8     // Catch:{ Throwable -> 0x0132 }
                r0.mo15158a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x0132 }
            L_0x0132:
                boolean r0 = r2.f27561j     // Catch:{ Exception -> 0x0196 }
                r12.f27580g = r0     // Catch:{ Exception -> 0x0196 }
                int r0 = r2.f27563l     // Catch:{ Exception -> 0x0196 }
                if (r0 <= 0) goto L_0x0155
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Throwable -> 0x0155 }
                com.bytedance.common.utility.reflect.b r0 = com.bytedance.common.utility.reflect.C6322b.m19610a(r0)     // Catch:{ Throwable -> 0x0155 }
                java.lang.String r1 = "setRequestFlag"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0155 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0155 }
                r6[r3] = r7     // Catch:{ Throwable -> 0x0155 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0155 }
                int r2 = r2.f27563l     // Catch:{ Throwable -> 0x0155 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x0155 }
                r7[r3] = r2     // Catch:{ Throwable -> 0x0155 }
                r0.mo15158a(r1, (java.lang.Class<?>[]) r6, r7)     // Catch:{ Throwable -> 0x0155 }
            L_0x0155:
                com.bytedance.retrofit2.a.c r0 = r12.f27578e     // Catch:{ Exception -> 0x0196 }
                boolean r0 = r0.f33102f     // Catch:{ Exception -> 0x0196 }
                if (r0 != 0) goto L_0x0181
                java.lang.String r0 = "GET"
                com.bytedance.retrofit2.a.c r1 = r12.f27578e     // Catch:{ Exception -> 0x0196 }
                java.lang.String r1 = r1.f33097a     // Catch:{ Exception -> 0x0196 }
                java.lang.String r1 = r1.toUpperCase()     // Catch:{ Exception -> 0x0196 }
                boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0196 }
                if (r0 != 0) goto L_0x0181
                java.lang.String r0 = "POST"
                com.bytedance.retrofit2.a.c r1 = r12.f27578e     // Catch:{ Exception -> 0x0196 }
                java.lang.String r1 = r1.f33097a     // Catch:{ Exception -> 0x0196 }
                java.lang.String r1 = r1.toUpperCase()     // Catch:{ Exception -> 0x0196 }
                boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0196 }
                if (r0 == 0) goto L_0x0181
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Exception -> 0x0196 }
                r0.setInstanceFollowRedirects(r3)     // Catch:{ Exception -> 0x0196 }
                goto L_0x0186
            L_0x0181:
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Exception -> 0x0196 }
                r0.setInstanceFollowRedirects(r4)     // Catch:{ Exception -> 0x0196 }
            L_0x0186:
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Exception -> 0x0196 }
                com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30060a(r0, r13)     // Catch:{ Exception -> 0x0196 }
                com.bytedance.frameworks.baselib.network.http.a r13 = r12.f27575b     // Catch:{ Exception -> 0x0196 }
                java.net.HttpURLConnection r0 = r12.f27574a     // Catch:{ Exception -> 0x0196 }
                org.json.JSONObject r0 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30066b(r0)     // Catch:{ Exception -> 0x0196 }
                r13.f27522y = r0     // Catch:{ Exception -> 0x0196 }
                return
            L_0x0196:
                r13 = move-exception
                long r6 = r12.f27576c
                com.bytedance.frameworks.baselib.network.http.a r8 = r12.f27575b
                java.lang.String r9 = r12.f27577d
                java.net.HttpURLConnection r11 = r12.f27574a
                r10 = r13
                com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30055a(r5, r6, r8, r9, r10, r11)
                r12.f27579f = r4
                boolean r0 = r13 instanceof java.io.IOException
                if (r0 == 0) goto L_0x01ac
                java.io.IOException r13 = (java.io.IOException) r13
                throw r13
            L_0x01ac:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = r13.getMessage()
                java.lang.Throwable r13 = r13.getCause()
                r0.<init>(r1, r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.C10125a.<init>(com.bytedance.retrofit2.a.c):void");
        }

        /* renamed from: a */
        private TypedInput m30075a(final HttpURLConnection httpURLConnection, final boolean z) throws IOException {
            if (httpURLConnection == null || httpURLConnection.getContentLength() == 0) {
                return null;
            }
            return new TypedInput() {
                public final long length() throws IOException {
                    return (long) httpURLConnection.getContentLength();
                }

                public final String mimeType() {
                    return C10124b.m30051a(httpURLConnection, "Content-Type");
                }

                /* renamed from: in */
                public final InputStream mo10444in() throws IOException {
                    try {
                        InputStream a = C10129c.m30082a(httpURLConnection);
                        if (z) {
                            a = new GZIPInputStream(a);
                        }
                        return new C10141e(a, C10125a.this);
                    } catch (Throwable th) {
                        String responseMessage = httpURLConnection.getResponseMessage();
                        StringBuilder sb = new StringBuilder("reason = ");
                        if (responseMessage == null) {
                            responseMessage = "";
                        }
                        sb.append(responseMessage);
                        sb.append("  exception = ");
                        sb.append(th.getMessage());
                        throw new HttpResponseException(httpURLConnection.getResponseCode(), sb.toString());
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.b$b */
    public interface C10127b {
        /* renamed from: a */
        boolean mo24791a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.b$c */
    public interface C10128c {
        /* renamed from: b */
        boolean mo24792b();
    }

    /* renamed from: a */
    public static void m30059a(HttpURLConnection httpURLConnection, C10104a aVar) {
        C10131e.m30086a(httpURLConnection, aVar);
    }

    /* renamed from: a */
    public final void mo24788a(Map<String, ?> map) {
        if (map != null) {
            m30069b(map);
        }
    }

    /* renamed from: a */
    public final void mo24789a(boolean z, boolean z2, boolean z3, boolean z4) {
        m30067b();
        if (f27568b != null) {
            f27568b.setCronetBootFailureChecker(this);
            f27568b.setCronetEngine(f27567a, false, false, false, z4, C10142f.m30124g(), new C10180c());
        }
    }

    /* renamed from: a */
    public static void m30063a(String[] strArr, int i, int i2) throws Exception {
        if (f27568b != null) {
            C6322b.m19610a((Object) f27568b).mo15158a("tryStartNetDetect", (Class<?>[]) new Class[]{String[].class, Integer.TYPE, Integer.TYPE}, strArr, Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    /* renamed from: a */
    public static void m30057a(String str, String str2, String str3) throws Exception {
        if (f27568b != null) {
            C6322b.m19610a((Object) f27568b).mo15158a("notifyTNCConfigUpdated", (Class<?>[]) new Class[]{String.class, String.class, String.class}, str, str2, str3);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    /* renamed from: a */
    public static void m30061a(boolean z) throws Exception {
        if (f27568b != null) {
            C6322b.m19610a((Object) f27568b).mo15158a("setEnableURLDispatcher", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    /* renamed from: a */
    public final C12465e mo10452a(C12462c cVar) throws IOException {
        return new C10125a(cVar);
    }

    /* renamed from: a */
    private static void m30056a(String str, C10104a aVar) {
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

    /* renamed from: a */
    static void m30060a(HttpURLConnection httpURLConnection, C12462c cVar) throws IOException {
        httpURLConnection.setRequestMethod(cVar.f33097a);
        httpURLConnection.setDoInput(true);
        boolean z = false;
        for (C12461b bVar : cVar.f33099c) {
            if (!C6319n.m19593a(bVar.f33095a) && !C6319n.m19593a(bVar.f33096b)) {
                if ("User-Agent".equalsIgnoreCase(bVar.f33095a)) {
                    z = true;
                }
                C10131e.m30087a(httpURLConnection, bVar.f33095a, bVar.f33096b);
            }
        }
        if (!z) {
            String g = C10142f.m30124g();
            if (!C6319n.m19593a(g)) {
                if (f27568b != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(g);
                    sb.append(" cronet/");
                    sb.append(f27568b.getCronetVersion());
                    g = sb.toString();
                }
                C10131e.m30087a(httpURLConnection, "User-Agent", g);
            }
        }
        TypedOutput typedOutput = cVar.f33100d;
        if (typedOutput != null) {
            httpURLConnection.setDoOutput(true);
            C10131e.m30087a(httpURLConnection, "Content-Type", typedOutput.mimeType());
            String md5Stub = typedOutput.md5Stub();
            if (md5Stub != null) {
                C10131e.m30087a(httpURLConnection, "X-SS-STUB", md5Stub);
            }
            long length = typedOutput.length();
            if (length != -1) {
                httpURLConnection.setFixedLengthStreamingMode((int) length);
                C10131e.m30087a(httpURLConnection, "Content-Length", String.valueOf(length));
                return;
            }
            httpURLConnection.setChunkedStreamingMode(4096);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = r15.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r2 = new java.lang.StringBuilder("reason = ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        if (r1 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r2.append(r1);
        r2.append("  exception = ");
        r2.append(r0.getMessage());
        r1 = r2.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m30064a(java.lang.String r13, int r14, java.net.HttpURLConnection r15, long r16, com.bytedance.frameworks.baselib.network.http.C10104a r18, java.lang.String r19, int r20) throws java.io.IOException {
        /*
            r0 = r13
            r8 = r14
            r9 = r15
            r7 = r18
            r10 = r20
            r1 = 0
            if (r9 != 0) goto L_0x000d
            byte[] r0 = new byte[r1]
            return r0
        L_0x000d:
            java.lang.String r2 = "gzip"
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r5 = m30051a(r15, r5)
            boolean r2 = r2.equals(r5)
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r5 = f27568b
            if (r5 == 0) goto L_0x0027
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r5 = f27568b
            boolean r5 = r5.isCronetHttpURLConnection(r15)
            if (r5 == 0) goto L_0x0027
            r11 = 0
            goto L_0x0028
        L_0x0027:
            r11 = r2
        L_0x0028:
            java.lang.String r2 = "Content-Type"
            java.lang.String r12 = m30051a(r15, r2)
            r2 = 200(0xc8, float:2.8E-43)
            if (r10 != r2) goto L_0x0083
            long r5 = java.lang.System.currentTimeMillis()
            r7.f27504g = r5
            java.io.InputStream r2 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10131e.m30085a(r15)
            r5 = 1
            int[] r5 = new int[r5]
            r5[r1] = r1     // Catch:{ all -> 0x007e }
            byte[] r6 = com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30225a(r11, r14, r2, r5)     // Catch:{ all -> 0x007e }
            com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r2)
            r2 = r5[r1]
            byte[] r8 = new byte[r2]
            if (r6 == 0) goto L_0x0057
            r2 = r5[r1]
            if (r2 <= 0) goto L_0x0057
            r2 = r5[r1]
            java.lang.System.arraycopy(r6, r1, r8, r1, r2)
        L_0x0057:
            boolean r1 = com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30224a(r12)
            if (r1 == 0) goto L_0x0061
            int r1 = r8.length
            com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30222a(r8, r1)
        L_0x0061:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r16
            long r5 = java.lang.System.currentTimeMillis()
            r7.f27505h = r5
            m30059a(r15, r7)
            com.bytedance.frameworks.baselib.network.http.C10142f.m30113a(r13, r1, r7)
            r3 = r16
            r5 = r13
            r6 = r19
            r7 = r18
            com.bytedance.frameworks.baselib.network.http.C10142f.m30101a(r1, r3, r5, r6, r7)
            return r8
        L_0x007e:
            r0 = move-exception
            com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r2)
            throw r0
        L_0x0083:
            r1 = 304(0x130, float:4.26E-43)
            if (r10 != r1) goto L_0x00a9
            long r1 = java.lang.System.currentTimeMillis()
            r7.f27504g = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r16
            long r5 = java.lang.System.currentTimeMillis()
            r7.f27505h = r5
            m30059a(r15, r7)
            com.bytedance.frameworks.baselib.network.http.C10142f.m30113a(r13, r1, r7)
            r3 = r16
            r5 = r13
            r6 = r19
            r7 = r18
            com.bytedance.frameworks.baselib.network.http.C10142f.m30101a(r1, r3, r5, r6, r7)
        L_0x00a9:
            java.lang.String r1 = r15.getResponseMessage()
            java.io.InputStream r2 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C10131e.m30085a(r15)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00b8
        L_0x00b2:
            r0 = move-exception
            goto L_0x00bc
        L_0x00b4:
            java.io.InputStream r2 = r15.getErrorStream()     // Catch:{ Throwable -> 0x00b2 }
        L_0x00b8:
            m30062a(r11, r14, r2, r12, r13)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x00da
        L_0x00bc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "reason = "
            r2.<init>(r3)
            if (r1 != 0) goto L_0x00c7
            java.lang.String r1 = ""
        L_0x00c7:
            r2.append(r1)
            java.lang.String r1 = "  exception = "
            r2.append(r1)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r1 = r2.toString()
        L_0x00da:
            if (r9 == 0) goto L_0x00df
            r15.disconnect()
        L_0x00df:
            com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r0 = new com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException
            r0.<init>(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30064a(java.lang.String, int, java.net.HttpURLConnection, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, int):byte[]");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m30062a(boolean z, int i, InputStream inputStream, String str, String str2) throws IOException {
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
                            String parameter = mimeType.getParameter("charset");
                            if (C6319n.m19593a(parameter)) {
                                parameter = "utf-8";
                            }
                            StringBuilder sb = new StringBuilder(" response body = ");
                            sb.append(new String(bArr, parameter));
                            sb.append(" for url = ");
                            if (str2 == null) {
                                str2 = "";
                            }
                            sb.append(str2);
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

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[Catch:{ Throwable -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m30055a(java.lang.String r11, long r12, com.bytedance.frameworks.baselib.network.http.C10104a r14, java.lang.String r15, java.lang.Exception r16, java.net.HttpURLConnection r17) {
        /*
            r4 = r11
            r6 = r14
            r8 = r17
            if (r4 != 0) goto L_0x0007
            return
        L_0x0007:
            if (r6 == 0) goto L_0x0013
            org.json.JSONObject r0 = r6.f27522y     // Catch:{ Throwable -> 0x002f }
            if (r0 != 0) goto L_0x0013
            org.json.JSONObject r0 = m30066b(r17)     // Catch:{ Throwable -> 0x002f }
            r6.f27522y = r0     // Catch:{ Throwable -> 0x002f }
        L_0x0013:
            org.json.JSONObject r0 = r6.f27522y     // Catch:{ Throwable -> 0x002f }
            java.lang.String r1 = "ex"
            java.lang.String r2 = r16.getMessage()     // Catch:{ Throwable -> 0x002f }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x002f }
            java.lang.String r0 = m30070c(r17)     // Catch:{ Throwable -> 0x002f }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x002f }
            if (r1 != 0) goto L_0x002f
            org.json.JSONObject r1 = r6.f27522y     // Catch:{ Throwable -> 0x002f }
            java.lang.String r2 = "response-headers"
            r1.put(r2, r0)     // Catch:{ Throwable -> 0x002f }
        L_0x002f:
            int r0 = r17.getResponseCode()     // Catch:{ Throwable -> 0x004e }
            java.lang.String r1 = "tko"
            java.lang.String r1 = r8.getHeaderField(r1)     // Catch:{ Throwable -> 0x004e }
            r2 = 498(0x1f2, float:6.98E-43)
            if (r0 != r2) goto L_0x004e
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x004e }
            if (r0 == 0) goto L_0x004e
            com.bytedance.frameworks.baselib.network.http.f$i r0 = com.bytedance.frameworks.baselib.network.http.C10142f.m30094a()     // Catch:{ Throwable -> 0x004e }
            if (r0 == 0) goto L_0x004e
            r0.mo24820b()     // Catch:{ Throwable -> 0x004e }
        L_0x004e:
            if (r6 == 0) goto L_0x005f
            java.lang.String r0 = r6.f27498a
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = m30049a(r16)
            m30056a(r0, r14)
        L_0x005f:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r12
            long r9 = java.lang.System.currentTimeMillis()
            r6.f27505h = r9
            m30059a(r8, r14)
            r7 = r16
            com.bytedance.frameworks.baselib.network.http.C10142f.m30114a(r11, r7, r0, r14)
            r2 = r12
            r4 = r11
            r5 = r15
            r6 = r14
            com.bytedance.frameworks.baselib.network.http.C10142f.m30102a(r0, r2, r4, r5, r6, r7)
            if (r8 == 0) goto L_0x007e
            r17.disconnect()
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.m30055a(java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    public static void m30058a(HttpURLConnection httpURLConnection) {
        if (!(httpURLConnection == null || httpURLConnection == null)) {
            httpURLConnection.disconnect();
        }
    }

    public boolean isCronetBootFailureExpected() {
        if (f27572f == null) {
            return false;
        }
        return f27572f.mo24791a();
    }

    /* renamed from: a */
    public static C10123a m30046a() throws Exception {
        if (f27568b != null) {
            int[] iArr = (int[]) C6322b.m19610a((Object) f27568b).mo15160b("getNetworkQuality").f18556a;
            if (iArr.length == 3) {
                C10123a aVar = new C10123a();
                aVar.f27564a = iArr[0];
                aVar.f27565b = iArr[1];
                aVar.f27566c = iArr[2];
                return aVar;
            }
            throw new UnknownFormatConversionException("getNetworkQuality returns wrong format");
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    /* renamed from: b */
    private static void m30067b() {
        if (f27568b == null) {
            String str = "org.chromium.CronetClient";
            if (!C6319n.m19593a(f27570d)) {
                str = f27570d;
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof ICronetClient) {
                    f27568b = (ICronetClient) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m30052a(C10127b bVar) {
        f27572f = bVar;
    }

    /* renamed from: a */
    public static void m30053a(C10128c cVar) {
        f27573g = cVar;
    }

    private C10124b(Context context) {
        f27567a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static List<InetAddress> m30065b(String str) throws Exception {
        if (f27568b != null) {
            return (List) C6322b.m19610a((Object) f27568b).mo15158a("dnsLookup", (Class<?>[]) new Class[]{String.class}, str).f18556a;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    /* renamed from: a */
    public static C10124b m30047a(Context context) {
        if (f27571e == null) {
            synchronized (C10124b.class) {
                if (f27571e == null) {
                    f27571e = new C10124b(context);
                    m30067b();
                    C10151i a = C10142f.m30094a();
                    if (a != null) {
                        Map a2 = a.mo24817a();
                        if (a2 != null) {
                            m30069b(a2);
                        }
                    }
                    C10142f.m30111a((C10152j) f27571e);
                }
            }
        }
        return f27571e;
    }

    /* renamed from: c */
    protected static HttpURLConnection m30071c(String str) throws IOException {
        boolean z;
        m30067b();
        C10142f.m30126i();
        if (f27568b != null) {
            f27568b.setCronetBootFailureChecker(f27571e);
            ICronetClient iCronetClient = f27568b;
            Context context = f27567a;
            if (f27573g == null) {
                z = false;
            } else {
                z = f27573g.mo24792b();
            }
            HttpURLConnection openConnection = iCronetClient.openConnection(context, str, z, C10142f.m30124g(), new C10180c());
            openConnection.setConnectTimeout(C10142f.m30122e());
            openConnection.setReadTimeout(C10142f.m30123f());
            return openConnection;
        }
        throw new IllegalArgumentException("CronetClient is null");
    }

    /* renamed from: a */
    private static String m30049a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String message = exc.getMessage();
            if (message == null) {
                return "";
            }
            String[] split = message.split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
            return "";
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static JSONObject m30066b(HttpURLConnection httpURLConnection) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (httpURLConnection == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsCronetHttpClient");
            if (f27568b != null) {
                jSONObject.put("hcv", f27568b.getCronetVersion());
            }
            jSONObject.put("ua", httpURLConnection.getRequestProperty("User-Agent"));
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null) {
                HashMap hashMap = new HashMap();
                String requestProperty = httpURLConnection.getRequestProperty("Cookie");
                if (!C6319n.m19593a(requestProperty)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(requestProperty);
                    hashMap.put("Cookie", arrayList);
                }
                String requestProperty2 = httpURLConnection.getRequestProperty("X-SS-Cookie");
                if (!C6319n.m19593a(requestProperty2)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(requestProperty2);
                    hashMap.put("X-SS-Cookie", arrayList2);
                }
                String requestProperty3 = httpURLConnection.getRequestProperty("X-SS-No-Cookie");
                if (!C6319n.m19593a(requestProperty3)) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(requestProperty3);
                    hashMap.put("X-SS-No-Cookie", arrayList3);
                }
                Map map = cookieHandler.get(C10189i.m30260a(httpURLConnection.getURL().toString()), hashMap);
                if (map != null && !map.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (String str2 : map.keySet()) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        List list = (List) map.get(str2);
                        if (str2 == null) {
                            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
                        }
                        sb.append(str2);
                        sb.append(":");
                        if (list != null) {
                            str = TextUtils.join(", ", list);
                        } else {
                            str = TEVideoRecorder.FACE_BEAUTY_NULL;
                        }
                        sb.append(str);
                    }
                    jSONObject.put("cookie", sb.toString());
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: c */
    private static String m30070c(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                if (!headerFields.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Entry entry : headerFields.entrySet()) {
                        if (entry != null) {
                            String str = (String) entry.getKey();
                            if (!C6319n.m19593a(str)) {
                                List<String> list = (List) entry.getValue();
                                if (list != null && !list.isEmpty()) {
                                    StringBuilder sb = new StringBuilder();
                                    int i = 0;
                                    for (String str2 : list) {
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
                    }
                    return jSONObject.toString();
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static void m30069b(Map<String, ?> map) {
        if (map != null) {
            try {
                if (f27568b != null) {
                    C6322b.m19610a((Object) f27568b).mo15158a("syncHttpEncryptConfig", (Class<?>[]) new Class[]{Map.class}, map);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m30054a(String str) {
        f27570d = str;
    }

    /* renamed from: a */
    public static int m30045a(C12462c cVar, HttpURLConnection httpURLConnection) throws IOException {
        if (cVar == null || httpURLConnection == null) {
            return -1;
        }
        TypedOutput typedOutput = cVar.f33100d;
        if (typedOutput != null) {
            typedOutput.writeTo(httpURLConnection.getOutputStream());
        }
        return httpURLConnection.getResponseCode();
    }

    /* renamed from: b */
    public static void m30068b(HttpURLConnection httpURLConnection, C10104a aVar) {
        if (httpURLConnection != null && aVar != null) {
            try {
                if (f27568b != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    f27568b.getRequestMetrics(httpURLConnection, linkedHashMap);
                    if (!linkedHashMap.isEmpty()) {
                        aVar.f27498a = (String) m30048a(linkedHashMap.get("remote_ip"), String.class, (T) "");
                        aVar.f27507j = ((Long) m30048a(linkedHashMap.get("dns_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27508k = ((Long) m30048a(linkedHashMap.get("connect_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27509l = ((Long) m30048a(linkedHashMap.get("ssl_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27510m = ((Long) m30048a(linkedHashMap.get("send_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27511n = ((Long) m30048a(linkedHashMap.get("push_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27512o = ((Long) m30048a(linkedHashMap.get("receive_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27513p = ((Boolean) m30048a(linkedHashMap.get("socket_reused"), Boolean.class, (T) Boolean.valueOf(false))).booleanValue();
                        aVar.f27514q = ((Long) m30048a(linkedHashMap.get(C34943c.f91124t), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27515r = ((Long) m30048a(linkedHashMap.get("total_time"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27516s = ((Long) m30048a(linkedHashMap.get("send_byte_count"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27517t = ((Long) m30048a(linkedHashMap.get("received_byte_count"), Long.class, (T) Long.valueOf(-1))).longValue();
                        aVar.f27521x = (String) m30048a(linkedHashMap.get("request_log"), String.class, (T) "");
                        aVar.f27518u = ((Long) m30048a(linkedHashMap.get("retry_attempts"), Long.class, (T) Long.valueOf(-1))).longValue();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m30051a(HttpURLConnection httpURLConnection, String str) {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            headerField = httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    /* renamed from: a */
    private static <T> T m30048a(Object obj, Class<T> cls, T t) {
        if (obj == null || !obj.getClass().equals(cls)) {
            return t;
        }
        return obj;
    }

    /* renamed from: a */
    public static String m30050a(HttpURLConnection httpURLConnection, C10104a aVar, int i) {
        if (httpURLConnection == null) {
            return null;
        }
        m30056a(m30051a(httpURLConnection, "x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f27499b == null)) {
            aVar.f27499b.f27553b = i;
        }
        return m30051a(httpURLConnection, "X-TT-LOGID");
    }
}
