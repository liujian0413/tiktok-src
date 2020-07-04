package com.google.api.client.http;

import com.google.api.client.util.C17379u;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.C17387z;

/* renamed from: com.google.api.client.http.o */
public final class C17266o {

    /* renamed from: a */
    public C17260k f48096a;

    /* renamed from: b */
    public C17261l f48097b = new C17261l();

    /* renamed from: c */
    public C17261l f48098c = new C17261l();

    /* renamed from: d */
    public int f48099d = 10;

    /* renamed from: e */
    public int f48100e = 16384;

    /* renamed from: f */
    public boolean f48101f = true;

    /* renamed from: g */
    public boolean f48102g = true;

    /* renamed from: h */
    public C17257h f48103h;

    /* renamed from: i */
    public final C17272u f48104i;

    /* renamed from: j */
    public String f48105j;

    /* renamed from: k */
    public C17256g f48106k;

    /* renamed from: l */
    public int f48107l = 20000;

    /* renamed from: m */
    public int f48108m = 20000;

    /* renamed from: n */
    public C17273v f48109n;

    /* renamed from: o */
    public C17264m f48110o;

    /* renamed from: p */
    public C17270s f48111p;

    /* renamed from: q */
    public C17379u f48112q;

    /* renamed from: r */
    public C17258i f48113r;

    /* renamed from: s */
    public C17250c f48114s;

    /* renamed from: t */
    public boolean f48115t = true;

    /* renamed from: u */
    public boolean f48116u = true;

    /* renamed from: v */
    public boolean f48117v = false;

    /* renamed from: w */
    public boolean f48118w;

    /* renamed from: x */
    public C17387z f48119x = C17387z.f48334a;

