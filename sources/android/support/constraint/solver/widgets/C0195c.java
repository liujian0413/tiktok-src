package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.c */
public final class C0195c {

    /* renamed from: a */
    public ConstraintWidget f756a;

    /* renamed from: b */
    public ConstraintWidget f757b;

    /* renamed from: c */
    public ConstraintWidget f758c;

    /* renamed from: d */
    public ConstraintWidget f759d;

    /* renamed from: e */
    public ConstraintWidget f760e;

    /* renamed from: f */
    public ConstraintWidget f761f;

    /* renamed from: g */
    public ConstraintWidget f762g;

    /* renamed from: h */
    protected ArrayList<ConstraintWidget> f763h;

    /* renamed from: i */
    protected int f764i;

    /* renamed from: j */
    protected int f765j;

    /* renamed from: k */
    public float f766k;

    /* renamed from: l */
    protected boolean f767l;

    /* renamed from: m */
    protected boolean f768m;

    /* renamed from: n */
    protected boolean f769n;

    /* renamed from: o */
    private int f770o;

    /* renamed from: p */
    private boolean f771p;

    /* renamed from: q */
    private boolean f772q;

    /* renamed from: a */
    public final void mo571a() {
        if (!this.f772q) {
            m690b();
        }
        this.f772q = true;
    }

    /* renamed from: b */
    private void m690b() {
        int i = this.f770o * 2;
        boolean z = false;
        ConstraintWidget constraintWidget = this.f756a;
        boolean z2 = false;
        while (!z2) {
            this.f764i++;
            ConstraintWidget constraintWidget2 = null;
            constraintWidget.f723am[this.f770o] = null;
            constraintWidget.f722al[this.f770o] = null;
            if (constraintWidget.f712ab != 8) {
                if (this.f757b == null) {
                    this.f757b = constraintWidget;
                }
                if (this.f759d != null) {
                    this.f759d.f723am[this.f770o] = constraintWidget;
                }
                this.f759d = constraintWidget;
                if (constraintWidget.f688D[this.f770o] == DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.f733i[this.f770o] == 0 || constraintWidget.f733i[this.f770o] == 3 || constraintWidget.f733i[this.f770o] == 2)) {
                    this.f765j++;
                    float f = constraintWidget.f721ak[this.f770o];
                    if (f > 0.0f) {
                        this.f766k += constraintWidget.f721ak[this.f770o];
                    }
                    if (m689a(constraintWidget, this.f770o)) {
                        if (f < 0.0f) {
                            this.f767l = true;
                        } else {
                            this.f768m = true;
                        }
                        if (this.f763h == null) {
                            this.f763h = new ArrayList<>();
                        }
                        this.f763h.add(constraintWidget);
                    }
                    if (this.f761f == null) {
                        this.f761f = constraintWidget;
                    }
                    if (this.f762g != null) {
                        this.f762g.f722al[this.f770o] = constraintWidget;
                    }
                    this.f762g = constraintWidget;
                }
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f686B[i + 1].f675d;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget3 = constraintAnchor.f673b;
                if (constraintWidget3.f686B[i].f675d != null && constraintWidget3.f686B[i].f675d.f673b == constraintWidget) {
                    constraintWidget2 = constraintWidget3;
                }
            }
            if (constraintWidget2 != null) {
                constraintWidget = constraintWidget2;
            } else {
                z2 = true;
            }
        }
        this.f758c = constraintWidget;
        if (this.f770o != 0 || !this.f771p) {
            this.f760e = this.f756a;
        } else {
            this.f760e = this.f758c;
        }
        if (this.f768m && this.f767l) {
            z = true;
        }
        this.f769n = z;
    }

    /* renamed from: a */
    private static boolean m689a(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget.f712ab != 8 && constraintWidget.f688D[i] == DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.f733i[i] == 0 || constraintWidget.f733i[i] == 3)) {
            return true;
        }
        return false;
    }

    public C0195c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f756a = constraintWidget;
        this.f770o = i;
        this.f771p = z;
    }
}
