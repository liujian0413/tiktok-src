package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0185e;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.Arrays;

/* renamed from: android.support.constraint.solver.widgets.d */
public class C0196d extends C0207m {

    /* renamed from: a */
    public boolean f773a;

    /* renamed from: aA */
    int f774aA = 0;

    /* renamed from: aC */
    private C0205l f775aC;

    /* renamed from: ap */
    int f776ap;

    /* renamed from: aq */
    int f777aq;

    /* renamed from: ar */
    int f778ar;

    /* renamed from: as */
    int f779as;

    /* renamed from: at */
    int f780at = 0;

    /* renamed from: au */
    int f781au = 0;

    /* renamed from: av */
    C0195c[] f782av = new C0195c[4];

    /* renamed from: aw */
    C0195c[] f783aw = new C0195c[4];

    /* renamed from: ax */
    public int f784ax = 3;

    /* renamed from: ay */
    public boolean f785ay = false;

    /* renamed from: az */
    public boolean f786az = false;

    /* renamed from: b */
    public C0185e f787b = new C0185e();

    /* renamed from: E */
    private void m694E() {
        this.f780at = 0;
        this.f781au = 0;
    }

    /* renamed from: y */
    public final void mo576y() {
        m692C();
        mo523a(this.f784ax);
    }

    /* renamed from: C */
    private void m692C() {
        int size = this.f826aB.size();
        mo534b();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.f826aB.get(i)).mo534b();
        }
    }

    /* renamed from: D */
    private void m693D() {
        if (!mo574h(8)) {
            mo523a(this.f784ax);
        }
        mo577z();
    }

    /* renamed from: f */
    public final void mo550f() {
        this.f787b.mo500b();
        this.f776ap = 0;
        this.f778ar = 0;
        this.f777aq = 0;
        this.f779as = 0;
        super.mo550f();
    }

    /* renamed from: z */
    public final void mo577z() {
        C0202i iVar = mo521a(Type.LEFT).f672a;
        C0202i iVar2 = mo521a(Type.TOP).f672a;
        iVar.mo586a((C0202i) null, 0.0f);
        iVar2.mo586a((C0202i) null, 0.0f);
    }

    /* JADX WARNING: type inference failed for: r12v11, types: [boolean] */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r12v27 */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v11, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 260
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo575x() {
        /*
            r17 = this;
            r1 = r17
            int r2 = r1.f694J
            int r3 = r1.f695K
            int r0 = r17.mo556j()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r17.mo557k()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f785ay = r4
            r1.f786az = r4
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r1.f689E
            if (r0 == 0) goto L_0x0042
            android.support.constraint.solver.widgets.l r0 = r1.f775aC
            if (r0 != 0) goto L_0x002a
            android.support.constraint.solver.widgets.l r0 = new android.support.constraint.solver.widgets.l
            r0.<init>(r1)
            r1.f775aC = r0
        L_0x002a:
            android.support.constraint.solver.widgets.l r0 = r1.f775aC
            r0.mo600a(r1)
            int r0 = r1.f776ap
            r1.f694J = r0
            int r0 = r1.f777aq
            r1.f695K = r0
            r17.mo568u()
            android.support.constraint.solver.e r0 = r1.f787b
            android.support.constraint.solver.c r0 = r0.f630g
            r1.mo526a(r0)
            goto L_0x0046
        L_0x0042:
            r1.f694J = r4
            r1.f695K = r4
        L_0x0046:
            int r0 = r1.f784ax
            r7 = 8
            r8 = 1
            if (r0 == 0) goto L_0x005e
            boolean r0 = r1.mo574h(r7)
            if (r0 != 0) goto L_0x0056
            r17.m692C()
        L_0x0056:
            r17.m693D()
            android.support.constraint.solver.e r0 = r1.f787b
            r0.f627d = r8
            goto L_0x0062
        L_0x005e:
            android.support.constraint.solver.e r0 = r1.f787b
            r0.f627d = r4
        L_0x0062:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            r9 = r0[r8]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            r10 = r0[r4]
            r17.m694E()
            java.util.ArrayList r0 = r1.f826aB
            int r11 = r0.size()
            r0 = 0
        L_0x0074:
            if (r0 >= r11) goto L_0x008a
            java.util.ArrayList r12 = r1.f826aB
            java.lang.Object r12 = r12.get(r0)
            android.support.constraint.solver.widgets.ConstraintWidget r12 = (android.support.constraint.solver.widgets.ConstraintWidget) r12
            boolean r13 = r12 instanceof android.support.constraint.solver.widgets.C0207m
            if (r13 == 0) goto L_0x0087
            android.support.constraint.solver.widgets.m r12 = (android.support.constraint.solver.widgets.C0207m) r12
            r12.mo575x()
        L_0x0087:
            int r0 = r0 + 1
            goto L_0x0074
        L_0x008a:
            r0 = 0
            r12 = 1
            r13 = 0
        L_0x008d:
            if (r12 == 0) goto L_0x020f
            int r14 = r0 + 1
            android.support.constraint.solver.e r0 = r1.f787b     // Catch:{ Exception -> 0x00be }
            r0.mo500b()     // Catch:{ Exception -> 0x00be }
            android.support.constraint.solver.e r0 = r1.f787b     // Catch:{ Exception -> 0x00be }
            r1.mo539b(r0)     // Catch:{ Exception -> 0x00be }
            r0 = 0
        L_0x009c:
            if (r0 >= r11) goto L_0x00b0
            java.util.ArrayList r15 = r1.f826aB     // Catch:{ Exception -> 0x00be }
            java.lang.Object r15 = r15.get(r0)     // Catch:{ Exception -> 0x00be }
            android.support.constraint.solver.widgets.ConstraintWidget r15 = (android.support.constraint.solver.widgets.ConstraintWidget) r15     // Catch:{ Exception -> 0x00be }
            android.support.constraint.solver.e r7 = r1.f787b     // Catch:{ Exception -> 0x00be }
            r15.mo539b(r7)     // Catch:{ Exception -> 0x00be }
            int r0 = r0 + 1
            r7 = 8
            goto L_0x009c
        L_0x00b0:
            android.support.constraint.solver.e r0 = r1.f787b     // Catch:{ Exception -> 0x00be }
            boolean r7 = r1.m698d(r0)     // Catch:{ Exception -> 0x00be }
            android.support.constraint.solver.e r0 = r1.f787b     // Catch:{ Exception -> 0x00bc }
            r0.mo505d()     // Catch:{ Exception -> 0x00bc }
            goto L_0x00d3
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c0
        L_0x00be:
            r0 = move-exception
            r7 = r12
        L_0x00c0:
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r8 = "EXCEPTION : "
            r15.<init>(r8)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r12.println(r0)
        L_0x00d3:
            r0 = 2
            if (r7 == 0) goto L_0x00e0
            android.support.constraint.solver.e r7 = r1.f787b
            boolean[] r8 = android.support.constraint.solver.widgets.C0200g.f799a
            r1.m695a(r7, r8)
        L_0x00dd:
            r4 = 8
            goto L_0x0120
        L_0x00e0:
            android.support.constraint.solver.e r7 = r1.f787b
            r1.mo544c(r7)
            r7 = 0
        L_0x00e6:
            if (r7 >= r11) goto L_0x00dd
            java.util.ArrayList r8 = r1.f826aB
            java.lang.Object r8 = r8.get(r7)
            android.support.constraint.solver.widgets.ConstraintWidget r8 = (android.support.constraint.solver.widgets.ConstraintWidget) r8
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r8.f688D
            r12 = r12[r4]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r15 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r15) goto L_0x0106
            int r12 = r8.mo556j()
            int r15 = r8.f705U
            if (r12 >= r15) goto L_0x0106
            boolean[] r7 = android.support.constraint.solver.widgets.C0200g.f799a
            r12 = 1
            r7[r0] = r12
            goto L_0x00dd
        L_0x0106:
            r12 = 1
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r15 = r8.f688D
            r15 = r15[r12]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r4) goto L_0x011c
            int r4 = r8.mo557k()
            int r8 = r8.f706V
            if (r4 >= r8) goto L_0x011c
            boolean[] r4 = android.support.constraint.solver.widgets.C0200g.f799a
            r4[r0] = r12
            goto L_0x00dd
        L_0x011c:
            int r7 = r7 + 1
            r4 = 0
            goto L_0x00e6
        L_0x0120:
            if (r14 >= r4) goto L_0x018c
            boolean[] r7 = android.support.constraint.solver.widgets.C0200g.f799a
            boolean r0 = r7[r0]
            if (r0 == 0) goto L_0x018c
            r0 = 0
            r7 = 0
            r8 = 0
        L_0x012b:
            if (r0 >= r11) goto L_0x014f
            java.util.ArrayList r12 = r1.f826aB
            java.lang.Object r12 = r12.get(r0)
            android.support.constraint.solver.widgets.ConstraintWidget r12 = (android.support.constraint.solver.widgets.ConstraintWidget) r12
            int r15 = r12.f694J
            int r16 = r12.mo556j()
            int r15 = r15 + r16
            int r7 = java.lang.Math.max(r7, r15)
            int r15 = r12.f695K
            int r12 = r12.mo557k()
            int r15 = r15 + r12
            int r8 = java.lang.Math.max(r8, r15)
            int r0 = r0 + 1
            goto L_0x012b
        L_0x014f:
            int r0 = r1.f703S
            int r0 = java.lang.Math.max(r0, r7)
            int r7 = r1.f704T
            int r7 = java.lang.Math.max(r7, r8)
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r10 != r8) goto L_0x0172
            int r8 = r17.mo556j()
            if (r8 >= r0) goto L_0x0172
            r1.mo545d(r0)
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r12 = 0
            r0[r12] = r8
            r0 = 1
            r13 = 1
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 != r8) goto L_0x018a
            int r8 = r17.mo557k()
            if (r8 >= r7) goto L_0x018a
            r1.mo548e(r7)
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8 = 1
            r0[r8] = r7
            r0 = 1
            r8 = 1
            goto L_0x018e
        L_0x018a:
            r8 = r13
            goto L_0x018e
        L_0x018c:
            r8 = r13
            r0 = 0
        L_0x018e:
            int r7 = r1.f703S
            int r12 = r17.mo556j()
            int r7 = java.lang.Math.max(r7, r12)
            int r12 = r17.mo556j()
            if (r7 <= r12) goto L_0x01aa
            r1.mo545d(r7)
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8 = 0
            r0[r8] = r7
            r0 = 1
            r8 = 1
        L_0x01aa:
            int r7 = r1.f704T
            int r12 = r17.mo557k()
            int r7 = java.lang.Math.max(r7, r12)
            int r12 = r17.mo557k()
            if (r7 <= r12) goto L_0x01c7
            r1.mo548e(r7)
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r12 = 1
            r0[r12] = r7
            r0 = 1
            r8 = 1
            goto L_0x01c8
        L_0x01c7:
            r12 = 1
        L_0x01c8:
            if (r8 != 0) goto L_0x0206
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r1.f688D
            r13 = 0
            r7 = r7[r13]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r15 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r15) goto L_0x01e8
            if (r5 <= 0) goto L_0x01e8
            int r7 = r17.mo556j()
            if (r7 <= r5) goto L_0x01e8
            r1.f785ay = r12
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r13] = r7
            r1.mo545d(r5)
            r0 = 1
            r8 = 1
        L_0x01e8:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r1.f688D
            r7 = r7[r12]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r13) goto L_0x0206
            if (r6 <= 0) goto L_0x0206
            int r7 = r17.mo557k()
            if (r7 <= r6) goto L_0x0206
            r1.f786az = r12
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r12] = r7
            r1.mo548e(r6)
            r12 = 1
            r13 = 1
            goto L_0x0208
        L_0x0206:
            r12 = r0
            r13 = r8
        L_0x0208:
            r0 = r14
            r4 = 0
            r7 = 8
            r8 = 1
            goto L_0x008d
        L_0x020f:
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r1.f689E
            if (r0 == 0) goto L_0x023f
            int r0 = r1.f703S
            int r2 = r17.mo556j()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.f704T
            int r3 = r17.mo557k()
            int r2 = java.lang.Math.max(r2, r3)
            android.support.constraint.solver.widgets.l r3 = r1.f775aC
            r3.mo601b(r1)
            int r3 = r1.f776ap
            int r0 = r0 + r3
            int r3 = r1.f778ar
            int r0 = r0 + r3
            r1.mo545d(r0)
            int r0 = r1.f777aq
            int r2 = r2 + r0
            int r0 = r1.f779as
            int r2 = r2 + r0
            r1.mo548e(r2)
            goto L_0x0243
        L_0x023f:
            r1.f694J = r2
            r1.f695K = r3
        L_0x0243:
            if (r13 == 0) goto L_0x024f
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            r2 = 0
            r0[r2] = r10
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f688D
            r2 = 1
            r0[r2] = r9
        L_0x024f:
            android.support.constraint.solver.e r0 = r1.f787b
            android.support.constraint.solver.c r0 = r0.f630g
            r1.mo526a(r0)
            android.support.constraint.solver.widgets.d r0 = r17.mo604A()
            if (r1 != r0) goto L_0x025f
            r17.mo566t()
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.C0196d.mo575x():void");
    }

    /* renamed from: h */
    public final boolean mo574h(int i) {
        if ((this.f784ax & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo523a(int i) {
        super.mo523a(i);
        int size = this.f826aB.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.f826aB.get(i2)).mo523a(i);
        }
    }

    /* renamed from: c */
    private void m696c(ConstraintWidget constraintWidget) {
        if (this.f780at + 1 >= this.f783aw.length) {
            this.f783aw = (C0195c[]) Arrays.copyOf(this.f783aw, this.f783aw.length * 2);
        }
        this.f783aw[this.f780at] = new C0195c(constraintWidget, 0, this.f773a);
        this.f780at++;
    }

    /* renamed from: d */
    private void m697d(ConstraintWidget constraintWidget) {
        if (this.f781au + 1 >= this.f782av.length) {
            this.f782av = (C0195c[]) Arrays.copyOf(this.f782av, this.f782av.length * 2);
        }
        this.f782av[this.f781au] = new C0195c(constraintWidget, 1, this.f773a);
        this.f781au++;
    }

    /* renamed from: d */
    private boolean m698d(C0185e eVar) {
        mo520a(eVar);
        int size = this.f826aB.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f826aB.get(i);
            if (constraintWidget instanceof C0196d) {
                DimensionBehaviour dimensionBehaviour = constraintWidget.f688D[0];
                DimensionBehaviour dimensionBehaviour2 = constraintWidget.f688D[1];
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.mo530a(DimensionBehaviour.FIXED);
                }
                if (dimensionBehaviour2 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.mo540b(DimensionBehaviour.FIXED);
                }
                constraintWidget.mo520a(eVar);
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.mo530a(dimensionBehaviour);
                }
                if (dimensionBehaviour2 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.mo540b(dimensionBehaviour2);
                }
            } else {
                C0200g.m720a(this, eVar, constraintWidget);
                constraintWidget.mo520a(eVar);
            }
        }
        if (this.f780at > 0) {
            C0194b.m687a(this, eVar, 0);
        }
        if (this.f781au > 0) {
            C0194b.m687a(this, eVar, 1);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo572a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            m696c(constraintWidget);
            return;
        }
        if (i == 1) {
            m697d(constraintWidget);
        }
    }

    /* renamed from: e */
    public final void mo573e(int i, int i2) {
        if (!(this.f688D[0] == DimensionBehaviour.WRAP_CONTENT || this.f729e == null)) {
            this.f729e.mo594a(i);
        }
        if (this.f688D[1] != DimensionBehaviour.WRAP_CONTENT && this.f730f != null) {
            this.f730f.mo594a(i2);
        }
    }

    /* renamed from: a */
    private void m695a(C0185e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo544c(eVar);
        int size = this.f826aB.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f826aB.get(i);
            constraintWidget.mo544c(eVar);
            if (constraintWidget.f688D[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mo556j() < constraintWidget.f705U) {
                zArr[2] = true;
            }
            if (constraintWidget.f688D[1] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mo557k() < constraintWidget.f706V) {
                zArr[2] = true;
            }
        }
    }
}
