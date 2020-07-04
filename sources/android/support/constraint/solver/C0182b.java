package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable.Type;

/* renamed from: android.support.constraint.solver.b */
public class C0182b implements C0186a {

    /* renamed from: a */
    SolverVariable f614a;

    /* renamed from: b */
    float f615b;

    /* renamed from: c */
    boolean f616c;

    /* renamed from: d */
    public final C0181a f617d;

    /* renamed from: e */
    boolean f618e;

    /* renamed from: f */
    public final SolverVariable mo489f() {
        return this.f614a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo475a() {
        return this.f614a != null && (this.f614a.f599g == Type.UNRESTRICTED || this.f615b >= 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo476a(SolverVariable solverVariable) {
        return this.f617d.mo460a(solverVariable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo477a(C0185e eVar) {
        boolean z;
        SolverVariable a = this.f617d.mo452a(eVar);
        if (a == null) {
            z = true;
        } else {
            mo485c(a);
            z = false;
        }
        if (this.f617d.f603a == 0) {
            this.f618e = true;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo474a(C0186a aVar) {
        if (aVar instanceof C0182b) {
            C0182b bVar = (C0182b) aVar;
            this.f614a = null;
            this.f617d.mo454a();
            for (int i = 0; i < bVar.f617d.f603a; i++) {
                this.f617d.mo457a(bVar.f617d.mo451a(i), bVar.f617d.mo461b(i), true);
            }
        }
    }

    public String toString() {
        return m548g();
    }

    /* renamed from: b */
    public final void mo482b() {
        this.f614a = null;
        this.f617d.mo454a();
        this.f615b = 0.0f;
        this.f618e = false;
    }

    /* renamed from: e */
    public final void mo488e() {
        this.f617d.mo454a();
        this.f614a = null;
        this.f615b = 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo484c() {
        if (this.f615b < 0.0f) {
            this.f615b *= -1.0f;
            this.f617d.mo463b();
        }
    }

    /* renamed from: d */
    public final boolean mo487d() {
        if (this.f614a == null && this.f615b == 0.0f && this.f617d.f603a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private String m548g() {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4 = "";
        if (this.f614a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append("0");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(this.f614a);
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" = ");
        String sb4 = sb3.toString();
        if (this.f615b != 0.0f) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f615b);
            str2 = sb5.toString();
            z = true;
        } else {
            str2 = sb4;
            z = false;
        }
        int i = this.f617d.f603a;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable a = this.f617d.mo451a(i2);
            if (a != null) {
                float b = this.f617d.mo461b(i2);
                if (b != 0.0f) {
                    String solverVariable = a.toString();
                    if (!z) {
                        if (b < 0.0f) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str2);
                            sb6.append("- ");
                            str2 = sb6.toString();
                            b *= -1.0f;
                        }
                    } else if (b > 0.0f) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str2);
                        sb7.append(" + ");
                        str2 = sb7.toString();
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str2);
                        sb8.append(" - ");
                        str2 = sb8.toString();
                        b *= -1.0f;
                    }
                    if (b == 1.0f) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(str2);
                        sb9.append(solverVariable);
                        str3 = sb9.toString();
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(str2);
                        sb10.append(b);
                        sb10.append(" ");
                        sb10.append(solverVariable);
                        str3 = sb10.toString();
                    }
                    str2 = str3;
                    z = true;
                }
            }
        }
        if (z) {
            return str2;
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(str2);
        sb11.append("0.0");
        return sb11.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final SolverVariable mo478b(SolverVariable solverVariable) {
        return this.f617d.mo453a((boolean[]) null, solverVariable);
    }

    public C0182b(C0183c cVar) {
        this.f617d = new C0181a(this, cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo485c(SolverVariable solverVariable) {
        if (this.f614a != null) {
            this.f617d.mo456a(this.f614a, -1.0f);
            this.f614a = null;
        }
        float a = this.f617d.mo450a(solverVariable, true) * -1.0f;
        this.f614a = solverVariable;
        if (a != 1.0f) {
            this.f615b /= a;
            this.f617d.mo455a(a);
        }
    }

    /* renamed from: d */
    public void mo486d(SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.f596d != 1) {
            if (solverVariable.f596d == 2) {
                f = 1000.0f;
            } else if (solverVariable.f596d == 3) {
                f = 1000000.0f;
            } else if (solverVariable.f596d == 4) {
                f = 1.0E9f;
            } else if (solverVariable.f596d == 5) {
                f = 1.0E12f;
            }
        }
        this.f617d.mo456a(solverVariable, f);
    }

    /* renamed from: a */
    public final SolverVariable mo465a(C0185e eVar, boolean[] zArr) {
        return this.f617d.mo453a(zArr, (SolverVariable) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C0182b mo483c(SolverVariable solverVariable, int i) {
        this.f617d.mo456a(solverVariable, (float) i);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0182b mo467a(SolverVariable solverVariable, int i) {
        this.f614a = solverVariable;
        float f = (float) i;
        solverVariable.f597e = f;
        this.f615b = f;
        this.f618e = true;
        return this;
    }

    /* renamed from: b */
    public final C0182b mo479b(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f615b = (float) (i * -1);
            this.f617d.mo456a(solverVariable, 1.0f);
        } else {
            this.f615b = (float) i;
            this.f617d.mo456a(solverVariable, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public final C0182b mo473a(C0185e eVar, int i) {
        this.f617d.mo456a(eVar.mo491a(i, "ep"), 1.0f);
        this.f617d.mo456a(eVar.mo491a(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: a */
    public final C0182b mo468a(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f615b = (float) i;
        }
        if (!z) {
            this.f617d.mo456a(solverVariable, -1.0f);
            this.f617d.mo456a(solverVariable2, 1.0f);
        } else {
            this.f617d.mo456a(solverVariable, 1.0f);
            this.f617d.mo456a(solverVariable2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0182b mo470a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.f617d.mo456a(solverVariable, -1.0f);
        this.f617d.mo456a(solverVariable2, 1.0f - f);
        this.f617d.mo456a(solverVariable3, f);
        return this;
    }

    /* renamed from: b */
    public final C0182b mo480b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f615b = (float) i;
        }
        if (!z) {
            this.f617d.mo456a(solverVariable, -1.0f);
            this.f617d.mo456a(solverVariable2, 1.0f);
            this.f617d.mo456a(solverVariable3, -1.0f);
        } else {
            this.f617d.mo456a(solverVariable, 1.0f);
            this.f617d.mo456a(solverVariable2, -1.0f);
            this.f617d.mo456a(solverVariable3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public final C0182b mo471a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f615b = (float) i;
        }
        if (!z) {
            this.f617d.mo456a(solverVariable, -1.0f);
            this.f617d.mo456a(solverVariable2, 1.0f);
            this.f617d.mo456a(solverVariable3, 1.0f);
        } else {
            this.f617d.mo456a(solverVariable, 1.0f);
            this.f617d.mo456a(solverVariable2, -1.0f);
            this.f617d.mo456a(solverVariable3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0182b mo481b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f617d.mo456a(solverVariable3, 0.5f);
        this.f617d.mo456a(solverVariable4, 0.5f);
        this.f617d.mo456a(solverVariable, -0.5f);
        this.f617d.mo456a(solverVariable2, -0.5f);
        this.f615b = -f;
        return this;
    }

    /* renamed from: a */
    public final C0182b mo472a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f617d.mo456a(solverVariable, -1.0f);
        this.f617d.mo456a(solverVariable2, 1.0f);
        this.f617d.mo456a(solverVariable3, f);
        this.f617d.mo456a(solverVariable4, -f);
        return this;
    }

    /* renamed from: a */
    public final C0182b mo466a(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f615b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f617d.mo456a(solverVariable, 1.0f);
            this.f617d.mo456a(solverVariable2, -1.0f);
            this.f617d.mo456a(solverVariable4, 1.0f);
            this.f617d.mo456a(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.f617d.mo456a(solverVariable, 1.0f);
            this.f617d.mo456a(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f617d.mo456a(solverVariable3, 1.0f);
            this.f617d.mo456a(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f617d.mo456a(solverVariable, 1.0f);
            this.f617d.mo456a(solverVariable2, -1.0f);
            this.f617d.mo456a(solverVariable4, f4);
            this.f617d.mo456a(solverVariable3, -f4);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0182b mo469a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f617d.mo456a(solverVariable, 1.0f);
            this.f617d.mo456a(solverVariable4, 1.0f);
            this.f617d.mo456a(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f617d.mo456a(solverVariable, 1.0f);
            this.f617d.mo456a(solverVariable2, -1.0f);
            this.f617d.mo456a(solverVariable3, -1.0f);
            this.f617d.mo456a(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f615b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f617d.mo456a(solverVariable, -1.0f);
            this.f617d.mo456a(solverVariable2, 1.0f);
            this.f615b = (float) i;
        } else if (f >= 1.0f) {
            this.f617d.mo456a(solverVariable3, -1.0f);
            this.f617d.mo456a(solverVariable4, 1.0f);
            this.f615b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f617d.mo456a(solverVariable, f2 * 1.0f);
            this.f617d.mo456a(solverVariable2, f2 * -1.0f);
            this.f617d.mo456a(solverVariable3, -1.0f * f);
            this.f617d.mo456a(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f615b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }
}
