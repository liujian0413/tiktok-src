package com.bytedance.common.p477a;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.common.a.g */
final class C9677g implements Callable<C9670b> {

    /* renamed from: a */
    private final String f26409a;

    /* renamed from: b */
    private final Context f26410b;

    /* renamed from: c */
    private final String f26411c;

    /* renamed from: d */
    private final C9672c f26412d;

    /* renamed from: e */
    private final long f26413e;

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.bytedance.common.a.b] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.bytedance.common.a.b] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.bytedance.common.a.b] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v9
      assigns: [?[OBJECT, ARRAY], com.bytedance.common.a.b, ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.bytedance.common.a.b, java.io.InputStream]
      mth insns count: 135
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff A[SYNTHETIC, Splitter:B:51:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0104 A[Catch:{ IOException -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013d A[SYNTHETIC, Splitter:B:68:0x013d] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0142 A[Catch:{ IOException -> 0x0145 }] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.common.p477a.C9670b call() {
        /*
            r8 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            r2 = 14
            if (r1 < r2) goto L_0x000d
            r1 = 40965(0xa005, float:5.7404E-41)
            android.net.TrafficStats.setThreadStatsTag(r1)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.lang.String r2 = "http://203.107.1.4:80/"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.lang.String r2 = r8.f26411c     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            r1.append(r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.lang.String r2 = "/d?host="
            r1.append(r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.lang.String r2 = r8.f26409a     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            r1.append(r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            boolean r2 = com.bytedance.common.p477a.C9676f.m28594a()     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            if (r2 == 0) goto L_0x0030
            com.bytedance.common.p477a.C9676f.m28592a(r1)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
        L_0x0030:
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            int r2 = r1.getResponseCode()     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x0068
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            java.lang.String r3 = "response code is "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            int r3 = r1.getResponseCode()     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            r2.append(r3)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            java.lang.String r3 = " expect 200"
            r2.append(r3)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            com.bytedance.common.p477a.C9676f.m28595b(r2)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            r3 = r0
            r5 = r3
            goto L_0x00b4
        L_0x0068:
            java.io.InputStream r2 = com.bytedance.common.p477a.C9678h.m28597a(r1)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00cd, all -> 0x00c7 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00cd, all -> 0x00c7 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x00cd, all -> 0x00c7 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00cd, all -> 0x00c7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c5 }
            r4.<init>()     // Catch:{ Exception -> 0x00c5 }
        L_0x007d:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x00c5 }
            if (r5 == 0) goto L_0x0087
            r4.append(r5)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x007d
        L_0x0087:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = "resolve host: "
            r5.<init>(r6)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = r8.f26409a     // Catch:{ Exception -> 0x00c5 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = ", return: "
            r5.append(r6)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x00c5 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c5 }
            com.bytedance.common.p477a.C9676f.m28592a(r5)     // Catch:{ Exception -> 0x00c5 }
            com.bytedance.common.a.b r5 = new com.bytedance.common.a.b     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c5 }
            com.bytedance.common.a.c r6 = r8.f26412d     // Catch:{ Exception -> 0x00c5 }
            boolean r6 = r6.f26394e     // Catch:{ Exception -> 0x00c5 }
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x00c5 }
            r0 = r2
        L_0x00b4:
            if (r1 == 0) goto L_0x00b9
            r1.disconnect()
        L_0x00b9:
            if (r0 == 0) goto L_0x00be
            r0.close()     // Catch:{ IOException -> 0x00c3 }
        L_0x00be:
            if (r3 == 0) goto L_0x00c3
            r3.close()     // Catch:{ IOException -> 0x00c3 }
        L_0x00c3:
            r0 = r5
            goto L_0x0107
        L_0x00c5:
            r4 = move-exception
            goto L_0x00e7
        L_0x00c7:
            r3 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x0136
        L_0x00cd:
            r3 = move-exception
            r4 = r3
            r3 = r0
            goto L_0x00e7
        L_0x00d1:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L_0x0136
        L_0x00d7:
            r2 = move-exception
            r3 = r0
            r4 = r2
            r2 = r3
            goto L_0x00e7
        L_0x00dc:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
            goto L_0x0136
        L_0x00e2:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r4 = r1
            r1 = r3
        L_0x00e7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            java.lang.String r6 = "resolve fail: "
            r5.<init>(r6)     // Catch:{ all -> 0x0135 }
            r5.append(r4)     // Catch:{ all -> 0x0135 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0135 }
            com.bytedance.common.p477a.C9676f.m28592a(r4)     // Catch:{ all -> 0x0135 }
            if (r1 == 0) goto L_0x00fd
            r1.disconnect()
        L_0x00fd:
            if (r2 == 0) goto L_0x0102
            r2.close()     // Catch:{ IOException -> 0x0107 }
        L_0x0102:
            if (r3 == 0) goto L_0x0107
            r3.close()     // Catch:{ IOException -> 0x0107 }
        L_0x0107:
            if (r0 != 0) goto L_0x0116
            com.bytedance.common.a.b r0 = new com.bytedance.common.a.b
            java.lang.String r1 = r8.f26409a
            long r2 = r8.f26413e
            com.bytedance.common.a.c r4 = r8.f26412d
            boolean r4 = r4.f26394e
            r0.<init>(r1, r2, r4)
        L_0x0116:
            com.bytedance.common.a.c r1 = r8.f26412d
            int r1 = r1.mo24032a()
            r2 = 100
            if (r1 >= r2) goto L_0x0128
            com.bytedance.common.a.c r1 = r8.f26412d
            java.lang.String r2 = r8.f26409a
            r1.mo24034a(r2, r0)
            goto L_0x012d
        L_0x0128:
            java.lang.String r1 = "the total number of hosts is exceed 100"
            com.bytedance.common.p477a.C9676f.m28592a(r1)
        L_0x012d:
            com.bytedance.common.a.c r1 = r8.f26412d
            java.lang.String r2 = r8.f26409a
            r1.mo24038d(r2)
            return r0
        L_0x0135:
            r0 = move-exception
        L_0x0136:
            if (r1 == 0) goto L_0x013b
            r1.disconnect()
        L_0x013b:
            if (r2 == 0) goto L_0x0140
            r2.close()     // Catch:{ IOException -> 0x0145 }
        L_0x0140:
            if (r3 == 0) goto L_0x0145
            r3.close()     // Catch:{ IOException -> 0x0145 }
        L_0x0145:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.p477a.C9677g.call():com.bytedance.common.a.b");
    }

    C9677g(String str, Context context, String str2, C9672c cVar, long j) {
        this.f26409a = str;
        this.f26410b = context;
        this.f26411c = str2;
        this.f26412d = cVar;
        this.f26413e = j;
    }
}
