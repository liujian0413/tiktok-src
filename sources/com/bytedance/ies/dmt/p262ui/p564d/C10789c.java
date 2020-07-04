package com.bytedance.ies.dmt.p262ui.p564d;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.ies.dmt.ui.d.c */
public final class C10789c {

    /* renamed from: com.bytedance.ies.dmt.ui.d.c$a */
    public static class C10791a implements OnTouchListener {

        /* renamed from: a */
        public GestureDetector f28936a;

        /* renamed from: b */
        public OnTouchListener f28937b;

        /* renamed from: a */
        public static C10791a m31505a() {
            return new C10791a();
        }

        /* renamed from: a */
        public final void mo25805a(View... viewArr) {
            for (int i = 0; i < 2; i++) {
                View view = viewArr[i];
                if (view != null) {
                    view.setOnTouchListener(this);
                }
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.f28936a != null) {
                z = this.f28936a.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C10789c.m31504a(true, view, 0.5f);
                        break;
                    case 1:
                        break;
                }
            }
            C10789c.m31504a(false, view, 0.5f);
            if (this.f28937b != null) {
                return z | this.f28937b.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m31502a(View view) {
        m31503a(view, 0.5f);
    }

    /* renamed from: a */
    public static void m31503a(View view, final float f) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C10789c.m31504a(true, view, f);
                            break;
                        case 1:
                            break;
                    }
                }
                C10789c.m31504a(false, view, f);
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m31504a(boolean z, View view, float f) {
        float f2;
        String str = "alpha";
        float[] fArr = new float[2];
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        fArr[0] = f2;
        if (!z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        ofFloat.setDuration(100);
        ofFloat.start();
    }
}
