package com.swmansion.gesturehandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: com.swmansion.gesturehandler.j */
public class C46357j extends C46347b<C46357j> {

    /* renamed from: p */
    private static float f119334p = Float.MAX_VALUE;

    /* renamed from: q */
    private static float f119335q = Float.MIN_VALUE;

    /* renamed from: r */
    private static int f119336r = 1;

    /* renamed from: s */
    private static int f119337s = 10;

    /* renamed from: A */
    private float f119338A = f119335q;

    /* renamed from: B */
    private float f119339B = f119334p;

    /* renamed from: C */
    private float f119340C = f119334p;

    /* renamed from: D */
    private float f119341D = f119334p;

    /* renamed from: E */
    private float f119342E = f119334p;

    /* renamed from: F */
    private int f119343F = f119336r;

    /* renamed from: G */
    private int f119344G = f119337s;

    /* renamed from: H */
    private float f119345H;

    /* renamed from: I */
    private float f119346I;

    /* renamed from: J */
    private float f119347J;

    /* renamed from: K */
    private float f119348K;

    /* renamed from: L */
    private float f119349L;

    /* renamed from: M */
    private float f119350M;

    /* renamed from: N */
    private VelocityTracker f119351N;

    /* renamed from: O */
    private boolean f119352O;

    /* renamed from: a */
    public float f119353a;

    /* renamed from: b */
    public float f119354b;

    /* renamed from: t */
    private float f119355t = f119335q;

    /* renamed from: u */
    private float f119356u = f119334p;

    /* renamed from: v */
    private float f119357v = f119335q;

    /* renamed from: w */
    private float f119358w = f119335q;

    /* renamed from: x */
    private float f119359x = f119334p;

    /* renamed from: y */
    private float f119360y = f119334p;

    /* renamed from: z */
    private float f119361z = f119335q;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo115190b() {
        if (this.f119351N != null) {
            this.f119351N.recycle();
            this.f119351N = null;
        }
    }

    /* renamed from: l */
    public final float mo115245l() {
        return (this.f119349L - this.f119345H) + this.f119347J;
    }

    /* renamed from: m */
    public final float mo115247m() {
        return (this.f119350M - this.f119346I) + this.f119348K;
    }

