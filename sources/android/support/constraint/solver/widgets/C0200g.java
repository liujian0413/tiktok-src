package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0185e;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;

/* renamed from: android.support.constraint.solver.widgets.g */
public final class C0200g {

    /* renamed from: a */
    static boolean[] f799a = new boolean[3];

    /* JADX WARNING: Removed duplicated region for block: B:28:0x003e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m721a(android.support.constraint.solver.widgets.ConstraintWidget r4, int r5) {
        /*
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r4.f688D
            r0 = r0[r5]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            float r0 = r4.f692H
            r1 = 0
            r3 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r4.f688D
            if (r5 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r4 = r4[r3]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x001f
            return r2
        L_0x001f:
            return r2
        L_0x0020:
            if (r5 != 0) goto L_0x0030
            int r5 = r4.f731g
            if (r5 == 0) goto L_0x0027
            return r2
        L_0x0027:
            int r5 = r4.f734j
            if (r5 != 0) goto L_0x002f
            int r4 = r4.f735k
            if (r4 == 0) goto L_0x003e
        L_0x002f:
            return r2
        L_0x0030:
            int r5 = r4.f732h
            if (r5 == 0) goto L_0x0035
            return r2
        L_0x0035:
            int r5 = r4.f737m
            if (r5 != 0) goto L_0x003f
            int r4 = r4.f738n
            if (r4 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r3
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.C0200g.m721a(android.support.constraint.solver.widgets.ConstraintWidget, int):boolean");
    }

    /* renamed from: a */
    static void m719a(int i, ConstraintWidget constraintWidget) {
        boolean z;
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget2 = constraintWidget;
        constraintWidget.mo552g();
        C0202i iVar = constraintWidget2.f744t.f672a;
        C0202i iVar2 = constraintWidget2.f745u.f672a;
        C0202i iVar3 = constraintWidget2.f746v.f672a;
        C0202i iVar4 = constraintWidget2.f747w.f672a;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (constraintWidget2.f688D[0] != DimensionBehaviour.MATCH_CONSTRAINT || !m721a(constraintWidget2, 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(iVar.f806g == 4 || iVar3.f806g == 4)) {
            if (constraintWidget2.f688D[0] == DimensionBehaviour.FIXED || (z2 && constraintWidget2.f712ab == 8)) {
                if (constraintWidget2.f744t.f675d == null && constraintWidget2.f746v.f675d == null) {
                    iVar.f806g = 1;
                    iVar3.f806g = 1;
                    if (z) {
                        iVar3.mo588a(iVar, 1, constraintWidget.mo554h());
                    } else {
                        iVar3.mo587a(iVar, constraintWidget.mo556j());
                    }
                } else if (constraintWidget2.f744t.f675d != null && constraintWidget2.f746v.f675d == null) {
                    iVar.f806g = 1;
                    iVar3.f806g = 1;
                    if (z) {
                        iVar3.mo588a(iVar, 1, constraintWidget.mo554h());
                    } else {
                        iVar3.mo587a(iVar, constraintWidget.mo556j());
                    }
                } else if (constraintWidget2.f744t.f675d == null && constraintWidget2.f746v.f675d != null) {
                    iVar.f806g = 1;
                    iVar3.f806g = 1;
                    iVar.mo587a(iVar3, -constraintWidget.mo556j());
                    if (z) {
                        iVar.mo588a(iVar3, -1, constraintWidget.mo554h());
                    } else {
                        iVar.mo587a(iVar3, -constraintWidget.mo556j());
                    }
                } else if (!(constraintWidget2.f744t.f675d == null || constraintWidget2.f746v.f675d == null)) {
                    iVar.f806g = 2;
                    iVar3.f806g = 2;
                    if (z) {
                        constraintWidget.mo554h().mo596a(iVar);
                        constraintWidget.mo554h().mo596a(iVar3);
                        iVar.mo591b(iVar3, -1, constraintWidget.mo554h());
                        iVar3.mo591b(iVar, 1, constraintWidget.mo554h());
                    } else {
                        iVar.mo590b(iVar3, (float) (-constraintWidget.mo556j()));
                        iVar3.mo590b(iVar, (float) constraintWidget.mo556j());
                    }
                }
            } else if (z2) {
                int j = constraintWidget.mo556j();
                iVar.f806g = 1;
                iVar3.f806g = 1;
                if (constraintWidget2.f744t.f675d == null && constraintWidget2.f746v.f675d == null) {
                    if (z) {
                        iVar3.mo588a(iVar, 1, constraintWidget.mo554h());
                    } else {
                        iVar3.mo587a(iVar, j);
                    }
                } else if (constraintWidget2.f744t.f675d == null || constraintWidget2.f746v.f675d != null) {
                    if (constraintWidget2.f744t.f675d != null || constraintWidget2.f746v.f675d == null) {
                        if (!(constraintWidget2.f744t.f675d == null || constraintWidget2.f746v.f675d == null)) {
                            if (z) {
                                constraintWidget.mo554h().mo596a(iVar);
                                constraintWidget.mo554h().mo596a(iVar3);
                            }
                            if (constraintWidget2.f692H == 0.0f) {
                                iVar.f806g = 3;
                                iVar3.f806g = 3;
                                iVar.mo590b(iVar3, 0.0f);
                                iVar3.mo590b(iVar, 0.0f);
                            } else {
                                iVar.f806g = 2;
                                iVar3.f806g = 2;
                                iVar.mo590b(iVar3, (float) (-j));
                                iVar3.mo590b(iVar, (float) j);
                                constraintWidget2.mo545d(j);
                            }
                        }
                    } else if (z) {
                        iVar.mo588a(iVar3, -1, constraintWidget.mo554h());
                    } else {
                        iVar.mo587a(iVar3, -j);
                    }
                } else if (z) {
                    iVar3.mo588a(iVar, 1, constraintWidget.mo554h());
                } else {
                    iVar3.mo587a(iVar, j);
                }
            }
        }
        if (constraintWidget2.f688D[1] != DimensionBehaviour.MATCH_CONSTRAINT || !m721a(constraintWidget2, 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(iVar2.f806g == 4 || iVar4.f806g == 4)) {
            if (constraintWidget2.f688D[1] == DimensionBehaviour.FIXED || (z3 && constraintWidget2.f712ab == 8)) {
                if (constraintWidget2.f745u.f675d == null && constraintWidget2.f747w.f675d == null) {
                    iVar2.f806g = 1;
                    iVar4.f806g = 1;
                    if (z) {
                        iVar4.mo588a(iVar2, 1, constraintWidget.mo555i());
                    } else {
                        iVar4.mo587a(iVar2, constraintWidget.mo557k());
                    }
                    if (constraintWidget2.f748x.f675d != null) {
                        constraintWidget2.f748x.f672a.f806g = 1;
                        iVar2.mo584a(1, constraintWidget2.f748x.f672a, -constraintWidget2.f702R);
                    }
                } else if (constraintWidget2.f745u.f675d != null && constraintWidget2.f747w.f675d == null) {
                    iVar2.f806g = 1;
                    iVar4.f806g = 1;
                    if (z) {
                        iVar4.mo588a(iVar2, 1, constraintWidget.mo555i());
                    } else {
                        iVar4.mo587a(iVar2, constraintWidget.mo557k());
                    }
                    if (constraintWidget2.f702R > 0) {
                        constraintWidget2.f748x.f672a.mo584a(1, iVar2, constraintWidget2.f702R);
                    }
                } else if (constraintWidget2.f745u.f675d == null && constraintWidget2.f747w.f675d != null) {
                    iVar2.f806g = 1;
                    iVar4.f806g = 1;
                    if (z) {
                        iVar2.mo588a(iVar4, -1, constraintWidget.mo555i());
                    } else {
                        iVar2.mo587a(iVar4, -constraintWidget.mo557k());
                    }
                    if (constraintWidget2.f702R > 0) {
                        constraintWidget2.f748x.f672a.mo584a(1, iVar2, constraintWidget2.f702R);
                    }
                } else if (!(constraintWidget2.f745u.f675d == null || constraintWidget2.f747w.f675d == null)) {
                    iVar2.f806g = 2;
                    iVar4.f806g = 2;
                    if (z) {
                        iVar2.mo591b(iVar4, -1, constraintWidget.mo555i());
                        iVar4.mo591b(iVar2, 1, constraintWidget.mo555i());
                        constraintWidget.mo555i().mo596a(iVar2);
                        constraintWidget.mo554h().mo596a(iVar4);
                    } else {
                        iVar2.mo590b(iVar4, (float) (-constraintWidget.mo557k()));
                        iVar4.mo590b(iVar2, (float) constraintWidget.mo557k());
                    }
                    if (constraintWidget2.f702R > 0) {
                        constraintWidget2.f748x.f672a.mo584a(1, iVar2, constraintWidget2.f702R);
                    }
                }
            } else if (z3) {
                int k = constraintWidget.mo557k();
                iVar2.f806g = 1;
                iVar4.f806g = 1;
                if (constraintWidget2.f745u.f675d == null && constraintWidget2.f747w.f675d == null) {
                    if (z) {
                        iVar4.mo588a(iVar2, 1, constraintWidget.mo555i());
                    } else {
                        iVar4.mo587a(iVar2, k);
                    }
                } else if (constraintWidget2.f745u.f675d == null || constraintWidget2.f747w.f675d != null) {
                    if (constraintWidget2.f745u.f675d != null || constraintWidget2.f747w.f675d == null) {
                        if (!(constraintWidget2.f745u.f675d == null || constraintWidget2.f747w.f675d == null)) {
                            if (z) {
                                constraintWidget.mo555i().mo596a(iVar2);
                                constraintWidget.mo554h().mo596a(iVar4);
                            }
                            if (constraintWidget2.f692H == 0.0f) {
                                iVar2.f806g = 3;
                                iVar4.f806g = 3;
                                iVar2.mo590b(iVar4, 0.0f);
                                iVar4.mo590b(iVar2, 0.0f);
                                return;
                            }
                            iVar2.f806g = 2;
                            iVar4.f806g = 2;
                            iVar2.mo590b(iVar4, (float) (-k));
                            iVar4.mo590b(iVar2, (float) k);
                            constraintWidget2.mo548e(k);
                            if (constraintWidget2.f702R > 0) {
                                constraintWidget2.f748x.f672a.mo584a(1, iVar2, constraintWidget2.f702R);
                            }
                        }
                    } else if (z) {
                        iVar2.mo588a(iVar4, -1, constraintWidget.mo555i());
                    } else {
                        iVar2.mo587a(iVar4, -k);
                    }
                } else if (z) {
                    iVar4.mo588a(iVar2, 1, constraintWidget.mo555i());
                } else {
                    iVar4.mo587a(iVar2, k);
                }
            }
        }
    }

    /* renamed from: a */
    static void m720a(C0196d dVar, C0185e eVar, ConstraintWidget constraintWidget) {
        if (dVar.f688D[0] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.f688D[0] == DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f744t.f676e;
            int j = dVar.mo556j() - constraintWidget.f746v.f676e;
            constraintWidget.f744t.f681j = eVar.mo492a((Object) constraintWidget.f744t);
            constraintWidget.f746v.f681j = eVar.mo492a((Object) constraintWidget.f746v);
            eVar.mo493a(constraintWidget.f744t.f681j, i);
            eVar.mo493a(constraintWidget.f746v.f681j, j);
            constraintWidget.f727c = 2;
            constraintWidget.mo543c(i, j);
        }
        if (dVar.f688D[1] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.f688D[1] == DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.f745u.f676e;
            int k = dVar.mo557k() - constraintWidget.f747w.f676e;
            constraintWidget.f745u.f681j = eVar.mo492a((Object) constraintWidget.f745u);
            constraintWidget.f747w.f681j = eVar.mo492a((Object) constraintWidget.f747w);
            eVar.mo493a(constraintWidget.f745u.f681j, i2);
            eVar.mo493a(constraintWidget.f747w.f681j, k);
            if (constraintWidget.f702R > 0 || constraintWidget.f712ab == 8) {
                constraintWidget.f748x.f681j = eVar.mo492a((Object) constraintWidget.f748x);
                eVar.mo493a(constraintWidget.f748x.f681j, constraintWidget.f702R + i2);
            }
            constraintWidget.f728d = 2;
            constraintWidget.mo546d(i2, k);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r6.f717ag == 2) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r6.f718ah == 2) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m722a(android.support.constraint.solver.widgets.C0196d r20, android.support.constraint.solver.C0185e r21, int r22, int r23, android.support.constraint.solver.widgets.C0195c r24) {
        /*
            r0 = r21
            r1 = r24
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r1.f756a
            android.support.constraint.solver.widgets.ConstraintWidget r3 = r1.f758c
            android.support.constraint.solver.widgets.ConstraintWidget r4 = r1.f757b
            android.support.constraint.solver.widgets.ConstraintWidget r5 = r1.f759d
            android.support.constraint.solver.widgets.ConstraintWidget r6 = r1.f760e
            float r1 = r1.f766k
            r7 = 2
            r9 = 1
            if (r22 != 0) goto L_0x002a
            int r10 = r6.f717ag
            if (r10 != 0) goto L_0x001a
            r10 = 1
            goto L_0x001b
        L_0x001a:
            r10 = 0
        L_0x001b:
            int r11 = r6.f717ag
            if (r11 != r9) goto L_0x0021
            r11 = 1
            goto L_0x0022
        L_0x0021:
            r11 = 0
        L_0x0022:
            int r6 = r6.f717ag
            if (r6 != r7) goto L_0x0028
        L_0x0026:
            r6 = 1
            goto L_0x003d
        L_0x0028:
            r6 = 0
            goto L_0x003d
        L_0x002a:
            int r10 = r6.f718ah
            if (r10 != 0) goto L_0x0030
            r10 = 1
            goto L_0x0031
        L_0x0030:
            r10 = 0
        L_0x0031:
            int r11 = r6.f718ah
            if (r11 != r9) goto L_0x0037
            r11 = 1
            goto L_0x0038
        L_0x0037:
            r11 = 0
        L_0x0038:
            int r6 = r6.f718ah
            if (r6 != r7) goto L_0x0028
            goto L_0x0026
        L_0x003d:
            r13 = r2
            r7 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x0043:
            if (r12 != 0) goto L_0x00de
            int r8 = r13.f712ab
            r16 = r12
            r12 = 8
            if (r8 == r12) goto L_0x0080
            int r7 = r7 + 1
            if (r22 != 0) goto L_0x0058
            int r8 = r13.mo556j()
            float r8 = (float) r8
            float r14 = r14 + r8
            goto L_0x005e
        L_0x0058:
            int r8 = r13.mo557k()
            float r8 = (float) r8
            float r14 = r14 + r8
        L_0x005e:
            if (r13 == r4) goto L_0x006a
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r13.f686B
            r8 = r8[r23]
            int r8 = r8.mo510a()
            float r8 = (float) r8
            float r14 = r14 + r8
        L_0x006a:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r13.f686B
            r8 = r8[r23]
            int r8 = r8.mo510a()
            float r8 = (float) r8
            float r15 = r15 + r8
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r13.f686B
            int r17 = r23 + 1
            r8 = r8[r17]
            int r8 = r8.mo510a()
            float r8 = (float) r8
            float r15 = r15 + r8
        L_0x0080:
            int r8 = r13.f712ab
            if (r8 == r12) goto L_0x00af
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r13.f688D
            r8 = r8[r22]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r12) goto L_0x00af
            int r9 = r9 + 1
            if (r22 != 0) goto L_0x00a0
            int r8 = r13.f731g
            if (r8 == 0) goto L_0x0096
            r8 = 0
            return r8
        L_0x0096:
            r8 = 0
            int r12 = r13.f734j
            if (r12 != 0) goto L_0x009f
            int r12 = r13.f735k
            if (r12 == 0) goto L_0x00af
        L_0x009f:
            return r8
        L_0x00a0:
            r8 = 0
            int r12 = r13.f732h
            if (r12 == 0) goto L_0x00a6
            return r8
        L_0x00a6:
            int r12 = r13.f737m
            if (r12 != 0) goto L_0x00ae
            int r12 = r13.f738n
            if (r12 == 0) goto L_0x00af
        L_0x00ae:
            return r8
        L_0x00af:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r13.f686B
            int r12 = r23 + 1
            r8 = r8[r12]
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            if (r8 == 0) goto L_0x00d1
            android.support.constraint.solver.widgets.ConstraintWidget r8 = r8.f673b
            android.support.constraint.solver.widgets.ConstraintAnchor[] r12 = r8.f686B
            r12 = r12[r23]
            android.support.constraint.solver.widgets.ConstraintAnchor r12 = r12.f675d
            if (r12 == 0) goto L_0x00d1
            android.support.constraint.solver.widgets.ConstraintAnchor[] r12 = r8.f686B
            r12 = r12[r23]
            android.support.constraint.solver.widgets.ConstraintAnchor r12 = r12.f675d
            android.support.constraint.solver.widgets.ConstraintWidget r12 = r12.f673b
            if (r12 == r13) goto L_0x00ce
            goto L_0x00d1
        L_0x00ce:
            r18 = r8
            goto L_0x00d3
        L_0x00d1:
            r18 = 0
        L_0x00d3:
            if (r18 == 0) goto L_0x00db
            r12 = r16
            r13 = r18
            goto L_0x0043
        L_0x00db:
            r12 = 1
            goto L_0x0043
        L_0x00de:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r2.f686B
            r8 = r8[r23]
            android.support.constraint.solver.widgets.i r8 = r8.f672a
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r3.f686B
            int r12 = r23 + 1
            r3 = r3[r12]
            android.support.constraint.solver.widgets.i r3 = r3.f672a
            r19 = r2
            android.support.constraint.solver.widgets.i r2 = r8.f802c
            if (r2 == 0) goto L_0x031d
            android.support.constraint.solver.widgets.i r2 = r3.f802c
            if (r2 != 0) goto L_0x00f8
            goto L_0x031d
        L_0x00f8:
            android.support.constraint.solver.widgets.i r2 = r8.f802c
            int r2 = r2.f815i
            r0 = 1
            if (r2 == r0) goto L_0x0107
            android.support.constraint.solver.widgets.i r2 = r3.f802c
            int r2 = r2.f815i
            if (r2 == r0) goto L_0x0107
            r0 = 0
            return r0
        L_0x0107:
            r0 = 0
            if (r9 <= 0) goto L_0x010d
            if (r9 == r7) goto L_0x010d
            return r0
        L_0x010d:
            if (r6 != 0) goto L_0x0116
            if (r10 != 0) goto L_0x0116
            if (r11 == 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r0 = 0
            goto L_0x012f
        L_0x0116:
            if (r4 == 0) goto L_0x0122
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r4.f686B
            r0 = r0[r23]
            int r0 = r0.mo510a()
            float r0 = (float) r0
            goto L_0x0123
        L_0x0122:
            r0 = 0
        L_0x0123:
            if (r5 == 0) goto L_0x012f
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r5.f686B
            r2 = r2[r12]
            int r2 = r2.mo510a()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x012f:
            android.support.constraint.solver.widgets.i r2 = r8.f802c
            float r2 = r2.f805f
            android.support.constraint.solver.widgets.i r3 = r3.f802c
            float r3 = r3.f805f
            int r16 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r16 >= 0) goto L_0x013e
            float r3 = r3 - r2
            float r3 = r3 - r14
            goto L_0x0141
        L_0x013e:
            float r3 = r2 - r3
            float r3 = r3 - r14
        L_0x0141:
            r16 = 1
            if (r9 <= 0) goto L_0x01f6
            if (r9 != r7) goto L_0x01f6
            android.support.constraint.solver.widgets.ConstraintWidget r6 = r13.f689E
            if (r6 == 0) goto L_0x0157
            android.support.constraint.solver.widgets.ConstraintWidget r6 = r13.f689E
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r6.f688D
            r6 = r6[r22]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r7) goto L_0x0157
            r6 = 0
            return r6
        L_0x0157:
            float r3 = r3 + r14
            float r3 = r3 - r15
            if (r10 == 0) goto L_0x015d
            float r15 = r15 - r0
            float r3 = r3 - r15
        L_0x015d:
            if (r10 == 0) goto L_0x0179
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r4.f686B
            r0 = r0[r12]
            int r0 = r0.mo510a()
            float r0 = (float) r0
            float r2 = r2 + r0
            android.support.constraint.solver.widgets.ConstraintWidget[] r0 = r4.f723am
            r0 = r0[r22]
            if (r0 == 0) goto L_0x0179
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r0.f686B
            r0 = r0[r23]
            int r0 = r0.mo510a()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x0179:
            if (r4 == 0) goto L_0x01f4
            android.support.constraint.solver.f r0 = android.support.constraint.solver.C0185e.f622h
            if (r0 == 0) goto L_0x0197
            android.support.constraint.solver.f r0 = android.support.constraint.solver.C0185e.f622h
            long r6 = r0.f641B
            long r6 = r6 - r16
            r0.f641B = r6
            android.support.constraint.solver.f r0 = android.support.constraint.solver.C0185e.f622h
            long r6 = r0.f662s
            long r6 = r6 + r16
            r0.f662s = r6
            android.support.constraint.solver.f r0 = android.support.constraint.solver.C0185e.f622h
            long r6 = r0.f668y
            long r6 = r6 + r16
            r0.f668y = r6
        L_0x0197:
            android.support.constraint.solver.widgets.ConstraintWidget[] r0 = r4.f723am
            r0 = r0[r22]
            if (r0 != 0) goto L_0x01a4
            if (r4 != r5) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            r7 = 0
            r13 = r21
            goto L_0x01f2
        L_0x01a4:
            float r6 = (float) r9
            float r6 = r3 / r6
            r7 = 0
            int r10 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b3
            float[] r6 = r4.f721ak
            r6 = r6[r22]
            float r6 = r6 * r3
            float r6 = r6 / r1
        L_0x01b3:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r10 = r4.f686B
            r10 = r10[r23]
            int r10 = r10.mo510a()
            float r10 = (float) r10
            float r2 = r2 + r10
            android.support.constraint.solver.widgets.ConstraintAnchor[] r10 = r4.f686B
            r10 = r10[r23]
            android.support.constraint.solver.widgets.i r10 = r10.f672a
            android.support.constraint.solver.widgets.i r11 = r8.f804e
            r10.mo586a(r11, r2)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r10 = r4.f686B
            r10 = r10[r12]
            android.support.constraint.solver.widgets.i r10 = r10.f672a
            android.support.constraint.solver.widgets.i r11 = r8.f804e
            float r2 = r2 + r6
            r10.mo586a(r11, r2)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.f686B
            r6 = r6[r23]
            android.support.constraint.solver.widgets.i r6 = r6.f672a
            r13 = r21
            r6.mo585a(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.f686B
            r6 = r6[r12]
            android.support.constraint.solver.widgets.i r6 = r6.f672a
            r6.mo585a(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r4.f686B
            r4 = r4[r12]
            int r4 = r4.mo510a()
            float r4 = (float) r4
            float r2 = r2 + r4
        L_0x01f2:
            r4 = r0
            goto L_0x0179
        L_0x01f4:
            r0 = 1
            return r0
        L_0x01f6:
            r13 = r21
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x01fe
            r1 = 0
            return r1
        L_0x01fe:
            if (r6 == 0) goto L_0x027d
            float r3 = r3 - r0
            r0 = r19
            float r0 = r0.f707X
            float r3 = r3 * r0
            float r2 = r2 + r3
        L_0x0208:
            if (r4 == 0) goto L_0x027a
            android.support.constraint.solver.f r0 = android.support.constraint.solver.C0185e.f622h
            if (r0 == 0) goto L_0x0226
            android.support.constraint.solver.f r0 = android.support.constraint.solver.C0185e.f622h
            long r6 = r0.f641B
            long r6 = r6 - r16
            r0.f641B = r6
            android.support.constraint.solver.f r0 = android.support.constraint.solver.C0185e.f622h
            long r6 = r0.f662s
            long r6 = r6 + r16
            r0.f662s = r6
            android.support.constraint.solver.f r0 = android.support.constraint.solver.C0185e.f622h
            long r6 = r0.f668y
            long r6 = r6 + r16
            r0.f668y = r6
        L_0x0226:
            android.support.constraint.solver.widgets.ConstraintWidget[] r0 = r4.f723am
            r0 = r0[r22]
            if (r0 != 0) goto L_0x022e
            if (r4 != r5) goto L_0x0278
        L_0x022e:
            if (r22 != 0) goto L_0x0236
            int r1 = r4.mo556j()
            float r1 = (float) r1
            goto L_0x023b
        L_0x0236:
            int r1 = r4.mo557k()
            float r1 = (float) r1
        L_0x023b:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r4.f686B
            r3 = r3[r23]
            int r3 = r3.mo510a()
            float r3 = (float) r3
            float r2 = r2 + r3
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r4.f686B
            r3 = r3[r23]
            android.support.constraint.solver.widgets.i r3 = r3.f672a
            android.support.constraint.solver.widgets.i r6 = r8.f804e
            r3.mo586a(r6, r2)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r4.f686B
            r3 = r3[r12]
            android.support.constraint.solver.widgets.i r3 = r3.f672a
            android.support.constraint.solver.widgets.i r6 = r8.f804e
            float r2 = r2 + r1
            r3.mo586a(r6, r2)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r4.f686B
            r1 = r1[r23]
            android.support.constraint.solver.widgets.i r1 = r1.f672a
            r1.mo585a(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r4.f686B
            r1 = r1[r12]
            android.support.constraint.solver.widgets.i r1 = r1.f672a
            r1.mo585a(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r4.f686B
            r1 = r1[r12]
            int r1 = r1.mo510a()
            float r1 = (float) r1
            float r2 = r2 + r1
        L_0x0278:
            r4 = r0
            goto L_0x0208
        L_0x027a:
            r0 = 1
            goto L_0x031c
        L_0x027d:
            if (r10 != 0) goto L_0x0281
            if (r11 == 0) goto L_0x027a
        L_0x0281:
            if (r10 == 0) goto L_0x0285
            float r3 = r3 - r0
            goto L_0x0288
        L_0x0285:
            if (r11 == 0) goto L_0x0288
            float r3 = r3 - r0
        L_0x0288:
            int r0 = r7 + 1
            float r0 = (float) r0
            float r0 = r3 / r0
            if (r11 == 0) goto L_0x029c
            r1 = 1
            if (r7 <= r1) goto L_0x0298
            int r0 = r7 + -1
            float r0 = (float) r0
            float r0 = r3 / r0
            goto L_0x029c
        L_0x0298:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r3 / r0
        L_0x029c:
            float r1 = r2 + r0
            if (r11 == 0) goto L_0x02ad
            r3 = 1
            if (r7 <= r3) goto L_0x02ad
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r4.f686B
            r1 = r1[r23]
            int r1 = r1.mo510a()
            float r1 = (float) r1
            float r1 = r1 + r2
        L_0x02ad:
            if (r10 == 0) goto L_0x02bb
            if (r4 == 0) goto L_0x02bb
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r4.f686B
            r2 = r2[r23]
            int r2 = r2.mo510a()
            float r2 = (float) r2
            float r1 = r1 + r2
        L_0x02bb:
            if (r4 == 0) goto L_0x027a
            android.support.constraint.solver.f r2 = android.support.constraint.solver.C0185e.f622h
            if (r2 == 0) goto L_0x02d9
            android.support.constraint.solver.f r2 = android.support.constraint.solver.C0185e.f622h
            long r6 = r2.f641B
            long r6 = r6 - r16
            r2.f641B = r6
            android.support.constraint.solver.f r2 = android.support.constraint.solver.C0185e.f622h
            long r6 = r2.f662s
            long r6 = r6 + r16
            r2.f662s = r6
            android.support.constraint.solver.f r2 = android.support.constraint.solver.C0185e.f622h
            long r6 = r2.f668y
            long r6 = r6 + r16
            r2.f668y = r6
        L_0x02d9:
            android.support.constraint.solver.widgets.ConstraintWidget[] r2 = r4.f723am
            r2 = r2[r22]
            if (r2 != 0) goto L_0x02e1
            if (r4 != r5) goto L_0x031a
        L_0x02e1:
            if (r22 != 0) goto L_0x02e9
            int r3 = r4.mo556j()
            float r3 = (float) r3
            goto L_0x02ee
        L_0x02e9:
            int r3 = r4.mo557k()
            float r3 = (float) r3
        L_0x02ee:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.f686B
            r6 = r6[r23]
            android.support.constraint.solver.widgets.i r6 = r6.f672a
            android.support.constraint.solver.widgets.i r7 = r8.f804e
            r6.mo586a(r7, r1)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.f686B
            r6 = r6[r12]
            android.support.constraint.solver.widgets.i r6 = r6.f672a
            android.support.constraint.solver.widgets.i r7 = r8.f804e
            float r9 = r1 + r3
            r6.mo586a(r7, r9)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.f686B
            r6 = r6[r23]
            android.support.constraint.solver.widgets.i r6 = r6.f672a
            r6.mo585a(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r4.f686B
            r4 = r4[r12]
            android.support.constraint.solver.widgets.i r4 = r4.f672a
            r4.mo585a(r13)
            float r3 = r3 + r0
            float r1 = r1 + r3
        L_0x031a:
            r4 = r2
            goto L_0x02bb
        L_0x031c:
            return r0
        L_0x031d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.C0200g.m722a(android.support.constraint.solver.widgets.d, android.support.constraint.solver.e, int, int, android.support.constraint.solver.widgets.c):boolean");
    }
}
