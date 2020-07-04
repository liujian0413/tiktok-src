package com.p280ss.android.ugc.aweme.common.p1141b;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okio.Okio;

/* renamed from: com.ss.android.ugc.aweme.common.b.a */
public final class C25653a {

    /* renamed from: a */
    private static final OkHttpClient f67573a = ((OkHttpClient) ServiceManager.get().getService(OkHttpClient.class)).newBuilder().connectTimeout(60, TimeUnit.SECONDS).writeTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();

    /* renamed from: com.ss.android.ugc.aweme.common.b.a$a */
    public interface C25655a {
        /* renamed from: a */
        void mo66541a(String str);

        /* renamed from: a */
        void mo66542a(String str, int i);

        /* renamed from: a */
        void mo66543a(String str, Exception exc);
    }

    /* renamed from: a */
    public static void m84370a(String str, String str2, C25655a aVar) {
        m84371a(str, str2, aVar, false, null);
    }

    /* renamed from: a */
    private static void m84369a(final String str, final OutputStream outputStream, final C25655a aVar) {
        Request build = new Builder().url(str).build();
        StringBuilder sb = new StringBuilder("download url:");
        sb.append(str);
        C6921a.m21555a(sb.toString());
        f67573a.newCall(build).enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                if (aVar != null) {
                    aVar.mo66543a(str, (Exception) iOException);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:50:0x00c5 A[Catch:{ all -> 0x00d3 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onResponse(okhttp3.Call r14, okhttp3.Response r15) throws java.io.IOException {
                /*
                    r13 = this;
                    int r14 = r15.code
                    r0 = 0
                    okhttp3.ResponseBody r1 = r15.body     // Catch:{ IOException -> 0x00bf, all -> 0x00bb }
                    r2 = 200(0xc8, float:2.8E-43)
                    if (r14 != r2) goto L_0x00a4
                    long r2 = r1.contentLength()     // Catch:{ IOException -> 0x00a2 }
                    okio.BufferedSource r14 = r1.source()     // Catch:{ IOException -> 0x00a2 }
                    java.io.OutputStream r4 = r4     // Catch:{ IOException -> 0x00a2 }
                    okio.Sink r4 = okio.Okio.sink(r4)     // Catch:{ IOException -> 0x00a2 }
                    okio.BufferedSink r4 = okio.Okio.buffer(r4)     // Catch:{ IOException -> 0x00a2 }
                    r5 = 0
                    r7 = r5
                L_0x001e:
                    okio.Buffer r0 = r4.buffer()     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    r9 = 2048(0x800, double:1.0118E-320)
                    long r9 = r14.read(r0, r9)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    r11 = -1
                    int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r0 == 0) goto L_0x0049
                    r4.emit()     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    r0 = 0
                    long r7 = r7 + r9
                    com.ss.android.ugc.aweme.common.b.a$a r0 = r5     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    if (r0 == 0) goto L_0x001e
                    int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                    if (r0 <= 0) goto L_0x001e
                    r9 = 100
                    long r9 = r9 * r7
                    long r9 = r9 / r2
                    int r0 = (int) r9     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    com.ss.android.ugc.aweme.common.b.a$a r9 = r5     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    java.lang.String r10 = r3     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    r9.mo66542a(r10, r0)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    goto L_0x001e
                L_0x0049:
                    java.lang.String r0 = "text/plain"
                    java.lang.String r5 = "Content-Type"
                    java.lang.String r5 = r15.header(r5)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    boolean r0 = r0.equalsIgnoreCase(r5)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    if (r0 != 0) goto L_0x0082
                    java.lang.String r0 = "text/json"
                    java.lang.String r5 = "Content-Type"
                    java.lang.String r15 = r15.header(r5)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    boolean r15 = r0.equalsIgnoreCase(r15)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    if (r15 != 0) goto L_0x0082
                    int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r15 == 0) goto L_0x0082
                    com.ss.android.ugc.aweme.common.b.a$a r14 = r5     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    if (r14 == 0) goto L_0x007b
                    com.ss.android.ugc.aweme.common.b.a$a r14 = r5     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    java.lang.String r15 = r3     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    java.lang.Exception r0 = new java.lang.Exception     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    java.lang.String r2 = "totalRead != contentLength"
                    r0.<init>(r2)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    r14.mo66543a(r15, r0)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                L_0x007b:
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r1)
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r4)
                    return
                L_0x0082:
                    r4.writeAll(r14)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    r4.flush()     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r4)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    com.ss.android.ugc.aweme.common.b.a$a r14 = r5     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    if (r14 == 0) goto L_0x0096
                    com.ss.android.ugc.aweme.common.b.a$a r14 = r5     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    java.lang.String r15 = r3     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                    r14.mo66541a(r15)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                L_0x0096:
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r1)
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r4)
                    return
                L_0x009d:
                    r14 = move-exception
                    goto L_0x00d5
                L_0x009f:
                    r14 = move-exception
                    r0 = r4
                    goto L_0x00c1
                L_0x00a2:
                    r14 = move-exception
                    goto L_0x00c1
                L_0x00a4:
                    java.lang.String r2 = "Reason-Phrase"
                    java.lang.String r15 = r15.header(r2)     // Catch:{ IOException -> 0x00a2 }
                    com.ss.android.http.legacy.client.HttpResponseException r2 = new com.ss.android.http.legacy.client.HttpResponseException     // Catch:{ IOException -> 0x00a2 }
                    r2.<init>(r14, r15)     // Catch:{ IOException -> 0x00a2 }
                    com.ss.android.ugc.aweme.common.b.a$a r14 = r5     // Catch:{ IOException -> 0x00a2 }
                    if (r14 == 0) goto L_0x00ba
                    com.ss.android.ugc.aweme.common.b.a$a r14 = r5     // Catch:{ IOException -> 0x00a2 }
                    java.lang.String r15 = r3     // Catch:{ IOException -> 0x00a2 }
                    r14.mo66543a(r15, r2)     // Catch:{ IOException -> 0x00a2 }
                L_0x00ba:
                    throw r2     // Catch:{ IOException -> 0x00a2 }
                L_0x00bb:
                    r14 = move-exception
                    r1 = r0
                    r4 = r1
                    goto L_0x00d5
                L_0x00bf:
                    r14 = move-exception
                    r1 = r0
                L_0x00c1:
                    com.ss.android.ugc.aweme.common.b.a$a r15 = r5     // Catch:{ all -> 0x00d3 }
                    if (r15 == 0) goto L_0x00cc
                    com.ss.android.ugc.aweme.common.b.a$a r15 = r5     // Catch:{ all -> 0x00d3 }
                    java.lang.String r2 = r3     // Catch:{ all -> 0x00d3 }
                    r15.mo66543a(r2, r14)     // Catch:{ all -> 0x00d3 }
                L_0x00cc:
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r1)
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r0)
                    return
                L_0x00d3:
                    r14 = move-exception
                    r4 = r0
                L_0x00d5:
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r1)
                    com.p280ss.android.common.util.NetworkUtils.safeClose(r4)
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.p1141b.C25653a.C256541.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }

    /* renamed from: a */
    private static void m84371a(String str, String str2, C25655a aVar, boolean z, Object... objArr) {
        try {
            m84369a(str, Okio.buffer(Okio.sink(new File(str2))).outputStream(), aVar);
        } catch (FileNotFoundException e) {
            if (aVar != null) {
                aVar.mo66543a(str, (Exception) e);
            }
        }
    }
}
