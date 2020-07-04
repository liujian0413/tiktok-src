package android.support.p022v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p022v4.view.C0991u;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: android.support.v4.widget.a */
public abstract class C1033a implements OnTouchListener {

    /* renamed from: r */
    private static final int f3575r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C1034a f3576a = new C1034a();

    /* renamed from: b */
    final View f3577b;

    /* renamed from: c */
    boolean f3578c;

    /* renamed from: d */
    boolean f3579d;

    /* renamed from: e */
    boolean f3580e;

    /* renamed from: f */
    public boolean f3581f;

    /* renamed from: g */
    public boolean f3582g;

    /* renamed from: h */
    private final Interpolator f3583h = new AccelerateInterpolator();

    /* renamed from: i */
    private Runnable f3584i;

    /* renamed from: j */
    private float[] f3585j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f3586k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private int f3587l;

    /* renamed from: m */
    private int f3588m;

    /* renamed from: n */
    private float[] f3589n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f3590o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f3591p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    private boolean f3592q;

    /* renamed from: android.support.v4.widget.a$a */
    static class C1034a {

        /* renamed from: a */
        public int f3593a;

        /* renamed from: b */
        public int f3594b;

        /* renamed from: c */
        public int f3595c;

        /* renamed from: d */
        public int f3596d;

        /* renamed from: e */
        private float f3597e;

        /* renamed from: f */
        private float f3598f;

        /* renamed from: g */
        private long f3599g = Long.MIN_VALUE;

        /* renamed from: h */
        private long f3600h;

        /* renamed from: i */
        private long f3601i = -1;

        /* renamed from: j */
        private float f3602j;

        /* renamed from: k */
        private int f3603k;

        /* renamed from: a */
        private static float m4462a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        C1034a() {
        }

        /* renamed from: e */
        public final int mo4077e() {
            return (int) (this.f3597e / Math.abs(this.f3597e));
        }

        /* renamed from: f */
        public final int mo4078f() {
            return (int) (this.f3598f / Math.abs(this.f3598f));
        }

        /* renamed from: a */
        public final void mo4072a() {
            this.f3599g = AnimationUtils.currentAnimationTimeMillis();
            this.f3601i = -1;
            this.f3600h = this.f3599g;
            this.f3602j = 0.5f;
            this.f3595c = 0;
            this.f3596d = 0;
        }

