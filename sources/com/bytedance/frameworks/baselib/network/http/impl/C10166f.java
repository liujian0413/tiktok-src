package com.bytedance.frameworks.baselib.network.http.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.taobao.android.dexposed.ClassUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.f */
public class C10166f implements C10161c {

    /* renamed from: b */
    private static final String f27690b = "f";

    /* renamed from: d */
    private static final Map<String, String> f27691d = new LinkedHashMap();

    /* renamed from: e */
    private static String f27692e;

    /* renamed from: a */
    public final Map<URI, Set<SerializableHttpCookie>> f27693a = new LinkedHashMap();

    /* renamed from: c */
    private final SharedPreferences f27694c;

    /* renamed from: b */
    private synchronized void m30198b(Map map, boolean z) {
        C10168g.m30207a(this, map, z);
    }

    /* renamed from: a */
    public final synchronized void mo24835a(URI uri, C10163e eVar) {
        C10168g.m30206a(this, uri, eVar);
    }

    /* renamed from: a */
    public static void m30193a() {
        f27692e = "ttnetCookieStore";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b1, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24847b() {
        /*
            r15 = this;
            monitor-enter(r15)
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r0 = r15.f27693a     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x01b0
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r0 = r15.f27693a     // Catch:{ all -> 0x01b2 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x000f
            goto L_0x01b0
        L_0x000f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01b2 }
            r0.<init>()     // Catch:{ all -> 0x01b2 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r1 = r15.f27693a     // Catch:{ all -> 0x01b2 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x001e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x01b2 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x01b2 }
            if (r2 == 0) goto L_0x001e
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x01b2 }
            java.net.URI r3 = (java.net.URI) r3     // Catch:{ all -> 0x01b2 }
            java.lang.String r4 = r3.getScheme()     // Catch:{ all -> 0x01b2 }
            if (r4 == 0) goto L_0x001e
            java.lang.String r3 = r3.getScheme()     // Catch:{ all -> 0x01b2 }
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x01b2 }
            if (r3 == 0) goto L_0x001e
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x01b2 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x01b2 }
            r0.put(r3, r2)     // Catch:{ all -> 0x01b2 }
            goto L_0x001e
        L_0x0050:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x0058
            monitor-exit(r15)
            return
        L_0x0058:
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x0060:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x0126
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01b2 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x0060
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x01b2 }
            java.net.URI r2 = (java.net.URI) r2     // Catch:{ all -> 0x01b2 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x01b2 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x01b2 }
            java.net.URI r3 = new java.net.URI     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r5 = "https:"
            java.lang.String r6 = "http:"
            java.lang.String r4 = r4.replace(r5, r6)     // Catch:{ Throwable -> 0x0060 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0060 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r4 = r15.f27693a     // Catch:{ Throwable -> 0x0060 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Throwable -> 0x0060 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ Throwable -> 0x0060 }
            if (r4 == 0) goto L_0x011a
            boolean r5 = r4.isEmpty()     // Catch:{ Throwable -> 0x0060 }
            if (r5 == 0) goto L_0x009d
            goto L_0x011a
        L_0x009d:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch:{ Throwable -> 0x0060 }
            r5.<init>()     // Catch:{ Throwable -> 0x0060 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Throwable -> 0x0060 }
        L_0x00a6:
            boolean r6 = r4.hasNext()     // Catch:{ Throwable -> 0x0060 }
            if (r6 == 0) goto L_0x00f4
            java.lang.Object r6 = r4.next()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie r6 = (com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie) r6     // Catch:{ Throwable -> 0x0060 }
            r7 = 0
            java.util.Iterator r8 = r1.iterator()     // Catch:{ Throwable -> 0x0060 }
        L_0x00b7:
            boolean r9 = r8.hasNext()     // Catch:{ Throwable -> 0x0060 }
            if (r9 == 0) goto L_0x00ee
            java.lang.Object r9 = r8.next()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie r9 = (com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie) r9     // Catch:{ Throwable -> 0x0060 }
            if (r6 == 0) goto L_0x00b7
            if (r9 == 0) goto L_0x00b7
            com.bytedance.frameworks.baselib.network.http.impl.e r10 = r6.getHttpCookie()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.frameworks.baselib.network.http.impl.e r11 = r9.getHttpCookie()     // Catch:{ Throwable -> 0x0060 }
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x0060 }
            if (r10 == 0) goto L_0x00b7
            java.lang.Long r10 = r9.getWhenCreated()     // Catch:{ Throwable -> 0x0060 }
            long r10 = r10.longValue()     // Catch:{ Throwable -> 0x0060 }
            java.lang.Long r12 = r6.getWhenCreated()     // Catch:{ Throwable -> 0x0060 }
            long r12 = r12.longValue()     // Catch:{ Throwable -> 0x0060 }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00b7
            r5.add(r9)     // Catch:{ Throwable -> 0x0060 }
            r7 = 1
            goto L_0x00b7
        L_0x00ee:
            if (r7 != 0) goto L_0x00a6
            r5.add(r6)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x00a6
        L_0x00f4:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0060 }
        L_0x00f8:
            boolean r4 = r1.hasNext()     // Catch:{ Throwable -> 0x0060 }
            if (r4 == 0) goto L_0x010e
            java.lang.Object r4 = r1.next()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie r4 = (com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie) r4     // Catch:{ Throwable -> 0x0060 }
            boolean r6 = r5.contains(r4)     // Catch:{ Throwable -> 0x0060 }
            if (r6 != 0) goto L_0x00f8
            r5.add(r4)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x00f8
        L_0x010e:
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r1 = r15.f27693a     // Catch:{ Throwable -> 0x0060 }
            r1.remove(r2)     // Catch:{ Throwable -> 0x0060 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r1 = r15.f27693a     // Catch:{ Throwable -> 0x0060 }
            r1.put(r3, r5)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0060
        L_0x011a:
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r4 = r15.f27693a     // Catch:{ Throwable -> 0x0060 }
            r4.remove(r2)     // Catch:{ Throwable -> 0x0060 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r2 = r15.f27693a     // Catch:{ Throwable -> 0x0060 }
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0060
        L_0x0126:
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r0 = r15.f27693a     // Catch:{ Throwable -> 0x01ae }
            if (r0 == 0) goto L_0x01ac
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r0 = r15.f27693a     // Catch:{ Throwable -> 0x01ae }
            boolean r0 = r0.isEmpty()     // Catch:{ Throwable -> 0x01ae }
            if (r0 == 0) goto L_0x0134
            goto L_0x01ac
        L_0x0134:
            android.content.SharedPreferences r0 = r15.f27694c     // Catch:{ Throwable -> 0x01ae }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Throwable -> 0x01ae }
            r0.clear()     // Catch:{ Throwable -> 0x01ae }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r1 = r15.f27693a     // Catch:{ Throwable -> 0x01ae }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Throwable -> 0x01ae }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x01ae }
        L_0x0147:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x01ae }
            if (r2 == 0) goto L_0x01a7
            java.lang.Object r2 = r1.next()     // Catch:{ Throwable -> 0x01ae }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Throwable -> 0x01ae }
            java.lang.Object r3 = r2.getKey()     // Catch:{ Throwable -> 0x01ae }
            java.net.URI r3 = (java.net.URI) r3     // Catch:{ Throwable -> 0x01ae }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Throwable -> 0x01ae }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ Throwable -> 0x01ae }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x01ae }
        L_0x0163:
            boolean r4 = r2.hasNext()     // Catch:{ Throwable -> 0x01ae }
            if (r4 == 0) goto L_0x0147
            java.lang.Object r4 = r2.next()     // Catch:{ Throwable -> 0x01ae }
            com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie r4 = (com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie) r4     // Catch:{ Throwable -> 0x01ae }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ae }
            r5.<init>()     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r6 = r3.toString()     // Catch:{ Throwable -> 0x01ae }
            r5.append(r6)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r6 = "|"
            r5.append(r6)     // Catch:{ Throwable -> 0x01ae }
            com.bytedance.frameworks.baselib.network.http.impl.e r6 = r4.getHttpCookie()     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r6 = r6.f27677f     // Catch:{ Throwable -> 0x01ae }
            r5.append(r6)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r6 = r4.encode()     // Catch:{ Throwable -> 0x01ae }
            com.bytedance.frameworks.baselib.network.http.impl.e r4 = r4.getHttpCookie()     // Catch:{ Throwable -> 0x01ae }
            long r7 = r4.f27676e     // Catch:{ Throwable -> 0x01ae }
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a1
            r0.putString(r5, r6)     // Catch:{ Throwable -> 0x01ae }
            goto L_0x0163
        L_0x01a1:
            java.util.Map<java.lang.String, java.lang.String> r4 = f27691d     // Catch:{ Throwable -> 0x01ae }
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x01ae }
            goto L_0x0163
        L_0x01a7:
            com.bytedance.common.utility.p481c.C9721b.m28656a(r0)     // Catch:{ Throwable -> 0x01ae }
            monitor-exit(r15)
            return
        L_0x01ac:
            monitor-exit(r15)
            return
        L_0x01ae:
            monitor-exit(r15)
            return
        L_0x01b0:
            monitor-exit(r15)
            return
        L_0x01b2:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.C10166f.mo24847b():void");
    }

    /* renamed from: a */
    public final synchronized List<C10163e> mo24834a(URI uri) {
        return m30197b(uri);
    }

    public C10166f(Context context) {
        String str;
        int i;
        if (f27692e == null) {
            str = "cookieStore";
        } else {
            str = f27692e;
        }
        if (VERSION.SDK_INT < 11) {
            i = 0;
        } else {
            i = 4;
        }
        this.f27694c = C7285c.m22838a(context, str, i);
        m30198b(this.f27694c.getAll(), true);
        m30198b((Map) f27691d, false);
    }

    /* renamed from: b */
    private List<C10163e> m30197b(URI uri) {
        ArrayList<SerializableHttpCookie> arrayList = new ArrayList<>();
        for (URI uri2 : this.f27693a.keySet()) {
            if (m30196a(uri2.getHost(), uri.getHost()) && m30199b(uri2.getPath(), uri.getPath())) {
                arrayList.addAll((Collection) this.f27693a.get(uri2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (SerializableHttpCookie serializableHttpCookie : arrayList) {
            if (serializableHttpCookie.hasExpired()) {
                arrayList3.add(serializableHttpCookie);
            } else {
                arrayList2.add(serializableHttpCookie.getHttpCookie());
            }
        }
        if (!arrayList3.isEmpty()) {
            m30195a(uri, (List<SerializableHttpCookie>) arrayList3);
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static boolean m30196a(String str, String str2) {
        if (!str2.equals(str)) {
            StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str);
            if (!str2.endsWith(sb.toString())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m30199b(String str, String str2) {
        if (str2.equals(str) || ((str2.startsWith(str) && str.charAt(str.length() - 1) == '/') || (str2.startsWith(str) && str2.substring(str.length()).charAt(0) == '/'))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static URI m30200c(URI uri, C10163e eVar) {
        String str;
        if (eVar.f27675d == null) {
            return uri;
        }
        String str2 = eVar.f27675d;
        if (str2.charAt(0) == '.') {
            str2 = str2.substring(1);
        }
        try {
            String str3 = WebKitApi.SCHEME_HTTP;
            if (eVar.f27678g == null) {
                str = "/";
            } else {
                str = eVar.f27678g;
            }
            return new URI(str3, str2, str, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    /* renamed from: a */
    private void m30194a(URI uri, SerializableHttpCookie serializableHttpCookie) {
        StringBuilder sb = new StringBuilder();
        sb.append(uri.toString());
        sb.append("|");
        sb.append(serializableHttpCookie.getHttpCookie().f27677f);
        String sb2 = sb.toString();
        String encode = serializableHttpCookie.encode();
        if (serializableHttpCookie.getHttpCookie().f27676e > 0) {
            Editor edit = this.f27694c.edit();
            edit.putString(sb2, encode);
            edit.apply();
            return;
        }
        f27691d.put(sb2, encode);
    }

    /* renamed from: a */
    private void m30195a(URI uri, List<SerializableHttpCookie> list) {
        Editor edit = this.f27694c.edit();
        for (SerializableHttpCookie serializableHttpCookie : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri.toString());
            sb.append("|");
            sb.append(serializableHttpCookie.getHttpCookie().f27677f);
            String sb2 = sb.toString();
            edit.remove(sb2);
            f27691d.remove(sb2);
        }
        edit.apply();
    }

    /* renamed from: b */
    public final synchronized void mo24848b(URI uri, C10163e eVar) {
        URI c = m30200c(uri, eVar);
        Set set = (Set) this.f27693a.get(c);
        SerializableHttpCookie serializableHttpCookie = new SerializableHttpCookie(eVar);
        if (set == null) {
            set = new HashSet();
            this.f27693a.put(c, set);
        } else {
            set.remove(serializableHttpCookie);
        }
        set.add(serializableHttpCookie);
        m30194a(c, serializableHttpCookie);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24846a(java.util.Map<java.lang.String, ?> r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x0068
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0068
        L_0x000a:
            java.util.Set r5 = r5.entrySet()     // Catch:{ Throwable -> 0x0063 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x0063 }
        L_0x0012:
            boolean r0 = r5.hasNext()     // Catch:{ Throwable -> 0x0063 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r5.next()     // Catch:{ Throwable -> 0x0063 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Throwable -> 0x0063 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r2 = "\\|"
            r3 = 2
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ Throwable -> 0x0063 }
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0012 }
            r3 = 0
            r1 = r1[r3]     // Catch:{ URISyntaxException -> 0x0012 }
            r2.<init>(r1)     // Catch:{ URISyntaxException -> 0x0012 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ URISyntaxException -> 0x0012 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ URISyntaxException -> 0x0012 }
            com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie r0 = com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie.decode(r0)     // Catch:{ URISyntaxException -> 0x0012 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r1 = r4.f27693a     // Catch:{ URISyntaxException -> 0x0012 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ URISyntaxException -> 0x0012 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ URISyntaxException -> 0x0012 }
            if (r1 != 0) goto L_0x0051
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ URISyntaxException -> 0x0012 }
            r1.<init>()     // Catch:{ URISyntaxException -> 0x0012 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie>> r3 = r4.f27693a     // Catch:{ URISyntaxException -> 0x0012 }
            r3.put(r2, r1)     // Catch:{ URISyntaxException -> 0x0012 }
        L_0x0051:
            if (r0 == 0) goto L_0x0012
            r1.add(r0)     // Catch:{ URISyntaxException -> 0x0012 }
            goto L_0x0012
        L_0x0057:
            if (r6 == 0) goto L_0x0061
            com.bytedance.frameworks.baselib.network.http.impl.f$1 r5 = new com.bytedance.frameworks.baselib.network.http.impl.f$1     // Catch:{ Throwable -> 0x0063 }
            r5.<init>()     // Catch:{ Throwable -> 0x0063 }
            com.bytedance.common.utility.p254b.C6304f.submitRunnable(r5)     // Catch:{ Throwable -> 0x0063 }
        L_0x0061:
            monitor-exit(r4)
            return
        L_0x0063:
            monitor-exit(r4)
            return
        L_0x0065:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0068:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.C10166f.mo24846a(java.util.Map, boolean):void");
    }
}
