package com.bytedance.ttnet.retrofit;

import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor;
import com.bytedance.frameworks.baselib.network.http.util.C10190j;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;

public final class SsInterceptor extends BaseSsInterceptor {
    /* JADX WARNING: Can't wrap try/catch for region: R(12:3|(1:5)|6|7|(1:9)|10|(2:12|(4:15|(2:17|27)(1:26)|25|13))|18|19|(1:21)|22|24) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0059 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[Catch:{ Throwable -> 0x006d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.p637a.C12462c mo24871a(com.bytedance.retrofit2.p637a.C12462c r7) {
        /*
            r6 = this;
            com.bytedance.retrofit2.a.c r7 = super.mo24871a(r7)
            if (r7 != 0) goto L_0x0007
            return r7
        L_0x0007:
            com.bytedance.retrofit2.a.c$a r0 = r7.mo30443a()
            java.lang.String r1 = r7.f33098b
            java.lang.String r1 = m37886a(r1)
            r0.mo30447a(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<com.bytedance.retrofit2.a.b> r3 = r7.f33099c
            if (r3 == 0) goto L_0x0022
            java.util.List<com.bytedance.retrofit2.a.b> r7 = r7.f33099c
            r2.addAll(r7)
        L_0x0022:
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ Throwable -> 0x0059 }
            r7.<init>()     // Catch:{ Throwable -> 0x0059 }
            java.lang.String r3 = com.bytedance.frameworks.core.encrypt.C6367a.m19792a(r1, r7)     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x0030
            r0.mo30447a(r3)     // Catch:{ Throwable -> 0x0059 }
        L_0x0030:
            boolean r3 = r7.isEmpty()     // Catch:{ Throwable -> 0x0059 }
            if (r3 != 0) goto L_0x0059
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Throwable -> 0x0059 }
        L_0x003a:
            boolean r3 = r7.hasNext()     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r7.next()     // Catch:{ Throwable -> 0x0059 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x003a
            com.bytedance.retrofit2.a.b r4 = new com.bytedance.retrofit2.a.b     // Catch:{ Throwable -> 0x0059 }
            java.lang.Object r5 = r3.first     // Catch:{ Throwable -> 0x0059 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0059 }
            java.lang.Object r3 = r3.second     // Catch:{ Throwable -> 0x0059 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0059 }
            r4.<init>(r5, r3)     // Catch:{ Throwable -> 0x0059 }
            r2.add(r4)     // Catch:{ Throwable -> 0x0059 }
            goto L_0x003a
        L_0x0059:
            java.lang.String r7 = com.bytedance.ttnet.utils.C13003f.m37947a(r1)     // Catch:{ Throwable -> 0x006d }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Throwable -> 0x006d }
            if (r3 != 0) goto L_0x006d
            com.bytedance.retrofit2.a.b r3 = new com.bytedance.retrofit2.a.b     // Catch:{ Throwable -> 0x006d }
            java.lang.String r4 = "X-SS-REQ-TICKET"
            r3.<init>(r4, r7)     // Catch:{ Throwable -> 0x006d }
            r2.add(r3)     // Catch:{ Throwable -> 0x006d }
        L_0x006d:
            com.bytedance.ttnet.utils.C12994a.m37914a(r1, r2)
            r0.mo30448a(r2)
            com.bytedance.retrofit2.a.c r7 = r0.mo30449a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.retrofit.SsInterceptor.mo24871a(com.bytedance.retrofit2.a.c):com.bytedance.retrofit2.a.c");
    }

    /* renamed from: a */
    private static String m37886a(String str) {
        if (C6319n.m19593a(str)) {
            return str;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair b = C10191k.m30273b(str, linkedHashMap);
            if (!linkedHashMap.isEmpty()) {
                for (Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        List list = (List) entry.getValue();
                        if (list != null && !list.isEmpty()) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str2 = (String) it.next();
                                if (linkedHashSet.contains(str2)) {
                                    it.remove();
                                } else {
                                    linkedHashSet.add(str2);
                                }
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append((String) b.first);
            sb.append((String) b.second);
            C10190j jVar = new C10190j(sb.toString());
            if (!linkedHashMap.isEmpty()) {
                for (Entry entry2 : linkedHashMap.entrySet()) {
                    if (!(entry2 == null || entry2.getKey() == null)) {
                        List<String> list2 = (List) entry2.getValue();
                        if (list2 != null && !list2.isEmpty()) {
                            for (String a : list2) {
                                jVar.mo24890a((String) entry2.getKey(), a);
                            }
                        }
                    }
                }
            }
            return jVar.mo24886a();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:60|61|62|(1:64)|65|66|(1:68)|69|(1:71)|72|(1:74)|75) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0120 */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0128 A[Catch:{ Throwable -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0133 A[Catch:{ Throwable -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0147 A[Catch:{ Throwable -> 0x015e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24872a(com.bytedance.retrofit2.p637a.C12462c r18, com.bytedance.retrofit2.C12534t r19) throws java.lang.Exception {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            super.mo24872a(r18, r19)
            if (r0 == 0) goto L_0x015f
            if (r1 != 0) goto L_0x000d
            goto L_0x015f
        L_0x000d:
            com.bytedance.retrofit2.a.d r1 = r1.f33301a
            com.bytedance.frameworks.baselib.network.http.f$f r2 = com.bytedance.frameworks.baselib.network.http.C10142f.m30125h()     // Catch:{ Throwable -> 0x004a }
            if (r2 == 0) goto L_0x004a
            com.bytedance.frameworks.baselib.network.http.f$f r2 = com.bytedance.frameworks.baselib.network.http.C10142f.m30125h()     // Catch:{ Throwable -> 0x004a }
            java.lang.String r2 = r2.mo24811a()     // Catch:{ Throwable -> 0x004a }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Throwable -> 0x004a }
            if (r3 != 0) goto L_0x004a
            java.util.List r2 = r1.mo30452b(r2)     // Catch:{ Throwable -> 0x004a }
            if (r2 == 0) goto L_0x004a
            int r3 = r2.size()     // Catch:{ Throwable -> 0x004a }
            if (r3 <= 0) goto L_0x004a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x004a }
            r3.<init>()     // Catch:{ Throwable -> 0x004a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x004a }
        L_0x0038:
            boolean r4 = r2.hasNext()     // Catch:{ Throwable -> 0x004a }
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r2.next()     // Catch:{ Throwable -> 0x004a }
            com.bytedance.retrofit2.a.b r4 = (com.bytedance.retrofit2.p637a.C12461b) r4     // Catch:{ Throwable -> 0x004a }
            java.lang.String r4 = r4.f33096b     // Catch:{ Throwable -> 0x004a }
            r3.add(r4)     // Catch:{ Throwable -> 0x004a }
            goto L_0x0038
        L_0x004a:
            r2 = 0
            java.lang.Object r3 = r1.f33123f
            boolean r4 = r3 instanceof com.bytedance.ttnet.p671c.C12955b
            r5 = 0
            if (r4 == 0) goto L_0x00a2
            r2 = r3
            com.bytedance.ttnet.c.b r2 = (com.bytedance.ttnet.p671c.C12955b) r2
            com.bytedance.frameworks.baselib.network.http.c r3 = r2.f27499b
            if (r3 == 0) goto L_0x00a2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.util.List<com.bytedance.retrofit2.a.b> r4 = r1.f33121d
            r6 = 0
        L_0x0061:
            int r7 = r4.size()
            if (r6 >= r7) goto L_0x0086
            java.lang.Object r7 = r4.get(r6)     // Catch:{ Exception -> 0x0083 }
            com.bytedance.retrofit2.a.b r7 = (com.bytedance.retrofit2.p637a.C12461b) r7     // Catch:{ Exception -> 0x0083 }
            if (r7 == 0) goto L_0x0083
            java.lang.String r8 = r7.f33095a     // Catch:{ Exception -> 0x0083 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0083 }
            if (r8 == 0) goto L_0x0078
            goto L_0x0083
        L_0x0078:
            java.lang.String r8 = r7.f33095a     // Catch:{ Exception -> 0x0083 }
            java.lang.String r8 = r8.toUpperCase()     // Catch:{ Exception -> 0x0083 }
            java.lang.String r7 = r7.f33096b     // Catch:{ Exception -> 0x0083 }
            r3.put(r8, r7)     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            int r6 = r6 + 1
            goto L_0x0061
        L_0x0086:
            com.bytedance.frameworks.baselib.network.http.c r4 = r2.f27499b
            boolean r4 = r4 instanceof com.bytedance.ttnet.p671c.C12960e
            if (r4 == 0) goto L_0x0092
            com.bytedance.frameworks.baselib.network.http.c r4 = r2.f27499b
            com.bytedance.ttnet.c.e r4 = (com.bytedance.ttnet.p671c.C12960e) r4
            r4.f34309r = r3
        L_0x0092:
            com.bytedance.frameworks.baselib.network.http.c r3 = r2.f27499b
            com.bytedance.ttnet.c.e r3 = (com.bytedance.ttnet.p671c.C12960e) r3
            int r4 = r1.f33119b
            r3.f27553b = r4
            com.bytedance.frameworks.baselib.network.http.c r3 = r2.f27499b
            com.bytedance.ttnet.c.e r3 = (com.bytedance.ttnet.p671c.C12960e) r3
            java.lang.String r4 = r2.f27498a
            r3.f27552a = r4
        L_0x00a2:
            java.lang.String r3 = "X-SS-REQ-TICKET"
            r0.mo30442a(r3)     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r3 = "X-SS-REQ-TICKET"
            r1.mo30450a(r3)     // Catch:{ Throwable -> 0x00ac }
        L_0x00ac:
            com.bytedance.ttnet.utils.C12994a.m37913a(r0, r1, r2)
            java.lang.String r0 = r0.f33098b     // Catch:{ Throwable -> 0x015e }
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch:{ Throwable -> 0x015e }
            java.lang.String r4 = r3.getHost()     // Catch:{ Throwable -> 0x015e }
            java.lang.String r6 = com.bytedance.ttnet.C12924a.m37623b()     // Catch:{ Throwable -> 0x015e }
            boolean r4 = r4.endsWith(r6)     // Catch:{ Throwable -> 0x015e }
            if (r4 != 0) goto L_0x00c4
            return
        L_0x00c4:
            r4 = 1
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x015e }
            java.lang.String r7 = "Set-Cookie"
            r6[r5] = r7     // Catch:{ Throwable -> 0x015e }
            r7 = 2
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ Throwable -> 0x015e }
            java.lang.String r9 = "sessionid"
            r8[r5] = r9     // Catch:{ Throwable -> 0x015e }
            java.lang.String r9 = "tt_sessionid"
            r8[r4] = r9     // Catch:{ Throwable -> 0x015e }
            r4 = 0
        L_0x00d7:
            if (r4 > 0) goto L_0x015d
            r9 = r6[r4]     // Catch:{ Throwable -> 0x015e }
            java.util.List r9 = r1.mo30452b(r9)     // Catch:{ Throwable -> 0x015e }
            if (r9 == 0) goto L_0x0158
            int r10 = r9.size()     // Catch:{ Throwable -> 0x015e }
            if (r10 <= 0) goto L_0x0158
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Throwable -> 0x015e }
        L_0x00eb:
            boolean r10 = r9.hasNext()     // Catch:{ Throwable -> 0x015e }
            if (r10 == 0) goto L_0x0158
            java.lang.Object r10 = r9.next()     // Catch:{ Throwable -> 0x015e }
            com.bytedance.retrofit2.a.b r10 = (com.bytedance.retrofit2.p637a.C12461b) r10     // Catch:{ Throwable -> 0x015e }
            r11 = 0
        L_0x00f8:
            if (r11 >= r7) goto L_0x00eb
            r12 = r8[r11]     // Catch:{ Throwable -> 0x015e }
            java.lang.String r13 = r10.f33096b     // Catch:{ Throwable -> 0x015e }
            java.lang.String r12 = com.bytedance.frameworks.baselib.network.http.parser.C10172a.m30211a(r13, r12)     // Catch:{ Throwable -> 0x015e }
            boolean r12 = com.bytedance.common.utility.C6319n.m19593a(r12)     // Catch:{ Throwable -> 0x015e }
            if (r12 != 0) goto L_0x0154
            int r12 = r1.f33119b     // Catch:{ Throwable -> 0x015e }
            boolean r13 = r2.f34300A     // Catch:{ Throwable -> 0x015e }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Throwable -> 0x015e }
            r14.<init>()     // Catch:{ Throwable -> 0x015e }
            java.lang.String r15 = r3.getEncodedQuery()     // Catch:{ Throwable -> 0x0120 }
            boolean r16 = com.bytedance.common.utility.C6319n.m19593a(r15)     // Catch:{ Throwable -> 0x0120 }
            if (r16 != 0) goto L_0x0120
            java.lang.String r7 = "url_query"
            r14.put(r7, r15)     // Catch:{ Throwable -> 0x0120 }
        L_0x0120:
            java.lang.String r7 = r2.f27498a     // Catch:{ Throwable -> 0x015e }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Throwable -> 0x015e }
            if (r7 != 0) goto L_0x012f
            java.lang.String r7 = "remote_ip"
            java.lang.String r15 = r2.f27498a     // Catch:{ Throwable -> 0x015e }
            r14.put(r7, r15)     // Catch:{ Throwable -> 0x015e }
        L_0x012f:
            java.util.List<com.bytedance.retrofit2.a.b> r7 = r1.f33121d     // Catch:{ Throwable -> 0x015e }
            if (r7 == 0) goto L_0x013e
            java.lang.String r7 = "header_list"
            java.util.List<com.bytedance.retrofit2.a.b> r15 = r1.f33121d     // Catch:{ Throwable -> 0x015e }
            java.lang.String r15 = r15.toString()     // Catch:{ Throwable -> 0x015e }
            r14.put(r7, r15)     // Catch:{ Throwable -> 0x015e }
        L_0x013e:
            java.lang.String r7 = "?"
            int r7 = r0.indexOf(r7)     // Catch:{ Throwable -> 0x015e }
            r15 = -1
            if (r7 != r15) goto L_0x014b
            int r7 = r0.length()     // Catch:{ Throwable -> 0x015e }
        L_0x014b:
            java.lang.String r7 = r0.substring(r5, r7)     // Catch:{ Throwable -> 0x015e }
            java.lang.String r15 = "set_cookie"
            com.bytedance.ttnet.utils.C13003f.m37949a(r15, r7, r12, r13, r14)     // Catch:{ Throwable -> 0x015e }
        L_0x0154:
            int r11 = r11 + 1
            r7 = 2
            goto L_0x00f8
        L_0x0158:
            int r4 = r4 + 1
            r7 = 2
            goto L_0x00d7
        L_0x015d:
            return
        L_0x015e:
            return
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.retrofit.SsInterceptor.mo24872a(com.bytedance.retrofit2.a.c, com.bytedance.retrofit2.t):void");
    }
}
