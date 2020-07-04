package com.p280ss.android.ugc.aweme.commerce.p1104a;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.f */
public final class C24420f {
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable, java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.io.Closeable, java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v7
      assigns: []
      uses: []
      mth insns count: 35
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
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m80308a(android.content.Context r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException | UnsupportedEncodingException -> 0x0040, all -> 0x0037 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ IOException | UnsupportedEncodingException -> 0x0040, all -> 0x0037 }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ IOException | UnsupportedEncodingException -> 0x0040, all -> 0x0037 }
            java.lang.String r3 = "omsdk_v1.js"
            java.io.InputStream r4 = r4.open(r3)     // Catch:{ IOException | UnsupportedEncodingException -> 0x0040, all -> 0x0037 }
            r2.<init>(r4)     // Catch:{ IOException | UnsupportedEncodingException -> 0x0040, all -> 0x0037 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException | UnsupportedEncodingException -> 0x0041, all -> 0x0033 }
            r4.<init>(r2)     // Catch:{ IOException | UnsupportedEncodingException -> 0x0041, all -> 0x0033 }
        L_0x001e:
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException | UnsupportedEncodingException -> 0x0031, all -> 0x002f }
            if (r1 == 0) goto L_0x0028
            r0.append(r1)     // Catch:{ IOException | UnsupportedEncodingException -> 0x0031, all -> 0x002f }
            goto L_0x001e
        L_0x0028:
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r2)
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r4)
            goto L_0x0047
        L_0x002f:
            r0 = move-exception
            goto L_0x0035
        L_0x0031:
            r1 = r4
            goto L_0x0041
        L_0x0033:
            r0 = move-exception
            r4 = r1
        L_0x0035:
            r1 = r2
            goto L_0x0039
        L_0x0037:
            r0 = move-exception
            r4 = r1
        L_0x0039:
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r1)
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r4)
            throw r0
        L_0x0040:
            r2 = r1
        L_0x0041:
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r2)
            com.p280ss.android.ugc.aweme.utils.C42973bg.m136425a(r1)
        L_0x0047:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.p1104a.C24420f.m80308a(android.content.Context):java.lang.String");
    }
}
