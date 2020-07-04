package com.google.android.gms.internal.ads;

@C6505uv
public abstract class alt extends alb {

    /* renamed from: d */
    public final aip f40607d = new aip();

    /* renamed from: e */
    private boolean f40608e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f40609f;

    /* renamed from: g */
    private boolean f40610g;

    public alt(aik aik) {
        super(aik);
        this.f40607d.mo39492a((aiu) new alu(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bho mo39672c(String str);

    /* renamed from: b */
    public final void mo38266b() {
        this.f40607d.mo39495c();
        super.mo38266b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo39658b(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.mo39658b(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        if (android.text.TextUtils.isEmpty(r9.f40609f) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        r1 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r14 = r9.f40609f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        java.lang.Thread.sleep(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ee, code lost:
        r1 = "error";
        r2 = "Sleep interrupted.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        throw new java.io.IOException("Interrupted sleep.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012d, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0150, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0151, code lost:
        r12 = r1;
        r14 = r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39656a(java.lang.String r34) {
        /*
            r33 = this;
            r9 = r33
            r10 = r34
            com.google.android.gms.internal.ads.bho r0 = r33.mo39672c(r34)
            java.lang.String r11 = r33.mo39658b(r34)
            java.lang.String r12 = "error"
            r13 = 0
            r14 = 0
            com.google.android.gms.internal.ads.aip r1 = r9.f40607d     // Catch:{ IOException -> 0x0157 }
            boolean r0 = r1.mo39494a(r0)     // Catch:{ IOException -> 0x0157 }
            if (r0 == 0) goto L_0x0141
            com.google.android.gms.internal.ads.aip r0 = r9.f40607d     // Catch:{ IOException -> 0x0157 }
            com.google.android.gms.internal.ads.bgh r0 = r0.f40348a     // Catch:{ IOException -> 0x0157 }
            if (r0 == 0) goto L_0x0132
            java.lang.ref.WeakReference r1 = r9.f40538c     // Catch:{ IOException -> 0x0157 }
            java.lang.Object r1 = r1.get()     // Catch:{ IOException -> 0x0157 }
            com.google.android.gms.internal.ads.aik r1 = (com.google.android.gms.internal.ads.aik) r1     // Catch:{ IOException -> 0x0157 }
            if (r1 == 0) goto L_0x002b
            r1.mo39461a(r11, r9)     // Catch:{ IOException -> 0x0157 }
        L_0x002b:
            com.google.android.gms.common.util.e r15 = com.google.android.gms.ads.internal.C14793ay.m42901g()     // Catch:{ IOException -> 0x0157 }
            long r16 = r15.mo38684a()     // Catch:{ IOException -> 0x0157 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15585bw.f44031u     // Catch:{ IOException -> 0x0157 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ IOException -> 0x0157 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ IOException -> 0x0157 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x0157 }
            long r18 = r1.longValue()     // Catch:{ IOException -> 0x0157 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15585bw.f44030t     // Catch:{ IOException -> 0x0157 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ IOException -> 0x0157 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ IOException -> 0x0157 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x0157 }
            long r1 = r1.longValue()     // Catch:{ IOException -> 0x0157 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r20 = r1 * r3
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C15585bw.f44029s     // Catch:{ IOException -> 0x0157 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ IOException -> 0x0157 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ IOException -> 0x0157 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0157 }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x0157 }
            long r6 = (long) r1     // Catch:{ IOException -> 0x0157 }
            r1 = -1
        L_0x006a:
            monitor-enter(r33)     // Catch:{ IOException -> 0x0157 }
            long r3 = r15.mo38684a()     // Catch:{ all -> 0x012f }
            r5 = 0
            long r3 = r3 - r16
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 > 0) goto L_0x00fa
            boolean r3 = r9.f40608e     // Catch:{ all -> 0x012f }
            if (r3 == 0) goto L_0x0092
            java.lang.String r0 = r9.f40609f     // Catch:{ all -> 0x012f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "badUrl"
            java.lang.String r0 = r9.f40609f     // Catch:{ all -> 0x012c }
            r14 = r0
            goto L_0x008a
        L_0x0088:
            java.lang.String r1 = "externalAbort"
        L_0x008a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x012c }
            throw r0     // Catch:{ all -> 0x012c }
        L_0x0092:
            boolean r3 = r9.f40610g     // Catch:{ all -> 0x012f }
            r22 = 1
            if (r3 == 0) goto L_0x009a
            monitor-exit(r33)     // Catch:{ all -> 0x012f }
            goto L_0x00e1
        L_0x009a:
            long r4 = r0.mo40616e()     // Catch:{ all -> 0x012f }
            r23 = 0
            int r3 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e4
            long r25 = r0.mo40618g()     // Catch:{ all -> 0x012f }
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00c8
            int r1 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b2
            r8 = 1
            goto L_0x00b3
        L_0x00b2:
            r8 = 0
        L_0x00b3:
            r1 = r33
            r2 = r34
            r3 = r11
            r27 = r4
            r4 = r25
            r29 = r6
            r6 = r27
            r1.mo39653a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x012f }
            r3 = r25
            r1 = r27
            goto L_0x00cf
        L_0x00c8:
            r29 = r6
            r31 = r1
            r1 = r4
            r3 = r31
        L_0x00cf:
            int r5 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x00d8
            r9.mo39652a(r10, r11, r1)     // Catch:{ all -> 0x012f }
            monitor-exit(r33)     // Catch:{ all -> 0x012f }
            goto L_0x00e1
        L_0x00d8:
            int r1 = (r23 > r29 ? 1 : (r23 == r29 ? 0 : -1))
            if (r1 < 0) goto L_0x00e2
            int r1 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e2
            monitor-exit(r33)     // Catch:{ all -> 0x012f }
        L_0x00e1:
            return r22
        L_0x00e2:
            r1 = r3
            goto L_0x00e6
        L_0x00e4:
            r29 = r6
        L_0x00e6:
            monitor-exit(r33)     // Catch:{ all -> 0x012f }
            java.lang.Thread.sleep(r18)     // Catch:{ InterruptedException -> 0x00ee }
            r6 = r29
            goto L_0x006a
        L_0x00ee:
            java.lang.String r1 = "error"
            java.lang.String r2 = "Sleep interrupted."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0150 }
            java.lang.String r3 = "Interrupted sleep."
            r0.<init>(r3)     // Catch:{ IOException -> 0x0150 }
            throw r0     // Catch:{ IOException -> 0x0150 }
        L_0x00fa:
            java.lang.String r1 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r20)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x012c }
            int r2 = r2.length()     // Catch:{ all -> 0x012c }
            int r2 = r2 + 27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r3.<init>(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x012c }
            r3.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = " ms"
            r3.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x012c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "Timed out while buffering."
            r0.<init>(r3)     // Catch:{ all -> 0x0128 }
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            r12 = r1
            r14 = r2
            goto L_0x0130
        L_0x012c:
            r0 = move-exception
            r12 = r1
            goto L_0x0130
        L_0x012f:
            r0 = move-exception
        L_0x0130:
            monitor-exit(r33)     // Catch:{ all -> 0x012f }
            throw r0     // Catch:{ IOException -> 0x0157 }
        L_0x0132:
            java.lang.String r1 = "playerFailed"
            java.lang.String r2 = "ExoPlayer not created"
            r33.mo38266b()     // Catch:{ IOException -> 0x0150 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0150 }
            java.lang.String r3 = "Failed to get ExoPlayer"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0150 }
            throw r0     // Catch:{ IOException -> 0x0150 }
        L_0x0141:
            java.lang.String r1 = "playerFailed"
            java.lang.String r2 = "ExoPlayer prepare failed"
            r33.mo38266b()     // Catch:{ IOException -> 0x0150 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0150 }
            java.lang.String r3 = "Failed to prepare AdExoPlayerHelper"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0150 }
            throw r0     // Catch:{ IOException -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            r12 = r1
            r14 = r2
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            r12 = r1
            goto L_0x0158
        L_0x0157:
            r0 = move-exception
        L_0x0158:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r34)
            int r1 = r1.length()
            int r1 = r1 + 34
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            r9.mo39655a(r10, r11, r12, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alt.mo39656a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo39647a() {
        synchronized (this) {
            this.f40608e = true;
        }
    }

    /* renamed from: c */
    public final void mo39674c() {
        synchronized (this) {
            this.f40610g = true;
            this.f40607d.mo39496d();
        }
    }
}
