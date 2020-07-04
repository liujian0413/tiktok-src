package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0183c;
import android.support.constraint.solver.C0185e;
import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import java.util.ArrayList;

public class ConstraintWidget {

    /* renamed from: W */
    public static float f684W = 0.5f;

    /* renamed from: A */
    ConstraintAnchor f685A = new ConstraintAnchor(this, Type.CENTER);

    /* renamed from: B */
    protected ConstraintAnchor[] f686B = {this.f744t, this.f746v, this.f745u, this.f747w, this.f748x, this.f685A};

    /* renamed from: C */
    protected ArrayList<ConstraintAnchor> f687C = new ArrayList<>();

    /* renamed from: D */
    protected DimensionBehaviour[] f688D = {DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};

    /* renamed from: E */
    public ConstraintWidget f689E = null;

    /* renamed from: F */
    int f690F = 0;

    /* renamed from: G */
    int f691G = 0;

    /* renamed from: H */
    public float f692H = 0.0f;

    /* renamed from: I */
    public int f693I = -1;

    /* renamed from: J */
    public int f694J = 0;

    /* renamed from: K */
    public int f695K = 0;

    /* renamed from: L */
    public int f696L = 0;

    /* renamed from: M */
    public int f697M = 0;

    /* renamed from: N */
    public int f698N = 0;

    /* renamed from: O */
    public int f699O = 0;

    /* renamed from: P */
    protected int f700P = 0;

    /* renamed from: Q */
    protected int f701Q = 0;

    /* renamed from: R */
    public int f702R = 0;

    /* renamed from: S */
    public int f703S;

    /* renamed from: T */
    public int f704T;

    /* renamed from: U */
    public int f705U;

    /* renamed from: V */
    public int f706V;

    /* renamed from: X */
    public float f707X = f684W;

    /* renamed from: Y */
    public float f708Y = f684W;

    /* renamed from: Z */
    public Object f709Z;

    /* renamed from: a */
    private int[] f710a = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: aa */
    public int f711aa = 0;

    /* renamed from: ab */
    public int f712ab = 0;

    /* renamed from: ac */
    public String f713ac = null;

    /* renamed from: ad */
    public String f714ad = null;

    /* renamed from: ae */
    boolean f715ae;

    /* renamed from: af */
    boolean f716af;

    /* renamed from: ag */
    public int f717ag = 0;

    /* renamed from: ah */
    public int f718ah = 0;

    /* renamed from: ai */
    boolean f719ai;

    /* renamed from: aj */
    boolean f720aj;

    /* renamed from: ak */
    float[] f721ak = {-1.0f, -1.0f};

    /* renamed from: al */
    protected ConstraintWidget[] f722al = {null, null};

    /* renamed from: am */
    protected ConstraintWidget[] f723am = {null, null};

    /* renamed from: an */
    ConstraintWidget f724an = null;

    /* renamed from: ao */
    ConstraintWidget f725ao = null;

    /* renamed from: b */
    private float f726b;

    /* renamed from: c */
    public int f727c = -1;

    /* renamed from: d */
    public int f728d = -1;

    /* renamed from: e */
    C0203j f729e;

    /* renamed from: f */
    C0203j f730f;

    /* renamed from: g */
    int f731g;

    /* renamed from: h */
    int f732h;

    /* renamed from: i */
    int[] f733i = new int[2];

    /* renamed from: j */
    int f734j;

    /* renamed from: k */
    int f735k;

    /* renamed from: l */
    float f736l = 1.0f;

    /* renamed from: m */
    int f737m;

    /* renamed from: n */
    int f738n;

    /* renamed from: o */
    float f739o = 1.0f;

    /* renamed from: p */
    public boolean f740p;

    /* renamed from: q */
    public boolean f741q;

    /* renamed from: r */
    int f742r = -1;

    /* renamed from: s */
    float f743s = 1.0f;

    /* renamed from: t */
    ConstraintAnchor f744t = new ConstraintAnchor(this, Type.LEFT);

    /* renamed from: u */
    ConstraintAnchor f745u = new ConstraintAnchor(this, Type.TOP);

    /* renamed from: v */
    ConstraintAnchor f746v = new ConstraintAnchor(this, Type.RIGHT);

    /* renamed from: w */
    ConstraintAnchor f747w = new ConstraintAnchor(this, Type.BOTTOM);

    /* renamed from: x */
    ConstraintAnchor f748x = new ConstraintAnchor(this, Type.BASELINE);

    /* renamed from: y */
    ConstraintAnchor f749y = new ConstraintAnchor(this, Type.CENTER_X);

    /* renamed from: z */
    ConstraintAnchor f750z = new ConstraintAnchor(this, Type.CENTER_Y);

    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: c */
    public void mo541c() {
    }

    /* renamed from: s */
    public ArrayList<ConstraintAnchor> mo565s() {
        return this.f687C;
    }

    /* renamed from: a */
    public final void mo531a(ConstraintWidget constraintWidget, float f, int i) {
        mo528a(Type.CENTER, constraintWidget, Type.CENTER, i, 0);
        this.f726b = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo532a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f692H = r9
            r8.f693I = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f692H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.mo532a(java.lang.String):void");
    }

    /* renamed from: a */
    public boolean mo533a() {
        return this.f712ab != 8;
    }

    /* renamed from: a */
    public final void mo528a(Type type, ConstraintWidget constraintWidget, Type type2, int i, int i2) {
        mo521a(type).mo514a(constraintWidget.mo521a(type2), i, i2, Strength.STRONG, 0, true);
    }

    /* renamed from: a */
    public final void mo527a(Type type, ConstraintWidget constraintWidget, Type type2) {
        mo529a(type, constraintWidget, type2, 0, Strength.STRONG);
    }

    /* renamed from: a */
    public final void mo529a(Type type, ConstraintWidget constraintWidget, Type type2, int i, Strength strength) {
        m629a(type, constraintWidget, type2, 0, strength, 0);
    }

