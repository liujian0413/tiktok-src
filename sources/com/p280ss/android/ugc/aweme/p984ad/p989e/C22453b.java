package com.p280ss.android.ugc.aweme.p984ad.p989e;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: com.ss.android.ugc.aweme.ad.e.b */
public final class C22453b {
    /* renamed from: a */
    public static void m74325a(View view) {
        m74326a(view, 0.75f);
    }

    /* renamed from: a */
    private static void m74326a(View view, float f) {
        if (view != null) {
            view.setOnTouchListener(new C22455c(view, 0.75f));
        }
    }

    /* renamed from: a */
    public static ValueAnimator m74324a(final View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.setDuration((long) i3);
        ofInt.setTarget(view);
        return ofInt;
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m74327a(View view, float f, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().alpha(f).setDuration(150).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().alpha(f).setDuration(150).start();
        return false;
    }
}
