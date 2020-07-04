package com.google.android.gms.internal.measurement;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.in */
final class C16619in<T> implements C16633ja<T> {

    /* renamed from: a */
    private static final int[] f46456a = new int[0];

    /* renamed from: b */
    private static final Unsafe f46457b = C16657jy.m54563c();

    /* renamed from: c */
    private final int[] f46458c;

    /* renamed from: d */
    private final Object[] f46459d;

    /* renamed from: e */
    private final int f46460e;

    /* renamed from: f */
    private final int f46461f;

    /* renamed from: g */
    private final C16615ij f46462g;

    /* renamed from: h */
    private final boolean f46463h;

    /* renamed from: i */
    private final boolean f46464i;

    /* renamed from: j */
    private final boolean f46465j;

    /* renamed from: k */
    private final boolean f46466k;

    /* renamed from: l */
    private final int[] f46467l;

    /* renamed from: m */
    private final int f46468m;

    /* renamed from: n */
    private final int f46469n;

    /* renamed from: o */
    private final C16623ir f46470o;

    /* renamed from: p */
    private final C16599hu f46471p;

    /* renamed from: q */
    private final C16651js<?, ?> f46472q;

    /* renamed from: r */
    private final C16567gu<?> f46473r;

    /* renamed from: s */
    private final C16610ie f46474s;

    private C16619in(int[] iArr, Object[] objArr, int i, int i2, C16615ij ijVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C16623ir irVar, C16599hu huVar, C16651js<?, ?> jsVar, C16567gu<?> guVar, C16610ie ieVar) {
        this.f46458c = iArr;
        this.f46459d = objArr;
        this.f46460e = i;
        this.f46461f = i2;
        this.f46464i = ijVar instanceof C16579hf;
        this.f46465j = z;
        this.f46463h = guVar != null && guVar.mo42899a(ijVar);
        this.f46466k = false;
        this.f46467l = iArr2;
        this.f46468m = i3;
        this.f46469n = i4;
        this.f46470o = irVar;
        this.f46471p = huVar;
        this.f46472q = jsVar;
        this.f46473r = guVar;
        this.f46462g = ijVar;
        this.f46474s = ieVar;
    }

