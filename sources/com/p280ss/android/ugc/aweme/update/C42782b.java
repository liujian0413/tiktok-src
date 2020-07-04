package com.p280ss.android.ugc.aweme.update;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.update.b */
public final class C42782b {

    /* renamed from: a */
    final Context f111201a;

    /* renamed from: b */
    final UpdateHelper f111202b;

    /* renamed from: c */
    volatile boolean f111203c;

    /* renamed from: a */
    public final void mo104430a() {
        this.f111203c = true;
    }

    public C42782b(UpdateHelper updateHelper, Context context) {
        this.f111202b = updateHelper;
        this.f111201a = context;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x016f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0170, code lost:
        r8 = r22;
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x017a, code lost:
        if (com.p280ss.android.ugc.aweme.update.C42783c.m135799a(r1.f111201a) != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x017c, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0187, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0188, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018a, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01a5, code lost:
        if (r12 != null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01b0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01b1, code lost:
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01b3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01b4, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01d5, code lost:
        if (r12 != null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        r3 = java.net.InetAddress.getByName(r12.getURL().getHost()).getHostAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r5 = r12.getURL().toString();
        r10 = new java.lang.StringBuilder("download failed statusCode:");
        r10.append(r0);
        r10.append(" url:");
        r10.append(r5);
        r10.append("  remote_ip:");
        r10.append(r3);
        r3 = new java.lang.Exception(r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011c, code lost:
        if (r11 <= 0) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011e, code lost:
        if (r11 != r10) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0121, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0127, code lost:
        r4 = r0;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0159 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v1, types: [boolean]
      assigns: []
      uses: [?[int, byte, short, char], boolean]
      mth insns count: 214
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
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0187 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:61:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x019d A[SYNTHETIC, Splitter:B:120:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[Catch:{ Exception -> 0x01b3, all -> 0x0031 }, ExcHandler: all (th java.lang.Throwable), PHI: r12 
      PHI: (r12v12 java.net.HttpURLConnection) = (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v6 java.net.HttpURLConnection) binds: [B:25:0x007d, B:27:0x0081, B:40:0x00a4, B:70:0x0124, B:71:?, B:74:0x012c, B:75:?, B:78:0x0139, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01b3 A[ExcHandler: Exception (e java.lang.Exception), PHI: r12 
      PHI: (r12v7 java.net.HttpURLConnection) = (r12v8 java.net.HttpURLConnection), (r12v8 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v11 java.net.HttpURLConnection), (r12v6 java.net.HttpURLConnection) binds: [B:109:0x018c, B:110:?, B:25:0x007d, B:27:0x0081, B:40:0x00a4, B:61:0x0112, B:92:0x0159, B:70:0x0124, B:71:?, B:86:0x014f, B:87:?, B:78:0x0139, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE], Splitter:B:61:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01c1 A[SYNTHETIC, Splitter:B:138:0x01c1] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01c6 A[SYNTHETIC, Splitter:B:142:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01d2 A[SYNTHETIC, Splitter:B:150:0x01d2] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo104431a(java.lang.String r20, java.lang.String r21, boolean r22, java.lang.Exception[] r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = 4096(0x1000, float:5.74E-42)
            r4 = 0
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x01ca, all -> 0x01b6 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01ca, all -> 0x01b6 }
            r0 = r21
            r6.<init>(r0)     // Catch:{ Exception -> 0x01ca, all -> 0x01b6 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01ca, all -> 0x01b6 }
            r8 = 1
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x01ca, all -> 0x01b6 }
            r9 = r20
            r0 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x001b:
            r14 = 4
            if (r0 >= r14) goto L_0x018a
            if (r0 > r8) goto L_0x0034
            java.lang.String r14 = "http:"
            boolean r14 = r9.startsWith(r14)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            if (r14 == 0) goto L_0x0036
            java.lang.String r14 = "http:"
            java.lang.String r15 = "https:"
            java.lang.String r9 = r9.replace(r14, r15)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            goto L_0x0036
        L_0x0031:
            r0 = move-exception
            goto L_0x01ba
        L_0x0034:
            r9 = r20
        L_0x0036:
            java.net.URL r14 = new java.net.URL     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r14.<init>(r9)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r15 = "https:"
            boolean r15 = r9.startsWith(r15)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            if (r15 == 0) goto L_0x004b
            java.net.URLConnection r14 = r14.openConnection()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            javax.net.ssl.HttpsURLConnection r14 = (javax.net.ssl.HttpsURLConnection) r14     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
        L_0x0049:
            r12 = r14
            goto L_0x0052
        L_0x004b:
            java.net.URLConnection r14 = r14.openConnection()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            goto L_0x0049
        L_0x0052:
            r12.setInstanceFollowRedirects(r8)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r14 = 6000(0x1770, float:8.408E-42)
            r12.setConnectTimeout(r14)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r12.setReadTimeout(r14)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            boolean r14 = r1.f111203c     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            if (r14 != 0) goto L_0x018a
            int r14 = r0 + 1
            if (r10 <= 0) goto L_0x007d
            java.lang.String r0 = "Range"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r3 = "bytes="
            r15.<init>(r3)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r15.append(r10)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r3 = "-"
            r15.append(r3)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            com.p280ss.android.ugc.aweme.update.C42783c.m135798a(r12, r0, r3)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
        L_0x007d:
            int r0 = r12.getResponseCode()     // Catch:{ IOException -> 0x016f, Exception -> 0x016c, all -> 0x0031 }
            boolean r3 = r1.f111203c     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            if (r3 != 0) goto L_0x018a
            if (r10 != 0) goto L_0x008b
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != r3) goto L_0x0091
        L_0x008b:
            if (r10 <= 0) goto L_0x00d2
            r3 = 206(0xce, float:2.89E-43)
            if (r0 == r3) goto L_0x00d2
        L_0x0091:
            java.lang.String r3 = ""
            java.net.URL r5 = r12.getURL()     // Catch:{ UnknownHostException -> 0x00a4 }
            java.lang.String r5 = r5.getHost()     // Catch:{ UnknownHostException -> 0x00a4 }
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch:{ UnknownHostException -> 0x00a4 }
            java.lang.String r5 = r5.getHostAddress()     // Catch:{ UnknownHostException -> 0x00a4 }
            r3 = r5
        L_0x00a4:
            java.net.URL r5 = r12.getURL()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.Exception r9 = new java.lang.Exception     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r11 = "download failed statusCode:"
            r10.<init>(r11)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r10.append(r0)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r0 = " url:"
            r10.append(r0)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r10.append(r5)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r0 = "  remote_ip:"
            r10.append(r0)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r10.append(r3)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r3 = r9
            goto L_0x018c
        L_0x00d2:
            r0 = -1
            if (r10 != 0) goto L_0x0110
            java.lang.String r3 = "Transfer-Encoding"
            java.lang.String r3 = r12.getHeaderField(r3)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            if (r3 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r3 = 0
        L_0x00df:
            if (r3 != 0) goto L_0x00ee
            java.lang.String r15 = "Content-Length"
            java.lang.String r15 = r12.getHeaderField(r15)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            if (r15 == 0) goto L_0x00ef
            int r11 = java.lang.Integer.parseInt(r15)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            goto L_0x00f0
        L_0x00ee:
            r11 = -1
        L_0x00ef:
            r15 = 0
        L_0x00f0:
            if (r15 != 0) goto L_0x0106
            if (r3 == 0) goto L_0x00fc
            java.lang.String r15 = "chunked"
            boolean r3 = r3.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            if (r3 != 0) goto L_0x0106
        L_0x00fc:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r3 = "can not know content length, give up"
            r0.<init>(r3)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r3 = r0
            goto L_0x018c
        L_0x0106:
            com.ss.android.ugc.aweme.update.UpdateHelper r3 = r1.f111202b     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            java.lang.String r15 = ""
            r8 = r22
            r3.mo104385a(r11, r15, r8)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            goto L_0x0112
        L_0x0110:
            r8 = r22
        L_0x0112:
            java.io.InputStream r3 = com.p280ss.android.ugc.aweme.update.C42783c.m135797a(r12)     // Catch:{ IOException -> 0x015d }
        L_0x0116:
            int r15 = r3.read(r5)     // Catch:{ IOException -> 0x0153 }
            if (r15 != r0) goto L_0x012b
            if (r11 <= 0) goto L_0x0123
            if (r11 != r10) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r0 = 0
            goto L_0x0124
        L_0x0123:
            r0 = 1
        L_0x0124:
            r12.disconnect()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r4 = r0
            r3 = r13
            goto L_0x018c
        L_0x012b:
            int r10 = r10 + r15
            r7.write(r5, r4, r15)     // Catch:{ Exception -> 0x014e, all -> 0x0031 }
            r16 = r5
            long r4 = (long) r10
            r17 = 209715200(0xc800000, double:1.036130757E-315)
            int r15 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x013d
            r12.disconnect()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            goto L_0x018a
        L_0x013d:
            boolean r4 = r1.f111203c     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            if (r4 == 0) goto L_0x0145
            r12.disconnect()     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            goto L_0x018a
        L_0x0145:
            com.ss.android.ugc.aweme.update.UpdateHelper r4 = r1.f111202b     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r4.mo104384a(r10, r11)     // Catch:{ Exception -> 0x01b3, all -> 0x0031 }
            r5 = r16
            r4 = 0
            goto L_0x0116
        L_0x014e:
            r0 = move-exception
            r12.disconnect()     // Catch:{ Exception -> 0x01b3, all -> 0x0187 }
            goto L_0x016d
        L_0x0153:
            r0 = move-exception
            r16 = r5
            r3.close()     // Catch:{ Exception -> 0x0159, all -> 0x0187 }
        L_0x0159:
            r12.disconnect()     // Catch:{ Exception -> 0x01b3, all -> 0x0187 }
            goto L_0x017f
        L_0x015d:
            r0 = move-exception
            r16 = r5
            android.content.Context r3 = r1.f111201a     // Catch:{ Exception -> 0x01b3, all -> 0x0187 }
            boolean r3 = com.p280ss.android.ugc.aweme.update.C42783c.m135799a(r3)     // Catch:{ Exception -> 0x01b3, all -> 0x0187 }
            if (r3 == 0) goto L_0x016d
            r12.disconnect()     // Catch:{ Exception -> 0x01b3, all -> 0x0187 }
            goto L_0x017f
        L_0x016c:
            r0 = move-exception
        L_0x016d:
            r3 = r0
            goto L_0x018b
        L_0x016f:
            r0 = move-exception
            r8 = r22
            r16 = r5
            android.content.Context r3 = r1.f111201a     // Catch:{ Exception -> 0x01b3, all -> 0x0187 }
            boolean r3 = com.p280ss.android.ugc.aweme.update.C42783c.m135799a(r3)     // Catch:{ Exception -> 0x01b3, all -> 0x0187 }
            if (r3 == 0) goto L_0x016d
            r12.disconnect()     // Catch:{ Exception -> 0x01b3, all -> 0x0187 }
        L_0x017f:
            r13 = r0
            r0 = r14
            r5 = r16
            r4 = 0
            r8 = 1
            goto L_0x001b
        L_0x0187:
            r0 = move-exception
            r13 = r0
            goto L_0x01ba
        L_0x018a:
            r3 = r13
        L_0x018b:
            r4 = 0
        L_0x018c:
            r7.close()     // Catch:{ Exception -> 0x01b3, all -> 0x01b0 }
            if (r4 == 0) goto L_0x019d
            if (r3 == 0) goto L_0x0196
            r4 = 0
            r23[r4] = r3
        L_0x0196:
            if (r12 == 0) goto L_0x019b
            r12.disconnect()     // Catch:{ Exception -> 0x019b }
        L_0x019b:
            r2 = 1
            return r2
        L_0x019d:
            r6.delete()     // Catch:{ Exception -> 0x01ac, all -> 0x01a8 }
            if (r3 == 0) goto L_0x01a5
            r4 = 0
            r23[r4] = r3
        L_0x01a5:
            if (r12 == 0) goto L_0x01da
            goto L_0x01d7
        L_0x01a8:
            r0 = move-exception
            r13 = r3
            r7 = 0
            goto L_0x01ba
        L_0x01ac:
            r0 = move-exception
            r3 = 0
            r7 = 0
            goto L_0x01ce
        L_0x01b0:
            r0 = move-exception
            r13 = r3
            goto L_0x01ba
        L_0x01b3:
            r0 = move-exception
            r3 = 0
            goto L_0x01ce
        L_0x01b6:
            r0 = move-exception
            r7 = 0
            r12 = 0
            r13 = 0
        L_0x01ba:
            if (r13 == 0) goto L_0x01bf
            r3 = 0
            r23[r3] = r13
        L_0x01bf:
            if (r7 == 0) goto L_0x01c4
            r7.close()     // Catch:{ Exception -> 0x01c4 }
        L_0x01c4:
            if (r12 == 0) goto L_0x01c9
            r12.disconnect()     // Catch:{ Exception -> 0x01c9 }
        L_0x01c9:
            throw r0
        L_0x01ca:
            r0 = move-exception
            r3 = 0
            r7 = 0
            r12 = 0
        L_0x01ce:
            r23[r3] = r0
            if (r7 == 0) goto L_0x01d5
            r7.close()     // Catch:{ Exception -> 0x01d5 }
        L_0x01d5:
            if (r12 == 0) goto L_0x01da
        L_0x01d7:
            r12.disconnect()     // Catch:{ Exception -> 0x01da }
        L_0x01da:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.update.C42782b.mo104431a(java.lang.String, java.lang.String, boolean, java.lang.Exception[]):boolean");
    }
}
