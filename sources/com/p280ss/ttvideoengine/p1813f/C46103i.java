package com.p280ss.ttvideoengine.p1813f;

import com.p280ss.ttvideoengine.p1813f.C46106j.C46107a;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.f.i */
public class C46103i extends C46106j {

    /* renamed from: a */
    public static final MediaType f117975a = MediaType.parse("application/json");

    /* renamed from: b */
    private static OkHttpClient f117976b;

    /* renamed from: c */
    private Call f117977c;

    /* renamed from: a */
    public final void mo112277a() {
        if (this.f117977c != null && !this.f117977c.isCanceled()) {
            this.f117977c.cancel();
        }
    }

    /* renamed from: a */
    public final void mo112278a(String str, Map<String, String> map, final C46107a aVar) {
        synchronized (C46103i.class) {
            if (f117976b == null) {
                f117976b = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
            }
        }
        Builder url = new Builder().url(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                url.header(str2, (String) map.get(str2));
            }
        }
        this.f117977c = f117976b.newCall(url.build());
        this.f117977c.enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                aVar.mo112153a(null, new C46117c("", -9994, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[SYNTHETIC, Splitter:B:26:0x004f] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onResponse(okhttp3.Call r6, okhttp3.Response r7) {
                /*
                    r5 = this;
                    r6 = 0
                    okhttp3.ResponseBody r0 = r7.body     // Catch:{ all -> 0x004a }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0013 }
                    java.lang.String r2 = r0.string()     // Catch:{ Exception -> 0x0013 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0013 }
                    r2 = -1
                    r2 = r1
                    r3 = -1
                    r1 = r6
                    goto L_0x0019
                L_0x0011:
                    r6 = move-exception
                    goto L_0x004d
                L_0x0013:
                    r1 = move-exception
                    r2 = -9979(0xffffffffffffd905, float:NaN)
                    r2 = r6
                    r3 = -9979(0xffffffffffffd905, float:NaN)
                L_0x0019:
                    if (r1 != 0) goto L_0x002a
                    boolean r4 = r7.isSuccessful()     // Catch:{ all -> 0x0011 }
                    if (r4 != 0) goto L_0x002a
                    java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0011 }
                    java.lang.String r3 = "http fail"
                    r1.<init>(r3)     // Catch:{ all -> 0x0011 }
                    int r3 = r7.code     // Catch:{ all -> 0x0011 }
                L_0x002a:
                    if (r0 == 0) goto L_0x0031
                    r0.close()     // Catch:{ Exception -> 0x0030 }
                    goto L_0x0031
                L_0x0030:
                L_0x0031:
                    if (r1 != 0) goto L_0x0039
                    com.ss.ttvideoengine.f.j$a r7 = r8
                    r7.mo112153a(r2, r6)
                    return
                L_0x0039:
                    com.ss.ttvideoengine.f.j$a r6 = r8
                    com.ss.ttvideoengine.i.c r7 = new com.ss.ttvideoengine.i.c
                    java.lang.String r0 = ""
                    java.lang.String r1 = r1.toString()
                    r7.<init>(r0, r3, r1)
                    r6.mo112153a(r2, r7)
                    return
                L_0x004a:
                    r7 = move-exception
                    r0 = r6
                    r6 = r7
                L_0x004d:
                    if (r0 == 0) goto L_0x0052
                    r0.close()     // Catch:{ Exception -> 0x0052 }
                L_0x0052:
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1813f.C46103i.C461041.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }

    /* renamed from: a */
    public final void mo112279a(String str, Map<String, String> map, JSONObject jSONObject, int i, final C46107a aVar) {
        synchronized (C46103i.class) {
            if (f117976b == null) {
                f117976b = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
            }
        }
        Builder url = new Builder().url(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                url.addHeader(str2, (String) map.get(str2));
            }
        }
        if (i == 1) {
            url.post(RequestBody.create(f117975a, String.valueOf(jSONObject)));
        }
        this.f117977c = f117976b.newCall(url.build());
        this.f117977c.enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                StringBuilder sb = new StringBuilder("startTask onFailure: ");
                sb.append(iOException.toString());
                C46123h.m144545a("TTHTTPNetwork", sb.toString());
                aVar.mo112153a(null, new C46117c("", -9994, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0037 A[Catch:{ all -> 0x0027 }] */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[SYNTHETIC, Splitter:B:20:0x003d] */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[SYNTHETIC, Splitter:B:34:0x0075] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onResponse(okhttp3.Call r8, okhttp3.Response r9) throws java.io.IOException {
                /*
                    r7 = this;
                    r8 = 0
                    okhttp3.ResponseBody r0 = r9.body     // Catch:{ all -> 0x0070 }
                    r1 = -9979(0xffffffffffffd905, float:NaN)
                    java.lang.String r2 = r0.string()     // Catch:{ Exception -> 0x0029 }
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0029 }
                    r3.<init>(r2)     // Catch:{ Exception -> 0x0029 }
                    java.lang.String r4 = "TTHTTPNetwork"
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0025 }
                    java.lang.String r6 = "startTask onResponse body:"
                    r5.<init>(r6)     // Catch:{ Exception -> 0x0025 }
                    r5.append(r2)     // Catch:{ Exception -> 0x0025 }
                    java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0025 }
                    com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r4, r2)     // Catch:{ Exception -> 0x0025 }
                    r2 = -1
                    r2 = r8
                    r4 = -1
                    goto L_0x0031
                L_0x0025:
                    r2 = move-exception
                    goto L_0x002b
                L_0x0027:
                    r8 = move-exception
                    goto L_0x0073
                L_0x0029:
                    r2 = move-exception
                    r3 = r8
                L_0x002b:
                    java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0027 }
                    r4 = -9979(0xffffffffffffd905, float:NaN)
                L_0x0031:
                    boolean r5 = r9.isSuccessful()     // Catch:{ all -> 0x0027 }
                    if (r5 != 0) goto L_0x003b
                    java.lang.String r2 = r9.message     // Catch:{ all -> 0x0027 }
                    int r4 = r9.code     // Catch:{ all -> 0x0027 }
                L_0x003b:
                    if (r0 == 0) goto L_0x0042
                    r0.close()     // Catch:{ Exception -> 0x0041 }
                    goto L_0x0042
                L_0x0041:
                L_0x0042:
                    if (r2 != 0) goto L_0x004a
                    com.ss.ttvideoengine.f.j$a r9 = r10
                    r9.mo112153a(r3, r8)
                    return
                L_0x004a:
                    if (r4 != r1) goto L_0x005d
                    com.ss.ttvideoengine.f.j$a r9 = r10
                    com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c
                    java.lang.String r3 = ""
                    java.lang.String r2 = r2.toString()
                    r0.<init>(r3, r1, r4, r2)
                    r9.mo112153a(r8, r0)
                    return
                L_0x005d:
                    com.ss.ttvideoengine.f.j$a r8 = r10
                    com.ss.ttvideoengine.i.c r9 = new com.ss.ttvideoengine.i.c
                    java.lang.String r0 = ""
                    r1 = -9994(0xffffffffffffd8f6, float:NaN)
                    java.lang.String r2 = r2.toString()
                    r9.<init>(r0, r1, r4, r2)
                    r8.mo112153a(r3, r9)
                    return
                L_0x0070:
                    r9 = move-exception
                    r0 = r8
                    r8 = r9
                L_0x0073:
                    if (r0 == 0) goto L_0x0078
                    r0.close()     // Catch:{ Exception -> 0x0078 }
                L_0x0078:
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1813f.C46103i.C461052.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }
}
