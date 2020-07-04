package com.p280ss.android.ugc.aweme.p1685ug.poloris;

/* renamed from: com.ss.android.ugc.aweme.ug.poloris.a */
public final class C42716a {

    /* renamed from: a */
    public static final C42716a f111010a = new C42716a();

    private C42716a() {
    }

    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v14, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v13, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v10
      assigns: []
      uses: []
      mth insns count: 117
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
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d A[Catch:{ Throwable -> 0x0122, all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083 A[Catch:{ Throwable -> 0x0122, all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff A[Catch:{ Throwable -> 0x0122, all -> 0x0028 }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m135610a(java.lang.String r6, int r7, java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x012e
            if (r7 <= 0) goto L_0x012e
            if (r9 == 0) goto L_0x012e
            if (r8 != 0) goto L_0x000b
            goto L_0x012e
        L_0x000b:
            r1 = 1
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x002c, all -> 0x0028 }
            r3.<init>(r8)     // Catch:{ Throwable -> 0x002c, all -> 0x0028 }
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x002c, all -> 0x0028 }
            if (r4 != 0) goto L_0x002c
            boolean r3 = r3.mkdirs()     // Catch:{ Throwable -> 0x002c, all -> 0x0028 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x002c, all -> 0x0028 }
            java.lang.String r5 = "is Failed  : "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x002c, all -> 0x0028 }
            r3 = r3 ^ r1
            r4.append(r3)     // Catch:{ Throwable -> 0x002c, all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r6 = move-exception
            r8 = r2
            goto L_0x0117
        L_0x002c:
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            r3.<init>(r8, r9)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            r5.<init>()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            r5.append(r9)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.String r9 = "-tmp"
            r5.append(r9)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.String r9 = r5.toString()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            r4.<init>(r8, r9)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            boolean r8 = r4.exists()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            if (r8 == 0) goto L_0x005e
            boolean r8 = r4.delete()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            if (r8 == 0) goto L_0x0054
            goto L_0x005e
        L_0x0054:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.String r7 = "download file exists, delete failed"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            throw r6     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
        L_0x005e:
            okhttp3.OkHttpClient r8 = new okhttp3.OkHttpClient     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            r8.<init>()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            okhttp3.Request$Builder r9 = new okhttp3.Request$Builder     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            r9.<init>()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            okhttp3.Request$Builder r6 = r9.url(r6)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            okhttp3.Request r6 = r6.build()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            okhttp3.Call r6 = r8.newCall(r6)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            okhttp3.Response r6 = r6.execute()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.String r8 = "response"
            kotlin.jvm.internal.C7573i.m23582a(r6, r8)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            boolean r8 = r6.isSuccessful()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            if (r8 == 0) goto L_0x00ff
            okhttp3.ResponseBody r6 = r6.body     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            if (r6 == 0) goto L_0x00f5
            java.lang.String r8 = "response.body() ?: throw…ror, response body null\")"
            kotlin.jvm.internal.C7573i.m23582a(r6, r8)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.io.InputStream r6 = r6.byteStream()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            if (r6 == 0) goto L_0x00e6
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            r8.<init>(r4)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.io.OutputStream r8 = (java.io.OutputStream) r8     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            byte[] r7 = new byte[r7]     // Catch:{ Throwable -> 0x00e4, all -> 0x00e2 }
        L_0x009b:
            int r9 = r6.read(r7)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e2 }
            if (r9 < 0) goto L_0x00a5
            r8.write(r7, r0, r9)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e2 }
            goto L_0x009b
        L_0x00a5:
            r8.close()     // Catch:{ Throwable -> 0x00e4, all -> 0x00e2 }
            boolean r7 = r4.renameTo(r3)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            if (r7 == 0) goto L_0x00b7
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.bytedance.common.utility.p482io.C9734a.m28682a(r6)
            com.bytedance.common.utility.p482io.C9734a.m28682a(r2)
            return r1
        L_0x00b7:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.String r9 = "rename file from: "
            r8.<init>(r9)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.String r9 = r4.getAbsolutePath()     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            r8.append(r9)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.String r9 = " to: "
            r8.append(r9)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.String r9 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            r8.append(r9)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.String r9 = " failed"
            r8.append(r9)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            r7.<init>(r8)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            throw r7     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
        L_0x00e2:
            r7 = move-exception
            goto L_0x00f2
        L_0x00e4:
            r2 = r8
            goto L_0x0123
        L_0x00e6:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.String r8 = "error, byte stream null"
            r7.<init>(r8)     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
            throw r7     // Catch:{ Throwable -> 0x0123, all -> 0x00f0 }
        L_0x00f0:
            r7 = move-exception
            r8 = r2
        L_0x00f2:
            r2 = r6
            r6 = r7
            goto L_0x0117
        L_0x00f5:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.String r7 = "error, response body null"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            throw r6     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
        L_0x00ff:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.String r9 = "error, response code: "
            r8.<init>(r9)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            int r6 = r6.code     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            r8.append(r6)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.String r6 = r8.toString()     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            r7.<init>(r6)     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
            throw r7     // Catch:{ Throwable -> 0x0122, all -> 0x0028 }
        L_0x0117:
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.bytedance.common.utility.p482io.C9734a.m28682a(r2)
            java.io.Closeable r8 = (java.io.Closeable) r8
            com.bytedance.common.utility.p482io.C9734a.m28682a(r8)
            throw r6
        L_0x0122:
            r6 = r2
        L_0x0123:
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.bytedance.common.utility.p482io.C9734a.m28682a(r6)
            java.io.Closeable r2 = (java.io.Closeable) r2
            com.bytedance.common.utility.p482io.C9734a.m28682a(r2)
            return r0
        L_0x012e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1685ug.poloris.C42716a.m135610a(java.lang.String, int, java.lang.String, java.lang.String):boolean");
    }
}
