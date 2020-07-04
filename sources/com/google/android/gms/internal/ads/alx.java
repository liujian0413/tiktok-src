package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@C6505uv
public final class alx extends alb implements brq<bre> {

    /* renamed from: d */
    public String f40615d;

    /* renamed from: e */
    public boolean f40616e;

    /* renamed from: f */
    private final aij f40617f;

    /* renamed from: g */
    private boolean f40618g;

    /* renamed from: h */
    private final alv f40619h = new alv();

    /* renamed from: i */
    private final aks f40620i = new aks();

    /* renamed from: j */
    private ByteBuffer f40621j;

    /* renamed from: k */
    private boolean f40622k;

    /* renamed from: l */
    private final Object f40623l = new Object();

    public alx(aik aik, aij aij) {
        super(aik);
        this.f40617f = aij;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo39620a(Object obj, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo39658b(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.mo39658b(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: d */
    private final void m46303d() {
        int a = (int) this.f40619h.mo39675a();
        int a2 = (int) this.f40620i.mo39639a(this.f40621j);
        int position = this.f40621j.position();
        int round = Math.round(((float) a2) * (((float) position) / ((float) a)));
        mo39650a(this.f40615d, mo39658b(this.f40615d), position, a, (long) round, (long) a2, round > 0, akh.m46199a(), akh.m46201b());
    }

    /* JADX WARNING: type inference failed for: r1v29, types: [com.google.android.gms.internal.ads.ake] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9.f40616e = true;
        mo39652a(r10, r11, (long) ((int) r9.f40620i.mo39639a(r9.f40621j)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        if (r9.f40621j.remaining() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        m46303d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        if (r9.f40618g != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r12 = r1.mo38684a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        if ((r12 - r16) < r4) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d8, code lost:
        m46303d();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ed, code lost:
        r12 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010c, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010d, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r1 = r9.f40621j.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0132, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0138, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39656a(java.lang.String r22) {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            r9.f40615d = r10
            java.lang.String r11 = r21.mo39658b(r22)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.bri r0 = new com.google.android.gms.internal.ads.bri     // Catch:{ Exception -> 0x013e }
            java.lang.String r2 = r9.f40537b     // Catch:{ Exception -> 0x013e }
            r3 = 0
            com.google.android.gms.internal.ads.aij r1 = r9.f40617f     // Catch:{ Exception -> 0x013e }
            int r5 = r1.f40314d     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.aij r1 = r9.f40617f     // Catch:{ Exception -> 0x013e }
            int r6 = r1.f40316f     // Catch:{ Exception -> 0x013e }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.aij r1 = r9.f40617f     // Catch:{ Exception -> 0x013e }
            boolean r1 = r1.f40320j     // Catch:{ Exception -> 0x013e }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.ake r1 = new com.google.android.gms.internal.ads.ake     // Catch:{ Exception -> 0x0032 }
            android.content.Context r2 = r9.f40536a     // Catch:{ Exception -> 0x0032 }
            r3 = 0
            r1.<init>(r2, r0, r3, r3)     // Catch:{ Exception -> 0x0032 }
            r0 = r1
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            goto L_0x0141
        L_0x0035:
            android.net.Uri r1 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.brg r2 = new com.google.android.gms.internal.ads.brg     // Catch:{ Exception -> 0x013e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x013e }
            r0.mo39589a(r2)     // Catch:{ Exception -> 0x013e }
            java.lang.ref.WeakReference r1 = r9.f40538c     // Catch:{ Exception -> 0x013e }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.aik r1 = (com.google.android.gms.internal.ads.aik) r1     // Catch:{ Exception -> 0x013e }
            if (r1 == 0) goto L_0x004e
            r1.mo39461a(r11, r9)     // Catch:{ Exception -> 0x0032 }
        L_0x004e:
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.C14793ay.m42901g()     // Catch:{ Exception -> 0x013e }
            long r2 = r1.mo38684a()     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15585bw.f44031u     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.bt r5 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ Exception -> 0x013e }
            java.lang.Object r4 = r5.mo41272a(r4)     // Catch:{ Exception -> 0x013e }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x013e }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r6 = com.google.android.gms.internal.ads.C15585bw.f44030t     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.bt r7 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ Exception -> 0x013e }
            java.lang.Object r6 = r7.mo41272a(r6)     // Catch:{ Exception -> 0x013e }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x013e }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.aij r8 = r9.f40617f     // Catch:{ Exception -> 0x013e }
            int r8 = r8.f40313c     // Catch:{ Exception -> 0x013e }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x013e }
            r9.f40621j = r8     // Catch:{ Exception -> 0x013e }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x013e }
            r16 = r2
        L_0x0086:
            java.nio.ByteBuffer r14 = r9.f40621j     // Catch:{ Exception -> 0x013e }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x013e }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x013e }
            int r14 = r0.mo39588a(r15, r13, r14)     // Catch:{ Exception -> 0x013e }
            r8 = -1
            if (r14 != r8) goto L_0x00a9
            r8 = 1
            r9.f40616e = r8     // Catch:{ Exception -> 0x0032 }
            com.google.android.gms.internal.ads.aks r0 = r9.f40620i     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.f40621j     // Catch:{ Exception -> 0x0032 }
            long r0 = r0.mo39639a(r1)     // Catch:{ Exception -> 0x0032 }
            int r0 = (int) r0     // Catch:{ Exception -> 0x0032 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0032 }
            r9.mo39652a(r10, r11, r0)     // Catch:{ Exception -> 0x0032 }
        L_0x00a7:
            r1 = 1
            goto L_0x00c8
        L_0x00a9:
            java.lang.Object r8 = r9.f40623l     // Catch:{ Exception -> 0x013e }
            monitor-enter(r8)     // Catch:{ Exception -> 0x013e }
            boolean r13 = r9.f40618g     // Catch:{ all -> 0x0133 }
            if (r13 != 0) goto L_0x00b9
            java.nio.ByteBuffer r13 = r9.f40621j     // Catch:{ all -> 0x0133 }
            r18 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x013c }
            goto L_0x00bb
        L_0x00b9:
            r18 = r12
        L_0x00bb:
            monitor-exit(r8)     // Catch:{ all -> 0x013c }
            java.nio.ByteBuffer r8 = r9.f40621j     // Catch:{ Exception -> 0x0138 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0138 }
            if (r8 > 0) goto L_0x00c9
            r21.m46303d()     // Catch:{ Exception -> 0x0138 }
            goto L_0x00a7
        L_0x00c8:
            return r1
        L_0x00c9:
            boolean r8 = r9.f40618g     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x010d
            long r12 = r1.mo38684a()     // Catch:{ Exception -> 0x0138 }
            r8 = 0
            long r19 = r12 - r16
            int r8 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00dd
            r21.m46303d()     // Catch:{ Exception -> 0x0138 }
            r16 = r12
        L_0x00dd:
            r8 = 0
            long r12 = r12 - r2
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r6
            int r8 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r8 > 0) goto L_0x00ed
            r12 = r18
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x0086
        L_0x00ed:
            java.lang.String r12 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            r1.append(r6)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0032 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            throw r1     // Catch:{ Exception -> 0x0032 }
        L_0x010d:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.f40621j     // Catch:{ Exception -> 0x0032 }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x0032 }
            r2 = 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "Precache abort at "
            r3.append(r2)     // Catch:{ Exception -> 0x0032 }
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = " bytes"
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0032 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0032 }
            throw r0     // Catch:{ Exception -> 0x0032 }
        L_0x0133:
            r0 = move-exception
            r18 = r12
        L_0x0136:
            monitor-exit(r8)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            r12 = r18
            goto L_0x0141
        L_0x013c:
            r0 = move-exception
            goto L_0x0136
        L_0x013e:
            r0 = move-exception
            r18 = r12
        L_0x0141:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = java.lang.String.valueOf(r22)
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
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.acd.m45783e(r1)
            r9.mo39655a(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alx.mo39656a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo39647a() {
        this.f40618g = true;
    }

    /* renamed from: c */
    public final ByteBuffer mo39678c() {
        synchronized (this.f40623l) {
            if (this.f40621j != null && !this.f40622k) {
                this.f40621j.flip();
                this.f40622k = true;
            }
            this.f40618g = true;
        }
        return this.f40621j;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo39621a(Object obj, brg brg) {
        bre bre = (bre) obj;
        if (bre instanceof bri) {
            this.f40619h.mo39676a((bri) bre);
        }
    }
}
