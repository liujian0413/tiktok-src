package com.bytedance.frameworks.baselib.network.http.p512a.p513a;

import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10145c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Protocol;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a.b */
public final class C10108b {

    /* renamed from: b */
    private static C10111a f27524b;

    /* renamed from: c */
    private static int f27525c;

    /* renamed from: a */
    private OkHttpClient f27526a;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.a.a.b$a */
    public interface C10111a {
        /* renamed from: a */
        void mo24768a(Builder builder);
    }

    /* renamed from: a */
    public final OkHttpClient mo24767a() {
        C10142f.m30126i();
        synchronized (C10142f.class) {
            if (this.f27526a != null) {
                m30006a(this.f27526a);
                OkHttpClient okHttpClient = this.f27526a;
                return okHttpClient;
            }
            Builder builder = new Builder();
            if (f27525c > 0 && f27525c < 4) {
                m30009a(builder);
            }
            builder.connectionPool(new ConnectionPool(15, 180000, TimeUnit.MILLISECONDS));
            builder.connectTimeout(C40413c.f105051b, TimeUnit.MILLISECONDS);
            builder.readTimeout(C40413c.f105051b, TimeUnit.MILLISECONDS);
            builder.writeTimeout(C40413c.f105051b, TimeUnit.MILLISECONDS);
            builder.addNetworkInterceptor(new Interceptor() {
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
                        java.lang.String r2 = "x-net-info.remoteaddr"
                        java.net.InetAddress r1 = r1.getAddress()     // Catch:{ Throwable -> 0x0032 }
                        java.lang.String r1 = r1.getHostAddress()     // Catch:{ Throwable -> 0x0032 }
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10108b.C101091.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
                }
            });
            builder.dns(new Dns() {
                public final List<InetAddress> lookup(String str) throws UnknownHostException {
                    if (!C10142f.m30127j()) {
                        return Dns.SYSTEM.lookup(str);
                    }
                    List<InetAddress> list = null;
                    try {
                        C10145c k = C10142f.m30128k();
                        if (k != null) {
                            list = k.mo24808a(str);
                        }
                    } catch (Exception unused) {
                    }
                    if (list == null || list.isEmpty()) {
                        return Dns.SYSTEM.lookup(str);
                    }
                    return list;
                }
            });
            builder.cookieJar(CookieJar.NO_COOKIES);
            builder.addInterceptor(new C10112c());
            builder.addInterceptor(new C10113d());
            if (f27524b != null) {
                f27524b.mo24768a(builder);
            }
            this.f27526a = builder.build();
            return this.f27526a;
        }
    }

    /* renamed from: a */
    public static void m30008a(C10111a aVar) {
        f27524b = aVar;
    }

    /* renamed from: a */
    public static void m30007a(int i) {
        if (i > 0 && f27525c == 0) {
            f27525c = i;
        }
    }

    /* renamed from: a */
    private static OkHttpClient m30006a(OkHttpClient okHttpClient) {
        if (f27525c <= 0 || f27525c >= 4 || okHttpClient == null) {
            return okHttpClient;
        }
        Builder newBuilder = okHttpClient.newBuilder();
        m30009a(newBuilder);
        return newBuilder.build();
    }

    /* renamed from: a */
    private static void m30009a(Builder builder) {
        if (builder != null) {
            ArrayList arrayList = new ArrayList();
            switch (f27525c) {
                case 1:
                    arrayList.add(Protocol.HTTP_2);
                    break;
                case 2:
                    arrayList.add(Protocol.SPDY_3);
                    break;
                case 3:
                    break;
                default:
                    arrayList.add(Protocol.HTTP_2);
                    arrayList.add(Protocol.SPDY_3);
                    break;
            }
            f27525c = 4;
            arrayList.add(Protocol.HTTP_1_1);
            builder.protocols(Collections.unmodifiableList(arrayList));
        }
    }
}
