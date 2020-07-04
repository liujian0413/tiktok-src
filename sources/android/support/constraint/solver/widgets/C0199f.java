package android.support.constraint.solver.widgets;

import java.util.Arrays;

/* renamed from: android.support.constraint.solver.widgets.f */
public class C0199f extends ConstraintWidget {

    /* renamed from: ap */
    protected ConstraintWidget[] f797ap = new ConstraintWidget[4];

    /* renamed from: aq */
    protected int f798aq;

    /* renamed from: x */
    public final void mo575x() {
        this.f798aq = 0;
    }

    /* renamed from: a */
    public final void mo582a(ConstraintWidget constraintWidget) {
        if (this.f798aq + 1 > this.f797ap.length) {
            this.f797ap = (ConstraintWidget[]) Arrays.copyOf(this.f797ap, this.f797ap.length * 2);
        }
        this.f797ap[this.f798aq] = constraintWidget;
        this.f798aq++;
    }
}
