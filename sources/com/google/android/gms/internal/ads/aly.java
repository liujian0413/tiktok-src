package com.google.android.gms.internal.ads;

@C6505uv
public final class aly extends alb implements akp {

    /* renamed from: d */
    private akh f40624d;

    /* renamed from: e */
    private String f40625e;

    /* renamed from: f */
    private boolean f40626f;

    /* renamed from: g */
    private Exception f40627g;

    /* renamed from: h */
    private boolean f40628h;

    public aly(aik aik, aij aij) {
        super(aik);
        this.f40624d = new akh(aik.getContext(), aij);
    }

    /* renamed from: a */
    public final void mo39545a(int i, int i2) {
    }

    /* renamed from: b */
    public final void mo39549b(int i) {
    }

    /* renamed from: a */
    public final void mo39548a(boolean z, long j) {
        aik aik = (aik) this.f40538c.get();
        if (aik != null) {
            ago.f40189a.execute(new alz(aik, z, j));
        }
    }

    /* renamed from: a */
    public final void mo39547a(String str, Exception exc) {
        this.f40627g = exc;
        acd.m45780c("Precache error", exc);
        m46311c(str);
    }

    /* renamed from: a */
    public final void mo39648a(int i) {
        this.f40624d.f40498a.mo39607b(i);
    }

    /* renamed from: c */
    public final void mo39659c(int i) {
        this.f40624d.f40498a.mo39602a(i);
    }

    /* renamed from: d */
    public final void mo39660d(int i) {
        this.f40624d.f40498a.mo39609c(i);
    }

    /* renamed from: e */
    public final void mo39661e(int i) {
        this.f40624d.f40498a.mo39611d(i);
    }

