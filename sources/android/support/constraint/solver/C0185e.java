package android.support.constraint.solver;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.solver.e */
public final class C0185e {

    /* renamed from: h */
    public static C0187f f622h = null;

    /* renamed from: i */
    private static int f623i = 1000;

    /* renamed from: a */
    public int f624a;

    /* renamed from: b */
    public C0186a f625b;

    /* renamed from: c */
    C0182b[] f626c = new C0182b[this.f632k];

    /* renamed from: d */
    public boolean f627d;

    /* renamed from: e */
    int f628e = 1;

    /* renamed from: f */
    public int f629f;

    /* renamed from: g */
    public final C0183c f630g;

    /* renamed from: j */
    private HashMap<String, SolverVariable> f631j;

    /* renamed from: k */
    private int f632k = 32;

    /* renamed from: l */
    private int f633l = this.f632k;

    /* renamed from: m */
    private boolean[] f634m = new boolean[this.f632k];

    /* renamed from: n */
    private int f635n = this.f632k;

    /* renamed from: o */
    private SolverVariable[] f636o = new SolverVariable[f623i];

    /* renamed from: p */
    private int f637p;

    /* renamed from: q */
    private C0182b[] f638q = new C0182b[this.f632k];

    /* renamed from: r */
    private final C0186a f639r;

    /* renamed from: android.support.constraint.solver.e$a */
    interface C0186a {
        /* renamed from: a */
        SolverVariable mo465a(C0185e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo474a(C0186a aVar);

        /* renamed from: d */
        void mo486d(SolverVariable solverVariable);

        /* renamed from: e */
        void mo488e();

        /* renamed from: f */
        SolverVariable mo489f();
    }

    /* renamed from: a */
    public static C0187f m578a() {
        return f622h;
    }

