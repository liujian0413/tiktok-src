package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0185e;
import android.support.constraint.solver.C0187f;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.a */
public final class C0193a extends C0199f {

    /* renamed from: a */
    public int f753a;

    /* renamed from: ar */
    private ArrayList<C0202i> f754ar = new ArrayList<>(4);

    /* renamed from: b */
    public boolean f755b = true;

    /* renamed from: a */
    public final boolean mo533a() {
        return true;
    }

    /* renamed from: b */
    public final void mo534b() {
        super.mo534b();
        this.f754ar.clear();
    }

    /* renamed from: c */
    public final void mo541c() {
        C0202i iVar;
        float f = Float.MAX_VALUE;
        switch (this.f753a) {
            case 0:
                iVar = this.f744t.f672a;
                break;
            case 1:
                iVar = this.f746v.f672a;
                break;
            case 2:
                iVar = this.f745u.f672a;
                break;
            case 3:
                iVar = this.f747w.f672a;
                break;
            default:
                return;
        }
        f = 0.0f;
        int size = this.f754ar.size();
        C0202i iVar2 = null;
        int i = 0;
        while (i < size) {
            C0202i iVar3 = (C0202i) this.f754ar.get(i);
            if (iVar3.f815i == 1) {
                if (this.f753a == 0 || this.f753a == 2) {
                    if (iVar3.f805f < f) {
                        f = iVar3.f805f;
                        iVar2 = iVar3.f804e;
                    }
                } else if (iVar3.f805f > f) {
                    f = iVar3.f805f;
                    iVar2 = iVar3.f804e;
                }
                i++;
            } else {
                return;
            }
        }
        if (C0185e.m578a() != null) {
            C0187f a = C0185e.m578a();
            a.f669z++;
        }
        iVar.f804e = iVar2;
        iVar.f805f = f;
        iVar.mo598e();
        switch (this.f753a) {
            case 0:
                this.f746v.f672a.mo586a(iVar2, f);
                return;
            case 1:
                this.f744t.f672a.mo586a(iVar2, f);
                return;
            case 2:
                this.f747w.f672a.mo586a(iVar2, f);
                return;
            case 3:
                this.f745u.f672a.mo586a(iVar2, f);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo523a(int i) {
        C0202i iVar;
        C0202i iVar2;
        if (this.f689E != null && ((C0196d) this.f689E).mo574h(2)) {
            switch (this.f753a) {
                case 0:
                    iVar = this.f744t.f672a;
                    break;
                case 1:
                    iVar = this.f746v.f672a;
                    break;
                case 2:
                    iVar = this.f745u.f672a;
                    break;
                case 3:
                    iVar = this.f747w.f672a;
                    break;
                default:
                    return;
            }
            iVar.f806g = 5;
            if (this.f753a == 0 || this.f753a == 1) {
                this.f745u.f672a.mo586a((C0202i) null, 0.0f);
                this.f747w.f672a.mo586a((C0202i) null, 0.0f);
            } else {
                this.f744t.f672a.mo586a((C0202i) null, 0.0f);
                this.f746v.f672a.mo586a((C0202i) null, 0.0f);
            }
            this.f754ar.clear();
            for (int i2 = 0; i2 < this.f798aq; i2++) {
                ConstraintWidget constraintWidget = this.f797ap[i2];
                if (this.f755b || constraintWidget.mo533a()) {
                    switch (this.f753a) {
                        case 0:
                            iVar2 = constraintWidget.f744t.f672a;
                            break;
                        case 1:
                            iVar2 = constraintWidget.f746v.f672a;
                            break;
                        case 2:
                            iVar2 = constraintWidget.f745u.f672a;
                            break;
                        case 3:
                            iVar2 = constraintWidget.f747w.f672a;
                            break;
                        default:
                            iVar2 = null;
                            break;
                    }
                    if (iVar2 != null) {
                        this.f754ar.add(iVar2);
                        iVar2.mo596a(iVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo520a(C0185e eVar) {
        boolean z;
        this.f686B[0] = this.f744t;
        this.f686B[2] = this.f745u;
        this.f686B[1] = this.f746v;
        this.f686B[3] = this.f747w;
        for (int i = 0; i < this.f686B.length; i++) {
            this.f686B[i].f681j = eVar.mo492a((Object) this.f686B[i]);
        }
        if (this.f753a >= 0 && this.f753a < 4) {
            ConstraintAnchor constraintAnchor = this.f686B[this.f753a];
            int i2 = 0;
            while (true) {
                if (i2 >= this.f798aq) {
                    z = false;
                    break;
                }
                ConstraintWidget constraintWidget = this.f797ap[i2];
                if ((this.f755b || constraintWidget.mo533a()) && (((this.f753a == 0 || this.f753a == 1) && constraintWidget.mo569v() == DimensionBehaviour.MATCH_CONSTRAINT) || ((this.f753a == 2 || this.f753a == 3) && constraintWidget.mo570w() == DimensionBehaviour.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i2++;
                }
            }
            z = true;
            if (this.f753a == 0 || this.f753a == 1 ? this.f689E.mo569v() == DimensionBehaviour.WRAP_CONTENT : this.f689E.mo570w() == DimensionBehaviour.WRAP_CONTENT) {
                z = false;
            }
            for (int i3 = 0; i3 < this.f798aq; i3++) {
                ConstraintWidget constraintWidget2 = this.f797ap[i3];
                if (this.f755b || constraintWidget2.mo533a()) {
                    SolverVariable a = eVar.mo492a((Object) constraintWidget2.f686B[this.f753a]);
                    constraintWidget2.f686B[this.f753a].f681j = a;
                    if (this.f753a == 0 || this.f753a == 2) {
                        eVar.mo502b(constraintAnchor.f681j, a, z);
                    } else {
                        eVar.mo497a(constraintAnchor.f681j, a, z);
                    }
                }
            }
            if (this.f753a == 0) {
                eVar.mo504c(this.f746v.f681j, this.f744t.f681j, 0, 6);
                if (!z) {
                    eVar.mo504c(this.f744t.f681j, this.f689E.f746v.f681j, 0, 5);
                }
            } else if (this.f753a == 1) {
                eVar.mo504c(this.f744t.f681j, this.f746v.f681j, 0, 6);
                if (!z) {
                    eVar.mo504c(this.f744t.f681j, this.f689E.f744t.f681j, 0, 5);
                }
            } else if (this.f753a == 2) {
                eVar.mo504c(this.f747w.f681j, this.f745u.f681j, 0, 6);
                if (!z) {
                    eVar.mo504c(this.f745u.f681j, this.f689E.f747w.f681j, 0, 5);
                }
            } else if (this.f753a == 3) {
                eVar.mo504c(this.f745u.f681j, this.f747w.f681j, 0, 6);
                if (!z) {
                    eVar.mo504c(this.f745u.f681j, this.f689E.f745u.f681j, 0, 5);
                }
            }
        }
    }
}
