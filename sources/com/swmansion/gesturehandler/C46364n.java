package com.swmansion.gesturehandler;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: com.swmansion.gesturehandler.n */
public class C46364n extends C46347b<C46364n> {

    /* renamed from: a */
    private static float f119383a = Float.MIN_VALUE;

    /* renamed from: A */
    private float f119384A;

    /* renamed from: B */
    private float f119385B;

    /* renamed from: C */
    private Handler f119386C;

    /* renamed from: D */
    private int f119387D;

    /* renamed from: E */
    private final Runnable f119388E = new Runnable() {
        public final void run() {
            C46364n.this.mo115211e();
        }
    };

    /* renamed from: b */
    private float f119389b = f119383a;

    /* renamed from: p */
    private float f119390p = f119383a;

    /* renamed from: q */
    private float f119391q = f119383a;

    /* renamed from: r */
    private long f119392r = 500;

    /* renamed from: s */
    private long f119393s = 500;

    /* renamed from: t */
    private int f119394t = 1;

    /* renamed from: u */
    private int f119395u = 1;

    /* renamed from: v */
    private int f119396v = 1;

    /* renamed from: w */
    private float f119397w;

    /* renamed from: x */
    private float f119398x;

    /* renamed from: y */
    private float f119399y;

    /* renamed from: z */
    private float f119400z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115188a() {
        if (this.f119386C != null) {
            this.f119386C.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo115190b() {
        this.f119387D = 0;
        this.f119396v = 0;
        if (this.f119386C != null) {
            this.f119386C.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: l */
    private void m145608l() {
        if (this.f119386C == null) {
            this.f119386C = new Handler();
        } else {
            this.f119386C.removeCallbacksAndMessages(null);
        }
        this.f119386C.postDelayed(this.f119388E, this.f119392r);
    }

    public C46364n() {
        mo115195a(true);
    }

    /* renamed from: m */
    private void m145609m() {
        if (this.f119386C == null) {
            this.f119386C = new Handler();
        } else {
            this.f119386C.removeCallbacksAndMessages(null);
        }
        int i = this.f119387D + 1;
        this.f119387D = i;
        if (i != this.f119394t || this.f119396v < this.f119395u) {
            this.f119386C.postDelayed(this.f119388E, this.f119393s);
            return;
        }
        mo115213f();
        mo115215h();
    }

    /* renamed from: n */
    private boolean m145610n() {
        float f = (this.f119384A - this.f119397w) + this.f119399y;
        if (this.f119389b != f119383a && Math.abs(f) > this.f119389b) {
            return true;
        }
        float f2 = (this.f119385B - this.f119398x) + this.f119400z;
        if (this.f119390p != f119383a && Math.abs(f2) > this.f119390p) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        if (this.f119391q == f119383a || f3 <= this.f119391q) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C46364n mo115226a(float f) {
        this.f119389b = f;
        return this;
    }

    /* renamed from: b */
    public final C46364n mo115258b(float f) {
        this.f119390p = f;
        return this;
    }

    /* renamed from: c */
    public final C46364n mo115234c(int i) {
        this.f119394t = i;
        return this;
    }

    /* renamed from: d */
    public final C46364n mo115237d(int i) {
        this.f119395u = i;
        return this;
    }

    /* renamed from: a */
    public final C46364n mo115257a(long j) {
        this.f119393s = j;
        return this;
    }

    /* renamed from: b */
    public final C46364n mo115259b(long j) {
        this.f119392r = j;
        return this;
    }

    /* renamed from: c */
    public final C46364n mo115260c(float f) {
        this.f119391q = f * f;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115189a(MotionEvent motionEvent) {
        int i = this.f119286e;
        int actionMasked = motionEvent.getActionMasked();
        if (i == 0) {
            this.f119399y = 0.0f;
            this.f119400z = 0.0f;
            this.f119397w = motionEvent.getRawX();
            this.f119398x = motionEvent.getRawY();
        }
        if (actionMasked == 6 || actionMasked == 5) {
            this.f119399y += this.f119384A - this.f119397w;
            this.f119400z += this.f119385B - this.f119398x;
            this.f119384A = C46352f.m145555a(motionEvent, true);
            this.f119385B = C46352f.m145556b(motionEvent, true);
            this.f119397w = this.f119384A;
            this.f119398x = this.f119385B;
        } else {
            this.f119384A = C46352f.m145555a(motionEvent, true);
            this.f119385B = C46352f.m145556b(motionEvent, true);
        }
        if (this.f119396v < motionEvent.getPointerCount()) {
            this.f119396v = motionEvent.getPointerCount();
        }
        if (m145610n()) {
            mo115211e();
        } else if (i == 0) {
            if (actionMasked == 0) {
                mo115214g();
            }
            m145608l();
        } else {
            if (i == 2) {
                if (actionMasked == 1) {
                    m145609m();
                } else if (actionMasked == 0) {
                    m145608l();
                }
            }
        }
    }
}
