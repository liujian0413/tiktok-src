package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0185e;
import android.support.constraint.solver.C0187f;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;

/* renamed from: android.support.constraint.solver.widgets.i */
public final class C0202i extends C0204k {

    /* renamed from: a */
    ConstraintAnchor f800a;

    /* renamed from: b */
    float f801b;

    /* renamed from: c */
    C0202i f802c;

    /* renamed from: d */
    float f803d;

    /* renamed from: e */
    C0202i f804e;

    /* renamed from: f */
    public float f805f;

    /* renamed from: g */
    public int f806g;

    /* renamed from: j */
    private C0202i f807j;

    /* renamed from: k */
    private float f808k;

    /* renamed from: l */
    private C0203j f809l;

    /* renamed from: m */
    private int f810m = 1;

    /* renamed from: n */
    private C0203j f811n;

    /* renamed from: o */
    private int f812o = 1;

    /* renamed from: a */
    private static String m723a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: b */
    public final void mo589b() {
        super.mo589b();
        this.f802c = null;
        this.f803d = 0.0f;
        this.f809l = null;
        this.f810m = 1;
        this.f811n = null;
        this.f812o = 1;
        this.f804e = null;
        this.f805f = 0.0f;
        this.f801b = 0.0f;
        this.f807j = null;
        this.f808k = 0.0f;
        this.f806g = 0;
    }

    /* renamed from: c */
    public final void mo592c() {
        ConstraintAnchor constraintAnchor = this.f800a.f675d;
        if (constraintAnchor != null) {
            if (constraintAnchor.f675d == this.f800a) {
                this.f806g = 4;
                constraintAnchor.f672a.f806g = 4;
            }
            int a = this.f800a.mo510a();
            if (this.f800a.f674c == Type.RIGHT || this.f800a.f674c == Type.BOTTOM) {
                a = -a;
            }
            mo587a(constraintAnchor.f672a, a);
        }
    }

