package com.bytedance.frameworks.baselib.network.http.p512a.p513a;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10151i;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a.c */
public final class C10112c implements Interceptor {
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013b A[Catch:{ Throwable -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016e A[SYNTHETIC, Splitter:B:71:0x016e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r20) throws java.io.IOException {
        /*
            r19 = this;
            r9 = r19
            okhttp3.Request r1 = r20.request()
            okhttp3.HttpUrl r0 = r1.url     // Catch:{ Exception -> 0x000d }
            java.net.URI r0 = r0.uri()     // Catch:{ Exception -> 0x000d }
            goto L_0x0017
        L_0x000d:
            okhttp3.HttpUrl r0 = r1.url
            java.lang.String r0 = r0.toString()
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.C10189i.m30264b(r0)
        L_0x0017:
            r10 = r0
            okhttp3.Request$Builder r2 = r1.newBuilder()
            m30015a(r10, r1, r2)
            java.net.CookieHandler r11 = java.net.CookieHandler.getDefault()
            okhttp3.Headers r3 = r1.headers
            r12 = 5
            r4 = 0
            r5 = 1
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x00fe }
            r0.<init>()     // Catch:{ Throwable -> 0x00fe }
            if (r3 == 0) goto L_0x0053
            java.util.Set r6 = r3.names()     // Catch:{ Throwable -> 0x00fe }
            if (r6 == 0) goto L_0x0053
            boolean r7 = r6.isEmpty()     // Catch:{ Throwable -> 0x00fe }
            if (r7 != 0) goto L_0x0053
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x00fe }
        L_0x003f:
            boolean r7 = r6.hasNext()     // Catch:{ Throwable -> 0x00fe }
            if (r7 == 0) goto L_0x0053
            java.lang.Object r7 = r6.next()     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x00fe }
            java.util.List r8 = r3.values(r7)     // Catch:{ Throwable -> 0x00fe }
            r0.put(r7, r8)     // Catch:{ Throwable -> 0x00fe }
            goto L_0x003f
        L_0x0053:
            r6 = 0
            if (r11 == 0) goto L_0x0078
            java.util.Map r0 = r11.get(r10, r0)     // Catch:{ IOException -> 0x005b }
            goto L_0x0079
        L_0x005b:
            r0 = move-exception
            r7 = r0
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()     // Catch:{ Throwable -> 0x00fe }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r13 = "Loading cookies failed for "
            r8.<init>(r13)     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r13 = "/..."
            java.net.URI r13 = r10.resolve(r13)     // Catch:{ Throwable -> 0x00fe }
            r8.append(r13)     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x00fe }
            r0.log(r12, r8, r7)     // Catch:{ Throwable -> 0x00fe }
        L_0x0078:
            r0 = r6
        L_0x0079:
            if (r0 == 0) goto L_0x00f0
            int r6 = r0.size()     // Catch:{ Throwable -> 0x00fe }
            if (r6 <= 0) goto L_0x00f0
            java.util.Set r0 = r0.entrySet()     // Catch:{ Throwable -> 0x00fe }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x00fe }
        L_0x0089:
            boolean r6 = r0.hasNext()     // Catch:{ Throwable -> 0x00fe }
            if (r6 == 0) goto L_0x00fe
            java.lang.Object r6 = r0.next()     // Catch:{ Throwable -> 0x00fe }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Throwable -> 0x00fe }
            java.lang.Object r7 = r6.getKey()     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x00fe }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fe }
            r8.<init>()     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r13 = "X-SS-Cookie"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x00fe }
            if (r13 != 0) goto L_0x00b8
            java.lang.String r13 = "Cookie"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x00fe }
            if (r13 != 0) goto L_0x00b8
            java.lang.String r13 = "Cookie2"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x00fe }
            if (r13 == 0) goto L_0x0089
        L_0x00b8:
            java.lang.Object r13 = r6.getValue()     // Catch:{ Throwable -> 0x00fe }
            java.util.List r13 = (java.util.List) r13     // Catch:{ Throwable -> 0x00fe }
            boolean r13 = r13.isEmpty()     // Catch:{ Throwable -> 0x00fe }
            if (r13 != 0) goto L_0x0089
            java.lang.Object r6 = r6.getValue()     // Catch:{ Throwable -> 0x00fe }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Throwable -> 0x00fe }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x00fe }
            r13 = 0
        L_0x00cf:
            boolean r14 = r6.hasNext()     // Catch:{ Throwable -> 0x00fe }
            if (r14 == 0) goto L_0x00e8
            java.lang.Object r14 = r6.next()     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Throwable -> 0x00fe }
            if (r13 <= 0) goto L_0x00e2
            java.lang.String r15 = "; "
            r8.append(r15)     // Catch:{ Throwable -> 0x00fe }
        L_0x00e2:
            r8.append(r14)     // Catch:{ Throwable -> 0x00fe }
            int r13 = r13 + 1
            goto L_0x00cf
        L_0x00e8:
            java.lang.String r6 = r8.toString()     // Catch:{ Throwable -> 0x00fe }
            m30013a(r10, r7, r6, r2)     // Catch:{ Throwable -> 0x00fe }
            goto L_0x0089
        L_0x00f0:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r6 = "X-SS-Cookie"
            r0[r4] = r6     // Catch:{ Throwable -> 0x00fe }
            java.lang.String r6 = "Cookie"
            r0[r5] = r6     // Catch:{ Throwable -> 0x00fe }
            r9.m30014a(r10, r3, r0, r2)     // Catch:{ Throwable -> 0x00fe }
        L_0x00fe:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r5 = "x-tt-token"
            r0[r4] = r5
            r9.m30014a(r10, r3, r0, r2)
            okhttp3.Request r0 = r2.build()     // Catch:{ Throwable -> 0x010e }
        L_0x010b:
            r1 = r20
            goto L_0x0110
        L_0x010e:
            r0 = r1
            goto L_0x010b
        L_0x0110:
            okhttp3.Response r13 = r1.proceed(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            okhttp3.Response$Builder r14 = r13.newBuilder()
            okhttp3.Headers r15 = r13.headers     // Catch:{ Throwable -> 0x016c }
            java.lang.String r1 = "tko"
            java.lang.String r16 = r15.get(r1)     // Catch:{ Throwable -> 0x016c }
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch:{ Throwable -> 0x016c }
            r8.<init>()     // Catch:{ Throwable -> 0x016c }
            java.lang.String r1 = "X-SS-Set-Cookie"
            r8.add(r1)     // Catch:{ Throwable -> 0x016c }
            java.lang.String r1 = "Set-Cookie"
            r8.add(r1)     // Catch:{ Throwable -> 0x016c }
            java.lang.String r1 = "x-tt-token"
            r8.add(r1)     // Catch:{ Throwable -> 0x016c }
            if (r15 == 0) goto L_0x016c
            java.util.Set r1 = r15.names()     // Catch:{ Throwable -> 0x016c }
            if (r1 == 0) goto L_0x016c
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x016c }
            if (r2 != 0) goto L_0x016c
            java.util.Iterator r17 = r1.iterator()     // Catch:{ Throwable -> 0x016c }
        L_0x014b:
            boolean r1 = r17.hasNext()     // Catch:{ Throwable -> 0x016c }
            if (r1 == 0) goto L_0x016c
            java.lang.Object r1 = r17.next()     // Catch:{ Throwable -> 0x016c }
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x016c }
            java.util.List r5 = r15.values(r4)     // Catch:{ Throwable -> 0x016c }
            r1 = r19
            r2 = r10
            r3 = r16
            r6 = r8
            r7 = r0
            r18 = r8
            r8 = r14
            r1.m30012a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x016c }
            r8 = r18
            goto L_0x014b
        L_0x016c:
            if (r11 == 0) goto L_0x018f
            r11.put(r10, r0)     // Catch:{ IOException -> 0x0172 }
            goto L_0x018f
        L_0x0172:
            r0 = move-exception
            r1 = r0
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Saving cookies failed for "
            r2.<init>(r3)
            java.lang.String r3 = "/..."
            java.net.URI r3 = r10.resolve(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.log(r12, r2, r1)
        L_0x018f:
            okhttp3.Response r0 = r14.build()     // Catch:{ Throwable -> 0x0194 }
            goto L_0x0195
        L_0x0194:
            r0 = r13
        L_0x0195:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10112c.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    /* renamed from: a */
    private static boolean m30016a(Set<String> set, String str) {
        if (set == null || TextUtils.isEmpty(str)) {
            return false;
        }
        for (String equalsIgnoreCase : set) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m30015a(URI uri, Request request, Builder builder) {
        if (uri != null && request != null && builder != null) {
            try {
                C10151i a = C10142f.m30094a();
                if (a != null && a.mo24818a(uri)) {
                    Map a2 = a.mo24817a();
                    String str = (String) a2.get("token");
                    if (!C6319n.m19593a(str)) {
                        builder.addHeader("tko", str);
                    }
                    int intValue = ((Integer) a2.get(C38347c.f99551f)).intValue();
                    if (intValue > 0) {
                        builder.addHeader("tkv", String.valueOf(intValue));
                    }
                    Pair a3 = a.mo24815a(request.url.encodedQuery());
                    if (a3 != null && ((Boolean) a3.first).booleanValue()) {
                        builder.addHeader("thm", (String) a3.second);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m30013a(URI uri, String str, String str2, Builder builder) {
        if (uri != null && !C6319n.m19593a(str) && !C6319n.m19593a(str2) && builder != null) {
            try {
                C10151i a = C10142f.m30094a();
                if (a != null && a.mo24818a(uri)) {
                    Pair a2 = a.mo24816a(str2.getBytes());
                    if (a2 != null && ((Boolean) a2.first).booleanValue()) {
                        str2 = Base64.encodeToString((byte[]) a2.second, 2);
                    }
                }
            } catch (Throwable unused) {
            }
            builder.addHeader(str, str2);
        }
    }

    /* renamed from: a */
    private void m30014a(URI uri, Headers headers, String[] strArr, Builder builder) {
        if (uri != null && headers != null && strArr.length > 0 && builder != null) {
            try {
                for (String str : strArr) {
                    List<String> values = headers.values(str);
                    if (values != null && values.size() > 0) {
                        builder.removeHeader(str);
                        for (String a : values) {
                            m30013a(uri, str, a, builder);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m30012a(URI uri, String str, String str2, List<String> list, Set<String> set, Map<String, List<String>> map, Response.Builder builder) {
        if (uri != null && !C6319n.m19593a(str2) && list != null && list.size() > 0) {
            try {
                List<String> linkedList = new LinkedList<>();
                if (!m30016a(set, str2) || !"1".equals(str)) {
                    for (String add : list) {
                        linkedList.add(add);
                    }
                } else {
                    builder.removeHeader(str2);
                    for (String str3 : list) {
                        C10151i a = C10142f.m30094a();
                        if (a != null && a.mo24818a(uri)) {
                            Pair b = a.mo24819b(Base64.decode(str3, 2));
                            if (b != null && ((Boolean) b.first).booleanValue()) {
                                String str4 = new String((byte[]) b.second);
                                linkedList.add(str4);
                                builder.header(str2, str4);
                            }
                        }
                    }
                }
                list = linkedList;
            } catch (Throwable unused) {
            }
            map.put(str2, list);
        }
    }
}
