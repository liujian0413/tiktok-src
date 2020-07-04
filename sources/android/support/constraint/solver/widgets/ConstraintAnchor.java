package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0183c;
import android.support.constraint.solver.SolverVariable;

public final class ConstraintAnchor {

    /* renamed from: a */
    public C0202i f672a = new C0202i(this);

    /* renamed from: b */
    public final ConstraintWidget f673b;

    /* renamed from: c */
    public final Type f674c;

    /* renamed from: d */
    public ConstraintAnchor f675d;

    /* renamed from: e */
    public int f676e = 0;

    /* renamed from: f */
    int f677f = -1;

    /* renamed from: g */
    public Strength f678g = Strength.NONE;

    /* renamed from: h */
    public ConnectionType f679h = ConnectionType.RELAXED;

    /* renamed from: i */
    public int f680i = 0;

    /* renamed from: j */
    public SolverVariable f681j;

    public enum ConnectionType {
        RELAXED,
        STRICT
    }

    public enum Strength {
        NONE,
        STRONG,
        WEAK
    }

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: c */
    public final boolean mo517c() {
        if (this.f675d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo510a() {
        if (this.f673b.f712ab == 8) {
            return 0;
        }
        if (this.f677f < 0 || this.f675d == null || this.f675d.f673b.f712ab != 8) {
            return this.f676e;
        }
        return this.f677f;
    }

    /* renamed from: b */
    public final void mo516b() {
        this.f675d = null;
        this.f676e = 0;
        this.f677f = -1;
        this.f678g = Strength.STRONG;
        this.f680i = 0;
        this.f679h = ConnectionType.RELAXED;
        this.f672a.mo589b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f673b.f713ac);
        sb.append(":");
        sb.append(this.f674c.toString());
        return sb.toString();
    }

    /* renamed from: d */
    public final ConstraintAnchor mo518d() {
        switch (this.f674c) {
            case CENTER:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            case LEFT:
                return this.f673b.f746v;
            case RIGHT:
                return this.f673b.f744t;
            case TOP:
                return this.f673b.f747w;
            case BOTTOM:
                return this.f673b.f745u;
            default:
                throw new AssertionError(this.f674c.name());
        }
    }

    /* renamed from: a */
    public final void mo511a(C0183c cVar) {
        if (this.f681j == null) {
            this.f681j = new SolverVariable(android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED, null);
        } else {
            this.f681j.mo446b();
        }
    }

    /* renamed from: a */
    public final boolean mo512a(ConstraintAnchor constraintAnchor) {
        boolean z;
        boolean z2;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.f674c;
        if (type != this.f674c) {
            switch (this.f674c) {
                case CENTER:
                    if (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case LEFT:
                case RIGHT:
                    if (type == Type.LEFT || type == Type.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (constraintAnchor.f673b instanceof C0197e) {
                        if (z || type == Type.CENTER_X) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    return z;
                case TOP:
                case BOTTOM:
                    if (type == Type.TOP || type == Type.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (constraintAnchor.f673b instanceof C0197e) {
                        if (z2 || type == Type.CENTER_Y) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    return z2;
                case BASELINE:
                case CENTER_X:
                case CENTER_Y:
                case NONE:
                    return false;
                default:
                    throw new AssertionError(this.f674c.name());
            }
        } else if (this.f674c != Type.BASELINE || (constraintAnchor.f673b.mo564r() && this.f673b.mo564r())) {
            return true;
        } else {
            return false;
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f673b = constraintWidget;
        this.f674c = type;
    }

    /* renamed from: a */
    public final boolean mo513a(ConstraintAnchor constraintAnchor, int i, int i2) {
        return mo514a(constraintAnchor, 0, -1, Strength.STRONG, i2, false);
    }

    /* renamed from: a */
    public final boolean mo515a(ConstraintAnchor constraintAnchor, int i, Strength strength, int i2) {
        return mo514a(constraintAnchor, i, -1, strength, i2, false);
    }

    /* renamed from: a */
    public final boolean mo514a(ConstraintAnchor constraintAnchor, int i, int i2, Strength strength, int i3, boolean z) {
        if (constraintAnchor == null) {
            this.f675d = null;
            this.f676e = 0;
            this.f677f = -1;
            this.f678g = Strength.NONE;
            this.f680i = 2;
            return true;
        } else if (!z && !mo512a(constraintAnchor)) {
            return false;
        } else {
            this.f675d = constraintAnchor;
            if (i > 0) {
                this.f676e = i;
            } else {
                this.f676e = 0;
            }
            this.f677f = i2;
            this.f678g = strength;
            this.f680i = i3;
            return true;
        }
    }
}