    public final String toString() {
        if (this.f815i != 1) {
            StringBuilder sb = new StringBuilder("{ ");
            sb.append(this.f800a);
            sb.append(" UNRESOLVED} type: ");
            sb.append(m723a(this.f806g));
            return sb.toString();
        } else if (this.f804e == this) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f800a);
            sb2.append(", RESOLVED: ");
            sb2.append(this.f805f);
            sb2.append("]  type: ");
            sb2.append(m723a(this.f806g));
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(this.f800a);
            sb3.append(", RESOLVED: ");
            sb3.append(this.f804e);
            sb3.append(":");
            sb3.append(this.f805f);
            sb3.append("] type: ");
            sb3.append(m723a(this.f806g));
            return sb3.toString();
        }
    }

    /* renamed from: a */
    public final void mo583a() {
        float f;
        float f2;
        float f3;
        boolean z = true;
        if (this.f815i != 1 && this.f806g != 4) {
            if (this.f809l != null) {
                if (this.f809l.f815i == 1) {
                    this.f803d = ((float) this.f810m) * this.f809l.f813a;
                } else {
                    return;
                }
            }
            if (this.f811n != null) {
                if (this.f811n.f815i == 1) {
                    this.f808k = ((float) this.f812o) * this.f811n.f813a;
                } else {
                    return;
                }
            }
            if (this.f806g == 1 && (this.f802c == null || this.f802c.f815i == 1)) {
                if (this.f802c == null) {
                    this.f804e = this;
                    this.f805f = this.f803d;
                } else {
                    this.f804e = this.f802c.f804e;
                    this.f805f = this.f802c.f805f + this.f803d;
                }
                mo598e();
            } else if (this.f806g == 2 && this.f802c != null && this.f802c.f815i == 1 && this.f807j != null && this.f807j.f802c != null && this.f807j.f802c.f815i == 1) {
                if (C0185e.m578a() != null) {
                    C0187f a = C0185e.m578a();
                    a.f666w++;
                }
                this.f804e = this.f802c.f804e;
                this.f807j.f804e = this.f807j.f802c.f804e;
                int i = 0;
                if (!(this.f800a.f674c == Type.RIGHT || this.f800a.f674c == Type.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f = this.f802c.f805f - this.f807j.f802c.f805f;
                } else {
                    f = this.f807j.f802c.f805f - this.f802c.f805f;
                }
                if (this.f800a.f674c == Type.LEFT || this.f800a.f674c == Type.RIGHT) {
                    f3 = f - ((float) this.f800a.f673b.mo556j());
                    f2 = this.f800a.f673b.f707X;
                } else {
                    f3 = f - ((float) this.f800a.f673b.mo557k());
                    f2 = this.f800a.f673b.f708Y;
                }
                int a2 = this.f800a.mo510a();
                int a3 = this.f807j.f800a.mo510a();
                if (this.f800a.f675d == this.f807j.f800a.f675d) {
                    f2 = 0.5f;
                    a3 = 0;
                } else {
                    i = a2;
                }
                float f4 = (float) i;
                float f5 = (float) a3;
                float f6 = (f3 - f4) - f5;
                if (z) {
                    this.f807j.f805f = this.f807j.f802c.f805f + f5 + (f6 * f2);
                    this.f805f = (this.f802c.f805f - f4) - (f6 * (1.0f - f2));
                } else {
                    this.f805f = this.f802c.f805f + f4 + (f6 * f2);
                    this.f807j.f805f = (this.f807j.f802c.f805f - f5) - (f6 * (1.0f - f2));
                }
                mo598e();
                this.f807j.mo598e();
            } else if (this.f806g != 3 || this.f802c == null || this.f802c.f815i != 1 || this.f807j == null || this.f807j.f802c == null || this.f807j.f802c.f815i != 1) {
                if (this.f806g == 5) {
                    this.f800a.f673b.mo541c();
                }
            } else {
                if (C0185e.m578a() != null) {
                    C0187f a4 = C0185e.m578a();
                    a4.f667x++;
                }
                this.f804e = this.f802c.f804e;
                this.f807j.f804e = this.f807j.f802c.f804e;
                this.f805f = this.f802c.f805f + this.f803d;
                this.f807j.f805f = this.f807j.f802c.f805f + this.f807j.f803d;
                mo598e();
                this.f807j.mo598e();
            }
        }
    }

    public C0202i(ConstraintAnchor constraintAnchor) {
        this.f800a = constraintAnchor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo585a(C0185e eVar) {
        SolverVariable solverVariable = this.f800a.f681j;
        if (this.f804e == null) {
            eVar.mo493a(solverVariable, (int) this.f805f);
        } else {
            eVar.mo504c(solverVariable, eVar.mo492a((Object) this.f804e.f800a), (int) this.f805f, 6);
        }
    }

    /* renamed from: b */
    public final void mo590b(C0202i iVar, float f) {
        this.f807j = iVar;
        this.f808k = f;
    }

    /* renamed from: a */
    public final void mo586a(C0202i iVar, float f) {
        if (this.f815i == 0 || !(this.f804e == iVar || this.f805f == f)) {
            this.f804e = iVar;
            this.f805f = f;
            if (this.f815i == 1) {
                mo597d();
            }
            mo598e();
        }
    }

    /* renamed from: a */
    public final void mo587a(C0202i iVar, int i) {
        this.f802c = iVar;
        this.f803d = (float) i;
        this.f802c.mo596a(this);
    }

    /* renamed from: a */
    public final void mo584a(int i, C0202i iVar, int i2) {
        this.f806g = 1;
        this.f802c = iVar;
        this.f803d = (float) i2;
        this.f802c.mo596a(this);
    }

    /* renamed from: b */
    public final void mo591b(C0202i iVar, int i, C0203j jVar) {
        this.f807j = iVar;
        this.f811n = jVar;
        this.f812o = i;
    }

    /* renamed from: a */
    public final void mo588a(C0202i iVar, int i, C0203j jVar) {
        this.f802c = iVar;
        this.f802c.mo596a(this);
        this.f809l = jVar;
        this.f810m = i;
        this.f809l.mo596a(this);
    }
}
