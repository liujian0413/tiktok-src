package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class bqp extends bqs {

    /* renamed from: b */
    private static final int[] f43276b = new int[0];

    /* renamed from: c */
    private final AtomicReference<bqq> f43277c;

    public bqp() {
        this(null);
    }

    /* renamed from: a */
    private static int m49788a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: a */
    private static boolean m49789a(zzlg zzlg, String str) {
        return false;
    }

    /* renamed from: b */
    private static boolean m49790b(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private bqp(bqw bqw) {
        this.f43277c = new AtomicReference<>(new bqq());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x032e, code lost:
        r36 = r0;
        r9 = r19;
        r43 = r2;
        r40 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x045f, code lost:
        r3 = r40;
        r0 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0463, code lost:
        r1 = r1 + 1;
        r2 = r0;
        r19 = r9;
        r0 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        if (r8.f45711a <= r11) goto L_0x0188;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x01e9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.bqv[] mo41170a(com.google.android.gms.internal.ads.blk[] r45, com.google.android.gms.internal.ads.bql[] r46, int[][][] r47) throws com.google.android.gms.internal.ads.zzkt {
        /*
            r44 = this;
            r0 = r45
            int r3 = r0.length
            com.google.android.gms.internal.ads.bqv[] r4 = new com.google.android.gms.internal.ads.bqv[r3]
            r5 = r44
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.bqq> r6 = r5.f43277c
            java.lang.Object r6 = r6.get()
            com.google.android.gms.internal.ads.bqq r6 = (com.google.android.gms.internal.ads.bqq) r6
            r8 = 0
            r9 = 0
        L_0x0011:
            r10 = 2
            if (r8 >= r3) goto L_0x024d
            r14 = r0[r8]
            int r14 = r14.mo40822a()
            if (r10 != r14) goto L_0x0237
            if (r9 != 0) goto L_0x0237
            r9 = r46[r8]
            r14 = r47[r8]
            int r15 = r6.f43279b
            int r12 = r6.f43280c
            int r10 = r6.f43281d
            int r7 = r6.f43284g
            int r11 = r6.f43285h
            boolean r13 = r6.f43286i
            boolean r5 = r6.f43282e
            boolean r2 = r6.f43283f
            r23 = r3
            r19 = r6
            r0 = 0
            r1 = 0
            r6 = 0
            r20 = 0
            r21 = -1
            r22 = -1
        L_0x003f:
            int r3 = r9.f43267b
            if (r6 >= r3) goto L_0x0214
            com.google.android.gms.internal.ads.bqj r3 = r9.mo41160a(r6)
            r24 = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r25 = r4
            int r4 = r3.f43248a
            r9.<init>(r4)
            r26 = r8
            r4 = 0
        L_0x0055:
            int r8 = r3.f43248a
            if (r4 >= r8) goto L_0x0063
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r9.add(r8)
            int r4 = r4 + 1
            goto L_0x0055
        L_0x0063:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r4) goto L_0x0139
            if (r11 != r4) goto L_0x006c
            goto L_0x0139
        L_0x006c:
            r27 = r0
            r8 = 0
        L_0x006f:
            int r0 = r3.f43248a
            if (r8 >= r0) goto L_0x0103
            com.google.android.gms.internal.ads.zzlg r0 = r3.mo41141a(r8)
            r28 = r1
            int r1 = r0.f45717g
            if (r1 <= 0) goto L_0x00e9
            int r1 = r0.f45718h
            if (r1 <= 0) goto L_0x00e9
            int r1 = r0.f45717g
            r29 = r5
            int r5 = r0.f45718h
            if (r13 == 0) goto L_0x00a3
            if (r1 <= r5) goto L_0x008f
            r30 = r13
            r13 = 1
            goto L_0x0092
        L_0x008f:
            r30 = r13
            r13 = 0
        L_0x0092:
            if (r7 <= r11) goto L_0x0098
            r31 = r7
            r7 = 1
            goto L_0x009b
        L_0x0098:
            r31 = r7
            r7 = 0
        L_0x009b:
            if (r13 == r7) goto L_0x00a7
            r13 = r11
            r32 = r13
            r7 = r31
            goto L_0x00ac
        L_0x00a3:
            r31 = r7
            r30 = r13
        L_0x00a7:
            r7 = r11
            r32 = r7
            r13 = r31
        L_0x00ac:
            int r11 = r1 * r7
            r33 = r10
            int r10 = r5 * r13
            if (r11 < r10) goto L_0x00bf
            android.graphics.Point r5 = new android.graphics.Point
            int r1 = com.google.android.gms.internal.ads.bsf.m49933a(r10, r1)
            r5.<init>(r13, r1)
            r1 = r5
            goto L_0x00c8
        L_0x00bf:
            android.graphics.Point r1 = new android.graphics.Point
            int r5 = com.google.android.gms.internal.ads.bsf.m49933a(r11, r5)
            r1.<init>(r5, r7)
        L_0x00c8:
            int r5 = r0.f45717g
            int r7 = r0.f45718h
            int r5 = r5 * r7
            int r7 = r0.f45717g
            int r10 = r1.x
            float r10 = (float) r10
            r11 = 1065017672(0x3f7ae148, float:0.98)
            float r10 = r10 * r11
            int r10 = (int) r10
            if (r7 < r10) goto L_0x00f3
            int r0 = r0.f45718h
            int r1 = r1.y
            float r1 = (float) r1
            float r1 = r1 * r11
            int r1 = (int) r1
            if (r0 < r1) goto L_0x00f3
            if (r5 >= r4) goto L_0x00f3
            r4 = r5
            goto L_0x00f3
        L_0x00e9:
            r29 = r5
            r31 = r7
            r33 = r10
            r32 = r11
            r30 = r13
        L_0x00f3:
            int r8 = r8 + 1
            r1 = r28
            r5 = r29
            r13 = r30
            r7 = r31
            r11 = r32
            r10 = r33
            goto L_0x006f
        L_0x0103:
            r28 = r1
            r29 = r5
            r31 = r7
            r33 = r10
            r32 = r11
            r30 = r13
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L_0x0147
            int r0 = r9.size()
            r1 = 1
            int r0 = r0 - r1
        L_0x011a:
            if (r0 < 0) goto L_0x0147
            java.lang.Object r1 = r9.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.internal.ads.zzlg r1 = r3.mo41141a(r1)
            int r1 = r1.mo42349a()
            r5 = -1
            if (r1 == r5) goto L_0x0133
            if (r1 <= r4) goto L_0x0136
        L_0x0133:
            r9.remove(r0)
        L_0x0136:
            int r0 = r0 + -1
            goto L_0x011a
        L_0x0139:
            r27 = r0
            r28 = r1
            r29 = r5
            r31 = r7
            r33 = r10
            r32 = r11
            r30 = r13
        L_0x0147:
            r0 = r14[r6]
            r4 = r20
            r5 = r21
            r7 = r22
            r1 = 0
        L_0x0150:
            int r8 = r3.f43248a
            if (r1 >= r8) goto L_0x01f3
            r8 = r0[r1]
            boolean r8 = m49790b(r8, r2)
            if (r8 == 0) goto L_0x01e3
            com.google.android.gms.internal.ads.zzlg r8 = r3.mo41141a(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L_0x018a
            int r10 = r8.f45717g
            r11 = -1
            if (r10 == r11) goto L_0x0173
            int r10 = r8.f45717g
            if (r10 > r15) goto L_0x018a
        L_0x0173:
            int r10 = r8.f45718h
            if (r10 == r11) goto L_0x017b
            int r10 = r8.f45718h
            if (r10 > r12) goto L_0x018a
        L_0x017b:
            int r10 = r8.f45711a
            if (r10 == r11) goto L_0x0186
            int r10 = r8.f45711a
            r11 = r33
            if (r10 > r11) goto L_0x018c
            goto L_0x0188
        L_0x0186:
            r11 = r33
        L_0x0188:
            r10 = 1
            goto L_0x018d
        L_0x018a:
            r11 = r33
        L_0x018c:
            r10 = 0
        L_0x018d:
            if (r10 != 0) goto L_0x0197
            if (r29 == 0) goto L_0x0192
            goto L_0x0197
        L_0x0192:
            r35 = r0
            r34 = r2
            goto L_0x01e9
        L_0x0197:
            if (r10 == 0) goto L_0x019d
            r34 = r2
            r13 = 2
            goto L_0x01a0
        L_0x019d:
            r34 = r2
            r13 = 1
        L_0x01a0:
            r2 = r0[r1]
            r35 = r0
            r0 = 0
            boolean r2 = m49790b(r2, r0)
            if (r2 == 0) goto L_0x01ad
            int r13 = r13 + 1000
        L_0x01ad:
            if (r13 <= r4) goto L_0x01b1
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r13 != r4) goto L_0x01d5
            int r0 = r8.mo42349a()
            if (r0 == r5) goto L_0x01c3
            int r0 = r8.mo42349a()
            int r0 = m49788a(r0, r5)
            goto L_0x01c9
        L_0x01c3:
            int r0 = r8.f45711a
            int r0 = m49788a(r0, r7)
        L_0x01c9:
            if (r2 == 0) goto L_0x01d0
            if (r10 == 0) goto L_0x01d0
            if (r0 <= 0) goto L_0x01d4
            goto L_0x01d2
        L_0x01d0:
            if (r0 >= 0) goto L_0x01d4
        L_0x01d2:
            r0 = 1
            goto L_0x01d5
        L_0x01d4:
            r0 = 0
        L_0x01d5:
            if (r0 == 0) goto L_0x01e9
            int r7 = r8.f45711a
            int r5 = r8.mo42349a()
            r27 = r1
            r28 = r3
            r4 = r13
            goto L_0x01e9
        L_0x01e3:
            r35 = r0
            r34 = r2
            r11 = r33
        L_0x01e9:
            int r1 = r1 + 1
            r33 = r11
            r2 = r34
            r0 = r35
            goto L_0x0150
        L_0x01f3:
            r34 = r2
            r11 = r33
            int r6 = r6 + 1
            r20 = r4
            r21 = r5
            r22 = r7
            r10 = r11
            r9 = r24
            r4 = r25
            r8 = r26
            r0 = r27
            r1 = r28
            r5 = r29
            r13 = r30
            r7 = r31
            r11 = r32
            goto L_0x003f
        L_0x0214:
            r27 = r0
            r28 = r1
            r25 = r4
            r26 = r8
            if (r28 != 0) goto L_0x0220
            r12 = 0
            goto L_0x0229
        L_0x0220:
            com.google.android.gms.internal.ads.bqr r12 = new com.google.android.gms.internal.ads.bqr
            r1 = r27
            r0 = r28
            r12.<init>(r0, r1)
        L_0x0229:
            r25[r26] = r12
            r0 = r25[r26]
            if (r0 == 0) goto L_0x0232
            r18 = 1
            goto L_0x0234
        L_0x0232:
            r18 = 0
        L_0x0234:
            r9 = r18
            goto L_0x023f
        L_0x0237:
            r23 = r3
            r25 = r4
            r19 = r6
            r26 = r8
        L_0x023f:
            int r8 = r26 + 1
            r6 = r19
            r3 = r23
            r4 = r25
            r0 = r45
            r5 = r44
            goto L_0x0011
        L_0x024d:
            r25 = r4
            r19 = r6
            r0 = r3
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0255:
            if (r1 >= r0) goto L_0x046c
            r4 = r45
            r5 = r4[r1]
            int r5 = r5.mo40822a()
            switch(r5) {
                case 1: goto L_0x033a;
                case 2: goto L_0x032e;
                case 3: goto L_0x0278;
                default: goto L_0x0262;
            }
        L_0x0262:
            r36 = r0
            r40 = r3
            r9 = r19
            r3 = -1
            r4 = 0
            r17 = 2
            r0 = r46[r1]
            r6 = r47[r1]
            boolean r8 = r9.f43283f
            r11 = r4
            r10 = 0
            r12 = 0
            r13 = 0
            goto L_0x03eb
        L_0x0278:
            if (r3 != 0) goto L_0x032e
            r3 = r46[r1]
            r8 = r47[r1]
            r9 = r19
            boolean r11 = r9.f43283f
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0286:
            int r6 = r3.f43267b
            if (r12 >= r6) goto L_0x0314
            com.google.android.gms.internal.ads.bqj r6 = r3.mo41160a(r12)
            r19 = r8[r12]
            r36 = r0
            r10 = r15
            r15 = r14
            r14 = r13
            r13 = 0
        L_0x0296:
            int r0 = r6.f43248a
            if (r13 >= r0) goto L_0x0305
            r0 = r19[r13]
            boolean r0 = m49790b(r0, r11)
            if (r0 == 0) goto L_0x02f6
            com.google.android.gms.internal.ads.zzlg r0 = r6.mo41141a(r13)
            r37 = r3
            int r3 = r0.f45726p
            r18 = 1
            r3 = r3 & 1
            if (r3 == 0) goto L_0x02b2
            r3 = 1
            goto L_0x02b3
        L_0x02b2:
            r3 = 0
        L_0x02b3:
            int r4 = r0.f45726p
            r17 = 2
            r4 = r4 & 2
            if (r4 == 0) goto L_0x02c0
            r38 = r6
            r4 = 1
        L_0x02be:
            r6 = 0
            goto L_0x02c4
        L_0x02c0:
            r38 = r6
            r4 = 0
            goto L_0x02be
        L_0x02c4:
            boolean r20 = m49789a(r0, r6)
            if (r20 == 0) goto L_0x02d4
            if (r3 == 0) goto L_0x02ce
            r0 = 6
            goto L_0x02e4
        L_0x02ce:
            if (r4 != 0) goto L_0x02d2
            r0 = 5
            goto L_0x02e4
        L_0x02d2:
            r0 = 4
            goto L_0x02e4
        L_0x02d4:
            if (r3 == 0) goto L_0x02d8
            r0 = 3
            goto L_0x02e4
        L_0x02d8:
            if (r4 == 0) goto L_0x02fc
            r3 = 0
            boolean r0 = m49789a(r0, r3)
            if (r0 == 0) goto L_0x02e3
            r0 = 2
            goto L_0x02e4
        L_0x02e3:
            r0 = 1
        L_0x02e4:
            r3 = r19[r13]
            r4 = 0
            boolean r3 = m49790b(r3, r4)
            if (r3 == 0) goto L_0x02ef
            int r0 = r0 + 1000
        L_0x02ef:
            if (r0 <= r10) goto L_0x02fc
            r10 = r0
            r15 = r13
            r14 = r38
            goto L_0x02fc
        L_0x02f6:
            r37 = r3
            r38 = r6
            r17 = 2
        L_0x02fc:
            int r13 = r13 + 1
            r3 = r37
            r6 = r38
            r4 = r45
            goto L_0x0296
        L_0x0305:
            r37 = r3
            r17 = 2
            int r12 = r12 + 1
            r13 = r14
            r14 = r15
            r0 = r36
            r4 = r45
            r15 = r10
            goto L_0x0286
        L_0x0314:
            r36 = r0
            r17 = 2
            if (r13 != 0) goto L_0x031c
            r12 = 0
            goto L_0x0321
        L_0x031c:
            com.google.android.gms.internal.ads.bqr r12 = new com.google.android.gms.internal.ads.bqr
            r12.<init>(r13, r14)
        L_0x0321:
            r25[r1] = r12
            r0 = r25[r1]
            if (r0 == 0) goto L_0x0329
            r0 = 1
            goto L_0x032a
        L_0x0329:
            r0 = 0
        L_0x032a:
            r3 = r0
            r0 = r2
            goto L_0x03dd
        L_0x032e:
            r36 = r0
            r9 = r19
            r17 = 2
            r43 = r2
            r40 = r3
            goto L_0x03e6
        L_0x033a:
            r36 = r0
            r9 = r19
            r17 = 2
            if (r2 != 0) goto L_0x03e2
            r0 = r46[r1]
            r2 = r47[r1]
            boolean r4 = r9.f43283f
            r6 = 0
            r8 = -1
            r10 = -1
            r11 = 0
        L_0x034c:
            int r12 = r0.f43267b
            if (r6 >= r12) goto L_0x03c1
            com.google.android.gms.internal.ads.bqj r12 = r0.mo41160a(r6)
            r13 = r2[r6]
            r14 = r11
            r11 = r10
            r10 = r8
            r8 = 0
        L_0x035a:
            int r15 = r12.f43248a
            if (r8 >= r15) goto L_0x03b2
            r15 = r13[r8]
            boolean r15 = m49790b(r15, r4)
            if (r15 == 0) goto L_0x03a2
            com.google.android.gms.internal.ads.zzlg r15 = r12.mo41141a(r8)
            r39 = r2
            r2 = r13[r8]
            r40 = r3
            int r3 = r15.f45726p
            r18 = 1
            r3 = r3 & 1
            if (r3 == 0) goto L_0x037d
            r41 = r4
            r3 = 1
        L_0x037b:
            r4 = 0
            goto L_0x0381
        L_0x037d:
            r41 = r4
            r3 = 0
            goto L_0x037b
        L_0x0381:
            boolean r15 = m49789a(r15, r4)
            if (r15 == 0) goto L_0x038e
            if (r3 == 0) goto L_0x038c
            r3 = 4
        L_0x038a:
            r15 = 0
            goto L_0x0394
        L_0x038c:
            r3 = 3
            goto L_0x038a
        L_0x038e:
            if (r3 == 0) goto L_0x0392
            r3 = 2
            goto L_0x038a
        L_0x0392:
            r3 = 1
            goto L_0x038a
        L_0x0394:
            boolean r2 = m49790b(r2, r15)
            if (r2 == 0) goto L_0x039c
            int r3 = r3 + 1000
        L_0x039c:
            if (r3 <= r14) goto L_0x03a9
            r14 = r3
            r10 = r6
            r11 = r8
            goto L_0x03a9
        L_0x03a2:
            r39 = r2
            r40 = r3
            r41 = r4
            r4 = 0
        L_0x03a9:
            int r8 = r8 + 1
            r2 = r39
            r3 = r40
            r4 = r41
            goto L_0x035a
        L_0x03b2:
            r39 = r2
            r40 = r3
            r41 = r4
            r4 = 0
            int r6 = r6 + 1
            r8 = r10
            r10 = r11
            r11 = r14
            r4 = r41
            goto L_0x034c
        L_0x03c1:
            r40 = r3
            r3 = -1
            r4 = 0
            if (r8 != r3) goto L_0x03c9
            r12 = r4
            goto L_0x03d2
        L_0x03c9:
            com.google.android.gms.internal.ads.bqj r0 = r0.mo41160a(r8)
            com.google.android.gms.internal.ads.bqr r12 = new com.google.android.gms.internal.ads.bqr
            r12.<init>(r0, r10)
        L_0x03d2:
            r25[r1] = r12
            r0 = r25[r1]
            if (r0 == 0) goto L_0x03da
            r0 = 1
            goto L_0x03db
        L_0x03da:
            r0 = 0
        L_0x03db:
            r3 = r40
        L_0x03dd:
            r2 = 0
            r16 = 1
            goto L_0x0463
        L_0x03e2:
            r40 = r3
            r43 = r2
        L_0x03e6:
            r2 = 0
            r16 = 1
            goto L_0x045f
        L_0x03eb:
            int r14 = r0.f43267b
            if (r10 >= r14) goto L_0x044f
            com.google.android.gms.internal.ads.bqj r14 = r0.mo41160a(r10)
            r15 = r6[r10]
            r3 = r13
            r13 = r12
            r12 = r11
            r11 = 0
        L_0x03f9:
            int r4 = r14.f43248a
            if (r11 >= r4) goto L_0x043e
            r4 = r15[r11]
            boolean r4 = m49790b(r4, r8)
            if (r4 == 0) goto L_0x0430
            com.google.android.gms.internal.ads.zzlg r4 = r14.mo41141a(r11)
            int r4 = r4.f45726p
            r16 = 1
            r4 = r4 & 1
            if (r4 == 0) goto L_0x0413
            r4 = 1
            goto L_0x0414
        L_0x0413:
            r4 = 0
        L_0x0414:
            if (r4 == 0) goto L_0x041a
            r42 = r0
            r4 = 2
            goto L_0x041d
        L_0x041a:
            r42 = r0
            r4 = 1
        L_0x041d:
            r0 = r15[r11]
            r43 = r2
            r2 = 0
            boolean r0 = m49790b(r0, r2)
            if (r0 == 0) goto L_0x042a
            int r4 = r4 + 1000
        L_0x042a:
            if (r4 <= r3) goto L_0x0437
            r3 = r4
            r13 = r11
            r12 = r14
            goto L_0x0437
        L_0x0430:
            r42 = r0
            r43 = r2
            r2 = 0
            r16 = 1
        L_0x0437:
            int r11 = r11 + 1
            r0 = r42
            r2 = r43
            goto L_0x03f9
        L_0x043e:
            r42 = r0
            r43 = r2
            r2 = 0
            r16 = 1
            int r10 = r10 + 1
            r11 = r12
            r12 = r13
            r2 = r43
            r4 = 0
            r13 = r3
            r3 = -1
            goto L_0x03eb
        L_0x044f:
            r43 = r2
            r2 = 0
            r16 = 1
            if (r11 != 0) goto L_0x0458
            r0 = 0
            goto L_0x045d
        L_0x0458:
            com.google.android.gms.internal.ads.bqr r0 = new com.google.android.gms.internal.ads.bqr
            r0.<init>(r11, r12)
        L_0x045d:
            r25[r1] = r0
        L_0x045f:
            r3 = r40
            r0 = r43
        L_0x0463:
            int r1 = r1 + 1
            r2 = r0
            r19 = r9
            r0 = r36
            goto L_0x0255
        L_0x046c:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bqp.mo41170a(com.google.android.gms.internal.ads.blk[], com.google.android.gms.internal.ads.bql[], int[][][]):com.google.android.gms.internal.ads.bqv[]");
    }
}
