package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0185e;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.e */
public final class C0197e extends ConstraintWidget {

    /* renamed from: a */
    public float f788a = -1.0f;

    /* renamed from: ap */
    public int f789ap = -1;

    /* renamed from: aq */
    public ConstraintAnchor f790aq = this.f745u;

    /* renamed from: ar */
    public int f791ar;

    /* renamed from: as */
    private boolean f792as;

    /* renamed from: at */
    private C0201h f793at = new C0201h();

    /* renamed from: au */
    private int f794au = 8;

    /* renamed from: b */
    public int f795b = -1;

    /* renamed from: a */
    public final boolean mo533a() {
        return true;
    }

    /* renamed from: s */
    public final ArrayList<ConstraintAnchor> mo565s() {
        return this.f687C;
    }

    public C0197e() {
        this.f687C.clear();
        this.f687C.add(this.f790aq);
        int length = this.f686B.length;
        for (int i = 0; i < length; i++) {
            this.f686B[i] = this.f790aq;
        }
    }

    /* renamed from: c */
    public final void mo578c(float f) {
        if (f > -1.0f) {
            this.f788a = f;
            this.f795b = -1;
            this.f789ap = -1;
        }
    }

    /* renamed from: i */
    public final void mo580i(int i) {
        if (i >= 0) {
            this.f788a = -1.0f;
            this.f795b = i;
            this.f789ap = -1;
        }
    }

    /* renamed from: j */
    public final void mo581j(int i) {
        if (i >= 0) {
            this.f788a = -1.0f;
            this.f795b = -1;
            this.f789ap = i;
        }
    }

    /* renamed from: a */
    public final ConstraintAnchor mo521a(Type type) {
        switch (type) {
            case LEFT:
            case RIGHT:
                if (this.f791ar == 1) {
                    return this.f790aq;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.f791ar == 0) {
                    return this.f790aq;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(type.name());
    }

    /* renamed from: c */
    public final void mo544c(C0185e eVar) {
        if (this.f689E != null) {
            int b = C0185e.m582b((Object) this.f790aq);
            if (this.f791ar == 1) {
                this.f694J = b;
                this.f695K = 0;
                mo548e(this.f689E.mo557k());
                mo545d(0);
                return;
            }
            this.f694J = 0;
            this.f695K = b;
            mo545d(this.f689E.mo556j());
            mo548e(0);
        }
    }

    /* renamed from: h */
    public final void mo579h(int i) {
        if (this.f791ar != i) {
            this.f791ar = i;
            this.f687C.clear();
            if (this.f791ar == 1) {
                this.f790aq = this.f744t;
            } else {
                this.f790aq = this.f745u;
            }
            this.f687C.add(this.f790aq);
            int length = this.f686B.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f686B[i2] = this.f790aq;
            }
        }
    }

    /* renamed from: a */
    public final void mo520a(C0185e eVar) {
        boolean z;
        C0196d dVar = (C0196d) this.f689E;
        if (dVar != null) {
            ConstraintAnchor a = dVar.mo521a(Type.LEFT);
            ConstraintAnchor a2 = dVar.mo521a(Type.RIGHT);
            if (this.f689E == null || this.f689E.f688D[0] != DimensionBehaviour.WRAP_CONTENT) {
                z = false;
            } else {
                z = true;
            }
            if (this.f791ar == 0) {
                a = dVar.mo521a(Type.TOP);
                a2 = dVar.mo521a(Type.BOTTOM);
                if (this.f689E == null || this.f689E.f688D[1] != DimensionBehaviour.WRAP_CONTENT) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (this.f795b != -1) {
                SolverVariable a3 = eVar.mo492a((Object) this.f790aq);
                eVar.mo504c(a3, eVar.mo492a((Object) a), this.f795b, 6);
                if (z) {
                    eVar.mo495a(eVar.mo492a((Object) a2), a3, 0, 5);
                }
            } else if (this.f789ap != -1) {
                SolverVariable a4 = eVar.mo492a((Object) this.f790aq);
                SolverVariable a5 = eVar.mo492a((Object) a2);
                eVar.mo504c(a4, a5, -this.f789ap, 6);
                if (z) {
                    eVar.mo495a(a4, eVar.mo492a((Object) a), 0, 5);
                    eVar.mo495a(a5, a4, 0, 5);
                }
            } else {
                if (this.f788a != -1.0f) {
                    eVar.mo498a(C0185e.m577a(eVar, eVar.mo492a((Object) this.f790aq), eVar.mo492a((Object) a), eVar.mo492a((Object) a2), this.f788a, this.f792as));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo523a(int i) {
        ConstraintWidget constraintWidget = this.f689E;
        if (constraintWidget != null) {
            if (this.f791ar == 1) {
                this.f745u.f672a.mo584a(1, constraintWidget.f745u.f672a, 0);
                this.f747w.f672a.mo584a(1, constraintWidget.f745u.f672a, 0);
                if (this.f795b != -1) {
                    this.f744t.f672a.mo584a(1, constraintWidget.f744t.f672a, this.f795b);
                    this.f746v.f672a.mo584a(1, constraintWidget.f744t.f672a, this.f795b);
                } else if (this.f789ap != -1) {
                    this.f744t.f672a.mo584a(1, constraintWidget.f746v.f672a, -this.f789ap);
                    this.f746v.f672a.mo584a(1, constraintWidget.f746v.f672a, -this.f789ap);
                } else if (this.f788a != -1.0f && constraintWidget.mo569v() == DimensionBehaviour.FIXED) {
                    int i2 = (int) (((float) constraintWidget.f690F) * this.f788a);
                    this.f744t.f672a.mo584a(1, constraintWidget.f744t.f672a, i2);
                    this.f746v.f672a.mo584a(1, constraintWidget.f744t.f672a, i2);
                }
            } else {
                this.f744t.f672a.mo584a(1, constraintWidget.f744t.f672a, 0);
                this.f746v.f672a.mo584a(1, constraintWidget.f744t.f672a, 0);
                if (this.f795b != -1) {
                    this.f745u.f672a.mo584a(1, constraintWidget.f745u.f672a, this.f795b);
                    this.f747w.f672a.mo584a(1, constraintWidget.f745u.f672a, this.f795b);
                } else if (this.f789ap != -1) {
                    this.f745u.f672a.mo584a(1, constraintWidget.f747w.f672a, -this.f789ap);
                    this.f747w.f672a.mo584a(1, constraintWidget.f747w.f672a, -this.f789ap);
                } else if (this.f788a != -1.0f && constraintWidget.mo570w() == DimensionBehaviour.FIXED) {
                    int i3 = (int) (((float) constraintWidget.f691G) * this.f788a);
                    this.f745u.f672a.mo584a(1, constraintWidget.f745u.f672a, i3);
                    this.f747w.f672a.mo584a(1, constraintWidget.f745u.f672a, i3);
                }
            }
        }
    }
}
