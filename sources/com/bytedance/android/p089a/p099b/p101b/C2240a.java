package com.bytedance.android.p089a.p099b.p101b;

import com.bytedance.android.p089a.p090a.p095e.C2222b;
import com.bytedance.android.p089a.p099b.C2236a;
import com.bytedance.android.p089a.p099b.p101b.C2249c.C2250a;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2242a;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2244b;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2244b.C2245a;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2246c;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.b.a */
public final class C2240a {

    /* renamed from: a */
    private final C2236a f7495a;

    /* renamed from: b */
    private final C2246c f7496b;

    /* renamed from: a */
    private static C2242a m9638a(C2236a aVar) {
        return new C2242a(aVar) {
            /* renamed from: a */
            public final C2251d mo7978a(C2245a aVar) {
                return C2240a.m9639a(aVar.mo7981a());
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0 A[SYNTHETIC, Splitter:B:58:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f5 A[SYNTHETIC, Splitter:B:66:0x00f5] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x00da=Splitter:B:55:0x00da, B:44:0x00bd=Splitter:B:44:0x00bd} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.android.p089a.p099b.p101b.C2251d m9639a(com.bytedance.android.p089a.p099b.p101b.C2249c r12) {
        /*
            if (r12 != 0) goto L_0x000d
            java.lang.String r12 = "request is null"
            java.lang.IllegalArgumentException r12 = com.bytedance.android.p089a.p090a.p098h.C2232c.m9606a(r12)
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p089a.p099b.p101b.C2251d.m9665a(r12)
            return r12
        L_0x000d:
            java.lang.String r0 = r12.f7503b
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r12.f7505d
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0022
            java.lang.String r12 = "empty url"
            java.lang.IllegalArgumentException r12 = com.bytedance.android.p089a.p090a.p098h.C2232c.m9606a(r12)
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p089a.p099b.p101b.C2251d.m9665a(r12)
            return r12
        L_0x0022:
            r2 = 0
            r3 = 19
            r4 = 1
            r5 = 0
            java.net.URL r6 = new java.net.URL     // Catch:{ SecurityException -> 0x00d9, IOException -> 0x00bc }
            r6.<init>(r0)     // Catch:{ SecurityException -> 0x00d9, IOException -> 0x00bc }
            java.net.URLConnection r0 = r6.openConnection()     // Catch:{ SecurityException -> 0x00d9, IOException -> 0x00bc }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ SecurityException -> 0x00d9, IOException -> 0x00bc }
            java.lang.String r2 = r12.f7504c     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            r0.setRequestMethod(r2)     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            if (r1 == 0) goto L_0x0082
            java.util.Set r2 = r1.keySet()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
        L_0x0041:
            boolean r6 = r2.hasNext()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            if (r6 == 0) goto L_0x0082
            java.lang.Object r6 = r2.next()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.Object r7 = r1.get(r6)     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            if (r7 == 0) goto L_0x0041
            int r8 = r7.size()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            if (r8 == 0) goto L_0x0041
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            r8.<init>()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
        L_0x0064:
            boolean r9 = r7.hasNext()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            if (r9 == 0) goto L_0x0074
            java.lang.Object r9 = r7.next()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            r8.append(r9)     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            goto L_0x0064
        L_0x0074:
            java.lang.String r7 = r8.toString()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            if (r8 != 0) goto L_0x0041
            com.bytedance.android.p089a.p099b.p101b.C2248b.m9658a(r0, r6, r7)     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            goto L_0x0041
        L_0x0082:
            android.net.TrafficStats.setThreadStatsTag(r5)     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            r0.connect()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            int r7 = r0.getResponseCode()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            java.lang.String r8 = r0.getResponseMessage()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            java.util.Map r9 = r0.getHeaderFields()     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            com.bytedance.android.a.b.b.d r1 = new com.bytedance.android.a.b.b.d     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            r11 = 0
            r6 = r1
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ SecurityException -> 0x00b6, IOException -> 0x00b3, all -> 0x00b1 }
            if (r0 == 0) goto L_0x00b0
            java.io.Closeable[] r12 = new java.io.Closeable[r4]     // Catch:{ IOException -> 0x00a9 }
            java.io.InputStream r2 = com.bytedance.android.p089a.p099b.p101b.C2248b.m9657a(r0)     // Catch:{ IOException -> 0x00a9 }
            r12[r5] = r2     // Catch:{ IOException -> 0x00a9 }
            com.bytedance.android.p089a.p090a.p098h.C2235f.m9615a(r12)     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r3) goto L_0x00b0
            r0.disconnect()
        L_0x00b0:
            return r1
        L_0x00b1:
            r12 = move-exception
            goto L_0x00f3
        L_0x00b3:
            r1 = move-exception
            r2 = r0
            goto L_0x00bd
        L_0x00b6:
            r1 = move-exception
            r2 = r0
            goto L_0x00da
        L_0x00b9:
            r12 = move-exception
            r0 = r2
            goto L_0x00f3
        L_0x00bc:
            r1 = move-exception
        L_0x00bd:
            r1.getMessage()     // Catch:{ all -> 0x00b9 }
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p089a.p099b.p101b.C2251d.m9666a(r1, r12)     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00d8
            java.io.Closeable[] r0 = new java.io.Closeable[r4]     // Catch:{ IOException -> 0x00d1 }
            java.io.InputStream r1 = com.bytedance.android.p089a.p099b.p101b.C2248b.m9657a(r2)     // Catch:{ IOException -> 0x00d1 }
            r0[r5] = r1     // Catch:{ IOException -> 0x00d1 }
            com.bytedance.android.p089a.p090a.p098h.C2235f.m9615a(r0)     // Catch:{ IOException -> 0x00d1 }
        L_0x00d1:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x00d8
            r2.disconnect()
        L_0x00d8:
            return r12
        L_0x00d9:
            r1 = move-exception
        L_0x00da:
            com.bytedance.android.a.b.b.d r12 = com.bytedance.android.p089a.p099b.p101b.C2251d.m9666a(r1, r12)     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00f2
            java.io.Closeable[] r0 = new java.io.Closeable[r4]     // Catch:{ IOException -> 0x00eb }
            java.io.InputStream r1 = com.bytedance.android.p089a.p099b.p101b.C2248b.m9657a(r2)     // Catch:{ IOException -> 0x00eb }
            r0[r5] = r1     // Catch:{ IOException -> 0x00eb }
            com.bytedance.android.p089a.p090a.p098h.C2235f.m9615a(r0)     // Catch:{ IOException -> 0x00eb }
        L_0x00eb:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x00f2
            r2.disconnect()
        L_0x00f2:
            return r12
        L_0x00f3:
            if (r0 == 0) goto L_0x0107
            java.io.Closeable[] r1 = new java.io.Closeable[r4]     // Catch:{ IOException -> 0x0100 }
            java.io.InputStream r2 = com.bytedance.android.p089a.p099b.p101b.C2248b.m9657a(r0)     // Catch:{ IOException -> 0x0100 }
            r1[r5] = r2     // Catch:{ IOException -> 0x0100 }
            com.bytedance.android.p089a.p090a.p098h.C2235f.m9615a(r1)     // Catch:{ IOException -> 0x0100 }
        L_0x0100:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 >= r3) goto L_0x0107
            r0.disconnect()
        L_0x0107:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p089a.p099b.p101b.C2240a.m9639a(com.bytedance.android.a.b.b.c):com.bytedance.android.a.b.b.d");
    }

    public C2240a(C2236a aVar, List<C2244b> list) {
        this.f7495a = aVar;
        this.f7496b = new C2246c(this.f7495a, m9638a(aVar));
        if (list != null) {
            this.f7496b.mo7983a(list);
        }
    }

    /* renamed from: a */
    public final C2251d mo7977a(String str, C2222b bVar) {
        return this.f7496b.mo7982a(new C2250a().mo7985a(str).mo7988b("GET").mo7984a(bVar).mo7987a());
    }
}
