package com.bytedance.frameworks.baselib.network.http.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C9714c;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10150h;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.h */
public final class C10169h extends CookieManager {

    /* renamed from: a */
    public static boolean f27696a;

    /* renamed from: f */
    private static boolean f27697f;

    /* renamed from: b */
    public volatile C10156a f27698b;

    /* renamed from: c */
    private final android.webkit.CookieManager f27699c;

    /* renamed from: d */
    private Pattern f27700d = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    /* renamed from: e */
    private final C10171a f27701e;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.impl.h$a */
    public interface C10171a {
    }

    /* renamed from: a */
    private static List<String> m30208a(Map<String, List<String>> map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            list = (List) map.get(str.toLowerCase());
        }
        return list;
    }

    /* renamed from: a */
    private Map<String, List<String>> m30209a(List<String> list, Map<String, List<String>> map) {
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        if (f27696a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                List a = m30208a(map, "Cookie");
                if (a == null || a.isEmpty()) {
                    linkedHashMap.put("Cookie", list);
                }
            } else {
                linkedHashMap.put("Cookie", list);
            }
            if (map != null) {
                List a2 = m30208a(map, "X-SS-Cookie");
                if (a2 != null && !a2.isEmpty()) {
                    return linkedHashMap;
                }
                linkedHashMap.put("X-SS-Cookie", list);
                return linkedHashMap;
            }
            linkedHashMap.put("X-SS-Cookie", list);
            return linkedHashMap;
        } else if (map == null) {
            return Collections.singletonMap("Cookie", list);
        } else {
            List a3 = m30208a(map, "Cookie");
            if (a3 == null || a3.isEmpty()) {
                return Collections.singletonMap("Cookie", list);
            }
            return emptyMap;
        }
    }

    /* renamed from: a */
    private boolean m30210a(URI uri, String str) {
        if (uri == null || C6319n.m19593a(str)) {
            return false;
        }
        try {
            String lowerCase = uri.getHost().toLowerCase();
            String str2 = "";
            Matcher matcher = this.f27700d.matcher(str);
            if (matcher.find()) {
                str2 = matcher.group().toLowerCase();
            }
            if (TextUtils.isEmpty(str2) || !lowerCase.endsWith(str2)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0090 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0094 A[Catch:{ Throwable -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009a A[Catch:{ Throwable -> 0x00b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> get(java.net.URI r5, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r5.toString()     // Catch:{ Throwable -> 0x004f }
            if (r6 == 0) goto L_0x002c
            java.lang.String r2 = "X-SS-No-Cookie"
            java.util.List r2 = m30208a(r6, r2)     // Catch:{ Throwable -> 0x0050 }
            if (r2 == 0) goto L_0x002c
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x0050 }
        L_0x0013:
            boolean r3 = r2.hasNext()     // Catch:{ Throwable -> 0x0050 }
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0050 }
            if (r3 == 0) goto L_0x0013
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ Throwable -> 0x0050 }
            if (r3 == 0) goto L_0x0013
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ Throwable -> 0x0050 }
            return r2
        L_0x002c:
            com.bytedance.frameworks.baselib.network.http.f$d r2 = com.bytedance.frameworks.baselib.network.http.C10142f.m30130m()     // Catch:{ Throwable -> 0x0050 }
            if (r2 == 0) goto L_0x0050
            java.util.Map r2 = r2.mo24809a(r5, r6)     // Catch:{ Throwable -> 0x0050 }
            if (r2 == 0) goto L_0x0050
            boolean r3 = r2.isEmpty()     // Catch:{ Throwable -> 0x0050 }
            if (r3 != 0) goto L_0x0050
            java.lang.String r3 = "Cookie"
            boolean r3 = r2.containsKey(r3)     // Catch:{ Throwable -> 0x0050 }
            if (r3 != 0) goto L_0x004e
            java.lang.String r3 = "X-SS-Cookie"
            boolean r3 = r2.containsKey(r3)     // Catch:{ Throwable -> 0x0050 }
            if (r3 == 0) goto L_0x0050
        L_0x004e:
            return r2
        L_0x004f:
            r1 = r0
        L_0x0050:
            if (r5 == 0) goto L_0x00b9
            android.webkit.CookieManager r2 = r4.f27699c
            if (r2 != 0) goto L_0x0057
            goto L_0x00b9
        L_0x0057:
            com.bytedance.frameworks.baselib.network.http.f$h r2 = com.bytedance.frameworks.baselib.network.http.C10142f.m30129l()     // Catch:{ Throwable -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            boolean r3 = f27697f     // Catch:{ Throwable -> 0x0075 }
            if (r3 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            android.webkit.CookieManager r0 = r4.f27699c     // Catch:{ Throwable -> 0x0075 }
        L_0x0064:
            com.bytedance.frameworks.baselib.network.http.impl.a r3 = r4.f27698b     // Catch:{ Throwable -> 0x0075 }
            java.util.List r0 = r2.mo24813a(r0, r3, r5)     // Catch:{ Throwable -> 0x0075 }
            boolean r2 = com.bytedance.common.utility.C6311g.m19573a(r0)     // Catch:{ Throwable -> 0x0075 }
            if (r2 != 0) goto L_0x0075
            java.util.Map r0 = r4.m30209a(r0, r6)     // Catch:{ Throwable -> 0x0075 }
            return r0
        L_0x0075:
            boolean r0 = f27697f
            if (r0 != 0) goto L_0x0090
            android.webkit.CookieManager r0 = r4.f27699c     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r0.getCookie(r1)     // Catch:{ Exception -> 0x0090 }
            if (r0 == 0) goto L_0x0090
            int r1 = r0.length()     // Catch:{ Exception -> 0x0090 }
            if (r1 <= 0) goto L_0x0090
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ Exception -> 0x0090 }
            java.util.Map r0 = r4.m30209a(r0, r6)     // Catch:{ Exception -> 0x0090 }
            return r0
        L_0x0090:
            com.bytedance.frameworks.baselib.network.http.impl.a r0 = r4.f27698b     // Catch:{ Throwable -> 0x00b4 }
            if (r6 != 0) goto L_0x009a
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x00b4 }
            r1.<init>()     // Catch:{ Throwable -> 0x00b4 }
            goto L_0x009b
        L_0x009a:
            r1 = r6
        L_0x009b:
            java.util.Map r5 = r0.get(r5, r1)     // Catch:{ Throwable -> 0x00b4 }
            if (r5 == 0) goto L_0x00b4
            boolean r0 = r5.isEmpty()     // Catch:{ Throwable -> 0x00b4 }
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "Cookie"
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Throwable -> 0x00b4 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ Throwable -> 0x00b4 }
            java.util.Map r5 = r4.m30209a(r5, r6)     // Catch:{ Throwable -> 0x00b4 }
            return r5
        L_0x00b4:
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L_0x00b9:
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.C10169h.get(java.net.URI, java.util.Map):java.util.Map");
    }

    public final void put(URI uri, Map<String, List<String>> map) throws IOException {
        List<String> list;
        String[] strArr;
        C10150h l = C10142f.m30129l();
        if (l != null) {
            list = l.mo24814d(uri.getHost());
        } else {
            list = null;
        }
        if (!f27697f) {
            if (uri != null && map != null && this.f27699c != null) {
                String uri2 = uri.toString();
                for (String str : f27696a ? new String[]{"X-SS-Set-Cookie", "Set-Cookie"} : new String[]{"Set-Cookie"}) {
                    List<String> list2 = (List) map.get(str);
                    if (list2 == null || list2.isEmpty()) {
                        list2 = (List) map.get(str.toLowerCase());
                        if (list2 != null) {
                            if (list2.isEmpty()) {
                            }
                        }
                    }
                    for (String str2 : list2) {
                        this.f27699c.setCookie(uri2, str2);
                        try {
                            if (!C6311g.m19573a(list)) {
                                for (String str3 : list) {
                                    try {
                                        if (!C6319n.m19593a(str3)) {
                                            if (!uri.getHost().endsWith(str3)) {
                                                if (m30210a(uri, str2)) {
                                                    String replaceFirst = this.f27700d.matcher(str2).replaceFirst(str3);
                                                    if (!C6319n.m19593a(replaceFirst)) {
                                                        this.f27699c.setCookie(str3, replaceFirst);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } else {
                return;
            }
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (f27696a && map.containsKey("X-SS-Set-Cookie") && !map.containsKey("Set-Cookie")) {
                linkedHashMap.put("Set-Cookie", map.get("X-SS-Set-Cookie"));
            }
            linkedHashMap.putAll(map);
            this.f27698b.put(uri, linkedHashMap);
            if (true ^ C6311g.m19573a(list)) {
                for (String str4 : list) {
                    try {
                        if (!C6319n.m19593a(str4)) {
                            if (!uri.getHost().endsWith(str4)) {
                                List<String> list3 = (List) map.get("Set-Cookie");
                                LinkedList linkedList = new LinkedList();
                                for (String str5 : list3) {
                                    if (m30210a(uri, str5)) {
                                        String replaceFirst2 = this.f27700d.matcher(str5).replaceFirst(str4);
                                        if (!C6319n.m19593a(replaceFirst2)) {
                                            linkedList.add(replaceFirst2);
                                        }
                                    }
                                }
                                linkedHashMap.put("Set-Cookie", linkedList);
                                C10156a aVar = this.f27698b;
                                StringBuilder sb = new StringBuilder();
                                sb.append(uri.getScheme());
                                sb.append("://");
                                sb.append(str4);
                                aVar.put(URI.create(sb.toString()), linkedHashMap);
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public C10169h(final Context context, int i, android.webkit.CookieManager cookieManager, C10171a aVar) {
        if (i > 0) {
            C9714c.m28652b().schedule(new Runnable() {
                public final void run() {
                    C10169h.this.f27698b = new C10156a(new C10166f(context), C10157b.f27663a);
                }
            }, (long) i, TimeUnit.SECONDS);
        } else {
            this.f27698b = new C10156a(new C10166f(context), C10157b.f27663a);
        }
        this.f27699c = cookieManager;
        this.f27701e = aVar;
    }
}