    /* renamed from: b */
    public final void mo38266b() {
        if (this.f40624d != null) {
            this.f40624d.f40500c = null;
            this.f40624d.mo39628c();
        }
        super.mo38266b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo39658b(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.mo39658b(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public final boolean mo39656a(String str) {
        return mo39657a(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r11.f40627g == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r1 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        throw r11.f40627g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39657a(java.lang.String r33, java.lang.String[] r34) {
        /*
            r32 = this;
            r11 = r32
            r12 = r33
            r0 = r34
            r11.f40625e = r12
            java.lang.String r13 = r32.mo39658b(r33)
            java.lang.String r14 = "error"
            int r1 = r0.length     // Catch:{ Exception -> 0x0164 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x0164 }
            r2 = 0
        L_0x0012:
            int r3 = r0.length     // Catch:{ Exception -> 0x0164 }
            if (r2 >= r3) goto L_0x0023
            r3 = r0[r2]     // Catch:{ Exception -> 0x0020 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0020 }
            r1[r2] = r3     // Catch:{ Exception -> 0x0020 }
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0020:
            r0 = move-exception
            goto L_0x0167
        L_0x0023:
            com.google.android.gms.internal.ads.akh r0 = r11.f40624d     // Catch:{ Exception -> 0x0164 }
            java.lang.String r2 = r11.f40537b     // Catch:{ Exception -> 0x0164 }
            r0.mo39625a(r1, r2)     // Catch:{ Exception -> 0x0164 }
            java.lang.ref.WeakReference r0 = r11.f40538c     // Catch:{ Exception -> 0x0164 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0164 }
            com.google.android.gms.internal.ads.aik r0 = (com.google.android.gms.internal.ads.aik) r0     // Catch:{ Exception -> 0x0164 }
            if (r0 == 0) goto L_0x0037
            r0.mo39461a(r13, r11)     // Catch:{ Exception -> 0x0020 }
        L_0x0037:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14793ay.m42901g()     // Catch:{ Exception -> 0x0164 }
            long r16 = r0.mo38684a()     // Catch:{ Exception -> 0x0164 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15585bw.f44031u     // Catch:{ Exception -> 0x0164 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ Exception -> 0x0164 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ Exception -> 0x0164 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0164 }
            long r9 = r1.longValue()     // Catch:{ Exception -> 0x0164 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15585bw.f44030t     // Catch:{ Exception -> 0x0164 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ Exception -> 0x0164 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ Exception -> 0x0164 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0164 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0164 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r6 = r1 * r3
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C15585bw.f44029s     // Catch:{ Exception -> 0x0164 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ Exception -> 0x0164 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ Exception -> 0x0164 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0164 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0164 }
            long r4 = (long) r1     // Catch:{ Exception -> 0x0164 }
            r1 = -1
        L_0x0076:
            monitor-enter(r32)     // Catch:{ Exception -> 0x0164 }
            long r18 = r0.mo38684a()     // Catch:{ all -> 0x015d }
            r3 = 0
            long r18 = r18 - r16
            int r3 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0130
            boolean r3 = r11.f40626f     // Catch:{ all -> 0x015d }
            if (r3 == 0) goto L_0x0099
            java.lang.Exception r0 = r11.f40627g     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r1 = "badUrl"
            java.lang.Exception r0 = r11.f40627g     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x008f:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0156 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0099:
            boolean r3 = r11.f40628h     // Catch:{ all -> 0x015d }
            r18 = 1
            if (r3 == 0) goto L_0x00a2
            monitor-exit(r32)     // Catch:{ all -> 0x0162 }
            goto L_0x0101
        L_0x00a2:
            com.google.android.gms.internal.ads.akh r3 = r11.f40624d     // Catch:{ all -> 0x015d }
            com.google.android.gms.internal.ads.bks r3 = r3.f40499b     // Catch:{ all -> 0x015d }
            if (r3 == 0) goto L_0x0124
            r20 = r14
            long r14 = r3.mo40860f()     // Catch:{ all -> 0x0159 }
            r21 = 0
            int r8 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r8 <= 0) goto L_0x0106
            long r23 = r3.mo40862h()     // Catch:{ all -> 0x0159 }
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00e3
            int r1 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c2
            r8 = 1
            goto L_0x00c3
        L_0x00c2:
            r8 = 0
        L_0x00c3:
            int r19 = com.google.android.gms.internal.ads.akh.m46199a()     // Catch:{ all -> 0x0159 }
            int r25 = com.google.android.gms.internal.ads.akh.m46201b()     // Catch:{ all -> 0x0159 }
            r1 = r32
            r2 = r33
            r3 = r13
            r26 = r4
            r4 = r23
            r28 = r6
            r6 = r14
            r30 = r9
            r9 = r19
            r10 = r25
            r1.mo39654a(r2, r3, r4, r6, r8, r9, r10)     // Catch:{ all -> 0x0159 }
            r1 = r23
            goto L_0x00e9
        L_0x00e3:
            r26 = r4
            r28 = r6
            r30 = r9
        L_0x00e9:
            int r3 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x00f2
            r11.mo39652a(r12, r13, r14)     // Catch:{ all -> 0x0159 }
            monitor-exit(r32)     // Catch:{ all -> 0x0159 }
            goto L_0x0101
        L_0x00f2:
            com.google.android.gms.internal.ads.akh r3 = r11.f40624d     // Catch:{ all -> 0x0159 }
            long r3 = r3.mo39629d()     // Catch:{ all -> 0x0159 }
            int r5 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r5 < 0) goto L_0x0102
            int r3 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r3 <= 0) goto L_0x0102
            monitor-exit(r32)     // Catch:{ all -> 0x0159 }
        L_0x0101:
            return r18
        L_0x0102:
            r3 = r1
            r1 = r30
            goto L_0x010c
        L_0x0106:
            r26 = r4
            r28 = r6
            r3 = r1
            r1 = r9
        L_0x010c:
            r11.wait(r1)     // Catch:{ InterruptedException -> 0x011a }
            monitor-exit(r32)     // Catch:{ all -> 0x0159 }
            r9 = r1
            r1 = r3
            r14 = r20
            r4 = r26
            r6 = r28
            goto L_0x0076
        L_0x011a:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0156 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0124:
            r20 = r14
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0156 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0130:
            r28 = r6
            r20 = r14
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0156 }
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r3.<init>(r2)     // Catch:{ all -> 0x0156 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x0156 }
            r4 = r28
            r3.append(r4)     // Catch:{ all -> 0x0156 }
            java.lang.String r2 = " ms"
            r3.append(r2)     // Catch:{ all -> 0x0156 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0156 }
            r0.<init>(r2)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            r14 = r1
            goto L_0x0160
        L_0x0159:
            r0 = move-exception
            r14 = r20
            goto L_0x0160
        L_0x015d:
            r0 = move-exception
            r20 = r14
        L_0x0160:
            monitor-exit(r32)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ Exception -> 0x0020 }
        L_0x0162:
            r0 = move-exception
            goto L_0x0160
        L_0x0164:
            r0 = move-exception
            r20 = r14
        L_0x0167:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r33)
            int r2 = r2.length()
            int r2 = r2 + 34
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to preload url "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = " Exception: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.acd.m45783e(r1)
            r32.mo38266b()
            java.lang.String r0 = m46310b(r14, r0)
            r11.mo39655a(r12, r13, r14, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aly.mo39657a(java.lang.String, java.lang.String[]):boolean");
    }

    /* renamed from: a */
    public final void mo39647a() {
        m46311c((String) null);
    }

    /* renamed from: c */
    private final void m46311c(String str) {
        synchronized (this) {
            this.f40626f = true;
            notify();
            mo38266b();
        }
        if (this.f40625e != null) {
            String b = mo39658b(this.f40625e);
            if (this.f40627g != null) {
                mo39655a(this.f40625e, b, "badUrl", m46310b(str, this.f40627g));
                return;
            }
            mo39655a(this.f40625e, b, "externalAbort", "Programmatic precache abort.");
        }
    }

    /* renamed from: c */
    public final akh mo39679c() {
        synchronized (this) {
            this.f40628h = true;
            notify();
        }
        this.f40624d.f40500c = null;
        akh akh = this.f40624d;
        this.f40624d = null;
        return akh;
    }

    /* renamed from: b */
    private static String m46310b(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