    /* renamed from: o */
    private boolean m145572o() {
        float f = (this.f119349L - this.f119345H) + this.f119347J;
        if (this.f119358w != f119335q && f < this.f119358w) {
            return true;
        }
        if (this.f119359x != f119334p && f > this.f119359x) {
            return true;
        }
        float f2 = (this.f119350M - this.f119346I) + this.f119348K;
        if (this.f119338A != f119335q && f2 < this.f119338A) {
            return true;
        }
        if (this.f119339B == f119334p || f2 <= this.f119339B) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m145571n() {
        float f = (this.f119349L - this.f119345H) + this.f119347J;
        if (this.f119356u != f119334p && f < this.f119356u) {
            return true;
        }
        if (this.f119357v != f119335q && f > this.f119357v) {
            return true;
        }
        float f2 = (this.f119350M - this.f119346I) + this.f119348K;
        if (this.f119360y != f119334p && f2 < this.f119360y) {
            return true;
        }
        if (this.f119361z != f119335q && f2 > this.f119361z) {
            return true;
        }
        float f3 = (f * f) + (f2 * f2);
        if (this.f119355t != f119334p && f3 >= this.f119355t) {
            return true;
        }
        float f4 = this.f119353a;
        if (this.f119340C != f119334p && ((this.f119340C < 0.0f && f4 <= this.f119340C) || (this.f119340C >= 0.0f && f4 >= this.f119340C))) {
            return true;
        }
        float f5 = this.f119354b;
        if (this.f119341D != f119334p && ((this.f119341D < 0.0f && f4 <= this.f119341D) || (this.f119341D >= 0.0f && f4 >= this.f119341D))) {
            return true;
        }
        float f6 = (f4 * f4) + (f5 * f5);
        if (this.f119342E == f119334p || f6 < this.f119342E) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C46357j mo115226a(float f) {
        this.f119356u = f;
        return this;
    }

    /* renamed from: b */
    public final C46357j mo115232b(float f) {
        this.f119357v = f;
        return this;
    }

    /* renamed from: c */
    public final C46357j mo115233c(float f) {
        this.f119358w = f;
        return this;
    }

    /* renamed from: d */
    public final C46357j mo115236d(float f) {
        this.f119359x = f;
        return this;
    }

    /* renamed from: e */
    public final C46357j mo115238e(float f) {
        this.f119360y = f;
        return this;
    }

    /* renamed from: f */
    public final C46357j mo115239f(float f) {
        this.f119361z = f;
        return this;
    }

    /* renamed from: g */
    public final C46357j mo115240g(float f) {
        this.f119338A = f;
        return this;
    }

    /* renamed from: h */
    public final C46357j mo115241h(float f) {
        this.f119339B = f;
        return this;
    }

    /* renamed from: k */
    public final C46357j mo115244k(float f) {
        this.f119340C = f;
        return this;
    }

    /* renamed from: l */
    public final C46357j mo115246l(float f) {
        this.f119341D = f;
        return this;
    }

    /* renamed from: c */
    public final C46357j mo115234c(int i) {
        this.f119343F = i;
        return this;
    }

    /* renamed from: d */
    public final C46357j mo115237d(int i) {
        this.f119344G = i;
        return this;
    }

    /* renamed from: i */
    public final C46357j mo115242i(float f) {
        this.f119355t = f * f;
        return this;
    }

    /* renamed from: j */
    public final C46357j mo115243j(float f) {
        this.f119342E = f * f;
        return this;
    }

    /* renamed from: c */
    public final C46357j mo115235c(boolean z) {
        this.f119352O = z;
        return this;
    }

    public C46357j(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f119355t = (float) (scaledTouchSlop * scaledTouchSlop);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115189a(MotionEvent motionEvent) {
        int i = this.f119286e;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6 || actionMasked == 5) {
            this.f119347J += this.f119349L - this.f119345H;
            this.f119348K += this.f119350M - this.f119346I;
            this.f119349L = C46352f.m145555a(motionEvent, this.f119352O);
            this.f119350M = C46352f.m145556b(motionEvent, this.f119352O);
            this.f119345H = this.f119349L;
            this.f119346I = this.f119350M;
        } else {
            this.f119349L = C46352f.m145555a(motionEvent, this.f119352O);
            this.f119350M = C46352f.m145556b(motionEvent, this.f119352O);
        }
        if (i == 0 && motionEvent.getPointerCount() >= this.f119343F) {
            this.f119345H = this.f119349L;
            this.f119346I = this.f119350M;
            this.f119347J = 0.0f;
            this.f119348K = 0.0f;
            this.f119351N = VelocityTracker.obtain();
            m145570a(this.f119351N, motionEvent);
            mo115214g();
        } else if (this.f119351N != null) {
            m145570a(this.f119351N, motionEvent);
            this.f119351N.computeCurrentVelocity(1000);
            this.f119353a = this.f119351N.getXVelocity();
            this.f119354b = this.f119351N.getYVelocity();
        }
        if (actionMasked == 1) {
            if (i == 4) {
                mo115215h();
            } else {
                mo115211e();
            }
        } else if (actionMasked != 5 || motionEvent.getPointerCount() <= this.f119344G) {
            if (actionMasked == 6 && i == 4 && motionEvent.getPointerCount() < this.f119343F) {
                mo115211e();
                return;
            }
            if (i == 2) {
                if (m145572o()) {
                    mo115211e();
                } else if (m145571n()) {
                    this.f119345H = this.f119349L;
                    this.f119346I = this.f119350M;
                    mo115213f();
                }
            }
        } else if (i == 4) {
            mo115209d();
        } else {
            mo115211e();
        }
    }

    /* renamed from: a */
    private static void m145570a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }
}
