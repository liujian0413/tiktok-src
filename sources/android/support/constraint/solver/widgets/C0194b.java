package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0185e;

/* renamed from: android.support.constraint.solver.widgets.b */
final class C0194b {
    /* renamed from: a */
    static void m687a(C0196d dVar, C0185e eVar, int i) {
        int i2;
        C0195c[] cVarArr;
        int i3;
        if (i == 0) {
            int i4 = dVar.f780at;
            cVarArr = dVar.f783aw;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = dVar.f781au;
            i2 = i5;
            cVarArr = dVar.f782av;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            C0195c cVar = cVarArr[i6];
            cVar.mo571a();
            if (!dVar.mo574h(4) || !C0200g.m722a(dVar, eVar, i, i3, cVar)) {
                m688a(dVar, eVar, i, i3, cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2.f717ag == 2) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r2.f718ah == 2) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0185  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m688a(android.support.constraint.solver.widgets.C0196d r44, android.support.constraint.solver.C0185e r45, int r46, int r47, android.support.constraint.solver.widgets.C0195c r48) {
        /*
            r0 = r44
            r9 = r45
            r1 = r48
            android.support.constraint.solver.widgets.ConstraintWidget r11 = r1.f756a
            android.support.constraint.solver.widgets.ConstraintWidget r12 = r1.f758c
            android.support.constraint.solver.widgets.ConstraintWidget r13 = r1.f757b
            android.support.constraint.solver.widgets.ConstraintWidget r14 = r1.f759d
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r1.f760e
            float r3 = r1.f766k
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f688D
            r4 = r4[r46]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r46 != 0) goto L_0x003e
            int r8 = r2.f717ag
            if (r8 != 0) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            int r6 = r2.f717ag
            if (r6 != r7) goto L_0x002e
            r6 = 1
            goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            int r7 = r2.f717ag
            if (r7 != r5) goto L_0x0035
        L_0x0033:
            r5 = 1
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            r7 = r5
            r18 = r6
            r17 = r8
            r5 = r11
            r6 = 0
            goto L_0x0052
        L_0x003e:
            int r6 = r2.f718ah
            if (r6 != 0) goto L_0x0044
            r8 = 1
            goto L_0x0045
        L_0x0044:
            r8 = 0
        L_0x0045:
            int r6 = r2.f718ah
            r7 = 1
            if (r6 != r7) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            int r7 = r2.f718ah
            if (r7 != r5) goto L_0x0035
            goto L_0x0033
        L_0x0052:
            r21 = 0
            if (r6 != 0) goto L_0x0138
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r5.f686B
            r8 = r8[r47]
            if (r4 != 0) goto L_0x0062
            if (r7 == 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            r22 = 4
            goto L_0x0064
        L_0x0062:
            r22 = 1
        L_0x0064:
            int r23 = r8.mo510a()
            r24 = r3
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r8.f675d
            if (r3 == 0) goto L_0x0078
            if (r5 == r11) goto L_0x0078
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r8.f675d
            int r3 = r3.mo510a()
            int r23 = r23 + r3
        L_0x0078:
            r3 = r23
            if (r7 == 0) goto L_0x0086
            if (r5 == r11) goto L_0x0086
            if (r5 == r13) goto L_0x0086
            r26 = r2
            r25 = r6
            r6 = 6
            goto L_0x0096
        L_0x0086:
            if (r17 == 0) goto L_0x0090
            if (r4 == 0) goto L_0x0090
            r26 = r2
            r25 = r6
            r6 = 4
            goto L_0x0096
        L_0x0090:
            r26 = r2
            r25 = r6
            r6 = r22
        L_0x0096:
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r8.f675d
            if (r2 == 0) goto L_0x00c3
            if (r5 != r13) goto L_0x00ab
            android.support.constraint.solver.SolverVariable r2 = r8.f681j
            r27 = r11
            android.support.constraint.solver.widgets.ConstraintAnchor r11 = r8.f675d
            android.support.constraint.solver.SolverVariable r11 = r11.f681j
            r28 = r7
            r7 = 5
            r9.mo495a(r2, r11, r3, r7)
            goto L_0x00b9
        L_0x00ab:
            r28 = r7
            r27 = r11
            android.support.constraint.solver.SolverVariable r2 = r8.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r8.f675d
            android.support.constraint.solver.SolverVariable r7 = r7.f681j
            r11 = 6
            r9.mo495a(r2, r7, r3, r11)
        L_0x00b9:
            android.support.constraint.solver.SolverVariable r2 = r8.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r8.f675d
            android.support.constraint.solver.SolverVariable r7 = r7.f681j
            r9.mo504c(r2, r7, r3, r6)
            goto L_0x00c7
        L_0x00c3:
            r28 = r7
            r27 = r11
        L_0x00c7:
            if (r4 == 0) goto L_0x00fc
            int r2 = r5.f712ab
            r3 = 8
            if (r2 == r3) goto L_0x00eb
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r5.f688D
            r2 = r2[r46]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00eb
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r5.f686B
            int r3 = r47 + 1
            r2 = r2[r3]
            android.support.constraint.solver.SolverVariable r2 = r2.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r5.f686B
            r3 = r3[r47]
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            r6 = 0
            r7 = 5
            r9.mo495a(r2, r3, r6, r7)
            goto L_0x00ec
        L_0x00eb:
            r6 = 0
        L_0x00ec:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r5.f686B
            r2 = r2[r47]
            android.support.constraint.solver.SolverVariable r2 = r2.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r0.f686B
            r3 = r3[r47]
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            r7 = 6
            r9.mo495a(r2, r3, r6, r7)
        L_0x00fc:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r5.f686B
            int r3 = r47 + 1
            r2 = r2[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r2.f675d
            if (r2 == 0) goto L_0x011d
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r2.f673b
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r2.f686B
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.f675d
            if (r3 == 0) goto L_0x011d
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r2.f686B
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.f675d
            android.support.constraint.solver.widgets.ConstraintWidget r3 = r3.f673b
            if (r3 == r5) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r21 = r2
        L_0x011d:
            if (r21 == 0) goto L_0x012d
            r5 = r21
            r3 = r24
            r6 = r25
            r2 = r26
            r11 = r27
            r7 = r28
            goto L_0x0052
        L_0x012d:
            r3 = r24
            r2 = r26
            r11 = r27
            r7 = r28
            r6 = 1
            goto L_0x0052
        L_0x0138:
            r26 = r2
            r24 = r3
            r28 = r7
            r27 = r11
            if (r14 == 0) goto L_0x0164
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r12.f686B
            int r3 = r47 + 1
            r2 = r2[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r2.f675d
            if (r2 == 0) goto L_0x0164
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r14.f686B
            r2 = r2[r3]
            android.support.constraint.solver.SolverVariable r5 = r2.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r12.f686B
            r3 = r6[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.f675d
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            int r2 = r2.mo510a()
            int r2 = -r2
            r8 = 5
            r9.mo501b(r5, r3, r2, r8)
            goto L_0x0165
        L_0x0164:
            r8 = 5
        L_0x0165:
            if (r4 == 0) goto L_0x0181
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r0.f686B
            int r2 = r47 + 1
            r0 = r0[r2]
            android.support.constraint.solver.SolverVariable r0 = r0.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r12.f686B
            r3 = r3[r2]
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r12.f686B
            r2 = r4[r2]
            int r2 = r2.mo510a()
            r4 = 6
            r9.mo495a(r0, r3, r2, r4)
        L_0x0181:
            java.util.ArrayList<android.support.constraint.solver.widgets.ConstraintWidget> r0 = r1.f763h
            if (r0 == 0) goto L_0x0239
            int r2 = r0.size()
            r7 = 1
            if (r2 <= r7) goto L_0x0239
            boolean r3 = r1.f767l
            if (r3 == 0) goto L_0x0198
            boolean r3 = r1.f769n
            if (r3 != 0) goto L_0x0198
            int r3 = r1.f765j
            float r3 = (float) r3
            goto L_0x019a
        L_0x0198:
            r3 = r24
        L_0x019a:
            r4 = 0
            r6 = r21
            r5 = 0
            r30 = 0
        L_0x01a0:
            if (r5 >= r2) goto L_0x0239
            java.lang.Object r11 = r0.get(r5)
            android.support.constraint.solver.widgets.ConstraintWidget r11 = (android.support.constraint.solver.widgets.ConstraintWidget) r11
            float[] r7 = r11.f721ak
            r7 = r7[r46]
            int r16 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r16 >= 0) goto L_0x01ce
            boolean r7 = r1.f769n
            if (r7 == 0) goto L_0x01ca
            android.support.constraint.solver.widgets.ConstraintAnchor[] r7 = r11.f686B
            int r16 = r47 + 1
            r7 = r7[r16]
            android.support.constraint.solver.SolverVariable r7 = r7.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r11 = r11.f686B
            r11 = r11[r47]
            android.support.constraint.solver.SolverVariable r11 = r11.f681j
            r4 = 4
            r8 = 0
            r9.mo504c(r7, r11, r8, r4)
            r4 = 0
            r8 = 6
            goto L_0x01e7
        L_0x01ca:
            r4 = 4
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01cf
        L_0x01ce:
            r4 = 4
        L_0x01cf:
            r8 = 0
            int r16 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x01ec
            android.support.constraint.solver.widgets.ConstraintAnchor[] r7 = r11.f686B
            int r16 = r47 + 1
            r7 = r7[r16]
            android.support.constraint.solver.SolverVariable r7 = r7.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r11 = r11.f686B
            r11 = r11[r47]
            android.support.constraint.solver.SolverVariable r11 = r11.f681j
            r4 = 0
            r8 = 6
            r9.mo504c(r7, r11, r4, r8)
        L_0x01e7:
            r38 = r0
            r39 = r2
            goto L_0x022e
        L_0x01ec:
            r4 = 0
            r8 = 6
            if (r6 == 0) goto L_0x0227
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r6.f686B
            r4 = r4[r47]
            android.support.constraint.solver.SolverVariable r4 = r4.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r6.f686B
            int r15 = r47 + 1
            r6 = r6[r15]
            android.support.constraint.solver.SolverVariable r6 = r6.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r11.f686B
            r8 = r8[r47]
            android.support.constraint.solver.SolverVariable r8 = r8.f681j
            r38 = r0
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r11.f686B
            r0 = r0[r15]
            android.support.constraint.solver.SolverVariable r0 = r0.f681j
            r39 = r2
            android.support.constraint.solver.b r2 = r45.mo503c()
            r29 = r2
            r31 = r3
            r32 = r7
            r33 = r4
            r34 = r6
            r35 = r8
            r36 = r0
            r29.mo466a(r30, r31, r32, r33, r34, r35, r36)
            r9.mo498a(r2)
            goto L_0x022b
        L_0x0227:
            r38 = r0
            r39 = r2
        L_0x022b:
            r30 = r7
            r6 = r11
        L_0x022e:
            int r5 = r5 + 1
            r0 = r38
            r2 = r39
            r4 = 0
            r7 = 1
            r8 = 5
            goto L_0x01a0
        L_0x0239:
            if (r13 == 0) goto L_0x02a6
            if (r13 == r14) goto L_0x023f
            if (r28 == 0) goto L_0x02a6
        L_0x023f:
            r11 = r27
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r11.f686B
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r12.f686B
            int r2 = r47 + 1
            r1 = r1[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r11.f686B
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.f675d
            if (r3 == 0) goto L_0x025c
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r11.f686B
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.f675d
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            goto L_0x025e
        L_0x025c:
            r3 = r21
        L_0x025e:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r12.f686B
            r4 = r4[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r4.f675d
            if (r4 == 0) goto L_0x0270
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r12.f686B
            r4 = r4[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r4.f675d
            android.support.constraint.solver.SolverVariable r4 = r4.f681j
            r5 = r4
            goto L_0x0272
        L_0x0270:
            r5 = r21
        L_0x0272:
            if (r13 != r14) goto L_0x027c
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.f686B
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r13.f686B
            r1 = r1[r2]
        L_0x027c:
            if (r3 == 0) goto L_0x04b4
            if (r5 == 0) goto L_0x04b4
            if (r46 != 0) goto L_0x0288
            r2 = r26
            float r2 = r2.f707X
        L_0x0286:
            r4 = r2
            goto L_0x028d
        L_0x0288:
            r2 = r26
            float r2 = r2.f708Y
            goto L_0x0286
        L_0x028d:
            int r6 = r0.mo510a()
            int r7 = r1.mo510a()
            android.support.constraint.solver.SolverVariable r2 = r0.f681j
            android.support.constraint.solver.SolverVariable r8 = r1.f681j
            r10 = 5
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo494a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04b4
        L_0x02a6:
            r11 = r27
            if (r17 == 0) goto L_0x0390
            if (r13 == 0) goto L_0x0390
            int r0 = r1.f765j
            if (r0 <= 0) goto L_0x02b9
            int r0 = r1.f764i
            int r1 = r1.f765j
            if (r0 != r1) goto L_0x02b9
            r37 = 1
            goto L_0x02bb
        L_0x02b9:
            r37 = 0
        L_0x02bb:
            r0 = r13
            r8 = r0
        L_0x02bd:
            if (r8 == 0) goto L_0x04b2
            android.support.constraint.solver.widgets.ConstraintWidget[] r1 = r8.f723am
            r7 = r1[r46]
            if (r7 != 0) goto L_0x02d0
            if (r8 != r14) goto L_0x02c8
            goto L_0x02d0
        L_0x02c8:
            r9 = r7
            r15 = r8
        L_0x02ca:
            r19 = 6
            r20 = 4
            goto L_0x038a
        L_0x02d0:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r8.f686B
            r1 = r1[r47]
            android.support.constraint.solver.SolverVariable r2 = r1.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r1.f675d
            if (r3 == 0) goto L_0x02df
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r1.f675d
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            goto L_0x02e1
        L_0x02df:
            r3 = r21
        L_0x02e1:
            if (r0 == r8) goto L_0x02ec
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r0.f686B
            int r4 = r47 + 1
            r3 = r3[r4]
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            goto L_0x0303
        L_0x02ec:
            if (r8 != r13) goto L_0x0303
            if (r0 != r8) goto L_0x0303
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r11.f686B
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.f675d
            if (r3 == 0) goto L_0x0301
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r11.f686B
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.f675d
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            goto L_0x0303
        L_0x0301:
            r3 = r21
        L_0x0303:
            int r1 = r1.mo510a()
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r8.f686B
            int r5 = r47 + 1
            r4 = r4[r5]
            int r4 = r4.mo510a()
            if (r7 == 0) goto L_0x031c
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r7.f686B
            r6 = r6[r47]
            r40 = r7
            android.support.constraint.solver.SolverVariable r7 = r6.f681j
            goto L_0x032b
        L_0x031c:
            r40 = r7
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r12.f686B
            r6 = r6[r5]
            android.support.constraint.solver.widgets.ConstraintAnchor r6 = r6.f675d
            if (r6 == 0) goto L_0x0329
            android.support.constraint.solver.SolverVariable r7 = r6.f681j
            goto L_0x032b
        L_0x0329:
            r7 = r21
        L_0x032b:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r9 = r8.f686B
            r9 = r9[r5]
            android.support.constraint.solver.SolverVariable r9 = r9.f681j
            if (r6 == 0) goto L_0x0338
            int r6 = r6.mo510a()
            int r4 = r4 + r6
        L_0x0338:
            if (r0 == 0) goto L_0x0343
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r0.f686B
            r0 = r0[r5]
            int r0 = r0.mo510a()
            int r1 = r1 + r0
        L_0x0343:
            if (r2 == 0) goto L_0x0385
            if (r3 == 0) goto L_0x0385
            if (r7 == 0) goto L_0x0385
            if (r9 == 0) goto L_0x0385
            if (r8 != r13) goto L_0x0357
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.f686B
            r0 = r0[r47]
            int r0 = r0.mo510a()
            r6 = r0
            goto L_0x0358
        L_0x0357:
            r6 = r1
        L_0x0358:
            if (r8 != r14) goto L_0x0364
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r14.f686B
            r0 = r0[r5]
            int r0 = r0.mo510a()
            r15 = r0
            goto L_0x0365
        L_0x0364:
            r15 = r4
        L_0x0365:
            if (r37 == 0) goto L_0x036a
            r16 = 6
            goto L_0x036c
        L_0x036a:
            r16 = 4
        L_0x036c:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r6
            r19 = 4
            r5 = r7
            r6 = r9
            r9 = r40
            r7 = r15
            r15 = r8
            r19 = 6
            r20 = 4
            r8 = r16
            r0.mo494a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x038a
        L_0x0385:
            r15 = r8
            r9 = r40
            goto L_0x02ca
        L_0x038a:
            r8 = r9
            r0 = r15
            r9 = r45
            goto L_0x02bd
        L_0x0390:
            r19 = 6
            r20 = 4
            if (r18 == 0) goto L_0x04b2
            if (r13 == 0) goto L_0x04b2
            int r0 = r1.f765j
            if (r0 <= 0) goto L_0x03a5
            int r0 = r1.f764i
            int r1 = r1.f765j
            if (r0 != r1) goto L_0x03a5
            r37 = 1
            goto L_0x03a7
        L_0x03a5:
            r37 = 0
        L_0x03a7:
            r0 = r13
            r9 = r0
        L_0x03a9:
            if (r9 == 0) goto L_0x044c
            android.support.constraint.solver.widgets.ConstraintWidget[] r1 = r9.f723am
            r1 = r1[r46]
            if (r9 == r13) goto L_0x0444
            if (r9 == r14) goto L_0x0444
            if (r1 == 0) goto L_0x0444
            if (r1 != r14) goto L_0x03ba
            r8 = r21
            goto L_0x03bb
        L_0x03ba:
            r8 = r1
        L_0x03bb:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r9.f686B
            r1 = r1[r47]
            android.support.constraint.solver.SolverVariable r2 = r1.f681j
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r0.f686B
            int r4 = r47 + 1
            r3 = r3[r4]
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            int r1 = r1.mo510a()
            android.support.constraint.solver.widgets.ConstraintAnchor[] r5 = r9.f686B
            r5 = r5[r4]
            int r5 = r5.mo510a()
            if (r8 == 0) goto L_0x03ee
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r8.f686B
            r6 = r6[r47]
            android.support.constraint.solver.SolverVariable r7 = r6.f681j
            r41 = r7
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r6.f675d
            if (r7 == 0) goto L_0x03e8
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r6.f675d
            android.support.constraint.solver.SolverVariable r7 = r7.f681j
            goto L_0x03ea
        L_0x03e8:
            r7 = r21
        L_0x03ea:
            r42 = r6
            r6 = r7
            goto L_0x0407
        L_0x03ee:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r9.f686B
            r6 = r6[r4]
            android.support.constraint.solver.widgets.ConstraintAnchor r6 = r6.f675d
            if (r6 == 0) goto L_0x03fb
            android.support.constraint.solver.SolverVariable r7 = r6.f681j
            r42 = r6
            goto L_0x03ff
        L_0x03fb:
            r42 = r6
            r7 = r21
        L_0x03ff:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r9.f686B
            r6 = r6[r4]
            android.support.constraint.solver.SolverVariable r6 = r6.f681j
            r41 = r7
        L_0x0407:
            if (r42 == 0) goto L_0x040e
            int r7 = r42.mo510a()
            int r5 = r5 + r7
        L_0x040e:
            r7 = r5
            if (r0 == 0) goto L_0x041a
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r0.f686B
            r0 = r0[r4]
            int r0 = r0.mo510a()
            int r1 = r1 + r0
        L_0x041a:
            r4 = r1
            if (r37 == 0) goto L_0x041f
            r15 = 6
            goto L_0x0420
        L_0x041f:
            r15 = 4
        L_0x0420:
            if (r2 == 0) goto L_0x043c
            if (r3 == 0) goto L_0x043c
            if (r41 == 0) goto L_0x043c
            if (r6 == 0) goto L_0x043c
            r5 = 1056964608(0x3f000000, float:0.5)
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r41
            r16 = r8
            r43 = r9
            r9 = 5
            r8 = r15
            r0.mo494a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0441
        L_0x043c:
            r16 = r8
            r43 = r9
            r9 = 5
        L_0x0441:
            r1 = r16
            goto L_0x0447
        L_0x0444:
            r43 = r9
            r9 = 5
        L_0x0447:
            r9 = r1
            r0 = r43
            goto L_0x03a9
        L_0x044c:
            r9 = 5
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.f686B
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r11.f686B
            r1 = r1[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r1.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r14.f686B
            int r3 = r47 + 1
            r10 = r2[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r12.f686B
            r2 = r2[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor r11 = r2.f675d
            if (r1 == 0) goto L_0x049e
            if (r13 == r14) goto L_0x0476
            android.support.constraint.solver.SolverVariable r2 = r0.f681j
            android.support.constraint.solver.SolverVariable r1 = r1.f681j
            int r0 = r0.mo510a()
            r8 = r45
            r8.mo504c(r2, r1, r0, r9)
        L_0x0474:
            r9 = r8
            goto L_0x04a0
        L_0x0476:
            r8 = r45
            if (r11 == 0) goto L_0x0474
            android.support.constraint.solver.SolverVariable r2 = r0.f681j
            android.support.constraint.solver.SolverVariable r3 = r1.f681j
            int r4 = r0.mo510a()
            r5 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.solver.SolverVariable r6 = r10.f681j
            android.support.constraint.solver.SolverVariable r7 = r11.f681j
            int r15 = r10.mo510a()
            r16 = 5
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r15
            r9 = r8
            r8 = r16
            r0.mo494a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04a0
        L_0x049e:
            r9 = r45
        L_0x04a0:
            if (r11 == 0) goto L_0x04b4
            if (r13 == r14) goto L_0x04b4
            android.support.constraint.solver.SolverVariable r0 = r10.f681j
            android.support.constraint.solver.SolverVariable r1 = r11.f681j
            int r2 = r10.mo510a()
            int r2 = -r2
            r3 = 5
            r9.mo504c(r0, r1, r2, r3)
            goto L_0x04b4
        L_0x04b2:
            r9 = r45
        L_0x04b4:
            if (r17 != 0) goto L_0x04b8
            if (r18 == 0) goto L_0x051c
        L_0x04b8:
            if (r13 == 0) goto L_0x051c
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.f686B
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r14.f686B
            int r2 = r47 + 1
            r1 = r1[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r0.f675d
            if (r3 == 0) goto L_0x04cd
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r0.f675d
            android.support.constraint.solver.SolverVariable r3 = r3.f681j
            goto L_0x04cf
        L_0x04cd:
            r3 = r21
        L_0x04cf:
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r1.f675d
            if (r4 == 0) goto L_0x04d8
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r1.f675d
            android.support.constraint.solver.SolverVariable r4 = r4.f681j
            goto L_0x04da
        L_0x04d8:
            r4 = r21
        L_0x04da:
            if (r12 == r14) goto L_0x04eb
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r12.f686B
            r4 = r4[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor r5 = r4.f675d
            if (r5 == 0) goto L_0x04e9
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r4.f675d
            android.support.constraint.solver.SolverVariable r4 = r4.f681j
            goto L_0x04eb
        L_0x04e9:
            r4 = r21
        L_0x04eb:
            r5 = r4
            if (r13 != r14) goto L_0x04f6
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.f686B
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r13.f686B
            r1 = r1[r2]
        L_0x04f6:
            if (r3 == 0) goto L_0x051c
            if (r5 == 0) goto L_0x051c
            int r4 = r0.mo510a()
            if (r14 != 0) goto L_0x0501
            goto L_0x0502
        L_0x0501:
            r12 = r14
        L_0x0502:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r12.f686B
            r2 = r6[r2]
            int r7 = r2.mo510a()
            android.support.constraint.solver.SolverVariable r2 = r0.f681j
            r6 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.solver.SolverVariable r8 = r1.f681j
            r10 = 5
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.mo494a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x051c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.C0194b.m688a(android.support.constraint.solver.widgets.d, android.support.constraint.solver.e, int, int, android.support.constraint.solver.widgets.c):void");
    }
}