    /* renamed from: f */
    private static boolean m54311f(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.C16619in<T> m54283a(java.lang.Class<T> r40, com.google.android.gms.internal.measurement.C16613ih r41, com.google.android.gms.internal.measurement.C16623ir r42, com.google.android.gms.internal.measurement.C16599hu r43, com.google.android.gms.internal.measurement.C16651js<?, ?> r44, com.google.android.gms.internal.measurement.C16567gu<?> r45, com.google.android.gms.internal.measurement.C16610ie r46) {
        /*
            r0 = r41
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16630iy
            if (r1 == 0) goto L_0x0463
            com.google.android.gms.internal.measurement.iy r0 = (com.google.android.gms.internal.measurement.C16630iy) r0
            int r1 = r0.mo42987a()
            int r2 = com.google.android.gms.internal.measurement.C16579hf.C16584e.f46415i
            r3 = 0
            if (r1 != r2) goto L_0x0013
            r11 = 1
            goto L_0x0014
        L_0x0013:
            r11 = 0
        L_0x0014:
            java.lang.String r1 = r0.f46486a
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r5
            r5 = 1
            r9 = 13
        L_0x0029:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x0039
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r8 = r8 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0029
        L_0x0039:
            int r5 = r5 << r9
            r5 = r5 | r8
            goto L_0x003d
        L_0x003c:
            r10 = 1
        L_0x003d:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005c
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0049:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0059
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0049
        L_0x0059:
            int r8 = r8 << r10
            r9 = r9 | r8
            goto L_0x005d
        L_0x005c:
            r12 = r8
        L_0x005d:
            if (r9 != 0) goto L_0x006b
            int[] r8 = f46456a
            r16 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x019e
        L_0x006b:
            int r8 = r12 + 1
            char r9 = r1.charAt(r12)
            if (r9 < r7) goto L_0x008b
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0077:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0087
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0077
        L_0x0087:
            int r8 = r8 << r10
            r8 = r8 | r9
            r9 = r8
            goto L_0x008c
        L_0x008b:
            r12 = r8
        L_0x008c:
            int r8 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r7) goto L_0x00ab
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x0098:
            int r13 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00a8
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r12
            r10 = r10 | r8
            int r12 = r12 + 13
            r8 = r13
            goto L_0x0098
        L_0x00a8:
            int r8 = r8 << r12
            r10 = r10 | r8
            goto L_0x00ac
        L_0x00ab:
            r13 = r8
        L_0x00ac:
            int r8 = r13 + 1
            char r12 = r1.charAt(r13)
            if (r12 < r7) goto L_0x00cc
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00b8:
            int r14 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00c8
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r13
            r12 = r12 | r8
            int r13 = r13 + 13
            r8 = r14
            goto L_0x00b8
        L_0x00c8:
            int r8 = r8 << r13
            r8 = r8 | r12
            r12 = r8
            goto L_0x00cd
        L_0x00cc:
            r14 = r8
        L_0x00cd:
            int r8 = r14 + 1
            char r13 = r1.charAt(r14)
            if (r13 < r7) goto L_0x00ed
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00d9:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00e9
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r14
            r13 = r13 | r8
            int r14 = r14 + 13
            r8 = r15
            goto L_0x00d9
        L_0x00e9:
            int r8 = r8 << r14
            r8 = r8 | r13
            r13 = r8
            goto L_0x00ee
        L_0x00ed:
            r15 = r8
        L_0x00ee:
            int r8 = r15 + 1
            char r14 = r1.charAt(r15)
            if (r14 < r7) goto L_0x0110
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fa:
            int r16 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x010b
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r15
            r14 = r14 | r8
            int r15 = r15 + 13
            r8 = r16
            goto L_0x00fa
        L_0x010b:
            int r8 = r8 << r15
            r8 = r8 | r14
            r14 = r8
            r8 = r16
        L_0x0110:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0133
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011c:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x012e
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r8 = r8 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011c
        L_0x012e:
            int r15 = r15 << r16
            r8 = r8 | r15
            r15 = r17
        L_0x0133:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x015f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r39 = r16
            r16 = r15
            r15 = r39
        L_0x0145:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0158
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x0145
        L_0x0158:
            int r15 = r15 << r17
            r15 = r16 | r15
            r3 = r18
            goto L_0x0161
        L_0x015f:
            r3 = r16
        L_0x0161:
            int r16 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x018c
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r39 = r16
            r16 = r3
            r3 = r39
        L_0x0173:
            int r18 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x0186
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r17
            r16 = r16 | r3
            int r17 = r17 + 13
            r3 = r18
            goto L_0x0173
        L_0x0186:
            int r3 = r3 << r17
            r3 = r16 | r3
            r16 = r18
        L_0x018c:
            int r17 = r3 + r8
            int r15 = r17 + r15
            int[] r15 = new int[r15]
            int r17 = r9 << 1
            int r10 = r17 + r10
            r39 = r15
            r15 = r10
            r10 = r12
            r12 = r16
            r16 = r39
        L_0x019e:
            sun.misc.Unsafe r6 = f46457b
            java.lang.Object[] r7 = r0.f46487b
            com.google.android.gms.internal.measurement.ij r17 = r0.mo42989c()
            java.lang.Class r4 = r17.getClass()
            r23 = r12
            int r12 = r14 * 3
            int[] r12 = new int[r12]
            r17 = 1
            int r14 = r14 << 1
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r17 = r3 + r8
            r20 = r3
            r19 = r15
            r8 = r23
            r15 = 0
            r18 = 0
            r23 = r17
        L_0x01c3:
            if (r8 >= r2) goto L_0x0436
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            r25 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r2) goto L_0x01f9
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
            r39 = r24
            r24 = r8
            r8 = r39
        L_0x01dc:
            int r27 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r2) goto L_0x01f2
            r2 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r26
            r24 = r24 | r2
            int r26 = r26 + 13
            r8 = r27
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01dc
        L_0x01f2:
            int r2 = r8 << r26
            r8 = r24 | r2
            r2 = r27
            goto L_0x01fb
        L_0x01f9:
            r2 = r24
        L_0x01fb:
            int r24 = r2 + 1
            char r2 = r1.charAt(r2)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r3) goto L_0x022f
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
            r39 = r24
            r24 = r2
            r2 = r39
        L_0x0212:
            int r27 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r3) goto L_0x0228
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r26
            r24 = r24 | r2
            int r26 = r26 + 13
            r2 = r27
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0212
        L_0x0228:
            int r2 = r2 << r26
            r2 = r24 | r2
            r3 = r27
            goto L_0x0231
        L_0x022f:
            r3 = r24
        L_0x0231:
            r29 = r11
            r11 = r2 & 255(0xff, float:3.57E-43)
            r30 = r13
            r13 = r2 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0240
            int r13 = r15 + 1
            r16[r15] = r18
            r15 = r13
        L_0x0240:
            r13 = 51
            r31 = r15
            if (r11 < r13) goto L_0x02e8
            int r13 = r3 + 1
            char r3 = r1.charAt(r3)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x026e
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x0255:
            int r26 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r15) goto L_0x026a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r24
            r3 = r3 | r13
            int r24 = r24 + 13
            r13 = r26
            r15 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0255
        L_0x026a:
            int r13 = r13 << r24
            r3 = r3 | r13
            goto L_0x0270
        L_0x026e:
            r26 = r13
        L_0x0270:
            int r13 = r11 + -51
            r15 = 9
            if (r13 == r15) goto L_0x0292
            r15 = 17
            if (r13 != r15) goto L_0x027b
            goto L_0x0292
        L_0x027b:
            r15 = 12
            if (r13 != r15) goto L_0x0290
            r13 = r5 & 1
            r15 = 1
            if (r13 != r15) goto L_0x0290
            int r13 = r18 / 3
            int r13 = r13 << r15
            int r13 = r13 + r15
            int r15 = r19 + 1
            r19 = r7[r19]
            r14[r13] = r19
            r19 = r15
        L_0x0290:
            r15 = 1
            goto L_0x029f
        L_0x0292:
            int r13 = r18 / 3
            r15 = 1
            int r13 = r13 << r15
            int r13 = r13 + r15
            int r22 = r19 + 1
            r19 = r7[r19]
            r14[r13] = r19
            r19 = r22
        L_0x029f:
            int r3 = r3 << r15
            r13 = r7[r3]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02ab
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x02a8:
            r32 = r12
            goto L_0x02b4
        L_0x02ab:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m54287a(r4, r13)
            r7[r3] = r13
            goto L_0x02a8
        L_0x02b4:
            long r12 = r6.objectFieldOffset(r13)
            int r12 = (int) r12
            int r3 = r3 + 1
            r13 = r7[r3]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02c6
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x02c3:
            r33 = r12
            goto L_0x02cf
        L_0x02c6:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m54287a(r4, r13)
            r7[r3] = r13
            goto L_0x02c3
        L_0x02cf:
            long r12 = r6.objectFieldOffset(r13)
            int r3 = (int) r12
            r36 = r1
            r1 = r3
            r38 = r4
            r37 = r5
            r34 = r10
            r12 = r19
            r13 = r26
            r10 = r33
            r3 = 0
            r19 = 1
            goto L_0x03f9
        L_0x02e8:
            r32 = r12
            int r12 = r19 + 1
            r13 = r7[r19]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m54287a(r4, r13)
            r15 = 9
            if (r11 == r15) goto L_0x036a
            r15 = 17
            if (r11 != r15) goto L_0x02fe
            goto L_0x036a
        L_0x02fe:
            r15 = 27
            if (r11 == r15) goto L_0x0358
            r15 = 49
            if (r11 != r15) goto L_0x0307
            goto L_0x0358
        L_0x0307:
            r15 = 12
            if (r11 == r15) goto L_0x0346
            r15 = 30
            if (r11 == r15) goto L_0x0346
            r15 = 44
            if (r11 != r15) goto L_0x0314
            goto L_0x0346
        L_0x0314:
            r15 = 50
            if (r11 != r15) goto L_0x0342
            int r15 = r20 + 1
            r16[r20] = r18
            int r19 = r18 / 3
            r20 = 1
            int r19 = r19 << 1
            int r20 = r12 + 1
            r12 = r7[r12]
            r14[r19] = r12
            r12 = r2 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0339
            int r19 = r19 + 1
            int r12 = r20 + 1
            r20 = r7[r20]
            r14[r19] = r20
            r34 = r10
            r35 = r11
            goto L_0x033f
        L_0x0339:
            r34 = r10
            r35 = r11
            r12 = r20
        L_0x033f:
            r20 = r15
            goto L_0x0379
        L_0x0342:
            r34 = r10
            r10 = 1
            goto L_0x0377
        L_0x0346:
            r15 = r5 & 1
            r34 = r10
            r10 = 1
            if (r15 != r10) goto L_0x0377
            int r15 = r18 / 3
            int r15 = r15 << r10
            int r15 = r15 + r10
            int r19 = r12 + 1
            r12 = r7[r12]
            r14[r15] = r12
            goto L_0x0365
        L_0x0358:
            r34 = r10
            r10 = 1
            int r15 = r18 / 3
            int r15 = r15 << r10
            int r15 = r15 + r10
            int r19 = r12 + 1
            r12 = r7[r12]
            r14[r15] = r12
        L_0x0365:
            r35 = r11
            r12 = r19
            goto L_0x0379
        L_0x036a:
            r34 = r10
            r10 = 1
            int r15 = r18 / 3
            int r15 = r15 << r10
            int r15 = r15 + r10
            java.lang.Class r19 = r13.getType()
            r14[r15] = r19
        L_0x0377:
            r35 = r11
        L_0x0379:
            long r10 = r6.objectFieldOffset(r13)
            int r10 = (int) r10
            r11 = r5 & 1
            r13 = 1
            if (r11 != r13) goto L_0x03de
            r11 = r35
            r13 = 17
            if (r11 > r13) goto L_0x03d7
            int r13 = r3 + 1
            char r3 = r1.charAt(r3)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x03af
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0398:
            int r21 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r15) goto L_0x03aa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r19
            r3 = r3 | r13
            int r19 = r19 + 13
            r13 = r21
            goto L_0x0398
        L_0x03aa:
            int r13 = r13 << r19
            r3 = r3 | r13
            r13 = r21
        L_0x03af:
            r19 = 1
            int r21 = r9 << 1
            int r22 = r3 / 32
            int r21 = r21 + r22
            r15 = r7[r21]
            r36 = r1
            boolean r1 = r15 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x03c6
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
        L_0x03c1:
            r38 = r4
            r37 = r5
            goto L_0x03cf
        L_0x03c6:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = m54287a(r4, r15)
            r7[r21] = r15
            goto L_0x03c1
        L_0x03cf:
            long r4 = r6.objectFieldOffset(r15)
            int r1 = (int) r4
            int r3 = r3 % 32
            goto L_0x03eb
        L_0x03d7:
            r36 = r1
            r38 = r4
            r37 = r5
            goto L_0x03e6
        L_0x03de:
            r36 = r1
            r38 = r4
            r37 = r5
            r11 = r35
        L_0x03e6:
            r19 = 1
            r13 = r3
            r1 = 0
            r3 = 0
        L_0x03eb:
            r4 = 18
            if (r11 < r4) goto L_0x03f9
            r4 = 49
            if (r11 > r4) goto L_0x03f9
            int r4 = r23 + 1
            r16[r23] = r10
            r23 = r4
        L_0x03f9:
            int r4 = r18 + 1
            r32[r18] = r8
            int r5 = r4 + 1
            r8 = r2 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0406
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0407
        L_0x0406:
            r8 = 0
        L_0x0407:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x040e
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x040f
        L_0x040e:
            r2 = 0
        L_0x040f:
            r2 = r2 | r8
            int r8 = r11 << 20
            r2 = r2 | r8
            r2 = r2 | r10
            r32[r4] = r2
            int r18 = r5 + 1
            int r2 = r3 << 20
            r1 = r1 | r2
            r32[r5] = r1
            r19 = r12
            r8 = r13
            r2 = r25
            r3 = r28
            r11 = r29
            r13 = r30
            r15 = r31
            r12 = r32
            r10 = r34
            r1 = r36
            r5 = r37
            r4 = r38
            goto L_0x01c3
        L_0x0436:
            r28 = r3
            r34 = r10
            r29 = r11
            r32 = r12
            r30 = r13
            com.google.android.gms.internal.measurement.in r1 = new com.google.android.gms.internal.measurement.in
            com.google.android.gms.internal.measurement.ij r10 = r0.mo42989c()
            r12 = 0
            r5 = r1
            r6 = r32
            r7 = r14
            r8 = r34
            r9 = r30
            r13 = r16
            r14 = r28
            r15 = r17
            r16 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0463:
            com.google.android.gms.internal.measurement.jn r0 = (com.google.android.gms.internal.measurement.C16646jn) r0
            r0.mo42987a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16619in.m54283a(java.lang.Class, com.google.android.gms.internal.measurement.ih, com.google.android.gms.internal.measurement.ir, com.google.android.gms.internal.measurement.hu, com.google.android.gms.internal.measurement.js, com.google.android.gms.internal.measurement.gu, com.google.android.gms.internal.measurement.ie):com.google.android.gms.internal.measurement.in");
    }

    /* renamed from: a */
    private static Field m54287a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final T mo42991a() {
        return this.f46470o.mo43000a(this.f46462g);
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.measurement.jc.a(java.lang.Object, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.C16635jc.m54417a(com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6), com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.C16635jc.m54417a(com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6), com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.C16635jc.m54417a(com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6), com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.C16635jc.m54417a(com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6), com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54566c(r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54566c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54542a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6) == com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C16657jy.m54567d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C16657jy.m54567d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C16657jy.m54572e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C16657jy.m54572e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.C16635jc.m54417a(com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6), com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42994a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f46458c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m54307d(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m54309e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r10, r4)
            int r4 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16635jc.m54417a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C16635jc.m54417a(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C16635jc.m54417a(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16635jc.m54417a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16635jc.m54417a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16635jc.m54417a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16635jc.m54417a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.measurement.C16657jy.m54566c(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.C16657jy.m54566c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.measurement.C16657jy.m54567d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.C16657jy.m54567d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m54306c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.measurement.C16657jy.m54572e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.C16657jy.m54572e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.measurement.js<?, ?> r0 = r9.f46472q
            java.lang.Object r0 = r0.mo43057b(r10)
            com.google.android.gms.internal.measurement.js<?, ?> r2 = r9.f46472q
            java.lang.Object r2 = r2.mo43057b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f46463h
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.measurement.gu<?> r0 = r9.f46473r
            com.google.android.gms.internal.measurement.gx r10 = r0.mo42893a(r10)
            com.google.android.gms.internal.measurement.gu<?> r0 = r9.f46473r
            com.google.android.gms.internal.measurement.gx r11 = r0.mo42893a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16619in.mo42994a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final int mo42990a(T t) {
        int length = this.f46458c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d = m54307d(i2);
            int i3 = this.f46458c[i2];
            long j = (long) (1048575 & d);
            int i4 = 37;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + C16586hh.m54184a(Double.doubleToLongBits(C16657jy.m54572e(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(C16657jy.m54567d(t, j));
                    break;
                case 2:
                    i = (i * 53) + C16586hh.m54184a(C16657jy.m54558b(t, j));
                    break;
                case 3:
                    i = (i * 53) + C16586hh.m54184a(C16657jy.m54558b(t, j));
                    break;
                case 4:
                    i = (i * 53) + C16657jy.m54542a((Object) t, j);
                    break;
                case 5:
                    i = (i * 53) + C16586hh.m54184a(C16657jy.m54558b(t, j));
                    break;
                case 6:
                    i = (i * 53) + C16657jy.m54542a((Object) t, j);
                    break;
                case 7:
                    i = (i * 53) + C16586hh.m54185a(C16657jy.m54566c(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) C16657jy.m54575f(t, j)).hashCode();
                    break;
                case 9:
                    Object f = C16657jy.m54575f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + C16657jy.m54575f(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + C16657jy.m54542a((Object) t, j);
                    break;
                case 12:
                    i = (i * 53) + C16657jy.m54542a((Object) t, j);
                    break;
                case 13:
                    i = (i * 53) + C16657jy.m54542a((Object) t, j);
                    break;
                case 14:
                    i = (i * 53) + C16586hh.m54184a(C16657jy.m54558b(t, j));
                    break;
                case 15:
                    i = (i * 53) + C16657jy.m54542a((Object) t, j);
                    break;
                case 16:
                    i = (i * 53) + C16586hh.m54184a(C16657jy.m54558b(t, j));
                    break;
                case 17:
                    Object f2 = C16657jy.m54575f(t, j);
                    if (f2 != null) {
                        i4 = f2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case BaseNotice.CHALLENGE /*34*/:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case BaseNotice.LIKE /*41*/:
                case 42:
                case 43:
                case 44:
                case BaseNotice.f89516AT /*45*/:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + C16657jy.m54575f(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + C16657jy.m54575f(t, j).hashCode();
                    break;
                case 51:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16586hh.m54184a(Double.doubleToLongBits(m54298b(t, j)));
                        break;
                    }
                case 52:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(m54304c(t, j));
                        break;
                    }
                case 53:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16586hh.m54184a(m54310e(t, j));
                        break;
                    }
                case 54:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16586hh.m54184a(m54310e(t, j));
                        break;
                    }
                case 55:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m54308d(t, j);
                        break;
                    }
                case 56:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16586hh.m54184a(m54310e(t, j));
                        break;
                    }
                case 57:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m54308d(t, j);
                        break;
                    }
                case 58:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16586hh.m54185a(m54312f(t, j));
                        break;
                    }
                case 59:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) C16657jy.m54575f(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16657jy.m54575f(t, j).hashCode();
                        break;
                    }
                case BaseNotice.TCM /*61*/:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16657jy.m54575f(t, j).hashCode();
                        break;
                    }
                case BaseNotice.CREATOR /*62*/:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m54308d(t, j);
                        break;
                    }
                case 63:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m54308d(t, j);
                        break;
                    }
                case 64:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m54308d(t, j);
                        break;
                    }
                case 65:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16586hh.m54184a(m54310e(t, j));
                        break;
                    }
                case 66:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m54308d(t, j);
                        break;
                    }
                case 67:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16586hh.m54184a(m54310e(t, j));
                        break;
                    }
                case 68:
                    if (!m54295a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16657jy.m54575f(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.f46472q.mo43057b(t).hashCode();
        return this.f46463h ? (hashCode * 53) + this.f46473r.mo42893a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo42996b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f46458c.length; i += 3) {
                int d = m54307d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f46458c[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54548a((Object) t, j, C16657jy.m54572e(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 1:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54549a((Object) t, j, C16657jy.m54567d(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 2:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54551a((Object) t, j, C16657jy.m54558b(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 3:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54551a((Object) t, j, C16657jy.m54558b(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 4:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54550a((Object) t, j, C16657jy.m54542a((Object) t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 5:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54551a((Object) t, j, C16657jy.m54558b(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 6:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54550a((Object) t, j, C16657jy.m54542a((Object) t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 7:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54553a((Object) t, j, C16657jy.m54566c(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 8:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54552a((Object) t, j, C16657jy.m54575f(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 9:
                        m54293a(t, t2, i);
                        break;
                    case 10:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54552a((Object) t, j, C16657jy.m54575f(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 11:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54550a((Object) t, j, C16657jy.m54542a((Object) t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 12:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54550a((Object) t, j, C16657jy.m54542a((Object) t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 13:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54550a((Object) t, j, C16657jy.m54542a((Object) t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 14:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54551a((Object) t, j, C16657jy.m54558b(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 15:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54550a((Object) t, j, C16657jy.m54542a((Object) t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 16:
                        if (!m54294a(t2, i)) {
                            break;
                        } else {
                            C16657jy.m54551a((Object) t, j, C16657jy.m54558b(t2, j));
                            m54300b(t, i);
                            break;
                        }
                    case 17:
                        m54293a(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case BaseNotice.CHALLENGE /*34*/:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case BaseNotice.LIKE /*41*/:
                    case 42:
                    case 43:
                    case 44:
                    case BaseNotice.f89516AT /*45*/:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f46471p.mo42970a(t, t2, j);
                        break;
                    case 50:
                        C16635jc.m54414a(this.f46474s, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m54295a(t2, i2, i)) {
                            break;
                        } else {
                            C16657jy.m54552a((Object) t, j, C16657jy.m54575f(t2, j));
                            m54301b(t, i2, i);
                            break;
                        }
                    case 60:
                        m54303b(t, t2, i);
                        break;
                    case BaseNotice.TCM /*61*/:
                    case BaseNotice.CREATOR /*62*/:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m54295a(t2, i2, i)) {
                            break;
                        } else {
                            C16657jy.m54552a((Object) t, j, C16657jy.m54575f(t2, j));
                            m54301b(t, i2, i);
                            break;
                        }
                    case 68:
                        m54303b(t, t2, i);
                        break;
                }
            }
            if (!this.f46465j) {
                C16635jc.m54415a(this.f46472q, t, t2);
                if (this.f46463h) {
                    C16635jc.m54413a(this.f46473r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private final void m54293a(T t, T t2, int i) {
        long d = (long) (m54307d(i) & 1048575);
        if (m54294a(t2, i)) {
            Object f = C16657jy.m54575f(t, d);
            Object f2 = C16657jy.m54575f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C16657jy.m54552a((Object) t, d, f2);
                    m54300b(t, i);
                }
                return;
            }
            C16657jy.m54552a((Object) t, d, C16586hh.m54187a(f, f2));
            m54300b(t, i);
        }
    }

    /* renamed from: b */
    private final void m54303b(T t, T t2, int i) {
        int d = m54307d(i);
        int i2 = this.f46458c[i];
        long j = (long) (d & 1048575);
        if (m54295a(t2, i2, i)) {
            Object f = C16657jy.m54575f(t, j);
            Object f2 = C16657jy.m54575f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C16657jy.m54552a((Object) t, j, f2);
                    m54301b(t, i2, i);
                }
                return;
            }
            C16657jy.m54552a((Object) t, j, C16586hh.m54187a(f, f2));
            m54301b(t, i2, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09cb, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0aef, code lost:
        r3 = r3 + 3;
        r9 = r18;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo42995b(T r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.f46465j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x055f
            sun.misc.Unsafe r2 = f46457b
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f46458c
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0557
            int r14 = r0.m54307d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f46458c
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.measurement.zzui r14 = com.google.android.gms.internal.measurement.zzui.zzbwu
            int r14 = r14.mo43285id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.measurement.zzui r14 = com.google.android.gms.internal.measurement.zzui.zzbxh
            int r14 = r14.mo43285id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f46458c
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x0544;
                case 1: goto L_0x0538;
                case 2: goto L_0x0528;
                case 3: goto L_0x0518;
                case 4: goto L_0x0508;
                case 5: goto L_0x04fc;
                case 6: goto L_0x04f0;
                case 7: goto L_0x04e4;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04af;
                case 10: goto L_0x049c;
                case 11: goto L_0x048b;
                case 12: goto L_0x047a;
                case 13: goto L_0x046d;
                case 14: goto L_0x0460;
                case 15: goto L_0x044f;
                case 16: goto L_0x043e;
                case 17: goto L_0x0427;
                case 18: goto L_0x041c;
                case 19: goto L_0x0411;
                case 20: goto L_0x0406;
                case 21: goto L_0x03fb;
                case 22: goto L_0x03f0;
                case 23: goto L_0x03e5;
                case 24: goto L_0x03da;
                case 25: goto L_0x03cf;
                case 26: goto L_0x03c4;
                case 27: goto L_0x03b5;
                case 28: goto L_0x03aa;
                case 29: goto L_0x039f;
                case 30: goto L_0x0394;
                case 31: goto L_0x0389;
                case 32: goto L_0x037e;
                case 33: goto L_0x0373;
                case 34: goto L_0x0368;
                case 35: goto L_0x0347;
                case 36: goto L_0x0326;
                case 37: goto L_0x0305;
                case 38: goto L_0x02e4;
                case 39: goto L_0x02c3;
                case 40: goto L_0x02a2;
                case 41: goto L_0x0281;
                case 42: goto L_0x0260;
                case 43: goto L_0x023f;
                case 44: goto L_0x021e;
                case 45: goto L_0x01fd;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01bb;
                case 48: goto L_0x019a;
                case 49: goto L_0x018b;
                case 50: goto L_0x017a;
                case 51: goto L_0x016b;
                case 52: goto L_0x015e;
                case 53: goto L_0x014d;
                case 54: goto L_0x013c;
                case 55: goto L_0x012b;
                case 56: goto L_0x011e;
                case 57: goto L_0x0111;
                case 58: goto L_0x0104;
                case 59: goto L_0x00e4;
                case 60: goto L_0x00cf;
                case 61: goto L_0x00bc;
                case 62: goto L_0x00ab;
                case 63: goto L_0x009a;
                case 64: goto L_0x008d;
                case 65: goto L_0x0080;
                case 66: goto L_0x006f;
                case 67: goto L_0x005e;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0551
        L_0x0047:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            com.google.android.gms.internal.measurement.ij r5 = (com.google.android.gms.internal.measurement.C16615ij) r5
            com.google.android.gms.internal.measurement.ja r6 = r0.m54284a(r12)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54926c(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x005e:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m54310e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54939f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x006f:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m54308d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54946h(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0080:
            boolean r5 = r0.m54295a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54947h(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x008d:
            boolean r5 = r0.m54295a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54951j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x009a:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m54308d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54953k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00ab:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m54308d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54942g(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00bc:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            com.google.android.gms.internal.measurement.zzte r5 = (com.google.android.gms.internal.measurement.zzte) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m54927c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00cf:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            com.google.android.gms.internal.measurement.ja r6 = r0.m54284a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54401a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00e4:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzte
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.measurement.zzte r5 = (com.google.android.gms.internal.measurement.zzte) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m54927c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00fb:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m54918b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0104:
            boolean r5 = r0.m54295a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54919b(r3, r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0111:
            boolean r5 = r0.m54295a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54949i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x011e:
            boolean r5 = r0.m54295a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54943g(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x012b:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m54308d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54938f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x013c:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m54310e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54935e(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x014d:
            boolean r14 = r0.m54295a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m54310e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54930d(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x015e:
            boolean r5 = r0.m54295a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54915b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x016b:
            boolean r5 = r0.m54295a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zztv.m54914b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x017a:
            com.google.android.gms.internal.measurement.ie r14 = r0.f46474s
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            java.lang.Object r6 = r0.m54299b(r12)
            int r3 = r14.mo42979a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x018b:
            java.util.List r5 = m54288a(r1, r5)
            com.google.android.gms.internal.measurement.ja r6 = r0.m54284a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54419b(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x019a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54427c(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x01ae
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01ae:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01bb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54442g(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x01cf
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01cf:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01dc:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54448i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x01f0
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f0:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54445h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x021e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54431d(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x0232
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0232:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x023f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54439f(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x0253
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0253:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0260:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54451j(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x0274
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0274:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0281:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54445h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x0295
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0295:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02a2:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54448i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x02b6
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02b6:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02c3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54435e(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x02d7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02d7:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02e4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54421b(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x02f8
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02f8:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0305:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54405a(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x0319
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0319:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0326:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54445h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x033a
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x033a:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0347:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16635jc.m54448i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f46466k
            if (r6 == 0) goto L_0x035b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x035b:
            int r3 = com.google.android.gms.internal.measurement.zztv.m54934e(r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m54941g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0368:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54426c(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0373:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54441g(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x037e:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54447i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0389:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54444h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0394:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54430d(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x039f:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54438f(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03aa:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54418b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03b5:
            java.util.List r5 = m54288a(r1, r5)
            com.google.android.gms.internal.measurement.ja r6 = r0.m54284a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54403a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03c4:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54402a(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03cf:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54450j(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03da:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54444h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03e5:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54447i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03f0:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54434e(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03fb:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54420b(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0406:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54404a(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0411:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54444h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x041c:
            java.util.List r5 = m54288a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54447i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0427:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            com.google.android.gms.internal.measurement.ij r5 = (com.google.android.gms.internal.measurement.C16615ij) r5
            com.google.android.gms.internal.measurement.ja r6 = r0.m54284a(r12)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54926c(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x043e:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54939f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x044f:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54946h(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0460:
            boolean r5 = r0.m54294a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54947h(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x046d:
            boolean r5 = r0.m54294a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54951j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x047a:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54953k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x048b:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54942g(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x049c:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            com.google.android.gms.internal.measurement.zzte r5 = (com.google.android.gms.internal.measurement.zzte) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m54927c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04af:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            com.google.android.gms.internal.measurement.ja r6 = r0.m54284a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16635jc.m54401a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04c4:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzte
            if (r6 == 0) goto L_0x04db
            com.google.android.gms.internal.measurement.zzte r5 = (com.google.android.gms.internal.measurement.zzte) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m54927c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04db:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m54918b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04e4:
            boolean r5 = r0.m54294a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54919b(r3, r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04f0:
            boolean r5 = r0.m54294a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54949i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04fc:
            boolean r5 = r0.m54294a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54943g(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0508:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54938f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0518:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54935e(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0528:
            boolean r14 = r0.m54294a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m54930d(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0538:
            boolean r5 = r0.m54294a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.zztv.m54915b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0544:
            boolean r5 = r0.m54294a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zztv.m54914b(r3, r5)
            int r13 = r13 + r3
        L_0x0551:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0557:
            com.google.android.gms.internal.measurement.js<?, ?> r2 = r0.f46472q
            int r1 = m54282a(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x055f:
            sun.misc.Unsafe r2 = f46457b
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x0566:
            int[] r13 = r0.f46458c
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0af7
            int r13 = r0.m54307d(r3)
            int[] r14 = r0.f46458c
            r14 = r14[r3]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r15
            int r15 = r16 >>> 20
            r4 = 17
            if (r15 > r4) goto L_0x0592
            int[] r4 = r0.f46458c
            int r16 = r3 + 2
            r4 = r4[r16]
            r11 = r4 & r8
            int r16 = r4 >>> 20
            int r16 = r7 << r16
            if (r11 == r6) goto L_0x05b3
            long r9 = (long) r11
            int r12 = r2.getInt(r1, r9)
            r6 = r11
            goto L_0x05b3
        L_0x0592:
            boolean r4 = r0.f46466k
            if (r4 == 0) goto L_0x05b0
            com.google.android.gms.internal.measurement.zzui r4 = com.google.android.gms.internal.measurement.zzui.zzbwu
            int r4 = r4.mo43285id()
            if (r15 < r4) goto L_0x05b0
            com.google.android.gms.internal.measurement.zzui r4 = com.google.android.gms.internal.measurement.zzui.zzbxh
            int r4 = r4.mo43285id()
            if (r15 > r4) goto L_0x05b0
            int[] r4 = r0.f46458c
            int r9 = r3 + 2
            r4 = r4[r9]
            r11 = r4 & r8
            r4 = r11
            goto L_0x05b1
        L_0x05b0:
            r4 = 0
        L_0x05b1:
            r16 = 0
        L_0x05b3:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r15) {
                case 0: goto L_0x0ae0;
                case 1: goto L_0x0ad0;
                case 2: goto L_0x0abe;
                case 3: goto L_0x0aad;
                case 4: goto L_0x0a9c;
                case 5: goto L_0x0a8d;
                case 6: goto L_0x0a81;
                case 7: goto L_0x0a76;
                case 8: goto L_0x0a58;
                case 9: goto L_0x0a45;
                case 10: goto L_0x0a35;
                case 11: goto L_0x0a27;
                case 12: goto L_0x0a19;
                case 13: goto L_0x0a0e;
                case 14: goto L_0x0a02;
                case 15: goto L_0x09f4;
                case 16: goto L_0x09e6;
                case 17: goto L_0x09d2;
                case 18: goto L_0x09be;
                case 19: goto L_0x09b1;
                case 20: goto L_0x09a4;
                case 21: goto L_0x0997;
                case 22: goto L_0x098a;
                case 23: goto L_0x097d;
                case 24: goto L_0x0970;
                case 25: goto L_0x0963;
                case 26: goto L_0x0957;
                case 27: goto L_0x0946;
                case 28: goto L_0x0939;
                case 29: goto L_0x092b;
                case 30: goto L_0x091d;
                case 31: goto L_0x090f;
                case 32: goto L_0x0901;
                case 33: goto L_0x08f3;
                case 34: goto L_0x08e5;
                case 35: goto L_0x08c4;
                case 36: goto L_0x08a3;
                case 37: goto L_0x0882;
                case 38: goto L_0x0861;
                case 39: goto L_0x0840;
                case 40: goto L_0x081f;
                case 41: goto L_0x07fe;
                case 42: goto L_0x07dd;
                case 43: goto L_0x07bc;
                case 44: goto L_0x079b;
                case 45: goto L_0x077a;
                case 46: goto L_0x0759;
                case 47: goto L_0x0738;
                case 48: goto L_0x0717;
                case 49: goto L_0x0706;
                case 50: goto L_0x06f5;
                case 51: goto L_0x06e6;
                case 52: goto L_0x06d8;
                case 53: goto L_0x06c7;
                case 54: goto L_0x06b6;
                case 55: goto L_0x06a5;
                case 56: goto L_0x0696;
                case 57: goto L_0x0688;
                case 58: goto L_0x067b;
                case 59: goto L_0x065b;
                case 60: goto L_0x0646;
                case 61: goto L_0x0633;
                case 62: goto L_0x0622;
                case 63: goto L_0x0611;
                case 64: goto L_0x0603;
                case 65: goto L_0x05f4;
                case 66: goto L_0x05e3;
                case 67: goto L_0x05d2;
                case 68: goto L_0x05bb;
                default: goto L_0x05b9;
            }
        L_0x05b9:
            goto L_0x09ca
        L_0x05bb:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.ij r4 = (com.google.android.gms.internal.measurement.C16615ij) r4
            com.google.android.gms.internal.measurement.ja r9 = r0.m54284a(r3)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54926c(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05d2:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m54310e(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54939f(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05e3:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m54308d(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54946h(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05f4:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zztv.m54947h(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0603:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m54951j(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0611:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m54308d(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54953k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0622:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m54308d(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54942g(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0633:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m54927c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0646:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.ja r9 = r0.m54284a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54401a(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x065b:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.zzte
            if (r9 == 0) goto L_0x0672
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m54927c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0672:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m54918b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x067b:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = com.google.android.gms.internal.measurement.zztv.m54919b(r14, r7)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0688:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m54949i(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0696:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zztv.m54943g(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06a5:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m54308d(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54938f(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06b6:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m54310e(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54935e(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06c7:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m54310e(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54930d(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06d8:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m54915b(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x06e6:
            boolean r4 = r0.m54295a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zztv.m54914b(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06f5:
            com.google.android.gms.internal.measurement.ie r4 = r0.f46474s
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.m54299b(r3)
            int r4 = r4.mo42979a(r14, r9, r10)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0706:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ja r9 = r0.m54284a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54419b(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0717:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54427c(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x072b
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x072b:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0738:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54442g(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x074c
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x074c:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0759:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54448i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x076d
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x076d:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x077a:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54445h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x078e
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x078e:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x079b:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54431d(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x07af
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07af:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07bc:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54439f(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x07d0
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07d0:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07dd:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54451j(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x07f1
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07f1:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07fe:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54445h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x0812
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0812:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x081f:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54448i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x0833
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0833:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0840:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54435e(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x0854
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0854:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0861:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54421b(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x0875
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0875:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0882:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54405a(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x0896
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0896:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08a3:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54445h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x08b7
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x08b7:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08c4:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C16635jc.m54448i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f46466k
            if (r10 == 0) goto L_0x08d8
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x08d8:
            int r4 = com.google.android.gms.internal.measurement.zztv.m54934e(r14)
            int r10 = com.google.android.gms.internal.measurement.zztv.m54941g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08e5:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54426c(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08f3:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54441g(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0901:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54447i(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x090f:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54444h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x091d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54430d(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x092b:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54438f(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0939:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54418b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0946:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ja r9 = r0.m54284a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54403a(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0957:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54402a(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0963:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54450j(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0970:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54444h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x097d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54447i(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x098a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54434e(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0997:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54420b(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09a4:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54404a(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09b1:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54444h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09be:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54447i(r14, r4, r11)
            int r5 = r5 + r4
        L_0x09ca:
            r4 = 0
        L_0x09cb:
            r9 = 0
            r10 = 0
            r18 = 0
            goto L_0x0aef
        L_0x09d2:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.ij r4 = (com.google.android.gms.internal.measurement.C16615ij) r4
            com.google.android.gms.internal.measurement.ja r9 = r0.m54284a(r3)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54926c(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09e6:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            long r9 = r2.getLong(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54939f(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09f4:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54946h(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a02:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zztv.m54947h(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a0e:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m54951j(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0a19:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54953k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a27:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zztv.m54942g(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a35:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m54927c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a45:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.ja r9 = r0.m54284a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16635jc.m54401a(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a58:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.zzte
            if (r9 == 0) goto L_0x0a6d
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m54927c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a6d:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m54918b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a76:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = com.google.android.gms.internal.measurement.zztv.m54919b(r14, r7)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a81:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m54949i(r14, r4)
            int r5 = r5 + r9
            goto L_0x09cb
        L_0x0a8d:
            r4 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x09cb
            r9 = 0
            int r11 = com.google.android.gms.internal.measurement.zztv.m54943g(r14, r9)
            int r5 = r5 + r11
            r18 = r9
            goto L_0x0ace
        L_0x0a9c:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.zztv.m54938f(r14, r9)
            int r5 = r5 + r9
            goto L_0x0ace
        L_0x0aad:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.zztv.m54935e(r14, r9)
            int r5 = r5 + r9
            goto L_0x0ace
        L_0x0abe:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.zztv.m54930d(r14, r9)
            int r5 = r5 + r9
        L_0x0ace:
            r9 = 0
            goto L_0x0add
        L_0x0ad0:
            r4 = 0
            r18 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x0ace
            r9 = 0
            int r10 = com.google.android.gms.internal.measurement.zztv.m54915b(r14, r9)
            int r5 = r5 + r10
        L_0x0add:
            r10 = 0
            goto L_0x0aef
        L_0x0ae0:
            r4 = 0
            r9 = 0
            r18 = 0
            r10 = r12 & r16
            if (r10 == 0) goto L_0x0add
            r10 = 0
            int r13 = com.google.android.gms.internal.measurement.zztv.m54914b(r14, r10)
            int r5 = r5 + r13
        L_0x0aef:
            int r3 = r3 + 3
            r9 = r18
            r4 = 0
            r11 = 0
            goto L_0x0566
        L_0x0af7:
            com.google.android.gms.internal.measurement.js<?, ?> r2 = r0.f46472q
            int r2 = m54282a(r2, (T) r1)
            int r5 = r5 + r2
            boolean r2 = r0.f46463h
            if (r2 == 0) goto L_0x0b0d
            com.google.android.gms.internal.measurement.gu<?> r2 = r0.f46473r
            com.google.android.gms.internal.measurement.gx r1 = r2.mo42893a(r1)
            int r1 = r1.mo42910g()
            int r5 = r5 + r1
        L_0x0b0d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16619in.mo42995b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m54282a(C16651js<UT, UB> jsVar, T t) {
        return jsVar.mo43065f(jsVar.mo43057b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m54288a(Object obj, long j) {
        return (List) C16657jy.m54575f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a27  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42993a(T r14, com.google.android.gms.internal.measurement.C16675kl r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo42843a()
            int r1 = com.google.android.gms.internal.measurement.C16579hf.C16584e.f46417k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0527
            com.google.android.gms.internal.measurement.js<?, ?> r0 = r13.f46472q
            m54290a(r0, (T) r14, r15)
            boolean r0 = r13.f46463h
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.gu<?> r0 = r13.f46473r
            com.google.android.gms.internal.measurement.gx r0 = r0.mo42893a(r14)
            boolean r1 = r0.mo42903b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo42907e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f46458c
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0037:
            if (r7 < 0) goto L_0x050f
            int r8 = r13.m54307d(r7)
            int[] r9 = r13.f46458c
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.gu<?> r10 = r13.f46473r
            int r10 = r10.mo42892a(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.measurement.gu<?> r10 = r13.f46473r
            r10.mo42897a(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fc;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04cc;
                case 4: goto L_0x04bc;
                case 5: goto L_0x04ac;
                case 6: goto L_0x049c;
                case 7: goto L_0x048b;
                case 8: goto L_0x047a;
                case 9: goto L_0x0465;
                case 10: goto L_0x0452;
                case 11: goto L_0x0441;
                case 12: goto L_0x0430;
                case 13: goto L_0x041f;
                case 14: goto L_0x040e;
                case 15: goto L_0x03fd;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0393;
                case 22: goto L_0x0382;
                case 23: goto L_0x0371;
                case 24: goto L_0x0360;
                case 25: goto L_0x034f;
                case 26: goto L_0x033e;
                case 27: goto L_0x0329;
                case 28: goto L_0x0318;
                case 29: goto L_0x0307;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02c3;
                case 34: goto L_0x02b2;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0290;
                case 37: goto L_0x027f;
                case 38: goto L_0x026e;
                case 39: goto L_0x025d;
                case 40: goto L_0x024c;
                case 41: goto L_0x023b;
                case 42: goto L_0x022a;
                case 43: goto L_0x0219;
                case 44: goto L_0x0208;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01e6;
                case 47: goto L_0x01d5;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01af;
                case 50: goto L_0x01a4;
                case 51: goto L_0x0193;
                case 52: goto L_0x0182;
                case 53: goto L_0x0171;
                case 54: goto L_0x0160;
                case 55: goto L_0x014f;
                case 56: goto L_0x013e;
                case 57: goto L_0x012d;
                case 58: goto L_0x011c;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f6;
                case 61: goto L_0x00e3;
                case 62: goto L_0x00d2;
                case 63: goto L_0x00c1;
                case 64: goto L_0x00b0;
                case 65: goto L_0x009f;
                case 66: goto L_0x008e;
                case 67: goto L_0x007d;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x050b
        L_0x0068:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            com.google.android.gms.internal.measurement.ja r10 = r13.m54284a(r7)
            r15.mo42861b(r9, r8, r10)
            goto L_0x050b
        L_0x007d:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m54310e(r14, r10)
            r15.mo42872e(r9, r10)
            goto L_0x050b
        L_0x008e:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m54308d(r14, r10)
            r15.mo42874f(r9, r8)
            goto L_0x050b
        L_0x009f:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m54310e(r14, r10)
            r15.mo42860b(r9, r10)
            goto L_0x050b
        L_0x00b0:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m54308d(r14, r10)
            r15.mo42847a(r9, r8)
            goto L_0x050b
        L_0x00c1:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m54308d(r14, r10)
            r15.mo42859b(r9, r8)
            goto L_0x050b
        L_0x00d2:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m54308d(r14, r10)
            r15.mo42871e(r9, r8)
            goto L_0x050b
        L_0x00e3:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            com.google.android.gms.internal.measurement.zzte r8 = (com.google.android.gms.internal.measurement.zzte) r8
            r15.mo42850a(r9, r8)
            goto L_0x050b
        L_0x00f6:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            com.google.android.gms.internal.measurement.ja r10 = r13.m54284a(r7)
            r15.mo42852a(r9, r8, r10)
            goto L_0x050b
        L_0x010b:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            m54289a(r9, r8, r15)
            goto L_0x050b
        L_0x011c:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m54312f(r14, r10)
            r15.mo42857a(r9, r8)
            goto L_0x050b
        L_0x012d:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m54308d(r14, r10)
            r15.mo42868d(r9, r8)
            goto L_0x050b
        L_0x013e:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m54310e(r14, r10)
            r15.mo42869d(r9, r10)
            goto L_0x050b
        L_0x014f:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m54308d(r14, r10)
            r15.mo42865c(r9, r8)
            goto L_0x050b
        L_0x0160:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m54310e(r14, r10)
            r15.mo42866c(r9, r10)
            goto L_0x050b
        L_0x0171:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m54310e(r14, r10)
            r15.mo42848a(r9, r10)
            goto L_0x050b
        L_0x0182:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m54304c(r14, r10)
            r15.mo42846a(r9, r8)
            goto L_0x050b
        L_0x0193:
            boolean r10 = r13.m54295a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m54298b((T) r14, r10)
            r15.mo42845a(r9, r10)
            goto L_0x050b
        L_0x01a4:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            r13.m54291a(r15, r9, r8, r7)
            goto L_0x050b
        L_0x01af:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.ja r10 = r13.m54284a(r7)
            com.google.android.gms.internal.measurement.C16635jc.m54424b(r9, r8, r15, r10)
            goto L_0x050b
        L_0x01c4:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54437e(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01d5:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54452j(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01e6:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54443g(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01f7:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54454l(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0208:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54455m(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0219:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54449i(r9, r8, r15, r4)
            goto L_0x050b
        L_0x022a:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54456n(r9, r8, r15, r4)
            goto L_0x050b
        L_0x023b:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54453k(r9, r8, r15, r4)
            goto L_0x050b
        L_0x024c:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54440f(r9, r8, r15, r4)
            goto L_0x050b
        L_0x025d:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54446h(r9, r8, r15, r4)
            goto L_0x050b
        L_0x026e:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54433d(r9, r8, r15, r4)
            goto L_0x050b
        L_0x027f:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54429c(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0290:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54425b(r9, r8, r15, r4)
            goto L_0x050b
        L_0x02a1:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54412a(r9, r8, r15, r4)
            goto L_0x050b
        L_0x02b2:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54437e(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02c3:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54452j(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02d4:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54443g(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02e5:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54454l(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02f6:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54455m(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0307:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54449i(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0318:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54423b(r9, r8, r15)
            goto L_0x050b
        L_0x0329:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.ja r10 = r13.m54284a(r7)
            com.google.android.gms.internal.measurement.C16635jc.m54411a(r9, r8, r15, r10)
            goto L_0x050b
        L_0x033e:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54410a(r9, r8, r15)
            goto L_0x050b
        L_0x034f:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54456n(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0360:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54453k(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0371:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54440f(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0382:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54446h(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0393:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54433d(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03a4:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54429c(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03b5:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54425b(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03c6:
            int[] r9 = r13.f46458c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16635jc.m54412a(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03d7:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            com.google.android.gms.internal.measurement.ja r10 = r13.m54284a(r7)
            r15.mo42861b(r9, r8, r10)
            goto L_0x050b
        L_0x03ec:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r10)
            r15.mo42872e(r9, r10)
            goto L_0x050b
        L_0x03fd:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r10)
            r15.mo42874f(r9, r8)
            goto L_0x050b
        L_0x040e:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r10)
            r15.mo42860b(r9, r10)
            goto L_0x050b
        L_0x041f:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r10)
            r15.mo42847a(r9, r8)
            goto L_0x050b
        L_0x0430:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r10)
            r15.mo42859b(r9, r8)
            goto L_0x050b
        L_0x0441:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r10)
            r15.mo42871e(r9, r8)
            goto L_0x050b
        L_0x0452:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            com.google.android.gms.internal.measurement.zzte r8 = (com.google.android.gms.internal.measurement.zzte) r8
            r15.mo42850a(r9, r8)
            goto L_0x050b
        L_0x0465:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            com.google.android.gms.internal.measurement.ja r10 = r13.m54284a(r7)
            r15.mo42852a(r9, r8, r10)
            goto L_0x050b
        L_0x047a:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r10)
            m54289a(r9, r8, r15)
            goto L_0x050b
        L_0x048b:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.C16657jy.m54566c(r14, r10)
            r15.mo42857a(r9, r8)
            goto L_0x050b
        L_0x049c:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r10)
            r15.mo42868d(r9, r8)
            goto L_0x050b
        L_0x04ac:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r10)
            r15.mo42869d(r9, r10)
            goto L_0x050b
        L_0x04bc:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r10)
            r15.mo42865c(r9, r8)
            goto L_0x050b
        L_0x04cc:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r10)
            r15.mo42866c(r9, r10)
            goto L_0x050b
        L_0x04dc:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r10)
            r15.mo42848a(r9, r10)
            goto L_0x050b
        L_0x04ec:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.C16657jy.m54567d(r14, r10)
            r15.mo42846a(r9, r8)
            goto L_0x050b
        L_0x04fc:
            boolean r10 = r13.m54294a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.measurement.C16657jy.m54572e(r14, r10)
            r15.mo42845a(r9, r10)
        L_0x050b:
            int r7 = r7 + -3
            goto L_0x0037
        L_0x050f:
            if (r1 == 0) goto L_0x0526
            com.google.android.gms.internal.measurement.gu<?> r14 = r13.f46473r
            r14.mo42897a(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0524
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x050f
        L_0x0524:
            r1 = r3
            goto L_0x050f
        L_0x0526:
            return
        L_0x0527:
            boolean r0 = r13.f46465j
            if (r0 == 0) goto L_0x0a42
            boolean r0 = r13.f46463h
            if (r0 == 0) goto L_0x0546
            com.google.android.gms.internal.measurement.gu<?> r0 = r13.f46473r
            com.google.android.gms.internal.measurement.gx r0 = r0.mo42893a(r14)
            boolean r1 = r0.mo42903b()
            if (r1 != 0) goto L_0x0546
            java.util.Iterator r0 = r0.mo42906d()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0548
        L_0x0546:
            r0 = r3
            r1 = r0
        L_0x0548:
            int[] r7 = r13.f46458c
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x054d:
            if (r1 >= r7) goto L_0x0a25
            int r9 = r13.m54307d(r1)
            int[] r10 = r13.f46458c
            r10 = r10[r1]
        L_0x0557:
            if (r8 == 0) goto L_0x0575
            com.google.android.gms.internal.measurement.gu<?> r11 = r13.f46473r
            int r11 = r11.mo42892a(r8)
            if (r11 > r10) goto L_0x0575
            com.google.android.gms.internal.measurement.gu<?> r11 = r13.f46473r
            r11.mo42897a(r15, r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0573
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x0557
        L_0x0573:
            r8 = r3
            goto L_0x0557
        L_0x0575:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a12;
                case 1: goto L_0x0a02;
                case 2: goto L_0x09f2;
                case 3: goto L_0x09e2;
                case 4: goto L_0x09d2;
                case 5: goto L_0x09c2;
                case 6: goto L_0x09b2;
                case 7: goto L_0x09a1;
                case 8: goto L_0x0990;
                case 9: goto L_0x097b;
                case 10: goto L_0x0968;
                case 11: goto L_0x0957;
                case 12: goto L_0x0946;
                case 13: goto L_0x0935;
                case 14: goto L_0x0924;
                case 15: goto L_0x0913;
                case 16: goto L_0x0902;
                case 17: goto L_0x08ed;
                case 18: goto L_0x08dc;
                case 19: goto L_0x08cb;
                case 20: goto L_0x08ba;
                case 21: goto L_0x08a9;
                case 22: goto L_0x0898;
                case 23: goto L_0x0887;
                case 24: goto L_0x0876;
                case 25: goto L_0x0865;
                case 26: goto L_0x0854;
                case 27: goto L_0x083f;
                case 28: goto L_0x082e;
                case 29: goto L_0x081d;
                case 30: goto L_0x080c;
                case 31: goto L_0x07fb;
                case 32: goto L_0x07ea;
                case 33: goto L_0x07d9;
                case 34: goto L_0x07c8;
                case 35: goto L_0x07b7;
                case 36: goto L_0x07a6;
                case 37: goto L_0x0795;
                case 38: goto L_0x0784;
                case 39: goto L_0x0773;
                case 40: goto L_0x0762;
                case 41: goto L_0x0751;
                case 42: goto L_0x0740;
                case 43: goto L_0x072f;
                case 44: goto L_0x071e;
                case 45: goto L_0x070d;
                case 46: goto L_0x06fc;
                case 47: goto L_0x06eb;
                case 48: goto L_0x06da;
                case 49: goto L_0x06c5;
                case 50: goto L_0x06ba;
                case 51: goto L_0x06a9;
                case 52: goto L_0x0698;
                case 53: goto L_0x0687;
                case 54: goto L_0x0676;
                case 55: goto L_0x0665;
                case 56: goto L_0x0654;
                case 57: goto L_0x0643;
                case 58: goto L_0x0632;
                case 59: goto L_0x0621;
                case 60: goto L_0x060c;
                case 61: goto L_0x05f9;
                case 62: goto L_0x05e8;
                case 63: goto L_0x05d7;
                case 64: goto L_0x05c6;
                case 65: goto L_0x05b5;
                case 66: goto L_0x05a4;
                case 67: goto L_0x0593;
                case 68: goto L_0x057e;
                default: goto L_0x057c;
            }
        L_0x057c:
            goto L_0x0a21
        L_0x057e:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            com.google.android.gms.internal.measurement.ja r11 = r13.m54284a(r1)
            r15.mo42861b(r10, r9, r11)
            goto L_0x0a21
        L_0x0593:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m54310e(r14, r11)
            r15.mo42872e(r10, r11)
            goto L_0x0a21
        L_0x05a4:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m54308d(r14, r11)
            r15.mo42874f(r10, r9)
            goto L_0x0a21
        L_0x05b5:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m54310e(r14, r11)
            r15.mo42860b(r10, r11)
            goto L_0x0a21
        L_0x05c6:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m54308d(r14, r11)
            r15.mo42847a(r10, r9)
            goto L_0x0a21
        L_0x05d7:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m54308d(r14, r11)
            r15.mo42859b(r10, r9)
            goto L_0x0a21
        L_0x05e8:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m54308d(r14, r11)
            r15.mo42871e(r10, r9)
            goto L_0x0a21
        L_0x05f9:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            com.google.android.gms.internal.measurement.zzte r9 = (com.google.android.gms.internal.measurement.zzte) r9
            r15.mo42850a(r10, r9)
            goto L_0x0a21
        L_0x060c:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            com.google.android.gms.internal.measurement.ja r11 = r13.m54284a(r1)
            r15.mo42852a(r10, r9, r11)
            goto L_0x0a21
        L_0x0621:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            m54289a(r10, r9, r15)
            goto L_0x0a21
        L_0x0632:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m54312f(r14, r11)
            r15.mo42857a(r10, r9)
            goto L_0x0a21
        L_0x0643:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m54308d(r14, r11)
            r15.mo42868d(r10, r9)
            goto L_0x0a21
        L_0x0654:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m54310e(r14, r11)
            r15.mo42869d(r10, r11)
            goto L_0x0a21
        L_0x0665:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m54308d(r14, r11)
            r15.mo42865c(r10, r9)
            goto L_0x0a21
        L_0x0676:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m54310e(r14, r11)
            r15.mo42866c(r10, r11)
            goto L_0x0a21
        L_0x0687:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m54310e(r14, r11)
            r15.mo42848a(r10, r11)
            goto L_0x0a21
        L_0x0698:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m54304c(r14, r11)
            r15.mo42846a(r10, r9)
            goto L_0x0a21
        L_0x06a9:
            boolean r11 = r13.m54295a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m54298b((T) r14, r11)
            r15.mo42845a(r10, r11)
            goto L_0x0a21
        L_0x06ba:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            r13.m54291a(r15, r10, r9, r1)
            goto L_0x0a21
        L_0x06c5:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.ja r11 = r13.m54284a(r1)
            com.google.android.gms.internal.measurement.C16635jc.m54424b(r10, r9, r15, r11)
            goto L_0x0a21
        L_0x06da:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54437e(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06eb:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54452j(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06fc:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54443g(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x070d:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54454l(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x071e:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54455m(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x072f:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54449i(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0740:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54456n(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0751:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54453k(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0762:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54440f(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0773:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54446h(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0784:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54433d(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0795:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54429c(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07a6:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54425b(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07b7:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54412a(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07c8:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54437e(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07d9:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54452j(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07ea:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54443g(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07fb:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54454l(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x080c:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54455m(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x081d:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54449i(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x082e:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54423b(r10, r9, r15)
            goto L_0x0a21
        L_0x083f:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.ja r11 = r13.m54284a(r1)
            com.google.android.gms.internal.measurement.C16635jc.m54411a(r10, r9, r15, r11)
            goto L_0x0a21
        L_0x0854:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54410a(r10, r9, r15)
            goto L_0x0a21
        L_0x0865:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54456n(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0876:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54453k(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0887:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54440f(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0898:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54446h(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08a9:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54433d(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08ba:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54429c(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08cb:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54425b(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08dc:
            int[] r10 = r13.f46458c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16635jc.m54412a(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08ed:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            com.google.android.gms.internal.measurement.ja r11 = r13.m54284a(r1)
            r15.mo42861b(r10, r9, r11)
            goto L_0x0a21
        L_0x0902:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r11)
            r15.mo42872e(r10, r11)
            goto L_0x0a21
        L_0x0913:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r11)
            r15.mo42874f(r10, r9)
            goto L_0x0a21
        L_0x0924:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r11)
            r15.mo42860b(r10, r11)
            goto L_0x0a21
        L_0x0935:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r11)
            r15.mo42847a(r10, r9)
            goto L_0x0a21
        L_0x0946:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r11)
            r15.mo42859b(r10, r9)
            goto L_0x0a21
        L_0x0957:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r11)
            r15.mo42871e(r10, r9)
            goto L_0x0a21
        L_0x0968:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            com.google.android.gms.internal.measurement.zzte r9 = (com.google.android.gms.internal.measurement.zzte) r9
            r15.mo42850a(r10, r9)
            goto L_0x0a21
        L_0x097b:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            com.google.android.gms.internal.measurement.ja r11 = r13.m54284a(r1)
            r15.mo42852a(r10, r9, r11)
            goto L_0x0a21
        L_0x0990:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r11)
            m54289a(r10, r9, r15)
            goto L_0x0a21
        L_0x09a1:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.measurement.C16657jy.m54566c(r14, r11)
            r15.mo42857a(r10, r9)
            goto L_0x0a21
        L_0x09b2:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r11)
            r15.mo42868d(r10, r9)
            goto L_0x0a21
        L_0x09c2:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r11)
            r15.mo42869d(r10, r11)
            goto L_0x0a21
        L_0x09d2:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16657jy.m54542a(r14, r11)
            r15.mo42865c(r10, r9)
            goto L_0x0a21
        L_0x09e2:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r11)
            r15.mo42866c(r10, r11)
            goto L_0x0a21
        L_0x09f2:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16657jy.m54558b(r14, r11)
            r15.mo42848a(r10, r11)
            goto L_0x0a21
        L_0x0a02:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.measurement.C16657jy.m54567d(r14, r11)
            r15.mo42846a(r10, r9)
            goto L_0x0a21
        L_0x0a12:
            boolean r11 = r13.m54294a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.measurement.C16657jy.m54572e(r14, r11)
            r15.mo42845a(r10, r11)
        L_0x0a21:
            int r1 = r1 + 3
            goto L_0x054d
        L_0x0a25:
            if (r8 == 0) goto L_0x0a3c
            com.google.android.gms.internal.measurement.gu<?> r1 = r13.f46473r
            r1.mo42897a(r15, r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a25
        L_0x0a3a:
            r8 = r3
            goto L_0x0a25
        L_0x0a3c:
            com.google.android.gms.internal.measurement.js<?, ?> r0 = r13.f46472q
            m54290a(r0, (T) r14, r15)
            return
        L_0x0a42:
            r13.m54302b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16619in.mo42993a(java.lang.Object, com.google.android.gms.internal.measurement.kl):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m54302b(T r20, com.google.android.gms.internal.measurement.C16675kl r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f46463h
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.measurement.gu<?> r3 = r0.f46473r
            com.google.android.gms.internal.measurement.gx r3 = r3.mo42893a(r1)
            boolean r5 = r3.mo42903b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo42906d()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f46458c
            int r7 = r7.length
            sun.misc.Unsafe r8 = f46457b
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x0525
            int r12 = r0.m54307d(r5)
            int[] r13 = r0.f46458c
            r13 = r13[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r12
            int r14 = r14 >>> 20
            boolean r15 = r0.f46465j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 != 0) goto L_0x0061
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.f46458c
            int r17 = r5 + 2
            r15 = r15[r17]
            r9 = r15 & r16
            if (r9 == r6) goto L_0x0059
            r18 = r5
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
            goto L_0x005b
        L_0x0059:
            r18 = r5
        L_0x005b:
            int r4 = r15 >>> 20
            r5 = 1
            int r9 = r5 << r4
            goto L_0x0064
        L_0x0061:
            r18 = r5
            r9 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0083
            com.google.android.gms.internal.measurement.gu<?> r4 = r0.f46473r
            int r4 = r4.mo42892a(r10)
            if (r4 > r13) goto L_0x0083
            com.google.android.gms.internal.measurement.gu<?> r4 = r0.f46473r
            r4.mo42897a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0064
        L_0x0081:
            r10 = 0
            goto L_0x0064
        L_0x0083:
            r4 = r12 & r16
            long r4 = (long) r4
            switch(r14) {
                case 0: goto L_0x0514;
                case 1: goto L_0x0506;
                case 2: goto L_0x04f8;
                case 3: goto L_0x04ea;
                case 4: goto L_0x04dc;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c0;
                case 7: goto L_0x04b2;
                case 8: goto L_0x04a3;
                case 9: goto L_0x0490;
                case 10: goto L_0x047f;
                case 11: goto L_0x0470;
                case 12: goto L_0x0461;
                case 13: goto L_0x0452;
                case 14: goto L_0x0443;
                case 15: goto L_0x0434;
                case 16: goto L_0x0425;
                case 17: goto L_0x0412;
                case 18: goto L_0x0400;
                case 19: goto L_0x03ee;
                case 20: goto L_0x03dc;
                case 21: goto L_0x03ca;
                case 22: goto L_0x03b8;
                case 23: goto L_0x03a6;
                case 24: goto L_0x0394;
                case 25: goto L_0x0382;
                case 26: goto L_0x0371;
                case 27: goto L_0x035c;
                case 28: goto L_0x034b;
                case 29: goto L_0x0339;
                case 30: goto L_0x0327;
                case 31: goto L_0x0315;
                case 32: goto L_0x0303;
                case 33: goto L_0x02f1;
                case 34: goto L_0x02df;
                case 35: goto L_0x02cd;
                case 36: goto L_0x02bb;
                case 37: goto L_0x02a9;
                case 38: goto L_0x0297;
                case 39: goto L_0x0285;
                case 40: goto L_0x0273;
                case 41: goto L_0x0261;
                case 42: goto L_0x024f;
                case 43: goto L_0x023d;
                case 44: goto L_0x022b;
                case 45: goto L_0x0219;
                case 46: goto L_0x0207;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01ce;
                case 50: goto L_0x01c3;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a1;
                case 53: goto L_0x0190;
                case 54: goto L_0x017f;
                case 55: goto L_0x016e;
                case 56: goto L_0x015d;
                case 57: goto L_0x014c;
                case 58: goto L_0x013b;
                case 59: goto L_0x012a;
                case 60: goto L_0x0115;
                case 61: goto L_0x0102;
                case 62: goto L_0x00f2;
                case 63: goto L_0x00e2;
                case 64: goto L_0x00d2;
                case 65: goto L_0x00c2;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a2;
                case 68: goto L_0x008e;
                default: goto L_0x0089;
            }
        L_0x0089:
            r12 = r18
        L_0x008b:
            r14 = 0
            goto L_0x0521
        L_0x008e:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.ja r5 = r0.m54284a(r12)
            r2.mo42861b(r13, r4, r5)
            goto L_0x008b
        L_0x00a2:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m54310e(r1, r4)
            r2.mo42872e(r13, r4)
            goto L_0x008b
        L_0x00b2:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m54308d(r1, r4)
            r2.mo42874f(r13, r4)
            goto L_0x008b
        L_0x00c2:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m54310e(r1, r4)
            r2.mo42860b(r13, r4)
            goto L_0x008b
        L_0x00d2:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m54308d(r1, r4)
            r2.mo42847a(r13, r4)
            goto L_0x008b
        L_0x00e2:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m54308d(r1, r4)
            r2.mo42859b(r13, r4)
            goto L_0x008b
        L_0x00f2:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m54308d(r1, r4)
            r2.mo42871e(r13, r4)
            goto L_0x008b
        L_0x0102:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            r2.mo42850a(r13, r4)
            goto L_0x008b
        L_0x0115:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.ja r5 = r0.m54284a(r12)
            r2.mo42852a(r13, r4, r5)
            goto L_0x008b
        L_0x012a:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            m54289a(r13, r4, r2)
            goto L_0x008b
        L_0x013b:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            boolean r4 = m54312f(r1, r4)
            r2.mo42857a(r13, r4)
            goto L_0x008b
        L_0x014c:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m54308d(r1, r4)
            r2.mo42868d(r13, r4)
            goto L_0x008b
        L_0x015d:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m54310e(r1, r4)
            r2.mo42869d(r13, r4)
            goto L_0x008b
        L_0x016e:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m54308d(r1, r4)
            r2.mo42865c(r13, r4)
            goto L_0x008b
        L_0x017f:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m54310e(r1, r4)
            r2.mo42866c(r13, r4)
            goto L_0x008b
        L_0x0190:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m54310e(r1, r4)
            r2.mo42848a(r13, r4)
            goto L_0x008b
        L_0x01a1:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            float r4 = m54304c(r1, r4)
            r2.mo42846a(r13, r4)
            goto L_0x008b
        L_0x01b2:
            r12 = r18
            boolean r9 = r0.m54295a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            double r4 = m54298b((T) r1, r4)
            r2.mo42845a(r13, r4)
            goto L_0x008b
        L_0x01c3:
            r12 = r18
            java.lang.Object r4 = r8.getObject(r1, r4)
            r0.m54291a(r2, r13, r4, r12)
            goto L_0x008b
        L_0x01ce:
            r12 = r18
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ja r5 = r0.m54284a(r12)
            com.google.android.gms.internal.measurement.C16635jc.m54424b(r9, r4, r2, r5)
            goto L_0x008b
        L_0x01e3:
            r12 = r18
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            com.google.android.gms.internal.measurement.C16635jc.m54437e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x01f5:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54452j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0207:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54443g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0219:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54454l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x022b:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54455m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x023d:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54449i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x024f:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54456n(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0261:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54453k(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0273:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54440f(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0285:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54446h(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0297:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54433d(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02a9:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54429c(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02bb:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54425b(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02cd:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54412a(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02df:
            r12 = r18
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            com.google.android.gms.internal.measurement.C16635jc.m54437e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02f1:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54452j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0303:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54443g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0315:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54454l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0327:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54455m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0339:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54449i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x034b:
            r12 = r18
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54423b(r9, r4, r2)
            goto L_0x008b
        L_0x035c:
            r12 = r18
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ja r5 = r0.m54284a(r12)
            com.google.android.gms.internal.measurement.C16635jc.m54411a(r9, r4, r2, r5)
            goto L_0x008b
        L_0x0371:
            r12 = r18
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54410a(r9, r4, r2)
            goto L_0x008b
        L_0x0382:
            r12 = r18
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.measurement.C16635jc.m54456n(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0394:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54453k(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03a6:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54440f(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03b8:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54446h(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ca:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54433d(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03dc:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54429c(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ee:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54425b(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0400:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f46458c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16635jc.m54412a(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0412:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.ja r5 = r0.m54284a(r12)
            r2.mo42861b(r13, r4, r5)
            goto L_0x0521
        L_0x0425:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo42872e(r13, r4)
            goto L_0x0521
        L_0x0434:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo42874f(r13, r4)
            goto L_0x0521
        L_0x0443:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo42860b(r13, r4)
            goto L_0x0521
        L_0x0452:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo42847a(r13, r4)
            goto L_0x0521
        L_0x0461:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo42859b(r13, r4)
            goto L_0x0521
        L_0x0470:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo42871e(r13, r4)
            goto L_0x0521
        L_0x047f:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            r2.mo42850a(r13, r4)
            goto L_0x0521
        L_0x0490:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.ja r5 = r0.m54284a(r12)
            r2.mo42852a(r13, r4, r5)
            goto L_0x0521
        L_0x04a3:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            m54289a(r13, r4, r2)
            goto L_0x0521
        L_0x04b2:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            boolean r4 = com.google.android.gms.internal.measurement.C16657jy.m54566c(r1, r4)
            r2.mo42857a(r13, r4)
            goto L_0x0521
        L_0x04c0:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo42868d(r13, r4)
            goto L_0x0521
        L_0x04ce:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo42869d(r13, r4)
            goto L_0x0521
        L_0x04dc:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo42865c(r13, r4)
            goto L_0x0521
        L_0x04ea:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo42866c(r13, r4)
            goto L_0x0521
        L_0x04f8:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo42848a(r13, r4)
            goto L_0x0521
        L_0x0506:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            float r4 = com.google.android.gms.internal.measurement.C16657jy.m54567d(r1, r4)
            r2.mo42846a(r13, r4)
            goto L_0x0521
        L_0x0514:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            double r4 = com.google.android.gms.internal.measurement.C16657jy.m54572e(r1, r4)
            r2.mo42845a(r13, r4)
        L_0x0521:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0525:
            if (r10 == 0) goto L_0x053c
            com.google.android.gms.internal.measurement.gu<?> r4 = r0.f46473r
            r4.mo42897a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x053a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0525
        L_0x053a:
            r10 = 0
            goto L_0x0525
        L_0x053c:
            com.google.android.gms.internal.measurement.js<?, ?> r3 = r0.f46472q
            m54290a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16619in.m54302b(java.lang.Object, com.google.android.gms.internal.measurement.kl):void");
    }

    /* renamed from: a */
    private final <K, V> void m54291a(C16675kl klVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            klVar.mo42849a(i, this.f46474s.mo42986f(m54299b(i2)), this.f46474s.mo42982b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m54290a(C16651js<UT, UB> jsVar, T t, C16675kl klVar) throws IOException {
        jsVar.mo43054a(jsVar.mo43057b(t), klVar);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42992a(T r18, com.google.android.gms.internal.measurement.C16631iz r19, com.google.android.gms.internal.measurement.C16565gt r20) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r10 = r20
            if (r10 == 0) goto L_0x05eb
            com.google.android.gms.internal.measurement.js<?, ?> r11 = r1.f46472q
            com.google.android.gms.internal.measurement.gu<?> r12 = r1.f46473r
            r13 = 0
            r3 = r13
            r14 = r3
        L_0x0011:
            int r4 = r19.mo42801a()     // Catch:{ all -> 0x05d3 }
            int r5 = r1.f46460e     // Catch:{ all -> 0x05d3 }
            r6 = -1
            if (r4 < r5) goto L_0x003e
            int r5 = r1.f46461f     // Catch:{ all -> 0x05d3 }
            if (r4 > r5) goto L_0x003e
            r5 = 0
            int[] r7 = r1.f46458c     // Catch:{ all -> 0x05d3 }
            int r7 = r7.length     // Catch:{ all -> 0x05d3 }
            int r7 = r7 / 3
            int r7 = r7 + -1
        L_0x0026:
            if (r5 > r7) goto L_0x003e
            int r8 = r7 + r5
            int r8 = r8 >>> 1
            int r9 = r8 * 3
            int[] r15 = r1.f46458c     // Catch:{ all -> 0x05d3 }
            r15 = r15[r9]     // Catch:{ all -> 0x05d3 }
            if (r4 != r15) goto L_0x0036
            r6 = r9
            goto L_0x003e
        L_0x0036:
            if (r4 >= r15) goto L_0x003b
            int r7 = r8 + -1
            goto L_0x0026
        L_0x003b:
            int r5 = r8 + 1
            goto L_0x0026
        L_0x003e:
            if (r6 >= 0) goto L_0x00a5
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x005c
            int r0 = r1.f46468m
        L_0x0047:
            int r3 = r1.f46469n
            if (r0 >= r3) goto L_0x0056
            int[] r3 = r1.f46467l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m54286a(r2, r3, (UB) r14, r11)
            int r0 = r0 + 1
            goto L_0x0047
        L_0x0056:
            if (r14 == 0) goto L_0x005b
            r11.mo43060b(r2, r14)
        L_0x005b:
            return
        L_0x005c:
            boolean r5 = r1.f46463h     // Catch:{ all -> 0x05d3 }
            if (r5 != 0) goto L_0x0062
            r5 = r13
            goto L_0x0069
        L_0x0062:
            com.google.android.gms.internal.measurement.ij r5 = r1.f46462g     // Catch:{ all -> 0x05d3 }
            java.lang.Object r4 = r12.mo42894a(r10, r5, r4)     // Catch:{ all -> 0x05d3 }
            r5 = r4
        L_0x0069:
            if (r5 == 0) goto L_0x0081
            if (r3 != 0) goto L_0x0071
            com.google.android.gms.internal.measurement.gx r3 = r12.mo42900b(r2)     // Catch:{ all -> 0x05d3 }
        L_0x0071:
            r15 = r3
            r3 = r12
            r4 = r19
            r6 = r20
            r7 = r15
            r8 = r14
            r9 = r11
            java.lang.Object r3 = r3.mo42895a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x05d3 }
            r14 = r3
            r3 = r15
            goto L_0x0011
        L_0x0081:
            if (r14 != 0) goto L_0x0088
            java.lang.Object r4 = r11.mo43061c(r2)     // Catch:{ all -> 0x05d3 }
            r14 = r4
        L_0x0088:
            boolean r4 = r11.mo43056a(r14, r0)     // Catch:{ all -> 0x05d3 }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f46468m
        L_0x0090:
            int r3 = r1.f46469n
            if (r0 >= r3) goto L_0x009f
            int[] r3 = r1.f46467l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m54286a(r2, r3, (UB) r14, r11)
            int r0 = r0 + 1
            goto L_0x0090
        L_0x009f:
            if (r14 == 0) goto L_0x00a4
            r11.mo43060b(r2, r14)
        L_0x00a4:
            return
        L_0x00a5:
            int r5 = r1.m54307d(r6)     // Catch:{ all -> 0x05d3 }
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r7 = r7 & r5
            int r7 = r7 >>> 20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L_0x0582;
                case 1: goto L_0x0573;
                case 2: goto L_0x0564;
                case 3: goto L_0x0555;
                case 4: goto L_0x0546;
                case 5: goto L_0x0537;
                case 6: goto L_0x0528;
                case 7: goto L_0x0519;
                case 8: goto L_0x0511;
                case 9: goto L_0x04e0;
                case 10: goto L_0x04d1;
                case 11: goto L_0x04c2;
                case 12: goto L_0x04a0;
                case 13: goto L_0x0491;
                case 14: goto L_0x0482;
                case 15: goto L_0x0473;
                case 16: goto L_0x0464;
                case 17: goto L_0x0433;
                case 18: goto L_0x0426;
                case 19: goto L_0x0419;
                case 20: goto L_0x040c;
                case 21: goto L_0x03ff;
                case 22: goto L_0x03f2;
                case 23: goto L_0x03e5;
                case 24: goto L_0x03d8;
                case 25: goto L_0x03cb;
                case 26: goto L_0x03ab;
                case 27: goto L_0x039a;
                case 28: goto L_0x038d;
                case 29: goto L_0x0380;
                case 30: goto L_0x036a;
                case 31: goto L_0x035d;
                case 32: goto L_0x0350;
                case 33: goto L_0x0343;
                case 34: goto L_0x0336;
                case 35: goto L_0x0329;
                case 36: goto L_0x031c;
                case 37: goto L_0x030f;
                case 38: goto L_0x0302;
                case 39: goto L_0x02f5;
                case 40: goto L_0x02e8;
                case 41: goto L_0x02db;
                case 42: goto L_0x02ce;
                case 43: goto L_0x02c1;
                case 44: goto L_0x02ac;
                case 45: goto L_0x029f;
                case 46: goto L_0x0292;
                case 47: goto L_0x0285;
                case 48: goto L_0x0278;
                case 49: goto L_0x0266;
                case 50: goto L_0x0224;
                case 51: goto L_0x0212;
                case 52: goto L_0x0200;
                case 53: goto L_0x01ee;
                case 54: goto L_0x01dc;
                case 55: goto L_0x01ca;
                case 56: goto L_0x01b8;
                case 57: goto L_0x01a6;
                case 58: goto L_0x0194;
                case 59: goto L_0x018c;
                case 60: goto L_0x015b;
                case 61: goto L_0x014d;
                case 62: goto L_0x013b;
                case 63: goto L_0x0116;
                case 64: goto L_0x0104;
                case 65: goto L_0x00f2;
                case 66: goto L_0x00e0;
                case 67: goto L_0x00ce;
                case 68: goto L_0x00bc;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            if (r14 != 0) goto L_0x0592
            java.lang.Object r4 = r11.mo43048a()     // Catch:{ zzuw -> 0x05af }
            goto L_0x0591
        L_0x00bc:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ja r5 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r5 = r0.mo42807b(r5, r10)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x00ce:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            long r15 = r19.mo42842t()     // Catch:{ zzuw -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x00e0:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            int r5 = r19.mo42841s()     // Catch:{ zzuw -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x00f2:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            long r15 = r19.mo42840r()     // Catch:{ zzuw -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0104:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            int r5 = r19.mo42838q()     // Catch:{ zzuw -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0116:
            int r7 = r19.mo42836p()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.hk r9 = r1.m54305c(r6)     // Catch:{ zzuw -> 0x05af }
            if (r9 == 0) goto L_0x012d
            boolean r9 = r9.mo42653a(r7)     // Catch:{ zzuw -> 0x05af }
            if (r9 == 0) goto L_0x0127
            goto L_0x012d
        L_0x0127:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16635jc.m54408a(r4, r7, r14, r11)     // Catch:{ zzuw -> 0x05af }
            goto L_0x037d
        L_0x012d:
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r8, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x013b:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            int r5 = r19.mo42834o()     // Catch:{ zzuw -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x014d:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.zzte r5 = r19.mo42832n()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x015b:
            boolean r7 = r1.m54295a((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            if (r7 == 0) goto L_0x0177
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r2, r7)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ja r9 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r9 = r0.mo42802a(r9, r10)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16586hh.m54187a(r5, r9)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0187
        L_0x0177:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ja r5 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r5 = r0.mo42802a(r5, r10)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
        L_0x0187:
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x018c:
            r1.m54292a(r2, r5, r0)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0194:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            boolean r5 = r19.mo42827k()     // Catch:{ zzuw -> 0x05af }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x01a6:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            int r5 = r19.mo42824j()     // Catch:{ zzuw -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x01b8:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            long r15 = r19.mo42822i()     // Catch:{ zzuw -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x01ca:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            int r5 = r19.mo42820h()     // Catch:{ zzuw -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x01dc:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            long r15 = r19.mo42816f()     // Catch:{ zzuw -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x01ee:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            long r15 = r19.mo42818g()     // Catch:{ zzuw -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0200:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            float r5 = r19.mo42814e()     // Catch:{ zzuw -> 0x05af }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0212:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ zzuw -> 0x05af }
            double r15 = r19.mo42812d()     // Catch:{ zzuw -> 0x05af }
            java.lang.Double r5 = java.lang.Double.valueOf(r15)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r7, r5)     // Catch:{ zzuw -> 0x05af }
            r1.m54301b((T) r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0224:
            java.lang.Object r4 = r1.m54299b(r6)     // Catch:{ zzuw -> 0x05af }
            int r5 = r1.m54307d(r6)     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r2, r5)     // Catch:{ zzuw -> 0x05af }
            if (r7 != 0) goto L_0x023e
            com.google.android.gms.internal.measurement.ie r7 = r1.f46474s     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r7 = r7.mo42985e(r4)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r5, r7)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0255
        L_0x023e:
            com.google.android.gms.internal.measurement.ie r8 = r1.f46474s     // Catch:{ zzuw -> 0x05af }
            boolean r8 = r8.mo42983c(r7)     // Catch:{ zzuw -> 0x05af }
            if (r8 == 0) goto L_0x0255
            com.google.android.gms.internal.measurement.ie r8 = r1.f46474s     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r8 = r8.mo42985e(r4)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ie r9 = r1.f46474s     // Catch:{ zzuw -> 0x05af }
            r9.mo42980a(r8, r7)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r5, r8)     // Catch:{ zzuw -> 0x05af }
            r7 = r8
        L_0x0255:
            com.google.android.gms.internal.measurement.ie r5 = r1.f46474s     // Catch:{ zzuw -> 0x05af }
            java.util.Map r5 = r5.mo42981a(r7)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ie r6 = r1.f46474s     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.id r4 = r6.mo42986f(r4)     // Catch:{ zzuw -> 0x05af }
            r0.mo42805a(r5, r4, r10)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0266:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ja r6 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.hu r7 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r7.mo42969a(r2, r4)     // Catch:{ zzuw -> 0x05af }
            r0.mo42809b(r4, r6, r10)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0278:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42839q(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0285:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42837p(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0292:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42835o(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x029f:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42833n(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x02ac:
            com.google.android.gms.internal.measurement.hu r7 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r5 = r7.mo42969a(r2, r8)     // Catch:{ zzuw -> 0x05af }
            r0.mo42831m(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.hk r6 = r1.m54305c(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16635jc.m54409a(r4, r5, r6, r14, r11)     // Catch:{ zzuw -> 0x05af }
            goto L_0x037d
        L_0x02c1:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42829l(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x02ce:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42821h(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x02db:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42819g(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x02e8:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42817f(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x02f5:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42815e(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0302:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42810c(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x030f:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42813d(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x031c:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42808b(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0329:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42803a(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0336:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42839q(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0343:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42837p(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0350:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42835o(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x035d:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42833n(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x036a:
            com.google.android.gms.internal.measurement.hu r7 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r5 = r7.mo42969a(r2, r8)     // Catch:{ zzuw -> 0x05af }
            r0.mo42831m(r5)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.hk r6 = r1.m54305c(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16635jc.m54409a(r4, r5, r6, r14, r11)     // Catch:{ zzuw -> 0x05af }
        L_0x037d:
            r14 = r4
            goto L_0x0011
        L_0x0380:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42829l(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x038d:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42826k(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x039a:
            com.google.android.gms.internal.measurement.ja r4 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.hu r7 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            java.util.List r5 = r7.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42804a(r5, r4, r10)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x03ab:
            boolean r4 = m54311f(r5)     // Catch:{ zzuw -> 0x05af }
            if (r4 == 0) goto L_0x03be
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42825j(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x03be:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42823i(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x03cb:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42821h(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x03d8:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42819g(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x03e5:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42817f(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x03f2:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42815e(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x03ff:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42810c(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x040c:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42813d(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0419:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42808b(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0426:
            com.google.android.gms.internal.measurement.hu r4 = r1.f46471p     // Catch:{ zzuw -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzuw -> 0x05af }
            java.util.List r4 = r4.mo42969a(r2, r5)     // Catch:{ zzuw -> 0x05af }
            r0.mo42803a(r4)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0433:
            boolean r4 = r1.m54294a((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            if (r4 == 0) goto L_0x0451
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r2, r4)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ja r6 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r6 = r0.mo42807b(r6, r10)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C16586hh.m54187a(r7, r6)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0451:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ja r7 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r7 = r0.mo42807b(r7, r10)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0464:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            long r7 = r19.mo42842t()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54551a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0473:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            int r7 = r19.mo42841s()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54550a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0482:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            long r7 = r19.mo42840r()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54551a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0491:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            int r7 = r19.mo42838q()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54550a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x04a0:
            int r7 = r19.mo42836p()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.hk r9 = r1.m54305c(r6)     // Catch:{ zzuw -> 0x05af }
            if (r9 == 0) goto L_0x04b7
            boolean r9 = r9.mo42653a(r7)     // Catch:{ zzuw -> 0x05af }
            if (r9 == 0) goto L_0x04b1
            goto L_0x04b7
        L_0x04b1:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16635jc.m54408a(r4, r7, r14, r11)     // Catch:{ zzuw -> 0x05af }
            goto L_0x037d
        L_0x04b7:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54550a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x04c2:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            int r7 = r19.mo42834o()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54550a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x04d1:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.zzte r7 = r19.mo42832n()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x04e0:
            boolean r4 = r1.m54294a((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            if (r4 == 0) goto L_0x04fe
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r2, r4)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ja r6 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r6 = r0.mo42802a(r6, r10)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C16586hh.m54187a(r7, r6)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r4, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x04fe:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.ja r7 = r1.m54284a(r6)     // Catch:{ zzuw -> 0x05af }
            java.lang.Object r7 = r0.mo42802a(r7, r10)     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0511:
            r1.m54292a(r2, r5, r0)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0519:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            boolean r7 = r19.mo42827k()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54553a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0528:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            int r7 = r19.mo42824j()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54550a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0537:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            long r7 = r19.mo42822i()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54551a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0546:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            int r7 = r19.mo42820h()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54550a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0555:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            long r7 = r19.mo42816f()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54551a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0564:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            long r7 = r19.mo42818g()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54551a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0573:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            float r7 = r19.mo42814e()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54549a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0582:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ zzuw -> 0x05af }
            double r7 = r19.mo42812d()     // Catch:{ zzuw -> 0x05af }
            com.google.android.gms.internal.measurement.C16657jy.m54548a(r2, r4, r7)     // Catch:{ zzuw -> 0x05af }
            r1.m54300b((T) r2, r6)     // Catch:{ zzuw -> 0x05af }
            goto L_0x0011
        L_0x0591:
            r14 = r4
        L_0x0592:
            boolean r4 = r11.mo43056a(r14, r0)     // Catch:{ zzuw -> 0x05af }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f46468m
        L_0x059a:
            int r3 = r1.f46469n
            if (r0 >= r3) goto L_0x05a9
            int[] r3 = r1.f46467l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m54286a(r2, r3, (UB) r14, r11)
            int r0 = r0 + 1
            goto L_0x059a
        L_0x05a9:
            if (r14 == 0) goto L_0x05ae
            r11.mo43060b(r2, r14)
        L_0x05ae:
            return
        L_0x05af:
            if (r14 != 0) goto L_0x05b6
            java.lang.Object r4 = r11.mo43061c(r2)     // Catch:{ all -> 0x05d3 }
            r14 = r4
        L_0x05b6:
            boolean r4 = r11.mo43056a(r14, r0)     // Catch:{ all -> 0x05d3 }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f46468m
        L_0x05be:
            int r3 = r1.f46469n
            if (r0 >= r3) goto L_0x05cd
            int[] r3 = r1.f46467l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m54286a(r2, r3, (UB) r14, r11)
            int r0 = r0 + 1
            goto L_0x05be
        L_0x05cd:
            if (r14 == 0) goto L_0x05d2
            r11.mo43060b(r2, r14)
        L_0x05d2:
            return
        L_0x05d3:
            r0 = move-exception
            int r3 = r1.f46468m
        L_0x05d6:
            int r4 = r1.f46469n
            if (r3 >= r4) goto L_0x05e5
            int[] r4 = r1.f46467l
            r4 = r4[r3]
            java.lang.Object r14 = r1.m54286a(r2, r4, (UB) r14, r11)
            int r3 = r3 + 1
            goto L_0x05d6
        L_0x05e5:
            if (r14 == 0) goto L_0x05ea
            r11.mo43060b(r2, r14)
        L_0x05ea:
            throw r0
        L_0x05eb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16619in.mo42992a(java.lang.Object, com.google.android.gms.internal.measurement.iz, com.google.android.gms.internal.measurement.gt):void");
    }

    /* renamed from: a */
    private final C16633ja m54284a(int i) {
        int i2 = (i / 3) << 1;
        C16633ja jaVar = (C16633ja) this.f46459d[i2];
        if (jaVar != null) {
            return jaVar;
        }
        C16633ja a = C16628iw.m54340a().mo43001a((Class) this.f46459d[i2 + 1]);
        this.f46459d[i2] = a;
        return a;
    }

    /* renamed from: b */
    private final Object m54299b(int i) {
        return this.f46459d[(i / 3) << 1];
    }

    /* renamed from: c */
    private final C16589hk m54305c(int i) {
        return (C16589hk) this.f46459d[((i / 3) << 1) + 1];
    }

    /* renamed from: c */
    public final void mo42997c(T t) {
        for (int i = this.f46468m; i < this.f46469n; i++) {
            long d = (long) (m54307d(this.f46467l[i]) & 1048575);
            Object f = C16657jy.m54575f(t, d);
            if (f != null) {
                C16657jy.m54552a((Object) t, d, this.f46474s.mo42984d(f));
            }
        }
        int length = this.f46467l.length;
        for (int i2 = this.f46469n; i2 < length; i2++) {
            this.f46471p.mo42971b(t, (long) this.f46467l[i2]);
        }
        this.f46472q.mo43063d(t);
        if (this.f46463h) {
            this.f46473r.mo42901c(t);
        }
    }

    /* renamed from: a */
    private final <UT, UB> UB m54286a(Object obj, int i, UB ub, C16651js<UT, UB> jsVar) {
        int i2 = this.f46458c[i];
        Object f = C16657jy.m54575f(obj, (long) (m54307d(i) & 1048575));
        if (f == null) {
            return ub;
        }
        C16589hk c = m54305c(i);
        if (c == null) {
            return ub;
        }
        return m54285a(i, i2, this.f46474s.mo42981a(f), c, ub, jsVar);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m54285a(int i, int i2, Map<K, V> map, C16589hk hkVar, UB ub, C16651js<UT, UB> jsVar) {
        C16609id f = this.f46474s.mo42986f(m54299b(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!hkVar.mo42653a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = jsVar.mo43048a();
                }
                C16550ge zzao = zzte.zzao(C16608ic.m54242a(f, entry.getKey(), entry.getValue()));
                try {
                    C16608ic.m54243a(zzao.f46343a, f, entry.getKey(), entry.getValue());
                    jsVar.mo43052a(ub, i2, zzao.mo42765a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0104, code lost:
        continue;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42998d(T r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = -1
            r1 = 0
            r2 = -1
            r3 = 0
        L_0x0005:
            int r4 = r13.f46468m
            r5 = 1
            if (r1 >= r4) goto L_0x0108
            int[] r4 = r13.f46467l
            r4 = r4[r1]
            int[] r6 = r13.f46458c
            r6 = r6[r4]
            int r7 = r13.m54307d(r4)
            boolean r8 = r13.f46465j
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0035
            int[] r8 = r13.f46458c
            int r10 = r4 + 2
            r8 = r8[r10]
            r10 = r8 & r9
            int r8 = r8 >>> 20
            int r8 = r5 << r8
            if (r10 == r2) goto L_0x0036
            sun.misc.Unsafe r2 = f46457b
            long r11 = (long) r10
            int r2 = r2.getInt(r14, r11)
            r3 = r2
            r2 = r10
            goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 & r7
            if (r10 == 0) goto L_0x003d
            r10 = 1
            goto L_0x003e
        L_0x003d:
            r10 = 0
        L_0x003e:
            if (r10 == 0) goto L_0x0047
            boolean r10 = r13.m54296a((T) r14, r4, r3, r8)
            if (r10 != 0) goto L_0x0047
            return r0
        L_0x0047:
            r10 = 267386880(0xff00000, float:2.3665827E-29)
            r10 = r10 & r7
            int r10 = r10 >>> 20
            r11 = 9
            if (r10 == r11) goto L_0x00f3
            r11 = 17
            if (r10 == r11) goto L_0x00f3
            r8 = 27
            if (r10 == r8) goto L_0x00c7
            r8 = 60
            if (r10 == r8) goto L_0x00b6
            r8 = 68
            if (r10 == r8) goto L_0x00b6
            switch(r10) {
                case 49: goto L_0x00c7;
                case 50: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0104
        L_0x0065:
            com.google.android.gms.internal.measurement.ie r6 = r13.f46474s
            r7 = r7 & r9
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r7)
            java.util.Map r6 = r6.mo42982b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.lang.Object r4 = r13.m54299b(r4)
            com.google.android.gms.internal.measurement.ie r7 = r13.f46474s
            com.google.android.gms.internal.measurement.id r4 = r7.mo42986f(r4)
            com.google.android.gms.internal.measurement.zzxs r4 = r4.f46452c
            com.google.android.gms.internal.measurement.zzxx r4 = r4.zzyv()
            com.google.android.gms.internal.measurement.zzxx r7 = com.google.android.gms.internal.measurement.zzxx.MESSAGE
            if (r4 != r7) goto L_0x00b3
            r4 = 0
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            if (r4 != 0) goto L_0x00ac
            com.google.android.gms.internal.measurement.iw r4 = com.google.android.gms.internal.measurement.C16628iw.m54340a()
            java.lang.Class r8 = r7.getClass()
            com.google.android.gms.internal.measurement.ja r4 = r4.mo43001a(r8)
        L_0x00ac:
            boolean r7 = r4.mo42998d(r7)
            if (r7 != 0) goto L_0x0094
            r5 = 0
        L_0x00b3:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00b6:
            boolean r5 = r13.m54295a((T) r14, r6, r4)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.measurement.ja r4 = r13.m54284a(r4)
            boolean r4 = m54297a(r14, r7, r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x00c7:
            r6 = r7 & r9
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C16657jy.m54575f(r14, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00f0
            com.google.android.gms.internal.measurement.ja r4 = r13.m54284a(r4)
            r7 = 0
        L_0x00db:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x00f0
            java.lang.Object r8 = r6.get(r7)
            boolean r8 = r4.mo42998d(r8)
            if (r8 != 0) goto L_0x00ed
            r5 = 0
            goto L_0x00f0
        L_0x00ed:
            int r7 = r7 + 1
            goto L_0x00db
        L_0x00f0:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00f3:
            boolean r5 = r13.m54296a((T) r14, r4, r3, r8)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.measurement.ja r4 = r13.m54284a(r4)
            boolean r4 = m54297a(r14, r7, r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0108:
            boolean r1 = r13.f46463h
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.measurement.gu<?> r1 = r13.f46473r
            com.google.android.gms.internal.measurement.gx r14 = r1.mo42893a(r14)
            boolean r14 = r14.mo42909f()
            if (r14 != 0) goto L_0x0119
            return r0
        L_0x0119:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16619in.mo42998d(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static boolean m54297a(Object obj, int i, C16633ja jaVar) {
        return jaVar.mo42998d(C16657jy.m54575f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m54289a(int i, Object obj, C16675kl klVar) throws IOException {
        if (obj instanceof String) {
            klVar.mo42853a(i, (String) obj);
        } else {
            klVar.mo42850a(i, (zzte) obj);
        }
    }

    /* renamed from: a */
    private final void m54292a(Object obj, int i, C16631iz izVar) throws IOException {
        if (m54311f(i)) {
            C16657jy.m54552a(obj, (long) (i & 1048575), (Object) izVar.mo42830m());
        } else if (this.f46464i) {
            C16657jy.m54552a(obj, (long) (i & 1048575), (Object) izVar.mo42828l());
        } else {
            C16657jy.m54552a(obj, (long) (i & 1048575), (Object) izVar.mo42832n());
        }
    }

    /* renamed from: d */
    private final int m54307d(int i) {
        return this.f46458c[i + 1];
    }

    /* renamed from: e */
    private final int m54309e(int i) {
        return this.f46458c[i + 2];
    }

    /* renamed from: b */
    private static <T> double m54298b(T t, long j) {
        return ((Double) C16657jy.m54575f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m54304c(T t, long j) {
        return ((Float) C16657jy.m54575f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m54308d(T t, long j) {
        return ((Integer) C16657jy.m54575f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m54310e(T t, long j) {
        return ((Long) C16657jy.m54575f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m54312f(T t, long j) {
        return ((Boolean) C16657jy.m54575f(t, j)).booleanValue();
    }

    /* renamed from: c */
    private final boolean m54306c(T t, T t2, int i) {
        return m54294a(t, i) == m54294a(t2, i);
    }

    /* renamed from: a */
    private final boolean m54296a(T t, int i, int i2, int i3) {
        if (this.f46465j) {
            return m54294a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m54294a(T t, int i) {
        if (this.f46465j) {
            int d = m54307d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C16657jy.m54572e(t, j) != 0.0d;
                case 1:
                    return C16657jy.m54567d(t, j) != 0.0f;
                case 2:
                    return C16657jy.m54558b(t, j) != 0;
                case 3:
                    return C16657jy.m54558b(t, j) != 0;
                case 4:
                    return C16657jy.m54542a((Object) t, j) != 0;
                case 5:
                    return C16657jy.m54558b(t, j) != 0;
                case 6:
                    return C16657jy.m54542a((Object) t, j) != 0;
                case 7:
                    return C16657jy.m54566c(t, j);
                case 8:
                    Object f = C16657jy.m54575f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof zzte) {
                        return !zzte.zzbtq.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C16657jy.m54575f(t, j) != null;
                case 10:
                    return !zzte.zzbtq.equals(C16657jy.m54575f(t, j));
                case 11:
                    return C16657jy.m54542a((Object) t, j) != 0;
                case 12:
                    return C16657jy.m54542a((Object) t, j) != 0;
                case 13:
                    return C16657jy.m54542a((Object) t, j) != 0;
                case 14:
                    return C16657jy.m54558b(t, j) != 0;
                case 15:
                    return C16657jy.m54542a((Object) t, j) != 0;
                case 16:
                    return C16657jy.m54558b(t, j) != 0;
                case 17:
                    return C16657jy.m54575f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m54309e(i);
            return (C16657jy.m54542a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: b */
    private final void m54300b(T t, int i) {
        if (!this.f46465j) {
            int e = m54309e(i);
            long j = (long) (e & 1048575);
            C16657jy.m54550a((Object) t, j, C16657jy.m54542a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: a */
    private final boolean m54295a(T t, int i, int i2) {
        return C16657jy.m54542a((Object) t, (long) (m54309e(i2) & 1048575)) == i;
    }

    /* renamed from: b */
    private final void m54301b(T t, int i, int i2) {
        C16657jy.m54550a((Object) t, (long) (m54309e(i2) & 1048575), i);
    }
}
