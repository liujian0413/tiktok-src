package com.swmansion.gesturehandler;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: com.swmansion.gesturehandler.g */
public class C46353g extends C46347b<C46353g> {

    /* renamed from: b */
    private static float f119325b = 10.0f;

    /* renamed from: a */
    public long f119326a = 500;

    /* renamed from: p */
    private float f119327p;

    /* renamed from: q */
    private float f119328q;

    /* renamed from: r */
    private float f119329r;

    /* renamed from: s */
    private Handler f119330s;

    /* renamed from: a */
    public final C46353g mo115226a(float f) {
        this.f119327p = f * f;
        return this;
    }

    public C46353g(Context context) {
        mo115195a(true);
        this.f119327p = f119325b * context.getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115189a(MotionEvent motionEvent) {
        if (this.f119286e == 0) {
            mo115214g();
            this.f119328q = motionEvent.getRawX();
            this.f119329r = motionEvent.getRawY();
            this.f119330s = new Handler();
            this.f119330s.postDelayed(new Runnable() {
                public final void run() {
                    C46353g.this.mo115213f();
                }
            }, this.f119326a);
        }
        if (motionEvent.getActionMasked() == 1) {
            if (this.f119330s != null) {
                this.f119330s.removeCallbacksAndMessages(null);
                this.f119330s = null;
            }
            if (this.f119286e == 4) {
                mo115215h();
            } else {
                mo115211e();
            }
        } else {
            float rawX = motionEvent.getRawX() - this.f119328q;
            float rawY = motionEvent.getRawY() - this.f119329r;
            if ((rawX * rawX) + (rawY * rawY) > this.f119327p) {
                if (this.f119286e == 4) {
                    mo115209d();
                    return;
                }
                mo115211e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo115203b(int i, int i2) {
        if (this.f119330s != null) {
            this.f119330s.removeCallbacksAndMessages(null);
            this.f119330s = null;
        }
    }
}
