package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public final class bom implements bnd, bnk {

    /* renamed from: a */
    private static final bng f43015a = new bon();

    /* renamed from: b */
    private static final int f43016b = bsf.m49946c("qt  ");

    /* renamed from: c */
    private final bsa f43017c = new bsa(brx.f43370a);

    /* renamed from: d */
    private final bsa f43018d = new bsa(4);

    /* renamed from: e */
    private final bsa f43019e = new bsa(16);

    /* renamed from: f */
    private final Stack<boa> f43020f = new Stack<>();

    /* renamed from: g */
    private int f43021g;

    /* renamed from: h */
    private int f43022h;

    /* renamed from: i */
    private long f43023i;

    /* renamed from: j */
    private int f43024j;

    /* renamed from: k */
    private bsa f43025k;

    /* renamed from: l */
    private int f43026l;

    /* renamed from: m */
    private int f43027m;

    /* renamed from: n */
    private bnf f43028n;

    /* renamed from: o */
    private boo[] f43029o;

    /* renamed from: p */
    private long f43030p;

    /* renamed from: q */
    private boolean f43031q;

    /* renamed from: a */
    public final boolean mo41001a() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo41016a(bne bne) throws IOException, InterruptedException {
        return bop.m49563a(bne);
    }

    /* renamed from: a */
    public final void mo41015a(bnf bnf) {
        this.f43028n = bnf;
    }

    /* renamed from: a */
    public final void mo41014a(long j, long j2) {
        boo[] booArr;
        this.f43020f.clear();
        this.f43024j = 0;
        this.f43026l = 0;
        this.f43027m = 0;
        if (j == 0) {
            m49554c();
            return;
        }
        if (this.f43029o != null) {
            for (boo boo : this.f43029o) {
                bot bot = boo.f43033b;
                int a = bot.mo41056a(j2);
                if (a == -1) {
                    a = bot.mo41057b(j2);
                }
                boo.f43035d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x01a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0006 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41013a(com.google.android.gms.internal.ads.bne r25, com.google.android.gms.internal.ads.bnj r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
        L_0x0006:
            int r3 = r0.f43021g
            r5 = 262144(0x40000, double:1.295163E-318)
            r8 = -1
            r9 = 8
            r10 = 1
            switch(r3) {
                case 0: goto L_0x01a2;
                case 1: goto L_0x0119;
                case 2: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0018:
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r9 = -1
        L_0x001f:
            com.google.android.gms.internal.ads.boo[] r14 = r0.f43029o
            int r14 = r14.length
            if (r3 >= r14) goto L_0x003f
            com.google.android.gms.internal.ads.boo[] r14 = r0.f43029o
            r14 = r14[r3]
            int r15 = r14.f43035d
            com.google.android.gms.internal.ads.bot r7 = r14.f43033b
            int r7 = r7.f43057a
            if (r15 == r7) goto L_0x003c
            com.google.android.gms.internal.ads.bot r7 = r14.f43033b
            long[] r7 = r7.f43058b
            r14 = r7[r15]
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x003c
            r9 = r3
            r12 = r14
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x003f:
            if (r9 != r8) goto L_0x0042
            return r8
        L_0x0042:
            com.google.android.gms.internal.ads.boo[] r3 = r0.f43029o
            r3 = r3[r9]
            com.google.android.gms.internal.ads.bnm r7 = r3.f43034c
            int r8 = r3.f43035d
            com.google.android.gms.internal.ads.bot r9 = r3.f43033b
            long[] r9 = r9.f43058b
            r12 = r9[r8]
            com.google.android.gms.internal.ads.bot r9 = r3.f43033b
            int[] r9 = r9.f43059c
            r9 = r9[r8]
            com.google.android.gms.internal.ads.boq r14 = r3.f43032a
            int r14 = r14.f43043g
            if (r14 != r10) goto L_0x0061
            r14 = 8
            long r12 = r12 + r14
            int r9 = r9 + -8
        L_0x0061:
            long r14 = r25.mo41007b()
            long r14 = r12 - r14
            int r4 = r0.f43026l
            long r10 = (long) r4
            long r14 = r14 + r10
            r10 = 0
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0115
            int r4 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0077
            goto L_0x0115
        L_0x0077:
            int r2 = (int) r14
            r1.mo41008b(r2)
            com.google.android.gms.internal.ads.boq r2 = r3.f43032a
            int r2 = r2.f43046j
            if (r2 == 0) goto L_0x00da
            com.google.android.gms.internal.ads.bsa r2 = r0.f43018d
            byte[] r2 = r2.f43388a
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r5 = 2
            r2[r5] = r4
            com.google.android.gms.internal.ads.boq r2 = r3.f43032a
            int r2 = r2.f43046j
            com.google.android.gms.internal.ads.boq r4 = r3.f43032a
            int r4 = r4.f43046j
            r5 = 4
            int r4 = 4 - r4
        L_0x0099:
            int r5 = r0.f43026l
            if (r5 >= r9) goto L_0x00f2
            int r5 = r0.f43027m
            if (r5 != 0) goto L_0x00c8
            com.google.android.gms.internal.ads.bsa r5 = r0.f43018d
            byte[] r5 = r5.f43388a
            r1.mo41009b(r5, r4, r2)
            com.google.android.gms.internal.ads.bsa r5 = r0.f43018d
            r6 = 0
            r5.mo41223c(r6)
            com.google.android.gms.internal.ads.bsa r5 = r0.f43018d
            int r5 = r5.mo41235m()
            r0.f43027m = r5
            com.google.android.gms.internal.ads.bsa r5 = r0.f43017c
            r5.mo41223c(r6)
            com.google.android.gms.internal.ads.bsa r5 = r0.f43017c
            r10 = 4
            r7.mo41024a(r5, r10)
            int r5 = r0.f43026l
            int r5 = r5 + r10
            r0.f43026l = r5
            int r9 = r9 + r4
            goto L_0x0099
        L_0x00c8:
            r6 = 0
            int r5 = r0.f43027m
            int r5 = r7.mo41022a(r1, r5, r6)
            int r6 = r0.f43026l
            int r6 = r6 + r5
            r0.f43026l = r6
            int r6 = r0.f43027m
            int r6 = r6 - r5
            r0.f43027m = r6
            goto L_0x0099
        L_0x00da:
            int r2 = r0.f43026l
            if (r2 >= r9) goto L_0x00f2
            int r2 = r0.f43026l
            int r2 = r9 - r2
            r4 = 0
            int r2 = r7.mo41022a(r1, r2, r4)
            int r4 = r0.f43026l
            int r4 = r4 + r2
            r0.f43026l = r4
            int r4 = r0.f43027m
            int r4 = r4 - r2
            r0.f43027m = r4
            goto L_0x00da
        L_0x00f2:
            r20 = r9
            com.google.android.gms.internal.ads.bot r1 = r3.f43033b
            long[] r1 = r1.f43061e
            r17 = r1[r8]
            com.google.android.gms.internal.ads.bot r1 = r3.f43033b
            int[] r1 = r1.f43062f
            r19 = r1[r8]
            r21 = 0
            r22 = 0
            r16 = r7
            r16.mo41023a(r17, r19, r20, r21, r22)
            int r1 = r3.f43035d
            r4 = 1
            int r1 = r1 + r4
            r3.f43035d = r1
            r1 = 0
            r0.f43026l = r1
            r0.f43027m = r1
            return r1
        L_0x0115:
            r4 = 1
            r2.f42733a = r12
            return r4
        L_0x0119:
            long r3 = r0.f43023i
            int r7 = r0.f43024j
            long r7 = (long) r7
            long r3 = r3 - r7
            long r7 = r25.mo41007b()
            long r7 = r7 + r3
            com.google.android.gms.internal.ads.bsa r10 = r0.f43025k
            if (r10 == 0) goto L_0x017d
            com.google.android.gms.internal.ads.bsa r5 = r0.f43025k
            byte[] r5 = r5.f43388a
            int r6 = r0.f43024j
            int r3 = (int) r3
            r1.mo41009b(r5, r6, r3)
            int r3 = r0.f43022h
            int r4 = com.google.android.gms.internal.ads.bnz.f42876a
            if (r3 != r4) goto L_0x015e
            com.google.android.gms.internal.ads.bsa r3 = r0.f43025k
            r3.mo41223c(r9)
            int r4 = r3.mo41232j()
            int r5 = f43016b
            if (r4 != r5) goto L_0x0147
        L_0x0145:
            r3 = 1
            goto L_0x015b
        L_0x0147:
            r4 = 4
            r3.mo41225d(r4)
        L_0x014b:
            int r4 = r3.mo41220b()
            if (r4 <= 0) goto L_0x015a
            int r4 = r3.mo41232j()
            int r5 = f43016b
            if (r4 != r5) goto L_0x014b
            goto L_0x0145
        L_0x015a:
            r3 = 0
        L_0x015b:
            r0.f43031q = r3
            goto L_0x0185
        L_0x015e:
            java.util.Stack<com.google.android.gms.internal.ads.boa> r3 = r0.f43020f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0185
            java.util.Stack<com.google.android.gms.internal.ads.boa> r3 = r0.f43020f
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.boa r3 = (com.google.android.gms.internal.ads.boa) r3
            com.google.android.gms.internal.ads.bob r4 = new com.google.android.gms.internal.ads.bob
            int r5 = r0.f43022h
            com.google.android.gms.internal.ads.bsa r6 = r0.f43025k
            r4.<init>(r5, r6)
            java.util.List<com.google.android.gms.internal.ads.bob> r3 = r3.f42944aA
            r3.add(r4)
            goto L_0x0185
        L_0x017d:
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0187
            int r3 = (int) r3
            r1.mo41008b(r3)
        L_0x0185:
            r3 = 0
            goto L_0x018f
        L_0x0187:
            long r5 = r25.mo41007b()
            long r5 = r5 + r3
            r2.f42733a = r5
            r3 = 1
        L_0x018f:
            r0.m49553b(r7)
            if (r3 == 0) goto L_0x019c
            int r3 = r0.f43021g
            r4 = 2
            if (r3 == r4) goto L_0x019c
            r23 = 1
            goto L_0x019e
        L_0x019c:
            r23 = 0
        L_0x019e:
            if (r23 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x01a2:
            r3 = 1
            int r4 = r0.f43024j
            if (r4 != 0) goto L_0x01cc
            com.google.android.gms.internal.ads.bsa r4 = r0.f43019e
            byte[] r4 = r4.f43388a
            r5 = 0
            boolean r4 = r1.mo41006a(r4, r5, r9, r3)
            if (r4 != 0) goto L_0x01b5
            r3 = 0
            goto L_0x02b3
        L_0x01b5:
            r0.f43024j = r9
            com.google.android.gms.internal.ads.bsa r3 = r0.f43019e
            r3.mo41223c(r5)
            com.google.android.gms.internal.ads.bsa r3 = r0.f43019e
            long r3 = r3.mo41230h()
            r0.f43023i = r3
            com.google.android.gms.internal.ads.bsa r3 = r0.f43019e
            int r3 = r3.mo41232j()
            r0.f43022h = r3
        L_0x01cc:
            long r3 = r0.f43023i
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01e8
            com.google.android.gms.internal.ads.bsa r3 = r0.f43019e
            byte[] r3 = r3.f43388a
            r1.mo41009b(r3, r9, r9)
            int r3 = r0.f43024j
            int r3 = r3 + r9
            r0.f43024j = r3
            com.google.android.gms.internal.ads.bsa r3 = r0.f43019e
            long r3 = r3.mo41236n()
            r0.f43023i = r3
        L_0x01e8:
            int r3 = r0.f43022h
            int r4 = com.google.android.gms.internal.ads.bnz.f42938v
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bnz.f42940x
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bnz.f42941y
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bnz.f42942z
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bnz.f42850A
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bnz.f42857H
            if (r3 != r4) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r3 = 0
            goto L_0x0206
        L_0x0205:
            r3 = 1
        L_0x0206:
            if (r3 == 0) goto L_0x0232
            long r3 = r25.mo41007b()
            long r5 = r0.f43023i
            long r3 = r3 + r5
            int r5 = r0.f43024j
            long r5 = (long) r5
            long r3 = r3 - r5
            java.util.Stack<com.google.android.gms.internal.ads.boa> r5 = r0.f43020f
            com.google.android.gms.internal.ads.boa r6 = new com.google.android.gms.internal.ads.boa
            int r7 = r0.f43022h
            r6.<init>(r7, r3)
            r5.add(r6)
            long r5 = r0.f43023i
            int r7 = r0.f43024j
            long r9 = (long) r7
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x022e
            r0.m49553b(r3)
        L_0x022b:
            r3 = 1
            goto L_0x02b3
        L_0x022e:
            r24.m49554c()
            goto L_0x022b
        L_0x0232:
            int r3 = r0.f43022h
            int r4 = com.google.android.gms.internal.ads.bnz.f42859J
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42939w
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42860K
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42861L
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42872W
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42873X
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42874Y
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42858I
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42875Z
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42893aa
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42894ab
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42895ac
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42896ad
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42856G
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42876a
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bnz.f42903ak
            if (r3 != r4) goto L_0x0275
            goto L_0x0277
        L_0x0275:
            r3 = 0
            goto L_0x0278
        L_0x0277:
            r3 = 1
        L_0x0278:
            if (r3 == 0) goto L_0x02ad
            int r3 = r0.f43024j
            if (r3 != r9) goto L_0x0280
            r3 = 1
            goto L_0x0281
        L_0x0280:
            r3 = 0
        L_0x0281:
            com.google.android.gms.internal.ads.brr.m49873b(r3)
            long r3 = r0.f43023i
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x028f
            r3 = 1
            goto L_0x0290
        L_0x028f:
            r3 = 0
        L_0x0290:
            com.google.android.gms.internal.ads.brr.m49873b(r3)
            com.google.android.gms.internal.ads.bsa r3 = new com.google.android.gms.internal.ads.bsa
            long r4 = r0.f43023i
            int r4 = (int) r4
            r3.<init>(r4)
            r0.f43025k = r3
            com.google.android.gms.internal.ads.bsa r3 = r0.f43019e
            byte[] r3 = r3.f43388a
            com.google.android.gms.internal.ads.bsa r4 = r0.f43025k
            byte[] r4 = r4.f43388a
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r9)
            r3 = 1
            r0.f43021g = r3
            goto L_0x02b3
        L_0x02ad:
            r3 = 1
            r4 = 0
            r0.f43025k = r4
            r0.f43021g = r3
        L_0x02b3:
            if (r3 != 0) goto L_0x0006
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bom.mo41013a(com.google.android.gms.internal.ads.bne, com.google.android.gms.internal.ads.bnj):int");
    }

    /* renamed from: b */
    public final long mo41002b() {
        return this.f43030p;
    }

    /* renamed from: a */
    public final long mo41000a(long j) {
        long j2 = Long.MAX_VALUE;
        for (boo boo : this.f43029o) {
            bot bot = boo.f43033b;
            int a = bot.mo41056a(j);
            if (a == -1) {
                a = bot.mo41057b(j);
            }
            long j3 = bot.f43058b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: c */
    private final void m49554c() {
        this.f43021g = 0;
        this.f43024j = 0;
    }

    /* renamed from: b */
    private final void m49553b(long j) throws zzll {
        while (!this.f43020f.isEmpty() && ((boa) this.f43020f.peek()).f42946az == j) {
            boa boa = (boa) this.f43020f.pop();
            if (boa.f42943ay == bnz.f42938v) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzpn zzpn = null;
                bnh bnh = new bnh();
                bob d = boa.mo41050d(bnz.f42903ak);
                if (d != null) {
                    zzpn = boc.m49534a(d, this.f43031q);
                    if (zzpn != null) {
                        bnh.mo41021a(zzpn);
                    }
                }
                for (int i = 0; i < boa.f42945aB.size(); i++) {
                    boa boa2 = (boa) boa.f42945aB.get(i);
                    if (boa2.f42943ay == bnz.f42940x) {
                        boq a = boc.m49532a(boa2, boa.mo41050d(bnz.f42939w), -9223372036854775807L, (zznd) null, this.f43031q);
                        if (a != null) {
                            bot a2 = boc.m49533a(a, boa2.mo41051e(bnz.f42941y).mo41051e(bnz.f42942z).mo41051e(bnz.f42850A), bnh);
                            if (a2.f43057a != 0) {
                                boo boo = new boo(a, a2, this.f43028n.mo41017a(i, a.f43038b));
                                zzlg a3 = a.f43042f.mo42350a(a2.f43060d + 30);
                                if (a.f43038b == 1) {
                                    if (bnh.mo41020a()) {
                                        a3 = a3.mo42351a(bnh.f42731a, bnh.f42732b);
                                    }
                                    if (zzpn != null) {
                                        a3 = a3.mo42353a(zzpn);
                                    }
                                }
                                boo.f43034c.mo41025a(a3);
                                j2 = Math.max(j2, a.f43041e);
                                arrayList.add(boo);
                            }
                        }
                    }
                }
                this.f43030p = j2;
                this.f43029o = (boo[]) arrayList.toArray(new boo[arrayList.size()]);
                this.f43028n.mo41018a();
                this.f43028n.mo41019a(this);
                this.f43020f.clear();
                this.f43021g = 2;
            } else if (!this.f43020f.isEmpty()) {
                ((boa) this.f43020f.peek()).f42945aB.add(boa);
            }
        }
        if (this.f43021g != 2) {
            m49554c();
        }
    }
}