    /* renamed from: a */
    public final C17266o mo44651a(boolean z) {
        this.f48116u = z;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x026b A[SYNTHETIC, Splitter:B:106:0x026b] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02ea A[LOOP:0: B:5:0x001b->B:158:0x02ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.api.client.http.C17269r mo44652a() throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.f48099d
            r3 = 1
            if (r0 < 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            com.google.api.client.util.C17384w.m57850a(r0)
            int r0 = r1.f48099d
            java.lang.String r4 = r1.f48105j
            com.google.api.client.util.C17384w.m57847a(r4)
            com.google.api.client.http.g r4 = r1.f48106k
            com.google.api.client.util.C17384w.m57847a(r4)
            r5 = r0
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            r0.mo44660d()
        L_0x0020:
            com.google.api.client.http.k r0 = r1.f48096a
            if (r0 == 0) goto L_0x0029
            com.google.api.client.http.k r0 = r1.f48096a
            r0.mo44481b(r1)
        L_0x0029:
            com.google.api.client.http.g r0 = r1.f48106k
            java.lang.String r0 = r0.mo44609c()
            com.google.api.client.http.u r6 = r1.f48104i
            java.lang.String r7 = r1.f48105j
            com.google.api.client.http.x r6 = r6.mo44581a(r7, r0)
            java.util.logging.Logger r7 = com.google.api.client.http.C17272u.f48133a
            boolean r8 = r1.f48101f
            if (r8 == 0) goto L_0x0047
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG
            boolean r8 = r7.isLoggable(r8)
            if (r8 == 0) goto L_0x0047
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 == 0) goto L_0x008b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "-------------- REQUEST  --------------"
            r9.append(r10)
            java.lang.String r10 = com.google.api.client.util.C17347ab.f48262a
            r9.append(r10)
            java.lang.String r10 = r1.f48105j
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = com.google.api.client.util.C17347ab.f48262a
            r9.append(r10)
            boolean r10 = r1.f48102g
            if (r10 == 0) goto L_0x008c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "curl -v --compressed"
            r10.<init>(r11)
            java.lang.String r11 = r1.f48105j
            java.lang.String r12 = "GET"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x008d
            java.lang.String r11 = " -X "
            r10.append(r11)
            java.lang.String r11 = r1.f48105j
            r10.append(r11)
            goto L_0x008d
        L_0x008b:
            r9 = 0
        L_0x008c:
            r10 = 0
        L_0x008d:
            com.google.api.client.http.l r11 = r1.f48097b
            java.lang.String r11 = r11.mo44626e()
            boolean r12 = r1.f48118w
            if (r12 != 0) goto L_0x00d8
            if (r11 != 0) goto L_0x00a1
            com.google.api.client.http.l r12 = r1.f48097b
            java.lang.String r13 = "Google-HTTP-Java-Client/1.23.0 (gzip)"
            r12.mo44632k(r13)
            goto L_0x00d8
        L_0x00a1:
            com.google.api.client.http.l r12 = r1.f48097b
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = "Google-HTTP-Java-Client/1.23.0 (gzip)"
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r16 = r13.length()
            int r16 = r16 + 1
            int r17 = r14.length()
            int r2 = r16 + r17
            r15.<init>(r2)
            r15.append(r13)
            java.lang.String r2 = " "
            r15.append(r2)
            r15.append(r14)
            java.lang.String r2 = r15.toString()
            r12.mo44632k(r2)
        L_0x00d8:
            com.google.api.client.http.l r2 = r1.f48097b
            com.google.api.client.http.C17261l.m57387a(r2, r9, r10, r7, r6)
            boolean r2 = r1.f48118w
            if (r2 != 0) goto L_0x00e6
            com.google.api.client.http.l r2 = r1.f48097b
            r2.mo44632k(r11)
        L_0x00e6:
            com.google.api.client.http.h r2 = r1.f48103h
            if (r2 == 0) goto L_0x00f5
            com.google.api.client.http.h r11 = r1.f48103h
            boolean r11 = r11.mo44567d()
            if (r11 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r11 = 0
            goto L_0x00f6
        L_0x00f5:
            r11 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x01f6
            com.google.api.client.http.h r14 = r1.f48103h
            java.lang.String r14 = r14.mo44566c()
            if (r8 == 0) goto L_0x010c
            com.google.api.client.util.s r15 = new com.google.api.client.util.s
            java.util.logging.Logger r3 = com.google.api.client.http.C17272u.f48133a
            java.util.logging.Level r4 = java.util.logging.Level.CONFIG
            int r12 = r1.f48100e
            r15.<init>(r2, r3, r4, r12)
            goto L_0x010d
        L_0x010c:
            r15 = r2
        L_0x010d:
            com.google.api.client.http.i r2 = r1.f48113r
            if (r2 != 0) goto L_0x011a
            com.google.api.client.http.h r2 = r1.f48103h
            long r12 = r2.mo44564a()
            r2 = r15
            r4 = 0
            goto L_0x0130
        L_0x011a:
            com.google.api.client.http.i r2 = r1.f48113r
            java.lang.String r4 = r2.mo44603a()
            com.google.api.client.http.j r2 = new com.google.api.client.http.j
            com.google.api.client.http.i r3 = r1.f48113r
            r2.<init>(r15, r3)
            if (r11 == 0) goto L_0x012e
            long r12 = com.google.api.client.util.C17372l.m57833a(r2)
            goto L_0x0130
        L_0x012e:
            r12 = -1
        L_0x0130:
            if (r8 == 0) goto L_0x01e7
            if (r14 == 0) goto L_0x017c
            java.lang.String r3 = "Content-Type: "
            java.lang.String r15 = java.lang.String.valueOf(r14)
            int r16 = r15.length()
            if (r16 == 0) goto L_0x0146
            java.lang.String r3 = r3.concat(r15)
            r15 = r3
            goto L_0x014b
        L_0x0146:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r3)
        L_0x014b:
            r9.append(r15)
            java.lang.String r3 = com.google.api.client.util.C17347ab.f48262a
            r9.append(r3)
            if (r10 == 0) goto L_0x017c
            java.lang.String r3 = java.lang.String.valueOf(r15)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r16 = r3.length()
            int r1 = r16 + 6
            r15.<init>(r1)
            java.lang.String r1 = " -H '"
            r15.append(r1)
            r15.append(r3)
            java.lang.String r1 = "'"
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            r10.append(r1)
        L_0x017c:
            if (r4 == 0) goto L_0x01c6
            java.lang.String r1 = "Content-Encoding: "
            java.lang.String r3 = java.lang.String.valueOf(r4)
            int r15 = r3.length()
            if (r15 == 0) goto L_0x018f
            java.lang.String r1 = r1.concat(r3)
            goto L_0x0195
        L_0x018f:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            r1 = r3
        L_0x0195:
            r9.append(r1)
            java.lang.String r3 = com.google.api.client.util.C17347ab.f48262a
            r9.append(r3)
            if (r10 == 0) goto L_0x01c6
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r15 = r1.length()
            int r15 = r15 + 6
            r3.<init>(r15)
            java.lang.String r15 = " -H '"
            r3.append(r15)
            r3.append(r1)
            java.lang.String r1 = "'"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r10.append(r1)
        L_0x01c6:
            r15 = 0
            int r1 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r1 < 0) goto L_0x01e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 36
            r1.<init>(r3)
            java.lang.String r3 = "Content-Length: "
            r1.append(r3)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.String r1 = com.google.api.client.util.C17347ab.f48262a
            r9.append(r1)
        L_0x01e7:
            if (r10 == 0) goto L_0x01ee
            java.lang.String r1 = " -d '@-'"
            r10.append(r1)
        L_0x01ee:
            r6.f48140c = r14
            r6.f48139b = r4
            r6.f48138a = r12
            r6.f48141d = r2
        L_0x01f6:
            if (r8 == 0) goto L_0x0224
            java.lang.String r1 = r9.toString()
            r7.config(r1)
            if (r10 == 0) goto L_0x0224
            java.lang.String r1 = " -- '"
            r10.append(r1)
            java.lang.String r1 = "'"
            java.lang.String r3 = "'\"'\"'"
            java.lang.String r0 = r0.replaceAll(r1, r3)
            r10.append(r0)
            java.lang.String r0 = "'"
            r10.append(r0)
            if (r2 == 0) goto L_0x021d
            java.lang.String r0 = " << $$$"
            r10.append(r0)
        L_0x021d:
            java.lang.String r0 = r10.toString()
            r7.config(r0)
        L_0x0224:
            if (r11 == 0) goto L_0x022c
            if (r5 <= 0) goto L_0x022c
            r1 = r18
            r2 = 1
            goto L_0x022f
        L_0x022c:
            r1 = r18
            r2 = 0
        L_0x022f:
            int r0 = r1.f48107l
            int r3 = r1.f48108m
            r6.mo44569a(r0, r3)
            com.google.api.client.http.y r3 = r6.mo44568a()     // Catch:{ IOException -> 0x024d }
            com.google.api.client.http.r r0 = new com.google.api.client.http.r     // Catch:{ all -> 0x0242 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0242 }
            r3 = r0
            r4 = 0
            goto L_0x0269
        L_0x0242:
            r0 = move-exception
            java.io.InputStream r3 = r3.mo44571a()     // Catch:{ IOException -> 0x024d }
            if (r3 == 0) goto L_0x024c
            r3.close()     // Catch:{ IOException -> 0x024d }
        L_0x024c:
            throw r0     // Catch:{ IOException -> 0x024d }
        L_0x024d:
            r0 = move-exception
            r4 = r0
            boolean r0 = r1.f48117v
            if (r0 != 0) goto L_0x0261
            com.google.api.client.http.m r0 = r1.f48110o
            if (r0 == 0) goto L_0x0260
            com.google.api.client.http.m r0 = r1.f48110o
            boolean r0 = r0.mo44526a(r1, r2)
            if (r0 == 0) goto L_0x0260
            goto L_0x0261
        L_0x0260:
            throw r4
        L_0x0261:
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            java.lang.String r3 = "exception thrown while executing request"
            r7.log(r0, r3, r4)
            r3 = 0
        L_0x0269:
            if (r3 == 0) goto L_0x02bd
            boolean r0 = r3.mo44658b()     // Catch:{ all -> 0x02b6 }
            if (r0 != 0) goto L_0x02bd
            com.google.api.client.http.v r0 = r1.f48109n     // Catch:{ all -> 0x02b6 }
            if (r0 == 0) goto L_0x027c
            com.google.api.client.http.v r0 = r1.f48109n     // Catch:{ all -> 0x02b6 }
            boolean r0 = r0.mo44486a(r1, r3, r2)     // Catch:{ all -> 0x02b6 }
            goto L_0x027d
        L_0x027c:
            r0 = 0
        L_0x027d:
            if (r0 != 0) goto L_0x02af
            int r6 = r3.f48126e     // Catch:{ all -> 0x02b6 }
            com.google.api.client.http.l r7 = r3.mo44656a()     // Catch:{ all -> 0x02b6 }
            boolean r6 = r1.m57433a(r6, r7)     // Catch:{ all -> 0x02b6 }
            if (r6 == 0) goto L_0x028d
        L_0x028b:
            r0 = 1
            goto L_0x02af
        L_0x028d:
            if (r2 == 0) goto L_0x02af
            com.google.api.client.http.c r6 = r1.f48114s     // Catch:{ all -> 0x02b6 }
            if (r6 == 0) goto L_0x02af
            com.google.api.client.http.c r6 = r1.f48114s     // Catch:{ all -> 0x02b6 }
            int r7 = r3.f48126e     // Catch:{ all -> 0x02b6 }
            boolean r6 = r6.mo44601a(r7)     // Catch:{ all -> 0x02b6 }
            if (r6 == 0) goto L_0x02af
            com.google.api.client.http.c r6 = r1.f48114s     // Catch:{ all -> 0x02b6 }
            long r6 = r6.mo44600a()     // Catch:{ all -> 0x02b6 }
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x02af
            com.google.api.client.util.z r0 = r1.f48119x     // Catch:{ InterruptedException -> 0x028b }
            r0.mo44872a(r6)     // Catch:{ InterruptedException -> 0x028b }
            goto L_0x028b
        L_0x02af:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x02c3
            r3.mo44660d()     // Catch:{ all -> 0x02b6 }
            goto L_0x02c3
        L_0x02b6:
            r0 = move-exception
            if (r3 == 0) goto L_0x02bc
            r3.mo44661e()
        L_0x02bc:
            throw r0
        L_0x02bd:
            if (r3 != 0) goto L_0x02c1
            r0 = 1
            goto L_0x02c2
        L_0x02c1:
            r0 = 0
        L_0x02c2:
            r0 = r0 & r2
        L_0x02c3:
            int r5 = r5 + -1
            if (r0 != 0) goto L_0x02ea
            if (r3 == 0) goto L_0x02e9
            com.google.api.client.http.s r0 = r1.f48111p
            if (r0 == 0) goto L_0x02d2
            com.google.api.client.http.s r0 = r1.f48111p
            r0.mo44508a(r3)
        L_0x02d2:
            boolean r0 = r1.f48116u
            if (r0 == 0) goto L_0x02e8
            boolean r0 = r3.mo44658b()
            if (r0 == 0) goto L_0x02dd
            goto L_0x02e8
        L_0x02dd:
            com.google.api.client.http.HttpResponseException r0 = new com.google.api.client.http.HttpResponseException     // Catch:{ all -> 0x02e3 }
            r0.<init>(r3)     // Catch:{ all -> 0x02e3 }
            throw r0     // Catch:{ all -> 0x02e3 }
        L_0x02e3:
            r0 = move-exception
            r3.mo44661e()
            throw r0
        L_0x02e8:
            return r3
        L_0x02e9:
            throw r4
        L_0x02ea:
            r0 = r3
            r3 = 1
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.http.C17266o.mo44652a():com.google.api.client.http.r");
    }

