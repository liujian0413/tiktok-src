package com.facebook.net;

import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10112c;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

/* renamed from: com.facebook.net.a */
public class C14123a {

    /* renamed from: a */
    private static OkHttpClient f37322a;

    /* renamed from: a */
    public static OkHttpClient m41710a() {
        synchronized (C14123a.class) {
            if (f37322a != null) {
                OkHttpClient okHttpClient = f37322a;
                return okHttpClient;
            }
            Builder builder = new Builder();
            builder.addInterceptor(new C10112c());
            builder.networkInterceptors.add(new Interceptor() {
                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|(1:4)(1:5)|(2:7|8)|9|10|(4:12|13|14|25)(1:27)|(1:(1:23))) */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
                    r4 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
                    if (r1 != null) goto L_0x0036;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                    r0 = r4.getMessage();
                    r2 = new java.lang.StringBuilder();
                    r2.append(r1.getAddress().getHostAddress());
                    r2.append("|");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
                    if (r0 == null) goto L_0x0051;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
                    r0 = com.p280ss.android.ttve.nativePort.TEVideoRecorder.FACE_BEAUTY_NULL;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
                    r2.append(r0);
                    com.bytedance.common.utility.reflect.C6322b.m19610a((java.lang.Object) r4).mo15157a("detailMessage", (java.lang.Object) r2.toString());
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[SYNTHETIC, Splitter:B:12:0x001c] */
                /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r4) throws java.io.IOException {
                    /*
                        r3 = this;
                        okhttp3.Request r0 = r4.request()
                        r1 = 0
                        okhttp3.Connection r2 = r4.connection()     // Catch:{ Throwable -> 0x0016 }
                        if (r2 == 0) goto L_0x0010
                        okhttp3.Route r2 = r2.route()     // Catch:{ Throwable -> 0x0016 }
                        goto L_0x0011
                    L_0x0010:
                        r2 = r1
                    L_0x0011:
                        if (r2 == 0) goto L_0x0016
                        java.net.InetSocketAddress r2 = r2.inetSocketAddress     // Catch:{ Throwable -> 0x0016 }
                        r1 = r2
                    L_0x0016:
                        okhttp3.Response r4 = r4.proceed(r0)     // Catch:{ IOException -> 0x0033 }
                        if (r1 == 0) goto L_0x0032
                        okhttp3.Response$Builder r0 = r4.newBuilder()     // Catch:{ Throwable -> 0x0032 }
                        java.net.InetAddress r1 = r1.getAddress()     // Catch:{ Throwable -> 0x0032 }
                        java.lang.String r1 = r1.getHostAddress()     // Catch:{ Throwable -> 0x0032 }
                        java.lang.String r2 = "x-snssdk.remoteaddr"
                        r0.addHeader(r2, r1)     // Catch:{ Throwable -> 0x0032 }
                        okhttp3.Response r0 = r0.build()     // Catch:{ Throwable -> 0x0032 }
                        r4 = r0
                    L_0x0032:
                        return r4
                    L_0x0033:
                        r4 = move-exception
                        if (r1 == 0) goto L_0x0063
                        java.lang.String r0 = r4.getMessage()     // Catch:{ Throwable -> 0x0063 }
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0063 }
                        r2.<init>()     // Catch:{ Throwable -> 0x0063 }
                        java.net.InetAddress r1 = r1.getAddress()     // Catch:{ Throwable -> 0x0063 }
                        java.lang.String r1 = r1.getHostAddress()     // Catch:{ Throwable -> 0x0063 }
                        r2.append(r1)     // Catch:{ Throwable -> 0x0063 }
                        java.lang.String r1 = "|"
                        r2.append(r1)     // Catch:{ Throwable -> 0x0063 }
                        if (r0 != 0) goto L_0x0053
                        java.lang.String r0 = "null"
                    L_0x0053:
                        r2.append(r0)     // Catch:{ Throwable -> 0x0063 }
                        com.bytedance.common.utility.reflect.b r0 = com.bytedance.common.utility.reflect.C6322b.m19610a(r4)     // Catch:{ Throwable -> 0x0063 }
                        java.lang.String r1 = "detailMessage"
                        java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0063 }
                        r0.mo15157a(r1, r2)     // Catch:{ Throwable -> 0x0063 }
                    L_0x0063:
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C14123a.C141241.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
                }
            });
            f37322a = builder.build();
            return f37322a;
        }
    }
}