        /* renamed from: b */
        public final void mo4074b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3603k = C1033a.m4444a((int) (currentAnimationTimeMillis - this.f3599g), 0, this.f3594b);
            this.f3602j = m4463a(currentAnimationTimeMillis);
            this.f3601i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public final boolean mo4075c() {
            if (this.f3601i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.f3601i + ((long) this.f3603k)) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final void mo4076d() {
            if (this.f3600h != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m4462a(m4463a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f3600h;
                this.f3600h = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f3595c = (int) (this.f3597e * f);
                this.f3596d = (int) (f * this.f3598f);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        private float m4463a(long j) {
            if (j < this.f3599g) {
                return 0.0f;
            }
            if (this.f3601i < 0 || j < this.f3601i) {
                return C1033a.m4441a(((float) (j - this.f3599g)) / ((float) this.f3593a), 0.0f, 1.0f) * 0.5f;
            }
            return (1.0f - this.f3602j) + (this.f3602j * C1033a.m4441a(((float) (j - this.f3601i)) / ((float) this.f3603k), 0.0f, 1.0f));
        }

        /* renamed from: a */
        public final void mo4073a(float f, float f2) {
            this.f3597e = f;
            this.f3598f = f2;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    class C1035b implements Runnable {
        public final void run() {
            if (C1033a.this.f3580e) {
                if (C1033a.this.f3578c) {
                    C1033a.this.f3578c = false;
                    C1033a.this.f3576a.mo4072a();
                }
                C1034a aVar = C1033a.this.f3576a;
                if (aVar.mo4075c() || !C1033a.this.mo4069a()) {
                    C1033a.this.f3580e = false;
                    return;
                }
                if (C1033a.this.f3579d) {
                    C1033a.this.f3579d = false;
                    C1033a.this.mo4070b();
                }
                aVar.mo4076d();
                C1033a.this.mo3922a(aVar.f3595c, aVar.f3596d);
                C0991u.m4190a(C1033a.this.f3577b, (Runnable) this);
            }
        }

        C1035b() {
        }
    }

    /* renamed from: a */
    static float m4441a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m4444a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public abstract void mo3922a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo3923a(int i);

    /* renamed from: d */
    private void m4453d() {
        if (this.f3578c) {
            this.f3580e = false;
        } else {
            this.f3576a.mo4074b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4070b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3577b.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: c */
    private void m4450c() {
        if (this.f3584i == null) {
            this.f3584i = new C1035b();
        }
        this.f3580e = true;
        this.f3578c = true;
        if (this.f3592q || this.f3588m <= 0) {
            this.f3584i.run();
        } else {
            C0991u.m4191a(this.f3577b, this.f3584i, (long) this.f3588m);
        }
        this.f3592q = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4069a() {
        C1034a aVar = this.f3576a;
        int f = aVar.mo4078f();
        int e = aVar.mo4077e();
        if (f == 0 || !mo3923a(f)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private C1033a m4447b(int i) {
        this.f3587l = 1;
        return this;
    }

    /* renamed from: c */
    private C1033a m4449c(int i) {
        this.f3588m = i;
        return this;
    }

    /* renamed from: d */
    private C1033a m4452d(int i) {
        this.f3576a.f3593a = VETransitionFilterParam.TransitionDuration_DEFAULT;
        return this;
    }

    /* renamed from: e */
    private C1033a m4455e(int i) {
        this.f3576a.f3594b = VETransitionFilterParam.TransitionDuration_DEFAULT;
        return this;
    }

    public C1033a(View view) {
        this.f3577b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = (float) i;
        m4445a(f, f);
        float f2 = (float) i2;
        m4446b(f2, f2);
        m4447b(1);
        m4454e(Float.MAX_VALUE, Float.MAX_VALUE);
        m4451d(0.2f, 0.2f);
        m4448c(1.0f, 1.0f);
        m4449c(f3575r);
        m4452d(VETransitionFilterParam.TransitionDuration_DEFAULT);
        m4455e(VETransitionFilterParam.TransitionDuration_DEFAULT);
    }

    /* renamed from: a */
    public final C1033a mo4068a(boolean z) {
        if (this.f3581f && !z) {
            m4453d();
        }
        this.f3581f = z;
        return this;
    }

    /* renamed from: b */
    private C1033a m4446b(float f, float f2) {
        this.f3590o[0] = f / 1000.0f;
        this.f3590o[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    private C1033a m4448c(float f, float f2) {
        this.f3589n[0] = 0.001f;
        this.f3589n[1] = 0.001f;
        return this;
    }

    /* renamed from: d */
    private C1033a m4451d(float f, float f2) {
        this.f3585j[0] = 0.2f;
        this.f3585j[1] = 0.2f;
        return this;
    }

    /* renamed from: e */
    private C1033a m4454e(float f, float f2) {
        this.f3586k[0] = Float.MAX_VALUE;
        this.f3586k[1] = Float.MAX_VALUE;
        return this;
    }

    /* renamed from: a */
    private C1033a m4445a(float f, float f2) {
        this.f3591p[0] = f / 1000.0f;
        this.f3591p[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: f */
    private float m4456f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f3587l) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (!this.f3580e || this.f3587l != 1) {
                        return 0.0f;
                    }
                    return 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
        }
        return 0.0f;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f3581f) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f3579d = true;
                this.f3592q = false;
                break;
            case 1:
            case 3:
                m4453d();
                break;
            case 2:
                break;
        }
        this.f3576a.mo4073a(m4443a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f3577b.getWidth()), m4443a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f3577b.getHeight()));
        if (!this.f3580e && mo4069a()) {
            m4450c();
        }
        if (!this.f3582g || !this.f3580e) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private float m4442a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m4441a(f * f2, 0.0f, f3);
        float f6 = m4456f(f2 - f4, a) - m4456f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f3583h.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f3583h.getInterpolation(f6);
        }
        return m4441a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m4443a(int i, float f, float f2, float f3) {
        float a = m4442a(this.f3585j[i], f2, this.f3586k[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f3589n[i];
        float f5 = this.f3590o[i];
        float f6 = this.f3591p[i];
        float f7 = f4 * f3;
        if (a > 0.0f) {
            return m4441a(a * f7, f5, f6);
        }
        return -m4441a((-a) * f7, f5, f6);
    }
}
