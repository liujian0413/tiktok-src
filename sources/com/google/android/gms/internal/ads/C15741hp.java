package com.google.android.gms.internal.ads;

import com.C1642a;

/* renamed from: com.google.android.gms.internal.ads.hp */
public class C15741hp implements blv {

    /* renamed from: a */
    private static final boolean f44475a = C15633dq.f44343a;

    /* renamed from: b */
    private final C15960ps f44476b;

    /* renamed from: c */
    private final C15716gr f44477c;

    /* renamed from: d */
    private final C15768ip f44478d;

    public C15741hp(C15960ps psVar) {
        this(psVar, new C15768ip(4096));
    }

    private C15741hp(C15960ps psVar, C15768ip ipVar) {
        this.f44476b = psVar;
        this.f44477c = new C15689fr(psVar);
        this.f44478d = ipVar;
    }

    public C15741hp(C15716gr grVar) {
        this(grVar, new C15768ip(4096));
    }

    private C15741hp(C15716gr grVar, C15768ip ipVar) {
        this.f44477c = grVar;
        this.f44476b = grVar;
        this.f44478d = ipVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c3, code lost:
        if (r0 < 400) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cf, code lost:
        throw new com.google.android.gms.internal.ads.zzg(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d2, code lost:
        if (r0 < 500) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01dd, code lost:
        throw new com.google.android.gms.internal.ads.zzac(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e3, code lost:
        throw new com.google.android.gms.internal.ads.zzac(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e4, code lost:
        m51009a("auth", r2, new com.google.android.gms.internal.ads.zza(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f0, code lost:
        m51009a("network", r2, new com.google.android.gms.internal.ads.zzo());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0201, code lost:
        throw new com.google.android.gms.internal.ads.zzq(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0202, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0203, code lost:
        r4 = "Bad URL ";
        r2 = java.lang.String.valueOf(r2.f43252b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0211, code lost:
        if (r2.length() != 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0213, code lost:
        r2 = r4.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0218, code lost:
        r2 = new java.lang.String(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0220, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0221, code lost:
        m51009a("socket", r2, new com.google.android.gms.internal.ads.zzad());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        r17 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0144, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0145, code lost:
        r13 = r5;
        r17 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0182, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0184, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0185, code lost:
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0186, code lost:
        r13 = r5;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0190, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0193, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0194, code lost:
        r17 = r5;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019a, code lost:
        r0 = r10.f44829a;
        r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r0), r2.f43252b};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a8, code lost:
        if (r13 != null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01aa, code lost:
        r11 = new com.google.android.gms.internal.ads.bor(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ba, code lost:
        if (r0 == 401) goto L_0x01e4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0202 A[ExcHandler: MalformedURLException (r0v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.bor mo39236a(com.google.android.gms.internal.ads.bqk<?> r22) throws com.google.android.gms.internal.ads.zzae {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 1
            r7 = 2
            r9 = 0
            com.google.android.gms.internal.ads.aux r0 = r2.f43256f     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            if (r0 != 0) goto L_0x0018
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            goto L_0x003c
        L_0x0018:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            r10.<init>()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            java.lang.String r11 = r0.f41067b     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            if (r11 == 0) goto L_0x0028
            java.lang.String r11 = "If-None-Match"
            java.lang.String r12 = r0.f41067b     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            r10.put(r11, r12)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
        L_0x0028:
            long r11 = r0.f41069d     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x003b
            java.lang.String r11 = "If-Modified-Since"
            long r12 = r0.f41069d     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            java.lang.String r0 = com.google.android.gms.internal.ads.C15904nq.m51393a(r12)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            r10.put(r11, r0)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
        L_0x003b:
            r0 = r10
        L_0x003c:
            com.google.android.gms.internal.ads.gr r10 = r1.f44477c     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            com.google.android.gms.internal.ads.or r10 = r10.mo41636a(r2, r0)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0193 }
            int r12 = r10.f44829a     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x018f }
            java.util.List r11 = r10.mo41814a()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x018f }
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x0113
            com.google.android.gms.internal.ads.aux r0 = r2.f43256f     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r0 != 0) goto L_0x0065
            com.google.android.gms.internal.ads.bor r0 = new com.google.android.gms.internal.ads.bor     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r16 = 1
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r5 = 0
            long r17 = r12 - r3
            r13 = r0
            r19 = r11
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            return r0
        L_0x0065:
            java.util.TreeSet r5 = new java.util.TreeSet     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.util.Comparator r12 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r5.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            boolean r12 = r11.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r12 != 0) goto L_0x0088
            java.util.Iterator r12 = r11.iterator()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
        L_0x0076:
            boolean r13 = r12.hasNext()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r13 == 0) goto L_0x0088
            java.lang.Object r13 = r12.next()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            com.google.android.gms.internal.ads.bky r13 = (com.google.android.gms.internal.ads.bky) r13     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.lang.String r13 = r13.f42430a     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r5.add(r13)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            goto L_0x0076
        L_0x0088:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r12.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.util.List<com.google.android.gms.internal.ads.bky> r13 = r0.f41073h     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r13 == 0) goto L_0x00b7
            java.util.List<com.google.android.gms.internal.ads.bky> r13 = r0.f41073h     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r13 != 0) goto L_0x00f6
            java.util.List<com.google.android.gms.internal.ads.bky> r13 = r0.f41073h     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
        L_0x009f:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r14 == 0) goto L_0x00f6
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            com.google.android.gms.internal.ads.bky r14 = (com.google.android.gms.internal.ads.bky) r14     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.lang.String r15 = r14.f42430a     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            boolean r15 = r5.contains(r15)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r15 != 0) goto L_0x009f
            r12.add(r14)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            goto L_0x009f
        L_0x00b7:
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f41072g     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r13 != 0) goto L_0x00f6
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f41072g     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.util.Set r13 = r13.entrySet()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
        L_0x00c9:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r14 == 0) goto L_0x00f6
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.lang.Object r15 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            boolean r15 = r5.contains(r15)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            if (r15 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.bky r15 = new com.google.android.gms.internal.ads.bky     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.lang.Object r16 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.lang.Object r14 = r14.getValue()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r15.<init>(r8, r14)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r12.add(r15)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            goto L_0x00c9
        L_0x00f6:
            com.google.android.gms.internal.ads.bor r5 = new com.google.android.gms.internal.ads.bor     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r15 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.f41066a     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r17 = 1
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            r8 = 0
            long r18 = r13 - r3
            r14 = r5
            r16 = r0
            r20 = r12
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            return r5
        L_0x010e:
            r0 = move-exception
            r17 = r11
            goto L_0x0197
        L_0x0113:
            java.io.InputStream r0 = r10.f44831c     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x018a }
            if (r0 == 0) goto L_0x011e
            int r5 = r10.f44830b     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            byte[] r0 = r1.m51010a(r0, r5)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x010e }
            goto L_0x0120
        L_0x011e:
            byte[] r0 = new byte[r9]     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x018a }
        L_0x0120:
            r5 = r0
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r0 = 0
            long r13 = r13 - r3
            boolean r0 = f44475a     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            if (r0 != 0) goto L_0x0131
            r15 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0161
        L_0x0131:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r0[r9] = r2     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r0[r6] = r8     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            if (r5 == 0) goto L_0x0149
            int r8 = r5.length     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0144 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0144 }
            goto L_0x014b
        L_0x0144:
            r0 = move-exception
            r13 = r5
            r17 = r11
            goto L_0x0198
        L_0x0149:
            java.lang.String r8 = "null"
        L_0x014b:
            r0[r7] = r8     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r8 = 3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r0[r8] = r13     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r8 = 4
            com.google.android.gms.internal.ads.ab r13 = r2.f43255e     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            int r13 = r13.mo39066b()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r0[r8] = r13     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
        L_0x0161:
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 < r0) goto L_0x017b
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x017b
            com.google.android.gms.internal.ads.bor r0 = new com.google.android.gms.internal.ads.bor     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r14 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0184 }
            r8 = 0
            long r15 = r15 - r3
            r8 = r11
            r11 = r0
            r13 = r5
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0182 }
            return r0
        L_0x017b:
            r8 = r11
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0182 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0182 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0221, MalformedURLException -> 0x0202, IOException -> 0x0182 }
        L_0x0182:
            r0 = move-exception
            goto L_0x0186
        L_0x0184:
            r0 = move-exception
            r8 = r11
        L_0x0186:
            r13 = r5
            r17 = r8
            goto L_0x0198
        L_0x018a:
            r0 = move-exception
            r8 = r11
            r17 = r8
            goto L_0x0197
        L_0x018f:
            r0 = move-exception
            r17 = r5
            goto L_0x0197
        L_0x0193:
            r0 = move-exception
            r17 = r5
            r10 = 0
        L_0x0197:
            r13 = 0
        L_0x0198:
            if (r10 == 0) goto L_0x01fc
            int r0 = r10.f44829a
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5[r9] = r7
            java.lang.String r7 = r2.f43252b
            r5[r6] = r7
            if (r13 == 0) goto L_0x01f0
            com.google.android.gms.internal.ads.bor r5 = new com.google.android.gms.internal.ads.bor
            r14 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r15 = r6 - r3
            r11 = r5
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r17)
            r6 = 401(0x191, float:5.62E-43)
            if (r0 == r6) goto L_0x01e4
            r6 = 403(0x193, float:5.65E-43)
            if (r0 != r6) goto L_0x01c1
            goto L_0x01e4
        L_0x01c1:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x01d0
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            com.google.android.gms.internal.ads.zzg r0 = new com.google.android.gms.internal.ads.zzg
            r0.<init>(r5)
            throw r0
        L_0x01d0:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x01de
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x01de
            com.google.android.gms.internal.ads.zzac r0 = new com.google.android.gms.internal.ads.zzac
            r0.<init>(r5)
            throw r0
        L_0x01de:
            com.google.android.gms.internal.ads.zzac r0 = new com.google.android.gms.internal.ads.zzac
            r0.<init>(r5)
            throw r0
        L_0x01e4:
            java.lang.String r0 = "auth"
            com.google.android.gms.internal.ads.zza r6 = new com.google.android.gms.internal.ads.zza
            r6.<init>(r5)
            m51009a(r0, r2, r6)
            goto L_0x0008
        L_0x01f0:
            java.lang.String r0 = "network"
            com.google.android.gms.internal.ads.zzo r5 = new com.google.android.gms.internal.ads.zzo
            r5.<init>()
            m51009a(r0, r2, r5)
            goto L_0x0008
        L_0x01fc:
            com.google.android.gms.internal.ads.zzq r2 = new com.google.android.gms.internal.ads.zzq
            r2.<init>(r0)
            throw r2
        L_0x0202:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r2.f43252b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 == 0) goto L_0x0218
            java.lang.String r2 = r4.concat(r2)
            goto L_0x021d
        L_0x0218:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x021d:
            r3.<init>(r2, r0)
            throw r3
        L_0x0221:
            java.lang.String r0 = "socket"
            com.google.android.gms.internal.ads.zzad r5 = new com.google.android.gms.internal.ads.zzad
            r5.<init>()
            m51009a(r0, r2, r5)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15741hp.mo39236a(com.google.android.gms.internal.ads.bqk):com.google.android.gms.internal.ads.bor");
    }

    /* renamed from: a */
    private static void m51009a(String str, bqk<?> bqk, zzae zzae) throws zzae {
        C15467ab abVar = bqk.f43255e;
        int d = bqk.mo41154d();
        try {
            abVar.mo39065a(zzae);
            bqk.mo41150b(C1642a.m8034a("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(d)}));
        } catch (zzae e) {
            bqk.mo41150b(C1642a.m8034a("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(d)}));
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[SYNTHETIC, Splitter:B:22:0x003e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] m51010a(java.io.InputStream r5, int r6) throws java.io.IOException, com.google.android.gms.internal.ads.zzac {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.tn r0 = new com.google.android.gms.internal.ads.tn
            com.google.android.gms.internal.ads.ip r1 = r4.f44478d
            r0.<init>(r1, r6)
            r6 = 0
            if (r5 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.ip r1 = r4.f44478d     // Catch:{ all -> 0x003b }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r1 = r1.mo41661a(r2)     // Catch:{ all -> 0x003b }
        L_0x0012:
            int r6 = r5.read(r1)     // Catch:{ all -> 0x0030 }
            r2 = -1
            if (r6 == r2) goto L_0x001e
            r2 = 0
            r0.write(r1, r2, r6)     // Catch:{ all -> 0x0030 }
            goto L_0x0012
        L_0x001e:
            byte[] r6 = r0.toByteArray()     // Catch:{ all -> 0x0030 }
            if (r5 == 0) goto L_0x0027
            r5.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            com.google.android.gms.internal.ads.ip r5 = r4.f44478d
            r5.mo41660a(r1)
            r0.close()
            return r6
        L_0x0030:
            r6 = move-exception
            r3 = r1
            r1 = r6
            r6 = r3
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.ads.zzac r1 = new com.google.android.gms.internal.ads.zzac     // Catch:{ all -> 0x003b }
            r1.<init>()     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
        L_0x003c:
            if (r5 == 0) goto L_0x0041
            r5.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            com.google.android.gms.internal.ads.ip r5 = r4.f44478d
            r5.mo41660a(r6)
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15741hp.m51010a(java.io.InputStream, int):byte[]");
    }
}
