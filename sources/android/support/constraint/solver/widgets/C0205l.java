package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.l */
public final class C0205l {

    /* renamed from: a */
    private int f816a;

    /* renamed from: b */
    private int f817b;

    /* renamed from: c */
    private int f818c;

    /* renamed from: d */
    private int f819d;

    /* renamed from: e */
    private ArrayList<C0206a> f820e = new ArrayList<>();

    /* renamed from: android.support.constraint.solver.widgets.l$a */
    static class C0206a {

        /* renamed from: a */
        private ConstraintAnchor f821a;

        /* renamed from: b */
        private ConstraintAnchor f822b;

        /* renamed from: c */
        private int f823c;

        /* renamed from: d */
        private Strength f824d;

        /* renamed from: e */
        private int f825e;

        public C0206a(ConstraintAnchor constraintAnchor) {
            this.f821a = constraintAnchor;
            this.f822b = constraintAnchor.f675d;
            this.f823c = constraintAnchor.mo510a();
            this.f824d = constraintAnchor.f678g;
            this.f825e = constraintAnchor.f680i;
        }

        /* renamed from: b */
        public final void mo603b(ConstraintWidget constraintWidget) {
            constraintWidget.mo521a(this.f821a.f674c).mo515a(this.f822b, this.f823c, this.f824d, this.f825e);
        }

        /* renamed from: a */
        public final void mo602a(ConstraintWidget constraintWidget) {
            this.f821a = constraintWidget.mo521a(this.f821a.f674c);
            if (this.f821a != null) {
                this.f822b = this.f821a.f675d;
                this.f823c = this.f821a.mo510a();
                this.f824d = this.f821a.f678g;
                this.f825e = this.f821a.f680i;
                return;
            }
            this.f822b = null;
            this.f823c = 0;
            this.f824d = Strength.STRONG;
            this.f825e = 0;
        }
    }

    public C0205l(ConstraintWidget constraintWidget) {
        this.f816a = constraintWidget.f694J;
        this.f817b = constraintWidget.f695K;
        this.f818c = constraintWidget.mo556j();
        this.f819d = constraintWidget.mo557k();
        ArrayList s = constraintWidget.mo565s();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            this.f820e.add(new C0206a((ConstraintAnchor) s.get(i)));
        }
    }

    /* renamed from: a */
    public final void mo600a(ConstraintWidget constraintWidget) {
        this.f816a = constraintWidget.f694J;
        this.f817b = constraintWidget.f695K;
        this.f818c = constraintWidget.mo556j();
        this.f819d = constraintWidget.mo557k();
        int size = this.f820e.size();
        for (int i = 0; i < size; i++) {
            ((C0206a) this.f820e.get(i)).mo602a(constraintWidget);
        }
    }

    /* renamed from: b */
    public final void mo601b(ConstraintWidget constraintWidget) {
        constraintWidget.f694J = this.f816a;
        constraintWidget.f695K = this.f817b;
        constraintWidget.mo545d(this.f818c);
        constraintWidget.mo548e(this.f819d);
        int size = this.f820e.size();
        for (int i = 0; i < size; i++) {
            ((C0206a) this.f820e.get(i)).mo603b(constraintWidget);
        }
    }
}
