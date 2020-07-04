package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ax */
public final class C31878ax {

    /* renamed from: a */
    public static Handler f83347a = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ax$a */
    public static class C31882a implements OnTouchListener {

        /* renamed from: g */
        public GestureDetector f83352g;

        /* renamed from: n */
        public static C31882a m103579n() {
            return new C31882a();
        }

        /* renamed from: a */
        public final void mo82725a(View... viewArr) {
            if (viewArr.length > 0) {
                for (View view : viewArr) {
                    if (view != null) {
                        view.setOnTouchListener(this);
                    }
                }
            }
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.f83352g != null) {
                z = this.f83352g.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C31878ax.m103577a(true, view);
                        break;
                    case 1:
                        break;
                }
            }
            C31878ax.m103577a(false, view);
            return z;
        }
    }

    /* renamed from: b */
    public static void m103578b(View view) {
        view.setOnTouchListener(null);
    }

    /* renamed from: a */
    public static void m103576a(View view) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C31878ax.m103577a(true, view);
                            break;
                        case 1:
                            break;
                    }
                }
                C31878ax.m103577a(false, view);
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m103577a(boolean z, View view) {
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

    /* renamed from: a */
    public static void m103575a(final int i, final int i2, View... viewArr) {
        for (final View view : viewArr) {
            view.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        view.setBackgroundColor(i2);
                        C31878ax.f83347a.postDelayed(new Runnable() {
                            public final void run() {
                                view.setBackgroundColor(i);
                            }
                        }, 150);
                    }
                    return false;
                }
            });
        }
    }
}
