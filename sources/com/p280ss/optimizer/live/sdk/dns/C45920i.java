package com.p280ss.optimizer.live.sdk.dns;

import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* renamed from: com.ss.optimizer.live.sdk.dns.i */
final class C45920i implements Callable<C45919h> {

    /* renamed from: a */
    private static Pattern f117382a;

    /* renamed from: b */
    private final String f117383b;

    /* renamed from: c */
    private final int f117384c = 10;

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e A[SYNTHETIC, Splitter:B:37:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5 A[SYNTHETIC, Splitter:B:41:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ad A[SYNTHETIC, Splitter:B:48:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4 A[SYNTHETIC, Splitter:B:52:0x00b4] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p280ss.optimizer.live.sdk.dns.C45919h call() throws java.lang.Exception {
        /*
            r13 = this;
            int r0 = r13.f117384c
            r1 = 0
            if (r0 != 0) goto L_0x000f
            com.ss.optimizer.live.sdk.dns.h r0 = new com.ss.optimizer.live.sdk.dns.h
            java.lang.String r2 = r13.f117383b
            int r3 = r13.f117384c
            r0.<init>(r2, r1, r3)
            return r0
        L_0x000f:
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            java.lang.String r2 = "ping -c %1$d %2$s"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            r5 = 0
            int r6 = r13.f117384c     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            r4[r5] = r6     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            java.lang.String r5 = r13.f117383b     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            r6 = 1
            r4[r6] = r5     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            java.lang.String r0 = com.C1642a.m8035a(r0, r2, r4)     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            java.lang.Process r0 = r2.exec(r0)     // Catch:{ Throwable -> 0x00a9, all -> 0x0098 }
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ Throwable -> 0x0096, all -> 0x0091 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            r5.<init>(r2)     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            r5.<init>()     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
        L_0x0043:
            java.lang.String r7 = r4.readLine()     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            if (r7 == 0) goto L_0x0077
            java.util.regex.Pattern r8 = f117382a     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            java.util.regex.Matcher r7 = r8.matcher(r7)     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            boolean r8 = r7.matches()     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            if (r8 == 0) goto L_0x0043
            java.lang.String r8 = r7.group(r6)     // Catch:{ Exception -> 0x0043 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r9 = r7.group(r3)     // Catch:{ Exception -> 0x0043 }
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x0043 }
            r11 = 3
            java.lang.String r7 = r7.group(r11)     // Catch:{ Exception -> 0x0043 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ Exception -> 0x0043 }
            com.ss.optimizer.live.sdk.dns.a.a r11 = new com.ss.optimizer.live.sdk.dns.a.a     // Catch:{ Exception -> 0x0043 }
            r11.<init>(r8, r9, r7)     // Catch:{ Exception -> 0x0043 }
            r5.add(r11)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0043
        L_0x0077:
            com.ss.optimizer.live.sdk.dns.h r3 = new com.ss.optimizer.live.sdk.dns.h     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            java.lang.String r4 = r13.f117383b     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            int r6 = r13.f117384c     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            r3.<init>(r4, r5, r6)     // Catch:{ Throwable -> 0x008f, all -> 0x008d }
            if (r2 == 0) goto L_0x0087
            r2.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            r0.destroy()     // Catch:{ Throwable -> 0x008c }
        L_0x008c:
            return r3
        L_0x008d:
            r1 = move-exception
            goto L_0x009c
        L_0x008f:
            goto L_0x00ab
        L_0x0091:
            r2 = move-exception
            r12 = r2
            r2 = r1
            r1 = r12
            goto L_0x009c
        L_0x0096:
            r2 = r1
            goto L_0x00ab
        L_0x0098:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L_0x009c:
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a3
        L_0x00a2:
        L_0x00a3:
            if (r0 == 0) goto L_0x00a8
            r0.destroy()     // Catch:{ Throwable -> 0x00a8 }
        L_0x00a8:
            throw r1
        L_0x00a9:
            r0 = r1
            r2 = r0
        L_0x00ab:
            if (r2 == 0) goto L_0x00b2
            r2.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            if (r0 == 0) goto L_0x00b7
            r0.destroy()     // Catch:{ Throwable -> 0x00b7 }
        L_0x00b7:
            com.ss.optimizer.live.sdk.dns.h r0 = new com.ss.optimizer.live.sdk.dns.h
            java.lang.String r2 = r13.f117383b
            int r3 = r13.f117384c
            r0.<init>(r2, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.optimizer.live.sdk.dns.C45920i.call():com.ss.optimizer.live.sdk.dns.h");
    }

    C45920i(String str, int i) {
        this.f117383b = str;
        if (f117382a == null) {
            f117382a = Pattern.compile(".*?icmp_seq=(\\d+).*?ttl=(\\d+).*?time=([\\d^\\.]+|[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*).*?ms");
        }
    }
}
