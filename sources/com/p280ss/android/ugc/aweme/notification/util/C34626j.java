package com.p280ss.android.ugc.aweme.notification.util;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;

/* renamed from: com.ss.android.ugc.aweme.notification.util.j */
public final class C34626j {

    /* renamed from: com.ss.android.ugc.aweme.notification.util.j$a */
    public static class C34631a implements OnTouchListener {

        /* renamed from: a */
        public GestureDetector f90382a;

        /* renamed from: b */
        public OnTouchListener f90383b;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.f90382a != null) {
                z = this.f90382a.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C34626j.m111878a(true, view);
                        break;
                    case 1:
                        break;
                }
            }
            C34626j.m111878a(false, view);
            if (this.f90383b != null) {
                return z | this.f90383b.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m111876a(View view) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C34626j.m111878a(true, view);
                            break;
                        case 1:
                            break;
                    }
                }
                C34626j.m111878a(false, view);
                return false;
            }
        });
    }

    /* renamed from: b */
    public static void m111879b(View view) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C34626j.m111878a(true, view);
                            break;
                        case 1:
                            break;
                    }
                }
                C34626j.m111878a(false, view);
                return false;
            }
        });
    }

    /* renamed from: c */
    public static void m111880c(View view) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C34626j.m111877a(view, true);
                            break;
                        case 1:
                            break;
                    }
                }
                C34626j.m111877a(view, false);
                return false;
            }
        });
    }

    /* renamed from: d */
    public static void m111881d(View view) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C34626j.m111877a(view, true);
                            break;
                        case 1:
                            break;
                    }
                }
                C34626j.m111877a(view, false);
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m111877a(View view, boolean z) {
        float f;
        ViewPropertyAnimator animate = view.animate();
        float f2 = 1.0f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f);
        if (z) {
            f2 = 1.2f;
        }
        scaleX.scaleY(f2).setDuration(100).start();
    }

    /* renamed from: a */
    public static void m111878a(boolean z, View view) {
        float f;
        String str = "alpha";
        float[] fArr = new float[2];
        float f2 = 0.5f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        ofFloat.setDuration(100);
        ofFloat.start();
    }
}