    /* renamed from: a */
    public final void mo498a(C0182b bVar) {
        if (bVar != null) {
            if (f622h != null) {
                C0187f fVar = f622h;
                fVar.f649f++;
                if (bVar.f618e) {
                    C0187f fVar2 = f622h;
                    fVar2.f650g++;
                }
            }
            if (this.f629f + 1 >= this.f635n || this.f628e + 1 >= this.f633l) {
                m586e();
            }
            boolean z = false;
            if (!bVar.f618e) {
                m584c(bVar);
                if (!bVar.mo487d()) {
                    bVar.mo484c();
                    if (bVar.mo477a(this)) {
                        SolverVariable h = m589h();
                        bVar.f614a = h;
                        m585d(bVar);
                        this.f639r.mo474a(bVar);
                        m575a(this.f639r, true);
                        if (h.f595c == -1) {
                            if (bVar.f614a == h) {
                                SolverVariable b = bVar.mo478b(h);
                                if (b != null) {
                                    if (f622h != null) {
                                        C0187f fVar3 = f622h;
                                        fVar3.f653j++;
                                    }
                                    bVar.mo485c(b);
                                }
                            }
                            if (!bVar.f618e) {
                                bVar.f614a.mo448c(bVar);
                            }
                            this.f629f--;
                        }
                        z = true;
                    }
                    if (!bVar.mo475a()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                m585d(bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo495a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0182b c = mo503c();
        SolverVariable g = m588g();
        g.f596d = 0;
        c.mo471a(solverVariable, solverVariable2, g, i);
        if (i2 != 6) {
            m579a(c, (int) (c.f617d.mo462b(g) * -1.0f), i2);
        }
        mo498a(c);
    }

    /* renamed from: a */
    public final void mo497a(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C0182b c = mo503c();
        SolverVariable g = m588g();
        g.f596d = 0;
        c.mo471a(solverVariable, solverVariable2, g, 0);
        if (z) {
            m579a(c, (int) (c.f617d.mo462b(g) * -1.0f), 1);
        }
        mo498a(c);
    }

    /* renamed from: a */
    public final void mo494a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        int i4 = i3;
        C0182b c = mo503c();
        c.mo469a(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i4 != 6) {
            c.mo473a(this, i4);
        }
        mo498a(c);
    }

    /* renamed from: a */
    public final void mo496a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        C0182b c = mo503c();
        c.mo472a(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        mo498a(c);
    }

    /* renamed from: a */
    public final void mo499a(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintWidget constraintWidget3 = constraintWidget;
        ConstraintWidget constraintWidget4 = constraintWidget2;
        SolverVariable a = mo492a((Object) constraintWidget3.mo521a(Type.LEFT));
        SolverVariable a2 = mo492a((Object) constraintWidget3.mo521a(Type.TOP));
        SolverVariable a3 = mo492a((Object) constraintWidget3.mo521a(Type.RIGHT));
        SolverVariable a4 = mo492a((Object) constraintWidget3.mo521a(Type.BOTTOM));
        SolverVariable a5 = mo492a((Object) constraintWidget4.mo521a(Type.LEFT));
        SolverVariable a6 = mo492a((Object) constraintWidget4.mo521a(Type.TOP));
        SolverVariable a7 = mo492a((Object) constraintWidget4.mo521a(Type.RIGHT));
        SolverVariable a8 = mo492a((Object) constraintWidget4.mo521a(Type.BOTTOM));
        C0182b c = mo503c();
        double d = (double) f;
        double sin = Math.sin(d);
        SolverVariable solverVariable = a3;
        double d2 = (double) i;
        Double.isNaN(d2);
        SolverVariable solverVariable2 = a7;
        c.mo481b(a2, a4, a6, a8, (float) (sin * d2));
        mo498a(c);
        C0182b c2 = mo503c();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        c2.mo481b(a, solverVariable, a5, solverVariable2, (float) (cos * d2));
        mo498a(c2);
    }

    /* renamed from: f */
    private void m587f() {
        for (int i = 0; i < this.f626c.length; i++) {
            C0182b bVar = this.f626c[i];
            if (bVar != null) {
                this.f630g.f619a.mo509a(bVar);
            }
            this.f626c[i] = null;
        }
    }

    /* renamed from: i */
    private void m590i() {
        for (int i = 0; i < this.f629f; i++) {
            C0182b bVar = this.f626c[i];
            bVar.f614a.f597e = bVar.f615b;
        }
    }

    /* renamed from: g */
    private SolverVariable m588g() {
        if (f622h != null) {
            C0187f fVar = f622h;
            fVar.f657n++;
        }
        if (this.f628e + 1 >= this.f633l) {
            m586e();
        }
        SolverVariable a = m576a(SolverVariable.Type.SLACK, (String) null);
        this.f624a++;
        this.f628e++;
        a.f594b = this.f624a;
        this.f630g.f621c[this.f624a] = a;
        return a;
    }

    /* renamed from: h */
    private SolverVariable m589h() {
        if (f622h != null) {
            C0187f fVar = f622h;
            fVar.f658o++;
        }
        if (this.f628e + 1 >= this.f633l) {
            m586e();
        }
        SolverVariable a = m576a(SolverVariable.Type.SLACK, (String) null);
        this.f624a++;
        this.f628e++;
        a.f594b = this.f624a;
        this.f630g.f621c[this.f624a] = a;
        return a;
    }

    /* renamed from: c */
    public final C0182b mo503c() {
        C0182b bVar = (C0182b) this.f630g.f619a.mo507a();
        if (bVar == null) {
            bVar = new C0182b(this.f630g);
        } else {
            bVar.mo482b();
        }
        SolverVariable.m527a();
        return bVar;
    }

    public C0185e() {
        m587f();
        this.f630g = new C0183c();
        this.f625b = new C0184d(this.f630g);
        this.f639r = new C0182b(this.f630g);
    }

    /* renamed from: e */
    private void m586e() {
        this.f632k *= 2;
        this.f626c = (C0182b[]) Arrays.copyOf(this.f626c, this.f632k);
        this.f630g.f621c = (SolverVariable[]) Arrays.copyOf(this.f630g.f621c, this.f632k);
        this.f634m = new boolean[this.f632k];
        this.f633l = this.f632k;
        this.f635n = this.f632k;
        if (f622h != null) {
            C0187f fVar = f622h;
            fVar.f647d++;
            C0187f fVar2 = f622h;
            fVar2.f659p = Math.max(fVar2.f659p, (long) this.f632k);
            C0187f fVar3 = f622h;
            fVar3.f643D = fVar3.f659p;
        }
    }

    /* renamed from: b */
    public final void mo500b() {
        for (SolverVariable solverVariable : this.f630g.f621c) {
            if (solverVariable != null) {
                solverVariable.mo446b();
            }
        }
        this.f630g.f620b.mo508a(this.f636o, this.f637p);
        this.f637p = 0;
        Arrays.fill(this.f630g.f621c, null);
        if (this.f631j != null) {
            this.f631j.clear();
        }
        this.f624a = 0;
        this.f625b.mo488e();
        this.f628e = 1;
        for (int i = 0; i < this.f629f; i++) {
            this.f626c[i].f616c = false;
        }
        m587f();
        this.f629f = 0;
    }

    /* renamed from: d */
    public final void mo505d() throws Exception {
        if (f622h != null) {
            C0187f fVar = f622h;
            fVar.f648e++;
        }
        if (this.f627d) {
            if (f622h != null) {
                C0187f fVar2 = f622h;
                fVar2.f661r++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f629f) {
                    z = true;
                    break;
                } else if (!this.f626c[i].f618e) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                m580a(this.f625b);
            } else {
                if (f622h != null) {
                    C0187f fVar3 = f622h;
                    fVar3.f660q++;
                }
                m590i();
            }
        } else {
            m580a(this.f625b);
        }
    }

    /* renamed from: b */
    private void m583b(C0182b bVar) {
        bVar.mo473a(this, 0);
    }

    /* renamed from: b */
    public static int m582b(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f681j;
        if (solverVariable != null) {
            return (int) (solverVariable.f597e + 0.5f);
        }
        return 0;
    }

    /* renamed from: c */
    private final void m584c(C0182b bVar) {
        if (this.f629f > 0) {
            bVar.f617d.mo459a(bVar, this.f626c);
            if (bVar.f617d.f603a == 0) {
                bVar.f618e = true;
            }
        }
    }

    /* renamed from: d */
    private final void m585d(C0182b bVar) {
        if (this.f626c[this.f629f] != null) {
            this.f630g.f619a.mo509a(this.f626c[this.f629f]);
        }
        this.f626c[this.f629f] = bVar;
        bVar.f614a.f595c = this.f629f;
        this.f629f++;
        bVar.f614a.mo448c(bVar);
    }

    /* renamed from: a */
    private void m580a(C0186a aVar) throws Exception {
        if (f622h != null) {
            C0187f fVar = f622h;
            fVar.f663t++;
            C0187f fVar2 = f622h;
            fVar2.f664u = Math.max(fVar2.f664u, (long) this.f628e);
            C0187f fVar3 = f622h;
            fVar3.f665v = Math.max(fVar3.f665v, (long) this.f629f);
        }
        m584c((C0182b) aVar);
        m581b(aVar);
        m575a(aVar, false);
        m590i();
    }

    /* renamed from: b */
    private int m581b(C0186a aVar) throws Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i < this.f629f) {
                if (this.f626c[i].f614a.f599g != SolverVariable.Type.UNRESTRICTED && this.f626c[i].f615b < 0.0f) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            if (f622h != null) {
                C0187f fVar = f622h;
                fVar.f654k++;
            }
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f629f) {
                C0182b bVar = this.f626c[i3];
                if (bVar.f614a.f599g != SolverVariable.Type.UNRESTRICTED && !bVar.f618e && bVar.f615b < f) {
                    int i7 = 1;
                    while (i7 < this.f628e) {
                        SolverVariable solverVariable = this.f630g.f621c[i7];
                        float b = bVar.f617d.mo462b(solverVariable);
                        if (b > f) {
                            int i8 = i6;
                            float f3 = f2;
                            int i9 = i5;
                            int i10 = i4;
                            for (int i11 = 0; i11 < 7; i11++) {
                                float f4 = solverVariable.f598f[i11] / b;
                                if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                    i9 = i7;
                                    i10 = i3;
                                    f3 = f4;
                                    i8 = i11;
                                }
                            }
                            i4 = i10;
                            i5 = i9;
                            f2 = f3;
                            i6 = i8;
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C0182b bVar2 = this.f626c[i4];
                bVar2.f614a.f595c = -1;
                if (f622h != null) {
                    C0187f fVar2 = f622h;
                    fVar2.f653j++;
                }
                bVar2.mo485c(this.f630g.f621c[i5]);
                bVar2.f614a.f595c = i4;
                bVar2.f614a.mo448c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f628e / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: a */
    public final SolverVariable mo492a(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f628e + 1 >= this.f633l) {
            m586e();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f681j;
            if (solverVariable == null) {
                constraintAnchor.mo511a(this.f630g);
                solverVariable = constraintAnchor.f681j;
            }
            if (solverVariable.f594b == -1 || solverVariable.f594b > this.f624a || this.f630g.f621c[solverVariable.f594b] == null) {
                if (solverVariable.f594b != -1) {
                    solverVariable.mo446b();
                }
                this.f624a++;
                this.f628e++;
                solverVariable.f594b = this.f624a;
                solverVariable.f599g = SolverVariable.Type.UNRESTRICTED;
                this.f630g.f621c[this.f624a] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* renamed from: a */
    private SolverVariable m576a(SolverVariable.Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f630g.f620b.mo507a();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type, str);
            solverVariable.mo444a(type, str);
        } else {
            solverVariable.mo446b();
            solverVariable.mo444a(type, str);
        }
        if (this.f637p >= f623i) {
            f623i *= 2;
            this.f636o = (SolverVariable[]) Arrays.copyOf(this.f636o, f623i);
        }
        SolverVariable[] solverVariableArr = this.f636o;
        int i = this.f637p;
        this.f637p = i + 1;
        solverVariableArr[i] = solverVariable;
        return solverVariable;
    }

    /* renamed from: a */
    private final int m575a(C0186a aVar, boolean z) {
        if (f622h != null) {
            C0187f fVar = f622h;
            fVar.f651h++;
        }
        for (int i = 0; i < this.f628e; i++) {
            this.f634m[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            if (f622h != null) {
                C0187f fVar2 = f622h;
                fVar2.f652i++;
            }
            i2++;
            if (i2 >= this.f628e * 2) {
                return i2;
            }
            if (aVar.mo489f() != null) {
                this.f634m[aVar.mo489f().f594b] = true;
            }
            SolverVariable a = aVar.mo465a(this, this.f634m);
            if (a != null) {
                if (this.f634m[a.f594b]) {
                    return i2;
                }
                this.f634m[a.f594b] = true;
            }
            if (a != null) {
                int i3 = -1;
                float f = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.f629f; i4++) {
                    C0182b bVar = this.f626c[i4];
                    if (bVar.f614a.f599g != SolverVariable.Type.UNRESTRICTED && !bVar.f618e && bVar.mo476a(a)) {
                        float b = bVar.f617d.mo462b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f615b) / b;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    C0182b bVar2 = this.f626c[i3];
                    bVar2.f614a.f595c = -1;
                    if (f622h != null) {
                        C0187f fVar3 = f622h;
                        fVar3.f653j++;
                    }
                    bVar2.mo485c(a);
                    bVar2.f614a.f595c = i3;
                    bVar2.f614a.mo448c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public final SolverVariable mo491a(int i, String str) {
        if (f622h != null) {
            C0187f fVar = f622h;
            fVar.f656m++;
        }
        if (this.f628e + 1 >= this.f633l) {
            m586e();
        }
        SolverVariable a = m576a(SolverVariable.Type.ERROR, str);
        this.f624a++;
        this.f628e++;
        a.f594b = this.f624a;
        a.f596d = i;
        this.f630g.f621c[this.f624a] = a;
        this.f625b.mo486d(a);
        return a;
    }

    /* renamed from: a */
    public final void mo493a(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f595c;
        if (solverVariable.f595c != -1) {
            C0182b bVar = this.f626c[i2];
            if (bVar.f618e) {
                bVar.f615b = (float) i;
            } else if (bVar.f617d.f603a == 0) {
                bVar.f618e = true;
                bVar.f615b = (float) i;
            } else {
                C0182b c = mo503c();
                c.mo479b(solverVariable, i);
                mo498a(c);
            }
        } else {
            C0182b c2 = mo503c();
            c2.mo467a(solverVariable, i);
            mo498a(c2);
        }
    }

    /* renamed from: a */
    private void m579a(C0182b bVar, int i, int i2) {
        bVar.mo483c(mo491a(i2, (String) null), i);
    }

    /* renamed from: b */
    public final void mo502b(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C0182b c = mo503c();
        SolverVariable g = m588g();
        g.f596d = 0;
        c.mo480b(solverVariable, solverVariable2, g, 0);
        if (z) {
            m579a(c, (int) (c.f617d.mo462b(g) * -1.0f), 1);
        }
        mo498a(c);
    }

    /* renamed from: b */
    public final void mo501b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0182b c = mo503c();
        SolverVariable g = m588g();
        g.f596d = 0;
        c.mo480b(solverVariable, solverVariable2, g, i);
        if (i2 != 6) {
            m579a(c, (int) (c.f617d.mo462b(g) * -1.0f), i2);
        }
        mo498a(c);
    }

    /* renamed from: c */
    public final C0182b mo504c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0182b c = mo503c();
        c.mo468a(solverVariable, solverVariable2, i);
        if (i2 != 6) {
            c.mo473a(this, i2);
        }
        mo498a(c);
        return c;
    }

    /* renamed from: a */
    public static C0182b m577a(C0185e eVar, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f, boolean z) {
        C0182b c = eVar.mo503c();
        if (z) {
            eVar.m583b(c);
        }
        return c.mo470a(solverVariable, solverVariable2, solverVariable3, f);
    }
}