    /* renamed from: a */
    public final C17266o mo44643a(C17257h hVar) {
        this.f48103h = hVar;
        return this;
    }

    /* renamed from: a */
    public final C17266o mo44644a(C17258i iVar) {
        this.f48113r = iVar;
        return this;
    }

    /* renamed from: a */
    public final C17266o mo44642a(C17256g gVar) {
        this.f48106k = (C17256g) C17384w.m57847a(gVar);
        return this;
    }

    /* renamed from: a */
    public final C17266o mo44645a(C17260k kVar) {
        this.f48096a = kVar;
        return this;
    }

    /* renamed from: a */
    public final C17266o mo44646a(C17264m mVar) {
        this.f48110o = mVar;
        return this;
    }

    /* renamed from: a */
    public final C17266o mo44647a(C17270s sVar) {
        this.f48111p = sVar;
        return this;
    }

    /* renamed from: a */
    public final C17266o mo44648a(C17273v vVar) {
        this.f48109n = vVar;
        return this;
    }

    /* renamed from: a */
    public final C17266o mo44649a(C17379u uVar) {
        this.f48112q = uVar;
        return this;
    }

    /* renamed from: a */
    public final C17266o mo44650a(String str) {
        boolean z;
        if (str == null || C17265n.m57421b(str)) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57850a(z);
        this.f48105j = str;
        return this;
    }

    C17266o(C17272u uVar, String str) {
        this.f48104i = uVar;
        mo44650a((String) null);
    }

    /* renamed from: a */
    private boolean m57433a(int i, C17261l lVar) {
        String c = lVar.mo44622c();
        if (!this.f48115t || !C17271t.m57460b(i) || c == null) {
            return false;
        }
        mo44642a(new C17256g(this.f48106k.mo44607a(c)));
        if (i == 303) {
            mo44650a("GET");
            mo44643a((C17257h) null);
        }
        this.f48097b.mo44620b((String) null);
        this.f48097b.mo44628g(null);
        this.f48097b.mo44629h(null);
        this.f48097b.mo44627f(null);
        this.f48097b.mo44630i(null);
        this.f48097b.mo44631j(null);
        return true;
    }
}