    /* renamed from: a */
    public final void mo530a(DimensionBehaviour dimensionBehaviour) {
        this.f688D[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            mo545d(this.f705U);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0232, code lost:
        if (r15.f742r == -1) goto L_0x0236;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo520a(android.support.constraint.solver.C0185e r39) {
        /*
            r38 = this;
            r15 = r38
            r14 = r39
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f744t
            android.support.constraint.solver.SolverVariable r21 = r14.mo492a(r0)
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f746v
            android.support.constraint.solver.SolverVariable r10 = r14.mo492a(r0)
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f745u
            android.support.constraint.solver.SolverVariable r6 = r14.mo492a(r0)
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f747w
            android.support.constraint.solver.SolverVariable r4 = r14.mo492a(r0)
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f748x
            android.support.constraint.solver.SolverVariable r3 = r14.mo492a(r0)
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r15.f689E
            r1 = 8
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0124
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r15.f689E
            if (r0 == 0) goto L_0x003a
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r15.f689E
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.f688D
            r0 = r0[r13]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r5) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            android.support.constraint.solver.widgets.ConstraintWidget r5 = r15.f689E
            if (r5 == 0) goto L_0x004b
            android.support.constraint.solver.widgets.ConstraintWidget r5 = r15.f689E
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r5.f688D
            r5 = r5[r2]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r7) goto L_0x004b
            r5 = 1
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f744t
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            if (r7 == 0) goto L_0x0073
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f744t
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f744t
            if (r7 == r8) goto L_0x0073
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f746v
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            if (r7 == 0) goto L_0x0073
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f746v
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f746v
            if (r7 != r8) goto L_0x0073
            android.support.constraint.solver.widgets.ConstraintWidget r7 = r15.f689E
            android.support.constraint.solver.widgets.d r7 = (android.support.constraint.solver.widgets.C0196d) r7
            r7.mo572a(r15, r13)
        L_0x0073:
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f744t
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            if (r7 == 0) goto L_0x0083
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f744t
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f744t
            if (r7 == r8) goto L_0x0093
        L_0x0083:
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f746v
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            if (r7 == 0) goto L_0x0095
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f746v
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r7.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f746v
            if (r7 != r8) goto L_0x0095
        L_0x0093:
            r7 = 1
            goto L_0x0096
        L_0x0095:
            r7 = 0
        L_0x0096:
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f745u
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            if (r8 == 0) goto L_0x00bd
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f745u
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f745u
            if (r8 == r9) goto L_0x00bd
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f747w
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            if (r8 == 0) goto L_0x00bd
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f747w
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f747w
            if (r8 != r9) goto L_0x00bd
            android.support.constraint.solver.widgets.ConstraintWidget r8 = r15.f689E
            android.support.constraint.solver.widgets.d r8 = (android.support.constraint.solver.widgets.C0196d) r8
            r8.mo572a(r15, r2)
        L_0x00bd:
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f745u
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            if (r8 == 0) goto L_0x00cd
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f745u
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f745u
            if (r8 == r9) goto L_0x00dd
        L_0x00cd:
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f747w
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            if (r8 == 0) goto L_0x00df
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f747w
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.f675d
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f747w
            if (r8 != r9) goto L_0x00df
        L_0x00dd:
            r8 = 1
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            if (r0 == 0) goto L_0x00fd
            int r9 = r15.f712ab
            if (r9 == r1) goto L_0x00fd
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f744t
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.f675d
            if (r9 != 0) goto L_0x00fd
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f746v
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.f675d
            if (r9 != 0) goto L_0x00fd
            android.support.constraint.solver.widgets.ConstraintWidget r9 = r15.f689E
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.f746v
            android.support.constraint.solver.SolverVariable r9 = r14.mo492a(r9)
            r14.mo495a(r9, r10, r13, r2)
        L_0x00fd:
            if (r5 == 0) goto L_0x011e
            int r9 = r15.f712ab
            if (r9 == r1) goto L_0x011e
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f745u
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.f675d
            if (r9 != 0) goto L_0x011e
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f747w
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.f675d
            if (r9 != 0) goto L_0x011e
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r15.f748x
            if (r9 != 0) goto L_0x011e
            android.support.constraint.solver.widgets.ConstraintWidget r9 = r15.f689E
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.f747w
            android.support.constraint.solver.SolverVariable r9 = r14.mo492a(r9)
            r14.mo495a(r9, r4, r13, r2)
        L_0x011e:
            r12 = r5
            r16 = r7
            r22 = r8
            goto L_0x012a
        L_0x0124:
            r0 = 0
            r12 = 0
            r16 = 0
            r22 = 0
        L_0x012a:
            int r5 = r15.f690F
            int r7 = r15.f703S
            if (r5 >= r7) goto L_0x0132
            int r5 = r15.f703S
        L_0x0132:
            int r7 = r15.f691G
            int r8 = r15.f704T
            if (r7 >= r8) goto L_0x013a
            int r7 = r15.f704T
        L_0x013a:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.f688D
            r8 = r8[r13]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x0144
            r8 = 1
            goto L_0x0145
        L_0x0144:
            r8 = 0
        L_0x0145:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r15.f688D
            r9 = r9[r2]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 == r11) goto L_0x014f
            r9 = 1
            goto L_0x0150
        L_0x014f:
            r9 = 0
        L_0x0150:
            int r11 = r15.f693I
            r15.f742r = r11
            float r11 = r15.f692H
            r15.f743s = r11
            int r11 = r15.f731g
            int r2 = r15.f732h
            float r13 = r15.f692H
            r17 = 0
            r18 = 4
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 <= 0) goto L_0x0213
            int r13 = r15.f712ab
            r1 = 8
            if (r13 == r1) goto L_0x0213
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f688D
            r13 = 0
            r1 = r1[r13]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r27 = r3
            r3 = 3
            if (r1 != r13) goto L_0x017b
            if (r11 != 0) goto L_0x017b
            r11 = 3
        L_0x017b:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f688D
            r13 = 1
            r1 = r1[r13]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r13) goto L_0x0187
            if (r2 != 0) goto L_0x0187
            r2 = 3
        L_0x0187:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f688D
            r13 = 0
            r1 = r1[r13]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r13) goto L_0x01a2
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f688D
            r13 = 1
            r1 = r1[r13]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r13) goto L_0x01a2
            if (r11 != r3) goto L_0x01a2
            if (r2 != r3) goto L_0x01a2
            r15.m630a(r0, r12, r8, r9)
            goto L_0x0208
        L_0x01a2:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f688D
            r8 = 0
            r1 = r1[r8]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r9) goto L_0x01ce
            if (r11 != r3) goto L_0x01ce
            r15.f742r = r8
            float r1 = r15.f743s
            int r3 = r15.f691G
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r15.f688D
            r8 = 1
            r3 = r3[r8]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r5) goto L_0x01c9
            r29 = r1
            r25 = r2
            r30 = r7
            r20 = 4
            goto L_0x021d
        L_0x01c9:
            r29 = r1
            r25 = r2
            goto L_0x020c
        L_0x01ce:
            r8 = 1
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f688D
            r1 = r1[r8]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r9) goto L_0x0208
            if (r2 != r3) goto L_0x0208
            r15.f742r = r8
            int r1 = r15.f693I
            r3 = -1
            if (r1 != r3) goto L_0x01e7
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r15.f743s
            float r1 = r1 / r3
            r15.f743s = r1
        L_0x01e7:
            float r1 = r15.f743s
            int r3 = r15.f690F
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r15.f688D
            r7 = 0
            r3 = r3[r7]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r7) goto L_0x0201
            r30 = r1
            r29 = r5
            r20 = r11
            r25 = 4
            goto L_0x021d
        L_0x0201:
            r30 = r1
            r25 = r2
            r29 = r5
            goto L_0x020e
        L_0x0208:
            r25 = r2
            r29 = r5
        L_0x020c:
            r30 = r7
        L_0x020e:
            r20 = r11
            r28 = 1
            goto L_0x021f
        L_0x0213:
            r27 = r3
            r25 = r2
            r29 = r5
            r30 = r7
            r20 = r11
        L_0x021d:
            r28 = 0
        L_0x021f:
            int[] r1 = r15.f733i
            r2 = 0
            r1[r2] = r20
            int[] r1 = r15.f733i
            r2 = 1
            r1[r2] = r25
            if (r28 == 0) goto L_0x0239
            int r1 = r15.f742r
            if (r1 == 0) goto L_0x0235
            int r1 = r15.f742r
            r2 = -1
            if (r1 != r2) goto L_0x023a
            goto L_0x0236
        L_0x0235:
            r2 = -1
        L_0x0236:
            r26 = 1
            goto L_0x023c
        L_0x0239:
            r2 = -1
        L_0x023a:
            r26 = 0
        L_0x023c:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f688D
            r3 = 0
            r1 = r1[r3]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r3) goto L_0x024c
            boolean r1 = r15 instanceof android.support.constraint.solver.widgets.C0196d
            if (r1 == 0) goto L_0x024c
            r31 = 1
            goto L_0x024e
        L_0x024c:
            r31 = 0
        L_0x024e:
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r15.f685A
            boolean r1 = r1.mo517c()
            r3 = 1
            r23 = r1 ^ 1
            int r1 = r15.f727c
            r13 = 2
            r32 = 0
            if (r1 == r13) goto L_0x02c8
            android.support.constraint.solver.widgets.ConstraintWidget r1 = r15.f689E
            if (r1 == 0) goto L_0x026d
            android.support.constraint.solver.widgets.ConstraintWidget r1 = r15.f689E
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r1.f746v
            android.support.constraint.solver.SolverVariable r1 = r14.mo492a(r1)
            r33 = r1
            goto L_0x026f
        L_0x026d:
            r33 = r32
        L_0x026f:
            android.support.constraint.solver.widgets.ConstraintWidget r1 = r15.f689E
            if (r1 == 0) goto L_0x027e
            android.support.constraint.solver.widgets.ConstraintWidget r1 = r15.f689E
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r1.f744t
            android.support.constraint.solver.SolverVariable r1 = r14.mo492a(r1)
            r34 = r1
            goto L_0x0280
        L_0x027e:
            r34 = r32
        L_0x0280:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.f688D
            r17 = 0
            r5 = r1[r17]
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f744t
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f746v
            int r9 = r15.f694J
            int r11 = r15.f703S
            int[] r1 = r15.f710a
            r1 = r1[r17]
            r24 = r12
            r12 = r1
            float r1 = r15.f707X
            r13 = r1
            int r1 = r15.f734j
            r17 = r1
            int r1 = r15.f735k
            r18 = r1
            float r1 = r15.f736l
            r19 = r1
            r35 = r0
            r0 = r38
            r1 = r39
            r2 = r35
            r36 = r27
            r3 = r34
            r27 = r4
            r4 = r33
            r37 = r6
            r6 = r31
            r31 = r10
            r10 = r29
            r14 = r26
            r15 = r16
            r16 = r20
            r20 = r23
            r0.m628a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x02d2
        L_0x02c8:
            r37 = r6
            r31 = r10
            r24 = r12
            r36 = r27
            r27 = r4
        L_0x02d2:
            r15 = r38
            int r0 = r15.f728d
            r1 = 2
            if (r0 != r1) goto L_0x02da
            return
        L_0x02da:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f688D
            r14 = 1
            r0 = r0[r14]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r1) goto L_0x02e9
            boolean r0 = r15 instanceof android.support.constraint.solver.widgets.C0196d
            if (r0 == 0) goto L_0x02e9
            r6 = 1
            goto L_0x02ea
        L_0x02e9:
            r6 = 0
        L_0x02ea:
            if (r28 == 0) goto L_0x02f8
            int r0 = r15.f742r
            if (r0 == r14) goto L_0x02f5
            int r0 = r15.f742r
            r1 = -1
            if (r0 != r1) goto L_0x02f8
        L_0x02f5:
            r16 = 1
            goto L_0x02fa
        L_0x02f8:
            r16 = 0
        L_0x02fa:
            int r0 = r15.f702R
            if (r0 <= 0) goto L_0x0333
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f748x
            android.support.constraint.solver.widgets.i r0 = r0.f672a
            int r0 = r0.f815i
            if (r0 != r14) goto L_0x0312
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f748x
            android.support.constraint.solver.widgets.i r0 = r0.f672a
            r10 = r39
            r0.mo585a(r10)
            r4 = r37
            goto L_0x0337
        L_0x0312:
            r10 = r39
            int r0 = r15.f702R
            r1 = 6
            r2 = r36
            r4 = r37
            r10.mo504c(r2, r4, r0, r1)
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f748x
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r0.f675d
            if (r0 == 0) goto L_0x0337
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r15.f748x
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r0.f675d
            android.support.constraint.solver.SolverVariable r0 = r10.mo492a(r0)
            r3 = 0
            r10.mo504c(r2, r0, r3, r1)
            r20 = 0
            goto L_0x0339
        L_0x0333:
            r4 = r37
            r10 = r39
        L_0x0337:
            r20 = r23
        L_0x0339:
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r15.f689E
            if (r0 == 0) goto L_0x0348
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r15.f689E
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r0.f747w
            android.support.constraint.solver.SolverVariable r0 = r10.mo492a(r0)
            r23 = r0
            goto L_0x034a
        L_0x0348:
            r23 = r32
        L_0x034a:
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r15.f689E
            if (r0 == 0) goto L_0x0358
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r15.f689E
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r0.f745u
            android.support.constraint.solver.SolverVariable r0 = r10.mo492a(r0)
            r3 = r0
            goto L_0x035a
        L_0x0358:
            r3 = r32
        L_0x035a:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f688D
            r5 = r0[r14]
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r15.f745u
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r15.f747w
            int r9 = r15.f695K
            int r11 = r15.f704T
            int[] r0 = r15.f710a
            r12 = r0[r14]
            float r13 = r15.f708Y
            int r0 = r15.f737m
            r17 = r0
            int r0 = r15.f738n
            r18 = r0
            float r0 = r15.f739o
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r24
            r24 = r4
            r4 = r23
            r10 = r30
            r14 = r16
            r15 = r22
            r16 = r25
            r0.m628a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r28 == 0) goto L_0x03b8
            r7 = r38
            int r0 = r7.f742r
            r1 = 1
            if (r0 != r1) goto L_0x03a7
            float r5 = r7.f743s
            r6 = 6
            r0 = r39
            r1 = r27
            r2 = r24
            r3 = r31
            r4 = r21
            r0.mo496a(r1, r2, r3, r4, r5, r6)
            goto L_0x03ba
        L_0x03a7:
            float r5 = r7.f743s
            r6 = 6
            r0 = r39
            r1 = r31
            r2 = r21
            r3 = r27
            r4 = r24
            r0.mo496a(r1, r2, r3, r4, r5, r6)
            goto L_0x03ba
        L_0x03b8:
            r7 = r38
        L_0x03ba:
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r7.f685A
            boolean r0 = r0.mo517c()
            if (r0 == 0) goto L_0x03de
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r7.f685A
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r0.f675d
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r0.f673b
            float r1 = r7.f726b
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r7.f685A
            int r2 = r2.mo510a()
            r3 = r39
            r3.mo499a(r7, r0, r1, r2)
        L_0x03de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.mo520a(android.support.constraint.solver.e):void");
    }

    /* renamed from: l */
    public final int mo558l() {
        return this.f696L + this.f700P;
    }

    /* renamed from: m */
    public final int mo559m() {
        return this.f697M + this.f701Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo560n() {
        return this.f694J + this.f700P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo561o() {
        return this.f695K + this.f701Q;
    }

    /* renamed from: p */
    public final int mo562p() {
        return this.f694J + this.f690F;
    }

    /* renamed from: q */
    public final int mo563q() {
        return this.f695K + this.f691G;
    }

    /* renamed from: r */
    public final boolean mo564r() {
        if (this.f702R > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final DimensionBehaviour mo569v() {
        return this.f688D[0];
    }

    /* renamed from: w */
    public final DimensionBehaviour mo570w() {
        return this.f688D[1];
    }

    /* renamed from: h */
    public final C0203j mo554h() {
        if (this.f729e == null) {
            this.f729e = new C0203j();
        }
        return this.f729e;
    }

    /* renamed from: i */
    public final C0203j mo555i() {
        if (this.f730f == null) {
            this.f730f = new C0203j();
        }
        return this.f730f;
    }

    /* renamed from: j */
    public final int mo556j() {
        if (this.f712ab == 8) {
            return 0;
        }
        return this.f690F;
    }

    /* renamed from: k */
    public final int mo557k() {
        if (this.f712ab == 8) {
            return 0;
        }
        return this.f691G;
    }

    /* renamed from: b */
    public void mo534b() {
        for (int i = 0; i < 6; i++) {
            this.f686B[i].f672a.mo589b();
        }
    }

    /* renamed from: e */
    public final boolean mo549e() {
        if (this.f732h == 0 && this.f692H == 0.0f && this.f737m == 0 && this.f738n == 0 && this.f688D[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo552g() {
        for (int i = 0; i < 6; i++) {
            this.f686B[i].f672a.mo592c();
        }
    }

    /* renamed from: t */
    public void mo566t() {
        int i = this.f694J;
        int i2 = this.f695K;
        int i3 = this.f694J + this.f690F;
        int i4 = this.f695K + this.f691G;
        this.f696L = i;
        this.f697M = i2;
        this.f698N = i3 - i;
        this.f699O = i4 - i2;
    }

    /* renamed from: u */
    public final void mo568u() {
        int size = this.f687C.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) this.f687C.get(i)).mo516b();
        }
    }

    /* renamed from: x */
    private void mo575x() {
        this.f687C.add(this.f744t);
        this.f687C.add(this.f745u);
        this.f687C.add(this.f746v);
        this.f687C.add(this.f747w);
        this.f687C.add(this.f749y);
        this.f687C.add(this.f750z);
        this.f687C.add(this.f685A);
        this.f687C.add(this.f748x);
    }

    /* renamed from: d */
    public final boolean mo547d() {
        if (this.f731g == 0 && this.f692H == 0.0f && this.f734j == 0 && this.f735k == 0 && this.f688D[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public ConstraintWidget() {
        mo575x();
    }

    /* renamed from: f */
    public void mo550f() {
        this.f744t.mo516b();
        this.f745u.mo516b();
        this.f746v.mo516b();
        this.f747w.mo516b();
        this.f748x.mo516b();
        this.f749y.mo516b();
        this.f750z.mo516b();
        this.f685A.mo516b();
        this.f689E = null;
        this.f726b = 0.0f;
        this.f690F = 0;
        this.f691G = 0;
        this.f692H = 0.0f;
        this.f693I = -1;
        this.f694J = 0;
        this.f695K = 0;
        this.f696L = 0;
        this.f697M = 0;
        this.f698N = 0;
        this.f699O = 0;
        this.f700P = 0;
        this.f701Q = 0;
        this.f702R = 0;
        this.f703S = 0;
        this.f704T = 0;
        this.f705U = 0;
        this.f706V = 0;
        this.f707X = f684W;
        this.f708Y = f684W;
        this.f688D[0] = DimensionBehaviour.FIXED;
        this.f688D[1] = DimensionBehaviour.FIXED;
        this.f709Z = null;
        this.f711aa = 0;
        this.f712ab = 0;
        this.f714ad = null;
        this.f715ae = false;
        this.f716af = false;
        this.f717ag = 0;
        this.f718ah = 0;
        this.f719ai = false;
        this.f720aj = false;
        this.f721ak[0] = -1.0f;
        this.f721ak[1] = -1.0f;
        this.f727c = -1;
        this.f728d = -1;
        this.f710a[0] = Integer.MAX_VALUE;
        this.f710a[1] = Integer.MAX_VALUE;
        this.f731g = 0;
        this.f732h = 0;
        this.f736l = 1.0f;
        this.f739o = 1.0f;
        this.f735k = Integer.MAX_VALUE;
        this.f738n = Integer.MAX_VALUE;
        this.f734j = 0;
        this.f737m = 0;
        this.f742r = -1;
        this.f743s = 1.0f;
        if (this.f729e != null) {
            this.f729e.mo589b();
        }
        if (this.f730f != null) {
            this.f730f.mo589b();
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f714ad != null) {
            StringBuilder sb2 = new StringBuilder("type: ");
            sb2.append(this.f714ad);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f713ac != null) {
            StringBuilder sb3 = new StringBuilder("id: ");
            sb3.append(this.f713ac);
            sb3.append(" ");
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f694J);
        sb.append(", ");
        sb.append(this.f695K);
        sb.append(") - (");
        sb.append(this.f690F);
        sb.append(" x ");
        sb.append(this.f691G);
        sb.append(") wrap: (");
        sb.append(this.f705U);
        sb.append(" x ");
        sb.append(this.f706V);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo523a(int i) {
        C0200g.m719a(i, this);
    }

    /* renamed from: a */
    public final void mo522a(float f) {
        this.f721ak[0] = f;
    }

    /* renamed from: b */
    public final void mo535b(float f) {
        this.f721ak[1] = f;
    }

    /* renamed from: c */
    public final void mo542c(int i) {
        this.f710a[1] = i;
    }

    /* renamed from: b */
    public final void mo536b(int i) {
        this.f710a[0] = i;
    }

    /* renamed from: d */
    public final void mo545d(int i) {
        this.f690F = i;
        if (this.f690F < this.f703S) {
            this.f690F = this.f703S;
        }
    }

    /* renamed from: e */
    public final void mo548e(int i) {
        this.f691G = i;
        if (this.f691G < this.f704T) {
            this.f691G = this.f704T;
        }
    }

    /* renamed from: f */
    public final void mo551f(int i) {
        if (i < 0) {
            this.f703S = 0;
        } else {
            this.f703S = i;
        }
    }

    /* renamed from: g */
    public final void mo553g(int i) {
        if (i < 0) {
            this.f704T = 0;
        } else {
            this.f704T = i;
        }
    }

    /* renamed from: a */
    public void mo526a(C0183c cVar) {
        this.f744t.mo511a(cVar);
        this.f745u.mo511a(cVar);
        this.f746v.mo511a(cVar);
        this.f747w.mo511a(cVar);
        this.f748x.mo511a(cVar);
        this.f685A.mo511a(cVar);
        this.f749y.mo511a(cVar);
        this.f750z.mo511a(cVar);
    }

    /* renamed from: c */
    public void mo544c(C0185e eVar) {
        int b = C0185e.m582b((Object) this.f744t);
        int b2 = C0185e.m582b((Object) this.f745u);
        int b3 = C0185e.m582b((Object) this.f746v);
        int b4 = C0185e.m582b((Object) this.f747w);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        m627a(b, b2, b3, b4);
    }

    /* renamed from: b */
    public final void mo539b(C0185e eVar) {
        eVar.mo492a((Object) this.f744t);
        eVar.mo492a((Object) this.f745u);
        eVar.mo492a((Object) this.f746v);
        eVar.mo492a((Object) this.f747w);
        if (this.f702R > 0) {
            eVar.mo492a((Object) this.f748x);
        }
    }

    /* renamed from: a */
    public ConstraintAnchor mo521a(Type type) {
        switch (type) {
            case LEFT:
                return this.f744t;
            case TOP:
                return this.f745u;
            case RIGHT:
                return this.f746v;
            case BOTTOM:
                return this.f747w;
            case BASELINE:
                return this.f748x;
            case CENTER:
                return this.f685A;
            case CENTER_X:
                return this.f749y;
            case CENTER_Y:
                return this.f750z;
            case NONE:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* renamed from: b */
    public final void mo540b(DimensionBehaviour dimensionBehaviour) {
        this.f688D[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            mo548e(this.f706V);
        }
    }

    /* renamed from: a */
    public final void mo524a(int i, int i2) {
        this.f694J = i;
        this.f695K = i2;
    }

    /* renamed from: c */
    public final void mo543c(int i, int i2) {
        this.f694J = i;
        this.f690F = i2 - i;
        if (this.f690F < this.f703S) {
            this.f690F = this.f703S;
        }
    }

    /* renamed from: d */
    public final void mo546d(int i, int i2) {
        this.f695K = i;
        this.f691G = i2 - i;
        if (this.f691G < this.f704T) {
            this.f691G = this.f704T;
        }
    }

    /* renamed from: b */
    public void mo537b(int i, int i2) {
        this.f700P = i;
        this.f701Q = i2;
    }

    /* renamed from: a */
    public final void mo525a(int i, int i2, int i3, float f) {
        this.f731g = i;
        this.f734j = i2;
        this.f735k = i3;
        this.f736l = f;
        if (f < 1.0f && this.f731g == 0) {
            this.f731g = 2;
        }
    }

    /* renamed from: a */
    private void m627a(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.f694J = i;
        this.f695K = i2;
        if (this.f712ab == 8) {
            this.f690F = 0;
            this.f691G = 0;
            return;
        }
        if (this.f688D[0] == DimensionBehaviour.FIXED && i5 < this.f690F) {
            i5 = this.f690F;
        }
        if (this.f688D[1] == DimensionBehaviour.FIXED && i6 < this.f691G) {
            i6 = this.f691G;
        }
        this.f690F = i5;
        this.f691G = i6;
        if (this.f691G < this.f704T) {
            this.f691G = this.f704T;
        }
        if (this.f690F < this.f703S) {
            this.f690F = this.f703S;
        }
    }

    /* renamed from: b */
    public final void mo538b(int i, int i2, int i3, float f) {
        this.f732h = i;
        this.f737m = i2;
        this.f738n = i3;
        this.f739o = f;
        if (f < 1.0f && this.f732h == 0) {
            this.f732h = 2;
        }
    }

    /* renamed from: a */
    private void m630a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f742r == -1) {
            if (z3 && !z4) {
                this.f742r = 0;
            } else if (!z3 && z4) {
                this.f742r = 1;
                if (this.f693I == -1) {
                    this.f743s = 1.0f / this.f743s;
                }
            }
        }
        if (this.f742r == 0 && (!this.f745u.mo517c() || !this.f747w.mo517c())) {
            this.f742r = 1;
        } else if (this.f742r == 1 && (!this.f744t.mo517c() || !this.f746v.mo517c())) {
            this.f742r = 0;
        }
        if (this.f742r == -1 && (!this.f745u.mo517c() || !this.f747w.mo517c() || !this.f744t.mo517c() || !this.f746v.mo517c())) {
            if (this.f745u.mo517c() && this.f747w.mo517c()) {
                this.f742r = 0;
            } else if (this.f744t.mo517c() && this.f746v.mo517c()) {
                this.f743s = 1.0f / this.f743s;
                this.f742r = 1;
            }
        }
        if (this.f742r == -1) {
            if (z && !z2) {
                this.f742r = 0;
            } else if (!z && z2) {
                this.f743s = 1.0f / this.f743s;
                this.f742r = 1;
            }
        }
        if (this.f742r == -1) {
            if (this.f734j > 0 && this.f737m == 0) {
                this.f742r = 0;
            } else if (this.f734j == 0 && this.f737m > 0) {
                this.f743s = 1.0f / this.f743s;
                this.f742r = 1;
            }
        }
        if (this.f742r == -1 && z && z2) {
            this.f743s = 1.0f / this.f743s;
            this.f742r = 1;
        }
    }

    /* renamed from: a */
    private void m629a(Type type, ConstraintWidget constraintWidget, Type type2, int i, Strength strength, int i2) {
        boolean z;
        Type type3 = type;
        ConstraintWidget constraintWidget2 = constraintWidget;
        Type type4 = type2;
        int i3 = i2;
        int i4 = 0;
        if (type3 == Type.CENTER) {
            if (type4 == Type.CENTER) {
                ConstraintAnchor a = mo521a(Type.LEFT);
                ConstraintAnchor a2 = mo521a(Type.RIGHT);
                ConstraintAnchor a3 = mo521a(Type.TOP);
                ConstraintAnchor a4 = mo521a(Type.BOTTOM);
                boolean z2 = true;
                if ((a == null || !a.mo517c()) && (a2 == null || !a2.mo517c())) {
                    ConstraintWidget constraintWidget3 = constraintWidget;
                    Strength strength2 = strength;
                    int i5 = i2;
                    m629a(Type.LEFT, constraintWidget3, Type.LEFT, 0, strength2, i5);
                    m629a(Type.RIGHT, constraintWidget3, Type.RIGHT, 0, strength2, i5);
                    z = true;
                } else {
                    z = false;
                }
                if ((a3 == null || !a3.mo517c()) && (a4 == null || !a4.mo517c())) {
                    ConstraintWidget constraintWidget4 = constraintWidget;
                    Strength strength3 = strength;
                    int i6 = i2;
                    m629a(Type.TOP, constraintWidget4, Type.TOP, 0, strength3, i6);
                    m629a(Type.BOTTOM, constraintWidget4, Type.BOTTOM, 0, strength3, i6);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    mo521a(Type.CENTER).mo513a(constraintWidget2.mo521a(Type.CENTER), 0, i3);
                } else if (z) {
                    mo521a(Type.CENTER_X).mo513a(constraintWidget2.mo521a(Type.CENTER_X), 0, i3);
                } else {
                    if (z2) {
                        mo521a(Type.CENTER_Y).mo513a(constraintWidget2.mo521a(Type.CENTER_Y), 0, i3);
                    }
                }
            } else if (type4 == Type.LEFT || type4 == Type.RIGHT) {
                m629a(Type.LEFT, constraintWidget, type2, 0, strength, i2);
                try {
                    m629a(Type.RIGHT, constraintWidget, type2, 0, strength, i2);
                    mo521a(Type.CENTER).mo513a(constraintWidget.mo521a(type2), 0, i3);
                } catch (Throwable th) {
                    throw th;
                }
            } else if (type4 == Type.TOP || type4 == Type.BOTTOM) {
                ConstraintWidget constraintWidget5 = constraintWidget;
                Type type5 = type2;
                Strength strength4 = strength;
                int i7 = i2;
                m629a(Type.TOP, constraintWidget5, type5, 0, strength4, i7);
                m629a(Type.BOTTOM, constraintWidget5, type5, 0, strength4, i7);
                mo521a(Type.CENTER).mo513a(constraintWidget.mo521a(type2), 0, i3);
            }
        } else if (type3 == Type.CENTER_X && (type4 == Type.LEFT || type4 == Type.RIGHT)) {
            ConstraintAnchor a5 = mo521a(Type.LEFT);
            ConstraintAnchor a6 = constraintWidget.mo521a(type2);
            ConstraintAnchor a7 = mo521a(Type.RIGHT);
            a5.mo513a(a6, 0, i3);
            a7.mo513a(a6, 0, i3);
            mo521a(Type.CENTER_X).mo513a(a6, 0, i3);
        } else if (type3 == Type.CENTER_Y && (type4 == Type.TOP || type4 == Type.BOTTOM)) {
            ConstraintAnchor a8 = constraintWidget.mo521a(type2);
            mo521a(Type.TOP).mo513a(a8, 0, i3);
            mo521a(Type.BOTTOM).mo513a(a8, 0, i3);
            mo521a(Type.CENTER_Y).mo513a(a8, 0, i3);
        } else if (type3 == Type.CENTER_X && type4 == Type.CENTER_X) {
            mo521a(Type.LEFT).mo513a(constraintWidget2.mo521a(Type.LEFT), 0, i3);
            mo521a(Type.RIGHT).mo513a(constraintWidget2.mo521a(Type.RIGHT), 0, i3);
            mo521a(Type.CENTER_X).mo513a(constraintWidget.mo521a(type2), 0, i3);
        } else if (type3 == Type.CENTER_Y && type4 == Type.CENTER_Y) {
            mo521a(Type.TOP).mo513a(constraintWidget2.mo521a(Type.TOP), 0, i3);
            mo521a(Type.BOTTOM).mo513a(constraintWidget2.mo521a(Type.BOTTOM), 0, i3);
            mo521a(Type.CENTER_Y).mo513a(constraintWidget.mo521a(type2), 0, i3);
        } else {
            ConstraintAnchor a9 = mo521a(type);
            ConstraintAnchor a10 = constraintWidget.mo521a(type2);
            if (a9.mo512a(a10)) {
                if (type3 == Type.BASELINE) {
                    ConstraintAnchor a11 = mo521a(Type.TOP);
                    ConstraintAnchor a12 = mo521a(Type.BOTTOM);
                    if (a11 != null) {
                        a11.mo516b();
                    }
                    if (a12 != null) {
                        a12.mo516b();
                    }
                } else {
                    if (type3 == Type.TOP || type3 == Type.BOTTOM) {
                        ConstraintAnchor a13 = mo521a(Type.BASELINE);
                        if (a13 != null) {
                            a13.mo516b();
                        }
                        ConstraintAnchor a14 = mo521a(Type.CENTER);
                        if (a14.f675d != a10) {
                            a14.mo516b();
                        }
                        ConstraintAnchor d = mo521a(type).mo518d();
                        ConstraintAnchor a15 = mo521a(Type.CENTER_Y);
                        if (a15.mo517c()) {
                            d.mo516b();
                            a15.mo516b();
                        }
                    } else if (type3 == Type.LEFT || type3 == Type.RIGHT) {
                        ConstraintAnchor a16 = mo521a(Type.CENTER);
                        if (a16.f675d != a10) {
                            a16.mo516b();
                        }
                        ConstraintAnchor d2 = mo521a(type).mo518d();
                        ConstraintAnchor a17 = mo521a(Type.CENTER_X);
                        if (a17.mo517c()) {
                            d2.mo516b();
                            a17.mo516b();
                        }
                    }
                    i4 = i;
                }
                a9.mo515a(a10, i4, strength, i3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m628a(android.support.constraint.solver.C0185e r33, boolean r34, android.support.constraint.solver.SolverVariable r35, android.support.constraint.solver.SolverVariable r36, android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour r37, boolean r38, android.support.constraint.solver.widgets.ConstraintAnchor r39, android.support.constraint.solver.widgets.ConstraintAnchor r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, int r48, int r49, int r50, float r51, boolean r52) {
        /*
            r32 = this;
            r0 = r32
            r10 = r33
            r11 = r35
            r12 = r36
            r13 = r39
            r14 = r40
            r1 = r43
            r2 = r44
            android.support.constraint.solver.SolverVariable r9 = r10.mo492a(r13)
            android.support.constraint.solver.SolverVariable r8 = r10.mo492a(r14)
            android.support.constraint.solver.widgets.ConstraintAnchor r6 = r13.f675d
            android.support.constraint.solver.SolverVariable r7 = r10.mo492a(r6)
            android.support.constraint.solver.widgets.ConstraintAnchor r6 = r14.f675d
            android.support.constraint.solver.SolverVariable r6 = r10.mo492a(r6)
            boolean r11 = r10.f627d
            r15 = 1
            r21 = r6
            if (r11 == 0) goto L_0x005c
            android.support.constraint.solver.widgets.i r11 = r13.f672a
            int r11 = r11.f815i
            r6 = 1
            if (r11 != r6) goto L_0x005c
            android.support.constraint.solver.widgets.i r11 = r14.f672a
            int r11 = r11.f815i
            if (r11 != r6) goto L_0x005c
            android.support.constraint.solver.f r1 = android.support.constraint.solver.C0185e.m578a()
            if (r1 == 0) goto L_0x0048
            android.support.constraint.solver.f r1 = android.support.constraint.solver.C0185e.m578a()
            long r2 = r1.f662s
            long r2 = r2 + r15
            r1.f662s = r2
        L_0x0048:
            android.support.constraint.solver.widgets.i r1 = r13.f672a
            r1.mo585a(r10)
            android.support.constraint.solver.widgets.i r1 = r14.f672a
            r1.mo585a(r10)
            if (r47 != 0) goto L_0x005b
            if (r34 == 0) goto L_0x005b
            r1 = 0
            r2 = 6
            r10.mo495a(r12, r8, r1, r2)
        L_0x005b:
            return
        L_0x005c:
            android.support.constraint.solver.f r6 = android.support.constraint.solver.C0185e.m578a()
            if (r6 == 0) goto L_0x006b
            android.support.constraint.solver.f r6 = android.support.constraint.solver.C0185e.m578a()
            long r11 = r6.f641B
            long r11 = r11 + r15
            r6.f641B = r11
        L_0x006b:
            boolean r6 = r39.mo517c()
            boolean r11 = r40.mo517c()
            android.support.constraint.solver.widgets.ConstraintAnchor r12 = r0.f685A
            boolean r12 = r12.mo517c()
            if (r6 == 0) goto L_0x007d
            r15 = 1
            goto L_0x007e
        L_0x007d:
            r15 = 0
        L_0x007e:
            if (r11 == 0) goto L_0x0082
            int r15 = r15 + 1
        L_0x0082:
            if (r12 == 0) goto L_0x0086
            int r15 = r15 + 1
        L_0x0086:
            r23 = r15
            if (r46 == 0) goto L_0x008c
            r14 = 3
            goto L_0x008e
        L_0x008c:
            r14 = r48
        L_0x008e:
            int[] r15 = android.support.constraint.solver.widgets.ConstraintWidget.C01921.f752b
            int r16 = r37.ordinal()
            r15 = r15[r16]
            r3 = 4
            switch(r15) {
                case 1: goto L_0x009a;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x009c;
                default: goto L_0x009a;
            }
        L_0x009a:
            r15 = 0
            goto L_0x00a0
        L_0x009c:
            if (r14 != r3) goto L_0x009f
            goto L_0x009a
        L_0x009f:
            r15 = 1
        L_0x00a0:
            int r3 = r0.f712ab
            r0 = 8
            if (r3 != r0) goto L_0x00a9
            r0 = 0
            r15 = 0
            goto L_0x00ab
        L_0x00a9:
            r0 = r42
        L_0x00ab:
            if (r52 == 0) goto L_0x00c8
            if (r6 != 0) goto L_0x00b9
            if (r11 != 0) goto L_0x00b9
            if (r12 != 0) goto L_0x00b9
            r3 = r41
            r10.mo493a(r9, r3)
            goto L_0x00c8
        L_0x00b9:
            if (r6 == 0) goto L_0x00c8
            if (r11 != 0) goto L_0x00c8
            int r3 = r39.mo510a()
            r24 = r12
            r12 = 6
            r10.mo504c(r9, r7, r3, r12)
            goto L_0x00cb
        L_0x00c8:
            r24 = r12
            r12 = 6
        L_0x00cb:
            if (r15 != 0) goto L_0x00f7
            if (r38 == 0) goto L_0x00e5
            r3 = 0
            r12 = 3
            r10.mo504c(r8, r9, r3, r12)
            if (r1 <= 0) goto L_0x00db
            r3 = 6
            r10.mo495a(r8, r9, r1, r3)
            goto L_0x00dc
        L_0x00db:
            r3 = 6
        L_0x00dc:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r0) goto L_0x00e9
            r10.mo501b(r8, r9, r2, r3)
            goto L_0x00e9
        L_0x00e5:
            r3 = 6
            r10.mo504c(r8, r9, r0, r3)
        L_0x00e9:
            r28 = r49
            r12 = r50
            r25 = r7
            r2 = r23
            r7 = r32
        L_0x00f3:
            r16 = 4
            goto L_0x01d0
        L_0x00f7:
            r3 = 6
            r2 = -2
            r12 = r49
            if (r12 != r2) goto L_0x0101
            r12 = r50
            r3 = r0
            goto L_0x0104
        L_0x0101:
            r3 = r12
            r12 = r50
        L_0x0104:
            if (r12 != r2) goto L_0x0107
            r12 = r0
        L_0x0107:
            if (r3 <= 0) goto L_0x0112
            r2 = 6
            r10.mo495a(r8, r9, r3, r2)
            int r0 = java.lang.Math.max(r0, r3)
            goto L_0x0113
        L_0x0112:
            r2 = 6
        L_0x0113:
            if (r12 <= 0) goto L_0x0124
            if (r34 == 0) goto L_0x011d
            r2 = 1
            r10.mo501b(r8, r9, r12, r2)
            r2 = 6
            goto L_0x0120
        L_0x011d:
            r10.mo501b(r8, r9, r12, r2)
        L_0x0120:
            int r0 = java.lang.Math.min(r0, r12)
        L_0x0124:
            r2 = 1
            if (r14 != r2) goto L_0x013c
            if (r34 == 0) goto L_0x012f
            r2 = 6
            r10.mo504c(r8, r9, r0, r2)
            goto L_0x01a2
        L_0x012f:
            if (r47 == 0) goto L_0x0137
            r2 = 4
            r10.mo504c(r8, r9, r0, r2)
            goto L_0x01a2
        L_0x0137:
            r2 = 1
            r10.mo504c(r8, r9, r0, r2)
            goto L_0x01a2
        L_0x013c:
            r2 = 2
            if (r14 != r2) goto L_0x01a2
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r2 = r13.f674c
            r25 = r7
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r7 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP
            if (r2 == r7) goto L_0x016f
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r2 = r13.f674c
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r7 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r2 != r7) goto L_0x014e
            goto L_0x016f
        L_0x014e:
            r7 = r32
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r7.f689E
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r13 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r2.mo521a(r13)
            android.support.constraint.solver.SolverVariable r2 = r10.mo492a(r2)
            android.support.constraint.solver.widgets.ConstraintWidget r13 = r7.f689E
            r26 = r2
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r2 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r13.mo521a(r2)
            android.support.constraint.solver.SolverVariable r2 = r10.mo492a(r2)
            r18 = r2
            r19 = r26
            goto L_0x018f
        L_0x016f:
            r7 = r32
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r7.f689E
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r13 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r2.mo521a(r13)
            android.support.constraint.solver.SolverVariable r2 = r10.mo492a(r2)
            android.support.constraint.solver.widgets.ConstraintWidget r13 = r7.f689E
            r27 = r2
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r2 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r13.mo521a(r2)
            android.support.constraint.solver.SolverVariable r2 = r10.mo492a(r2)
            r18 = r2
            r19 = r27
        L_0x018f:
            android.support.constraint.solver.b r15 = r33.mo503c()
            r16 = r8
            r17 = r9
            r20 = r51
            android.support.constraint.solver.b r2 = r15.mo472a(r16, r17, r18, r19, r20)
            r10.mo498a(r2)
            r15 = 0
            goto L_0x01a6
        L_0x01a2:
            r25 = r7
            r7 = r32
        L_0x01a6:
            if (r15 == 0) goto L_0x01ca
            r2 = r23
            r13 = 2
            if (r2 == r13) goto L_0x01c6
            r16 = 4
            if (r46 != 0) goto L_0x01c3
            int r0 = java.lang.Math.max(r3, r0)
            if (r12 <= 0) goto L_0x01bb
            int r0 = java.lang.Math.min(r12, r0)
        L_0x01bb:
            r28 = r3
            r3 = 6
            r10.mo504c(r8, r9, r0, r3)
            r15 = 0
            goto L_0x01d0
        L_0x01c3:
            r28 = r3
            goto L_0x01d0
        L_0x01c6:
            r28 = r3
            goto L_0x00f3
        L_0x01ca:
            r28 = r3
            r2 = r23
            goto L_0x00f3
        L_0x01d0:
            if (r52 == 0) goto L_0x02e5
            if (r47 == 0) goto L_0x01d6
            goto L_0x02e5
        L_0x01d6:
            r0 = 5
            if (r6 != 0) goto L_0x01ed
            if (r11 != 0) goto L_0x01ed
            if (r24 != 0) goto L_0x01ed
            if (r34 == 0) goto L_0x01e6
            r4 = 0
            r5 = r36
            r10.mo495a(r5, r8, r4, r0)
            goto L_0x01e8
        L_0x01e6:
            r5 = r36
        L_0x01e8:
            r13 = r8
            r1 = 6
        L_0x01ea:
            r3 = 0
            goto L_0x02dc
        L_0x01ed:
            r4 = 0
            r5 = r36
            if (r6 == 0) goto L_0x01fa
            if (r11 != 0) goto L_0x01fa
            if (r34 == 0) goto L_0x01e8
            r10.mo495a(r5, r8, r4, r0)
            goto L_0x01e8
        L_0x01fa:
            if (r6 != 0) goto L_0x0211
            if (r11 == 0) goto L_0x0211
            int r1 = r40.mo510a()
            int r1 = -r1
            r3 = r21
            r2 = 6
            r10.mo504c(r8, r3, r1, r2)
            if (r34 == 0) goto L_0x01e8
            r2 = r35
            r10.mo495a(r9, r2, r4, r0)
            goto L_0x01e8
        L_0x0211:
            r3 = r21
            r2 = r35
            if (r6 == 0) goto L_0x01e8
            if (r11 == 0) goto L_0x01e8
            if (r15 == 0) goto L_0x027c
            if (r34 == 0) goto L_0x0224
            if (r1 != 0) goto L_0x0224
            r6 = 6
            r10.mo495a(r8, r9, r4, r6)
            goto L_0x0225
        L_0x0224:
            r6 = 6
        L_0x0225:
            if (r14 != 0) goto L_0x0251
            if (r12 > 0) goto L_0x022f
            if (r28 <= 0) goto L_0x022c
            goto L_0x022f
        L_0x022c:
            r1 = 6
            r11 = 0
            goto L_0x0231
        L_0x022f:
            r1 = 4
            r11 = 1
        L_0x0231:
            int r13 = r39.mo510a()
            r14 = r25
            r10.mo504c(r9, r14, r13, r1)
            int r13 = r40.mo510a()
            int r13 = -r13
            r10.mo504c(r8, r3, r13, r1)
            if (r12 > 0) goto L_0x024a
            if (r28 <= 0) goto L_0x0247
            goto L_0x024a
        L_0x0247:
            r22 = 0
            goto L_0x024c
        L_0x024a:
            r22 = 1
        L_0x024c:
            r12 = r11
            r11 = r14
            r29 = r22
            goto L_0x0293
        L_0x0251:
            r11 = r25
            r1 = 1
            if (r14 != r1) goto L_0x0259
            r0 = 6
        L_0x0257:
            r12 = 1
            goto L_0x0291
        L_0x0259:
            r1 = 3
            if (r14 != r1) goto L_0x0278
            if (r46 != 0) goto L_0x0267
            int r1 = r7.f742r
            r13 = -1
            if (r1 == r13) goto L_0x0267
            if (r12 > 0) goto L_0x0267
            r1 = 6
            goto L_0x0268
        L_0x0267:
            r1 = 4
        L_0x0268:
            int r12 = r39.mo510a()
            r10.mo504c(r9, r11, r12, r1)
            int r12 = r40.mo510a()
            int r12 = -r12
            r10.mo504c(r8, r3, r12, r1)
            goto L_0x0257
        L_0x0278:
            r12 = 0
            r29 = 0
            goto L_0x0293
        L_0x027c:
            r11 = r25
            r6 = 6
            if (r34 == 0) goto L_0x0290
            int r1 = r39.mo510a()
            r10.mo495a(r9, r11, r1, r0)
            int r1 = r40.mo510a()
            int r1 = -r1
            r10.mo501b(r8, r3, r1, r0)
        L_0x0290:
            r12 = 0
        L_0x0291:
            r29 = 1
        L_0x0293:
            if (r29 == 0) goto L_0x02ba
            int r13 = r39.mo510a()
            int r14 = r40.mo510a()
            r1 = r33
            r2 = r9
            r15 = r3
            r3 = r11
            r16 = 0
            r4 = r13
            r13 = r5
            r5 = r45
            r31 = r11
            r30 = r15
            r11 = 6
            r6 = r30
            r11 = r31
            r7 = r8
            r13 = r8
            r8 = r14
            r14 = r9
            r9 = r0
            r1.mo494a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02be
        L_0x02ba:
            r30 = r3
            r13 = r8
            r14 = r9
        L_0x02be:
            if (r12 == 0) goto L_0x02d3
            int r0 = r39.mo510a()
            r1 = 6
            r10.mo495a(r14, r11, r0, r1)
            int r0 = r40.mo510a()
            int r0 = -r0
            r2 = r30
            r10.mo501b(r13, r2, r0, r1)
            goto L_0x02d4
        L_0x02d3:
            r1 = 6
        L_0x02d4:
            if (r34 == 0) goto L_0x01ea
            r0 = r35
            r3 = 0
            r10.mo495a(r14, r0, r3, r1)
        L_0x02dc:
            if (r34 == 0) goto L_0x02e4
            r5 = r13
            r4 = r36
            r10.mo495a(r4, r5, r3, r1)
        L_0x02e4:
            return
        L_0x02e5:
            r5 = r8
            r14 = r9
            r0 = r35
            r1 = 6
            r3 = 0
            r4 = r36
            r6 = 2
            if (r2 >= r6) goto L_0x02f8
            if (r34 == 0) goto L_0x02f8
            r10.mo495a(r14, r0, r3, r1)
            r10.mo495a(r4, r5, r3, r1)
        L_0x02f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.m628a(android.support.constraint.solver.e, boolean, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, android.support.constraint.solver.widgets.ConstraintAnchor, android.support.constraint.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }
}
