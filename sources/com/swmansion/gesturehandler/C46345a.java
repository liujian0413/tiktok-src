package com.swmansion.gesturehandler;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: com.swmansion.gesturehandler.a */
public class C46345a extends C46347b<C46345a> {

    /* renamed from: a */
    public int f119271a = 1;

    /* renamed from: b */
    public int f119272b = 1;

    /* renamed from: p */
    private long f119273p = 800;

    /* renamed from: q */
    private long f119274q = 160;

    /* renamed from: r */
    private float f119275r;

    /* renamed from: s */
    private float f119276s;

    /* renamed from: t */
    private Handler f119277t;

    /* renamed from: u */
    private int f119278u;

    /* renamed from: v */
    private final Runnable f119279v = new Runnable() {
        public final void run() {
            C46345a.this.mo115211e();
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115188a() {
        if (this.f119277t != null) {
            this.f119277t.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo115190b() {
        if (this.f119277t != null) {
            this.f119277t.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: f */
    private void m145486f(MotionEvent motionEvent) {
        if (!m145485e(motionEvent)) {
            mo115211e();
        }
    }

    /* renamed from: d */
    private void m145484d(MotionEvent motionEvent) {
        this.f119275r = motionEvent.getRawX();
        this.f119276s = motionEvent.getRawY();
        mo115214g();
        this.f119278u = 1;
        if (this.f119277t == null) {
            this.f119277t = new Handler();
        } else {
            this.f119277t.removeCallbacksAndMessages(null);
        }
        this.f119277t.postDelayed(this.f119279v, this.f119273p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115189a(MotionEvent motionEvent) {
        int i = this.f119286e;
        if (i == 0) {
            m145484d(motionEvent);
        }
        if (i == 2) {
            m145485e(motionEvent);
            if (motionEvent.getPointerCount() > this.f119278u) {
                this.f119278u = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1) {
                m145486f(motionEvent);
            }
        }
    }

    /* renamed from: e */
    private boolean m145485e(MotionEvent motionEvent) {
        if (this.f119278u != this.f119272b || (((this.f119271a & 1) == 0 || motionEvent.getRawX() - this.f119275r <= ((float) this.f119274q)) && (((this.f119271a & 2) == 0 || this.f119275r - motionEvent.getRawX() <= ((float) this.f119274q)) && (((this.f119271a & 4) == 0 || this.f119276s - motionEvent.getRawY() <= ((float) this.f119274q)) && ((this.f119271a & 8) == 0 || motionEvent.getRawY() - this.f119276s <= ((float) this.f119274q)))))) {
            return false;
        }
        this.f119277t.removeCallbacksAndMessages(null);
        mo115213f();
        mo115215h();
        return true;
    }
}
