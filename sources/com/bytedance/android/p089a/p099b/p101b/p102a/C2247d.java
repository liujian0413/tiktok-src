package com.bytedance.android.p089a.p099b.p101b.p102a;

import android.util.Pair;
import com.bytedance.android.p089a.p090a.p098h.C2231b;
import com.bytedance.android.p089a.p099b.C2236a;
import com.bytedance.android.p089a.p099b.p100a.C2239a;
import com.bytedance.android.p089a.p099b.p101b.C2249c;
import com.bytedance.android.p089a.p099b.p101b.C2251d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.a.b.b.a.d */
final class C2247d extends C2242a {
    C2247d(C2236a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private Pair<List<String>, Map<String, String>> m9654a(boolean z) {
        Object obj;
        C2239a aVar = this.f7497a.f7488a.f7521e;
        List a = this.f7497a.f7488a.mo7991a(z);
        if (aVar != null) {
            obj = aVar.mo7976a(a);
        } else {
            obj = new HashMap();
        }
        return new Pair<>(a, obj);
    }

    /* renamed from: a */
    public final C2251d mo7980a(C2251d dVar) {
        if (dVar == null || dVar.f7515e == null) {
            return dVar;
        }
        C2249c cVar = dVar.f7515e;
        C2231b.m9599a(cVar.f7506e, dVar.f7511a, cVar.f7503b, dVar.f7514d);
        return dVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.p089a.p099b.p101b.C2249c mo7979a(com.bytedance.android.p089a.p099b.p101b.C2249c r11) {
        /*
            r10 = this;
            com.bytedance.android.a.a.e.b r0 = r11.f7506e
            java.lang.String r1 = r11.f7503b
            long r2 = r0.f7471i     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x00ba }
            r3 = 0
            android.net.Uri r4 = android.net.Uri.parse(r1)     // Catch:{ Throwable -> 0x0014 }
            java.lang.String r4 = r4.getHost()     // Catch:{ Throwable -> 0x0014 }
            r3 = r4
        L_0x0014:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x00ba }
            if (r4 != 0) goto L_0x0097
            com.bytedance.android.a.b.a r4 = r10.f7497a     // Catch:{ Throwable -> 0x00ba }
            com.bytedance.android.a.b.c.a r4 = r4.f7488a     // Catch:{ Throwable -> 0x00ba }
            java.util.List r4 = r4.mo7990a()     // Catch:{ Throwable -> 0x00ba }
            boolean r3 = r4.contains(r3)     // Catch:{ Throwable -> 0x00ba }
            if (r3 != 0) goto L_0x0097
            java.lang.String r3 = "{TS}"
            boolean r3 = r1.contains(r3)     // Catch:{ Throwable -> 0x00ba }
            if (r3 != 0) goto L_0x0038
            java.lang.String r3 = "__TS__"
            boolean r3 = r1.contains(r3)     // Catch:{ Throwable -> 0x00ba }
            if (r3 == 0) goto L_0x0044
        L_0x0038:
            java.lang.String r3 = "{TS}"
            java.lang.String r3 = r1.replace(r3, r2)     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r1 = "__TS__"
            java.lang.String r1 = r3.replace(r1, r2)     // Catch:{ Throwable -> 0x0094 }
        L_0x0044:
            boolean r3 = r0.f7466d     // Catch:{ Throwable -> 0x00ba }
            android.util.Pair r3 = r10.m9654a(r3)     // Catch:{ Throwable -> 0x00ba }
            java.lang.Object r4 = r3.first     // Catch:{ Throwable -> 0x00ba }
            java.util.List r4 = (java.util.List) r4     // Catch:{ Throwable -> 0x00ba }
            java.lang.Object r3 = r3.second     // Catch:{ Throwable -> 0x00ba }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ Throwable -> 0x00ba }
            java.util.Set r5 = r3.keySet()     // Catch:{ Throwable -> 0x00ba }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x00ba }
        L_0x005a:
            boolean r6 = r5.hasNext()     // Catch:{ Throwable -> 0x00ba }
            if (r6 == 0) goto L_0x007a
            java.lang.Object r6 = r5.next()     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x00ba }
            java.lang.Object r7 = r3.get(r6)     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x00ba }
            boolean r8 = r1.contains(r6)     // Catch:{ Throwable -> 0x00ba }
            if (r8 == 0) goto L_0x005a
            if (r7 == 0) goto L_0x005a
            java.lang.String r6 = r1.replace(r6, r7)     // Catch:{ Throwable -> 0x00ba }
            r1 = r6
            goto L_0x005a
        L_0x007a:
            java.util.Set r5 = r3.keySet()     // Catch:{ Throwable -> 0x00ba }
            boolean r5 = r5.containsAll(r4)     // Catch:{ Throwable -> 0x00ba }
            if (r5 != 0) goto L_0x009b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00ba }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x00ba }
            java.util.Set r3 = r3.keySet()     // Catch:{ Throwable -> 0x00ba }
            r5.removeAll(r3)     // Catch:{ Throwable -> 0x00ba }
            com.bytedance.android.p089a.p090a.p098h.C2231b.m9600a(r0, r5)     // Catch:{ Throwable -> 0x00ba }
            goto L_0x009b
        L_0x0094:
            r0 = move-exception
            r1 = r3
            goto L_0x00bb
        L_0x0097:
            r3 = 2
            com.bytedance.android.p089a.p090a.p098h.C2231b.m9598a(r0, r3)     // Catch:{ Throwable -> 0x00ba }
        L_0x009b:
            java.util.Random r0 = new java.util.Random     // Catch:{ Throwable -> 0x00ba }
            r0.<init>()     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r3 = "[ss_random]"
            long r4 = r0.nextLong()     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r0 = r1.replace(r3, r0)     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r1 = "[ss_timestamp]"
            java.lang.String r1 = r0.replace(r1, r2)     // Catch:{ Throwable -> 0x00b5 }
            goto L_0x00be
        L_0x00b5:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x00bb
        L_0x00ba:
            r0 = move-exception
        L_0x00bb:
            r0.getMessage()
        L_0x00be:
            com.bytedance.android.a.b.b.c$a r11 = r11.f7502a
            java.lang.String r0 = "User-Agent"
            com.bytedance.android.a.a.d r2 = com.bytedance.android.p089a.p090a.C2219d.m9560c()
            com.bytedance.android.a.a.f.a r2 = r2.f7458c
            java.lang.String r2 = r2.f7478d
            com.bytedance.android.a.b.b.c$a r11 = r11.mo7986a(r0, r2)
            com.bytedance.android.a.b.b.c$a r11 = r11.mo7985a(r1)
            com.bytedance.android.a.b.b.c r11 = r11.mo7987a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p089a.p099b.p101b.p102a.C2247d.mo7979a(com.bytedance.android.a.b.b.c):com.bytedance.android.a.b.b.c");
    }
}
