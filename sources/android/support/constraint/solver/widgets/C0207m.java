package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0183c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.m */
public class C0207m extends ConstraintWidget {

    /* renamed from: aB */
    public ArrayList<ConstraintWidget> f826aB = new ArrayList<>();

    /* renamed from: B */
    public final void mo605B() {
        this.f826aB.clear();
    }

    /* renamed from: f */
    public void mo550f() {
        this.f826aB.clear();
        super.mo550f();
    }

    /* renamed from: A */
    public final C0196d mo604A() {
        ConstraintWidget constraintWidget = this.f689E;
        C0196d dVar = (C0196d) this;
        while (constraintWidget != null) {
            ConstraintWidget constraintWidget2 = constraintWidget.f689E;
            if (constraintWidget instanceof C0196d) {
                dVar = (C0196d) constraintWidget;
            }
            constraintWidget = constraintWidget2;
        }
        return dVar;
    }

    /* renamed from: t */
    public final void mo566t() {
        super.mo566t();
        if (this.f826aB != null) {
            int size = this.f826aB.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.f826aB.get(i);
                constraintWidget.mo537b(mo558l(), mo559m());
                if (!(constraintWidget instanceof C0196d)) {
                    constraintWidget.mo566t();
                }
            }
        }
    }

    /* renamed from: x */
    public void mo575x() {
        mo566t();
        if (this.f826aB != null) {
            int size = this.f826aB.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.f826aB.get(i);
                if (constraintWidget instanceof C0207m) {
                    ((C0207m) constraintWidget).mo575x();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo607b(ConstraintWidget constraintWidget) {
        this.f826aB.remove(constraintWidget);
        constraintWidget.f689E = null;
    }

    /* renamed from: a */
    public final void mo526a(C0183c cVar) {
        super.mo526a(cVar);
        int size = this.f826aB.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.f826aB.get(i)).mo526a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo606a(ConstraintWidget constraintWidget) {
        this.f826aB.add(constraintWidget);
        if (constraintWidget.f689E != null) {
            ((C0207m) constraintWidget.f689E).mo607b(constraintWidget);
        }
        constraintWidget.f689E = this;
    }

    /* renamed from: b */
    public final void mo537b(int i, int i2) {
        super.mo537b(i, i2);
        int size = this.f826aB.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ConstraintWidget) this.f826aB.get(i3)).mo537b(mo560n(), mo561o());
        }
    }
}
