package com.toutiao.proxyserver.net;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.p671c.C12960e;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.video.preload.C43281f;
import com.toutiao.proxyserver.C46500j;
import com.toutiao.proxyserver.C46534r;
import com.toutiao.proxyserver.p1839a.C46455c;
import com.toutiao.proxyserver.p1841c.C46470c;
import com.toutiao.proxyserver.p1842d.C46475b;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* renamed from: com.toutiao.proxyserver.net.b */
public final class C46508b {

    /* renamed from: a */
    public static final Map<Long, C46455c> f119828a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final Map<Long, Pair<String, List<InetAddress>>> f119829b = new ConcurrentHashMap();

    /* renamed from: c */
    private static OkHttpClient f119830c;

    /* renamed from: a */
    private static synchronized OkHttpClient m146206a() {
        OkHttpClient okHttpClient;
        synchronized (C46508b.class) {
            if (f119830c == null) {
                Builder builder = new Builder();
                if (!C46534r.f119911r) {
                    builder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
                }
                builder.connectTimeout(10000, TimeUnit.MILLISECONDS).readTimeout(10000, TimeUnit.MILLISECONDS).writeTimeout(10000, TimeUnit.MILLISECONDS);
                builder.dns(new Dns() {
                    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.util.List<java.net.InetAddress> lookup(java.lang.String r6) throws java.net.UnknownHostException {
                        /*
                            r5 = this;
                            boolean r0 = com.toutiao.proxyserver.C46534r.f119915v
                            r1 = 0
                            if (r0 == 0) goto L_0x0035
                            java.util.List r0 = com.bytedance.ttnet.C12961d.m37773a(r6)     // Catch:{ Throwable -> 0x0027 }
                            java.lang.String r1 = "TAG_PROXY_DNS"
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0025 }
                            java.lang.String r3 = "ttnet dns lookup: hostname: "
                            r2.<init>(r3)     // Catch:{ Throwable -> 0x0025 }
                            r2.append(r6)     // Catch:{ Throwable -> 0x0025 }
                            java.lang.String r3 = ", adds: "
                            r2.append(r3)     // Catch:{ Throwable -> 0x0025 }
                            r2.append(r0)     // Catch:{ Throwable -> 0x0025 }
                            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0025 }
                            com.toutiao.proxyserver.p1841c.C46470c.m146085b(r1, r2)     // Catch:{ Throwable -> 0x0025 }
                            goto L_0x0036
                        L_0x0025:
                            r1 = move-exception
                            goto L_0x002b
                        L_0x0027:
                            r0 = move-exception
                            r4 = r1
                            r1 = r0
                            r0 = r4
                        L_0x002b:
                            java.lang.String r2 = "TAG_PROXY_DNS"
                            java.lang.String r1 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r1)
                            com.toutiao.proxyserver.p1841c.C46470c.m146089d(r2, r1)
                            goto L_0x0036
                        L_0x0035:
                            r0 = r1
                        L_0x0036:
                            if (r0 != 0) goto L_0x0059
                            okhttp3.Dns r0 = okhttp3.Dns.SYSTEM
                            java.util.List r0 = r0.lookup(r6)
                            java.lang.String r1 = "TAG_PROXY_DNS"
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            java.lang.String r3 = "system dns lookup: hostname: "
                            r2.<init>(r3)
                            r2.append(r6)
                            java.lang.String r3 = ", adds: "
                            r2.append(r3)
                            r2.append(r0)
                            java.lang.String r2 = r2.toString()
                            com.toutiao.proxyserver.p1841c.C46470c.m146085b(r1, r2)
                        L_0x0059:
                            if (r6 == 0) goto L_0x006e
                            if (r0 == 0) goto L_0x006e
                            java.util.Map<java.lang.Long, android.util.Pair<java.lang.String, java.util.List<java.net.InetAddress>>> r1 = com.toutiao.proxyserver.net.C46508b.f119829b
                            long r2 = com.toutiao.proxyserver.C46534r.m146272d()
                            java.lang.Long r2 = java.lang.Long.valueOf(r2)
                            android.util.Pair r6 = android.util.Pair.create(r6, r0)
                            r1.put(r2, r6)
                        L_0x006e:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.net.C46508b.C465091.lookup(java.lang.String):java.util.List");
                    }
                });
                builder.interceptors.add(new Interceptor() {
                    public final Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        Request.Builder newBuilder = request.newBuilder();
                        long c = C46534r.m146271c();
                        final C46455c cVar = new C46455c();
                        cVar.f119705a = request.header("Vpwp-Raw-Key");
                        cVar.f119708d = request.url.toString();
                        try {
                            if (request.header("local_url_index") != null) {
                                cVar.f119717m = Integer.valueOf(request.header("local_url_index")).intValue();
                            }
                            if (request.header("local_url_count") != null) {
                                cVar.f119718n = Integer.valueOf(request.header("local_url_count")).intValue();
                            }
                        } catch (Exception unused) {
                        }
                        newBuilder.tag(Long.valueOf(c));
                        if (!C46534r.f119917x) {
                            newBuilder.removeHeader("Vpwp-Raw-Key");
                        }
                        newBuilder.removeHeader("local_url_index");
                        newBuilder.removeHeader("local_url_count");
                        C46508b.f119828a.put(Long.valueOf(c), cVar);
                        Request build = newBuilder.build();
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Response proceed = chain.proceed(build);
                            cVar.f119713i = SystemClock.elapsedRealtime() - elapsedRealtime;
                            cVar.f119716l = proceed.code;
                            try {
                                cVar.f119714j = Integer.parseInt(proceed.header("Content-Length", "0"));
                            } catch (Exception unused2) {
                                cVar.f119714j = 0;
                            }
                            try {
                                cVar.f119715k = new HashMap();
                                cVar.f119715k.put(C43281f.f112032p, proceed.header(C43281f.f112032p));
                                cVar.f119715k.put(C43281f.f112033q, proceed.header(C43281f.f112033q));
                                cVar.f119715k.put(C34943c.f91122r, proceed.header(C34943c.f91122r));
                                cVar.f119715k.put(C34943c.f91123s, C46508b.m146204a(proceed.headers));
                            } catch (Exception unused3) {
                                cVar.f119715k = null;
                            }
                            C46508b.f119828a.remove(build.tag);
                            Pair pair = (Pair) C46508b.f119829b.remove(build.tag);
                            if (pair != null) {
                                cVar.f119706b = (String) pair.first;
                                if (pair.second != null) {
                                    cVar.f119707c = ((List) pair.second).toString();
                                }
                            }
                            C46476c.m146132b((Runnable) new Runnable() {
                                public final void run() {
                                    if (C46534r.m146269b() != null) {
                                        C46534r.m146269b().mo105063a(cVar);
                                    }
                                }
                            });
                            return proceed;
                        } catch (IOException e) {
                            if (!(e instanceof SocketTimeoutException)) {
                                if (!(e instanceof ConnectException)) {
                                    cVar.f119716l = -10000;
                                    throw e;
                                }
                            }
                            cVar.f119716l = -104;
                            throw e;
                        } catch (Throwable th) {
                            C46508b.f119828a.remove(build.tag);
                            Pair pair2 = (Pair) C46508b.f119829b.remove(build.tag);
                            if (pair2 != null) {
                                cVar.f119706b = (String) pair2.first;
                                if (pair2.second != null) {
                                    cVar.f119707c = ((List) pair2.second).toString();
                                }
                            }
                            C46476c.m146132b((Runnable) new Runnable() {
                                public final void run() {
                                    if (C46534r.m146269b() != null) {
                                        C46534r.m146269b().mo105063a(cVar);
                                    }
                                }
                            });
                            throw th;
                        }
                    }
                });
                builder.networkInterceptors.add(new Interceptor() {
                    public final Response intercept(Chain chain) throws IOException {
                        Socket socket;
                        String str;
                        String str2;
                        InetSocketAddress inetSocketAddress;
                        Socket socket2;
                        String str3;
                        String str4;
                        InetSocketAddress inetSocketAddress2;
                        Request request = chain.request();
                        String header = request.header("User-Agent");
                        InetAddress inetAddress = null;
                        try {
                            Response proceed = chain.proceed(request);
                            C46455c cVar = (C46455c) C46508b.f119828a.get(request.tag);
                            if (cVar != null) {
                                Connection connection = chain.connection();
                                if (connection == null) {
                                    socket2 = null;
                                } else {
                                    socket2 = connection.socket();
                                }
                                if (socket2 != null) {
                                    InetAddress localAddress = socket2.getLocalAddress();
                                    if (localAddress == null || localAddress.isAnyLocalAddress()) {
                                        str3 = null;
                                    } else {
                                        str3 = localAddress.getHostAddress();
                                    }
                                    InetAddress inetAddress2 = socket2.getInetAddress();
                                    if (inetAddress2 != null) {
                                        str4 = inetAddress2.getHostAddress();
                                    } else {
                                        str4 = null;
                                    }
                                    if (TextUtils.isEmpty(str3)) {
                                        str3 = C46534r.f119897d;
                                        if (TextUtils.isEmpty(str3)) {
                                            str3 = C46475b.m146106a(C46534r.m146257a());
                                        }
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        C46534r.f119897d = str3;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        Route route = connection.route();
                                        if (route == null) {
                                            inetSocketAddress2 = null;
                                        } else {
                                            inetSocketAddress2 = route.inetSocketAddress;
                                        }
                                        if (inetSocketAddress2 != null) {
                                            inetAddress = inetSocketAddress2.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str4 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar.f119710f = str3;
                                    cVar.f119711g = str4;
                                    C46500j.m146183a().mo115651a(cVar.f119708d, cVar);
                                    cVar.f119709e = request.url.toString();
                                    cVar.f119712h = header;
                                }
                            }
                            return proceed;
                        } catch (IOException e) {
                            throw e;
                        } catch (Throwable th) {
                            C46455c cVar2 = (C46455c) C46508b.f119828a.get(request.tag);
                            if (cVar2 != null) {
                                Connection connection2 = chain.connection();
                                if (connection2 == null) {
                                    socket = null;
                                } else {
                                    socket = connection2.socket();
                                }
                                if (socket != null) {
                                    InetAddress localAddress2 = socket.getLocalAddress();
                                    if (localAddress2 == null || localAddress2.isAnyLocalAddress()) {
                                        str = null;
                                    } else {
                                        str = localAddress2.getHostAddress();
                                    }
                                    InetAddress inetAddress3 = socket.getInetAddress();
                                    if (inetAddress3 != null) {
                                        str2 = inetAddress3.getHostAddress();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        str = C46534r.f119897d;
                                        if (TextUtils.isEmpty(str)) {
                                            str = C46475b.m146106a(C46534r.m146257a());
                                        }
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        C46534r.f119897d = str;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        Route route2 = connection2.route();
                                        if (route2 == null) {
                                            inetSocketAddress = null;
                                        } else {
                                            inetSocketAddress = route2.inetSocketAddress;
                                        }
                                        if (inetSocketAddress != null) {
                                            inetAddress = inetSocketAddress.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str2 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar2.f119710f = str;
                                    cVar2.f119711g = str2;
                                    C46500j.m146183a().mo115651a(cVar2.f119708d, cVar2);
                                    cVar2.f119709e = request.url.toString();
                                    cVar2.f119712h = header;
                                }
                            }
                            throw th;
                        }
                    }
                });
                f119830c = builder.build();
            }
            okHttpClient = f119830c;
        }
        return okHttpClient;
    }

    /* renamed from: a */
    public static String m146204a(Headers headers) {
        String str = C34943c.f91123s;
        String str2 = ",";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equals(headers.name(i))) {
                sb.append(headers.value(i));
                sb.append(str2);
            }
        }
        String str3 = "";
        if (sb.length() > 0) {
            return sb.toString().substring(0, sb.length() - 1);
        }
        return str3;
    }

    /* renamed from: b */
    private static Headers m146207b(List<C46513c> list) {
        String str;
        String str2;
        Headers.Builder builder = new Headers.Builder();
        for (C46513c cVar : list) {
            if (C46534r.f119906m) {
                str = C46476c.m146135d(cVar.f119833a);
                str2 = C46476c.m146136e(cVar.f119834b);
            } else {
                str = cVar.f119833a;
                str2 = cVar.f119834b;
            }
            builder.add(str, str2);
        }
        return builder.build();
    }

    /* renamed from: a */
    private static List<C12461b> m146205a(List<C46513c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C46513c cVar : list) {
            arrayList.add(new C12461b(cVar.f119833a, cVar.f119834b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C46507a m146203a(C46514d dVar) throws IOException {
        C12466b bVar;
        if (dVar.mo115659a("Accept-Encoding") == null) {
            dVar.f119837c.add(new C46513c("Accept-Encoding", "identity"));
        }
        if (C46534r.f119902i) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair a = C10191k.m30270a(dVar.f119835a, (Map<String, String>) linkedHashMap);
            String str = (String) a.first;
            String str2 = (String) a.second;
            INetApi iNetApi = (INetApi) RetrofitUtils.m37898a(str, INetApi.class);
            if (iNetApi != null) {
                C12960e eVar = new C12960e();
                eVar.f27554c = dVar.f119838d;
                eVar.f27555d = dVar.f119839e;
                eVar.f27556e = dVar.f119840f;
                List a2 = m146205a(dVar.f119837c);
                if ("GET".equals(dVar.f119836b)) {
                    bVar = iNetApi.get(str2, linkedHashMap, a2, eVar);
                } else {
                    bVar = iNetApi.head(str2, linkedHashMap, a2, eVar);
                }
                C46470c.m146085b("HttpExcutor", "use ttnet retrofit");
                C46518f.m146224c();
                return new C46507a(bVar, dVar);
            }
        }
        Request.Builder builder = new Request.Builder();
        builder.url(dVar.f119835a);
        builder.method(dVar.f119836b, null);
        builder.headers(m146207b(dVar.f119837c));
        OkHttpClient a3 = m146206a();
        if (!(dVar.f119838d == ((long) a3.connectTimeout) && dVar.f119839e == ((long) a3.readTimeout) && dVar.f119840f == ((long) a3.writeTimeout))) {
            a3 = a3.newBuilder().connectTimeout(dVar.f119838d, TimeUnit.MILLISECONDS).readTimeout(dVar.f119839e, TimeUnit.MILLISECONDS).writeTimeout(dVar.f119840f, TimeUnit.MILLISECONDS).build();
        }
        C46470c.m146085b("HttpExcutor", "use ttnet okhttp");
        return new C46507a(a3.newCall(builder.build()), dVar);
    }
}
