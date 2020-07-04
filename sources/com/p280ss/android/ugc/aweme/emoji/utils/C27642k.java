package com.p280ss.android.ugc.aweme.emoji.utils;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.k */
public final class C27642k {

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.k$a */
    public static class C27644a implements OnTouchListener {

        /* renamed from: e */
        public GestureDetector f72835e;

        /* renamed from: f */
        public OnTouchListener f72836f;

        /* renamed from: a */
        public final void mo71039a(View... viewArr) {
            for (int i = 0; i <= 0; i++) {
                View view = viewArr[0];
                if (view != null) {
                    view.setOnTouchListener(this);
                }
            }
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.f72835e != null) {
                z = this.f72835e.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C27642k.m90633a(true, view, 0.5f);
                        break;
                    case 1:
                        break;
                }
            }
            C27642k.m90633a(false, view, 0.5f);
            if (this.f72836f != null) {
                return z | this.f72836f.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m90631a(View view) {
        m90632a(view, 0.5f);
    }

    /* renamed from: a */
    private static void m90632a(View view, float f) {
        view.setOnTouchListener(new OnTouchListener(0.5f) {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C27642k.m90633a(true, view, 0.5f);
                            break;
                        case 1:
                            break;
                    }
                }
                C27642k.m90633a(false, view, 0.5f);
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m90633a(boolean z, View view, float f) {
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
